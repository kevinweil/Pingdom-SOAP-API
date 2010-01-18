/**
 * Check_GetCheckIdsByNamesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Check_GetCheckIdsByNamesRequest  implements java.io.Serializable {
    private java.lang.String[] checkNames;

    public Check_GetCheckIdsByNamesRequest() {
    }

    public Check_GetCheckIdsByNamesRequest(
           java.lang.String[] checkNames) {
           this.checkNames = checkNames;
    }


    /**
     * Gets the checkNames value for this Check_GetCheckIdsByNamesRequest.
     * 
     * @return checkNames
     */
    public java.lang.String[] getCheckNames() {
        return checkNames;
    }


    /**
     * Sets the checkNames value for this Check_GetCheckIdsByNamesRequest.
     * 
     * @param checkNames
     */
    public void setCheckNames(java.lang.String[] checkNames) {
        this.checkNames = checkNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Check_GetCheckIdsByNamesRequest)) return false;
        Check_GetCheckIdsByNamesRequest other = (Check_GetCheckIdsByNamesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkNames==null && other.getCheckNames()==null) || 
             (this.checkNames!=null &&
              java.util.Arrays.equals(this.checkNames, other.getCheckNames())));
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
        if (getCheckNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCheckNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCheckNames(), i);
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
        new org.apache.axis.description.TypeDesc(Check_GetCheckIdsByNamesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckIdsByNamesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkNames"));
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
