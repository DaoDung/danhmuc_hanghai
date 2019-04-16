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

package vn.gt.dao.danhmucgt.model;

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
public class DmGtVersionSoap implements Serializable {
	public static DmGtVersionSoap toSoapModel(DmGtVersion model) {
		DmGtVersionSoap soapModel = new DmGtVersionSoap();

		soapModel.setId(model.getId());
		soapModel.setVersionName(model.getVersionName());
		soapModel.setVersionDate(model.getVersionDate());
		soapModel.setVersionDeployer(model.getVersionDeployer());
		soapModel.setContents(model.getContents());
		soapModel.setDescription(model.getDescription());
		soapModel.setDbFileName(model.getDbFileName());
		soapModel.setDbFileSize(model.getDbFileSize());
		soapModel.setDbDescription(model.getDbDescription());
		soapModel.setAppFileName(model.getAppFileName());
		soapModel.setAppFileSize(model.getAppFileSize());
		soapModel.setAppDescription(model.getAppDescription());
		soapModel.setSpecFileName(model.getSpecFileName());
		soapModel.setSpecFileSize(model.getSpecFileSize());
		soapModel.setSpecDescription(model.getSpecDescription());
		soapModel.setOrganizationCode(model.getOrganizationCode());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGtVersionSoap[] toSoapModels(DmGtVersion[] models) {
		DmGtVersionSoap[] soapModels = new DmGtVersionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGtVersionSoap[][] toSoapModels(DmGtVersion[][] models) {
		DmGtVersionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGtVersionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGtVersionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGtVersionSoap[] toSoapModels(List<DmGtVersion> models) {
		List<DmGtVersionSoap> soapModels = new ArrayList<DmGtVersionSoap>(models.size());

		for (DmGtVersion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGtVersionSoap[soapModels.size()]);
	}

	public DmGtVersionSoap() {
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

	public String getVersionName() {
		return _versionName;
	}

	public void setVersionName(String versionName) {
		_versionName = versionName;
	}

	public Date getVersionDate() {
		return _versionDate;
	}

	public void setVersionDate(Date versionDate) {
		_versionDate = versionDate;
	}

	public String getVersionDeployer() {
		return _versionDeployer;
	}

	public void setVersionDeployer(String versionDeployer) {
		_versionDeployer = versionDeployer;
	}

	public String getContents() {
		return _contents;
	}

	public void setContents(String contents) {
		_contents = contents;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getDbFileName() {
		return _dbFileName;
	}

	public void setDbFileName(String dbFileName) {
		_dbFileName = dbFileName;
	}

	public String getDbFileSize() {
		return _dbFileSize;
	}

	public void setDbFileSize(String dbFileSize) {
		_dbFileSize = dbFileSize;
	}

	public String getDbDescription() {
		return _dbDescription;
	}

	public void setDbDescription(String dbDescription) {
		_dbDescription = dbDescription;
	}

	public String getAppFileName() {
		return _appFileName;
	}

	public void setAppFileName(String appFileName) {
		_appFileName = appFileName;
	}

	public String getAppFileSize() {
		return _appFileSize;
	}

	public void setAppFileSize(String appFileSize) {
		_appFileSize = appFileSize;
	}

	public String getAppDescription() {
		return _appDescription;
	}

	public void setAppDescription(String appDescription) {
		_appDescription = appDescription;
	}

	public String getSpecFileName() {
		return _specFileName;
	}

	public void setSpecFileName(String specFileName) {
		_specFileName = specFileName;
	}

	public String getSpecFileSize() {
		return _specFileSize;
	}

	public void setSpecFileSize(String specFileSize) {
		_specFileSize = specFileSize;
	}

	public String getSpecDescription() {
		return _specDescription;
	}

	public void setSpecDescription(String specDescription) {
		_specDescription = specDescription;
	}

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
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
	private String _versionName;
	private Date _versionDate;
	private String _versionDeployer;
	private String _contents;
	private String _description;
	private String _dbFileName;
	private String _dbFileSize;
	private String _dbDescription;
	private String _appFileName;
	private String _appFileSize;
	private String _appDescription;
	private String _specFileName;
	private String _specFileSize;
	private String _specDescription;
	private String _organizationCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}