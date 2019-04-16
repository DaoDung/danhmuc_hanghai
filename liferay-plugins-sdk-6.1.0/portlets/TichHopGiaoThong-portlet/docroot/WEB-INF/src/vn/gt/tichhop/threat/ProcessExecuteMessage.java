/**
 * 
 */
package vn.gt.tichhop.threat;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import vn.gt.dao.danhmucgt.model.DmGtRouteConfig;
import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequest;
import vn.gt.dao.noticeandmessage.model.InterfaceRequest;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.tichhop.message.BusinessInsertTableResultUtils;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.sendmessage.MessgaePriorityLevels;
import vn.gt.tichhop.sendmessage.SendMessgaeFunctions;
import vn.nsw.Header;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author win_64
 */
public class ProcessExecuteMessage implements Runnable {
	
	private static Log _log = LogFactoryUtil.getLog(ProcessExecuteMessage.class);
	private Thread t;
	private int timeSleep = 1000;
	private String threadName;
	private BusinessUtils businessUtils = new BusinessUtils();
	
	Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
		public void uncaughtException(Thread th, Throwable ex) {
			_log.error("Uncaught exception: " + ex);
		}
	};
	
	public ProcessExecuteMessage(String name, int timeSleep) {
		threadName = name;
		this.timeSleep = timeSleep;
	}
	
	public void run() {
		while (true) {
			try {
				ObjectExcute objectExcute = ThreadPassingMessage.listData.poll();
				if (objectExcute != null) {
					_log.info("===========Executing thread========================." + t.getName() + ":::Data==Objects==size==" + objectExcute.getLiObjects().size());
					Header header = objectExcute.getHeader();
					// Neu la cac cang vu tich hop.
					String lyDoTuChoi = businessUtils.insertTempTable(objectExcute.getHeader(), objectExcute.getLiObjects());
					if (lyDoTuChoi != null && lyDoTuChoi.length() > 0) {
						sendMessageTuChoiHoSo("System", lyDoTuChoi, objectExcute.getHeader());
					} else {
						
						// Add 20-10-2014
						//TODO Sau khi insert vao cac TempTable
						// Thong tin vao bang khai bao ResultDeclaration.
						
						/*if (header.getSubject().getDocumentType() == MessageType.TAU_VAO_PTTND
								|| header.getSubject().getDocumentType() == MessageType.TAU_RA_PTTND) {
							BusinessInsertTableResultUtils.insertInlandResultNotification(header, objectExcute.getLiObjects());							
						} else {*/
							BusinessInsertTableResultUtils.insertResultNotification(header, objectExcute.getLiObjects());
						/*}*/
						
						checkCangVuTichHop(objectExcute);
					}
				}
				Thread.sleep(timeSleep);
			} catch (Exception e) {
				_log.error(e);
			}
		}
	}
	
	public void start() {
		if (t == null) {
			t = new Thread(this, threadName);
			t.setUncaughtExceptionHandler(h);
			t.start();
			_log.info("===Starting-------------- " + t.getName());
		}
	}
	
	private boolean checkCangVuTichHop(ObjectExcute objectExcute) {
		boolean isCangVuTichHop = false;
		
		TempDocument tempDocument = null;
		
		if(objectExcute.getHeader().getSubject().getDocumentType() == MessageType.NHAP_CANH
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.XUAT_CANH
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.QUA_CANH
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.TAU_VAO
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.TAU_RA
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.NHAP_CANG_DAU_KHI
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.XUAT_CANG_DAU_KHI
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.VAO_CANG_DAU_KHI
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.ROI_CANG_DAU_KHI
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.CHUYEN_CANG_VAO
				|| objectExcute.getHeader().getSubject().getDocumentType() == MessageType.CHUYEN_CANG_ROI) {
			
			List<TempDocument> liTempDocuments = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(objectExcute.getHeader()
					.getSubject().getReference(), objectExcute.getHeader().getSubject().getDocumentYear());
			
			if (liTempDocuments != null && liTempDocuments.size() > 0) {
				_log.info("==============liTempDocuments.get(0).getMaritimeCode()===========" + liTempDocuments.get(0).getMaritimeCode());
				tempDocument = liTempDocuments.get(0);
				
				try {
					InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil.findInterfaceRequestByRequestCode(objectExcute.getHeader()
							.getReference().getMessageId());
					if (interfaceRequest != null) {
						interfaceRequest.setLocCode(tempDocument.getMaritimeCode());
						interfaceRequest.setOrganizationCode("01");
						InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
					}
				} catch (Exception e) {
					_log.info(e);
				}
			
				//TODO tam thoi de comment
				try {
					HistoryInterfaceRequest historyInterfaceRequest = HistoryInterfaceRequestLocalServiceUtil.findHistoryInterfaceRequestByRequestCode(objectExcute.getHeader().getReference().getMessageId());
					if (historyInterfaceRequest != null) {
						historyInterfaceRequest.setLocCode(tempDocument.getMaritimeCode());
						historyInterfaceRequest.setOrganizationCode("01");
						HistoryInterfaceRequestLocalServiceUtil.updateHistoryInterfaceRequest(historyInterfaceRequest);
					}
//					
				} catch (Exception e) {
					_log.info(e);
				}

				for (DmGtRouteConfig dmGtRouteConfig : ThreadPassingMessage.liConfigs) {
					if (dmGtRouteConfig != null 
							&& dmGtRouteConfig.getLocCode().equalsIgnoreCase(tempDocument.getMaritimeCode())) {
						
						isCangVuTichHop = true;
						break;
					}
				}
				
				if(isCangVuTichHop) {
					_log.info("===insertMessageQueue===CVHH===" + objectExcute.getHeader().getSubject().getDocumentType());
					
					//TODO: Fix cung cho truong hop gui di CVHH HCM nhung bi loi k gui duoc nen de uu tien thap
					if(tempDocument.getMaritimeCode().equalsIgnoreCase("21")) {
						//TODO: Khong dua vao queue truong hop la cang vu 21
						/*SendMessgaeFunctions.insertMessageQueue(objectExcute.getHeader(), objectExcute.getXmlData(),
							MessageType.REQUEST_DIRECTION_OUT_CVHH, null, MessgaePriorityLevels.LOWER);*/
					} else {
						SendMessgaeFunctions.insertMessageQueue(objectExcute.getHeader(), objectExcute.getXmlData(),
							MessageType.REQUEST_DIRECTION_OUT_CVHH, null, MessgaePriorityLevels.HIGHT);
					}
				}
			}
		}
		
		return isCangVuTichHop;
	}
	
	private void sendMessageTuChoiHoSo(String userName, String lyDoTuChoi, Header header) throws RemoteException {
		// InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil.findInterfaceRequestByRequestCode(requestCode);
		String function = MessageType.FUNCTION_TU_CHOI_HO_SO_CHUNG_TU;
		header.getSubject().setFunction(function);
		
		if (lyDoTuChoi == null || lyDoTuChoi.length() == 0) {
			lyDoTuChoi = "System";
		}
		BusinessUtils businessUtils = new BusinessUtils();
		String xmlData = businessUtils.sendMessageReject(header, header.getReference().getMessageId(), lyDoTuChoi, "System", "System", header
				.getFrom().getName(), new Date(), null);
		
		xmlData = businessUtils.createContentSendFromBGTVTToNSW(header, xmlData);
//		IMTService imtService = CallWs2HaiQuan.getIMTSercice();
		
		if (xmlData != null && xmlData.length() > 0) {
			businessUtils.insertHistorySendMessage(xmlData);
			
			_log.info("==xml==");
			_log.info(xmlData);
//			String  xml = "";
			if(MessageType.TAU_VAO == header.getSubject().getDocumentType() ||MessageType.TAU_RA == header.getSubject().getDocumentType()){
				_log.info("==Call receiveFromInland==");
			//	xml = imtService.receiveFromInland(xmlData);
				
			}else{
				_log.info("==Call receiveResultFromMT==");
				//xml = imtService.receiveResultFromMT(xmlData);
			}				
			_log.info("=======Du lieu NHAN  HQMC day ========");			
			//businessUtils.insertHistoryReceiveMessageResponse(xml);
		}
	}
	
}
