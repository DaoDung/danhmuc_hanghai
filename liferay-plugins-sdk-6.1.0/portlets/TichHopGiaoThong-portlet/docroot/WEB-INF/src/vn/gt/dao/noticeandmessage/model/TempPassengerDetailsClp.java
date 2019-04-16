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

import vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempPassengerDetailsClp extends BaseModelImpl<TempPassengerDetails>
	implements TempPassengerDetails {
	public TempPassengerDetailsClp() {
	}

	public Class<?> getModelClass() {
		return TempPassengerDetails.class;
	}

	public String getModelClassName() {
		return TempPassengerDetails.class.getName();
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

	public String getPassengerCode() {
		return _passengerCode;
	}

	public void setPassengerCode(String passengerCode) {
		_passengerCode = passengerCode;
	}

	public String getFamilyName() {
		return _familyName;
	}

	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	public String getGivenName() {
		return _givenName;
	}

	public void setGivenName(String givenName) {
		_givenName = givenName;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
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

	public String getTypeOfIdentity() {
		return _typeOfIdentity;
	}

	public void setTypeOfIdentity(String typeOfIdentity) {
		_typeOfIdentity = typeOfIdentity;
	}

	public Date getPassportExpiredDate() {
		return _passportExpiredDate;
	}

	public void setPassportExpiredDate(Date passportExpiredDate) {
		_passportExpiredDate = passportExpiredDate;
	}

	public String getSerialNumberOfIdentity() {
		return _serialNumberOfIdentity;
	}

	public void setSerialNumberOfIdentity(String serialNumberOfIdentity) {
		_serialNumberOfIdentity = serialNumberOfIdentity;
	}

	public String getPortOfEmbarkation() {
		return _portOfEmbarkation;
	}

	public void setPortOfEmbarkation(String portOfEmbarkation) {
		_portOfEmbarkation = portOfEmbarkation;
	}

	public String getPortOfDisembarkation() {
		return _portOfDisembarkation;
	}

	public void setPortOfDisembarkation(String portOfDisembarkation) {
		_portOfDisembarkation = portOfDisembarkation;
	}

	public int getIsTransit() {
		return _isTransit;
	}

	public void setIsTransit(int isTransit) {
		_isTransit = isTransit;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempPassengerDetailsLocalServiceUtil.addTempPassengerDetails(this);
		}
		else {
			TempPassengerDetailsLocalServiceUtil.updateTempPassengerDetails(this);
		}
	}

	@Override
	public TempPassengerDetails toEscapedModel() {
		return (TempPassengerDetails)Proxy.newProxyInstance(TempPassengerDetails.class.getClassLoader(),
			new Class[] { TempPassengerDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempPassengerDetailsClp clone = new TempPassengerDetailsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setPassengerCode(getPassengerCode());
		clone.setFamilyName(getFamilyName());
		clone.setGivenName(getGivenName());
		clone.setNationality(getNationality());
		clone.setBirthDay(getBirthDay());
		clone.setBirthPlace(getBirthPlace());
		clone.setTypeOfIdentity(getTypeOfIdentity());
		clone.setPassportExpiredDate(getPassportExpiredDate());
		clone.setSerialNumberOfIdentity(getSerialNumberOfIdentity());
		clone.setPortOfEmbarkation(getPortOfEmbarkation());
		clone.setPortOfDisembarkation(getPortOfDisembarkation());
		clone.setIsTransit(getIsTransit());

		return clone;
	}

	public int compareTo(TempPassengerDetails tempPassengerDetails) {
		int value = 0;

		if (getId() < tempPassengerDetails.getId()) {
			value = -1;
		}
		else if (getId() > tempPassengerDetails.getId()) {
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

		TempPassengerDetailsClp tempPassengerDetails = null;

		try {
			tempPassengerDetails = (TempPassengerDetailsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempPassengerDetails.getPrimaryKey();

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
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", passengerCode=");
		sb.append(getPassengerCode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", birthPlace=");
		sb.append(getBirthPlace());
		sb.append(", typeOfIdentity=");
		sb.append(getTypeOfIdentity());
		sb.append(", passportExpiredDate=");
		sb.append(getPassportExpiredDate());
		sb.append(", serialNumberOfIdentity=");
		sb.append(getSerialNumberOfIdentity());
		sb.append(", portOfEmbarkation=");
		sb.append(getPortOfEmbarkation());
		sb.append(", portOfDisembarkation=");
		sb.append(getPortOfDisembarkation());
		sb.append(", isTransit=");
		sb.append(getIsTransit());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempPassengerDetails");
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
			"<column><column-name>passengerCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
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
			"<column><column-name>typeOfIdentity</column-name><column-value><![CDATA[");
		sb.append(getTypeOfIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportExpiredDate</column-name><column-value><![CDATA[");
		sb.append(getPassportExpiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serialNumberOfIdentity</column-name><column-value><![CDATA[");
		sb.append(getSerialNumberOfIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfEmbarkation</column-name><column-value><![CDATA[");
		sb.append(getPortOfEmbarkation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfDisembarkation</column-name><column-value><![CDATA[");
		sb.append(getPortOfDisembarkation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isTransit</column-name><column-value><![CDATA[");
		sb.append(getIsTransit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _passengerCode;
	private String _familyName;
	private String _givenName;
	private String _nationality;
	private Date _birthDay;
	private String _birthPlace;
	private String _typeOfIdentity;
	private Date _passportExpiredDate;
	private String _serialNumberOfIdentity;
	private String _portOfEmbarkation;
	private String _portOfDisembarkation;
	private int _isTransit;
}