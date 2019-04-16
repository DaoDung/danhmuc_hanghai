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
public class DmPassportTypeSoap implements Serializable {
	public static DmPassportTypeSoap toSoapModel(DmPassportType model) {
		DmPassportTypeSoap soapModel = new DmPassportTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setPassportTypeCode(model.getPassportTypeCode());
		soapModel.setPassportType(model.getPassportType());
		soapModel.setPassportTypeName(model.getPassportTypeName());
		soapModel.setPassportTypeNameVN(model.getPassportTypeNameVN());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmPassportTypeSoap[] toSoapModels(DmPassportType[] models) {
		DmPassportTypeSoap[] soapModels = new DmPassportTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmPassportTypeSoap[][] toSoapModels(DmPassportType[][] models) {
		DmPassportTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmPassportTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmPassportTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmPassportTypeSoap[] toSoapModels(List<DmPassportType> models) {
		List<DmPassportTypeSoap> soapModels = new ArrayList<DmPassportTypeSoap>(models.size());

		for (DmPassportType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmPassportTypeSoap[soapModels.size()]);
	}

	public DmPassportTypeSoap() {
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

	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;
	}

	public String getPassportType() {
		return _passportType;
	}

	public void setPassportType(String passportType) {
		_passportType = passportType;
	}

	public String getPassportTypeName() {
		return _passportTypeName;
	}

	public void setPassportTypeName(String passportTypeName) {
		_passportTypeName = passportTypeName;
	}

	public String getPassportTypeNameVN() {
		return _passportTypeNameVN;
	}

	public void setPassportTypeNameVN(String passportTypeNameVN) {
		_passportTypeNameVN = passportTypeNameVN;
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
	private String _passportTypeCode;
	private String _passportType;
	private String _passportTypeName;
	private String _passportTypeNameVN;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}