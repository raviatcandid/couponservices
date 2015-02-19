/*
 * An XML document type.
 * Localname: Limit
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.LimitDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers.impl;
/**
 * A document containing one Limit(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public class LimitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.LimitDocument
{
    private static final long serialVersionUID = 1L;
    
    public LimitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMIT$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Offers", "Limit");
    
    
    /**
     * Gets the "Limit" element
     */
    public com.excentus.en.webservice.offers.LimitDocument.Limit getLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.LimitDocument.Limit target = null;
            target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().find_element_user(LIMIT$0, 0);
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
    public void setLimit(com.excentus.en.webservice.offers.LimitDocument.Limit limit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.offers.LimitDocument.Limit target = null;
            target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().find_element_user(LIMIT$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().add_element_user(LIMIT$0);
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
            target = (com.excentus.en.webservice.offers.LimitDocument.Limit)get_store().add_element_user(LIMIT$0);
            return target;
        }
    }
    /**
     * An XML Limit(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public static class LimitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.offers.LimitDocument.Limit
    {
        private static final long serialVersionUID = 1L;
        
        public LimitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "Type");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "Value");
        
        
        /**
         * Gets the "Type" element
         */
        public java.lang.String getType()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" element
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Type" element
         */
        public void setType(java.lang.String type)
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
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "Value" element
         */
        public java.math.BigDecimal getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
