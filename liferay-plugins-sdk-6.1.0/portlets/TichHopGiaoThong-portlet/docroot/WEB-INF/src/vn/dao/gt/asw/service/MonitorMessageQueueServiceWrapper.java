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

package vn.dao.gt.asw.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link MonitorMessageQueueService}.
 * </p>
 *
 * @author    win 64
 * @see       MonitorMessageQueueService
 * @generated
 */
public class MonitorMessageQueueServiceWrapper
	implements MonitorMessageQueueService,
		ServiceWrapper<MonitorMessageQueueService> {
	public MonitorMessageQueueServiceWrapper(
		MonitorMessageQueueService monitorMessageQueueService) {
		_monitorMessageQueueService = monitorMessageQueueService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MonitorMessageQueueService getWrappedMonitorMessageQueueService() {
		return _monitorMessageQueueService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMonitorMessageQueueService(
		MonitorMessageQueueService monitorMessageQueueService) {
		_monitorMessageQueueService = monitorMessageQueueService;
	}

	public MonitorMessageQueueService getWrappedService() {
		return _monitorMessageQueueService;
	}

	public void setWrappedService(
		MonitorMessageQueueService monitorMessageQueueService) {
		_monitorMessageQueueService = monitorMessageQueueService;
	}

	private MonitorMessageQueueService _monitorMessageQueueService;
}