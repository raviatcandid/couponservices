/*
 * An XML document type.
 * Localname: ErrorNo
 * Namespace: http://error.webservice.en.excentus.com/ENWebService/error
 * Java type: com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.error.enWebService.error;


/**
 * A document containing one ErrorNo(@http://error.webservice.en.excentus.com/ENWebService/error) element.
 *
 * This is a complex type.
 */
public interface ErrorNoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorNoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("errornocb66doctype");
    
    /**
     * Gets the "ErrorNo" element
     */
    java.lang.String getErrorNo();
    
    /**
     * Gets (as xml) the "ErrorNo" element
     */
    org.apache.xmlbeans.XmlString xgetErrorNo();
    
    /**
     * Sets the "ErrorNo" element
     */
    void setErrorNo(java.lang.String errorNo);
    
    /**
     * Sets (as xml) the "ErrorNo" element
     */
    void xsetErrorNo(org.apache.xmlbeans.XmlString errorNo);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument newInstance() {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.error.enWebService.error.ErrorNoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
