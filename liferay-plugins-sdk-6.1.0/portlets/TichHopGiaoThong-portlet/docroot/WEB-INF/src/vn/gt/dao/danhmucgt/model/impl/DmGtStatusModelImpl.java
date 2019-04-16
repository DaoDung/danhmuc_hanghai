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

package vn.gt.dao.danhmucgt.model.impl;

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

import vn.gt.dao.danhmucgt.model.DmGtStatus;
import vn.gt.dao.danhmucgt.model.DmGtStatusModel;
import vn.gt.dao.danhmucgt.model.DmGtStatusSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the DmGtStatus service. Represents a row in the &quot;DM_GT_STATUS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmucgt.model.DmGtStatusModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmGtStatusImpl}.
 * </p>
 *
 * @author win_64
 * @see DmGtStatusImpl
 * @see vn.gt.dao.danhmucgt.model.DmGtStatus
 * @see vn.gt.dao.danhmucgt.model.DmGtStatusModel
 * @generated
 */
@JSON(strict = true)
public class DmGtStatusModelImpl extends BaseModelImpl<DmGtStatus>
	implements DmGtStatusModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm gt status model instance should use the {@link vn.gt.dao.danhmucgt.model.DmGtStatus} interface instead.
	 */
	public static final String TABLE_NAME = "DM_GT_STATUS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "StatusCode", Types.INTEGER },
			{ "StatusName", Types.VARCHAR },
			{ "Types", Types.INTEGER },
			{ "Description", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_GT_STATUS (id LONG not null primary key,StatusCode INTEGER,StatusName VARCHAR(75) null,Types INTEGER,Description VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_GT_STATUS";
	public static final String ORDER_BY_JPQL = " ORDER BY dmGtStatus.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_GT_STATUS.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmucgt.model.DmGtStatus"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmucgt.model.DmGtStatus"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmucgt.model.DmGtStatus"),
			true);
	public static long STATUSCODE_COLUMN_BITMASK = 1L;
	public static long TYPE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DmGtStatus toModel(DmGtStatusSoap soapModel) {
		DmGtStatus model = new DmGtStatusImpl();

		model.setId(soapModel.getId());
		model.setStatusCode(soapModel.getStatusCode());
		model.setStatusName(soapModel.getStatusName());
		model.setType(soapModel.getType());
		model.setDescription(soapModel.getDescription());
		model.setIsDelete(soapModel.getIsDelete());
		model.setMarkedAsDelete(soapModel.getMarkedAsDelete());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setRequestedDate(soapModel.getRequestedDate());
		model.setSyncVersion(soapModel.getSyncVersion());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DmGtStatus> toModels(DmGtStatusSoap[] soapModels) {
		List<DmGtStatus> models = new ArrayList<DmGtStatus>(soapModels.length);

		for (DmGtStatusSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmucgt.model.DmGtStatus"));

	public DmGtStatusModelImpl() {
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
		return DmGtStatus.class;
	}

	public String getModelClassName() {
		return DmGtStatus.class.getName();
	}

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	@JSON
	public int getStatusCode() {
		return _statusCode;
	}

	public void setStatusCode(int statusCode) {
		_columnBitmask |= STATUSCODE_COLUMN_BITMASK;

		if (!_setOriginalStatusCode) {
			_setOriginalStatusCode = true;

			_originalStatusCode = _statusCode;
		}

		_statusCode = statusCode;
	}

	public int getOriginalStatusCode() {
		return _originalStatusCode;
	}

	@JSON
	public String getStatusName() {
		if (_statusName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusName;
		}
	}

	public void setStatusName(String statusName) {
		_statusName = statusName;
	}

	@JSON
	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_columnBitmask |= TYPE_COLUMN_BITMASK;

		if (!_setOriginalType) {
			_setOriginalType = true;

			_originalType = _type;
		}

		_type = type;
	}

	public int getOriginalType() {
		return _originalType;
	}

	@JSON
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

	@JSON
	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	@JSON
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	@JSON
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
	public DmGtStatus toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmGtStatus)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					DmGtStatus.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		DmGtStatusImpl dmGtStatusImpl = new DmGtStatusImpl();

		dmGtStatusImpl.setId(getId());
		dmGtStatusImpl.setStatusCode(getStatusCode());
		dmGtStatusImpl.setStatusName(getStatusName());
		dmGtStatusImpl.setType(getType());
		dmGtStatusImpl.setDescription(getDescription());
		dmGtStatusImpl.setIsDelete(getIsDelete());
		dmGtStatusImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmGtStatusImpl.setModifiedDate(getModifiedDate());
		dmGtStatusImpl.setRequestedDate(getRequestedDate());
		dmGtStatusImpl.setSyncVersion(getSyncVersion());

		dmGtStatusImpl.resetOriginalValues();

		return dmGtStatusImpl;
	}

	public int compareTo(DmGtStatus dmGtStatus) {
		int value = 0;

		if (getId() < dmGtStatus.getId()) {
			value = -1;
		}
		else if (getId() > dmGtStatus.getId()) {
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

		DmGtStatus dmGtStatus = null;

		try {
			dmGtStatus = (DmGtStatus)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dmGtStatus.getPrimaryKey();

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
		DmGtStatusModelImpl dmGtStatusModelImpl = this;

		dmGtStatusModelImpl._originalStatusCode = dmGtStatusModelImpl._statusCode;

		dmGtStatusModelImpl._setOriginalStatusCode = false;

		dmGtStatusModelImpl._originalType = dmGtStatusModelImpl._type;

		dmGtStatusModelImpl._setOriginalType = false;

		dmGtStatusModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmGtStatus> toCacheModel() {
		DmGtStatusCacheModel dmGtStatusCacheModel = new DmGtStatusCacheModel();

		dmGtStatusCacheModel.id = getId();

		dmGtStatusCacheModel.statusCode = getStatusCode();

		dmGtStatusCacheModel.statusName = getStatusName();

		String statusName = dmGtStatusCacheModel.statusName;

		if ((statusName != null) && (statusName.length() == 0)) {
			dmGtStatusCacheModel.statusName = null;
		}

		dmGtStatusCacheModel.type = getType();

		dmGtStatusCacheModel.description = getDescription();

		String description = dmGtStatusCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dmGtStatusCacheModel.description = null;
		}

		dmGtStatusCacheModel.isDelete = getIsDelete();

		dmGtStatusCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmGtStatusCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmGtStatusCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmGtStatusCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmGtStatusCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmGtStatusCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmGtStatusCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmGtStatusCacheModel.syncVersion = null;
		}

		return dmGtStatusCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", statusCode=");
		sb.append(getStatusCode());
		sb.append(", statusName=");
		sb.append(getStatusName());
		sb.append(", type=");
		sb.append(getType());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmucgt.model.DmGtStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusCode</column-name><column-value><![CDATA[");
		sb.append(getStatusCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusName</column-name><column-value><![CDATA[");
		sb.append(getStatusName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
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

	private static ClassLoader _classLoader = DmGtStatus.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmGtStatus.class
		};
	private long _id;
	private int _statusCode;
	private int _originalStatusCode;
	private boolean _setOriginalStatusCode;
	private String _statusName;
	private int _type;
	private int _originalType;
	private boolean _setOriginalType;
	private String _description;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private DmGtStatus _escapedModelProxy;
}