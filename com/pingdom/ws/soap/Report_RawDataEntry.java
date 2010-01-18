/**
 * Report_RawDataEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_RawDataEntry  implements java.io.Serializable {
    private java.util.Calendar checkTime;

    private com.pingdom.ws.soap.Report_CheckState checkState;

    private float responseTime;

    private java.lang.String location;

    public Report_RawDataEntry() {
    }

    public Report_RawDataEntry(
           java.util.Calendar checkTime,
           com.pingdom.ws.soap.Report_CheckState checkState,
           float responseTime,
           java.lang.String location) {
           this.checkTime = checkTime;
           this.checkState = checkState;
           this.responseTime = responseTime;
           this.location = location;
    }


    /**
     * Gets the checkTime value for this Report_RawDataEntry.
     * 
     * @return checkTime
     */
    public java.util.Calendar getCheckTime() {
        return checkTime;
    }


    /**
     * Sets the checkTime value for this Report_RawDataEntry.
     * 
     * @param checkTime
     */
    public void setCheckTime(java.util.Calendar checkTime) {
        this.checkTime = checkTime;
    }


    /**
     * Gets the checkState value for this Report_RawDataEntry.
     * 
     * @return checkState
     */
    public com.pingdom.ws.soap.Report_CheckState getCheckState() {
        return checkState;
    }


    /**
     * Sets the checkState value for this Report_RawDataEntry.
     * 
     * @param checkState
     */
    public void setCheckState(com.pingdom.ws.soap.Report_CheckState checkState) {
        this.checkState = checkState;
    }


    /**
     * Gets the responseTime value for this Report_RawDataEntry.
     * 
     * @return responseTime
     */
    public float getResponseTime() {
        return responseTime;
    }


    /**
     * Sets the responseTime value for this Report_RawDataEntry.
     * 
     * @param responseTime
     */
    public void setResponseTime(float responseTime) {
        this.responseTime = responseTime;
    }


    /**
     * Gets the location value for this Report_RawDataEntry.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Report_RawDataEntry.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_RawDataEntry)) return false;
        Report_RawDataEntry other = (Report_RawDataEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkTime==null && other.getCheckTime()==null) || 
             (this.checkTime!=null &&
              this.checkTime.equals(other.getCheckTime()))) &&
            ((this.checkState==null && other.getCheckState()==null) || 
             (this.checkState!=null &&
              this.checkState.equals(other.getCheckState()))) &&
            this.responseTime == other.getResponseTime() &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getCheckTime() != null) {
            _hashCode += getCheckTime().hashCode();
        }
        if (getCheckState() != null) {
            _hashCode += getCheckState().hashCode();
        }
        _hashCode += new Float(getResponseTime()).hashCode();
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_RawDataEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_RawDataEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
