/**
 * IBrmsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vn.dtt.uengine.brms;

import vn.gt.config.ConfigUtils;

public class IBrmsServiceLocator extends org.apache.axis.client.Service implements vn.dtt.uengine.brms.IBrmsService {
	private static java.lang.String IBrmsPort_address = "http://192.168.1.243/uengine-ws/services/IBrmsPort";
	static {
		//IBrmsPort_address =ConfigUtils.getValue("uengine_ws_url", "http://192.168.1.243/uengine-ws/services/IBrmsPort");
		IBrmsPort_address ="http://192.168.1.243/uengine-ws/services/IBrmsPort";
	}
    public IBrmsServiceLocator() {
    	//IBrmsPort_address= ConfigUtils.getValue("uengine_ws_url", "http://192.168.1.243/uengine-ws/services/IBrmsPort");
    }


    public IBrmsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IBrmsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IBrmsPort
    

    public java.lang.String getIBrmsPortAddress() {
        return IBrmsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IBrmsPortWSDDServiceName = "IBrmsPort";

    public java.lang.String getIBrmsPortWSDDServiceName() {
        return IBrmsPortWSDDServiceName;
    }

    public void setIBrmsPortWSDDServiceName(java.lang.String name) {
        IBrmsPortWSDDServiceName = name;
    }

    
    public vn.dtt.uengine.brms.IBrms getIBrmsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IBrmsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIBrmsPort(endpoint);
    }

    public vn.dtt.uengine.brms.IBrms getIBrmsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            vn.dtt.uengine.brms.IBrmsServiceSoapBindingStub _stub = new vn.dtt.uengine.brms.IBrmsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getIBrmsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIBrmsPortEndpointAddress(java.lang.String address) {
        IBrmsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (vn.dtt.uengine.brms.IBrms.class.isAssignableFrom(serviceEndpointInterface)) {
                vn.dtt.uengine.brms.IBrmsServiceSoapBindingStub _stub = new vn.dtt.uengine.brms.IBrmsServiceSoapBindingStub(new java.net.URL(IBrmsPort_address), this);
                _stub.setPortName(getIBrmsPortWSDDServiceName());
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
        if ("IBrmsPort".equals(inputPortName)) {
            return getIBrmsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://brms.uengine.dtt.vn/", "IBrmsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://brms.uengine.dtt.vn/", "IBrmsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IBrmsPort".equals(portName)) {
            setIBrmsPortEndpointAddress(address);
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
