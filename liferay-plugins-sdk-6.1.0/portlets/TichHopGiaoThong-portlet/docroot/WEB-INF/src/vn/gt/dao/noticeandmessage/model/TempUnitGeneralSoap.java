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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempUnitGeneralServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempUnitGeneralServiceSoap
 * @generated
 */
public class TempUnitGeneralSoap implements Serializable {
	public static TempUnitGeneralSoap toSoapModel(TempUnitGeneral model) {
		TempUnitGeneralSoap soapModel = new TempUnitGeneralSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setGrossTonnageUnit(model.getGrossTonnageUnit());
		soapModel.setNetTonnageUnit(model.getNetTonnageUnit());
		soapModel.setUnitDWT(model.getUnitDWT());
		soapModel.setUnitLOA(model.getUnitLOA());
		soapModel.setUnitBreadth(model.getUnitBreadth());
		soapModel.setUnitClearanceHeight(model.getUnitClearanceHeight());
		soapModel.setUnitShownDraft(model.getUnitShownDraft());
		soapModel.setUnitShownDraftxF(model.getUnitShownDraftxF());
		soapModel.setUnitShownDraftxA(model.getUnitShownDraftxA());
		soapModel.setUnitHorsePower(model.getUnitHorsePower());
		soapModel.setUnitRemainingOnBoardxB(model.getUnitRemainingOnBoardxB());
		soapModel.setUnitRemainingOnBoardxS(model.getUnitRemainingOnBoardxS());
		soapModel.setUnitFO(model.getUnitFO());
		soapModel.setUnitLO(model.getUnitLO());
		soapModel.setUnitFW(model.getUnitFW());
		soapModel.setUnitDO(model.getUnitDO());
		soapModel.setUnitSludgeOil(model.getUnitSludgeOil());

		return soapModel;
	}

	public static TempUnitGeneralSoap[] toSoapModels(TempUnitGeneral[] models) {
		TempUnitGeneralSoap[] soapModels = new TempUnitGeneralSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempUnitGeneralSoap[][] toSoapModels(
		TempUnitGeneral[][] models) {
		TempUnitGeneralSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempUnitGeneralSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempUnitGeneralSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempUnitGeneralSoap[] toSoapModels(
		List<TempUnitGeneral> models) {
		List<TempUnitGeneralSoap> soapModels = new ArrayList<TempUnitGeneralSoap>(models.size());

		for (TempUnitGeneral model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempUnitGeneralSoap[soapModels.size()]);
	}

	public TempUnitGeneralSoap() {
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

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getGrossTonnageUnit() {
		return _grossTonnageUnit;
	}

	public void setGrossTonnageUnit(String grossTonnageUnit) {
		_grossTonnageUnit = grossTonnageUnit;
	}

	public String getNetTonnageUnit() {
		return _netTonnageUnit;
	}

	public void setNetTonnageUnit(String netTonnageUnit) {
		_netTonnageUnit = netTonnageUnit;
	}

	public String getUnitDWT() {
		return _unitDWT;
	}

	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;
	}

	public String getUnitLOA() {
		return _unitLOA;
	}

	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;
	}

	public String getUnitBreadth() {
		return _unitBreadth;
	}

	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;
	}

	public String getUnitClearanceHeight() {
		return _unitClearanceHeight;
	}

	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;
	}

	public String getUnitShownDraft() {
		return _unitShownDraft;
	}

	public void setUnitShownDraft(String unitShownDraft) {
		_unitShownDraft = unitShownDraft;
	}

	public String getUnitShownDraftxF() {
		return _unitShownDraftxF;
	}

	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;
	}

	public String getUnitShownDraftxA() {
		return _unitShownDraftxA;
	}

	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;
	}

	public String getUnitHorsePower() {
		return _unitHorsePower;
	}

	public void setUnitHorsePower(String unitHorsePower) {
		_unitHorsePower = unitHorsePower;
	}

	public String getUnitRemainingOnBoardxB() {
		return _unitRemainingOnBoardxB;
	}

	public void setUnitRemainingOnBoardxB(String unitRemainingOnBoardxB) {
		_unitRemainingOnBoardxB = unitRemainingOnBoardxB;
	}

	public String getUnitRemainingOnBoardxS() {
		return _unitRemainingOnBoardxS;
	}

	public void setUnitRemainingOnBoardxS(String unitRemainingOnBoardxS) {
		_unitRemainingOnBoardxS = unitRemainingOnBoardxS;
	}

	public String getUnitFO() {
		return _unitFO;
	}

	public void setUnitFO(String unitFO) {
		_unitFO = unitFO;
	}

	public String getUnitLO() {
		return _unitLO;
	}

	public void setUnitLO(String unitLO) {
		_unitLO = unitLO;
	}

	public String getUnitFW() {
		return _unitFW;
	}

	public void setUnitFW(String unitFW) {
		_unitFW = unitFW;
	}

	public String getUnitDO() {
		return _unitDO;
	}

	public void setUnitDO(String unitDO) {
		_unitDO = unitDO;
	}

	public String getUnitSludgeOil() {
		return _unitSludgeOil;
	}

	public void setUnitSludgeOil(String unitSludgeOil) {
		_unitSludgeOil = unitSludgeOil;
	}

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
	private String _grossTonnageUnit;
	private String _netTonnageUnit;
	private String _unitDWT;
	private String _unitLOA;
	private String _unitBreadth;
	private String _unitClearanceHeight;
	private String _unitShownDraft;
	private String _unitShownDraftxF;
	private String _unitShownDraftxA;
	private String _unitHorsePower;
	private String _unitRemainingOnBoardxB;
	private String _unitRemainingOnBoardxS;
	private String _unitFO;
	private String _unitLO;
	private String _unitFW;
	private String _unitDO;
	private String _unitSludgeOil;
}