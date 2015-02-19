/*
 * An XML document type.
 * Localname: Tenders
 * Namespace: http://webservice.en.excentus.com/Tenders
 * Java type: com.excentus.en.webservice.tenders.TendersDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.tenders.impl;
/**
 * A document containing one Tenders(@http://webservice.en.excentus.com/Tenders) element.
 *
 * This is a complex type.
 */
public class TendersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.tenders.TendersDocument
{
    private static final long serialVersionUID = 1L;
    
    public TendersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TENDERS$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/Tenders", "Tenders");
    
    
    /**
     * Gets the "Tenders" element
     */
    public com.excentus.en.webservice.tenders.TendersDocument.Tenders getTenders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.tenders.TendersDocument.Tenders target = null;
            target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().find_element_user(TENDERS$0, 0);
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
            target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().find_element_user(TENDERS$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().add_element_user(TENDERS$0);
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
            target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders)get_store().add_element_user(TENDERS$0);
            return target;
        }
    }
    /**
     * An XML Tenders(@http://webservice.en.excentus.com/Tenders).
     *
     * This is a complex type.
     */
    public static class TendersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.tenders.TendersDocument.Tenders
    {
        private static final long serialVersionUID = 1L;
        
        public TendersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TENDER$0 = 
            new javax.xml.namespace.QName("", "Tender");
        
        
        /**
         * Gets array of all "Tender" elements
         */
        public com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender[] getTenderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TENDER$0, targetList);
                com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender[] result = new com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Tender" element
         */
        public com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender getTenderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender target = null;
                target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender)get_store().find_element_user(TENDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Tender" element
         */
        public int sizeOfTenderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TENDER$0);
            }
        }
        
        /**
         * Sets array of all "Tender" element
         */
        public void setTenderArray(com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender[] tenderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(tenderArray, TENDER$0);
            }
        }
        
        /**
         * Sets ith "Tender" element
         */
        public void setTenderArray(int i, com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender tender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender target = null;
                target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender)get_store().find_element_user(TENDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tender);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Tender" element
         */
        public com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender insertNewTender(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender target = null;
                target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender)get_store().insert_element_user(TENDER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Tender" element
         */
        public com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender addNewTender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender target = null;
                target = (com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender)get_store().add_element_user(TENDER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Tender" element
         */
        public void removeTender(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TENDER$0, i);
            }
        }
        /**
         * An XML Tender(@).
         *
         * This is a complex type.
         */
        public static class TenderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender
        {
            private static final long serialVersionUID = 1L;
            
            public TenderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("", "Type");
            private static final javax.xml.namespace.QName CARDTYPE$2 = 
                new javax.xml.namespace.QName("", "CardType");
            private static final javax.xml.namespace.QName AMOUNT$4 = 
                new javax.xml.namespace.QName("", "Amount");
            
            
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
             * Gets the "CardType" element
             */
            public java.lang.String getCardType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDTYPE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "CardType" element
             */
            public org.apache.xmlbeans.XmlString xgetCardType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDTYPE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "CardType" element
             */
            public void setCardType(java.lang.String cardType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDTYPE$2);
                    }
                    target.setStringValue(cardType);
                }
            }
            
            /**
             * Sets (as xml) the "CardType" element
             */
            public void xsetCardType(org.apache.xmlbeans.XmlString cardType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDTYPE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARDTYPE$2);
                    }
                    target.set(cardType);
                }
            }
            
            /**
             * Gets the "Amount" element
             */
            public java.math.BigDecimal getAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "Amount" element
             */
            public org.apache.xmlbeans.XmlDecimal xgetAmount()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(AMOUNT$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Amount" element
             */
            public void setAmount(java.math.BigDecimal amount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$4);
                    }
                    target.setBigDecimalValue(amount);
                }
            }
            
            /**
             * Sets (as xml) the "Amount" element
             */
            public void xsetAmount(org.apache.xmlbeans.XmlDecimal amount)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDecimal target = null;
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(AMOUNT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(AMOUNT$4);
                    }
                    target.set(amount);
                }
            }
        }
    }
}
