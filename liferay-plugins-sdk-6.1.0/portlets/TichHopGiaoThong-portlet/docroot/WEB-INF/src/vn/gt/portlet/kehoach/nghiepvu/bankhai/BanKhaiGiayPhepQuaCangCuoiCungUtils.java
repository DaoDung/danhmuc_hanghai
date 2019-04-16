package vn.gt.portlet.kehoach.nghiepvu.bankhai;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.theme.ThemeDisplay;

import vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.gt.portlet.kehoach.tt1.TT1JSONProvider;
import vn.gt.tichhop.message.MessageType;

public class BanKhaiGiayPhepQuaCangCuoiCungUtils {

	private String realPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();

	private String pathFileSub = realPath.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF"))
			.replaceFirst(":", "") + "/export/";
	
	private static Log _log = LogFactoryUtil.getLog(TT1JSONProvider.class);

	public static JSONObject buildThanhPhan(ThemeDisplay themeDisplay, long documentName, int documentYear) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		TempNoTiceShipMessage tempNoTiceShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(documentName, documentYear);
		
		if (Validator.isNotNull(tempNoTiceShipMessage) && Validator.isNotNull(tempNoTiceShipMessage.getPortClearanceNo())) {
			result.put("code", "NC_2018");
			result.put("name", LanguageUtil.get(themeDisplay.getLocale(), "giay-phep-qua-cang-cuoi-cung"));
			boolean available = true;
			String requestCode = StringPool.BLANK;

			result.put("available", available);
			result.put("documentName", documentName);
			result.put("documentYear", documentYear);
			result.put("messageType", MessageType.GIAY_PHEP_ROI_CANG_CUOI_CUNG);
			result.put("requestCode", requestCode);

			result.put("state", 1);
			
			return result;
		} else {
			return null;
		}
		
	}

	public static JSONArray getFileThanhPhanVersionList(ThemeDisplay themeDisplay, long documentName, int documentYear,
			int messageType) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			JSONObject object;

			TempNoTiceShipMessage tempNoTiceShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(documentName, documentYear);
			
			IssuePermissionForTransit issuePortClearance = IssuePermissionForTransitLocalServiceUtil.findByF_LAST_numberPortClearance(documentName, documentYear, tempNoTiceShipMessage.getPortClearanceNo());
			
			object = JSONFactoryUtil.createJSONObject();

			String phienBan = issuePortClearance.getVersionNo() + " - " + DmGTFunctionTypeLocalServiceUtil
					.findNameByFunctionTypeCode("0" + issuePortClearance.getRequestState());
			object.put("version", phienBan);
			object.put("status", DmGtStatusLocalServiceUtil
					.findNameByStatusCode(issuePortClearance.getRequestState(), messageType));
			object.put("sendDate", issuePortClearance.getApprovalDate());

			object.put("requestCode", issuePortClearance.getRequestCode());

			result.put(object);
		
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}

}
