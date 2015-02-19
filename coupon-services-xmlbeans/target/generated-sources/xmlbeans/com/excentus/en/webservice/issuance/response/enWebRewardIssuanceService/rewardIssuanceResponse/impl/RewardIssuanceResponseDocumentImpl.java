/*
 * An XML document type.
 * Localname: RewardIssuanceResponse
 * Namespace: http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse
 * Java type: com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.impl;
/**
 * A document containing one RewardIssuanceResponse(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse) element.
 *
 * This is a complex type.
 */
public class RewardIssuanceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RewardIssuanceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REWARDISSUANCERESPONSE$0 = 
        new javax.xml.namespace.QName("http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse", "RewardIssuanceResponse");
    
    
    /**
     * Gets the "RewardIssuanceResponse" element
     */
    public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse getRewardIssuanceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse target = null;
            target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse)get_store().find_element_user(REWARDISSUANCERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RewardIssuanceResponse" element
     */
    public void setRewardIssuanceResponse(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse rewardIssuanceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse target = null;
            target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse)get_store().find_element_user(REWARDISSUANCERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse)get_store().add_element_user(REWARDISSUANCERESPONSE$0);
            }
            target.set(rewardIssuanceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RewardIssuanceResponse" element
     */
    public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse addNewRewardIssuanceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse target = null;
            target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse)get_store().add_element_user(REWARDISSUANCERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RewardIssuanceResponse(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse).
     *
     * This is a complex type.
     */
    public static class RewardIssuanceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RewardIssuanceResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEADER$0 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/ENWebService/headerRequest", "Header");
        private static final javax.xml.namespace.QName REFERENCEID$2 = 
            new javax.xml.namespace.QName("", "ReferenceId");
        private static final javax.xml.namespace.QName ERRORS$4 = 
            new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "Errors");
        private static final javax.xml.namespace.QName REWARDSUMMARY$6 = 
            new javax.xml.namespace.QName("", "RewardSummary");
        private static final javax.xml.namespace.QName OFFERSUMMARY$8 = 
            new javax.xml.namespace.QName("", "OfferSummary");
        
        
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
         * Gets the "Errors" element
         */
        public com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors getErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors target = null;
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Errors" element
         */
        public boolean isSetErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORS$4) != 0;
            }
        }
        
        /**
         * Sets the "Errors" element
         */
        public void setErrors(com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors errors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors target = null;
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$4, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$4);
                }
                target.set(errors);
            }
        }
        
        /**
         * Appends and returns a new empty "Errors" element
         */
        public com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors addNewErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors target = null;
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Errors" element
         */
        public void unsetErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORS$4, 0);
            }
        }
        
        /**
         * Gets the "RewardSummary" element
         */
        public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary getRewardSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary target = null;
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary)get_store().find_element_user(REWARDSUMMARY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "RewardSummary" element
         */
        public boolean isSetRewardSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REWARDSUMMARY$6) != 0;
            }
        }
        
        /**
         * Sets the "RewardSummary" element
         */
        public void setRewardSummary(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary rewardSummary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary target = null;
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary)get_store().find_element_user(REWARDSUMMARY$6, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary)get_store().add_element_user(REWARDSUMMARY$6);
                }
                target.set(rewardSummary);
            }
        }
        
        /**
         * Appends and returns a new empty "RewardSummary" element
         */
        public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary addNewRewardSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary target = null;
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary)get_store().add_element_user(REWARDSUMMARY$6);
                return target;
            }
        }
        
        /**
         * Unsets the "RewardSummary" element
         */
        public void unsetRewardSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REWARDSUMMARY$6, 0);
            }
        }
        
        /**
         * Gets the "OfferSummary" element
         */
        public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary getOfferSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary target = null;
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary)get_store().find_element_user(OFFERSUMMARY$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "OfferSummary" element
         */
        public boolean isSetOfferSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERSUMMARY$8) != 0;
            }
        }
        
        /**
         * Sets the "OfferSummary" element
         */
        public void setOfferSummary(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary offerSummary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary target = null;
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary)get_store().find_element_user(OFFERSUMMARY$8, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary)get_store().add_element_user(OFFERSUMMARY$8);
                }
                target.set(offerSummary);
            }
        }
        
        /**
         * Appends and returns a new empty "OfferSummary" element
         */
        public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary addNewOfferSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary target = null;
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary)get_store().add_element_user(OFFERSUMMARY$8);
                return target;
            }
        }
        
        /**
         * Unsets the "OfferSummary" element
         */
        public void unsetOfferSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERSUMMARY$8, 0);
            }
        }
        /**
         * An XML RewardSummary(@).
         *
         * This is a complex type.
         */
        public static class RewardSummaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary
        {
            private static final long serialVersionUID = 1L;
            
            public RewardSummaryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REWARDEARNED$0 = 
                new javax.xml.namespace.QName("", "RewardEarned");
            private static final javax.xml.namespace.QName LIMIT$2 = 
                new javax.xml.namespace.QName("http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse", "Limit");
            private static final javax.xml.namespace.QName REWARDEXPIRATIONDATE$4 = 
                new javax.xml.namespace.QName("", "RewardExpirationDate");
            
            
            /**
             * Gets the "RewardEarned" element
             */
            public java.math.BigDecimal getRewardEarned()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDEARNED$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "RewardEarned" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetRewardEarned()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDEARNED$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RewardEarned" element
             */
            public void setRewardEarned(java.math.BigDecimal rewardEarned)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDEARNED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDEARNED$0);
                    }
                    target.setBigDecimalValue(rewardEarned);
                }
            }
            
            /**
             * Sets (as xml) the "RewardEarned" element
             */
            public void xsetRewardEarned(org.apache.xmlbeans.XmlDecimal rewardEarned)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDEARNED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(REWARDEARNED$0);
                    }
                    target.set(rewardEarned);
                }
            }
            
            /**
             * Gets the "Limit" element
             */
            public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit getLimit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit)get_store().find_element_user(LIMIT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Limit" element
             */
            public void setLimit(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit limit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit)get_store().find_element_user(LIMIT$2, 0);
                    if (target == null)
                    {
                      target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit)get_store().add_element_user(LIMIT$2);
                    }
                    target.set(limit);
                }
            }
            
            /**
             * Appends and returns a new empty "Limit" element
             */
            public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit addNewLimit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit)get_store().add_element_user(LIMIT$2);
                    return target;
                }
            }
            
            /**
             * Gets the "RewardExpirationDate" element
             */
            public java.lang.String getRewardExpirationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDEXPIRATIONDATE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RewardExpirationDate" element
             */
            public org.apache.xmlbeans.XmlString xgetRewardExpirationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REWARDEXPIRATIONDATE$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RewardExpirationDate" element
             */
            public void setRewardExpirationDate(java.lang.String rewardExpirationDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDEXPIRATIONDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDEXPIRATIONDATE$4);
                    }
                    target.setStringValue(rewardExpirationDate);
                }
            }
            
            /**
             * Sets (as xml) the "RewardExpirationDate" element
             */
            public void xsetRewardExpirationDate(org.apache.xmlbeans.XmlString rewardExpirationDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REWARDEXPIRATIONDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REWARDEXPIRATIONDATE$4);
                    }
                    target.set(rewardExpirationDate);
                }
            }
        }
        /**
         * An XML OfferSummary(@).
         *
         * This is a complex type.
         */
        public static class OfferSummaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary
        {
            private static final long serialVersionUID = 1L;
            
            public OfferSummaryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OFFER$0 = 
                new javax.xml.namespace.QName("http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse", "Offer");
            
            
            /**
             * Gets array of all "Offer" elements
             */
            public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer[] getOfferArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OFFER$0, targetList);
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer[] result = new com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Offer" element
             */
            public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer getOfferArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().find_element_user(OFFER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Offer" element
             */
            public int sizeOfOfferArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OFFER$0);
                }
            }
            
            /**
             * Sets array of all "Offer" element
             */
            public void setOfferArray(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer[] offerArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(offerArray, OFFER$0);
                }
            }
            
            /**
             * Sets ith "Offer" element
             */
            public void setOfferArray(int i, com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer offer)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().find_element_user(OFFER$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(offer);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Offer" element
             */
            public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer insertNewOffer(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().insert_element_user(OFFER$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Offer" element
             */
            public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer addNewOffer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer target = null;
                    target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().add_element_user(OFFER$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Offer" element
             */
            public void removeOffer(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OFFER$0, i);
                }
            }
        }
    }
}
