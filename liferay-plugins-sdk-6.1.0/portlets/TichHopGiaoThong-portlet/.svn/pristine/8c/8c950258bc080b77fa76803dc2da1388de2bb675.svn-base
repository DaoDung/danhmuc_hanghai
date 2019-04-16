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

import vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempShipSecurityMessageClp extends BaseModelImpl<TempShipSecurityMessage>
	implements TempShipSecurityMessage {
	public TempShipSecurityMessageClp() {
	}

	public Class<?> getModelClass() {
		return TempShipSecurityMessage.class;
	}

	public String getModelClassName() {
		return TempShipSecurityMessage.class.getName();
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

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getShipSecurityCode() {
		return _shipSecurityCode;
	}

	public void setShipSecurityCode(String shipSecurityCode) {
		_shipSecurityCode = shipSecurityCode;
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

	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;
	}

	public String getNameOfShipAgent() {
		return _nameOfShipAgent;
	}

	public void setNameOfShipAgent(String nameOfShipAgent) {
		_nameOfShipAgent = nameOfShipAgent;
	}

	public String getShipName() {
		return _shipName;
	}

	public void setShipName(String shipName) {
		_shipName = shipName;
	}

	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;
	}

	public String getStateCode() {
		return _stateCode;
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getShipCaptain() {
		return _shipCaptain;
	}

	public void setShipCaptain(String shipCaptain) {
		_shipCaptain = shipCaptain;
	}

	public String getImo() {
		return _imo;
	}

	public void setImo(String imo) {
		_imo = imo;
	}

	public double getGrt() {
		return _grt;
	}

	public void setGrt(double grt) {
		_grt = grt;
	}

	public String getUnitGRT() {
		return _unitGRT;
	}

	public void setUnitGRT(String unitGRT) {
		_unitGRT = unitGRT;
	}

	public long getCrewNumber() {
		return _crewNumber;
	}

	public void setCrewNumber(long crewNumber) {
		_crewNumber = crewNumber;
	}

	public Date getArrivalDate() {
		return _arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		_arrivalDate = arrivalDate;
	}

	public String getPurposeCode() {
		return _purposeCode;
	}

	public void setPurposeCode(String purposeCode) {
		_purposeCode = purposeCode;
	}

	public String getPurposeSpecified() {
		return _purposeSpecified;
	}

	public void setPurposeSpecified(String purposeSpecified) {
		_purposeSpecified = purposeSpecified;
	}

	public String getPortRegionCode() {
		return _portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;
	}

	public String getPortWharfCode() {
		return _portWharfCode;
	}

	public void setPortWharfCode(String portWharfCode) {
		_portWharfCode = portWharfCode;
	}

	public String getShipAgencyPhone() {
		return _shipAgencyPhone;
	}

	public void setShipAgencyPhone(String shipAgencyPhone) {
		_shipAgencyPhone = shipAgencyPhone;
	}

	public String getShipAgencyFax() {
		return _shipAgencyFax;
	}

	public void setShipAgencyFax(String shipAgencyFax) {
		_shipAgencyFax = shipAgencyFax;
	}

	public int getIsInternationalShipSecurity() {
		return _isInternationalShipSecurity;
	}

	public void setIsInternationalShipSecurity(int isInternationalShipSecurity) {
		_isInternationalShipSecurity = isInternationalShipSecurity;
	}

	public String getNameOfISSC() {
		return _nameOfISSC;
	}

	public void setNameOfISSC(String nameOfISSC) {
		_nameOfISSC = nameOfISSC;
	}

	public Date getDateOfISSC() {
		return _dateOfISSC;
	}

	public void setDateOfISSC(Date dateOfISSC) {
		_dateOfISSC = dateOfISSC;
	}

	public Date getDateOfExpiryISSC() {
		return _dateOfExpiryISSC;
	}

	public void setDateOfExpiryISSC(Date dateOfExpiryISSC) {
		_dateOfExpiryISSC = dateOfExpiryISSC;
	}

	public String getSecurityLevelCode() {
		return _securityLevelCode;
	}

	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;
	}

	public Date getSecurityFromDate() {
		return _securityFromDate;
	}

	public void setSecurityFromDate(Date securityFromDate) {
		_securityFromDate = securityFromDate;
	}

	public int getIsAdditionalSecurityMeasures() {
		return _isAdditionalSecurityMeasures;
	}

	public void setIsAdditionalSecurityMeasures(
		int isAdditionalSecurityMeasures) {
		_isAdditionalSecurityMeasures = isAdditionalSecurityMeasures;
	}

	public String getAdditionalSecurityDetail() {
		return _additionalSecurityDetail;
	}

	public void setAdditionalSecurityDetail(String additionalSecurityDetail) {
		_additionalSecurityDetail = additionalSecurityDetail;
	}

	public int getIsMaintainSecurity() {
		return _isMaintainSecurity;
	}

	public void setIsMaintainSecurity(int isMaintainSecurity) {
		_isMaintainSecurity = isMaintainSecurity;
	}

	public String getMaintainSecurityDetail() {
		return _maintainSecurityDetail;
	}

	public void setMaintainSecurityDetail(String maintainSecurityDetail) {
		_maintainSecurityDetail = maintainSecurityDetail;
	}

	public String getLatitude() {
		return _latitude;
	}

	public void setLatitude(String latitude) {
		_latitude = latitude;
	}

	public String getLongitude() {
		return _longitude;
	}

	public void setLongitude(String longitude) {
		_longitude = longitude;
	}

	public int getHasShipSecurityPortItems() {
		return _hasShipSecurityPortItems;
	}

	public void setHasShipSecurityPortItems(int hasShipSecurityPortItems) {
		_hasShipSecurityPortItems = hasShipSecurityPortItems;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public int getMasterSigned() {
		return _masterSigned;
	}

	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;
	}

	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getArrivalPortCode() {
		return _arrivalPortCode;
	}

	public void setArrivalPortCode(String arrivalPortCode) {
		_arrivalPortCode = arrivalPortCode;
	}

	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipSecurityMessageLocalServiceUtil.addTempShipSecurityMessage(this);
		}
		else {
			TempShipSecurityMessageLocalServiceUtil.updateTempShipSecurityMessage(this);
		}
	}

	@Override
	public TempShipSecurityMessage toEscapedModel() {
		return (TempShipSecurityMessage)Proxy.newProxyInstance(TempShipSecurityMessage.class.getClassLoader(),
			new Class[] { TempShipSecurityMessage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipSecurityMessageClp clone = new TempShipSecurityMessageClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentYear(getDocumentYear());
		clone.setShipSecurityCode(getShipSecurityCode());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setNameOfShipAgent(getNameOfShipAgent());
		clone.setShipName(getShipName());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setStateCode(getStateCode());
		clone.setShipCaptain(getShipCaptain());
		clone.setImo(getImo());
		clone.setGrt(getGrt());
		clone.setUnitGRT(getUnitGRT());
		clone.setCrewNumber(getCrewNumber());
		clone.setArrivalDate(getArrivalDate());
		clone.setPurposeCode(getPurposeCode());
		clone.setPurposeSpecified(getPurposeSpecified());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setShipAgencyPhone(getShipAgencyPhone());
		clone.setShipAgencyFax(getShipAgencyFax());
		clone.setIsInternationalShipSecurity(getIsInternationalShipSecurity());
		clone.setNameOfISSC(getNameOfISSC());
		clone.setDateOfISSC(getDateOfISSC());
		clone.setDateOfExpiryISSC(getDateOfExpiryISSC());
		clone.setSecurityLevelCode(getSecurityLevelCode());
		clone.setSecurityFromDate(getSecurityFromDate());
		clone.setIsAdditionalSecurityMeasures(getIsAdditionalSecurityMeasures());
		clone.setAdditionalSecurityDetail(getAdditionalSecurityDetail());
		clone.setIsMaintainSecurity(getIsMaintainSecurity());
		clone.setMaintainSecurityDetail(getMaintainSecurityDetail());
		clone.setLatitude(getLatitude());
		clone.setLongitude(getLongitude());
		clone.setHasShipSecurityPortItems(getHasShipSecurityPortItems());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setCallSign(getCallSign());
		clone.setArrivalPortCode(getArrivalPortCode());
		clone.setPortHarbourCode(getPortHarbourCode());

		return clone;
	}

	public int compareTo(TempShipSecurityMessage tempShipSecurityMessage) {
		int value = 0;

		if (getId() < tempShipSecurityMessage.getId()) {
			value = -1;
		}
		else if (getId() > tempShipSecurityMessage.getId()) {
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

		TempShipSecurityMessageClp tempShipSecurityMessage = null;

		try {
			tempShipSecurityMessage = (TempShipSecurityMessageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempShipSecurityMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(89);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", shipSecurityCode=");
		sb.append(getShipSecurityCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", nameOfShipAgent=");
		sb.append(getNameOfShipAgent());
		sb.append(", shipName=");
		sb.append(getShipName());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", shipCaptain=");
		sb.append(getShipCaptain());
		sb.append(", imo=");
		sb.append(getImo());
		sb.append(", grt=");
		sb.append(getGrt());
		sb.append(", unitGRT=");
		sb.append(getUnitGRT());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", arrivalDate=");
		sb.append(getArrivalDate());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", purposeSpecified=");
		sb.append(getPurposeSpecified());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", shipAgencyPhone=");
		sb.append(getShipAgencyPhone());
		sb.append(", shipAgencyFax=");
		sb.append(getShipAgencyFax());
		sb.append(", isInternationalShipSecurity=");
		sb.append(getIsInternationalShipSecurity());
		sb.append(", nameOfISSC=");
		sb.append(getNameOfISSC());
		sb.append(", dateOfISSC=");
		sb.append(getDateOfISSC());
		sb.append(", dateOfExpiryISSC=");
		sb.append(getDateOfExpiryISSC());
		sb.append(", securityLevelCode=");
		sb.append(getSecurityLevelCode());
		sb.append(", securityFromDate=");
		sb.append(getSecurityFromDate());
		sb.append(", isAdditionalSecurityMeasures=");
		sb.append(getIsAdditionalSecurityMeasures());
		sb.append(", additionalSecurityDetail=");
		sb.append(getAdditionalSecurityDetail());
		sb.append(", isMaintainSecurity=");
		sb.append(getIsMaintainSecurity());
		sb.append(", maintainSecurityDetail=");
		sb.append(getMaintainSecurityDetail());
		sb.append(", latitude=");
		sb.append(getLatitude());
		sb.append(", longitude=");
		sb.append(getLongitude());
		sb.append(", hasShipSecurityPortItems=");
		sb.append(getHasShipSecurityPortItems());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", arrivalPortCode=");
		sb.append(getArrivalPortCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(136);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage");
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
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipSecurityCode</column-name><column-value><![CDATA[");
		sb.append(getShipSecurityCode());
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
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipAgent</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipName</column-name><column-value><![CDATA[");
		sb.append(getShipName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipCaptain</column-name><column-value><![CDATA[");
		sb.append(getShipCaptain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imo</column-name><column-value><![CDATA[");
		sb.append(getImo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grt</column-name><column-value><![CDATA[");
		sb.append(getGrt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitGRT</column-name><column-value><![CDATA[");
		sb.append(getUnitGRT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDate</column-name><column-value><![CDATA[");
		sb.append(getArrivalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeSpecified</column-name><column-value><![CDATA[");
		sb.append(getPurposeSpecified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyPhone</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyFax</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isInternationalShipSecurity</column-name><column-value><![CDATA[");
		sb.append(getIsInternationalShipSecurity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfISSC</column-name><column-value><![CDATA[");
		sb.append(getNameOfISSC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfISSC</column-name><column-value><![CDATA[");
		sb.append(getDateOfISSC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfExpiryISSC</column-name><column-value><![CDATA[");
		sb.append(getDateOfExpiryISSC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelCode</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityFromDate</column-name><column-value><![CDATA[");
		sb.append(getSecurityFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAdditionalSecurityMeasures</column-name><column-value><![CDATA[");
		sb.append(getIsAdditionalSecurityMeasures());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalSecurityDetail</column-name><column-value><![CDATA[");
		sb.append(getAdditionalSecurityDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMaintainSecurity</column-name><column-value><![CDATA[");
		sb.append(getIsMaintainSecurity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maintainSecurityDetail</column-name><column-value><![CDATA[");
		sb.append(getMaintainSecurityDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latitude</column-name><column-value><![CDATA[");
		sb.append(getLatitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>longitude</column-name><column-value><![CDATA[");
		sb.append(getLongitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasShipSecurityPortItems</column-name><column-value><![CDATA[");
		sb.append(getHasShipSecurityPortItems());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSigned</column-name><column-value><![CDATA[");
		sb.append(getMasterSigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSignedImage</column-name><column-value><![CDATA[");
		sb.append(getMasterSignedImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalPortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private int _documentYear;
	private String _shipSecurityCode;
	private long _documentName;
	private String _userCreated;
	private String _shipAgencyCode;
	private String _nameOfShipAgent;
	private String _shipName;
	private String _shipTypeCode;
	private String _stateCode;
	private String _shipCaptain;
	private String _imo;
	private double _grt;
	private String _unitGRT;
	private long _crewNumber;
	private Date _arrivalDate;
	private String _purposeCode;
	private String _purposeSpecified;
	private String _portRegionCode;
	private String _portWharfCode;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private int _isInternationalShipSecurity;
	private String _nameOfISSC;
	private Date _dateOfISSC;
	private Date _dateOfExpiryISSC;
	private String _securityLevelCode;
	private Date _securityFromDate;
	private int _isAdditionalSecurityMeasures;
	private String _additionalSecurityDetail;
	private int _isMaintainSecurity;
	private String _maintainSecurityDetail;
	private String _latitude;
	private String _longitude;
	private int _hasShipSecurityPortItems;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private String _callSign;
	private String _arrivalPortCode;
	private String _portHarbourCode;
}