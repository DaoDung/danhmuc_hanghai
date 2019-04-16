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

package vn.gt.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.gt.dao.common.service.UserSignLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class UserSignClp extends BaseModelImpl<UserSign> implements UserSign {
	public UserSignClp() {
	}

	public Class<?> getModelClass() {
		return UserSign.class;
	}

	public String getModelClassName() {
		return UserSign.class.getName();
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getRepresentative() {
		return _representative;
	}

	public void setRepresentative(String representative) {
		_representative = representative;
	}

	public long getFileChuKyId() {
		return _fileChuKyId;
	}

	public void setFileChuKyId(long fileChuKyId) {
		_fileChuKyId = fileChuKyId;
	}

	public long getFileConDauId() {
		return _fileConDauId;
	}

	public void setFileConDauId(long fileConDauId) {
		_fileConDauId = fileConDauId;
	}

	public long getFileChungThuSoId() {
		return _fileChungThuSoId;
	}

	public void setFileChungThuSoId(long fileChungThuSoId) {
		_fileChungThuSoId = fileChungThuSoId;
	}

	public String getModifyUser() {
		return _modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		_modifyUser = modifyUser;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public void persist() throws SystemException {
		UserSignLocalServiceUtil.updateUserSign(this);
	}

	@Override
	public UserSign toEscapedModel() {
		return (UserSign)Proxy.newProxyInstance(UserSign.class.getClassLoader(),
			new Class[] { UserSign.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserSignClp clone = new UserSignClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setPortCode(getPortCode());
		clone.setTitle(getTitle());
		clone.setRepresentative(getRepresentative());
		clone.setFileChuKyId(getFileChuKyId());
		clone.setFileConDauId(getFileConDauId());
		clone.setFileChungThuSoId(getFileChungThuSoId());
		clone.setModifyUser(getModifyUser());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	public int compareTo(UserSign userSign) {
		int value = 0;

		if (getId() < userSign.getId()) {
			value = -1;
		}
		else if (getId() > userSign.getId()) {
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

		UserSignClp userSign = null;

		try {
			userSign = (UserSignClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = userSign.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", fileChuKyId=");
		sb.append(getFileChuKyId());
		sb.append(", fileConDauId=");
		sb.append(getFileConDauId());
		sb.append(", fileChungThuSoId=");
		sb.append(getFileChungThuSoId());
		sb.append(", modifyUser=");
		sb.append(getModifyUser());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.common.model.UserSign");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileChuKyId</column-name><column-value><![CDATA[");
		sb.append(getFileChuKyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileConDauId</column-name><column-value><![CDATA[");
		sb.append(getFileConDauId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileChungThuSoId</column-name><column-value><![CDATA[");
		sb.append(getFileChungThuSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyUser</column-name><column-value><![CDATA[");
		sb.append(getModifyUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private String _portCode;
	private String _title;
	private String _representative;
	private long _fileChuKyId;
	private long _fileConDauId;
	private long _fileChungThuSoId;
	private String _modifyUser;
	private Date _modifyDate;
}