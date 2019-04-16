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

import vn.gt.dao.danhmucgt.service.DmGTBusinessTypeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmGTBusinessTypeClp extends BaseModelImpl<DmGTBusinessType>
	implements DmGTBusinessType {
	public DmGTBusinessTypeClp() {
	}

	public Class<?> getModelClass() {
		return DmGTBusinessType.class;
	}

	public String getModelClassName() {
		return DmGTBusinessType.class.getName();
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

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public String getBusinessTypeName() {
		return _businessTypeName;
	}

	public void setBusinessTypeName(String businessTypeName) {
		_businessTypeName = businessTypeName;
	}

	public String getBusinessTypeNameVN() {
		return _businessTypeNameVN;
	}

	public void setBusinessTypeNameVN(String businessTypeNameVN) {
		_businessTypeNameVN = businessTypeNameVN;
	}

	public int getBusinessTypeOrder() {
		return _businessTypeOrder;
	}

	public void setBusinessTypeOrder(int businessTypeOrder) {
		_businessTypeOrder = businessTypeOrder;
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

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public void persist() throws SystemException {
		DmGTBusinessTypeLocalServiceUtil.updateDmGTBusinessType(this);
	}

	@Override
	public DmGTBusinessType toEscapedModel() {
		return (DmGTBusinessType)Proxy.newProxyInstance(DmGTBusinessType.class.getClassLoader(),
			new Class[] { DmGTBusinessType.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGTBusinessTypeClp clone = new DmGTBusinessTypeClp();

		clone.setId(getId());
		clone.setBusinessTypeCode(getBusinessTypeCode());
		clone.setBusinessTypeName(getBusinessTypeName());
		clone.setBusinessTypeNameVN(getBusinessTypeNameVN());
		clone.setBusinessTypeOrder(getBusinessTypeOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());
		clone.setRemarks(getRemarks());

		return clone;
	}

	public int compareTo(DmGTBusinessType dmGTBusinessType) {
		int value = 0;

		if (getId() < dmGTBusinessType.getId()) {
			value = -1;
		}
		else if (getId() > dmGTBusinessType.getId()) {
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

		DmGTBusinessTypeClp dmGTBusinessType = null;

		try {
			dmGTBusinessType = (DmGTBusinessTypeClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dmGTBusinessType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", businessTypeName=");
		sb.append(getBusinessTypeName());
		sb.append(", businessTypeNameVN=");
		sb.append(getBusinessTypeNameVN());
		sb.append(", businessTypeOrder=");
		sb.append(getBusinessTypeOrder());
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
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmucgt.model.DmGTBusinessType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeName</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeOrder());
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
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _businessTypeCode;
	private String _businessTypeName;
	private String _businessTypeNameVN;
	private int _businessTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _remarks;
}