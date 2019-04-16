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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGTBusinessTypeServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGTBusinessTypeServiceSoap
 * @generated
 */
public class DmGTBusinessTypeSoap implements Serializable {
	public static DmGTBusinessTypeSoap toSoapModel(DmGTBusinessType model) {
		DmGTBusinessTypeSoap soapModel = new DmGTBusinessTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setBusinessTypeCode(model.getBusinessTypeCode());
		soapModel.setBusinessTypeName(model.getBusinessTypeName());
		soapModel.setBusinessTypeNameVN(model.getBusinessTypeNameVN());
		soapModel.setBusinessTypeOrder(model.getBusinessTypeOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());
		soapModel.setRemarks(model.getRemarks());

		return soapModel;
	}

	public static DmGTBusinessTypeSoap[] toSoapModels(DmGTBusinessType[] models) {
		DmGTBusinessTypeSoap[] soapModels = new DmGTBusinessTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGTBusinessTypeSoap[][] toSoapModels(
		DmGTBusinessType[][] models) {
		DmGTBusinessTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGTBusinessTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGTBusinessTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGTBusinessTypeSoap[] toSoapModels(
		List<DmGTBusinessType> models) {
		List<DmGTBusinessTypeSoap> soapModels = new ArrayList<DmGTBusinessTypeSoap>(models.size());

		for (DmGTBusinessType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGTBusinessTypeSoap[soapModels.size()]);
	}

	public DmGTBusinessTypeSoap() {
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

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public String getBusinessTypeName() {
		return _businessTypeName;
	}

	public void setBusinessTypeName(String businessTypeName) {
		_businessTypeName = businessTypeName;
	}

	public String getBusinessTypeNameVN() {
		return _businessTypeNameVN;
	}

	public void setBusinessTypeNameVN(String businessTypeNameVN) {
		_businessTypeNameVN = businessTypeNameVN;
	}

	public int getBusinessTypeOrder() {
		return _businessTypeOrder;
	}

	public void setBusinessTypeOrder(int businessTypeOrder) {
		_businessTypeOrder = businessTypeOrder;
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

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	private long _id;
	private int _businessTypeCode;
	private String _businessTypeName;
	private String _businessTypeNameVN;
	private int _businessTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _remarks;
}