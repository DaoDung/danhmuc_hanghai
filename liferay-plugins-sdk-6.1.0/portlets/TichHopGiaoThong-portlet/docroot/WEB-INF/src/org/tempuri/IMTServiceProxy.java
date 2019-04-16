package org.tempuri;

public class IMTServiceProxy implements org.tempuri.IMTService {
  private String _endpoint = null;
  private org.tempuri.IMTService iMTService = null;
  
  public IMTServiceProxy() {
    _initIMTServiceProxy();
  }
  
  public IMTServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIMTServiceProxy();
  }
  
  private void _initIMTServiceProxy() {
    try {
      iMTService = (new org.tempuri.MTServiceLocator()).getBasicHttpBinding_IMTService();
      if (iMTService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iMTService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iMTService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iMTService != null)
      ((javax.xml.rpc.Stub)iMTService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IMTService getIMTService() {
    if (iMTService == null)
      _initIMTServiceProxy();
    return iMTService;
  }
  
  public java.lang.String receiveResultFromMT(java.lang.String XMLData) throws java.rmi.RemoteException{
    if (iMTService == null)
      _initIMTServiceProxy();
    return iMTService.receiveResultFromMT(XMLData);
  }
  
  public java.lang.String receive(java.lang.String XMLData) throws java.rmi.RemoteException{
    if (iMTService == null)
      _initIMTServiceProxy();
    return iMTService.receive(XMLData);
  }
  
  public java.lang.String receiveFromInland(java.lang.String XMLData) throws java.rmi.RemoteException{
    if (iMTService == null)
      _initIMTServiceProxy();
    return iMTService.receiveFromInland(XMLData);
  }
  
  public java.lang.String receiveFromVIWA(java.lang.String XMLData) throws java.rmi.RemoteException{
    if (iMTService == null)
      _initIMTServiceProxy();
    return iMTService.receiveFromVIWA(XMLData);
  }
  
  
}