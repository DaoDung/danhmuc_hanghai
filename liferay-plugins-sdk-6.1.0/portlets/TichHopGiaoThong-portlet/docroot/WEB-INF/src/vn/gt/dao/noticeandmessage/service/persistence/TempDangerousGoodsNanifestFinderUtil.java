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
public class TempDangerousGoodsNanifestFinderUtil {
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .findBydocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		return getFinder()
				   .countBydocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest getLastByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .getLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest> findByDocumentNameAndDocumentYearOrderByDescRequestDate(
		long documentName, int documentYear) {
		return getFinder()
				   .findByDocumentNameAndDocumentYearOrderByDescRequestDate(documentName,
			documentYear);
	}

	public static TempDangerousGoodsNanifestFinder getFinder() {
		if (_finder == null) {
			_finder = (TempDangerousGoodsNanifestFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempDangerousGoodsNanifestFinder.class.getName());

			ReferenceRegistry.registerReference(TempDangerousGoodsNanifestFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempDangerousGoodsNanifestFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempDangerousGoodsNanifestFinderUtil.class,
			"_finder");
	}

	private static TempDangerousGoodsNanifestFinder _finder;
}