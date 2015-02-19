/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.riteaid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * RiteAid load to card request
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
@XmlRootElement
public class AcqsRequestMsg {
    private String Issuer;
    private String Originator;
    private int MsgID;
    private int InmarID;
    private int IssuerCode;
    private String CardID;
    private String Retailer;

    public String getIssuer() {
        return Issuer;
    }

    public void setIssuer(String issuer) {
        Issuer = issuer;
    }

    public String getOriginator() {
        return Originator;
    }

    public void setOriginator(String originator) {
        Originator = originator;
    }

    public int getMsgID() {
        return MsgID;
    }

    public void setMsgID(int msgID) {
        MsgID = msgID;
    }

    public int getInmarID() {
        return InmarID;
    }

    public void setInmarID(int inmarID) {
        InmarID = inmarID;
    }

    public int getIssuerCode() {
        return IssuerCode;
    }

    public void setIssuerCode(int issuerCode) {
        IssuerCode = issuerCode;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String cardID) {
        CardID = cardID;
    }

    public String getRetailer() {
        return Retailer;
    }

    public void setRetailer(String retailer) {
        Retailer = retailer;
    }
}
