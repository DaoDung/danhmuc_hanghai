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

import vn.gt.dao.danhmuc.model.DmHistoryPortRegion;
import vn.gt.dao.danhmuc.model.DmHistoryPortRegionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmHistoryPortRegion service. Represents a row in the &quot;DM_HISTORY_PORT_REGION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmHistoryPortRegionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryPortRegionImpl}.
 * </p>
 *
 * @author win_64
 * @see DmHistoryPortRegionImpl
 * @see vn.gt.dao.danhmuc.model.DmHistoryPortRegion
 * @see vn.gt.dao.danhmuc.model.DmHistoryPortRegionModel
 * @generated
 */
public class DmHistoryPortRegionModelImpl extends BaseModelImpl<DmHistoryPortRegion>
	implements DmHistoryPortRegionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history port region model instance should use the {@link vn.gt.dao.danhmuc.model.DmHistoryPortRegion} interface instead.
	 */
	public static final String TABLE_NAME = "DM_HISTORY_PORT_REGION";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "PortRegionCode", Types.VARCHAR },
			{ "PortRegionName", Types.VARCHAR },
			{ "PortRegionNameVN", Types.VARCHAR },
			{ "PortRegionRef", Types.VARCHAR },
			{ "PortCode", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_HISTORY_PORT_REGION (id INTEGER not null primary key,PortRegionCode VARCHAR(75) null,PortRegionName VARCHAR(75) null,PortRegionNameVN VARCHAR(75) null,PortRegionRef VARCHAR(75) null,PortCode VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_HISTORY_PORT_REGION";
	public static final String ORDER_BY_JPQL = " ORDER BY dmHistoryPortRegion.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_HISTORY_PORT_REGION.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmHistoryPortRegion"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmHistoryPortRegion"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmHistoryPortRegion"),
			true);
	public static long PORTREGIONCODE_COLUMN_BITMASK = 1L;
	public static long SYNCVERSION_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmHistoryPortRegion"));

	public DmHistoryPortRegionModelImpl() {
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
		return DmHistoryPortRegion.class;
	}

	public String getModelClassName() {
		return DmHistoryPortRegion.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getPortRegionCode() {
		if (_portRegionCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionCode;
		}
	}

	public void setPortRegionCode(String portRegionCode) {
		_columnBitmask |= PORTREGIONCODE_COLUMN_BITMASK;

		if (_originalPortRegionCode == null) {
			_originalPortRegionCode = _portRegionCode;
		}

		_portRegionCode = portRegionCode;
	}

	public String getOriginalPortRegionCode() {
		return GetterUtil.getString(_originalPortRegionCode);
	}

	public String getPortRegionName() {
		if (_portRegionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionName;
		}
	}

	public void setPortRegionName(String portRegionName) {
		_portRegionName = portRegionName;
	}

	public String getPortRegionNameVN() {
		if (_portRegionNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionNameVN;
		}
	}

	public void setPortRegionNameVN(String portRegionNameVN) {
		_portRegionNameVN = portRegionNameVN;
	}

	public String getPortRegionRef() {
		if (_portRegionRef == null) {
			return StringPool.BLANK;
		}
		else {
			return _portRegionRef;
		}
	}

	public void setPortRegionRef(String portRegionRef) {
		_portRegionRef = portRegionRef;
	}

	public String getPortCode() {
		if (_portCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portCode;
		}
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
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
	public DmHistoryPortRegion toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmHistoryPortRegion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmHistoryPortRegionImpl dmHistoryPortRegionImpl = new DmHistoryPortRegionImpl();

		dmHistoryPortRegionImpl.setId(getId());
		dmHistoryPortRegionImpl.setPortRegionCode(getPortRegionCode());
		dmHistoryPortRegionImpl.setPortRegionName(getPortRegionName());
		dmHistoryPortRegionImpl.setPortRegionNameVN(getPortRegionNameVN());
		dmHistoryPortRegionImpl.setPortRegionRef(getPortRegionRef());
		dmHistoryPortRegionImpl.setPortCode(getPortCode());
		dmHistoryPortRegionImpl.setIsDelete(getIsDelete());
		dmHistoryPortRegionImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmHistoryPortRegionImpl.setModifiedDate(getModifiedDate());
		dmHistoryPortRegionImpl.setRequestedDate(getRequestedDate());
		dmHistoryPortRegionImpl.setSyncVersion(getSyncVersion());

		dmHistoryPortRegionImpl.resetOriginalValues();

		return dmHistoryPortRegionImpl;
	}

	public int compareTo(DmHistoryPortRegion dmHistoryPortRegion) {
		int value = 0;

		if (getId() < dmHistoryPortRegion.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryPortRegion.getId()) {
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

		DmHistoryPortRegion dmHistoryPortRegion = null;

		try {
			dmHistoryPortRegion = (DmHistoryPortRegion)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmHistoryPortRegion.getPrimaryKey();

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
		DmHistoryPortRegionModelImpl dmHistoryPortRegionModelImpl = this;

		dmHistoryPortRegionModelImpl._originalPortRegionCode = dmHistoryPortRegionModelImpl._portRegionCode;

		dmHistoryPortRegionModelImpl._originalSyncVersion = dmHistoryPortRegionModelImpl._syncVersion;

		dmHistoryPortRegionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmHistoryPortRegion> toCacheModel() {
		DmHistoryPortRegionCacheModel dmHistoryPortRegionCacheModel = new DmHistoryPortRegionCacheModel();

		dmHistoryPortRegionCacheModel.id = getId();

		dmHistoryPortRegionCacheModel.portRegionCode = getPortRegionCode();

		String portRegionCode = dmHistoryPortRegionCacheModel.portRegionCode;

		if ((portRegionCode != null) && (portRegionCode.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionCode = null;
		}

		dmHistoryPortRegionCacheModel.portRegionName = getPortRegionName();

		String portRegionName = dmHistoryPortRegionCacheModel.portRegionName;

		if ((portRegionName != null) && (portRegionName.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionName = null;
		}

		dmHistoryPortRegionCacheModel.portRegionNameVN = getPortRegionNameVN();

		String portRegionNameVN = dmHistoryPortRegionCacheModel.portRegionNameVN;

		if ((portRegionNameVN != null) && (portRegionNameVN.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionNameVN = null;
		}

		dmHistoryPortRegionCacheModel.portRegionRef = getPortRegionRef();

		String portRegionRef = dmHistoryPortRegionCacheModel.portRegionRef;

		if ((portRegionRef != null) && (portRegionRef.length() == 0)) {
			dmHistoryPortRegionCacheModel.portRegionRef = null;
		}

		dmHistoryPortRegionCacheModel.portCode = getPortCode();

		String portCode = dmHistoryPortRegionCacheModel.portCode;

		if ((portCode != null) && (portCode.length() == 0)) {
			dmHistoryPortRegionCacheModel.portCode = null;
		}

		dmHistoryPortRegionCacheModel.isDelete = getIsDelete();

		dmHistoryPortRegionCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmHistoryPortRegionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmHistoryPortRegionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmHistoryPortRegionCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmHistoryPortRegionCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmHistoryPortRegionCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmHistoryPortRegionCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmHistoryPortRegionCacheModel.syncVersion = null;
		}

		return dmHistoryPortRegionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portRegionName=");
		sb.append(getPortRegionName());
		sb.append(", portRegionNameVN=");
		sb.append(getPortRegionNameVN());
		sb.append(", portRegionRef=");
		sb.append(getPortRegionRef());
		sb.append(", portCode=");
		sb.append(getPortCode());
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
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmHistoryPortRegion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionName</column-name><column-value><![CDATA[");
		sb.append(getPortRegionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortRegionNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionRef</column-name><column-value><![CDATA[");
		sb.append(getPortRegionRef());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
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

	private static ClassLoader _classLoader = DmHistoryPortRegion.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmHistoryPortRegion.class
		};
	private int _id;
	private String _portRegionCode;
	private String _originalPortRegionCode;
	private String _portRegionName;
	private String _portRegionNameVN;
	private String _portRegionRef;
	private String _portCode;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmHistoryPortRegion _escapedModelProxy;
}