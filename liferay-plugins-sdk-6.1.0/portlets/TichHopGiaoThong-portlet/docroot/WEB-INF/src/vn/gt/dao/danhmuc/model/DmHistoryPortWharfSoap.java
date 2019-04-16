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
public class DmHistoryPortWharfSoap implements Serializable {
	public static DmHistoryPortWharfSoap toSoapModel(DmHistoryPortWharf model) {
		DmHistoryPortWharfSoap soapModel = new DmHistoryPortWharfSoap();

		soapModel.setId(model.getId());
		soapModel.setPortWharfCode(model.getPortWharfCode());
		soapModel.setPortWharfName(model.getPortWharfName());
		soapModel.setPortWharfNameVN(model.getPortWharfNameVN());
		soapModel.setPortWharfType(model.getPortWharfType());
		soapModel.setPortHarbourCode(model.getPortHarbourCode());
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

	public static DmHistoryPortWharfSoap[] toSoapModels(
		DmHistoryPortWharf[] models) {
		DmHistoryPortWharfSoap[] soapModels = new DmHistoryPortWharfSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryPortWharfSoap[][] toSoapModels(
		DmHistoryPortWharf[][] models) {
		DmHistoryPortWharfSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmHistoryPortWharfSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmHistoryPortWharfSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmHistoryPortWharfSoap[] toSoapModels(
		List<DmHistoryPortWharf> models) {
		List<DmHistoryPortWharfSoap> soapModels = new ArrayList<DmHistoryPortWharfSoap>(models.size());

		for (DmHistoryPortWharf model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmHistoryPortWharfSoap[soapModels.size()]);
	}

	public DmHistoryPortWharfSoap() {
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

	public String getPortWharfCode() {
		return _portWharfCode;
	}

	public void setPortWharfCode(String portWharfCode) {
		_portWharfCode = portWharfCode;
	}

	public String getPortWharfName() {
		return _portWharfName;
	}

	public void setPortWharfName(String portWharfName) {
		_portWharfName = portWharfName;
	}

	public String getPortWharfNameVN() {
		return _portWharfNameVN;
	}

	public void setPortWharfNameVN(String portWharfNameVN) {
		_portWharfNameVN = portWharfNameVN;
	}

	public int getPortWharfType() {
		return _portWharfType;
	}

	public void setPortWharfType(int portWharfType) {
		_portWharfType = portWharfType;
	}

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
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
	private String _portWharfCode;
	private String _portWharfName;
	private String _portWharfNameVN;
	private int _portWharfType;
	private String _portHarbourCode;
	private String _portCode;
	private String _portRegionCode;
	private String _note;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}