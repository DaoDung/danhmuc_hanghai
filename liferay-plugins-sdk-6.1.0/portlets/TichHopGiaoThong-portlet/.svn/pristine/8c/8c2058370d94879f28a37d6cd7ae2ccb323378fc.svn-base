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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.result.service.http.ResultMinistryServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.result.service.http.ResultMinistryServiceSoap
 * @generated
 */
public class ResultMinistrySoap implements Serializable {
	public static ResultMinistrySoap toSoapModel(ResultMinistry model) {
		ResultMinistrySoap soapModel = new ResultMinistrySoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setMinistryCode(model.getMinistryCode());
		soapModel.setOrganization(model.getOrganization());
		soapModel.setDivision(model.getDivision());
		soapModel.setOfficerName(model.getOfficerName());
		soapModel.setLatestDate(model.getLatestDate());
		soapModel.setBusinessTypeCode(model.getBusinessTypeCode());
		soapModel.setResponse(model.getResponse());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static ResultMinistrySoap[] toSoapModels(ResultMinistry[] models) {
		ResultMinistrySoap[] soapModels = new ResultMinistrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultMinistrySoap[][] toSoapModels(ResultMinistry[][] models) {
		ResultMinistrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultMinistrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultMinistrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultMinistrySoap[] toSoapModels(List<ResultMinistry> models) {
		List<ResultMinistrySoap> soapModels = new ArrayList<ResultMinistrySoap>(models.size());

		for (ResultMinistry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultMinistrySoap[soapModels.size()]);
	}

	public ResultMinistrySoap() {
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

	public int getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(int documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getMinistryCode() {
		return _ministryCode;
	}

	public void setMinistryCode(String ministryCode) {
		_ministryCode = ministryCode;
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

	public Date getLatestDate() {
		return _latestDate;
	}

	public void setLatestDate(Date latestDate) {
		_latestDate = latestDate;
	}

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public String getResponse() {
		return _response;
	}

	public void setResponse(String response) {
		_response = response;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private int _documentName;
	private int _documentYear;
	private String _ministryCode;
	private String _organization;
	private String _division;
	private String _officerName;
	private Date _latestDate;
	private int _businessTypeCode;
	private String _response;
	private String _remarks;
}