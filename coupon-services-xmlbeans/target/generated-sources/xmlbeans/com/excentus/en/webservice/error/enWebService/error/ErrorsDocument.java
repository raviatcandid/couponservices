/*
 * An XML document type.
 * Localname: Errors
 * Namespace: http://error.webservice.en.excentus.com/ENWebService/error
 * Java type: com.excentus.en.webservice.error.enWebService.error.ErrorsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.error.enWebService.error;


/**
 * A document containing one Errors(@http://error.webservice.en.excentus.com/ENWebService/error) element.
 *
 * This is a complex type.
 */
public interface ErrorsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("errorsc8d2doctype");
    
    /**
     * Gets the "Errors" element
     */
    com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors getErrors();
    
    /**
     * Sets the "Errors" element
     */
    void setErrors(com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors errors);
    
    /**
     * Appends and returns a new empty "Errors" element
     */
    com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors addNewErrors();
    
    /**
     * An XML Errors(@http://error.webservice.en.excentus.com/ENWebService/error).
     *
     * This is a complex type.
     */
    public interface Errors extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("errors3779elemtype");
        
        /**
         * Gets array of all "Error" elements
         */
        com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error[] getErrorArray();
        
        /**
         * Gets ith "Error" element
         */
        com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error getErrorArray(int i);
        
        /**
         * Returns number of "Error" element
         */
        int sizeOfErrorArray();
        
        /**
         * Sets array of all "Error" element
         */
        void setErrorArray(com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error[] errorArray);
        
        /**
         * Sets ith "Error" element
         */
        void setErrorArray(int i, com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error error);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Error" element
         */
        com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error insertNewError(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Error" element
         */
        com.excentus.en.webservice.error.enWebService.error.ErrorDocument.Error addNewError();
        
        /**
         * Removes the ith "Error" element
         */
        void removeError(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors newInstance() {
              return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument newInstance() {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
