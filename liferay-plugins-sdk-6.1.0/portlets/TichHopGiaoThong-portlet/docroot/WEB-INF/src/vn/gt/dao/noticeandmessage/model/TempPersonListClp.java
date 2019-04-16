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

import vn.gt.dao.noticeandmessage.service.TempPersonListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempPersonListClp extends BaseModelImpl<TempPersonList>
	implements TempPersonList {
	public TempPersonListClp() {
	}

	public Class<?> getModelClass() {
		return TempPersonList.class;
	}

	public String getModelClassName() {
		return TempPersonList.class.getName();
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

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAge() {
		return _age;
	}

	public void setAge(String age) {
		_age = age;
	}

	public String getNationalCode() {
		return _nationalCode;
	}

	public void setNationalCode(String nationalCode) {
		_nationalCode = nationalCode;
	}

	public String getNationalName() {
		return _nationalName;
	}

	public void setNationalName(String nationalName) {
		_nationalName = nationalName;
	}

	public String getIlnessStatus() {
		return _ilnessStatus;
	}

	public void setIlnessStatus(String ilnessStatus) {
		_ilnessStatus = ilnessStatus;
	}

	public String getReasonOfDead() {
		return _reasonOfDead;
	}

	public void setReasonOfDead(String reasonOfDead) {
		_reasonOfDead = reasonOfDead;
	}

	public int getPersonType() {
		return _personType;
	}

	public void setPersonType(int personType) {
		_personType = personType;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempPersonListLocalServiceUtil.addTempPersonList(this);
		}
		else {
			TempPersonListLocalServiceUtil.updateTempPersonList(this);
		}
	}

	@Override
	public TempPersonList toEscapedModel() {
		return (TempPersonList)Proxy.newProxyInstance(TempPersonList.class.getClassLoader(),
			new Class[] { TempPersonList.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempPersonListClp clone = new TempPersonListClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setName(getName());
		clone.setAge(getAge());
		clone.setNationalCode(getNationalCode());
		clone.setNationalName(getNationalName());
		clone.setIlnessStatus(getIlnessStatus());
		clone.setReasonOfDead(getReasonOfDead());
		clone.setPersonType(getPersonType());

		return clone;
	}

	public int compareTo(TempPersonList tempPersonList) {
		int value = 0;

		if (getId() < tempPersonList.getId()) {
			value = -1;
		}
		else if (getId() > tempPersonList.getId()) {
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

		TempPersonListClp tempPersonList = null;

		try {
			tempPersonList = (TempPersonListClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempPersonList.getPrimaryKey();

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
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", nationalCode=");
		sb.append(getNationalCode());
		sb.append(", nationalName=");
		sb.append(getNationalName());
		sb.append(", ilnessStatus=");
		sb.append(getIlnessStatus());
		sb.append(", reasonOfDead=");
		sb.append(getReasonOfDead());
		sb.append(", personType=");
		sb.append(getPersonType());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempPersonList");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationalCode</column-name><column-value><![CDATA[");
		sb.append(getNationalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationalName</column-name><column-value><![CDATA[");
		sb.append(getNationalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ilnessStatus</column-name><column-value><![CDATA[");
		sb.append(getIlnessStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reasonOfDead</column-name><column-value><![CDATA[");
		sb.append(getReasonOfDead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personType</column-name><column-value><![CDATA[");
		sb.append(getPersonType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
	private String _name;
	private String _age;
	private String _nationalCode;
	private String _nationalName;
	private String _ilnessStatus;
	private String _reasonOfDead;
	private int _personType;
}