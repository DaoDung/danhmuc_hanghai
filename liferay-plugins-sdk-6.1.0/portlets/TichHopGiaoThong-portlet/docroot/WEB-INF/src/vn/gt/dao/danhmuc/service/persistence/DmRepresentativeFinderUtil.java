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
public class DmRepresentativeFinderUtil {
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> getAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getAll();
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findDmRepresentativeByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDmRepresentativeByMaritimeCode(maritimeCode);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findDanhSachDmRepresentative(
		java.lang.String maritimeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDanhSachDmRepresentative(maritimeCode, start, end);
	}

	public static int countDanhSachDmRepresentative(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDanhSachDmRepresentative(maritimeCode);
	}

	public static DmRepresentativeFinder getFinder() {
		if (_finder == null) {
			_finder = (DmRepresentativeFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmRepresentativeFinder.class.getName());

			ReferenceRegistry.registerReference(DmRepresentativeFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmRepresentativeFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmRepresentativeFinderUtil.class,
			"_finder");
	}

	private static DmRepresentativeFinder _finder;
}