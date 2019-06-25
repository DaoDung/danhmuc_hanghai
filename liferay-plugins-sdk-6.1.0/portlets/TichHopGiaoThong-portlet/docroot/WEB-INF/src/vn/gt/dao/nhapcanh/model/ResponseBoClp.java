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

package vn.gt.dao.nhapcanh.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.nhapcanh.service.ResponseBoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class ResponseBoClp extends BaseModelImpl<ResponseBo>
	implements ResponseBo {
	public ResponseBoClp() {
	}

	public Class<?> getModelClass() {
		return ResponseBo.class;
	}

	public String getModelClassName() {
		return ResponseBo.class.getName();
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

	public int getIsSuccess() {
		return _isSuccess;
	}

	public void setIsSuccess(int isSuccess) {
		_isSuccess = isSuccess;
	}

	public String getErrorMessage() {
		return _errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		_errorMessage = errorMessage;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ResponseBoLocalServiceUtil.addResponseBo(this);
		}
		else {
			ResponseBoLocalServiceUtil.updateResponseBo(this);
		}
	}

	@Override
	public ResponseBo toEscapedModel() {
		return (ResponseBo)Proxy.newProxyInstance(ResponseBo.class.getClassLoader(),
			new Class[] { ResponseBo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResponseBoClp clone = new ResponseBoClp();

		clone.setId(getId());
		clone.setIsSuccess(getIsSuccess());
		clone.setErrorMessage(getErrorMessage());

		return clone;
	}

	public int compareTo(ResponseBo responseBo) {
		long primaryKey = responseBo.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ResponseBoClp responseBo = null;

		try {
			responseBo = (ResponseBoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = responseBo.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", isSuccess=");
		sb.append(getIsSuccess());
		sb.append(", errorMessage=");
		sb.append(getErrorMessage());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.nhapcanh.model.ResponseBo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isSuccess</column-name><column-value><![CDATA[");
		sb.append(getIsSuccess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>errorMessage</column-name><column-value><![CDATA[");
		sb.append(getErrorMessage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _isSuccess;
	private String _errorMessage;
}