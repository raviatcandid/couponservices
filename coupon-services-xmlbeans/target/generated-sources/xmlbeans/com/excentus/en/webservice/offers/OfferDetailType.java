/*
 * XML Type:  OfferDetailType
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.OfferDetailType
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * An XML OfferDetailType(@http://webservice.en.excentus.com/Offers).
 *
 * This is an atomic type that is a restriction of com.excentus.en.webservice.offers.OfferDetailType.
 */
public interface OfferDetailType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfferDetailType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("offerdetailtypee672type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum UPC = Enum.forString("upc");
    static final Enum UPC_2 = Enum.forString("UPC");
    static final Enum PLU = Enum.forString("plu");
    static final Enum PLU_2 = Enum.forString("PLU");
    static final Enum DEPT = Enum.forString("dept");
    static final Enum DEPT_2 = Enum.forString("DEPT");
    static final Enum GROUP = Enum.forString("group");
    static final Enum GROUP_2 = Enum.forString("GROUP");
    static final Enum UPC_3 = Enum.forString("Upc");
    static final Enum PLU_3 = Enum.forString("Plu");
    static final Enum DEPT_3 = Enum.forString("Dept");
    static final Enum GROUP_3 = Enum.forString("Group");
    static final Enum FUEL = Enum.forString("Fuel");
    static final Enum FUEL_2 = Enum.forString("FUEL");
    static final Enum FUEL_3 = Enum.forString("fuel");
    
    static final int INT_UPC = Enum.INT_UPC;
    static final int INT_UPC_2 = Enum.INT_UPC_2;
    static final int INT_PLU = Enum.INT_PLU;
    static final int INT_PLU_2 = Enum.INT_PLU_2;
    static final int INT_DEPT = Enum.INT_DEPT;
    static final int INT_DEPT_2 = Enum.INT_DEPT_2;
    static final int INT_GROUP = Enum.INT_GROUP;
    static final int INT_GROUP_2 = Enum.INT_GROUP_2;
    static final int INT_UPC_3 = Enum.INT_UPC_3;
    static final int INT_PLU_3 = Enum.INT_PLU_3;
    static final int INT_DEPT_3 = Enum.INT_DEPT_3;
    static final int INT_GROUP_3 = Enum.INT_GROUP_3;
    static final int INT_FUEL = Enum.INT_FUEL;
    static final int INT_FUEL_2 = Enum.INT_FUEL_2;
    static final int INT_FUEL_3 = Enum.INT_FUEL_3;
    
    /**
     * Enumeration value class for com.excentus.en.webservice.offers.OfferDetailType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_UPC
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_UPC = 1;
        static final int INT_UPC_2 = 2;
        static final int INT_PLU = 3;
        static final int INT_PLU_2 = 4;
        static final int INT_DEPT = 5;
        static final int INT_DEPT_2 = 6;
        static final int INT_GROUP = 7;
        static final int INT_GROUP_2 = 8;
        static final int INT_UPC_3 = 9;
        static final int INT_PLU_3 = 10;
        static final int INT_DEPT_3 = 11;
        static final int INT_GROUP_3 = 12;
        static final int INT_FUEL = 13;
        static final int INT_FUEL_2 = 14;
        static final int INT_FUEL_3 = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("upc", INT_UPC),
                new Enum("UPC", INT_UPC_2),
                new Enum("plu", INT_PLU),
                new Enum("PLU", INT_PLU_2),
                new Enum("dept", INT_DEPT),
                new Enum("DEPT", INT_DEPT_2),
                new Enum("group", INT_GROUP),
                new Enum("GROUP", INT_GROUP_2),
                new Enum("Upc", INT_UPC_3),
                new Enum("Plu", INT_PLU_3),
                new Enum("Dept", INT_DEPT_3),
                new Enum("Group", INT_GROUP_3),
                new Enum("Fuel", INT_FUEL),
                new Enum("FUEL", INT_FUEL_2),
                new Enum("fuel", INT_FUEL_3),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.excentus.en.webservice.offers.OfferDetailType newValue(java.lang.Object obj) {
          return (com.excentus.en.webservice.offers.OfferDetailType) type.newValue( obj ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType newInstance() {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.OfferDetailType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OfferDetailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.OfferDetailType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.OfferDetailType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
