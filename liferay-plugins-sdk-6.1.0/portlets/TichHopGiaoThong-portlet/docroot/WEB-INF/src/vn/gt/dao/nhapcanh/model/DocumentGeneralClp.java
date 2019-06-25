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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.nhapcanh.service.DocumentGeneralLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DocumentGeneralClp extends BaseModelImpl<DocumentGeneral>
	implements DocumentGeneral {
	public DocumentGeneralClp() {
	}

	public Class<?> getModelClass() {
		return DocumentGeneral.class;
	}

	public String getModelClassName() {
		return DocumentGeneral.class.getName();
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentGeneralLocalServiceUtil.addDocumentGeneral(this);
		}
		else {
			DocumentGeneralLocalServiceUtil.updateDocumentGeneral(this);
		}
	}

	@Override
	public DocumentGeneral toEscapedModel() {
		return (DocumentGeneral)Proxy.newProxyInstance(DocumentGeneral.class.getClassLoader(),
			new Class[] { DocumentGeneral.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentGeneralClp clone = new DocumentGeneralClp();

		clone.setId(getId());
		clone.setDocumentNo(getDocumentNo());
		clone.setDocumentFunction(getDocumentFunction());
		clone.setIsArrival(getIsArrival());
		clone.setIsDeparture(getIsDeparture());
		clone.setShipCode(getShipCode());
		clone.setArrivalOrDeparturePortCode(getArrivalOrDeparturePortCode());
		clone.setTimeArrivalOrDeparture(getTimeArrivalOrDeparture());
		clone.setImoNumber(getImoNumber());
		clone.setCallSign(getCallSign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setShipNationCode(getShipNationCode());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setLastPort(getLastPort());
		clone.setContactDetailShipAgent(getContactDetailShipAgent());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setNetTonnage(getNetTonnage());
		clone.setPositionShipInPort(getPositionShipInPort());
		clone.setBriefParticularsVoyage(getBriefParticularsVoyage());
		clone.setBriefDescriptionCargo(getBriefDescriptionCargo());
		clone.setCrewNumber(getCrewNumber());
		clone.setPassengerNumber(getPassengerNumber());
		clone.setRemarks(getRemarks());
		clone.setCargoDeclaration(getCargoDeclaration());
		clone.setShipStoresDeclaration(getShipStoresDeclaration());
		clone.setCrewList(getCrewList());
		clone.setPassengerList(getPassengerList());
		clone.setShipRequirements(getShipRequirements());
		clone.setIsCrewEffectDeclaration(getIsCrewEffectDeclaration());
		clone.setIsMaritimeDeclarationHealth(getIsMaritimeDeclarationHealth());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	public int compareTo(DocumentGeneral documentGeneral) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				documentGeneral.getCreateDate());

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

		DocumentGeneralClp documentGeneral = null;

		try {
			documentGeneral = (DocumentGeneralClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = documentGeneral.getPrimaryKey();

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
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", documentNo=");
		sb.append(getDocumentNo());
		sb.append(", documentFunction=");
		sb.append(getDocumentFunction());
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", isDeparture=");
		sb.append(getIsDeparture());
		sb.append(", shipCode=");
		sb.append(getShipCode());
		sb.append(", arrivalOrDeparturePortCode=");
		sb.append(getArrivalOrDeparturePortCode());
		sb.append(", timeArrivalOrDeparture=");
		sb.append(getTimeArrivalOrDeparture());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", shipNationCode=");
		sb.append(getShipNationCode());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", lastPort=");
		sb.append(getLastPort());
		sb.append(", contactDetailShipAgent=");
		sb.append(getContactDetailShipAgent());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", netTonnage=");
		sb.append(getNetTonnage());
		sb.append(", positionShipInPort=");
		sb.append(getPositionShipInPort());
		sb.append(", briefParticularsVoyage=");
		sb.append(getBriefParticularsVoyage());
		sb.append(", briefDescriptionCargo=");
		sb.append(getBriefDescriptionCargo());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", passengerNumber=");
		sb.append(getPassengerNumber());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", cargoDeclaration=");
		sb.append(getCargoDeclaration());
		sb.append(", shipStoresDeclaration=");
		sb.append(getShipStoresDeclaration());
		sb.append(", crewList=");
		sb.append(getCrewList());
		sb.append(", passengerList=");
		sb.append(getPassengerList());
		sb.append(", shipRequirements=");
		sb.append(getShipRequirements());
		sb.append(", isCrewEffectDeclaration=");
		sb.append(getIsCrewEffectDeclaration());
		sb.append(", isMaritimeDeclarationHealth=");
		sb.append(getIsMaritimeDeclarationHealth());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(100);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.nhapcanh.model.DocumentGeneral");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentNo</column-name><column-value><![CDATA[");
		sb.append(getDocumentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentFunction</column-name><column-value><![CDATA[");
		sb.append(getDocumentFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDeparture</column-name><column-value><![CDATA[");
		sb.append(getIsDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipCode</column-name><column-value><![CDATA[");
		sb.append(getShipCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalOrDeparturePortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalOrDeparturePortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeArrivalOrDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeArrivalOrDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipNationCode</column-name><column-value><![CDATA[");
		sb.append(getShipNationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPort</column-name><column-value><![CDATA[");
		sb.append(getLastPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactDetailShipAgent</column-name><column-value><![CDATA[");
		sb.append(getContactDetailShipAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnage</column-name><column-value><![CDATA[");
		sb.append(getNetTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionShipInPort</column-name><column-value><![CDATA[");
		sb.append(getPositionShipInPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefParticularsVoyage</column-name><column-value><![CDATA[");
		sb.append(getBriefParticularsVoyage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefDescriptionCargo</column-name><column-value><![CDATA[");
		sb.append(getBriefDescriptionCargo());
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
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoDeclaration</column-name><column-value><![CDATA[");
		sb.append(getCargoDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipStoresDeclaration</column-name><column-value><![CDATA[");
		sb.append(getShipStoresDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewList</column-name><column-value><![CDATA[");
		sb.append(getCrewList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerList</column-name><column-value><![CDATA[");
		sb.append(getPassengerList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipRequirements</column-name><column-value><![CDATA[");
		sb.append(getShipRequirements());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isCrewEffectDeclaration</column-name><column-value><![CDATA[");
		sb.append(getIsCrewEffectDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMaritimeDeclarationHealth</column-name><column-value><![CDATA[");
		sb.append(getIsMaritimeDeclarationHealth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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