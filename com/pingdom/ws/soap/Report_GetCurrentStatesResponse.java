/**
 * Report_GetCurrentStatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetCurrentStatesResponse  implements java.io.Serializable {
    private int status;

    private com.pingdom.ws.soap.Report_CheckStateEntry[] currentStates;

    public Report_GetCurrentStatesResponse() {
    }

    public Report_GetCurrentStatesResponse(
           int status,
           com.pingdom.ws.soap.Report_CheckStateEntry[] currentStates) {
           this.status = status;
           this.currentStates = currentStates;
    }


    /**
     * Gets the status value for this Report_GetCurrentStatesResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_GetCurrentStatesResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the currentStates value for this Report_GetCurrentStatesResponse.
     * 
     * @return currentStates
     */
    public com.pingdom.ws.soap.Report_CheckStateEntry[] getCurrentStates() {
        return currentStates;
    }


    /**
     * Sets the currentStates value for this Report_GetCurrentStatesResponse.
     * 
     * @param currentStates
     */
    public void setCurrentStates(com.pingdom.ws.soap.Report_CheckStateEntry[] currentStates) {
        this.currentStates = currentStates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetCurrentStatesResponse)) return false;
        Report_GetCurrentStatesResponse other = (Report_GetCurrentStatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.currentStates==null && other.getCurrentStates()==null) || 
             (this.currentStates!=null &&
              java.util.Arrays.equals(this.currentStates, other.getCurrentStates())));
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
        if (getCurrentStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentStates(), i);
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
        new org.apache.axis.description.TypeDesc(Report_GetCurrentStatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetCurrentStatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckStateEntry"));
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
