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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempShipSecurityPortItemsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempShipSecurityPortItemsServiceSoap
 * @generated
 */
public class TempShipSecurityPortItemsSoap implements Serializable {
	public static TempShipSecurityPortItemsSoap toSoapModel(
		TempShipSecurityPortItems model) {
		TempShipSecurityPortItemsSoap soapModel = new TempShipSecurityPortItemsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setShipSecurityPortItemCode(model.getShipSecurityPortItemCode());
		soapModel.setPortCode(model.getPortCode());
		soapModel.setDateArrival(model.getDateArrival());
		soapModel.setDateDeparture(model.getDateDeparture());
		soapModel.setSecurityLevelCode(model.getSecurityLevelCode());

		return soapModel;
	}

	public static TempShipSecurityPortItemsSoap[] toSoapModels(
		TempShipSecurityPortItems[] models) {
		TempShipSecurityPortItemsSoap[] soapModels = new TempShipSecurityPortItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempShipSecurityPortItemsSoap[][] toSoapModels(
		TempShipSecurityPortItems[][] models) {
		TempShipSecurityPortItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempShipSecurityPortItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempShipSecurityPortItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempShipSecurityPortItemsSoap[] toSoapModels(
		List<TempShipSecurityPortItems> models) {
		List<TempShipSecurityPortItemsSoap> soapModels = new ArrayList<TempShipSecurityPortItemsSoap>(models.size());

		for (TempShipSecurityPortItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempShipSecurityPortItemsSoap[soapModels.size()]);
	}

	public TempShipSecurityPortItemsSoap() {
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

	public String getShipSecurityPortItemCode() {
		return _shipSecurityPortItemCode;
	}

	public void setShipSecurityPortItemCode(String shipSecurityPortItemCode) {
		_shipSecurityPortItemCode = shipSecurityPortItemCode;
	}

	public String getPortCode() {
		return _portCode;
	}

	public void setPortCode(String portCode) {
		_portCode = portCode;
	}

	public Date getDateArrival() {
		return _dateArrival;
	}

	public void setDateArrival(Date dateArrival) {
		_dateArrival = dateArrival;
	}

	public Date getDateDeparture() {
		return _dateDeparture;
	}

	public void setDateDeparture(Date dateDeparture) {
		_dateDeparture = dateDeparture;
	}

	public String getSecurityLevelCode() {
		return _securityLevelCode;
	}

	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;
	}

	private long _id;
	private String _requestCode;
	private String _shipSecurityPortItemCode;
	private String _portCode;
	private Date _dateArrival;
	private Date _dateDeparture;
	private String _securityLevelCode;
}