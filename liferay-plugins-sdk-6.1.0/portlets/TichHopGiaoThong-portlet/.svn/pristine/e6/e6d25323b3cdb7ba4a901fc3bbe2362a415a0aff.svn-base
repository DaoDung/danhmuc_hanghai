package vn.gt.portlet.kehoach.utils;

import java.sql.Timestamp;
import java.util.Date;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.portlet.kehoach.tt1.TT1TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt10.TT10TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt11.TT11TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt14.TT14TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt15.TT15TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt16.TT16TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt17.TT17TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt2.TT2TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt3.TT3TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt4.TT4TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt5.TT5TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt6.TT6TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt7.TT7TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt8.TT8TichHopMessageUtils;
import vn.gt.portlet.kehoach.tt9.TT9TichHopMessageUtils;

public class PhieuThanhToanUtils {

	public TempDebitNote doTempDebitNote(long documentName, int documentYear, String corporationid,
			String debitnotenumber, String division, String financialaccountant, Date fromdate, int markasdeleted,
			String organization, int paymenttype, String reportby, Date reportdate, Date todate, long totalpayment,
			String transactionid, User user, UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) {
		TempDebitNote result = null;

		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName,
				documentYear);

		reportdate = new Date();

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		debitnotenumber = timestamp.getTime() + StringPool.BLANK;
		corporationid = tempDocument.getMaritimeCode();
		
		String currency = ParamUtil.getString(uploadPortletRequest, "currency");
		
		result = TempDebitNoteLocalServiceUtil.doTempDebitNote(documentName, documentYear, corporationid,
				debitnotenumber, division, financialaccountant, fromdate, markasdeleted, organization, paymenttype,
				reportby, reportdate, todate, totalpayment, transactionid, tempDocument.getMaritimeCode(), currency);

		// Tich hop send message 99-30\
		if (result.getTotalpayment() > 0) {
			if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("NC") && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT1TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("XC") && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT2TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT6TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT8TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT7TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT9TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT10TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT11TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT4TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT5TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT3TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT14TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH) && tempDocument.getDocumentStatusCode() == ChuyenDichTrangThaiUtils.THU_TUC_PHE_DUYET_HOAN_THANH_THU_TUC) {
				boolean resultMethod = TT15TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			}
		}
		
		return result;
	}

	public static TempDebitNote doTempDebitNoteTotalPayment(long id, double totalpayment, long documentName, int documentYear, 
			User user, UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) {
		
		String ykienReject = ParamUtil.getString(uploadPortletRequest, "ykienReject");
		
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName,
				documentYear);
		
		String currency = ParamUtil.getString(uploadPortletRequest, "currency");
		
		System.out.println("PhieuThanhToanUtils.doTempDebitNote()" + currency);
		
		TempDebitNote result = null;
		try {
			result = TempDebitNoteLocalServiceUtil.fetchTempDebitNote(id);
			result.setTotalpayment(totalpayment);
			result.setComments(ykienReject);
			result.setCurrency(currency);
			
			TempDebitNoteLocalServiceUtil.updateTempDebitNote(result);
			
		} catch (SystemException e) {
			e.printStackTrace();
		}

		// Tich hop send message 99-30\
		if (Validator.isNotNull(result) && result.getTotalpayment() > 0) {
			if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("NC")) {
				boolean resultMethod = TT1TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("XC")) {
				boolean resultMethod = TT2TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
				boolean resultMethod = TT6TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
				boolean resultMethod = TT8TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
				boolean resultMethod = TT7TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
				boolean resultMethod = TT9TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
				boolean resultMethod = TT10TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
				boolean resultMethod = TT11TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
				boolean resultMethod = TT4TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
				boolean resultMethod = TT5TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
				boolean resultMethod = TT3TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
				boolean resultMethod = TT16TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
				boolean resultMethod = TT17TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
				boolean resultMethod = TT14TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
				boolean resultMethod = TT15TichHopMessageUtils.message_99_30(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
			}
		}
		
		return result;
	}
	
	public static void xacNhanThanhToan(long documentName, int documentYear, int markasdeleted, User user, UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) {
		try {
			TempDebitNote tempDebitNote = TempDebitNoteLocalServiceUtil.findByDocumentNameAnddocumentYear(documentName,
					documentYear);
			
			int paymenttype = ParamUtil.getInteger(uploadPortletRequest, "paymenttype", 0);

			tempDebitNote.setMarkasdeleted(1);
			tempDebitNote.setPaymenttype(paymenttype);
			tempDebitNote.setFinancialaccountant(user.getEmailAddress());
			tempDebitNote.setFromdate(new Date());
			tempDebitNote = TempDebitNoteLocalServiceUtil.updateTempDebitNote(tempDebitNote);
			
			if (tempDebitNote.getMarkasdeleted() == 1) {
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
				
				// Tich hop send message 99-30
				if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("NC")) {
					boolean resultMethod = TT1TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase("XC")) {
					boolean resultMethod = TT2TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					boolean resultMethod = TT6TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					boolean resultMethod = TT8TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					boolean resultMethod = TT7TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					boolean resultMethod = TT9TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					boolean resultMethod = TT10TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					boolean resultMethod = TT11TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					boolean resultMethod = TT4TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					boolean resultMethod = TT5TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					boolean resultMethod = TT3TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					boolean resultMethod = TT16TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					boolean resultMethod = TT17TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
					boolean resultMethod = TT14TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				} else if (tempDocument.getDocumentTypeCode().equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
					boolean resultMethod = TT15TichHopMessageUtils.message_99_31(user.getEmailAddress(), uploadPortletRequest, actionRequest, documentName, documentYear);
				}
				
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
