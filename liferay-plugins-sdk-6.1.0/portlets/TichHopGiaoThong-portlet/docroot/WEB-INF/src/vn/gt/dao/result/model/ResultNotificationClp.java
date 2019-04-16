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

package vn.gt.dao.result.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.result.service.ResultNotificationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class ResultNotificationClp extends BaseModelImpl<ResultNotification>
	implements ResultNotification {
	public ResultNotificationClp() {
	}

	public Class<?> getModelClass() {
		return ResultNotification.class;
	}

	public String getModelClassName() {
		return ResultNotification.class.getName();
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

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
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

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public long getRole() {
		return _role;
	}

	public void setRole(long role) {
		_role = role;
	}

	public String getResponse() {
		return _response;
	}

	public void setResponse(String response) {
		_response = response;
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

	public String getOfficerName() {
		return _officerName;
	}

	public void setOfficerName(String officerName) {
		_officerName = officerName;
	}

	public String getLatestDate() {
		return _latestDate;
	}

	public void setLatestDate(String latestDate) {
		_latestDate = latestDate;
	}

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public int getIsReply() {
		return _isReply;
	}

	public void setIsReply(int isReply) {
		_isReply = isReply;
	}

	public Date getResponseTime() {
		return _responseTime;
	}

	public void setResponseTime(Date responseTime) {
		_responseTime = responseTime;
	}

	public void persist() throws SystemException {
		ResultNotificationLocalServiceUtil.updateResultNotification(this);
	}

	@Override
	public ResultNotification toEscapedModel() {
		return (ResultNotification)Proxy.newProxyInstance(ResultNotification.class.getClassLoader(),
			new Class[] { ResultNotification.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultNotificationClp clone = new ResultNotificationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setRole(getRole());
		clone.setResponse(getResponse());
		clone.setOrganization(getOrganization());
		clone.setDivision(getDivision());
		clone.setOfficerName(getOfficerName());
		clone.setLatestDate(getLatestDate());
		clone.setBusinessTypeCode(getBusinessTypeCode());
		clone.setRemarks(getRemarks());
		clone.setIsReply(getIsReply());
		clone.setResponseTime(getResponseTime());

		return clone;
	}

	public int compareTo(ResultNotification resultNotification) {
		int value = 0;

		if (getId() < resultNotification.getId()) {
			value = -1;
		}
		else if (getId() > resultNotification.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		ResultNotificationClp resultNotification = null;

		try {
			resultNotification = (ResultNotificationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = resultNotification.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", role=");
		sb.append(getRole());
		sb.append(", response=");
		sb.append(getResponse());
		sb.append(", organization=");
		sb.append(getOrganization());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", officerName=");
		sb.append(getOfficerName());
		sb.append(", latestDate=");
		sb.append(getLatestDate());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", isReply=");
		sb.append(getIsReply());
		sb.append(", responseTime=");
		sb.append(getResponseTime());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.result.model.ResultNotification");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
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
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>role</column-name><column-value><![CDATA[");
		sb.append(getRole());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>response</column-name><column-value><![CDATA[");
		sb.append(getResponse());
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
			"<column><column-name>officerName</column-name><column-value><![CDATA[");
		sb.append(getOfficerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestDate</column-name><column-value><![CDATA[");
		sb.append(getLatestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isReply</column-name><column-value><![CDATA[");
		sb.append(getIsReply());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTime</column-name><column-value><![CDATA[");
		sb.append(getResponseTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _maritimeCode;
	private long _role;
	private String _response;
	private String _organization;
	private String _division;
	private String _officerName;
	private String _latestDate;
	private int _businessTypeCode;
	private String _remarks;
	private int _isReply;
	private Date _responseTime;
}