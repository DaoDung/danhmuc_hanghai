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

import vn.gt.dao.danhmuc.model.DmState;
import vn.gt.dao.danhmuc.model.DmStateModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmState service. Represents a row in the &quot;dm_state&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmStateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmStateImpl}.
 * </p>
 *
 * @author win_64
 * @see DmStateImpl
 * @see vn.gt.dao.danhmuc.model.DmState
 * @see vn.gt.dao.danhmuc.model.DmStateModel
 * @generated
 */
public class DmStateModelImpl extends BaseModelImpl<DmState>
	implements DmStateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm state model instance should use the {@link vn.gt.dao.danhmuc.model.DmState} interface instead.
	 */
	public static final String TABLE_NAME = "dm_state";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "statecode", Types.VARCHAR },
			{ "statename", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "isdelete", Types.INTEGER },
			{ "markedasdelete", Types.INTEGER },
			{ "modifieddate", Types.TIMESTAMP },
			{ "requesteddate", Types.TIMESTAMP },
			{ "syncversion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table dm_state (id INTEGER not null primary key,statecode VARCHAR(75) null,statename VARCHAR(75) null,description VARCHAR(75) null,isdelete INTEGER,markedasdelete INTEGER,modifieddate DATE null,requesteddate DATE null,syncversion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table dm_state";
	public static final String ORDER_BY_JPQL = " ORDER BY dmState.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY dm_state.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmState"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmState"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmState"),
			true);
	public static long STATECODE_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmState"));

	public DmStateModelImpl() {
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
		return DmState.class;
	}

	public String getModelClassName() {
		return DmState.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_columnBitmask = -1L;

		_id = id;
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
		_columnBitmask |= STATECODE_COLUMN_BITMASK;

		if (_originalStateCode == null) {
			_originalStateCode = _stateCode;
		}

		_stateCode = stateCode;
	}

	public String getOriginalStateCode() {
		return GetterUtil.getString(_originalStateCode);
	}

	public String getStateName() {
		if (_stateName == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateName;
		}
	}

	public void setStateName(String stateName) {
		_stateName = stateName;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
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
		_syncVersion = syncVersion;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmState toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmState)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmStateImpl dmStateImpl = new DmStateImpl();

		dmStateImpl.setId(getId());
		dmStateImpl.setStateCode(getStateCode());
		dmStateImpl.setStateName(getStateName());
		dmStateImpl.setDescription(getDescription());
		dmStateImpl.setIsDelete(getIsDelete());
		dmStateImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmStateImpl.setModifiedDate(getModifiedDate());
		dmStateImpl.setRequestedDate(getRequestedDate());
		dmStateImpl.setSyncVersion(getSyncVersion());

		dmStateImpl.resetOriginalValues();

		return dmStateImpl;
	}

	public int compareTo(DmState dmState) {
		int value = 0;

		if (getId() < dmState.getId()) {
			value = -1;
		}
		else if (getId() > dmState.getId()) {
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

		DmState dmState = null;

		try {
			dmState = (DmState)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmState.getPrimaryKey();

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
		DmStateModelImpl dmStateModelImpl = this;

		dmStateModelImpl._originalStateCode = dmStateModelImpl._stateCode;

		dmStateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmState> toCacheModel() {
		DmStateCacheModel dmStateCacheModel = new DmStateCacheModel();

		dmStateCacheModel.id = getId();

		dmStateCacheModel.stateCode = getStateCode();

		String stateCode = dmStateCacheModel.stateCode;

		if ((stateCode != null) && (stateCode.length() == 0)) {
			dmStateCacheModel.stateCode = null;
		}

		dmStateCacheModel.stateName = getStateName();

		String stateName = dmStateCacheModel.stateName;

		if ((stateName != null) && (stateName.length() == 0)) {
			dmStateCacheModel.stateName = null;
		}

		dmStateCacheModel.description = getDescription();

		String description = dmStateCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dmStateCacheModel.description = null;
		}

		dmStateCacheModel.isDelete = getIsDelete();

		dmStateCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmStateCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmStateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmStateCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmStateCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmStateCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmStateCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmStateCacheModel.syncVersion = null;
		}

		return dmStateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", stateName=");
		sb.append(getStateName());
		sb.append(", description=");
		sb.append(getDescription());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmState");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateName</column-name><column-value><![CDATA[");
		sb.append(getStateName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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

	private static ClassLoader _classLoader = DmState.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmState.class
		};
	private int _id;
	private String _stateCode;
	private String _originalStateCode;
	private String _stateName;
	private String _description;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmState _escapedModelProxy;
}