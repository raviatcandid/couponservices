/**
 * (C) Copyright 2011, The Coca-Cola Company, All rights reserved.
 */
package com.icoke.coupon.util;

import com.icoke.coupon.webservices.ServiceException;

/**
 * A centrol location to control the format of log messages.
 * Initially provide simple in-line message formats.  Future
 * version will from externalized resource bundle files. 
 * 
 * @author Krishna Satya
 *
 */
public class LogFormat {
	
	/**
	 * Format an error message.
	 * 
	 * @param e
	 * @return
	 */
	public static String formatErrorMsg(ServiceException e) {
		StringBuilder buffer = new StringBuilder();
		// Print the message that a service client will reference first.
		buffer.append(e.getMessage());	
		
		// Add additional context information to help debug
		buffer.append(" - Error Code[").append(e.getStatus()).append("]");
		buffer.append(" - Root Cause[").append(e.getCause() == null ? "None" : e.getCause()).append("]");
		
		// TODO - Consider stacktrace information?
		return buffer.toString();		
	}
	
	/**
	 * Placeholder.  Implementation should format all context sensitive
	 * information to help with debugging.
	 *  
	 * @param message
	 * @return
	 */
	public static String formatDebugMsg(String message) {
		return "";
	}

}
