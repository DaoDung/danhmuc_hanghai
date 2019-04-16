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

import vn.gt.dao.noticeandmessage.service.IssueAcceptanceForTransitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class IssueAcceptanceForTransitClp extends BaseModelImpl<IssueAcceptanceForTransit>
	implements IssueAcceptanceForTransit {
	public IssueAcceptanceForTransitClp() {
	}

	public Class<?> getModelClass() {
		return IssueAcceptanceForTransit.class;
	}

	public String getModelClassName() {
		return IssueAcceptanceForTransit.class.getName();
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

	public String getNumberAcceptanceForTransit() {
		return _numberAcceptanceForTransit;
	}

	public void setNumberAcceptanceForTransit(String numberAcceptanceForTransit) {
		_numberAcceptanceForTransit = numberAcceptanceForTransit;
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

	public String getCallSign() {
		return _callSign;
	}

	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public double getLoa() {
		return _loa;
	}

	public void setLoa(double loa) {
		_loa = loa;
	}

	public String getUnitLOA() {
		return _unitLOA;
	}

	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;
	}

	public double getBreadth() {
		return _breadth;
	}

	public void setBreadth(double breadth) {
		_breadth = breadth;
	}

	public String getUnitBreadth() {
		return _unitBreadth;
	}

	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;
	}

	public double getGrossTonnage() {
		return _grossTonnage;
	}

	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;
	}

	public String getGrossTonnageUnit() {
		return _grossTonnageUnit;
	}

	public void setGrossTonnageUnit(String grossTonnageUnit) {
		_grossTonnageUnit = grossTonnageUnit;
	}

	public double getNetTonnage() {
		return _netTonnage;
	}

	public void setNetTonnage(double netTonnage) {
		_netTonnage = netTonnage;
	}

	public String getNetTonnageUnit() {
		return _netTonnageUnit;
	}

	public void setNetTonnageUnit(String netTonnageUnit) {
		_netTonnageUnit = netTonnageUnit;
	}

	public double getDwt() {
		return _dwt;
	}

	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	public String getUnitDWT() {
		return _unitDWT;
	}

	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;
	}

	public double getShownDraftxF() {
		return _shownDraftxF;
	}

	public void setShownDraftxF(double shownDraftxF) {
		_shownDraftxF = shownDraftxF;
	}

	public String getUnitShownDraftxF() {
		return _unitShownDraftxF;
	}

	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;
	}

	public double getShownDraftxA() {
		return _shownDraftxA;
	}

	public void setShownDraftxA(double shownDraftxA) {
		_shownDraftxA = shownDraftxA;
	}

	public String getUnitShownDraftxA() {
		return _unitShownDraftxA;
	}

	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;
	}

	public double getClearanceHeight() {
		return _clearanceHeight;
	}

	public void setClearanceHeight(double clearanceHeight) {
		_clearanceHeight = clearanceHeight;
	}

	public String getUnitClearanceHeight() {
		return _unitClearanceHeight;
	}

	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;
	}

	public Date getPermittedTransitFrom() {
		return _permittedTransitFrom;
	}

	public void setPermittedTransitFrom(Date permittedTransitFrom) {
		_permittedTransitFrom = permittedTransitFrom;
	}

	public Date getPermittedTransitTo() {
		return _permittedTransitTo;
	}

	public void setPermittedTransitTo(Date permittedTransitTo) {
		_permittedTransitTo = permittedTransitTo;
	}

	public Date getTimeOfDeparture() {
		return _timeOfDeparture;
	}

	public void setTimeOfDeparture(Date timeOfDeparture) {
		_timeOfDeparture = timeOfDeparture;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueAcceptanceForTransitLocalServiceUtil.addIssueAcceptanceForTransit(this);
		}
		else {
			IssueAcceptanceForTransitLocalServiceUtil.updateIssueAcceptanceForTransit(this);
		}
	}

	@Override
	public IssueAcceptanceForTransit toEscapedModel() {
		return (IssueAcceptanceForTransit)Proxy.newProxyInstance(IssueAcceptanceForTransit.class.getClassLoader(),
			new Class[] { IssueAcceptanceForTransit.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueAcceptanceForTransitClp clone = new IssueAcceptanceForTransitClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberAcceptanceForTransit(getNumberAcceptanceForTransit());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setCallSign(getCallSign());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setLoa(getLoa());
		clone.setUnitLOA(getUnitLOA());
		clone.setBreadth(getBreadth());
		clone.setUnitBreadth(getUnitBreadth());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setGrossTonnageUnit(getGrossTonnageUnit());
		clone.setNetTonnage(getNetTonnage());
		clone.setNetTonnageUnit(getNetTonnageUnit());
		clone.setDwt(getDwt());
		clone.setUnitDWT(getUnitDWT());
		clone.setShownDraftxF(getShownDraftxF());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setShownDraftxA(getShownDraftxA());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setClearanceHeight(getClearanceHeight());
		clone.setUnitClearanceHeight(getUnitClearanceHeight());
		clone.setPermittedTransitFrom(getPermittedTransitFrom());
		clone.setPermittedTransitTo(getPermittedTransitTo());
		clone.setTimeOfDeparture(getTimeOfDeparture());

		return clone;
	}

	public int compareTo(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		int value = 0;

		if (getId() < issueAcceptanceForTransit.getId()) {
			value = -1;
		}
		else if (getId() > issueAcceptanceForTransit.getId()) {
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

		IssueAcceptanceForTransitClp issueAcceptanceForTransit = null;

		try {
			issueAcceptanceForTransit = (IssueAcceptanceForTransitClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = issueAcceptanceForTransit.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberAcceptanceForTransit=");
		sb.append(getNumberAcceptanceForTransit());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", loa=");
		sb.append(getLoa());
		sb.append(", unitLOA=");
		sb.append(getUnitLOA());
		sb.append(", breadth=");
		sb.append(getBreadth());
		sb.append(", unitBreadth=");
		sb.append(getUnitBreadth());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", grossTonnageUnit=");
		sb.append(getGrossTonnageUnit());
		sb.append(", netTonnage=");
		sb.append(getNetTonnage());
		sb.append(", netTonnageUnit=");
		sb.append(getNetTonnageUnit());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", shownDraftxF=");
		sb.append(getShownDraftxF());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", shownDraftxA=");
		sb.append(getShownDraftxA());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", clearanceHeight=");
		sb.append(getClearanceHeight());
		sb.append(", unitClearanceHeight=");
		sb.append(getUnitClearanceHeight());
		sb.append(", permittedTransitFrom=");
		sb.append(getPermittedTransitFrom());
		sb.append(", permittedTransitTo=");
		sb.append(getPermittedTransitTo());
		sb.append(", timeOfDeparture=");
		sb.append(getTimeOfDeparture());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.IssueAcceptanceForTransit");
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
			"<column><column-name>numberAcceptanceForTransit</column-name><column-value><![CDATA[");
		sb.append(getNumberAcceptanceForTransit());
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
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loa</column-name><column-value><![CDATA[");
		sb.append(getLoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLOA</column-name><column-value><![CDATA[");
		sb.append(getUnitLOA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>breadth</column-name><column-value><![CDATA[");
		sb.append(getBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitBreadth</column-name><column-value><![CDATA[");
		sb.append(getUnitBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnage</column-name><column-value><![CDATA[");
		sb.append(getNetTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getNetTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitClearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getUnitClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permittedTransitFrom</column-name><column-value><![CDATA[");
		sb.append(getPermittedTransitFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permittedTransitTo</column-name><column-value><![CDATA[");
		sb.append(getPermittedTransitTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeOfDeparture());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _numberAcceptanceForTransit;
	private long _documentName;
	private int _documentYear;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _callSign;
	private String _nameOfMaster;
	private double _loa;
	private String _unitLOA;
	private double _breadth;
	private String _unitBreadth;
	private double _grossTonnage;
	private String _grossTonnageUnit;
	private double _netTonnage;
	private String _netTonnageUnit;
	private double _dwt;
	private String _unitDWT;
	private double _shownDraftxF;
	private String _unitShownDraftxF;
	private double _shownDraftxA;
	private String _unitShownDraftxA;
	private double _clearanceHeight;
	private String _unitClearanceHeight;
	private Date _permittedTransitFrom;
	private Date _permittedTransitTo;
	private Date _timeOfDeparture;
}