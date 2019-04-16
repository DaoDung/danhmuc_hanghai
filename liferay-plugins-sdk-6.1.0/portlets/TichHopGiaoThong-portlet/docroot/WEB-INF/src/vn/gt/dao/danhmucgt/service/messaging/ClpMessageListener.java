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

package vn.gt.dao.danhmucgt.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.gt.dao.danhmucgt.service.ClpSerializer;
import vn.gt.dao.danhmucgt.service.DmCertificateLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmCertificateServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGTBusinessTypeLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGTBusinessTypeServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGTFunctionTypeServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGTShipPositionServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtOrganizationLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtOrganizationServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtReportCategoryLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtReportCategoryServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtReportTemplateServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtRouteConfigLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtRouteConfigServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtStatusServiceUtil;
import vn.gt.dao.danhmucgt.service.DmGtVersionLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmHistoryMinistryLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmHistoryMinistryServiceUtil;
import vn.gt.dao.danhmucgt.service.DmMinistryLocalServiceUtil;
import vn.gt.dao.danhmucgt.service.DmMinistryServiceUtil;

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
			DmCertificateLocalServiceUtil.clearService();

			DmCertificateServiceUtil.clearService();
			DmGTBusinessTypeLocalServiceUtil.clearService();

			DmGTBusinessTypeServiceUtil.clearService();
			DmGTFunctionTypeLocalServiceUtil.clearService();

			DmGTFunctionTypeServiceUtil.clearService();
			DmGtOrganizationLocalServiceUtil.clearService();

			DmGtOrganizationServiceUtil.clearService();
			DmGtReportCategoryLocalServiceUtil.clearService();

			DmGtReportCategoryServiceUtil.clearService();
			DmGtReportTemplateLocalServiceUtil.clearService();

			DmGtReportTemplateServiceUtil.clearService();
			DmGtRouteConfigLocalServiceUtil.clearService();

			DmGtRouteConfigServiceUtil.clearService();
			DmGTShipPositionLocalServiceUtil.clearService();

			DmGTShipPositionServiceUtil.clearService();
			DmGtStatusLocalServiceUtil.clearService();

			DmGtStatusServiceUtil.clearService();
			DmGtVersionLocalServiceUtil.clearService();

			DmHistoryMinistryLocalServiceUtil.clearService();

			DmHistoryMinistryServiceUtil.clearService();
			DmMinistryLocalServiceUtil.clearService();

			DmMinistryServiceUtil.clearService();
		}
	}
}