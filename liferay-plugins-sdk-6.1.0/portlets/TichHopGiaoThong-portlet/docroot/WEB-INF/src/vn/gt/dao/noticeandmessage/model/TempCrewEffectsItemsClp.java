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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.TempCrewEffectsItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempCrewEffectsItemsClp extends BaseModelImpl<TempCrewEffectsItems>
	implements TempCrewEffectsItems {
	public TempCrewEffectsItemsClp() {
	}

	public Class<?> getModelClass() {
		return TempCrewEffectsItems.class;
	}

	public String getModelClassName() {
		return TempCrewEffectsItems.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCrewEffectsItemsLocalServiceUtil.addTempCrewEffectsItems(this);
		}
		else {
			TempCrewEffectsItemsLocalServiceUtil.updateTempCrewEffectsItems(this);
		}
	}

	@Override
	public TempCrewEffectsItems toEscapedModel() {
		return (TempCrewEffectsItems)Proxy.newProxyInstance(TempCrewEffectsItems.class.getClassLoader(),
			new Class[] { TempCrewEffectsItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCrewEffectsItemsClp clone = new TempCrewEffectsItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setCrewEffectItemcode(getCrewEffectItemcode());
		clone.setFamilyName(getFamilyName());
		clone.setGivenName(getGivenName());
		clone.setRankOrratingCode(getRankOrratingCode());
		clone.setEffectsIneligibleForRelief(getEffectsIneligibleForRelief());

		return clone;
	}

	public int compareTo(TempCrewEffectsItems tempCrewEffectsItems) {
		int value = 0;

		if (getId() < tempCrewEffectsItems.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewEffectsItems.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TempCrewEffectsItemsClp tempCrewEffectsItems = null;

		try {
			tempCrewEffectsItems = (TempCrewEffectsItemsClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempCrewEffectsItems.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", crewEffectItemcode=");
		sb.append(getCrewEffectItemcode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", rankOrratingCode=");
		sb.append(getRankOrratingCode());
		sb.append(", effectsIneligibleForRelief=");
		sb.append(getEffectsIneligibleForRelief());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewEffectItemcode</column-name><column-value><![CDATA[");
		sb.append(getCrewEffectItemcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankOrratingCode</column-name><column-value><![CDATA[");
		sb.append(getRankOrratingCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectsIneligibleForRelief</column-name><column-value><![CDATA[");
		sb.append(getEffectsIneligibleForRelief());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _crewEffectItemcode;
	private String _familyName;
	private String _givenName;
	private String _rankOrratingCode;
	private String _effectsIneligibleForRelief;
}