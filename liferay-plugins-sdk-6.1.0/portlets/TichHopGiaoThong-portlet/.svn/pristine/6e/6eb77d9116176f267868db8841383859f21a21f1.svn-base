package org.tempuri;

public class IMTextServiceProxy implements org.tempuri.IMTextService {
  private String _endpoint = null;
  private org.tempuri.IMTextService iMTextService = null;
  
  public IMTextServiceProxy() {
    _initIMTextServiceProxy();
  }
  
  public IMTextServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIMTextServiceProxy();
  }
  
  private void _initIMTextServiceProxy() {
    try {
      iMTextService = (new org.tempuri.MTextServiceLocator()).getBasicHttpBinding_IMTextService();
      if (iMTextService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iMTextService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iMTextService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iMTextService != null)
      ((javax.xml.rpc.Stub)iMTextService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IMTextService getIMTextService() {
    if (iMTextService == null)
      _initIMTextServiceProxy();
    return iMTextService;
  }
  
  public java.lang.String receive(java.lang.String XMLData) throws java.rmi.RemoteException{
    if (iMTextService == null)
      _initIMTextServiceProxy();
    return iMTextService.receive(XMLData);
  }
  
  
}