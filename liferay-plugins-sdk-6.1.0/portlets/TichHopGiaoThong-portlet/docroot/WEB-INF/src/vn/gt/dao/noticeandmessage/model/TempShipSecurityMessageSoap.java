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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempShipSecurityMessageServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempShipSecurityMessageServiceSoap
 * @generated
 */
public class TempShipSecurityMessageSoap implements Serializable {
	public static TempShipSecurityMessageSoap toSoapModel(
		TempShipSecurityMessage model) {
		TempShipSecurityMessageSoap soapModel = new TempShipSecurityMessageSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setShipSecurityCode(model.getShipSecurityCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setShipAgencyCode(model.getShipAgencyCode());
		soapModel.setNameOfShipAgent(model.getNameOfShipAgent());
		soapModel.setShipName(model.getShipName());
		soapModel.setShipTypeCode(model.getShipTypeCode());
		soapModel.setStateCode(model.getStateCode());
		soapModel.setShipCaptain(model.getShipCaptain());
		soapModel.setImo(model.getImo());
		soapModel.setGrt(model.getGrt());
		soapModel.setUnitGRT(model.getUnitGRT());
		soapModel.setCrewNumber(model.getCrewNumber());
		soapModel.setArrivalDate(model.getArrivalDate());
		soapModel.setPurposeCode(model.getPurposeCode());
		soapModel.setPurposeSpecified(model.getPurposeSpecified());
		soapModel.setPortRegionCode(model.getPortRegionCode());
		soapModel.setPortWharfCode(model.getPortWharfCode());
		soapModel.setShipAgencyPhone(model.getShipAgencyPhone());
		soapModel.setShipAgencyFax(model.getShipAgencyFax());
		soapModel.setIsInternationalShipSecurity(model.getIsInternationalShipSecurity());
		soapModel.setNameOfISSC(model.getNameOfISSC());
		soapModel.setDateOfISSC(model.getDateOfISSC());
		soapModel.setDateOfExpiryISSC(model.getDateOfExpiryISSC());
		soapModel.setSecurityLevelCode(model.getSecurityLevelCode());
		soapModel.setSecurityFromDate(model.getSecurityFromDate());
		soapModel.setIsAdditionalSecurityMeasures(model.getIsAdditionalSecurityMeasures());
		soapModel.setAdditionalSecurityDetail(model.getAdditionalSecurityDetail());
		soapModel.setIsMaintainSecurity(model.getIsMaintainSecurity());
		soapModel.setMaintainSecurityDetail(model.getMaintainSecurityDetail());
		soapModel.setLatitude(model.getLatitude());
		soapModel.setLongitude(model.getLongitude());
		soapModel.setHasShipSecurityPortItems(model.getHasShipSecurityPortItems());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setArrivalPortCode(model.getArrivalPortCode());
		soapModel.setPortHarbourCode(model.getPortHarbourCode());

		return soapModel;
	}

	public static TempShipSecurityMessageSoap[] toSoapModels(
		TempShipSecurityMessage[] models) {
		TempShipSecurityMessageSoap[] soapModels = new TempShipSecurityMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempShipSecurityMessageSoap[][] toSoapModels(
		TempShipSecurityMessage[][] models) {
		TempShipSecurityMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempShipSecurityMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempShipSecurityMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempShipSecurityMessageSoap[] toSoapModels(
		List<TempShipSecurityMessage> models) {
		List<TempShipSecurityMessageSoap> soapModels = new ArrayList<TempShipSecurityMessageSoap>(models.size());

		for (TempShipSecurityMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempShipSecurityMessageSoap[soapModels.size()]);
	}

	public TempShipSecurityMessageSoap() {
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