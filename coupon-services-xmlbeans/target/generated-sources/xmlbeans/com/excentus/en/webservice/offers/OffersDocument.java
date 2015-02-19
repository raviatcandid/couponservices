/*
 * An XML document type.
 * Localname: Offers
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OffersDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one Offers(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface OffersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OffersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offers5440doctype");
    
    /**
     * Gets the "Offers" element
     */
    com.excentus.en.webservice.offers.OffersDocument.Offers getOffers();
    
    /**
     * Sets the "Offers" element
     */
    void setOffers(com.excentus.en.webservice.offers.OffersDocument.Offers offers);
    
    /**
     * Appends and returns a new empty "Offers" element
     */
    com.excentus.en.webservice.offers.OffersDocument.Offers addNewOffers();
    
    /**
     * An XML Offers(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface Offers extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Offers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offers4dd3elemtype");
        
        /**
         * Gets array of all "Offer" elements
         */
        com.excentus.en.webservice.offers.OfferDocument.Offer[] getOfferArray();
        
        /**
         * Gets ith "Offer" element
         */
        com.excentus.en.webservice.offers.OfferDocument.Offer getOfferArray(int i);
        
        /**
         * Returns number of "Offer" element
         */
        int sizeOfOfferArray();
        
        /**
         * Sets array of all "Offer" element
         */
        void setOfferArray(com.excentus.en.webservice.offers.OfferDocument.Offer[] offerArray);
        
        /**
         * Sets ith "Offer" element
         */
        void setOfferArray(int i, com.excentus.en.webservice.offers.OfferDocument.Offer offer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Offer" element
         */
        com.excentus.en.webservice.offers.OfferDocument.Offer insertNewOffer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Offer" element
         */
        com.excentus.en.webservice.offers.OfferDocument.Offer addNewOffer();
        
        /**
         * Removes the ith "Offer" element
         */
        void removeOffer(int i);
        
        /**
         * Gets array of all "BasketOffer" elements
         */
        com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer[] getBasketOfferArray();
        
        /**
         * Gets ith "BasketOffer" element
         */
        com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer getBasketOfferArray(int i);
        
        /**
         * Returns number of "BasketOffer" element
         */
        int sizeOfBasketOfferArray();
        
        /**
         * Sets array of all "BasketOffer" element
         */
        void setBasketOfferArray(com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer[] basketOfferArray);
        
        /**
         * Sets ith "BasketOffer" element
         */
        void setBasketOfferArray(int i, com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer basketOffer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BasketOffer" element
         */
        com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer insertNewBasketOffer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BasketOffer" element
         */
        com.excentus.en.webservice.offers.BasketOfferDocument.BasketOffer addNewBasketOffer();
        
        /**
         * Removes the ith "BasketOffer" element
         */
        void removeBasketOffer(int i);
        
        /**
         * Gets array of all "MVPOffer" elements
         */
        com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer[] getMVPOfferArray();
        
        /**
         * Gets ith "MVPOffer" element
         */
        com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer getMVPOfferArray(int i);
        
        /**
         * Returns number of "MVPOffer" element
         */
        int sizeOfMVPOfferArray();
        
        /**
         * Sets array of all "MVPOffer" element
         */
        void setMVPOfferArray(com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer[] mvpOfferArray);
        
        /**
         * Sets ith "MVPOffer" element
         */
        void setMVPOfferArray(int i, com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer mvpOffer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "MVPOffer" element
         */
        com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer insertNewMVPOffer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "MVPOffer" element
         */
        com.excentus.en.webservice.offers.MVPOfferDocument.MVPOffer addNewMVPOffer();
        
        /**
         * Removes the ith "MVPOffer" element
         */
        void removeMVPOffer(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.OffersDocument.Offers newInstance() {
              return (com.excentus.en.webservice.offers.OffersDocument.Offers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.OffersDocument.Offers newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.OffersDocument.Offers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.OffersDocument newInstance() {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.OffersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OffersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OffersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OffersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
