/*
 * An XML document type.
 * Localname: ValidateCardRequest
 * Namespace: http://beans.webservices.icoke.com/v1_0/Coupon
 * Java type: com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.coupon;


/**
 * A document containing one ValidateCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon) element.
 *
 * This is a complex type.
 */
public interface ValidateCardRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidateCardRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("validatecardrequestcc93doctype");
    
    /**
     * Gets the "ValidateCardRequest" element
     */
    com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest getValidateCardRequest();
    
    /**
     * Sets the "ValidateCardRequest" element
     */
    void setValidateCardRequest(com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest validateCardRequest);
    
    /**
     * Appends and returns a new empty "ValidateCardRequest" element
     */
    com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest addNewValidateCardRequest();
    
    /**
     * An XML ValidateCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon).
     *
     * This is a complex type.
     */
    public interface ValidateCardRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidateCardRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("validatecardrequestb2feelemtype");
        
        /**
         * Gets the "processorCode" element
         */
        java.lang.String getProcessorCode();
        
        /**
         * Gets (as xml) the "processorCode" element
         */
        org.apache.xmlbeans.XmlString xgetProcessorCode();
        
        /**
         * Tests for nil "processorCode" element
         */
        boolean isNilProcessorCode();
        
        /**
         * Sets the "processorCode" element
         */
        void setProcessorCode(java.lang.String processorCode);
        
        /**
         * Sets (as xml) the "processorCode" element
         */
        void xsetProcessorCode(org.apache.xmlbeans.XmlString processorCode);
        
        /**
         * Nils the "processorCode" element
         */
        void setNilProcessorCode();
        
        /**
         * Gets the "retailerCode" element
         */
        java.lang.String getRetailerCode();
        
        /**
         * Gets (as xml) the "retailerCode" element
         */
        org.apache.xmlbeans.XmlString xgetRetailerCode();
        
        /**
         * Sets the "retailerCode" element
         */
        void setRetailerCode(java.lang.String retailerCode);
        
        /**
         * Sets (as xml) the "retailerCode" element
         */
        void xsetRetailerCode(org.apache.xmlbeans.XmlString retailerCode);
        
        /**
         * Gets the "cardNumber" element
         */
        java.lang.String getCardNumber();
        
        /**
         * Gets (as xml) the "cardNumber" element
         */
        org.apache.xmlbeans.XmlString xgetCardNumber();
        
        /**
         * Sets the "cardNumber" element
         */
        void setCardNumber(java.lang.String cardNumber);
        
        /**
         * Sets (as xml) the "cardNumber" element
         */
        void xsetCardNumber(org.apache.xmlbeans.XmlString cardNumber);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest newInstance() {
              return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument.ValidateCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument newInstance() {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.coupon.ValidateCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
