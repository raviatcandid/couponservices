/*
 * Copyright (c) 2013. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.icoke.coupon.service.v1.inmar.AcqExtResponse;
import com.icoke.coupon.service.v1.inmar.AcqExtResponseMsg;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;


/**
 * Implementation of services for Inmar coupons
 *
 * @author <a href="ravi@coca-cola.com">Ravi Krishnmaurthy</a>
 * @version 1.0
 */
@Component("inmarCouponService_v1")
public class InmarCouponService implements CouponService {
    private static final Logger LOGGER = LogManager.getLogger(InmarCouponService.class);
    @Value( "${inmar.dateFormat}")
    private String inmarDateFormat;
    @Value( "${inmar.timestampFormat}")
    private String inmarTimestampFormat;
    @Value( "${inmar.processorCode}")
    private String processorCode = "inmar";
    @Value( "${inmar.endpoint}")
    private String endpoint;
    @Value( "${inmar.username}")
    private String username;
    @Value( "${inmar.password}")
    private String password;
    @Value( "${inmar.issuer}")
    private String issuer;
    @Value( "${inmar.originator}")
    private String originator;
    @Value( "${inmar.idType}")
    private String idType;
    @Value( "${inmar.clipType}")
    private String clipType;
    @Value( "${inmar.mediaPropertyId}")
    private String mediaPropertyId;
    @Value( "${inmar.auth}")
    private String auth;
    @Value( "${inmar.retailerCode}")
    private String retailerId;

    // for parsing dates
    private SimpleDateFormat inmarDateFormatter;

    // for parsing dates
    private SimpleDateFormat inmarTimestampFormatter;

    private WebResource service;

    @Autowired
    CouponServiceFactory serviceFactory;

    @PostConstruct
    public void postConstruct() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Registering service " + processorCode);
        }

        serviceFactory.register(processorCode, this);

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

        inmarDateFormatter = new SimpleDateFormat(inmarDateFormat);
        inmarTimestampFormatter = new SimpleDateFormat(inmarTimestampFormat);

    }

    public InmarCouponService() {
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
     * @throws com.icoke.coupon.webservices.ServiceException
     */
    @Override
    public void validateCard(String cardNumber, String retailerCode) throws ServiceException {
        cardNumber = this.formatAndValidateCardNumber(cardNumber);

		LOGGER.info("start validation for ");
		getCustomerProfile(retailerCode, cardNumber);
		LOGGER.info("end validation");
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
     * @throws com.icoke.coupon.webservices.ServiceException
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

		LOGGER.info("start validation for in redemption");
		getCustomerProfile(retailerCode, cardNumber);
		LOGGER.info("end validation");
		
		String[] retailerIdArray = retailerId.split(",");
            HashMap retailerIdList = new HashMap();
            for(String retailerIds : retailerIdArray) {
                retailerIdList.put(retailerIds.split(":")[0], retailerIds.split(":")[1]);
            }

        // RiteAid requires a numeric coupon ID
        int inmarOfferId = NumberUtils.toInt(couponId);
        if (inmarOfferId == 0) {
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
        AcqExtResponseMsg acqExtResponseMsg;
        try {
            StringBuilder msg = new StringBuilder(500);
            msg.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            msg.append("<AcqExtMsg>");
            msg.append("    <Originator>").append(originator).append("</Originator>");
            msg.append("    <AcqExts>");
            msg.append("        <AcqExt>");
            msg.append("            <TranID>").append(transactionId).append("</TranID>");
            msg.append("            <InmarOfferID>").append(inmarOfferId).append("</InmarOfferID>");
            msg.append("            <IssuerCode>").append(issuer).append("</IssuerCode>");
            msg.append("            <IDType>").append(idType).append("</IDType>");
            msg.append("            <CardID>").append(cardNumber).append("</CardID>");
            msg.append("            <DynDspStartDte/>");
            msg.append("            <DynDspEndDte/>");
            msg.append("            <DynRdmStartDte/>");
            msg.append("            <DynRdmEndDte/>");
            msg.append("            <ClipType>").append(clipType).append("</ClipType>");
            msg.append("            <RetailerID>").append(retailerIdList.get(retailerCode)).append("</RetailerID>");
            msg.append("            <MediaPropertyID>").append(mediaPropertyId).append("</MediaPropertyID>");
            msg.append("            <ActualClipTimestamp>").append(inmarTimestampFormatter.format(new Date())).append("</ActualClipTimestamp>");
            msg.append("        </AcqExt>");
            msg.append("    </AcqExts>");
            msg.append("</AcqExtMsg>");

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("\n" + msg.toString());
            }

            // Setup endpoint
            response = service.path("/acquisitionexternal/v2").header("Authorization", auth).
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
                acqExtResponseMsg = response.getEntity(AcqExtResponseMsg.class);

                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("loadToCard response " + response);
                    LOGGER.debug(acqExtResponseMsg);
                }

                AcqExtResponse acqExtResponse = acqExtResponseMsg.getAcqExts().get(0);
                String retailerMsg = acqExtResponse.getStatusDescription() +
                        " (retailer code: " + acqExtResponse.getStatusCode() + ")";

                switch (acqExtResponse.getStatusCode()) {
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
                        throw new ServiceException(ServiceStatus.INVALID_MESSAGE, GUIDGenerator.getGUID(),
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
                                retailerMsg);// 506	Invalid issuer code, message not loaded.
					 // 546	Clip date not in range
                    case 546:
                        throw new ServiceException(ServiceStatus.INVALID_COUPON_ID, GUIDGenerator.getGUID(),
                                retailerMsg);
					// 546	Acquisition budget reached
					case 558:
                       throw new ServiceException(ServiceStatus.INVALID_MESSAGE, GUIDGenerator.getGUID(),
                                retailerMsg);

                    default:
                        throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(),
                                "Unknown error from retailer service (retailer code: " +
                                        acqExtResponse.getStatusCode() + ")");
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
     * @throws com.icoke.coupon.webservices.ServiceException
     */
    private String formatAndValidateCardNumber(String cardNumber) throws ServiceException {
        if (cardNumber == null) {
            String errorMsg = "Empty card passed for retailer ";// + retailer;
            LOGGER.warn(errorMsg);
            throw new ServiceException(ServiceStatus.INVALID_CARD, GUIDGenerator.getGUID(),
                    "Card cannot be blank");
        }

        LOGGER.info("Valid card " + cardNumber + " for retailer ");// + retailer);

        return cardNumber;
    }


	/**
     * This API provides a GET service for retrieving a representation of a customer's account profile, 
	 * including information on clipped, redeemed, and expired coupons, as well as transaction history
     */

    public void getCustomerProfile(String retailerCode, String consumerId) throws ServiceException {
        ClientResponse response;
        try {
            // Setup endpoint
            response = service.path("retailer/"+retailerCode).path("customer").path("2").path(consumerId).path("v1").header("Authorization", auth).type(MediaType.TEXT_XML)
				.accept(MediaType.TEXT_XML).get(ClientResponse.class);
			 switch (response.getStatus()) {
				// customer validation returns app error responses as 200 OK
				case 200:
					 String payload = response.getEntity(String.class);
					LOGGER.info("payload:"+payload);// + retailer);
					break;
				 case 404:
					  String errorMsg = "Consumer card ("+ consumerId + ") you entered is not valid";
			          throw new ServiceException(ServiceStatus.INVALID_CARD, GUIDGenerator.getGUID(),
                                errorMsg);
			}
			
        } catch (Exception e) {
            String errorMsg = "Failed to validate the consumer card " + consumerId;
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), errorMsg);
        }
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

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
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
