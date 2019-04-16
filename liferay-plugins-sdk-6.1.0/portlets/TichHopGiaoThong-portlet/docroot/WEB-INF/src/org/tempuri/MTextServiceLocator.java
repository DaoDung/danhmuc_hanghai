/**
 * MTextServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

import vn.gt.ws.util.WebserviceUtil;

public class MTextServiceLocator extends org.apache.axis.client.Service implements org.tempuri.MTextService {

    public MTextServiceLocator() {
    }


    public MTextServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MTextServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IMTextService
    //private java.lang.String BasicHttpBinding_IMTextService_address = "http://103.248.160.16/MTextService/MTextService.svc";
    private java.lang.String BasicHttpBinding_IMTextService_address = WebserviceUtil.getWebserviceHQv2URL();//"http://103.248.160.16/MTextService/MTextService.svc";

    public java.lang.String getBasicHttpBinding_IMTextServiceAddress() {
        return BasicHttpBinding_IMTextService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IMTextServiceWSDDServiceName = "BasicHttpBinding_IMTextService";

    public java.lang.String getBasicHttpBinding_IMTextServiceWSDDServiceName() {
        return BasicHttpBinding_IMTextServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IMTextServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IMTextServiceWSDDServiceName = name;
    }

    public org.tempuri.IMTextService getBasicHttpBinding_IMTextService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IMTextService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IMTextService(endpoint);
    }

    public org.tempuri.IMTextService getBasicHttpBinding_IMTextService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IMTextServiceStub _stub = new org.tempuri.BasicHttpBinding_IMTextServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IMTextServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IMTextServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IMTextService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IMTextService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IMTextServiceStub _stub = new org.tempuri.BasicHttpBinding_IMTextServiceStub(new java.net.URL(BasicHttpBinding_IMTextService_address), this);
                _stub.setPortName(getBasicHttpBinding_IMTextServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IMTextService".equals(inputPortName)) {
            return getBasicHttpBinding_IMTextService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "MTextService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IMTextService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IMTextService".equals(portName)) {
            setBasicHttpBinding_IMTextServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
