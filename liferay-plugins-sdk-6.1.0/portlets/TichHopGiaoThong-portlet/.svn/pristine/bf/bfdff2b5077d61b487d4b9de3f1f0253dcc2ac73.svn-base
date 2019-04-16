package vn.gt.portlet.user;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.model.impl.UserPortImpl;
import vn.gt.dao.common.service.UserPortLocalServiceUtil;

import com.liferay.portal.kernel.util.ParamUtil;

public class UserPortUtils {

	public UserPort fillData2Form(ActionRequest actionrequest,
			ActionResponse httpReq) {
		try {
			long userId = ParamUtil.getLong(actionrequest, "userId");
			long userPortId = ParamUtil.getLong(actionrequest, "USER_PORTID");

			UserPort userPort = null;
			if (userPortId > 0) {
				userPort = UserPortLocalServiceUtil.getUserPort(userPortId);
			} else {
				userPort = new UserPortImpl();
			}
			String portCode = ParamUtil.getString(actionrequest,
					"portCode");
			Integer status = ParamUtil.getInteger(actionrequest, "status");

			userPort.setCreateDate(new Date());
			userPort.setUserId(userId);
			userPort.setStatus(status);
			userPort.setPortCode(portCode);

			return userPort;
		} catch (Exception e) {
		}
		return null;

	}

}
