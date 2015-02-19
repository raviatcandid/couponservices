/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.soap.v1;


import com.icoke.coupon.service.v1.CouponService;
import com.icoke.coupon.service.v1.CouponServiceFactory;
import com.icoke.coupon.webservices.ServiceException;
import com.icoke.coupon.webservices.ServiceStatus;
import com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument;
import com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument;
import com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument;
import com.icoke.webservices.beans.v10.coupon.ValidateCardResponseDocument;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Class to handle service requests for load-to-card
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@Endpoint
public class CouponEndpoint {
    private static final Logger LOGGER = LogManager.getLogger(CouponEndpoint.class);

    private static final String NAMESPACE_URI = "http://beans.webservices.icoke.com/v1_0/Coupon";

    @Value( "${dateFormat}")
    private String dateFormat;

    // for parsing dates
    private SimpleDateFormat formatter;

    @Autowired
    private CouponServiceFactory couponServiceFactory;

    @PostConstruct
    public void postConstruct() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Registering SOAP endpoint for Coupons");
        }

        formatter = new SimpleDateFormat(dateFormat);
    }

    /**
     * Service call to handle request and provide a response. First note that
     * unlike the FICO API we use "Request" and "Response" suffixes to all
     * service beans whereas FICO doesn't use "Request".  Default behavior
     * of the endpoint-adapter to use these suffixes.
     *
     * @param requestDoc Document wrapper for ValidateCardRequest
     * @return Document wrapper for ValidateCardResponse
     */
    @PayloadRoot(localPart = "ValidateCardRequest", namespace = NAMESPACE_URI)
    @ResponsePayload
    public ValidateCardResponseDocument handleValidateCard(
            @RequestPayload ValidateCardRequestDocument requestDoc) throws ServiceException {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("handleValidateCard called for card " +
                    requestDoc.getValidateCardRequest().getCardNumber());
        }

        long startTime = 0;
        if (LOGGER.isInfoEnabled()) {
            startTime = System.currentTimeMillis();
        }

        ValidateCardRequestDocument.ValidateCardRequest request =
                requestDoc.getValidateCardRequest();

        ValidateCardResponseDocument responseDoc =
                ValidateCardResponseDocument.Factory.newInstance();
        ValidateCardResponseDocument.ValidateCardResponse response =
                responseDoc.addNewValidateCardResponse();
        String processorCode = "";
        try {
            // hack in case processor code is null which is the
            // case for older WSDLs that were missing this value
             processorCode = request.getProcessorCode();
            if (processorCode == null) {
                if (request.getRetailerCode().equals("riteAid")) {
                    processorCode = "riteAid";
                }else if(request.getRetailerCode().equals("codeBroker")){
                    processorCode = "codeBroker";
                } else if(request.getRetailerCode().equals("safeway")){
                    processorCode = "safeway";
                }else if(request.getRetailerCode().equals("kouponmedia")){
                    processorCode = "kouponmedia";
				}else if(request.getRetailerCode().equals("excentus")){
                    processorCode = "excentus";
                }else {
                    processorCode = "inmar";
                }
            }

            CouponService couponService = this.getCouponService(processorCode);
            couponService.validateCard(request.getCardNumber(),request.getRetailerCode());
            response.setStatusCode("200");
            response.setStatusDescription("card is valid");
        } catch (ServiceException e) {
            response.setStatusCode(""+e.getStatus().getCode());
            if (StringUtils.hasText(e.getMessage())) {
                if("safeway".equals(processorCode)) {
                    response.setStatusDescription("Invalid card number provided");
                }else{
                response.setStatusDescription(e.getMessage());
                }

            } else {
                LOGGER.debug("statusdescription3"+e.getStatus().getDescription());
                response.setStatusDescription(e.getStatus().getDescription());
                LOGGER.debug("statusdescription4");
            }
        }

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("handleValidateCard completed in " +
                    (System.currentTimeMillis() - startTime) + "ms");
        }

        return responseDoc;
    }

    /**
     * Service call to handle request and provide a response. First note that
     * unlike the FICO API we use "Request" and "Response" suffixes to all
     * service beans whereas FICO doesn't use "Request".  Default behavior
     * of the endpoint-adapter to use these suffixes.
     *
     * @param requestDoc Document wrapper for LoadToCardRequest
     * @return Document wrapper for LoadToCardResponse
     */
    @PayloadRoot(localPart = "LoadToCardRequest", namespace = NAMESPACE_URI)
    @ResponsePayload
    public LoadToCardResponseDocument handleLoadToCard(
            @RequestPayload LoadToCardRequestDocument requestDoc) throws ServiceException {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("handleLoadToCard called for card " +
                    requestDoc.getLoadToCardRequest().getCardNumber());
        }

        long startTime = 0;
        if (LOGGER.isInfoEnabled()) {
            startTime = System.currentTimeMillis();
        }

        LoadToCardRequestDocument.LoadToCardRequest request =
                requestDoc.getLoadToCardRequest();

        LoadToCardResponseDocument responseDoc =
                LoadToCardResponseDocument.Factory.newInstance();
        LoadToCardResponseDocument.LoadToCardResponse response =
                responseDoc.addNewLoadToCardResponse();

        Date couponStartDate = null;
        Date couponEndDate = null;

        try {
            CouponService couponService = this.getCouponService(request.getProcessorCode());
            couponStartDate = parseDate(request.getCouponStartDate());
            couponEndDate = parseDate(request.getCouponEndDate());

            couponService.loadToCard(request.getRetailerCode(), request.getCardNumber(),
                    request.getConsumerId(), request.getTransactionId(),
                    request.getCouponId(), request.getCouponDescription(),
                    couponStartDate, couponEndDate,
                    request.getCouponValue(), request.getChannel());

            response.setStatusCode(""+ServiceStatus.SUCCESS);
            response.setStatusDescription(ServiceStatus.SUCCESS.getDescription());
            // Make inmar call
            if("safeway".equals(request.getProcessorCode())){
                handleInmarLoadToCard(request.getRetailerCode(), request.getCardNumber(),
                        request.getConsumerId(), request.getTransactionId(),
                        request.getCouponId(), request.getCouponDescription(),
                        couponStartDate, couponEndDate,
                        request.getCouponValue(), request.getChannel());
            }


        } catch (ServiceException e) {
            String code = String.valueOf(e.getStatus().getCode());
            String message = e.getStatus().getDescription();
            if (e.getMessage() != null && "20000".equals(code)) {
                message += " - " + e.getMessage();
            }
            response.setStatusCode(code);
            response.setStatusDescription(message);
        }

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("handleLoadToCard completed in " +
                    (System.currentTimeMillis() - startTime) + "ms");
        }


        return responseDoc;
    }



    /**
     * Service call to handle request and provide a response. First note that
     * unlike the FICO API we use "Request" and "Response" suffixes to all
     * service beans whereas FICO doesn't use "Request".  Default behavior
     * of the endpoint-adapter to use these suffixes.
     *
     *  @param consumerId An ID that the publisher uses to indicate a specific consumer.
     * @param channel The channel from which this request originated. Examples include: WEB, EMAIL, SMS, MOBILE_EMAIL
     * @param cardNumber The consumer's mobileNumer where the SMS should be sent.
     * @param couponId This value uniquely identifies the coupon offer for this retailer.
     * @param transactionId Unique value passed-in by calling app to identify the transaction
     * @return void
     * @throws com.icoke.coupon.webservices.ServiceException
     */

    public void handleInmarLoadToCard(String retailerCode, String cardNumber, String consumerId,
                                       String transactionId, String couponId, String couponDescription,
                                       Date couponStartDate, Date couponEndDate, String couponValue,
                                       String channel) throws ServiceException {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("handleInmarLoadToCard called for card " + cardNumber);
        }

        long startTime = 0;
        if (LOGGER.isInfoEnabled()) {
            startTime = System.currentTimeMillis();
        }
        try {
            CouponService couponService = this.getCouponService("inmar");


            couponService.loadToCard( retailerCode,  cardNumber,  consumerId,
                     transactionId,  couponId,  couponDescription,
                     couponStartDate,  couponEndDate,  couponValue,
                     channel) ;

          LOGGER.info("handleInmarLoadToCard successful with "+ServiceStatus.SUCCESS+":"+ServiceStatus.SUCCESS.getDescription());
        } catch (ServiceException e) {
            String code = String.valueOf(e.getStatus().getCode());
            String message = e.getStatus().getDescription();
            if (e.getMessage() != null) {
                message += " - " + e.getMessage();
            }
              LOGGER.info("handleInmarLoadToCard failed with "+code+":"+message);
        }

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("handleInmarLoadToCard completed in " +
                    (System.currentTimeMillis() - startTime) + "ms");
        }

    }

    private Date parseDate(String date) throws ServiceException {
        if (date == null) {
            return null;
        }

        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            throw new ServiceException(ServiceStatus.SYSTEM_ERROR, "Failed to parse date " + date);
        }
    }

    private CouponService getCouponService(String processorCode) throws ServiceException {
        CouponService service = couponServiceFactory.getCouponService(processorCode);

        if (service == null) {
            String errorMsg = "Retailer Code " + processorCode + " does not exist";
            throw new ServiceException(ServiceStatus.INVALID_PROCESSOR_CODE, errorMsg);
        }

        return service;
    }
}