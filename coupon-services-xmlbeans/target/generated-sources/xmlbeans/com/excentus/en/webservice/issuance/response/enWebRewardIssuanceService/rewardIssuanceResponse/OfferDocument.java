/*
 * An XML document type.
 * Localname: Offer
 * Namespace: http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse
 * Java type: com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse;


/**
 * A document containing one Offer(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse) element.
 *
 * This is a complex type.
 */
public interface OfferDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offer026adoctype");
    
    /**
     * Gets the "Offer" element
     */
    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer getOffer();
    
    /**
     * Sets the "Offer" element
     */
    void setOffer(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer offer);
    
    /**
     * Appends and returns a new empty "Offer" element
     */
    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer addNewOffer();
    
    /**
     * An XML Offer(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse).
     *
     * This is a complex type.
     */
    public interface Offer extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Offer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offer9d12elemtype");
        
        /**
         * Gets the "Name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "Name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Tests for nil "Name" element
         */
        boolean isNilName();
        
        /**
         * Sets the "Name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "Name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Nils the "Name" element
         */
        void setNilName();
        
        /**
         * Gets the "StartPurchaseBalance" element
         */
        java.math.BigDecimal getStartPurchaseBalance();
        
        /**
         * Gets (as xml) the "StartPurchaseBalance" element
         */
        org.apache.xmlbeans.XmlDecimal xgetStartPurchaseBalance();
        
        /**
         * Sets the "StartPurchaseBalance" element
         */
        void setStartPurchaseBalance(java.math.BigDecimal startPurchaseBalance);
        
        /**
         * Sets (as xml) the "StartPurchaseBalance" element
         */
        void xsetStartPurchaseBalance(org.apache.xmlbeans.XmlDecimal startPurchaseBalance);
        
        /**
         * Gets the "EndPurchaseBalance" element
         */
        java.math.BigDecimal getEndPurchaseBalance();
        
        /**
         * Gets (as xml) the "EndPurchaseBalance" element
         */
        org.apache.xmlbeans.XmlDecimal xgetEndPurchaseBalance();
        
        /**
         * Sets the "EndPurchaseBalance" element
         */
        void setEndPurchaseBalance(java.math.BigDecimal endPurchaseBalance);
        
        /**
         * Sets (as xml) the "EndPurchaseBalance" element
         */
        void xsetEndPurchaseBalance(org.apache.xmlbeans.XmlDecimal endPurchaseBalance);
        
        /**
         * Gets the "RewardEligibleAmt" element
         */
        java.math.BigDecimal getRewardEligibleAmt();
        
        /**
         * Gets (as xml) the "RewardEligibleAmt" element
         */
        org.apache.xmlbeans.XmlDecimal xgetRewardEligibleAmt();
        
        /**
         * Sets the "RewardEligibleAmt" element
         */
        void setRewardEligibleAmt(java.math.BigDecimal rewardEligibleAmt);
        
        /**
         * Sets (as xml) the "RewardEligibleAmt" element
         */
        void xsetRewardEligibleAmt(org.apache.xmlbeans.XmlDecimal rewardEligibleAmt);
        
        /**
         * Gets the "MaxReached" element
         */
        java.lang.String getMaxReached();
        
        /**
         * Gets (as xml) the "MaxReached" element
         */
        org.apache.xmlbeans.XmlString xgetMaxReached();
        
        /**
         * Sets the "MaxReached" element
         */
        void setMaxReached(java.lang.String maxReached);
        
        /**
         * Sets (as xml) the "MaxReached" element
         */
        void xsetMaxReached(org.apache.xmlbeans.XmlString maxReached);
        
        /**
         * Gets the "PurchaseRequirement" element
         */
        java.math.BigDecimal getPurchaseRequirement();
        
        /**
         * Gets (as xml) the "PurchaseRequirement" element
         */
        org.apache.xmlbeans.XmlDecimal xgetPurchaseRequirement();
        
        /**
         * Sets the "PurchaseRequirement" element
         */
        void setPurchaseRequirement(java.math.BigDecimal purchaseRequirement);
        
        /**
         * Sets (as xml) the "PurchaseRequirement" element
         */
        void xsetPurchaseRequirement(org.apache.xmlbeans.XmlDecimal purchaseRequirement);
        
        /**
         * Gets the "RewardAmt" element
         */
        java.math.BigDecimal getRewardAmt();
        
        /**
         * Gets (as xml) the "RewardAmt" element
         */
        org.apache.xmlbeans.XmlDecimal xgetRewardAmt();
        
        /**
         * Sets the "RewardAmt" element
         */
        void setRewardAmt(java.math.BigDecimal rewardAmt);
        
        /**
         * Sets (as xml) the "RewardAmt" element
         */
        void xsetRewardAmt(org.apache.xmlbeans.XmlDecimal rewardAmt);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer newInstance() {
              return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument newInstance() {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
