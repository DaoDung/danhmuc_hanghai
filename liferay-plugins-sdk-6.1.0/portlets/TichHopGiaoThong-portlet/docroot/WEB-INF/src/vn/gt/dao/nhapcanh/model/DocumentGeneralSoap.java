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

package vn.gt.dao.nhapcanh.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.nhapcanh.service.http.DocumentGeneralServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.nhapcanh.service.http.DocumentGeneralServiceSoap
 * @generated
 */
public class DocumentGeneralSoap implements Serializable {
	public static DocumentGeneralSoap toSoapModel(DocumentGeneral model) {
		DocumentGeneralSoap soapModel = new DocumentGeneralSoap();

		soapModel.setId(model.getId());
		soapModel.setDocumentNo(model.getDocumentNo());
		soapModel.setDocumentFunction(model.getDocumentFunction());
		soapModel.setIsArrival(model.getIsArrival());
		soapModel.setIsDeparture(model.getIsDeparture());
		soapModel.setShipCode(model.getShipCode());
		soapModel.setArrivalOrDeparturePortCode(model.getArrivalOrDeparturePortCode());
		soapModel.setTimeArrivalOrDeparture(model.getTimeArrivalOrDeparture());
		soapModel.setImoNumber(model.getImoNumber());
		soapModel.setCallSign(model.getCallSign());
		soapModel.setVoyageNumber(model.getVoyageNumber());
		soapModel.setShipNationCode(model.getShipNationCode());
		soapModel.setNameOfMaster(model.getNameOfMaster());
		soapModel.setLastPort(model.getLastPort());
		soapModel.setContactDetailShipAgent(model.getContactDetailShipAgent());
		soapModel.setGrossTonnage(model.getGrossTonnage());
		soapModel.setNetTonnage(model.getNetTonnage());
		soapModel.setPositionShipInPort(model.getPositionShipInPort());
		soapModel.setBriefParticularsVoyage(model.getBriefParticularsVoyage());
		soapModel.setBriefDescriptionCargo(model.getBriefDescriptionCargo());
		soapModel.setCrewNumber(model.getCrewNumber());
		soapModel.setPassengerNumber(model.getPassengerNumber());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCargoDeclaration(model.getCargoDeclaration());
		soapModel.setShipStoresDeclaration(model.getShipStoresDeclaration());
		soapModel.setCrewList(model.getCrewList());
		soapModel.setPassengerList(model.getPassengerList());
		soapModel.setShipRequirements(model.getShipRequirements());
		soapModel.setIsCrewEffectDeclaration(model.getIsCrewEffectDeclaration());
		soapModel.setIsMaritimeDeclarationHealth(model.getIsMaritimeDeclarationHealth());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifyDate(model.getModifyDate());

		return soapModel;
	}

