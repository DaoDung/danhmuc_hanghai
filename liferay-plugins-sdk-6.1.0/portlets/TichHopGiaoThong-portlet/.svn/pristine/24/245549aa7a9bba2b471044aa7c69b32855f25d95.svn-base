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

import vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    win_64
 * @generated
 */
public class IssueShiftingOrderChanelSoap implements Serializable {
	public static IssueShiftingOrderChanelSoap toSoapModel(
		IssueShiftingOrderChanel model) {
		IssueShiftingOrderChanelSoap soapModel = new IssueShiftingOrderChanelSoap();

		soapModel.setShiftingOrderId(model.getShiftingOrderId());
		soapModel.setChanelCode(model.getChanelCode());
		soapModel.setChanelName(model.getChanelName());
		soapModel.setOrder(model.getOrder());

		return soapModel;
	}

	public static IssueShiftingOrderChanelSoap[] toSoapModels(
		IssueShiftingOrderChanel[] models) {
		IssueShiftingOrderChanelSoap[] soapModels = new IssueShiftingOrderChanelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueShiftingOrderChanelSoap[][] toSoapModels(
		IssueShiftingOrderChanel[][] models) {
		IssueShiftingOrderChanelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueShiftingOrderChanelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueShiftingOrderChanelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueShiftingOrderChanelSoap[] toSoapModels(
		List<IssueShiftingOrderChanel> models) {
		List<IssueShiftingOrderChanelSoap> soapModels = new ArrayList<IssueShiftingOrderChanelSoap>(models.size());

		for (IssueShiftingOrderChanel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueShiftingOrderChanelSoap[soapModels.size()]);
	}

	public IssueShiftingOrderChanelSoap() {
	}

	public IssueShiftingOrderChanelPK getPrimaryKey() {
		return new IssueShiftingOrderChanelPK(_shiftingOrderId, _chanelCode);
	}

	public void setPrimaryKey(IssueShiftingOrderChanelPK pk) {
		setShiftingOrderId(pk.shiftingOrderId);
		setChanelCode(pk.chanelCode);
	}

	public long getShiftingOrderId() {
		return _shiftingOrderId;
	}

	public void setShiftingOrderId(long shiftingOrderId) {
		_shiftingOrderId = shiftingOrderId;
	}

	public String getChanelCode() {
		return _chanelCode;
	}

	public void setChanelCode(String chanelCode) {
		_chanelCode = chanelCode;
	}

	public String getChanelName() {
		return _chanelName;
	}

	public void setChanelName(String chanelName) {
		_chanelName = chanelName;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	private long _shiftingOrderId;
	private String _chanelCode;
	private String _chanelName;
	private int _order;
}