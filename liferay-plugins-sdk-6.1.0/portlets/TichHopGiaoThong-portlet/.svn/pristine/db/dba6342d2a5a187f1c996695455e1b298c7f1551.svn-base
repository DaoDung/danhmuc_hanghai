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
public class ResultMinistryFinderUtil {
	public static java.util.List<vn.gt.dao.result.model.ResultMinistry> findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, java.lang.String ministryCode,
		int businessTypeCode) {
		return getFinder()
				   .findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(documentName,
			documentYear, ministryCode, businessTypeCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultMinistry> findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String lstBusinessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName,
			documentYear, ministryCode, lstBusinessTypeCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultMinistry> findDistinctMinistryCode(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDistinctMinistryCode(documentName, documentYear);
	}

	public static ResultMinistryFinder getFinder() {
		if (_finder == null) {
			_finder = (ResultMinistryFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultMinistryFinder.class.getName());

			ReferenceRegistry.registerReference(ResultMinistryFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ResultMinistryFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ResultMinistryFinderUtil.class,
			"_finder");
	}

	private static ResultMinistryFinder _finder;
}