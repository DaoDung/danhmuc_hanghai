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
public class ViewHoanThanhThuTucFinderUtil {
	public static java.util.List<vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc> findByKetQuaHoanThanhThuTuc(
		java.lang.String maritimeCode, java.lang.String dateFrom,
		java.lang.String dateTo) {
		return getFinder()
				   .findByKetQuaHoanThanhThuTuc(maritimeCode, dateFrom, dateTo);
	}

	public static ViewHoanThanhThuTucFinder getFinder() {
		if (_finder == null) {
			_finder = (ViewHoanThanhThuTucFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					ViewHoanThanhThuTucFinder.class.getName());

			ReferenceRegistry.registerReference(ViewHoanThanhThuTucFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ViewHoanThanhThuTucFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ViewHoanThanhThuTucFinderUtil.class,
			"_finder");
	}

	private static ViewHoanThanhThuTucFinder _finder;
}