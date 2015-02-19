/*
 * Copyright (c) 2013. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.inmar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AcqExtResponse {
    @XmlElement(name="TranID")
    private int tranID;                 // Unique value representing the transaction.
    @XmlElement(name="MsgID")
    private int msgID;                  // Message ID assigned by Inmar.  This can be used to uniquely identify this acquisition  response.
    @XmlElement(name="StatusCode")
    private Integer statusCode;         // This is a code representing the success or failure of the acquisition.
    @XmlElement(name="StatusDescription")
    private int statusDescription;      // This describes the success or failure of the acquisition.

    public int getTranID() {
        return tranID;
    }

    public void setTranID(int tranID) {
        this.tranID = tranID;
    }

    public int getMsgID() {
        return msgID;
    }

    public void setMsgID(int msgID) {
        this.msgID = msgID;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(int statusDescription) {
        this.statusDescription = statusDescription;
    }
}
