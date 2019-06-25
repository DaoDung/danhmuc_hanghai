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

import vn.gt.dao.danhmuc.model.DmPortWharf;
import vn.gt.dao.danhmuc.model.DmPortWharfModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmPortWharf service. Represents a row in the &quot;DM_PORT_WHARF&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmPortWharfModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmPortWharfImpl}.
 * </p>
 *
 * @author win_64
 * @see DmPortWharfImpl
 * @see vn.gt.dao.danhmuc.model.DmPortWharf
 * @see vn.gt.dao.danhmuc.model.DmPortWharfModel
 * @generated
 */
public class DmPortWharfModelImpl extends BaseModelImpl<DmPortWharf>
	implements DmPortWharfModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm port wharf model instance should use the {@link vn.gt.dao.danhmuc.model.DmPortWharf} interface instead.
	 */
	public static final String TABLE_NAME = "DM_PORT_WHARF";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "PortWharfCode", Types.VARCHAR },
			{ "PortWharfName", Types.VARCHAR },
			{ "PortWharfNameVN", Types.VARCHAR },
			{ "PortWharfType", Types.INTEGER },
			{ "PortCode", Types.VARCHAR },
			{ "PortHarbourCode", Types.VARCHAR },
			{ "PortRegionCode", Types.VARCHAR },
			{ "Note", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_PORT_WHARF (id INTEGER not null primary key,PortWharfCode VARCHAR(75) null,PortWharfName VARCHAR(75) null,PortWharfNameVN VARCHAR(75) null,PortWharfType INTEGER,PortCode VARCHAR(75) null,PortHarbourCode VARCHAR(75) null,PortRegionCode VARCHAR(75) null,Note VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_PORT_WHARF";
	public static final String ORDER_BY_JPQL = " ORDER BY dmPortWharf.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_PORT_WHARF.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmPortWharf"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmPortWharf"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmPortWharf"),
			true);
	public static long PORTREGIONCODE_COLUMN_BITMASK = 1L;
	public static long PORTWHARFCODE_COLUMN_BITMASK = 2L;
	public static long SYNCVERSION_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmPortWharf"));

	public DmPortWharfModelImpl() {
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
		return DmPortWharf.class;
	}

	public String getModelClassName() {
		return DmPortWharf.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_columnBitmask = -1L;

		_id = id;
	}

	public String getPortWharfCode() {
		if (_portWharfCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portWharfCode;
		}
	}

	public void setPortWharfCode(String portWharfCode) {
		_columnBitmask |= PORTWHARFCODE_COLUMN_BITMASK;

		if (_originalPortWharfCode == null) {
			_originalPortWharfCode = _portWharfCode;
		}

		_portWharfCode = portWharfCode;
	}

	public String getOriginalPortWharfCode() {
		return GetterUtil.getString(_originalPortWharfCode);
	}

	public String getPortWharfName() {
		if (_portWharfName == null) {
			return StringPool.BLANK;
		}
		else {
			return _portWharfName;
		}
	}

	public void setPortWharfName(String portWharfName) {
		_portWharfName = portWharfName;
	}

	public String getPortWharfNameVN() {
		if (_portWharfNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _portWharfNameVN;
		}
	}

	public void setPortWharfNameVN(String portWharfNameVN) {
		_portWharfNameVN = portWharfNameVN;
	}

	public int getPortWharfType() {
		return _portWharfType;
	}

	public void setPortWharfType(int portWharfType) {
		_portWharfType = portWharfType;
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

	public String getPortHarbourCode() {
		if (_portHarbourCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portHarbourCode;
		}
	}

	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;
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

	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		}
		else {
			return _note;
		}
	}

	public void setNote(String note) {
		_note = note;
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
	public DmPortWharf toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmPortWharf)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmPortWharfImpl dmPortWharfImpl = new DmPortWharfImpl();

		dmPortWharfImpl.setId(getId());
		dmPortWharfImpl.setPortWharfCode(getPortWharfCode());
		dmPortWharfImpl.setPortWharfName(getPortWharfName());
		dmPortWharfImpl.setPortWharfNameVN(getPortWharfNameVN());
		dmPortWharfImpl.setPortWharfType(getPortWharfType());
		dmPortWharfImpl.setPortCode(getPortCode());
		dmPortWharfImpl.setPortHarbourCode(getPortHarbourCode());
		dmPortWharfImpl.setPortRegionCode(getPortRegionCode());
		dmPortWharfImpl.setNote(getNote());
		dmPortWharfImpl.setIsDelete(getIsDelete());
		dmPortWharfImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmPortWharfImpl.setModifiedDate(getModifiedDate());
		dmPortWharfImpl.setRequestedDate(getRequestedDate());
		dmPortWharfImpl.setSyncVersion(getSyncVersion());

		dmPortWharfImpl.resetOriginalValues();

		return dmPortWharfImpl;
	}

	public int compareTo(DmPortWharf dmPortWharf) {
		int value = 0;

		if (getId() < dmPortWharf.getId()) {
			value = -1;
		}
		else if (getId() > dmPortWharf.getId()) {
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

		DmPortWharf dmPortWharf = null;

		try {
			dmPortWharf = (DmPortWharf)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmPortWharf.getPrimaryKey();

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
		DmPortWharfModelImpl dmPortWharfModelImpl = this;

		dmPortWharfModelImpl._originalPortWharfCode = dmPortWharfModelImpl._portWharfCode;

		dmPortWharfModelImpl._originalPortRegionCode = dmPortWharfModelImpl._portRegionCode;

		dmPortWharfModelImpl._originalSyncVersion = dmPortWharfModelImpl._syncVersion;

		dmPortWharfModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmPortWharf> toCacheModel() {
		DmPortWharfCacheModel dmPortWharfCacheModel = new DmPortWharfCacheModel();

		dmPortWharfCacheModel.id = getId();

		dmPortWharfCacheModel.portWharfCode = getPortWharfCode();

		String portWharfCode = dmPortWharfCacheModel.portWharfCode;

		if ((portWharfCode != null) && (portWharfCode.length() == 0)) {
			dmPortWharfCacheModel.portWharfCode = null;
		}

		dmPortWharfCacheModel.portWharfName = getPortWharfName();

		String portWharfName = dmPortWharfCacheModel.portWharfName;

		if ((portWharfName != null) && (portWharfName.length() == 0)) {
			dmPortWharfCacheModel.portWharfName = null;
		}

		dmPortWharfCacheModel.portWharfNameVN = getPortWharfNameVN();

		String portWharfNameVN = dmPortWharfCacheModel.portWharfNameVN;

		if ((portWharfNameVN != null) && (portWharfNameVN.length() == 0)) {
			dmPortWharfCacheModel.portWharfNameVN = null;
		}

		dmPortWharfCacheModel.portWharfType = getPortWharfType();

		dmPortWharfCacheModel.portCode = getPortCode();

		String portCode = dmPortWharfCacheModel.portCode;

		if ((portCode != null) && (portCode.length() == 0)) {
			dmPortWharfCacheModel.portCode = null;
		}

		dmPortWharfCacheModel.portHarbourCode = getPortHarbourCode();

		String portHarbourCode = dmPortWharfCacheModel.portHarbourCode;

		if ((portHarbourCode != null) && (portHarbourCode.length() == 0)) {
			dmPortWharfCacheModel.portHarbourCode = null;
		}

		dmPortWharfCacheModel.portRegionCode = getPortRegionCode();

		String portRegionCode = dmPortWharfCacheModel.portRegionCode;

		if ((portRegionCode != null) && (portRegionCode.length() == 0)) {
			dmPortWharfCacheModel.portRegionCode = null;
		}

		dmPortWharfCacheModel.note = getNote();

		String note = dmPortWharfCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			dmPortWharfCacheModel.note = null;
		}

		dmPortWharfCacheModel.isDelete = getIsDelete();

		dmPortWharfCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmPortWharfCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmPortWharfCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmPortWharfCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmPortWharfCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmPortWharfCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmPortWharfCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmPortWharfCacheModel.syncVersion = null;
		}

		return dmPortWharfCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", portWharfName=");
		sb.append(getPortWharfName());
		sb.append(", portWharfNameVN=");
		sb.append(getPortWharfNameVN());
		sb.append(", portWharfType=");
		sb.append(getPortWharfType());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", note=");
		sb.append(getNote());
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
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmPortWharf");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfName</column-name><column-value><![CDATA[");
		sb.append(getPortWharfName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfNameVN</column-name><column-value><![CDATA[");
		sb.append(getPortWharfNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfType</column-name><column-value><![CDATA[");
		sb.append(getPortWharfType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
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

	private static ClassLoader _classLoader = DmPortWharf.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmPortWharf.class
		};
	private int _id;
	private String _portWharfCode;
	private String _originalPortWharfCode;
	private String _portWharfName;
	private String _portWharfNameVN;
	private int _portWharfType;
	private String _portCode;
	private String _portHarbourCode;
	private String _portRegionCode;
	private String _originalPortRegionCode;
	private String _note;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private String _originalSyncVersion;
	private long _columnBitmask;
	private DmPortWharf _escapedModelProxy;
}