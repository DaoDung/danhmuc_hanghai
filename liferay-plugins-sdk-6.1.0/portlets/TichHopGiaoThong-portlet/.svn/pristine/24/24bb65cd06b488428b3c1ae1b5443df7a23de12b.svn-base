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

package vn.gt.dao.nhapcanh.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.nhapcanh.model.Document;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Document in entity cache.
 *
 * @author win_64
 * @see Document
 * @generated
 */
public class DocumentCacheModel implements CacheModel<Document>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", documentTypeCode=");
		sb.append(documentTypeCode);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", preDocumentName=");
		sb.append(preDocumentName);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", lastModifiedDate=");
		sb.append(lastModifiedDate);
		sb.append("}");

		return sb.toString();
	}

	public Document toEntityModel() {
		DocumentImpl documentImpl = new DocumentImpl();

		documentImpl.setId(id);
		documentImpl.setDocumentName(documentName);

		if (userCreated == null) {
			documentImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			documentImpl.setUserCreated(userCreated);
		}

		if (documentTypeCode == null) {
			documentImpl.setDocumentTypeCode(StringPool.BLANK);
		}
		else {
			documentImpl.setDocumentTypeCode(documentTypeCode);
		}

		if (callSign == null) {
			documentImpl.setCallSign(StringPool.BLANK);
		}
		else {
			documentImpl.setCallSign(callSign);
		}

		if (preDocumentName == null) {
			documentImpl.setPreDocumentName(StringPool.BLANK);
		}
		else {
			documentImpl.setPreDocumentName(preDocumentName);
		}

		if (createdDate == Long.MIN_VALUE) {
			documentImpl.setCreatedDate(null);
		}
		else {
			documentImpl.setCreatedDate(new Date(createdDate));
		}

		if (lastModifiedDate == Long.MIN_VALUE) {
			documentImpl.setLastModifiedDate(null);
		}
		else {
			documentImpl.setLastModifiedDate(new Date(lastModifiedDate));
		}

		documentImpl.resetOriginalValues();

		return documentImpl;
	}

	public long id;
	public long documentName;
	public String userCreated;
	public String documentTypeCode;
	public String callSign;
	public String preDocumentName;
	public long createdDate;
	public long lastModifiedDate;
}