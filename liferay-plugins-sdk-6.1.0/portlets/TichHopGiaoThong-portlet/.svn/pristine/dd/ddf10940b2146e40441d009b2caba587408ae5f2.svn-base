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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGtStatusServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGtStatusServiceSoap
 * @generated
 */
public class DmGtStatusSoap implements Serializable {
	public static DmGtStatusSoap toSoapModel(DmGtStatus model) {
		DmGtStatusSoap soapModel = new DmGtStatusSoap();

		soapModel.setId(model.getId());
		soapModel.setStatusCode(model.getStatusCode());
		soapModel.setStatusName(model.getStatusName());
		soapModel.setType(model.getType());
		soapModel.setDescription(model.getDescription());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGtStatusSoap[] toSoapModels(DmGtStatus[] models) {
		DmGtStatusSoap[] soapModels = new DmGtStatusSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGtStatusSoap[][] toSoapModels(DmGtStatus[][] models) {
		DmGtStatusSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGtStatusSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGtStatusSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGtStatusSoap[] toSoapModels(List<DmGtStatus> models) {
		List<DmGtStatusSoap> soapModels = new ArrayList<DmGtStatusSoap>(models.size());

		for (DmGtStatus model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGtStatusSoap[soapModels.size()]);
	}

	public DmGtStatusSoap() {
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

	public int getStatusCode() {
		return _statusCode;
	}

	public void setStatusCode(int statusCode) {
		_statusCode = statusCode;
	}

	public String getStatusName() {
		return _statusName;
	}

	public void setStatusName(String statusName) {
		_statusName = statusName;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
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
	private int _statusCode;
	private String _statusName;
	private int _type;
	private String _description;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}