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
public class DmPortHarbourSoap implements Serializable {
	public static DmPortHarbourSoap toSoapModel(DmPortHarbour model) {
		DmPortHarbourSoap soapModel = new DmPortHarbourSoap();

		soapModel.setId(model.getId());
		soapModel.setPortHarbourCode(model.getPortHarbourCode());
		soapModel.setPortHarbourName(model.getPortHarbourName());
		soapModel.setPortHarbourNameVN(model.getPortHarbourNameVN());
		soapModel.setPortHarbourType(model.getPortHarbourType());
		soapModel.setPortRegion(model.getPortRegion());
		soapModel.setPortCode(model.getPortCode());
		soapModel.setPortRegionCode(model.getPortRegionCode());
		soapModel.setNote(model.getNote());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmPortHarbourSoap[] toSoapModels(DmPortHarbour[] models) {
		DmPortHarbourSoap[] soapModels = new DmPortHarbourSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmPortHarbourSoap[][] toSoapModels(DmPortHarbour[][] models) {
		DmPortHarbourSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmPortHarbourSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmPortHarbourSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmPortHarbourSoap[] toSoapModels(List<DmPortHarbour> models) {
		List<DmPortHarbourSoap> soapModels = new ArrayList<DmPortHarbourSoap>(models.size());

		for (DmPortHarbour model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmPortHarbourSoap[soapModels.size()]);
	}

	public DmPortHarbourSoap() {
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

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
	}

	public String getPortHarbourName() {
		return _portHarbourName;
	}

	public void setPortHarbourName(String portHarbourName) {
		_portHarbourName = portHarbourName;
	}

	public String getPortHarbourNameVN() {
		return _portHarbourNameVN;
	}

	public void setPortHarbourNameVN(String portHarbourNameVN) {
		_portHarbourNameVN = portHarbourNameVN;
	}

	public int getPortHarbourType() {
		return _portHarbourType;
	}

	public void setPortHarbourType(int portHarbourType) {
		_portHarbourType = portHarbourType;
	}

	public String getPortRegion() {
		return _portRegion;
	}

	public void setPortRegion(String portRegion) {
		_portRegion = portRegion;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getPortRegionCode() {
		return _portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
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
	private String _portHarbourCode;
	private String _portHarbourName;
	private String _portHarbourNameVN;
	private int _portHarbourType;
	private String _portRegion;
	private String _portCode;
	private String _portRegionCode;
	private String _note;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}