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

import vn.gt.dao.danhmuc.service.DmHistoryEnterriseLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmHistoryEnterriseClp extends BaseModelImpl<DmHistoryEnterrise>
	implements DmHistoryEnterrise {
	public DmHistoryEnterriseClp() {
	}

	public Class<?> getModelClass() {
		return DmHistoryEnterrise.class;
	}

	public String getModelClassName() {
		return DmHistoryEnterrise.class.getName();
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

	public String getEnterpriseCode() {
		return _enterpriseCode;
	}

	public void setEnterpriseCode(String enterpriseCode) {
		_enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseTaxCode() {
		return _enterpriseTaxCode;
	}

	public void setEnterpriseTaxCode(String enterpriseTaxCode) {
		_enterpriseTaxCode = enterpriseTaxCode;
	}

	public String getEnterpriseName() {
		return _enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		_enterpriseName = enterpriseName;
	}

	public String getEnterpriseShortName() {
		return _enterpriseShortName;
	}

	public void setEnterpriseShortName(String enterpriseShortName) {
		_enterpriseShortName = enterpriseShortName;
	}

	public String getEnterpriseForeignName() {
		return _enterpriseForeignName;
	}

	public void setEnterpriseForeignName(String enterpriseForeignName) {
		_enterpriseForeignName = enterpriseForeignName;
	}

	public String getEnterprisePerson() {
		return _enterprisePerson;
	}

	public void setEnterprisePerson(String enterprisePerson) {
		_enterprisePerson = enterprisePerson;
	}

	public String getEnterpriseHOAddress() {
		return _enterpriseHOAddress;
	}

	public void setEnterpriseHOAddress(String enterpriseHOAddress) {
		_enterpriseHOAddress = enterpriseHOAddress;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getCityCode() {
		return _cityCode;
	}

	public void setCityCode(String cityCode) {
		_cityCode = cityCode;
	}

	public String getDistrictCode() {
		return _districtCode;
	}

	public void setDistrictCode(String districtCode) {
		_districtCode = districtCode;
	}

	public String getWardCode() {
		return _wardCode;
	}

	public void setWardCode(String wardCode) {
		_wardCode = wardCode;
	}

	public String getTelephoneNo() {
		return _telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		_telephoneNo = telephoneNo;
	}

	public String getRegistrationCode() {
		return _registrationCode;
	}

	public void setRegistrationCode(String registrationCode) {
		_registrationCode = registrationCode;
	}

	public String getRegistrationAddress() {
		return _registrationAddress;
	}

	public void setRegistrationAddress(String registrationAddress) {
		_registrationAddress = registrationAddress;
	}

	public Date getRegistrationDate() {
		return _registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		_registrationDate = registrationDate;
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

	public String getModifiedUser() {
		return _modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryEnterriseLocalServiceUtil.addDmHistoryEnterrise(this);
		}
		else {
			DmHistoryEnterriseLocalServiceUtil.updateDmHistoryEnterrise(this);
		}
	}

	@Override
	public DmHistoryEnterrise toEscapedModel() {
		return (DmHistoryEnterrise)Proxy.newProxyInstance(DmHistoryEnterrise.class.getClassLoader(),
			new Class[] { DmHistoryEnterrise.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryEnterriseClp clone = new DmHistoryEnterriseClp();

		clone.setId(getId());
		clone.setEnterpriseCode(getEnterpriseCode());
		clone.setEnterpriseTaxCode(getEnterpriseTaxCode());
		clone.setEnterpriseName(getEnterpriseName());
		clone.setEnterpriseShortName(getEnterpriseShortName());
		clone.setEnterpriseForeignName(getEnterpriseForeignName());
		clone.setEnterprisePerson(getEnterprisePerson());
		clone.setEnterpriseHOAddress(getEnterpriseHOAddress());
		clone.setStateCode(getStateCode());
		clone.setCityCode(getCityCode());
		clone.setDistrictCode(getDistrictCode());
		clone.setWardCode(getWardCode());
		clone.setTelephoneNo(getTelephoneNo());
		clone.setRegistrationCode(getRegistrationCode());
		clone.setRegistrationAddress(getRegistrationAddress());
		clone.setRegistrationDate(getRegistrationDate());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());
		clone.setModifiedUser(getModifiedUser());

		return clone;
	}

	public int compareTo(DmHistoryEnterrise dmHistoryEnterrise) {
		int value = 0;

		if (getId() < dmHistoryEnterrise.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryEnterrise.getId()) {
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

		DmHistoryEnterriseClp dmHistoryEnterrise = null;

		try {
			dmHistoryEnterrise = (DmHistoryEnterriseClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryEnterrise.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", enterpriseCode=");
		sb.append(getEnterpriseCode());
		sb.append(", enterpriseTaxCode=");
		sb.append(getEnterpriseTaxCode());
		sb.append(", enterpriseName=");
		sb.append(getEnterpriseName());
		sb.append(", enterpriseShortName=");
		sb.append(getEnterpriseShortName());
		sb.append(", enterpriseForeignName=");
		sb.append(getEnterpriseForeignName());
		sb.append(", enterprisePerson=");
		sb.append(getEnterprisePerson());
		sb.append(", enterpriseHOAddress=");
		sb.append(getEnterpriseHOAddress());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", cityCode=");
		sb.append(getCityCode());
		sb.append(", districtCode=");
		sb.append(getDistrictCode());
		sb.append(", wardCode=");
		sb.append(getWardCode());
		sb.append(", telephoneNo=");
		sb.append(getTelephoneNo());
		sb.append(", registrationCode=");
		sb.append(getRegistrationCode());
		sb.append(", registrationAddress=");
		sb.append(getRegistrationAddress());
		sb.append(", registrationDate=");
		sb.append(getRegistrationDate());
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
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryEnterrise");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseTaxCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseShortName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseForeignName</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseForeignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterprisePerson</column-name><column-value><![CDATA[");
		sb.append(getEnterprisePerson());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseHOAddress</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseHOAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cityCode</column-name><column-value><![CDATA[");
		sb.append(getCityCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>districtCode</column-name><column-value><![CDATA[");
		sb.append(getDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wardCode</column-name><column-value><![CDATA[");
		sb.append(getWardCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telephoneNo</column-name><column-value><![CDATA[");
		sb.append(getTelephoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationCode</column-name><column-value><![CDATA[");
		sb.append(getRegistrationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationAddress</column-name><column-value><![CDATA[");
		sb.append(getRegistrationAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationDate</column-name><column-value><![CDATA[");
		sb.append(getRegistrationDate());
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
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _id;
	private String _enterpriseCode;
	private String _enterpriseTaxCode;
	private String _enterpriseName;
	private String _enterpriseShortName;
	private String _enterpriseForeignName;
	private String _enterprisePerson;
	private String _enterpriseHOAddress;
	private String _stateCode;
	private String _cityCode;
	private String _districtCode;
	private String _wardCode;
	private String _telephoneNo;
	private String _registrationCode;
	private String _registrationAddress;
	private Date _registrationDate;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _modifiedUser;
}