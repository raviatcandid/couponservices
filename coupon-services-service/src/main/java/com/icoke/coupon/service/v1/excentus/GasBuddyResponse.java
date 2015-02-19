/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.excentus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Gasbuddy response element
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GasBuddyResponse {
    @XmlElement(name="Error")
    private GasBuddyError gasBuddyError;
    @XmlElement(name="Payload")
    private GasBuddyPayload payload;
    @XmlElement(name="ResponseCode")
    private long responseCode;
}
