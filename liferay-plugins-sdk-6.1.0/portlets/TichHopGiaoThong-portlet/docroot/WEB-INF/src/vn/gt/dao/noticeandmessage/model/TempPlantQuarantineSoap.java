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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempPlantQuarantineServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempPlantQuarantineServiceSoap
 * @generated
 */
public class TempPlantQuarantineSoap implements Serializable {
	public static TempPlantQuarantineSoap toSoapModel(TempPlantQuarantine model) {
		TempPlantQuarantineSoap soapModel = new TempPlantQuarantineSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setNameOfMaster(model.getNameOfMaster());
		soapModel.setDoctorName(model.getDoctorName());
		soapModel.setNumberOfCrew(model.getNumberOfCrew());
		soapModel.setNumberOfPassengers(model.getNumberOfPassengers());
		soapModel.setLastPortOfCallCode(model.getLastPortOfCallCode());
		soapModel.setNextPortOfCallCode(model.getNextPortOfCallCode());
		soapModel.setFirstPortOfLoadingCode(model.getFirstPortOfLoadingCode());
		soapModel.setDateOfdeparture(model.getDateOfdeparture());
		soapModel.setPlantNameFirst(model.getPlantNameFirst());
		soapModel.setPlantNameBetween(model.getPlantNameBetween());
		soapModel.setPlantNameThis(model.getPlantNameThis());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setAttachedFile(model.getAttachedFile());

		return soapModel;
	}

	public static TempPlantQuarantineSoap[] toSoapModels(
		TempPlantQuarantine[] models) {
		TempPlantQuarantineSoap[] soapModels = new TempPlantQuarantineSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempPlantQuarantineSoap[][] toSoapModels(
		TempPlantQuarantine[][] models) {
		TempPlantQuarantineSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempPlantQuarantineSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempPlantQuarantineSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempPlantQuarantineSoap[] toSoapModels(
		List<TempPlantQuarantine> models) {
		List<TempPlantQuarantineSoap> soapModels = new ArrayList<TempPlantQuarantineSoap>(models.size());

		for (TempPlantQuarantine model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempPlantQuarantineSoap[soapModels.size()]);
	}

	public TempPlantQuarantineSoap() {
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

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
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

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public String getDoctorName() {
		return _doctorName;
	}

	public void setDoctorName(String doctorName) {
		_doctorName = doctorName;
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

	public String getFirstPortOfLoadingCode() {
		return _firstPortOfLoadingCode;
	}

	public void setFirstPortOfLoadingCode(String firstPortOfLoadingCode) {
		_firstPortOfLoadingCode = firstPortOfLoadingCode;
	}

	public Date getDateOfdeparture() {
		return _dateOfdeparture;
	}

	public void setDateOfdeparture(Date dateOfdeparture) {
		_dateOfdeparture = dateOfdeparture;
	}

	public String getPlantNameFirst() {
		return _plantNameFirst;
	}

	public void setPlantNameFirst(String plantNameFirst) {
		_plantNameFirst = plantNameFirst;
	}

	public String getPlantNameBetween() {
		return _plantNameBetween;
	}

	public void setPlantNameBetween(String plantNameBetween) {
		_plantNameBetween = plantNameBetween;
	}

	public String getPlantNameThis() {
		return _plantNameThis;
	}

	public void setPlantNameThis(String plantNameThis) {
		_plantNameThis = plantNameThis;
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
	private String _userCreated;
	private int _documentYear;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _nameOfMaster;
	private String _doctorName;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _lastPortOfCallCode;
	private String _nextPortOfCallCode;
	private String _firstPortOfLoadingCode;
	private Date _dateOfdeparture;
	private String _plantNameFirst;
	private String _plantNameBetween;
	private String _plantNameThis;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
}