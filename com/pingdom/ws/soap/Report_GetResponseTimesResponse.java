/**
 * Report_GetResponseTimesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetResponseTimesResponse  implements java.io.Serializable {
    private int status;

    private com.pingdom.ws.soap.Report_ResponseTimeEntry[] responseTimesArray;

    public Report_GetResponseTimesResponse() {
    }

    public Report_GetResponseTimesResponse(
           int status,
           com.pingdom.ws.soap.Report_ResponseTimeEntry[] responseTimesArray) {
           this.status = status;
           this.responseTimesArray = responseTimesArray;
    }


    /**
     * Gets the status value for this Report_GetResponseTimesResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_GetResponseTimesResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the responseTimesArray value for this Report_GetResponseTimesResponse.
     * 
     * @return responseTimesArray
     */
    public com.pingdom.ws.soap.Report_ResponseTimeEntry[] getResponseTimesArray() {
        return responseTimesArray;
    }


    /**
     * Sets the responseTimesArray value for this Report_GetResponseTimesResponse.
     * 
     * @param responseTimesArray
     */
    public void setResponseTimesArray(com.pingdom.ws.soap.Report_ResponseTimeEntry[] responseTimesArray) {
        this.responseTimesArray = responseTimesArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetResponseTimesResponse)) return false;
        Report_GetResponseTimesResponse other = (Report_GetResponseTimesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.responseTimesArray==null && other.getResponseTimesArray()==null) || 
             (this.responseTimesArray!=null &&
              java.util.Arrays.equals(this.responseTimesArray, other.getResponseTimesArray())));
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
        if (getResponseTimesArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseTimesArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseTimesArray(), i);
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
        new org.apache.axis.description.TypeDesc(Report_GetResponseTimesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetResponseTimesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTimesArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseTimesArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_ResponseTimeEntry"));
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
