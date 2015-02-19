/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */
package com.icoke.coupon.beans;


/**
 * A simple bean to encapsulate retailer information
 *
 * @author John Peak
 *
 */
public class LoyaltyCard {

    protected Retailer retailer;
    protected String cardNumber;

    public LoyaltyCard() {
        super();
    }

    /**
     * Default constructor
     */
	public LoyaltyCard(Retailer retailer, String cardNumber) {
		super();
        this.retailer = retailer;
        this.cardNumber = cardNumber;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
	 * string representation of bean
	 */
	@Override
	public String toString() {
        // note i don't print entire retailerCode for security reasons
		return "Retailer [retailerCode=" + this.getRetailer() +
                ", retailerName=" + this.getCardNumber() + "]";
	}

}