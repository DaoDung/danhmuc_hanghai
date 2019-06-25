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

package vn.gt.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.common.service.LogMessageValidationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class LogMessageValidationClp extends BaseModelImpl<LogMessageValidation>
	implements LogMessageValidation {
	public LogMessageValidationClp() {
	}

	public Class<?> getModelClass() {
		return LogMessageValidation.class;
	}

	public String getModelClassName() {
		return LogMessageValidation.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public String getRequestDirection() {
		return _requestDirection;
	}

	public void setRequestDirection(String requestDirection) {
		_requestDirection = requestDirection;
	}

	public Date getRequestDate() {
		return _requestDate;
	}

	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	public String getTagProperty() {
		return _tagProperty;
	}

	public void setTagProperty(String tagProperty) {
		_tagProperty = tagProperty;
	}

	public String getDataValidation() {
		return _dataValidation;
	}

	public void setDataValidation(String dataValidation) {
		_dataValidation = dataValidation;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			LogMessageValidationLocalServiceUtil.addLogMessageValidation(this);
		}
		else {
			LogMessageValidationLocalServiceUtil.updateLogMessageValidation(this);
		}
	}

	@Override
	public LogMessageValidation toEscapedModel() {
		return (LogMessageValidation)Proxy.newProxyInstance(LogMessageValidation.class.getClassLoader(),
			new Class[] { LogMessageValidation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LogMessageValidationClp clone = new LogMessageValidationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestDirection(getRequestDirection());
		clone.setRequestDate(getRequestDate());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setDocumentType(getDocumentType());
		clone.setTagProperty(getTagProperty());
		clone.setDataValidation(getDataValidation());

		return clone;
	}

	public int compareTo(LogMessageValidation logMessageValidation) {
		int value = 0;

		if (getId() < logMessageValidation.getId()) {
			value = -1;
		}
		else if (getId() > logMessageValidation.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		LogMessageValidationClp logMessageValidation = null;

		try {
			logMessageValidation = (LogMessageValidationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = logMessageValidation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestDirection=");
		sb.append(getRequestDirection());
		sb.append(", requestDate=");
		sb.append(getRequestDate());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", tagProperty=");
		sb.append(getTagProperty());
		sb.append(", dataValidation=");
		sb.append(getDataValidation());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.common.model.LogMessageValidation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDirection</column-name><column-value><![CDATA[");
		sb.append(getRequestDirection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDate</column-name><column-value><![CDATA[");
		sb.append(getRequestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagProperty</column-name><column-value><![CDATA[");
		sb.append(getTagProperty());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataValidation</column-name><column-value><![CDATA[");
		sb.append(getDataValidation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _requestDirection;
	private Date _requestDate;
	private long _documentName;
	private int _documentYear;
	private String _documentType;
	private String _tagProperty;
	private String _dataValidation;
}