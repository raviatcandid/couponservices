/*
 * An XML document type.
 * Localname: BasketOffer
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.BasketOfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one BasketOffer(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface BasketOfferDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BasketOfferDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("basketoffer1853doctype");
    
    /**
     * Gets the "BasketOffer" element
     */
    com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer getBasketOffer();
    
    /**
     * Sets the "BasketOffer" element
     */
    void setBasketOffer(com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer basketOffer);
    
    /**
     * Appends and returns a new empty "BasketOffer" element
     */
    com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer addNewBasketOffer();
    
    /**
     * An XML BasketOffer(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface BasketOffer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BasketOffer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("basketoffer4191elemtype");
        
        /**
         * Gets the "PurchaseBalance" element
         */
        java.math.BigDecimal getPurchaseBalance();
        
        /**
         * Gets (as xml) the "PurchaseBalance" element
         */
        org.apache.xmlbeans.XmlDecimal xgetPurchaseBalance();
        
        /**
         * Sets the "PurchaseBalance" element
         */
        void setPurchaseBalance(java.math.BigDecimal purchaseBalance);
        
        /**
         * Sets (as xml) the "PurchaseBalance" element
         */
        void xsetPurchaseBalance(org.apache.xmlbeans.XmlDecimal purchaseBalance);
        
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
         * Gets the "BasketSize" element
         */
        java.math.BigDecimal getBasketSize();
        
        /**
         * Gets (as xml) the "BasketSize" element
         */
        org.apache.xmlbeans.XmlDecimal xgetBasketSize();
        
        /**
         * Sets the "BasketSize" element
         */
        void setBasketSize(java.math.BigDecimal basketSize);
        
        /**
         * Sets (as xml) the "BasketSize" element
         */
        void xsetBasketSize(org.apache.xmlbeans.XmlDecimal basketSize);
        
        /**
         * Gets the "BalanceStatus" element
         */
        java.lang.String getBalanceStatus();
        
        /**
         * Gets (as xml) the "BalanceStatus" element
         */
        org.apache.xmlbeans.XmlString xgetBalanceStatus();
        
        /**
         * Sets the "BalanceStatus" element
         */
        void setBalanceStatus(java.lang.String balanceStatus);
        
        /**
         * Sets (as xml) the "BalanceStatus" element
         */
        void xsetBalanceStatus(org.apache.xmlbeans.XmlString balanceStatus);
        
        /**
         * Gets the "BasketMin" element
         */
        java.math.BigDecimal getBasketMin();
        
        /**
         * Gets (as xml) the "BasketMin" element
         */
        org.apache.xmlbeans.XmlDecimal xgetBasketMin();
        
        /**
         * Sets the "BasketMin" element
         */
        void setBasketMin(java.math.BigDecimal basketMin);
        
        /**
         * Sets (as xml) the "BasketMin" element
         */
        void xsetBasketMin(org.apache.xmlbeans.XmlDecimal basketMin);
        
        /**
         * Gets the "BasketMax" element
         */
        java.math.BigDecimal getBasketMax();
        
        /**
         * Gets (as xml) the "BasketMax" element
         */
        org.apache.xmlbeans.XmlDecimal xgetBasketMax();
        
        /**
         * Sets the "BasketMax" element
         */
        void setBasketMax(java.math.BigDecimal basketMax);
        
        /**
         * Sets (as xml) the "BasketMax" element
         */
        void xsetBasketMax(org.apache.xmlbeans.XmlDecimal basketMax);
        
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
        com.excentus.en.webservice.offers.BasketOfferType.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.excentus.en.webservice.offers.BasketOfferType xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.excentus.en.webservice.offers.BasketOfferType.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.excentus.en.webservice.offers.BasketOfferType type);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer newInstance() {
              return (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.BasketOfferDocument newInstance() {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.BasketOfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.BasketOfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
