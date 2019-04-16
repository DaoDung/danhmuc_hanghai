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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmucgt.service.http.DmGtRouteConfigServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmucgt.service.http.DmGtRouteConfigServiceSoap
 * @generated
 */
public class DmGtRouteConfigSoap implements Serializable {
	public static DmGtRouteConfigSoap toSoapModel(DmGtRouteConfig model) {
		DmGtRouteConfigSoap soapModel = new DmGtRouteConfigSoap();

		soapModel.setId(model.getId());
		soapModel.setRouteCode(model.getRouteCode());
		soapModel.setOrganizationCode(model.getOrganizationCode());
		soapModel.setLocCode(model.getLocCode());
		soapModel.setIpName(model.getIpName());
		soapModel.setPortName(model.getPortName());
		soapModel.setLinkAddress(model.getLinkAddress());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmGtRouteConfigSoap[] toSoapModels(DmGtRouteConfig[] models) {
		DmGtRouteConfigSoap[] soapModels = new DmGtRouteConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmGtRouteConfigSoap[][] toSoapModels(
		DmGtRouteConfig[][] models) {
		DmGtRouteConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmGtRouteConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmGtRouteConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmGtRouteConfigSoap[] toSoapModels(
		List<DmGtRouteConfig> models) {
		List<DmGtRouteConfigSoap> soapModels = new ArrayList<DmGtRouteConfigSoap>(models.size());

		for (DmGtRouteConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmGtRouteConfigSoap[soapModels.size()]);
	}

	public DmGtRouteConfigSoap() {
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

	public String getRouteCode() {
		return _routeCode;
	}

	public void setRouteCode(String routeCode) {
		_routeCode = routeCode;
	}

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
	}

	public String getLocCode() {
		return _locCode;
	}

	public void setLocCode(String locCode) {
		_locCode = locCode;
	}

	public String getIpName() {
		return _ipName;
	}

	public void setIpName(String ipName) {
		_ipName = ipName;
	}

	public String getPortName() {
		return _portName;
	}

	public void setPortName(String portName) {
		_portName = portName;
	}

	public String getLinkAddress() {
		return _linkAddress;
	}

	public void setLinkAddress(String linkAddress) {
		_linkAddress = linkAddress;
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
	private String _routeCode;
	private String _organizationCode;
	private String _locCode;
	private String _ipName;
	private String _portName;
	private String _linkAddress;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}