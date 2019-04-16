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

import vn.gt.dao.danhmuc.service.DmHistoryRepresentativeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmHistoryRepresentativeClp extends BaseModelImpl<DmHistoryRepresentative>
	implements DmHistoryRepresentative {
	public DmHistoryRepresentativeClp() {
	}

	public Class<?> getModelClass() {
		return DmHistoryRepresentative.class;
	}

	public String getModelClassName() {
		return DmHistoryRepresentative.class.getName();
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

	public String getRepCode() {
		return _repCode;
	}

	public void setRepCode(String repCode) {
		_repCode = repCode;
	}

	public String getRepName() {
		return _repName;
	}

	public void setRepName(String repName) {
		_repName = repName;
	}

	public String getRepNameVN() {
		return _repNameVN;
	}

	public void setRepNameVN(String repNameVN) {
		_repNameVN = repNameVN;
	}

	public int getRepLevel() {
		return _repLevel;
	}

	public void setRepLevel(int repLevel) {
		_repLevel = repLevel;
	}

	public int getRepOrder() {
		return _repOrder;
	}

	public void setRepOrder(int repOrder) {
		_repOrder = repOrder;
	}

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
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
		DmHistoryRepresentativeLocalServiceUtil.updateDmHistoryRepresentative(this);
	}

	@Override
	public DmHistoryRepresentative toEscapedModel() {
		return (DmHistoryRepresentative)Proxy.newProxyInstance(DmHistoryRepresentative.class.getClassLoader(),
			new Class[] { DmHistoryRepresentative.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryRepresentativeClp clone = new DmHistoryRepresentativeClp();

		clone.setId(getId());
		clone.setRepCode(getRepCode());
		clone.setRepName(getRepName());
		clone.setRepNameVN(getRepNameVN());
		clone.setRepLevel(getRepLevel());
		clone.setRepOrder(getRepOrder());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmHistoryRepresentative dmHistoryRepresentative) {
		int value = 0;

		if (getId() < dmHistoryRepresentative.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryRepresentative.getId()) {
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

		DmHistoryRepresentativeClp dmHistoryRepresentative = null;

		try {
			dmHistoryRepresentative = (DmHistoryRepresentativeClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryRepresentative.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", repCode=");
		sb.append(getRepCode());
		sb.append(", repName=");
		sb.append(getRepName());
		sb.append(", repNameVN=");
		sb.append(getRepNameVN());
		sb.append(", repLevel=");
		sb.append(getRepLevel());
		sb.append(", repOrder=");
		sb.append(getRepOrder());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
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
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryRepresentative");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repCode</column-name><column-value><![CDATA[");
		sb.append(getRepCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repName</column-name><column-value><![CDATA[");
		sb.append(getRepName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repNameVN</column-name><column-value><![CDATA[");
		sb.append(getRepNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repLevel</column-name><column-value><![CDATA[");
		sb.append(getRepLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repOrder</column-name><column-value><![CDATA[");
		sb.append(getRepOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
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
	private String _repCode;
	private String _repName;
	private String _repNameVN;
	private int _repLevel;
	private int _repOrder;
	private String _maritimeCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}