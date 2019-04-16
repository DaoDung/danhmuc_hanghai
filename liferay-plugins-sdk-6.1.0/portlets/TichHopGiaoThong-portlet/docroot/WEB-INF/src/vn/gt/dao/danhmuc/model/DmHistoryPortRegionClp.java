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

import vn.gt.dao.danhmuc.service.DmHistoryPortRegionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmHistoryPortRegionClp extends BaseModelImpl<DmHistoryPortRegion>
	implements DmHistoryPortRegion {
	public DmHistoryPortRegionClp() {
	}

	public Class<?> getModelClass() {
		return DmHistoryPortRegion.class;
	}

	public String getModelClassName() {
		return DmHistoryPortRegion.class.getName();
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

	public String getPortRegionCode() {
		return _portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;
	}

	public String getPortRegionName() {
		return _portRegionName;
	}

	public void setPortRegionName(String portRegionName) {
		_portRegionName = portRegionName;
	}

	public String getPortRegionNameVN() {
		return _portRegionNameVN;
	}

	public void setPortRegionNameVN(String portRegionNameVN) {
		_portRegionNameVN = portRegionNameVN;
	}

	public String getPortRegionRef() {
		return _portRegionRef;
	}

	public void setPortRegionRef(String portRegionRef) {
		_portRegionRef = portRegionRef;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
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
		DmHistoryPortRegionLocalServiceUtil.updateDmHistoryPortRegion(this);
	}

	@Override
	public DmHistoryPortRegion toEscapedModel() {
		return (DmHistoryPortRegion)Proxy.newProxyInstance(DmHistoryPortRegion.class.getClassLoader(),
			new Class[] { DmHistoryPortRegion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPortRegionClp clone = new DmHistoryPortRegionClp();

		clone.setId(getId());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortRegionName(getPortRegionName());
		clone.setPortRegionNameVN(getPortRegionNameVN());
		clone.setPortRegionRef(getPortRegionRef());
		clone.setPortCode(getPortCode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmHistoryPortRegion dmHistoryPortRegion) {
		int value = 0;

		if (getId() < dmHistoryPortRegion.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPortRegion.getId()) {
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

		DmHistoryPortRegionClp dmHistoryPortRegion = null;

		try {
			dmHistoryPortRegion = (DmHistoryPortRegionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryPortRegion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portRegionName=");
		sb.append(getPortRegionName());
		sb.append(", portRegionNameVN=");
		sb.append(getPortRegionNameVN());
		sb.append(", portRegionRef=");
		sb.append(getPortRegionRef());
		sb.append(", portCode=");
		sb.append(getPortCode());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryPortRegion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionName</column-name><column-value><![CDATA[");
		sb.append(getPortRegionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortRegionNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionRef</column-name><column-value><![CDATA[");
		sb.append(getPortRegionRef());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
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
	private String _portRegionCode;
	private String _portRegionName;
	private String _portRegionNameVN;
	private String _portRegionRef;
	private String _portCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}