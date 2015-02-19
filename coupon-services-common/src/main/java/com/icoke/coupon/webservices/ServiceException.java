/**
 * (C) Copyright 2011, The Coca-Cola Company, All rights reserved.
 */
package com.icoke.coupon.webservices;


import com.icoke.coupon.util.GUIDGenerator;

/**
 * A checked exception to handle internal service communication. This will be 
 * suitably re-purposed to a ServiceFaultException to communicate to the service clients.   
 * 
 * @author Krishna Satya
 */
@SuppressWarnings("serial")
public class ServiceException extends Exception {

	// Track generic service status
	private ServiceStatus _status ;	

	// Associate a GUID, that can be sent to the service client for error correlation.
	private String _guid ;
	
	// Track an exception message
	private String _message ;


    /**
     * Construct a service exception with a status, client ref# and a message.
     *
     * @param status
     */
    public ServiceException(ServiceStatus status) {
        this(status, GUIDGenerator.getGUID(), null, null);
    }

    /**
     * Construct a service exception with a status, client ref# and a message.
     *
     * @param status
     */
    public ServiceException(ServiceStatus status, String message) {
        this(status, GUIDGenerator.getGUID(), message, null);
    }

    /**
	 * Construct a service exception with a status, client ref# and a message. 
	 * 
	 * @param status
	 * @param message
	 */
	public ServiceException(ServiceStatus status, String guid, String message) {
		this(status, guid, message, null);
	}
	
	/**
	 * Construct a service exception with a status, client ref# and a message and a root cause exception.
	 * @param status
	 * @param guid
	 * @param message
	 * @param e
	 */
	public ServiceException(ServiceStatus status, String guid, String message, Exception e) {
		super(message, e);
		_status = status ;
		_guid = guid;		
		_message = message ;
	}


	/**
	 * @return the status
	 */
	public ServiceStatus getStatus() {
		return _status;
	}


	/**
	 * Flatten the service exception message to include the guid.
	 * 
	 * @return the message
	 */
	public String getMessage() {
		if(_status.getCode() == 20000){ return _message; } else {
		return "Error RefId:["+_guid+"]. Error Message:["+_message+"]";
	  }
	}


	/**
	 * @return the guid
	 */
	public String getGuid() {
		return _guid;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ServiceException [_guid=" + _guid 
		        + ", _message=" + _message
				+ ", _status=" + _status
				+ ", _cause=" + getCause()
				+ "]";
	}	

}
