/*
 * An XML document type.
 * Localname: Item
 * Namespace: http://webservice.en.excentus.com/Items
 * Java type: com.excentus.en.webservice.items.ItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.items.impl;
/**
 * A document containing one Item(@http://webservice.en.excentus.com/Items) element.
 *
 * This is a complex type.
 */
public class ItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.items.ItemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Items", "Item");
    
    
    /**
     * Gets the "Item" element
     */
    public com.excentus.en.webservice.items.ItemDocument.Item getItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.items.ItemDocument.Item target = null;
            target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().find_element_user(ITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Item" element
     */
    public void setItem(com.excentus.en.webservice.items.ItemDocument.Item item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.items.ItemDocument.Item target = null;
            target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().find_element_user(ITEM$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().add_element_user(ITEM$0);
            }
            target.set(item);
        }
    }
    
    /**
     * Appends and returns a new empty "Item" element
     */
    public com.excentus.en.webservice.items.ItemDocument.Item addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.items.ItemDocument.Item target = null;
            target = (com.excentus.en.webservice.items.ItemDocument.Item)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    /**
     * An XML Item(@http://webservice.en.excentus.com/Items).
     *
     * This is a complex type.
     */
    public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.items.ItemDocument.Item
    {
        private static final long serialVersionUID = 1L;
        
        public ItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("", "Code");
        private static final javax.xml.namespace.QName DEPT$2 = 
            new javax.xml.namespace.QName("", "Dept");
        private static final javax.xml.namespace.QName UNITS$4 = 
            new javax.xml.namespace.QName("", "Units");
        private static final javax.xml.namespace.QName UNITTYPE$6 = 
            new javax.xml.namespace.QName("", "UnitType");
        private static final javax.xml.namespace.QName ITEMPRICE$8 = 
            new javax.xml.namespace.QName("", "ItemPrice");
        private static final javax.xml.namespace.QName TYPE$10 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "Code" element
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
                }
                target.set(code);
            }
        }
        
        /**
         * Gets the "Dept" element
         */
        public java.lang.String getDept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Dept" element
         */
        public org.apache.xmlbeans.XmlString xgetDept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "Dept" element
         */
        public boolean isSetDept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPT$2) != 0;
            }
        }
        
        /**
         * Sets the "Dept" element
         */
        public void setDept(java.lang.String dept)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPT$2);
                }
                target.setStringValue(dept);
            }
        }
        
        /**
         * Sets (as xml) the "Dept" element
         */
        public void xsetDept(org.apache.xmlbeans.XmlString dept)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPT$2);
                }
                target.set(dept);
            }
        }
        
        /**
         * Unsets the "Dept" element
         */
        public void unsetDept()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPT$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$4, 0);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITS$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITS$4);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(UNITS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(UNITS$4);
                }
                target.set(units);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITTYPE$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITTYPE$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITTYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNITTYPE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNITTYPE$6);
                }
                target.set(unitType);
            }
        }
        
        /**
         * Gets the "ItemPrice" element
         */
        public java.math.BigDecimal getItemPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMPRICE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "ItemPrice" element
         */
        public org.apache.xmlbeans.XmlDecimal xgetItemPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ITEMPRICE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ItemPrice" element
         */
        public void setItemPrice(java.math.BigDecimal itemPrice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMPRICE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEMPRICE$8);
                }
                target.setBigDecimalValue(itemPrice);
            }
        }
        
        /**
         * Sets (as xml) the "ItemPrice" element
         */
        public void xsetItemPrice(org.apache.xmlbeans.XmlDecimal itemPrice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDecimal target = null;
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(ITEMPRICE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(ITEMPRICE$8);
                }
                target.set(itemPrice);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.excentus.en.webservice.items.ItemType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    return null;
                }
                return (com.excentus.en.webservice.items.ItemType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.excentus.en.webservice.items.ItemType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemType target = null;
                target = (com.excentus.en.webservice.items.ItemType)get_store().find_attribute_user(TYPE$10);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.excentus.en.webservice.items.ItemType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.excentus.en.webservice.items.ItemType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.items.ItemType target = null;
                target = (com.excentus.en.webservice.items.ItemType)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (com.excentus.en.webservice.items.ItemType)get_store().add_attribute_user(TYPE$10);
                }
                target.set(type);
            }
        }
    }
}
