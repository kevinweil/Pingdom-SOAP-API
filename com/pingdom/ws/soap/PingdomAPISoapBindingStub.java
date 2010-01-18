/**
 * PingdomAPISoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pingdom.ws.soap;

public class PingdomAPISoapBindingStub extends org.apache.axis.client.Stub implements com.pingdom.ws.soap.PingdomAPISoapPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Test_echo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Test_EchoResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Test_EchoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Auth_login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "credentialsData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Auth_CredentialsData"), com.pingdom.ws.soap.Auth_CredentialsData.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Auth_LoginResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Auth_LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Auth_logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Auth_LogoutResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Auth_LogoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Check_getList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetListResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Check_GetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Check_getCheckIdsByNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getCheckIdsByNamesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckIdsByNamesRequest"), com.pingdom.ws.soap.Check_GetCheckIdsByNamesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckIdsByNamesResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Check_getCheckURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getCheckURLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckURLRequest"), com.pingdom.ws.soap.Check_GetCheckURLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckURLResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Check_GetCheckURLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getLastDowns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetLastDownsResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetLastDownsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getCurrentStates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetCurrentStatesResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetCurrentStatesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getDowntimes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getDowntimesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesRequest"), com.pingdom.ws.soap.Report_GetDowntimesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetDowntimesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getDowntimesExtended");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getDowntimesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesRequest"), com.pingdom.ws.soap.Report_GetDowntimesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesExtendedResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getOutages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getOutagesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetOutagesRequest"), com.pingdom.ws.soap.Report_GetOutagesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetOutagesResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetOutagesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getRawData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getRawDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetRawDataRequest"), com.pingdom.ws.soap.Report_GetRawDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetRawDataResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetRawDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Location_getList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Location_GetListResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Location_GetListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getResponseTimes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getResponseTimesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetResponseTimesRequest"), com.pingdom.ws.soap.Report_GetResponseTimesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetResponseTimesResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetResponseTimesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Report_getNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getNotificationsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsRequest"), com.pingdom.ws.soap.Report_GetNotificationsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.Report_GetNotificationsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "APIKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accountData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "AccountData"), com.pingdom.ws.soap.AccountData.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "accountType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:PingdomAPI", "AccountType"), com.pingdom.ws.soap.AccountType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:PingdomAPI", "CreateAccountResponse"));
        oper.setReturnClass(com.pingdom.ws.soap.CreateAccountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

    }

    public PingdomAPISoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PingdomAPISoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PingdomAPISoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "AccountData");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.AccountData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "AccountType");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Auth_CredentialsData");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Auth_CredentialsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Auth_LoginResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Auth_LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Auth_LogoutResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Auth_LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_CheckIdsArray");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckIdsByNamesRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Check_GetCheckIdsByNamesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckIdsByNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckURLRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Check_GetCheckURLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetCheckURLResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Check_GetCheckURLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_GetListResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Check_GetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Check_ListArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "CreateAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.CreateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Location_GetListResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Location_GetListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Location_ListArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_checkNamesArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckState");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_CheckState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckStateEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_CheckStateEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_contactsArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CurrentStatesArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_CheckStateEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_CheckStateEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimeEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_DowntimeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimeExtendedEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_DowntimeExtendedEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimesArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_DowntimeEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimeEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimesExtendedArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_DowntimeExtendedEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_DowntimeExtendedEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetCurrentStatesResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetCurrentStatesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesExtendedResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetDowntimesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetDowntimesResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetDowntimesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetLastDownsResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetLastDownsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetNotificationsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetNotificationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponseArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetNotificationsResponseItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponseItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetNotificationsResponseItem");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetNotificationsResponseItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetOutagesRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetOutagesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetOutagesResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetOutagesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetRawDataRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetRawDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetRawDataResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetRawDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetResponseTimesRequest");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetResponseTimesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_GetResponseTimesResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_GetResponseTimesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_LastDownEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_LastDownEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_LastDownsArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_LastDownEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_LastDownEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationStatus");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_NotificationStatusItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationStatusItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationStatusItem");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_NotificationStatusItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationVia");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_NotificationViaItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationViaItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_NotificationViaItem");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_NotificationViaItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_OutageEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_OutageEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_OutagesArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_OutageEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_OutageEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_RawDataArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_RawDataEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_RawDataEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_RawDataEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_RawDataEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_ResolutionEnum");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_ResolutionEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_ResponseTimeEntry");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_ResponseTimeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_ResponseTimesArray");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Report_ResponseTimeEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Report_ResponseTimeEntry");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:PingdomAPI", "Test_EchoResponse");
            cachedSerQNames.add(qName);
            cls = com.pingdom.ws.soap.Test_EchoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.pingdom.ws.soap.Test_EchoResponse test_echo(java.lang.String inString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Test_echo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Test_echo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {inString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Test_EchoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Test_EchoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Test_EchoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Auth_LoginResponse auth_login(java.lang.String APIKey, com.pingdom.ws.soap.Auth_CredentialsData credentialsData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Auth_login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Auth_login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, credentialsData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Auth_LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Auth_LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Auth_LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Auth_LogoutResponse auth_logout(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Auth_logout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Auth_logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Auth_LogoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Auth_LogoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Auth_LogoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Check_GetListResponse check_getList(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Check_getList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Check_getList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Check_GetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Check_GetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Check_GetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse check_getCheckIdsByNames(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Check_GetCheckIdsByNamesRequest getCheckIdsByNamesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Check_getCheckIdsByNames");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Check_getCheckIdsByNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getCheckIdsByNamesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Check_GetCheckIdsByNamesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Check_GetCheckURLResponse check_getCheckURL(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Check_GetCheckURLRequest getCheckURLRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Check_getCheckURL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Check_getCheckURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getCheckURLRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Check_GetCheckURLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Check_GetCheckURLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Check_GetCheckURLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetLastDownsResponse report_getLastDowns(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getLastDowns");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getLastDowns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetLastDownsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetLastDownsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetLastDownsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetCurrentStatesResponse report_getCurrentStates(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getCurrentStates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getCurrentStates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetCurrentStatesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetCurrentStatesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetCurrentStatesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetDowntimesResponse report_getDowntimes(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetDowntimesRequest getDowntimesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getDowntimes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getDowntimes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getDowntimesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetDowntimesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetDowntimesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetDowntimesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse report_getDowntimesExtended(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetDowntimesRequest getDowntimesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getDowntimesExtended");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getDowntimesExtended"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getDowntimesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetDowntimesExtendedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetOutagesResponse report_getOutages(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetOutagesRequest getOutagesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getOutages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getOutages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getOutagesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetOutagesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetOutagesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetOutagesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetRawDataResponse report_getRawData(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetRawDataRequest getRawDataRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getRawData");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getRawData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getRawDataRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetRawDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetRawDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetRawDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Location_GetListResponse location_getList(java.lang.String APIKey, java.lang.String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Location_getList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Location_getList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Location_GetListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Location_GetListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Location_GetListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetResponseTimesResponse report_getResponseTimes(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetResponseTimesRequest getResponseTimesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getResponseTimes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getResponseTimes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getResponseTimesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetResponseTimesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetResponseTimesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetResponseTimesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.Report_GetNotificationsResponse report_getNotifications(java.lang.String APIKey, java.lang.String sessionId, com.pingdom.ws.soap.Report_GetNotificationsRequest getNotificationsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#Report_getNotifications");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "Report_getNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, sessionId, getNotificationsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.Report_GetNotificationsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.Report_GetNotificationsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.Report_GetNotificationsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pingdom.ws.soap.CreateAccountResponse createAccount(java.lang.String APIKey, com.pingdom.ws.soap.AccountData accountData, com.pingdom.ws.soap.AccountType accountType, java.lang.String url) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:methods#createAccount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:methods", "createAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {APIKey, accountData, accountType, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pingdom.ws.soap.CreateAccountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pingdom.ws.soap.CreateAccountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pingdom.ws.soap.CreateAccountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
