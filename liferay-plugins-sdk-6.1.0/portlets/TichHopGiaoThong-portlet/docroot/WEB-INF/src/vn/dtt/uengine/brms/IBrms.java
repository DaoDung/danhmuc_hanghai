/**
 * IBrms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vn.dtt.uengine.brms;

public interface IBrms extends java.rmi.Remote {
    public vn.dtt.uengine.brms.ProcessBean[] getServicesByRoot(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean checkUser(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String initInstanceById(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public vn.dtt.uengine.brms.WorkList[] getWorkListByMaHoSo(java.lang.String arg0) throws java.rmi.RemoteException, vn.dtt.uengine.brms.Exception;
    public int countInstanceListByCategory(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public boolean backProcessInstance(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public vn.dtt.uengine.brms.ProcessInstance[] getInstanceListByProfile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8) throws java.rmi.RemoteException;
    public int countWorkListByMaHoSo(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String viewWorkFlowChart(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean registerService(java.lang.String arg0, vn.dtt.uengine.brms.KeyedParameter[] arg1) throws java.rmi.RemoteException;
    public int countInstanceListByProfile(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException;
    public java.lang.String checkProcess(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public vn.dtt.uengine.brms.KeyedParameter[] getDetailInstance(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public boolean completeWorkitemByAddProfile(java.lang.String arg0, java.lang.String arg1, vn.dtt.uengine.brms.KeyedParameter[] arg2) throws java.rmi.RemoteException;
    public boolean stopProcessInstance(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public vn.dtt.uengine.brms.Item[] getServicesCategories(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public vn.dtt.uengine.brms.ProcessInstance[] getFromDBBySelectStatement(java.lang.String arg0) throws java.rmi.RemoteException, vn.dtt.uengine.brms.Exception;
    public boolean addUser(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String initInstanceMaTTHC(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public int countFromDBBySelectStatement(java.lang.String arg0) throws java.rmi.RemoteException, vn.dtt.uengine.brms.Exception;
    public vn.dtt.uengine.brms.ProcessInstance[] getInstanceListByCategory(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws java.rmi.RemoteException;
}
