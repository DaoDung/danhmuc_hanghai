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
public class DmRankRatingSoap implements Serializable {
	public static DmRankRatingSoap toSoapModel(DmRankRating model) {
		DmRankRatingSoap soapModel = new DmRankRatingSoap();

		soapModel.setId(model.getId());
		soapModel.setRankCode(model.getRankCode());
		soapModel.setRankName(model.getRankName());
		soapModel.setRankNameVN(model.getRankNameVN());
		soapModel.setRankOrder(model.getRankOrder());
		soapModel.setIsDelete(model.getIsDelete());
		soapModel.setMarkedAsDelete(model.getMarkedAsDelete());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRequestedDate(model.getRequestedDate());
		soapModel.setSyncVersion(model.getSyncVersion());

		return soapModel;
	}

	public static DmRankRatingSoap[] toSoapModels(DmRankRating[] models) {
		DmRankRatingSoap[] soapModels = new DmRankRatingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmRankRatingSoap[][] toSoapModels(DmRankRating[][] models) {
		DmRankRatingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmRankRatingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmRankRatingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmRankRatingSoap[] toSoapModels(List<DmRankRating> models) {
		List<DmRankRatingSoap> soapModels = new ArrayList<DmRankRatingSoap>(models.size());

		for (DmRankRating model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmRankRatingSoap[soapModels.size()]);
	}

	public DmRankRatingSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getRankCode() {
		return _rankCode;
	}

	public void setRankCode(String rankCode) {
		_rankCode = rankCode;
	}

	public String getRankName() {
		return _rankName;
	}

	public void setRankName(String rankName) {
		_rankName = rankName;
	}

	public String getRankNameVN() {
		return _rankNameVN;
	}

	public void setRankNameVN(String rankNameVN) {
		_rankNameVN = rankNameVN;
	}

	public int getRankOrder() {
		return _rankOrder;
	}

	public void setRankOrder(int rankOrder) {
		_rankOrder = rankOrder;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getSyncVersion() {
		return _syncVersion;
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	private int _id;
	private String _rankCode;
	private String _rankName;
	private String _rankNameVN;
	private int _rankOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
}