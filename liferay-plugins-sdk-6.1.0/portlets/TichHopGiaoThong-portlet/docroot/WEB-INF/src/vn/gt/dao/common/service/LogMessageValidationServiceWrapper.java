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
 * This class is a wrapper for {@link LogMessageValidationService}.
 * </p>
 *
 * @author    win_64
 * @see       LogMessageValidationService
 * @generated
 */
public class LogMessageValidationServiceWrapper
	implements LogMessageValidationService,
		ServiceWrapper<LogMessageValidationService> {
	public LogMessageValidationServiceWrapper(
		LogMessageValidationService logMessageValidationService) {
		_logMessageValidationService = logMessageValidationService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public LogMessageValidationService getWrappedLogMessageValidationService() {
		return _logMessageValidationService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedLogMessageValidationService(
		LogMessageValidationService logMessageValidationService) {
		_logMessageValidationService = logMessageValidationService;
	}

	public LogMessageValidationService getWrappedService() {
		return _logMessageValidationService;
	}

	public void setWrappedService(
		LogMessageValidationService logMessageValidationService) {
		_logMessageValidationService = logMessageValidationService;
	}

	private LogMessageValidationService _logMessageValidationService;
}