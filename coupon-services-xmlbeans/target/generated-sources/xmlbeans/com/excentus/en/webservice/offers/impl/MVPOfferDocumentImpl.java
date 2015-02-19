/*
 * An XML document type.
 * Localname: MVPOffer
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.MVPOfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one MVPOffer(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class MVPOfferDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.MVPOfferDocument
{
    private static final long serialVersionUID = 1L;
    
    public MVPOfferDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MVPOFFER$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "MVPOffer");
    
    
    /**
     * Gets the "MVPOffer" element
     */
    public com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer getMVPOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
            target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().find_element_user(MVPOFFER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MVPOffer" element
     */
    public void setMVPOffer(com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer mvpOffer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
            target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().find_element_user(MVPOFFER$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().add_element_user(MVPOFFER$0);
            }
            target.set(mvpOffer);
        }
    }
    
    /**
     * Appends and returns a new empty "MVPOffer" element
     */
    public com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer addNewMVPOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer target = null;
            target = (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer)get_store().add_element_user(MVPOFFER$0);
            return target;
        }
    }
    /**
     * An XML MVPOffer(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class MVPOfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer
    {
        private static final long serialVersionUID = 1L;
        
        public MVPOfferImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STARTINGBALANCE$0 = 
            new javax.xml.namespace.QName("", "StartingBalance");
        private static final javax.xml.namespace.QName ENDINGBALANCE$2 = 
            new javax.xml.namespace.QName("", "EndingBalance");
        private static final javax.xml.namespace.QName QUALIFIEDUNITS$4 = 
            new javax.xml.namespace.QName("", "QualifiedUnits");
        private static final javax.xml.namespace.QName LOCKEDTOKENID$6 = 
            new javax.xml.namespace.QName("", "LockedTokenId");
        private static final javax.xml.namespace.QName REWARDISSUED$8 = 
            new javax.xml.namespace.QName("", "RewardIssued");
        private static final javax.xml.namespace.QName ID$10 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName REQUIREDUNITS$12 = 
            new javax.xml.namespace.QName("", "RequiredUnits");
        private static final javax.xml.namespace.QName EXPIRATIONDAYS$14 = 
            new javax.xml.namespace.QName("", "ExpirationDays");
        
        
        /**
         * Gets the "StartingBalance" element
         */
        public java.math.BigDecimal getStartingBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTINGBALANCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartingBalance" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetStartingBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STARTINGBALANCE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartingBalance" element
         */
        public void setStartingBalance(java.math.BigDecimal startingBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTINGBALANCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTINGBALANCE$0);
                }
                target.setBigDecimalValue(startingBalance);
            }
        }
        
        /**
         * Sets (as xml) the "StartingBalance" element
         */
        public void xsetStartingBalance(org.apache.xmlbeans.XmlDecimal startingBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(STARTINGBALANCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(STARTINGBALANCE$0);
                }
                target.set(startingBalance);
            }
        }
        
        /**
         * Gets the "EndingBalance" element
         */
        public java.math.BigDecimal getEndingBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDINGBALANCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "EndingBalance" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetEndingBalance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDINGBALANCE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EndingBalance" element
         */
        public void setEndingBalance(java.math.BigDecimal endingBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDINGBALANCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDINGBALANCE$2);
                }
                target.setBigDecimalValue(endingBalance);
            }
        }
        
        /**
         * Sets (as xml) the "EndingBalance" element
         */
        public void xsetEndingBalance(org.apache.xmlbeans.XmlDecimal endingBalance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ENDINGBALANCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ENDINGBALANCE$2);
                }
                target.set(endingBalance);
            }
        }
        
        /**
         * Gets the "QualifiedUnits" element
         */
        public java.math.BigDecimal getQualifiedUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIEDUNITS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "QualifiedUnits" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetQualifiedUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(QUALIFIEDUNITS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "QualifiedUnits" element
         */
        public void setQualifiedUnits(java.math.BigDecimal qualifiedUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIEDUNITS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFIEDUNITS$4);
                }
                target.setBigDecimalValue(qualifiedUnits);
            }
        }
        
        /**
         * Sets (as xml) the "QualifiedUnits" element
         */
        public void xsetQualifiedUnits(org.apache.xmlbeans.XmlDecimal qualifiedUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(QUALIFIEDUNITS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(QUALIFIEDUNITS$4);
                }
                target.set(qualifiedUnits);
            }
        }
        
        /**
         * Gets the "LockedTokenId" element
         */
        public java.lang.String getLockedTokenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCKEDTOKENID$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LockedTokenId" element
         */
        public org.apache.xmlbeans.XmlString xgetLockedTokenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCKEDTOKENID$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "LockedTokenId" element
         */
        public boolean isNilLockedTokenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCKEDTOKENID$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "LockedTokenId" element
         */
        public boolean isSetLockedTokenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCKEDTOKENID$6) != 0;
            }
        }
        
        /**
         * Sets the "LockedTokenId" element
         */
        public void setLockedTokenId(java.lang.String lockedTokenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCKEDTOKENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCKEDTOKENID$6);
                }
                target.setStringValue(lockedTokenId);
            }
        }
        
        /**
         * Sets (as xml) the "LockedTokenId" element
         */
        public void xsetLockedTokenId(org.apache.xmlbeans.XmlString lockedTokenId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCKEDTOKENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCKEDTOKENID$6);
                }
                target.set(lockedTokenId);
            }
        }
        
        /**
         * Nils the "LockedTokenId" element
         */
        public void setNilLockedTokenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCKEDTOKENID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCKEDTOKENID$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "LockedTokenId" element
         */
        public void unsetLockedTokenId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCKEDTOKENID$6, 0);
            }
        }
        
        /**
         * Gets the "RewardIssued" element
         */
        public boolean getRewardIssued()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDISSUED$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "RewardIssued" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRewardIssued()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REWARDISSUED$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RewardIssued" element
         */
        public void setRewardIssued(boolean rewardIssued)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDISSUED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDISSUED$8);
                }
                target.setBooleanValue(rewardIssued);
            }
        }
        
        /**
         * Sets (as xml) the "RewardIssued" element
         */
        public void xsetRewardIssued(org.apache.xmlbeans.XmlBoolean rewardIssued)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REWARDISSUED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REWARDISSUED$8);
                }
                target.set(rewardIssued);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$10);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "RequiredUnits" attribute
         */
        public java.math.BigDecimal getRequiredUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDUNITS$12);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequiredUnits" attribute
         */
        public org.apache.xmlbeans.XmlDecimal xgetRequiredUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(REQUIREDUNITS$12);
                return target;
            }
        }
        
        /**
         * Sets the "RequiredUnits" attribute
         */
        public void setRequiredUnits(java.math.BigDecimal requiredUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDUNITS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIREDUNITS$12);
                }
                target.setBigDecimalValue(requiredUnits);
            }
        }
        
        /**
         * Sets (as xml) the "RequiredUnits" attribute
         */
        public void xsetRequiredUnits(org.apache.xmlbeans.XmlDecimal requiredUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(REQUIREDUNITS$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(REQUIREDUNITS$12);
                }
                target.set(requiredUnits);
            }
        }
        
        /**
         * Gets the "ExpirationDays" attribute
         */
        public java.math.BigDecimal getExpirationDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPIRATIONDAYS$14);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExpirationDays" attribute
         */
        public org.apache.xmlbeans.XmlDecimal xgetExpirationDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(EXPIRATIONDAYS$14);
                return target;
            }
        }
        
        /**
         * True if has "ExpirationDays" attribute
         */
        public boolean isSetExpirationDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXPIRATIONDAYS$14) != null;
            }
        }
        
        /**
         * Sets the "ExpirationDays" attribute
         */
        public void setExpirationDays(java.math.BigDecimal expirationDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPIRATIONDAYS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPIRATIONDAYS$14);
                }
                target.setBigDecimalValue(expirationDays);
            }
        }
        
        /**
         * Sets (as xml) the "ExpirationDays" attribute
         */
        public void xsetExpirationDays(org.apache.xmlbeans.XmlDecimal expirationDays)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(EXPIRATIONDAYS$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(EXPIRATIONDAYS$14);
                }
                target.set(expirationDays);
            }
        }
        
        /**
         * Unsets the "ExpirationDays" attribute
         */
        public void unsetExpirationDays()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXPIRATIONDAYS$14);
            }
        }
    }
}
