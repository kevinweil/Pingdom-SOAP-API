/**
 * Report_GetNotificationsResponseItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class Report_GetNotificationsResponseItem  implements java.io.Serializable {
    private java.util.Calendar notificationTime;

    private java.lang.String check;

    private java.lang.String contact;

    private java.lang.String sentTo;

    private java.lang.String messageType;

    private java.lang.String messageStatus;

    private java.lang.String cause;

    private java.lang.String message;

    private boolean charged;

    public Report_GetNotificationsResponseItem() {
    }

    public Report_GetNotificationsResponseItem(
           java.util.Calendar notificationTime,
           java.lang.String check,
           java.lang.String contact,
           java.lang.String sentTo,
           java.lang.String messageType,
           java.lang.String messageStatus,
           java.lang.String cause,
           java.lang.String message,
           boolean charged) {
           this.notificationTime = notificationTime;
           this.check = check;
           this.contact = contact;
           this.sentTo = sentTo;
           this.messageType = messageType;
           this.messageStatus = messageStatus;
           this.cause = cause;
           this.message = message;
           this.charged = charged;
    }


    /**
     * Gets the notificationTime value for this Report_GetNotificationsResponseItem.
     * 
     * @return notificationTime
     */
    public java.util.Calendar getNotificationTime() {
        return notificationTime;
    }


    /**
     * Sets the notificationTime value for this Report_GetNotificationsResponseItem.
     * 
     * @param notificationTime
     */
    public void setNotificationTime(java.util.Calendar notificationTime) {
        this.notificationTime = notificationTime;
    }


    /**
     * Gets the check value for this Report_GetNotificationsResponseItem.
     * 
     * @return check
     */
    public java.lang.String getCheck() {
        return check;
    }


    /**
     * Sets the check value for this Report_GetNotificationsResponseItem.
     * 
     * @param check
     */
    public void setCheck(java.lang.String check) {
        this.check = check;
    }


    /**
     * Gets the contact value for this Report_GetNotificationsResponseItem.
     * 
     * @return contact
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Report_GetNotificationsResponseItem.
     * 
     * @param contact
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the sentTo value for this Report_GetNotificationsResponseItem.
     * 
     * @return sentTo
     */
    public java.lang.String getSentTo() {
        return sentTo;
    }


    /**
     * Sets the sentTo value for this Report_GetNotificationsResponseItem.
     * 
     * @param sentTo
     */
    public void setSentTo(java.lang.String sentTo) {
        this.sentTo = sentTo;
    }


    /**
     * Gets the messageType value for this Report_GetNotificationsResponseItem.
     * 
     * @return messageType
     */
    public java.lang.String getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this Report_GetNotificationsResponseItem.
     * 
     * @param messageType
     */
    public void setMessageType(java.lang.String messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the messageStatus value for this Report_GetNotificationsResponseItem.
     * 
     * @return messageStatus
     */
    public java.lang.String getMessageStatus() {
        return messageStatus;
    }


    /**
     * Sets the messageStatus value for this Report_GetNotificationsResponseItem.
     * 
     * @param messageStatus
     */
    public void setMessageStatus(java.lang.String messageStatus) {
        this.messageStatus = messageStatus;
    }


    /**
     * Gets the cause value for this Report_GetNotificationsResponseItem.
     * 
     * @return cause
     */
    public java.lang.String getCause() {
        return cause;
    }


    /**
     * Sets the cause value for this Report_GetNotificationsResponseItem.
     * 
     * @param cause
     */
    public void setCause(java.lang.String cause) {
        this.cause = cause;
    }


    /**
     * Gets the message value for this Report_GetNotificationsResponseItem.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Report_GetNotificationsResponseItem.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the charged value for this Report_GetNotificationsResponseItem.
     * 
     * @return charged
     */
    public boolean isCharged() {
        return charged;
    }


    /**
     * Sets the charged value for this Report_GetNotificationsResponseItem.
     * 
     * @param charged
     */
    public void setCharged(boolean charged) {
        this.charged = charged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report_GetNotificationsResponseItem)) return false;
        Report_GetNotificationsResponseItem other = (Report_GetNotificationsResponseItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificationTime==null && other.getNotificationTime()==null) || 
             (this.notificationTime!=null &&
              this.notificationTime.equals(other.getNotificationTime()))) &&
            ((this.check==null && other.getCheck()==null) || 
             (this.check!=null &&
              this.check.equals(other.getCheck()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.sentTo==null && other.getSentTo()==null) || 
             (this.sentTo!=null &&
              this.sentTo.equals(other.getSentTo()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.messageStatus==null && other.getMessageStatus()==null) || 
             (this.messageStatus!=null &&
              this.messageStatus.equals(other.getMessageStatus()))) &&
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            this.charged == other.isCharged();
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
        if (getNotificationTime() != null) {
            _hashCode += getNotificationTime().hashCode();
        }
        if (getCheck() != null) {
            _hashCode += getCheck().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getSentTo() != null) {
            _hashCode += getSentTo().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getMessageStatus() != null) {
            _hashCode += getMessageStatus().hashCode();
        }
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        _hashCode += (isCharged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report_GetNotificationsResponseItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponseItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check");
        elemField.setXmlName(new javax.xml.namespace.QName("", "check"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sentTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sentTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
