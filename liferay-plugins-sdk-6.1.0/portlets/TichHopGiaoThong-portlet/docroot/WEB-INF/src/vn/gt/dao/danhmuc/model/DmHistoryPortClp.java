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

import vn.gt.dao.danhmuc.service.DmHistoryPortLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmHistoryPortClp extends BaseModelImpl<DmHistoryPort>
	implements DmHistoryPort {
	public DmHistoryPortClp() {
	}

	public Class<?> getModelClass() {
		return DmHistoryPort.class;
	}

	public String getModelClassName() {
		return DmHistoryPort.class.getName();
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getLoCode() {
		return _loCode;
	}

	public void setLoCode(String loCode) {
		_loCode = loCode;
	}

	public String getPortName() {
		return _portName;
	}

	public void setPortName(String portName) {
		_portName = portName;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getFullNameVN() {
		return _fullNameVN;
	}

	public void setFullNameVN(String fullNameVN) {
		_fullNameVN = fullNameVN;
	}

	public String getPortType() {
		return _portType;
	}

	public void setPortType(String portType) {
		_portType = portType;
	}

	public int getPortOrder() {
		return _portOrder;
	}

	public void setPortOrder(int portOrder) {
		_portOrder = portOrder;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddressVN() {
		return _addressVN;
	}

	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getCitycode() {
		return _citycode;
	}

	public void setCitycode(String citycode) {
		_citycode = citycode;
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
		if (this.isNew()) {
			DmHistoryPortLocalServiceUtil.addDmHistoryPort(this);
		}
		else {
			DmHistoryPortLocalServiceUtil.updateDmHistoryPort(this);
		}
	}

	@Override
	public DmHistoryPort toEscapedModel() {
		return (DmHistoryPort)Proxy.newProxyInstance(DmHistoryPort.class.getClassLoader(),
			new Class[] { DmHistoryPort.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPortClp clone = new DmHistoryPortClp();

		clone.setId(getId());
		clone.setPortCode(getPortCode());
		clone.setLoCode(getLoCode());
		clone.setPortName(getPortName());
		clone.setFullName(getFullName());
		clone.setFullNameVN(getFullNameVN());
		clone.setPortType(getPortType());
		clone.setPortOrder(getPortOrder());
		clone.setAddress(getAddress());
		clone.setAddressVN(getAddressVN());
		clone.setStateCode(getStateCode());
		clone.setCitycode(getCitycode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmHistoryPort dmHistoryPort) {
		int value = 0;

		if (getId() < dmHistoryPort.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPort.getId()) {
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

		DmHistoryPortClp dmHistoryPort = null;

		try {
			dmHistoryPort = (DmHistoryPortClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryPort.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", loCode=");
		sb.append(getLoCode());
		sb.append(", portName=");
		sb.append(getPortName());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", fullNameVN=");
		sb.append(getFullNameVN());
		sb.append(", portType=");
		sb.append(getPortType());
		sb.append(", portOrder=");
		sb.append(getPortOrder());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryPort");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loCode</column-name><column-value><![CDATA[");
		sb.append(getLoCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portName</column-name><column-value><![CDATA[");
		sb.append(getPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullNameVN</column-name><column-value><![CDATA[");
		sb.append(getFullNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portType</column-name><column-value><![CDATA[");
		sb.append(getPortType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOrder</column-name><column-value><![CDATA[");
		sb.append(getPortOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
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

	private int _id;
	private String _portCode;
	private String _loCode;
	private String _portName;
	private String _fullName;
	private String _fullNameVN;
	private String _portType;
	private int _portOrder;
	private String _address;
	private String _addressVN;
	private String _stateCode;
	private String _citycode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}