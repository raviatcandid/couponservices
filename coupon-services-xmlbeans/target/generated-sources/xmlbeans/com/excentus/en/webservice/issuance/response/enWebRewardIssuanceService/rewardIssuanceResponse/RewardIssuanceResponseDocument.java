/*
 * An XML document type.
 * Localname: RewardIssuanceResponse
 * Namespace: http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse
 * Java type: com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse;


/**
 * A document containing one RewardIssuanceResponse(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse) element.
 *
 * This is a complex type.
 */
public interface RewardIssuanceResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardIssuanceResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardissuanceresponse072bdoctype");
    
    /**
     * Gets the "RewardIssuanceResponse" element
     */
    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse getRewardIssuanceResponse();
    
    /**
     * Sets the "RewardIssuanceResponse" element
     */
    void setRewardIssuanceResponse(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse rewardIssuanceResponse);
    
    /**
     * Appends and returns a new empty "RewardIssuanceResponse" element
     */
    com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse addNewRewardIssuanceResponse();
    
    /**
     * An XML RewardIssuanceResponse(@http://response.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceResponse).
     *
     * This is a complex type.
     */
    public interface RewardIssuanceResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardIssuanceResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardissuanceresponsed884elemtype");
        
        /**
         * Gets the "Header" element
         */
        com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header getHeader();
        
        /**
         * Sets the "Header" element
         */
        void setHeader(com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header header);
        
        /**
         * Appends and returns a new empty "Header" element
         */
        com.excentus.en.webservice.enWebService.headerRequest.HeaderDocument.Header addNewHeader();
        
        /**
         * Gets the "ReferenceId" element
         */
        java.lang.String getReferenceId();
        
        /**
         * Gets (as xml) the "ReferenceId" element
         */
        org.apache.xmlbeans.XmlString xgetReferenceId();
        
        /**
         * Sets the "ReferenceId" element
         */
        void setReferenceId(java.lang.String referenceId);
        
        /**
         * Sets (as xml) the "ReferenceId" element
         */
        void xsetReferenceId(org.apache.xmlbeans.XmlString referenceId);
        
        /**
         * Gets the "Errors" element
         */
        com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors getErrors();
        
        /**
         * True if has "Errors" element
         */
        boolean isSetErrors();
        
        /**
         * Sets the "Errors" element
         */
        void setErrors(com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors errors);
        
        /**
         * Appends and returns a new empty "Errors" element
         */
        com.excentus.en.webservice.error.enWebService.error.ErrorsDocument.Errors addNewErrors();
        
        /**
         * Unsets the "Errors" element
         */
        void unsetErrors();
        
        /**
         * Gets the "RewardSummary" element
         */
        com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary getRewardSummary();
        
        /**
         * True if has "RewardSummary" element
         */
        boolean isSetRewardSummary();
        
        /**
         * Sets the "RewardSummary" element
         */
        void setRewardSummary(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary rewardSummary);
        
        /**
         * Appends and returns a new empty "RewardSummary" element
         */
        com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary addNewRewardSummary();
        
        /**
         * Unsets the "RewardSummary" element
         */
        void unsetRewardSummary();
        
        /**
         * Gets the "OfferSummary" element
         */
        com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary getOfferSummary();
        
        /**
         * True if has "OfferSummary" element
         */
        boolean isSetOfferSummary();
        
        /**
         * Sets the "OfferSummary" element
         */
        void setOfferSummary(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary offerSummary);
        
        /**
         * Appends and returns a new empty "OfferSummary" element
         */
        com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary addNewOfferSummary();
        
        /**
         * Unsets the "OfferSummary" element
         */
        void unsetOfferSummary();
        
        /**
         * An XML RewardSummary(@).
         *
         * This is a complex type.
         */
        public interface RewardSummary extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardsummaryef57elemtype");
            
            /**
             * Gets the "RewardEarned" element
             */
            java.math.BigDecimal getRewardEarned();
            
            /**
             * Gets (as xml) the "RewardEarned" element
             */
            org.apache.xmlbeans.XmlDecimal xgetRewardEarned();
            
            /**
             * Sets the "RewardEarned" element
             */
            void setRewardEarned(java.math.BigDecimal rewardEarned);
            
            /**
             * Sets (as xml) the "RewardEarned" element
             */
            void xsetRewardEarned(org.apache.xmlbeans.XmlDecimal rewardEarned);
            
            /**
             * Gets the "Limit" element
             */
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit getLimit();
            
            /**
             * Sets the "Limit" element
             */
            void setLimit(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit limit);
            
            /**
             * Appends and returns a new empty "Limit" element
             */
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.LimitDocument.Limit addNewLimit();
            
            /**
             * Gets the "RewardExpirationDate" element
             */
            java.lang.String getRewardExpirationDate();
            
            /**
             * Gets (as xml) the "RewardExpirationDate" element
             */
            org.apache.xmlbeans.XmlString xgetRewardExpirationDate();
            
            /**
             * Sets the "RewardExpirationDate" element
             */
            void setRewardExpirationDate(java.lang.String rewardExpirationDate);
            
            /**
             * Sets (as xml) the "RewardExpirationDate" element
             */
            void xsetRewardExpirationDate(org.apache.xmlbeans.XmlString rewardExpirationDate);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary newInstance() {
                  return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.RewardSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML OfferSummary(@).
         *
         * This is a complex type.
         */
        public interface OfferSummary extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offersummary2edaelemtype");
            
            /**
             * Gets array of all "Offer" elements
             */
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer[] getOfferArray();
            
            /**
             * Gets ith "Offer" element
             */
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer getOfferArray(int i);
            
            /**
             * Returns number of "Offer" element
             */
            int sizeOfOfferArray();
            
            /**
             * Sets array of all "Offer" element
             */
            void setOfferArray(com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer[] offerArray);
            
            /**
             * Sets ith "Offer" element
             */
            void setOfferArray(int i, com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer offer);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Offer" element
             */
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer insertNewOffer(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Offer" element
             */
            com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.OfferDocument.Offer addNewOffer();
            
            /**
             * Removes the ith "Offer" element
             */
            void removeOffer(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary newInstance() {
                  return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse.OfferSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse newInstance() {
              return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument.RewardIssuanceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument newInstance() {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.issuance.response.enWebRewardIssuanceService.rewardIssuanceResponse.RewardIssuanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
