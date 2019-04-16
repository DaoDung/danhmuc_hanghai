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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempDocumentServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempDocumentServiceSoap
 * @generated
 */
public class TempDocumentSoap implements Serializable {
	public static TempDocumentSoap toSoapModel(TempDocument model) {
		TempDocumentSoap soapModel = new TempDocumentSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setDocumentTypeCode(model.getDocumentTypeCode());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setShipAgencyCode(model.getShipAgencyCode());
		soapModel.setShipName(model.getShipName());
		soapModel.setShipTypeCode(model.getShipTypeCode());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setShipCaptain(model.getShipCaptain());
		soapModel.setImo(model.getImo());
		soapModel.setGrt(model.getGrt());
		soapModel.setNt(model.getNt());
		soapModel.setDwt(model.getDwt());
		soapModel.setUnitGRT(model.getUnitGRT());
		soapModel.setUnitNT(model.getUnitNT());
		soapModel.setUnitDWT(model.getUnitDWT());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setPreDocumentName(model.getPreDocumentName());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setLastModifiedDate(model.getLastModifiedDate());
		soapModel.setFlowFlag(model.getFlowFlag());
		soapModel.setDocumentStatusCode(model.getDocumentStatusCode());
		soapModel.setLocationCode(model.getLocationCode());
		soapModel.setMaritimeCode(model.getMaritimeCode());
		soapModel.setPortRegionCode(model.getPortRegionCode());
		soapModel.setPortCode(model.getPortCode());
		soapModel.setLastPortCode(model.getLastPortCode());
		soapModel.setShipPosition(model.getShipPosition());
		soapModel.setShipOwnerCode(model.getShipOwnerCode());
		soapModel.setArrivalShipAgency(model.getArrivalShipAgency());
		soapModel.setDepartureShipAgency(model.getDepartureShipAgency());
		soapModel.setShipDateFrom(model.getShipDateFrom());
		soapModel.setShipDateTo(model.getShipDateTo());
		soapModel.setUpgradeVersion(model.getUpgradeVersion());
		soapModel.setNameOfShipownersAgents(model.getNameOfShipownersAgents());

		return soapModel;
	}

	public static TempDocumentSoap[] toSoapModels(TempDocument[] models) {
		TempDocumentSoap[] soapModels = new TempDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempDocumentSoap[][] toSoapModels(TempDocument[][] models) {
		TempDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempDocumentSoap[] toSoapModels(List<TempDocument> models) {
		List<TempDocumentSoap> soapModels = new ArrayList<TempDocumentSoap>(models.size());

		for (TempDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempDocumentSoap[soapModels.size()]);
	}

	public TempDocumentSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
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