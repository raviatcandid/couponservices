/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import org.apache.commons.lang.math.NumberUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;


/**
 * superclass for services
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class CouponServiceHelper {

    private CouponServiceHelper() {}


    /**
     * Should create a fairly unique long from a string
     *
     * @param value
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static long stringToLong(String value)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        long asLong = NumberUtils.toLong(value);

        if (asLong > 0) {
            return asLong;
        }

        byte[] bytesOfMessage = value.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(bytesOfMessage);
        return Longs.fromByteArray(digest);
    }

    /**
     * Should create a fairly unique int from a string
     *
     * @param value
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static int stringToInt(String value)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        int asInt = NumberUtils.toInt(value);

        if (asInt > 0) {
            return asInt;
        }

        byte[] bytesOfMessage = value.getBytes("UTF-8");

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(bytesOfMessage);
        return Ints.fromByteArray(digest);
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
	public static String toStringServiceParams(String retailerCode, String cardNumber, String consumerId,
                                         String transactionId, String couponId, String couponDescription,
                                         Date couponStartDate, Date couponEndDate, String couponValue,
                                         String channel) {
		StringBuilder sb = new StringBuilder(200);
        sb.append("[retailerCode:").append(retailerCode);
        sb.append(", cardNumber:").append(cardNumber);
        sb.append(", consumerId:").append(consumerId);
        sb.append(", transactionId:").append(transactionId);
        sb.append(", couponId:").append(couponId);
        sb.append(", couponDescription:").append(couponDescription);
        sb.append(", couponStartDate:").append(couponStartDate);
        sb.append(", couponEndDate:").append(couponEndDate);
        sb.append(", couponValue:").append(couponValue);
        sb.append(", channel:").append(channel);
        sb.append("]");
        return sb.toString();
	}
}
