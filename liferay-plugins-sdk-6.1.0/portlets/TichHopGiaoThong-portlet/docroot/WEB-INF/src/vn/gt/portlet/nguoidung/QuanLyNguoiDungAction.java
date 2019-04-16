package vn.gt.portlet.nguoidung;

import java.io.File;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.gt.dao.common.service.UserSignLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class QuanLyNguoiDungAction extends MVCPortlet {
	public void updateUserSign(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		long userId = PortalUtil.getUserId(uploadRequest);
		
		long userSignId = ParamUtil.getLong(uploadRequest, "userSignId");
		long accountId = ParamUtil.getLong(uploadRequest, "accountId");
		
		String maritimeCode = ParamUtil.getString(uploadRequest, "maritimeCode");
		String title = ParamUtil.getString(uploadRequest, "title");
		String representative = ParamUtil.getString(uploadRequest, "representative");
		
		String chungThuSoName = uploadRequest.getFileName("fileChungThuSo");
		File chungThuSoFile = uploadRequest.getFile("fileChungThuSo");
		boolean deleteFileChungThuSo = ParamUtil.getBoolean(uploadRequest, "fileChungThuSo", false);
		
		String chuKySoName = uploadRequest.getFileName("fileChuKySo");
		File chuKySoFile = uploadRequest.getFile("fileChuKySo");
		boolean deleteFileChuKySo = ParamUtil.getBoolean(uploadRequest, "fileChuKySo", false);
		
		String conDauName = uploadRequest.getFileName("fileConDau");
		File conDauFile = uploadRequest.getFile("fileConDau");
		boolean deleteFileConDau = ParamUtil.getBoolean(uploadRequest, "fileConDau", false);
		
		String redirectURL = ParamUtil.getString(uploadRequest, "redirectURL");
		String backURL = ParamUtil.getString(uploadRequest, "backURL");
		
		boolean result = false;
		try {
			UserSignLocalServiceUtil.updateUserSign(userId, userSignId, accountId,
				maritimeCode, title, representative, chungThuSoName, chungThuSoFile, deleteFileChungThuSo,
				chuKySoName, chuKySoFile, deleteFileChuKySo, conDauName, conDauFile, deleteFileConDau);
			
			result = true;
		} catch(Exception e) {
			_log.error(e);
			SessionErrors.add(uploadRequest, e.getClass().getName());
		}
		
		if(result && Validator.isNotNull(redirectURL)) {
			actionResponse.sendRedirect(redirectURL);
		} else if(!result && Validator.isNotNull(backURL)) {
			actionResponse.sendRedirect(backURL);
		}
	}
	
	public static void deleteUserSign(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws Exception {
		
		long userSignId = ParamUtil.getLong(actionRequest, "userSignId");
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		
		if(userSignId > 0) {
			try {
				UserSignLocalServiceUtil.deleteUserSignById(userSignId);
			} catch(Exception e) {
				_log.error(e);
				SessionErrors.add(actionRequest, e.getClass().getName());
			}
			
			if(Validator.isNotNull(redirectURL)) {
				actionResponse.sendRedirect(redirectURL);
			}
		}
	}
	
	private static final Log _log = LogFactoryUtil.getLog(QuanLyNguoiDungAction.class);
}
