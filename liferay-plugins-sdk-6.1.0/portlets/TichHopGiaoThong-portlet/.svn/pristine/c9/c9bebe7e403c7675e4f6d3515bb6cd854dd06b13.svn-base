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
public class DmHistoryMaritimeSoap implements Serializable {
	public static DmHistoryMaritimeSoap toSoapModel(DmHistoryMaritime model) {
		DmHistoryMaritimeSoap soapModel = new DmHistoryMaritimeSoap();

		soapModel.setId(model.getId());
		soapModel.setMaritimeCode(model.getMaritimeCode());
		soapModel.setMaritimeReference(model.getMaritimeReference());
		soapModel.setMaritimeOrder(model.getMaritimeOrder());
		soapModel.setMaritimeName(model.getMaritimeName());
		soapModel.setMaritimeNameVN(model.getMaritimeNameVN());
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

	public static DmHistoryMaritimeSoap[] toSoapModels(
		DmHistoryMaritime[] models) {
		DmHistoryMaritimeSoap[] soapModels = new DmHistoryMaritimeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryMaritimeSoap[][] toSoapModels(
		DmHistoryMaritime[][] models) {
		DmHistoryMaritimeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmHistoryMaritimeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmHistoryMaritimeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryMaritimeSoap[] toSoapModels(
		List<DmHistoryMaritime> models) {
		List<DmHistoryMaritimeSoap> soapModels = new ArrayList<DmHistoryMaritimeSoap>(models.size());

		for (DmHistoryMaritime model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmHistoryMaritimeSoap[soapModels.size()]);
	}

	public DmHistoryMaritimeSoap() {
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

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public String getMaritimeReference() {
		return _maritimeReference;
	}

	public void setMaritimeReference(String maritimeReference) {
		_maritimeReference = maritimeReference;
	}

	public int getMaritimeOrder() {
		return _maritimeOrder;
	}

	public void setMaritimeOrder(int maritimeOrder) {
		_maritimeOrder = maritimeOrder;
	}

	public String getMaritimeName() {
		return _maritimeName;
	}

	public void setMaritimeName(String maritimeName) {
		_maritimeName = maritimeName;
	}

	public String getMaritimeNameVN() {
		return _maritimeNameVN;
	}

	public void setMaritimeNameVN(String maritimeNameVN) {
		_maritimeNameVN = maritimeNameVN;
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
	private String _maritimeCode;
	private String _maritimeReference;
	private int _maritimeOrder;
	private String _maritimeName;
	private String _maritimeNameVN;
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