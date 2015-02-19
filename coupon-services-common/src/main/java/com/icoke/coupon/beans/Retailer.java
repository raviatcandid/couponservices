/**
 * (C) Copyright 2012, The Coca-Cola Company, All rights reserved.
 */
package com.icoke.coupon.beans;


/**
 * A simple bean to encapsulate retailer information
 *
 * @author John Peak
 *
 */
public class Retailer {

    protected String retailerCode;
    protected String retailerName;

    public Retailer() {
        super();
    }

    /**
     * Default constructor
     */
	public Retailer(String retailerCode, String retailerName) {
		super();
        this.retailerCode = retailerCode;
        this.retailerName = retailerName;
    }

    public String getRetailerCode() {
        return retailerCode;
    }

    public void setRetailerCode(String retailerCode) {
        this.retailerCode = retailerCode;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    /**
	 * string representation of bean
	 */
	@Override
	public String toString() {
        // note i don't print entire retailerCode for security reasons
		return "Retailer [retailerCode=" + this.getRetailerCode() +
                ", retailerName=" + this.getRetailerName() + "]";
	}

}