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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.nhapcanh.service.http.DocumentServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.nhapcanh.service.http.DocumentServiceSoap
 * @generated
 */
public class DocumentSoap implements Serializable {
	public static DocumentSoap toSoapModel(Document model) {
		DocumentSoap soapModel = new DocumentSoap();

		soapModel.setId(model.getId());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setDocumentTypeCode(model.getDocumentTypeCode());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setPreDocumentName(model.getPreDocumentName());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setLastModifiedDate(model.getLastModifiedDate());

		return soapModel;
	}

	public static DocumentSoap[] toSoapModels(Document[] models) {
		DocumentSoap[] soapModels = new DocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentSoap[][] toSoapModels(Document[][] models) {
		DocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentSoap[] toSoapModels(List<Document> models) {
		List<DocumentSoap> soapModels = new ArrayList<DocumentSoap>(models.size());

		for (Document model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentSoap[soapModels.size()]);
	}

	public DocumentSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
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

	private long _id;
	private long _documentName;
	private String _userCreated;
	private String _documentTypeCode;
	private String _callSign;
	private String _preDocumentName;
	private Date _createdDate;
	private Date _lastModifiedDate;
}