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

import vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempCargoItemsClp extends BaseModelImpl<TempCargoItems>
	implements TempCargoItems {
	public TempCargoItemsClp() {
	}

	public Class<?> getModelClass() {
		return TempCargoItems.class;
	}

	public String getModelClassName() {
		return TempCargoItems.class.getName();
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

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getCargoCategory() {
		return _cargoCategory;
	}

	public void setCargoCategory(String cargoCategory) {
		_cargoCategory = cargoCategory;
	}

	public String getCargoType() {
		return _cargoType;
	}

	public void setCargoType(String cargoType) {
		_cargoType = cargoType;
	}

	public String getCargoCode() {
		return _cargoCode;
	}

	public void setCargoCode(String cargoCode) {
		_cargoCode = cargoCode;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getQuantity() {
		return _quantity;
	}

	public void setQuantity(double quantity) {
		_quantity = quantity;
	}

	public String getUnit() {
		return _unit;
	}

	public void setUnit(String unit) {
		_unit = unit;
	}

	public int getSequence() {
		return _sequence;
	}

	public void setSequence(int sequence) {
		_sequence = sequence;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCargoItemsLocalServiceUtil.addTempCargoItems(this);
		}
		else {
			TempCargoItemsLocalServiceUtil.updateTempCargoItems(this);
		}
	}

	@Override
	public TempCargoItems toEscapedModel() {
		return (TempCargoItems)Proxy.newProxyInstance(TempCargoItems.class.getClassLoader(),
			new Class[] { TempCargoItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCargoItemsClp clone = new TempCargoItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setCargoCategory(getCargoCategory());
		clone.setCargoType(getCargoType());
		clone.setCargoCode(getCargoCode());
		clone.setDescription(getDescription());
		clone.setQuantity(getQuantity());
		clone.setUnit(getUnit());
		clone.setSequence(getSequence());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	public int compareTo(TempCargoItems tempCargoItems) {
		int value = 0;

		if (getId() < tempCargoItems.getId()) {
			value = -1;
		}
		else if (getId() > tempCargoItems.getId()) {
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

		TempCargoItemsClp tempCargoItems = null;

		try {
			tempCargoItems = (TempCargoItemsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempCargoItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", cargoCategory=");
		sb.append(getCargoCategory());
		sb.append(", cargoType=");
		sb.append(getCargoType());
		sb.append(", cargoCode=");
		sb.append(getCargoCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", unit=");
		sb.append(getUnit());
		sb.append(", sequence=");
		sb.append(getSequence());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempCargoItems");
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
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoCategory</column-name><column-value><![CDATA[");
		sb.append(getCargoCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoType</column-name><column-value><![CDATA[");
		sb.append(getCargoType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoCode</column-name><column-value><![CDATA[");
		sb.append(getCargoCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unit</column-name><column-value><![CDATA[");
		sb.append(getUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequence</column-name><column-value><![CDATA[");
		sb.append(getSequence());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
	private String _cargoCategory;
	private String _cargoType;
	private String _cargoCode;
	private String _description;
	private double _quantity;
	private String _unit;
	private int _sequence;
	private Date _modifiedDate;
}