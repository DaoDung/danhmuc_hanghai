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

package vn.gt.dao.result.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.gt.dao.result.service.ClpSerializer;
import vn.gt.dao.result.service.ResultCertificateLocalServiceUtil;
import vn.gt.dao.result.service.ResultCertificateServiceUtil;
import vn.gt.dao.result.service.ResultCompetionLocalServiceUtil;
import vn.gt.dao.result.service.ResultCompetionServiceUtil;
import vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil;
import vn.gt.dao.result.service.ResultDeclarationServiceUtil;
import vn.gt.dao.result.service.ResultHistoryMinistryLocalServiceUtil;
import vn.gt.dao.result.service.ResultHistoryMinistryServiceUtil;
import vn.gt.dao.result.service.ResultMinistryLocalServiceUtil;
import vn.gt.dao.result.service.ResultMinistryServiceUtil;
import vn.gt.dao.result.service.ResultNotificationLocalServiceUtil;
import vn.gt.dao.result.service.ResultNotificationServiceUtil;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.dao.result.service.TempDebitNoteServiceUtil;

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
			ResultCertificateLocalServiceUtil.clearService();

			ResultCertificateServiceUtil.clearService();
			ResultCompetionLocalServiceUtil.clearService();

			ResultCompetionServiceUtil.clearService();
			ResultDeclarationLocalServiceUtil.clearService();

			ResultDeclarationServiceUtil.clearService();
			ResultHistoryMinistryLocalServiceUtil.clearService();

			ResultHistoryMinistryServiceUtil.clearService();
			ResultMinistryLocalServiceUtil.clearService();

			ResultMinistryServiceUtil.clearService();
			ResultNotificationLocalServiceUtil.clearService();

			ResultNotificationServiceUtil.clearService();
			TempDebitNoteLocalServiceUtil.clearService();

			TempDebitNoteServiceUtil.clearService();
		}
	}
}