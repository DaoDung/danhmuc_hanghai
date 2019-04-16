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

import vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems;

import java.io.Serializable;

/**
 * The cache model class for representing TempCrewEffectsItems in entity cache.
 *
 * @author win_64
 * @see TempCrewEffectsItems
 * @generated
 */
public class TempCrewEffectsItemsCacheModel implements CacheModel<TempCrewEffectsItems>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", crewEffectItemcode=");
		sb.append(crewEffectItemcode);
		sb.append(", familyName=");
		sb.append(familyName);
		sb.append(", givenName=");
		sb.append(givenName);
		sb.append(", rankOrratingCode=");
		sb.append(rankOrratingCode);
		sb.append(", effectsIneligibleForRelief=");
		sb.append(effectsIneligibleForRelief);
		sb.append("}");

		return sb.toString();
	}

	public TempCrewEffectsItems toEntityModel() {
		TempCrewEffectsItemsImpl tempCrewEffectsItemsImpl = new TempCrewEffectsItemsImpl();

		tempCrewEffectsItemsImpl.setId(id);

		if (requestCode == null) {
			tempCrewEffectsItemsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCrewEffectsItemsImpl.setRequestCode(requestCode);
		}

		if (crewEffectItemcode == null) {
			tempCrewEffectsItemsImpl.setCrewEffectItemcode(StringPool.BLANK);
		}
		else {
			tempCrewEffectsItemsImpl.setCrewEffectItemcode(crewEffectItemcode);
		}

		if (familyName == null) {
			tempCrewEffectsItemsImpl.setFamilyName(StringPool.BLANK);
		}
		else {
			tempCrewEffectsItemsImpl.setFamilyName(familyName);
		}

		if (givenName == null) {
			tempCrewEffectsItemsImpl.setGivenName(StringPool.BLANK);
		}
		else {
			tempCrewEffectsItemsImpl.setGivenName(givenName);
		}

		if (rankOrratingCode == null) {
			tempCrewEffectsItemsImpl.setRankOrratingCode(StringPool.BLANK);
		}
		else {
			tempCrewEffectsItemsImpl.setRankOrratingCode(rankOrratingCode);
		}

		if (effectsIneligibleForRelief == null) {
			tempCrewEffectsItemsImpl.setEffectsIneligibleForRelief(StringPool.BLANK);
		}
		else {
			tempCrewEffectsItemsImpl.setEffectsIneligibleForRelief(effectsIneligibleForRelief);
		}

		tempCrewEffectsItemsImpl.resetOriginalValues();

		return tempCrewEffectsItemsImpl;
	}

	public long id;
	public String requestCode;
	public String crewEffectItemcode;
	public String familyName;
	public String givenName;
	public String rankOrratingCode;
	public String effectsIneligibleForRelief;
}