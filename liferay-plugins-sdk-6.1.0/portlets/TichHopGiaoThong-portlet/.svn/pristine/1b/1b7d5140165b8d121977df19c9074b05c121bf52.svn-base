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

package vn.gt.dao.result.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.result.service.http.ResultNotificationServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.result.service.http.ResultNotificationServiceSoap
 * @generated
 */
public class ResultNotificationSoap implements Serializable {
	public static ResultNotificationSoap toSoapModel(ResultNotification model) {
		ResultNotificationSoap soapModel = new ResultNotificationSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setMaritimeCode(model.getMaritimeCode());
		soapModel.setRole(model.getRole());
		soapModel.setResponse(model.getResponse());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setDivision(model.getDivision());
		soapModel.setOfficerName(model.getOfficerName());
		soapModel.setLatestDate(model.getLatestDate());
		soapModel.setBusinessTypeCode(model.getBusinessTypeCode());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setIsReply(model.getIsReply());
		soapModel.setResponseTime(model.getResponseTime());

		return soapModel;
	}

	public static ResultNotificationSoap[] toSoapModels(
		ResultNotification[] models) {
		ResultNotificationSoap[] soapModels = new ResultNotificationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultNotificationSoap[][] toSoapModels(
		ResultNotification[][] models) {
		ResultNotificationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultNotificationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultNotificationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultNotificationSoap[] toSoapModels(
		List<ResultNotification> models) {
		List<ResultNotificationSoap> soapModels = new ArrayList<ResultNotificationSoap>(models.size());

		for (ResultNotification model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultNotificationSoap[soapModels.size()]);
	}

	public ResultNotificationSoap() {
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

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
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

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public long getRole() {
		return _role;
	}

	public void setRole(long role) {
		_role = role;
	}

	public String getResponse() {
		return _response;
	}

	public void setResponse(String response) {
		_response = response;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getOfficerName() {
		return _officerName;
	}

	public void setOfficerName(String officerName) {
		_officerName = officerName;
	}

	public String getLatestDate() {
		return _latestDate;
	}

	public void setLatestDate(String latestDate) {
		_latestDate = latestDate;
	}

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public int getIsReply() {
		return _isReply;
	}

	public void setIsReply(int isReply) {
		_isReply = isReply;
	}

	public Date getResponseTime() {
		return _responseTime;
	}

	public void setResponseTime(Date responseTime) {
		_responseTime = responseTime;
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _maritimeCode;
	private long _role;
	private String _response;
	private String _organization;
	private String _division;
	private String _officerName;
	private String _latestDate;
	private int _businessTypeCode;
	private String _remarks;
	private int _isReply;
	private Date _responseTime;
}