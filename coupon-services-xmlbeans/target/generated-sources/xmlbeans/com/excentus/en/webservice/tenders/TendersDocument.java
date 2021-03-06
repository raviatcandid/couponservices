/*
 * An XML document type.
 * Localname: Tenders
 * Namespace: http://webservice.en.excentus.com/Tenders
 * Java type: com.excentus.en.webservice.tenders.TendersDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.tenders;


/**
 * A document containing one Tenders(@http://webservice.en.excentus.com/Tenders) element.
 *
 * This is a complex type.
 */
public interface TendersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TendersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("tenderscd0cdoctype");
    
    /**
     * Gets the "Tenders" element
     */
    com.excentus.en.webservice.tenders.TendersDocument.Tenders getTenders();
    
    /**
     * Sets the "Tenders" element
     */
    void setTenders(com.excentus.en.webservice.tenders.TendersDocument.Tenders tenders);
    
    /**
     * Appends and returns a new empty "Tenders" element
     */
    com.excentus.en.webservice.tenders.TendersDocument.Tenders addNewTenders();
    
    /**
     * An XML Tenders(@http://webservice.en.excentus.com/Tenders).
     *
     * This is a complex type.
     */
    public interface Tenders extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tenders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("tenders99f7elemtype");
        
        /**
         * Gets array of all "Tender" elements
         */
        com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender[] getTenderArray();
        
        /**
         * Gets ith "Tender" element
         */
        com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender getTenderArray(int i);
        
        /**
         * Returns number of "Tender" element
         */
        int sizeOfTenderArray();
        
        /**
         * Sets array of all "Tender" element
         */
        void setTenderArray(com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender[] tenderArray);
        
        /**
         * Sets ith "Tender" element
         */
        void setTenderArray(int i, com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender tender);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Tender" element
         */
        com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender insertNewTender(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Tender" element
         */
        com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender addNewTender();
        
        /**
         * Removes the ith "Tender" element
         */
        void removeTender(int i);
        
        /**
         * An XML Tender(@).
         *
         * This is a complex type.
         */
        public interface Tender extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tender.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("tender5d77elemtype");
            
            /**
             * Gets the "Type" element
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" element
             */
            org.apache.xmlbeans.XmlString xgetType();
            
            /**
             * Sets the "Type" element
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "Type" element
             */
            void xsetType(org.apache.xmlbeans.XmlString type);
            
            /**
             * Gets the "CardType" element
             */
            java.lang.String getCardType();
            
            /**
             * Gets (as xml) the "CardType" element
             */
            org.apache.xmlbeans.XmlString xgetCardType();
            
            /**
             * Sets the "CardType" element
             */
            void setCardType(java.lang.String cardType);
            
            /**
             * Sets (as xml) the "CardType" element
             */
            void xsetCardType(org.apache.xmlbeans.XmlString cardType);
            
            /**
             * Gets the "Amount" element
             */
            java.math.BigDecimal getAmount();
            
            /**
             * Gets (as xml) the "Amount" element
             */
            org.apache.xmlbeans.XmlDecimal xgetAmount();
            
            /**
             * Sets the "Amount" element
             */
            void setAmount(java.math.BigDecimal amount);
            
            /**
             * Sets (as xml) the "Amount" element
             */
            void xsetAmount(org.apache.xmlbeans.XmlDecimal amount);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender newInstance() {
                  return (com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.excentus.en.webservice.tenders.TendersDocument.Tenders.Tender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.tenders.TendersDocument.Tenders newInstance() {
              return (com.excentus.en.webservice.tenders.TendersDocument.Tenders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.tenders.TendersDocument.Tenders newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.tenders.TendersDocument.Tenders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.tenders.TendersDocument newInstance() {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.tenders.TendersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.tenders.TendersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.tenders.TendersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.tenders.TendersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
