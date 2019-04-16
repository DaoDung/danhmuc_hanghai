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

package vn.gt.dao.result.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ResultMinistryService}.
 * </p>
 *
 * @author    win_64
 * @see       ResultMinistryService
 * @generated
 */
public class ResultMinistryServiceWrapper implements ResultMinistryService,
	ServiceWrapper<ResultMinistryService> {
	public ResultMinistryServiceWrapper(
		ResultMinistryService resultMinistryService) {
		_resultMinistryService = resultMinistryService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ResultMinistryService getWrappedResultMinistryService() {
		return _resultMinistryService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedResultMinistryService(
		ResultMinistryService resultMinistryService) {
		_resultMinistryService = resultMinistryService;
	}

	public ResultMinistryService getWrappedService() {
		return _resultMinistryService;
	}

	public void setWrappedService(ResultMinistryService resultMinistryService) {
		_resultMinistryService = resultMinistryService;
	}

	private ResultMinistryService _resultMinistryService;
}