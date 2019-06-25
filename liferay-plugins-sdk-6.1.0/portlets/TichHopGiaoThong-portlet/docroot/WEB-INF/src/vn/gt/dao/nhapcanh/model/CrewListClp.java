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

package vn.gt.dao.nhapcanh.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.nhapcanh.service.CrewListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class CrewListClp extends BaseModelImpl<CrewList> implements CrewList {
	public CrewListClp() {
	}

	public Class<?> getModelClass() {
		return CrewList.class;
	}

	public String getModelClassName() {
		return CrewList.class.getName();
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

	public String getCrewCode() {
		return _crewCode;
	}

	public void setCrewCode(String crewCode) {
		_crewCode = crewCode;
	}

	public String getDocumentNo() {
		return _documentNo;
	}

	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public Date getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	public String getBirthPlace() {
		return _birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		_birthPlace = birthPlace;
	}

	public String getFamilyName() {
		return _familyName;
	}

	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getGivenName() {
		return _givenName;
	}

	public void setGivenName(String givenName) {
		_givenName = givenName;
	}

	public String getPassportNumber() {
		return _passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		_passportNumber = passportNumber;
	}

	public String getPassportType() {
		return _passportType;
	}

	public void setPassportType(String passportType) {
		_passportType = passportType;
	}

	public String getRankCode() {
		return _rankCode;
	}

	public void setRankCode(String rankCode) {
		_rankCode = rankCode;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			CrewListLocalServiceUtil.addCrewList(this);
		}
		else {
			CrewListLocalServiceUtil.updateCrewList(this);
		}
	}

	@Override
	public CrewList toEscapedModel() {
		return (CrewList)Proxy.newProxyInstance(CrewList.class.getClassLoader(),
			new Class[] { CrewList.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CrewListClp clone = new CrewListClp();

		clone.setId(getId());
		clone.setCrewCode(getCrewCode());
		clone.setDocumentNo(getDocumentNo());
		clone.setStateCode(getStateCode());
		clone.setBirthDay(getBirthDay());
		clone.setBirthPlace(getBirthPlace());
		clone.setFamilyName(getFamilyName());
		clone.setFullName(getFullName());
		clone.setGivenName(getGivenName());
		clone.setPassportNumber(getPassportNumber());
		clone.setPassportType(getPassportType());
		clone.setRankCode(getRankCode());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	public int compareTo(CrewList crewList) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), crewList.getCreateDate());

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

		CrewListClp crewList = null;

		try {
			crewList = (CrewListClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = crewList.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", crewCode=");
		sb.append(getCrewCode());
		sb.append(", documentNo=");
		sb.append(getDocumentNo());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", birthPlace=");
		sb.append(getBirthPlace());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", passportNumber=");
		sb.append(getPassportNumber());
		sb.append(", passportType=");
		sb.append(getPassportType());
		sb.append(", rankCode=");
		sb.append(getRankCode());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.nhapcanh.model.CrewList");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewCode</column-name><column-value><![CDATA[");
		sb.append(getCrewCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentNo</column-name><column-value><![CDATA[");
		sb.append(getDocumentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDay</column-name><column-value><![CDATA[");
		sb.append(getBirthDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthPlace</column-name><column-value><![CDATA[");
		sb.append(getBirthPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportNumber</column-name><column-value><![CDATA[");
		sb.append(getPassportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportType</column-name><column-value><![CDATA[");
		sb.append(getPassportType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _crewCode;
	private String _documentNo;
	private String _stateCode;
	private Date _birthDay;
	private String _birthPlace;
	private String _familyName;
	private String _fullName;
	private String _givenName;
	private String _passportNumber;
	private String _passportType;
	private String _rankCode;
	private Date _createDate;
	private Date _modifyDate;
}