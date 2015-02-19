/*
 * An XML document type.
 * Localname: LoadToCardRequest
 * Namespace: http://beans.webservices.icoke.com/v1_0/Coupon
 * Java type: com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.icoke.webservices.beans.v10.coupon;


/**
 * A document containing one LoadToCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon) element.
 *
 * This is a complex type.
 */
public interface LoadToCardRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadToCardRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("loadtocardrequest97fedoctype");
    
    /**
     * Gets the "LoadToCardRequest" element
     */
    com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest getLoadToCardRequest();
    
    /**
     * Sets the "LoadToCardRequest" element
     */
    void setLoadToCardRequest(com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest loadToCardRequest);
    
    /**
     * Appends and returns a new empty "LoadToCardRequest" element
     */
    com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest addNewLoadToCardRequest();
    
    /**
     * An XML LoadToCardRequest(@http://beans.webservices.icoke.com/v1_0/Coupon).
     *
     * This is a complex type.
     */
    public interface LoadToCardRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadToCardRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("loadtocardrequest30d4elemtype");
        
        /**
         * Gets the "processorCode" element
         */
        java.lang.String getProcessorCode();
        
        /**
         * Gets (as xml) the "processorCode" element
         */
        org.apache.xmlbeans.XmlString xgetProcessorCode();
        
        /**
         * Sets the "processorCode" element
         */
        void setProcessorCode(java.lang.String processorCode);
        
        /**
         * Sets (as xml) the "processorCode" element
         */
        void xsetProcessorCode(org.apache.xmlbeans.XmlString processorCode);
        
        /**
         * Gets the "retailerCode" element
         */
        java.lang.String getRetailerCode();
        
        /**
         * Gets (as xml) the "retailerCode" element
         */
        org.apache.xmlbeans.XmlString xgetRetailerCode();
        
        /**
         * Sets the "retailerCode" element
         */
        void setRetailerCode(java.lang.String retailerCode);
        
        /**
         * Sets (as xml) the "retailerCode" element
         */
        void xsetRetailerCode(org.apache.xmlbeans.XmlString retailerCode);
        
        /**
         * Gets the "cardNumber" element
         */
        java.lang.String getCardNumber();
        
        /**
         * Gets (as xml) the "cardNumber" element
         */
        org.apache.xmlbeans.XmlString xgetCardNumber();
        
        /**
         * Sets the "cardNumber" element
         */
        void setCardNumber(java.lang.String cardNumber);
        
        /**
         * Sets (as xml) the "cardNumber" element
         */
        void xsetCardNumber(org.apache.xmlbeans.XmlString cardNumber);
        
        /**
         * Gets the "consumerId" element
         */
        java.lang.String getConsumerId();
        
        /**
         * Gets (as xml) the "consumerId" element
         */
        org.apache.xmlbeans.XmlString xgetConsumerId();
        
        /**
         * Tests for nil "consumerId" element
         */
        boolean isNilConsumerId();
        
        /**
         * Sets the "consumerId" element
         */
        void setConsumerId(java.lang.String consumerId);
        
        /**
         * Sets (as xml) the "consumerId" element
         */
        void xsetConsumerId(org.apache.xmlbeans.XmlString consumerId);
        
        /**
         * Nils the "consumerId" element
         */
        void setNilConsumerId();
        
        /**
         * Gets the "transactionId" element
         */
        java.lang.String getTransactionId();
        
        /**
         * Gets (as xml) the "transactionId" element
         */
        org.apache.xmlbeans.XmlString xgetTransactionId();
        
        /**
         * Tests for nil "transactionId" element
         */
        boolean isNilTransactionId();
        
        /**
         * Sets the "transactionId" element
         */
        void setTransactionId(java.lang.String transactionId);
        
        /**
         * Sets (as xml) the "transactionId" element
         */
        void xsetTransactionId(org.apache.xmlbeans.XmlString transactionId);
        
        /**
         * Nils the "transactionId" element
         */
        void setNilTransactionId();
        
        /**
         * Gets the "couponId" element
         */
        java.lang.String getCouponId();
        
        /**
         * Gets (as xml) the "couponId" element
         */
        org.apache.xmlbeans.XmlString xgetCouponId();
        
        /**
         * Sets the "couponId" element
         */
        void setCouponId(java.lang.String couponId);
        
        /**
         * Sets (as xml) the "couponId" element
         */
        void xsetCouponId(org.apache.xmlbeans.XmlString couponId);
        
        /**
         * Gets the "couponDescription" element
         */
        java.lang.String getCouponDescription();
        
        /**
         * Gets (as xml) the "couponDescription" element
         */
        org.apache.xmlbeans.XmlString xgetCouponDescription();
        
        /**
         * Tests for nil "couponDescription" element
         */
        boolean isNilCouponDescription();
        
        /**
         * Sets the "couponDescription" element
         */
        void setCouponDescription(java.lang.String couponDescription);
        
        /**
         * Sets (as xml) the "couponDescription" element
         */
        void xsetCouponDescription(org.apache.xmlbeans.XmlString couponDescription);
        
        /**
         * Nils the "couponDescription" element
         */
        void setNilCouponDescription();
        
        /**
         * Gets the "couponStartDate" element
         */
        java.lang.String getCouponStartDate();
        
        /**
         * Gets (as xml) the "couponStartDate" element
         */
        org.apache.xmlbeans.XmlString xgetCouponStartDate();
        
        /**
         * Tests for nil "couponStartDate" element
         */
        boolean isNilCouponStartDate();
        
        /**
         * Sets the "couponStartDate" element
         */
        void setCouponStartDate(java.lang.String couponStartDate);
        
        /**
         * Sets (as xml) the "couponStartDate" element
         */
        void xsetCouponStartDate(org.apache.xmlbeans.XmlString couponStartDate);
        
        /**
         * Nils the "couponStartDate" element
         */
        void setNilCouponStartDate();
        
        /**
         * Gets the "couponEndDate" element
         */
        java.lang.String getCouponEndDate();
        
        /**
         * Gets (as xml) the "couponEndDate" element
         */
        org.apache.xmlbeans.XmlString xgetCouponEndDate();
        
        /**
         * Tests for nil "couponEndDate" element
         */
        boolean isNilCouponEndDate();
        
        /**
         * Sets the "couponEndDate" element
         */
        void setCouponEndDate(java.lang.String couponEndDate);
        
        /**
         * Sets (as xml) the "couponEndDate" element
         */
        void xsetCouponEndDate(org.apache.xmlbeans.XmlString couponEndDate);
        
        /**
         * Nils the "couponEndDate" element
         */
        void setNilCouponEndDate();
        
        /**
         * Gets the "couponValue" element
         */
        java.lang.String getCouponValue();
        
        /**
         * Gets (as xml) the "couponValue" element
         */
        org.apache.xmlbeans.XmlString xgetCouponValue();
        
        /**
         * Tests for nil "couponValue" element
         */
        boolean isNilCouponValue();
        
        /**
         * Sets the "couponValue" element
         */
        void setCouponValue(java.lang.String couponValue);
        
        /**
         * Sets (as xml) the "couponValue" element
         */
        void xsetCouponValue(org.apache.xmlbeans.XmlString couponValue);
        
        /**
         * Nils the "couponValue" element
         */
        void setNilCouponValue();
        
        /**
         * Gets the "channel" element
         */
        java.lang.String getChannel();
        
        /**
         * Gets (as xml) the "channel" element
         */
        org.apache.xmlbeans.XmlString xgetChannel();
        
        /**
         * Tests for nil "channel" element
         */
        boolean isNilChannel();
        
        /**
         * Sets the "channel" element
         */
        void setChannel(java.lang.String channel);
        
        /**
         * Sets (as xml) the "channel" element
         */
        void xsetChannel(org.apache.xmlbeans.XmlString channel);
        
        /**
         * Nils the "channel" element
         */
        void setNilChannel();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest newInstance() {
              return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument.LoadToCardRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument newInstance() {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.icoke.webservices.beans.v10.coupon.LoadToCardRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
