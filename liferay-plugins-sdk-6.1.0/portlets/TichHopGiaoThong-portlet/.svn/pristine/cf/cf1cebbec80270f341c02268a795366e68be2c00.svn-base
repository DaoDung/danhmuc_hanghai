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

import vn.gt.dao.noticeandmessage.service.TempCrewDetailsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempCrewDetailsClp extends BaseModelImpl<TempCrewDetails>
	implements TempCrewDetails {
	public TempCrewDetailsClp() {
	}

	public Class<?> getModelClass() {
		return TempCrewDetails.class;
	}

	public String getModelClassName() {
		return TempCrewDetails.class.getName();
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

	public String getCrewcode() {
		return _crewcode;
	}

	public void setCrewcode(String crewcode) {
		_crewcode = crewcode;
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

	public String getRankCode() {
		return _rankCode;
	}

	public void setRankCode(String rankCode) {
		_rankCode = rankCode;
	}

	public String getNationality() {
		return _nationality;
	}

	public void setNationality(String nationality) {
		_nationality = nationality;
	}

	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return _placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;
	}

	public String getPassportNumber() {
		return _passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		_passportNumber = passportNumber;
	}

	public String getPassportTypeCode() {
		return _passportTypeCode;
	}

	public void setPassportTypeCode(String passportTypeCode) {
		_passportTypeCode = passportTypeCode;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCrewDetailsLocalServiceUtil.addTempCrewDetails(this);
		}
		else {
			TempCrewDetailsLocalServiceUtil.updateTempCrewDetails(this);
		}
	}

	@Override
	public TempCrewDetails toEscapedModel() {
		return (TempCrewDetails)Proxy.newProxyInstance(TempCrewDetails.class.getClassLoader(),
			new Class[] { TempCrewDetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCrewDetailsClp clone = new TempCrewDetailsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setCrewcode(getCrewcode());
		clone.setFamilyName(getFamilyName());
		clone.setGivenName(getGivenName());
		clone.setRankCode(getRankCode());
		clone.setNationality(getNationality());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setPlaceOfBirth(getPlaceOfBirth());
		clone.setPassportNumber(getPassportNumber());
		clone.setPassportTypeCode(getPassportTypeCode());

		return clone;
	}

	public int compareTo(TempCrewDetails tempCrewDetails) {
		int value = 0;

		if (getId() < tempCrewDetails.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewDetails.getId()) {
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

		TempCrewDetailsClp tempCrewDetails = null;

		try {
			tempCrewDetails = (TempCrewDetailsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempCrewDetails.getPrimaryKey();

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
		sb.append(", crewcode=");
		sb.append(getCrewcode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", rankCode=");
		sb.append(getRankCode());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", placeOfBirth=");
		sb.append(getPlaceOfBirth());
		sb.append(", passportNumber=");
		sb.append(getPassportNumber());
		sb.append(", passportTypeCode=");
		sb.append(getPassportTypeCode());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempCrewDetails");
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
			"<column><column-name>crewcode</column-name><column-value><![CDATA[");
		sb.append(getCrewcode());
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
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeOfBirth</column-name><column-value><![CDATA[");
		sb.append(getPlaceOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportNumber</column-name><column-value><![CDATA[");
		sb.append(getPassportNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passportTypeCode</column-name><column-value><![CDATA[");
		sb.append(getPassportTypeCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _crewcode;
	private String _familyName;
	private String _givenName;
	private String _rankCode;
	private String _nationality;
	private Date _dateOfBirth;
	private String _placeOfBirth;
	private String _passportNumber;
	private String _passportTypeCode;
}