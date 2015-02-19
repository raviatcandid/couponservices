/*
 * An XML document type.
 * Localname: Offer
 * Namespace: http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse
 * Java type: com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.impl;
/**
 * A document containing one Offer(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse) element.
 *
 * This is a complex type.
 */
public class OfferDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFER$0 = 
        new javax.xml.namespace.QName("http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse", "Offer");
    
    
    /**
     * Gets the "Offer" element
     */
    public com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer getOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer target = null;
            target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().find_element_user(OFFER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Offer" element
     */
    public void setOffer(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer offer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer target = null;
            target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().find_element_user(OFFER$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer)get_store().add_element_user(OFFER$0);
            }
            target.set(offer);
        }
    }
    
    /**
     * Appends and returns a new empty "Offer" element
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
     * An XML Offer(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse).
     *
     * This is a complex type.
     */
    public static class OfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer
    {
        private static final long serialVersionUID = 1L;
        
        public OfferImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "Name");
        private static final javax.xml.namespace.QName STARTPURCHASEBALANCE$2 = 
            new javax.xml.namespace.QName("", "StartPurchaseBalance");
        private static final javax.xml.namespace.QName ENDPURCHASEBALANCE$4 = 
            new javax.xml.namespace.QName("", "EndPurchaseBalance");
        private static final javax.xml.namespace.QName REWARDELIGIBLEAMT$6 = 
            new javax.xml.namespace.QName("", "RewardEligibleAmt");
        private static final javax.xml.namespace.QName MAXREACHED$8 = 
            new javax.xml.namespace.QName("", "MaxReached");
        private static final javax.xml.namespace.QName PURCHASEREQUIREMENT$10 = 
            new javax.xml.namespace.QName("", "PurchaseRequirement");
        private static final javax.xml.namespace.QName REWARDAMT$12 = 
            new javax.xml.namespace.QName("", "RewardAmt");
        
        
        /**
         * Gets the "Name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Name" element
         */
        public boolean isNilName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "Name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Nils the "Name" element
         */
        public void setNilName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "StartPurchaseBalance" element
         */
        public java.math.BigDecimal getStartPurchaseBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPURCHASEBALANCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartPurchaseBalance" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetStartPurchaseBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STARTPURCHASEBALANCE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartPurchaseBalance" element
         */
        public void setStartPurchaseBalance(java.math.BigDecimal startPurchaseBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPURCHASEBALANCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTPURCHASEBALANCE$2);
                }
                target.setBigDecimalValue(startPurchaseBalance);
            }
        }
        
        /**
         * Sets (as xml) the "StartPurchaseBalance" element
         */
        public void xsetStartPurchaseBalance(org.apache.xmlbeans.XmlDecimal startPurchaseBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STARTPURCHASEBALANCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(STARTPURCHASEBALANCE$2);
                }
                target.set(startPurchaseBalance);
            }
        }
        
        /**
         * Gets the "EndPurchaseBalance" element
         */
        public java.math.BigDecimal getEndPurchaseBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPURCHASEBALANCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndPurchaseBalance" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetEndPurchaseBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPURCHASEBALANCE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EndPurchaseBalance" element
         */
        public void setEndPurchaseBalance(java.math.BigDecimal endPurchaseBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPURCHASEBALANCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPURCHASEBALANCE$4);
                }
                target.setBigDecimalValue(endPurchaseBalance);
            }
        }
        
        /**
         * Sets (as xml) the "EndPurchaseBalance" element
         */
        public void xsetEndPurchaseBalance(org.apache.xmlbeans.XmlDecimal endPurchaseBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDPURCHASEBALANCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ENDPURCHASEBALANCE$4);
                }
                target.set(endPurchaseBalance);
            }
        }
        
        /**
         * Gets the "RewardEligibleAmt" element
         */
        public java.math.BigDecimal getRewardEligibleAmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDELIGIBLEAMT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "RewardEligibleAmt" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetRewardEligibleAmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDELIGIBLEAMT$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RewardEligibleAmt" element
         */
        public void setRewardEligibleAmt(java.math.BigDecimal rewardEligibleAmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDELIGIBLEAMT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDELIGIBLEAMT$6);
                }
                target.setBigDecimalValue(rewardEligibleAmt);
            }
        }
        
        /**
         * Sets (as xml) the "RewardEligibleAmt" element
         */
        public void xsetRewardEligibleAmt(org.apache.xmlbeans.XmlDecimal rewardEligibleAmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDELIGIBLEAMT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(REWARDELIGIBLEAMT$6);
                }
                target.set(rewardEligibleAmt);
            }
        }
        
        /**
         * Gets the "MaxReached" element
         */
        public java.lang.String getMaxReached()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXREACHED$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MaxReached" element
         */
        public org.apache.xmlbeans.XmlString xgetMaxReached()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXREACHED$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MaxReached" element
         */
        public void setMaxReached(java.lang.String maxReached)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXREACHED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXREACHED$8);
                }
                target.setStringValue(maxReached);
            }
        }
        
        /**
         * Sets (as xml) the "MaxReached" element
         */
        public void xsetMaxReached(org.apache.xmlbeans.XmlString maxReached)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXREACHED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXREACHED$8);
                }
                target.set(maxReached);
            }
        }
        
        /**
         * Gets the "PurchaseRequirement" element
         */
        public java.math.BigDecimal getPurchaseRequirement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEREQUIREMENT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "PurchaseRequirement" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetPurchaseRequirement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURCHASEREQUIREMENT$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PurchaseRequirement" element
         */
        public void setPurchaseRequirement(java.math.BigDecimal purchaseRequirement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEREQUIREMENT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURCHASEREQUIREMENT$10);
                }
                target.setBigDecimalValue(purchaseRequirement);
            }
        }
        
        /**
         * Sets (as xml) the "PurchaseRequirement" element
         */
        public void xsetPurchaseRequirement(org.apache.xmlbeans.XmlDecimal purchaseRequirement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURCHASEREQUIREMENT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PURCHASEREQUIREMENT$10);
                }
                target.set(purchaseRequirement);
            }
        }
        
        /**
         * Gets the "RewardAmt" element
         */
        public java.math.BigDecimal getRewardAmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDAMT$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "RewardAmt" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetRewardAmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDAMT$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RewardAmt" element
         */
        public void setRewardAmt(java.math.BigDecimal rewardAmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDAMT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDAMT$12);
                }
                target.setBigDecimalValue(rewardAmt);
            }
        }
        
        /**
         * Sets (as xml) the "RewardAmt" element
         */
        public void xsetRewardAmt(org.apache.xmlbeans.XmlDecimal rewardAmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDAMT$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(REWARDAMT$12);
                }
                target.set(rewardAmt);
            }
        }
    }
}
