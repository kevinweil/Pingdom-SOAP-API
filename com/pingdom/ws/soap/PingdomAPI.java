/**
 * PingdomAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public interface PingdomAPI extends javax.xml.rpc.Service {
    public java.lang.String getPingdomAPISoapPortAddress();

    public com.pingdom.ws.soap.PingdomAPISoapPort getPingdomAPISoapPort() throws javax.xml.rpc.ServiceException;

    public com.pingdom.ws.soap.PingdomAPISoapPort getPingdomAPISoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
