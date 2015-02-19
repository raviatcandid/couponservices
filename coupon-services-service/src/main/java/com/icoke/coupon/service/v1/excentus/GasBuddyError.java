/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.excentus;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Gasbuddy response element
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement
public class GasBuddyError {
    private String message;
    private String ticketNumber;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
