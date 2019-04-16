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
public class DmDataItemFinderUtil {
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> getAllByDataGroupID(
		long datagroupid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getAllByDataGroupID(datagroupid, start, end);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> getAllByNode1Node2AndDataGroupID(
		long datagroupid, java.lang.String node1, java.lang.String node2,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getAllByNode1Node2AndDataGroupID(datagroupid, node1, node2,
			start, end);
	}

	public static int countByNode1Node2AndDataGroupID(long datagroupid,
		java.lang.String node1, java.lang.String node2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByNode1Node2AndDataGroupID(datagroupid, node1, node2,
			start, end);
	}

	public static vn.gt.dao.danhmuc.model.DmDataItem getByNode2AndDataGroupID(
		long datagroupid, java.lang.String node2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().getByNode2AndDataGroupID(datagroupid, node2);
	}

	public static DmDataItemFinder getFinder() {
		if (_finder == null) {
			_finder = (DmDataItemFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmDataItemFinder.class.getName());

			ReferenceRegistry.registerReference(DmDataItemFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmDataItemFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmDataItemFinderUtil.class,
			"_finder");
	}

	private static DmDataItemFinder _finder;
}