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

import vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempShipStoresDeclarationClp extends BaseModelImpl<TempShipStoresDeclaration>
	implements TempShipStoresDeclaration {
	public TempShipStoresDeclarationClp() {
	}

	public Class<?> getModelClass() {
		return TempShipStoresDeclaration.class;
	}

	public String getModelClassName() {
		return TempShipStoresDeclaration.class.getName();
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

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public int getIsArrival() {
		return _isArrival;
	}

	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
	}

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getImoNumber() {
		return _imoNumber;
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	public String getCallsign() {
		return _callsign;
	}

	public void setCallsign(String callsign) {
		_callsign = callsign;
	}

	public String getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public String getNationalityOfShip() {
		return _nationalityOfShip;
	}

	public void setNationalityOfShip(String nationalityOfShip) {
		_nationalityOfShip = nationalityOfShip;
	}

	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;
	}

	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
	}

	public int getNumberOfPersonsOnBoat() {
		return _numberOfPersonsOnBoat;
	}

	public void setNumberOfPersonsOnBoat(int numberOfPersonsOnBoat) {
		_numberOfPersonsOnBoat = numberOfPersonsOnBoat;
	}

	public String getPeriodOfStay() {
		return _periodOfStay;
	}

	public void setPeriodOfStay(String periodOfStay) {
		_periodOfStay = periodOfStay;
	}

	public String getPeriodOfStayUnit() {
		return _periodOfStayUnit;
	}

	public void setPeriodOfStayUnit(String periodOfStayUnit) {
		_periodOfStayUnit = periodOfStayUnit;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public int getListShipsStores() {
		return _listShipsStores;
	}

	public void setListShipsStores(int listShipsStores) {
		_listShipsStores = listShipsStores;
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

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipStoresDeclarationLocalServiceUtil.addTempShipStoresDeclaration(this);
		}
		else {
			TempShipStoresDeclarationLocalServiceUtil.updateTempShipStoresDeclaration(this);
		}
	}

	@Override
	public TempShipStoresDeclaration toEscapedModel() {
		return (TempShipStoresDeclaration)Proxy.newProxyInstance(TempShipStoresDeclaration.class.getClassLoader(),
			new Class[] { TempShipStoresDeclaration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipStoresDeclarationClp clone = new TempShipStoresDeclarationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setIsArrival(getIsArrival());
		clone.setNameOfShip(getNameOfShip());
		clone.setImoNumber(getImoNumber());
		clone.setCallsign(getCallsign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setNationalityOfShip(getNationalityOfShip());
		clone.setPortOfArrivalCode(getPortOfArrivalCode());
		clone.setDateOfArrival(getDateOfArrival());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setNumberOfPersonsOnBoat(getNumberOfPersonsOnBoat());
		clone.setPeriodOfStay(getPeriodOfStay());
		clone.setPeriodOfStayUnit(getPeriodOfStayUnit());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setListShipsStores(getListShipsStores());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	public int compareTo(TempShipStoresDeclaration tempShipStoresDeclaration) {
		int value = 0;

		if (getId() < tempShipStoresDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > tempShipStoresDeclaration.getId()) {
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

		TempShipStoresDeclarationClp tempShipStoresDeclaration = null;

		try {
			tempShipStoresDeclaration = (TempShipStoresDeclarationClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempShipStoresDeclaration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

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
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callsign=");
		sb.append(getCallsign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", nationalityOfShip=");
		sb.append(getNationalityOfShip());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", dateOfArrival=");
		sb.append(getDateOfArrival());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", numberOfPersonsOnBoat=");
		sb.append(getNumberOfPersonsOnBoat());
		sb.append(", periodOfStay=");
		sb.append(getPeriodOfStay());
		sb.append(", periodOfStayUnit=");
		sb.append(getPeriodOfStayUnit());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", listShipsStores=");
		sb.append(getListShipsStores());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration");
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
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callsign</column-name><column-value><![CDATA[");
		sb.append(getCallsign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationalityOfShip</column-name><column-value><![CDATA[");
		sb.append(getNationalityOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfArrival</column-name><column-value><![CDATA[");
		sb.append(getDateOfArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPersonsOnBoat</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPersonsOnBoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>periodOfStay</column-name><column-value><![CDATA[");
		sb.append(getPeriodOfStay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>periodOfStayUnit</column-name><column-value><![CDATA[");
		sb.append(getPeriodOfStayUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listShipsStores</column-name><column-value><![CDATA[");
		sb.append(getListShipsStores());
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
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _userCreated;
	private int _isArrival;
	private String _nameOfShip;
	private String _imoNumber;
	private String _callsign;
	private String _voyageNumber;
	private String _nationalityOfShip;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _lastPortOfCallCode;
	private int _numberOfPersonsOnBoat;
	private String _periodOfStay;
	private String _periodOfStayUnit;
	private String _nameOfMaster;
	private int _listShipsStores;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
}