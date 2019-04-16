/**
 * VNMWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vn.com.elcom.www;

public class VNMWSLocator extends org.apache.axis.client.Service implements vn.com.elcom.www.VNMWS {

    public VNMWSLocator() {
    }


    public VNMWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VNMWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VNMWSSoap
    private java.lang.String VNMWSSoap_address = "http://113.161.128.80:2997/VNMWS.asmx";

    public java.lang.String getVNMWSSoapAddress() {
        return VNMWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VNMWSSoapWSDDServiceName = "VNMWSSoap";

    public java.lang.String getVNMWSSoapWSDDServiceName() {
        return VNMWSSoapWSDDServiceName;
    }

    public void setVNMWSSoapWSDDServiceName(java.lang.String name) {
        VNMWSSoapWSDDServiceName = name;
    }

    public vn.com.elcom.www.VNMWSSoap getVNMWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VNMWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVNMWSSoap(endpoint);
    }

    public vn.com.elcom.www.VNMWSSoap getVNMWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            vn.com.elcom.www.VNMWSSoapStub _stub = new vn.com.elcom.www.VNMWSSoapStub(portAddress, this);
            _stub.setPortName(getVNMWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVNMWSSoapEndpointAddress(java.lang.String address) {
        VNMWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (vn.com.elcom.www.VNMWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                vn.com.elcom.www.VNMWSSoapStub _stub = new vn.com.elcom.www.VNMWSSoapStub(new java.net.URL(VNMWSSoap_address), this);
                _stub.setPortName(getVNMWSSoapWSDDServiceName());
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
        if ("VNMWSSoap".equals(inputPortName)) {
            return getVNMWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.elcom.com.vn/", "VNMWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.elcom.com.vn/", "VNMWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VNMWSSoap".equals(portName)) {
            setVNMWSSoapEndpointAddress(address);
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
