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

package vn.gt.dao.danhmuc.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmHistoryPortHarbour}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryPortHarbour
 * @generated
 */
public class DmHistoryPortHarbourWrapper implements DmHistoryPortHarbour,
	ModelWrapper<DmHistoryPortHarbour> {
	public DmHistoryPortHarbourWrapper(
		DmHistoryPortHarbour dmHistoryPortHarbour) {
		_dmHistoryPortHarbour = dmHistoryPortHarbour;
	}

	public Class<?> getModelClass() {
		return DmHistoryPortHarbour.class;
	}

	public String getModelClassName() {
		return DmHistoryPortHarbour.class.getName();
	}

	/**
	* Returns the primary key of this dm history port harbour.
	*
	* @return the primary key of this dm history port harbour
	*/
	public int getPrimaryKey() {
		return _dmHistoryPortHarbour.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port harbour.
	*
	* @param primaryKey the primary key of this dm history port harbour
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPortHarbour.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port harbour.
	*
	* @return the ID of this dm history port harbour
	*/
	public int getId() {
		return _dmHistoryPortHarbour.getId();
	}

	/**
	* Sets the ID of this dm history port harbour.
	*
	* @param id the ID of this dm history port harbour
	*/
	public void setId(int id) {
		_dmHistoryPortHarbour.setId(id);
	}

	/**
	* Returns the port harbour code of this dm history port harbour.
	*
	* @return the port harbour code of this dm history port harbour
	*/
	public java.lang.String getPortHarbourCode() {
		return _dmHistoryPortHarbour.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm history port harbour.
	*
	* @param portHarbourCode the port harbour code of this dm history port harbour
	*/
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmHistoryPortHarbour.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port harbour name of this dm history port harbour.
	*
	* @return the port harbour name of this dm history port harbour
	*/
	public java.lang.String getPortHarbourName() {
		return _dmHistoryPortHarbour.getPortHarbourName();
	}

	/**
	* Sets the port harbour name of this dm history port harbour.
	*
	* @param portHarbourName the port harbour name of this dm history port harbour
	*/
	public void setPortHarbourName(java.lang.String portHarbourName) {
		_dmHistoryPortHarbour.setPortHarbourName(portHarbourName);
	}

	/**
	* Returns the port harbour name v n of this dm history port harbour.
	*
	* @return the port harbour name v n of this dm history port harbour
	*/
	public java.lang.String getPortHarbourNameVN() {
		return _dmHistoryPortHarbour.getPortHarbourNameVN();
	}

	/**
	* Sets the port harbour name v n of this dm history port harbour.
	*
	* @param portHarbourNameVN the port harbour name v n of this dm history port harbour
	*/
	public void setPortHarbourNameVN(java.lang.String portHarbourNameVN) {
		_dmHistoryPortHarbour.setPortHarbourNameVN(portHarbourNameVN);
	}

	/**
	* Returns the port harbour type of this dm history port harbour.
	*
	* @return the port harbour type of this dm history port harbour
	*/
	public int getPortHarbourType() {
		return _dmHistoryPortHarbour.getPortHarbourType();
	}

	/**
	* Sets the port harbour type of this dm history port harbour.
	*
	* @param portHarbourType the port harbour type of this dm history port harbour
	*/
	public void setPortHarbourType(int portHarbourType) {
		_dmHistoryPortHarbour.setPortHarbourType(portHarbourType);
	}

	/**
	* Returns the port region of this dm history port harbour.
	*
	* @return the port region of this dm history port harbour
	*/
	public java.lang.String getPortRegion() {
		return _dmHistoryPortHarbour.getPortRegion();
	}

	/**
	* Sets the port region of this dm history port harbour.
	*
	* @param portRegion the port region of this dm history port harbour
	*/
	public void setPortRegion(java.lang.String portRegion) {
		_dmHistoryPortHarbour.setPortRegion(portRegion);
	}

	/**
	* Returns the port code of this dm history port harbour.
	*
	* @return the port code of this dm history port harbour
	*/
	public java.lang.String getPortCode() {
		return _dmHistoryPortHarbour.getPortCode();
	}

	/**
	* Sets the port code of this dm history port harbour.
	*
	* @param portCode the port code of this dm history port harbour
	*/
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPortHarbour.setPortCode(portCode);
	}

	/**
	* Returns the port region code of this dm history port harbour.
	*
	* @return the port region code of this dm history port harbour
	*/
	public java.lang.String getPortRegionCode() {
		return _dmHistoryPortHarbour.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm history port harbour.
	*
	* @param portRegionCode the port region code of this dm history port harbour
	*/
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmHistoryPortHarbour.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm history port harbour.
	*
	* @return the note of this dm history port harbour
	*/
	public java.lang.String getNote() {
		return _dmHistoryPortHarbour.getNote();
	}

	/**
	* Sets the note of this dm history port harbour.
	*
	* @param note the note of this dm history port harbour
	*/
	public void setNote(java.lang.String note) {
		_dmHistoryPortHarbour.setNote(note);
	}

	/**
	* Returns the is delete of this dm history port harbour.
	*
	* @return the is delete of this dm history port harbour
	*/
	public int getIsDelete() {
		return _dmHistoryPortHarbour.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port harbour.
	*
	* @param isDelete the is delete of this dm history port harbour
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryPortHarbour.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port harbour.
	*
	* @return the marked as delete of this dm history port harbour
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryPortHarbour.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port harbour.
	*
	* @param markedAsDelete the marked as delete of this dm history port harbour
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPortHarbour.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port harbour.
	*
	* @return the modified date of this dm history port harbour
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryPortHarbour.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port harbour.
	*
	* @param modifiedDate the modified date of this dm history port harbour
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPortHarbour.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port harbour.
	*
	* @return the requested date of this dm history port harbour
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryPortHarbour.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port harbour.
	*
	* @param requestedDate the requested date of this dm history port harbour
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPortHarbour.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port harbour.
	*
	* @return the sync version of this dm history port harbour
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryPortHarbour.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port harbour.
	*
	* @param syncVersion the sync version of this dm history port harbour
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPortHarbour.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryPortHarbour.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryPortHarbour.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryPortHarbour.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPortHarbour.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryPortHarbour.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPortHarbour.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPortHarbour.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPortHarbour.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPortHarbour.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortHarbourWrapper((DmHistoryPortHarbour)_dmHistoryPortHarbour.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryPortHarbour dmHistoryPortHarbour) {
		return _dmHistoryPortHarbour.compareTo(dmHistoryPortHarbour);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPortHarbour.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> toCacheModel() {
		return _dmHistoryPortHarbour.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour toEscapedModel() {
		return new DmHistoryPortHarbourWrapper(_dmHistoryPortHarbour.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPortHarbour.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryPortHarbour.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortHarbour.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryPortHarbour getWrappedDmHistoryPortHarbour() {
		return _dmHistoryPortHarbour;
	}

	public DmHistoryPortHarbour getWrappedModel() {
		return _dmHistoryPortHarbour;
	}

	public void resetOriginalValues() {
		_dmHistoryPortHarbour.resetOriginalValues();
	}

	private DmHistoryPortHarbour _dmHistoryPortHarbour;
}