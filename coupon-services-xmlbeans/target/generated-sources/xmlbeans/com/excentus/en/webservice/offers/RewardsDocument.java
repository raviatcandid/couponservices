/*
 * An XML document type.
 * Localname: Rewards
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.RewardsDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * A document containing one Rewards(@http://webservice.en.excentus.com/Offers) element.
 *
 * This is a complex type.
 */
public interface RewardsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardsb5a5doctype");
    
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
     * An XML Rewards(@http://webservice.en.excentus.com/Offers).
     *
     * This is a complex type.
     */
    public interface Rewards extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rewards.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewards9435elemtype");
        
        /**
         * Gets array of all "Reward" elements
         */
        com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward[] getRewardArray();
        
        /**
         * Gets ith "Reward" element
         */
        com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward getRewardArray(int i);
        
        /**
         * Returns number of "Reward" element
         */
        int sizeOfRewardArray();
        
        /**
         * Sets array of all "Reward" element
         */
        void setRewardArray(com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward[] rewardArray);
        
        /**
         * Sets ith "Reward" element
         */
        void setRewardArray(int i, com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward reward);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Reward" element
         */
        com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward insertNewReward(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Reward" element
         */
        com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward addNewReward();
        
        /**
         * Removes the ith "Reward" element
         */
        void removeReward(int i);
        
        /**
         * An XML Reward(@).
         *
         * This is a complex type.
         */
        public interface Reward extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reward.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("reward323aelemtype");
            
            /**
             * Gets the "Value" element
             */
            java.math.BigDecimal getValue();
            
            /**
             * Gets (as xml) the "Value" element
             */
            org.apache.xmlbeans.XmlDecimal xgetValue();
            
            /**
             * Sets the "Value" element
             */
            void setValue(java.math.BigDecimal value);
            
            /**
             * Sets (as xml) the "Value" element
             */
            void xsetValue(org.apache.xmlbeans.XmlDecimal value);
            
            /**
             * Gets the "Sponsor" element
             */
            java.lang.String getSponsor();
            
            /**
             * Gets (as xml) the "Sponsor" element
             */
            org.apache.xmlbeans.XmlString xgetSponsor();
            
            /**
             * True if has "Sponsor" element
             */
            boolean isSetSponsor();
            
            /**
             * Sets the "Sponsor" element
             */
            void setSponsor(java.lang.String sponsor);
            
            /**
             * Sets (as xml) the "Sponsor" element
             */
            void xsetSponsor(org.apache.xmlbeans.XmlString sponsor);
            
            /**
             * Unsets the "Sponsor" element
             */
            void unsetSponsor();
            
            /**
             * Gets the "ExpirationDate" element
             */
            java.lang.String getExpirationDate();
            
            /**
             * Gets (as xml) the "ExpirationDate" element
             */
            org.apache.xmlbeans.XmlString xgetExpirationDate();
            
            /**
             * True if has "ExpirationDate" element
             */
            boolean isSetExpirationDate();
            
            /**
             * Sets the "ExpirationDate" element
             */
            void setExpirationDate(java.lang.String expirationDate);
            
            /**
             * Sets (as xml) the "ExpirationDate" element
             */
            void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate);
            
            /**
             * Unsets the "ExpirationDate" element
             */
            void unsetExpirationDate();
            
            /**
             * Gets the "RewardIssued" element
             */
            java.math.BigDecimal getRewardIssued();
            
            /**
             * Gets (as xml) the "RewardIssued" element
             */
            org.apache.xmlbeans.XmlDecimal xgetRewardIssued();
            
            /**
             * Sets the "RewardIssued" element
             */
            void setRewardIssued(java.math.BigDecimal rewardIssued);
            
            /**
             * Sets (as xml) the "RewardIssued" element
             */
            void xsetRewardIssued(org.apache.xmlbeans.XmlDecimal rewardIssued);
            
            /**
             * Gets the "RewardUnits" element
             */
            java.math.BigDecimal getRewardUnits();
            
            /**
             * Gets (as xml) the "RewardUnits" element
             */
            org.apache.xmlbeans.XmlDecimal xgetRewardUnits();
            
            /**
             * Sets the "RewardUnits" element
             */
            void setRewardUnits(java.math.BigDecimal rewardUnits);
            
            /**
             * Sets (as xml) the "RewardUnits" element
             */
            void xsetRewardUnits(org.apache.xmlbeans.XmlDecimal rewardUnits);
            
            /**
             * Gets the "Limit" element
             */
            com.excentus.en.webservice.offers.LimitDocument.Limit getLimit();
            
            /**
             * True if has "Limit" element
             */
            boolean isSetLimit();
            
            /**
             * Sets the "Limit" element
             */
            void setLimit(com.excentus.en.webservice.offers.LimitDocument.Limit limit);
            
            /**
             * Appends and returns a new empty "Limit" element
             */
            com.excentus.en.webservice.offers.LimitDocument.Limit addNewLimit();
            
            /**
             * Unsets the "Limit" element
             */
            void unsetLimit();
            
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
            com.excentus.en.webservice.offers.RewardType.Enum getType();
            
            /**
             * Gets (as xml) the "type" attribute
             */
            com.excentus.en.webservice.offers.RewardType xgetType();
            
            /**
             * Sets the "type" attribute
             */
            void setType(com.excentus.en.webservice.offers.RewardType.Enum type);
            
            /**
             * Sets (as xml) the "type" attribute
             */
            void xsetType(com.excentus.en.webservice.offers.RewardType type);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward newInstance() {
                  return (com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.excentus.en.webservice.offers.RewardsDocument.Rewards.Reward) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.offers.RewardsDocument.Rewards newInstance() {
              return (com.excentus.en.webservice.offers.RewardsDocument.Rewards) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.offers.RewardsDocument.Rewards newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.offers.RewardsDocument.Rewards) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.RewardsDocument newInstance() {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.RewardsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.RewardsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.RewardsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
