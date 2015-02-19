/*
 * An XML document type.
 * Localname: LoadToCardResponse
 * Namespace: http://beans.webservices.icoke.com/v1_0/Coupon
 * Java type: com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.coupon.impl;
/**
 * A document containing one LoadToCardResponse(@http://beans.webservices.icoke.com/v1_0/Coupon) element.
 *
 * This is a complex type.
 */
public class LoadToCardResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadToCardResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADTOCARDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "LoadToCardResponse");
    
    
    /**
     * Gets the "LoadToCardResponse" element
     */
    public com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse getLoadToCardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse target = null;
            target = (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse)get_store().find_element_user(LOADTOCARDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LoadToCardResponse" element
     */
    public void setLoadToCardResponse(com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse loadToCardResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse target = null;
            target = (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse)get_store().find_element_user(LOADTOCARDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse)get_store().add_element_user(LOADTOCARDRESPONSE$0);
            }
            target.set(loadToCardResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LoadToCardResponse" element
     */
    public com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse addNewLoadToCardResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse target = null;
            target = (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse)get_store().add_element_user(LOADTOCARDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LoadToCardResponse(@http://beans.webservices.icoke.com/v1_0/Coupon).
     *
     * This is a complex type.
     */
    public static class LoadToCardResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LoadToCardResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUSCODE$0 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "statusCode");
        private static final javax.xml.namespace.QName STATUSDESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "statusDescription");
        
        
        /**
         * Gets the "statusCode" element
         */
        public java.lang.String getStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "statusCode" element
         */
        public org.apache.xmlbeans.XmlString xgetStatusCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "statusCode" element
         */
        public void setStatusCode(java.lang.String statusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODE$0);
                }
                target.setStringValue(statusCode);
            }
        }
        
        /**
         * Sets (as xml) the "statusCode" element
         */
        public void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSCODE$0);
                }
                target.set(statusCode);
            }
        }
        
        /**
         * Gets the "statusDescription" element
         */
        public java.lang.String getStatusDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "statusDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetStatusDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "statusDescription" element
         */
        public void setStatusDescription(java.lang.String statusDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSDESCRIPTION$2);
                }
                target.setStringValue(statusDescription);
            }
        }
        
        /**
         * Sets (as xml) the "statusDescription" element
         */
        public void xsetStatusDescription(org.apache.xmlbeans.XmlString statusDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSDESCRIPTION$2);
                }
                target.set(statusDescription);
            }
        }
    }
}
