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

import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest;
import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifestModel;
import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifestSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the TempDangerousGoodsNanifest service. Represents a row in the &quot;TEMP_DANGEROUS_GOODS_MANIFEST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempDangerousGoodsNanifestImpl}.
 * </p>
 *
 * @author win_64
 * @see TempDangerousGoodsNanifestImpl
 * @see vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest
 * @see vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifestModel
 * @generated
 */
@JSON(strict = true)
public class TempDangerousGoodsNanifestModelImpl extends BaseModelImpl<TempDangerousGoodsNanifest>
	implements TempDangerousGoodsNanifestModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp dangerous goods nanifest model instance should use the {@link vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_DANGEROUS_GOODS_MANIFEST";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "UserCreated", Types.VARCHAR },
			{ "NameOfShip", Types.VARCHAR },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "MasterName", Types.VARCHAR },
			{ "IMONumber", Types.VARCHAR },
			{ "Callsign", Types.VARCHAR },
			{ "VoyageNumber", Types.VARCHAR },
			{ "PortOfLoadingCode", Types.VARCHAR },
			{ "PortOfDischargeCode", Types.VARCHAR },
			{ "ShippingAgent", Types.VARCHAR },
			{ "AdditionalRemark", Types.VARCHAR },
			{ "ListDangerousGoods", Types.INTEGER },
			{ "SignPlace", Types.VARCHAR },
			{ "SignDate", Types.TIMESTAMP },
			{ "MasterSigned", Types.INTEGER },
			{ "MasterSignedImage", Types.INTEGER },
			{ "AttachedFile", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_DANGEROUS_GOODS_MANIFEST (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,UserCreated VARCHAR(75) null,NameOfShip VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,MasterName VARCHAR(75) null,IMONumber VARCHAR(75) null,Callsign VARCHAR(75) null,VoyageNumber VARCHAR(75) null,PortOfLoadingCode VARCHAR(75) null,PortOfDischargeCode VARCHAR(75) null,ShippingAgent VARCHAR(75) null,AdditionalRemark VARCHAR(75) null,ListDangerousGoods INTEGER,SignPlace VARCHAR(75) null,SignDate DATE null,MasterSigned INTEGER,MasterSignedImage INTEGER,AttachedFile LONG,DocumentYear INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_DANGEROUS_GOODS_MANIFEST";
	public static final String ORDER_BY_JPQL = " ORDER BY tempDangerousGoodsNanifest.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_DANGEROUS_GOODS_MANIFEST.ID DESC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"),
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
	public static TempDangerousGoodsNanifest toModel(
		TempDangerousGoodsNanifestSoap soapModel) {
		TempDangerousGoodsNanifest model = new TempDangerousGoodsNanifestImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setUserCreated(soapModel.getUserCreated());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setMasterName(soapModel.getMasterName());
		model.setImoNumber(soapModel.getImoNumber());
		model.setCallsign(soapModel.getCallsign());
		model.setVoyageNumber(soapModel.getVoyageNumber());
		model.setPortOfLoadingCode(soapModel.getPortOfLoadingCode());
		model.setPortOfDischargeCode(soapModel.getPortOfDischargeCode());
		model.setShippingAgent(soapModel.getShippingAgent());
		model.setAdditionalRemark(soapModel.getAdditionalRemark());
		model.setListDangerousGoods(soapModel.getListDangerousGoods());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());
		model.setMasterSigned(soapModel.getMasterSigned());
		model.setMasterSignedImage(soapModel.getMasterSignedImage());
		model.setAttachedFile(soapModel.getAttachedFile());
		model.setDocumentYear(soapModel.getDocumentYear());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempDangerousGoodsNanifest> toModels(
		TempDangerousGoodsNanifestSoap[] soapModels) {
		List<TempDangerousGoodsNanifest> models = new ArrayList<TempDangerousGoodsNanifest>(soapModels.length);

		for (TempDangerousGoodsNanifestSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"));

	public TempDangerousGoodsNanifestModelImpl() {
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
		return TempDangerousGoodsNanifest.class;
	}

	public String getModelClassName() {
		return TempDangerousGoodsNanifest.class.getName();
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
	public String getMasterName() {
		if (_masterName == null) {
			return StringPool.BLANK;
		}
		else {
			return _masterName;
		}
	}

	public void setMasterName(String masterName) {
		_masterName = masterName;
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
	public String getCallsign() {
		if (_callsign == null) {
			return StringPool.BLANK;
		}
		else {
			return _callsign;
		}
	}

	public void setCallsign(String callsign) {
		_callsign = callsign;
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
	public String getPortOfLoadingCode() {
		if (_portOfLoadingCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portOfLoadingCode;
		}
	}

	public void setPortOfLoadingCode(String portOfLoadingCode) {
		_portOfLoadingCode = portOfLoadingCode;
	}

	@JSON
	public String getPortOfDischargeCode() {
		if (_portOfDischargeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portOfDischargeCode;
		}
	}

	public void setPortOfDischargeCode(String portOfDischargeCode) {
		_portOfDischargeCode = portOfDischargeCode;
	}

	@JSON
	public String getShippingAgent() {
		if (_shippingAgent == null) {
			return StringPool.BLANK;
		}
		else {
			return _shippingAgent;
		}
	}

	public void setShippingAgent(String shippingAgent) {
		_shippingAgent = shippingAgent;
	}

	@JSON
	public String getAdditionalRemark() {
		if (_additionalRemark == null) {
			return StringPool.BLANK;
		}
		else {
			return _additionalRemark;
		}
	}

	public void setAdditionalRemark(String additionalRemark) {
		_additionalRemark = additionalRemark;
	}

	@JSON
	public int getListDangerousGoods() {
		return _listDangerousGoods;
	}

	public void setListDangerousGoods(int listDangerousGoods) {
		_listDangerousGoods = listDangerousGoods;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public TempDangerousGoodsNanifest toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TempDangerousGoodsNanifest)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					TempDangerousGoodsNanifest.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		TempDangerousGoodsNanifestImpl tempDangerousGoodsNanifestImpl = new TempDangerousGoodsNanifestImpl();

		tempDangerousGoodsNanifestImpl.setId(getId());
		tempDangerousGoodsNanifestImpl.setRequestCode(getRequestCode());
		tempDangerousGoodsNanifestImpl.setRequestState(getRequestState());
		tempDangerousGoodsNanifestImpl.setDocumentName(getDocumentName());
		tempDangerousGoodsNanifestImpl.setUserCreated(getUserCreated());
		tempDangerousGoodsNanifestImpl.setNameOfShip(getNameOfShip());
		tempDangerousGoodsNanifestImpl.setFlagStateOfShip(getFlagStateOfShip());
		tempDangerousGoodsNanifestImpl.setMasterName(getMasterName());
		tempDangerousGoodsNanifestImpl.setImoNumber(getImoNumber());
		tempDangerousGoodsNanifestImpl.setCallsign(getCallsign());
		tempDangerousGoodsNanifestImpl.setVoyageNumber(getVoyageNumber());
		tempDangerousGoodsNanifestImpl.setPortOfLoadingCode(getPortOfLoadingCode());
		tempDangerousGoodsNanifestImpl.setPortOfDischargeCode(getPortOfDischargeCode());
		tempDangerousGoodsNanifestImpl.setShippingAgent(getShippingAgent());
		tempDangerousGoodsNanifestImpl.setAdditionalRemark(getAdditionalRemark());
		tempDangerousGoodsNanifestImpl.setListDangerousGoods(getListDangerousGoods());
		tempDangerousGoodsNanifestImpl.setSignPlace(getSignPlace());
		tempDangerousGoodsNanifestImpl.setSignDate(getSignDate());
		tempDangerousGoodsNanifestImpl.setMasterSigned(getMasterSigned());
		tempDangerousGoodsNanifestImpl.setMasterSignedImage(getMasterSignedImage());
		tempDangerousGoodsNanifestImpl.setAttachedFile(getAttachedFile());
		tempDangerousGoodsNanifestImpl.setDocumentYear(getDocumentYear());

		tempDangerousGoodsNanifestImpl.resetOriginalValues();

		return tempDangerousGoodsNanifestImpl;
	}

	public int compareTo(TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		int value = 0;

		if (getId() < tempDangerousGoodsNanifest.getId()) {
			value = -1;
		}
		else if (getId() > tempDangerousGoodsNanifest.getId()) {
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

		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = null;

		try {
			tempDangerousGoodsNanifest = (TempDangerousGoodsNanifest)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempDangerousGoodsNanifest.getPrimaryKey();

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
		TempDangerousGoodsNanifestModelImpl tempDangerousGoodsNanifestModelImpl = this;

		tempDangerousGoodsNanifestModelImpl._originalRequestCode = tempDangerousGoodsNanifestModelImpl._requestCode;

		tempDangerousGoodsNanifestModelImpl._originalRequestState = tempDangerousGoodsNanifestModelImpl._requestState;

		tempDangerousGoodsNanifestModelImpl._setOriginalRequestState = false;

		tempDangerousGoodsNanifestModelImpl._originalDocumentName = tempDangerousGoodsNanifestModelImpl._documentName;

		tempDangerousGoodsNanifestModelImpl._setOriginalDocumentName = false;

		tempDangerousGoodsNanifestModelImpl._originalDocumentYear = tempDangerousGoodsNanifestModelImpl._documentYear;

		tempDangerousGoodsNanifestModelImpl._setOriginalDocumentYear = false;

		tempDangerousGoodsNanifestModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempDangerousGoodsNanifest> toCacheModel() {
		TempDangerousGoodsNanifestCacheModel tempDangerousGoodsNanifestCacheModel =
			new TempDangerousGoodsNanifestCacheModel();

		tempDangerousGoodsNanifestCacheModel.id = getId();

		tempDangerousGoodsNanifestCacheModel.requestCode = getRequestCode();

		String requestCode = tempDangerousGoodsNanifestCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.requestCode = null;
		}

		tempDangerousGoodsNanifestCacheModel.requestState = getRequestState();

		tempDangerousGoodsNanifestCacheModel.documentName = getDocumentName();

		tempDangerousGoodsNanifestCacheModel.userCreated = getUserCreated();

		String userCreated = tempDangerousGoodsNanifestCacheModel.userCreated;

		if ((userCreated != null) && (userCreated.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.userCreated = null;
		}

		tempDangerousGoodsNanifestCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = tempDangerousGoodsNanifestCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.nameOfShip = null;
		}

		tempDangerousGoodsNanifestCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = tempDangerousGoodsNanifestCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.flagStateOfShip = null;
		}

		tempDangerousGoodsNanifestCacheModel.masterName = getMasterName();

		String masterName = tempDangerousGoodsNanifestCacheModel.masterName;

		if ((masterName != null) && (masterName.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.masterName = null;
		}

		tempDangerousGoodsNanifestCacheModel.imoNumber = getImoNumber();

		String imoNumber = tempDangerousGoodsNanifestCacheModel.imoNumber;

		if ((imoNumber != null) && (imoNumber.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.imoNumber = null;
		}

		tempDangerousGoodsNanifestCacheModel.callsign = getCallsign();

		String callsign = tempDangerousGoodsNanifestCacheModel.callsign;

		if ((callsign != null) && (callsign.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.callsign = null;
		}

		tempDangerousGoodsNanifestCacheModel.voyageNumber = getVoyageNumber();

		String voyageNumber = tempDangerousGoodsNanifestCacheModel.voyageNumber;

		if ((voyageNumber != null) && (voyageNumber.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.voyageNumber = null;
		}

		tempDangerousGoodsNanifestCacheModel.portOfLoadingCode = getPortOfLoadingCode();

		String portOfLoadingCode = tempDangerousGoodsNanifestCacheModel.portOfLoadingCode;

		if ((portOfLoadingCode != null) && (portOfLoadingCode.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.portOfLoadingCode = null;
		}

		tempDangerousGoodsNanifestCacheModel.portOfDischargeCode = getPortOfDischargeCode();

		String portOfDischargeCode = tempDangerousGoodsNanifestCacheModel.portOfDischargeCode;

		if ((portOfDischargeCode != null) &&
				(portOfDischargeCode.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.portOfDischargeCode = null;
		}

		tempDangerousGoodsNanifestCacheModel.shippingAgent = getShippingAgent();

		String shippingAgent = tempDangerousGoodsNanifestCacheModel.shippingAgent;

		if ((shippingAgent != null) && (shippingAgent.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.shippingAgent = null;
		}

		tempDangerousGoodsNanifestCacheModel.additionalRemark = getAdditionalRemark();

		String additionalRemark = tempDangerousGoodsNanifestCacheModel.additionalRemark;

		if ((additionalRemark != null) && (additionalRemark.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.additionalRemark = null;
		}

		tempDangerousGoodsNanifestCacheModel.listDangerousGoods = getListDangerousGoods();

		tempDangerousGoodsNanifestCacheModel.signPlace = getSignPlace();

		String signPlace = tempDangerousGoodsNanifestCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			tempDangerousGoodsNanifestCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			tempDangerousGoodsNanifestCacheModel.signDate = signDate.getTime();
		}
		else {
			tempDangerousGoodsNanifestCacheModel.signDate = Long.MIN_VALUE;
		}

		tempDangerousGoodsNanifestCacheModel.masterSigned = getMasterSigned();

		tempDangerousGoodsNanifestCacheModel.masterSignedImage = getMasterSignedImage();

		tempDangerousGoodsNanifestCacheModel.attachedFile = getAttachedFile();

		tempDangerousGoodsNanifestCacheModel.documentYear = getDocumentYear();

		return tempDangerousGoodsNanifestCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

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
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", masterName=");
		sb.append(getMasterName());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callsign=");
		sb.append(getCallsign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", portOfLoadingCode=");
		sb.append(getPortOfLoadingCode());
		sb.append(", portOfDischargeCode=");
		sb.append(getPortOfDischargeCode());
		sb.append(", shippingAgent=");
		sb.append(getShippingAgent());
		sb.append(", additionalRemark=");
		sb.append(getAdditionalRemark());
		sb.append(", listDangerousGoods=");
		sb.append(getListDangerousGoods());
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
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest");
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
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterName</column-name><column-value><![CDATA[");
		sb.append(getMasterName());
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
			"<column><column-name>portOfLoadingCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfLoadingCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfDischargeCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfDischargeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingAgent</column-name><column-value><![CDATA[");
		sb.append(getShippingAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalRemark</column-name><column-value><![CDATA[");
		sb.append(getAdditionalRemark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listDangerousGoods</column-name><column-value><![CDATA[");
		sb.append(getListDangerousGoods());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TempDangerousGoodsNanifest.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TempDangerousGoodsNanifest.class
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
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _masterName;
	private String _imoNumber;
	private String _callsign;
	private String _voyageNumber;
	private String _portOfLoadingCode;
	private String _portOfDischargeCode;
	private String _shippingAgent;
	private String _additionalRemark;
	private int _listDangerousGoods;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private TempDangerousGoodsNanifest _escapedModelProxy;
}