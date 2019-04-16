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
public class TempCrewEffectsItemsFinderUtil {
	public static vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems findTempCrewEffectsItemsByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findTempCrewEffectsItemsByRequestCode(requestCode);
	}

	public static TempCrewEffectsItemsFinder getFinder() {
		if (_finder == null) {
			_finder = (TempCrewEffectsItemsFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempCrewEffectsItemsFinder.class.getName());

			ReferenceRegistry.registerReference(TempCrewEffectsItemsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempCrewEffectsItemsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempCrewEffectsItemsFinderUtil.class,
			"_finder");
	}

	private static TempCrewEffectsItemsFinder _finder;
}