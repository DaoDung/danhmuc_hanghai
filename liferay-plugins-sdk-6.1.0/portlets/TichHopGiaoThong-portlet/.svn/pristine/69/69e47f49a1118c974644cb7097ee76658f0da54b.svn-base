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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.NoticeShipMessageServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.NoticeShipMessageServiceSoap
 * @generated
 */
public class NoticeShipMessageSoap implements Serializable {
	public static NoticeShipMessageSoap toSoapModel(NoticeShipMessage model) {
		NoticeShipMessageSoap soapModel = new NoticeShipMessageSoap();

		soapModel.setId(model.getId());
		soapModel.setNoticeShipCode(model.getNoticeShipCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setConfirmTime(model.getConfirmTime());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setArrivalDate(model.getArrivalDate());
		soapModel.setArrivalPortCode(model.getArrivalPortCode());
		soapModel.setPortGoingToCode(model.getPortGoingToCode());
		soapModel.setNameAndAddOfShipOwners(model.getNameAndAddOfShipOwners());
		soapModel.setClearanceHeight(model.getClearanceHeight());
		soapModel.setShownDraft(model.getShownDraft());
		soapModel.setDwt(model.getDwt());
		soapModel.setShipAgencyCode(model.getShipAgencyCode());
		soapModel.setPurposeCode(model.getPurposeCode());
		soapModel.setCrewNumber(model.getCrewNumber());
		soapModel.setPassengerNumber(model.getPassengerNumber());
		soapModel.setQuantityAndTypeOfCargo(model.getQuantityAndTypeOfCargo());
		soapModel.setOtherPersons(model.getOtherPersons());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static NoticeShipMessageSoap[] toSoapModels(
		NoticeShipMessage[] models) {
		NoticeShipMessageSoap[] soapModels = new NoticeShipMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NoticeShipMessageSoap[][] toSoapModels(
		NoticeShipMessage[][] models) {
		NoticeShipMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NoticeShipMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NoticeShipMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NoticeShipMessageSoap[] toSoapModels(
		List<NoticeShipMessage> models) {
		List<NoticeShipMessageSoap> soapModels = new ArrayList<NoticeShipMessageSoap>(models.size());

		for (NoticeShipMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NoticeShipMessageSoap[soapModels.size()]);
	}

	public NoticeShipMessageSoap() {
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

	public String getNoticeShipCode() {
		return _noticeShipCode;
	}

	public void setNoticeShipCode(String noticeShipCode) {
		_noticeShipCode = noticeShipCode;
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

	public int getConfirmTime() {
		return _confirmTime;
	}

	public void setConfirmTime(int confirmTime) {
		_confirmTime = confirmTime;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public Date getArrivalDate() {
		return _arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		_arrivalDate = arrivalDate;
	}

	public String getArrivalPortCode() {
		return _arrivalPortCode;
	}

	public void setArrivalPortCode(String arrivalPortCode) {
		_arrivalPortCode = arrivalPortCode;
	}

	public String getPortGoingToCode() {
		return _portGoingToCode;
	}

	public void setPortGoingToCode(String portGoingToCode) {
		_portGoingToCode = portGoingToCode;
	}

	public String getNameAndAddOfShipOwners() {
		return _nameAndAddOfShipOwners;
	}

	public void setNameAndAddOfShipOwners(String nameAndAddOfShipOwners) {
		_nameAndAddOfShipOwners = nameAndAddOfShipOwners;
	}

	public long getClearanceHeight() {
		return _clearanceHeight;
	}

	public void setClearanceHeight(long clearanceHeight) {
		_clearanceHeight = clearanceHeight;
	}

	public long getShownDraft() {
		return _shownDraft;
	}

	public void setShownDraft(long shownDraft) {
		_shownDraft = shownDraft;
	}

	public long getDwt() {
		return _dwt;
	}

	public void setDwt(long dwt) {
		_dwt = dwt;
	}

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
	}

	public int getPurposeCode() {
		return _purposeCode;
	}

	public void setPurposeCode(int purposeCode) {
		_purposeCode = purposeCode;
	}

	public long getCrewNumber() {
		return _crewNumber;
	}

	public void setCrewNumber(long crewNumber) {
		_crewNumber = crewNumber;
	}

	public long getPassengerNumber() {
		return _passengerNumber;
	}

	public void setPassengerNumber(long passengerNumber) {
		_passengerNumber = passengerNumber;
	}

	public String getQuantityAndTypeOfCargo() {
		return _quantityAndTypeOfCargo;
	}

	public void setQuantityAndTypeOfCargo(String quantityAndTypeOfCargo) {
		_quantityAndTypeOfCargo = quantityAndTypeOfCargo;
	}

	public int getOtherPersons() {
		return _otherPersons;
	}

	public void setOtherPersons(int otherPersons) {
		_otherPersons = otherPersons;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private long _id;
	private String _noticeShipCode;
	private long _documentName;
	private String _userCreated;
	private int _confirmTime;
	private String _callSign;
	private Date _arrivalDate;
	private String _arrivalPortCode;
	private String _portGoingToCode;
	private String _nameAndAddOfShipOwners;
	private long _clearanceHeight;
	private long _shownDraft;
	private long _dwt;
	private String _shipAgencyCode;
	private int _purposeCode;
	private long _crewNumber;
	private long _passengerNumber;
	private String _quantityAndTypeOfCargo;
	private int _otherPersons;
	private String _remarks;
}