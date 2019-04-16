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

package vn.gt.dao.noticeandmessage.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempPassengerDetailsService}.
 * </p>
 *
 * @author    win_64
 * @see       TempPassengerDetailsService
 * @generated
 */
public class TempPassengerDetailsServiceWrapper
	implements TempPassengerDetailsService,
		ServiceWrapper<TempPassengerDetailsService> {
	public TempPassengerDetailsServiceWrapper(
		TempPassengerDetailsService tempPassengerDetailsService) {
		_tempPassengerDetailsService = tempPassengerDetailsService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempPassengerDetailsService getWrappedTempPassengerDetailsService() {
		return _tempPassengerDetailsService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempPassengerDetailsService(
		TempPassengerDetailsService tempPassengerDetailsService) {
		_tempPassengerDetailsService = tempPassengerDetailsService;
	}

	public TempPassengerDetailsService getWrappedService() {
		return _tempPassengerDetailsService;
	}

	public void setWrappedService(
		TempPassengerDetailsService tempPassengerDetailsService) {
		_tempPassengerDetailsService = tempPassengerDetailsService;
	}

	private TempPassengerDetailsService _tempPassengerDetailsService;
}