/**
 * VNMWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vn.com.elcom.www;

public interface VNMWS extends javax.xml.rpc.Service {
    public java.lang.String getVNMWSSoapAddress();

    public vn.com.elcom.www.VNMWSSoap getVNMWSSoap() throws javax.xml.rpc.ServiceException;

    public vn.com.elcom.www.VNMWSSoap getVNMWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
