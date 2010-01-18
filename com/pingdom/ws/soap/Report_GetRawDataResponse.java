/**
 * Report_GetRawDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetRawDataResponse  implements java.io.Serializable {
    private int status;

    private com.pingdom.ws.soap.Report_RawDataEntry[] rawDataArray;

    public Report_GetRawDataResponse() {
    }

    public Report_GetRawDataResponse(
           int status,
           com.pingdom.ws.soap.Report_RawDataEntry[] rawDataArray) {
           this.status = status;
           this.rawDataArray = rawDataArray;
    }


    /**
     * Gets the status value for this Report_GetRawDataResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_GetRawDataResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the rawDataArray value for this Report_GetRawDataResponse.
     * 
     * @return rawDataArray
     */
    public com.pingdom.ws.soap.Report_RawDataEntry[] getRawDataArray() {
        return rawDataArray;
    }


    /**
     * Sets the rawDataArray value for this Report_GetRawDataResponse.
     * 
     * @param rawDataArray
     */
    public void setRawDataArray(com.pingdom.ws.soap.Report_RawDataEntry[] rawDataArray) {
        this.rawDataArray = rawDataArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetRawDataResponse)) return false;
        Report_GetRawDataResponse other = (Report_GetRawDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.rawDataArray==null && other.getRawDataArray()==null) || 
             (this.rawDataArray!=null &&
              java.util.Arrays.equals(this.rawDataArray, other.getRawDataArray())));
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
        _hashCode += getStatus();
        if (getRawDataArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRawDataArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRawDataArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_GetRawDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetRawDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawDataArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rawDataArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_RawDataEntry"));
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
