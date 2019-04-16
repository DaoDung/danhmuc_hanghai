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

package vn.gt.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.common.model.LogMessageValidation;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing LogMessageValidation in entity cache.
 *
 * @author win_64
 * @see LogMessageValidation
 * @generated
 */
public class LogMessageValidationCacheModel implements CacheModel<LogMessageValidation>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestDirection=");
		sb.append(requestDirection);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", tagProperty=");
		sb.append(tagProperty);
		sb.append(", dataValidation=");
		sb.append(dataValidation);
		sb.append("}");

		return sb.toString();
	}

	public LogMessageValidation toEntityModel() {
		LogMessageValidationImpl logMessageValidationImpl = new LogMessageValidationImpl();

		logMessageValidationImpl.setId(id);

		if (requestCode == null) {
			logMessageValidationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setRequestCode(requestCode);
		}

		if (requestDirection == null) {
			logMessageValidationImpl.setRequestDirection(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setRequestDirection(requestDirection);
		}

		if (requestDate == Long.MIN_VALUE) {
			logMessageValidationImpl.setRequestDate(null);
		}
		else {
			logMessageValidationImpl.setRequestDate(new Date(requestDate));
		}

		logMessageValidationImpl.setDocumentName(documentName);
		logMessageValidationImpl.setDocumentYear(documentYear);

		if (documentType == null) {
			logMessageValidationImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setDocumentType(documentType);
		}

		if (tagProperty == null) {
			logMessageValidationImpl.setTagProperty(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setTagProperty(tagProperty);
		}

		if (dataValidation == null) {
			logMessageValidationImpl.setDataValidation(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setDataValidation(dataValidation);
		}

		logMessageValidationImpl.resetOriginalValues();

		return logMessageValidationImpl;
	}

	public long id;
	public String requestCode;
	public String requestDirection;
	public long requestDate;
	public long documentName;
	public int documentYear;
	public String documentType;
	public String tagProperty;
	public String dataValidation;
}