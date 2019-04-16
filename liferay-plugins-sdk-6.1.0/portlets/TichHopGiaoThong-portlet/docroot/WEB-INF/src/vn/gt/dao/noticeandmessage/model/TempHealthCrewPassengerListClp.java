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

import vn.gt.dao.noticeandmessage.service.TempHealthCrewPassengerListLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempHealthCrewPassengerListClp extends BaseModelImpl<TempHealthCrewPassengerList>
	implements TempHealthCrewPassengerList {
	public TempHealthCrewPassengerListClp() {
	}

	public Class<?> getModelClass() {
		return TempHealthCrewPassengerList.class;
	}

	public String getModelClassName() {
		return TempHealthCrewPassengerList.class.getName();
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

	public String getHealthCrewPassengerCode() {
		return _healthCrewPassengerCode;
	}

	public void setHealthCrewPassengerCode(String healthCrewPassengerCode) {
		_healthCrewPassengerCode = healthCrewPassengerCode;
	}

	public String getPassengerOrCrewCode() {
		return _passengerOrCrewCode;
	}

	public void setPassengerOrCrewCode(String passengerOrCrewCode) {
		_passengerOrCrewCode = passengerOrCrewCode;
	}

	public String getPassengerOrCrewName() {
		return _passengerOrCrewName;
	}

	public void setPassengerOrCrewName(String passengerOrCrewName) {
		_passengerOrCrewName = passengerOrCrewName;
	}

	public int getClassOrRating() {
		return _classOrRating;
	}

	public void setClassOrRating(int classOrRating) {
		_classOrRating = classOrRating;
	}

	public String getStateVisitedCode() {
		return _stateVisitedCode;
	}

	public void setStateVisitedCode(String stateVisitedCode) {
		_stateVisitedCode = stateVisitedCode;
	}

	public String getPortVisitedCode() {
		return _portVisitedCode;
	}

	public void setPortVisitedCode(String portVisitedCode) {
		_portVisitedCode = portVisitedCode;
	}

	public Date getFromDate() {
		return _fromDate;
	}

	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	public Date getToDate() {
		return _toDate;
	}

	public void setToDate(Date toDate) {
		_toDate = toDate;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempHealthCrewPassengerListLocalServiceUtil.addTempHealthCrewPassengerList(this);
		}
		else {
			TempHealthCrewPassengerListLocalServiceUtil.updateTempHealthCrewPassengerList(this);
		}
	}

	@Override
	public TempHealthCrewPassengerList toEscapedModel() {
		return (TempHealthCrewPassengerList)Proxy.newProxyInstance(TempHealthCrewPassengerList.class.getClassLoader(),
			new Class[] { TempHealthCrewPassengerList.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempHealthCrewPassengerListClp clone = new TempHealthCrewPassengerListClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setHealthCrewPassengerCode(getHealthCrewPassengerCode());
		clone.setPassengerOrCrewCode(getPassengerOrCrewCode());
		clone.setPassengerOrCrewName(getPassengerOrCrewName());
		clone.setClassOrRating(getClassOrRating());
		clone.setStateVisitedCode(getStateVisitedCode());
		clone.setPortVisitedCode(getPortVisitedCode());
		clone.setFromDate(getFromDate());
		clone.setToDate(getToDate());

		return clone;
	}

	public int compareTo(
		TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		int value = 0;

		if (getId() < tempHealthCrewPassengerList.getId()) {
			value = -1;
		}
		else if (getId() > tempHealthCrewPassengerList.getId()) {
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

		TempHealthCrewPassengerListClp tempHealthCrewPassengerList = null;

		try {
			tempHealthCrewPassengerList = (TempHealthCrewPassengerListClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempHealthCrewPassengerList.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", healthCrewPassengerCode=");
		sb.append(getHealthCrewPassengerCode());
		sb.append(", passengerOrCrewCode=");
		sb.append(getPassengerOrCrewCode());
		sb.append(", passengerOrCrewName=");
		sb.append(getPassengerOrCrewName());
		sb.append(", classOrRating=");
		sb.append(getClassOrRating());
		sb.append(", stateVisitedCode=");
		sb.append(getStateVisitedCode());
		sb.append(", portVisitedCode=");
		sb.append(getPortVisitedCode());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append(
			"vn.gt.dao.noticeandmessage.model.TempHealthCrewPassengerList");
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
			"<column><column-name>healthCrewPassengerCode</column-name><column-value><![CDATA[");
		sb.append(getHealthCrewPassengerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerOrCrewCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerOrCrewCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerOrCrewName</column-name><column-value><![CDATA[");
		sb.append(getPassengerOrCrewName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classOrRating</column-name><column-value><![CDATA[");
		sb.append(getClassOrRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateVisitedCode</column-name><column-value><![CDATA[");
		sb.append(getStateVisitedCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portVisitedCode</column-name><column-value><![CDATA[");
		sb.append(getPortVisitedCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _healthCrewPassengerCode;
	private String _passengerOrCrewCode;
	private String _passengerOrCrewName;
	private int _classOrRating;
	private String _stateVisitedCode;
	private String _portVisitedCode;
	private Date _fromDate;
	private Date _toDate;
}