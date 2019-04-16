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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class InterfaceRequestFinderUtil {
	public static vn.gt.dao.noticeandmessage.model.InterfaceRequest findInterfaceRequestByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findInterfaceRequestByRequestCode(requestCode);
	}

	public static java.util.Date getRequestedDateByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getRequestedDateByRequestCode(requestCode);
	}

	public static java.lang.String getFunctionTypeByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getFunctionTypeByRequestCode(requestCode);
	}

	public static java.lang.String getRemarksByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getRemarksByRequestCode(requestCode);
	}

	public static int updateInterfaceRequest(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().updateInterfaceRequest(sql);
	}

	public static InterfaceRequestFinder getFinder() {
		if (_finder == null) {
			_finder = (InterfaceRequestFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					InterfaceRequestFinder.class.getName());

			ReferenceRegistry.registerReference(InterfaceRequestFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(InterfaceRequestFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(InterfaceRequestFinderUtil.class,
			"_finder");
	}

	private static InterfaceRequestFinder _finder;
}