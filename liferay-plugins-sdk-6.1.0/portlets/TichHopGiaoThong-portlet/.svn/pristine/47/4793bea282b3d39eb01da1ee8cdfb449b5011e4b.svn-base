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

import vn.gt.dao.danhmucgt.service.DmGtVersionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmGtVersionClp extends BaseModelImpl<DmGtVersion>
	implements DmGtVersion {
	public DmGtVersionClp() {
	}

	public Class<?> getModelClass() {
		return DmGtVersion.class;
	}

	public String getModelClassName() {
		return DmGtVersion.class.getName();
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

	public String getVersionName() {
		return _versionName;
	}

	public void setVersionName(String versionName) {
		_versionName = versionName;
	}

	public Date getVersionDate() {
		return _versionDate;
	}

	public void setVersionDate(Date versionDate) {
		_versionDate = versionDate;
	}

	public String getVersionDeployer() {
		return _versionDeployer;
	}

	public void setVersionDeployer(String versionDeployer) {
		_versionDeployer = versionDeployer;
	}

	public String getContents() {
		return _contents;
	}

	public void setContents(String contents) {
		_contents = contents;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getDbFileName() {
		return _dbFileName;
	}

	public void setDbFileName(String dbFileName) {
		_dbFileName = dbFileName;
	}

	public String getDbFileSize() {
		return _dbFileSize;
	}

	public void setDbFileSize(String dbFileSize) {
		_dbFileSize = dbFileSize;
	}

	public String getDbDescription() {
		return _dbDescription;
	}

	public void setDbDescription(String dbDescription) {
		_dbDescription = dbDescription;
	}

	public String getAppFileName() {
		return _appFileName;
	}

	public void setAppFileName(String appFileName) {
		_appFileName = appFileName;
	}

	public String getAppFileSize() {
		return _appFileSize;
	}

	public void setAppFileSize(String appFileSize) {
		_appFileSize = appFileSize;
	}

	public String getAppDescription() {
		return _appDescription;
	}

	public void setAppDescription(String appDescription) {
		_appDescription = appDescription;
	}

	public String getSpecFileName() {
		return _specFileName;
	}

	public void setSpecFileName(String specFileName) {
		_specFileName = specFileName;
	}

	public String getSpecFileSize() {
		return _specFileSize;
	}

	public void setSpecFileSize(String specFileSize) {
		_specFileSize = specFileSize;
	}

	public String getSpecDescription() {
		return _specDescription;
	}

	public void setSpecDescription(String specDescription) {
		_specDescription = specDescription;
	}

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
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
		DmGtVersionLocalServiceUtil.updateDmGtVersion(this);
	}

	@Override
	public DmGtVersion toEscapedModel() {
		return (DmGtVersion)Proxy.newProxyInstance(DmGtVersion.class.getClassLoader(),
			new Class[] { DmGtVersion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGtVersionClp clone = new DmGtVersionClp();

		clone.setId(getId());
		clone.setVersionName(getVersionName());
		clone.setVersionDate(getVersionDate());
		clone.setVersionDeployer(getVersionDeployer());
		clone.setContents(getContents());
		clone.setDescription(getDescription());
		clone.setDbFileName(getDbFileName());
		clone.setDbFileSize(getDbFileSize());
		clone.setDbDescription(getDbDescription());
		clone.setAppFileName(getAppFileName());
		clone.setAppFileSize(getAppFileSize());
		clone.setAppDescription(getAppDescription());
		clone.setSpecFileName(getSpecFileName());
		clone.setSpecFileSize(getSpecFileSize());
		clone.setSpecDescription(getSpecDescription());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmGtVersion dmGtVersion) {
		int value = 0;

		if (getId() < dmGtVersion.getId()) {
			value = -1;
		}
		else if (getId() > dmGtVersion.getId()) {
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

		DmGtVersionClp dmGtVersion = null;

		try {
			dmGtVersion = (DmGtVersionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmGtVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", versionName=");
		sb.append(getVersionName());
		sb.append(", versionDate=");
		sb.append(getVersionDate());
		sb.append(", versionDeployer=");
		sb.append(getVersionDeployer());
		sb.append(", contents=");
		sb.append(getContents());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", dbFileName=");
		sb.append(getDbFileName());
		sb.append(", dbFileSize=");
		sb.append(getDbFileSize());
		sb.append(", dbDescription=");
		sb.append(getDbDescription());
		sb.append(", appFileName=");
		sb.append(getAppFileName());
		sb.append(", appFileSize=");
		sb.append(getAppFileSize());
		sb.append(", appDescription=");
		sb.append(getAppDescription());
		sb.append(", specFileName=");
		sb.append(getSpecFileName());
		sb.append(", specFileSize=");
		sb.append(getSpecFileSize());
		sb.append(", specDescription=");
		sb.append(getSpecDescription());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmucgt.model.DmGtVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionName</column-name><column-value><![CDATA[");
		sb.append(getVersionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionDate</column-name><column-value><![CDATA[");
		sb.append(getVersionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionDeployer</column-name><column-value><![CDATA[");
		sb.append(getVersionDeployer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contents</column-name><column-value><![CDATA[");
		sb.append(getContents());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dbFileName</column-name><column-value><![CDATA[");
		sb.append(getDbFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dbFileSize</column-name><column-value><![CDATA[");
		sb.append(getDbFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dbDescription</column-name><column-value><![CDATA[");
		sb.append(getDbDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appFileName</column-name><column-value><![CDATA[");
		sb.append(getAppFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appFileSize</column-name><column-value><![CDATA[");
		sb.append(getAppFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appDescription</column-name><column-value><![CDATA[");
		sb.append(getAppDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specFileName</column-name><column-value><![CDATA[");
		sb.append(getSpecFileName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specFileSize</column-name><column-value><![CDATA[");
		sb.append(getSpecFileSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>specDescription</column-name><column-value><![CDATA[");
		sb.append(getSpecDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
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
	private String _versionName;
	private Date _versionDate;
	private String _versionDeployer;
	private String _contents;
	private String _description;
	private String _dbFileName;
	private String _dbFileSize;
	private String _dbDescription;
	private String _appFileName;
	private String _appFileSize;
	private String _appDescription;
	private String _specFileName;
	private String _specFileSize;
	private String _specDescription;
	private String _organizationCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}