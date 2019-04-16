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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.TempGoodsItems;

import java.io.Serializable;

/**
 * The cache model class for representing TempGoodsItems in entity cache.
 *
 * @author win_64
 * @see TempGoodsItems
 * @generated
 */
public class TempGoodsItemsCacheModel implements CacheModel<TempGoodsItems>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", billOfLadingNo=");
		sb.append(billOfLadingNo);
		sb.append(", goodItemCode=");
		sb.append(goodItemCode);
		sb.append(", goodItemDescription=");
		sb.append(goodItemDescription);
		sb.append(", numberOfPackage=");
		sb.append(numberOfPackage);
		sb.append(", kindOfPackages=");
		sb.append(kindOfPackages);
		sb.append(", marksandNosofGoods=");
		sb.append(marksandNosofGoods);
		sb.append(", grossWeight=");
		sb.append(grossWeight);
		sb.append(", grossWeightUnit=");
		sb.append(grossWeightUnit);
		sb.append(", measurement=");
		sb.append(measurement);
		sb.append(", measurementUnit=");
		sb.append(measurementUnit);
		sb.append("}");

		return sb.toString();
	}

	public TempGoodsItems toEntityModel() {
		TempGoodsItemsImpl tempGoodsItemsImpl = new TempGoodsItemsImpl();

		tempGoodsItemsImpl.setId(id);

		if (requestCode == null) {
			tempGoodsItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setRequestCode(requestCode);
		}

		if (billOfLadingNo == null) {
			tempGoodsItemsImpl.setBillOfLadingNo(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setBillOfLadingNo(billOfLadingNo);
		}

		if (goodItemCode == null) {
			tempGoodsItemsImpl.setGoodItemCode(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setGoodItemCode(goodItemCode);
		}

		if (goodItemDescription == null) {
			tempGoodsItemsImpl.setGoodItemDescription(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setGoodItemDescription(goodItemDescription);
		}

		tempGoodsItemsImpl.setNumberOfPackage(numberOfPackage);

		if (kindOfPackages == null) {
			tempGoodsItemsImpl.setKindOfPackages(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setKindOfPackages(kindOfPackages);
		}

		if (marksandNosofGoods == null) {
			tempGoodsItemsImpl.setMarksandNosofGoods(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setMarksandNosofGoods(marksandNosofGoods);
		}

		tempGoodsItemsImpl.setGrossWeight(grossWeight);

		if (grossWeightUnit == null) {
			tempGoodsItemsImpl.setGrossWeightUnit(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setGrossWeightUnit(grossWeightUnit);
		}

		tempGoodsItemsImpl.setMeasurement(measurement);

		if (measurementUnit == null) {
			tempGoodsItemsImpl.setMeasurementUnit(StringPool.BLANK);
		}
		else {
			tempGoodsItemsImpl.setMeasurementUnit(measurementUnit);
		}

		tempGoodsItemsImpl.resetOriginalValues();

		return tempGoodsItemsImpl;
	}

	public long id;
	public String requestCode;
	public String billOfLadingNo;
	public String goodItemCode;
	public String goodItemDescription;
	public long numberOfPackage;
	public String kindOfPackages;
	public String marksandNosofGoods;
	public double grossWeight;
	public String grossWeightUnit;
	public double measurement;
	public String measurementUnit;
}