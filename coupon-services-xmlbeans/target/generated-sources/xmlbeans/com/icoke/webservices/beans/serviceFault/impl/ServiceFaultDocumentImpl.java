/*
 * An XML document type.
 * Localname: ServiceFault
 * Namespace: http://beans.webservices.icoke.com/ServiceFault
 * Java type: com.icoke.webservices.beans.serviceFault.ServiceFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.serviceFault.impl;
/**
 * A document containing one ServiceFault(@http://beans.webservices.icoke.com/ServiceFault) element.
 *
 * This is a complex type.
 */
public class ServiceFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.serviceFault.ServiceFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEFAULT$0 = 
        new javax.xml.namespace.QName("http://beans.webservices.icoke.com/ServiceFault", "ServiceFault");
    
    
    /**
     * Gets the "ServiceFault" element
     */
    public com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault getServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault target = null;
            target = (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault)get_store().find_element_user(SERVICEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceFault" element
     */
    public void setServiceFault(com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault serviceFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault target = null;
            target = (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault)get_store().find_element_user(SERVICEFAULT$0, 0);
            if (target == null)
            {
                target = (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault)get_store().add_element_user(SERVICEFAULT$0);
            }
            target.set(serviceFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceFault" element
     */
    public com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault addNewServiceFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault target = null;
            target = (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault)get_store().add_element_user(SERVICEFAULT$0);
            return target;
        }
    }
    /**
     * An XML ServiceFault(@http://beans.webservices.icoke.com/ServiceFault).
     *
     * This is a complex type.
     */
    public static class ServiceFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceFaultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERRORCODE$0 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/ServiceFault", "errorCode");
        private static final javax.xml.namespace.QName ERRORDESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://beans.webservices.icoke.com/ServiceFault", "errorDescription");
        
        
        /**
         * Gets the "errorCode" element
         */
        public int getErrorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "errorCode" element
         */
        public org.apache.xmlbeans.XmlInt xgetErrorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "errorCode" element
         */
        public boolean isSetErrorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORCODE$0) != 0;
            }
        }
        
        /**
         * Sets the "errorCode" element
         */
        public void setErrorCode(int errorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$0);
                }
                target.setIntValue(errorCode);
            }
        }
        
        /**
         * Sets (as xml) the "errorCode" element
         */
        public void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRORCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRORCODE$0);
                }
                target.set(errorCode);
            }
        }
        
        /**
         * Unsets the "errorCode" element
         */
        public void unsetErrorCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORCODE$0, 0);
            }
        }
        
        /**
         * Gets the "errorDescription" element
         */
        public java.lang.String getErrorDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "errorDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetErrorDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "errorDescription" element
         */
        public boolean isSetErrorDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORDESCRIPTION$2) != 0;
            }
        }
        
        /**
         * Sets the "errorDescription" element
         */
        public void setErrorDescription(java.lang.String errorDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESCRIPTION$2);
                }
                target.setStringValue(errorDescription);
            }
        }
        
        /**
         * Sets (as xml) the "errorDescription" element
         */
        public void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESCRIPTION$2);
                }
                target.set(errorDescription);
            }
        }
        
        /**
         * Unsets the "errorDescription" element
         */
        public void unsetErrorDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORDESCRIPTION$2, 0);
            }
        }
    }
}
