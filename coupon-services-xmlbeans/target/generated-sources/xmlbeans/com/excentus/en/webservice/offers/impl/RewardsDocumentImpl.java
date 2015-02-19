/*
 * An XML document type.
 * Localname: Rewards
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.RewardsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one Rewards(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class RewardsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.RewardsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RewardsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REWARDS$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Rewards");
    
    
    /**
     * Gets the "Rewards" element
     */
    public com.excentus.en.webservice.offers.RewardsDocument.Rewards getRewards()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.RewardsDocument.Rewards target = null;
            target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().find_element_user(REWARDS$0, 0);
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
            target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().find_element_user(REWARDS$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().add_element_user(REWARDS$0);
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
            target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards)get_store().add_element_user(REWARDS$0);
            return target;
        }
    }
    /**
     * An XML Rewards(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class RewardsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.RewardsDocument.Rewards
    {
        private static final long serialVersionUID = 1L;
        
        public RewardsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REWARD$0 = 
            new javax.xml.namespace.QName("", "Reward");
        
        
        /**
         * Gets array of all "Reward" elements
         */
        public com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward[] getRewardArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REWARD$0, targetList);
                com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward[] result = new com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Reward" element
         */
        public com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward getRewardArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward)get_store().find_element_user(REWARD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Reward" element
         */
        public int sizeOfRewardArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REWARD$0);
            }
        }
        
        /**
         * Sets array of all "Reward" element
         */
        public void setRewardArray(com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward[] rewardArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(rewardArray, REWARD$0);
            }
        }
        
        /**
         * Sets ith "Reward" element
         */
        public void setRewardArray(int i, com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward reward)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward)get_store().find_element_user(REWARD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reward);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Reward" element
         */
        public com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward insertNewReward(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward)get_store().insert_element_user(REWARD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Reward" element
         */
        public com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward addNewReward()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward target = null;
                target = (com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward)get_store().add_element_user(REWARD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Reward" element
         */
        public void removeReward(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REWARD$0, i);
            }
        }
        /**
         * An XML Reward(@).
         *
         * This is a complex type.
         */
        public static class RewardImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward
        {
            private static final long serialVersionUID = 1L;
            
            public RewardImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALUE$0 = 
                new javax.xml.namespace.QName("", "Value");
            private static final javax.xml.namespace.QName SPONSOR$2 = 
                new javax.xml.namespace.QName("", "Sponsor");
            private static final javax.xml.namespace.QName EXPIRATIONDATE$4 = 
                new javax.xml.namespace.QName("", "ExpirationDate");
            private static final javax.xml.namespace.QName REWARDISSUED$6 = 
                new javax.xml.namespace.QName("", "RewardIssued");
            private static final javax.xml.namespace.QName REWARDUNITS$8 = 
                new javax.xml.namespace.QName("", "RewardUnits");
            private static final javax.xml.namespace.QName LIMIT$10 = 
                new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Limit");
            private static final javax.xml.namespace.QName ID$12 = 
                new javax.xml.namespace.QName("", "id");
            private static final javax.xml.namespace.QName TYPE$14 = 
                new javax.xml.namespace.QName("", "type");
            
            
            /**
             * Gets the "Value" element
             */
            public java.math.BigDecimal getValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "Value" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Value" element
             */
            public void setValue(java.math.BigDecimal value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
                    }
                    target.setBigDecimalValue(value);
                }
            }
            
            /**
             * Sets (as xml) the "Value" element
             */
            public void xsetValue(org.apache.xmlbeans.XmlDecimal value)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUE$0);
                    }
                    target.set(value);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPONSOR$2, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPONSOR$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Sponsor" element
             */
            public boolean isSetSponsor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPONSOR$2) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPONSOR$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPONSOR$2);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPONSOR$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPONSOR$2);
                    }
                    target.set(sponsor);
                }
            }
            
            /**
             * Unsets the "Sponsor" element
             */
            public void unsetSponsor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPONSOR$2, 0);
                }
            }
            
            /**
             * Gets the "ExpirationDate" element
             */
            public java.lang.String getExpirationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ExpirationDate" element
             */
            public org.apache.xmlbeans.XmlString xgetExpirationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ExpirationDate" element
             */
            public boolean isSetExpirationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXPIRATIONDATE$4) != 0;
                }
            }
            
            /**
             * Sets the "ExpirationDate" element
             */
            public void setExpirationDate(java.lang.String expirationDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$4);
                    }
                    target.setStringValue(expirationDate);
                }
            }
            
            /**
             * Sets (as xml) the "ExpirationDate" element
             */
            public void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$4);
                    }
                    target.set(expirationDate);
                }
            }
            
            /**
             * Unsets the "ExpirationDate" element
             */
            public void unsetExpirationDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXPIRATIONDATE$4, 0);
                }
            }
            
            /**
             * Gets the "RewardIssued" element
             */
            public java.math.BigDecimal getRewardIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDISSUED$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "RewardIssued" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetRewardIssued()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDISSUED$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RewardIssued" element
             */
            public void setRewardIssued(java.math.BigDecimal rewardIssued)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDISSUED$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDISSUED$6);
                    }
                    target.setBigDecimalValue(rewardIssued);
                }
            }
            
            /**
             * Sets (as xml) the "RewardIssued" element
             */
            public void xsetRewardIssued(org.apache.xmlbeans.XmlDecimal rewardIssued)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDISSUED$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(REWARDISSUED$6);
                    }
                    target.set(rewardIssued);
                }
            }
            
            /**
             * Gets the "RewardUnits" element
             */
            public java.math.BigDecimal getRewardUnits()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDUNITS$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "RewardUnits" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetRewardUnits()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDUNITS$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RewardUnits" element
             */
            public void setRewardUnits(java.math.BigDecimal rewardUnits)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REWARDUNITS$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REWARDUNITS$8);
                    }
                    target.setBigDecimalValue(rewardUnits);
                }
            }
            
            /**
             * Sets (as xml) the "RewardUnits" element
             */
            public void xsetRewardUnits(org.apache.xmlbeans.XmlDecimal rewardUnits)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(REWARDUNITS$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(REWARDUNITS$8);
                    }
                    target.set(rewardUnits);
                }
            }
            
            /**
             * Gets the "Limit" element
             */
            public com.excentus.en.webservice.offers.LimitDocument.Limit getLimit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.offers.LimitDocument.Limit target = null;
                    target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().find_element_user(LIMIT$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Limit" element
             */
            public boolean isSetLimit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LIMIT$10) != 0;
                }
            }
            
            /**
             * Sets the "Limit" element
             */
            public void setLimit(com.excentus.en.webservice.offers.LimitDocument.Limit limit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.offers.LimitDocument.Limit target = null;
                    target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().find_element_user(LIMIT$10, 0);
                    if (target == null)
                    {
                      target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().add_element_user(LIMIT$10);
                    }
                    target.set(limit);
                }
            }
            
            /**
             * Appends and returns a new empty "Limit" element
             */
            public com.excentus.en.webservice.offers.LimitDocument.Limit addNewLimit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.offers.LimitDocument.Limit target = null;
                    target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().add_element_user(LIMIT$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "Limit" element
             */
            public void unsetLimit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LIMIT$10, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$12);
                    }
                    target.set(id);
                }
            }
            
            /**
             * Gets the "type" attribute
             */
            public com.excentus.en.webservice.offers.RewardType.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return (com.excentus.en.webservice.offers.RewardType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public com.excentus.en.webservice.offers.RewardType xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.offers.RewardType target = null;
                    target = (com.excentus.en.webservice.offers.RewardType)get_store().find_attribute_user(TYPE$14);
                    return target;
                }
            }
            
            /**
             * Sets the "type" attribute
             */
            public void setType(com.excentus.en.webservice.offers.RewardType.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$14);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(com.excentus.en.webservice.offers.RewardType type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.excentus.en.webservice.offers.RewardType target = null;
                    target = (com.excentus.en.webservice.offers.RewardType)get_store().find_attribute_user(TYPE$14);
                    if (target == null)
                    {
                      target = (com.excentus.en.webservice.offers.RewardType)get_store().add_attribute_user(TYPE$14);
                    }
                    target.set(type);
                }
            }
        }
    }
}
