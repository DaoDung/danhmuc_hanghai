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
public class HistoryInterfaceRequestFinderUtil {
	public static vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequest findHistoryInterfaceRequestByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findHistoryInterfaceRequestByRequestCode(requestCode);
	}

	public static int updateHistoryInterfaceRequest(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().updateHistoryInterfaceRequest(sql);
	}

	public static HistoryInterfaceRequestFinder getFinder() {
		if (_finder == null) {
			_finder = (HistoryInterfaceRequestFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					HistoryInterfaceRequestFinder.class.getName());

			ReferenceRegistry.registerReference(HistoryInterfaceRequestFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(HistoryInterfaceRequestFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(HistoryInterfaceRequestFinderUtil.class,
			"_finder");
	}

	private static HistoryInterfaceRequestFinder _finder;
}