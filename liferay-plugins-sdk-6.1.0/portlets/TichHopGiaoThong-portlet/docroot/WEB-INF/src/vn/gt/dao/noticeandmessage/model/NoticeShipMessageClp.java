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

import vn.gt.dao.noticeandmessage.service.NoticeShipMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class NoticeShipMessageClp extends BaseModelImpl<NoticeShipMessage>
	implements NoticeShipMessage {
	public NoticeShipMessageClp() {
	}

	public Class<?> getModelClass() {
		return NoticeShipMessage.class;
	}

	public String getModelClassName() {
		return NoticeShipMessage.class.getName();
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

	public String getNoticeShipCode() {
		return _noticeShipCode;
	}

	public void setNoticeShipCode(String noticeShipCode) {
		_noticeShipCode = noticeShipCode;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public int getConfirmTime() {
		return _confirmTime;
	}

	public void setConfirmTime(int confirmTime) {
		_confirmTime = confirmTime;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public Date getArrivalDate() {
		return _arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		_arrivalDate = arrivalDate;
	}

	public String getArrivalPortCode() {
		return _arrivalPortCode;
	}

	public void setArrivalPortCode(String arrivalPortCode) {
		_arrivalPortCode = arrivalPortCode;
	}

	public String getPortGoingToCode() {
		return _portGoingToCode;
	}

	public void setPortGoingToCode(String portGoingToCode) {
		_portGoingToCode = portGoingToCode;
	}

	public String getNameAndAddOfShipOwners() {
		return _nameAndAddOfShipOwners;
	}

	public void setNameAndAddOfShipOwners(String nameAndAddOfShipOwners) {
		_nameAndAddOfShipOwners = nameAndAddOfShipOwners;
	}

	public long getClearanceHeight() {
		return _clearanceHeight;
	}

	public void setClearanceHeight(long clearanceHeight) {
		_clearanceHeight = clearanceHeight;
	}

	public long getShownDraft() {
		return _shownDraft;
	}

	public void setShownDraft(long shownDraft) {
		_shownDraft = shownDraft;
	}

	public long getDwt() {
		return _dwt;
	}

	public void setDwt(long dwt) {
		_dwt = dwt;
	}

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
	}

	public int getPurposeCode() {
		return _purposeCode;
	}

	public void setPurposeCode(int purposeCode) {
		_purposeCode = purposeCode;
	}

	public long getCrewNumber() {
		return _crewNumber;
	}

	public void setCrewNumber(long crewNumber) {
		_crewNumber = crewNumber;
	}

	public long getPassengerNumber() {
		return _passengerNumber;
	}

	public void setPassengerNumber(long passengerNumber) {
		_passengerNumber = passengerNumber;
	}

	public String getQuantityAndTypeOfCargo() {
		return _quantityAndTypeOfCargo;
	}

	public void setQuantityAndTypeOfCargo(String quantityAndTypeOfCargo) {
		_quantityAndTypeOfCargo = quantityAndTypeOfCargo;
	}

	public int getOtherPersons() {
		return _otherPersons;
	}

	public void setOtherPersons(int otherPersons) {
		_otherPersons = otherPersons;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			NoticeShipMessageLocalServiceUtil.addNoticeShipMessage(this);
		}
		else {
			NoticeShipMessageLocalServiceUtil.updateNoticeShipMessage(this);
		}
	}

	@Override
	public NoticeShipMessage toEscapedModel() {
		return (NoticeShipMessage)Proxy.newProxyInstance(NoticeShipMessage.class.getClassLoader(),
			new Class[] { NoticeShipMessage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NoticeShipMessageClp clone = new NoticeShipMessageClp();

		clone.setId(getId());
		clone.setNoticeShipCode(getNoticeShipCode());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setConfirmTime(getConfirmTime());
		clone.setCallSign(getCallSign());
		clone.setArrivalDate(getArrivalDate());
		clone.setArrivalPortCode(getArrivalPortCode());
		clone.setPortGoingToCode(getPortGoingToCode());
		clone.setNameAndAddOfShipOwners(getNameAndAddOfShipOwners());
		clone.setClearanceHeight(getClearanceHeight());
		clone.setShownDraft(getShownDraft());
		clone.setDwt(getDwt());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setPurposeCode(getPurposeCode());
		clone.setCrewNumber(getCrewNumber());
		clone.setPassengerNumber(getPassengerNumber());
		clone.setQuantityAndTypeOfCargo(getQuantityAndTypeOfCargo());
		clone.setOtherPersons(getOtherPersons());
		clone.setRemarks(getRemarks());

		return clone;
	}

	public int compareTo(NoticeShipMessage noticeShipMessage) {
		int value = 0;

		if (getId() < noticeShipMessage.getId()) {
			value = -1;
		}
		else if (getId() > noticeShipMessage.getId()) {
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

		NoticeShipMessageClp noticeShipMessage = null;

		try {
			noticeShipMessage = (NoticeShipMessageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = noticeShipMessage.getPrimaryKey();

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
		sb.append(", noticeShipCode=");
		sb.append(getNoticeShipCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", confirmTime=");
		sb.append(getConfirmTime());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", arrivalDate=");
		sb.append(getArrivalDate());
		sb.append(", arrivalPortCode=");
		sb.append(getArrivalPortCode());
		sb.append(", portGoingToCode=");
		sb.append(getPortGoingToCode());
		sb.append(", nameAndAddOfShipOwners=");
		sb.append(getNameAndAddOfShipOwners());
		sb.append(", clearanceHeight=");
		sb.append(getClearanceHeight());
		sb.append(", shownDraft=");
		sb.append(getShownDraft());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", passengerNumber=");
		sb.append(getPassengerNumber());
		sb.append(", quantityAndTypeOfCargo=");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append(", otherPersons=");
		sb.append(getOtherPersons());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.NoticeShipMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticeShipCode</column-name><column-value><![CDATA[");
		sb.append(getNoticeShipCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmTime</column-name><column-value><![CDATA[");
		sb.append(getConfirmTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDate</column-name><column-value><![CDATA[");
		sb.append(getArrivalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalPortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portGoingToCode</column-name><column-value><![CDATA[");
		sb.append(getPortGoingToCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameAndAddOfShipOwners</column-name><column-value><![CDATA[");
		sb.append(getNameAndAddOfShipOwners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraft</column-name><column-value><![CDATA[");
		sb.append(getShownDraft());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerNumber</column-name><column-value><![CDATA[");
		sb.append(getPassengerNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityAndTypeOfCargo</column-name><column-value><![CDATA[");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherPersons</column-name><column-value><![CDATA[");
		sb.append(getOtherPersons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _noticeShipCode;
	private long _documentName;
	private String _userCreated;
	private int _confirmTime;
	private String _callSign;
	private Date _arrivalDate;
	private String _arrivalPortCode;
	private String _portGoingToCode;
	private String _nameAndAddOfShipOwners;
	private long _clearanceHeight;
	private long _shownDraft;
	private long _dwt;
	private String _shipAgencyCode;
	private int _purposeCode;
	private long _crewNumber;
	private long _passengerNumber;
	private String _quantityAndTypeOfCargo;
	private int _otherPersons;
	private String _remarks;
}