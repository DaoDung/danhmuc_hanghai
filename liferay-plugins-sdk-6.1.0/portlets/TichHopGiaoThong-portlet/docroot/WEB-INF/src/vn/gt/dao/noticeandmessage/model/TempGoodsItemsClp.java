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

import vn.gt.dao.noticeandmessage.service.TempGoodsItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempGoodsItemsClp extends BaseModelImpl<TempGoodsItems>
	implements TempGoodsItems {
	public TempGoodsItemsClp() {
	}

	public Class<?> getModelClass() {
		return TempGoodsItems.class;
	}

	public String getModelClassName() {
		return TempGoodsItems.class.getName();
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

	public String getBillOfLadingNo() {
		return _billOfLadingNo;
	}

	public void setBillOfLadingNo(String billOfLadingNo) {
		_billOfLadingNo = billOfLadingNo;
	}

	public String getGoodItemCode() {
		return _goodItemCode;
	}

	public void setGoodItemCode(String goodItemCode) {
		_goodItemCode = goodItemCode;
	}

	public String getGoodItemDescription() {
		return _goodItemDescription;
	}

	public void setGoodItemDescription(String goodItemDescription) {
		_goodItemDescription = goodItemDescription;
	}

	public long getNumberOfPackage() {
		return _numberOfPackage;
	}

	public void setNumberOfPackage(long numberOfPackage) {
		_numberOfPackage = numberOfPackage;
	}

	public String getKindOfPackages() {
		return _kindOfPackages;
	}

	public void setKindOfPackages(String kindOfPackages) {
		_kindOfPackages = kindOfPackages;
	}

	public String getMarksandNosofGoods() {
		return _marksandNosofGoods;
	}

	public void setMarksandNosofGoods(String marksandNosofGoods) {
		_marksandNosofGoods = marksandNosofGoods;
	}

	public double getGrossWeight() {
		return _grossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		_grossWeight = grossWeight;
	}

	public String getGrossWeightUnit() {
		return _grossWeightUnit;
	}

	public void setGrossWeightUnit(String grossWeightUnit) {
		_grossWeightUnit = grossWeightUnit;
	}

	public double getMeasurement() {
		return _measurement;
	}

	public void setMeasurement(double measurement) {
		_measurement = measurement;
	}

	public String getMeasurementUnit() {
		return _measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		_measurementUnit = measurementUnit;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempGoodsItemsLocalServiceUtil.addTempGoodsItems(this);
		}
		else {
			TempGoodsItemsLocalServiceUtil.updateTempGoodsItems(this);
		}
	}

	@Override
	public TempGoodsItems toEscapedModel() {
		return (TempGoodsItems)Proxy.newProxyInstance(TempGoodsItems.class.getClassLoader(),
			new Class[] { TempGoodsItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempGoodsItemsClp clone = new TempGoodsItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setBillOfLadingNo(getBillOfLadingNo());
		clone.setGoodItemCode(getGoodItemCode());
		clone.setGoodItemDescription(getGoodItemDescription());
		clone.setNumberOfPackage(getNumberOfPackage());
		clone.setKindOfPackages(getKindOfPackages());
		clone.setMarksandNosofGoods(getMarksandNosofGoods());
		clone.setGrossWeight(getGrossWeight());
		clone.setGrossWeightUnit(getGrossWeightUnit());
		clone.setMeasurement(getMeasurement());
		clone.setMeasurementUnit(getMeasurementUnit());

		return clone;
	}

	public int compareTo(TempGoodsItems tempGoodsItems) {
		int value = 0;

		if (getId() < tempGoodsItems.getId()) {
			value = -1;
		}
		else if (getId() > tempGoodsItems.getId()) {
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

		TempGoodsItemsClp tempGoodsItems = null;

		try {
			tempGoodsItems = (TempGoodsItemsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempGoodsItems.getPrimaryKey();

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
		sb.append(", billOfLadingNo=");
		sb.append(getBillOfLadingNo());
		sb.append(", goodItemCode=");
		sb.append(getGoodItemCode());
		sb.append(", goodItemDescription=");
		sb.append(getGoodItemDescription());
		sb.append(", numberOfPackage=");
		sb.append(getNumberOfPackage());
		sb.append(", kindOfPackages=");
		sb.append(getKindOfPackages());
		sb.append(", marksandNosofGoods=");
		sb.append(getMarksandNosofGoods());
		sb.append(", grossWeight=");
		sb.append(getGrossWeight());
		sb.append(", grossWeightUnit=");
		sb.append(getGrossWeightUnit());
		sb.append(", measurement=");
		sb.append(getMeasurement());
		sb.append(", measurementUnit=");
		sb.append(getMeasurementUnit());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempGoodsItems");
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
			"<column><column-name>billOfLadingNo</column-name><column-value><![CDATA[");
		sb.append(getBillOfLadingNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodItemCode</column-name><column-value><![CDATA[");
		sb.append(getGoodItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodItemDescription</column-name><column-value><![CDATA[");
		sb.append(getGoodItemDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPackage</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPackage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kindOfPackages</column-name><column-value><![CDATA[");
		sb.append(getKindOfPackages());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marksandNosofGoods</column-name><column-value><![CDATA[");
		sb.append(getMarksandNosofGoods());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossWeight</column-name><column-value><![CDATA[");
		sb.append(getGrossWeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossWeightUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossWeightUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>measurement</column-name><column-value><![CDATA[");
		sb.append(getMeasurement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>measurementUnit</column-name><column-value><![CDATA[");
		sb.append(getMeasurementUnit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _billOfLadingNo;
	private String _goodItemCode;
	private String _goodItemDescription;
	private long _numberOfPackage;
	private String _kindOfPackages;
	private String _marksandNosofGoods;
	private double _grossWeight;
	private String _grossWeightUnit;
	private double _measurement;
	private String _measurementUnit;
}