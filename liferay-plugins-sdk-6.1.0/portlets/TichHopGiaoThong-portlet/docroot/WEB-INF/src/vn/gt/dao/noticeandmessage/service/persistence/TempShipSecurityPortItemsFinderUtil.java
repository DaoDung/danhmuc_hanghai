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
public class TempShipSecurityPortItemsFinderUtil {
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems> findByRequestCodeOrderByDateArrivalASC(
		java.lang.String requestCode) {
		return getFinder().findByRequestCodeOrderByDateArrivalASC(requestCode);
	}

	public static TempShipSecurityPortItemsFinder getFinder() {
		if (_finder == null) {
			_finder = (TempShipSecurityPortItemsFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempShipSecurityPortItemsFinder.class.getName());

			ReferenceRegistry.registerReference(TempShipSecurityPortItemsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempShipSecurityPortItemsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempShipSecurityPortItemsFinderUtil.class,
			"_finder");
	}

	private static TempShipSecurityPortItemsFinder _finder;
}