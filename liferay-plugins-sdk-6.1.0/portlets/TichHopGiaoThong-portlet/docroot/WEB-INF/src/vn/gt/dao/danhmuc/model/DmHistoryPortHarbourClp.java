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

import vn.gt.dao.danhmuc.service.DmHistoryPortHarbourLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmHistoryPortHarbourClp extends BaseModelImpl<DmHistoryPortHarbour>
	implements DmHistoryPortHarbour {
	public DmHistoryPortHarbourClp() {
	}

	public Class<?> getModelClass() {
		return DmHistoryPortHarbour.class;
	}

	public String getModelClassName() {
		return DmHistoryPortHarbour.class.getName();
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

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
	}

	public String getPortHarbourName() {
		return _portHarbourName;
	}

	public void setPortHarbourName(String portHarbourName) {
		_portHarbourName = portHarbourName;
	}

	public String getPortHarbourNameVN() {
		return _portHarbourNameVN;
	}

	public void setPortHarbourNameVN(String portHarbourNameVN) {
		_portHarbourNameVN = portHarbourNameVN;
	}

	public int getPortHarbourType() {
		return _portHarbourType;
	}

	public void setPortHarbourType(int portHarbourType) {
		_portHarbourType = portHarbourType;
	}

	public String getPortRegion() {
		return _portRegion;
	}

	public void setPortRegion(String portRegion) {
		_portRegion = portRegion;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getPortRegionCode() {
		return _portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
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
			DmHistoryPortHarbourLocalServiceUtil.addDmHistoryPortHarbour(this);
		}
		else {
			DmHistoryPortHarbourLocalServiceUtil.updateDmHistoryPortHarbour(this);
		}
	}

	@Override
	public DmHistoryPortHarbour toEscapedModel() {
		return (DmHistoryPortHarbour)Proxy.newProxyInstance(DmHistoryPortHarbour.class.getClassLoader(),
			new Class[] { DmHistoryPortHarbour.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryPortHarbourClp clone = new DmHistoryPortHarbourClp();

		clone.setId(getId());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setPortHarbourName(getPortHarbourName());
		clone.setPortHarbourNameVN(getPortHarbourNameVN());
		clone.setPortHarbourType(getPortHarbourType());
		clone.setPortRegion(getPortRegion());
		clone.setPortCode(getPortCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setNote(getNote());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmHistoryPortHarbour dmHistoryPortHarbour) {
		int value = 0;

		if (getId() < dmHistoryPortHarbour.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPortHarbour.getId()) {
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

		DmHistoryPortHarbourClp dmHistoryPortHarbour = null;

		try {
			dmHistoryPortHarbour = (DmHistoryPortHarbourClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryPortHarbour.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", portHarbourName=");
		sb.append(getPortHarbourName());
		sb.append(", portHarbourNameVN=");
		sb.append(getPortHarbourNameVN());
		sb.append(", portHarbourType=");
		sb.append(getPortHarbourType());
		sb.append(", portRegion=");
		sb.append(getPortRegion());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", note=");
		sb.append(getNote());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryPortHarbour");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourName</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourType</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegion</column-name><column-value><![CDATA[");
		sb.append(getPortRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
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
	private String _portHarbourCode;
	private String _portHarbourName;
	private String _portHarbourNameVN;
	private int _portHarbourType;
	private String _portRegion;
	private String _portCode;
	private String _portRegionCode;
	private String _note;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}