/**
 * 
 */
package vn.gt.tichhop.message;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import vn.gt.dao.danhmucgt.model.DmMinistry;
import vn.gt.dao.danhmucgt.service.DmMinistryLocalServiceUtil;
import vn.gt.dao.result.model.ResultCompetion;
import vn.gt.dao.result.model.ResultHistoryMinistry;
import vn.gt.dao.result.model.ResultMinistry;
import vn.gt.dao.result.model.impl.ResultCompetionImpl;
import vn.gt.dao.result.model.impl.ResultHistoryMinistryImpl;
import vn.gt.dao.result.model.impl.ResultMinistryImpl;
import vn.gt.dao.result.service.ResultCompetionLocalServiceUtil;
import vn.gt.dao.result.service.ResultHistoryMinistryLocalServiceUtil;
import vn.gt.dao.result.service.ResultMinistryLocalServiceUtil;
import vn.gt.utils.ConstantCoQuanBanNganh;
import vn.gt.utils.FormatData;
import vn.nsw.Header;
import vn.nsw.Header.Reference;
import vn.nsw.Header.Subject;
import vn.nsw.Header.To;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class NhanKetQuaCoQuanBanNganhUtils {
	
	private static Log _log = LogFactoryUtil.getLog(NhanKetQuaCoQuanBanNganhUtils.class);
	// private static final Set<String> TYPE_VALUES = new HashSet<String>(
	// Arrays.asList(new String[] { "30", "31", "32", "40", "42", "99", "26", "91" }));
	private static String[] TYPE_VALUES = { "30", "31", "32", "40", "42", "99", "26", "91" };
	private static String[] FUNCTION_VALUES = { "21", "22", "23", "24", "26" };
	
	// private static final Set<String> FUNCTION_VALUES = new HashSet<String>(Arrays.asList(new String[] { "21", "22", "23", "24", "26" }));
	public static boolean checkType(String messageType) {
		boolean result = false;
		for (int i = 0; i < TYPE_VALUES.length; i++) {
			
			if (TYPE_VALUES[i].equals(messageType)) {
				
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static boolean checkFunction(String function) {
		boolean result = false;
		
		for (int i = 0; i < FUNCTION_VALUES.length; i++) {
			
			if (FUNCTION_VALUES[i].equals(function)) {
				
				result = true;
				break;
			}
		}
		return result;
	}
	
	//TODO phan hoi cua cac co quan ban nganh
	public static boolean checkCoQuanBanNganh(Header header) {
		if (header == null) {
			return false;
		}
		String messageType = header.getSubject().getType() + "";
		String function = header.getSubject().getFunction();
		
		if (checkType(messageType) && checkFunction(function)) {
			DmMinistry dmMinistry = DmMinistryLocalServiceUtil.findByMinistryCode(header.getFrom().getIdentity());
			if (dmMinistry == null) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static String executeKetQuaBanNganh(Header header, String data) {
		
		_log.info("==executeKetQuaBanNganh==");
		
		int messageType = header.getSubject().getType();
		// String messageId =header.getReference().getMessageId();
		String coQuanBanNganh = header.getFrom().getIdentity();
		
		// if (messageType != 91) {
		insertOrUpdateResultMinistry(header, data);
		insertResultHistoryMinistry(header, data);
		// header.getSubject().setFunction(String.valueOf(MessageType.FUNCTION_TYPE_MESSAGETYPE_RESPONSE_WHEN_RECEIVE_REQUEST));
		
		ketQuaPheDuyetHoSo(header, data, messageType, coQuanBanNganh);
		// }
		// else{
		// insertOrUpdateResultMinistry(header, data);
		// insertResultHistoryMinistry(header, data);
		// ketQuaThongQuan(header, data, messageType, coQuanBanNganh);
		//
		// }
		
		BusinessUtils businessUtils = new BusinessUtils();
		// if (header != null && header.getReference() != null) {
		// businessUtils.updateHistory(messageId,
		// TrangThaiHoSo.HISTORY_REQUEST_STATE_GHI_NHAN);
		// }
		createXmlHeader(header);
		return businessUtils.sendMessageHoSo(header, new Date());
	}
	
	// private static void ketQuaThongQuan(Header header, String data,
	// int messageType, String coQuanBanNganh) {
	// Object object = MessageFactory.convertXmltoObjectWithFunction(
	// new Integer(header.getSubject().getFunction()), header
	// .getSubject().getType(), data);
	// if(object instanceof KetQuaThongQuan){
	// KetQuaThongQuan ketQuaThongQuan = (KetQuaThongQuan)object;
	// ResultNotification notification = null;
	// List<ResultNotification> resultNotifications =
	// ResultNotificationLocalServiceUtil.findByDocumentNameAnddocumentYear(header.getSubject().getReference(),
	// header.getSubject().getDocumentYear());
	// if(resultNotifications != null && resultNotifications.size()>0){
	// notification = resultNotifications.get(0);
	// }else{
	// notification= new ResultNotificationImpl();
	// }
	// notification.setBusinessTypeCode(messageType);
	// notification.setDivision(header.getSubject().g);
	// notification.setDocumentName(header.getSubject().getReference());
	// notification.setDocumentYear(header.getSubject().getDocumentYear());
	// notification.setIsReply(ketQuaThongQuan.getIsReply());
	// notification.setRemarks(ketQuaThongQuan.getRemarks());
	//
	// notification.setLatestDate(ketQuaThongQuan.getLatestDate());
	// notification.setOrganization(ketQuaThongQuan.getOrganization());
	//
	// notification.setOfficerName(ketQuaThongQuan.getOfficerName());
	//
	//
	//
	// }
	//
	// }
	private static void ketQuaPheDuyetHoSo(Header header, String data, int messageType, String coQuanBanNganh) {
		try {
			_log.debug("==ketQuaPheDuyetHoSo==" + messageType + "==coQuanBanNganh==" + coQuanBanNganh);
			
			boolean isNew = true;
			
			if (messageType == MessageType.HO_SO ||
					messageType == MessageType.FUNCTION_XAC_NHAN_HOAN_THANH || messageType == MessageType.XAC_NHAN_THONG_QUAN ||
					messageType == MessageType.PHE_DUYET_TU_CO_QUAN_BAN_NGANH) {
				
				ResultCompetion result = ResultCompetionLocalServiceUtil.findByDocumentNameAndDocumentYear(header.getSubject() .getReference(), header.getSubject().getDocumentYear());
				
				if (result == null) {
					result = new ResultCompetionImpl();
					result.setDocumentName(header.getSubject().getReference());
					result.setDocumentYear(header.getSubject().getDocumentYear());
					result.setRequestCode(UUID.randomUUID().toString());
					
					isNew = true;
					setValue2ResultCompetion(header, data, coQuanBanNganh, result, isNew);
					
					// resultCompetion.setMaritimeCode(maritimeCode);
					// resultCompetion.setNameOfShip(nameOfShip);
					// resultCompetion.setNameOfMaster(nameOfMaster);
					// resultCompetion.setPortOfArrivalCode(portOfArrivalCode);
					// resultCompetion.setRequestState(requestState);
					// resultCompetion.setCertificateNo(certificateNo);
					// resultCompetion.setFlagStateOfShip(flagStateOfShip);
					// resultCompetion.setGrossTonnage(grossTonnage);
					// resultCompetion.setApprovalTime(approvalTime);
					// resultCompetion.setApprovalName(approvalName);
					
					ResultCompetionLocalServiceUtil.addResultCompetion(result);
				} else {
					//update trang thai moi, phan hoi cua cac bo nganh
					isNew = false;
					
					setValue2ResultCompetion(header, data, coQuanBanNganh, result, isNew);
					ResultCompetionLocalServiceUtil.updateResultCompetion(result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static void createXmlHeader(Header header) {
		String identity = Long.toString(System.currentTimeMillis());
		
		Reference ref = header.getReference();
		
		ref.setMessageId("BGTVT" + identity);
		
		Header.From from = header.getFrom();
		
		String name = from.getName();
		from.setName("BGTVT");
		from.setIdentity("BGTVT");
		Subject subject = header.getSubject();
		subject.setFunction(String.valueOf(MessageType.FUNCTION_TYPE_MESSAGETYPE_RESPONSE_WHEN_RECEIVE_REQUEST));
		subject.setSendDate(FormatData.parseDateToTring(new Date()));
		To to = header.getTo();
		to.setIdentity("BTC");
		to.setName(name);
	}
	
	private static void insertOrUpdateResultMinistry(Header header, String xmContent) {
		try {
			_log.info("insertOrUpdateResultMinistry==Type==" + header.getSubject().getType());
			
			
			/*List<ResultMinistry> resultMinistrys = ResultMinistryLocalServiceUtil.findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
					(new Long(header.getSubject().getReference())).intValue(), header.getSubject().getDocumentYear(), header.getFrom().getIdentity(),
					header.getSubject().getType());*/
			
			int documentName = (new Long(header.getSubject().getReference())).intValue();
			int documentYear = header.getSubject().getDocumentYear();
			String ministryCode = header.getFrom().getIdentity();
			int businessTypeCode = header.getSubject().getType();
			List<ResultMinistry> lstMinistry = ResultMinistryLocalServiceUtil.findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(documentName, documentYear, ministryCode, businessTypeCode);
			
			ResultMinistry resultMinistry = null;
			if (lstMinistry != null && lstMinistry.size() > 0) {
				resultMinistry = lstMinistry.get(0);
			}
			if (resultMinistry == null) {
				_log.info("==insert==ResultMinistry ");
				resultMinistry = new ResultMinistryImpl();
				setValue2ResultMinistry(header, resultMinistry, xmContent, true);
				ResultMinistryLocalServiceUtil.addResultMinistry(resultMinistry);
			} else {
				_log.info("==Update==ResultMinistry ");
				setValue2ResultMinistry(header, resultMinistry, xmContent, false);
				ResultMinistryLocalServiceUtil.updateResultMinistry(resultMinistry);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void insertResultHistoryMinistry(Header header, String xmContent) {
		try {
			_log.debug("==insertOrUpdateResultMinistry=Subject=Type==" + header.getSubject().getType());
			ResultHistoryMinistry result = new ResultHistoryMinistryImpl();
			result.setBusinessTypeCode(header.getSubject().getType());
			result.setDocumentName((new Long(header.getSubject().getReference())).intValue());
			result.setDocumentYear(header.getSubject().getDocumentYear());
			result.setLatestDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
			// resultMinistry.setRemarks(remarks)
			result.setRequestCode(header.getReference().getMessageId());
			result.setResponse(header.getSubject().getFunction());
			// resultMinistry.setOfficerName(officerName)
			
			setValue2HistoryMinistry(header, result, xmContent);
			ResultHistoryMinistryLocalServiceUtil.addResultHistoryMinistry(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void setValue2ResultMinistry(Header header, ResultMinistry resultMinistry, String xmContent, Boolean isNew) {
		_log.info("==setValue2ResultMinistry=");
		
		resultMinistry.setBusinessTypeCode(header.getSubject().getType());
		
		if (header.getSubject().getType() == MessageType.FUNCTION_XAC_NHAN_HOAN_THANH || header.getSubject().getType() == MessageType.XAC_NHAN_THONG_QUAN) {
			resultMinistry.setBusinessTypeCode(MessageType.HO_SO);
		}
		
		resultMinistry.setDocumentName((new Long(header.getSubject().getReference())).intValue());
		resultMinistry.setDocumentYear(header.getSubject().getDocumentYear());
		resultMinistry.setLatestDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
		resultMinistry.setRequestCode(header.getReference().getMessageId());
		resultMinistry.setResponse(header.getSubject().getFunction());
		resultMinistry.setRequestState(TrangThaiBanKhai.TRANG_THAI_BANG_KHAI_MOI);
		resultMinistry.setMinistryCode(header.getFrom().getIdentity());
		
		int function = new Integer(header.getSubject().getFunction());
		int type = header.getSubject().getType();
		//Object object = MessageFactory.convertXmltoObjectWithFunction(new Integer(header.getSubject().getFunction()), header.getSubject().getType(), xmContent);
		Object object = MessageFactory.convertXmltoObjectWithFunction(function, type, xmContent);
		
		if (object != null) {
			if (object instanceof RejectMessage) {
				RejectMessage rejectMessage = (RejectMessage) object;
				resultMinistry.setRemarks(rejectMessage.getRejectDesc());
				resultMinistry.setOfficerName(rejectMessage.getName());
				resultMinistry.setDivision(rejectMessage.getDivision());
				resultMinistry.setOrganization(rejectMessage.getOrganization());
				// resultMinistry.set
				
			} else if (object instanceof AccepterMessage) {
				AccepterMessage accepterMessage = (AccepterMessage) object;
				resultMinistry.setOfficerName(accepterMessage.getName());
				resultMinistry.setDivision(accepterMessage.getDivision());
				resultMinistry.setOrganization(accepterMessage.getOrganization());
				
			} else if (object instanceof String) {
				String receiveDate = (String) object;
				resultMinistry.setLatestDate(FormatData.parseStringToDate(receiveDate));
				
			} else if (object instanceof XacNhanHuyThuTuc) {
				XacNhanHuyThuTuc xacNhanHuyThuTuc = (XacNhanHuyThuTuc) object;
				resultMinistry.setLatestDate(FormatData.parseStringToDate(xacNhanHuyThuTuc.getCancelDate()));
				resultMinistry.setOfficerName(xacNhanHuyThuTuc.getName());
				resultMinistry.setDivision(xacNhanHuyThuTuc.getDivision());
				resultMinistry.setOrganization(xacNhanHuyThuTuc.getOrganization());
				
			} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
				PheDuyetHoSoTuCacBoNganh pheDuyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
				
				resultMinistry.setLatestDate(FormatData.parseStringToDate(pheDuyetHoSoTuCacBoNganh.getApprovalDate()));
				resultMinistry.setOfficerName(pheDuyetHoSoTuCacBoNganh.getName());
				resultMinistry.setDivision(pheDuyetHoSoTuCacBoNganh.getDivision());
				resultMinistry.setOrganization(pheDuyetHoSoTuCacBoNganh.getOrganization());
				
				resultMinistry.setRemarks(pheDuyetHoSoTuCacBoNganh.getComment());
				
				_log.info("====ApprovalStatus==" + pheDuyetHoSoTuCacBoNganh.getApprovalStatus() + "==Name==" + pheDuyetHoSoTuCacBoNganh.getName());
				
				//pheDuyetHoSoTuCacBoNganh.get
				
				if (pheDuyetHoSoTuCacBoNganh.getApprovalStatus().equals("1")) {
					resultMinistry.setResponse(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH + "");
					
				} else if (pheDuyetHoSoTuCacBoNganh.getApprovalStatus().equals("0")) {
					if (pheDuyetHoSoTuCacBoNganh.getName().equals("SYSTEM")) {
						//TODO ket qua phe duyet cac bo nganh. //doi void Status = 0, name = "SYSTEM", chuyen ve da phe duyet, con lai la binh thuong
						//code cũ
						resultMinistry.setResponse(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH + "");
						
						//code moi
						//resultMinistry.setResponse(MessageType.FUNCTION_BO_NGANH_PHE_DUYET + "");
					} else {
						resultMinistry.setResponse(MessageType.FUNCTION_TU_CHOI_HO_SO + "");
					}
					
				} else if (pheDuyetHoSoTuCacBoNganh.getApprovalStatus().equals("2")) {
					resultMinistry.setResponse(MessageType.FUNCTION_BO_NGANH_PHE_DUYET + "");
				}
				resultMinistry.setBusinessTypeCode(MessageType.HO_SO);
				
			} else if (object instanceof KetQuaThongQuan) {
				KetQuaThongQuan ketQuaThongQuan = (KetQuaThongQuan) object;
				resultMinistry.setLatestDate(FormatData.parseStringToDate(ketQuaThongQuan.getLatestDate()));
				resultMinistry.setOfficerName(ketQuaThongQuan.getOfficerName());
				resultMinistry.setRemarks(ketQuaThongQuan.getRemarks());
				
				if (ketQuaThongQuan.getIsReply() == 0) {
					resultMinistry.setResponse(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH + "");
				} else if (ketQuaThongQuan.getIsReply() == 1) {
					resultMinistry.setResponse(MessageType.FUNCTION_TU_CHOI_HO_SO + "");
				}
				resultMinistry.setBusinessTypeCode(MessageType.HO_SO);
				// resultMinistry.setRequestState(requestState)
			}
		}
	}
	
	private static void setValue2HistoryMinistry(Header header, ResultHistoryMinistry ministry, String xmContent) {
		ministry.setBusinessTypeCode(header.getSubject().getType());
		if (header.getSubject().getType() == MessageType.FUNCTION_XAC_NHAN_HOAN_THANH || header.getSubject().getType() == MessageType.XAC_NHAN_THONG_QUAN) {
			ministry.setBusinessTypeCode(MessageType.HO_SO);
		}
		
		ministry.setDocumentName((new Long(header.getSubject().getReference())).intValue());
		ministry.setDocumentYear(header.getSubject().getDocumentYear());
		ministry.setLatestDate(FormatData.parseStringToDate(header.getSubject().getSendDate()));
		ministry.setRequestCode(header.getReference().getMessageId());
		ministry.setResponse(header.getSubject().getFunction());
		ministry.setRequestState(TrangThaiBanKhai.TRANG_THAI_BANG_KHAI_MOI);
		ministry.setMinistryCode(header.getFrom().getIdentity());
		
		Object object = MessageFactory.convertXmltoObjectWithFunction(new Integer(header.getSubject().getFunction()), header.getSubject().getType(), xmContent);
		if (object != null) {
			if (object instanceof RejectMessage) {
				RejectMessage rejectMessage = (RejectMessage) object;
				ministry.setRemarks(rejectMessage.getRejectDesc());
				ministry.setOfficerName(rejectMessage.getName());
				ministry.setDivision(rejectMessage.getDivision());
				ministry.setOrganization(rejectMessage.getOrganization());
				// resultMinistry.set
				
			} else if (object instanceof AccepterMessage) {
				AccepterMessage accepterMessage = (AccepterMessage) object;
				ministry.setOfficerName(accepterMessage.getName());
				ministry.setDivision(accepterMessage.getDivision());
				ministry.setOrganization(accepterMessage.getOrganization());
				
			} else if (object instanceof String) {
				String receiveDate = (String) object;
				ministry.setLatestDate(FormatData.parseStringToDate(receiveDate));
				
			} else if (object instanceof XacNhanHuyThuTuc) {
				XacNhanHuyThuTuc xacNhanHuyThuTuc = (XacNhanHuyThuTuc) object;
				ministry.setLatestDate(FormatData.parseStringToDate(xacNhanHuyThuTuc.getCancelDate()));
				ministry.setOfficerName(xacNhanHuyThuTuc.getName());
				ministry.setDivision(xacNhanHuyThuTuc.getDivision());
				ministry.setOrganization(xacNhanHuyThuTuc.getOrganization());
				
			} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
				PheDuyetHoSoTuCacBoNganh pheDuyet = (PheDuyetHoSoTuCacBoNganh) object;
				ministry.setLatestDate(FormatData.parseStringToDate(pheDuyet.getApprovalDate()));
				ministry.setOfficerName(pheDuyet.getName());
				ministry.setDivision(pheDuyet.getDivision());
				ministry.setOrganization(pheDuyet.getOrganization());
				ministry.setRemarks(pheDuyet.getComment());
				
				if (pheDuyet.getApprovalStatus().equals("1")) {
					ministry.setResponse(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH + "");
				} else if (pheDuyet.getApprovalStatus().equals("0")) {
					//TODO ket qua phe duyet cac bo nganh. //doi void Status = 0, name = "SYSTEM", chuyen ve da phe duyet, con lai la binh thuong
					if (pheDuyet.getName().equals("SYSTEM")) {
						ministry.setResponse(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH + "");
					} else {
						ministry.setResponse(MessageType.FUNCTION_TU_CHOI_HO_SO + "");
					}
					
				} else if (pheDuyet.getApprovalStatus().equals("2")) {
					ministry.setResponse(MessageType.FUNCTION_BO_NGANH_PHE_DUYET + "");
				}
				ministry.setBusinessTypeCode(MessageType.HO_SO);
				
			} else if (object instanceof KetQuaThongQuan) {
				KetQuaThongQuan ketQuaThongQuan = (KetQuaThongQuan) object;
				ministry.setLatestDate(FormatData.parseStringToDate(ketQuaThongQuan.getLatestDate()));
				ministry.setOfficerName(ketQuaThongQuan.getOfficerName());
				ministry.setRemarks(ketQuaThongQuan.getRemarks());
				
				if (ketQuaThongQuan.getIsReply() == 0) {
					ministry.setResponse(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH + "");
				} else if (ketQuaThongQuan.getIsReply() == 1) {
					ministry.setResponse(MessageType.FUNCTION_TU_CHOI_HO_SO + "");
				}
				// resultMinistry.setRequestState(requestState)
				ministry.setBusinessTypeCode(MessageType.HO_SO);
			}
			
		}
	}
	
private static void setValue2ResultCompetion(Header header, String data, String coQuanBanNganh, ResultCompetion resultCom, boolean isNew) {
		
		_log.info("==setValue2ResultCompetion==header==" + header);
		_log.info("==setValue2ResultCompetion==coQuanBanNganh==" + coQuanBanNganh);
		_log.info("==setValue2ResultCompetion==resultCompetion==" + resultCom.getId());
		
		resultCom.setRequestState(TrangThaiBanKhai.CHO_PHE_DUYET_HOAN_THANH_THU_TUC);
		// Add them truong null
		int status = MessageType.CHO_PHE_DUYET;
		
		if (isNew == true) {
			resultCom.setResponseStatusHQ(status);
			resultCom.setResponseStatusBP(status);
			resultCom.setResponseStatusYT(status);
			resultCom.setResponseStatusTV(status);
			resultCom.setResponseStatusDV(status);
			resultCom.setResponseStatusCVHH(status);
		}
		
		int function = new Integer(header.getSubject().getFunction());
		int type = header.getSubject().getType();
		String xmContent = data;
		/*Object object = MessageFactory.convertXmltoObjectWithFunction(new Integer(header.getSubject().getFunction()), header.getSubject().getType(), data);*/
		Object object = MessageFactory.convertXmltoObjectWithFunction(function, type, xmContent);
		
		if (coQuanBanNganh != null && coQuanBanNganh.length() > 0) {
			if (header.getSubject().getFunction().equals(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)) {
				status = MessageType.DA_PHE_DUYET;
				
			} else if (header.getSubject().getFunction().equals(MessageType.FUNCTION_TU_CHOI_HO_SO_CHUNG_TU)
					|| header.getSubject().getFunction().equals(MessageType.FUNCTION_XAC_NHAN_HUY_THU_TUC)) {
				status = MessageType.TU_CHOI;
				
			} else if (header.getSubject().getFunction().equals(MessageType.FUNCTION_KET_QUA_PHE_DUYET_TU_CO_QUAN_BAN_NGANH)) {
				
				if (object instanceof PheDuyetHoSoTuCacBoNganh) {
					PheDuyetHoSoTuCacBoNganh phetDuyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
					
					if (phetDuyetHoSoTuCacBoNganh.getApprovalStatus().equals("1")) {
						status = MessageType.DA_PHE_DUYET;
						
					} else if (phetDuyetHoSoTuCacBoNganh.getApprovalStatus().equals("0")) {
						if (phetDuyetHoSoTuCacBoNganh.getName().equalsIgnoreCase("SYSTEM")) {
							//doi void Status = 0, name = "SYSTEM", chuyen ve da phe duyet, con lai la binh thuong
							status = MessageType.DA_PHE_DUYET;
						} else {
							status = MessageType.TU_CHOI;
						}
						
						
					} else if (phetDuyetHoSoTuCacBoNganh.getApprovalStatus().equals("2")) {
						status = MessageType.TU_CHOI;
					}
				}
			}
			if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.B_TAI_CHINH)) {
				_log.info("==Bo tai chinh==");
				resultCom.setResponseStatusHQ(status);
				resultCom.setResponseTimeHQ(FormatData.parseStringToDate(header.getSubject().getSendDate()));
				if (object != null) {
					if (object instanceof RejectMessage) {
						RejectMessage rejectMessage = (RejectMessage) object;
						resultCom.setResponseHQ(rejectMessage.getRejectDesc());
						
					} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
						PheDuyetHoSoTuCacBoNganh duyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
						resultCom.setResponseHQ(duyetHoSoTuCacBoNganh.getComment());
						resultCom.setResponseTimeHQ(FormatData.parseStringToDate(duyetHoSoTuCacBoNganh.getApprovalDate()));
						
					} else if (object instanceof KetQuaThongQuan) {
						KetQuaThongQuan ketQuaThongQuan = (KetQuaThongQuan) object;
						resultCom.setResponseHQ(ketQuaThongQuan.getRemarks());
						
						if (ketQuaThongQuan.getIsReply() == 0) {
							resultCom.setResponseStatusHQ(MessageType.DA_PHE_DUYET);
						} else if (ketQuaThongQuan.getIsReply() == 1) {
							resultCom.setResponseStatusHQ(MessageType.TU_CHOI);
						}
						resultCom.setResponseTimeHQ(FormatData.parseStringToDate(ketQuaThongQuan.getLatestDate()));
						
						// resultMinistry.setRequestState(requestState)
					} else {
						resultCom.setResponseHQ("");
					}
				}
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.B_CONG_THUONG)) {
				_log.info("==Bo cong thuong==");
				// resultCompetion
				// .setResponseStatusHQ(FormatData.convertToInt(header.getSubject().getFunction()));
				// resultCompetion.setResponseTimeHQ(FormatData.parseStringToDate(
				// header.getSubject().getSendDate()));
				// if (object != null) {
				// if (object instanceof RejectMessage) {
				// RejectMessage rejectMessage = (RejectMessage) object;
				// resultCompetion.setResponseHQ(rejectMessage.getRejectDesc());
				// }
				// }
				
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.B_QUOC_PHONG)) {
				_log.info("==Bo quoc phong==");
				resultCom.setResponseStatusBP(status);
				resultCom.setResponseTimeBP(FormatData.parseStringToDate(header.getSubject().getSendDate()));
				if (object != null) {
					if (object instanceof RejectMessage) {
						RejectMessage rejectMessage = (RejectMessage) object;
						resultCom.setResponseBP(rejectMessage.getRejectDesc());
					} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
						PheDuyetHoSoTuCacBoNganh duyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
						resultCom.setResponseBP(duyetHoSoTuCacBoNganh.getComment());
						resultCom.setResponseTimeBP(FormatData.parseStringToDate(duyetHoSoTuCacBoNganh.getApprovalDate()));
					} else {
						resultCom.setResponseBP("");
					}
				}
				
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.BGTVT)) {
				_log.info("==Bo giao thong van tai==");
//				resultCompetion.setResponseStatusHQ(FormatData.convertToInt(header.getSubject().getFunction()));
//				resultCompetion.setResponseTimeHQ(FormatData.parseStringToDate(header.getSubject().getSendDate()));
//				if (object != null) {
//				if (object instanceof RejectMessage) {
//				RejectMessage rejectMessage = (RejectMessage) object;
//				resultCompetion.setResponseHQ(rejectMessage.getRejectDesc());
//				}
//				}
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.BYTE)) {
				_log.info("==Bo y te==");
				resultCom.setResponseStatusYT(status);
				resultCom.setResponseTimeYT(FormatData.parseStringToDate(header.getSubject().getSendDate()));
				if (object != null) {
					if (object instanceof RejectMessage) {
						RejectMessage rejectMessage = (RejectMessage) object;
						resultCom.setResponseYT(rejectMessage.getRejectDesc());
						
					} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
						PheDuyetHoSoTuCacBoNganh duyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
						resultCom.setResponseYT(duyetHoSoTuCacBoNganh.getComment());
						resultCom.setResponseTimeYT(FormatData.parseStringToDate(duyetHoSoTuCacBoNganh.getApprovalDate()));
						
					} else {
						resultCom.setResponseYT("");
					}
				}
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.BNN_PTNT_TV)) {
				_log.info("==Bo nong nghiep & phat trien nong thon==");
				// TV
				resultCom.setResponseStatusTV(status);
				resultCom.setResponseTimeTV(FormatData.parseStringToDate(header.getSubject().getSendDate()));
				if (object != null) {
					if (object instanceof RejectMessage) {
						RejectMessage rejectMessage = (RejectMessage) object;
						resultCom.setResponseTV(rejectMessage.getRejectDesc());
					} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
						PheDuyetHoSoTuCacBoNganh duyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
						resultCom.setResponseTV(duyetHoSoTuCacBoNganh.getComment());
						resultCom.setResponseTimeTV(FormatData.parseStringToDate(duyetHoSoTuCacBoNganh.getApprovalDate()));
					} else {
						resultCom.setResponseTV("");
					}
				}
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.BNN_PTNT_TY)) {
				_log.info("==Bo nong nghiep & phat trien nong thon - THUY Y==");
				// DV
				resultCom.setResponseStatusDV(status);
				resultCom.setResponseTimeDV(FormatData.parseStringToDate(header.getSubject().getSendDate()));
				if (object != null) {
					if (object instanceof RejectMessage) {
						RejectMessage rejectMessage = (RejectMessage) object;
						resultCom.setResponseDV(rejectMessage.getRejectDesc());
					} else if (object instanceof PheDuyetHoSoTuCacBoNganh) {
						PheDuyetHoSoTuCacBoNganh duyetHoSoTuCacBoNganh = (PheDuyetHoSoTuCacBoNganh) object;
						resultCom.setResponseDV(duyetHoSoTuCacBoNganh.getComment());
						resultCom.setResponseTimeDV(FormatData.parseStringToDate(duyetHoSoTuCacBoNganh.getApprovalDate()));
					} else {
						resultCom.setResponseDV("");
					}
				}
				
			} else if (coQuanBanNganh.equals(ConstantCoQuanBanNganh.BTN_MT)) {
				_log.info("==Bo tai nguyen moi truong==");
				// resultCompetion
				// .setResponseStatusHQ(FormatData.convertToInt(header.getSubject().getFunction()));
				// resultCompetion.setResponseTimeHQ(FormatData.parseStringToDate(
				// header.getSubject().getSendDate()));
				// if (object != null) {
				// if (object instanceof RejectMessage) {
				// RejectMessage rejectMessage = (RejectMessage) object;
				// resultCompetion.setResponseHQ(rejectMessage.getRejectDesc());
				// }
				// }
			}
		}
	}
	
}
