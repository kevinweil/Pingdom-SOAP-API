/**
 * Report_GetNotificationsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetNotificationsResponse  implements java.io.Serializable {
    private int status;

    private com.pingdom.ws.soap.Report_GetNotificationsResponseItem[] getNotificationsResponseArray;

    public Report_GetNotificationsResponse() {
    }

    public Report_GetNotificationsResponse(
           int status,
           com.pingdom.ws.soap.Report_GetNotificationsResponseItem[] getNotificationsResponseArray) {
           this.status = status;
           this.getNotificationsResponseArray = getNotificationsResponseArray;
    }


    /**
     * Gets the status value for this Report_GetNotificationsResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_GetNotificationsResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the getNotificationsResponseArray value for this Report_GetNotificationsResponse.
     * 
     * @return getNotificationsResponseArray
     */
    public com.pingdom.ws.soap.Report_GetNotificationsResponseItem[] getGetNotificationsResponseArray() {
        return getNotificationsResponseArray;
    }


    /**
     * Sets the getNotificationsResponseArray value for this Report_GetNotificationsResponse.
     * 
     * @param getNotificationsResponseArray
     */
    public void setGetNotificationsResponseArray(com.pingdom.ws.soap.Report_GetNotificationsResponseItem[] getNotificationsResponseArray) {
        this.getNotificationsResponseArray = getNotificationsResponseArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetNotificationsResponse)) return false;
        Report_GetNotificationsResponse other = (Report_GetNotificationsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.getNotificationsResponseArray==null && other.getGetNotificationsResponseArray()==null) || 
             (this.getNotificationsResponseArray!=null &&
              java.util.Arrays.equals(this.getNotificationsResponseArray, other.getGetNotificationsResponseArray())));
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
        if (getGetNotificationsResponseArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetNotificationsResponseArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetNotificationsResponseArray(), i);
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
        new org.apache.axis.description.TypeDesc(Report_GetNotificationsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNotificationsResponseArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getNotificationsResponseArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponseItem"));
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
