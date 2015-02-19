/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.soap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.xmlbeans.XmlObject;

/**
 * A thread local context object to store SoapHeader information.  The intent is that
 * this context object would be used by an endpoint interceptor to store its soap header
 * on the way in and read the value on the way out.
 * 
 * @author Krishna Satya
 *
 */
public class ICokeHeaderContext {

	private static final Logger LOGGER = LogManager.getLogger(ICokeHeaderContext.class);

    /**
     * Thead local to hold the soap header information
     */
    private static ThreadLocal<XmlObject> iCokeHeader = new ThreadLocal<XmlObject>();

    /**
     * Default constructor
     */
    private ICokeHeaderContext() {
    }

    /**
     * Return the soap header.
     * 
     * @return the SoapHeader
     */
    public static XmlObject getICokeHeader() {
    	if (LOGGER.isTraceEnabled()) LOGGER.trace("getICokeHeader invoked.");
        return iCokeHeader.get();
    }

    /**
     * Sets the soap header.
     *
     * @param soapHeader
     *            the soap header to set
     */
    public static void getICokeHeader(XmlObject soapHeader) {
    	if (LOGGER.isTraceEnabled()) LOGGER.trace("getICokeHeader invoked. Arg:"+soapHeader);
        iCokeHeader.set(soapHeader);
    }

    /**
     * Reset the thread local copy of soap header.
     */
    public static void resetICokeHeader() {
    	if (LOGGER.isTraceEnabled()) LOGGER.trace("resetICokeHeader invoked.");
        iCokeHeader.set(null);
    }
}
