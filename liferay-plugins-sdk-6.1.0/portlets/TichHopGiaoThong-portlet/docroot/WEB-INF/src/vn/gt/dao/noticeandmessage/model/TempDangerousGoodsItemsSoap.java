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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempDangerousGoodsItemsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempDangerousGoodsItemsServiceSoap
 * @generated
 */
public class TempDangerousGoodsItemsSoap implements Serializable {
	public static TempDangerousGoodsItemsSoap toSoapModel(
		TempDangerousGoodsItems model) {
		TempDangerousGoodsItemsSoap soapModel = new TempDangerousGoodsItemsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setDangerousGoodItemCode(model.getDangerousGoodItemCode());
		soapModel.setRefNumber(model.getRefNumber());
		soapModel.setMarksContainer(model.getMarksContainer());
		soapModel.setNumberContainer(model.getNumberContainer());
		soapModel.setNumberOfPackage(model.getNumberOfPackage());
		soapModel.setKindOfPackages(model.getKindOfPackages());
		soapModel.setProperShippingName(model.getProperShippingName());
		soapModel.setGoodClass(model.getGoodClass());
		soapModel.setUnNumber(model.getUnNumber());
		soapModel.setPackingGroup(model.getPackingGroup());
		soapModel.setSubsidiaryRisk(model.getSubsidiaryRisk());
		soapModel.setFlashPoint(model.getFlashPoint());
		soapModel.setMarinePollutant(model.getMarinePollutant());
		soapModel.setGrossWeight(model.getGrossWeight());
		soapModel.setEms(model.getEms());

		return soapModel;
	}

	public static TempDangerousGoodsItemsSoap[] toSoapModels(
		TempDangerousGoodsItems[] models) {
		TempDangerousGoodsItemsSoap[] soapModels = new TempDangerousGoodsItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempDangerousGoodsItemsSoap[][] toSoapModels(
		TempDangerousGoodsItems[][] models) {
		TempDangerousGoodsItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempDangerousGoodsItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempDangerousGoodsItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempDangerousGoodsItemsSoap[] toSoapModels(
		List<TempDangerousGoodsItems> models) {
		List<TempDangerousGoodsItemsSoap> soapModels = new ArrayList<TempDangerousGoodsItemsSoap>(models.size());

		for (TempDangerousGoodsItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempDangerousGoodsItemsSoap[soapModels.size()]);
	}

	public TempDangerousGoodsItemsSoap() {
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