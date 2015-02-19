/*
 * An XML document type.
 * Localname: ErrorDesc
 * Namespace: http://error.webservice.en.excentus.com/ENWebService/error
 * Java type: com.excentus.en.webservice.error.enWebService.error.ErrorDescDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.error.enWebService.error.impl;
/**
 * A document containing one ErrorDesc(@http://error.webservice.en.excentus.com/ENWebService/error) element.
 *
 * This is a complex type.
 */
public class ErrorDescDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.error.enWebService.error.ErrorDescDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDescDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORDESC$0 = 
        new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "ErrorDesc");
    
    
    /**
     * Gets the "ErrorDesc" element
     */
    public java.lang.String getErrorDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESC$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESC$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESC$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESC$0);
            }
            target.set(errorDesc);
        }
    }
}
