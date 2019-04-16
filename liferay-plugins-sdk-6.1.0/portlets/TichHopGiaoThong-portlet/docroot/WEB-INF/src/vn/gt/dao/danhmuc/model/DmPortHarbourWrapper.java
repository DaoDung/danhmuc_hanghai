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
 * This class is a wrapper for {@link DmPortHarbour}.
 * </p>
 *
 * @author    win_64
 * @see       DmPortHarbour
 * @generated
 */
public class DmPortHarbourWrapper implements DmPortHarbour,
	ModelWrapper<DmPortHarbour> {
	public DmPortHarbourWrapper(DmPortHarbour dmPortHarbour) {
		_dmPortHarbour = dmPortHarbour;
	}

	public Class<?> getModelClass() {
		return DmPortHarbour.class;
	}

	public String getModelClassName() {
		return DmPortHarbour.class.getName();
	}

	/**
	* Returns the primary key of this dm port harbour.
	*
	* @return the primary key of this dm port harbour
	*/
	public int getPrimaryKey() {
		return _dmPortHarbour.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm port harbour.
	*
	* @param primaryKey the primary key of this dm port harbour
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmPortHarbour.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm port harbour.
	*
	* @return the ID of this dm port harbour
	*/
	public int getId() {
		return _dmPortHarbour.getId();
	}

	/**
	* Sets the ID of this dm port harbour.
	*
	* @param id the ID of this dm port harbour
	*/
	public void setId(int id) {
		_dmPortHarbour.setId(id);
	}

	/**
	* Returns the port harbour code of this dm port harbour.
	*
	* @return the port harbour code of this dm port harbour
	*/
	public java.lang.String getPortHarbourCode() {
		return _dmPortHarbour.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm port harbour.
	*
	* @param portHarbourCode the port harbour code of this dm port harbour
	*/
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmPortHarbour.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port harbour name of this dm port harbour.
	*
	* @return the port harbour name of this dm port harbour
	*/
	public java.lang.String getPortHarbourName() {
		return _dmPortHarbour.getPortHarbourName();
	}

	/**
	* Sets the port harbour name of this dm port harbour.
	*
	* @param portHarbourName the port harbour name of this dm port harbour
	*/
	public void setPortHarbourName(java.lang.String portHarbourName) {
		_dmPortHarbour.setPortHarbourName(portHarbourName);
	}

	/**
	* Returns the port harbour name v n of this dm port harbour.
	*
	* @return the port harbour name v n of this dm port harbour
	*/
	public java.lang.String getPortHarbourNameVN() {
		return _dmPortHarbour.getPortHarbourNameVN();
	}

	/**
	* Sets the port harbour name v n of this dm port harbour.
	*
	* @param portHarbourNameVN the port harbour name v n of this dm port harbour
	*/
	public void setPortHarbourNameVN(java.lang.String portHarbourNameVN) {
		_dmPortHarbour.setPortHarbourNameVN(portHarbourNameVN);
	}

	/**
	* Returns the port harbour type of this dm port harbour.
	*
	* @return the port harbour type of this dm port harbour
	*/
	public int getPortHarbourType() {
		return _dmPortHarbour.getPortHarbourType();
	}

	/**
	* Sets the port harbour type of this dm port harbour.
	*
	* @param portHarbourType the port harbour type of this dm port harbour
	*/
	public void setPortHarbourType(int portHarbourType) {
		_dmPortHarbour.setPortHarbourType(portHarbourType);
	}

	/**
	* Returns the port region of this dm port harbour.
	*
	* @return the port region of this dm port harbour
	*/
	public java.lang.String getPortRegion() {
		return _dmPortHarbour.getPortRegion();
	}

	/**
	* Sets the port region of this dm port harbour.
	*
	* @param portRegion the port region of this dm port harbour
	*/
	public void setPortRegion(java.lang.String portRegion) {
		_dmPortHarbour.setPortRegion(portRegion);
	}

	/**
	* Returns the port code of this dm port harbour.
	*
	* @return the port code of this dm port harbour
	*/
	public java.lang.String getPortCode() {
		return _dmPortHarbour.getPortCode();
	}

	/**
	* Sets the port code of this dm port harbour.
	*
	* @param portCode the port code of this dm port harbour
	*/
	public void setPortCode(java.lang.String portCode) {
		_dmPortHarbour.setPortCode(portCode);
	}

	/**
	* Returns the port region code of this dm port harbour.
	*
	* @return the port region code of this dm port harbour
	*/
	public java.lang.String getPortRegionCode() {
		return _dmPortHarbour.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm port harbour.
	*
	* @param portRegionCode the port region code of this dm port harbour
	*/
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmPortHarbour.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm port harbour.
	*
	* @return the note of this dm port harbour
	*/
	public java.lang.String getNote() {
		return _dmPortHarbour.getNote();
	}

	/**
	* Sets the note of this dm port harbour.
	*
	* @param note the note of this dm port harbour
	*/
	public void setNote(java.lang.String note) {
		_dmPortHarbour.setNote(note);
	}

	/**
	* Returns the is delete of this dm port harbour.
	*
	* @return the is delete of this dm port harbour
	*/
	public int getIsDelete() {
		return _dmPortHarbour.getIsDelete();
	}

	/**
	* Sets the is delete of this dm port harbour.
	*
	* @param isDelete the is delete of this dm port harbour
	*/
	public void setIsDelete(int isDelete) {
		_dmPortHarbour.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm port harbour.
	*
	* @return the marked as delete of this dm port harbour
	*/
	public int getMarkedAsDelete() {
		return _dmPortHarbour.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm port harbour.
	*
	* @param markedAsDelete the marked as delete of this dm port harbour
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmPortHarbour.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm port harbour.
	*
	* @return the modified date of this dm port harbour
	*/
	public java.util.Date getModifiedDate() {
		return _dmPortHarbour.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm port harbour.
	*
	* @param modifiedDate the modified date of this dm port harbour
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmPortHarbour.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm port harbour.
	*
	* @return the requested date of this dm port harbour
	*/
	public java.util.Date getRequestedDate() {
		return _dmPortHarbour.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm port harbour.
	*
	* @param requestedDate the requested date of this dm port harbour
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmPortHarbour.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm port harbour.
	*
	* @return the sync version of this dm port harbour
	*/
	public java.lang.String getSyncVersion() {
		return _dmPortHarbour.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm port harbour.
	*
	* @param syncVersion the sync version of this dm port harbour
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmPortHarbour.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmPortHarbour.isNew();
	}

	public void setNew(boolean n) {
		_dmPortHarbour.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmPortHarbour.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmPortHarbour.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmPortHarbour.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmPortHarbour.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmPortHarbour.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmPortHarbour.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmPortHarbour.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmPortHarbourWrapper((DmPortHarbour)_dmPortHarbour.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour) {
		return _dmPortHarbour.compareTo(dmPortHarbour);
	}

	@Override
	public int hashCode() {
		return _dmPortHarbour.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmPortHarbour> toCacheModel() {
		return _dmPortHarbour.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmPortHarbour toEscapedModel() {
		return new DmPortHarbourWrapper(_dmPortHarbour.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmPortHarbour.toString();
	}

	public java.lang.String toXmlString() {
		return _dmPortHarbour.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPortHarbour.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmPortHarbour getWrappedDmPortHarbour() {
		return _dmPortHarbour;
	}

	public DmPortHarbour getWrappedModel() {
		return _dmPortHarbour;
	}

	public void resetOriginalValues() {
		_dmPortHarbour.resetOriginalValues();
	}

	private DmPortHarbour _dmPortHarbour;
}