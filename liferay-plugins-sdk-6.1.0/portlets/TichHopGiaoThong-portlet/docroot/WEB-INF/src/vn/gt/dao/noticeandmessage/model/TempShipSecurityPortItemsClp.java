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

import vn.gt.dao.noticeandmessage.service.TempShipSecurityPortItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempShipSecurityPortItemsClp extends BaseModelImpl<TempShipSecurityPortItems>
	implements TempShipSecurityPortItems {
	public TempShipSecurityPortItemsClp() {
	}

	public Class<?> getModelClass() {
		return TempShipSecurityPortItems.class;
	}

	public String getModelClassName() {
		return TempShipSecurityPortItems.class.getName();
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

	public String getShipSecurityPortItemCode() {
		return _shipSecurityPortItemCode;
	}

	public void setShipSecurityPortItemCode(String shipSecurityPortItemCode) {
		_shipSecurityPortItemCode = shipSecurityPortItemCode;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public Date getDateArrival() {
		return _dateArrival;
	}

	public void setDateArrival(Date dateArrival) {
		_dateArrival = dateArrival;
	}

	public Date getDateDeparture() {
		return _dateDeparture;
	}

	public void setDateDeparture(Date dateDeparture) {
		_dateDeparture = dateDeparture;
	}

	public String getSecurityLevelCode() {
		return _securityLevelCode;
	}

	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipSecurityPortItemsLocalServiceUtil.addTempShipSecurityPortItems(this);
		}
		else {
			TempShipSecurityPortItemsLocalServiceUtil.updateTempShipSecurityPortItems(this);
		}
	}

	@Override
	public TempShipSecurityPortItems toEscapedModel() {
		return (TempShipSecurityPortItems)Proxy.newProxyInstance(TempShipSecurityPortItems.class.getClassLoader(),
			new Class[] { TempShipSecurityPortItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipSecurityPortItemsClp clone = new TempShipSecurityPortItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setShipSecurityPortItemCode(getShipSecurityPortItemCode());
		clone.setPortCode(getPortCode());
		clone.setDateArrival(getDateArrival());
		clone.setDateDeparture(getDateDeparture());
		clone.setSecurityLevelCode(getSecurityLevelCode());

		return clone;
	}

	public int compareTo(TempShipSecurityPortItems tempShipSecurityPortItems) {
		int value = 0;

		if (getId() < tempShipSecurityPortItems.getId()) {
			value = -1;
		}
		else if (getId() > tempShipSecurityPortItems.getId()) {
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

		TempShipSecurityPortItemsClp tempShipSecurityPortItems = null;

		try {
			tempShipSecurityPortItems = (TempShipSecurityPortItemsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempShipSecurityPortItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", shipSecurityPortItemCode=");
		sb.append(getShipSecurityPortItemCode());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", dateArrival=");
		sb.append(getDateArrival());
		sb.append(", dateDeparture=");
		sb.append(getDateDeparture());
		sb.append(", securityLevelCode=");
		sb.append(getSecurityLevelCode());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItems");
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
			"<column><column-name>shipSecurityPortItemCode</column-name><column-value><![CDATA[");
		sb.append(getShipSecurityPortItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateArrival</column-name><column-value><![CDATA[");
		sb.append(getDateArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateDeparture</column-name><column-value><![CDATA[");
		sb.append(getDateDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelCode</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _shipSecurityPortItemCode;
	private String _portCode;
	private Date _dateArrival;
	private Date _dateDeparture;
	private String _securityLevelCode;
}