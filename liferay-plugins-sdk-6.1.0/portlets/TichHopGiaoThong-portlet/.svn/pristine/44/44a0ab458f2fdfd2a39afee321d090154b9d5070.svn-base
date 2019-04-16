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

import vn.gt.dao.danhmuc.service.DmShipAgencyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmShipAgencyClp extends BaseModelImpl<DmShipAgency>
	implements DmShipAgency {
	public DmShipAgencyClp() {
	}

	public Class<?> getModelClass() {
		return DmShipAgency.class;
	}

	public String getModelClassName() {
		return DmShipAgency.class.getName();
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

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
	}

	public String getShipAgencyName() {
		return _shipAgencyName;
	}

	public void setShipAgencyName(String shipAgencyName) {
		_shipAgencyName = shipAgencyName;
	}

	public String getShipAgencyNameVN() {
		return _shipAgencyNameVN;
	}

	public void setShipAgencyNameVN(String shipAgencyNameVN) {
		_shipAgencyNameVN = shipAgencyNameVN;
	}

	public String getTaxCode() {
		return _taxCode;
	}

	public void setTaxCode(String taxCode) {
		_taxCode = taxCode;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getCitycode() {
		return _citycode;
	}

	public void setCitycode(String citycode) {
		_citycode = citycode;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddressVN() {
		return _addressVN;
	}

	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getContacter() {
		return _contacter;
	}

	public void setContacter(String contacter) {
		_contacter = contacter;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getContactTell() {
		return _contactTell;
	}

	public void setContactTell(String contactTell) {
		_contactTell = contactTell;
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
		DmShipAgencyLocalServiceUtil.updateDmShipAgency(this);
	}

	@Override
	public DmShipAgency toEscapedModel() {
		return (DmShipAgency)Proxy.newProxyInstance(DmShipAgency.class.getClassLoader(),
			new Class[] { DmShipAgency.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmShipAgencyClp clone = new DmShipAgencyClp();

		clone.setId(getId());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setShipAgencyName(getShipAgencyName());
		clone.setShipAgencyNameVN(getShipAgencyNameVN());
		clone.setTaxCode(getTaxCode());
		clone.setStateCode(getStateCode());
		clone.setCitycode(getCitycode());
		clone.setAddress(getAddress());
		clone.setAddressVN(getAddressVN());
		clone.setPhone(getPhone());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setDescription(getDescription());
		clone.setContacter(getContacter());
		clone.setPosition(getPosition());
		clone.setContactTell(getContactTell());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmShipAgency dmShipAgency) {
		int value = 0;

		if (getId() < dmShipAgency.getId()) {
			value = -1;
		}
		else if (getId() > dmShipAgency.getId()) {
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

		DmShipAgencyClp dmShipAgency = null;

		try {
			dmShipAgency = (DmShipAgencyClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmShipAgency.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", shipAgencyName=");
		sb.append(getShipAgencyName());
		sb.append(", shipAgencyNameVN=");
		sb.append(getShipAgencyNameVN());
		sb.append(", taxCode=");
		sb.append(getTaxCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contacter=");
		sb.append(getContacter());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", contactTell=");
		sb.append(getContactTell());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmShipAgency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyName</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyNameVN</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxCode</column-name><column-value><![CDATA[");
		sb.append(getTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contacter</column-name><column-value><![CDATA[");
		sb.append(getContacter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactTell</column-name><column-value><![CDATA[");
		sb.append(getContactTell());
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
	private String _shipAgencyCode;
	private String _shipAgencyName;
	private String _shipAgencyNameVN;
	private String _taxCode;
	private String _stateCode;
	private String _citycode;
	private String _address;
	private String _addressVN;
	private String _phone;
	private String _fax;
	private String _email;
	private String _description;
	private String _contacter;
	private String _position;
	private String _contactTell;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}