	public static DocumentGeneralSoap[] toSoapModels(DocumentGeneral[] models) {
		DocumentGeneralSoap[] soapModels = new DocumentGeneralSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentGeneralSoap[][] toSoapModels(
		DocumentGeneral[][] models) {
		DocumentGeneralSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocumentGeneralSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentGeneralSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentGeneralSoap[] toSoapModels(
		List<DocumentGeneral> models) {
		List<DocumentGeneralSoap> soapModels = new ArrayList<DocumentGeneralSoap>(models.size());

		for (DocumentGeneral model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocumentGeneralSoap[soapModels.size()]);
	}

	public DocumentGeneralSoap() {
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

	public String getDocumentNo() {
		return _documentNo;
	}

	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;
	}

	public String getDocumentFunction() {
		return _documentFunction;
	}

	public void setDocumentFunction(String documentFunction) {
		_documentFunction = documentFunction;
	}

	public int getIsArrival() {
		return _isArrival;
	}

	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
	}

	public int getIsDeparture() {
		return _isDeparture;
	}

	public void setIsDeparture(int isDeparture) {
		_isDeparture = isDeparture;
	}

	public String getShipCode() {
		return _shipCode;
	}

	public void setShipCode(String shipCode) {
		_shipCode = shipCode;
	}

	public String getArrivalOrDeparturePortCode() {
		return _arrivalOrDeparturePortCode;
	}

	public void setArrivalOrDeparturePortCode(String arrivalOrDeparturePortCode) {
		_arrivalOrDeparturePortCode = arrivalOrDeparturePortCode;
	}

	public Date getTimeArrivalOrDeparture() {
		return _timeArrivalOrDeparture;
	}

	public void setTimeArrivalOrDeparture(Date timeArrivalOrDeparture) {
		_timeArrivalOrDeparture = timeArrivalOrDeparture;
	}

	public String getImoNumber() {
		return _imoNumber;
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public int getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(int voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public String getShipNationCode() {
		return _shipNationCode;
	}

	public void setShipNationCode(String shipNationCode) {
		_shipNationCode = shipNationCode;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public String getLastPort() {
		return _lastPort;
	}

	public void setLastPort(String lastPort) {
		_lastPort = lastPort;
	}

	public String getContactDetailShipAgent() {
		return _contactDetailShipAgent;
	}

	public void setContactDetailShipAgent(String contactDetailShipAgent) {
		_contactDetailShipAgent = contactDetailShipAgent;
	}

	public double getGrossTonnage() {
		return _grossTonnage;
	}

	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;
	}

	public double getNetTonnage() {
		return _netTonnage;
	}

	public void setNetTonnage(double netTonnage) {
		_netTonnage = netTonnage;
	}

	public int getPositionShipInPort() {
		return _positionShipInPort;
	}

	public void setPositionShipInPort(int positionShipInPort) {
		_positionShipInPort = positionShipInPort;
	}

	public String getBriefParticularsVoyage() {
		return _briefParticularsVoyage;
	}

	public void setBriefParticularsVoyage(String briefParticularsVoyage) {
		_briefParticularsVoyage = briefParticularsVoyage;
	}

	public String getBriefDescriptionCargo() {
		return _briefDescriptionCargo;
	}

	public void setBriefDescriptionCargo(String briefDescriptionCargo) {
		_briefDescriptionCargo = briefDescriptionCargo;
	}

	public int getCrewNumber() {
		return _crewNumber;
	}

	public void setCrewNumber(int crewNumber) {
		_crewNumber = crewNumber;
	}

	public int getPassengerNumber() {
		return _passengerNumber;
	}

	public void setPassengerNumber(int passengerNumber) {
		_passengerNumber = passengerNumber;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getCargoDeclaration() {
		return _cargoDeclaration;
	}

	public void setCargoDeclaration(String cargoDeclaration) {
		_cargoDeclaration = cargoDeclaration;
	}

	public String getShipStoresDeclaration() {
		return _shipStoresDeclaration;
	}

	public void setShipStoresDeclaration(String shipStoresDeclaration) {
		_shipStoresDeclaration = shipStoresDeclaration;
	}

	public String getCrewList() {
		return _crewList;
	}

	public void setCrewList(String crewList) {
		_crewList = crewList;
	}

	public String getPassengerList() {
		return _passengerList;
	}

	public void setPassengerList(String passengerList) {
		_passengerList = passengerList;
	}

	public String getShipRequirements() {
		return _shipRequirements;
	}

	public void setShipRequirements(String shipRequirements) {
		_shipRequirements = shipRequirements;
	}

	public int getIsCrewEffectDeclaration() {
		return _isCrewEffectDeclaration;
	}

	public void setIsCrewEffectDeclaration(int isCrewEffectDeclaration) {
		_isCrewEffectDeclaration = isCrewEffectDeclaration;
	}

	public int getIsMaritimeDeclarationHealth() {
		return _isMaritimeDeclarationHealth;
	}

	public void setIsMaritimeDeclarationHealth(int isMaritimeDeclarationHealth) {
		_isMaritimeDeclarationHealth = isMaritimeDeclarationHealth;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	private long _id;
	private String _documentNo;
	private String _documentFunction;
	private int _isArrival;
	private int _isDeparture;
	private String _shipCode;
	private String _arrivalOrDeparturePortCode;
	private Date _timeArrivalOrDeparture;
	private String _imoNumber;
	private String _callSign;
	private int _voyageNumber;
	private String _shipNationCode;
	private String _nameOfMaster;
	private String _lastPort;
	private String _contactDetailShipAgent;
	private double _grossTonnage;
	private double _netTonnage;
	private int _positionShipInPort;
	private String _briefParticularsVoyage;
	private String _briefDescriptionCargo;
	private int _crewNumber;
	private int _passengerNumber;
	private String _remarks;
	private String _cargoDeclaration;
	private String _shipStoresDeclaration;
	private String _crewList;
	private String _passengerList;
	private String _shipRequirements;
	private int _isCrewEffectDeclaration;
	private int _isMaritimeDeclarationHealth;
	private Date _createDate;
	private Date _modifyDate;
}