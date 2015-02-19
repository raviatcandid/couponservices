/*
 * An XML document type.
 * Localname: BasketOffer
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.BasketOfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one BasketOffer(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class BasketOfferDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.BasketOfferDocument
{
    private static final long serialVersionUID = 1L;
    
    public BasketOfferDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASKETOFFER$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "BasketOffer");
    
    
    /**
     * Gets the "BasketOffer" element
     */
    public com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer getBasketOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
            target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().find_element_user(BASKETOFFER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BasketOffer" element
     */
    public void setBasketOffer(com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer basketOffer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
            target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().find_element_user(BASKETOFFER$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().add_element_user(BASKETOFFER$0);
            }
            target.set(basketOffer);
        }
    }
    
    /**
     * Appends and returns a new empty "BasketOffer" element
     */
    public com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer addNewBasketOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer target = null;
            target = (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer)get_store().add_element_user(BASKETOFFER$0);
            return target;
        }
    }
    /**
     * An XML BasketOffer(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class BasketOfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer
    {
        private static final long serialVersionUID = 1L;
        
        public BasketOfferImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PURCHASEBALANCE$0 = 
            new javax.xml.namespace.QName("", "PurchaseBalance");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("", "StartDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("", "EndDate");
        private static final javax.xml.namespace.QName BASKETSIZE$6 = 
            new javax.xml.namespace.QName("", "BasketSize");
        private static final javax.xml.namespace.QName BALANCESTATUS$8 = 
            new javax.xml.namespace.QName("", "BalanceStatus");
        private static final javax.xml.namespace.QName BASKETMIN$10 = 
            new javax.xml.namespace.QName("", "BasketMin");
        private static final javax.xml.namespace.QName BASKETMAX$12 = 
            new javax.xml.namespace.QName("", "BasketMax");
        private static final javax.xml.namespace.QName REWARDS$14 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Rewards");
        private static final javax.xml.namespace.QName ID$16 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TYPE$18 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "PurchaseBalance" element
         */
        public java.math.BigDecimal getPurchaseBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEBALANCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "PurchaseBalance" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetPurchaseBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURCHASEBALANCE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PurchaseBalance" element
         */
        public void setPurchaseBalance(java.math.BigDecimal purchaseBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEBALANCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURCHASEBALANCE$0);
                }
                target.setBigDecimalValue(purchaseBalance);
            }
        }
        
        /**
         * Sets (as xml) the "PurchaseBalance" element
         */
        public void xsetPurchaseBalance(org.apache.xmlbeans.XmlDecimal purchaseBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PURCHASEBALANCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PURCHASEBALANCE$0);
                }
                target.set(purchaseBalance);
            }
        }
        
        /**
         * Gets the "StartDate" element
         */
        public java.lang.String getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartDate" element
         */
        public org.apache.xmlbeans.XmlString xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartDate" element
         */
        public void setStartDate(java.lang.String startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
                }
                target.setStringValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "StartDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlString startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$2);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "EndDate" element
         */
        public java.lang.String getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        public org.apache.xmlbeans.XmlString xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EndDate" element
         */
        public void setEndDate(java.lang.String endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
                }
                target.setStringValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlString endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$4);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "BasketSize" element
         */
        public java.math.BigDecimal getBasketSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASKETSIZE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "BasketSize" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetBasketSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BASKETSIZE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BasketSize" element
         */
        public void setBasketSize(java.math.BigDecimal basketSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASKETSIZE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASKETSIZE$6);
                }
                target.setBigDecimalValue(basketSize);
            }
        }
        
        /**
         * Sets (as xml) the "BasketSize" element
         */
        public void xsetBasketSize(org.apache.xmlbeans.XmlDecimal basketSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BASKETSIZE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BASKETSIZE$6);
                }
                target.set(basketSize);
            }
        }
        
        /**
         * Gets the "BalanceStatus" element
         */
        public java.lang.String getBalanceStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BALANCESTATUS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BalanceStatus" element
         */
        public org.apache.xmlbeans.XmlString xgetBalanceStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BALANCESTATUS$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BalanceStatus" element
         */
        public void setBalanceStatus(java.lang.String balanceStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BALANCESTATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BALANCESTATUS$8);
                }
                target.setStringValue(balanceStatus);
            }
        }
        
        /**
         * Sets (as xml) the "BalanceStatus" element
         */
        public void xsetBalanceStatus(org.apache.xmlbeans.XmlString balanceStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BALANCESTATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BALANCESTATUS$8);
                }
                target.set(balanceStatus);
            }
        }
        
        /**
         * Gets the "BasketMin" element
         */
        public java.math.BigDecimal getBasketMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASKETMIN$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "BasketMin" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetBasketMin()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BASKETMIN$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BasketMin" element
         */
        public void setBasketMin(java.math.BigDecimal basketMin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASKETMIN$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASKETMIN$10);
                }
                target.setBigDecimalValue(basketMin);
            }
        }
        
        /**
         * Sets (as xml) the "BasketMin" element
         */
        public void xsetBasketMin(org.apache.xmlbeans.XmlDecimal basketMin)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BASKETMIN$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BASKETMIN$10);
                }
                target.set(basketMin);
            }
        }
        
        /**
         * Gets the "BasketMax" element
         */
        public java.math.BigDecimal getBasketMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASKETMAX$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "BasketMax" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetBasketMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BASKETMAX$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BasketMax" element
         */
        public void setBasketMax(java.math.BigDecimal basketMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASKETMAX$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASKETMAX$12);
                }
                target.setBigDecimalValue(basketMax);
            }
        }
        
        /**
         * Sets (as xml) the "BasketMax" element
         */
        public void xsetBasketMax(org.apache.xmlbeans.XmlDecimal basketMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(BASKETMAX$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(BASKETMAX$12);
                }
                target.set(basketMax);
            }
        }
        
        /**
         * Gets the "Rewards" element
         */
        public com.excentus.en.webservice.offers.RewardsDocument.Rewards getRewards()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().find_element_user(REWARDS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Rewards" element
         */
        public void setRewards(com.excentus.en.webservice.offers.RewardsDocument.Rewards rewards)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().find_element_user(REWARDS$14, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().add_element_user(REWARDS$14);
                }
                target.set(rewards);
            }
        }
        
        /**
         * Appends and returns a new empty "Rewards" element
         */
        public com.excentus.en.webservice.offers.RewardsDocument.Rewards addNewRewards()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().add_element_user(REWARDS$14);
                return target;
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$16);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$16);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.excentus.en.webservice.offers.BasketOfferType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$18);
                if (target == null)
                {
                    return null;
                }
                return (com.excentus.en.webservice.offers.BasketOfferType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.excentus.en.webservice.offers.BasketOfferType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.BasketOfferType target = null;
                target = (com.excentus.en.webservice.offers.BasketOfferType)get_store().find_attribute_user(TYPE$18);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.excentus.en.webservice.offers.BasketOfferType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$18);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.excentus.en.webservice.offers.BasketOfferType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.BasketOfferType target = null;
                target = (com.excentus.en.webservice.offers.BasketOfferType)get_store().find_attribute_user(TYPE$18);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.BasketOfferType)get_store().add_attribute_user(TYPE$18);
                }
                target.set(type);
            }
        }
    }
}
