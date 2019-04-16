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

package vn.gt.dao.danhmuc.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    win_64
 * @generated
 */
public class DmPortSoap implements Serializable {
	public static DmPortSoap toSoapModel(DmPort model) {
		DmPortSoap soapModel = new DmPortSoap();

		soapModel.setId(model.getId());
		soapModel.setPortCode(model.getPortCode());
		soapModel.setLoCode(model.getLoCode());
		soapModel.setPortName(model.getPortName());
		soapModel.setFullName(model.getFullName());
		soapModel.setFullNameVN(model.getFullNameVN());
		soapModel.setPortType(model.getPortType());
		soapModel.setPortOrder(model.getPortOrder());
		soapModel.setAddress(model.getAddress());
		soapModel.setAddressVN(model.getAddressVN());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setCitycode(model.getCitycode());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmPortSoap[] toSoapModels(DmPort[] models) {
		DmPortSoap[] soapModels = new DmPortSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmPortSoap[][] toSoapModels(DmPort[][] models) {
		DmPortSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmPortSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmPortSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmPortSoap[] toSoapModels(List<DmPort> models) {
		List<DmPortSoap> soapModels = new ArrayList<DmPortSoap>(models.size());

		for (DmPort model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmPortSoap[soapModels.size()]);
	}

	public DmPortSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getLoCode() {
		return _loCode;
	}

	public void setLoCode(String loCode) {
		_loCode = loCode;
	}

	public String getPortName() {
		return _portName;
	}

	public void setPortName(String portName) {
		_portName = portName;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getFullNameVN() {
		return _fullNameVN;
	}

	public void setFullNameVN(String fullNameVN) {
		_fullNameVN = fullNameVN;
	}

	public String getPortType() {
		return _portType;
	}

	public void setPortType(String portType) {
		_portType = portType;
	}

	public int getPortOrder() {
		return _portOrder;
	}

	public void setPortOrder(int portOrder) {
		_portOrder = portOrder;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddressVN() {
		return _addressVN;
	}

	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getCitycode() {
		return _citycode;
	}

	public void setCitycode(String citycode) {
		_citycode = citycode;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getSyncVersion() {
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	private int _id;
	private String _portCode;
	private String _loCode;
	private String _portName;
	private String _fullName;
	private String _fullNameVN;
	private String _portType;
	private int _portOrder;
	private String _address;
	private String _addressVN;
	private String _stateCode;
	private String _citycode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}