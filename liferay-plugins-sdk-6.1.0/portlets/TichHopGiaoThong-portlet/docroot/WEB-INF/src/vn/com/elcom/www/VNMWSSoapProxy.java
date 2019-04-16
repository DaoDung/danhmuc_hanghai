package vn.com.elcom.www;

public class VNMWSSoapProxy implements vn.com.elcom.www.VNMWSSoap {
  private String _endpoint = null;
  private vn.com.elcom.www.VNMWSSoap vNMWSSoap = null;
  
  public VNMWSSoapProxy() {
    _initVNMWSSoapProxy();
  }
  
  public VNMWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initVNMWSSoapProxy();
  }
  
  private void _initVNMWSSoapProxy() {
    try {
      vNMWSSoap = (new vn.com.elcom.www.VNMWSLocator()).getVNMWSSoap();
      if (vNMWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vNMWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vNMWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vNMWSSoap != null)
      ((javax.xml.rpc.Stub)vNMWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public vn.com.elcom.www.VNMWSSoap getVNMWSSoap() {
    if (vNMWSSoap == null)
      _initVNMWSSoapProxy();
    return vNMWSSoap;
  }
  
  public java.lang.String sendMessage(java.lang.String content) throws java.rmi.RemoteException{
    if (vNMWSSoap == null)
      _initVNMWSSoapProxy();
    return vNMWSSoap.sendMessage(content);
  }
  
  public java.lang.String recvMesssage(java.lang.String content) throws java.rmi.RemoteException{
    if (vNMWSSoap == null)
      _initVNMWSSoapProxy();
    return vNMWSSoap.recvMesssage(content);
  }
  
  
}