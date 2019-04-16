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
public class TempGeneralDeclarationFinderUtil {
	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration findTempGeneralDeclarationByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findTempGeneralDeclarationByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .findByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration getByRequestCode(
		java.lang.String requestCode) {
		return getFinder().getByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return getFinder()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static TempGeneralDeclarationFinder getFinder() {
		if (_finder == null) {
			_finder = (TempGeneralDeclarationFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempGeneralDeclarationFinder.class.getName());

			ReferenceRegistry.registerReference(TempGeneralDeclarationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempGeneralDeclarationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempGeneralDeclarationFinderUtil.class,
			"_finder");
	}

	private static TempGeneralDeclarationFinder _finder;
}