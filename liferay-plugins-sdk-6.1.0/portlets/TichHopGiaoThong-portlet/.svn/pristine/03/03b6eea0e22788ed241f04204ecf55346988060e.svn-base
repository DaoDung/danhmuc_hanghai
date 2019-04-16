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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempHealthCrewPassengerListServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempHealthCrewPassengerListServiceSoap
 * @generated
 */
public class TempHealthCrewPassengerListSoap implements Serializable {
	public static TempHealthCrewPassengerListSoap toSoapModel(
		TempHealthCrewPassengerList model) {
		TempHealthCrewPassengerListSoap soapModel = new TempHealthCrewPassengerListSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setHealthCrewPassengerCode(model.getHealthCrewPassengerCode());
		soapModel.setPassengerOrCrewCode(model.getPassengerOrCrewCode());
		soapModel.setPassengerOrCrewName(model.getPassengerOrCrewName());
		soapModel.setClassOrRating(model.getClassOrRating());
		soapModel.setStateVisitedCode(model.getStateVisitedCode());
		soapModel.setPortVisitedCode(model.getPortVisitedCode());
		soapModel.setFromDate(model.getFromDate());
		soapModel.setToDate(model.getToDate());

		return soapModel;
	}

	public static TempHealthCrewPassengerListSoap[] toSoapModels(
		TempHealthCrewPassengerList[] models) {
		TempHealthCrewPassengerListSoap[] soapModels = new TempHealthCrewPassengerListSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempHealthCrewPassengerListSoap[][] toSoapModels(
		TempHealthCrewPassengerList[][] models) {
		TempHealthCrewPassengerListSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempHealthCrewPassengerListSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempHealthCrewPassengerListSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempHealthCrewPassengerListSoap[] toSoapModels(
		List<TempHealthCrewPassengerList> models) {
		List<TempHealthCrewPassengerListSoap> soapModels = new ArrayList<TempHealthCrewPassengerListSoap>(models.size());

		for (TempHealthCrewPassengerList model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempHealthCrewPassengerListSoap[soapModels.size()]);
	}

	public TempHealthCrewPassengerListSoap() {
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

	public String getHealthCrewPassengerCode() {
		return _healthCrewPassengerCode;
	}

	public void setHealthCrewPassengerCode(String healthCrewPassengerCode) {
		_healthCrewPassengerCode = healthCrewPassengerCode;
	}

	public String getPassengerOrCrewCode() {
		return _passengerOrCrewCode;
	}

	public void setPassengerOrCrewCode(String passengerOrCrewCode) {
		_passengerOrCrewCode = passengerOrCrewCode;
	}

	public String getPassengerOrCrewName() {
		return _passengerOrCrewName;
	}

	public void setPassengerOrCrewName(String passengerOrCrewName) {
		_passengerOrCrewName = passengerOrCrewName;
	}

	public int getClassOrRating() {
		return _classOrRating;
	}

	public void setClassOrRating(int classOrRating) {
		_classOrRating = classOrRating;
	}

	public String getStateVisitedCode() {
		return _stateVisitedCode;
	}

	public void setStateVisitedCode(String stateVisitedCode) {
		_stateVisitedCode = stateVisitedCode;
	}

	public String getPortVisitedCode() {
		return _portVisitedCode;
	}

	public void setPortVisitedCode(String portVisitedCode) {
		_portVisitedCode = portVisitedCode;
	}

	public Date getFromDate() {
		return _fromDate;
	}

	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	public Date getToDate() {
		return _toDate;
	}

	public void setToDate(Date toDate) {
		_toDate = toDate;
	}

	private long _id;
	private String _requestCode;
	private String _healthCrewPassengerCode;
	private String _passengerOrCrewCode;
	private String _passengerOrCrewName;
	private int _classOrRating;
	private String _stateVisitedCode;
	private String _portVisitedCode;
	private Date _fromDate;
	private Date _toDate;
}