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

import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempDocumentClp extends BaseModelImpl<TempDocument>
	implements TempDocument {
	public TempDocumentClp() {
	}

	public Class<?> getModelClass() {
		return TempDocument.class;
	}

	public String getModelClassName() {
		return TempDocument.class.getName();
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

	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;
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

	public double getNt() {
		return _nt;
	}

	public void setNt(double nt) {
		_nt = nt;
	}

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	public String getUnitGRT() {
		return _unitGRT;
	}

	public void setUnitGRT(String unitGRT) {
		_unitGRT = unitGRT;
	}

	public String getUnitNT() {
		return _unitNT;
	}

	public void setUnitNT(String unitNT) {
		_unitNT = unitNT;
	}

	public String getUnitDWT() {
		return _unitDWT;
	}

	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getPreDocumentName() {
		return _preDocumentName;
	}

	public void setPreDocumentName(String preDocumentName) {
		_preDocumentName = preDocumentName;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return _lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		_lastModifiedDate = lastModifiedDate;
	}

	public int getFlowFlag() {
		return _flowFlag;
	}

	public void setFlowFlag(int flowFlag) {
		_flowFlag = flowFlag;
	}

	public int getDocumentStatusCode() {
		return _documentStatusCode;
	}

	public void setDocumentStatusCode(int documentStatusCode) {
		_documentStatusCode = documentStatusCode;
	}

	public String getLocationCode() {
		return _locationCode;
	}

	public void setLocationCode(String locationCode) {
		_locationCode = locationCode;
	}

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public String getPortRegionCode() {
		return _portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getLastPortCode() {
		return _lastPortCode;
	}

	public void setLastPortCode(String lastPortCode) {
		_lastPortCode = lastPortCode;
	}

	public int getShipPosition() {
		return _shipPosition;
	}

	public void setShipPosition(int shipPosition) {
		_shipPosition = shipPosition;
	}

	public String getShipOwnerCode() {
		return _shipOwnerCode;
	}

	public void setShipOwnerCode(String shipOwnerCode) {
		_shipOwnerCode = shipOwnerCode;
	}

	public String getArrivalShipAgency() {
		return _arrivalShipAgency;
	}

	public void setArrivalShipAgency(String arrivalShipAgency) {
		_arrivalShipAgency = arrivalShipAgency;
	}

	public String getDepartureShipAgency() {
		return _departureShipAgency;
	}

	public void setDepartureShipAgency(String departureShipAgency) {
		_departureShipAgency = departureShipAgency;
	}

	public Date getShipDateFrom() {
		return _shipDateFrom;
	}

	public void setShipDateFrom(Date shipDateFrom) {
		_shipDateFrom = shipDateFrom;
	}

	public Date getShipDateTo() {
		return _shipDateTo;
	}

	public void setShipDateTo(Date shipDateTo) {
		_shipDateTo = shipDateTo;
	}

	public int getUpgradeVersion() {
		return _upgradeVersion;
	}

	public void setUpgradeVersion(int upgradeVersion) {
		_upgradeVersion = upgradeVersion;
	}

	public String getNameOfShipownersAgents() {
		return _nameOfShipownersAgents;
	}

	public void setNameOfShipownersAgents(String nameOfShipownersAgents) {
		_nameOfShipownersAgents = nameOfShipownersAgents;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDocumentLocalServiceUtil.addTempDocument(this);
		}
		else {
			TempDocumentLocalServiceUtil.updateTempDocument(this);
		}
	}

	@Override
	public TempDocument toEscapedModel() {
		return (TempDocument)Proxy.newProxyInstance(TempDocument.class.getClassLoader(),
			new Class[] { TempDocument.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDocumentClp clone = new TempDocumentClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setDocumentTypeCode(getDocumentTypeCode());
		clone.setUserCreated(getUserCreated());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setShipName(getShipName());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setStateCode(getStateCode());
		clone.setShipCaptain(getShipCaptain());
		clone.setImo(getImo());
		clone.setGrt(getGrt());
		clone.setNt(getNt());
		clone.setDwt(getDwt());
		clone.setUnitGRT(getUnitGRT());
		clone.setUnitNT(getUnitNT());
		clone.setUnitDWT(getUnitDWT());
		clone.setCallSign(getCallSign());
		clone.setPreDocumentName(getPreDocumentName());
		clone.setCreatedDate(getCreatedDate());
		clone.setLastModifiedDate(getLastModifiedDate());
		clone.setFlowFlag(getFlowFlag());
		clone.setDocumentStatusCode(getDocumentStatusCode());
		clone.setLocationCode(getLocationCode());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortCode(getPortCode());
		clone.setLastPortCode(getLastPortCode());
		clone.setShipPosition(getShipPosition());
		clone.setShipOwnerCode(getShipOwnerCode());
		clone.setArrivalShipAgency(getArrivalShipAgency());
		clone.setDepartureShipAgency(getDepartureShipAgency());
		clone.setShipDateFrom(getShipDateFrom());
		clone.setShipDateTo(getShipDateTo());
		clone.setUpgradeVersion(getUpgradeVersion());
		clone.setNameOfShipownersAgents(getNameOfShipownersAgents());

		return clone;
	}

	public int compareTo(TempDocument tempDocument) {
		int value = 0;

		if (getId() < tempDocument.getId()) {
			value = -1;
		}
		else if (getId() > tempDocument.getId()) {
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

		TempDocumentClp tempDocument = null;

		try {
			tempDocument = (TempDocumentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempDocument.getPrimaryKey();

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
		StringBundler sb = new StringBundler(77);

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
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
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
		sb.append(", nt=");
		sb.append(getNt());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", unitGRT=");
		sb.append(getUnitGRT());
		sb.append(", unitNT=");
		sb.append(getUnitNT());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", preDocumentName=");
		sb.append(getPreDocumentName());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", lastModifiedDate=");
		sb.append(getLastModifiedDate());
		sb.append(", flowFlag=");
		sb.append(getFlowFlag());
		sb.append(", documentStatusCode=");
		sb.append(getDocumentStatusCode());
		sb.append(", locationCode=");
		sb.append(getLocationCode());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", lastPortCode=");
		sb.append(getLastPortCode());
		sb.append(", shipPosition=");
		sb.append(getShipPosition());
		sb.append(", shipOwnerCode=");
		sb.append(getShipOwnerCode());
		sb.append(", arrivalShipAgency=");
		sb.append(getArrivalShipAgency());
		sb.append(", departureShipAgency=");
		sb.append(getDepartureShipAgency());
		sb.append(", shipDateFrom=");
		sb.append(getShipDateFrom());
		sb.append(", shipDateTo=");
		sb.append(getShipDateTo());
		sb.append(", upgradeVersion=");
		sb.append(getUpgradeVersion());
		sb.append(", nameOfShipownersAgents=");
		sb.append(getNameOfShipownersAgents());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(118);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempDocument");
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
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
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
			"<column><column-name>nt</column-name><column-value><![CDATA[");
		sb.append(getNt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitGRT</column-name><column-value><![CDATA[");
		sb.append(getUnitGRT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitNT</column-name><column-value><![CDATA[");
		sb.append(getUnitNT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preDocumentName</column-name><column-value><![CDATA[");
		sb.append(getPreDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getLastModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flowFlag</column-name><column-value><![CDATA[");
		sb.append(getFlowFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentStatusCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentStatusCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationCode</column-name><column-value><![CDATA[");
		sb.append(getLocationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipPosition</column-name><column-value><![CDATA[");
		sb.append(getShipPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerCode</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalShipAgency</column-name><column-value><![CDATA[");
		sb.append(getArrivalShipAgency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departureShipAgency</column-name><column-value><![CDATA[");
		sb.append(getDepartureShipAgency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipDateFrom</column-name><column-value><![CDATA[");
		sb.append(getShipDateFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipDateTo</column-name><column-value><![CDATA[");
		sb.append(getShipDateTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>upgradeVersion</column-name><column-value><![CDATA[");
		sb.append(getUpgradeVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipownersAgents</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipownersAgents());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _documentTypeCode;
	private String _userCreated;
	private String _shipAgencyCode;
	private String _shipName;
	private String _shipTypeCode;
	private String _stateCode;
	private String _shipCaptain;
	private String _imo;
	private double _grt;
	private double _nt;
	private double _dwt;
	private String _unitGRT;
	private String _unitNT;
	private String _unitDWT;
	private String _callSign;
	private String _preDocumentName;
	private Date _createdDate;
	private Date _lastModifiedDate;
	private int _flowFlag;
	private int _documentStatusCode;
	private String _locationCode;
	private String _maritimeCode;
	private String _portRegionCode;
	private String _portCode;
	private String _lastPortCode;
	private int _shipPosition;
	private String _shipOwnerCode;
	private String _arrivalShipAgency;
	private String _departureShipAgency;
	private Date _shipDateFrom;
	private Date _shipDateTo;
	private int _upgradeVersion;
	private String _nameOfShipownersAgents;
}