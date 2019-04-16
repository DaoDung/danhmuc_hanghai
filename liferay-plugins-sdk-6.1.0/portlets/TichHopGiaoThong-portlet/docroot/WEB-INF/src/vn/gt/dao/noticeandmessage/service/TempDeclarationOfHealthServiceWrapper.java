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
 * This class is a wrapper for {@link TempDeclarationOfHealthService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDeclarationOfHealthService
 * @generated
 */
public class TempDeclarationOfHealthServiceWrapper
	implements TempDeclarationOfHealthService,
		ServiceWrapper<TempDeclarationOfHealthService> {
	public TempDeclarationOfHealthServiceWrapper(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		_tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDeclarationOfHealthService getWrappedTempDeclarationOfHealthService() {
		return _tempDeclarationOfHealthService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDeclarationOfHealthService(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		_tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	public TempDeclarationOfHealthService getWrappedService() {
		return _tempDeclarationOfHealthService;
	}

	public void setWrappedService(
		TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		_tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	private TempDeclarationOfHealthService _tempDeclarationOfHealthService;
}