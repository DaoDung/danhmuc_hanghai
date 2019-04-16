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

import vn.gt.dao.danhmuc.model.DmHistoryGoodsType;
import vn.gt.dao.danhmuc.model.DmHistoryGoodsTypeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmHistoryGoodsType service. Represents a row in the &quot;DM_HISTORY_GOODS_TYPE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmHistoryGoodsTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryGoodsTypeImpl}.
 * </p>
 *
 * @author win_64
 * @see DmHistoryGoodsTypeImpl
 * @see vn.gt.dao.danhmuc.model.DmHistoryGoodsType
 * @see vn.gt.dao.danhmuc.model.DmHistoryGoodsTypeModel
 * @generated
 */
public class DmHistoryGoodsTypeModelImpl extends BaseModelImpl<DmHistoryGoodsType>
	implements DmHistoryGoodsTypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history goods type model instance should use the {@link vn.gt.dao.danhmuc.model.DmHistoryGoodsType} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_GOODS_TYPE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "GoodsTypeCode", Types.VARCHAR },
			{ "GoodsTypeName", Types.VARCHAR },
			{ "GoodsTypeNameVN", Types.VARCHAR },
			{ "GoodsTypeOrder", Types.INTEGER },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_GOODS_TYPE (id INTEGER not null primary key,GoodsTypeCode VARCHAR(75) null,GoodsTypeName VARCHAR(75) null,GoodsTypeNameVN VARCHAR(75) null,GoodsTypeOrder INTEGER,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_GOODS_TYPE";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryGoodsType.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_GOODS_TYPE.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmHistoryGoodsType"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmHistoryGoodsType"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmHistoryGoodsType"),
			true);
	public static long GOODSTYPECODE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmHistoryGoodsType"));

	public DmHistoryGoodsTypeModelImpl() {
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
		return DmHistoryGoodsType.class;
	}

	public String getModelClassName() {
		return DmHistoryGoodsType.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getGoodsTypeCode() {
		if (_goodsTypeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodsTypeCode;
		}
	}

	public void setGoodsTypeCode(String goodsTypeCode) {
		_columnBitmask |= GOODSTYPECODE_COLUMN_BITMASK;

		if (_originalGoodsTypeCode == null) {
			_originalGoodsTypeCode = _goodsTypeCode;
		}

		_goodsTypeCode = goodsTypeCode;
	}

	public String getOriginalGoodsTypeCode() {
		return GetterUtil.getString(_originalGoodsTypeCode);
	}

	public String getGoodsTypeName() {
		if (_goodsTypeName == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodsTypeName;
		}
	}

	public void setGoodsTypeName(String goodsTypeName) {
		_goodsTypeName = goodsTypeName;
	}

	public String getGoodsTypeNameVN() {
		if (_goodsTypeNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _goodsTypeNameVN;
		}
	}

	public void setGoodsTypeNameVN(String goodsTypeNameVN) {
		_goodsTypeNameVN = goodsTypeNameVN;
	}

	public int getGoodsTypeOrder() {
		return _goodsTypeOrder;
	}

	public void setGoodsTypeOrder(int goodsTypeOrder) {
		_goodsTypeOrder = goodsTypeOrder;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
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
		_columnBitmask |= SYNCVERSION_COLUMN_BITMASK;

		if (_originalSyncVersion == null) {
			_originalSyncVersion = _syncVersion;
		}

		_syncVersion = syncVersion;
	}

	public String getOriginalSyncVersion() {
		return GetterUtil.getString(_originalSyncVersion);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmHistoryGoodsType toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmHistoryGoodsType)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmHistoryGoodsTypeImpl dmHistoryGoodsTypeImpl = new DmHistoryGoodsTypeImpl();

		dmHistoryGoodsTypeImpl.setId(getId());
		dmHistoryGoodsTypeImpl.setGoodsTypeCode(getGoodsTypeCode());
		dmHistoryGoodsTypeImpl.setGoodsTypeName(getGoodsTypeName());
		dmHistoryGoodsTypeImpl.setGoodsTypeNameVN(getGoodsTypeNameVN());
		dmHistoryGoodsTypeImpl.setGoodsTypeOrder(getGoodsTypeOrder());
		dmHistoryGoodsTypeImpl.setIsDelete(getIsDelete());
		dmHistoryGoodsTypeImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryGoodsTypeImpl.setModifiedDate(getModifiedDate());
		dmHistoryGoodsTypeImpl.setRequestedDate(getRequestedDate());
		dmHistoryGoodsTypeImpl.setSyncVersion(getSyncVersion());

		dmHistoryGoodsTypeImpl.resetOriginalValues();

		return dmHistoryGoodsTypeImpl;
	}

	public int compareTo(DmHistoryGoodsType dmHistoryGoodsType) {
		int value = 0;

		if (getId() < dmHistoryGoodsType.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryGoodsType.getId()) {
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

		DmHistoryGoodsType dmHistoryGoodsType = null;

		try {
			dmHistoryGoodsType = (DmHistoryGoodsType)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryGoodsType.getPrimaryKey();

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
		DmHistoryGoodsTypeModelImpl dmHistoryGoodsTypeModelImpl = this;

		dmHistoryGoodsTypeModelImpl._originalGoodsTypeCode = dmHistoryGoodsTypeModelImpl._goodsTypeCode;

		dmHistoryGoodsTypeModelImpl._originalSyncVersion = dmHistoryGoodsTypeModelImpl._syncVersion;

		dmHistoryGoodsTypeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryGoodsType> toCacheModel() {
		DmHistoryGoodsTypeCacheModel dmHistoryGoodsTypeCacheModel = new DmHistoryGoodsTypeCacheModel();

		dmHistoryGoodsTypeCacheModel.id = getId();

		dmHistoryGoodsTypeCacheModel.goodsTypeCode = getGoodsTypeCode();

		String goodsTypeCode = dmHistoryGoodsTypeCacheModel.goodsTypeCode;

		if ((goodsTypeCode != null) && (goodsTypeCode.length() == 0)) {
			dmHistoryGoodsTypeCacheModel.goodsTypeCode = null;
		}

		dmHistoryGoodsTypeCacheModel.goodsTypeName = getGoodsTypeName();

		String goodsTypeName = dmHistoryGoodsTypeCacheModel.goodsTypeName;

		if ((goodsTypeName != null) && (goodsTypeName.length() == 0)) {
			dmHistoryGoodsTypeCacheModel.goodsTypeName = null;
		}

		dmHistoryGoodsTypeCacheModel.goodsTypeNameVN = getGoodsTypeNameVN();

		String goodsTypeNameVN = dmHistoryGoodsTypeCacheModel.goodsTypeNameVN;

		if ((goodsTypeNameVN != null) && (goodsTypeNameVN.length() == 0)) {
			dmHistoryGoodsTypeCacheModel.goodsTypeNameVN = null;
		}

		dmHistoryGoodsTypeCacheModel.goodsTypeOrder = getGoodsTypeOrder();

		dmHistoryGoodsTypeCacheModel.isDelete = getIsDelete();

		dmHistoryGoodsTypeCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryGoodsTypeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryGoodsTypeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryGoodsTypeCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryGoodsTypeCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryGoodsTypeCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryGoodsTypeCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryGoodsTypeCacheModel.syncVersion = null;
		}

		return dmHistoryGoodsTypeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", goodsTypeCode=");
		sb.append(getGoodsTypeCode());
		sb.append(", goodsTypeName=");
		sb.append(getGoodsTypeName());
		sb.append(", goodsTypeNameVN=");
		sb.append(getGoodsTypeNameVN());
		sb.append(", goodsTypeOrder=");
		sb.append(getGoodsTypeOrder());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryGoodsType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeCode</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeName</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeNameVN</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsTypeOrder</column-name><column-value><![CDATA[");
		sb.append(getGoodsTypeOrder());
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

	private static ClassLoader _classLoader = DmHistoryGoodsType.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmHistoryGoodsType.class
		};
	private int _id;
	private String _goodsTypeCode;
	private String _originalGoodsTypeCode;
	private String _goodsTypeName;
	private String _goodsTypeNameVN;
	private int _goodsTypeOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryGoodsType _escapedModelProxy;
}