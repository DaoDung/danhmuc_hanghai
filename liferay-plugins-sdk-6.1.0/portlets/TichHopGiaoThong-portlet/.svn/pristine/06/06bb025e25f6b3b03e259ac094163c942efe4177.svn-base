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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    win_64
 * @generated
 */
public class LogMessageValidationSoap implements Serializable {
	public static LogMessageValidationSoap toSoapModel(
		LogMessageValidation model) {
		LogMessageValidationSoap soapModel = new LogMessageValidationSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestDirection(model.getRequestDirection());
		soapModel.setRequestDate(model.getRequestDate());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setTagProperty(model.getTagProperty());
		soapModel.setDataValidation(model.getDataValidation());

		return soapModel;
	}

	public static LogMessageValidationSoap[] toSoapModels(
		LogMessageValidation[] models) {
		LogMessageValidationSoap[] soapModels = new LogMessageValidationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LogMessageValidationSoap[][] toSoapModels(
		LogMessageValidation[][] models) {
		LogMessageValidationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LogMessageValidationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LogMessageValidationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LogMessageValidationSoap[] toSoapModels(
		List<LogMessageValidation> models) {
		List<LogMessageValidationSoap> soapModels = new ArrayList<LogMessageValidationSoap>(models.size());

		for (LogMessageValidation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LogMessageValidationSoap[soapModels.size()]);
	}

	public LogMessageValidationSoap() {
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