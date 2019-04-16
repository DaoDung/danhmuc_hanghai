package vn.gt.portlet.tracuu;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.gt.portlet.GiaoThongAction;

/**
 * Portlet implementation class TraCuuAction
 */
public class TraCuuAction extends GiaoThongAction {
	public void searchTraCuu(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		String documentName = ParamUtil.getString(resourceRequest,
				"documentName").trim();
		String documentYear = ParamUtil.getString(resourceRequest,
				"documentYear").trim();
		
		httpReq.setRenderParameter("documentName", documentName);
		httpReq.setRenderParameter("documentYear", documentYear);

		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	}
