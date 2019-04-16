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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmMinistryServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmMinistryServiceSoap
 * @generated
 */
public class DmMinistrySoap implements Serializable {
	public static DmMinistrySoap toSoapModel(DmMinistry model) {
		DmMinistrySoap soapModel = new DmMinistrySoap();

		soapModel.setId(model.getId());
		soapModel.setMinistryCode(model.getMinistryCode());
		soapModel.setMinistryName(model.getMinistryName());
		soapModel.setMinistryNameVN(model.getMinistryNameVN());
		soapModel.setMinistryOrder(model.getMinistryOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmMinistrySoap[] toSoapModels(DmMinistry[] models) {
		DmMinistrySoap[] soapModels = new DmMinistrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmMinistrySoap[][] toSoapModels(DmMinistry[][] models) {
		DmMinistrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmMinistrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmMinistrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmMinistrySoap[] toSoapModels(List<DmMinistry> models) {
		List<DmMinistrySoap> soapModels = new ArrayList<DmMinistrySoap>(models.size());

		for (DmMinistry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmMinistrySoap[soapModels.size()]);
	}

	public DmMinistrySoap() {
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

	public String getMinistryCode() {
		return _ministryCode;
	}

	public void setMinistryCode(String ministryCode) {
		_ministryCode = ministryCode;
	}

	public String getMinistryName() {
		return _ministryName;
	}

	public void setMinistryName(String ministryName) {
		_ministryName = ministryName;
	}

	public String getMinistryNameVN() {
		return _ministryNameVN;
	}

	public void setMinistryNameVN(String ministryNameVN) {
		_ministryNameVN = ministryNameVN;
	}

	public int getMinistryOrder() {
		return _ministryOrder;
	}

	public void setMinistryOrder(int ministryOrder) {
		_ministryOrder = ministryOrder;
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
	private String _ministryCode;
	private String _ministryName;
	private String _ministryNameVN;
	private int _ministryOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}