package vn.dtt.uengine.brms;

public class IBrmsProxy implements vn.dtt.uengine.brms.IBrms {
  private String _endpoint = null;
  private vn.dtt.uengine.brms.IBrms iBrms = null;
  
  public IBrmsProxy() {
    _initIBrmsProxy();
  }
  
  public IBrmsProxy(String endpoint) {
    _endpoint = endpoint;
    _initIBrmsProxy();
  }
  
  private void _initIBrmsProxy() {
    try {
      iBrms = (new vn.dtt.uengine.brms.IBrmsServiceLocator()).getIBrmsPort();
      if (iBrms != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iBrms)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iBrms)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iBrms != null)
      ((javax.xml.rpc.Stub)iBrms)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public vn.dtt.uengine.brms.IBrms getIBrms() {
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms;
  }
  
  public vn.dtt.uengine.brms.ProcessBean[] getServicesByRoot(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getServicesByRoot(arg0);
  }
  
  public boolean checkUser(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.checkUser(arg0);
  }
  
  public java.lang.String initInstanceById(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.initInstanceById(arg0, arg1);
  }
  
  public vn.dtt.uengine.brms.WorkList[] getWorkListByMaHoSo(java.lang.String arg0) throws java.rmi.RemoteException, vn.dtt.uengine.brms.Exception{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getWorkListByMaHoSo(arg0);
  }
  
  public int countInstanceListByCategory(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.countInstanceListByCategory(arg0, arg1, arg2, arg3);
  }
  
  public boolean backProcessInstance(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.backProcessInstance(arg0, arg1, arg2);
  }
  
  public vn.dtt.uengine.brms.ProcessInstance[] getInstanceListByProfile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getInstanceListByProfile(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
  }
  
  public int countWorkListByMaHoSo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.countWorkListByMaHoSo(arg0);
  }
  
  public java.lang.String viewWorkFlowChart(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.viewWorkFlowChart(arg0);
  }
  
  public boolean registerService(java.lang.String arg0, vn.dtt.uengine.brms.KeyedParameter[] arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.registerService(arg0, arg1);
  }
  
  public int countInstanceListByProfile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.countInstanceListByProfile(arg0, arg1, arg2, arg3, arg4);
  }
  
  public java.lang.String checkProcess(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.checkProcess(arg0, arg1);
  }
  
  public vn.dtt.uengine.brms.KeyedParameter[] getDetailInstance(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getDetailInstance(arg0, arg1);
  }
  
  public boolean completeWorkitemByAddProfile(java.lang.String arg0, java.lang.String arg1, vn.dtt.uengine.brms.KeyedParameter[] arg2) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.completeWorkitemByAddProfile(arg0, arg1, arg2);
  }
  
  public boolean stopProcessInstance(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.stopProcessInstance(arg0, arg1);
  }
  
  public vn.dtt.uengine.brms.Item[] getServicesCategories(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getServicesCategories(arg0, arg1);
  }
  
  public vn.dtt.uengine.brms.ProcessInstance[] getFromDBBySelectStatement(java.lang.String arg0) throws java.rmi.RemoteException, vn.dtt.uengine.brms.Exception{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getFromDBBySelectStatement(arg0);
  }
  
  public boolean addUser(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.addUser(arg0);
  }
  
  public java.lang.String initInstanceMaTTHC(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.initInstanceMaTTHC(arg0, arg1);
  }
  
  public int countFromDBBySelectStatement(java.lang.String arg0) throws java.rmi.RemoteException, vn.dtt.uengine.brms.Exception{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.countFromDBBySelectStatement(arg0);
  }
  
  public vn.dtt.uengine.brms.ProcessInstance[] getInstanceListByCategory(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws java.rmi.RemoteException{
    if (iBrms == null)
      _initIBrmsProxy();
    return iBrms.getInstanceListByCategory(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
  }
  
  
}