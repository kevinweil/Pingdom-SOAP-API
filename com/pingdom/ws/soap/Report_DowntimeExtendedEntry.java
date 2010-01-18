/**
 * Report_DowntimeExtendedEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_DowntimeExtendedEntry  implements java.io.Serializable {
    private java.util.Calendar from;

    private java.util.Calendar to;

    private int total_time;

    private int downtimes_duration;

    private int unknown_duration;

    public Report_DowntimeExtendedEntry() {
    }

    public Report_DowntimeExtendedEntry(
           java.util.Calendar from,
           java.util.Calendar to,
           int total_time,
           int downtimes_duration,
           int unknown_duration) {
           this.from = from;
           this.to = to;
           this.total_time = total_time;
           this.downtimes_duration = downtimes_duration;
           this.unknown_duration = unknown_duration;
    }


    /**
     * Gets the from value for this Report_DowntimeExtendedEntry.
     * 
     * @return from
     */
    public java.util.Calendar getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Report_DowntimeExtendedEntry.
     * 
     * @param from
     */
    public void setFrom(java.util.Calendar from) {
        this.from = from;
    }


    /**
     * Gets the to value for this Report_DowntimeExtendedEntry.
     * 
     * @return to
     */
    public java.util.Calendar getTo() {
        return to;
    }


    /**
     * Sets the to value for this Report_DowntimeExtendedEntry.
     * 
     * @param to
     */
    public void setTo(java.util.Calendar to) {
        this.to = to;
    }


    /**
     * Gets the total_time value for this Report_DowntimeExtendedEntry.
     * 
     * @return total_time
     */
    public int getTotal_time() {
        return total_time;
    }


    /**
     * Sets the total_time value for this Report_DowntimeExtendedEntry.
     * 
     * @param total_time
     */
    public void setTotal_time(int total_time) {
        this.total_time = total_time;
    }


    /**
     * Gets the downtimes_duration value for this Report_DowntimeExtendedEntry.
     * 
     * @return downtimes_duration
     */
    public int getDowntimes_duration() {
        return downtimes_duration;
    }


    /**
     * Sets the downtimes_duration value for this Report_DowntimeExtendedEntry.
     * 
     * @param downtimes_duration
     */
    public void setDowntimes_duration(int downtimes_duration) {
        this.downtimes_duration = downtimes_duration;
    }


    /**
     * Gets the unknown_duration value for this Report_DowntimeExtendedEntry.
     * 
     * @return unknown_duration
     */
    public int getUnknown_duration() {
        return unknown_duration;
    }


    /**
     * Sets the unknown_duration value for this Report_DowntimeExtendedEntry.
     * 
     * @param unknown_duration
     */
    public void setUnknown_duration(int unknown_duration) {
        this.unknown_duration = unknown_duration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_DowntimeExtendedEntry)) return false;
        Report_DowntimeExtendedEntry other = (Report_DowntimeExtendedEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            this.total_time == other.getTotal_time() &&
            this.downtimes_duration == other.getDowntimes_duration() &&
            this.unknown_duration == other.getUnknown_duration();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        _hashCode += getTotal_time();
        _hashCode += getDowntimes_duration();
        _hashCode += getUnknown_duration();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_DowntimeExtendedEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimeExtendedEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downtimes_duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downtimes_duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unknown_duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unknown_duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
