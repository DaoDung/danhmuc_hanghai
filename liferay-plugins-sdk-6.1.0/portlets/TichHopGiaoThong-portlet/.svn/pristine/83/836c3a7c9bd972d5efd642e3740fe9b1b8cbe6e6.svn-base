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
public class DmPortRegionFinderUtil {
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> getAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getAll();
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findDanhSachDmPortRegion(
		java.lang.String maritimeCode, java.lang.String portRegionName,
		java.lang.String portCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDanhSachDmPortRegion(maritimeCode, portRegionName,
			portCode, start, end);
	}

	public static int countDanhSachDmPortRegion(java.lang.String maritimeCode,
		java.lang.String portRegionName, java.lang.String portCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachDmPortRegion(maritimeCode, portRegionName,
			portCode);
	}

	public static vn.gt.dao.danhmuc.model.DmPortRegion getFirstPortRegion()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getFirstPortRegion();
	}

	public static vn.gt.dao.danhmuc.model.DmPortRegion getLastPortRegion()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getLastPortRegion();
	}

	public static DmPortRegionFinder getFinder() {
		if (_finder == null) {
			_finder = (DmPortRegionFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPortRegionFinder.class.getName());

			ReferenceRegistry.registerReference(DmPortRegionFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmPortRegionFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmPortRegionFinderUtil.class,
			"_finder");
	}

	private static DmPortRegionFinder _finder;
}