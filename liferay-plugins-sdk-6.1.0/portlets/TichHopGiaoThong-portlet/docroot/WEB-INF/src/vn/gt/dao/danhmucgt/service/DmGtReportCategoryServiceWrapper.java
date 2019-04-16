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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmGtReportCategoryService}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtReportCategoryService
 * @generated
 */
public class DmGtReportCategoryServiceWrapper
	implements DmGtReportCategoryService,
		ServiceWrapper<DmGtReportCategoryService> {
	public DmGtReportCategoryServiceWrapper(
		DmGtReportCategoryService dmGtReportCategoryService) {
		_dmGtReportCategoryService = dmGtReportCategoryService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmGtReportCategoryService getWrappedDmGtReportCategoryService() {
		return _dmGtReportCategoryService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmGtReportCategoryService(
		DmGtReportCategoryService dmGtReportCategoryService) {
		_dmGtReportCategoryService = dmGtReportCategoryService;
	}

	public DmGtReportCategoryService getWrappedService() {
		return _dmGtReportCategoryService;
	}

	public void setWrappedService(
		DmGtReportCategoryService dmGtReportCategoryService) {
		_dmGtReportCategoryService = dmGtReportCategoryService;
	}

	private DmGtReportCategoryService _dmGtReportCategoryService;
}