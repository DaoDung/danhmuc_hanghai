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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.nhapcanh.service.http.PassengerListServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.nhapcanh.service.http.PassengerListServiceSoap
 * @generated
 */
public class PassengerListSoap implements Serializable {
	public static PassengerListSoap toSoapModel(PassengerList model) {
		PassengerListSoap soapModel = new PassengerListSoap();

		soapModel.setId(model.getId());
		soapModel.setPassengerCode(model.getPassengerCode());
		soapModel.setDocumentNo(model.getDocumentNo());
		soapModel.setFullName(model.getFullName());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setBirthDay(model.getBirthDay());
		soapModel.setBirthPlace(model.getBirthPlace());
		soapModel.setPassportTypeCode(model.getPassportTypeCode());
		soapModel.setPassPortNo(model.getPassPortNo());
		soapModel.setPortCheckInCode(model.getPortCheckInCode());
		soapModel.setPortCheckOutCode(model.getPortCheckOutCode());
		soapModel.setIsTransit(model.getIsTransit());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static PassengerListSoap[] toSoapModels(PassengerList[] models) {
		PassengerListSoap[] soapModels = new PassengerListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PassengerListSoap[][] toSoapModels(PassengerList[][] models) {
		PassengerListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PassengerListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PassengerListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PassengerListSoap[] toSoapModels(List<PassengerList> models) {
		List<PassengerListSoap> soapModels = new ArrayList<PassengerListSoap>(models.size());

		for (PassengerList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PassengerListSoap[soapModels.size()]);
	}

	public PassengerListSoap() {
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

	public String getPassengerCode() {
		return _passengerCode;
	}

	public void setPassengerCode(String passengerCode) {
		_passengerCode = passengerCode;
	}

	public String getDocumentNo() {
		return _documentNo;
	}

	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
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

	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;
	}

	public String getPassPortNo() {
		return _passPortNo;
	}

	public void setPassPortNo(String passPortNo) {
		_passPortNo = passPortNo;
	}

	public String getPortCheckInCode() {
		return _portCheckInCode;
	}

	public void setPortCheckInCode(String portCheckInCode) {
		_portCheckInCode = portCheckInCode;
	}

	public String getPortCheckOutCode() {
		return _portCheckOutCode;
	}

	public void setPortCheckOutCode(String portCheckOutCode) {
		_portCheckOutCode = portCheckOutCode;
	}

	public boolean getIsTransit() {
		return _isTransit;
	}

	public boolean isIsTransit() {
		return _isTransit;
	}

	public void setIsTransit(boolean isTransit) {
		_isTransit = isTransit;
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
	private String _passengerCode;
	private String _documentNo;
	private String _fullName;
	private String _stateCode;
	private Date _birthDay;
	private String _birthPlace;
	private String _passportTypeCode;
	private String _passPortNo;
	private String _portCheckInCode;
	private String _portCheckOutCode;
	private boolean _isTransit;
	private Date _createDate;
	private Date _modifyDate;
}