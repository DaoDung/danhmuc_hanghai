package vn.gt.portlet.kehoach;

import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.util.PortalUtil;

public class PortletUtil {
	public static void writeJSON(ActionResponse actionResponse, Object json)
			throws Exception {
		if (actionResponse != null) {
			HttpServletResponse response = PortalUtil
					.getHttpServletResponse(actionResponse);

			response.setContentType(ContentTypes.APPLICATION_JSON);

			ServletResponseUtil.write(response, json.toString());
		}

	}
}
