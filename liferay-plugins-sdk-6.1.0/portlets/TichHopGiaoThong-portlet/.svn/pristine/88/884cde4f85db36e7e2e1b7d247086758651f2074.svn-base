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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.ModifyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class ModifyClp extends BaseModelImpl<Modify> implements Modify {
	public ModifyClp() {
	}

	public Class<?> getModelClass() {
		return Modify.class;
	}

	public String getModelClassName() {
		return Modify.class.getName();
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

	public String getModifyCode() {
		return _modifyCode;
	}

	public void setModifyCode(String modifyCode) {
		_modifyCode = modifyCode;
	}

	public String getModifyDesc() {
		return _modifyDesc;
	}

	public void setModifyDesc(String modifyDesc) {
		_modifyDesc = modifyDesc;
	}

	public String getOrganization() {
		return _organization;
	}

	public void setOrganization(String organization) {
		_organization = organization;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public long getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(long documentYear) {
		_documentYear = documentYear;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ModifyLocalServiceUtil.addModify(this);
		}
		else {
			ModifyLocalServiceUtil.updateModify(this);
		}
	}

	@Override
	public Modify toEscapedModel() {
		return (Modify)Proxy.newProxyInstance(Modify.class.getClassLoader(),
			new Class[] { Modify.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ModifyClp clone = new ModifyClp();

		clone.setId(getId());
		clone.setModifyCode(getModifyCode());
		clone.setModifyDesc(getModifyDesc());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setName(getName());
		clone.setModifyDate(getModifyDate());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());

		return clone;
	}

	public int compareTo(Modify modify) {
		int value = 0;

		if (getId() < modify.getId()) {
			value = -1;
		}
		else if (getId() > modify.getId()) {
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

		ModifyClp modify = null;

		try {
			modify = (ModifyClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = modify.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", modifyCode=");
		sb.append(getModifyCode());
		sb.append(", modifyDesc=");
		sb.append(getModifyDesc());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.Modify");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyCode</column-name><column-value><![CDATA[");
		sb.append(getModifyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDesc</column-name><column-value><![CDATA[");
		sb.append(getModifyDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization</column-name><column-value><![CDATA[");
		sb.append(getOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _modifyCode;
	private String _modifyDesc;
	private String _organization;
	private String _division;
	private String _name;
	private Date _modifyDate;
	private long _documentName;
	private long _documentYear;
}