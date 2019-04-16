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

package vn.gt.dao.result.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.result.model.ResultNotification;
import vn.gt.dao.result.service.ResultNotificationLocalServiceUtil;

/**
 * The extended model base implementation for the ResultNotification service. Represents a row in the &quot;result_notification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResultNotificationImpl}.
 * </p>
 *
 * @author win_64
 * @see ResultNotificationImpl
 * @see vn.gt.dao.result.model.ResultNotification
 * @generated
 */
public abstract class ResultNotificationBaseImpl
	extends ResultNotificationModelImpl implements ResultNotification {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a result notification model instance should use the {@link ResultNotification} interface instead.
	 */
	public void persist() throws SystemException {
		ResultNotificationLocalServiceUtil.updateResultNotification(this);
	}
}