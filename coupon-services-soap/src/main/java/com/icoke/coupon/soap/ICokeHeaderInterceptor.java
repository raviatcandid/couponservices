/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.soap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.springframework.oxm.XmlMappingException;
import org.springframework.oxm.xmlbeans.XmlBeansMarshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.transform.Result;
import java.io.IOException;
import java.util.Iterator;

/**
 * Interceptor that will search for the ICokeHeader on requests and unmarshaller
 * and conversely marshall the icokeheader on responses.  Interceptor uses
 * XmlBeans for marshalling framework.  The ICokeHeader name is configurable
 * and really just resolves to a generic XmlBeans XmlObject object.
 *
 * @author <a href="jopeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class ICokeHeaderInterceptor implements EndpointInterceptor {
	private static final Logger LOGGER = LogManager.getLogger(ICokeHeaderInterceptor.class);
    public String headerName = "ICokeHeader";

    /**
     * This method can be used for debugging header info.  Currently it only
     * sets the header on threadlocal so it can be accessed by the service layer
     * and the handleResponse method in this class.
     *
     * @param messageContext message contexts
     * @param endpoint endpoint object - not used.
     * @return always true
     * @throws Exception
     */
    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint)
            throws Exception {
    	LOGGER.debug("handleRequest invoked");

    	// Retrieve SoapMessage
        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getRequest();
        SOAPHeader soapHeader = saajSoapMessage.getSaajMessage().getSOAPHeader();

        @SuppressWarnings("unchecked")
        Iterator<SOAPHeaderElement> headerElems= soapHeader.examineAllHeaderElements();
        while (headerElems.hasNext()) {
            SOAPHeaderElement headerElem = headerElems.next();
            if (headerElem.getLocalName().equals(headerName)) {
                ICokeHeaderContext.getICokeHeader(XmlObject.Factory.parse(headerElem));
                break;
            }
        }

        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) {
        // currently nothing
    }

    /**
     *
     * @param messageContext message contexts
     * @param endpoint endpoint object - not used.
     * @return always true
     * @throws javax.xml.soap.SOAPException
     */
    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws SOAPException {
    	LOGGER.trace("handleResponse invoked");

        addHeader(messageContext);

        return true;
    }

    /**
     *
     * @param messageContext message contexts
     * @param endpoint endpoint object - not used.
     * @return always true
     * @throws javax.xml.soap.SOAPException
     */
    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws SOAPException {
    	LOGGER.trace("handleFault invoked");

        addHeader(messageContext);

        return true;
    }


    /**
     * This method adds a header to a soap message.  It pulls the header from the SoapHeaderContext.
     * Basically
     *
     * @param messageContext soap message context
     * @throws javax.xml.soap.SOAPException if exception processing soap header
     */
    private void addHeader(MessageContext messageContext) throws SOAPException {
        WebServiceMessage responseMsg = messageContext.getResponse();
        SoapMessage soapMsg = (SoapMessage) responseMsg;
        SoapHeader header = soapMsg.getSoapHeader();

        Result result = header.getResult();

        XmlBeansMarshaller marshaller = new XmlBeansMarshaller();
        try {
            marshaller.marshal(ICokeHeaderContext.getICokeHeader(), result);
        } catch (XmlMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
}
