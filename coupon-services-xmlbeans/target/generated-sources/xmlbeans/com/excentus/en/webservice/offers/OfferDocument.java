/*
 * An XML document type.
 * Localname: Offer
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one Offer(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface OfferDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offer03addoctype");
    
    /**
     * Gets the "Offer" element
     */
    com.excentus.en.webservice.offers.OfferDocument.Offer getOffer();
    
    /**
     * Sets the "Offer" element
     */
    void setOffer(com.excentus.en.webservice.offers.OfferDocument.Offer offer);
    
    /**
     * Appends and returns a new empty "Offer" element
     */
    com.excentus.en.webservice.offers.OfferDocument.Offer addNewOffer();
    
    /**
     * An XML Offer(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface Offer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Offer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offer4805elemtype");
        
        /**
         * Gets the "OfferDesc" element
         */
        java.lang.String getOfferDesc();
        
        /**
         * Gets (as xml) the "OfferDesc" element
         */
        org.apache.xmlbeans.XmlString xgetOfferDesc();
        
        /**
         * Sets the "OfferDesc" element
         */
        void setOfferDesc(java.lang.String offerDesc);
        
        /**
         * Sets (as xml) the "OfferDesc" element
         */
        void xsetOfferDesc(org.apache.xmlbeans.XmlString offerDesc);
        
        /**
         * Gets the "StartDate" element
         */
        java.lang.String getStartDate();
        
        /**
         * Gets (as xml) the "StartDate" element
         */
        org.apache.xmlbeans.XmlString xgetStartDate();
        
        /**
         * Sets the "StartDate" element
         */
        void setStartDate(java.lang.String startDate);
        
        /**
         * Sets (as xml) the "StartDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlString startDate);
        
        /**
         * Gets the "EndDate" element
         */
        java.lang.String getEndDate();
        
        /**
         * Gets (as xml) the "EndDate" element
         */
        org.apache.xmlbeans.XmlString xgetEndDate();
        
        /**
         * Sets the "EndDate" element
         */
        void setEndDate(java.lang.String endDate);
        
        /**
         * Sets (as xml) the "EndDate" element
         */
        void xsetEndDate(org.apache.xmlbeans.XmlString endDate);
        
        /**
         * Gets the "Sponsor" element
         */
        java.lang.String getSponsor();
        
        /**
         * Gets (as xml) the "Sponsor" element
         */
        org.apache.xmlbeans.XmlString xgetSponsor();
        
        /**
         * Sets the "Sponsor" element
         */
        void setSponsor(java.lang.String sponsor);
        
        /**
         * Sets (as xml) the "Sponsor" element
         */
        void xsetSponsor(org.apache.xmlbeans.XmlString sponsor);
        
        /**
         * Gets the "Max" element
         */
        java.math.BigDecimal getMax();
        
        /**
         * Gets (as xml) the "Max" element
         */
        org.apache.xmlbeans.XmlDecimal xgetMax();
        
        /**
         * True if has "Max" element
         */
        boolean isSetMax();
        
        /**
         * Sets the "Max" element
         */
        void setMax(java.math.BigDecimal max);
        
        /**
         * Sets (as xml) the "Max" element
         */
        void xsetMax(org.apache.xmlbeans.XmlDecimal max);
        
        /**
         * Unsets the "Max" element
         */
        void unsetMax();
        
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
         * Gets the "Rewards" element
         */
        com.excentus.en.webservice.offers.RewardsDocument.Rewards getRewards();
        
        /**
         * Sets the "Rewards" element
         */
        void setRewards(com.excentus.en.webservice.offers.RewardsDocument.Rewards rewards);
        
        /**
         * Appends and returns a new empty "Rewards" element
         */
        com.excentus.en.webservice.offers.RewardsDocument.Rewards addNewRewards();
        
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
         * Gets the "type" attribute
         */
        com.excentus.en.webservice.offers.OfferType.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.excentus.en.webservice.offers.OfferType xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.excentus.en.webservice.offers.OfferType.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.excentus.en.webservice.offers.OfferType type);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.OfferDocument.Offer newInstance() {
              return (com.excentus.en.webservice.offers.OfferDocument.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.OfferDocument.Offer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.OfferDocument.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.OfferDocument newInstance() {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
