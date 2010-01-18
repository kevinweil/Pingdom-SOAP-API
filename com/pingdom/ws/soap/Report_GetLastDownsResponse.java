/**
 * Report_GetLastDownsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetLastDownsResponse  implements java.io.Serializable {
    private int status;

    private com.pingdom.ws.soap.Report_LastDownEntry[] lastDowns;

    public Report_GetLastDownsResponse() {
    }

    public Report_GetLastDownsResponse(
           int status,
           com.pingdom.ws.soap.Report_LastDownEntry[] lastDowns) {
           this.status = status;
           this.lastDowns = lastDowns;
    }


    /**
     * Gets the status value for this Report_GetLastDownsResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_GetLastDownsResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the lastDowns value for this Report_GetLastDownsResponse.
     * 
     * @return lastDowns
     */
    public com.pingdom.ws.soap.Report_LastDownEntry[] getLastDowns() {
        return lastDowns;
    }


    /**
     * Sets the lastDowns value for this Report_GetLastDownsResponse.
     * 
     * @param lastDowns
     */
    public void setLastDowns(com.pingdom.ws.soap.Report_LastDownEntry[] lastDowns) {
        this.lastDowns = lastDowns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetLastDownsResponse)) return false;
        Report_GetLastDownsResponse other = (Report_GetLastDownsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.lastDowns==null && other.getLastDowns()==null) || 
             (this.lastDowns!=null &&
              java.util.Arrays.equals(this.lastDowns, other.getLastDowns())));
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
        if (getLastDowns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastDowns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastDowns(), i);
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
        new org.apache.axis.description.TypeDesc(Report_GetLastDownsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetLastDownsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDowns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastDowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_LastDownEntry"));
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
