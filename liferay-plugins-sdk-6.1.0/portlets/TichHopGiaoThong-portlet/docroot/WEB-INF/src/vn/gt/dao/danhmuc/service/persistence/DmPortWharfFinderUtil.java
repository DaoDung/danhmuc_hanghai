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
public class DmPortWharfFinderUtil {
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(portRegionCode,
			portHarbourCode, ascOrdesc);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDanhSachDmPortWharf(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN, boolean ascOrdesc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDanhSachDmPortWharf(portRegionCode, portHarbourCode,
			PortWharfNameVN, ascOrdesc, start, end);
	}

	public static int countDanhSachDmPortWharf(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachDmPortWharf(portRegionCode, portHarbourCode,
			PortWharfNameVN);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDongBoDmPortWharf(
		java.lang.String MaritimeCode, java.lang.String portRegionCode,
		java.lang.String portHarbourCode, java.lang.String PortWharfNameVN,
		boolean ascOrdesc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDongBoDmPortWharf(MaritimeCode, portRegionCode,
			portHarbourCode, PortWharfNameVN, ascOrdesc, start, end);
	}

	public static int countDongBoDmPortWharf(java.lang.String MaritimeCode,
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDongBoDmPortWharf(MaritimeCode, portRegionCode,
			portHarbourCode, PortWharfNameVN);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortHarbourCodeOrNull(
		java.lang.String portHarbourCode, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByPortHarbourCodeOrNull(portHarbourCode, ascOrdesc);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeOrderPortCode(
		java.lang.String portRegionCode, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByPortRegionCodeOrderPortCode(portRegionCode, ascOrdesc);
	}

	public static vn.gt.dao.danhmuc.model.DmPortWharf getFirstPortWharf()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getFirstPortWharf();
	}

	public static vn.gt.dao.danhmuc.model.DmPortWharf getLastPortWharf()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getLastPortWharf();
	}

	public static DmPortWharfFinder getFinder() {
		if (_finder == null) {
			_finder = (DmPortWharfFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmPortWharfFinder.class.getName());

			ReferenceRegistry.registerReference(DmPortWharfFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmPortWharfFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmPortWharfFinderUtil.class,
			"_finder");
	}

	private static DmPortWharfFinder _finder;
}