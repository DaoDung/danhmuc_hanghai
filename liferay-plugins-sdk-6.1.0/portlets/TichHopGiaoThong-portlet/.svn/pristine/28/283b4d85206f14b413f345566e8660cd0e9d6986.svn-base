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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.danhmuc.service.HistoryRmdcShipLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class HistoryRmdcShipClp extends BaseModelImpl<HistoryRmdcShip>
	implements HistoryRmdcShip {
	public HistoryRmdcShipClp() {
	}

	public Class<?> getModelClass() {
		return HistoryRmdcShip.class;
	}

	public String getModelClassName() {
		return HistoryRmdcShip.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public void persist() throws SystemException {
		HistoryRmdcShipLocalServiceUtil.updateHistoryRmdcShip(this);
	}

	@Override
	public HistoryRmdcShip toEscapedModel() {
		return (HistoryRmdcShip)Proxy.newProxyInstance(HistoryRmdcShip.class.getClassLoader(),
			new Class[] { HistoryRmdcShip.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistoryRmdcShipClp clone = new HistoryRmdcShipClp();

		clone.setId(getId());
		clone.setShipId(getShipId());
		clone.setShipName(getShipName());
		clone.setShipTypeId(getShipTypeId());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setImo(getImo());
		clone.setCallSign(getCallSign());
		clone.setStateId(getStateId());
		clone.setStateCode(getStateCode());
		clone.setRegistryNumber(getRegistryNumber());
		clone.setRegistryDate(getRegistryDate());
		clone.setRegistryPortId(getRegistryPortId());
		clone.setRegistryPortCode(getRegistryPortCode());
		clone.setGt(getGt());
		clone.setNrt(getNrt());
		clone.setDwt(getDwt());
		clone.setLength(getLength());
		clone.setWidth(getWidth());
		clone.setHeight(getHeight());
		clone.setSailingSpeed(getSailingSpeed());
		clone.setColor(getColor());
		clone.setBoneCode(getBoneCode());
		clone.setMachineCode(getMachineCode());
		clone.setShipAgencyId(getShipAgencyId());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setFishingBoatRegistration(getFishingBoatRegistration());
		clone.setRoleShip(getRoleShip());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(HistoryRmdcShip historyRmdcShip) {
		int value = 0;

		if (getId() < historyRmdcShip.getId()) {
			value = -1;
		}
		else if (getId() > historyRmdcShip.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HistoryRmdcShipClp historyRmdcShip = null;

		try {
			historyRmdcShip = (HistoryRmdcShipClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = historyRmdcShip.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipId=");
		sb.append(getShipId());
		sb.append(", shipName=");
		sb.append(getShipName());
		sb.append(", shipTypeId=");
		sb.append(getShipTypeId());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", imo=");
		sb.append(getImo());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", stateId=");
		sb.append(getStateId());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", registryNumber=");
		sb.append(getRegistryNumber());
		sb.append(", registryDate=");
		sb.append(getRegistryDate());
		sb.append(", registryPortId=");
		sb.append(getRegistryPortId());
		sb.append(", registryPortCode=");
		sb.append(getRegistryPortCode());
		sb.append(", gt=");
		sb.append(getGt());
		sb.append(", nrt=");
		sb.append(getNrt());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", length=");
		sb.append(getLength());
		sb.append(", width=");
		sb.append(getWidth());
		sb.append(", height=");
		sb.append(getHeight());
		sb.append(", sailingSpeed=");
		sb.append(getSailingSpeed());
		sb.append(", color=");
		sb.append(getColor());
		sb.append(", boneCode=");
		sb.append(getBoneCode());
		sb.append(", machineCode=");
		sb.append(getMachineCode());
		sb.append(", shipAgencyId=");
		sb.append(getShipAgencyId());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", fishingBoatRegistration=");
		sb.append(getFishingBoatRegistration());
		sb.append(", roleShip=");
		sb.append(getRoleShip());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(100);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.HistoryRmdcShip");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipId</column-name><column-value><![CDATA[");
		sb.append(getShipId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipName</column-name><column-value><![CDATA[");
		sb.append(getShipName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeId</column-name><column-value><![CDATA[");
		sb.append(getShipTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imo</column-name><column-value><![CDATA[");
		sb.append(getImo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryNumber</column-name><column-value><![CDATA[");
		sb.append(getRegistryNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryDate</column-name><column-value><![CDATA[");
		sb.append(getRegistryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryPortId</column-name><column-value><![CDATA[");
		sb.append(getRegistryPortId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryPortCode</column-name><column-value><![CDATA[");
		sb.append(getRegistryPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gt</column-name><column-value><![CDATA[");
		sb.append(getGt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nrt</column-name><column-value><![CDATA[");
		sb.append(getNrt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>length</column-name><column-value><![CDATA[");
		sb.append(getLength());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>width</column-name><column-value><![CDATA[");
		sb.append(getWidth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>height</column-name><column-value><![CDATA[");
		sb.append(getHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sailingSpeed</column-name><column-value><![CDATA[");
		sb.append(getSailingSpeed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>color</column-name><column-value><![CDATA[");
		sb.append(getColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>boneCode</column-name><column-value><![CDATA[");
		sb.append(getBoneCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>machineCode</column-name><column-value><![CDATA[");
		sb.append(getMachineCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyId</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fishingBoatRegistration</column-name><column-value><![CDATA[");
		sb.append(getFishingBoatRegistration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleShip</column-name><column-value><![CDATA[");
		sb.append(getRoleShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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