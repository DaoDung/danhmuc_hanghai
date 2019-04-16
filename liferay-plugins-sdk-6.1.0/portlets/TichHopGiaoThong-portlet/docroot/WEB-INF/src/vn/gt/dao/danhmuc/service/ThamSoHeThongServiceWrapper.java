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
 * This class is a wrapper for {@link ThamSoHeThongService}.
 * </p>
 *
 * @author    win_64
 * @see       ThamSoHeThongService
 * @generated
 */
public class ThamSoHeThongServiceWrapper implements ThamSoHeThongService,
	ServiceWrapper<ThamSoHeThongService> {
	public ThamSoHeThongServiceWrapper(
		ThamSoHeThongService thamSoHeThongService) {
		_thamSoHeThongService = thamSoHeThongService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ThamSoHeThongService getWrappedThamSoHeThongService() {
		return _thamSoHeThongService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedThamSoHeThongService(
		ThamSoHeThongService thamSoHeThongService) {
		_thamSoHeThongService = thamSoHeThongService;
	}

	public ThamSoHeThongService getWrappedService() {
		return _thamSoHeThongService;
	}

	public void setWrappedService(ThamSoHeThongService thamSoHeThongService) {
		_thamSoHeThongService = thamSoHeThongService;
	}

	private ThamSoHeThongService _thamSoHeThongService;
}