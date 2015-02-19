/*
 * An XML document type.
 * Localname: Errors
 * Namespace: http://error.webservice.en.excentus.com/ENWebService/error
 * Java type: com.excentus.en.webservice.error.enWebService.error.ErrorsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.error.enWebService.error.impl;
/**
 * A document containing one Errors(@http://error.webservice.en.excentus.com/ENWebService/error) element.
 *
 * This is a complex type.
 */
public class ErrorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.error.enWebService.error.ErrorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORS$0 = 
        new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "Errors");
    
    
    /**
     * Gets the "Errors" element
     */
    public com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors target = null;
            target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Errors" element
     */
    public void setErrors(com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors target = null;
            target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$0);
            }
            target.set(errors);
        }
    }
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    public com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors target = null;
            target = (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$0);
            return target;
        }
    }
    /**
     * An XML Errors(@http://error.webservice.en.excentus.com/ENWebService/error).
     *
     * This is a complex type.
     */
    public static class ErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors
    {
        private static final long serialVersionUID = 1L;
        
        public ErrorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERROR$0 = 
            new javax.xml.namespace.QName("http://error.webservice.en.excentus.com/ENWebService/error", "Error");
        
        
        /**
         * Gets array of all "Error" elements
         */
        public com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error[] getErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ERROR$0, targetList);
                com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error[] result = new com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Error" element
         */
        public com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error getErrorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error target = null;
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().find_element_user(ERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Error" element
         */
        public int sizeOfErrorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERROR$0);
            }
        }
        
        /**
         * Sets array of all "Error" element
         */
        public void setErrorArray(com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error[] errorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(errorArray, ERROR$0);
            }
        }
        
        /**
         * Sets ith "Error" element
         */
        public void setErrorArray(int i, com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error error)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error target = null;
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().find_element_user(ERROR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(error);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Error" element
         */
        public com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error insertNewError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error target = null;
                target = (com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error)get_store().insert_element_user(ERROR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Error" element
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
         * Removes the ith "Error" element
         */
        public void removeError(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERROR$0, i);
            }
        }
    }
}
