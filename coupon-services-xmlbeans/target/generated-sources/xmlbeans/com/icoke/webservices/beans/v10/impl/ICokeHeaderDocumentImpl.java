/*
 * An XML document type.
 * Localname: ICokeHeader
 * Namespace: http://beans.webservices.icoke.com/v1_0
 * Java type: com.icoke.webservices.beans.v10.ICokeHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.impl;
/**
 * A document containing one ICokeHeader(@http://beans.webservices.icoke.com/v1_0) element.
 *
 * This is a complex type.
 */
public class ICokeHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.ICokeHeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ICokeHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICOKEHEADER$0 = 
        new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0", "ICokeHeader");
    
    
    /**
     * Gets the "ICokeHeader" element
     */
    public com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader getICokeHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader target = null;
            target = (com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader)get_store().find_element_user(ICOKEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICokeHeader" element
     */
    public void setICokeHeader(com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader iCokeHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader target = null;
            target = (com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader)get_store().find_element_user(ICOKEHEADER$0, 0);
            if (target == null)
            {
                target = (com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader)get_store().add_element_user(ICOKEHEADER$0);
            }
            target.set(iCokeHeader);
        }
    }
    
    /**
     * Appends and returns a new empty "ICokeHeader" element
     */
    public com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader addNewICokeHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader target = null;
            target = (com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader)get_store().add_element_user(ICOKEHEADER$0);
            return target;
        }
    }
    /**
     * An XML ICokeHeader(@http://beans.webservices.icoke.com/v1_0).
     *
     * This is a complex type.
     */
    public static class ICokeHeaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader
    {
        private static final long serialVersionUID = 1L;
        
        public ICokeHeaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SITEID$0 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0", "siteId");
        private static final javax.xml.namespace.QName MEMBERID$2 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0", "memberId");
        private static final javax.xml.namespace.QName SESSIONID$4 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0", "sessionId");
        private static final javax.xml.namespace.QName IPADDRESS$6 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/v1_0", "ipaddress");
        
        
        /**
         * Gets the "siteId" element
         */
        public java.lang.String getSiteId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "siteId" element
         */
        public org.apache.xmlbeans.XmlString xgetSiteId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "siteId" element
         */
        public boolean isNilSiteId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "siteId" element
         */
        public void setSiteId(java.lang.String siteId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$0);
                }
                target.setStringValue(siteId);
            }
        }
        
        /**
         * Sets (as xml) the "siteId" element
         */
        public void xsetSiteId(org.apache.xmlbeans.XmlString siteId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITEID$0);
                }
                target.set(siteId);
            }
        }
        
        /**
         * Nils the "siteId" element
         */
        public void setNilSiteId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITEID$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "memberId" element
         */
        public java.lang.String getMemberId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "memberId" element
         */
        public org.apache.xmlbeans.XmlString xgetMemberId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERID$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "memberId" element
         */
        public boolean isNilMemberId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERID$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "memberId" element
         */
        public void setMemberId(java.lang.String memberId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERID$2);
                }
                target.setStringValue(memberId);
            }
        }
        
        /**
         * Sets (as xml) the "memberId" element
         */
        public void xsetMemberId(org.apache.xmlbeans.XmlString memberId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERID$2);
                }
                target.set(memberId);
            }
        }
        
        /**
         * Nils the "memberId" element
         */
        public void setNilMemberId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERID$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "sessionId" element
         */
        public java.lang.String getSessionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sessionId" element
         */
        public org.apache.xmlbeans.XmlString xgetSessionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "sessionId" element
         */
        public boolean isNilSessionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "sessionId" element
         */
        public void setSessionId(java.lang.String sessionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONID$4);
                }
                target.setStringValue(sessionId);
            }
        }
        
        /**
         * Sets (as xml) the "sessionId" element
         */
        public void xsetSessionId(org.apache.xmlbeans.XmlString sessionId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONID$4);
                }
                target.set(sessionId);
            }
        }
        
        /**
         * Nils the "sessionId" element
         */
        public void setNilSessionId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONID$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "ipaddress" element
         */
        public java.lang.String getIpaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ipaddress" element
         */
        public org.apache.xmlbeans.XmlString xgetIpaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "ipaddress" element
         */
        public boolean isNilIpaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "ipaddress" element
         */
        public void setIpaddress(java.lang.String ipaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPADDRESS$6);
                }
                target.setStringValue(ipaddress);
            }
        }
        
        /**
         * Sets (as xml) the "ipaddress" element
         */
        public void xsetIpaddress(org.apache.xmlbeans.XmlString ipaddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPADDRESS$6);
                }
                target.set(ipaddress);
            }
        }
        
        /**
         * Nils the "ipaddress" element
         */
        public void setNilIpaddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPADDRESS$6);
                }
                target.setNil();
            }
        }
    }
}
