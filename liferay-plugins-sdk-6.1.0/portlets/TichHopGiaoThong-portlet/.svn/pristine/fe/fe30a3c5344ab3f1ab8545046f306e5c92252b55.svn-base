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
public class DmSecurityLevelSoap implements Serializable {
	public static DmSecurityLevelSoap toSoapModel(DmSecurityLevel model) {
		DmSecurityLevelSoap soapModel = new DmSecurityLevelSoap();

		soapModel.setId(model.getId());
		soapModel.setSecurityLevelCode(model.getSecurityLevelCode());
		soapModel.setSecurityLevel(model.getSecurityLevel());
		soapModel.setSecurityLevelName(model.getSecurityLevelName());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmSecurityLevelSoap[] toSoapModels(DmSecurityLevel[] models) {
		DmSecurityLevelSoap[] soapModels = new DmSecurityLevelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmSecurityLevelSoap[][] toSoapModels(
		DmSecurityLevel[][] models) {
		DmSecurityLevelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmSecurityLevelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmSecurityLevelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmSecurityLevelSoap[] toSoapModels(
		List<DmSecurityLevel> models) {
		List<DmSecurityLevelSoap> soapModels = new ArrayList<DmSecurityLevelSoap>(models.size());

		for (DmSecurityLevel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmSecurityLevelSoap[soapModels.size()]);
	}

	public DmSecurityLevelSoap() {
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

	public String getSecurityLevelCode() {
		return _securityLevelCode;
	}

	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;
	}

	public String getSecurityLevel() {
		return _securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		_securityLevel = securityLevel;
	}

	public String getSecurityLevelName() {
		return _securityLevelName;
	}

	public void setSecurityLevelName(String securityLevelName) {
		_securityLevelName = securityLevelName;
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
	private String _securityLevelCode;
	private String _securityLevel;
	private String _securityLevelName;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}