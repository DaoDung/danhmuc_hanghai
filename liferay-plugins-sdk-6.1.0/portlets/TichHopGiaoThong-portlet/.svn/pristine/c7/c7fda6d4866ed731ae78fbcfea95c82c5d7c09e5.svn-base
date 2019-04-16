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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempDangerousGoodsNanifestServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempDangerousGoodsNanifestServiceSoap
 * @generated
 */
public class TempDangerousGoodsNanifestSoap implements Serializable {
	public static TempDangerousGoodsNanifestSoap toSoapModel(
		TempDangerousGoodsNanifest model) {
		TempDangerousGoodsNanifestSoap soapModel = new TempDangerousGoodsNanifestSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setRequestState(model.getRequestState());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setUserCreated(model.getUserCreated());
		soapModel.setNameOfShip(model.getNameOfShip());
		soapModel.setFlagStateOfShip(model.getFlagStateOfShip());
		soapModel.setMasterName(model.getMasterName());
		soapModel.setImoNumber(model.getImoNumber());
		soapModel.setCallsign(model.getCallsign());
		soapModel.setVoyageNumber(model.getVoyageNumber());
		soapModel.setPortOfLoadingCode(model.getPortOfLoadingCode());
		soapModel.setPortOfDischargeCode(model.getPortOfDischargeCode());
		soapModel.setShippingAgent(model.getShippingAgent());
		soapModel.setAdditionalRemark(model.getAdditionalRemark());
		soapModel.setListDangerousGoods(model.getListDangerousGoods());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setMasterSigned(model.getMasterSigned());
		soapModel.setMasterSignedImage(model.getMasterSignedImage());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setDocumentYear(model.getDocumentYear());

		return soapModel;
	}

	public static TempDangerousGoodsNanifestSoap[] toSoapModels(
		TempDangerousGoodsNanifest[] models) {
		TempDangerousGoodsNanifestSoap[] soapModels = new TempDangerousGoodsNanifestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempDangerousGoodsNanifestSoap[][] toSoapModels(
		TempDangerousGoodsNanifest[][] models) {
		TempDangerousGoodsNanifestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempDangerousGoodsNanifestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempDangerousGoodsNanifestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempDangerousGoodsNanifestSoap[] toSoapModels(
		List<TempDangerousGoodsNanifest> models) {
		List<TempDangerousGoodsNanifestSoap> soapModels = new ArrayList<TempDangerousGoodsNanifestSoap>(models.size());

		for (TempDangerousGoodsNanifest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempDangerousGoodsNanifestSoap[soapModels.size()]);
	}

	public TempDangerousGoodsNanifestSoap() {
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

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public String getUserCreated() {
		return _userCreated;
	}

	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public String getMasterName() {
		return _masterName;
	}

	public void setMasterName(String masterName) {
		_masterName = masterName;
	}

	public String getImoNumber() {
		return _imoNumber;
	}

	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	public String getCallsign() {
		return _callsign;
	}

	public void setCallsign(String callsign) {
		_callsign = callsign;
	}

	public String getVoyageNumber() {
		return _voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	public String getPortOfLoadingCode() {
		return _portOfLoadingCode;
	}

	public void setPortOfLoadingCode(String portOfLoadingCode) {
		_portOfLoadingCode = portOfLoadingCode;
	}

	public String getPortOfDischargeCode() {
		return _portOfDischargeCode;
	}

	public void setPortOfDischargeCode(String portOfDischargeCode) {
		_portOfDischargeCode = portOfDischargeCode;
	}

	public String getShippingAgent() {
		return _shippingAgent;
	}

	public void setShippingAgent(String shippingAgent) {
		_shippingAgent = shippingAgent;
	}

	public String getAdditionalRemark() {
		return _additionalRemark;
	}

	public void setAdditionalRemark(String additionalRemark) {
		_additionalRemark = additionalRemark;
	}

	public int getListDangerousGoods() {
		return _listDangerousGoods;
	}

	public void setListDangerousGoods(int listDangerousGoods) {
		_listDangerousGoods = listDangerousGoods;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public int getMasterSigned() {
		return _masterSigned;
	}

	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;
	}

	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private String _userCreated;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _masterName;
	private String _imoNumber;
	private String _callsign;
	private String _voyageNumber;
	private String _portOfLoadingCode;
	private String _portOfDischargeCode;
	private String _shippingAgent;
	private String _additionalRemark;
	private int _listDangerousGoods;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private int _documentYear;
}