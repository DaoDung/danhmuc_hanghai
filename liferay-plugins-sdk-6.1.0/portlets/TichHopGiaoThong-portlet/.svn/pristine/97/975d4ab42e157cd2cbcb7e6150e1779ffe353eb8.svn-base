package vn.gt.portlet.kehoach.utils;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

import com.liferay.portal.kernel.util.ParamUtil;

public class CommonUtils {

	public static boolean checkFromDate(ActionRequest actionRequest) {
		String FORM_DATE = "FORM_DATE_SUBMIT";
		String formDate = ParamUtil.getString(actionRequest, "formDate");
		
		if (formDate != null && formDate.trim().length() > 0) {
			PortletSession portletSession = actionRequest.getPortletSession();
			
			Object oldFormDate = portletSession.getAttribute(FORM_DATE);
			
			if (oldFormDate != null && formDate.equalsIgnoreCase(String.valueOf(oldFormDate))) {
				return true;
			}
			
			portletSession.setAttribute(FORM_DATE, formDate);
		}
		
		return false;
	}
}
