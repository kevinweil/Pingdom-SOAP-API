/**
 * Report_GetResponseTimesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetResponseTimesRequest  implements java.io.Serializable {
    private java.util.Calendar from;

    private java.util.Calendar to;

    private com.pingdom.ws.soap.Report_ResolutionEnum resolution;

    private java.lang.String checkName;

    private java.lang.String[] locations;

    public Report_GetResponseTimesRequest() {
    }

    public Report_GetResponseTimesRequest(
           java.util.Calendar from,
           java.util.Calendar to,
           com.pingdom.ws.soap.Report_ResolutionEnum resolution,
           java.lang.String checkName,
           java.lang.String[] locations) {
           this.from = from;
           this.to = to;
           this.resolution = resolution;
           this.checkName = checkName;
           this.locations = locations;
    }


    /**
     * Gets the from value for this Report_GetResponseTimesRequest.
     * 
     * @return from
     */
    public java.util.Calendar getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Report_GetResponseTimesRequest.
     * 
     * @param from
     */
    public void setFrom(java.util.Calendar from) {
        this.from = from;
    }


    /**
     * Gets the to value for this Report_GetResponseTimesRequest.
     * 
     * @return to
     */
    public java.util.Calendar getTo() {
        return to;
    }


    /**
     * Sets the to value for this Report_GetResponseTimesRequest.
     * 
     * @param to
     */
    public void setTo(java.util.Calendar to) {
        this.to = to;
    }


    /**
     * Gets the resolution value for this Report_GetResponseTimesRequest.
     * 
     * @return resolution
     */
    public com.pingdom.ws.soap.Report_ResolutionEnum getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this Report_GetResponseTimesRequest.
     * 
     * @param resolution
     */
    public void setResolution(com.pingdom.ws.soap.Report_ResolutionEnum resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the checkName value for this Report_GetResponseTimesRequest.
     * 
     * @return checkName
     */
    public java.lang.String getCheckName() {
        return checkName;
    }


    /**
     * Sets the checkName value for this Report_GetResponseTimesRequest.
     * 
     * @param checkName
     */
    public void setCheckName(java.lang.String checkName) {
        this.checkName = checkName;
    }


    /**
     * Gets the locations value for this Report_GetResponseTimesRequest.
     * 
     * @return locations
     */
    public java.lang.String[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this Report_GetResponseTimesRequest.
     * 
     * @param locations
     */
    public void setLocations(java.lang.String[] locations) {
        this.locations = locations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetResponseTimesRequest)) return false;
        Report_GetResponseTimesRequest other = (Report_GetResponseTimesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.checkName==null && other.getCheckName()==null) || 
             (this.checkName!=null &&
              this.checkName.equals(other.getCheckName()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getCheckName() != null) {
            _hashCode += getCheckName().hashCode();
        }
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
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
        new org.apache.axis.description.TypeDesc(Report_GetResponseTimesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetResponseTimesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_ResolutionEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locations"));
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
