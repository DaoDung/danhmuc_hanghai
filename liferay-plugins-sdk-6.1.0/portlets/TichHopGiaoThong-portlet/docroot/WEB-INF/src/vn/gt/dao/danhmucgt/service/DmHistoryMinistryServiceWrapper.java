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
 * This class is a wrapper for {@link DmHistoryMinistryService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryMinistryService
 * @generated
 */
public class DmHistoryMinistryServiceWrapper implements DmHistoryMinistryService,
	ServiceWrapper<DmHistoryMinistryService> {
	public DmHistoryMinistryServiceWrapper(
		DmHistoryMinistryService dmHistoryMinistryService) {
		_dmHistoryMinistryService = dmHistoryMinistryService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryMinistryService getWrappedDmHistoryMinistryService() {
		return _dmHistoryMinistryService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryMinistryService(
		DmHistoryMinistryService dmHistoryMinistryService) {
		_dmHistoryMinistryService = dmHistoryMinistryService;
	}

	public DmHistoryMinistryService getWrappedService() {
		return _dmHistoryMinistryService;
	}

	public void setWrappedService(
		DmHistoryMinistryService dmHistoryMinistryService) {
		_dmHistoryMinistryService = dmHistoryMinistryService;
	}

	private DmHistoryMinistryService _dmHistoryMinistryService;
}