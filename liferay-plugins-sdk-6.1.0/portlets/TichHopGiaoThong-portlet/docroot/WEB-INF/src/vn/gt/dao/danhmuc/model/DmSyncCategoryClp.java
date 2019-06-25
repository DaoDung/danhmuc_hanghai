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

import vn.gt.dao.danhmuc.service.DmSyncCategoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmSyncCategoryClp extends BaseModelImpl<DmSyncCategory>
	implements DmSyncCategory {
	public DmSyncCategoryClp() {
	}

	public Class<?> getModelClass() {
		return DmSyncCategory.class;
	}

	public String getModelClassName() {
		return DmSyncCategory.class.getName();
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

	public String getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(String categoryId) {
		_categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return _categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		_categoryDescription = categoryDescription;
	}

	public String getModifiedUser() {
		return _modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DmSyncCategoryLocalServiceUtil.addDmSyncCategory(this);
		}
		else {
			DmSyncCategoryLocalServiceUtil.updateDmSyncCategory(this);
		}
	}

	@Override
	public DmSyncCategory toEscapedModel() {
		return (DmSyncCategory)Proxy.newProxyInstance(DmSyncCategory.class.getClassLoader(),
			new Class[] { DmSyncCategory.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmSyncCategoryClp clone = new DmSyncCategoryClp();

		clone.setId(getId());
		clone.setCategoryId(getCategoryId());
		clone.setCategoryDescription(getCategoryDescription());
		clone.setModifiedUser(getModifiedUser());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(DmSyncCategory dmSyncCategory) {
		int value = 0;

		if (getId() < dmSyncCategory.getId()) {
			value = -1;
		}
		else if (getId() > dmSyncCategory.getId()) {
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

		DmSyncCategoryClp dmSyncCategory = null;

		try {
			dmSyncCategory = (DmSyncCategoryClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dmSyncCategory.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append(", categoryDescription=");
		sb.append(getCategoryDescription());
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmSyncCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryDescription</column-name><column-value><![CDATA[");
		sb.append(getCategoryDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _categoryId;
	private String _categoryDescription;
	private String _modifiedUser;
	private Date _modifiedDate;
}