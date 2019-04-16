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
public class ResultDeclarationFinderUtil {
	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear) {
		return getFinder()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearOrderByBusiness(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findResultDeclarationByDocumentNameAndDocumentYearOrderByBusiness(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findResultDeclarationByDocumentNameAndDocumentYearXcReport(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(documentName,
			documentYear);
	}

	public static ResultDeclarationFinder getFinder() {
		if (_finder == null) {
			_finder = (ResultDeclarationFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultDeclarationFinder.class.getName());

			ReferenceRegistry.registerReference(ResultDeclarationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ResultDeclarationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ResultDeclarationFinderUtil.class,
			"_finder");
	}

	private static ResultDeclarationFinder _finder;
}