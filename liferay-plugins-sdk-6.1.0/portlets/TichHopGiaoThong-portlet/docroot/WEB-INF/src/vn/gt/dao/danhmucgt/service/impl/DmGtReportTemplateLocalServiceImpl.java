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

package vn.gt.dao.danhmucgt.service.impl;

import java.util.ArrayList;
import java.util.List;

import vn.gt.dao.danhmucgt.model.DmGtReportTemplate;
import vn.gt.dao.danhmucgt.model.DmGtRouteConfig;
import vn.gt.dao.danhmucgt.service.base.DmGtReportTemplateLocalServiceBaseImpl;

/**
 * The implementation of the dm gt report template local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmucgt.service.base.DmGtReportTemplateLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalServiceUtil
 */
public class DmGtReportTemplateLocalServiceImpl
	extends DmGtReportTemplateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalServiceUtil} to access the dm gt report template local service.
	 */
	public List<DmGtReportTemplate> findByreportType(int reportType) {
		try {
			return dmGtReportTemplatePersistence.findByreportType(reportType);
		} catch (Exception es) {
		}
		
		return null;
	}
	
	public DmGtReportTemplate findByReportCode(int reportCode) {
		try {
			return dmGtReportTemplatePersistence.findByReportCode(reportCode);
		} catch (Exception es) {
		}
		
		return null;
	}
}