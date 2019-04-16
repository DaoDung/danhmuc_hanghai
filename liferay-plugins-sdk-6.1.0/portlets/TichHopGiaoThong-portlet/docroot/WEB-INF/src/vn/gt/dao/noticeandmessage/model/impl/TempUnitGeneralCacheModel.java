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

import vn.gt.dao.noticeandmessage.model.TempUnitGeneral;

import java.io.Serializable;

/**
 * The cache model class for representing TempUnitGeneral in entity cache.
 *
 * @author win_64
 * @see TempUnitGeneral
 * @generated
 */
public class TempUnitGeneralCacheModel implements CacheModel<TempUnitGeneral>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", grossTonnageUnit=");
		sb.append(grossTonnageUnit);
		sb.append(", netTonnageUnit=");
		sb.append(netTonnageUnit);
		sb.append(", unitDWT=");
		sb.append(unitDWT);
		sb.append(", unitLOA=");
		sb.append(unitLOA);
		sb.append(", unitBreadth=");
		sb.append(unitBreadth);
		sb.append(", unitClearanceHeight=");
		sb.append(unitClearanceHeight);
		sb.append(", unitShownDraft=");
		sb.append(unitShownDraft);
		sb.append(", unitShownDraftxF=");
		sb.append(unitShownDraftxF);
		sb.append(", unitShownDraftxA=");
		sb.append(unitShownDraftxA);
		sb.append(", unitHorsePower=");
		sb.append(unitHorsePower);
		sb.append(", unitRemainingOnBoardxB=");
		sb.append(unitRemainingOnBoardxB);
		sb.append(", unitRemainingOnBoardxS=");
		sb.append(unitRemainingOnBoardxS);
		sb.append(", unitFO=");
		sb.append(unitFO);
		sb.append(", unitLO=");
		sb.append(unitLO);
		sb.append(", unitFW=");
		sb.append(unitFW);
		sb.append(", unitDO=");
		sb.append(unitDO);
		sb.append(", unitSludgeOil=");
		sb.append(unitSludgeOil);
		sb.append("}");

		return sb.toString();
	}

	public TempUnitGeneral toEntityModel() {
		TempUnitGeneralImpl tempUnitGeneralImpl = new TempUnitGeneralImpl();

		tempUnitGeneralImpl.setId(id);

		if (requestCode == null) {
			tempUnitGeneralImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setRequestCode(requestCode);
		}

		tempUnitGeneralImpl.setDocumentName(documentName);
		tempUnitGeneralImpl.setDocumentYear(documentYear);

		if (grossTonnageUnit == null) {
			tempUnitGeneralImpl.setGrossTonnageUnit(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setGrossTonnageUnit(grossTonnageUnit);
		}

		if (netTonnageUnit == null) {
			tempUnitGeneralImpl.setNetTonnageUnit(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setNetTonnageUnit(netTonnageUnit);
		}

		if (unitDWT == null) {
			tempUnitGeneralImpl.setUnitDWT(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitDWT(unitDWT);
		}

		if (unitLOA == null) {
			tempUnitGeneralImpl.setUnitLOA(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitLOA(unitLOA);
		}

		if (unitBreadth == null) {
			tempUnitGeneralImpl.setUnitBreadth(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitBreadth(unitBreadth);
		}

		if (unitClearanceHeight == null) {
			tempUnitGeneralImpl.setUnitClearanceHeight(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitClearanceHeight(unitClearanceHeight);
		}

		if (unitShownDraft == null) {
			tempUnitGeneralImpl.setUnitShownDraft(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitShownDraft(unitShownDraft);
		}

		if (unitShownDraftxF == null) {
			tempUnitGeneralImpl.setUnitShownDraftxF(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitShownDraftxF(unitShownDraftxF);
		}

		if (unitShownDraftxA == null) {
			tempUnitGeneralImpl.setUnitShownDraftxA(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitShownDraftxA(unitShownDraftxA);
		}

		if (unitHorsePower == null) {
			tempUnitGeneralImpl.setUnitHorsePower(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitHorsePower(unitHorsePower);
		}

		if (unitRemainingOnBoardxB == null) {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxB(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxB(unitRemainingOnBoardxB);
		}

		if (unitRemainingOnBoardxS == null) {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxS(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitRemainingOnBoardxS(unitRemainingOnBoardxS);
		}

		if (unitFO == null) {
			tempUnitGeneralImpl.setUnitFO(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitFO(unitFO);
		}

		if (unitLO == null) {
			tempUnitGeneralImpl.setUnitLO(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitLO(unitLO);
		}

		if (unitFW == null) {
			tempUnitGeneralImpl.setUnitFW(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitFW(unitFW);
		}

		if (unitDO == null) {
			tempUnitGeneralImpl.setUnitDO(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitDO(unitDO);
		}

		if (unitSludgeOil == null) {
			tempUnitGeneralImpl.setUnitSludgeOil(StringPool.BLANK);
		}
		else {
			tempUnitGeneralImpl.setUnitSludgeOil(unitSludgeOil);
		}

		tempUnitGeneralImpl.resetOriginalValues();

		return tempUnitGeneralImpl;
	}

	public long id;
	public String requestCode;
	public long documentName;
	public int documentYear;
	public String grossTonnageUnit;
	public String netTonnageUnit;
	public String unitDWT;
	public String unitLOA;
	public String unitBreadth;
	public String unitClearanceHeight;
	public String unitShownDraft;
	public String unitShownDraftxF;
	public String unitShownDraftxA;
	public String unitHorsePower;
	public String unitRemainingOnBoardxB;
	public String unitRemainingOnBoardxS;
	public String unitFO;
	public String unitLO;
	public String unitFW;
	public String unitDO;
	public String unitSludgeOil;
}