/**
 * Report_NotificationStatusItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_NotificationStatusItem implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Report_NotificationStatusItem(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SENT = "SENT";
    public static final java.lang.String _DELIVERED = "DELIVERED";
    public static final java.lang.String _NOT_DELIVERED = "NOT_DELIVERED";
    public static final java.lang.String _NO_CREDITS = "NO_CREDITS";
    public static final java.lang.String _ERROR = "ERROR";
    public static final Report_NotificationStatusItem SENT = new Report_NotificationStatusItem(_SENT);
    public static final Report_NotificationStatusItem DELIVERED = new Report_NotificationStatusItem(_DELIVERED);
    public static final Report_NotificationStatusItem NOT_DELIVERED = new Report_NotificationStatusItem(_NOT_DELIVERED);
    public static final Report_NotificationStatusItem NO_CREDITS = new Report_NotificationStatusItem(_NO_CREDITS);
    public static final Report_NotificationStatusItem ERROR = new Report_NotificationStatusItem(_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static Report_NotificationStatusItem fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Report_NotificationStatusItem enumeration = (Report_NotificationStatusItem)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Report_NotificationStatusItem fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_NotificationStatusItem.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationStatusItem"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
