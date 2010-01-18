/**
 * Report_CheckStateEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_CheckStateEntry  implements java.io.Serializable {
    private java.lang.String checkName;

    private com.pingdom.ws.soap.Report_CheckState checkState;

    private java.util.Calendar lastCheckTime;

    public Report_CheckStateEntry() {
    }

    public Report_CheckStateEntry(
           java.lang.String checkName,
           com.pingdom.ws.soap.Report_CheckState checkState,
           java.util.Calendar lastCheckTime) {
           this.checkName = checkName;
           this.checkState = checkState;
           this.lastCheckTime = lastCheckTime;
    }


    /**
     * Gets the checkName value for this Report_CheckStateEntry.
     * 
     * @return checkName
     */
    public java.lang.String getCheckName() {
        return checkName;
    }


    /**
     * Sets the checkName value for this Report_CheckStateEntry.
     * 
     * @param checkName
     */
    public void setCheckName(java.lang.String checkName) {
        this.checkName = checkName;
    }


    /**
     * Gets the checkState value for this Report_CheckStateEntry.
     * 
     * @return checkState
     */
    public com.pingdom.ws.soap.Report_CheckState getCheckState() {
        return checkState;
    }


    /**
     * Sets the checkState value for this Report_CheckStateEntry.
     * 
     * @param checkState
     */
    public void setCheckState(com.pingdom.ws.soap.Report_CheckState checkState) {
        this.checkState = checkState;
    }


    /**
     * Gets the lastCheckTime value for this Report_CheckStateEntry.
     * 
     * @return lastCheckTime
     */
    public java.util.Calendar getLastCheckTime() {
        return lastCheckTime;
    }


    /**
     * Sets the lastCheckTime value for this Report_CheckStateEntry.
     * 
     * @param lastCheckTime
     */
    public void setLastCheckTime(java.util.Calendar lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_CheckStateEntry)) return false;
        Report_CheckStateEntry other = (Report_CheckStateEntry) obj;
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
            ((this.checkState==null && other.getCheckState()==null) || 
             (this.checkState!=null &&
              this.checkState.equals(other.getCheckState()))) &&
            ((this.lastCheckTime==null && other.getLastCheckTime()==null) || 
             (this.lastCheckTime!=null &&
              this.lastCheckTime.equals(other.getLastCheckTime())));
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
        if (getCheckState() != null) {
            _hashCode += getCheckState().hashCode();
        }
        if (getLastCheckTime() != null) {
            _hashCode += getLastCheckTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_CheckStateEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckStateEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCheckTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastCheckTime"));
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
