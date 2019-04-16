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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempPassengerDetailsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempPassengerDetailsServiceSoap
 * @generated
 */
public class TempPassengerDetailsSoap implements Serializable {
	public static TempPassengerDetailsSoap toSoapModel(
		TempPassengerDetails model) {
		TempPassengerDetailsSoap soapModel = new TempPassengerDetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setPassengerCode(model.getPassengerCode());
		soapModel.setFamilyName(model.getFamilyName());
		soapModel.setGivenName(model.getGivenName());
		soapModel.setNationality(model.getNationality());
		soapModel.setBirthDay(model.getBirthDay());
		soapModel.setBirthPlace(model.getBirthPlace());
		soapModel.setTypeOfIdentity(model.getTypeOfIdentity());
		soapModel.setPassportExpiredDate(model.getPassportExpiredDate());
		soapModel.setSerialNumberOfIdentity(model.getSerialNumberOfIdentity());
		soapModel.setPortOfEmbarkation(model.getPortOfEmbarkation());
		soapModel.setPortOfDisembarkation(model.getPortOfDisembarkation());
		soapModel.setIsTransit(model.getIsTransit());

		return soapModel;
	}

	public static TempPassengerDetailsSoap[] toSoapModels(
		TempPassengerDetails[] models) {
		TempPassengerDetailsSoap[] soapModels = new TempPassengerDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempPassengerDetailsSoap[][] toSoapModels(
		TempPassengerDetails[][] models) {
		TempPassengerDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempPassengerDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempPassengerDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempPassengerDetailsSoap[] toSoapModels(
		List<TempPassengerDetails> models) {
		List<TempPassengerDetailsSoap> soapModels = new ArrayList<TempPassengerDetailsSoap>(models.size());

		for (TempPassengerDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempPassengerDetailsSoap[soapModels.size()]);
	}

	public TempPassengerDetailsSoap() {
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

	public String getPassengerCode() {
		return _passengerCode;
	}

	public void setPassengerCode(String passengerCode) {
		_passengerCode = passengerCode;
	}

	public String getFamilyName() {
		return _familyName;
	}

	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	public String getGivenName() {
		return _givenName;
	}

	public void setGivenName(String givenName) {
		_givenName = givenName;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public Date getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	public String getBirthPlace() {
		return _birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		_birthPlace = birthPlace;
	}

	public String getTypeOfIdentity() {
		return _typeOfIdentity;
	}

	public void setTypeOfIdentity(String typeOfIdentity) {
		_typeOfIdentity = typeOfIdentity;
	}

	public Date getPassportExpiredDate() {
		return _passportExpiredDate;
	}

	public void setPassportExpiredDate(Date passportExpiredDate) {
		_passportExpiredDate = passportExpiredDate;
	}

	public String getSerialNumberOfIdentity() {
		return _serialNumberOfIdentity;
	}

	public void setSerialNumberOfIdentity(String serialNumberOfIdentity) {
		_serialNumberOfIdentity = serialNumberOfIdentity;
	}

	public String getPortOfEmbarkation() {
		return _portOfEmbarkation;
	}

	public void setPortOfEmbarkation(String portOfEmbarkation) {
		_portOfEmbarkation = portOfEmbarkation;
	}

	public String getPortOfDisembarkation() {
		return _portOfDisembarkation;
	}

	public void setPortOfDisembarkation(String portOfDisembarkation) {
		_portOfDisembarkation = portOfDisembarkation;
	}

	public int getIsTransit() {
		return _isTransit;
	}

	public void setIsTransit(int isTransit) {
		_isTransit = isTransit;
	}

	private long _id;
	private String _requestCode;
	private String _passengerCode;
	private String _familyName;
	private String _givenName;
	private String _nationality;
	private Date _birthDay;
	private String _birthPlace;
	private String _typeOfIdentity;
	private Date _passportExpiredDate;
	private String _serialNumberOfIdentity;
	private String _portOfEmbarkation;
	private String _portOfDisembarkation;
	private int _isTransit;
}