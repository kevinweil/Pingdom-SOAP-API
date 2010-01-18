/**
 * PingdomAPISoapPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public interface PingdomAPISoapPort extends java.rmi.Remote {
    public com.pingdom.ws.soap.Test_EchoResponse test_echo(java.lang.String inString) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Auth_LoginResponse auth_login(java.lang.String APIKey, com.pingdom.ws.soap.Auth_CredentialsData credentialsData) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Auth_LogoutResponse auth_logout(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Check_GetListResponse check_getList(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse check_getCheckIdsByNames(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Check_GetCheckIdsByNamesRequest getCheckIdsByNamesRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Check_GetCheckURLResponse check_getCheckURL(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Check_GetCheckURLRequest getCheckURLRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetLastDownsResponse report_getLastDowns(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetCurrentStatesResponse report_getCurrentStates(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetDowntimesResponse report_getDowntimes(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetDowntimesRequest getDowntimesRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse report_getDowntimesExtended(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetDowntimesRequest getDowntimesRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetOutagesResponse report_getOutages(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetOutagesRequest getOutagesRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetRawDataResponse report_getRawData(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetRawDataRequest getRawDataRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Location_GetListResponse location_getList(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetResponseTimesResponse report_getResponseTimes(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetResponseTimesRequest getResponseTimesRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.Report_GetNotificationsResponse report_getNotifications(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetNotificationsRequest getNotificationsRequest) throws java.rmi.RemoteException;
    public com.pingdom.ws.soap.CreateAccountResponse createAccount(java.lang.String APIKey, com.pingdom.ws.soap.AccountData accountData, com.pingdom.ws.soap.AccountType accountType, java.lang.String url) throws java.rmi.RemoteException;
}
