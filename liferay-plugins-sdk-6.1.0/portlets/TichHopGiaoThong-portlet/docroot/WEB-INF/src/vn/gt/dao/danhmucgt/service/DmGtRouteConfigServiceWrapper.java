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
 * This class is a wrapper for {@link DmGtRouteConfigService}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtRouteConfigService
 * @generated
 */
public class DmGtRouteConfigServiceWrapper implements DmGtRouteConfigService,
	ServiceWrapper<DmGtRouteConfigService> {
	public DmGtRouteConfigServiceWrapper(
		DmGtRouteConfigService dmGtRouteConfigService) {
		_dmGtRouteConfigService = dmGtRouteConfigService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmGtRouteConfigService getWrappedDmGtRouteConfigService() {
		return _dmGtRouteConfigService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmGtRouteConfigService(
		DmGtRouteConfigService dmGtRouteConfigService) {
		_dmGtRouteConfigService = dmGtRouteConfigService;
	}

	public DmGtRouteConfigService getWrappedService() {
		return _dmGtRouteConfigService;
	}

	public void setWrappedService(DmGtRouteConfigService dmGtRouteConfigService) {
		_dmGtRouteConfigService = dmGtRouteConfigService;
	}

	private DmGtRouteConfigService _dmGtRouteConfigService;
}