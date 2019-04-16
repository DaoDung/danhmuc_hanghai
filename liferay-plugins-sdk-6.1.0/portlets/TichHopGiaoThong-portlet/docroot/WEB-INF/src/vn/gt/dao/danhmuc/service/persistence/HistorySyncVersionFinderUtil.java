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

package vn.gt.dao.danhmuc.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class HistorySyncVersionFinderUtil {
	public static java.util.List<vn.gt.dao.danhmuc.model.HistorySyncVersion> getsyncVersion(
		java.util.Date requestedDate, java.lang.String categoryID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getsyncVersion(requestedDate, categoryID);
	}

	public static HistorySyncVersionFinder getFinder() {
		if (_finder == null) {
			_finder = (HistorySyncVersionFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					HistorySyncVersionFinder.class.getName());

			ReferenceRegistry.registerReference(HistorySyncVersionFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(HistorySyncVersionFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(HistorySyncVersionFinderUtil.class,
			"_finder");
	}

	private static HistorySyncVersionFinder _finder;
}