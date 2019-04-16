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
 * This class is a wrapper for {@link InterfaceRequestFieldService}.
 * </p>
 *
 * @author    win_64
 * @see       InterfaceRequestFieldService
 * @generated
 */
public class InterfaceRequestFieldServiceWrapper
	implements InterfaceRequestFieldService,
		ServiceWrapper<InterfaceRequestFieldService> {
	public InterfaceRequestFieldServiceWrapper(
		InterfaceRequestFieldService interfaceRequestFieldService) {
		_interfaceRequestFieldService = interfaceRequestFieldService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public InterfaceRequestFieldService getWrappedInterfaceRequestFieldService() {
		return _interfaceRequestFieldService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedInterfaceRequestFieldService(
		InterfaceRequestFieldService interfaceRequestFieldService) {
		_interfaceRequestFieldService = interfaceRequestFieldService;
	}

	public InterfaceRequestFieldService getWrappedService() {
		return _interfaceRequestFieldService;
	}

	public void setWrappedService(
		InterfaceRequestFieldService interfaceRequestFieldService) {
		_interfaceRequestFieldService = interfaceRequestFieldService;
	}

	private InterfaceRequestFieldService _interfaceRequestFieldService;
}