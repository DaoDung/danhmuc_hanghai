/**
 * 
 */
package vn.gt.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author win_64
 */
public class TransportationMVCAction extends MVCPortlet {
	
	public User getUser(ActionRequest resourceRequest, ActionResponse httpReq) {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		return themeDisplay.getUser();
	}
	
	public Long getUserId(ActionRequest resourceRequest, ActionResponse httpReq) {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long userId = themeDisplay.getUser().getUserId();
		
		return userId;
		
	}
	
	public String getUserName(ActionRequest resourceRequest, ActionResponse httpReq) {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		return themeDisplay.getUser().getEmailAddress();
	}
	
}
