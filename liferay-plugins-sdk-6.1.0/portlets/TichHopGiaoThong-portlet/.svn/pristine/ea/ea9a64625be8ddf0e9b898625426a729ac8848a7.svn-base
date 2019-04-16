/**
 * MTServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

import vn.gt.ws.util.WebserviceUtil;

public class MTServiceLocator extends org.apache.axis.client.Service implements org.tempuri.MTService {

    public MTServiceLocator() {
    }


    public MTServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MTServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IMTService
    private java.lang.String BasicHttpBinding_IMTService_address = WebserviceUtil.getWebserviceHQURL();//"http://103.248.160.16/NSWService/MTService.svc";

    public java.lang.String getBasicHttpBinding_IMTServiceAddress() {
        return BasicHttpBinding_IMTService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IMTServiceWSDDServiceName = "BasicHttpBinding_IMTService";

    public java.lang.String getBasicHttpBinding_IMTServiceWSDDServiceName() {
        return BasicHttpBinding_IMTServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IMTServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IMTServiceWSDDServiceName = name;
    }

    public org.tempuri.IMTService getBasicHttpBinding_IMTService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IMTService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IMTService(endpoint);
    }

    public org.tempuri.IMTService getBasicHttpBinding_IMTService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IMTServiceStub _stub = new org.tempuri.BasicHttpBinding_IMTServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IMTServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IMTServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IMTService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IMTService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IMTServiceStub _stub = new org.tempuri.BasicHttpBinding_IMTServiceStub(new java.net.URL(BasicHttpBinding_IMTService_address), this);
                _stub.setPortName(getBasicHttpBinding_IMTServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IMTService".equals(inputPortName)) {
            return getBasicHttpBinding_IMTService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "MTService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IMTService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IMTService".equals(portName)) {
            setBasicHttpBinding_IMTServiceEndpointAddress(address);
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
