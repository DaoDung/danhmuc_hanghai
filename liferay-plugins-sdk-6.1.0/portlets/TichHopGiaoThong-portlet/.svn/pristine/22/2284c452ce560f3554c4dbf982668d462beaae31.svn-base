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

import vn.gt.dao.noticeandmessage.service.TempDeclarationForAnimalQuarantineLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempDeclarationForAnimalQuarantineClp extends BaseModelImpl<TempDeclarationForAnimalQuarantine>
	implements TempDeclarationForAnimalQuarantine {
	public TempDeclarationForAnimalQuarantineClp() {
	}

	public Class<?> getModelClass() {
		return TempDeclarationForAnimalQuarantine.class;
	}

	public String getModelClassName() {
		return TempDeclarationForAnimalQuarantine.class.getName();
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

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;
	}

	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;
	}

	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
	}

	public String getNextPortOfCallCode() {
		return _nextPortOfCallCode;
	}

	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;
	}

	public String getAnimalNameFirst() {
		return _animalNameFirst;
	}

	public void setAnimalNameFirst(String animalNameFirst) {
		_animalNameFirst = animalNameFirst;
	}

	public String getAnimalNameBetween() {
		return _animalNameBetween;
	}

	public void setAnimalNameBetween(String animalNameBetween) {
		_animalNameBetween = animalNameBetween;
	}

	public String getAnimalNameThis() {
		return _animalNameThis;
	}

	public void setAnimalNameThis(String animalNameThis) {
		_animalNameThis = animalNameThis;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
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
			TempDeclarationForAnimalQuarantineLocalServiceUtil.addTempDeclarationForAnimalQuarantine(this);
		}
		else {
			TempDeclarationForAnimalQuarantineLocalServiceUtil.updateTempDeclarationForAnimalQuarantine(this);
		}
	}

	@Override
	public TempDeclarationForAnimalQuarantine toEscapedModel() {
		return (TempDeclarationForAnimalQuarantine)Proxy.newProxyInstance(TempDeclarationForAnimalQuarantine.class.getClassLoader(),
			new Class[] { TempDeclarationForAnimalQuarantine.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDeclarationForAnimalQuarantineClp clone = new TempDeclarationForAnimalQuarantineClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNumberOfCrew(getNumberOfCrew());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setNextPortOfCallCode(getNextPortOfCallCode());
		clone.setAnimalNameFirst(getAnimalNameFirst());
		clone.setAnimalNameBetween(getAnimalNameBetween());
		clone.setAnimalNameThis(getAnimalNameThis());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	public int compareTo(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		int value = 0;

		if (getId() < tempDeclarationForAnimalQuarantine.getId()) {
			value = -1;
		}
		else if (getId() > tempDeclarationForAnimalQuarantine.getId()) {
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

		TempDeclarationForAnimalQuarantineClp tempDeclarationForAnimalQuarantine =
			null;

		try {
			tempDeclarationForAnimalQuarantine = (TempDeclarationForAnimalQuarantineClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempDeclarationForAnimalQuarantine.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

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
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", numberOfCrew=");
		sb.append(getNumberOfCrew());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", nextPortOfCallCode=");
		sb.append(getNextPortOfCallCode());
		sb.append(", animalNameFirst=");
		sb.append(getAnimalNameFirst());
		sb.append(", animalNameBetween=");
		sb.append(getAnimalNameBetween());
		sb.append(", animalNameThis=");
		sb.append(getAnimalNameThis());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append(
			"vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine");
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
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfCrew</column-name><column-value><![CDATA[");
		sb.append(getNumberOfCrew());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getNextPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameFirst</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameFirst());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameBetween</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameBetween());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameThis</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameThis());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
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
	private String _nameOfShip;
	private String _flagStateOfShip;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _lastPortOfCallCode;
	private String _nextPortOfCallCode;
	private String _animalNameFirst;
	private String _animalNameBetween;
	private String _animalNameThis;
	private String _nameOfMaster;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
}