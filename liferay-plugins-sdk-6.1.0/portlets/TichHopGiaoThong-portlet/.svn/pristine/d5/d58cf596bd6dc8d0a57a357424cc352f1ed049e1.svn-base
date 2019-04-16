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
public class TempCrewEffectsDeclarationFinderUtil {
	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return getFinder()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration findTempCrewEffectsDeclarationByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findTempCrewEffectsDeclarationByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return getFinder()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static TempCrewEffectsDeclarationFinder getFinder() {
		if (_finder == null) {
			_finder = (TempCrewEffectsDeclarationFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempCrewEffectsDeclarationFinder.class.getName());

			ReferenceRegistry.registerReference(TempCrewEffectsDeclarationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempCrewEffectsDeclarationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempCrewEffectsDeclarationFinderUtil.class,
			"_finder");
	}

	private static TempCrewEffectsDeclarationFinder _finder;
}