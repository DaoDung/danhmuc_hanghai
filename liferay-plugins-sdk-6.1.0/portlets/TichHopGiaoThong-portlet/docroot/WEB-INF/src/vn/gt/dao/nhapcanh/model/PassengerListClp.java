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

import vn.gt.dao.nhapcanh.service.PassengerListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class PassengerListClp extends BaseModelImpl<PassengerList>
	implements PassengerList {
	public PassengerListClp() {
	}

	public Class<?> getModelClass() {
		return PassengerList.class;
	}

	public String getModelClassName() {
		return PassengerList.class.getName();
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

	public String getPassengerCode() {
		return _passengerCode;
	}

	public void setPassengerCode(String passengerCode) {
		_passengerCode = passengerCode;
	}

	public String getDocumentNo() {
		return _documentNo;
	}

	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
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

	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;
	}

	public String getPassPortNo() {
		return _passPortNo;
	}

	public void setPassPortNo(String passPortNo) {
		_passPortNo = passPortNo;
	}

	public String getPortCheckInCode() {
		return _portCheckInCode;
	}

	public void setPortCheckInCode(String portCheckInCode) {
		_portCheckInCode = portCheckInCode;
	}

	public String getPortCheckOutCode() {
		return _portCheckOutCode;
	}

	public void setPortCheckOutCode(String portCheckOutCode) {
		_portCheckOutCode = portCheckOutCode;
	}

	public boolean getIsTransit() {
		return _isTransit;
	}

	public boolean isIsTransit() {
		return _isTransit;
	}

	public void setIsTransit(boolean isTransit) {
		_isTransit = isTransit;
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
			PassengerListLocalServiceUtil.addPassengerList(this);
		}
		else {
			PassengerListLocalServiceUtil.updatePassengerList(this);
		}
	}

	@Override
	public PassengerList toEscapedModel() {
		return (PassengerList)Proxy.newProxyInstance(PassengerList.class.getClassLoader(),
			new Class[] { PassengerList.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PassengerListClp clone = new PassengerListClp();

		clone.setId(getId());
		clone.setPassengerCode(getPassengerCode());
		clone.setDocumentNo(getDocumentNo());
		clone.setFullName(getFullName());
		clone.setStateCode(getStateCode());
		clone.setBirthDay(getBirthDay());
		clone.setBirthPlace(getBirthPlace());
		clone.setPassportTypeCode(getPassportTypeCode());
		clone.setPassPortNo(getPassPortNo());
		clone.setPortCheckInCode(getPortCheckInCode());
		clone.setPortCheckOutCode(getPortCheckOutCode());
		clone.setIsTransit(getIsTransit());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	public int compareTo(PassengerList passengerList) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				passengerList.getCreateDate());

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

		PassengerListClp passengerList = null;

		try {
			passengerList = (PassengerListClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = passengerList.getPrimaryKey();

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
		sb.append(", passengerCode=");
		sb.append(getPassengerCode());
		sb.append(", documentNo=");
		sb.append(getDocumentNo());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", birthPlace=");
		sb.append(getBirthPlace());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append(", passPortNo=");
		sb.append(getPassPortNo());
		sb.append(", portCheckInCode=");
		sb.append(getPortCheckInCode());
		sb.append(", portCheckOutCode=");
		sb.append(getPortCheckOutCode());
		sb.append(", isTransit=");
		sb.append(getIsTransit());
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
		sb.append("vn.gt.dao.nhapcanh.model.PassengerList");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentNo</column-name><column-value><![CDATA[");
		sb.append(getDocumentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
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
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passPortNo</column-name><column-value><![CDATA[");
		sb.append(getPassPortNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCheckInCode</column-name><column-value><![CDATA[");
		sb.append(getPortCheckInCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCheckOutCode</column-name><column-value><![CDATA[");
		sb.append(getPortCheckOutCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isTransit</column-name><column-value><![CDATA[");
		sb.append(getIsTransit());
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
	private String _passengerCode;
	private String _documentNo;
	private String _fullName;
	private String _stateCode;
	private Date _birthDay;
	private String _birthPlace;
	private String _passportTypeCode;
	private String _passPortNo;
	private String _portCheckInCode;
	private String _portCheckOutCode;
	private boolean _isTransit;
	private Date _createDate;
	private Date _modifyDate;
}