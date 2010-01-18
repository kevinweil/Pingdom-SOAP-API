/**
 * Report_GetOutagesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetOutagesRequest  implements java.io.Serializable {
    private java.util.Calendar from;

    private java.util.Calendar to;

    private java.lang.String checkName;

    private int pageNumber;

    private int resultsPerPage;

    public Report_GetOutagesRequest() {
    }

    public Report_GetOutagesRequest(
           java.util.Calendar from,
           java.util.Calendar to,
           java.lang.String checkName,
           int pageNumber,
           int resultsPerPage) {
           this.from = from;
           this.to = to;
           this.checkName = checkName;
           this.pageNumber = pageNumber;
           this.resultsPerPage = resultsPerPage;
    }


    /**
     * Gets the from value for this Report_GetOutagesRequest.
     * 
     * @return from
     */
    public java.util.Calendar getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Report_GetOutagesRequest.
     * 
     * @param from
     */
    public void setFrom(java.util.Calendar from) {
        this.from = from;
    }


    /**
     * Gets the to value for this Report_GetOutagesRequest.
     * 
     * @return to
     */
    public java.util.Calendar getTo() {
        return to;
    }


    /**
     * Sets the to value for this Report_GetOutagesRequest.
     * 
     * @param to
     */
    public void setTo(java.util.Calendar to) {
        this.to = to;
    }


    /**
     * Gets the checkName value for this Report_GetOutagesRequest.
     * 
     * @return checkName
     */
    public java.lang.String getCheckName() {
        return checkName;
    }


    /**
     * Sets the checkName value for this Report_GetOutagesRequest.
     * 
     * @param checkName
     */
    public void setCheckName(java.lang.String checkName) {
        this.checkName = checkName;
    }


    /**
     * Gets the pageNumber value for this Report_GetOutagesRequest.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this Report_GetOutagesRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the resultsPerPage value for this Report_GetOutagesRequest.
     * 
     * @return resultsPerPage
     */
    public int getResultsPerPage() {
        return resultsPerPage;
    }


    /**
     * Sets the resultsPerPage value for this Report_GetOutagesRequest.
     * 
     * @param resultsPerPage
     */
    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetOutagesRequest)) return false;
        Report_GetOutagesRequest other = (Report_GetOutagesRequest) obj;
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
            ((this.checkName==null && other.getCheckName()==null) || 
             (this.checkName!=null &&
              this.checkName.equals(other.getCheckName()))) &&
            this.pageNumber == other.getPageNumber() &&
            this.resultsPerPage == other.getResultsPerPage();
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
        if (getCheckName() != null) {
            _hashCode += getCheckName().hashCode();
        }
        _hashCode += getPageNumber();
        _hashCode += getResultsPerPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_GetOutagesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetOutagesRequest"));
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
        elemField.setFieldName("checkName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultsPerPage"));
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
