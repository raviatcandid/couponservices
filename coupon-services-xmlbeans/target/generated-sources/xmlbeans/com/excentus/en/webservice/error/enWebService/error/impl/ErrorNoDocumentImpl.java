/*
 * An XML document type.
 * Localname: ErrorNo
 * Namespace: http://error.webservice.en.excentus.com/ENWebService/error
 * Java type: com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.error.enWebService.error.impl;
/**
 * A document containing one ErrorNo(@http://error.webservice.en.excentus.com/ENWebService/error) element.
 *
 * This is a complex type.
 */
public class ErrorNoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorNoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORNO$0 = 
        new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "ErrorNo");
    
    
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
}
