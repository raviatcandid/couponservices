/*
 * An XML document type.
 * Localname: RewardIssuanceRequest
 * Namespace: http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest
 * Java type: com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest;


/**
 * A document containing one RewardIssuanceRequest(@http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest) element.
 *
 * This is a complex type.
 */
public interface RewardIssuanceRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardIssuanceRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardissuancerequest662bdoctype");
    
    /**
     * Gets the "RewardIssuanceRequest" element
     */
    com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest getRewardIssuanceRequest();
    
    /**
     * Sets the "RewardIssuanceRequest" element
     */
    void setRewardIssuanceRequest(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest rewardIssuanceRequest);
    
    /**
     * Appends and returns a new empty "RewardIssuanceRequest" element
     */
    com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest addNewRewardIssuanceRequest();
    
    /**
     * An XML RewardIssuanceRequest(@http://request.issuance.webservice.en.excentus.com/ENWebRewardIssuanceService/RewardIssuanceRequest).
     *
     * This is a complex type.
     */
    public interface RewardIssuanceRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardIssuanceRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardissuancerequesteb7celemtype");
        
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
         * Gets the "Transaction" element
         */
        com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction getTransaction();
        
        /**
         * Sets the "Transaction" element
         */
        void setTransaction(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction transaction);
        
        /**
         * Appends and returns a new empty "Transaction" element
         */
        com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction addNewTransaction();
        
        /**
         * An XML Transaction(@).
         *
         * This is a complex type.
         */
        public interface Transaction extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("transaction75b6elemtype");
            
            /**
             * Gets the "BatchId" element
             */
            java.lang.String getBatchId();
            
            /**
             * Gets (as xml) the "BatchId" element
             */
            org.apache.xmlbeans.XmlString xgetBatchId();
            
            /**
             * Sets the "BatchId" element
             */
            void setBatchId(java.lang.String batchId);
            
            /**
             * Sets (as xml) the "BatchId" element
             */
            void xsetBatchId(org.apache.xmlbeans.XmlString batchId);
            
            /**
             * Gets the "ProcessingType" element
             */
            java.lang.String getProcessingType();
            
            /**
             * Gets (as xml) the "ProcessingType" element
             */
            org.apache.xmlbeans.XmlString xgetProcessingType();
            
            /**
             * Tests for nil "ProcessingType" element
             */
            boolean isNilProcessingType();
            
            /**
             * True if has "ProcessingType" element
             */
            boolean isSetProcessingType();
            
            /**
             * Sets the "ProcessingType" element
             */
            void setProcessingType(java.lang.String processingType);
            
            /**
             * Sets (as xml) the "ProcessingType" element
             */
            void xsetProcessingType(org.apache.xmlbeans.XmlString processingType);
            
            /**
             * Nils the "ProcessingType" element
             */
            void setNilProcessingType();
            
            /**
             * Unsets the "ProcessingType" element
             */
            void unsetProcessingType();
            
            /**
             * Gets the "Offline" element
             */
            boolean getOffline();
            
            /**
             * Gets (as xml) the "Offline" element
             */
            org.apache.xmlbeans.XmlBoolean xgetOffline();
            
            /**
             * Tests for nil "Offline" element
             */
            boolean isNilOffline();
            
            /**
             * True if has "Offline" element
             */
            boolean isSetOffline();
            
            /**
             * Sets the "Offline" element
             */
            void setOffline(boolean offline);
            
            /**
             * Sets (as xml) the "Offline" element
             */
            void xsetOffline(org.apache.xmlbeans.XmlBoolean offline);
            
            /**
             * Nils the "Offline" element
             */
            void setNilOffline();
            
            /**
             * Unsets the "Offline" element
             */
            void unsetOffline();
            
            /**
             * Gets the "LocalTransactionId" element
             */
            java.lang.String getLocalTransactionId();
            
            /**
             * Gets (as xml) the "LocalTransactionId" element
             */
            org.apache.xmlbeans.XmlString xgetLocalTransactionId();
            
            /**
             * Sets the "LocalTransactionId" element
             */
            void setLocalTransactionId(java.lang.String localTransactionId);
            
            /**
             * Sets (as xml) the "LocalTransactionId" element
             */
            void xsetLocalTransactionId(org.apache.xmlbeans.XmlString localTransactionId);
            
            /**
             * Gets the "TotalTransactionAmount" element
             */
            java.math.BigDecimal getTotalTransactionAmount();
            
            /**
             * Gets (as xml) the "TotalTransactionAmount" element
             */
            org.apache.xmlbeans.XmlDecimal xgetTotalTransactionAmount();
            
            /**
             * Sets the "TotalTransactionAmount" element
             */
            void setTotalTransactionAmount(java.math.BigDecimal totalTransactionAmount);
            
            /**
             * Sets (as xml) the "TotalTransactionAmount" element
             */
            void xsetTotalTransactionAmount(org.apache.xmlbeans.XmlDecimal totalTransactionAmount);
            
            /**
             * Gets the "TaxAmount" element
             */
            java.math.BigDecimal getTaxAmount();
            
            /**
             * Gets (as xml) the "TaxAmount" element
             */
            org.apache.xmlbeans.XmlDecimal xgetTaxAmount();
            
            /**
             * True if has "TaxAmount" element
             */
            boolean isSetTaxAmount();
            
            /**
             * Sets the "TaxAmount" element
             */
            void setTaxAmount(java.math.BigDecimal taxAmount);
            
            /**
             * Sets (as xml) the "TaxAmount" element
             */
            void xsetTaxAmount(org.apache.xmlbeans.XmlDecimal taxAmount);
            
            /**
             * Unsets the "TaxAmount" element
             */
            void unsetTaxAmount();
            
            /**
             * Gets the "RewardEligibleAmount" element
             */
            java.math.BigDecimal getRewardEligibleAmount();
            
            /**
             * Gets (as xml) the "RewardEligibleAmount" element
             */
            org.apache.xmlbeans.XmlDecimal xgetRewardEligibleAmount();
            
            /**
             * Sets the "RewardEligibleAmount" element
             */
            void setRewardEligibleAmount(java.math.BigDecimal rewardEligibleAmount);
            
            /**
             * Sets (as xml) the "RewardEligibleAmount" element
             */
            void xsetRewardEligibleAmount(org.apache.xmlbeans.XmlDecimal rewardEligibleAmount);
            
            /**
             * Gets the "TotalDiscountIssued" element
             */
            java.math.BigDecimal getTotalDiscountIssued();
            
            /**
             * Gets (as xml) the "TotalDiscountIssued" element
             */
            org.apache.xmlbeans.XmlDecimal xgetTotalDiscountIssued();
            
            /**
             * True if has "TotalDiscountIssued" element
             */
            boolean isSetTotalDiscountIssued();
            
            /**
             * Sets the "TotalDiscountIssued" element
             */
            void setTotalDiscountIssued(java.math.BigDecimal totalDiscountIssued);
            
            /**
             * Sets (as xml) the "TotalDiscountIssued" element
             */
            void xsetTotalDiscountIssued(org.apache.xmlbeans.XmlDecimal totalDiscountIssued);
            
            /**
             * Unsets the "TotalDiscountIssued" element
             */
            void unsetTotalDiscountIssued();
            
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
             * Gets the "Details" element
             */
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details getDetails();
            
            /**
             * True if has "Details" element
             */
            boolean isSetDetails();
            
            /**
             * Sets the "Details" element
             */
            void setDetails(com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details details);
            
            /**
             * Appends and returns a new empty "Details" element
             */
            com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.DetailsDocument.Details addNewDetails();
            
            /**
             * Unsets the "Details" element
             */
            void unsetDetails();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction newInstance() {
                  return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest.Transaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest newInstance() {
              return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument.RewardIssuanceRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument newInstance() {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.issuance.request.enWebRewardIssuanceService.rewardIssuanceRequest.RewardIssuanceRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
