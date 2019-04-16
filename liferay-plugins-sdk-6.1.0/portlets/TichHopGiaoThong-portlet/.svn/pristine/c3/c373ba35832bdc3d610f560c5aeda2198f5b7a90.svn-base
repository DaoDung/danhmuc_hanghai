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
public class HistorySyncVersionSoap implements Serializable {
	public static HistorySyncVersionSoap toSoapModel(HistorySyncVersion model) {
		HistorySyncVersionSoap soapModel = new HistorySyncVersionSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setTimeofPublish(model.getTimeofPublish());
		soapModel.setCategoryID(model.getCategoryID());
		soapModel.setSyncUnit(model.getSyncUnit());
		soapModel.setSyncUser(model.getSyncUser());
		soapModel.setSyncVersion(model.getSyncVersion());
		soapModel.setLatestValueDate(model.getLatestValueDate());

		return soapModel;
	}

	public static HistorySyncVersionSoap[] toSoapModels(
		HistorySyncVersion[] models) {
		HistorySyncVersionSoap[] soapModels = new HistorySyncVersionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HistorySyncVersionSoap[][] toSoapModels(
		HistorySyncVersion[][] models) {
		HistorySyncVersionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HistorySyncVersionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HistorySyncVersionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HistorySyncVersionSoap[] toSoapModels(
		List<HistorySyncVersion> models) {
		List<HistorySyncVersionSoap> soapModels = new ArrayList<HistorySyncVersionSoap>(models.size());

		for (HistorySyncVersion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HistorySyncVersionSoap[soapModels.size()]);
	}

	public HistorySyncVersionSoap() {
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

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public Date getTimeofPublish() {
		return _timeofPublish;
	}

	public void setTimeofPublish(Date timeofPublish) {
		_timeofPublish = timeofPublish;
	}

	public String getCategoryID() {
		return _categoryID;
	}

	public void setCategoryID(String categoryID) {
		_categoryID = categoryID;
	}

	public String getSyncUnit() {
		return _syncUnit;
	}

	public void setSyncUnit(String syncUnit) {
		_syncUnit = syncUnit;
	}

	public String getSyncUser() {
		return _syncUser;
	}

	public void setSyncUser(String syncUser) {
		_syncUser = syncUser;
	}

	public String getSyncVersion() {
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	public Date getLatestValueDate() {
		return _latestValueDate;
	}

	public void setLatestValueDate(Date latestValueDate) {
		_latestValueDate = latestValueDate;
	}

	private long _id;
	private Date _requestedDate;
	private Date _timeofPublish;
	private String _categoryID;
	private String _syncUnit;
	private String _syncUser;
	private String _syncVersion;
	private Date _latestValueDate;
}