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
public class TempNoTiceShipMessageFinderUtil {
	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findTempNoTiceShipMessageByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findTempNoTiceShipMessageXbByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType) {
		return getFinder()
				   .findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAllTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findAllTempNoTiceShipMessageXbByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAllTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findAllTempNoTiceShipMessageTbByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findTempNoTiceShipMessageTbByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(
		long documentName, int documentYear, java.lang.String noticeShipType,
		java.lang.String orderByColumn, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(documentName,
			documentYear, noticeShipType, orderByColumn, ascOrdesc);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getXacBaoLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .getThongBaoLastByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static TempNoTiceShipMessageFinder getFinder() {
		if (_finder == null) {
			_finder = (TempNoTiceShipMessageFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempNoTiceShipMessageFinder.class.getName());

			ReferenceRegistry.registerReference(TempNoTiceShipMessageFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TempNoTiceShipMessageFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TempNoTiceShipMessageFinderUtil.class,
			"_finder");
	}

	private static TempNoTiceShipMessageFinder _finder;
}