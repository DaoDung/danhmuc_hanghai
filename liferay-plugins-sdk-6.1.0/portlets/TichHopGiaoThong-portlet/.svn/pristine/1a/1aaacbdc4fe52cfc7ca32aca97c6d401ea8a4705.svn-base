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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempShipStoresItemsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempShipStoresItemsServiceSoap
 * @generated
 */
public class TempShipStoresItemsSoap implements Serializable {
	public static TempShipStoresItemsSoap toSoapModel(TempShipStoresItems model) {
		TempShipStoresItemsSoap soapModel = new TempShipStoresItemsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setShipsstoreItemCode(model.getShipsstoreItemCode());
		soapModel.setNameOfArticle(model.getNameOfArticle());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setQuantityUnit(model.getQuantityUnit());
		soapModel.setLocationOnBoat(model.getLocationOnBoat());
		soapModel.setUseInBoat(model.getUseInBoat());

		return soapModel;
	}

	public static TempShipStoresItemsSoap[] toSoapModels(
		TempShipStoresItems[] models) {
		TempShipStoresItemsSoap[] soapModels = new TempShipStoresItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempShipStoresItemsSoap[][] toSoapModels(
		TempShipStoresItems[][] models) {
		TempShipStoresItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempShipStoresItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempShipStoresItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempShipStoresItemsSoap[] toSoapModels(
		List<TempShipStoresItems> models) {
		List<TempShipStoresItemsSoap> soapModels = new ArrayList<TempShipStoresItemsSoap>(models.size());

		for (TempShipStoresItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempShipStoresItemsSoap[soapModels.size()]);
	}

	public TempShipStoresItemsSoap() {
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

	private long _id;
	private String _requestCode;
	private String _shipsstoreItemCode;
	private String _nameOfArticle;
	private String _quantity;
	private String _quantityUnit;
	private String _locationOnBoat;
	private int _useInBoat;
}