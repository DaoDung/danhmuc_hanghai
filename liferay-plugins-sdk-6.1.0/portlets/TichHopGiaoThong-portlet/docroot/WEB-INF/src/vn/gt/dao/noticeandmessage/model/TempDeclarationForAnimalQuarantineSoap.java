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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempDeclarationForAnimalQuarantineServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempDeclarationForAnimalQuarantineServiceSoap
 * @generated
 */
public class TempDeclarationForAnimalQuarantineSoap implements Serializable {
	public static TempDeclarationForAnimalQuarantineSoap toSoapModel(
		TempDeclarationForAnimalQuarantine model) {
		TempDeclarationForAnimalQuarantineSoap soapModel = new TempDeclarationForAnimalQuarantineSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setNumberOfCrew(model.getNumberOfCrew());
		soapModel.setNumberOfPassengers(model.getNumberOfPassengers());
		soapModel.setLastPortOfCallCode(model.getLastPortOfCallCode());
		soapModel.setNextPortOfCallCode(model.getNextPortOfCallCode());
		soapModel.setAnimalNameFirst(model.getAnimalNameFirst());
		soapModel.setAnimalNameBetween(model.getAnimalNameBetween());
		soapModel.setAnimalNameThis(model.getAnimalNameThis());
		soapModel.setNameOfMaster(model.getNameOfMaster());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setAttachedFile(model.getAttachedFile());

		return soapModel;
	}

	public static TempDeclarationForAnimalQuarantineSoap[] toSoapModels(
		TempDeclarationForAnimalQuarantine[] models) {
		TempDeclarationForAnimalQuarantineSoap[] soapModels = new TempDeclarationForAnimalQuarantineSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempDeclarationForAnimalQuarantineSoap[][] toSoapModels(
		TempDeclarationForAnimalQuarantine[][] models) {
		TempDeclarationForAnimalQuarantineSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempDeclarationForAnimalQuarantineSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempDeclarationForAnimalQuarantineSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempDeclarationForAnimalQuarantineSoap[] toSoapModels(
		List<TempDeclarationForAnimalQuarantine> models) {
		List<TempDeclarationForAnimalQuarantineSoap> soapModels = new ArrayList<TempDeclarationForAnimalQuarantineSoap>(models.size());

		for (TempDeclarationForAnimalQuarantine model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempDeclarationForAnimalQuarantineSoap[soapModels.size()]);
	}

	public TempDeclarationForAnimalQuarantineSoap() {
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

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;
	}

	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;
	}

	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
	}

	public String getNextPortOfCallCode() {
		return _nextPortOfCallCode;
	}

	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;
	}

	public String getAnimalNameFirst() {
		return _animalNameFirst;
	}

	public void setAnimalNameFirst(String animalNameFirst) {
		_animalNameFirst = animalNameFirst;
	}

	public String getAnimalNameBetween() {
		return _animalNameBetween;
	}

	public void setAnimalNameBetween(String animalNameBetween) {
		_animalNameBetween = animalNameBetween;
	}

	public String getAnimalNameThis() {
		return _animalNameThis;
	}

	public void setAnimalNameThis(String animalNameThis) {
		_animalNameThis = animalNameThis;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
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
	private String _nameOfShip;
	private String _flagStateOfShip;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _lastPortOfCallCode;
	private String _nextPortOfCallCode;
	private String _animalNameFirst;
	private String _animalNameBetween;
	private String _animalNameThis;
	private String _nameOfMaster;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
}