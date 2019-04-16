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
public class DmHistoryShipAgencySoap implements Serializable {
	public static DmHistoryShipAgencySoap toSoapModel(DmHistoryShipAgency model) {
		DmHistoryShipAgencySoap soapModel = new DmHistoryShipAgencySoap();

		soapModel.setId(model.getId());
		soapModel.setShipAgencyCode(model.getShipAgencyCode());
		soapModel.setShipAgencyName(model.getShipAgencyName());
		soapModel.setShipAgencyNameVN(model.getShipAgencyNameVN());
		soapModel.setTaxCode(model.getTaxCode());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setCitycode(model.getCitycode());
		soapModel.setAddress(model.getAddress());
		soapModel.setAddressVN(model.getAddressVN());
		soapModel.setPhone(model.getPhone());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setDescription(model.getDescription());
		soapModel.setContacter(model.getContacter());
		soapModel.setPosition(model.getPosition());
		soapModel.setContactTell(model.getContactTell());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmHistoryShipAgencySoap[] toSoapModels(
		DmHistoryShipAgency[] models) {
		DmHistoryShipAgencySoap[] soapModels = new DmHistoryShipAgencySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryShipAgencySoap[][] toSoapModels(
		DmHistoryShipAgency[][] models) {
		DmHistoryShipAgencySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmHistoryShipAgencySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmHistoryShipAgencySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryShipAgencySoap[] toSoapModels(
		List<DmHistoryShipAgency> models) {
		List<DmHistoryShipAgencySoap> soapModels = new ArrayList<DmHistoryShipAgencySoap>(models.size());

		for (DmHistoryShipAgency model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmHistoryShipAgencySoap[soapModels.size()]);
	}

	public DmHistoryShipAgencySoap() {
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

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
	}

	public String getShipAgencyName() {
		return _shipAgencyName;
	}

	public void setShipAgencyName(String shipAgencyName) {
		_shipAgencyName = shipAgencyName;
	}

	public String getShipAgencyNameVN() {
		return _shipAgencyNameVN;
	}

	public void setShipAgencyNameVN(String shipAgencyNameVN) {
		_shipAgencyNameVN = shipAgencyNameVN;
	}

	public String getTaxCode() {
		return _taxCode;
	}

	public void setTaxCode(String taxCode) {
		_taxCode = taxCode;
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

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getContacter() {
		return _contacter;
	}

	public void setContacter(String contacter) {
		_contacter = contacter;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getContactTell() {
		return _contactTell;
	}

	public void setContactTell(String contactTell) {
		_contactTell = contactTell;
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
	private String _shipAgencyCode;
	private String _shipAgencyName;
	private String _shipAgencyNameVN;
	private String _taxCode;
	private String _stateCode;
	private String _citycode;
	private String _address;
	private String _addressVN;
	private String _phone;
	private String _fax;
	private String _email;
	private String _description;
	private String _contacter;
	private String _position;
	private String _contactTell;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}