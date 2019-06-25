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

import vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmHistoryMaritimeClp extends BaseModelImpl<DmHistoryMaritime>
	implements DmHistoryMaritime {
	public DmHistoryMaritimeClp() {
	}

	public Class<?> getModelClass() {
		return DmHistoryMaritime.class;
	}

	public String getModelClassName() {
		return DmHistoryMaritime.class.getName();
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

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public String getMaritimeReference() {
		return _maritimeReference;
	}

	public void setMaritimeReference(String maritimeReference) {
		_maritimeReference = maritimeReference;
	}

	public int getMaritimeOrder() {
		return _maritimeOrder;
	}

	public void setMaritimeOrder(int maritimeOrder) {
		_maritimeOrder = maritimeOrder;
	}

	public String getMaritimeName() {
		return _maritimeName;
	}

	public void setMaritimeName(String maritimeName) {
		_maritimeName = maritimeName;
	}

	public String getMaritimeNameVN() {
		return _maritimeNameVN;
	}

	public void setMaritimeNameVN(String maritimeNameVN) {
		_maritimeNameVN = maritimeNameVN;
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
			DmHistoryMaritimeLocalServiceUtil.addDmHistoryMaritime(this);
		}
		else {
			DmHistoryMaritimeLocalServiceUtil.updateDmHistoryMaritime(this);
		}
	}

	@Override
	public DmHistoryMaritime toEscapedModel() {
		return (DmHistoryMaritime)Proxy.newProxyInstance(DmHistoryMaritime.class.getClassLoader(),
			new Class[] { DmHistoryMaritime.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryMaritimeClp clone = new DmHistoryMaritimeClp();

		clone.setId(getId());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setMaritimeReference(getMaritimeReference());
		clone.setMaritimeOrder(getMaritimeOrder());
		clone.setMaritimeName(getMaritimeName());
		clone.setMaritimeNameVN(getMaritimeNameVN());
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

	public int compareTo(DmHistoryMaritime dmHistoryMaritime) {
		int value = 0;

		if (getId() < dmHistoryMaritime.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryMaritime.getId()) {
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

		DmHistoryMaritimeClp dmHistoryMaritime = null;

		try {
			dmHistoryMaritime = (DmHistoryMaritimeClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryMaritime.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", maritimeReference=");
		sb.append(getMaritimeReference());
		sb.append(", maritimeOrder=");
		sb.append(getMaritimeOrder());
		sb.append(", maritimeName=");
		sb.append(getMaritimeName());
		sb.append(", maritimeNameVN=");
		sb.append(getMaritimeNameVN());
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
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryMaritime");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeReference</column-name><column-value><![CDATA[");
		sb.append(getMaritimeReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeOrder</column-name><column-value><![CDATA[");
		sb.append(getMaritimeOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeName</column-name><column-value><![CDATA[");
		sb.append(getMaritimeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeNameVN</column-name><column-value><![CDATA[");
		sb.append(getMaritimeNameVN());
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
	private String _maritimeCode;
	private String _maritimeReference;
	private int _maritimeOrder;
	private String _maritimeName;
	private String _maritimeNameVN;
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