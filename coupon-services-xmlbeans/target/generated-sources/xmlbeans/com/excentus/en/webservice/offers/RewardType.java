/*
 * XML Type:  RewardType
 * Namespace: http://webservice.en.excentus.com/Offers
 * Java type: com.excentus.en.webservice.offers.RewardType
 *
 * Automatically generated - do not modify.
 */
package com.excentus.en.webservice.offers;


/**
 * An XML RewardType(@http://webservice.en.excentus.com/Offers).
 *
 * This is an atomic type that is a restriction of com.excentus.en.webservice.offers.RewardType.
 */
public interface RewardType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RewardType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s125BD9DE0702E21442CE56CE1E1E90F8").resolveHandle("rewardtypec79etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CPG = Enum.forString("CPG");
    static final Enum CPG_2 = Enum.forString("cpg");
    static final Enum PPG = Enum.forString("PPG");
    static final Enum PPG_2 = Enum.forString("ppg");
    
    static final int INT_CPG = Enum.INT_CPG;
    static final int INT_CPG_2 = Enum.INT_CPG_2;
    static final int INT_PPG = Enum.INT_PPG;
    static final int INT_PPG_2 = Enum.INT_PPG_2;
    
    /**
     * Enumeration value class for com.excentus.en.webservice.offers.RewardType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CPG
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
        
        static final int INT_CPG = 1;
        static final int INT_CPG_2 = 2;
        static final int INT_PPG = 3;
        static final int INT_PPG_2 = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("CPG", INT_CPG),
                new Enum("cpg", INT_CPG_2),
                new Enum("PPG", INT_PPG),
                new Enum("ppg", INT_PPG_2),
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
        public static com.excentus.en.webservice.offers.RewardType newValue(java.lang.Object obj) {
          return (com.excentus.en.webservice.offers.RewardType) type.newValue( obj ); }
        
        public static com.excentus.en.webservice.offers.RewardType newInstance() {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.excentus.en.webservice.offers.RewardType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.excentus.en.webservice.offers.RewardType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.excentus.en.webservice.offers.RewardType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.RewardType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.excentus.en.webservice.offers.RewardType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.excentus.en.webservice.offers.RewardType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
