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
public class ResultHistoryMinistryFinderUtil {
	public static vn.gt.dao.result.model.ResultHistoryMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName,
			documentYear, ministryCode, businessTypeCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findDistinctMinistryCode(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDistinctMinistryCode(documentName, documentYear);
	}

	public static ResultHistoryMinistryFinder getFinder() {
		if (_finder == null) {
			_finder = (ResultHistoryMinistryFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultHistoryMinistryFinder.class.getName());

			ReferenceRegistry.registerReference(ResultHistoryMinistryFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ResultHistoryMinistryFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ResultHistoryMinistryFinderUtil.class,
			"_finder");
	}

	private static ResultHistoryMinistryFinder _finder;
}