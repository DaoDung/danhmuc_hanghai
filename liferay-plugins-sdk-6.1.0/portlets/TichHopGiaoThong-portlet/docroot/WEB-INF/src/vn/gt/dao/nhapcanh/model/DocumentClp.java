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

package vn.gt.dao.nhapcanh.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.nhapcanh.service.DocumentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DocumentClp extends BaseModelImpl<Document> implements Document {
	public DocumentClp() {
	}

	public Class<?> getModelClass() {
		return Document.class;
	}

	public String getModelClassName() {
		return Document.class.getName();
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

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getPreDocumentName() {
		return _preDocumentName;
	}

	public void setPreDocumentName(String preDocumentName) {
		_preDocumentName = preDocumentName;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return _lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		_lastModifiedDate = lastModifiedDate;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentLocalServiceUtil.addDocument(this);
		}
		else {
			DocumentLocalServiceUtil.updateDocument(this);
		}
	}

	@Override
	public Document toEscapedModel() {
		return (Document)Proxy.newProxyInstance(Document.class.getClassLoader(),
			new Class[] { Document.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentClp clone = new DocumentClp();

		clone.setId(getId());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setDocumentTypeCode(getDocumentTypeCode());
		clone.setCallSign(getCallSign());
		clone.setPreDocumentName(getPreDocumentName());
		clone.setCreatedDate(getCreatedDate());
		clone.setLastModifiedDate(getLastModifiedDate());

		return clone;
	}

	public int compareTo(Document document) {
		long primaryKey = document.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DocumentClp document = null;

		try {
			document = (DocumentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = document.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", preDocumentName=");
		sb.append(getPreDocumentName());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", lastModifiedDate=");
		sb.append(getLastModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.nhapcanh.model.Document");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preDocumentName</column-name><column-value><![CDATA[");
		sb.append(getPreDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getLastModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _documentName;
	private String _userCreated;
	private String _documentTypeCode;
	private String _callSign;
	private String _preDocumentName;
	private Date _createdDate;
	private Date _lastModifiedDate;
}