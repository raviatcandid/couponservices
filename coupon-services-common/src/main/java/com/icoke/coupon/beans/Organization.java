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
public class Organization {

    protected String organizationName;
    protected String organizationCode;
    protected String secretKey;

    public Organization() {
        super();
    }

    /**
     * Default constructor
     */
	public Organization(String organizationName, String organizationCode, String secretKey) {
		super();
        this.organizationName = organizationName;
        this.organizationCode = organizationCode;
        this.secretKey = secretKey;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getMaskedSecretKey() {
        return secretKey.substring(0,5) +
                "xxxxxxxxxxxxxxxxxxxxxxx".substring(0,secretKey.length()-10) +
                secretKey.substring(secretKey.length() - 5);
    }

    /**
	 * string representation of bean
	 */
	@Override
	public String toString() {
        // note i don't print entire retailerCode for security reasons
		return "Retailer [retailerCode=" + this.getOrganizationName() +
                ", retailerName=" + this.getOrganizationCode() +
                ", secretKey=" + this.getMaskedSecretKey() + "]";
	}

}