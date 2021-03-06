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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGtOrganizationServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGtOrganizationServiceSoap
 * @generated
 */
public class DmGtOrganizationSoap implements Serializable {
	public static DmGtOrganizationSoap toSoapModel(DmGtOrganization model) {
		DmGtOrganizationSoap soapModel = new DmGtOrganizationSoap();

		soapModel.setId(model.getId());
		soapModel.setOrganizationCode(model.getOrganizationCode());
		soapModel.setOrganizationName(model.getOrganizationName());
		soapModel.setOrganizationNameVN(model.getOrganizationNameVN());
		soapModel.setOrganizationorder(model.getOrganizationorder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGtOrganizationSoap[] toSoapModels(DmGtOrganization[] models) {
		DmGtOrganizationSoap[] soapModels = new DmGtOrganizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGtOrganizationSoap[][] toSoapModels(
		DmGtOrganization[][] models) {
		DmGtOrganizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGtOrganizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGtOrganizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGtOrganizationSoap[] toSoapModels(
		List<DmGtOrganization> models) {
		List<DmGtOrganizationSoap> soapModels = new ArrayList<DmGtOrganizationSoap>(models.size());

		for (DmGtOrganization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGtOrganizationSoap[soapModels.size()]);
	}

	public DmGtOrganizationSoap() {
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

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
	}

	public String getOrganizationName() {
		return _organizationName;
	}

	public void setOrganizationName(String organizationName) {
		_organizationName = organizationName;
	}

	public String getOrganizationNameVN() {
		return _organizationNameVN;
	}

	public void setOrganizationNameVN(String organizationNameVN) {
		_organizationNameVN = organizationNameVN;
	}

	public int getOrganizationorder() {
		return _organizationorder;
	}

	public void setOrganizationorder(int organizationorder) {
		_organizationorder = organizationorder;
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

	private long _id;
	private String _organizationCode;
	private String _organizationName;
	private String _organizationNameVN;
	private int _organizationorder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}