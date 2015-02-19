/*
 * An XML document type.
 * Localname: OfferDetails
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OfferDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one OfferDetails(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface OfferDetailsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferDetailsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offerdetails3531doctype");
    
    /**
     * Gets the "OfferDetails" element
     */
    com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails getOfferDetails();
    
    /**
     * Sets the "OfferDetails" element
     */
    void setOfferDetails(com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails offerDetails);
    
    /**
     * Appends and returns a new empty "OfferDetails" element
     */
    com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails addNewOfferDetails();
    
    /**
     * An XML OfferDetails(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface OfferDetails extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offerdetailsd033elemtype");
        
        /**
         * Gets the "Type" element
         */
        com.excentus.en.webservice.offers.OfferDetailType.Enum getType();
        
        /**
         * Gets (as xml) the "Type" element
         */
        com.excentus.en.webservice.offers.OfferDetailType xgetType();
        
        /**
         * True if has "Type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" element
         */
        void setType(com.excentus.en.webservice.offers.OfferDetailType.Enum type);
        
        /**
         * Sets (as xml) the "Type" element
         */
        void xsetType(com.excentus.en.webservice.offers.OfferDetailType type);
        
        /**
         * Unsets the "Type" element
         */
        void unsetType();
        
        /**
         * Gets the "Code" element
         */
        java.lang.String getCode();
        
        /**
         * Gets (as xml) the "Code" element
         */
        org.apache.xmlbeans.XmlString xgetCode();
        
        /**
         * Sets the "Code" element
         */
        void setCode(java.lang.String code);
        
        /**
         * Sets (as xml) the "Code" element
         */
        void xsetCode(org.apache.xmlbeans.XmlString code);
        
        /**
         * Gets the "UnitType" element
         */
        java.lang.String getUnitType();
        
        /**
         * Gets (as xml) the "UnitType" element
         */
        org.apache.xmlbeans.XmlString xgetUnitType();
        
        /**
         * Sets the "UnitType" element
         */
        void setUnitType(java.lang.String unitType);
        
        /**
         * Sets (as xml) the "UnitType" element
         */
        void xsetUnitType(org.apache.xmlbeans.XmlString unitType);
        
        /**
         * Gets the "Units" element
         */
        java.math.BigDecimal getUnits();
        
        /**
         * Gets (as xml) the "Units" element
         */
        org.apache.xmlbeans.XmlDecimal xgetUnits();
        
        /**
         * Sets the "Units" element
         */
        void setUnits(java.math.BigDecimal units);
        
        /**
         * Sets (as xml) the "Units" element
         */
        void xsetUnits(org.apache.xmlbeans.XmlDecimal units);
        
        /**
         * Gets the "GroupCode" element
         */
        java.lang.String getGroupCode();
        
        /**
         * Gets (as xml) the "GroupCode" element
         */
        org.apache.xmlbeans.XmlString xgetGroupCode();
        
        /**
         * True if has "GroupCode" element
         */
        boolean isSetGroupCode();
        
        /**
         * Sets the "GroupCode" element
         */
        void setGroupCode(java.lang.String groupCode);
        
        /**
         * Sets (as xml) the "GroupCode" element
         */
        void xsetGroupCode(org.apache.xmlbeans.XmlString groupCode);
        
        /**
         * Unsets the "GroupCode" element
         */
        void unsetGroupCode();
        
        /**
         * Gets the "UnitsQualified" element
         */
        java.math.BigDecimal getUnitsQualified();
        
        /**
         * Gets (as xml) the "UnitsQualified" element
         */
        org.apache.xmlbeans.XmlDecimal xgetUnitsQualified();
        
        /**
         * True if has "UnitsQualified" element
         */
        boolean isSetUnitsQualified();
        
        /**
         * Sets the "UnitsQualified" element
         */
        void setUnitsQualified(java.math.BigDecimal unitsQualified);
        
        /**
         * Sets (as xml) the "UnitsQualified" element
         */
        void xsetUnitsQualified(org.apache.xmlbeans.XmlDecimal unitsQualified);
        
        /**
         * Unsets the "UnitsQualified" element
         */
        void unsetUnitsQualified();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails newInstance() {
              return (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.OfferDetailsDocument.OfferDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.OfferDetailsDocument newInstance() {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OfferDetailsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OfferDetailsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
