/*
 * An XML document type.
 * Localname: OfferDetails
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OfferDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one OfferDetails(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class OfferDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.OfferDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfferDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERDETAILS$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "OfferDetails");
    
    
    /**
     * Gets the "OfferDetails" element
     */
    public com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails getOfferDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails target = null;
            target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().find_element_user(OFFERDETAILS$0, 0);
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
            target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().find_element_user(OFFERDETAILS$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().add_element_user(OFFERDETAILS$0);
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
            target = (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails)get_store().add_element_user(OFFERDETAILS$0);
            return target;
        }
    }
    /**
     * An XML OfferDetails(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class OfferDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails
    {
        private static final long serialVersionUID = 1L;
        
        public OfferDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName CODE$2 = 
            new javax.xml.namespace.QName("", "Code");
        private static final javax.xml.namespace.QName UNITTYPE$4 = 
            new javax.xml.namespace.QName("", "UnitType");
        private static final javax.xml.namespace.QName UNITS$6 = 
            new javax.xml.namespace.QName("", "Units");
        private static final javax.xml.namespace.QName GROUPCODE$8 = 
            new javax.xml.namespace.QName("", "GroupCode");
        private static final javax.xml.namespace.QName UNITSQUALIFIED$10 = 
            new javax.xml.namespace.QName("", "UnitsQualified");
        
        
        /**
         * Gets the "Type" element
         */
        public com.excentus.en.webservice.offers.OfferDetailType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.excentus.en.webservice.offers.OfferDetailType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" element
         */
        public com.excentus.en.webservice.offers.OfferDetailType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDetailType target = null;
                target = (com.excentus.en.webservice.offers.OfferDetailType)get_store().find_element_user(TYPE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Type" element
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "Type" element
         */
        public void setType(com.excentus.en.webservice.offers.OfferDetailType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" element
         */
        public void xsetType(com.excentus.en.webservice.offers.OfferDetailType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.offers.OfferDetailType target = null;
                target = (com.excentus.en.webservice.offers.OfferDetailType)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.offers.OfferDetailType)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" element
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, 0);
            }
        }
        
        /**
         * Gets the "Code" element
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Code" element
         */
        public org.apache.xmlbeans.XmlString xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Code" element
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "Code" element
         */
        public void xsetCode(org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
                }
                target.set(code);
            }
        }
        
        /**
         * Gets the "UnitType" element
         */
        public java.lang.String getUnitType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "UnitType" element
         */
        public org.apache.xmlbeans.XmlString xgetUnitType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UnitType" element
         */
        public void setUnitType(java.lang.String unitType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITTYPE$4);
                }
                target.setStringValue(unitType);
            }
        }
        
        /**
         * Sets (as xml) the "UnitType" element
         */
        public void xsetUnitType(org.apache.xmlbeans.XmlString unitType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNITTYPE$4);
                }
                target.set(unitType);
            }
        }
        
        /**
         * Gets the "Units" element
         */
        public java.math.BigDecimal getUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "Units" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Units" element
         */
        public void setUnits(java.math.BigDecimal units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITS$6);
                }
                target.setBigDecimalValue(units);
            }
        }
        
        /**
         * Sets (as xml) the "Units" element
         */
        public void xsetUnits(org.apache.xmlbeans.XmlDecimal units)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UNITS$6);
                }
                target.set(units);
            }
        }
        
        /**
         * Gets the "GroupCode" element
         */
        public java.lang.String getGroupCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GroupCode" element
         */
        public org.apache.xmlbeans.XmlString xgetGroupCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCODE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "GroupCode" element
         */
        public boolean isSetGroupCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPCODE$8) != 0;
            }
        }
        
        /**
         * Sets the "GroupCode" element
         */
        public void setGroupCode(java.lang.String groupCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPCODE$8);
                }
                target.setStringValue(groupCode);
            }
        }
        
        /**
         * Sets (as xml) the "GroupCode" element
         */
        public void xsetGroupCode(org.apache.xmlbeans.XmlString groupCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPCODE$8);
                }
                target.set(groupCode);
            }
        }
        
        /**
         * Unsets the "GroupCode" element
         */
        public void unsetGroupCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPCODE$8, 0);
            }
        }
        
        /**
         * Gets the "UnitsQualified" element
         */
        public java.math.BigDecimal getUnitsQualified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITSQUALIFIED$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "UnitsQualified" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetUnitsQualified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITSQUALIFIED$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "UnitsQualified" element
         */
        public boolean isSetUnitsQualified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITSQUALIFIED$10) != 0;
            }
        }
        
        /**
         * Sets the "UnitsQualified" element
         */
        public void setUnitsQualified(java.math.BigDecimal unitsQualified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITSQUALIFIED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITSQUALIFIED$10);
                }
                target.setBigDecimalValue(unitsQualified);
            }
        }
        
        /**
         * Sets (as xml) the "UnitsQualified" element
         */
        public void xsetUnitsQualified(org.apache.xmlbeans.XmlDecimal unitsQualified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITSQUALIFIED$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UNITSQUALIFIED$10);
                }
                target.set(unitsQualified);
            }
        }
        
        /**
         * Unsets the "UnitsQualified" element
         */
        public void unsetUnitsQualified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITSQUALIFIED$10, 0);
            }
        }
    }
}
