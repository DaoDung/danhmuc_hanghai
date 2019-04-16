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

import vn.gt.dao.danhmuc.service.DmGoodsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmGoodsClp extends BaseModelImpl<DmGoods> implements DmGoods {
	public DmGoodsClp() {
	}

	public Class<?> getModelClass() {
		return DmGoods.class;
	}

	public String getModelClassName() {
		return DmGoods.class.getName();
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

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getGoodsItemCode() {
		return _goodsItemCode;
	}

	public void setGoodsItemCode(String goodsItemCode) {
		_goodsItemCode = goodsItemCode;
	}

	public String getGoodsItemName() {
		return _goodsItemName;
	}

	public void setGoodsItemName(String goodsItemName) {
		_goodsItemName = goodsItemName;
	}

	public String getGoodsItemNameVN() {
		return _goodsItemNameVN;
	}

	public void setGoodsItemNameVN(String goodsItemNameVN) {
		_goodsItemNameVN = goodsItemNameVN;
	}

	public int getGoodsItemOrder() {
		return _goodsItemOrder;
	}

	public void setGoodsItemOrder(int goodsItemOrder) {
		_goodsItemOrder = goodsItemOrder;
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
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	public void persist() throws SystemException {
		DmGoodsLocalServiceUtil.updateDmGoods(this);
	}

	@Override
	public DmGoods toEscapedModel() {
		return (DmGoods)Proxy.newProxyInstance(DmGoods.class.getClassLoader(),
			new Class[] { DmGoods.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmGoodsClp clone = new DmGoodsClp();

		clone.setId(getId());
		clone.setGoodsItemCode(getGoodsItemCode());
		clone.setGoodsItemName(getGoodsItemName());
		clone.setGoodsItemNameVN(getGoodsItemNameVN());
		clone.setGoodsItemOrder(getGoodsItemOrder());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	public int compareTo(DmGoods dmGoods) {
		int value = 0;

		if (getId() < dmGoods.getId()) {
			value = -1;
		}
		else if (getId() > dmGoods.getId()) {
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

		DmGoodsClp dmGoods = null;

		try {
			dmGoods = (DmGoodsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmGoods.getPrimaryKey();

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
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", goodsItemCode=");
		sb.append(getGoodsItemCode());
		sb.append(", goodsItemName=");
		sb.append(getGoodsItemName());
		sb.append(", goodsItemNameVN=");
		sb.append(getGoodsItemNameVN());
		sb.append(", goodsItemOrder=");
		sb.append(getGoodsItemOrder());
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
		sb.append("vn.gt.dao.danhmuc.model.DmGoods");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemCode</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemName</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemNameVN</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodsItemOrder</column-name><column-value><![CDATA[");
		sb.append(getGoodsItemOrder());
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

	private int _id;
	private String _goodsItemCode;
	private String _goodsItemName;
	private String _goodsItemNameVN;
	private int _goodsItemOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}