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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempDangerousGoodsNanifest in entity cache.
 *
 * @author win_64
 * @see TempDangerousGoodsNanifest
 * @generated
 */
public class TempDangerousGoodsNanifestCacheModel implements CacheModel<TempDangerousGoodsNanifest>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", masterName=");
		sb.append(masterName);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callsign=");
		sb.append(callsign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", portOfLoadingCode=");
		sb.append(portOfLoadingCode);
		sb.append(", portOfDischargeCode=");
		sb.append(portOfDischargeCode);
		sb.append(", shippingAgent=");
		sb.append(shippingAgent);
		sb.append(", additionalRemark=");
		sb.append(additionalRemark);
		sb.append(", listDangerousGoods=");
		sb.append(listDangerousGoods);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", masterSigned=");
		sb.append(masterSigned);
		sb.append(", masterSignedImage=");
		sb.append(masterSignedImage);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append("}");

		return sb.toString();
	}

	public TempDangerousGoodsNanifest toEntityModel() {
		TempDangerousGoodsNanifestImpl tempDangerousGoodsNanifestImpl = new TempDangerousGoodsNanifestImpl();

		tempDangerousGoodsNanifestImpl.setId(id);

		if (requestCode == null) {
			tempDangerousGoodsNanifestImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setRequestCode(requestCode);
		}

		tempDangerousGoodsNanifestImpl.setRequestState(requestState);
		tempDangerousGoodsNanifestImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempDangerousGoodsNanifestImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setUserCreated(userCreated);
		}

		if (nameOfShip == null) {
			tempDangerousGoodsNanifestImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			tempDangerousGoodsNanifestImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (masterName == null) {
			tempDangerousGoodsNanifestImpl.setMasterName(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setMasterName(masterName);
		}

		if (imoNumber == null) {
			tempDangerousGoodsNanifestImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setImoNumber(imoNumber);
		}

		if (callsign == null) {
			tempDangerousGoodsNanifestImpl.setCallsign(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setCallsign(callsign);
		}

		if (voyageNumber == null) {
			tempDangerousGoodsNanifestImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setVoyageNumber(voyageNumber);
		}

		if (portOfLoadingCode == null) {
			tempDangerousGoodsNanifestImpl.setPortOfLoadingCode(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setPortOfLoadingCode(portOfLoadingCode);
		}

		if (portOfDischargeCode == null) {
			tempDangerousGoodsNanifestImpl.setPortOfDischargeCode(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setPortOfDischargeCode(portOfDischargeCode);
		}

		if (shippingAgent == null) {
			tempDangerousGoodsNanifestImpl.setShippingAgent(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setShippingAgent(shippingAgent);
		}

		if (additionalRemark == null) {
			tempDangerousGoodsNanifestImpl.setAdditionalRemark(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setAdditionalRemark(additionalRemark);
		}

		tempDangerousGoodsNanifestImpl.setListDangerousGoods(listDangerousGoods);

		if (signPlace == null) {
			tempDangerousGoodsNanifestImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempDangerousGoodsNanifestImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempDangerousGoodsNanifestImpl.setSignDate(null);
		}
		else {
			tempDangerousGoodsNanifestImpl.setSignDate(new Date(signDate));
		}

		tempDangerousGoodsNanifestImpl.setMasterSigned(masterSigned);
		tempDangerousGoodsNanifestImpl.setMasterSignedImage(masterSignedImage);
		tempDangerousGoodsNanifestImpl.setAttachedFile(attachedFile);
		tempDangerousGoodsNanifestImpl.setDocumentYear(documentYear);

		tempDangerousGoodsNanifestImpl.resetOriginalValues();

		return tempDangerousGoodsNanifestImpl;
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public String userCreated;
	public String nameOfShip;
	public String flagStateOfShip;
	public String masterName;
	public String imoNumber;
	public String callsign;
	public String voyageNumber;
	public String portOfLoadingCode;
	public String portOfDischargeCode;
	public String shippingAgent;
	public String additionalRemark;
	public int listDangerousGoods;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
	public int documentYear;
}