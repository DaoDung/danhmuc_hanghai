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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempCrewDetailsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempCrewDetailsServiceSoap
 * @generated
 */
public class TempCrewDetailsSoap implements Serializable {
	public static TempCrewDetailsSoap toSoapModel(TempCrewDetails model) {
		TempCrewDetailsSoap soapModel = new TempCrewDetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setCrewcode(model.getCrewcode());
		soapModel.setFamilyName(model.getFamilyName());
		soapModel.setGivenName(model.getGivenName());
		soapModel.setRankCode(model.getRankCode());
		soapModel.setNationality(model.getNationality());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setPlaceOfBirth(model.getPlaceOfBirth());
		soapModel.setPassportNumber(model.getPassportNumber());
		soapModel.setPassportTypeCode(model.getPassportTypeCode());

		return soapModel;
	}

	public static TempCrewDetailsSoap[] toSoapModels(TempCrewDetails[] models) {
		TempCrewDetailsSoap[] soapModels = new TempCrewDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempCrewDetailsSoap[][] toSoapModels(
		TempCrewDetails[][] models) {
		TempCrewDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempCrewDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempCrewDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempCrewDetailsSoap[] toSoapModels(
		List<TempCrewDetails> models) {
		List<TempCrewDetailsSoap> soapModels = new ArrayList<TempCrewDetailsSoap>(models.size());

		for (TempCrewDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempCrewDetailsSoap[soapModels.size()]);
	}

	public TempCrewDetailsSoap() {
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

	public String getCrewcode() {
		return _crewcode;
	}

	public void setCrewcode(String crewcode) {
		_crewcode = crewcode;
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

	public String getRankCode() {
		return _rankCode;
	}

	public void setRankCode(String rankCode) {
		_rankCode = rankCode;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return _placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;
	}

	public String getPassportNumber() {
		return _passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		_passportNumber = passportNumber;
	}

	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;
	}

	private long _id;
	private String _requestCode;
	private String _crewcode;
	private String _familyName;
	private String _givenName;
	private String _rankCode;
	private String _nationality;
	private Date _dateOfBirth;
	private String _placeOfBirth;
	private String _passportNumber;
	private String _passportTypeCode;
}