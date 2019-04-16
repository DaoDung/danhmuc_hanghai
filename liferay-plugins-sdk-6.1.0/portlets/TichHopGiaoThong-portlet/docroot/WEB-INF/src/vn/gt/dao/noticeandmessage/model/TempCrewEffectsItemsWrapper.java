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

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempCrewEffectsItems}.
 * </p>
 *
 * @author    win_64
 * @see       TempCrewEffectsItems
 * @generated
 */
public class TempCrewEffectsItemsWrapper implements TempCrewEffectsItems,
	ModelWrapper<TempCrewEffectsItems> {
	public TempCrewEffectsItemsWrapper(
		TempCrewEffectsItems tempCrewEffectsItems) {
		_tempCrewEffectsItems = tempCrewEffectsItems;
	}

	public Class<?> getModelClass() {
		return TempCrewEffectsItems.class;
	}

	public String getModelClassName() {
		return TempCrewEffectsItems.class.getName();
	}

	/**
	* Returns the primary key of this temp crew effects items.
	*
	* @return the primary key of this temp crew effects items
	*/
	public long getPrimaryKey() {
		return _tempCrewEffectsItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew effects items.
	*
	* @param primaryKey the primary key of this temp crew effects items
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempCrewEffectsItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew effects items.
	*
	* @return the ID of this temp crew effects items
	*/
	public long getId() {
		return _tempCrewEffectsItems.getId();
	}

	/**
	* Sets the ID of this temp crew effects items.
	*
	* @param id the ID of this temp crew effects items
	*/
	public void setId(long id) {
		_tempCrewEffectsItems.setId(id);
	}

	/**
	* Returns the request code of this temp crew effects items.
	*
	* @return the request code of this temp crew effects items
	*/
	public java.lang.String getRequestCode() {
		return _tempCrewEffectsItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew effects items.
	*
	* @param requestCode the request code of this temp crew effects items
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewEffectsItems.setRequestCode(requestCode);
	}

	/**
	* Returns the crew effect itemcode of this temp crew effects items.
	*
	* @return the crew effect itemcode of this temp crew effects items
	*/
	public java.lang.String getCrewEffectItemcode() {
		return _tempCrewEffectsItems.getCrewEffectItemcode();
	}

	/**
	* Sets the crew effect itemcode of this temp crew effects items.
	*
	* @param crewEffectItemcode the crew effect itemcode of this temp crew effects items
	*/
	public void setCrewEffectItemcode(java.lang.String crewEffectItemcode) {
		_tempCrewEffectsItems.setCrewEffectItemcode(crewEffectItemcode);
	}

	/**
	* Returns the family name of this temp crew effects items.
	*
	* @return the family name of this temp crew effects items
	*/
	public java.lang.String getFamilyName() {
		return _tempCrewEffectsItems.getFamilyName();
	}

	/**
	* Sets the family name of this temp crew effects items.
	*
	* @param familyName the family name of this temp crew effects items
	*/
	public void setFamilyName(java.lang.String familyName) {
		_tempCrewEffectsItems.setFamilyName(familyName);
	}

	/**
	* Returns the given name of this temp crew effects items.
	*
	* @return the given name of this temp crew effects items
	*/
	public java.lang.String getGivenName() {
		return _tempCrewEffectsItems.getGivenName();
	}

	/**
	* Sets the given name of this temp crew effects items.
	*
	* @param givenName the given name of this temp crew effects items
	*/
	public void setGivenName(java.lang.String givenName) {
		_tempCrewEffectsItems.setGivenName(givenName);
	}

	/**
	* Returns the rank orrating code of this temp crew effects items.
	*
	* @return the rank orrating code of this temp crew effects items
	*/
	public java.lang.String getRankOrratingCode() {
		return _tempCrewEffectsItems.getRankOrratingCode();
	}

	/**
	* Sets the rank orrating code of this temp crew effects items.
	*
	* @param rankOrratingCode the rank orrating code of this temp crew effects items
	*/
	public void setRankOrratingCode(java.lang.String rankOrratingCode) {
		_tempCrewEffectsItems.setRankOrratingCode(rankOrratingCode);
	}

	/**
	* Returns the effects ineligible for relief of this temp crew effects items.
	*
	* @return the effects ineligible for relief of this temp crew effects items
	*/
	public java.lang.String getEffectsIneligibleForRelief() {
		return _tempCrewEffectsItems.getEffectsIneligibleForRelief();
	}

	/**
	* Sets the effects ineligible for relief of this temp crew effects items.
	*
	* @param effectsIneligibleForRelief the effects ineligible for relief of this temp crew effects items
	*/
	public void setEffectsIneligibleForRelief(
		java.lang.String effectsIneligibleForRelief) {
		_tempCrewEffectsItems.setEffectsIneligibleForRelief(effectsIneligibleForRelief);
	}

	public boolean isNew() {
		return _tempCrewEffectsItems.isNew();
	}

	public void setNew(boolean n) {
		_tempCrewEffectsItems.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempCrewEffectsItems.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempCrewEffectsItems.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempCrewEffectsItems.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewEffectsItems.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewEffectsItems.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewEffectsItems.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewEffectsItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewEffectsItemsWrapper((TempCrewEffectsItems)_tempCrewEffectsItems.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems tempCrewEffectsItems) {
		return _tempCrewEffectsItems.compareTo(tempCrewEffectsItems);
	}

	@Override
	public int hashCode() {
		return _tempCrewEffectsItems.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems> toCacheModel() {
		return _tempCrewEffectsItems.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempCrewEffectsItems toEscapedModel() {
		return new TempCrewEffectsItemsWrapper(_tempCrewEffectsItems.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewEffectsItems.toString();
	}

	public java.lang.String toXmlString() {
		return _tempCrewEffectsItems.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewEffectsItems.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempCrewEffectsItems getWrappedTempCrewEffectsItems() {
		return _tempCrewEffectsItems;
	}

	public TempCrewEffectsItems getWrappedModel() {
		return _tempCrewEffectsItems;
	}

	public void resetOriginalValues() {
		_tempCrewEffectsItems.resetOriginalValues();
	}

	private TempCrewEffectsItems _tempCrewEffectsItems;
}