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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGTFunctionTypeServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGTFunctionTypeServiceSoap
 * @generated
 */
public class DmGTFunctionTypeSoap implements Serializable {
	public static DmGTFunctionTypeSoap toSoapModel(DmGTFunctionType model) {
		DmGTFunctionTypeSoap soapModel = new DmGTFunctionTypeSoap();

		soapModel.setId(model.getId());
		soapModel.setFunctionTypeCode(model.getFunctionTypeCode());
		soapModel.setFunctionTypeName(model.getFunctionTypeName());
		soapModel.setFunctionTypeNameVN(model.getFunctionTypeNameVN());
		soapModel.setFunctionTypeOrder(model.getFunctionTypeOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGTFunctionTypeSoap[] toSoapModels(DmGTFunctionType[] models) {
		DmGTFunctionTypeSoap[] soapModels = new DmGTFunctionTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGTFunctionTypeSoap[][] toSoapModels(
		DmGTFunctionType[][] models) {
		DmGTFunctionTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGTFunctionTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGTFunctionTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGTFunctionTypeSoap[] toSoapModels(
		List<DmGTFunctionType> models) {
		List<DmGTFunctionTypeSoap> soapModels = new ArrayList<DmGTFunctionTypeSoap>(models.size());

		for (DmGTFunctionType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGTFunctionTypeSoap[soapModels.size()]);
	}

	public DmGTFunctionTypeSoap() {
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

	public String getFunctionTypeCode() {
		return _functionTypeCode;
	}

	public void setFunctionTypeCode(String functionTypeCode) {
		_functionTypeCode = functionTypeCode;
	}

	public String getFunctionTypeName() {
		return _functionTypeName;
	}

	public void setFunctionTypeName(String functionTypeName) {
		_functionTypeName = functionTypeName;
	}

	public String getFunctionTypeNameVN() {
		return _functionTypeNameVN;
	}

	public void setFunctionTypeNameVN(String functionTypeNameVN) {
		_functionTypeNameVN = functionTypeNameVN;
	}

	public int getFunctionTypeOrder() {
		return _functionTypeOrder;
	}

	public void setFunctionTypeOrder(int functionTypeOrder) {
		_functionTypeOrder = functionTypeOrder;
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
	private String _functionTypeCode;
	private String _functionTypeName;
	private String _functionTypeNameVN;
	private int _functionTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}