/*
 * An XML document type.
 * Localname: Header
 * Namespace: http://webservice.en.excentus.com/ENWebService/headerRequest
 * Java type: com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.enWebService.headerRequest;


/**
 * A document containing one Header(@http://webservice.en.excentus.com/ENWebService/headerRequest) element.
 *
 * This is a complex type.
 */
public interface HeaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("header5710doctype");
    
    /**
     * Gets the "Header" element
     */
    com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header getHeader();
    
    /**
     * Sets the "Header" element
     */
    void setHeader(com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header header);
    
    /**
     * Appends and returns a new empty "Header" element
     */
    com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header addNewHeader();
    
    /**
     * An XML Header(@http://webservice.en.excentus.com/ENWebService/headerRequest).
     *
     * This is a complex type.
     */
    public interface Header extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Header.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("headerb999elemtype");
        
        /**
         * Gets the "AccountNo" element
         */
        java.lang.String getAccountNo();
        
        /**
         * Gets (as xml) the "AccountNo" element
         */
        org.apache.xmlbeans.XmlString xgetAccountNo();
        
        /**
         * Sets the "AccountNo" element
         */
        void setAccountNo(java.lang.String accountNo);
        
        /**
         * Sets (as xml) the "AccountNo" element
         */
        void xsetAccountNo(org.apache.xmlbeans.XmlString accountNo);
        
        /**
         * Gets the "RetailerId" element
         */
        java.lang.String getRetailerId();
        
        /**
         * Gets (as xml) the "RetailerId" element
         */
        org.apache.xmlbeans.XmlString xgetRetailerId();
        
        /**
         * Sets the "RetailerId" element
         */
        void setRetailerId(java.lang.String retailerId);
        
        /**
         * Sets (as xml) the "RetailerId" element
         */
        void xsetRetailerId(org.apache.xmlbeans.XmlString retailerId);
        
        /**
         * Gets the "SiteId" element
         */
        java.lang.String getSiteId();
        
        /**
         * Gets (as xml) the "SiteId" element
         */
        org.apache.xmlbeans.XmlString xgetSiteId();
        
        /**
         * Sets the "SiteId" element
         */
        void setSiteId(java.lang.String siteId);
        
        /**
         * Sets (as xml) the "SiteId" element
         */
        void xsetSiteId(org.apache.xmlbeans.XmlString siteId);
        
        /**
         * Gets the "DateTime" element
         */
        java.lang.String getDateTime();
        
        /**
         * Gets (as xml) the "DateTime" element
         */
        org.apache.xmlbeans.XmlString xgetDateTime();
        
        /**
         * Sets the "DateTime" element
         */
        void setDateTime(java.lang.String dateTime);
        
        /**
         * Sets (as xml) the "DateTime" element
         */
        void xsetDateTime(org.apache.xmlbeans.XmlString dateTime);
        
        /**
         * Gets the "RegisterId" element
         */
        long getRegisterId();
        
        /**
         * Gets (as xml) the "RegisterId" element
         */
        org.apache.xmlbeans.XmlLong xgetRegisterId();
        
        /**
         * Sets the "RegisterId" element
         */
        void setRegisterId(long registerId);
        
        /**
         * Sets (as xml) the "RegisterId" element
         */
        void xsetRegisterId(org.apache.xmlbeans.XmlLong registerId);
        
        /**
         * Gets the "SequenceNumber" element
         */
        long getSequenceNumber();
        
        /**
         * Gets (as xml) the "SequenceNumber" element
         */
        org.apache.xmlbeans.XmlLong xgetSequenceNumber();
        
        /**
         * Sets the "SequenceNumber" element
         */
        void setSequenceNumber(long sequenceNumber);
        
        /**
         * Sets (as xml) the "SequenceNumber" element
         */
        void xsetSequenceNumber(org.apache.xmlbeans.XmlLong sequenceNumber);
        
        /**
         * Gets the "Retry" element
         */
        int getRetry();
        
        /**
         * Gets (as xml) the "Retry" element
         */
        org.apache.xmlbeans.XmlInt xgetRetry();
        
        /**
         * Sets the "Retry" element
         */
        void setRetry(int retry);
        
        /**
         * Sets (as xml) the "Retry" element
         */
        void xsetRetry(org.apache.xmlbeans.XmlInt retry);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header newInstance() {
              return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument newInstance() {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
