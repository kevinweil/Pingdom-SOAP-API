/**
 * Check_GetCheckIdsByNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Check_GetCheckIdsByNamesResponse  implements java.io.Serializable {
    private int status;

    private int[] checkIds;

    public Check_GetCheckIdsByNamesResponse() {
    }

    public Check_GetCheckIdsByNamesResponse(
           int status,
           int[] checkIds) {
           this.status = status;
           this.checkIds = checkIds;
    }


    /**
     * Gets the status value for this Check_GetCheckIdsByNamesResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Check_GetCheckIdsByNamesResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the checkIds value for this Check_GetCheckIdsByNamesResponse.
     * 
     * @return checkIds
     */
    public int[] getCheckIds() {
        return checkIds;
    }


    /**
     * Sets the checkIds value for this Check_GetCheckIdsByNamesResponse.
     * 
     * @param checkIds
     */
    public void setCheckIds(int[] checkIds) {
        this.checkIds = checkIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Check_GetCheckIdsByNamesResponse)) return false;
        Check_GetCheckIdsByNamesResponse other = (Check_GetCheckIdsByNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.checkIds==null && other.getCheckIds()==null) || 
             (this.checkIds!=null &&
              java.util.Arrays.equals(this.checkIds, other.getCheckIds())));
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
        if (getCheckIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCheckIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCheckIds(), i);
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
        new org.apache.axis.description.TypeDesc(Check_GetCheckIdsByNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckIdsByNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkIds"));
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
