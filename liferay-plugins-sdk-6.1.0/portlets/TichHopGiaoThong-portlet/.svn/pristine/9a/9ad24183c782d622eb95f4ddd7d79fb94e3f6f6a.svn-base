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
public interface IssuePortClearanceFinder {
	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findLastestIssuePortClearanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign);

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findLatestCertificateOfIssuePortClearance(
		java.lang.String nameOfShip, java.lang.String callSign,
		java.lang.String certificateNo);

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countIssuePortClearanceInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo,
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear);

	public int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear);

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState);

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findByRequestCode(
		java.lang.String requestCode);

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc);

	public java.lang.String capGiayPhepSo(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException;
}