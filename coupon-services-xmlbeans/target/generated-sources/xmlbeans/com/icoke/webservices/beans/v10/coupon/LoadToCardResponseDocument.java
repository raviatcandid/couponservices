/*
 * An XML document type.
 * Localname: LoadToCardResponse
 * Namespace: http://beans.webservices.icoke.com/v1_0/Coupon
 * Java type: com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.coupon;


/**
 * A document containing one LoadToCardResponse(@http://beans.webservices.icoke.com/v1_0/Coupon) element.
 *
 * This is a complex type.
 */
public interface LoadToCardResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadToCardResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("loadtocardresponse8bf8doctype");
    
    /**
     * Gets the "LoadToCardResponse" element
     */
    com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse getLoadToCardResponse();
    
    /**
     * Sets the "LoadToCardResponse" element
     */
    void setLoadToCardResponse(com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse loadToCardResponse);
    
    /**
     * Appends and returns a new empty "LoadToCardResponse" element
     */
    com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse addNewLoadToCardResponse();
    
    /**
     * An XML LoadToCardResponse(@http://beans.webservices.icoke.com/v1_0/Coupon).
     *
     * This is a complex type.
     */
    public interface LoadToCardResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadToCardResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("loadtocardresponse3fc6elemtype");
        
        /**
         * Gets the "statusCode" element
         */
        java.lang.String getStatusCode();
        
        /**
         * Gets (as xml) the "statusCode" element
         */
        org.apache.xmlbeans.XmlString xgetStatusCode();
        
        /**
         * Sets the "statusCode" element
         */
        void setStatusCode(java.lang.String statusCode);
        
        /**
         * Sets (as xml) the "statusCode" element
         */
        void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode);
        
        /**
         * Gets the "statusDescription" element
         */
        java.lang.String getStatusDescription();
        
        /**
         * Gets (as xml) the "statusDescription" element
         */
        org.apache.xmlbeans.XmlString xgetStatusDescription();
        
        /**
         * Sets the "statusDescription" element
         */
        void setStatusDescription(java.lang.String statusDescription);
        
        /**
         * Sets (as xml) the "statusDescription" element
         */
        void xsetStatusDescription(org.apache.xmlbeans.XmlString statusDescription);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse newInstance() {
              return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument.LoadToCardResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument newInstance() {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
