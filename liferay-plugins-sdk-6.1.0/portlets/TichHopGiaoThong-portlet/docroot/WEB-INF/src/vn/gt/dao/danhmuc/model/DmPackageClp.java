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

import vn.gt.dao.danhmuc.service.DmPackageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmPackageClp extends BaseModelImpl<DmPackage> implements DmPackage {
	public DmPackageClp() {
	}

	public Class<?> getModelClass() {
		return DmPackage.class;
	}

	public String getModelClassName() {
		return DmPackage.class.getName();
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

	public String getPackageCode() {
		return _packageCode;
	}

	public void setPackageCode(String packageCode) {
		_packageCode = packageCode;
	}

	public String getPackageName() {
		return _packageName;
	}

	public void setPackageName(String packageName) {
		_packageName = packageName;
	}

	public String getPackageNameVN() {
		return _packageNameVN;
	}

	public void setPackageNameVN(String packageNameVN) {
		_packageNameVN = packageNameVN;
	}

	public int getPackageOrder() {
		return _packageOrder;
	}

	public void setPackageOrder(int packageOrder) {
		_packageOrder = packageOrder;
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
			DmPackageLocalServiceUtil.addDmPackage(this);
		}
		else {
			DmPackageLocalServiceUtil.updateDmPackage(this);
		}
	}

	@Override
	public DmPackage toEscapedModel() {
		return (DmPackage)Proxy.newProxyInstance(DmPackage.class.getClassLoader(),
			new Class[] { DmPackage.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmPackageClp clone = new DmPackageClp();

		clone.setId(getId());
		clone.setPackageCode(getPackageCode());
		clone.setPackageName(getPackageName());
		clone.setPackageNameVN(getPackageNameVN());
		clone.setPackageOrder(getPackageOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmPackage dmPackage) {
		int value = 0;

		if (getId() < dmPackage.getId()) {
			value = -1;
		}
		else if (getId() > dmPackage.getId()) {
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

		DmPackageClp dmPackage = null;

		try {
			dmPackage = (DmPackageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmPackage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", packageCode=");
		sb.append(getPackageCode());
		sb.append(", packageName=");
		sb.append(getPackageName());
		sb.append(", packageNameVN=");
		sb.append(getPackageNameVN());
		sb.append(", packageOrder=");
		sb.append(getPackageOrder());
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
		sb.append("vn.gt.dao.danhmuc.model.DmPackage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageCode</column-name><column-value><![CDATA[");
		sb.append(getPackageCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageName</column-name><column-value><![CDATA[");
		sb.append(getPackageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageNameVN</column-name><column-value><![CDATA[");
		sb.append(getPackageNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packageOrder</column-name><column-value><![CDATA[");
		sb.append(getPackageOrder());
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
	private String _packageCode;
	private String _packageName;
	private String _packageNameVN;
	private int _packageOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}