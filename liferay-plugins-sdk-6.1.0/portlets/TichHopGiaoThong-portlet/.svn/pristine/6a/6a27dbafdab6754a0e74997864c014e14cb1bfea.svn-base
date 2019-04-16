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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.TempShipStoresItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempShipStoresItemsClp extends BaseModelImpl<TempShipStoresItems>
	implements TempShipStoresItems {
	public TempShipStoresItemsClp() {
	}

	public Class<?> getModelClass() {
		return TempShipStoresItems.class;
	}

	public String getModelClassName() {
		return TempShipStoresItems.class.getName();
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

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public String getShipsstoreItemCode() {
		return _shipsstoreItemCode;
	}

	public void setShipsstoreItemCode(String shipsstoreItemCode) {
		_shipsstoreItemCode = shipsstoreItemCode;
	}

	public String getNameOfArticle() {
		return _nameOfArticle;
	}

	public void setNameOfArticle(String nameOfArticle) {
		_nameOfArticle = nameOfArticle;
	}

	public String getQuantity() {
		return _quantity;
	}

	public void setQuantity(String quantity) {
		_quantity = quantity;
	}

	public String getQuantityUnit() {
		return _quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		_quantityUnit = quantityUnit;
	}

	public String getLocationOnBoat() {
		return _locationOnBoat;
	}

	public void setLocationOnBoat(String locationOnBoat) {
		_locationOnBoat = locationOnBoat;
	}

	public int getUseInBoat() {
		return _useInBoat;
	}

	public void setUseInBoat(int useInBoat) {
		_useInBoat = useInBoat;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipStoresItemsLocalServiceUtil.addTempShipStoresItems(this);
		}
		else {
			TempShipStoresItemsLocalServiceUtil.updateTempShipStoresItems(this);
		}
	}

	@Override
	public TempShipStoresItems toEscapedModel() {
		return (TempShipStoresItems)Proxy.newProxyInstance(TempShipStoresItems.class.getClassLoader(),
			new Class[] { TempShipStoresItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipStoresItemsClp clone = new TempShipStoresItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setShipsstoreItemCode(getShipsstoreItemCode());
		clone.setNameOfArticle(getNameOfArticle());
		clone.setQuantity(getQuantity());
		clone.setQuantityUnit(getQuantityUnit());
		clone.setLocationOnBoat(getLocationOnBoat());
		clone.setUseInBoat(getUseInBoat());

		return clone;
	}

	public int compareTo(TempShipStoresItems tempShipStoresItems) {
		int value = 0;

		if (getId() < tempShipStoresItems.getId()) {
			value = -1;
		}
		else if (getId() > tempShipStoresItems.getId()) {
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

		TempShipStoresItemsClp tempShipStoresItems = null;

		try {
			tempShipStoresItems = (TempShipStoresItemsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempShipStoresItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", shipsstoreItemCode=");
		sb.append(getShipsstoreItemCode());
		sb.append(", nameOfArticle=");
		sb.append(getNameOfArticle());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", quantityUnit=");
		sb.append(getQuantityUnit());
		sb.append(", locationOnBoat=");
		sb.append(getLocationOnBoat());
		sb.append(", useInBoat=");
		sb.append(getUseInBoat());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempShipStoresItems");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipsstoreItemCode</column-name><column-value><![CDATA[");
		sb.append(getShipsstoreItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfArticle</column-name><column-value><![CDATA[");
		sb.append(getNameOfArticle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityUnit</column-name><column-value><![CDATA[");
		sb.append(getQuantityUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationOnBoat</column-name><column-value><![CDATA[");
		sb.append(getLocationOnBoat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useInBoat</column-name><column-value><![CDATA[");
		sb.append(getUseInBoat());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _shipsstoreItemCode;
	private String _nameOfArticle;
	private String _quantity;
	private String _quantityUnit;
	private String _locationOnBoat;
	private int _useInBoat;
}