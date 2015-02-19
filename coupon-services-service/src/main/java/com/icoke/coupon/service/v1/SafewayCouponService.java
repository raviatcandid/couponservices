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
import java.lang.String;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JSONArray;



/**
 * Implementation of services for Safeway coupons
 *
 * @author <a href="ravkrishnamurthy@coca-cola.com">Ravi Krishnmaurthy</a>
 * @version 1.0
 */
@Component("safewayCouponService_v1")
public class SafewayCouponService implements CouponService {
    private static final Logger LOGGER = LogManager.getLogger(SafewayCouponService.class);

    @Value( "${safeway.processorCode}")
    private String processorCode = "safeway";
    @Value( "${safeway.endpoint}")
    private String endpoint="";
    @Value( "${safeway.couponIdList}")
    private String couponIdList ="";

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

    public SafewayCouponService() {
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
     * @param cardNumber card number or  mobile number
     * @throws com.icoke.coupon.webservices.ServiceException
     */
    @Override
    public void validateCard(String cardNumber, String retailerCode) throws ServiceException {
        validateCardNumber(cardNumber);
    }

    /**
     * Loads a coupon to the loyalty card
     *
     * @param consumerId An ID that the publisher uses to indicate a specific consumer.
     * @param channel The channel from which this request originated. Examples include: WEB, EMAIL, SMS, MOBILE_EMAIL
     * @param cardNumber The consumer's mobileNumer where the SMS should be sent.
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
        ClientResponse response;
        try {
            String[] offerIdArray = couponIdList.split(",");
            HashMap offerIdList = new HashMap();
            for(String offerIds : offerIdArray) {
                offerIdList.put(offerIds.split(":")[0], offerIds.split(":")[1]);
            }

            String msg ="{\"clips\":[{\"cardNbr\":"+validateCardNumber(cardNumber)+", \"offerId\":"+offerIdList.get(couponId)+"}]}";

            // Setup endpoint
            response = service.path("services").path("partner").path("clip").path("offers").header("X-SWY_API_KEY","Coke").header("X-SWY_VERSION","1.0").
                    type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).
                    entity(msg).
                    post(ClientResponse.class);
        } catch (Exception e) {
            //e.printStackTrace();
            String errorMsg = "Failed to call the clip service endpoint with card number " + cardNumber;
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), errorMsg);
        }
        String JSONOutput = response.getEntity(String.class);
        LOGGER.debug("The output is:" + JSONOutput);
        JSONObject json = (JSONObject) JSONSerializer.toJSON(JSONOutput);
        String errorCode ="";
        String errorMessage ="";
        String jsonStatus = null;
        JSONObject clip =  null;
        if(json.getJSONArray("clips")!= null)
        {
             clip = json.getJSONArray("clips").getJSONObject(0);
             jsonStatus = clip.getString("status");
        }

           if(jsonStatus == null)jsonStatus ="3";
        switch (Integer.parseInt(jsonStatus)) {
            case 1:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Successful card validation response " + JSONOutput);
                }
                break;
            case 0:
               // JSONArray errors = json.getJSONArray("errors");
                // JSONObject error = errors.getJSONObject(0);
                 errorCode = clip.getString("errorCd");
                 errorMessage = clip.getString("errorMsg");

                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Failed card validation response " + errorCode +":"+errorMessage);
                }
                throw new ServiceException(ServiceStatus.SYSTEM_ERROR,errorCode+":"+errorMessage);

            default:

                throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(),
                        "Error response status from retailer " + errorCode+":"+errorMessage);
        }




 }
    /*
     *
     * This method checks if the input string is a valid phone number.
     *
     * @param String cardNumber
     * @return String mobileNumber
     * @throws ServiceException
     */
    private String validateCardNumber(String cardNumber) throws ServiceException {
        ClientResponse response;
        try {
            // Setup endpoint
            response = service.path("services").path("CCNValidation").path(cardNumber).header("X-SWY_API_KEY","Coke").header("X-SWY_VERSION","1.0").
                    type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).
                    entity("").
                    post(ClientResponse.class);
        } catch (Exception e) {
            //e.printStackTrace();
            String errorMsg = "Failed to call the endpoint with card number " + cardNumber;
            LOGGER.error(errorMsg, e);
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(), errorMsg);
        }
            String JSONOutput = response.getEntity(String.class);
            LOGGER.debug("The output is:" + JSONOutput);
            JSONObject json = (JSONObject) JSONSerializer.toJSON(JSONOutput);

            switch (json.getInt("ack")) {
            case 0:
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Successful card validation response " + json);
                }
                cardNumber = json.getJSONObject("clubCard").getString("cardNumber");
                 break;
            case 1:
                JSONArray errors = json.getJSONArray("errors");
                JSONObject error = errors.getJSONObject(0);
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Failed card validation response " + error.getString("code") +":"+error.getString("message"));
                }
                throw new ServiceException(ServiceStatus.INVALID_CARD,"Invalid card number");

            default:
                throw new ServiceException(ServiceStatus.SYSTEM_ERROR, GUIDGenerator.getGUID(),
                        "Unknown response status from retailer " + response.getStatus());
             }


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
