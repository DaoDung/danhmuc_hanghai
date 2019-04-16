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

package vn.gt.dao.result.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class ResultNotificationFinderUtil {
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByBusinessTypeCodeOrderbyLastestDate(
		java.lang.String businessTypeCode, long documentName, int documentYear) {
		return getFinder()
				   .findByBusinessTypeCodeOrderbyLastestDate(businessTypeCode,
			documentName, documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByMaritimeCodeOrderbyLastestDate(
		java.lang.String maritimeCode) {
		return getFinder().findByMaritimeCodeOrderbyLastestDate(maritimeCode);
	}

	public static ResultNotificationFinder getFinder() {
		if (_finder == null) {
			_finder = (ResultNotificationFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultNotificationFinder.class.getName());

			ReferenceRegistry.registerReference(ResultNotificationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ResultNotificationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ResultNotificationFinderUtil.class,
			"_finder");
	}

	private static ResultNotificationFinder _finder;
}