/*
 * An XML document type.
 * Localname: Item
 * Namespace: http://webservice.en.excentus.com/Items
 * Java type: com.excentus.en.webservice.items.ItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.items;


/**
 * A document containing one Item(@http://webservice.en.excentus.com/Items) element.
 *
 * This is a complex type.
 */
public interface ItemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("itemcbb3doctype");
    
    /**
     * Gets the "Item" element
     */
    com.excentus.en.webservice.items.ItemDocument.Item getItem();
    
    /**
     * Sets the "Item" element
     */
    void setItem(com.excentus.en.webservice.items.ItemDocument.Item item);
    
    /**
     * Appends and returns a new empty "Item" element
     */
    com.excentus.en.webservice.items.ItemDocument.Item addNewItem();
    
    /**
     * An XML Item(@http://webservice.en.excentus.com/Items).
     *
     * This is a complex type.
     */
    public interface Item extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("item6404elemtype");
        
        /**
         * Gets the "Code" element
         */
        java.lang.String getCode();
        
        /**
         * Gets (as xml) the "Code" element
         */
        org.apache.xmlbeans.XmlString xgetCode();
        
        /**
         * Sets the "Code" element
         */
        void setCode(java.lang.String code);
        
        /**
         * Sets (as xml) the "Code" element
         */
        void xsetCode(org.apache.xmlbeans.XmlString code);
        
        /**
         * Gets the "Dept" element
         */
        java.lang.String getDept();
        
        /**
         * Gets (as xml) the "Dept" element
         */
        org.apache.xmlbeans.XmlString xgetDept();
        
        /**
         * True if has "Dept" element
         */
        boolean isSetDept();
        
        /**
         * Sets the "Dept" element
         */
        void setDept(java.lang.String dept);
        
        /**
         * Sets (as xml) the "Dept" element
         */
        void xsetDept(org.apache.xmlbeans.XmlString dept);
        
        /**
         * Unsets the "Dept" element
         */
        void unsetDept();
        
        /**
         * Gets the "Units" element
         */
        java.math.BigDecimal getUnits();
        
        /**
         * Gets (as xml) the "Units" element
         */
        org.apache.xmlbeans.XmlDecimal xgetUnits();
        
        /**
         * Sets the "Units" element
         */
        void setUnits(java.math.BigDecimal units);
        
        /**
         * Sets (as xml) the "Units" element
         */
        void xsetUnits(org.apache.xmlbeans.XmlDecimal units);
        
        /**
         * Gets the "UnitType" element
         */
        java.lang.String getUnitType();
        
        /**
         * Gets (as xml) the "UnitType" element
         */
        org.apache.xmlbeans.XmlString xgetUnitType();
        
        /**
         * Sets the "UnitType" element
         */
        void setUnitType(java.lang.String unitType);
        
        /**
         * Sets (as xml) the "UnitType" element
         */
        void xsetUnitType(org.apache.xmlbeans.XmlString unitType);
        
        /**
         * Gets the "ItemPrice" element
         */
        java.math.BigDecimal getItemPrice();
        
        /**
         * Gets (as xml) the "ItemPrice" element
         */
        org.apache.xmlbeans.XmlDecimal xgetItemPrice();
        
        /**
         * Sets the "ItemPrice" element
         */
        void setItemPrice(java.math.BigDecimal itemPrice);
        
        /**
         * Sets (as xml) the "ItemPrice" element
         */
        void xsetItemPrice(org.apache.xmlbeans.XmlDecimal itemPrice);
        
        /**
         * Gets the "type" attribute
         */
        com.excentus.en.webservice.items.ItemType.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.excentus.en.webservice.items.ItemType xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.excentus.en.webservice.items.ItemType.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.excentus.en.webservice.items.ItemType type);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.excentus.en.webservice.items.ItemDocument.Item newInstance() {
              return (com.excentus.en.webservice.items.ItemDocument.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.excentus.en.webservice.items.ItemDocument.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.excentus.en.webservice.items.ItemDocument.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.items.ItemDocument newInstance() {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.items.ItemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.items.ItemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.items.ItemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.items.ItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.items.ItemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.items.ItemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
