/*
 * An XML document type.
 * Localname: ValidateCardRequest
 * Namespace: http://beans.webservices.icoke.com/v1_0/Coupon
 * Java type: com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.coupon.impl;
/**
 * A document containing one ValidateCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon) element.
 *
 * This is a complex type.
 */
public class ValidateCardRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateCardRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATECARDREQUEST$0 = 
        new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "ValidateCardRequest");
    
    
    /**
     * Gets the "ValidateCardRequest" element
     */
    public com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest getValidateCardRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest target = null;
            target = (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest)get_store().find_element_user(VALIDATECARDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidateCardRequest" element
     */
    public void setValidateCardRequest(com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest validateCardRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest target = null;
            target = (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest)get_store().find_element_user(VALIDATECARDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest)get_store().add_element_user(VALIDATECARDREQUEST$0);
            }
            target.set(validateCardRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidateCardRequest" element
     */
    public com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest addNewValidateCardRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest target = null;
            target = (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest)get_store().add_element_user(VALIDATECARDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ValidateCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon).
     *
     * This is a complex type.
     */
    public static class ValidateCardRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ValidateCardRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROCESSORCODE$0 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "processorCode");
        private static final javax.xml.namespace.QName RETAILERCODE$2 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "retailerCode");
        private static final javax.xml.namespace.QName CARDNUMBER$4 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "cardNumber");
        
        
        /**
         * Gets the "processorCode" element
         */
        public java.lang.String getProcessorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSORCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "processorCode" element
         */
        public org.apache.xmlbeans.XmlString xgetProcessorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSORCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "processorCode" element
         */
        public boolean isNilProcessorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSORCODE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "processorCode" element
         */
        public void setProcessorCode(java.lang.String processorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSORCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSORCODE$0);
                }
                target.setStringValue(processorCode);
            }
        }
        
        /**
         * Sets (as xml) the "processorCode" element
         */
        public void xsetProcessorCode(org.apache.xmlbeans.XmlString processorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSORCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESSORCODE$0);
                }
                target.set(processorCode);
            }
        }
        
        /**
         * Nils the "processorCode" element
         */
        public void setNilProcessorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSORCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESSORCODE$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "retailerCode" element
         */
        public java.lang.String getRetailerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAILERCODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "retailerCode" element
         */
        public org.apache.xmlbeans.XmlString xgetRetailerCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAILERCODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "retailerCode" element
         */
        public void setRetailerCode(java.lang.String retailerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAILERCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETAILERCODE$2);
                }
                target.setStringValue(retailerCode);
            }
        }
        
        /**
         * Sets (as xml) the "retailerCode" element
         */
        public void xsetRetailerCode(org.apache.xmlbeans.XmlString retailerCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAILERCODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETAILERCODE$2);
                }
                target.set(retailerCode);
            }
        }
        
        /**
         * Gets the "cardNumber" element
         */
        public java.lang.String getCardNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDNUMBER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cardNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetCardNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDNUMBER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "cardNumber" element
         */
        public void setCardNumber(java.lang.String cardNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDNUMBER$4);
                }
                target.setStringValue(cardNumber);
            }
        }
        
        /**
         * Sets (as xml) the "cardNumber" element
         */
        public void xsetCardNumber(org.apache.xmlbeans.XmlString cardNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDNUMBER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARDNUMBER$4);
                }
                target.set(cardNumber);
            }
        }
    }
}
