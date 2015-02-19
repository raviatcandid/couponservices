/*
 * An XML document type.
 * Localname: LoadToCardRequest
 * Namespace: http://beans.webservices.icoke.com/v1_0/Coupon
 * Java type: com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.coupon.impl;
/**
 * A document containing one LoadToCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon) element.
 *
 * This is a complex type.
 */
public class LoadToCardRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadToCardRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADTOCARDREQUEST$0 = 
        new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "LoadToCardRequest");
    
    
    /**
     * Gets the "LoadToCardRequest" element
     */
    public com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest getLoadToCardRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest target = null;
            target = (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest)get_store().find_element_user(LOADTOCARDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LoadToCardRequest" element
     */
    public void setLoadToCardRequest(com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest loadToCardRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest target = null;
            target = (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest)get_store().find_element_user(LOADTOCARDREQUEST$0, 0);
            if (target == null)
            {
                target = (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest)get_store().add_element_user(LOADTOCARDREQUEST$0);
            }
            target.set(loadToCardRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "LoadToCardRequest" element
     */
    public com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest addNewLoadToCardRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest target = null;
            target = (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest)get_store().add_element_user(LOADTOCARDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML LoadToCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon).
     *
     * This is a complex type.
     */
    public static class LoadToCardRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest
    {
        private static final long serialVersionUID = 1L;
        
        public LoadToCardRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROCESSORCODE$0 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "processorCode");
        private static final javax.xml.namespace.QName RETAILERCODE$2 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "retailerCode");
        private static final javax.xml.namespace.QName CARDNUMBER$4 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "cardNumber");
        private static final javax.xml.namespace.QName CONSUMERID$6 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "consumerId");
        private static final javax.xml.namespace.QName TRANSACTIONID$8 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "transactionId");
        private static final javax.xml.namespace.QName COUPONID$10 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "couponId");
        private static final javax.xml.namespace.QName COUPONDESCRIPTION$12 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "couponDescription");
        private static final javax.xml.namespace.QName COUPONSTARTDATE$14 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "couponStartDate");
        private static final javax.xml.namespace.QName COUPONENDDATE$16 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "couponEndDate");
        private static final javax.xml.namespace.QName COUPONVALUE$18 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "couponValue");
        private static final javax.xml.namespace.QName CHANNEL$20 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0/Coupon", "channel");
        
        
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
        
        /**
         * Gets the "consumerId" element
         */
        public java.lang.String getConsumerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "consumerId" element
         */
        public org.apache.xmlbeans.XmlString xgetConsumerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERID$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "consumerId" element
         */
        public boolean isNilConsumerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERID$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "consumerId" element
         */
        public void setConsumerId(java.lang.String consumerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSUMERID$6);
                }
                target.setStringValue(consumerId);
            }
        }
        
        /**
         * Sets (as xml) the "consumerId" element
         */
        public void xsetConsumerId(org.apache.xmlbeans.XmlString consumerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSUMERID$6);
                }
                target.set(consumerId);
            }
        }
        
        /**
         * Nils the "consumerId" element
         */
        public void setNilConsumerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSUMERID$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "transactionId" element
         */
        public java.lang.String getTransactionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "transactionId" element
         */
        public org.apache.xmlbeans.XmlString xgetTransactionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONID$8, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "transactionId" element
         */
        public boolean isNilTransactionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONID$8, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "transactionId" element
         */
        public void setTransactionId(java.lang.String transactionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONID$8);
                }
                target.setStringValue(transactionId);
            }
        }
        
        /**
         * Sets (as xml) the "transactionId" element
         */
        public void xsetTransactionId(org.apache.xmlbeans.XmlString transactionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSACTIONID$8);
                }
                target.set(transactionId);
            }
        }
        
        /**
         * Nils the "transactionId" element
         */
        public void setNilTransactionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSACTIONID$8);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "couponId" element
         */
        public java.lang.String getCouponId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "couponId" element
         */
        public org.apache.xmlbeans.XmlString xgetCouponId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONID$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "couponId" element
         */
        public void setCouponId(java.lang.String couponId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUPONID$10);
                }
                target.setStringValue(couponId);
            }
        }
        
        /**
         * Sets (as xml) the "couponId" element
         */
        public void xsetCouponId(org.apache.xmlbeans.XmlString couponId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONID$10);
                }
                target.set(couponId);
            }
        }
        
        /**
         * Gets the "couponDescription" element
         */
        public java.lang.String getCouponDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONDESCRIPTION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "couponDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetCouponDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONDESCRIPTION$12, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "couponDescription" element
         */
        public boolean isNilCouponDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONDESCRIPTION$12, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "couponDescription" element
         */
        public void setCouponDescription(java.lang.String couponDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONDESCRIPTION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUPONDESCRIPTION$12);
                }
                target.setStringValue(couponDescription);
            }
        }
        
        /**
         * Sets (as xml) the "couponDescription" element
         */
        public void xsetCouponDescription(org.apache.xmlbeans.XmlString couponDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONDESCRIPTION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONDESCRIPTION$12);
                }
                target.set(couponDescription);
            }
        }
        
        /**
         * Nils the "couponDescription" element
         */
        public void setNilCouponDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONDESCRIPTION$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONDESCRIPTION$12);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "couponStartDate" element
         */
        public java.lang.String getCouponStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONSTARTDATE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "couponStartDate" element
         */
        public org.apache.xmlbeans.XmlString xgetCouponStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONSTARTDATE$14, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "couponStartDate" element
         */
        public boolean isNilCouponStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONSTARTDATE$14, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "couponStartDate" element
         */
        public void setCouponStartDate(java.lang.String couponStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONSTARTDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUPONSTARTDATE$14);
                }
                target.setStringValue(couponStartDate);
            }
        }
        
        /**
         * Sets (as xml) the "couponStartDate" element
         */
        public void xsetCouponStartDate(org.apache.xmlbeans.XmlString couponStartDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONSTARTDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONSTARTDATE$14);
                }
                target.set(couponStartDate);
            }
        }
        
        /**
         * Nils the "couponStartDate" element
         */
        public void setNilCouponStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONSTARTDATE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONSTARTDATE$14);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "couponEndDate" element
         */
        public java.lang.String getCouponEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONENDDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "couponEndDate" element
         */
        public org.apache.xmlbeans.XmlString xgetCouponEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONENDDATE$16, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "couponEndDate" element
         */
        public boolean isNilCouponEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONENDDATE$16, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "couponEndDate" element
         */
        public void setCouponEndDate(java.lang.String couponEndDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONENDDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUPONENDDATE$16);
                }
                target.setStringValue(couponEndDate);
            }
        }
        
        /**
         * Sets (as xml) the "couponEndDate" element
         */
        public void xsetCouponEndDate(org.apache.xmlbeans.XmlString couponEndDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONENDDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONENDDATE$16);
                }
                target.set(couponEndDate);
            }
        }
        
        /**
         * Nils the "couponEndDate" element
         */
        public void setNilCouponEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONENDDATE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONENDDATE$16);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "couponValue" element
         */
        public java.lang.String getCouponValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONVALUE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "couponValue" element
         */
        public org.apache.xmlbeans.XmlString xgetCouponValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONVALUE$18, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "couponValue" element
         */
        public boolean isNilCouponValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONVALUE$18, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "couponValue" element
         */
        public void setCouponValue(java.lang.String couponValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUPONVALUE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUPONVALUE$18);
                }
                target.setStringValue(couponValue);
            }
        }
        
        /**
         * Sets (as xml) the "couponValue" element
         */
        public void xsetCouponValue(org.apache.xmlbeans.XmlString couponValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONVALUE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONVALUE$18);
                }
                target.set(couponValue);
            }
        }
        
        /**
         * Nils the "couponValue" element
         */
        public void setNilCouponValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUPONVALUE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUPONVALUE$18);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "channel" element
         */
        public java.lang.String getChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "channel" element
         */
        public org.apache.xmlbeans.XmlString xgetChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$20, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "channel" element
         */
        public boolean isNilChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$20, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "channel" element
         */
        public void setChannel(java.lang.String channel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNEL$20);
                }
                target.setStringValue(channel);
            }
        }
        
        /**
         * Sets (as xml) the "channel" element
         */
        public void xsetChannel(org.apache.xmlbeans.XmlString channel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANNEL$20);
                }
                target.set(channel);
            }
        }
        
        /**
         * Nils the "channel" element
         */
        public void setNilChannel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANNEL$20);
                }
                target.setNil();
            }
        }
    }
}
