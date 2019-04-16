package vn.gt.portlet.kehoach.nghiepvu.bankhai;

import java.util.List;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

import vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.InterfaceRequestField;
import vn.gt.dao.noticeandmessage.model.TempCargoDeclaration;
import vn.gt.dao.noticeandmessage.service.InterfaceRequestFieldLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil;
import vn.gt.dao.result.model.ResultDeclaration;
import vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil;
import vn.gt.portlet.kehoach.tt1.TT1JSONProvider;
import vn.gt.portlet.kehoach.tt1.TT1XuLyNghiepVuUtils;
import vn.gt.tichhop.message.MessageType;

public class BanKhaiHangHoaUtils {

	private static Log _log = LogFactoryUtil.getLog(TT1JSONProvider.class);

	private static String checkDisplayIcon(long documentName, int documentYear, int businessTypeCode) {
		List<ResultDeclaration> lstResult = ResultDeclarationLocalServiceUtil
				.findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode, documentName, documentYear);
		int state = 0;
		if (lstResult != null && lstResult.size() > 0) {
			state = lstResult.get(0).getRequestState();
			if (state == MessageType.TRANG_THAI_BANG_KHAI_TIEP_NHAN
					|| state == MessageType.TRANG_THAI_BANG_KHAI_DOI_CHIEU) {
				return "icon_tich.png";
			} else if (state == MessageType.TRANG_THAI_BANG_KHAI_TU_CHOI) {
				return "close.png";
			}
		}

		return "";
	}

	public static JSONObject buildThanhPhan(ThemeDisplay themeDisplay, long documentName, int documentYear) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		TempCargoDeclaration results = TempCargoDeclarationLocalServiceUtil
				.getLastByDocumentNameAndDocumentYear(documentName, documentYear);

		result.put("code", "NC_2");
		result.put("name", LanguageUtil.get(themeDisplay.getLocale(), "ban-khai-hang-hoa"));
		boolean available = false;
		String requestCode = StringPool.BLANK;
		if (Validator.isNotNull(results)) {
			available = true;
			requestCode = results.getRequestCode();
		}
		result.put("available", available);
		result.put("documentName", documentName);
		result.put("documentYear", documentYear);
		result.put("messageType", MessageType.BAN_KHAI_HANG_HOA);
		result.put("requestCode", requestCode);

		String icon = checkDisplayIcon(documentName, documentYear, MessageType.BAN_KHAI_HANG_HOA);
		
		result.put("state", -1);
		if (icon.equals("icon_tich.png")) {
			result.put("state", 1);
		} else if (icon.equals("close.png")) {
			result.put("state", 0);
		}

		return result;
	}

	public static JSONArray getFileThanhPhanVersionList(ThemeDisplay themeDisplay, long documentName, int documentYear, int messageType) {
		JSONArray result = JSONFactoryUtil.createJSONArray();
		try {
			JSONObject object;
			
			InterfaceRequestField interfaceRequest = null;
	
			List<TempCargoDeclaration> results;
			
				results = TempCargoDeclarationLocalServiceUtil
						.findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName, documentYear);
	
			for (int i = 0; i < results.size(); i++) {
				interfaceRequest = InterfaceRequestFieldLocalServiceUtil
						.getByRequestCode(results.get(i).getRequestCode());
	
				object = JSONFactoryUtil.createJSONObject();
				if (Validator.isNotNull(interfaceRequest)) {
	
					String phienBan = interfaceRequest.getRequestVersion() + " - "
							+ (Validator.isNotNull(interfaceRequest) ? DmGTFunctionTypeLocalServiceUtil
									.findNameByFunctionTypeCode(interfaceRequest.getFunctionType()) : "");
					object.put("version", phienBan);
					object.put("status", DmGtStatusLocalServiceUtil
							.findNameByStatusCode(results.get(i).getRequestState(), messageType));
					object.put("sendDate", interfaceRequest.getRequestedDate());
	
					object.put("requestCode", results.get(i).getRequestCode());

					object.put("remarks", interfaceRequest.getRemarks());
					result.put(object);
				}
	
			}
		} catch (SystemException e) {
			_log.error(e);
		}
		return result;
	}

	public int _banKhaiHangHoa(String requestCode, long documentName, int documentYear, int messageType, int desStatus,
			User user, UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) {
		
		int result = TT1XuLyNghiepVuUtils.XU_LY_THAT_BAI;
		
		try {
			TempCargoDeclaration tempCargoDeclaration = TempCargoDeclarationLocalServiceUtil
					.findTempCargoDeclarationByRequestCode(requestCode);

			if (tempCargoDeclaration != null) {
				tempCargoDeclaration.setRequestState(desStatus);
				TempCargoDeclarationLocalServiceUtil.updateTempCargoDeclaration(tempCargoDeclaration);
			}
			result = TT1XuLyNghiepVuUtils.XU_LY_THANH_CONG;
		} catch (Exception e) {
			_log.error(e);
			result = TT1XuLyNghiepVuUtils.XU_LY_THAT_BAI;
		}
		
		return result;
	}

}
