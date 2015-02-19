/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.icoke.coupon.util.GUIDGenerator;
import com.icoke.coupon.webservices.ServiceException;
import com.icoke.coupon.webservices.ServiceStatus;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.MediaType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Implementation of services for CodeBroker coupons
 *
 * @author <a href="ravkrishnamurthy@coca-cola.com">Ravi Krishnmaurthy</a>
 * @version 1.0
 */
@Component("codeBrokerCouponService_v1")
public class CodeBrokerCouponService implements CouponService {
    private static final Logger LOGGER = LogManager.getLogger(CodeBrokerCouponService.class);

    @Value( "${codeBroker.processorCode}")
    private String processorCode = "codeBroker";
    @Value( "${codeBroker.endpoint}")
    private String endpoint;
    @Value( "${codeBroker.shortCode}")
    private int shortCode;
    @Value( "${codeBroker.exchangefrom}")
    private String exchangeFrom;
    @Value( "${codeBroker.key}")
    private String key ;
    @Value( "${codeBroker.type}")
    private String type;
    @Value( "${codeBroker.ident}")
    private String ident;


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
    }

    public CodeBrokerCouponService() {
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
     * @param mobileNumber mobile number
     * @throws ServiceException
     */
    @Override
    public void validateCard(String mobileNumber, String retailerCode) throws ServiceException {
        formatAndValidateMobileNumber(mobileNumber);
    }

    /**
     * Loads a coupon to the loyalty card
     *
     * @param consumerId An ID that the publisher uses to indicate a specific consumer.
     * @param channel The channel from which this request originated. Examples include: WEB, EMAIL, SMS, MOBILE_EMAIL
     * @param mobileNumber The consumer's mobileNumer where the SMS should be sent.
     * @param couponId This value uniquely identifies the coupon offer for this retailer.
     * @param transactionId Unique value passed-in by calling app to identify the transaction
     * @return the mixcode with meta-data tied to the statusCode passed in
     * @throws ServiceException
     */
    @Override
    public void loadToCard(String retailerCode, String mobileNumber, String consumerId,
                           String transactionId, String couponId, String couponDescription,
                           Date couponStartDate, Date couponEndDate, String couponValue,
                           String channel) throws ServiceException {

        // Debug log service request
        if (LOGGER.isDebugEnabled()) {
            String serviceInput = "CouponService.loadToCard input args : " +
                    CouponServiceHelper.toStringServiceParams(retailerCode, mobileNumber,
                            consumerId, transactionId, couponId, couponDescription,
                            couponStartDate, couponEndDate, couponValue, channel);
            LOGGER.debug(serviceInput);
        }
        mobileNumber = this.formatAndValidateMobileNumber(mobileNumber);
        ClientResponse response;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss zzz");
        Date date = new Date();
        try {
            StringBuilder msg = new StringBuilder(500);
            msg.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            msg.append("    <exchange-request>\n");
            msg.append("        <exchange-from><![CDATA[").append(exchangeFrom).append("]]></exchange-from>\n");
            msg.append("            <exchange-authorization>\n");
            msg.append("                <key><![CDATA[").append(key).append("]]></key>\n");
            msg.append("            </exchange-authorization>\n");
            msg.append("        <exchange-to><![CDATA[").append(endpoint).append("]]></exchange-to>\n");
            msg.append("            <exchange-content>\n");
            msg.append("                <gateway-message type=\""+type+"\" date=\""+dateFormat.format(date)+"\" ident=\""+ident+"\"  >\n");
            msg.append("                    <sms-from>\n");
            msg.append("                        <mobile-short-code country=\"1\">\n");
            msg.append("                        <shortCodeNumber>").append(shortCode).append("</shortCodeNumber>\n");
            msg.append("                        </mobile-short-code>\n");
            msg.append("                    </sms-from>\n");
            msg.append("                    <sms-to>\n");
            msg.append("                        <phone country=\"1\">\n");
            msg.append("                            <areaCode>").append(mobileNumber.substring(0,3)).append("</areaCode>\n");
            msg.append("                            <phoneNumber>").append(mobileNumber.substring(3)).append("</phoneNumber>\n");
            msg.append("                        </phone>\n");
            msg.append("                    </sms-to>\n");
            msg.append("                    <program locale=\"en_US\"><![CDATA[").append(couponId).append("]]></program>\n");
            msg.append("                </gateway-message>\n");
            msg.append("            </exchange-content>\n");
            msg.append("    </exchange-request>\n");

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("\n" + msg.toString());
            }

            // Setup endpoint
            response = service.path("").
                    type(MediaType.TEXT_XML).accept(MediaType.TEXT_XML).
                    entity(msg.toString()).
                    post(ClientResponse.class);

        } catch (Exception e) {
            //e.printStackTrace();
            String errorMsg = "Failed to process SMS for the mobile number " + mobileNumber;
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), errorMsg);
        }
        LOGGER.debug("\n" + response.getStatus());
        switch (response.getStatus()) {
            case 200:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Successful SMS response " + response);
                }
                break;
            case 400:
                throw new ServiceException(ServiceStatus.INVALID_MESSAGE, GUIDGenerator.getGUID());
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
 }

    /*
     *
     * This method checks if the input string is a valid phone number.
     *
     * @param String mobileNumber
     * @return String mobileNumber
     * @throws ServiceException
     */
    private String formatAndValidateMobileNumber(String mobileNumber) throws ServiceException {

        /* Phone Number formats: (nnn)nnn-nnnn; nnnnnnnnnn; nnn-nnn-nnnn
        * ^\\(? : May start with an option "(" .
        *   (\\d{3}): Followed by 3 digits.
        * \\)? : May have an optional ")"
        * [- ]? : May have an optional "-" after the first 3 digits or after optional ) character.
        * (\\d{3}) : Followed by 3 digits.
        * [- ]? : May have another optional "-" after numeric digits.
        * (\\d{4})$ : ends with four digits.
          Examples: Matches following phone numbers:
         (123)456-7890, 123-456-7890, 1234567890, (123)-456-7890
        */
        //Initialize reg ex for phone number.
        if (mobileNumber == null) {
            String errorMsg = "Empty mobile Number passed for retailer ";
            LOGGER.warn(errorMsg);
            throw new ServiceException(ServiceStatus.INVALID_MOBILE_NUMBER, GUIDGenerator.getGUID(),
                    "Mobile number cannot be blank");
        }
            String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
            CharSequence inputStr = mobileNumber;
            Pattern pattern = Pattern.compile(expression);
            Matcher matcher = pattern.matcher(inputStr);
            if(matcher.matches()){
                return mobileNumber.replaceAll("\\(","").replaceAll("\\)","").replaceAll("-","");
            }else{
                String errorMsg = "Invalid mobile Number passed for retailer ";
                LOGGER.warn(errorMsg);
                throw new ServiceException(ServiceStatus.INVALID_MOBILE_NUMBER, GUIDGenerator.getGUID(),
                        "Mobile number should be valid");
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
        sb.append(", mobileNumber:").append(cardNumber);
        sb.append(", couponId:").append(couponId);
        sb.append(", transactionId:").append(transactionId);
        sb.append("]");
        return sb.toString();
	}
}
