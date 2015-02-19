/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.icoke.coupon.webservices.ServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Date;


/**
 * Implementation of services for RiteAid coupons
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class LoadTestCouponService implements CouponService {
    private static final Logger LOGGER = LogManager.getLogger(LoadTestCouponService.class);
    private String processorCode = "loadTest";
    public int sleepInterval = 1000;

    @Autowired
    CouponServiceFactory serviceFactory;

    @PostConstruct
    public void postConstruct() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Registering service " + processorCode);
        }

        serviceFactory.register(processorCode, this);

    }

    public LoadTestCouponService() {
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

        LOGGER.info("Valid card " + cardNumber + " for retailer LoadTest");

        // get start time millis (depending if there's an output field to return this in)
        try {
            Thread.sleep(sleepInterval);
        } catch (InterruptedException e) {

        }
        // get end time millis
        // return canned response, stuff endTime-startTime into output field

    }

    /**
     * Validates a pincode
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
        String serviceInput = "CouponService.loadToCard input args : " +
                CouponServiceHelper.toStringServiceParams(retailerCode, cardNumber,
                        consumerId, transactionId, couponId, couponDescription,
                        couponStartDate, couponEndDate, couponValue, channel);
        LOGGER.debug(serviceInput);
    }

    public String getProcessorCode() {
        return processorCode;
    }

    public void setProcessorCode(String processorCode) {
        this.processorCode = processorCode;
    }

    public int getSleepInterval() {
        return sleepInterval;
    }

    public void setSleepInterval(int sleepInterval) {
        this.sleepInterval = sleepInterval;
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
        sb.append("[loadToCard:").append(consumerId);
        sb.append(", channel:").append(channel);
        sb.append(", cardNumber:").append(cardNumber);
        sb.append(", couponId:").append(couponId);
        sb.append(", transactionId:").append(transactionId);
        sb.append("]");
        return sb.toString();
	}
}
