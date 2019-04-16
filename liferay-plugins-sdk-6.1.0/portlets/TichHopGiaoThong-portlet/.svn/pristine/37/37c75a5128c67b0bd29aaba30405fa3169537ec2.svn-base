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

/**
 * @author win_64
 */
public interface IssueShiftingOrderFinder {
	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState);

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear,
		java.lang.String orderByNameColumn, boolean ascOrdesc);

	public int countIssueShiftingOrderInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo,
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countIssueShiftingOrderInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.noticeandmessage.model.IssueShiftingOrder getVersionNoMaxByDocumentYearAndDocumentYear(
		long documentName, int documentYear);

	public java.lang.String capGiayPhepSo(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException;
}