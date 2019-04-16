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
public class DmPortHarbourFinderUtil {
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> getAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getAll();
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findDanhSachDmPortHarbour(
		java.lang.String maritimeCode, java.lang.String portRegion,
		java.lang.String portHarbourName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDanhSachDmPortHarbour(maritimeCode, portRegion,
			portHarbourName, start, end);
	}

	public static int countDanhSachDmPortHarbour(
		java.lang.String maritimeCode, java.lang.String portRegion,
		java.lang.String portHarbourName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachDmPortHarbour(maritimeCode, portRegion,
			portHarbourName);
	}

	public static vn.gt.dao.danhmuc.model.DmPortHarbour getFirstPortHarbour()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getFirstPortHarbour();
	}

	public static vn.gt.dao.danhmuc.model.DmPortHarbour getLastPortHarbour()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getLastPortHarbour();
	}

	public static DmPortHarbourFinder getFinder() {
		if (_finder == null) {
			_finder = (DmPortHarbourFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPortHarbourFinder.class.getName());

			ReferenceRegistry.registerReference(DmPortHarbourFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmPortHarbourFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmPortHarbourFinderUtil.class,
			"_finder");
	}

	private static DmPortHarbourFinder _finder;
}