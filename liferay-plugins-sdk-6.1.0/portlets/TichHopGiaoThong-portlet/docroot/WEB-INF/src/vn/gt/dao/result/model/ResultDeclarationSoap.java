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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.result.service.http.ResultDeclarationServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.result.service.http.ResultDeclarationServiceSoap
 * @generated
 */
public class ResultDeclarationSoap implements Serializable {
	public static ResultDeclarationSoap toSoapModel(ResultDeclaration model) {
		ResultDeclarationSoap soapModel = new ResultDeclarationSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setBusinessOrder(model.getBusinessOrder());
		soapModel.setBusinessTypeCode(model.getBusinessTypeCode());
		soapModel.setLatestSend(model.getLatestSend());
		soapModel.setDeclarationTime(model.getDeclarationTime());
		soapModel.setArrivalDepartureTime(model.getArrivalDepartureTime());
		soapModel.setRemainingTime(model.getRemainingTime());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static ResultDeclarationSoap[] toSoapModels(
		ResultDeclaration[] models) {
		ResultDeclarationSoap[] soapModels = new ResultDeclarationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultDeclarationSoap[][] toSoapModels(
		ResultDeclaration[][] models) {
		ResultDeclarationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultDeclarationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultDeclarationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultDeclarationSoap[] toSoapModels(
		List<ResultDeclaration> models) {
		List<ResultDeclarationSoap> soapModels = new ArrayList<ResultDeclarationSoap>(models.size());

		for (ResultDeclaration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultDeclarationSoap[soapModels.size()]);
	}

	public ResultDeclarationSoap() {
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

	public int getBusinessOrder() {
		return _businessOrder;
	}

	public void setBusinessOrder(int businessOrder) {
		_businessOrder = businessOrder;
	}

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public int getLatestSend() {
		return _latestSend;
	}

	public void setLatestSend(int latestSend) {
		_latestSend = latestSend;
	}

	public Date getDeclarationTime() {
		return _declarationTime;
	}

	public void setDeclarationTime(Date declarationTime) {
		_declarationTime = declarationTime;
	}

	public Date getArrivalDepartureTime() {
		return _arrivalDepartureTime;
	}

	public void setArrivalDepartureTime(Date arrivalDepartureTime) {
		_arrivalDepartureTime = arrivalDepartureTime;
	}

	public String getRemainingTime() {
		return _remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		_remainingTime = remainingTime;
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
	private long _documentName;
	private int _documentYear;
	private int _businessOrder;
	private int _businessTypeCode;
	private int _latestSend;
	private Date _declarationTime;
	private Date _arrivalDepartureTime;
	private String _remainingTime;
	private String _remarks;
}