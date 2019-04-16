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

import vn.gt.dao.danhmuc.service.HistorySyncVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class HistorySyncVersionClp extends BaseModelImpl<HistorySyncVersion>
	implements HistorySyncVersion {
	public HistorySyncVersionClp() {
	}

	public Class<?> getModelClass() {
		return HistorySyncVersion.class;
	}

	public String getModelClassName() {
		return HistorySyncVersion.class.getName();
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

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public Date getTimeofPublish() {
		return _timeofPublish;
	}

	public void setTimeofPublish(Date timeofPublish) {
		_timeofPublish = timeofPublish;
	}

	public String getCategoryID() {
		return _categoryID;
	}

	public void setCategoryID(String categoryID) {
		_categoryID = categoryID;
	}

	public String getSyncUnit() {
		return _syncUnit;
	}

	public void setSyncUnit(String syncUnit) {
		_syncUnit = syncUnit;
	}

	public String getSyncUser() {
		return _syncUser;
	}

	public void setSyncUser(String syncUser) {
		_syncUser = syncUser;
	}

	public String getSyncVersion() {
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	public Date getLatestValueDate() {
		return _latestValueDate;
	}

	public void setLatestValueDate(Date latestValueDate) {
		_latestValueDate = latestValueDate;
	}

	public void persist() throws SystemException {
		HistorySyncVersionLocalServiceUtil.updateHistorySyncVersion(this);
	}

	@Override
	public HistorySyncVersion toEscapedModel() {
		return (HistorySyncVersion)Proxy.newProxyInstance(HistorySyncVersion.class.getClassLoader(),
			new Class[] { HistorySyncVersion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistorySyncVersionClp clone = new HistorySyncVersionClp();

		clone.setId(getId());
		clone.setRequestedDate(getRequestedDate());
		clone.setTimeofPublish(getTimeofPublish());
		clone.setCategoryID(getCategoryID());
		clone.setSyncUnit(getSyncUnit());
		clone.setSyncUser(getSyncUser());
		clone.setSyncVersion(getSyncVersion());
		clone.setLatestValueDate(getLatestValueDate());

		return clone;
	}

	public int compareTo(HistorySyncVersion historySyncVersion) {
		int value = 0;

		if (getId() < historySyncVersion.getId()) {
			value = -1;
		}
		else if (getId() > historySyncVersion.getId()) {
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

		HistorySyncVersionClp historySyncVersion = null;

		try {
			historySyncVersion = (HistorySyncVersionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = historySyncVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", timeofPublish=");
		sb.append(getTimeofPublish());
		sb.append(", categoryID=");
		sb.append(getCategoryID());
		sb.append(", syncUnit=");
		sb.append(getSyncUnit());
		sb.append(", syncUser=");
		sb.append(getSyncUser());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append(", latestValueDate=");
		sb.append(getLatestValueDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.HistorySyncVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeofPublish</column-name><column-value><![CDATA[");
		sb.append(getTimeofPublish());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryID</column-name><column-value><![CDATA[");
		sb.append(getCategoryID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncUnit</column-name><column-value><![CDATA[");
		sb.append(getSyncUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncUser</column-name><column-value><![CDATA[");
		sb.append(getSyncUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestValueDate</column-name><column-value><![CDATA[");
		sb.append(getLatestValueDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Date _requestedDate;
	private Date _timeofPublish;
	private String _categoryID;
	private String _syncUnit;
	private String _syncUser;
	private String _syncVersion;
	private Date _latestValueDate;
}