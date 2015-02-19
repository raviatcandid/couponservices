/*
 * An XML document type.
 * Localname: Offer
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one Offer(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class OfferDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.OfferDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFER$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Offer");
    
    
    /**
     * Gets the "Offer" element
     */
    public com.excentus.en.webservice.offers.OfferDocument.Offer getOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
            target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().find_element_user(OFFER$0, 0);
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
    public void setOffer(com.excentus.en.webservice.offers.OfferDocument.Offer offer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
            target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().find_element_user(OFFER$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().add_element_user(OFFER$0);
            }
            target.set(offer);
        }
    }
    
    /**
     * Appends and returns a new empty "Offer" element
     */
    public com.excentus.en.webservice.offers.OfferDocument.Offer addNewOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OfferDocument.Offer target = null;
            target = (com.excentus.en.webservice.offers.OfferDocument.Offer)get_store().add_element_user(OFFER$0);
            return target;
        }
    }
    /**
     * An XML Offer(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class OfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.OfferDocument.Offer
    {
        private static final long serialVersionUID = 1L;
        
        public OfferImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFERDESC$0 = 
            new javax.xml.namespace.QName("", "OfferDesc");
        private static final javax.xml.namespace.QName STARTDATE$2 = 
            new javax.xml.namespace.QName("", "StartDate");
        private static final javax.xml.namespace.QName ENDDATE$4 = 
            new javax.xml.namespace.QName("", "EndDate");
        private static final javax.xml.namespace.QName SPONSOR$6 = 
            new javax.xml.namespace.QName("", "Sponsor");
        private static final javax.xml.namespace.QName MAX$8 = 
            new javax.xml.namespace.QName("", "Max");
        private static final javax.xml.namespace.QName OFFERDETAILS$10 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "OfferDetails");
        private static final javax.xml.namespace.QName REWARDS$12 = 
            new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Rewards");
        private static final javax.xml.namespace.QName ID$14 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TYPE$16 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "OfferDesc" element
         */
        public java.lang.String getOfferDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OfferDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetOfferDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESC$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OfferDesc" element
         */
        public void setOfferDesc(java.lang.String offerDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERDESC$0);
                }
                target.setStringValue(offerDesc);
            }
        }
        
        /**
         * Sets (as xml) the "OfferDesc" element
         */
        public void xsetOfferDesc(org.apache.xmlbeans.XmlString offerDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERDESC$0);
                }
                target.set(offerDesc);
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
         * Gets the "Sponsor" element
         */
        public java.lang.String getSponsor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPONSOR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Sponsor" element
         */
        public org.apache.xmlbeans.XmlString xgetSponsor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPONSOR$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Sponsor" element
         */
        public void setSponsor(java.lang.String sponsor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPONSOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPONSOR$6);
                }
                target.setStringValue(sponsor);
            }
        }
        
        /**
         * Sets (as xml) the "Sponsor" element
         */
        public void xsetSponsor(org.apache.xmlbeans.XmlString sponsor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPONSOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPONSOR$6);
                }
                target.set(sponsor);
            }
        }
        
        /**
         * Gets the "Max" element
         */
        public java.math.BigDecimal getMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "Max" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MAX$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "Max" element
         */
        public boolean isSetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAX$8) != 0;
            }
        }
        
        /**
         * Sets the "Max" element
         */
        public void setMax(java.math.BigDecimal max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAX$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAX$8);
                }
                target.setBigDecimalValue(max);
            }
        }
        
        /**
         * Sets (as xml) the "Max" element
         */
        public void xsetMax(org.apache.xmlbeans.XmlDecimal max)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(MAX$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(MAX$8);
                }
                target.set(max);
            }
        }
        
        /**
         * Unsets the "Max" element
         */
        public void unsetMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAX$8, 0);
            }
        }
        
        /**
         * Gets the "OfferDetails" element
         */
        public com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails getOfferDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails target = null;
                target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().find_element_user(OFFERDETAILS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OfferDetails" element
         */
        public void setOfferDetails(com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails offerDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails target = null;
                target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().find_element_user(OFFERDETAILS$10, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().add_element_user(OFFERDETAILS$10);
                }
                target.set(offerDetails);
            }
        }
        
        /**
         * Appends and returns a new empty "OfferDetails" element
         */
        public com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails addNewOfferDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails target = null;
                target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().add_element_user(OFFERDETAILS$10);
                return target;
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
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().find_element_user(REWARDS$12, 0);
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
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().find_element_user(REWARDS$12, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().add_element_user(REWARDS$12);
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
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().add_element_user(REWARDS$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$14);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.excentus.en.webservice.offers.OfferType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$16);
                if (target == null)
                {
                    return null;
                }
                return (com.excentus.en.webservice.offers.OfferType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.excentus.en.webservice.offers.OfferType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferType target = null;
                target = (com.excentus.en.webservice.offers.OfferType)get_store().find_attribute_user(TYPE$16);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.excentus.en.webservice.offers.OfferType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$16);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.excentus.en.webservice.offers.OfferType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferType target = null;
                target = (com.excentus.en.webservice.offers.OfferType)get_store().find_attribute_user(TYPE$16);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.OfferType)get_store().add_attribute_user(TYPE$16);
                }
                target.set(type);
            }
        }
    }
}
