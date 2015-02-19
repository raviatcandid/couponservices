/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple factory to retrieve coupon service by processor
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@Component
public class CouponServiceFactory {
    private Map<String, CouponService> couponServices = new HashMap<String, CouponService>();

    public void register(String processorCode, CouponService service) {
        couponServices.put(processorCode, service);
    }

    public CouponService getCouponService(String processorCode) {
        return couponServices.get(processorCode);
    }

}
