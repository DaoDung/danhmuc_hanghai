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
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.TempCrewEffectsItemsServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.TempCrewEffectsItemsServiceSoap
 * @generated
 */
public class TempCrewEffectsItemsSoap implements Serializable {
	public static TempCrewEffectsItemsSoap toSoapModel(
		TempCrewEffectsItems model) {
		TempCrewEffectsItemsSoap soapModel = new TempCrewEffectsItemsSoap();

		soapModel.setId(model.getId());
		soapModel.setRequestCode(model.getRequestCode());
		soapModel.setCrewEffectItemcode(model.getCrewEffectItemcode());
		soapModel.setFamilyName(model.getFamilyName());
		soapModel.setGivenName(model.getGivenName());
		soapModel.setRankOrratingCode(model.getRankOrratingCode());
		soapModel.setEffectsIneligibleForRelief(model.getEffectsIneligibleForRelief());

		return soapModel;
	}

	public static TempCrewEffectsItemsSoap[] toSoapModels(
		TempCrewEffectsItems[] models) {
		TempCrewEffectsItemsSoap[] soapModels = new TempCrewEffectsItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TempCrewEffectsItemsSoap[][] toSoapModels(
		TempCrewEffectsItems[][] models) {
		TempCrewEffectsItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TempCrewEffectsItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TempCrewEffectsItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TempCrewEffectsItemsSoap[] toSoapModels(
		List<TempCrewEffectsItems> models) {
		List<TempCrewEffectsItemsSoap> soapModels = new ArrayList<TempCrewEffectsItemsSoap>(models.size());

		for (TempCrewEffectsItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TempCrewEffectsItemsSoap[soapModels.size()]);
	}

	public TempCrewEffectsItemsSoap() {
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

	public String getCrewEffectItemcode() {
		return _crewEffectItemcode;
	}

	public void setCrewEffectItemcode(String crewEffectItemcode) {
		_crewEffectItemcode = crewEffectItemcode;
	}

	public String getFamilyName() {
		return _familyName;
	}

	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	public String getGivenName() {
		return _givenName;
	}

	public void setGivenName(String givenName) {
		_givenName = givenName;
	}

	public String getRankOrratingCode() {
		return _rankOrratingCode;
	}

	public void setRankOrratingCode(String rankOrratingCode) {
		_rankOrratingCode = rankOrratingCode;
	}

	public String getEffectsIneligibleForRelief() {
		return _effectsIneligibleForRelief;
	}

	public void setEffectsIneligibleForRelief(String effectsIneligibleForRelief) {
		_effectsIneligibleForRelief = effectsIneligibleForRelief;
	}

	private long _id;
	private String _requestCode;
	private String _crewEffectItemcode;
	private String _familyName;
	private String _givenName;
	private String _rankOrratingCode;
	private String _effectsIneligibleForRelief;
}