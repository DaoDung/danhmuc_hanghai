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
 * This class is a wrapper for {@link DmGTBusinessTypeService}.
 * </p>
 *
 * @author    win_64
 * @see       DmGTBusinessTypeService
 * @generated
 */
public class DmGTBusinessTypeServiceWrapper implements DmGTBusinessTypeService,
	ServiceWrapper<DmGTBusinessTypeService> {
	public DmGTBusinessTypeServiceWrapper(
		DmGTBusinessTypeService dmGTBusinessTypeService) {
		_dmGTBusinessTypeService = dmGTBusinessTypeService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmGTBusinessTypeService getWrappedDmGTBusinessTypeService() {
		return _dmGTBusinessTypeService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmGTBusinessTypeService(
		DmGTBusinessTypeService dmGTBusinessTypeService) {
		_dmGTBusinessTypeService = dmGTBusinessTypeService;
	}

	public DmGTBusinessTypeService getWrappedService() {
		return _dmGTBusinessTypeService;
	}

	public void setWrappedService(
		DmGTBusinessTypeService dmGTBusinessTypeService) {
		_dmGTBusinessTypeService = dmGTBusinessTypeService;
	}

	private DmGTBusinessTypeService _dmGTBusinessTypeService;
}