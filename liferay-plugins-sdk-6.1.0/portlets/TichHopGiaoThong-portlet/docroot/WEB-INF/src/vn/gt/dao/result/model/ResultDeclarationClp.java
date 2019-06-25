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

import vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class ResultDeclarationClp extends BaseModelImpl<ResultDeclaration>
	implements ResultDeclaration {
	public ResultDeclarationClp() {
	}

	public Class<?> getModelClass() {
		return ResultDeclaration.class;
	}

	public String getModelClassName() {
		return ResultDeclaration.class.getName();
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

	public int getBusinessOrder() {
		return _businessOrder;
	}

	public void setBusinessOrder(int businessOrder) {
		_businessOrder = businessOrder;
	}

	public int getBusinessTypeCode() {
		return _businessTypeCode;
	}

	public void setBusinessTypeCode(int businessTypeCode) {
		_businessTypeCode = businessTypeCode;
	}

	public int getLatestSend() {
		return _latestSend;
	}

	public void setLatestSend(int latestSend) {
		_latestSend = latestSend;
	}

	public Date getDeclarationTime() {
		return _declarationTime;
	}

	public void setDeclarationTime(Date declarationTime) {
		_declarationTime = declarationTime;
	}

	public Date getArrivalDepartureTime() {
		return _arrivalDepartureTime;
	}

	public void setArrivalDepartureTime(Date arrivalDepartureTime) {
		_arrivalDepartureTime = arrivalDepartureTime;
	}

	public String getRemainingTime() {
		return _remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		_remainingTime = remainingTime;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ResultDeclarationLocalServiceUtil.addResultDeclaration(this);
		}
		else {
			ResultDeclarationLocalServiceUtil.updateResultDeclaration(this);
		}
	}

	@Override
	public ResultDeclaration toEscapedModel() {
		return (ResultDeclaration)Proxy.newProxyInstance(ResultDeclaration.class.getClassLoader(),
			new Class[] { ResultDeclaration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultDeclarationClp clone = new ResultDeclarationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setBusinessOrder(getBusinessOrder());
		clone.setBusinessTypeCode(getBusinessTypeCode());
		clone.setLatestSend(getLatestSend());
		clone.setDeclarationTime(getDeclarationTime());
		clone.setArrivalDepartureTime(getArrivalDepartureTime());
		clone.setRemainingTime(getRemainingTime());
		clone.setRemarks(getRemarks());

		return clone;
	}

	public int compareTo(ResultDeclaration resultDeclaration) {
		int value = 0;

		if (getId() < resultDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > resultDeclaration.getId()) {
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

		ResultDeclarationClp resultDeclaration = null;

		try {
			resultDeclaration = (ResultDeclarationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = resultDeclaration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

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
		sb.append(", businessOrder=");
		sb.append(getBusinessOrder());
		sb.append(", businessTypeCode=");
		sb.append(getBusinessTypeCode());
		sb.append(", latestSend=");
		sb.append(getLatestSend());
		sb.append(", declarationTime=");
		sb.append(getDeclarationTime());
		sb.append(", arrivalDepartureTime=");
		sb.append(getArrivalDepartureTime());
		sb.append(", remainingTime=");
		sb.append(getRemainingTime());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.result.model.ResultDeclaration");
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
			"<column><column-name>businessOrder</column-name><column-value><![CDATA[");
		sb.append(getBusinessOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessTypeCode</column-name><column-value><![CDATA[");
		sb.append(getBusinessTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latestSend</column-name><column-value><![CDATA[");
		sb.append(getLatestSend());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>declarationTime</column-name><column-value><![CDATA[");
		sb.append(getDeclarationTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDepartureTime</column-name><column-value><![CDATA[");
		sb.append(getArrivalDepartureTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remainingTime</column-name><column-value><![CDATA[");
		sb.append(getRemainingTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private int _businessOrder;
	private int _businessTypeCode;
	private int _latestSend;
	private Date _declarationTime;
	private Date _arrivalDepartureTime;
	private String _remainingTime;
	private String _remarks;
}