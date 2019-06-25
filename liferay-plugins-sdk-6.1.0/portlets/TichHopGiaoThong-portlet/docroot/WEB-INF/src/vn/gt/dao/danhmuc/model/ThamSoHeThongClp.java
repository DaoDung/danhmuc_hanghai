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

package vn.gt.dao.danhmuc.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.danhmuc.service.ThamSoHeThongLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class ThamSoHeThongClp extends BaseModelImpl<ThamSoHeThong>
	implements ThamSoHeThong {
	public ThamSoHeThongClp() {
	}

	public Class<?> getModelClass() {
		return ThamSoHeThong.class;
	}

	public String getModelClassName() {
		return ThamSoHeThong.class.getName();
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

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getValueData() {
		return _valueData;
	}

	public void setValueData(String valueData) {
		_valueData = valueData;
	}

	public String getKeyData() {
		return _keyData;
	}

	public void setKeyData(String keyData) {
		_keyData = keyData;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ThamSoHeThongLocalServiceUtil.addThamSoHeThong(this);
		}
		else {
			ThamSoHeThongLocalServiceUtil.updateThamSoHeThong(this);
		}
	}

	@Override
	public ThamSoHeThong toEscapedModel() {
		return (ThamSoHeThong)Proxy.newProxyInstance(ThamSoHeThong.class.getClassLoader(),
			new Class[] { ThamSoHeThong.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ThamSoHeThongClp clone = new ThamSoHeThongClp();

		clone.setId(getId());
		clone.setValueData(getValueData());
		clone.setKeyData(getKeyData());
		clone.setDescription(getDescription());

		return clone;
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

		ThamSoHeThongClp thamSoHeThong = null;

		try {
			thamSoHeThong = (ThamSoHeThongClp)obj;
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

	private long _id;
	private String _valueData;
	private String _keyData;
	private String _description;
}