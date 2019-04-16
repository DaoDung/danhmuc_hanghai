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
public class TempAnimalQuarantineFinderUtil {
	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return getFinder()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return getFinder()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static TempAnimalQuarantineFinder getFinder() {
		if (_finder == null) {
			_finder = (TempAnimalQuarantineFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempAnimalQuarantineFinder.class.getName());

			ReferenceRegistry.registerReference(TempAnimalQuarantineFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempAnimalQuarantineFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempAnimalQuarantineFinderUtil.class,
			"_finder");
	}

	private static TempAnimalQuarantineFinder _finder;
}