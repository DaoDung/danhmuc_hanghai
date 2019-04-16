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
 * This class is a wrapper for {@link DmHistoryPortWharf}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryPortWharf
 * @generated
 */
public class DmHistoryPortWharfWrapper implements DmHistoryPortWharf,
	ModelWrapper<DmHistoryPortWharf> {
	public DmHistoryPortWharfWrapper(DmHistoryPortWharf dmHistoryPortWharf) {
		_dmHistoryPortWharf = dmHistoryPortWharf;
	}

	public Class<?> getModelClass() {
		return DmHistoryPortWharf.class;
	}

	public String getModelClassName() {
		return DmHistoryPortWharf.class.getName();
	}

	/**
	* Returns the primary key of this dm history port wharf.
	*
	* @return the primary key of this dm history port wharf
	*/
	public int getPrimaryKey() {
		return _dmHistoryPortWharf.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm history port wharf.
	*
	* @param primaryKey the primary key of this dm history port wharf
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmHistoryPortWharf.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm history port wharf.
	*
	* @return the ID of this dm history port wharf
	*/
	public int getId() {
		return _dmHistoryPortWharf.getId();
	}

	/**
	* Sets the ID of this dm history port wharf.
	*
	* @param id the ID of this dm history port wharf
	*/
	public void setId(int id) {
		_dmHistoryPortWharf.setId(id);
	}

	/**
	* Returns the port wharf code of this dm history port wharf.
	*
	* @return the port wharf code of this dm history port wharf
	*/
	public java.lang.String getPortWharfCode() {
		return _dmHistoryPortWharf.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this dm history port wharf.
	*
	* @param portWharfCode the port wharf code of this dm history port wharf
	*/
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_dmHistoryPortWharf.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the port wharf name of this dm history port wharf.
	*
	* @return the port wharf name of this dm history port wharf
	*/
	public java.lang.String getPortWharfName() {
		return _dmHistoryPortWharf.getPortWharfName();
	}

	/**
	* Sets the port wharf name of this dm history port wharf.
	*
	* @param portWharfName the port wharf name of this dm history port wharf
	*/
	public void setPortWharfName(java.lang.String portWharfName) {
		_dmHistoryPortWharf.setPortWharfName(portWharfName);
	}

	/**
	* Returns the port wharf name v n of this dm history port wharf.
	*
	* @return the port wharf name v n of this dm history port wharf
	*/
	public java.lang.String getPortWharfNameVN() {
		return _dmHistoryPortWharf.getPortWharfNameVN();
	}

	/**
	* Sets the port wharf name v n of this dm history port wharf.
	*
	* @param portWharfNameVN the port wharf name v n of this dm history port wharf
	*/
	public void setPortWharfNameVN(java.lang.String portWharfNameVN) {
		_dmHistoryPortWharf.setPortWharfNameVN(portWharfNameVN);
	}

	/**
	* Returns the port wharf type of this dm history port wharf.
	*
	* @return the port wharf type of this dm history port wharf
	*/
	public int getPortWharfType() {
		return _dmHistoryPortWharf.getPortWharfType();
	}

	/**
	* Sets the port wharf type of this dm history port wharf.
	*
	* @param portWharfType the port wharf type of this dm history port wharf
	*/
	public void setPortWharfType(int portWharfType) {
		_dmHistoryPortWharf.setPortWharfType(portWharfType);
	}

	/**
	* Returns the port harbour code of this dm history port wharf.
	*
	* @return the port harbour code of this dm history port wharf
	*/
	public java.lang.String getPortHarbourCode() {
		return _dmHistoryPortWharf.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this dm history port wharf.
	*
	* @param portHarbourCode the port harbour code of this dm history port wharf
	*/
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_dmHistoryPortWharf.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port code of this dm history port wharf.
	*
	* @return the port code of this dm history port wharf
	*/
	public java.lang.String getPortCode() {
		return _dmHistoryPortWharf.getPortCode();
	}

	/**
	* Sets the port code of this dm history port wharf.
	*
	* @param portCode the port code of this dm history port wharf
	*/
	public void setPortCode(java.lang.String portCode) {
		_dmHistoryPortWharf.setPortCode(portCode);
	}

	/**
	* Returns the port region code of this dm history port wharf.
	*
	* @return the port region code of this dm history port wharf
	*/
	public java.lang.String getPortRegionCode() {
		return _dmHistoryPortWharf.getPortRegionCode();
	}

	/**
	* Sets the port region code of this dm history port wharf.
	*
	* @param portRegionCode the port region code of this dm history port wharf
	*/
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_dmHistoryPortWharf.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the note of this dm history port wharf.
	*
	* @return the note of this dm history port wharf
	*/
	public java.lang.String getNote() {
		return _dmHistoryPortWharf.getNote();
	}

	/**
	* Sets the note of this dm history port wharf.
	*
	* @param note the note of this dm history port wharf
	*/
	public void setNote(java.lang.String note) {
		_dmHistoryPortWharf.setNote(note);
	}

	/**
	* Returns the is delete of this dm history port wharf.
	*
	* @return the is delete of this dm history port wharf
	*/
	public int getIsDelete() {
		return _dmHistoryPortWharf.getIsDelete();
	}

	/**
	* Sets the is delete of this dm history port wharf.
	*
	* @param isDelete the is delete of this dm history port wharf
	*/
	public void setIsDelete(int isDelete) {
		_dmHistoryPortWharf.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm history port wharf.
	*
	* @return the marked as delete of this dm history port wharf
	*/
	public int getMarkedAsDelete() {
		return _dmHistoryPortWharf.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm history port wharf.
	*
	* @param markedAsDelete the marked as delete of this dm history port wharf
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmHistoryPortWharf.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm history port wharf.
	*
	* @return the modified date of this dm history port wharf
	*/
	public java.util.Date getModifiedDate() {
		return _dmHistoryPortWharf.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm history port wharf.
	*
	* @param modifiedDate the modified date of this dm history port wharf
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmHistoryPortWharf.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm history port wharf.
	*
	* @return the requested date of this dm history port wharf
	*/
	public java.util.Date getRequestedDate() {
		return _dmHistoryPortWharf.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm history port wharf.
	*
	* @param requestedDate the requested date of this dm history port wharf
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmHistoryPortWharf.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm history port wharf.
	*
	* @return the sync version of this dm history port wharf
	*/
	public java.lang.String getSyncVersion() {
		return _dmHistoryPortWharf.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm history port wharf.
	*
	* @param syncVersion the sync version of this dm history port wharf
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmHistoryPortWharf.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmHistoryPortWharf.isNew();
	}

	public void setNew(boolean n) {
		_dmHistoryPortWharf.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmHistoryPortWharf.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmHistoryPortWharf.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmHistoryPortWharf.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmHistoryPortWharf.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmHistoryPortWharf.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmHistoryPortWharf.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmHistoryPortWharf.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmHistoryPortWharfWrapper((DmHistoryPortWharf)_dmHistoryPortWharf.clone());
	}

	public int compareTo(
		vn.gt.dao.danhmuc.model.DmHistoryPortWharf dmHistoryPortWharf) {
		return _dmHistoryPortWharf.compareTo(dmHistoryPortWharf);
	}

	@Override
	public int hashCode() {
		return _dmHistoryPortWharf.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmHistoryPortWharf> toCacheModel() {
		return _dmHistoryPortWharf.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPortWharf toEscapedModel() {
		return new DmHistoryPortWharfWrapper(_dmHistoryPortWharf.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmHistoryPortWharf.toString();
	}

	public java.lang.String toXmlString() {
		return _dmHistoryPortWharf.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortWharf.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmHistoryPortWharf getWrappedDmHistoryPortWharf() {
		return _dmHistoryPortWharf;
	}

	public DmHistoryPortWharf getWrappedModel() {
		return _dmHistoryPortWharf;
	}

	public void resetOriginalValues() {
		_dmHistoryPortWharf.resetOriginalValues();
	}

	private DmHistoryPortWharf _dmHistoryPortWharf;
}