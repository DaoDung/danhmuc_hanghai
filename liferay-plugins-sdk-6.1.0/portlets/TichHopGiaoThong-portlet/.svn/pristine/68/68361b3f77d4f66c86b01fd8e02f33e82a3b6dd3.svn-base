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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGTShipPositionServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGTShipPositionServiceSoap
 * @generated
 */
public class DmGTShipPositionSoap implements Serializable {
	public static DmGTShipPositionSoap toSoapModel(DmGTShipPosition model) {
		DmGTShipPositionSoap soapModel = new DmGTShipPositionSoap();

		soapModel.setId(model.getId());
		soapModel.setPositionCode(model.getPositionCode());
		soapModel.setPositionName(model.getPositionName());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setPositionOrder(model.getPositionOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGTShipPositionSoap[] toSoapModels(DmGTShipPosition[] models) {
		DmGTShipPositionSoap[] soapModels = new DmGTShipPositionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGTShipPositionSoap[][] toSoapModels(
		DmGTShipPosition[][] models) {
		DmGTShipPositionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGTShipPositionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGTShipPositionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGTShipPositionSoap[] toSoapModels(
		List<DmGTShipPosition> models) {
		List<DmGTShipPositionSoap> soapModels = new ArrayList<DmGTShipPositionSoap>(models.size());

		for (DmGTShipPosition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGTShipPositionSoap[soapModels.size()]);
	}

	public DmGTShipPositionSoap() {
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

	public String getPositionCode() {
		return _positionCode;
	}

	public void setPositionCode(String positionCode) {
		_positionCode = positionCode;
	}

	public String getPositionName() {
		return _positionName;
	}

	public void setPositionName(String positionName) {
		_positionName = positionName;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public int getPositionOrder() {
		return _positionOrder;
	}

	public void setPositionOrder(int positionOrder) {
		_positionOrder = positionOrder;
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
	private String _positionCode;
	private String _positionName;
	private String _remarks;
	private int _positionOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}