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

import vn.gt.dao.noticeandmessage.service.TempUnitGeneralLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class TempUnitGeneralClp extends BaseModelImpl<TempUnitGeneral>
	implements TempUnitGeneral {
	public TempUnitGeneralClp() {
	}

	public Class<?> getModelClass() {
		return TempUnitGeneral.class;
	}

	public String getModelClassName() {
		return TempUnitGeneral.class.getName();
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempUnitGeneralLocalServiceUtil.addTempUnitGeneral(this);
		}
		else {
			TempUnitGeneralLocalServiceUtil.updateTempUnitGeneral(this);
		}
	}

	@Override
	public TempUnitGeneral toEscapedModel() {
		return (TempUnitGeneral)Proxy.newProxyInstance(TempUnitGeneral.class.getClassLoader(),
			new Class[] { TempUnitGeneral.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempUnitGeneralClp clone = new TempUnitGeneralClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setGrossTonnageUnit(getGrossTonnageUnit());
		clone.setNetTonnageUnit(getNetTonnageUnit());
		clone.setUnitDWT(getUnitDWT());
		clone.setUnitLOA(getUnitLOA());
		clone.setUnitBreadth(getUnitBreadth());
		clone.setUnitClearanceHeight(getUnitClearanceHeight());
		clone.setUnitShownDraft(getUnitShownDraft());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setUnitHorsePower(getUnitHorsePower());
		clone.setUnitRemainingOnBoardxB(getUnitRemainingOnBoardxB());
		clone.setUnitRemainingOnBoardxS(getUnitRemainingOnBoardxS());
		clone.setUnitFO(getUnitFO());
		clone.setUnitLO(getUnitLO());
		clone.setUnitFW(getUnitFW());
		clone.setUnitDO(getUnitDO());
		clone.setUnitSludgeOil(getUnitSludgeOil());

		return clone;
	}

	public int compareTo(TempUnitGeneral tempUnitGeneral) {
		int value = 0;

		if (getId() < tempUnitGeneral.getId()) {
			value = -1;
		}
		else if (getId() > tempUnitGeneral.getId()) {
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

		TempUnitGeneralClp tempUnitGeneral = null;

		try {
			tempUnitGeneral = (TempUnitGeneralClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempUnitGeneral.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", grossTonnageUnit=");
		sb.append(getGrossTonnageUnit());
		sb.append(", netTonnageUnit=");
		sb.append(getNetTonnageUnit());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", unitLOA=");
		sb.append(getUnitLOA());
		sb.append(", unitBreadth=");
		sb.append(getUnitBreadth());
		sb.append(", unitClearanceHeight=");
		sb.append(getUnitClearanceHeight());
		sb.append(", unitShownDraft=");
		sb.append(getUnitShownDraft());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", unitHorsePower=");
		sb.append(getUnitHorsePower());
		sb.append(", unitRemainingOnBoardxB=");
		sb.append(getUnitRemainingOnBoardxB());
		sb.append(", unitRemainingOnBoardxS=");
		sb.append(getUnitRemainingOnBoardxS());
		sb.append(", unitFO=");
		sb.append(getUnitFO());
		sb.append(", unitLO=");
		sb.append(getUnitLO());
		sb.append(", unitFW=");
		sb.append(getUnitFW());
		sb.append(", unitDO=");
		sb.append(getUnitDO());
		sb.append(", unitSludgeOil=");
		sb.append(getUnitSludgeOil());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempUnitGeneral");
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
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getNetTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLOA</column-name><column-value><![CDATA[");
		sb.append(getUnitLOA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitBreadth</column-name><column-value><![CDATA[");
		sb.append(getUnitBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitClearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getUnitClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraft</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraft());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitHorsePower</column-name><column-value><![CDATA[");
		sb.append(getUnitHorsePower());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitRemainingOnBoardxB</column-name><column-value><![CDATA[");
		sb.append(getUnitRemainingOnBoardxB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitRemainingOnBoardxS</column-name><column-value><![CDATA[");
		sb.append(getUnitRemainingOnBoardxS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitFO</column-name><column-value><![CDATA[");
		sb.append(getUnitFO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLO</column-name><column-value><![CDATA[");
		sb.append(getUnitLO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitFW</column-name><column-value><![CDATA[");
		sb.append(getUnitFW());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDO</column-name><column-value><![CDATA[");
		sb.append(getUnitDO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitSludgeOil</column-name><column-value><![CDATA[");
		sb.append(getUnitSludgeOil());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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