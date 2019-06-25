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

import vn.gt.dao.danhmucgt.service.DmGtOrganizationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmGtOrganizationClp extends BaseModelImpl<DmGtOrganization>
	implements DmGtOrganization {
	public DmGtOrganizationClp() {
	}

	public Class<?> getModelClass() {
		return DmGtOrganization.class;
	}

	public String getModelClassName() {
		return DmGtOrganization.class.getName();
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

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
	}

	public String getOrganizationName() {
		return _organizationName;
	}

	public void setOrganizationName(String organizationName) {
		_organizationName = organizationName;
	}

	public String getOrganizationNameVN() {
		return _organizationNameVN;
	}

	public void setOrganizationNameVN(String organizationNameVN) {
		_organizationNameVN = organizationNameVN;
	}

	public int getOrganizationorder() {
		return _organizationorder;
	}

	public void setOrganizationorder(int organizationorder) {
		_organizationorder = organizationorder;
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
			DmGtOrganizationLocalServiceUtil.addDmGtOrganization(this);
		}
		else {
			DmGtOrganizationLocalServiceUtil.updateDmGtOrganization(this);
		}
	}

	@Override
	public DmGtOrganization toEscapedModel() {
		return (DmGtOrganization)Proxy.newProxyInstance(DmGtOrganization.class.getClassLoader(),
			new Class[] { DmGtOrganization.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtOrganizationClp clone = new DmGtOrganizationClp();

		clone.setId(getId());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setOrganizationName(getOrganizationName());
		clone.setOrganizationNameVN(getOrganizationNameVN());
		clone.setOrganizationorder(getOrganizationorder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmGtOrganization dmGtOrganization) {
		int value = 0;

		if (getId() < dmGtOrganization.getId()) {
			value = -1;
		}
		else if (getId() > dmGtOrganization.getId()) {
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

		DmGtOrganizationClp dmGtOrganization = null;

		try {
			dmGtOrganization = (DmGtOrganizationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dmGtOrganization.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", organizationName=");
		sb.append(getOrganizationName());
		sb.append(", organizationNameVN=");
		sb.append(getOrganizationNameVN());
		sb.append(", organizationorder=");
		sb.append(getOrganizationorder());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmucgt.model.DmGtOrganization");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationName</column-name><column-value><![CDATA[");
		sb.append(getOrganizationName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationNameVN</column-name><column-value><![CDATA[");
		sb.append(getOrganizationNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationorder</column-name><column-value><![CDATA[");
		sb.append(getOrganizationorder());
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
	private String _organizationCode;
	private String _organizationName;
	private String _organizationNameVN;
	private int _organizationorder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}