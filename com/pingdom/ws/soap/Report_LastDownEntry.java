/**
 * Report_LastDownEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_LastDownEntry  implements java.io.Serializable {
    private java.lang.String checkName;

    private java.util.Calendar lastDown;

    public Report_LastDownEntry() {
    }

    public Report_LastDownEntry(
           java.lang.String checkName,
           java.util.Calendar lastDown) {
           this.checkName = checkName;
           this.lastDown = lastDown;
    }


    /**
     * Gets the checkName value for this Report_LastDownEntry.
     * 
     * @return checkName
     */
    public java.lang.String getCheckName() {
        return checkName;
    }


    /**
     * Sets the checkName value for this Report_LastDownEntry.
     * 
     * @param checkName
     */
    public void setCheckName(java.lang.String checkName) {
        this.checkName = checkName;
    }


    /**
     * Gets the lastDown value for this Report_LastDownEntry.
     * 
     * @return lastDown
     */
    public java.util.Calendar getLastDown() {
        return lastDown;
    }


    /**
     * Sets the lastDown value for this Report_LastDownEntry.
     * 
     * @param lastDown
     */
    public void setLastDown(java.util.Calendar lastDown) {
        this.lastDown = lastDown;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_LastDownEntry)) return false;
        Report_LastDownEntry other = (Report_LastDownEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkName==null && other.getCheckName()==null) || 
             (this.checkName!=null &&
              this.checkName.equals(other.getCheckName()))) &&
            ((this.lastDown==null && other.getLastDown()==null) || 
             (this.lastDown!=null &&
              this.lastDown.equals(other.getLastDown())));
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
        if (getCheckName() != null) {
            _hashCode += getCheckName().hashCode();
        }
        if (getLastDown() != null) {
            _hashCode += getLastDown().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_LastDownEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_LastDownEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastDown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
