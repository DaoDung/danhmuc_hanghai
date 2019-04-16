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
public interface TempNoTiceShipMessageFinder {
	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType);

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAllTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findAllTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(
		long documentName, int documentYear, java.lang.String noticeShipType,
		java.lang.String orderByColumn, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;
}