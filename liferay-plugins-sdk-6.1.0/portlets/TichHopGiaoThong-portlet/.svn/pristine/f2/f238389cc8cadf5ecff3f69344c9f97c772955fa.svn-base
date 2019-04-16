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

import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempDangerousGoodsItemsClp extends BaseModelImpl<TempDangerousGoodsItems>
	implements TempDangerousGoodsItems {
	public TempDangerousGoodsItemsClp() {
	}

	public Class<?> getModelClass() {
		return TempDangerousGoodsItems.class;
	}

	public String getModelClassName() {
		return TempDangerousGoodsItems.class.getName();
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

	public String getDangerousGoodItemCode() {
		return _dangerousGoodItemCode;
	}

	public void setDangerousGoodItemCode(String dangerousGoodItemCode) {
		_dangerousGoodItemCode = dangerousGoodItemCode;
	}

	public String getRefNumber() {
		return _refNumber;
	}

	public void setRefNumber(String refNumber) {
		_refNumber = refNumber;
	}

	public String getMarksContainer() {
		return _marksContainer;
	}

	public void setMarksContainer(String marksContainer) {
		_marksContainer = marksContainer;
	}

	public String getNumberContainer() {
		return _numberContainer;
	}

	public void setNumberContainer(String numberContainer) {
		_numberContainer = numberContainer;
	}

	public String getNumberOfPackage() {
		return _numberOfPackage;
	}

	public void setNumberOfPackage(String numberOfPackage) {
		_numberOfPackage = numberOfPackage;
	}

	public String getKindOfPackages() {
		return _kindOfPackages;
	}

	public void setKindOfPackages(String kindOfPackages) {
		_kindOfPackages = kindOfPackages;
	}

	public String getProperShippingName() {
		return _properShippingName;
	}

	public void setProperShippingName(String properShippingName) {
		_properShippingName = properShippingName;
	}

	public String getGoodClass() {
		return _goodClass;
	}

	public void setGoodClass(String goodClass) {
		_goodClass = goodClass;
	}

	public String getUnNumber() {
		return _unNumber;
	}

	public void setUnNumber(String unNumber) {
		_unNumber = unNumber;
	}

	public String getPackingGroup() {
		return _packingGroup;
	}

	public void setPackingGroup(String packingGroup) {
		_packingGroup = packingGroup;
	}

	public String getSubsidiaryRisk() {
		return _subsidiaryRisk;
	}

	public void setSubsidiaryRisk(String subsidiaryRisk) {
		_subsidiaryRisk = subsidiaryRisk;
	}

	public String getFlashPoint() {
		return _flashPoint;
	}

	public void setFlashPoint(String flashPoint) {
		_flashPoint = flashPoint;
	}

	public String getMarinePollutant() {
		return _marinePollutant;
	}

	public void setMarinePollutant(String marinePollutant) {
		_marinePollutant = marinePollutant;
	}

	public double getGrossWeight() {
		return _grossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		_grossWeight = grossWeight;
	}

	public String getEms() {
		return _ems;
	}

	public void setEms(String ems) {
		_ems = ems;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDangerousGoodsItemsLocalServiceUtil.addTempDangerousGoodsItems(this);
		}
		else {
			TempDangerousGoodsItemsLocalServiceUtil.updateTempDangerousGoodsItems(this);
		}
	}

	@Override
	public TempDangerousGoodsItems toEscapedModel() {
		return (TempDangerousGoodsItems)Proxy.newProxyInstance(TempDangerousGoodsItems.class.getClassLoader(),
			new Class[] { TempDangerousGoodsItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDangerousGoodsItemsClp clone = new TempDangerousGoodsItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setDangerousGoodItemCode(getDangerousGoodItemCode());
		clone.setRefNumber(getRefNumber());
		clone.setMarksContainer(getMarksContainer());
		clone.setNumberContainer(getNumberContainer());
		clone.setNumberOfPackage(getNumberOfPackage());
		clone.setKindOfPackages(getKindOfPackages());
		clone.setProperShippingName(getProperShippingName());
		clone.setGoodClass(getGoodClass());
		clone.setUnNumber(getUnNumber());
		clone.setPackingGroup(getPackingGroup());
		clone.setSubsidiaryRisk(getSubsidiaryRisk());
		clone.setFlashPoint(getFlashPoint());
		clone.setMarinePollutant(getMarinePollutant());
		clone.setGrossWeight(getGrossWeight());
		clone.setEms(getEms());

		return clone;
	}

	public int compareTo(TempDangerousGoodsItems tempDangerousGoodsItems) {
		int value = 0;

		if (getId() < tempDangerousGoodsItems.getId()) {
			value = -1;
		}
		else if (getId() > tempDangerousGoodsItems.getId()) {
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

		TempDangerousGoodsItemsClp tempDangerousGoodsItems = null;

		try {
			tempDangerousGoodsItems = (TempDangerousGoodsItemsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempDangerousGoodsItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", dangerousGoodItemCode=");
		sb.append(getDangerousGoodItemCode());
		sb.append(", refNumber=");
		sb.append(getRefNumber());
		sb.append(", marksContainer=");
		sb.append(getMarksContainer());
		sb.append(", numberContainer=");
		sb.append(getNumberContainer());
		sb.append(", numberOfPackage=");
		sb.append(getNumberOfPackage());
		sb.append(", kindOfPackages=");
		sb.append(getKindOfPackages());
		sb.append(", properShippingName=");
		sb.append(getProperShippingName());
		sb.append(", goodClass=");
		sb.append(getGoodClass());
		sb.append(", unNumber=");
		sb.append(getUnNumber());
		sb.append(", packingGroup=");
		sb.append(getPackingGroup());
		sb.append(", subsidiaryRisk=");
		sb.append(getSubsidiaryRisk());
		sb.append(", flashPoint=");
		sb.append(getFlashPoint());
		sb.append(", marinePollutant=");
		sb.append(getMarinePollutant());
		sb.append(", grossWeight=");
		sb.append(getGrossWeight());
		sb.append(", ems=");
		sb.append(getEms());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItems");
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
			"<column><column-name>dangerousGoodItemCode</column-name><column-value><![CDATA[");
		sb.append(getDangerousGoodItemCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>refNumber</column-name><column-value><![CDATA[");
		sb.append(getRefNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marksContainer</column-name><column-value><![CDATA[");
		sb.append(getMarksContainer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberContainer</column-name><column-value><![CDATA[");
		sb.append(getNumberContainer());
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
			"<column><column-name>properShippingName</column-name><column-value><![CDATA[");
		sb.append(getProperShippingName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>goodClass</column-name><column-value><![CDATA[");
		sb.append(getGoodClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unNumber</column-name><column-value><![CDATA[");
		sb.append(getUnNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>packingGroup</column-name><column-value><![CDATA[");
		sb.append(getPackingGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subsidiaryRisk</column-name><column-value><![CDATA[");
		sb.append(getSubsidiaryRisk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flashPoint</column-name><column-value><![CDATA[");
		sb.append(getFlashPoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>marinePollutant</column-name><column-value><![CDATA[");
		sb.append(getMarinePollutant());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossWeight</column-name><column-value><![CDATA[");
		sb.append(getGrossWeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ems</column-name><column-value><![CDATA[");
		sb.append(getEms());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _dangerousGoodItemCode;
	private String _refNumber;
	private String _marksContainer;
	private String _numberContainer;
	private String _numberOfPackage;
	private String _kindOfPackages;
	private String _properShippingName;
	private String _goodClass;
	private String _unNumber;
	private String _packingGroup;
	private String _subsidiaryRisk;
	private String _flashPoint;
	private String _marinePollutant;
	private double _grossWeight;
	private String _ems;
}