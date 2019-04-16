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

import vn.gt.dao.danhmuc.model.ThamSoHeThong;
import vn.gt.dao.danhmuc.model.ThamSoHeThongModel;
import vn.gt.dao.danhmuc.model.ThamSoHeThongSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the ThamSoHeThong service. Represents a row in the &quot;user_system_init&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.ThamSoHeThongModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ThamSoHeThongImpl}.
 * </p>
 *
 * @author win_64
 * @see ThamSoHeThongImpl
 * @see vn.gt.dao.danhmuc.model.ThamSoHeThong
 * @see vn.gt.dao.danhmuc.model.ThamSoHeThongModel
 * @generated
 */
@JSON(strict = true)
public class ThamSoHeThongModelImpl extends BaseModelImpl<ThamSoHeThong>
	implements ThamSoHeThongModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tham so he thong model instance should use the {@link vn.gt.dao.danhmuc.model.ThamSoHeThong} interface instead.
	 */
	public static final String TABLE_NAME = "user_system_init";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "valuedata", Types.VARCHAR },
			{ "keydata", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table user_system_init (id LONG not null primary key,valuedata VARCHAR(75) null,keydata VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table user_system_init";
	public static final String ORDER_BY_JPQL = " ORDER BY thamSoHeThong.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY user_system_init.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.ThamSoHeThong"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.ThamSoHeThong"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.ThamSoHeThong"),
			true);
	public static long DESCRIPTION_COLUMN_BITMASK = 1L;
	public static long KEYDATA_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ThamSoHeThong toModel(ThamSoHeThongSoap soapModel) {
		ThamSoHeThong model = new ThamSoHeThongImpl();

		model.setId(soapModel.getId());
		model.setValueData(soapModel.getValueData());
		model.setKeyData(soapModel.getKeyData());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ThamSoHeThong> toModels(ThamSoHeThongSoap[] soapModels) {
		List<ThamSoHeThong> models = new ArrayList<ThamSoHeThong>(soapModels.length);

		for (ThamSoHeThongSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.ThamSoHeThong"));

	public ThamSoHeThongModelImpl() {
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
		return ThamSoHeThong.class;
	}

	public String getModelClassName() {
		return ThamSoHeThong.class.getName();
	}

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	@JSON
	public String getValueData() {
		if (_valueData == null) {
			return StringPool.BLANK;
		}
		else {
			return _valueData;
		}
	}

	public void setValueData(String valueData) {
		_valueData = valueData;
	}

	@JSON
	public String getKeyData() {
		if (_keyData == null) {
			return StringPool.BLANK;
		}
		else {
			return _keyData;
		}
	}

	public void setKeyData(String keyData) {
		_columnBitmask |= KEYDATA_COLUMN_BITMASK;

		if (_originalKeyData == null) {
			_originalKeyData = _keyData;
		}

		_keyData = keyData;
	}

	public String getOriginalKeyData() {
		return GetterUtil.getString(_originalKeyData);
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
		_columnBitmask |= DESCRIPTION_COLUMN_BITMASK;

		if (_originalDescription == null) {
			_originalDescription = _description;
		}

		_description = description;
	}

	public String getOriginalDescription() {
		return GetterUtil.getString(_originalDescription);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ThamSoHeThong toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ThamSoHeThong)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ThamSoHeThong.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ThamSoHeThongImpl thamSoHeThongImpl = new ThamSoHeThongImpl();

		thamSoHeThongImpl.setId(getId());
		thamSoHeThongImpl.setValueData(getValueData());
		thamSoHeThongImpl.setKeyData(getKeyData());
		thamSoHeThongImpl.setDescription(getDescription());

		thamSoHeThongImpl.resetOriginalValues();

		return thamSoHeThongImpl;
	}

	public int compareTo(ThamSoHeThong thamSoHeThong) {
		int value = 0;

		if (getId() < thamSoHeThong.getId()) {
			value = -1;
		}
		else if (getId() > thamSoHeThong.getId()) {
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

		ThamSoHeThong thamSoHeThong = null;

		try {
			thamSoHeThong = (ThamSoHeThong)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = thamSoHeThong.getPrimaryKey();

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
		ThamSoHeThongModelImpl thamSoHeThongModelImpl = this;

		thamSoHeThongModelImpl._originalKeyData = thamSoHeThongModelImpl._keyData;

		thamSoHeThongModelImpl._originalDescription = thamSoHeThongModelImpl._description;

		thamSoHeThongModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ThamSoHeThong> toCacheModel() {
		ThamSoHeThongCacheModel thamSoHeThongCacheModel = new ThamSoHeThongCacheModel();

		thamSoHeThongCacheModel.id = getId();

		thamSoHeThongCacheModel.valueData = getValueData();

		String valueData = thamSoHeThongCacheModel.valueData;

		if ((valueData != null) && (valueData.length() == 0)) {
			thamSoHeThongCacheModel.valueData = null;
		}

		thamSoHeThongCacheModel.keyData = getKeyData();

		String keyData = thamSoHeThongCacheModel.keyData;

		if ((keyData != null) && (keyData.length() == 0)) {
			thamSoHeThongCacheModel.keyData = null;
		}

		thamSoHeThongCacheModel.description = getDescription();

		String description = thamSoHeThongCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			thamSoHeThongCacheModel.description = null;
		}

		return thamSoHeThongCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", valueData=");
		sb.append(getValueData());
		sb.append(", keyData=");
		sb.append(getKeyData());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.ThamSoHeThong");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>valueData</column-name><column-value><![CDATA[");
		sb.append(getValueData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>keyData</column-name><column-value><![CDATA[");
		sb.append(getKeyData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ThamSoHeThong.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ThamSoHeThong.class
		};
	private long _id;
	private String _valueData;
	private String _keyData;
	private String _originalKeyData;
	private String _description;
	private String _originalDescription;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ThamSoHeThong _escapedModelProxy;
}