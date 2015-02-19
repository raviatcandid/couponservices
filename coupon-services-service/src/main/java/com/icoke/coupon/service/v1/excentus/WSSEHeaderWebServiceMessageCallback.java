/*
 * Copyright (c) 2012. , The Coca-Cola Company, All rights reserved.
 */

package com.icoke.coupon.service.v1.excentus;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.soap.*;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="jpeak@coca-cola.com">John Peak</a>
 * @version 1.0
 */
public class WSSEHeaderWebServiceMessageCallback implements WebServiceMessageCallback {

    public static final String WSS_10_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

    public final static String WSSE_SECURITY_ELEM = "Security";

    public final static String WSSE_SECURITY_PREFIX = "wsse";

    public static final String WSSEU_10_NAMESPACE = "http://docs.oasisopen.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

    public final static String WSSEU_SECURITY_PREFIX = "wsu";

    public final static String WSSE_USERNAME_TOKEN_ELEM = "UsernameToken";

    public final static String WSSE_USERNAME_ELEM = "SiteId";

    public final static String WSSE_PASSWORD_ELEM = "Password";

    private String user;
    private String pass;


    public WSSEHeaderWebServiceMessageCallback(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    /**
     * @see org.springframework.ws.client.core.WebServiceMessageCallback#doWithMessage(org.springframework.ws.WebServiceMessage)
     */
    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {

        try {

            // you hace to use the default SAAJWebMessageFactory
            SaajSoapMessage saajSoapMessage = (SaajSoapMessage) message;
            SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();

            // then grab for the SOAP header, and...
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
            SOAPHeader soapHeader = soapEnvelope.getHeader();

            // ... add the WS-Security Header Element
            Name headerElementName = soapEnvelope.createName(WSSE_SECURITY_ELEM,
                    WSSE_SECURITY_PREFIX, WSS_10_NAMESPACE);
            SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(headerElementName);

            // otherwise a RST without appliesTo fails
            soapHeaderElement.setMustUnderstand(false);

            // add the usernameToken to "Security" soapHeaderElement
            SOAPElement usernameTokenSOAPElement = soapHeaderElement
                    .addChildElement(WSSE_USERNAME_TOKEN_ELEM, WSSE_SECURITY_PREFIX, WSSEU_10_NAMESPACE);

            // add the username to usernameToken
            SOAPElement userNameSOAPElement = usernameTokenSOAPElement
                    .addChildElement(WSSE_USERNAME_ELEM, WSSE_SECURITY_PREFIX);
            userNameSOAPElement.addTextNode(user);

            // add the password to usernameToken
            SOAPElement passwordSOAPElement = usernameTokenSOAPElement
                    .addChildElement(WSSE_PASSWORD_ELEM, WSSE_SECURITY_PREFIX);
            passwordSOAPElement.addTextNode(pass);

            //SOAPBody soapBody = soapEnvelope.getBody().set

        } catch (SOAPException soapException) {
            throw new RuntimeException("WSSEHeaderWebServiceMessageCallback", soapException);
        }
    }
}
