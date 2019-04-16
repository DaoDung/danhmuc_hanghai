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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempPassengerListServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempPassengerListServiceSoap
 * @generated
 */
public class TempPassengerListSoap implements Serializable {
	public static TempPassengerListSoap toSoapModel(TempPassengerList model) {
		TempPassengerListSoap soapModel = new TempPassengerListSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setIsArrival(model.getIsArrival());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setPortOfArrivalCode(model.getPortOfArrivalCode());
		soapModel.setDateOfArrival(model.getDateOfArrival());
		soapModel.setImoNumber(model.getImoNumber());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setVoyageNumber(model.getVoyageNumber());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setListPassengers(model.getListPassengers());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setNumberOfLeftPassengers(model.getNumberOfLeftPassengers());
		soapModel.setNumberOfVNmeses(model.getNumberOfVNmeses());
		soapModel.setNumberOfForeigners(model.getNumberOfForeigners());
		soapModel.setTotalPassengers(model.getTotalPassengers());

		return soapModel;
	}

	public static TempPassengerListSoap[] toSoapModels(
		TempPassengerList[] models) {
		TempPassengerListSoap[] soapModels = new TempPassengerListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempPassengerListSoap[][] toSoapModels(
		TempPassengerList[][] models) {
		TempPassengerListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempPassengerListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempPassengerListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempPassengerListSoap[] toSoapModels(
		List<TempPassengerList> models) {
		List<TempPassengerListSoap> soapModels = new ArrayList<TempPassengerListSoap>(models.size());

		for (TempPassengerList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempPassengerListSoap[soapModels.size()]);
	}

	public TempPassengerListSoap() {
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

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public int getIsArrival() {
		return _isArrival;
	}

	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
	}

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;
	}

	public String getImoNumber() {
		return _imoNumber;
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public int getListPassengers() {
		return _listPassengers;
	}

	public void setListPassengers(int listPassengers) {
		_listPassengers = listPassengers;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public int getMasterSigned() {
		return _masterSigned;
	}

	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;
	}

	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public int getNumberOfLeftPassengers() {
		return _NumberOfLeftPassengers;
	}

	public void setNumberOfLeftPassengers(int NumberOfLeftPassengers) {
		_NumberOfLeftPassengers = NumberOfLeftPassengers;
	}

	public int getNumberOfVNmeses() {
		return _NumberOfVNmeses;
	}

	public void setNumberOfVNmeses(int NumberOfVNmeses) {
		_NumberOfVNmeses = NumberOfVNmeses;
	}

	public int getNumberOfForeigners() {
		return _NumberOfForeigners;
	}

	public void setNumberOfForeigners(int NumberOfForeigners) {
		_NumberOfForeigners = NumberOfForeigners;
	}

	public int getTotalPassengers() {
		return _TotalPassengers;
	}

	public void setTotalPassengers(int TotalPassengers) {
		_TotalPassengers = TotalPassengers;
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private String _userCreated;
	private int _isArrival;
	private String _nameOfShip;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _imoNumber;
	private String _callSign;
	private String _voyageNumber;
	private String _flagStateOfShip;
	private int _listPassengers;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private int _documentYear;
	private int _NumberOfLeftPassengers;
	private int _NumberOfVNmeses;
	private int _NumberOfForeigners;
	private int _TotalPassengers;
}