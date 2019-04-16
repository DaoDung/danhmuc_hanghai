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

package vn.gt.dao.noticeandmessage.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.InterfaceRequestServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.InterfaceRequestServiceSoap
 * @generated
 */
public class InterfaceRequestSoap implements Serializable {
	public static InterfaceRequestSoap toSoapModel(InterfaceRequest model) {
		InterfaceRequestSoap soapModel = new InterfaceRequestSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setOrganizationCode(model.getOrganizationCode());
		soapModel.setLocCode(model.getLocCode());
		soapModel.setRequestDate(model.getRequestDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setRequestDirection(model.getRequestDirection());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setRequestResponseTime(model.getRequestResponseTime());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setDocumentNameRef(model.getDocumentNameRef());
		soapModel.setBusinessType(model.getBusinessType());
		soapModel.setFunctionType(model.getFunctionType());
		soapModel.setRequestContent(model.getRequestContent());
		soapModel.setSenderName(model.getSenderName());
		soapModel.setRequestVersion(model.getRequestVersion());
		soapModel.setSenderIdentify(model.getSenderIdentify());
		soapModel.setReceiverName(model.getReceiverName());
		soapModel.setSendingDate(model.getSendingDate());
		soapModel.setReceiverIdentify(model.getReceiverIdentify());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static InterfaceRequestSoap[] toSoapModels(InterfaceRequest[] models) {
		InterfaceRequestSoap[] soapModels = new InterfaceRequestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InterfaceRequestSoap[][] toSoapModels(
		InterfaceRequest[][] models) {
		InterfaceRequestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InterfaceRequestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InterfaceRequestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InterfaceRequestSoap[] toSoapModels(
		List<InterfaceRequest> models) {
		List<InterfaceRequestSoap> soapModels = new ArrayList<InterfaceRequestSoap>(models.size());

		for (InterfaceRequest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InterfaceRequestSoap[soapModels.size()]);
	}

	public InterfaceRequestSoap() {
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

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
	}

	public String getLocCode() {
		return _locCode;
	}

	public void setLocCode(String locCode) {
		_locCode = locCode;
	}

	public Date getRequestDate() {
		return _requestDate;
	}

	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getRequestDirection() {
		return _requestDirection;
	}

	public void setRequestDirection(String requestDirection) {
		_requestDirection = requestDirection;
	}

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	public Date getRequestResponseTime() {
		return _requestResponseTime;
	}

	public void setRequestResponseTime(Date requestResponseTime) {
		_requestResponseTime = requestResponseTime;
	}

	public String getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	public String getDocumentNameRef() {
		return _documentNameRef;
	}

	public void setDocumentNameRef(String documentNameRef) {
		_documentNameRef = documentNameRef;
	}

	public String getBusinessType() {
		return _businessType;
	}

	public void setBusinessType(String businessType) {
		_businessType = businessType;
	}

	public String getFunctionType() {
		return _functionType;
	}

	public void setFunctionType(String functionType) {
		_functionType = functionType;
	}

	public String getRequestContent() {
		return _requestContent;
	}

	public void setRequestContent(String requestContent) {
		_requestContent = requestContent;
	}

	public String getSenderName() {
		return _senderName;
	}

	public void setSenderName(String senderName) {
		_senderName = senderName;
	}

	public String getRequestVersion() {
		return _requestVersion;
	}

	public void setRequestVersion(String requestVersion) {
		_requestVersion = requestVersion;
	}

	public String getSenderIdentify() {
		return _senderIdentify;
	}

	public void setSenderIdentify(String senderIdentify) {
		_senderIdentify = senderIdentify;
	}

	public String getReceiverName() {
		return _receiverName;
	}

	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;
	}

	public Date getSendingDate() {
		return _sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		_sendingDate = sendingDate;
	}

	public String getReceiverIdentify() {
		return _receiverIdentify;
	}

	public void setReceiverIdentify(String receiverIdentify) {
		_receiverIdentify = receiverIdentify;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private long _id;
	private String _requestCode;
	private String _organizationCode;
	private String _locCode;
	private Date _requestDate;
	private Date _requestedDate;
	private String _requestDirection;
	private int _requestState;
	private Date _requestResponseTime;
	private String _documentType;
	private String _documentNameRef;
	private String _businessType;
	private String _functionType;
	private String _requestContent;
	private String _senderName;
	private String _requestVersion;
	private String _senderIdentify;
	private String _receiverName;
	private Date _sendingDate;
	private String _receiverIdentify;
	private String _remarks;
}