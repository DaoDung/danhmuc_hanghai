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

import vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class TempDangerousGoodsNanifestClp extends BaseModelImpl<TempDangerousGoodsNanifest>
	implements TempDangerousGoodsNanifest {
	public TempDangerousGoodsNanifestClp() {
	}

	public Class<?> getModelClass() {
		return TempDangerousGoodsNanifest.class;
	}

	public String getModelClassName() {
		return TempDangerousGoodsNanifest.class.getName();
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

	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDangerousGoodsNanifestLocalServiceUtil.addTempDangerousGoodsNanifest(this);
		}
		else {
			TempDangerousGoodsNanifestLocalServiceUtil.updateTempDangerousGoodsNanifest(this);
		}
	}

	@Override
	public TempDangerousGoodsNanifest toEscapedModel() {
		return (TempDangerousGoodsNanifest)Proxy.newProxyInstance(TempDangerousGoodsNanifest.class.getClassLoader(),
			new Class[] { TempDangerousGoodsNanifest.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDangerousGoodsNanifestClp clone = new TempDangerousGoodsNanifestClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setMasterName(getMasterName());
		clone.setImoNumber(getImoNumber());
		clone.setCallsign(getCallsign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setPortOfLoadingCode(getPortOfLoadingCode());
		clone.setPortOfDischargeCode(getPortOfDischargeCode());
		clone.setShippingAgent(getShippingAgent());
		clone.setAdditionalRemark(getAdditionalRemark());
		clone.setListDangerousGoods(getListDangerousGoods());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());
		clone.setDocumentYear(getDocumentYear());

		return clone;
	}

	public int compareTo(TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		int value = 0;

		if (getId() < tempDangerousGoodsNanifest.getId()) {
			value = -1;
		}
		else if (getId() > tempDangerousGoodsNanifest.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		TempDangerousGoodsNanifestClp tempDangerousGoodsNanifest = null;

		try {
			tempDangerousGoodsNanifest = (TempDangerousGoodsNanifestClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tempDangerousGoodsNanifest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", masterName=");
		sb.append(getMasterName());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callsign=");
		sb.append(getCallsign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", portOfLoadingCode=");
		sb.append(getPortOfLoadingCode());
		sb.append(", portOfDischargeCode=");
		sb.append(getPortOfDischargeCode());
		sb.append(", shippingAgent=");
		sb.append(getShippingAgent());
		sb.append(", additionalRemark=");
		sb.append(getAdditionalRemark());
		sb.append(", listDangerousGoods=");
		sb.append(getListDangerousGoods());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
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
			"<column><column-name>masterName</column-name><column-value><![CDATA[");
		sb.append(getMasterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callsign</column-name><column-value><![CDATA[");
		sb.append(getCallsign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfLoadingCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfLoadingCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfDischargeCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfDischargeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingAgent</column-name><column-value><![CDATA[");
		sb.append(getShippingAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalRemark</column-name><column-value><![CDATA[");
		sb.append(getAdditionalRemark());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listDangerousGoods</column-name><column-value><![CDATA[");
		sb.append(getListDangerousGoods());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSigned</column-name><column-value><![CDATA[");
		sb.append(getMasterSigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSignedImage</column-name><column-value><![CDATA[");
		sb.append(getMasterSignedImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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