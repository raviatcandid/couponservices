/*
 * An XML document type.
 * Localname: RewardIssuanceRequest
 * Namespace: http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest
 * Java type: com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.impl;
/**
 * A document containing one RewardIssuanceRequest(@http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest) element.
 *
 * This is a complex type.
 */
public class RewardIssuanceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RewardIssuanceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REWARDISSUANCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest", "RewardIssuanceRequest");
    
    
    /**
     * Gets the "RewardIssuanceRequest" element
     */
    public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest getRewardIssuanceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest target = null;
            target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest)get_store().find_element_user(REWARDISSUANCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RewardIssuanceRequest" element
     */
    public void setRewardIssuanceRequest(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest rewardIssuanceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest target = null;
            target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest)get_store().find_element_user(REWARDISSUANCEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest)get_store().add_element_user(REWARDISSUANCEREQUEST$0);
            }
            target.set(rewardIssuanceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RewardIssuanceRequest" element
     */
    public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest addNewRewardIssuanceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest target = null;
            target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest)get_store().add_element_user(REWARDISSUANCEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML RewardIssuanceRequest(@http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest).
     *
     * This is a complex type.
     */
    public static class RewardIssuanceRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest
    {
        private static final long serialVersionUID = 1L;
        
        public RewardIssuanceRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/ENWebService/headerRequest", "Header");
        private static final javax.xml.namespace.QName REFERENCEID$2 = 
            new javax.xml.namespace.QName("", "ReferenceId");
        private static final javax.xml.namespace.QName TRANSACTION$4 = 
            new javax.xml.namespace.QName("", "Transaction");
        
        
        /**
         * Gets the "Header" element
         */
        public com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header getHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header target = null;
                target = (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Header" element
         */
        public void setHeader(com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header header)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header target = null;
                target = (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header)get_store().find_element_user(HEADER$0, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
                }
                target.set(header);
            }
        }
        
        /**
         * Appends and returns a new empty "Header" element
         */
        public com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header addNewHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header target = null;
                target = (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header)get_store().add_element_user(HEADER$0);
                return target;
            }
        }
        
        /**
         * Gets the "ReferenceId" element
         */
        public java.lang.String getReferenceId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReferenceId" element
         */
        public org.apache.xmlbeans.XmlString xgetReferenceId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ReferenceId" element
         */
        public void setReferenceId(java.lang.String referenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEID$2);
                }
                target.setStringValue(referenceId);
            }
        }
        
        /**
         * Sets (as xml) the "ReferenceId" element
         */
        public void xsetReferenceId(org.apache.xmlbeans.XmlString referenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCEID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCEID$2);
                }
                target.set(referenceId);
            }
        }
        
        /**
         * Gets the "Transaction" element
         */
        public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction getTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction target = null;
                target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction)get_store().find_element_user(TRANSACTION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Transaction" element
         */
        public void setTransaction(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction transaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction target = null;
                target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction)get_store().find_element_user(TRANSACTION$4, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction)get_store().add_element_user(TRANSACTION$4);
                }
                target.set(transaction);
            }
        }
        
        /**
         * Appends and returns a new empty "Transaction" element
         */
        public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction addNewTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction target = null;
                target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction)get_store().add_element_user(TRANSACTION$4);
                return target;
            }
        }
        /**
         * An XML Transaction(@).
         *
         * This is a complex type.
         */
        public static class TransactionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction
        {
            private static final long serialVersionUID = 1L;
            
            public TransactionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BATCHID$0 = 
                new javax.xml.namespace.QName("", "BatchId");
            private static final javax.xml.namespace.QName PROCESSINGTYPE$2 = 
                new javax.xml.namespace.QName("", "ProcessingType");
            private static final javax.xml.namespace.QName OFFLINE$4 = 
                new javax.xml.namespace.QName("", "Offline");
            private static final javax.xml.namespace.QName LOCALTRANSACTIONID$6 = 
                new javax.xml.namespace.QName("", "LocalTransactionId");
            private static final javax.xml.namespace.QName TOTALTRANSACTIONAMOUNT$8 = 
                new javax.xml.namespace.QName("", "TotalTransactionAmount");
            private static final javax.xml.namespace.QName TAXAMOUNT$10 = 
                new javax.xml.namespace.QName("", "TaxAmount");
            private static final javax.xml.namespace.QName REWARDELIGIBLEAMOUNT$12 = 
                new javax.xml.namespace.QName("", "RewardEligibleAmount");
            private static final javax.xml.namespace.QName TOTALDISCOUNTISSUED$14 = 
                new javax.xml.namespace.QName("", "TotalDiscountIssued");
            private static final javax.xml.namespace.QName TENDERS$16 = 
                new javax.xml.namespace.QName("http://webservice.en.excentus.com/Tenders", "Tenders");
            private static final javax.xml.namespace.QName DETAILS$18 = 
                new javax.xml.namespace.QName("http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest", "Details");
            
            
            /**
             * Gets the "BatchId" element
             */
            public java.lang.String getBatchId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "BatchId" element
             */
            public org.apache.xmlbeans.XmlString xgetBatchId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATCHID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "BatchId" element
             */
            public void setBatchId(java.lang.String batchId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHID$0);
                    }
                    target.setStringValue(batchId);
                }
            }
            
            /**
             * Sets (as xml) the "BatchId" element
             */
            public void xsetBatchId(org.apache.xmlbeans.XmlString batchId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BATCHID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BATCHID$0);
                    }
                    target.set(batchId);
                }
            }
            
            /**
             * Gets the "ProcessingType" element
             */
            public java.lang.String getProcessingType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ProcessingType" element
             */
            public org.apache.xmlbeans.XmlString xgetProcessingType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSINGTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "ProcessingType" element
             */
            public boolean isNilProcessingType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSINGTYPE$2, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "ProcessingType" element
             */
            public boolean isSetProcessingType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROCESSINGTYPE$2) != 0;
                }
            }
            
            /**
             * Sets the "ProcessingType" element
             */
            public void setProcessingType(java.lang.String processingType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSINGTYPE$2);
                    }
                    target.setStringValue(processingType);
                }
            }
            
            /**
             * Sets (as xml) the "ProcessingType" element
             */
            public void xsetProcessingType(org.apache.xmlbeans.XmlString processingType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSINGTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESSINGTYPE$2);
                    }
                    target.set(processingType);
                }
            }
            
            /**
             * Nils the "ProcessingType" element
             */
            public void setNilProcessingType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCESSINGTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCESSINGTYPE$2);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "ProcessingType" element
             */
            public void unsetProcessingType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROCESSINGTYPE$2, 0);
                }
            }
            
            /**
             * Gets the "Offline" element
             */
            public boolean getOffline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFLINE$4, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Offline" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetOffline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OFFLINE$4, 0);
                    return target;
                }
            }
            
            /**
             * Tests for nil "Offline" element
             */
            public boolean isNilOffline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OFFLINE$4, 0);
                    if (target == null) return false;
                    return target.isNil();
                }
            }
            
            /**
             * True if has "Offline" element
             */
            public boolean isSetOffline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OFFLINE$4) != 0;
                }
            }
            
            /**
             * Sets the "Offline" element
             */
            public void setOffline(boolean offline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFLINE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFLINE$4);
                    }
                    target.setBooleanValue(offline);
                }
            }
            
            /**
             * Sets (as xml) the "Offline" element
             */
            public void xsetOffline(org.apache.xmlbeans.XmlBoolean offline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OFFLINE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OFFLINE$4);
                    }
                    target.set(offline);
                }
            }
            
            /**
             * Nils the "Offline" element
             */
            public void setNilOffline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OFFLINE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OFFLINE$4);
                    }
                    target.setNil();
                }
            }
            
            /**
             * Unsets the "Offline" element
             */
            public void unsetOffline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OFFLINE$4, 0);
                }
            }
            
            /**
             * Gets the "LocalTransactionId" element
             */
            public java.lang.String getLocalTransactionId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALTRANSACTIONID$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "LocalTransactionId" element
             */
            public org.apache.xmlbeans.XmlString xgetLocalTransactionId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALTRANSACTIONID$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "LocalTransactionId" element
             */
            public void setLocalTransactionId(java.lang.String localTransactionId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALTRANSACTIONID$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALTRANSACTIONID$6);
                    }
                    target.setStringValue(localTransactionId);
                }
            }
            
            /**
             * Sets (as xml) the "LocalTransactionId" element
             */
            public void xsetLocalTransactionId(org.apache.xmlbeans.XmlString localTransactionId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALTRANSACTIONID$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALTRANSACTIONID$6);
                    }
                    target.set(localTransactionId);
                }
            }
            
            /**
             * Gets the "TotalTransactionAmount" element
             */
            public java.math.BigDecimal getTotalTransactionAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALTRANSACTIONAMOUNT$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "TotalTransactionAmount" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetTotalTransactionAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(TOTALTRANSACTIONAMOUNT$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TotalTransactionAmount" element
             */
            public void setTotalTransactionAmount(java.math.BigDecimal totalTransactionAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALTRANSACTIONAMOUNT$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALTRANSACTIONAMOUNT$8);
                    }
                    target.setBigDecimalValue(totalTransactionAmount);
                }
            }
            
            /**
             * Sets (as xml) the "TotalTransactionAmount" element
             */
            public void xsetTotalTransactionAmount(org.apache.xmlbeans.XmlDecimal totalTransactionAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(TOTALTRANSACTIONAMOUNT$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(TOTALTRANSACTIONAMOUNT$8);
                    }
                    target.set(totalTransactionAmount);
                }
            }
            
            /**
             * Gets the "TaxAmount" element
             */
            public java.math.BigDecimal getTaxAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "TaxAmount" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetTaxAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(TAXAMOUNT$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TaxAmount" element
             */
            public boolean isSetTaxAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAXAMOUNT$10) != 0;
                }
            }
            
            /**
             * Sets the "TaxAmount" element
             */
            public void setTaxAmount(java.math.BigDecimal taxAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$10);
                    }
                    target.setBigDecimalValue(taxAmount);
                }
            }
            
            /**
             * Sets (as xml) the "TaxAmount" element
             */
            public void xsetTaxAmount(org.apache.xmlbeans.XmlDecimal taxAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(TAXAMOUNT$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(TAXAMOUNT$10);
                    }
                    target.set(taxAmount);
                }
            }
            
            /**
             * Unsets the "TaxAmount" element
             */
            public void unsetTaxAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAXAMOUNT$10, 0);
                }
            }
            
            /**
             * Gets the "RewardEligibleAmount" element
             */
            public java.math.BigDecimal getRewardEligibleAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDELIGIBLEAMOUNT$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "RewardEligibleAmount" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetRewardEligibleAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDELIGIBLEAMOUNT$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RewardEligibleAmount" element
             */
            public void setRewardEligibleAmount(java.math.BigDecimal rewardEligibleAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDELIGIBLEAMOUNT$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDELIGIBLEAMOUNT$12);
                    }
                    target.setBigDecimalValue(rewardEligibleAmount);
                }
            }
            
            /**
             * Sets (as xml) the "RewardEligibleAmount" element
             */
            public void xsetRewardEligibleAmount(org.apache.xmlbeans.XmlDecimal rewardEligibleAmount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDELIGIBLEAMOUNT$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(REWARDELIGIBLEAMOUNT$12);
                    }
                    target.set(rewardEligibleAmount);
                }
            }
            
            /**
             * Gets the "TotalDiscountIssued" element
             */
            public java.math.BigDecimal getTotalDiscountIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDISCOUNTISSUED$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "TotalDiscountIssued" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetTotalDiscountIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(TOTALDISCOUNTISSUED$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TotalDiscountIssued" element
             */
            public boolean isSetTotalDiscountIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TOTALDISCOUNTISSUED$14) != 0;
                }
            }
            
            /**
             * Sets the "TotalDiscountIssued" element
             */
            public void setTotalDiscountIssued(java.math.BigDecimal totalDiscountIssued)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALDISCOUNTISSUED$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALDISCOUNTISSUED$14);
                    }
                    target.setBigDecimalValue(totalDiscountIssued);
                }
            }
            
            /**
             * Sets (as xml) the "TotalDiscountIssued" element
             */
            public void xsetTotalDiscountIssued(org.apache.xmlbeans.XmlDecimal totalDiscountIssued)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(TOTALDISCOUNTISSUED$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(TOTALDISCOUNTISSUED$14);
                    }
                    target.set(totalDiscountIssued);
                }
            }
            
            /**
             * Unsets the "TotalDiscountIssued" element
             */
            public void unsetTotalDiscountIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TOTALDISCOUNTISSUED$14, 0);
                }
            }
            
            /**
             * Gets the "Tenders" element
             */
            public com.excentus.en.webservice.tenders.TendersDocument.Tenders getTenders()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.tenders.TendersDocument.Tenders target = null;
                    target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().find_element_user(TENDERS$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Tenders" element
             */
            public void setTenders(com.excentus.en.webservice.tenders.TendersDocument.Tenders tenders)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.tenders.TendersDocument.Tenders target = null;
                    target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().find_element_user(TENDERS$16, 0);
                    if (target == null)
                    {
                      target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().add_element_user(TENDERS$16);
                    }
                    target.set(tenders);
                }
            }
            
            /**
             * Appends and returns a new empty "Tenders" element
             */
            public com.excentus.en.webservice.tenders.TendersDocument.Tenders addNewTenders()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.tenders.TendersDocument.Tenders target = null;
                    target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().add_element_user(TENDERS$16);
                    return target;
                }
            }
            
            /**
             * Gets the "Details" element
             */
            public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details getDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details target = null;
                    target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().find_element_user(DETAILS$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Details" element
             */
            public boolean isSetDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DETAILS$18) != 0;
                }
            }
            
            /**
             * Sets the "Details" element
             */
            public void setDetails(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details details)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details target = null;
                    target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().find_element_user(DETAILS$18, 0);
                    if (target == null)
                    {
                      target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().add_element_user(DETAILS$18);
                    }
                    target.set(details);
                }
            }
            
            /**
             * Appends and returns a new empty "Details" element
             */
            public com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details addNewDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details target = null;
                    target = (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details)get_store().add_element_user(DETAILS$18);
                    return target;
                }
            }
            
            /**
             * Unsets the "Details" element
             */
            public void unsetDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DETAILS$18, 0);
                }
            }
        }
    }
}
