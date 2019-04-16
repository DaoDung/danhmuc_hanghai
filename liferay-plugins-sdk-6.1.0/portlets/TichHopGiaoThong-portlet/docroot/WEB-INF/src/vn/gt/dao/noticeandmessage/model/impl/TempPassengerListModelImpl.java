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

import vn.gt.dao.noticeandmessage.model.TempPassengerList;
import vn.gt.dao.noticeandmessage.model.TempPassengerListModel;
import vn.gt.dao.noticeandmessage.model.TempPassengerListSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the TempPassengerList service. Represents a row in the &quot;TEMP_PASSENGER_LIST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.noticeandmessage.model.TempPassengerListModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempPassengerListImpl}.
 * </p>
 *
 * @author win_64
 * @see TempPassengerListImpl
 * @see vn.gt.dao.noticeandmessage.model.TempPassengerList
 * @see vn.gt.dao.noticeandmessage.model.TempPassengerListModel
 * @generated
 */
@JSON(strict = true)
public class TempPassengerListModelImpl extends BaseModelImpl<TempPassengerList>
	implements TempPassengerListModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp passenger list model instance should use the {@link vn.gt.dao.noticeandmessage.model.TempPassengerList} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_PASSENGER_LIST";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "UserCreated", Types.VARCHAR },
			{ "isArrival", Types.INTEGER },
			{ "NameOfShip", Types.VARCHAR },
			{ "PortOfArrivalCode", Types.VARCHAR },
			{ "DateOfArrival", Types.TIMESTAMP },
			{ "IMONumber", Types.VARCHAR },
			{ "CallSign", Types.VARCHAR },
			{ "VoyageNumber", Types.VARCHAR },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "ListPassengers", Types.INTEGER },
			{ "SignPlace", Types.VARCHAR },
			{ "SignDate", Types.TIMESTAMP },
			{ "MasterSigned", Types.INTEGER },
			{ "MasterSignedImage", Types.INTEGER },
			{ "AttachedFile", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "NumberOfLeftPassengers", Types.INTEGER },
			{ "NumberOfVNmeses", Types.INTEGER },
			{ "NumberOfForeigners", Types.INTEGER },
			{ "TotalPassengers", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_PASSENGER_LIST (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,UserCreated VARCHAR(75) null,isArrival INTEGER,NameOfShip VARCHAR(75) null,PortOfArrivalCode VARCHAR(75) null,DateOfArrival DATE null,IMONumber VARCHAR(75) null,CallSign VARCHAR(75) null,VoyageNumber VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,ListPassengers INTEGER,SignPlace VARCHAR(75) null,SignDate DATE null,MasterSigned INTEGER,MasterSignedImage INTEGER,AttachedFile LONG,DocumentYear INTEGER,NumberOfLeftPassengers INTEGER,NumberOfVNmeses INTEGER,NumberOfForeigners INTEGER,TotalPassengers INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_PASSENGER_LIST";
	public static final String ORDER_BY_JPQL = " ORDER BY tempPassengerList.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_PASSENGER_LIST.ID DESC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.noticeandmessage.model.TempPassengerList"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.noticeandmessage.model.TempPassengerList"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.noticeandmessage.model.TempPassengerList"),
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
	public static TempPassengerList toModel(TempPassengerListSoap soapModel) {
		TempPassengerList model = new TempPassengerListImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setUserCreated(soapModel.getUserCreated());
		model.setIsArrival(soapModel.getIsArrival());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setPortOfArrivalCode(soapModel.getPortOfArrivalCode());
		model.setDateOfArrival(soapModel.getDateOfArrival());
		model.setImoNumber(soapModel.getImoNumber());
		model.setCallSign(soapModel.getCallSign());
		model.setVoyageNumber(soapModel.getVoyageNumber());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setListPassengers(soapModel.getListPassengers());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());
		model.setMasterSigned(soapModel.getMasterSigned());
		model.setMasterSignedImage(soapModel.getMasterSignedImage());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setNumberOfLeftPassengers(soapModel.getNumberOfLeftPassengers());
		model.setNumberOfVNmeses(soapModel.getNumberOfVNmeses());
		model.setNumberOfForeigners(soapModel.getNumberOfForeigners());
		model.setTotalPassengers(soapModel.getTotalPassengers());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempPassengerList> toModels(
		TempPassengerListSoap[] soapModels) {
		List<TempPassengerList> models = new ArrayList<TempPassengerList>(soapModels.length);

		for (TempPassengerListSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.noticeandmessage.model.TempPassengerList"));

	public TempPassengerListModelImpl() {
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
		return TempPassengerList.class;
	}

	public String getModelClassName() {
		return TempPassengerList.class.getName();
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
	public int getIsArrival() {
		return _isArrival;
	}

	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
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
	public String getPortOfArrivalCode() {
		if (_portOfArrivalCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portOfArrivalCode;
		}
	}

	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	@JSON
	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;
	}

	@JSON
	public String getImoNumber() {
		if (_imoNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _imoNumber;
		}
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	@JSON
	public String getCallSign() {
		if (_callSign == null) {
			return StringPool.BLANK;
		}
		else {
			return _callSign;
		}
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	@JSON
	public String getVoyageNumber() {
		if (_voyageNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _voyageNumber;
		}
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
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
	public int getListPassengers() {
		return _listPassengers;
	}

	public void setListPassengers(int listPassengers) {
		_listPassengers = listPassengers;
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
	public int getNumberOfLeftPassengers() {
		return _NumberOfLeftPassengers;
	}

	public void setNumberOfLeftPassengers(int NumberOfLeftPassengers) {
		_NumberOfLeftPassengers = NumberOfLeftPassengers;
	}

	@JSON
	public int getNumberOfVNmeses() {
		return _NumberOfVNmeses;
	}

	public void setNumberOfVNmeses(int NumberOfVNmeses) {
		_NumberOfVNmeses = NumberOfVNmeses;
	}

	@JSON
	public int getNumberOfForeigners() {
		return _NumberOfForeigners;
	}

	public void setNumberOfForeigners(int NumberOfForeigners) {
		_NumberOfForeigners = NumberOfForeigners;
	}

	@JSON
	public int getTotalPassengers() {
		return _TotalPassengers;
	}

	public void setTotalPassengers(int TotalPassengers) {
		_TotalPassengers = TotalPassengers;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public TempPassengerList toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TempPassengerList)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					TempPassengerList.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		TempPassengerListImpl tempPassengerListImpl = new TempPassengerListImpl();

		tempPassengerListImpl.setId(getId());
		tempPassengerListImpl.setRequestCode(getRequestCode());
		tempPassengerListImpl.setRequestState(getRequestState());
		tempPassengerListImpl.setDocumentName(getDocumentName());
		tempPassengerListImpl.setUserCreated(getUserCreated());
		tempPassengerListImpl.setIsArrival(getIsArrival());
		tempPassengerListImpl.setNameOfShip(getNameOfShip());
		tempPassengerListImpl.setPortOfArrivalCode(getPortOfArrivalCode());
		tempPassengerListImpl.setDateOfArrival(getDateOfArrival());
		tempPassengerListImpl.setImoNumber(getImoNumber());
		tempPassengerListImpl.setCallSign(getCallSign());
		tempPassengerListImpl.setVoyageNumber(getVoyageNumber());
		tempPassengerListImpl.setFlagStateOfShip(getFlagStateOfShip());
		tempPassengerListImpl.setListPassengers(getListPassengers());
		tempPassengerListImpl.setSignPlace(getSignPlace());
		tempPassengerListImpl.setSignDate(getSignDate());
		tempPassengerListImpl.setMasterSigned(getMasterSigned());
		tempPassengerListImpl.setMasterSignedImage(getMasterSignedImage());
		tempPassengerListImpl.setAttachedFile(getAttachedFile());
		tempPassengerListImpl.setDocumentYear(getDocumentYear());
		tempPassengerListImpl.setNumberOfLeftPassengers(getNumberOfLeftPassengers());
		tempPassengerListImpl.setNumberOfVNmeses(getNumberOfVNmeses());
		tempPassengerListImpl.setNumberOfForeigners(getNumberOfForeigners());
		tempPassengerListImpl.setTotalPassengers(getTotalPassengers());

		tempPassengerListImpl.resetOriginalValues();

		return tempPassengerListImpl;
	}

	public int compareTo(TempPassengerList tempPassengerList) {
		int value = 0;

		if (getId() < tempPassengerList.getId()) {
			value = -1;
		}
		else if (getId() > tempPassengerList.getId()) {
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

		TempPassengerList tempPassengerList = null;

		try {
			tempPassengerList = (TempPassengerList)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempPassengerList.getPrimaryKey();

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
		TempPassengerListModelImpl tempPassengerListModelImpl = this;

		tempPassengerListModelImpl._originalRequestCode = tempPassengerListModelImpl._requestCode;

		tempPassengerListModelImpl._originalRequestState = tempPassengerListModelImpl._requestState;

		tempPassengerListModelImpl._setOriginalRequestState = false;

		tempPassengerListModelImpl._originalDocumentName = tempPassengerListModelImpl._documentName;

		tempPassengerListModelImpl._setOriginalDocumentName = false;

		tempPassengerListModelImpl._originalDocumentYear = tempPassengerListModelImpl._documentYear;

		tempPassengerListModelImpl._setOriginalDocumentYear = false;

		tempPassengerListModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempPassengerList> toCacheModel() {
		TempPassengerListCacheModel tempPassengerListCacheModel = new TempPassengerListCacheModel();

		tempPassengerListCacheModel.id = getId();

		tempPassengerListCacheModel.requestCode = getRequestCode();

		String requestCode = tempPassengerListCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempPassengerListCacheModel.requestCode = null;
		}

		tempPassengerListCacheModel.requestState = getRequestState();

		tempPassengerListCacheModel.documentName = getDocumentName();

		tempPassengerListCacheModel.userCreated = getUserCreated();

		String userCreated = tempPassengerListCacheModel.userCreated;

		if ((userCreated != null) && (userCreated.length() == 0)) {
			tempPassengerListCacheModel.userCreated = null;
		}

		tempPassengerListCacheModel.isArrival = getIsArrival();

		tempPassengerListCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = tempPassengerListCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			tempPassengerListCacheModel.nameOfShip = null;
		}

		tempPassengerListCacheModel.portOfArrivalCode = getPortOfArrivalCode();

		String portOfArrivalCode = tempPassengerListCacheModel.portOfArrivalCode;

		if ((portOfArrivalCode != null) && (portOfArrivalCode.length() == 0)) {
			tempPassengerListCacheModel.portOfArrivalCode = null;
		}

		Date dateOfArrival = getDateOfArrival();

		if (dateOfArrival != null) {
			tempPassengerListCacheModel.dateOfArrival = dateOfArrival.getTime();
		}
		else {
			tempPassengerListCacheModel.dateOfArrival = Long.MIN_VALUE;
		}

		tempPassengerListCacheModel.imoNumber = getImoNumber();

		String imoNumber = tempPassengerListCacheModel.imoNumber;

		if ((imoNumber != null) && (imoNumber.length() == 0)) {
			tempPassengerListCacheModel.imoNumber = null;
		}

		tempPassengerListCacheModel.callSign = getCallSign();

		String callSign = tempPassengerListCacheModel.callSign;

		if ((callSign != null) && (callSign.length() == 0)) {
			tempPassengerListCacheModel.callSign = null;
		}

		tempPassengerListCacheModel.voyageNumber = getVoyageNumber();

		String voyageNumber = tempPassengerListCacheModel.voyageNumber;

		if ((voyageNumber != null) && (voyageNumber.length() == 0)) {
			tempPassengerListCacheModel.voyageNumber = null;
		}

		tempPassengerListCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = tempPassengerListCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			tempPassengerListCacheModel.flagStateOfShip = null;
		}

		tempPassengerListCacheModel.listPassengers = getListPassengers();

		tempPassengerListCacheModel.signPlace = getSignPlace();

		String signPlace = tempPassengerListCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			tempPassengerListCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			tempPassengerListCacheModel.signDate = signDate.getTime();
		}
		else {
			tempPassengerListCacheModel.signDate = Long.MIN_VALUE;
		}

		tempPassengerListCacheModel.masterSigned = getMasterSigned();

		tempPassengerListCacheModel.masterSignedImage = getMasterSignedImage();

		tempPassengerListCacheModel.attachedFile = getAttachedFile();

		tempPassengerListCacheModel.documentYear = getDocumentYear();

		tempPassengerListCacheModel.NumberOfLeftPassengers = getNumberOfLeftPassengers();

		tempPassengerListCacheModel.NumberOfVNmeses = getNumberOfVNmeses();

		tempPassengerListCacheModel.NumberOfForeigners = getNumberOfForeigners();

		tempPassengerListCacheModel.TotalPassengers = getTotalPassengers();

		return tempPassengerListCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", dateOfArrival=");
		sb.append(getDateOfArrival());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", listPassengers=");
		sb.append(getListPassengers());
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
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", NumberOfLeftPassengers=");
		sb.append(getNumberOfLeftPassengers());
		sb.append(", NumberOfVNmeses=");
		sb.append(getNumberOfVNmeses());
		sb.append(", NumberOfForeigners=");
		sb.append(getNumberOfForeigners());
		sb.append(", TotalPassengers=");
		sb.append(getTotalPassengers());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempPassengerList");
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
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfArrival</column-name><column-value><![CDATA[");
		sb.append(getDateOfArrival());
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
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listPassengers</column-name><column-value><![CDATA[");
		sb.append(getListPassengers());
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
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NumberOfLeftPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfLeftPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NumberOfVNmeses</column-name><column-value><![CDATA[");
		sb.append(getNumberOfVNmeses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>NumberOfForeigners</column-name><column-value><![CDATA[");
		sb.append(getNumberOfForeigners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TotalPassengers</column-name><column-value><![CDATA[");
		sb.append(getTotalPassengers());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TempPassengerList.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TempPassengerList.class
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
	private String _userCreated;
	private int _isArrival;
	private String _nameOfShip;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _imoNumber;
	private String _callSign;
	private String _voyageNumber;
	private String _flagStateOfShip;
	private int _listPassengers;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
	private int _NumberOfLeftPassengers;
	private int _NumberOfVNmeses;
	private int _NumberOfForeigners;
	private int _TotalPassengers;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private TempPassengerList _escapedModelProxy;
}