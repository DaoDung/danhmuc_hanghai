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

package vn.gt.dao.danhmuc.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.model.DmMaritimeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmMaritime service. Represents a row in the &quot;DM_MARITIME&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmMaritimeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmMaritimeImpl}.
 * </p>
 *
 * @author win_64
 * @see DmMaritimeImpl
 * @see vn.gt.dao.danhmuc.model.DmMaritime
 * @see vn.gt.dao.danhmuc.model.DmMaritimeModel
 * @generated
 */
public class DmMaritimeModelImpl extends BaseModelImpl<DmMaritime>
	implements DmMaritimeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm maritime model instance should use the {@link vn.gt.dao.danhmuc.model.DmMaritime} interface instead.
	 */
	public static final String TABLE_NAME = "DM_MARITIME";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "MaritimeCode", Types.VARCHAR },
			{ "MaritimeReference", Types.VARCHAR },
			{ "MaritimeOrder", Types.INTEGER },
			{ "MaritimeName", Types.VARCHAR },
			{ "MaritimeNameVN", Types.VARCHAR },
			{ "Address", Types.VARCHAR },
			{ "AddressVN", Types.VARCHAR },
			{ "StateCode", Types.VARCHAR },
			{ "CityCode", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_MARITIME (id INTEGER not null primary key,MaritimeCode VARCHAR(75) null,MaritimeReference VARCHAR(75) null,MaritimeOrder INTEGER,MaritimeName VARCHAR(75) null,MaritimeNameVN VARCHAR(75) null,Address VARCHAR(75) null,AddressVN VARCHAR(75) null,StateCode VARCHAR(75) null,CityCode VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_MARITIME";
	public static final String ORDER_BY_JPQL = " ORDER BY dmMaritime.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_MARITIME.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmMaritime"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmMaritime"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmMaritime"),
			true);
	public static long ISDELETE_COLUMN_BITMASK = 1L;
	public static long MARITIMECODE_COLUMN_BITMASK = 2L;
	public static long MARITIMEREFERENCE_COLUMN_BITMASK = 4L;
	public static long MARKEDASDELETE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmMaritime"));

	public DmMaritimeModelImpl() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return DmMaritime.class;
	}

	public String getModelClassName() {
		return DmMaritime.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getMaritimeCode() {
		if (_maritimeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _maritimeCode;
		}
	}

	public void setMaritimeCode(String maritimeCode) {
		_columnBitmask |= MARITIMECODE_COLUMN_BITMASK;

		if (_originalMaritimeCode == null) {
			_originalMaritimeCode = _maritimeCode;
		}

		_maritimeCode = maritimeCode;
	}

	public String getOriginalMaritimeCode() {
		return GetterUtil.getString(_originalMaritimeCode);
	}

	public String getMaritimeReference() {
		if (_maritimeReference == null) {
			return StringPool.BLANK;
		}
		else {
			return _maritimeReference;
		}
	}

	public void setMaritimeReference(String maritimeReference) {
		_columnBitmask |= MARITIMEREFERENCE_COLUMN_BITMASK;

		if (_originalMaritimeReference == null) {
			_originalMaritimeReference = _maritimeReference;
		}

		_maritimeReference = maritimeReference;
	}

	public String getOriginalMaritimeReference() {
		return GetterUtil.getString(_originalMaritimeReference);
	}

	public int getMaritimeOrder() {
		return _maritimeOrder;
	}

	public void setMaritimeOrder(int maritimeOrder) {
		_maritimeOrder = maritimeOrder;
	}

	public String getMaritimeName() {
		if (_maritimeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _maritimeName;
		}
	}

	public void setMaritimeName(String maritimeName) {
		_maritimeName = maritimeName;
	}

	public String getMaritimeNameVN() {
		if (_maritimeNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _maritimeNameVN;
		}
	}

	public void setMaritimeNameVN(String maritimeNameVN) {
		_maritimeNameVN = maritimeNameVN;
	}

	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddressVN() {
		if (_addressVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressVN;
		}
	}

	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;
	}

	public String getStateCode() {
		if (_stateCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateCode;
		}
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getCitycode() {
		if (_citycode == null) {
			return StringPool.BLANK;
		}
		else {
			return _citycode;
		}
	}

	public void setCitycode(String citycode) {
		_citycode = citycode;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_columnBitmask |= ISDELETE_COLUMN_BITMASK;

		if (!_setOriginalIsDelete) {
			_setOriginalIsDelete = true;

			_originalIsDelete = _isDelete;
		}

		_isDelete = isDelete;
	}

	public int getOriginalIsDelete() {
		return _originalIsDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_columnBitmask |= MARKEDASDELETE_COLUMN_BITMASK;

		if (!_setOriginalMarkedAsDelete) {
			_setOriginalMarkedAsDelete = true;

			_originalMarkedAsDelete = _markedAsDelete;
		}

		_markedAsDelete = markedAsDelete;
	}

	public int getOriginalMarkedAsDelete() {
		return _originalMarkedAsDelete;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getSyncVersion() {
		if (_syncVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _syncVersion;
		}
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmMaritime toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmMaritime)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmMaritimeImpl dmMaritimeImpl = new DmMaritimeImpl();

		dmMaritimeImpl.setId(getId());
		dmMaritimeImpl.setMaritimeCode(getMaritimeCode());
		dmMaritimeImpl.setMaritimeReference(getMaritimeReference());
		dmMaritimeImpl.setMaritimeOrder(getMaritimeOrder());
		dmMaritimeImpl.setMaritimeName(getMaritimeName());
		dmMaritimeImpl.setMaritimeNameVN(getMaritimeNameVN());
		dmMaritimeImpl.setAddress(getAddress());
		dmMaritimeImpl.setAddressVN(getAddressVN());
		dmMaritimeImpl.setStateCode(getStateCode());
		dmMaritimeImpl.setCitycode(getCitycode());
		dmMaritimeImpl.setIsDelete(getIsDelete());
		dmMaritimeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmMaritimeImpl.setModifiedDate(getModifiedDate());
		dmMaritimeImpl.setRequestedDate(getRequestedDate());
		dmMaritimeImpl.setSyncVersion(getSyncVersion());

		dmMaritimeImpl.resetOriginalValues();

		return dmMaritimeImpl;
	}

	public int compareTo(DmMaritime dmMaritime) {
		int value = 0;

		if (getId() < dmMaritime.getId()) {
			value = -1;
		}
		else if (getId() > dmMaritime.getId()) {
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

		DmMaritime dmMaritime = null;

		try {
			dmMaritime = (DmMaritime)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmMaritime.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DmMaritimeModelImpl dmMaritimeModelImpl = this;

		dmMaritimeModelImpl._originalMaritimeCode = dmMaritimeModelImpl._maritimeCode;

		dmMaritimeModelImpl._originalMaritimeReference = dmMaritimeModelImpl._maritimeReference;

		dmMaritimeModelImpl._originalIsDelete = dmMaritimeModelImpl._isDelete;

		dmMaritimeModelImpl._setOriginalIsDelete = false;

		dmMaritimeModelImpl._originalMarkedAsDelete = dmMaritimeModelImpl._markedAsDelete;

		dmMaritimeModelImpl._setOriginalMarkedAsDelete = false;

		dmMaritimeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmMaritime> toCacheModel() {
		DmMaritimeCacheModel dmMaritimeCacheModel = new DmMaritimeCacheModel();

		dmMaritimeCacheModel.id = getId();

		dmMaritimeCacheModel.maritimeCode = getMaritimeCode();

		String maritimeCode = dmMaritimeCacheModel.maritimeCode;

		if ((maritimeCode != null) && (maritimeCode.length() == 0)) {
			dmMaritimeCacheModel.maritimeCode = null;
		}

		dmMaritimeCacheModel.maritimeReference = getMaritimeReference();

		String maritimeReference = dmMaritimeCacheModel.maritimeReference;

		if ((maritimeReference != null) && (maritimeReference.length() == 0)) {
			dmMaritimeCacheModel.maritimeReference = null;
		}

		dmMaritimeCacheModel.maritimeOrder = getMaritimeOrder();

		dmMaritimeCacheModel.maritimeName = getMaritimeName();

		String maritimeName = dmMaritimeCacheModel.maritimeName;

		if ((maritimeName != null) && (maritimeName.length() == 0)) {
			dmMaritimeCacheModel.maritimeName = null;
		}

		dmMaritimeCacheModel.maritimeNameVN = getMaritimeNameVN();

		String maritimeNameVN = dmMaritimeCacheModel.maritimeNameVN;

		if ((maritimeNameVN != null) && (maritimeNameVN.length() == 0)) {
			dmMaritimeCacheModel.maritimeNameVN = null;
		}

		dmMaritimeCacheModel.address = getAddress();

		String address = dmMaritimeCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			dmMaritimeCacheModel.address = null;
		}

		dmMaritimeCacheModel.addressVN = getAddressVN();

		String addressVN = dmMaritimeCacheModel.addressVN;

		if ((addressVN != null) && (addressVN.length() == 0)) {
			dmMaritimeCacheModel.addressVN = null;
		}

		dmMaritimeCacheModel.stateCode = getStateCode();

		String stateCode = dmMaritimeCacheModel.stateCode;

		if ((stateCode != null) && (stateCode.length() == 0)) {
			dmMaritimeCacheModel.stateCode = null;
		}

		dmMaritimeCacheModel.citycode = getCitycode();

		String citycode = dmMaritimeCacheModel.citycode;

		if ((citycode != null) && (citycode.length() == 0)) {
			dmMaritimeCacheModel.citycode = null;
		}

		dmMaritimeCacheModel.isDelete = getIsDelete();

		dmMaritimeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmMaritimeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmMaritimeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmMaritimeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmMaritimeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmMaritimeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmMaritimeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmMaritimeCacheModel.syncVersion = null;
		}

		return dmMaritimeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", maritimeReference=");
		sb.append(getMaritimeReference());
		sb.append(", maritimeOrder=");
		sb.append(getMaritimeOrder());
		sb.append(", maritimeName=");
		sb.append(getMaritimeName());
		sb.append(", maritimeNameVN=");
		sb.append(getMaritimeNameVN());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmMaritime");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeReference</column-name><column-value><![CDATA[");
		sb.append(getMaritimeReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeOrder</column-name><column-value><![CDATA[");
		sb.append(getMaritimeOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeName</column-name><column-value><![CDATA[");
		sb.append(getMaritimeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeNameVN</column-name><column-value><![CDATA[");
		sb.append(getMaritimeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmMaritime.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmMaritime.class
		};
	private int _id;
	private String _maritimeCode;
	private String _originalMaritimeCode;
	private String _maritimeReference;
	private String _originalMaritimeReference;
	private int _maritimeOrder;
	private String _maritimeName;
	private String _maritimeNameVN;
	private String _address;
	private String _addressVN;
	private String _stateCode;
	private String _citycode;
	private int _isDelete;
	private int _originalIsDelete;
	private boolean _setOriginalIsDelete;
	private int _markedAsDelete;
	private int _originalMarkedAsDelete;
	private boolean _setOriginalMarkedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmMaritime _escapedModelProxy;
}