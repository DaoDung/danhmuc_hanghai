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

import vn.gt.dao.danhmuc.model.DmDocType;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmDocType in entity cache.
 *
 * @author win_64
 * @see DmDocType
 * @generated
 */
public class DmDocTypeCacheModel implements CacheModel<DmDocType>, Serializable {
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

	public DmDocType toEntityModel() {
		DmDocTypeImpl dmDocTypeImpl = new DmDocTypeImpl();

		dmDocTypeImpl.setId(id);

		if (documentTypeCode == null) {
			dmDocTypeImpl.setDocumentTypeCode(StringPool.BLANK);
		}
		else {
			dmDocTypeImpl.setDocumentTypeCode(documentTypeCode);
		}

		if (documentType == null) {
			dmDocTypeImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			dmDocTypeImpl.setDocumentType(documentType);
		}

		if (documentTypeName == null) {
			dmDocTypeImpl.setDocumentTypeName(StringPool.BLANK);
		}
		else {
			dmDocTypeImpl.setDocumentTypeName(documentTypeName);
		}

		dmDocTypeImpl.setIsDelete(isDelete);
		dmDocTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmDocTypeImpl.setModifiedDate(null);
		}
		else {
			dmDocTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmDocTypeImpl.setRequestedDate(null);
		}
		else {
			dmDocTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmDocTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmDocTypeImpl.setSyncVersion(syncVersion);
		}

		dmDocTypeImpl.resetOriginalValues();

		return dmDocTypeImpl;
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