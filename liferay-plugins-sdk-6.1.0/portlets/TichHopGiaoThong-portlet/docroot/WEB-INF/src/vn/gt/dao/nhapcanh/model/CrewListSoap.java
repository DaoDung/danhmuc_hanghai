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

package vn.gt.dao.nhapcanh.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.nhapcanh.service.http.CrewListServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.nhapcanh.service.http.CrewListServiceSoap
 * @generated
 */
public class CrewListSoap implements Serializable {
	public static CrewListSoap toSoapModel(CrewList model) {
		CrewListSoap soapModel = new CrewListSoap();

		soapModel.setId(model.getId());
		soapModel.setCrewCode(model.getCrewCode());
		soapModel.setDocumentNo(model.getDocumentNo());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setBirthDay(model.getBirthDay());
		soapModel.setBirthPlace(model.getBirthPlace());
		soapModel.setFamilyName(model.getFamilyName());
		soapModel.setFullName(model.getFullName());
		soapModel.setGivenName(model.getGivenName());
		soapModel.setPassportNumber(model.getPassportNumber());
		soapModel.setPassportType(model.getPassportType());
		soapModel.setRankCode(model.getRankCode());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static CrewListSoap[] toSoapModels(CrewList[] models) {
		CrewListSoap[] soapModels = new CrewListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CrewListSoap[][] toSoapModels(CrewList[][] models) {
		CrewListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CrewListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CrewListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CrewListSoap[] toSoapModels(List<CrewList> models) {
		List<CrewListSoap> soapModels = new ArrayList<CrewListSoap>(models.size());

		for (CrewList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CrewListSoap[soapModels.size()]);
	}

	public CrewListSoap() {
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

	public String getCrewCode() {
		return _crewCode;
	}

	public void setCrewCode(String crewCode) {
		_crewCode = crewCode;
	}

	public String getDocumentNo() {
		return _documentNo;
	}

	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
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

	public String getFamilyName() {
		return _familyName;
	}

	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getGivenName() {
		return _givenName;
	}

	public void setGivenName(String givenName) {
		_givenName = givenName;
	}

	public String getPassportNumber() {
		return _passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		_passportNumber = passportNumber;
	}

	public String getPassportType() {
		return _passportType;
	}

	public void setPassportType(String passportType) {
		_passportType = passportType;
	}

	public String getRankCode() {
		return _rankCode;
	}

	public void setRankCode(String rankCode) {
		_rankCode = rankCode;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	private long _id;
	private String _crewCode;
	private String _documentNo;
	private String _stateCode;
	private Date _birthDay;
	private String _birthPlace;
	private String _familyName;
	private String _fullName;
	private String _givenName;
	private String _passportNumber;
	private String _passportType;
	private String _rankCode;
	private Date _createDate;
	private Date _modifyDate;
}