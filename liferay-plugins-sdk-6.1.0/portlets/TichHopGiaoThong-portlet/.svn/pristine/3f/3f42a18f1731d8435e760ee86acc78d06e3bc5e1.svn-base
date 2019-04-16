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
public class DmHistoryShipTypeSoap implements Serializable {
	public static DmHistoryShipTypeSoap toSoapModel(DmHistoryShipType model) {
		DmHistoryShipTypeSoap soapModel = new DmHistoryShipTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setShipTypeCode(model.getShipTypeCode());
		soapModel.setShipTypeName(model.getShipTypeName());
		soapModel.setShipTypeNameVN(model.getShipTypeNameVN());
		soapModel.setShipTypeOrder(model.getShipTypeOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmHistoryShipTypeSoap[] toSoapModels(
		DmHistoryShipType[] models) {
		DmHistoryShipTypeSoap[] soapModels = new DmHistoryShipTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryShipTypeSoap[][] toSoapModels(
		DmHistoryShipType[][] models) {
		DmHistoryShipTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmHistoryShipTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmHistoryShipTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryShipTypeSoap[] toSoapModels(
		List<DmHistoryShipType> models) {
		List<DmHistoryShipTypeSoap> soapModels = new ArrayList<DmHistoryShipTypeSoap>(models.size());

		for (DmHistoryShipType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmHistoryShipTypeSoap[soapModels.size()]);
	}

	public DmHistoryShipTypeSoap() {
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

	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;
	}

	public String getShipTypeName() {
		return _shipTypeName;
	}

	public void setShipTypeName(String shipTypeName) {
		_shipTypeName = shipTypeName;
	}

	public String getShipTypeNameVN() {
		return _shipTypeNameVN;
	}

	public void setShipTypeNameVN(String shipTypeNameVN) {
		_shipTypeNameVN = shipTypeNameVN;
	}

	public int getShipTypeOrder() {
		return _shipTypeOrder;
	}

	public void setShipTypeOrder(int shipTypeOrder) {
		_shipTypeOrder = shipTypeOrder;
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
	private String _shipTypeCode;
	private String _shipTypeName;
	private String _shipTypeNameVN;
	private int _shipTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}