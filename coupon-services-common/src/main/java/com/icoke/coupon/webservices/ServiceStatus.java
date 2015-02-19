/**
 * (C) Copyright 2011, The Coca-Cola Company, All rights reserved.
 */
package com.icoke.coupon.webservices;

/**
 * A simple enum of all valid service request statuses.  These are based
 * on the following HTTP error codes:
 *
 * 200 - OK
 * 201 - Created
 * 304 - Not Modified
 * 400 - Bad Request
 * 401 - Unauthorized
 * 403 - Forbidden
 * 404 - Not Found
 * 500 - Internal Server Error
 *
 * The first three digits will fall into one of these categories
 *
 * @author John Peak
 *
 */
public enum ServiceStatus {

    SUCCESS(20000, "Success"),
    CREATED(20100, "Created"),
    NOT_MODIFIED(30400, "Not modified"),

    // The following status cover service status where the request
    // cannot be completed due to invalid inputs from the clients.
    INVALID_MESSAGE(40004, "You have Exceeded the redemption limit."),
    INVALID_PROCESSOR_CODE(40001, "Invalid processor code"),
    INVALID_CONSUMER_ID(40002, "Invalid consumer ID"),
    INVALID_CARD(40003, "Invalid card"),
    INVALID_COUPON_ID(40004, "Invalid coupon ID"),
    INVALID_CARD_NOT_ACTIVE(40005, "Card not active"),
    INVALID_COUPON_VALUE(40006, "Invalid coupon value"),
    INVALID_TRANSACTION_VALUE(40007, "Invalid coupon value"),
    INVALID_MOBILE_NUMBER(40009,"Invalid mobile number"),

    UNAUTHORIZED(40100, "Unauthorized"),
    FORBIDDEN(40300, "Forbidden"),
    NOT_FOUND(40400, "Not found"),

    // This should cover any of the service internal errors.  Clients should not care of internal errors.
	SYSTEM_ERROR(50000, "System error");

    private final int code;

    private final int httpCode;

    private final String description;
	
	
	/**
	 * Private constructor to allow for enum types to be constructed by type. 
	 * 
	 * @param code
	 * @param description
	 */
	private ServiceStatus(int code, String description) {
		this.code = code ;
        this.httpCode = code / 100;
		this.description = description ;
	}
	
	/**
	 * Return the service description
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Return the service statusCode
	 * @return
	 */
	public int getCode() {
		return code;
	}

    /**
     * Return the service statusCode
     * @return
     */
    public int getHttpCode() {
        return httpCode;
    }

    @Override
	public String toString() {
		return "ServiceStatus[Code:"+ code + ", Message:" + description +"]";
	}	
}
