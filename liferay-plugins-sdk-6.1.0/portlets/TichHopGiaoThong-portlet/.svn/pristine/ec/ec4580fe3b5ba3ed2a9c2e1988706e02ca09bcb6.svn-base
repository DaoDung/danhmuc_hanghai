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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.danhmucgt.service.DmGtRouteConfigLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmGtRouteConfigClp extends BaseModelImpl<DmGtRouteConfig>
	implements DmGtRouteConfig {
	public DmGtRouteConfigClp() {
	}

	public Class<?> getModelClass() {
		return DmGtRouteConfig.class;
	}

	public String getModelClassName() {
		return DmGtRouteConfig.class.getName();
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

	public void persist() throws SystemException {
		DmGtRouteConfigLocalServiceUtil.updateDmGtRouteConfig(this);
	}

	@Override
	public DmGtRouteConfig toEscapedModel() {
		return (DmGtRouteConfig)Proxy.newProxyInstance(DmGtRouteConfig.class.getClassLoader(),
			new Class[] { DmGtRouteConfig.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtRouteConfigClp clone = new DmGtRouteConfigClp();

		clone.setId(getId());
		clone.setRouteCode(getRouteCode());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setLocCode(getLocCode());
		clone.setIpName(getIpName());
		clone.setPortName(getPortName());
		clone.setLinkAddress(getLinkAddress());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmGtRouteConfig dmGtRouteConfig) {
		int value = 0;

		if (getId() < dmGtRouteConfig.getId()) {
			value = -1;
		}
		else if (getId() > dmGtRouteConfig.getId()) {
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

		DmGtRouteConfigClp dmGtRouteConfig = null;

		try {
			dmGtRouteConfig = (DmGtRouteConfigClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dmGtRouteConfig.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", routeCode=");
		sb.append(getRouteCode());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", locCode=");
		sb.append(getLocCode());
		sb.append(", ipName=");
		sb.append(getIpName());
		sb.append(", portName=");
		sb.append(getPortName());
		sb.append(", linkAddress=");
		sb.append(getLinkAddress());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmucgt.model.DmGtRouteConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>routeCode</column-name><column-value><![CDATA[");
		sb.append(getRouteCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locCode</column-name><column-value><![CDATA[");
		sb.append(getLocCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ipName</column-name><column-value><![CDATA[");
		sb.append(getIpName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portName</column-name><column-value><![CDATA[");
		sb.append(getPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>linkAddress</column-name><column-value><![CDATA[");
		sb.append(getLinkAddress());
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