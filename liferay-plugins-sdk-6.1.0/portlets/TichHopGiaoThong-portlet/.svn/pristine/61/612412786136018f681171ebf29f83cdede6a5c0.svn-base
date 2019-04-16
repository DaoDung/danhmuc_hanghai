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

import vn.gt.dao.noticeandmessage.service.HistoryInterfaceRequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class HistoryInterfaceRequestClp extends BaseModelImpl<HistoryInterfaceRequest>
	implements HistoryInterfaceRequest {
	public HistoryInterfaceRequestClp() {
	}

	public Class<?> getModelClass() {
		return HistoryInterfaceRequest.class;
	}

	public String getModelClassName() {
		return HistoryInterfaceRequest.class.getName();
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

	public String getOrganizationCode() {
		return _organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		_organizationCode = organizationCode;
	}

	public String getLocCode() {
		return _locCode;
	}

	public void setLocCode(String locCode) {
		_locCode = locCode;
	}

	public Date getRequestDate() {
		return _requestDate;
	}

	public void setRequestDate(Date requestDate) {
		_requestDate = requestDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getRequestDirection() {
		return _requestDirection;
	}

	public void setRequestDirection(String requestDirection) {
		_requestDirection = requestDirection;
	}

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	public Date getRequestResponseTime() {
		return _requestResponseTime;
	}

	public void setRequestResponseTime(Date requestResponseTime) {
		_requestResponseTime = requestResponseTime;
	}

	public String getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	public String getBusinessType() {
		return _businessType;
	}

	public void setBusinessType(String businessType) {
		_businessType = businessType;
	}

	public String getFunctionType() {
		return _functionType;
	}

	public void setFunctionType(String functionType) {
		_functionType = functionType;
	}

	public String getRequestContent() {
		return _requestContent;
	}

	public void setRequestContent(String requestContent) {
		_requestContent = requestContent;
	}

	public String getSenderName() {
		return _senderName;
	}

	public void setSenderName(String senderName) {
		_senderName = senderName;
	}

	public String getRequestVersion() {
		return _requestVersion;
	}

	public void setRequestVersion(String requestVersion) {
		_requestVersion = requestVersion;
	}

	public String getSenderIdentify() {
		return _senderIdentify;
	}

	public void setSenderIdentify(String senderIdentify) {
		_senderIdentify = senderIdentify;
	}

	public String getReceiverName() {
		return _receiverName;
	}

	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;
	}

	public Date getSendingDate() {
		return _sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		_sendingDate = sendingDate;
	}

	public String getReceiverIdentify() {
		return _receiverIdentify;
	}

	public void setReceiverIdentify(String receiverIdentify) {
		_receiverIdentify = receiverIdentify;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			HistoryInterfaceRequestLocalServiceUtil.addHistoryInterfaceRequest(this);
		}
		else {
			HistoryInterfaceRequestLocalServiceUtil.updateHistoryInterfaceRequest(this);
		}
	}

	@Override
	public HistoryInterfaceRequest toEscapedModel() {
		return (HistoryInterfaceRequest)Proxy.newProxyInstance(HistoryInterfaceRequest.class.getClassLoader(),
			new Class[] { HistoryInterfaceRequest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistoryInterfaceRequestClp clone = new HistoryInterfaceRequestClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setOrganizationCode(getOrganizationCode());
		clone.setLocCode(getLocCode());
		clone.setRequestDate(getRequestDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setRequestDirection(getRequestDirection());
		clone.setRequestState(getRequestState());
		clone.setRequestResponseTime(getRequestResponseTime());
		clone.setDocumentType(getDocumentType());
		clone.setBusinessType(getBusinessType());
		clone.setFunctionType(getFunctionType());
		clone.setRequestContent(getRequestContent());
		clone.setSenderName(getSenderName());
		clone.setRequestVersion(getRequestVersion());
		clone.setSenderIdentify(getSenderIdentify());
		clone.setReceiverName(getReceiverName());
		clone.setSendingDate(getSendingDate());
		clone.setReceiverIdentify(getReceiverIdentify());
		clone.setRemarks(getRemarks());

		return clone;
	}

	public int compareTo(HistoryInterfaceRequest historyInterfaceRequest) {
		int value = 0;

		if (getId() < historyInterfaceRequest.getId()) {
			value = -1;
		}
		else if (getId() > historyInterfaceRequest.getId()) {
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

		HistoryInterfaceRequestClp historyInterfaceRequest = null;

		try {
			historyInterfaceRequest = (HistoryInterfaceRequestClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = historyInterfaceRequest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", organizationCode=");
		sb.append(getOrganizationCode());
		sb.append(", locCode=");
		sb.append(getLocCode());
		sb.append(", requestDate=");
		sb.append(getRequestDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", requestDirection=");
		sb.append(getRequestDirection());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", requestResponseTime=");
		sb.append(getRequestResponseTime());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", businessType=");
		sb.append(getBusinessType());
		sb.append(", functionType=");
		sb.append(getFunctionType());
		sb.append(", requestContent=");
		sb.append(getRequestContent());
		sb.append(", senderName=");
		sb.append(getSenderName());
		sb.append(", requestVersion=");
		sb.append(getRequestVersion());
		sb.append(", senderIdentify=");
		sb.append(getSenderIdentify());
		sb.append(", receiverName=");
		sb.append(getReceiverName());
		sb.append(", sendingDate=");
		sb.append(getSendingDate());
		sb.append(", receiverIdentify=");
		sb.append(getReceiverIdentify());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequest");
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
			"<column><column-name>organizationCode</column-name><column-value><![CDATA[");
		sb.append(getOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locCode</column-name><column-value><![CDATA[");
		sb.append(getLocCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDate</column-name><column-value><![CDATA[");
		sb.append(getRequestDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestDirection</column-name><column-value><![CDATA[");
		sb.append(getRequestDirection());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestResponseTime</column-name><column-value><![CDATA[");
		sb.append(getRequestResponseTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessType</column-name><column-value><![CDATA[");
		sb.append(getBusinessType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionType</column-name><column-value><![CDATA[");
		sb.append(getFunctionType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestContent</column-name><column-value><![CDATA[");
		sb.append(getRequestContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderName</column-name><column-value><![CDATA[");
		sb.append(getSenderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestVersion</column-name><column-value><![CDATA[");
		sb.append(getRequestVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderIdentify</column-name><column-value><![CDATA[");
		sb.append(getSenderIdentify());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverName</column-name><column-value><![CDATA[");
		sb.append(getReceiverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendingDate</column-name><column-value><![CDATA[");
		sb.append(getSendingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverIdentify</column-name><column-value><![CDATA[");
		sb.append(getReceiverIdentify());
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
	private String _organizationCode;
	private String _locCode;
	private Date _requestDate;
	private Date _requestedDate;
	private String _requestDirection;
	private int _requestState;
	private Date _requestResponseTime;
	private String _documentType;
	private String _businessType;
	private String _functionType;
	private String _requestContent;
	private String _senderName;
	private String _requestVersion;
	private String _senderIdentify;
	private String _receiverName;
	private Date _sendingDate;
	private String _receiverIdentify;
	private String _remarks;
}