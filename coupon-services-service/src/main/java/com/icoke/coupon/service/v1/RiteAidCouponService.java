/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.icoke.coupon.service.v1.riteaid.AcqsResponseMsg;
import com.icoke.coupon.service.v1.riteaid.IssuerAcq;
import com.icoke.coupon.service.v1.riteaid.WellnessCardNumberCheck;
import com.icoke.coupon.util.GUIDGenerator;
import com.icoke.coupon.webservices.ServiceException;
import com.icoke.coupon.webservices.ServiceStatus;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.core.util.Base64;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.MediaType;
import java.util.Date;


/**
 * Implementation of services for RiteAid coupons
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@Component("riteAidCouponService_v1")
public class RiteAidCouponService implements CouponService {
    private static final Logger LOGGER = LogManager.getLogger(RiteAidCouponService.class);
    public static final String CARD_PREFIX_MK = "MK";
    public static final String ASSOCIATE_CARD_PREFIX = "99";
    public static final String ASSOCIATE_CARD_SUFFIX = "001";
    @Value( "${riteaid.processorCode}")
    private String processorCode = "riteAid";
    @Value( "${riteaid.endpoint}")
    private String endpoint;
    @Value( "${riteaid.username}")
    private String username;
    @Value( "${riteaid.password}")
    private String password;
    @Value( "${riteaid.issuer}")
    private String issuer;
    @Value( "${riteaid.retailer}")
    private String retailer;
    @Value( "${riteaid.originator}")
    private String originator;
    @Value( "${riteaid.auth}")
    private String auth;

    private int retailersExpiryMinutes = 15;

    private WellnessCardNumberCheck wellnessChecker;
    private WebResource service;

    @Autowired
    CouponServiceFactory serviceFactory;

    @PostConstruct
    public void postConstruct() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Registering service " + processorCode);
        }

        serviceFactory.register(processorCode, this);

        // Card number checker provided by RiteAid
        wellnessChecker = new WellnessCardNumberCheck();
        wellnessChecker.setAcceptAssociateCard(true);

        // This is an expensive operation so we want to do once
        Client client = Client.create();

        client.addFilter(new LoggingFilter());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Configuring endpoint " + endpoint);
        }

        // Setup endpoint
        service = client.resource(endpoint);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Setting basic-auth username to " + username +
                    " and password to " + endpoint);
        }
        auth = "Basic " + new String(Base64.encode(username + ":" + password));
    }

    public RiteAidCouponService() {
        super();
    }

    /**
     * Returns logger to superclass so logging occurs under concrete classname
     *
     * @return logger
     */
    protected Logger getLogger() {
        return LOGGER;
    }

    /**
     * Validate the card number for a particular retailer.  Obviously rules for card validation
     * vary between retailers.
     *
     * @param cardNumber card number
     * @throws ServiceException
     */
    @Override
    public void validateCard(String cardNumber,String retailerCode) throws ServiceException {
        formatAndValidateCardNumber(cardNumber);
    }

    /**
     * Loads a coupon to the loyalty card
     *
     * @param consumerId An ID that the publisher uses to indicate a specific consumer.
     * @param channel The channel from which this request originated. Examples include: WEB, EMAIL, SMS, MOBILE_EMAIL
     * @param cardNumber The consumer's loyalty card number.
     * @param couponId This value uniquely identifies the coupon offer for this retailer.
     * @param transactionId Unique value passed-in by calling app to identify the transaction
     * @return the mixcode with meta-data tied to the statusCode passed in
     * @throws ServiceException
     */
    @Override
    public void loadToCard(String retailerCode, String cardNumber, String consumerId,
                           String transactionId, String couponId, String couponDescription,
                           Date couponStartDate, Date couponEndDate, String couponValue,
                           String channel) throws ServiceException {

        // Debug log service request
        if (LOGGER.isDebugEnabled()) {
            String serviceInput = "CouponService.loadToCard input args : " +
                    CouponServiceHelper.toStringServiceParams(retailerCode, cardNumber,
                            consumerId, transactionId, couponId, couponDescription,
                            couponStartDate, couponEndDate, couponValue, channel);
            LOGGER.debug(serviceInput);
        }

        cardNumber = this.formatAndValidateCardNumber(cardNumber);

        // Rite Aid requires an integer value for consumer id (called IssuerCode to them)
        int issuerCode;

        try {
            issuerCode = CouponServiceHelper.stringToInt(consumerId);
        } catch (Exception e) {
            LOGGER.error(e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR,
                    GUIDGenerator.getGUID(), "Failed to convert Consumer ID to a valid Issuer Code");
        }


        // RiteAid requires a numeric coupon ID
        int inmarId = NumberUtils.toInt(couponId);
        if (inmarId == 0) {
            throw new ServiceException(ServiceStatus.INVALID_COUPON_ID,
                    GUIDGenerator.getGUID(), "Coupon ID is not an integer");
        }

        // RiteAid requires an int MsgId
        int msgId;
        try {
            msgId = NumberUtils.toInt(transactionId);
            if (msgId == 0) {
                msgId = CouponServiceHelper.stringToInt(transactionId);
            }
        } catch (Exception e) {
            LOGGER.error(e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR,
                    GUIDGenerator.getGUID(), "Failed to convert Transaction ID to a valid Message Id");
        }

        // Note there is a loss of precision for transaction Id
        ClientResponse response;
        AcqsResponseMsg acqsResponseMsg;
        try {
            StringBuilder msg = new StringBuilder(500);
            msg.append("<AcqsMsg>\n");
            msg.append("  <Issuer>").append(issuer).append("</Issuer>\n");
            msg.append("  <Originator>").append(originator).append("</Originator>\n");
            msg.append("  <IssuerAcqs>\n");
            msg.append("    <IssuerAcq>\n");
            msg.append("      <MsgID>").append(msgId).append("</MsgID>\n");
            msg.append("      <InmarID>").append(inmarId).append("</InmarID> \n");
            msg.append("      <IssuerCode>").append(issuerCode).append("</IssuerCode>\n");
            msg.append("      <CardID>").append(cardNumber).append("</CardID>\n");
            msg.append("      <UseAlt>1</UseAlt>\n");
            msg.append("      <Retailer>").append(retailer).append("</Retailer>\n");
            msg.append("    </IssuerAcq>\n");
            msg.append("  </IssuerAcqs>\n");
            msg.append("</AcqsMsg>\n");

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("\n" + msg.toString());
            }

            // Setup endpoint
            response = service.path("acquisition").header("Authorization", auth).
                    type(MediaType.TEXT_XML).accept(MediaType.TEXT_XML).
                    entity(msg.toString()).
                    post(ClientResponse.class);
        } catch (Exception e) {
            String errorMsg = "Failed to load coupon to card " + cardNumber;
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), errorMsg);
        }

        switch (response.getStatus()) {
            // RiteAid returns app error responses as 200 OK
            case 200:

                acqsResponseMsg = response.getEntity(AcqsResponseMsg.class);

                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("loadToCard response " + response);
                    LOGGER.debug(acqsResponseMsg);
                }

                IssuerAcq issuerAcq = acqsResponseMsg.getIssuerAcqs().get(0);
                String retailerMsg = issuerAcq.getStatusDescription() +
                        " (retailer code: " + issuerAcq.getStatusCode() + ")";

                switch (issuerAcq.getStatusCode()) {
                    // success
                    case 100:
                        if (LOGGER.isInfoEnabled()) {
                            StringBuilder sb = new StringBuilder(60).append("Coupon ").append(couponId);
                            sb.append(" successfully loaded to card ").append(cardNumber);
                            String message = sb.toString();
                            LOGGER.info(message);
                        }
                        break;
                    // 101	Message already exists.  Did not reload message.
                    case 101:
                        throw new ServiceException(ServiceStatus.NOT_MODIFIED, GUIDGenerator.getGUID(),
                                retailerMsg);
                    // 500	Invalid message not loaded.
                    case 500:
                        throw new ServiceException(ServiceStatus.INVALID_MESSAGE, GUIDGenerator.getGUID(),
                                retailerMsg);
                    // 501	Inmar ID does not exist, message not loaded.
                    case 501:
                        throw new ServiceException(ServiceStatus.INVALID_COUPON_ID, GUIDGenerator.getGUID(),
                                retailerMsg);
                    // 502	Unknown retailer, message not loaded.
                    case 502:
                        throw new ServiceException(ServiceStatus.INVALID_PROCESSOR_CODE, GUIDGenerator.getGUID(),
                                retailerMsg);
                    // 505	Invalid card ID, message not loaded.
                    case 505:
                        throw new ServiceException(ServiceStatus.INVALID_CARD, GUIDGenerator.getGUID(),
                                retailerMsg);
                    // 506	Invalid issuer code, message not loaded.
                    case 506:
                        throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(),
                                retailerMsg);
                    default:
                        throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(),
                                "Unknown error from retailer service (retailer code: " +
                                        issuerAcq.getStatusCode() + ")");
                }
                break;
            case 401:
                throw new ServiceException(ServiceStatus.UNAUTHORIZED, GUIDGenerator.getGUID());
            case 403:
                throw new ServiceException(ServiceStatus.FORBIDDEN, GUIDGenerator.getGUID());
            case 404:
                throw new ServiceException(ServiceStatus.NOT_FOUND, GUIDGenerator.getGUID());
            default:
                throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(),
                        "Unknown response status from retailer " + response.getStatus());
        }

