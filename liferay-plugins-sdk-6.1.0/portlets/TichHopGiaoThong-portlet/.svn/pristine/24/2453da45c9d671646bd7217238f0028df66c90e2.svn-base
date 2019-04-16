/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gt.dao.nhapcanh.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.gt.dao.nhapcanh.service.ClpSerializer;
import vn.gt.dao.nhapcanh.service.CrewListLocalServiceUtil;
import vn.gt.dao.nhapcanh.service.CrewListServiceUtil;
import vn.gt.dao.nhapcanh.service.DocumentGeneralLocalServiceUtil;
import vn.gt.dao.nhapcanh.service.DocumentGeneralServiceUtil;
import vn.gt.dao.nhapcanh.service.DocumentLocalServiceUtil;
import vn.gt.dao.nhapcanh.service.DocumentServiceUtil;
import vn.gt.dao.nhapcanh.service.PassengerListLocalServiceUtil;
import vn.gt.dao.nhapcanh.service.PassengerListServiceUtil;
import vn.gt.dao.nhapcanh.service.ResponseBoLocalServiceUtil;
import vn.gt.dao.nhapcanh.service.ResponseBoServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CrewListLocalServiceUtil.clearService();

			CrewListServiceUtil.clearService();
			DocumentLocalServiceUtil.clearService();

			DocumentServiceUtil.clearService();
			DocumentGeneralLocalServiceUtil.clearService();

			DocumentGeneralServiceUtil.clearService();
			PassengerListLocalServiceUtil.clearService();

			PassengerListServiceUtil.clearService();
			ResponseBoLocalServiceUtil.clearService();

			ResponseBoServiceUtil.clearService();
		}
	}
}