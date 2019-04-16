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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempShipStoresDeclarationServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempShipStoresDeclarationServiceSoap
 * @generated
 */
public class TempShipStoresDeclarationSoap implements Serializable {
	public static TempShipStoresDeclarationSoap toSoapModel(
		TempShipStoresDeclaration model) {
		TempShipStoresDeclarationSoap soapModel = new TempShipStoresDeclarationSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setIsArrival(model.getIsArrival());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setImoNumber(model.getImoNumber());
		soapModel.setCallsign(model.getCallsign());
		soapModel.setVoyageNumber(model.getVoyageNumber());
		soapModel.setNationalityOfShip(model.getNationalityOfShip());
		soapModel.setPortOfArrivalCode(model.getPortOfArrivalCode());
		soapModel.setDateOfArrival(model.getDateOfArrival());
		soapModel.setLastPortOfCallCode(model.getLastPortOfCallCode());
		soapModel.setNumberOfPersonsOnBoat(model.getNumberOfPersonsOnBoat());
		soapModel.setPeriodOfStay(model.getPeriodOfStay());
		soapModel.setPeriodOfStayUnit(model.getPeriodOfStayUnit());
		soapModel.setNameOfMaster(model.getNameOfMaster());
		soapModel.setListShipsStores(model.getListShipsStores());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setAttachedFile(model.getAttachedFile());

		return soapModel;
	}

	public static TempShipStoresDeclarationSoap[] toSoapModels(
		TempShipStoresDeclaration[] models) {
		TempShipStoresDeclarationSoap[] soapModels = new TempShipStoresDeclarationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempShipStoresDeclarationSoap[][] toSoapModels(
		TempShipStoresDeclaration[][] models) {
		TempShipStoresDeclarationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempShipStoresDeclarationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempShipStoresDeclarationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempShipStoresDeclarationSoap[] toSoapModels(
		List<TempShipStoresDeclaration> models) {
		List<TempShipStoresDeclarationSoap> soapModels = new ArrayList<TempShipStoresDeclarationSoap>(models.size());

		for (TempShipStoresDeclaration model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempShipStoresDeclarationSoap[soapModels.size()]);
	}

	public TempShipStoresDeclarationSoap() {
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

	public String getImoNumber() {
		return _imoNumber;
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	public String getCallsign() {
		return _callsign;
	}

	public void setCallsign(String callsign) {
		_callsign = callsign;
	}

	public String getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public String getNationalityOfShip() {
		return _nationalityOfShip;
	}

	public void setNationalityOfShip(String nationalityOfShip) {
		_nationalityOfShip = nationalityOfShip;
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

	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
	}

	public int getNumberOfPersonsOnBoat() {
		return _numberOfPersonsOnBoat;
	}

	public void setNumberOfPersonsOnBoat(int numberOfPersonsOnBoat) {
		_numberOfPersonsOnBoat = numberOfPersonsOnBoat;
	}

	public String getPeriodOfStay() {
		return _periodOfStay;
	}

	public void setPeriodOfStay(String periodOfStay) {
		_periodOfStay = periodOfStay;
	}

	public String getPeriodOfStayUnit() {
		return _periodOfStayUnit;
	}

	public void setPeriodOfStayUnit(String periodOfStayUnit) {
		_periodOfStayUnit = periodOfStayUnit;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public int getListShipsStores() {
		return _listShipsStores;
	}

	public void setListShipsStores(int listShipsStores) {
		_listShipsStores = listShipsStores;
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

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _userCreated;
	private int _isArrival;
	private String _nameOfShip;
	private String _imoNumber;
	private String _callsign;
	private String _voyageNumber;
	private String _nationalityOfShip;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _lastPortOfCallCode;
	private int _numberOfPersonsOnBoat;
	private String _periodOfStay;
	private String _periodOfStayUnit;
	private String _nameOfMaster;
	private int _listShipsStores;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
}