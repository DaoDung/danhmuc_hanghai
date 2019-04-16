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

package vn.dao.gt.asw.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dao.gt.asw.service.MonitorMessageQueueLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win 64
 */
public class MonitorMessageQueueClp extends BaseModelImpl<MonitorMessageQueue>
	implements MonitorMessageQueue {
	public MonitorMessageQueueClp() {
	}

	public Class<?> getModelClass() {
		return MonitorMessageQueue.class;
	}

	public String getModelClassName() {
		return MonitorMessageQueue.class.getName();
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

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public String getMessageId() {
		return _messageId;
	}

	public void setMessageId(String messageId) {
		_messageId = messageId;
	}

	public String getSenderName() {
		return _senderName;
	}

	public void setSenderName(String senderName) {
		_senderName = senderName;
	}

	public String getSenderIdentity() {
		return _senderIdentity;
	}

	public void setSenderIdentity(String senderIdentity) {
		_senderIdentity = senderIdentity;
	}

	public String getSenderCountryCode() {
		return _senderCountryCode;
	}

	public void setSenderCountryCode(String senderCountryCode) {
		_senderCountryCode = senderCountryCode;
	}

	public String getSenderMinistryCode() {
		return _senderMinistryCode;
	}

	public void setSenderMinistryCode(String senderMinistryCode) {
		_senderMinistryCode = senderMinistryCode;
	}

	public String getSenderOrganizationCode() {
		return _senderOrganizationCode;
	}

	public void setSenderOrganizationCode(String senderOrganizationCode) {
		_senderOrganizationCode = senderOrganizationCode;
	}

	public String getSenderUnitCode() {
		return _senderUnitCode;
	}

	public void setSenderUnitCode(String senderUnitCode) {
		_senderUnitCode = senderUnitCode;
	}

	public String getReceiverName() {
		return _receiverName;
	}

	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;
	}

	public String getReceiverIdentity() {
		return _receiverIdentity;
	}

	public void setReceiverIdentity(String receiverIdentity) {
		_receiverIdentity = receiverIdentity;
	}

	public String getReceiverCountryCode() {
		return _receiverCountryCode;
	}

	public void setReceiverCountryCode(String receiverCountryCode) {
		_receiverCountryCode = receiverCountryCode;
	}

	public String getReceiverMinistryCode() {
		return _receiverMinistryCode;
	}

	public void setReceiverMinistryCode(String receiverMinistryCode) {
		_receiverMinistryCode = receiverMinistryCode;
	}

	public String getReceiverOrganizationCode() {
		return _receiverOrganizationCode;
	}

	public void setReceiverOrganizationCode(String receiverOrganizationCode) {
		_receiverOrganizationCode = receiverOrganizationCode;
	}

	public String getReceiverUnitCode() {
		return _receiverUnitCode;
	}

	public void setReceiverUnitCode(String receiverUnitCode) {
		_receiverUnitCode = receiverUnitCode;
	}

	public String getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getFunction() {
		return _function;
	}

	public void setFunction(String function) {
		_function = function;
	}

	public long getReference() {
		return _reference;
	}

	public void setReference(long reference) {
		_reference = reference;
	}

	public long getPreReference() {
		return _preReference;
	}

	public void setPreReference(long preReference) {
		_preReference = preReference;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public Date getSendDate() {
		return _sendDate;
	}

	public void setSendDate(Date sendDate) {
		_sendDate = sendDate;
	}

	public Date getCreatedTime() {
		return _createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		_createdTime = createdTime;
	}

	public int getWebservice() {
		return _webservice;
	}

	public void setWebservice(int webservice) {
		_webservice = webservice;
	}

	public int getValidated() {
		return _validated;
	}

	public void setValidated(int validated) {
		_validated = validated;
	}

	public int getPriority() {
		return _priority;
	}

	public void setPriority(int priority) {
		_priority = priority;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getValidationCode() {
		return _validationCode;
	}

	public void setValidationCode(String validationCode) {
		_validationCode = validationCode;
	}

	public int getSoLanGui() {
		return _soLanGui;
	}

	public void setSoLanGui(int soLanGui) {
		_soLanGui = soLanGui;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			MonitorMessageQueueLocalServiceUtil.addMonitorMessageQueue(this);
		}
		else {
			MonitorMessageQueueLocalServiceUtil.updateMonitorMessageQueue(this);
		}
	}

	@Override
	public MonitorMessageQueue toEscapedModel() {
		return (MonitorMessageQueue)Proxy.newProxyInstance(MonitorMessageQueue.class.getClassLoader(),
			new Class[] { MonitorMessageQueue.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MonitorMessageQueueClp clone = new MonitorMessageQueueClp();

		clone.setId(getId());
		clone.setVersion(getVersion());
		clone.setMessageId(getMessageId());
		clone.setSenderName(getSenderName());
		clone.setSenderIdentity(getSenderIdentity());
		clone.setSenderCountryCode(getSenderCountryCode());
		clone.setSenderMinistryCode(getSenderMinistryCode());
		clone.setSenderOrganizationCode(getSenderOrganizationCode());
		clone.setSenderUnitCode(getSenderUnitCode());
		clone.setReceiverName(getReceiverName());
		clone.setReceiverIdentity(getReceiverIdentity());
		clone.setReceiverCountryCode(getReceiverCountryCode());
		clone.setReceiverMinistryCode(getReceiverMinistryCode());
		clone.setReceiverOrganizationCode(getReceiverOrganizationCode());
		clone.setReceiverUnitCode(getReceiverUnitCode());
		clone.setDocumentType(getDocumentType());
		clone.setType(getType());
		clone.setFunction(getFunction());
		clone.setReference(getReference());
		clone.setPreReference(getPreReference());
		clone.setDocumentYear(getDocumentYear());
		clone.setSendDate(getSendDate());
		clone.setCreatedTime(getCreatedTime());
		clone.setWebservice(getWebservice());
		clone.setValidated(getValidated());
		clone.setPriority(getPriority());
		clone.setDescription(getDescription());
		clone.setValidationCode(getValidationCode());
		clone.setSoLanGui(getSoLanGui());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());

		return clone;
	}

	public int compareTo(MonitorMessageQueue monitorMessageQueue) {
		int value = 0;

		if (getPriority() < monitorMessageQueue.getPriority()) {
			value = -1;
		}
		else if (getPriority() > monitorMessageQueue.getPriority()) {
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

		MonitorMessageQueueClp monitorMessageQueue = null;

		try {
			monitorMessageQueue = (MonitorMessageQueueClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = monitorMessageQueue.getPrimaryKey();

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
		StringBundler sb = new StringBundler(63);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", messageId=");
		sb.append(getMessageId());
		sb.append(", senderName=");
		sb.append(getSenderName());
		sb.append(", senderIdentity=");
		sb.append(getSenderIdentity());
		sb.append(", senderCountryCode=");
		sb.append(getSenderCountryCode());
		sb.append(", senderMinistryCode=");
		sb.append(getSenderMinistryCode());
		sb.append(", senderOrganizationCode=");
		sb.append(getSenderOrganizationCode());
		sb.append(", senderUnitCode=");
		sb.append(getSenderUnitCode());
		sb.append(", receiverName=");
		sb.append(getReceiverName());
		sb.append(", receiverIdentity=");
		sb.append(getReceiverIdentity());
		sb.append(", receiverCountryCode=");
		sb.append(getReceiverCountryCode());
		sb.append(", receiverMinistryCode=");
		sb.append(getReceiverMinistryCode());
		sb.append(", receiverOrganizationCode=");
		sb.append(getReceiverOrganizationCode());
		sb.append(", receiverUnitCode=");
		sb.append(getReceiverUnitCode());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", function=");
		sb.append(getFunction());
		sb.append(", reference=");
		sb.append(getReference());
		sb.append(", preReference=");
		sb.append(getPreReference());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", sendDate=");
		sb.append(getSendDate());
		sb.append(", createdTime=");
		sb.append(getCreatedTime());
		sb.append(", webservice=");
		sb.append(getWebservice());
		sb.append(", validated=");
		sb.append(getValidated());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", validationCode=");
		sb.append(getValidationCode());
		sb.append(", soLanGui=");
		sb.append(getSoLanGui());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("vn.dao.gt.asw.model.MonitorMessageQueue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderName</column-name><column-value><![CDATA[");
		sb.append(getSenderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderIdentity</column-name><column-value><![CDATA[");
		sb.append(getSenderIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderCountryCode</column-name><column-value><![CDATA[");
		sb.append(getSenderCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderMinistryCode</column-name><column-value><![CDATA[");
		sb.append(getSenderMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderOrganizationCode</column-name><column-value><![CDATA[");
		sb.append(getSenderOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderUnitCode</column-name><column-value><![CDATA[");
		sb.append(getSenderUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverName</column-name><column-value><![CDATA[");
		sb.append(getReceiverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverIdentity</column-name><column-value><![CDATA[");
		sb.append(getReceiverIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverCountryCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverMinistryCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverOrganizationCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverUnitCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>function</column-name><column-value><![CDATA[");
		sb.append(getFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reference</column-name><column-value><![CDATA[");
		sb.append(getReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preReference</column-name><column-value><![CDATA[");
		sb.append(getPreReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendDate</column-name><column-value><![CDATA[");
		sb.append(getSendDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdTime</column-name><column-value><![CDATA[");
		sb.append(getCreatedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>webservice</column-name><column-value><![CDATA[");
		sb.append(getWebservice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validated</column-name><column-value><![CDATA[");
		sb.append(getValidated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validationCode</column-name><column-value><![CDATA[");
		sb.append(getValidationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLanGui</column-name><column-value><![CDATA[");
		sb.append(getSoLanGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyPhuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyPhuId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _version;
	private String _messageId;
	private String _senderName;
	private String _senderIdentity;
	private String _senderCountryCode;
	private String _senderMinistryCode;
	private String _senderOrganizationCode;
	private String _senderUnitCode;
	private String _receiverName;
	private String _receiverIdentity;
	private String _receiverCountryCode;
	private String _receiverMinistryCode;
	private String _receiverOrganizationCode;
	private String _receiverUnitCode;
	private String _documentType;
	private int _type;
	private String _function;
	private long _reference;
	private long _preReference;
	private int _documentYear;
	private Date _sendDate;
	private Date _createdTime;
	private int _webservice;
	private int _validated;
	private int _priority;
	private String _description;
	private String _validationCode;
	private int _soLanGui;
	private long _hoSoThuTucId;
	private long _phieuXuLyPhuId;
}