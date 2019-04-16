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

package vn.gt.dao.nhapcanh.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link CrewListService}.
 * </p>
 *
 * @author    win_64
 * @see       CrewListService
 * @generated
 */
public class CrewListServiceWrapper implements CrewListService,
	ServiceWrapper<CrewListService> {
	public CrewListServiceWrapper(CrewListService crewListService) {
		_crewListService = crewListService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public CrewListService getWrappedCrewListService() {
		return _crewListService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedCrewListService(CrewListService crewListService) {
		_crewListService = crewListService;
	}

	public CrewListService getWrappedService() {
		return _crewListService;
	}

	public void setWrappedService(CrewListService crewListService) {
		_crewListService = crewListService;
	}

	private CrewListService _crewListService;
}