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
public class IssueShiftingOrderFinderUtil {
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .findIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		return getFinder()
				   .findIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findIssueShiftingOrderInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo,
			certificateNumber, start, end);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findIssueShiftingOrderInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber, start, end);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear,
		java.lang.String orderByNameColumn, boolean ascOrdesc) {
		return getFinder()
				   .findByDocumentYearAndDocumentYearOrderByColumn(documentName,
			documentYear, orderByNameColumn, ascOrdesc);
	}

	public static int countIssueShiftingOrderInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countIssueShiftingOrderInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo,
			certificateNumber);
	}

	public static int countIssueShiftingOrderInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countIssueShiftingOrderInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber);
	}

	public static int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder getVersionNoMaxByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .getVersionNoMaxByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.lang.String capGiayPhepSo(
		java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().capGiayPhepSo(maritimeReference);
	}

	public static IssueShiftingOrderFinder getFinder() {
		if (_finder == null) {
			_finder = (IssueShiftingOrderFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					IssueShiftingOrderFinder.class.getName());

			ReferenceRegistry.registerReference(IssueShiftingOrderFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(IssueShiftingOrderFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(IssueShiftingOrderFinderUtil.class,
			"_finder");
	}

	private static IssueShiftingOrderFinder _finder;
}