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

package vn.gt.dao.danhmuc.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.danhmuc.model.DmHistoryDocType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryDocType in entity cache.
 *
 * @author win_64
 * @see DmHistoryDocType
 * @generated
 */
public class DmHistoryDocTypeCacheModel implements CacheModel<DmHistoryDocType>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", documentTypeCode=");
		sb.append(documentTypeCode);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", documentTypeName=");
		sb.append(documentTypeName);
		sb.append(", isDelete=");
		sb.append(isDelete);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append("}");

		return sb.toString();
	}

	public DmHistoryDocType toEntityModel() {
		DmHistoryDocTypeImpl dmHistoryDocTypeImpl = new DmHistoryDocTypeImpl();

		dmHistoryDocTypeImpl.setId(id);

		if (documentTypeCode == null) {
			dmHistoryDocTypeImpl.setDocumentTypeCode(StringPool.BLANK);
		}
		else {
			dmHistoryDocTypeImpl.setDocumentTypeCode(documentTypeCode);
		}

		if (documentType == null) {
			dmHistoryDocTypeImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			dmHistoryDocTypeImpl.setDocumentType(documentType);
		}

		if (documentTypeName == null) {
			dmHistoryDocTypeImpl.setDocumentTypeName(StringPool.BLANK);
		}
		else {
			dmHistoryDocTypeImpl.setDocumentTypeName(documentTypeName);
		}

		dmHistoryDocTypeImpl.setIsDelete(isDelete);
		dmHistoryDocTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryDocTypeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryDocTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryDocTypeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryDocTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryDocTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryDocTypeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryDocTypeImpl.resetOriginalValues();

		return dmHistoryDocTypeImpl;
	}

	public int id;
	public String documentTypeCode;
	public String documentType;
	public String documentTypeName;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}