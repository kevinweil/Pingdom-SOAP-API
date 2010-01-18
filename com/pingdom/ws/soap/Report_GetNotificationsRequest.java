/**
 * Report_GetNotificationsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetNotificationsRequest  implements java.io.Serializable {
    private java.lang.String[] checkNames;

    private java.lang.String[] contacts;

    private java.util.Calendar from;

    private java.util.Calendar to;

    private com.pingdom.ws.soap.Report_NotificationStatusItem[] status;

    private com.pingdom.ws.soap.Report_NotificationViaItem[] via;

    private int pageNumber;

    private int resultsPerPage;

    public Report_GetNotificationsRequest() {
    }

    public Report_GetNotificationsRequest(
           java.lang.String[] checkNames,
           java.lang.String[] contacts,
           java.util.Calendar from,
           java.util.Calendar to,
           com.pingdom.ws.soap.Report_NotificationStatusItem[] status,
           com.pingdom.ws.soap.Report_NotificationViaItem[] via,
           int pageNumber,
           int resultsPerPage) {
           this.checkNames = checkNames;
           this.contacts = contacts;
           this.from = from;
           this.to = to;
           this.status = status;
           this.via = via;
           this.pageNumber = pageNumber;
           this.resultsPerPage = resultsPerPage;
    }


    /**
     * Gets the checkNames value for this Report_GetNotificationsRequest.
     * 
     * @return checkNames
     */
    public java.lang.String[] getCheckNames() {
        return checkNames;
    }


    /**
     * Sets the checkNames value for this Report_GetNotificationsRequest.
     * 
     * @param checkNames
     */
    public void setCheckNames(java.lang.String[] checkNames) {
        this.checkNames = checkNames;
    }


    /**
     * Gets the contacts value for this Report_GetNotificationsRequest.
     * 
     * @return contacts
     */
    public java.lang.String[] getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this Report_GetNotificationsRequest.
     * 
     * @param contacts
     */
    public void setContacts(java.lang.String[] contacts) {
        this.contacts = contacts;
    }


    /**
     * Gets the from value for this Report_GetNotificationsRequest.
     * 
     * @return from
     */
    public java.util.Calendar getFrom() {
        return from;
    }


    /**
     * Sets the from value for this Report_GetNotificationsRequest.
     * 
     * @param from
     */
    public void setFrom(java.util.Calendar from) {
        this.from = from;
    }


    /**
     * Gets the to value for this Report_GetNotificationsRequest.
     * 
     * @return to
     */
    public java.util.Calendar getTo() {
        return to;
    }


    /**
     * Sets the to value for this Report_GetNotificationsRequest.
     * 
     * @param to
     */
    public void setTo(java.util.Calendar to) {
        this.to = to;
    }


    /**
     * Gets the status value for this Report_GetNotificationsRequest.
     * 
     * @return status
     */
    public com.pingdom.ws.soap.Report_NotificationStatusItem[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Report_GetNotificationsRequest.
     * 
     * @param status
     */
    public void setStatus(com.pingdom.ws.soap.Report_NotificationStatusItem[] status) {
        this.status = status;
    }


    /**
     * Gets the via value for this Report_GetNotificationsRequest.
     * 
     * @return via
     */
    public com.pingdom.ws.soap.Report_NotificationViaItem[] getVia() {
        return via;
    }


    /**
     * Sets the via value for this Report_GetNotificationsRequest.
     * 
     * @param via
     */
    public void setVia(com.pingdom.ws.soap.Report_NotificationViaItem[] via) {
        this.via = via;
    }


    /**
     * Gets the pageNumber value for this Report_GetNotificationsRequest.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this Report_GetNotificationsRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the resultsPerPage value for this Report_GetNotificationsRequest.
     * 
     * @return resultsPerPage
     */
    public int getResultsPerPage() {
        return resultsPerPage;
    }


    /**
     * Sets the resultsPerPage value for this Report_GetNotificationsRequest.
     * 
     * @param resultsPerPage
     */
    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetNotificationsRequest)) return false;
        Report_GetNotificationsRequest other = (Report_GetNotificationsRequest) obj;
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
              java.util.Arrays.equals(this.checkNames, other.getCheckNames()))) &&
            ((this.contacts==null && other.getContacts()==null) || 
             (this.contacts!=null &&
              java.util.Arrays.equals(this.contacts, other.getContacts()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              java.util.Arrays.equals(this.via, other.getVia()))) &&
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
        if (getContacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContacts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContacts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPageNumber();
        _hashCode += getResultsPerPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_GetNotificationsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationStatusItem"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("via");
        elemField.setXmlName(new javax.xml.namespace.QName("", "via"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationViaItem"));
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