//        if (LOGGER.isDebugEnabled()) {
//            LOGGER.debug("loadToCard output .... \n");
//            LOGGER.debug(acqsResponseMsg);
//        }
    }

    /**
     * Checks for null and removes any unneeded prefixes
     *
     * @param cardNumber
     * @return
     * @throws ServiceException
     */
    private String formatAndValidateCardNumber(String cardNumber) throws ServiceException {
        if (cardNumber == null) {
            String errorMsg = "Empty card passed for retailer RiteAid";
            LOGGER.warn(errorMsg);
            throw new ServiceException(ServiceStatus.INVALID_CARD, GUIDGenerator.getGUID(),
                    "Card cannot be blank");
        }

        // You must strip off MK prefix before passing to api
        cardNumber = cardNumber.replace(" ", "");
        if (cardNumber.startsWith(CARD_PREFIX_MK)) {
            cardNumber = cardNumber.substring(2);
        }

        if (!wellnessChecker.isSatisfied(cardNumber)) {
            throw new ServiceException(ServiceStatus.INVALID_CARD);
        }

        // seems squirrely to me but don't strip off 99 for an employee card number
        // but do strip off last 3-digits
        if (cardNumber.startsWith(ASSOCIATE_CARD_PREFIX)) {
            if (cardNumber.startsWith(ASSOCIATE_CARD_SUFFIX, cardNumber.length() - ASSOCIATE_CARD_SUFFIX.length())) {
                throw new ServiceException(ServiceStatus.INVALID_CARD);
            }
            cardNumber = cardNumber.substring(0, cardNumber.length() - ASSOCIATE_CARD_SUFFIX.length());
        }

        LOGGER.info("Valid card " + cardNumber + " for retailer RiteAid");

        return cardNumber;
    }

    public String getProcessorCode() {
        return processorCode;
    }

    public void setProcessorCode(String processorCode) {
        this.processorCode = processorCode;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public long getRetailersExpiryMinutes() {
        return retailersExpiryMinutes;
    }

    public void setRetailersExpiryMinutes(int retailersExpiryMinutes) {
        this.retailersExpiryMinutes = retailersExpiryMinutes;
    }

    /**
	 * Utility to compose a toString like rep of the service args.
	 *
     * @param consumerId program that is passed in
     * @param channel consumer id passed in
     * @param cardNumber the pincode
     * @param couponId consumer id passed in
     * @param transactionId consumer id passed in
     * @return stringified representation of the key service args.
	 */
	private String toStringServiceParams(String consumerId, String channel, String cardNumber,
                                         String couponId, Long transactionId) {
		StringBuilder sb = new StringBuilder(200);
        sb.append("[consumerId:").append(consumerId);
        sb.append(", channel:").append(channel);
        sb.append(", cardNumber:").append(cardNumber);
        sb.append(", couponId:").append(couponId);
        sb.append(", transactionId:").append(transactionId);
        sb.append("]");
        return sb.toString();
	}
}
