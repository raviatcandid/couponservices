/*
 * An XML document type.
 * Localname: Error
 * Namespace: http://error.webservice.en.excentus.com/ENWebService/error
 * Java type: com.excentus.en.webservice.error.enWebService.error.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.error.enWebService.error.impl;
/**
 * A document containing one Error(@http://error.webservice.en.excentus.com/ENWebService/error) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.error.enWebService.error.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "Error");
    
    
    /**
     * Gets the "Error" element
     */
    public com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error target = null;
            target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error target = null;
            target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error target = null;
            target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    /**
     * An XML Error(@http://error.webservice.en.excentus.com/ENWebService/error).
     *
     * This is a complex type.
     */
    public static class ErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error
    {
        private static final long serialVersionUID = 1L;
        
        public ErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERRORNO$0 = 
            new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "ErrorNo");
        private static final javax.xml.namespace.QName ERRORDESC$2 = 
            new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "ErrorDesc");
        
        
        /**
         * Gets the "ErrorNo" element
         */
        public java.lang.String getErrorNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ErrorNo" element
         */
        public org.apache.xmlbeans.XmlString xgetErrorNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORNO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ErrorNo" element
         */
        public void setErrorNo(java.lang.String errorNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORNO$0);
                }
                target.setStringValue(errorNo);
            }
        }
        
        /**
         * Sets (as xml) the "ErrorNo" element
         */
        public void xsetErrorNo(org.apache.xmlbeans.XmlString errorNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORNO$0);
                }
                target.set(errorNo);
            }
        }
        
        /**
         * Gets the "ErrorDesc" element
         */
        public java.lang.String getErrorDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESC$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ErrorDesc" element
         */
        public org.apache.xmlbeans.XmlString xgetErrorDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESC$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ErrorDesc" element
         */
        public void setErrorDesc(java.lang.String errorDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESC$2);
                }
                target.setStringValue(errorDesc);
            }
        }
        
        /**
         * Sets (as xml) the "ErrorDesc" element
         */
        public void xsetErrorDesc(org.apache.xmlbeans.XmlString errorDesc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESC$2);
                }
                target.set(errorDesc);
            }
        }
    }
}
