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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.danhmuc.service.http.RmdcShipServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.danhmuc.service.http.RmdcShipServiceSoap
 * @generated
 */
public class RmdcShipSoap implements Serializable {
	public static RmdcShipSoap toSoapModel(RmdcShip model) {
		RmdcShipSoap soapModel = new RmdcShipSoap();

		soapModel.setId(model.getId());
		soapModel.setShipId(model.getShipId());
		soapModel.setShipName(model.getShipName());
		soapModel.setShipTypeId(model.getShipTypeId());
		soapModel.setShipTypeCode(model.getShipTypeCode());
		soapModel.setImo(model.getImo());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setStateId(model.getStateId());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setRegistryNumber(model.getRegistryNumber());
		soapModel.setRegistryDate(model.getRegistryDate());
		soapModel.setRegistryPortId(model.getRegistryPortId());
		soapModel.setRegistryPortCode(model.getRegistryPortCode());
		soapModel.setGt(model.getGt());
		soapModel.setNrt(model.getNrt());
		soapModel.setDwt(model.getDwt());
		soapModel.setLength(model.getLength());
		soapModel.setWidth(model.getWidth());
		soapModel.setHeight(model.getHeight());
		soapModel.setSailingSpeed(model.getSailingSpeed());
		soapModel.setColor(model.getColor());
		soapModel.setBoneCode(model.getBoneCode());
		soapModel.setMachineCode(model.getMachineCode());
		soapModel.setShipAgencyId(model.getShipAgencyId());
		soapModel.setShipAgencyCode(model.getShipAgencyCode());
		soapModel.setFishingBoatRegistration(model.getFishingBoatRegistration());
		soapModel.setRoleShip(model.getRoleShip());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static RmdcShipSoap[] toSoapModels(RmdcShip[] models) {
		RmdcShipSoap[] soapModels = new RmdcShipSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RmdcShipSoap[][] toSoapModels(RmdcShip[][] models) {
		RmdcShipSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RmdcShipSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RmdcShipSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RmdcShipSoap[] toSoapModels(List<RmdcShip> models) {
		List<RmdcShipSoap> soapModels = new ArrayList<RmdcShipSoap>(models.size());

		for (RmdcShip model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RmdcShipSoap[soapModels.size()]);
	}

	public RmdcShipSoap() {
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

	public int getShipId() {
		return _shipId;
	}

	public void setShipId(int shipId) {
		_shipId = shipId;
	}

	public String getShipName() {
		return _shipName;
	}

	public void setShipName(String shipName) {
		_shipName = shipName;
	}

	public int getShipTypeId() {
		return _shipTypeId;
	}

	public void setShipTypeId(int shipTypeId) {
		_shipTypeId = shipTypeId;
	}

	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;
	}

	public String getImo() {
		return _imo;
	}

	public void setImo(String imo) {
		_imo = imo;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getStateId() {
		return _stateId;
	}

	public void setStateId(String stateId) {
		_stateId = stateId;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getRegistryNumber() {
		return _registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		_registryNumber = registryNumber;
	}

	public Date getRegistryDate() {
		return _registryDate;
	}

	public void setRegistryDate(Date registryDate) {
		_registryDate = registryDate;
	}

	public int getRegistryPortId() {
		return _registryPortId;
	}

	public void setRegistryPortId(int registryPortId) {
		_registryPortId = registryPortId;
	}

	public String getRegistryPortCode() {
		return _registryPortCode;
	}

	public void setRegistryPortCode(String registryPortCode) {
		_registryPortCode = registryPortCode;
	}

	public double getGt() {
		return _gt;
	}

	public void setGt(double gt) {
		_gt = gt;
	}

	public double getNrt() {
		return _nrt;
	}

	public void setNrt(double nrt) {
		_nrt = nrt;
	}

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	public double getLength() {
		return _length;
	}

	public void setLength(double length) {
		_length = length;
	}

	public double getWidth() {
		return _width;
	}

	public void setWidth(double width) {
		_width = width;
	}

	public double getHeight() {
		return _height;
	}

	public void setHeight(double height) {
		_height = height;
	}

	public double getSailingSpeed() {
		return _sailingSpeed;
	}

	public void setSailingSpeed(double sailingSpeed) {
		_sailingSpeed = sailingSpeed;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public String getBoneCode() {
		return _boneCode;
	}

	public void setBoneCode(String boneCode) {
		_boneCode = boneCode;
	}

	public String getMachineCode() {
		return _machineCode;
	}

	public void setMachineCode(String machineCode) {
		_machineCode = machineCode;
	}

	public int getShipAgencyId() {
		return _shipAgencyId;
	}

	public void setShipAgencyId(int shipAgencyId) {
		_shipAgencyId = shipAgencyId;
	}

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
	}

	public String getFishingBoatRegistration() {
		return _fishingBoatRegistration;
	}

	public void setFishingBoatRegistration(String fishingBoatRegistration) {
		_fishingBoatRegistration = fishingBoatRegistration;
	}

	public int getRoleShip() {
		return _roleShip;
	}

	public void setRoleShip(int roleShip) {
		_roleShip = roleShip;
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
	private int _shipId;
	private String _shipName;
	private int _shipTypeId;
	private String _shipTypeCode;
	private String _imo;
	private String _callSign;
	private String _stateId;
	private String _stateCode;
	private String _registryNumber;
	private Date _registryDate;
	private int _registryPortId;
	private String _registryPortCode;
	private double _gt;
	private double _nrt;
	private double _dwt;
	private double _length;
	private double _width;
	private double _height;
	private double _sailingSpeed;
	private String _color;
	private String _boneCode;
	private String _machineCode;
	private int _shipAgencyId;
	private String _shipAgencyCode;
	private String _fishingBoatRegistration;
	private int _roleShip;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}