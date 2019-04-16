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

package vn.gt.dao.danhmuc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link RmdcShipService}.
 * </p>
 *
 * @author    win_64
 * @see       RmdcShipService
 * @generated
 */
public class RmdcShipServiceWrapper implements RmdcShipService,
	ServiceWrapper<RmdcShipService> {
	public RmdcShipServiceWrapper(RmdcShipService rmdcShipService) {
		_rmdcShipService = rmdcShipService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RmdcShipService getWrappedRmdcShipService() {
		return _rmdcShipService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRmdcShipService(RmdcShipService rmdcShipService) {
		_rmdcShipService = rmdcShipService;
	}

	public RmdcShipService getWrappedService() {
		return _rmdcShipService;
	}

	public void setWrappedService(RmdcShipService rmdcShipService) {
		_rmdcShipService = rmdcShipService;
	}

	private RmdcShipService _rmdcShipService;
}