/*
 * An XML document type.
 * Localname: Header
 * Namespace: http://webservice.en.excentus.com/ENWebService/headerRequest
 * Java type: com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.enWebService.headerRequest.impl;
/**
 * A document containing one Header(@http://webservice.en.excentus.com/ENWebService/headerRequest) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://webservice.en.excentus.com/ENWebService/headerRequest", "Header");
    
    
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
     * An XML Header(@http://webservice.en.excentus.com/ENWebService/headerRequest).
     *
     * This is a complex type.
     */
    public static class HeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header
    {
        private static final long serialVersionUID = 1L;
        
        public HeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACCOUNTNO$0 = 
            new javax.xml.namespace.QName("", "AccountNo");
        private static final javax.xml.namespace.QName RETAILERID$2 = 
            new javax.xml.namespace.QName("", "RetailerId");
        private static final javax.xml.namespace.QName SITEID$4 = 
            new javax.xml.namespace.QName("", "SiteId");
        private static final javax.xml.namespace.QName DATETIME$6 = 
            new javax.xml.namespace.QName("", "DateTime");
        private static final javax.xml.namespace.QName REGISTERID$8 = 
            new javax.xml.namespace.QName("", "RegisterId");
        private static final javax.xml.namespace.QName SEQUENCENUMBER$10 = 
            new javax.xml.namespace.QName("", "SequenceNumber");
        private static final javax.xml.namespace.QName RETRY$12 = 
            new javax.xml.namespace.QName("", "Retry");
        
        
        /**
         * Gets the "AccountNo" element
         */
        public java.lang.String getAccountNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AccountNo" element
         */
        public org.apache.xmlbeans.XmlString xgetAccountNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AccountNo" element
         */
        public void setAccountNo(java.lang.String accountNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTNO$0);
                }
                target.setStringValue(accountNo);
            }
        }
        
        /**
         * Sets (as xml) the "AccountNo" element
         */
        public void xsetAccountNo(org.apache.xmlbeans.XmlString accountNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCOUNTNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCOUNTNO$0);
                }
                target.set(accountNo);
            }
        }
        
        /**
         * Gets the "RetailerId" element
         */
        public java.lang.String getRetailerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAILERID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RetailerId" element
         */
        public org.apache.xmlbeans.XmlString xgetRetailerId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAILERID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RetailerId" element
         */
        public void setRetailerId(java.lang.String retailerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETAILERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETAILERID$2);
                }
                target.setStringValue(retailerId);
            }
        }
        
        /**
         * Sets (as xml) the "RetailerId" element
         */
        public void xsetRetailerId(org.apache.xmlbeans.XmlString retailerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETAILERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETAILERID$2);
                }
                target.set(retailerId);
            }
        }
        
        /**
         * Gets the "SiteId" element
         */
        public java.lang.String getSiteId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SiteId" element
         */
        public org.apache.xmlbeans.XmlString xgetSiteId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SiteId" element
         */
        public void setSiteId(java.lang.String siteId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$4);
                }
                target.setStringValue(siteId);
            }
        }
        
        /**
         * Sets (as xml) the "SiteId" element
         */
        public void xsetSiteId(org.apache.xmlbeans.XmlString siteId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITEID$4);
                }
                target.set(siteId);
            }
        }
        
        /**
         * Gets the "DateTime" element
         */
        public java.lang.String getDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DateTime" element
         */
        public org.apache.xmlbeans.XmlString xgetDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATETIME$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DateTime" element
         */
        public void setDateTime(java.lang.String dateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIME$6);
                }
                target.setStringValue(dateTime);
            }
        }
        
        /**
         * Sets (as xml) the "DateTime" element
         */
        public void xsetDateTime(org.apache.xmlbeans.XmlString dateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATETIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATETIME$6);
                }
                target.set(dateTime);
            }
        }
        
        /**
         * Gets the "RegisterId" element
         */
        public long getRegisterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTERID$8, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "RegisterId" element
         */
        public org.apache.xmlbeans.XmlLong xgetRegisterId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(REGISTERID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RegisterId" element
         */
        public void setRegisterId(long registerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTERID$8);
                }
                target.setLongValue(registerId);
            }
        }
        
        /**
         * Sets (as xml) the "RegisterId" element
         */
        public void xsetRegisterId(org.apache.xmlbeans.XmlLong registerId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(REGISTERID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(REGISTERID$8);
                }
                target.set(registerId);
            }
        }
        
        /**
         * Gets the "SequenceNumber" element
         */
        public long getSequenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCENUMBER$10, 0);
                if (target == null)
                {
                    return 0L;
                }
                return target.getLongValue();
            }
        }
        
        /**
         * Gets (as xml) the "SequenceNumber" element
         */
        public org.apache.xmlbeans.XmlLong xgetSequenceNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SEQUENCENUMBER$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SequenceNumber" element
         */
        public void setSequenceNumber(long sequenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEQUENCENUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEQUENCENUMBER$10);
                }
                target.setLongValue(sequenceNumber);
            }
        }
        
        /**
         * Sets (as xml) the "SequenceNumber" element
         */
        public void xsetSequenceNumber(org.apache.xmlbeans.XmlLong sequenceNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLong target = null;
                target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SEQUENCENUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SEQUENCENUMBER$10);
                }
                target.set(sequenceNumber);
            }
        }
        
        /**
         * Gets the "Retry" element
         */
        public int getRetry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRY$12, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Retry" element
         */
        public org.apache.xmlbeans.XmlInt xgetRetry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRY$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Retry" element
         */
        public void setRetry(int retry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRY$12);
                }
                target.setIntValue(retry);
            }
        }
        
        /**
         * Sets (as xml) the "Retry" element
         */
        public void xsetRetry(org.apache.xmlbeans.XmlInt retry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRY$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETRY$12);
                }
                target.set(retry);
            }
        }
    }
}
