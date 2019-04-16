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

package vn.dao.gt.asw.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win 64
 */
public class AswmsgMessageQueueFinderUtil {
	public static java.util.List<vn.dao.gt.asw.model.AswmsgMessageQueue> getListMessage2Queue(
		int count) {
		return getFinder().getListMessage2Queue(count);
	}

	public static java.util.List<vn.dao.gt.asw.model.AswmsgMessageQueue> getListMessageQueuePending(
		java.lang.String validationCode) {
		return getFinder().getListMessageQueuePending(validationCode);
	}

	public static AswmsgMessageQueueFinder getFinder() {
		if (_finder == null) {
			_finder = (AswmsgMessageQueueFinder)PortletBeanLocatorUtil.locate(vn.dao.gt.asw.service.ClpSerializer.getServletContextName(),
					AswmsgMessageQueueFinder.class.getName());

			ReferenceRegistry.registerReference(AswmsgMessageQueueFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(AswmsgMessageQueueFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(AswmsgMessageQueueFinderUtil.class,
			"_finder");
	}

	private static AswmsgMessageQueueFinder _finder;
}