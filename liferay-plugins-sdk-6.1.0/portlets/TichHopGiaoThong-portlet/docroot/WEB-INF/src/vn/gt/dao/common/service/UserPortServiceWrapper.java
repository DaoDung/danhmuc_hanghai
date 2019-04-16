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

package vn.gt.dao.common.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link UserPortService}.
 * </p>
 *
 * @author    win_64
 * @see       UserPortService
 * @generated
 */
public class UserPortServiceWrapper implements UserPortService,
	ServiceWrapper<UserPortService> {
	public UserPortServiceWrapper(UserPortService userPortService) {
		_userPortService = userPortService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UserPortService getWrappedUserPortService() {
		return _userPortService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUserPortService(UserPortService userPortService) {
		_userPortService = userPortService;
	}

	public UserPortService getWrappedService() {
		return _userPortService;
	}

	public void setWrappedService(UserPortService userPortService) {
		_userPortService = userPortService;
	}

	private UserPortService _userPortService;
}