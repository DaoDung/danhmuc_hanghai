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

package vn.gt.dao.danhmucgt.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.danhmucgt.model.DmGtReportTemplate;
import vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalServiceUtil;

/**
 * The extended model base implementation for the DmGtReportTemplate service. Represents a row in the &quot;DM_GT_REPORT_TEMPLATE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmGtReportTemplateImpl}.
 * </p>
 *
 * @author win_64
 * @see DmGtReportTemplateImpl
 * @see vn.gt.dao.danhmucgt.model.DmGtReportTemplate
 * @generated
 */
public abstract class DmGtReportTemplateBaseImpl
	extends DmGtReportTemplateModelImpl implements DmGtReportTemplate {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm gt report template model instance should use the {@link DmGtReportTemplate} interface instead.
	 */
	public void persist() throws SystemException {
		DmGtReportTemplateLocalServiceUtil.updateDmGtReportTemplate(this);
	}
}