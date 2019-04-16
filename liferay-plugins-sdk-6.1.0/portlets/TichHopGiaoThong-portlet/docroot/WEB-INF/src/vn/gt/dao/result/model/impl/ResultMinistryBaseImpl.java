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

import vn.gt.dao.result.model.ResultMinistry;
import vn.gt.dao.result.service.ResultMinistryLocalServiceUtil;

/**
 * The extended model base implementation for the ResultMinistry service. Represents a row in the &quot;RESULT_MINISTRY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResultMinistryImpl}.
 * </p>
 *
 * @author win_64
 * @see ResultMinistryImpl
 * @see vn.gt.dao.result.model.ResultMinistry
 * @generated
 */
public abstract class ResultMinistryBaseImpl extends ResultMinistryModelImpl
	implements ResultMinistry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a result ministry model instance should use the {@link ResultMinistry} interface instead.
	 */
	public void persist() throws SystemException {
		ResultMinistryLocalServiceUtil.updateResultMinistry(this);
	}
}