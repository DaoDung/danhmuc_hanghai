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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine;
import vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantineModel;
import vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantineSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the TempDeclarationForAnimalQuarantine service. Represents a row in the &quot;temp_animal_quarantine&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantineModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempDeclarationForAnimalQuarantineImpl}.
 * </p>
 *
 * @author win_64
 * @see TempDeclarationForAnimalQuarantineImpl
 * @see vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine
 * @see vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantineModel
 * @generated
 */
@JSON(strict = true)
public class TempDeclarationForAnimalQuarantineModelImpl extends BaseModelImpl<TempDeclarationForAnimalQuarantine>
	implements TempDeclarationForAnimalQuarantineModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp declaration for animal quarantine model instance should use the {@link vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine} interface instead.
	 */
	public static final String TABLE_NAME = "temp_animal_quarantine";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "UserCreated", Types.VARCHAR },
			{ "NameOfShip", Types.VARCHAR },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "NumberOfCrew", Types.INTEGER },
			{ "NumberOfPassengers", Types.INTEGER },
			{ "LastPortOfCallCode", Types.VARCHAR },
			{ "NextPortOfCallCode", Types.VARCHAR },
			{ "AnimalNameFirst", Types.VARCHAR },
			{ "AnimalNameBetween", Types.VARCHAR },
			{ "AnimalNameThis", Types.VARCHAR },
			{ "NameOfMaster", Types.VARCHAR },
			{ "SignPlace", Types.VARCHAR },
			{ "SignDate", Types.TIMESTAMP },
			{ "MasterSigned", Types.INTEGER },
			{ "MasterSignedImage", Types.INTEGER },
			{ "AttachedFile", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table temp_animal_quarantine (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,DocumentYear INTEGER,UserCreated VARCHAR(75) null,NameOfShip VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,NumberOfCrew INTEGER,NumberOfPassengers INTEGER,LastPortOfCallCode VARCHAR(75) null,NextPortOfCallCode VARCHAR(75) null,AnimalNameFirst VARCHAR(75) null,AnimalNameBetween VARCHAR(75) null,AnimalNameThis VARCHAR(75) null,NameOfMaster VARCHAR(75) null,SignPlace VARCHAR(75) null,SignDate DATE null,MasterSigned INTEGER,MasterSignedImage INTEGER,AttachedFile LONG)";
	public static final String TABLE_SQL_DROP = "drop table temp_animal_quarantine";
	public static final String ORDER_BY_JPQL = " ORDER BY tempDeclarationForAnimalQuarantine.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY temp_animal_quarantine.ID ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine"),
			true);
	public static long DOCUMENTNAME_COLUMN_BITMASK = 1L;
	public static long DOCUMENTYEAR_COLUMN_BITMASK = 2L;
	public static long REQUESTCODE_COLUMN_BITMASK = 4L;
	public static long REQUESTSTATE_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempDeclarationForAnimalQuarantine toModel(
		TempDeclarationForAnimalQuarantineSoap soapModel) {
		TempDeclarationForAnimalQuarantine model = new TempDeclarationForAnimalQuarantineImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setUserCreated(soapModel.getUserCreated());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setNumberOfCrew(soapModel.getNumberOfCrew());
		model.setNumberOfPassengers(soapModel.getNumberOfPassengers());
		model.setLastPortOfCallCode(soapModel.getLastPortOfCallCode());
		model.setNextPortOfCallCode(soapModel.getNextPortOfCallCode());
		model.setAnimalNameFirst(soapModel.getAnimalNameFirst());
		model.setAnimalNameBetween(soapModel.getAnimalNameBetween());
		model.setAnimalNameThis(soapModel.getAnimalNameThis());
		model.setNameOfMaster(soapModel.getNameOfMaster());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());
		model.setMasterSigned(soapModel.getMasterSigned());
		model.setMasterSignedImage(soapModel.getMasterSignedImage());
		model.setAttachedFile(soapModel.getAttachedFile());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempDeclarationForAnimalQuarantine> toModels(
		TempDeclarationForAnimalQuarantineSoap[] soapModels) {
		List<TempDeclarationForAnimalQuarantine> models = new ArrayList<TempDeclarationForAnimalQuarantine>(soapModels.length);

		for (TempDeclarationForAnimalQuarantineSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantine"));

	public TempDeclarationForAnimalQuarantineModelImpl() {
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

	public Class<?> getModelClass() {
		return TempDeclarationForAnimalQuarantine.class;
	}

	public String getModelClassName() {
		return TempDeclarationForAnimalQuarantine.class.getName();
	}

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	public void setRequestCode(String requestCode) {
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_columnBitmask |= REQUESTSTATE_COLUMN_BITMASK;

		if (!_setOriginalRequestState) {
			_setOriginalRequestState = true;

			_originalRequestState = _requestState;
		}

		_requestState = requestState;
	}

	public int getOriginalRequestState() {
		return _originalRequestState;
	}

	@JSON
	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_columnBitmask |= DOCUMENTNAME_COLUMN_BITMASK;

		if (!_setOriginalDocumentName) {
			_setOriginalDocumentName = true;

			_originalDocumentName = _documentName;
		}

		_documentName = documentName;
	}

	public long getOriginalDocumentName() {
		return _originalDocumentName;
	}

	@JSON
	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_columnBitmask |= DOCUMENTYEAR_COLUMN_BITMASK;

		if (!_setOriginalDocumentYear) {
			_setOriginalDocumentYear = true;

			_originalDocumentYear = _documentYear;
		}

		_documentYear = documentYear;
	}

	public int getOriginalDocumentYear() {
		return _originalDocumentYear;
	}

	@JSON
	public String getUserCreated() {
		if (_userCreated == null) {
			return StringPool.BLANK;
		}
		else {
			return _userCreated;
		}
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	@JSON
	public String getNameOfShip() {
		if (_nameOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfShip;
		}
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	@JSON
	public String getFlagStateOfShip() {
		if (_flagStateOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _flagStateOfShip;
		}
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	@JSON
	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;
	}

	@JSON
	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;
	}

	@JSON
	public String getLastPortOfCallCode() {
		if (_lastPortOfCallCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastPortOfCallCode;
		}
	}

	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
	}

	@JSON
	public String getNextPortOfCallCode() {
		if (_nextPortOfCallCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _nextPortOfCallCode;
		}
	}

	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;
	}

	@JSON
	public String getAnimalNameFirst() {
		if (_animalNameFirst == null) {
			return StringPool.BLANK;
		}
		else {
			return _animalNameFirst;
		}
	}

	public void setAnimalNameFirst(String animalNameFirst) {
		_animalNameFirst = animalNameFirst;
	}

	@JSON
	public String getAnimalNameBetween() {
		if (_animalNameBetween == null) {
			return StringPool.BLANK;
		}
		else {
			return _animalNameBetween;
		}
	}

	public void setAnimalNameBetween(String animalNameBetween) {
		_animalNameBetween = animalNameBetween;
	}

	@JSON
	public String getAnimalNameThis() {
		if (_animalNameThis == null) {
			return StringPool.BLANK;
		}
		else {
			return _animalNameThis;
		}
	}

	public void setAnimalNameThis(String animalNameThis) {
		_animalNameThis = animalNameThis;
	}

	@JSON
	public String getNameOfMaster() {
		if (_nameOfMaster == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfMaster;
		}
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	@JSON
	public String getSignPlace() {
		if (_signPlace == null) {
			return StringPool.BLANK;
		}
		else {
			return _signPlace;
		}
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	@JSON
	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	@JSON
	public int getMasterSigned() {
		return _masterSigned;
	}

	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;
	}

	@JSON
	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;
	}

	@JSON
	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public TempDeclarationForAnimalQuarantine toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TempDeclarationForAnimalQuarantine)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					TempDeclarationForAnimalQuarantine.class.getName(),
					getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		TempDeclarationForAnimalQuarantineImpl tempDeclarationForAnimalQuarantineImpl =
			new TempDeclarationForAnimalQuarantineImpl();

		tempDeclarationForAnimalQuarantineImpl.setId(getId());
		tempDeclarationForAnimalQuarantineImpl.setRequestCode(getRequestCode());
		tempDeclarationForAnimalQuarantineImpl.setRequestState(getRequestState());
		tempDeclarationForAnimalQuarantineImpl.setDocumentName(getDocumentName());
		tempDeclarationForAnimalQuarantineImpl.setDocumentYear(getDocumentYear());
		tempDeclarationForAnimalQuarantineImpl.setUserCreated(getUserCreated());
		tempDeclarationForAnimalQuarantineImpl.setNameOfShip(getNameOfShip());
		tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(getFlagStateOfShip());
		tempDeclarationForAnimalQuarantineImpl.setNumberOfCrew(getNumberOfCrew());
		tempDeclarationForAnimalQuarantineImpl.setNumberOfPassengers(getNumberOfPassengers());
		tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(getLastPortOfCallCode());
		tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(getNextPortOfCallCode());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(getAnimalNameFirst());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(getAnimalNameBetween());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(getAnimalNameThis());
		tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(getNameOfMaster());
		tempDeclarationForAnimalQuarantineImpl.setSignPlace(getSignPlace());
		tempDeclarationForAnimalQuarantineImpl.setSignDate(getSignDate());
		tempDeclarationForAnimalQuarantineImpl.setMasterSigned(getMasterSigned());
		tempDeclarationForAnimalQuarantineImpl.setMasterSignedImage(getMasterSignedImage());
		tempDeclarationForAnimalQuarantineImpl.setAttachedFile(getAttachedFile());

		tempDeclarationForAnimalQuarantineImpl.resetOriginalValues();

		return tempDeclarationForAnimalQuarantineImpl;
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

		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = null;

		try {
			tempDeclarationForAnimalQuarantine = (TempDeclarationForAnimalQuarantine)obj;
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
	public void resetOriginalValues() {
		TempDeclarationForAnimalQuarantineModelImpl tempDeclarationForAnimalQuarantineModelImpl =
			this;

		tempDeclarationForAnimalQuarantineModelImpl._originalRequestCode = tempDeclarationForAnimalQuarantineModelImpl._requestCode;

		tempDeclarationForAnimalQuarantineModelImpl._originalRequestState = tempDeclarationForAnimalQuarantineModelImpl._requestState;

		tempDeclarationForAnimalQuarantineModelImpl._setOriginalRequestState = false;

		tempDeclarationForAnimalQuarantineModelImpl._originalDocumentName = tempDeclarationForAnimalQuarantineModelImpl._documentName;

		tempDeclarationForAnimalQuarantineModelImpl._setOriginalDocumentName = false;

		tempDeclarationForAnimalQuarantineModelImpl._originalDocumentYear = tempDeclarationForAnimalQuarantineModelImpl._documentYear;

		tempDeclarationForAnimalQuarantineModelImpl._setOriginalDocumentYear = false;

		tempDeclarationForAnimalQuarantineModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempDeclarationForAnimalQuarantine> toCacheModel() {
		TempDeclarationForAnimalQuarantineCacheModel tempDeclarationForAnimalQuarantineCacheModel =
			new TempDeclarationForAnimalQuarantineCacheModel();

		tempDeclarationForAnimalQuarantineCacheModel.id = getId();

		tempDeclarationForAnimalQuarantineCacheModel.requestCode = getRequestCode();

		String requestCode = tempDeclarationForAnimalQuarantineCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.requestCode = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.requestState = getRequestState();

		tempDeclarationForAnimalQuarantineCacheModel.documentName = getDocumentName();

		tempDeclarationForAnimalQuarantineCacheModel.documentYear = getDocumentYear();

		tempDeclarationForAnimalQuarantineCacheModel.userCreated = getUserCreated();

		String userCreated = tempDeclarationForAnimalQuarantineCacheModel.userCreated;

		if ((userCreated != null) && (userCreated.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.userCreated = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = tempDeclarationForAnimalQuarantineCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.nameOfShip = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = tempDeclarationForAnimalQuarantineCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.flagStateOfShip = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.numberOfCrew = getNumberOfCrew();

		tempDeclarationForAnimalQuarantineCacheModel.numberOfPassengers = getNumberOfPassengers();

		tempDeclarationForAnimalQuarantineCacheModel.lastPortOfCallCode = getLastPortOfCallCode();

		String lastPortOfCallCode = tempDeclarationForAnimalQuarantineCacheModel.lastPortOfCallCode;

		if ((lastPortOfCallCode != null) && (lastPortOfCallCode.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.lastPortOfCallCode = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.nextPortOfCallCode = getNextPortOfCallCode();

		String nextPortOfCallCode = tempDeclarationForAnimalQuarantineCacheModel.nextPortOfCallCode;

		if ((nextPortOfCallCode != null) && (nextPortOfCallCode.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.nextPortOfCallCode = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.animalNameFirst = getAnimalNameFirst();

		String animalNameFirst = tempDeclarationForAnimalQuarantineCacheModel.animalNameFirst;

		if ((animalNameFirst != null) && (animalNameFirst.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.animalNameFirst = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.animalNameBetween = getAnimalNameBetween();

		String animalNameBetween = tempDeclarationForAnimalQuarantineCacheModel.animalNameBetween;

		if ((animalNameBetween != null) && (animalNameBetween.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.animalNameBetween = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.animalNameThis = getAnimalNameThis();

		String animalNameThis = tempDeclarationForAnimalQuarantineCacheModel.animalNameThis;

		if ((animalNameThis != null) && (animalNameThis.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.animalNameThis = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.nameOfMaster = getNameOfMaster();

		String nameOfMaster = tempDeclarationForAnimalQuarantineCacheModel.nameOfMaster;

		if ((nameOfMaster != null) && (nameOfMaster.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.nameOfMaster = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.signPlace = getSignPlace();

		String signPlace = tempDeclarationForAnimalQuarantineCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			tempDeclarationForAnimalQuarantineCacheModel.signDate = signDate.getTime();
		}
		else {
			tempDeclarationForAnimalQuarantineCacheModel.signDate = Long.MIN_VALUE;
		}

		tempDeclarationForAnimalQuarantineCacheModel.masterSigned = getMasterSigned();

		tempDeclarationForAnimalQuarantineCacheModel.masterSignedImage = getMasterSignedImage();

		tempDeclarationForAnimalQuarantineCacheModel.attachedFile = getAttachedFile();

		return tempDeclarationForAnimalQuarantineCacheModel;
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

	private static ClassLoader _classLoader = TempDeclarationForAnimalQuarantine.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TempDeclarationForAnimalQuarantine.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
	private int _requestState;
	private int _originalRequestState;
	private boolean _setOriginalRequestState;
	private long _documentName;
	private long _originalDocumentName;
	private boolean _setOriginalDocumentName;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
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
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private TempDeclarationForAnimalQuarantine _escapedModelProxy;
}