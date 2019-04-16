package vn.gt.portlet.kehoach.tt14;

import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

import vn.gt.dao.noticeandmessage.model.InterfaceRequest;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.portlet.kehoach.utils.CreateMessageFactoryUtils;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.utils.FormatData;
import vn.nsw.Header;

public class TT14TichHopMessageUtils {

	private static Log _log = LogFactoryUtil.getLog(TT14TichHopMessageUtils.class);

	public static boolean message_99_21(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 21 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_CHAP_NHAN_HO_SO_CHUNG_TU;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_21(BusinessUtils.getOrganizationFromUser(actionRequest),
					businessUtils.getDivision(actionRequest), header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 21 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_99_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_CHOI_HO_SO_CHUNG_TU;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(tempDocument.getRequestCode(), yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);
			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_99_23(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 23 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_23(FormatData.parseDateToTring(new Date()));

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);
			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 23 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_99_24(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 24 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_XAC_NHAN_HUY_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_24(BusinessUtils.getOrganizationFromUser(actionRequest),
					businessUtils.getDivision(actionRequest), header.getFrom().getName(), new Date(), yKienReject);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);
			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 24 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}


	public static boolean message_99_25(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 25 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TAM_DUNG;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_24(BusinessUtils.getOrganizationFromUser(actionRequest),
					businessUtils.getDivision(actionRequest), header.getFrom().getName(), new Date(), yKienReject);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);
			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 25 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	
	public static boolean message_99_27(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 27 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_THONG_BAO_BO_XUNG;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_27(tempDocument.getRequestCode(), yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 27 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_99_28(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 28 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_SUA_DOI_BO_XUNG_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.HO_SO,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_28(tempDocument.getRequestCode(), yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 28 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_99_30(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear) {
		String yKienReject = ParamUtil.getString(uploadPortletRequest, "yKienReject");
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 30 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_THONG_BAO_NOP_PHI;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.TYPE_THONG_BAO_NOP_PHI,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_30(documentName, documentYear);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 30 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_99_31(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear) {
		String yKienReject = ParamUtil.getString(uploadPortletRequest, "yKienReject");
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 99 - 31 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(tempDocument.getRequestCode());

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_THONG_BAO_XAC_NHAN_NOP_PHI;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function, MessageType.TYPE_THONG_BAO_XAC_NHAN_NOP_PHI,
					userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_31(documentName, documentYear);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 99 - 31 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_10_21(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 10 - 21 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_CHAP_NHAN_HO_SO_CHUNG_TU;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.BAN_KHAI_AN_NINH_TAU_BIEN, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_21(BusinessUtils.getOrganizationFromUser(actionRequest),
					businessUtils.getDivision(actionRequest), header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 10 - 21 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_10_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 10 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkTuChoi(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_CHOI_HO_SO_CHUNG_TU;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.BAN_KHAI_AN_NINH_TAU_BIEN, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(requestCode, yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 10 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_30_21(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 31 - 21 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkTuChoi(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_CHAP_NHAN_HO_SO_CHUNG_TU;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.THONG_BAO_TAU_ROI_CANG, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_21(BusinessUtils.getOrganizationFromUser(actionRequest),
					businessUtils.getDivision(actionRequest), header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 31 - 21 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_30_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 31 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkTuChoi(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_CHOI_HO_SO_CHUNG_TU;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.THONG_BAO_TAU_ROI_CANG, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(requestCode, yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 31 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_50_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 50 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkBoSung(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_SUA_DOI_BO_XUNG_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.HO_SO, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(requestCode, yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 50 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_51_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 51 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkBoSung(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_SUA_DOI_BO_XUNG_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.HO_SO, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(requestCode, yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 51 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_52_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 52 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkBoSung(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_SUA_DOI_BO_XUNG_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.HO_SO, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(requestCode, yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 52 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_53_22(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 53 - 22 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkBoSung(userName, yKienReject));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_TU_SUA_DOI_BO_XUNG_THU_TUC;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.HO_SO, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_22(requestCode, yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date());

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 53 - 22 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_65_05(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 65 - 05 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_THONG_BAO_BO_SUNG_HO_SO_CHUNG_TU_KINH_KEM;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.HO_SO, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_05(yKienReject,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date(), tempDocument);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 65 - 05 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_65_00(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 65 - 00 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_KHAI_BAO;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.BAN_KHAI_KET_QUA_XEM_XET_CHUNG_TU_DINH_KEM, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_65(yKienReject, 0,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date(), tempDocument);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 65 - 00 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_65_01(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 65 - 01 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_KHAI_BAO;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.BAN_KHAI_KET_QUA_XEM_XET_CHUNG_TU_DINH_KEM, userName, interfaceRequest);

			xmlData = CreateMessageFactoryUtils.create_65(StringPool.BLANK, 1,
					BusinessUtils.getOrganizationFromUser(actionRequest), businessUtils.getDivision(actionRequest),
					header.getFrom().getName(), new Date(), tempDocument);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 65 - 01 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_60_01(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode,
			int isApprove, String versionNo) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 60 - 01 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_KHAI_BAO;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH_VIET_CAM, userName, interfaceRequest);
			header.getReference().setVersion(versionNo);
			_log.info(requestCode);
			xmlData = businessUtils.sendMessageResult(header, versionNo, requestCode);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 60 - 01 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_62_03(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode,
			int isApprove) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 62 - 03 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_KHAI_HUY_HO_SO;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.HUY_GIAY_PHEP_ROI_CANG, userName, interfaceRequest);

			// NSW - HOA TRAN YEU CAU isApprove = 1
			
			isApprove = 1;
						
			xmlData = CreateMessageFactoryUtils.create_71(BusinessUtils.getOrganizationFromUser(actionRequest),
					businessUtils.getDivision(actionRequest), header.getFrom().getName(), new Date(), yKienReject,
					isApprove);

			xmlData = businessUtils._processMessage(header, tempDocument.getRequestCode(), xmlData);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 62 - 03 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

	public static boolean message_63_01(String userName, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest, long documentName, int documentYear, String yKienReject, String requestCode,
			String versionNo) {
		_log.info(
				"=============================================== -----START----- ================================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== MESSAGE 63 - 01 ===============================================");
		_log.info(
				"===============================================================================================================");
		_log.info(
				"=============================================== BOT BOT BOT BOT ===============================================");
		_log.info("=============================================== " + new Date()
				+ " ==============================================");
		_log.info("======================================userName= " + userName
				+ " ================================================");
		_log.info("==================================documentName= " + documentName
				+ " ============================================");
		_log.info("==================================documentYear= " + documentYear
				+ " ============================================");
		_log.info("===================================yKienReject= " + yKienReject
				+ " =============================================");
		_log.info(
				"===============================================================================================================");

		boolean result = false;
		String xmlData = StringPool.BLANK;
		String xml = StringPool.BLANK;
		try {
			TempDocument tempDocument = TempDocumentLocalServiceUtil
					.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);

			InterfaceRequest interfaceRequest = InterfaceRequestLocalServiceUtil
					.findInterfaceRequestByRequestCode(requestCode);

			if (interfaceRequest != null) {
				interfaceRequest.setRemarks(BusinessUtils.getRemarkChapNhan(userName));
				InterfaceRequestLocalServiceUtil.updateInterfaceRequest(interfaceRequest);
			}

			BusinessUtils businessUtils = new BusinessUtils();

			String function = MessageType.FUNCTION_KHAI_BAO;

			Header header = BusinessUtils.createHeader(tempDocument, MessageType.XUAT_CANH, function,
					MessageType.Y_CAU_CAP_LAI_GIAY_PHEP_ROI_CANG, userName, interfaceRequest);

			xmlData = businessUtils.sendMessageResult(header, versionNo, requestCode);

			result = true;
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}

		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(xmlData);
		_log.info(
				"=============================================== ------xmlData------ =============================================");
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(xml);
		_log.info(
				"=============================================== --------xml-------- =============================================");
		_log.info(
				"=============================================== MESSAGE 63 - 01 ===============================================");
		_log.info(
				"=============================================== ------END------ =============================================");

		return result;
	}

}