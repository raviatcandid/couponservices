/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.excentus;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Gasbuddy response element
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement
public class GasBuddyPayload {

    private long id;
    private long loyaltyCustomerId;
    private String registrationDateString;
    private String registrationMethod;
    private boolean verifiedByEmail;
    private boolean verifiedByEmailDateString;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLoyaltyCustomerId() {
        return loyaltyCustomerId;
    }

    public void setLoyaltyCustomerId(long loyaltyCustomerId) {
        this.loyaltyCustomerId = loyaltyCustomerId;
    }

    public String getRegistrationDateString() {
        return registrationDateString;
    }

    public void setRegistrationDateString(String registrationDateString) {
        this.registrationDateString = registrationDateString;
    }

    public String getRegistrationMethod() {
        return registrationMethod;
    }

    public void setRegistrationMethod(String registrationMethod) {
        this.registrationMethod = registrationMethod;
    }

    public boolean isVerifiedByEmail() {
        return verifiedByEmail;
    }

    public void setVerifiedByEmail(boolean verifiedByEmail) {
        this.verifiedByEmail = verifiedByEmail;
    }

    public boolean isVerifiedByEmailDateString() {
        return verifiedByEmailDateString;
    }

    public void setVerifiedByEmailDateString(boolean verifiedByEmailDateString) {
        this.verifiedByEmailDateString = verifiedByEmailDateString;
    }
}
