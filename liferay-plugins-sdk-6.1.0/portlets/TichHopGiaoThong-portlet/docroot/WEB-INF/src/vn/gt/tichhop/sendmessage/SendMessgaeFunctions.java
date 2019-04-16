package vn.gt.tichhop.sendmessage;

import java.util.Date;

import vn.dao.gt.asw.model.AswmsgMessageQueue;
import vn.dao.gt.asw.model.impl.AswmsgMessageQueueImpl;
import vn.dao.gt.asw.service.AswmsgMessageQueueLocalServiceUtil;
import vn.nsw.Header;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class SendMessgaeFunctions {
	
	private static Log log = LogFactoryUtil.getLog(SendMessgaeFunctions.class);
	
//	public String insertMesssageToQueue(String userName, Header header) {
//		//Header header =null;
//		try {
//			
////			String messageIdSentToNSW = messageId;
////			 header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW,
////					version,hoSoThuTuc);
//
//			// log.info("========header===sendTestToNSW===" + header);
//			
//			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
//			SendMessgaeFunctions.insertMessageQueue(header, xmlData, MessageKey.HTTH_BGT_TO_NSW,
//					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW,level,hoSoThuTuc.getId(),phieuSuLyPhuId);
//		//	log.info("=====Du lieu gui di HQMC==="+xmlData);
//			_log.debug(xmlData,null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return xmlData;
//	}
//	
	
	public static long insertMessageQueue(Header header, String data, String direction, String requestCode,int level) {
		try {
			log.info("start add Messagequeue and requestcode ====: " + requestCode);
			AswmsgMessageQueue aswmsgMessageQueue = new AswmsgMessageQueueImpl();
			
			if (requestCode == null) {
				aswmsgMessageQueue.setMessageId(header.getReference().getMessageId());
			} else {
				aswmsgMessageQueue.setMessageId(requestCode);
			}
			long id = CounterLocalServiceUtil.increment();
			log.info("id messagequeue=======: " + id);
			aswmsgMessageQueue.setId(id);
			aswmsgMessageQueue.setVersion(header.getReference().getVersion());
			aswmsgMessageQueue.setSenderName(header.getFrom().getName());
			aswmsgMessageQueue.setSenderIdentity(header.getFrom().getIdentity());
			aswmsgMessageQueue.setSenderCountryCode(header.getFrom().getCountryCode());
			aswmsgMessageQueue.setSenderMinistryCode(header.getFrom().getMinistryCode());
			aswmsgMessageQueue.setSenderOrganizationCode(header.getFrom().getOrganizationCode());
			aswmsgMessageQueue.setSenderUnitCode(header.getFrom().getUnitCode());
			aswmsgMessageQueue.setPriority(level);
			aswmsgMessageQueue.setReceiverName(header.getTo().getName());
			aswmsgMessageQueue.setReceiverIdentity(header.getTo().getIdentity());
			aswmsgMessageQueue.setReceiverCountryCode(header.getTo().getCountryCode());
			aswmsgMessageQueue.setReceiverMinistryCode(header.getTo().getMinistryCode());
			aswmsgMessageQueue.setReceiverOrganizationCode(header.getTo().getOrganizationCode());
			aswmsgMessageQueue.setReceiverUnitCode(header.getTo().getUnitCode());
			
				aswmsgMessageQueue.setHoSoThuTucId(header.getSubject().getDocumentType());
			
//			if(phieuXuLyPhuId!=null&&phieuXuLyPhuId>0){
//			aswmsgMessageQueue.setPhieuXuLyPhuId(phieuXuLyPhuId);
//			}
			aswmsgMessageQueue.setDocumentType(String.valueOf(header.getSubject().getDocumentType()));
			aswmsgMessageQueue.setType(header.getSubject().getType());
			aswmsgMessageQueue.setFunction(header.getSubject().getFunction());
			aswmsgMessageQueue.setReference(header.getSubject().getReference());
			aswmsgMessageQueue.setPreReference(header.getSubject().getPreReference());
			aswmsgMessageQueue.setDocumentYear(header.getSubject().getDocumentYear());
			aswmsgMessageQueue.setSendDate(vn.gt.utils.FormatData.parseStringToDate(header.getSubject().getSendDate()));
			aswmsgMessageQueue.setSignature("hashcode");
			aswmsgMessageQueue.setSystemSignature("hashcode");
			aswmsgMessageQueue.setAllContent(data);
			aswmsgMessageQueue.setCreatedTime(new Date());
			aswmsgMessageQueue.setWebservice(-1);
			aswmsgMessageQueue.setValidated(-1);
			aswmsgMessageQueue.setValidationCode(direction);
			
			aswmsgMessageQueue = AswmsgMessageQueueLocalServiceUtil.addAswmsgMessageQueue(aswmsgMessageQueue);
			log.info("end add Messagequeue=============");
			return id;
		} catch (Exception e) {
			log.error(e);
		}
		return 0;
	}

}
