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

import vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmDataItemClp extends BaseModelImpl<DmDataItem>
	implements DmDataItem {
	public DmDataItemClp() {
	}

	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	public String getModelClassName() {
		return DmDataItem.class.getName();
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_Id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public long getDataGroupId() {
		return _DataGroupId;
	}

	public void setDataGroupId(long DataGroupId) {
		_DataGroupId = DataGroupId;
	}

	public String getCode0() {
		return _Code0;
	}

	public void setCode0(String Code0) {
		_Code0 = Code0;
	}

	public String getNode1() {
		return _Node1;
	}

	public void setNode1(String Node1) {
		_Node1 = Node1;
	}

	public String getNode2() {
		return _Node2;
	}

	public void setNode2(String Node2) {
		_Node2 = Node2;
	}

	public String getNode3() {
		return _Node3;
	}

	public void setNode3(String Node3) {
		_Node3 = Node3;
	}

	public String getNode4() {
		return _Node4;
	}

	public void setNode4(String Node4) {
		_Node4 = Node4;
	}

	public int getLevel() {
		return _Level;
	}

	public void setLevel(int Level) {
		_Level = Level;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getShortName() {
		return _ShortName;
	}

	public void setShortName(String ShortName) {
		_ShortName = ShortName;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public Date getValidatedFrom() {
		return _ValidatedFrom;
	}

	public void setValidatedFrom(Date ValidatedFrom) {
		_ValidatedFrom = ValidatedFrom;
	}

	public Date getValidatedTo() {
		return _ValidatedTo;
	}

	public void setValidatedTo(Date ValidatedTo) {
		_ValidatedTo = ValidatedTo;
	}

	public int getOrder() {
		return _Order;
	}

	public void setOrder(int Order) {
		_Order = Order;
	}

	public int getStatus() {
		return _Status;
	}

	public void setStatus(int Status) {
		_Status = Status;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DmDataItemLocalServiceUtil.addDmDataItem(this);
		}
		else {
			DmDataItemLocalServiceUtil.updateDmDataItem(this);
		}
	}

	@Override
	public DmDataItem toEscapedModel() {
		return (DmDataItem)Proxy.newProxyInstance(DmDataItem.class.getClassLoader(),
			new Class[] { DmDataItem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmDataItemClp clone = new DmDataItemClp();

		clone.setId(getId());
		clone.setDataGroupId(getDataGroupId());
		clone.setCode0(getCode0());
		clone.setNode1(getNode1());
		clone.setNode2(getNode2());
		clone.setNode3(getNode3());
		clone.setNode4(getNode4());
		clone.setLevel(getLevel());
		clone.setName(getName());
		clone.setShortName(getShortName());
		clone.setDescription(getDescription());
		clone.setValidatedFrom(getValidatedFrom());
		clone.setValidatedTo(getValidatedTo());
		clone.setOrder(getOrder());
		clone.setStatus(getStatus());

		return clone;
	}

	public int compareTo(DmDataItem dmDataItem) {
		int value = 0;

		if (getId() < dmDataItem.getId()) {
			value = -1;
		}
		else if (getId() > dmDataItem.getId()) {
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

		DmDataItemClp dmDataItem = null;

		try {
			dmDataItem = (DmDataItemClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = dmDataItem.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", DataGroupId=");
		sb.append(getDataGroupId());
		sb.append(", Code0=");
		sb.append(getCode0());
		sb.append(", Node1=");
		sb.append(getNode1());
		sb.append(", Node2=");
		sb.append(getNode2());
		sb.append(", Node3=");
		sb.append(getNode3());
		sb.append(", Node4=");
		sb.append(getNode4());
		sb.append(", Level=");
		sb.append(getLevel());
		sb.append(", Name=");
		sb.append(getName());
		sb.append(", ShortName=");
		sb.append(getShortName());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", ValidatedFrom=");
		sb.append(getValidatedFrom());
		sb.append(", ValidatedTo=");
		sb.append(getValidatedTo());
		sb.append(", Order=");
		sb.append(getOrder());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmDataItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DataGroupId</column-name><column-value><![CDATA[");
		sb.append(getDataGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Code0</column-name><column-value><![CDATA[");
		sb.append(getCode0());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Node1</column-name><column-value><![CDATA[");
		sb.append(getNode1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Node2</column-name><column-value><![CDATA[");
		sb.append(getNode2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Node3</column-name><column-value><![CDATA[");
		sb.append(getNode3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Node4</column-name><column-value><![CDATA[");
		sb.append(getNode4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ShortName</column-name><column-value><![CDATA[");
		sb.append(getShortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedFrom</column-name><column-value><![CDATA[");
		sb.append(getValidatedFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidatedTo</column-name><column-value><![CDATA[");
		sb.append(getValidatedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private long _DataGroupId;
	private String _Code0;
	private String _Node1;
	private String _Node2;
	private String _Node3;
	private String _Node4;
	private int _Level;
	private String _Name;
	private String _ShortName;
	private String _Description;
	private Date _ValidatedFrom;
	private Date _ValidatedTo;
	private int _Order;
	private int _Status;
}