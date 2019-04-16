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
 * This class is a wrapper for {@link TempCargoItems}.
 * </p>
 *
 * @author    win_64
 * @see       TempCargoItems
 * @generated
 */
public class TempCargoItemsWrapper implements TempCargoItems,
	ModelWrapper<TempCargoItems> {
	public TempCargoItemsWrapper(TempCargoItems tempCargoItems) {
		_tempCargoItems = tempCargoItems;
	}

	public Class<?> getModelClass() {
		return TempCargoItems.class;
	}

	public String getModelClassName() {
		return TempCargoItems.class.getName();
	}

	/**
	* Returns the primary key of this temp cargo items.
	*
	* @return the primary key of this temp cargo items
	*/
	public long getPrimaryKey() {
		return _tempCargoItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp cargo items.
	*
	* @param primaryKey the primary key of this temp cargo items
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempCargoItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp cargo items.
	*
	* @return the ID of this temp cargo items
	*/
	public long getId() {
		return _tempCargoItems.getId();
	}

	/**
	* Sets the ID of this temp cargo items.
	*
	* @param id the ID of this temp cargo items
	*/
	public void setId(long id) {
		_tempCargoItems.setId(id);
	}

	/**
	* Returns the request code of this temp cargo items.
	*
	* @return the request code of this temp cargo items
	*/
	public java.lang.String getRequestCode() {
		return _tempCargoItems.getRequestCode();
	}

	/**
	* Sets the request code of this temp cargo items.
	*
	* @param requestCode the request code of this temp cargo items
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempCargoItems.setRequestCode(requestCode);
	}

	/**
	* Returns the document name of this temp cargo items.
	*
	* @return the document name of this temp cargo items
	*/
	public long getDocumentName() {
		return _tempCargoItems.getDocumentName();
	}

	/**
	* Sets the document name of this temp cargo items.
	*
	* @param documentName the document name of this temp cargo items
	*/
	public void setDocumentName(long documentName) {
		_tempCargoItems.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp cargo items.
	*
	* @return the document year of this temp cargo items
	*/
	public int getDocumentYear() {
		return _tempCargoItems.getDocumentYear();
	}

	/**
	* Sets the document year of this temp cargo items.
	*
	* @param documentYear the document year of this temp cargo items
	*/
	public void setDocumentYear(int documentYear) {
		_tempCargoItems.setDocumentYear(documentYear);
	}

	/**
	* Returns the cargo category of this temp cargo items.
	*
	* @return the cargo category of this temp cargo items
	*/
	public java.lang.String getCargoCategory() {
		return _tempCargoItems.getCargoCategory();
	}

	/**
	* Sets the cargo category of this temp cargo items.
	*
	* @param cargoCategory the cargo category of this temp cargo items
	*/
	public void setCargoCategory(java.lang.String cargoCategory) {
		_tempCargoItems.setCargoCategory(cargoCategory);
	}

	/**
	* Returns the cargo type of this temp cargo items.
	*
	* @return the cargo type of this temp cargo items
	*/
	public java.lang.String getCargoType() {
		return _tempCargoItems.getCargoType();
	}

	/**
	* Sets the cargo type of this temp cargo items.
	*
	* @param cargoType the cargo type of this temp cargo items
	*/
	public void setCargoType(java.lang.String cargoType) {
		_tempCargoItems.setCargoType(cargoType);
	}

	/**
	* Returns the cargo code of this temp cargo items.
	*
	* @return the cargo code of this temp cargo items
	*/
	public java.lang.String getCargoCode() {
		return _tempCargoItems.getCargoCode();
	}

	/**
	* Sets the cargo code of this temp cargo items.
	*
	* @param cargoCode the cargo code of this temp cargo items
	*/
	public void setCargoCode(java.lang.String cargoCode) {
		_tempCargoItems.setCargoCode(cargoCode);
	}

	/**
	* Returns the description of this temp cargo items.
	*
	* @return the description of this temp cargo items
	*/
	public java.lang.String getDescription() {
		return _tempCargoItems.getDescription();
	}

	/**
	* Sets the description of this temp cargo items.
	*
	* @param description the description of this temp cargo items
	*/
	public void setDescription(java.lang.String description) {
		_tempCargoItems.setDescription(description);
	}

	/**
	* Returns the quantity of this temp cargo items.
	*
	* @return the quantity of this temp cargo items
	*/
	public double getQuantity() {
		return _tempCargoItems.getQuantity();
	}

	/**
	* Sets the quantity of this temp cargo items.
	*
	* @param quantity the quantity of this temp cargo items
	*/
	public void setQuantity(double quantity) {
		_tempCargoItems.setQuantity(quantity);
	}

	/**
	* Returns the unit of this temp cargo items.
	*
	* @return the unit of this temp cargo items
	*/
	public java.lang.String getUnit() {
		return _tempCargoItems.getUnit();
	}

	/**
	* Sets the unit of this temp cargo items.
	*
	* @param unit the unit of this temp cargo items
	*/
	public void setUnit(java.lang.String unit) {
		_tempCargoItems.setUnit(unit);
	}

	/**
	* Returns the sequence of this temp cargo items.
	*
	* @return the sequence of this temp cargo items
	*/
	public int getSequence() {
		return _tempCargoItems.getSequence();
	}

	/**
	* Sets the sequence of this temp cargo items.
	*
	* @param sequence the sequence of this temp cargo items
	*/
	public void setSequence(int sequence) {
		_tempCargoItems.setSequence(sequence);
	}

	/**
	* Returns the modified date of this temp cargo items.
	*
	* @return the modified date of this temp cargo items
	*/
	public java.util.Date getModifiedDate() {
		return _tempCargoItems.getModifiedDate();
	}

	/**
	* Sets the modified date of this temp cargo items.
	*
	* @param modifiedDate the modified date of this temp cargo items
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_tempCargoItems.setModifiedDate(modifiedDate);
	}

	public boolean isNew() {
		return _tempCargoItems.isNew();
	}

	public void setNew(boolean n) {
		_tempCargoItems.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempCargoItems.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempCargoItems.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempCargoItems.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCargoItems.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCargoItems.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCargoItems.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCargoItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCargoItemsWrapper((TempCargoItems)_tempCargoItems.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempCargoItems tempCargoItems) {
		return _tempCargoItems.compareTo(tempCargoItems);
	}

	@Override
	public int hashCode() {
		return _tempCargoItems.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempCargoItems> toCacheModel() {
		return _tempCargoItems.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempCargoItems toEscapedModel() {
		return new TempCargoItemsWrapper(_tempCargoItems.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCargoItems.toString();
	}

	public java.lang.String toXmlString() {
		return _tempCargoItems.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCargoItems.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempCargoItems getWrappedTempCargoItems() {
		return _tempCargoItems;
	}

	public TempCargoItems getWrappedModel() {
		return _tempCargoItems;
	}

	public void resetOriginalValues() {
		_tempCargoItems.resetOriginalValues();
	}

	private TempCargoItems _tempCargoItems;
}