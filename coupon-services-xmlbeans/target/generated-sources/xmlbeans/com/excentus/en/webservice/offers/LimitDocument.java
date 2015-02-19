/*
 * An XML document type.
 * Localname: Limit
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.LimitDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one Limit(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface LimitDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LimitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("limita92edoctype");
    
    /**
     * Gets the "Limit" element
     */
    com.excentus.en.webservice.offers.LimitDocument.Limit getLimit();
    
    /**
     * Sets the "Limit" element
     */
    void setLimit(com.excentus.en.webservice.offers.LimitDocument.Limit limit);
    
    /**
     * Appends and returns a new empty "Limit" element
     */
    com.excentus.en.webservice.offers.LimitDocument.Limit addNewLimit();
    
    /**
     * An XML Limit(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface Limit extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Limit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("limit8207elemtype");
        
        /**
         * Gets the "Type" element
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" element
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" element
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Gets the "Value" element
         */
        java.math.BigDecimal getValue();
        
        /**
         * Gets (as xml) the "Value" element
         */
        org.apache.xmlbeans.XmlDecimal xgetValue();
        
        /**
         * Sets the "Value" element
         */
        void setValue(java.math.BigDecimal value);
        
        /**
         * Sets (as xml) the "Value" element
         */
        void xsetValue(org.apache.xmlbeans.XmlDecimal value);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.LimitDocument.Limit newInstance() {
              return (com.excentus.en.webservice.offers.LimitDocument.Limit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.LimitDocument.Limit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.LimitDocument.Limit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.LimitDocument newInstance() {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.LimitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.LimitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.LimitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.LimitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
