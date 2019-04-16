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
public class IssueAcceptanceFinderUtil {
	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance findLastestIssueAcceptanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign) {
		return getFinder()
				   .findLastestIssueAcceptanceByPortNameAndCallSign(nameOfShip,
			callSign);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findIssueAcceptanceInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo, start, end);
	}

	public static int countIssueAcceptanceInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countIssueAcceptanceInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getFinder()
				   .findIssueAcceptanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear) {
		return getFinder()
				   .countByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		return getFinder()
				   .findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance findByRequestCode(
		java.lang.String requestCode) {
		return getFinder().findByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc) {
		return getFinder()
				   .findByDocumentYearAndDocumentYearOrderByColumn(documentName,
			documentYear, orderByColumn, ascOrdesc);
	}

	public static java.lang.String capGiayPhepSo(
		java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().capGiayPhepSo(maritimeReference);
	}

	public static IssueAcceptanceFinder getFinder() {
		if (_finder == null) {
			_finder = (IssueAcceptanceFinder)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					IssueAcceptanceFinder.class.getName());

			ReferenceRegistry.registerReference(IssueAcceptanceFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(IssueAcceptanceFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(IssueAcceptanceFinderUtil.class,
			"_finder");
	}

	private static IssueAcceptanceFinder _finder;
}