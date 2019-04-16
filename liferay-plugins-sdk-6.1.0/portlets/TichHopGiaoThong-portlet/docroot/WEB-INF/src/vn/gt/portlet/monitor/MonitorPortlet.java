
package vn.gt.portlet.monitor;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import vn.dao.gt.asw.model.AswmsgMessageQueue;
import vn.dao.gt.asw.service.AswmsgMessageQueueLocalServiceUtil;

public class MonitorPortlet extends MVCPortlet {
	
	private static final Log log = LogFactoryUtil.getLog(MonitorPortlet.class);
	
	public void refeshMonitor(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		long id = ParamUtil.getLong(actionRequest, "id");
		String redirectURL = ParamUtil.getString(actionRequest, "redirectURL");
		
		if (id > 0) {
			try {
				AswmsgMessageQueue aswmsgMessageQueue = AswmsgMessageQueueLocalServiceUtil.fetchAswmsgMessageQueue(id);
				if (aswmsgMessageQueue != null) {
					aswmsgMessageQueue.setPriority(15);
					aswmsgMessageQueue.setSoLanGui(0);
					aswmsgMessageQueue.setValidated(-1);
					aswmsgMessageQueue.setCreatedTime(new Date());
					
					AswmsgMessageQueueLocalServiceUtil.updateAswmsgMessageQueue(aswmsgMessageQueue);
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
		
		actionResponse.sendRedirect(redirectURL);
	}
}
