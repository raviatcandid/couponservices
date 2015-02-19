/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import com.icoke.coupon.webservices.ServiceException;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public interface CouponService {

    void validateCard(String cardNumber, String retailerCode) throws ServiceException;

    void loadToCard(String retailerCode, String cardNumber, String consumerId,
                    String transactionId, String couponId, String couponDescription,
                    Date couponStartDate, Date couponEndDate, String couponValue,
                    String channel) throws ServiceException;

}
