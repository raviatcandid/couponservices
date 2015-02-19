/*
 * An XML document type.
 * Localname: MVPOffer
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.MVPOfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one MVPOffer(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface MVPOfferDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MVPOfferDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("mvpoffer0b22doctype");
    
    /**
     * Gets the "MVPOffer" element
     */
    com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer getMVPOffer();
    
    /**
     * Sets the "MVPOffer" element
     */
    void setMVPOffer(com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer mvpOffer);
    
    /**
     * Appends and returns a new empty "MVPOffer" element
     */
    com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer addNewMVPOffer();
    
    /**
     * An XML MVPOffer(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface MVPOffer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MVPOffer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("mvpoffer1813elemtype");
        
        /**
         * Gets the "StartingBalance" element
         */
        java.math.BigDecimal getStartingBalance();
        
        /**
         * Gets (as xml) the "StartingBalance" element
         */
        org.apache.xmlbeans.XmlDecimal xgetStartingBalance();
        
        /**
         * Sets the "StartingBalance" element
         */
        void setStartingBalance(java.math.BigDecimal startingBalance);
        
        /**
         * Sets (as xml) the "StartingBalance" element
         */
        void xsetStartingBalance(org.apache.xmlbeans.XmlDecimal startingBalance);
        
        /**
         * Gets the "EndingBalance" element
         */
        java.math.BigDecimal getEndingBalance();
        
        /**
         * Gets (as xml) the "EndingBalance" element
         */
        org.apache.xmlbeans.XmlDecimal xgetEndingBalance();
        
        /**
         * Sets the "EndingBalance" element
         */
        void setEndingBalance(java.math.BigDecimal endingBalance);
        
        /**
         * Sets (as xml) the "EndingBalance" element
         */
        void xsetEndingBalance(org.apache.xmlbeans.XmlDecimal endingBalance);
        
        /**
         * Gets the "QualifiedUnits" element
         */
        java.math.BigDecimal getQualifiedUnits();
        
        /**
         * Gets (as xml) the "QualifiedUnits" element
         */
        org.apache.xmlbeans.XmlDecimal xgetQualifiedUnits();
        
        /**
         * Sets the "QualifiedUnits" element
         */
        void setQualifiedUnits(java.math.BigDecimal qualifiedUnits);
        
        /**
         * Sets (as xml) the "QualifiedUnits" element
         */
        void xsetQualifiedUnits(org.apache.xmlbeans.XmlDecimal qualifiedUnits);
        
        /**
         * Gets the "LockedTokenId" element
         */
        java.lang.String getLockedTokenId();
        
        /**
         * Gets (as xml) the "LockedTokenId" element
         */
        org.apache.xmlbeans.XmlString xgetLockedTokenId();
        
        /**
         * Tests for nil "LockedTokenId" element
         */
        boolean isNilLockedTokenId();
        
        /**
         * True if has "LockedTokenId" element
         */
        boolean isSetLockedTokenId();
        
        /**
         * Sets the "LockedTokenId" element
         */
        void setLockedTokenId(java.lang.String lockedTokenId);
        
        /**
         * Sets (as xml) the "LockedTokenId" element
         */
        void xsetLockedTokenId(org.apache.xmlbeans.XmlString lockedTokenId);
        
        /**
         * Nils the "LockedTokenId" element
         */
        void setNilLockedTokenId();
        
        /**
         * Unsets the "LockedTokenId" element
         */
        void unsetLockedTokenId();
        
        /**
         * Gets the "RewardIssued" element
         */
        boolean getRewardIssued();
        
        /**
         * Gets (as xml) the "RewardIssued" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRewardIssued();
        
        /**
         * Sets the "RewardIssued" element
         */
        void setRewardIssued(boolean rewardIssued);
        
        /**
         * Sets (as xml) the "RewardIssued" element
         */
        void xsetRewardIssued(org.apache.xmlbeans.XmlBoolean rewardIssued);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Gets the "RequiredUnits" attribute
         */
        java.math.BigDecimal getRequiredUnits();
        
        /**
         * Gets (as xml) the "RequiredUnits" attribute
         */
        org.apache.xmlbeans.XmlDecimal xgetRequiredUnits();
        
        /**
         * Sets the "RequiredUnits" attribute
         */
        void setRequiredUnits(java.math.BigDecimal requiredUnits);
        
        /**
         * Sets (as xml) the "RequiredUnits" attribute
         */
        void xsetRequiredUnits(org.apache.xmlbeans.XmlDecimal requiredUnits);
        
        /**
         * Gets the "ExpirationDays" attribute
         */
        java.math.BigDecimal getExpirationDays();
        
        /**
         * Gets (as xml) the "ExpirationDays" attribute
         */
        org.apache.xmlbeans.XmlDecimal xgetExpirationDays();
        
        /**
         * True if has "ExpirationDays" attribute
         */
        boolean isSetExpirationDays();
        
        /**
         * Sets the "ExpirationDays" attribute
         */
        void setExpirationDays(java.math.BigDecimal expirationDays);
        
        /**
         * Sets (as xml) the "ExpirationDays" attribute
         */
        void xsetExpirationDays(org.apache.xmlbeans.XmlDecimal expirationDays);
        
        /**
         * Unsets the "ExpirationDays" attribute
         */
        void unsetExpirationDays();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer newInstance() {
              return (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.MVPOfferDocument newInstance() {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.MVPOfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.MVPOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
