/*
 * Copyright (c) 2013. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.inmar;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class AcqExt {
    @XmlElement(name="TranID")
    private int tranID;                 // Unique value representing the transaction.	Yes
    @XmlElement(name="InmarOfferID")
    private int inmarOfferID;           // Inmar offer identifier assigned by Inmar.  This value uniquely identifies the offer in the Inmar system.	Yes
    @XmlElement(name="IssuerCode")
    private Integer issuerCode;         // Unique identifier designated by issuer	No
    @XmlElement(name="IDType")
    private int idType;                 // Specifies the type of the consumer's loyalty account identifier.	Yes	Should contain one of the following values: 1 = phone, 2 = loyalty card, 3 = email
    @XmlElement(name="CardID")
    private String CardID;              // This should contain the loyalty membership id.	Yes	Should be the phone number, card number, or other value that is used to identify the consumer within the retailer's loyalty program, as indicated by the IDType field. If the card ID does not exist in the DPN system, the loyalty card will be automatically registered instead of failing the message back.
    @XmlElement(name="DynDspStartDte")
    private Date dynDspStartDte;        // The dynamic display start date is the date the offer should start displaying in the eWallet for the consumer. 	Yes	Format  YYYY-MM-DD Required only when the offer is a dynamic date offer.  If the offer is not a dynamic date offer, the tag should be left empty i.e. <DynDspStartDte/>.
    @XmlElement(name="DynDspEndDte")
    private Date dynDspEndDte;          // The dynamic display end date is the last date the offer will display in the eWallet for the consumer	Yes	Format  YYYY-MM-DD Required only when the offer is a dynamic date offer.  If the offer is not a dynamic date offer, the tag should be left empty i.e. <DyDspEndDte/>.
    @XmlElement(name="DynRdmStartDte")
    private Date dynRdmStartDte;        // The dynamic redemption start date is the first day that the offer can be redeemed for the consumer.	Yes	Format  YYYY-MM-DD Required only when the offer is a dynamic date offer.  If the offer is not a dynamic date offer, the tag should be left empty i.e. <DynRdmStartDte/>.
    @XmlElement(name="DynRdmEndDte")
    private Date dynRdmEndDte;          // The dynamic redemption end date is the last date the offer can be redeemed for the consumer	Yes	Format  YYYY-MM-DD Required only when the offer is a dynamic date offer.  If the offer is not a dynamic date offer, the tag should be left empty i.e.
    @XmlElement(name="ClipType")
    private String clipType;            // The clip type indicates if this was a load to card offer or consumer clip.	No	Should always contain one of the values: Load to Card, Consumer Clip, Optional. Omitting this field is equivalent to supplying it with the value "Consumer Clip"
    @XmlElement(name="RetailerID")
    private int retailerID;             // Identifies the retailer associated with the card ID.	Yes	Contains the Retailer Id value in the list of Retailers provided separately by Inmar.
    @XmlElement(name="MediaPropertyID")
    private int mediaPropertyID;        // Identifies the publisher web site or other media outlet from where the offer was acquired by the consumer	Yes	Contains the Media Property Id found in the list of Media Properties by Publisher provided separately by Inmar
    @XmlElement(name="ActualClipTimestamp")
    private Date actualClipTimestamp;   // The date and time the clip should be recorded as having occurred. The time should be in EST.	Yes	Format: YYYY-MM-DD HH:MM:SS (with time in 24-hour notation)

    public int getTranID() {
        return tranID;
    }

    public void setTranID(int tranID) {
        this.tranID = tranID;
    }

    public int getInmarOfferID() {
        return inmarOfferID;
    }

    public void setInmarOfferID(int inmarOfferID) {
        this.inmarOfferID = inmarOfferID;
    }

    public Integer getIssuerCode() {
        return issuerCode;
    }

    public void setIssuerCode(Integer issuerCode) {
        this.issuerCode = issuerCode;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String cardID) {
        CardID = cardID;
    }

    public Date getDynDspStartDte() {
        return dynDspStartDte;
    }

    public void setDynDspStartDte(Date dynDspStartDte) {
        this.dynDspStartDte = dynDspStartDte;
    }

    public Date getDynDspEndDte() {
        return dynDspEndDte;
    }

    public void setDynDspEndDte(Date dynDspEndDte) {
        this.dynDspEndDte = dynDspEndDte;
    }

    public Date getDynRdmStartDte() {
        return dynRdmStartDte;
    }

    public void setDynRdmStartDte(Date dynRdmStartDte) {
        this.dynRdmStartDte = dynRdmStartDte;
    }

    public Date getDynRdmEndDte() {
        return dynRdmEndDte;
    }

    public void setDynRdmEndDte(Date dynRdmEndDte) {
        this.dynRdmEndDte = dynRdmEndDte;
    }

    public String getClipType() {
        return clipType;
    }

    public void setClipType(String clipType) {
        this.clipType = clipType;
    }

    public int getRetailerID() {
        return retailerID;
    }

    public void setRetailerID(int retailerID) {
        this.retailerID = retailerID;
    }

    public int getMediaPropertyID() {
        return mediaPropertyID;
    }

    public void setMediaPropertyID(int mediaPropertyID) {
        this.mediaPropertyID = mediaPropertyID;
    }

    public Date getActualClipTimestamp() {
        return actualClipTimestamp;
    }

    public void setActualClipTimestamp(Date actualClipTimestamp) {
        this.actualClipTimestamp = actualClipTimestamp;
    }
}
