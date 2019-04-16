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
 * This class is a wrapper for {@link TempHealthCrewPassengerListService}.
 * </p>
 *
 * @author    win_64
 * @see       TempHealthCrewPassengerListService
 * @generated
 */
public class TempHealthCrewPassengerListServiceWrapper
	implements TempHealthCrewPassengerListService,
		ServiceWrapper<TempHealthCrewPassengerListService> {
	public TempHealthCrewPassengerListServiceWrapper(
		TempHealthCrewPassengerListService tempHealthCrewPassengerListService) {
		_tempHealthCrewPassengerListService = tempHealthCrewPassengerListService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempHealthCrewPassengerListService getWrappedTempHealthCrewPassengerListService() {
		return _tempHealthCrewPassengerListService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempHealthCrewPassengerListService(
		TempHealthCrewPassengerListService tempHealthCrewPassengerListService) {
		_tempHealthCrewPassengerListService = tempHealthCrewPassengerListService;
	}

	public TempHealthCrewPassengerListService getWrappedService() {
		return _tempHealthCrewPassengerListService;
	}

	public void setWrappedService(
		TempHealthCrewPassengerListService tempHealthCrewPassengerListService) {
		_tempHealthCrewPassengerListService = tempHealthCrewPassengerListService;
	}

	private TempHealthCrewPassengerListService _tempHealthCrewPassengerListService;
}