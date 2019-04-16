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
 * This class is a wrapper for {@link DmGtStatusService}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtStatusService
 * @generated
 */
public class DmGtStatusServiceWrapper implements DmGtStatusService,
	ServiceWrapper<DmGtStatusService> {
	public DmGtStatusServiceWrapper(DmGtStatusService dmGtStatusService) {
		_dmGtStatusService = dmGtStatusService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmGtStatusService getWrappedDmGtStatusService() {
		return _dmGtStatusService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmGtStatusService(DmGtStatusService dmGtStatusService) {
		_dmGtStatusService = dmGtStatusService;
	}

	public DmGtStatusService getWrappedService() {
		return _dmGtStatusService;
	}

	public void setWrappedService(DmGtStatusService dmGtStatusService) {
		_dmGtStatusService = dmGtStatusService;
	}

	private DmGtStatusService _dmGtStatusService;
}