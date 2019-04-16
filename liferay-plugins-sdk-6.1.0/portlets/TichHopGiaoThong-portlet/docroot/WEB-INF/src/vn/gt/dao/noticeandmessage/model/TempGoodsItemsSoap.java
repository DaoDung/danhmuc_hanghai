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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempGoodsItemsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempGoodsItemsServiceSoap
 * @generated
 */
public class TempGoodsItemsSoap implements Serializable {
	public static TempGoodsItemsSoap toSoapModel(TempGoodsItems model) {
		TempGoodsItemsSoap soapModel = new TempGoodsItemsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setBillOfLadingNo(model.getBillOfLadingNo());
		soapModel.setGoodItemCode(model.getGoodItemCode());
		soapModel.setGoodItemDescription(model.getGoodItemDescription());
		soapModel.setNumberOfPackage(model.getNumberOfPackage());
		soapModel.setKindOfPackages(model.getKindOfPackages());
		soapModel.setMarksandNosofGoods(model.getMarksandNosofGoods());
		soapModel.setGrossWeight(model.getGrossWeight());
		soapModel.setGrossWeightUnit(model.getGrossWeightUnit());
		soapModel.setMeasurement(model.getMeasurement());
		soapModel.setMeasurementUnit(model.getMeasurementUnit());

		return soapModel;
	}

	public static TempGoodsItemsSoap[] toSoapModels(TempGoodsItems[] models) {
		TempGoodsItemsSoap[] soapModels = new TempGoodsItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempGoodsItemsSoap[][] toSoapModels(TempGoodsItems[][] models) {
		TempGoodsItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempGoodsItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempGoodsItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempGoodsItemsSoap[] toSoapModels(List<TempGoodsItems> models) {
		List<TempGoodsItemsSoap> soapModels = new ArrayList<TempGoodsItemsSoap>(models.size());

		for (TempGoodsItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempGoodsItemsSoap[soapModels.size()]);
	}

	public TempGoodsItemsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
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