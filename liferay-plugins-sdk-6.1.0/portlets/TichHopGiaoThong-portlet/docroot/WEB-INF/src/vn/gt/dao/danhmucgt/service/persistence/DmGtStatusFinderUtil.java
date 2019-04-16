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

package vn.gt.dao.danhmucgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class DmGtStatusFinderUtil {
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByType(type);
	}

	public static DmGtStatusFinder getFinder() {
		if (_finder == null) {
			_finder = (DmGtStatusFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmGtStatusFinder.class.getName());

			ReferenceRegistry.registerReference(DmGtStatusFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmGtStatusFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmGtStatusFinderUtil.class,
			"_finder");
	}

	private static DmGtStatusFinder _finder;
}