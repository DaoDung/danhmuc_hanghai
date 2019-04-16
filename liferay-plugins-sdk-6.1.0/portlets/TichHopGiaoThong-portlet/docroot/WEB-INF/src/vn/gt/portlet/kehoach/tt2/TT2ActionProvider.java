package vn.gt.portlet.kehoach.tt2;

import java.io.File;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;

import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.portlet.kehoach.utils.ChuyenDichTrangThaiUtils;
import vn.gt.portlet.kehoach.utils.PhieuThanhToanUtils;
import vn.gt.tichhop.message.BusinessUtils;
import vn.gt.tichhop.report.FileUploadUtils;

public class TT2ActionProvider {

	private static Log _log = LogFactoryUtil.getLog(TT2ActionProvider.class);

	public static JSONObject actionKeHoach(ThemeDisplay themeDisplay, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		// START
		// PARAM TO BUILD CHUYEN DICH TRANG THAI
		int documentName = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.DOCUMENT_NAME);
		int documentYear = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.DOCUMENT_YEAR);
		int messageType = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.MESSAGE_TYPE);
		int desStatus = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.DES_STATUS);
		int requestState = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.REQUEST_STATE);
		int documentStatusCode = ParamUtil.getInteger(uploadPortletRequest,
				ChuyenDichTrangThaiUtils.DOCUMENT_STATUS_CODE);
		String requestCode = ParamUtil.getString(uploadPortletRequest, ChuyenDichTrangThaiUtils.REQUEST_CODE);
		int actionType = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.ACTION_TYPE);
		
		// END
		_log.info("documentName: " + documentName);
		_log.info("documentYear: " + documentYear);
		_log.info("messageType: " + messageType);
		_log.info("desStatus: " + desStatus);
		_log.info("requestState: " + requestState);
		_log.info("documentStatusCode: " + documentStatusCode);
		
		int chuyenDichStatus = 0;
		if (messageType == ChuyenDichTrangThaiUtils.THANH_PHAN_HO_SO) {
			chuyenDichStatus = ChuyenDichTrangThaiUtils.doHoSo(documentName, documentYear, desStatus, Boolean.TRUE);
		}

		_log.info("chuyenDichStatus: " + chuyenDichStatus);

		if (chuyenDichStatus != ChuyenDichTrangThaiUtils.CHUYEN_DICH_THAT_BAI) {
			// CHUYEN DICH TRANG THAI THANH CONG
			// Xu ly nghiep vu sau khi chuyen dich
			if (messageType == ChuyenDichTrangThaiUtils.THANH_PHAN_HO_SO) {
				int state = TT2XuLyNghiepVuUtils.doActionHoSo(documentName, documentYear, actionType, requestState,
						documentStatusCode, desStatus, themeDisplay.getUser(), uploadPortletRequest, actionRequest,
						Boolean.TRUE);
				// rollback neu xu ly nghiep vu xay ra loi
				if (state == TT2XuLyNghiepVuUtils.XU_LY_THAT_BAI) {
					ChuyenDichTrangThaiUtils.doHoSo(documentName, documentYear, requestState, Boolean.TRUE);
				}
			} else {
				TT2XuLyNghiepVuUtils.doActionBanKhai(documentName, documentYear, actionType, requestState,
						documentStatusCode, desStatus, themeDisplay.getUser(), messageType, requestCode, Boolean.TRUE,
						uploadPortletRequest, actionRequest);
			}
			
//			TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
//			
//			if (tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_DA_TIEP_NHAN) {
//
//				_doCreatePhieuThanhToan(uploadPortletRequest, actionRequest, themeDisplay, documentName,
//						documentYear);
//
//			}
			
		}

		return result;
	}

	public static JSONObject actionThuTuc(ThemeDisplay themeDisplay, UploadPortletRequest uploadPortletRequest,
			ActionRequest actionRequest) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		// START
		// PARAM TO BUILD CHUYEN DICH TRANG THAI
		int documentName = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.DOCUMENT_NAME);
		int documentYear = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.DOCUMENT_YEAR);
		int messageType = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.MESSAGE_TYPE);
		int desStatus = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.DES_STATUS);
		int requestState = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.REQUEST_STATE);
		int documentStatusCode = ParamUtil.getInteger(uploadPortletRequest,
				ChuyenDichTrangThaiUtils.DOCUMENT_STATUS_CODE);
		String requestCode = ParamUtil.getString(uploadPortletRequest, ChuyenDichTrangThaiUtils.REQUEST_CODE);
		int actionType = ParamUtil.getInteger(uploadPortletRequest, ChuyenDichTrangThaiUtils.ACTION_TYPE);
		
		// END
		_log.info("documentName: " + documentName);
		_log.info("documentYear: " + documentYear);
		_log.info("messageType: " + messageType);
		_log.info("desStatus: " + desStatus);
		_log.info("requestState: " + requestState);
		_log.info("documentStatusCode: " + documentStatusCode);
		
		int chuyenDichStatus = 0;
		if (messageType == ChuyenDichTrangThaiUtils.THANH_PHAN_HO_SO) {
			chuyenDichStatus = ChuyenDichTrangThaiUtils.doHoSo(documentName, documentYear, desStatus, Boolean.FALSE);
		}

		_log.info("chuyenDichStatus: " + chuyenDichStatus);

		if (chuyenDichStatus != ChuyenDichTrangThaiUtils.CHUYEN_DICH_THAT_BAI) {
			// CHUYEN DICH TRANG THAI THANH CONG
			// Xu ly nghiep vu sau khi chuyen dich
			if (messageType == ChuyenDichTrangThaiUtils.THANH_PHAN_HO_SO) {
				int state = TT2XuLyNghiepVuUtils.doActionHoSo(documentName, documentYear, actionType, requestState,
						documentStatusCode, desStatus, themeDisplay.getUser(), uploadPortletRequest, actionRequest,
						Boolean.FALSE);
				// rollback neu xu ly nghiep vu xay ra loi
				if (state == TT2XuLyNghiepVuUtils.XU_LY_THAT_BAI) {
					ChuyenDichTrangThaiUtils.doHoSo(documentName, documentYear, documentStatusCode, Boolean.FALSE);
				}
			} else {
				chuyenDichStatus = TT2XuLyNghiepVuUtils.doActionBanKhai(documentName, documentYear, actionType,
						requestState, documentStatusCode, desStatus, themeDisplay.getUser(), messageType, requestCode,
						Boolean.FALSE, uploadPortletRequest, actionRequest);
			}
			
			long totalpayment = ParamUtil.getLong(uploadPortletRequest, "lePhi");
			// create Phieu danh toan
			if (chuyenDichStatus == ChuyenDichTrangThaiUtils.THU_TUC_DE_NGHI_CAP_GIAY_PHEP) {
//				if (totalpayment > 0) {
					_doCreatePhieuThanhToan(uploadPortletRequest, actionRequest, themeDisplay, documentName,
							documentYear);
//				}
			} else if (chuyenDichStatus == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {

//				if (totalpayment > 0) {
					_doCreatePhieuThanhToan(uploadPortletRequest, actionRequest, themeDisplay, documentName,
							documentYear);
//				}

			} else if (chuyenDichStatus == ChuyenDichTrangThaiUtils.THU_TUC_HUY_THU_TUC) {

//				if (totalpayment > 0) {
//					_doCreatePhieuThanhToan(uploadPortletRequest, actionRequest, themeDisplay, documentName,
//							documentYear);
//				}

				TempDebitNote tempDebitNote = TempDebitNoteLocalServiceUtil
						.findByDocumentNameAnddocumentYear(documentName, documentYear);

				if (Validator.isNotNull(tempDebitNote) && tempDebitNote.getTotalpayment() > 0) {
					// Tich hop send message 99-30
					boolean resultMethod = TT2TichHopMessageUtils.message_99_30(
							themeDisplay.getUser().getEmailAddress(), uploadPortletRequest, actionRequest, documentName,
							documentYear);
				}
			}
		}

		return result;
	}

	private static void _doCreatePhieuThanhToan(UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest,
			ThemeDisplay themeDisplay, long documentName, int documentYear) {
		PhieuThanhToanUtils action = new PhieuThanhToanUtils();
		BusinessUtils businessUtils = new BusinessUtils();

		Date todate = null;
		String transactionid = StringPool.BLANK;
		long totalpayment = ParamUtil.getLong(uploadPortletRequest, "lePhi", 0);
		String corporationid = StringPool.BLANK;
		String organization = BusinessUtils.getOrganizationFromUser(actionRequest);
		Date fromdate = null;
		int paymenttype = 0;
		Date reportdate = new Date();
		String reportby = themeDisplay.getUser().getEmailAddress();
		String financialaccountant = StringPool.BLANK;
		int markasdeleted = 0;
		String division = businessUtils.getDivision(actionRequest);
		String debitnotenumber = StringPool.BLANK;

		action.doTempDebitNote(documentName, documentYear, corporationid, debitnotenumber, division,
				financialaccountant, fromdate, markasdeleted, organization, paymenttype, reportby, reportdate, todate,
				totalpayment, transactionid, themeDisplay.getUser(), uploadPortletRequest, actionRequest);
	}

}
