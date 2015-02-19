/*
 * An XML document type.
 * Localname: ServiceFault
 * Namespace: http://beans.webservices.icoke.com/ServiceFault
 * Java type: com.icoke.webservices.beans.serviceFault.ServiceFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.serviceFault;


/**
 * A document containing one ServiceFault(@http://beans.webservices.icoke.com/ServiceFault) element.
 *
 * This is a complex type.
 */
public interface ServiceFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("servicefault2bd9doctype");
    
    /**
     * Gets the "ServiceFault" element
     */
    com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault getServiceFault();
    
    /**
     * Sets the "ServiceFault" element
     */
    void setServiceFault(com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault serviceFault);
    
    /**
     * Appends and returns a new empty "ServiceFault" element
     */
    com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault addNewServiceFault();
    
    /**
     * An XML ServiceFault(@http://beans.webservices.icoke.com/ServiceFault).
     *
     * This is a complex type.
     */
    public interface ServiceFault extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("servicefault8590elemtype");
        
        /**
         * Gets the "errorCode" element
         */
        int getErrorCode();
        
        /**
         * Gets (as xml) the "errorCode" element
         */
        org.apache.xmlbeans.XmlInt xgetErrorCode();
        
        /**
         * True if has "errorCode" element
         */
        boolean isSetErrorCode();
        
        /**
         * Sets the "errorCode" element
         */
        void setErrorCode(int errorCode);
        
        /**
         * Sets (as xml) the "errorCode" element
         */
        void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode);
        
        /**
         * Unsets the "errorCode" element
         */
        void unsetErrorCode();
        
        /**
         * Gets the "errorDescription" element
         */
        java.lang.String getErrorDescription();
        
        /**
         * Gets (as xml) the "errorDescription" element
         */
        org.apache.xmlbeans.XmlString xgetErrorDescription();
        
        /**
         * True if has "errorDescription" element
         */
        boolean isSetErrorDescription();
        
        /**
         * Sets the "errorDescription" element
         */
        void setErrorDescription(java.lang.String errorDescription);
        
        /**
         * Sets (as xml) the "errorDescription" element
         */
        void xsetErrorDescription(org.apache.xmlbeans.XmlString errorDescription);
        
        /**
         * Unsets the "errorDescription" element
         */
        void unsetErrorDescription();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault newInstance() {
              return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument.ServiceFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument newInstance() {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.serviceFault.ServiceFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.serviceFault.ServiceFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
