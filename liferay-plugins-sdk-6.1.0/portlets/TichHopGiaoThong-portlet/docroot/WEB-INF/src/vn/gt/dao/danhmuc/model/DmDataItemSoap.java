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

package vn.gt.dao.danhmuc.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    win_64
 * @generated
 */
public class DmDataItemSoap implements Serializable {
	public static DmDataItemSoap toSoapModel(DmDataItem model) {
		DmDataItemSoap soapModel = new DmDataItemSoap();

		soapModel.setId(model.getId());
		soapModel.setDataGroupId(model.getDataGroupId());
		soapModel.setCode0(model.getCode0());
		soapModel.setNode1(model.getNode1());
		soapModel.setNode2(model.getNode2());
		soapModel.setNode3(model.getNode3());
		soapModel.setNode4(model.getNode4());
		soapModel.setLevel(model.getLevel());
		soapModel.setName(model.getName());
		soapModel.setShortName(model.getShortName());
		soapModel.setDescription(model.getDescription());
		soapModel.setValidatedFrom(model.getValidatedFrom());
		soapModel.setValidatedTo(model.getValidatedTo());
		soapModel.setOrder(model.getOrder());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static DmDataItemSoap[] toSoapModels(DmDataItem[] models) {
		DmDataItemSoap[] soapModels = new DmDataItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmDataItemSoap[][] toSoapModels(DmDataItem[][] models) {
		DmDataItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmDataItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmDataItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmDataItemSoap[] toSoapModels(List<DmDataItem> models) {
		List<DmDataItemSoap> soapModels = new ArrayList<DmDataItemSoap>(models.size());

		for (DmDataItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmDataItemSoap[soapModels.size()]);
	}

	public DmDataItemSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public long getDataGroupId() {
		return _DataGroupId;
	}

	public void setDataGroupId(long DataGroupId) {
		_DataGroupId = DataGroupId;
	}

	public String getCode0() {
		return _Code0;
	}

	public void setCode0(String Code0) {
		_Code0 = Code0;
	}

	public String getNode1() {
		return _Node1;
	}

	public void setNode1(String Node1) {
		_Node1 = Node1;
	}

	public String getNode2() {
		return _Node2;
	}

	public void setNode2(String Node2) {
		_Node2 = Node2;
	}

	public String getNode3() {
		return _Node3;
	}

	public void setNode3(String Node3) {
		_Node3 = Node3;
	}

	public String getNode4() {
		return _Node4;
	}

	public void setNode4(String Node4) {
		_Node4 = Node4;
	}

	public int getLevel() {
		return _Level;
	}

	public void setLevel(int Level) {
		_Level = Level;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public String getShortName() {
		return _ShortName;
	}

	public void setShortName(String ShortName) {
		_ShortName = ShortName;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public Date getValidatedFrom() {
		return _ValidatedFrom;
	}

	public void setValidatedFrom(Date ValidatedFrom) {
		_ValidatedFrom = ValidatedFrom;
	}

	public Date getValidatedTo() {
		return _ValidatedTo;
	}

	public void setValidatedTo(Date ValidatedTo) {
		_ValidatedTo = ValidatedTo;
	}

	public int getOrder() {
		return _Order;
	}

	public void setOrder(int Order) {
		_Order = Order;
	}

	public int getStatus() {
		return _Status;
	}

	public void setStatus(int Status) {
		_Status = Status;
	}

	private long _Id;
	private long _DataGroupId;
	private String _Code0;
	private String _Node1;
	private String _Node2;
	private String _Node3;
	private String _Node4;
	private int _Level;
	private String _Name;
	private String _ShortName;
	private String _Description;
	private Date _ValidatedFrom;
	private Date _ValidatedTo;
	private int _Order;
	private int _Status;
}