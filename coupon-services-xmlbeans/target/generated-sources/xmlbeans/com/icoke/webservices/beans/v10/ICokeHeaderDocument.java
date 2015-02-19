/*
 * An XML document type.
 * Localname: ICokeHeader
 * Namespace: http://beans.webservices.icoke.com/v1_0
 * Java type: com.icoke.webservices.beans.v10.ICokeHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10;


/**
 * A document containing one ICokeHeader(@http://beans.webservices.icoke.com/v1_0) element.
 *
 * This is a complex type.
 */
public interface ICokeHeaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICokeHeaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("icokeheaderca35doctype");
    
    /**
     * Gets the "ICokeHeader" element
     */
    com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader getICokeHeader();
    
    /**
     * Sets the "ICokeHeader" element
     */
    void setICokeHeader(com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader iCokeHeader);
    
    /**
     * Appends and returns a new empty "ICokeHeader" element
     */
    com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader addNewICokeHeader();
    
    /**
     * An XML ICokeHeader(@http://beans.webservices.icoke.com/v1_0).
     *
     * This is a complex type.
     */
    public interface ICokeHeader extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICokeHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("icokeheader62bdelemtype");
        
        /**
         * Gets the "siteId" element
         */
        java.lang.String getSiteId();
        
        /**
         * Gets (as xml) the "siteId" element
         */
        org.apache.xmlbeans.XmlString xgetSiteId();
        
        /**
         * Tests for nil "siteId" element
         */
        boolean isNilSiteId();
        
        /**
         * Sets the "siteId" element
         */
        void setSiteId(java.lang.String siteId);
        
        /**
         * Sets (as xml) the "siteId" element
         */
        void xsetSiteId(org.apache.xmlbeans.XmlString siteId);
        
        /**
         * Nils the "siteId" element
         */
        void setNilSiteId();
        
        /**
         * Gets the "memberId" element
         */
        java.lang.String getMemberId();
        
        /**
         * Gets (as xml) the "memberId" element
         */
        org.apache.xmlbeans.XmlString xgetMemberId();
        
        /**
         * Tests for nil "memberId" element
         */
        boolean isNilMemberId();
        
        /**
         * Sets the "memberId" element
         */
        void setMemberId(java.lang.String memberId);
        
        /**
         * Sets (as xml) the "memberId" element
         */
        void xsetMemberId(org.apache.xmlbeans.XmlString memberId);
        
        /**
         * Nils the "memberId" element
         */
        void setNilMemberId();
        
        /**
         * Gets the "sessionId" element
         */
        java.lang.String getSessionId();
        
        /**
         * Gets (as xml) the "sessionId" element
         */
        org.apache.xmlbeans.XmlString xgetSessionId();
        
        /**
         * Tests for nil "sessionId" element
         */
        boolean isNilSessionId();
        
        /**
         * Sets the "sessionId" element
         */
        void setSessionId(java.lang.String sessionId);
        
        /**
         * Sets (as xml) the "sessionId" element
         */
        void xsetSessionId(org.apache.xmlbeans.XmlString sessionId);
        
        /**
         * Nils the "sessionId" element
         */
        void setNilSessionId();
        
        /**
         * Gets the "ipaddress" element
         */
        java.lang.String getIpaddress();
        
        /**
         * Gets (as xml) the "ipaddress" element
         */
        org.apache.xmlbeans.XmlString xgetIpaddress();
        
        /**
         * Tests for nil "ipaddress" element
         */
        boolean isNilIpaddress();
        
        /**
         * Sets the "ipaddress" element
         */
        void setIpaddress(java.lang.String ipaddress);
        
        /**
         * Sets (as xml) the "ipaddress" element
         */
        void xsetIpaddress(org.apache.xmlbeans.XmlString ipaddress);
        
        /**
         * Nils the "ipaddress" element
         */
        void setNilIpaddress();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader newInstance() {
              return (com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icoke.webservices.beans.v10.ICokeHeaderDocument.ICokeHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument newInstance() {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.ICokeHeaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.ICokeHeaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
