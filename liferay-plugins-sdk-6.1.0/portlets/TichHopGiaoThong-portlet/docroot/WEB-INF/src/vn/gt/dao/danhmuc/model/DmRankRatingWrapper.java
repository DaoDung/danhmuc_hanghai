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
 * This class is a wrapper for {@link DmRankRating}.
 * </p>
 *
 * @author    win_64
 * @see       DmRankRating
 * @generated
 */
public class DmRankRatingWrapper implements DmRankRating,
	ModelWrapper<DmRankRating> {
	public DmRankRatingWrapper(DmRankRating dmRankRating) {
		_dmRankRating = dmRankRating;
	}

	public Class<?> getModelClass() {
		return DmRankRating.class;
	}

	public String getModelClassName() {
		return DmRankRating.class.getName();
	}

	/**
	* Returns the primary key of this dm rank rating.
	*
	* @return the primary key of this dm rank rating
	*/
	public int getPrimaryKey() {
		return _dmRankRating.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm rank rating.
	*
	* @param primaryKey the primary key of this dm rank rating
	*/
	public void setPrimaryKey(int primaryKey) {
		_dmRankRating.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm rank rating.
	*
	* @return the ID of this dm rank rating
	*/
	public int getId() {
		return _dmRankRating.getId();
	}

	/**
	* Sets the ID of this dm rank rating.
	*
	* @param id the ID of this dm rank rating
	*/
	public void setId(int id) {
		_dmRankRating.setId(id);
	}

	/**
	* Returns the rank code of this dm rank rating.
	*
	* @return the rank code of this dm rank rating
	*/
	public java.lang.String getRankCode() {
		return _dmRankRating.getRankCode();
	}

	/**
	* Sets the rank code of this dm rank rating.
	*
	* @param rankCode the rank code of this dm rank rating
	*/
	public void setRankCode(java.lang.String rankCode) {
		_dmRankRating.setRankCode(rankCode);
	}

	/**
	* Returns the rank name of this dm rank rating.
	*
	* @return the rank name of this dm rank rating
	*/
	public java.lang.String getRankName() {
		return _dmRankRating.getRankName();
	}

	/**
	* Sets the rank name of this dm rank rating.
	*
	* @param rankName the rank name of this dm rank rating
	*/
	public void setRankName(java.lang.String rankName) {
		_dmRankRating.setRankName(rankName);
	}

	/**
	* Returns the rank name v n of this dm rank rating.
	*
	* @return the rank name v n of this dm rank rating
	*/
	public java.lang.String getRankNameVN() {
		return _dmRankRating.getRankNameVN();
	}

	/**
	* Sets the rank name v n of this dm rank rating.
	*
	* @param rankNameVN the rank name v n of this dm rank rating
	*/
	public void setRankNameVN(java.lang.String rankNameVN) {
		_dmRankRating.setRankNameVN(rankNameVN);
	}

	/**
	* Returns the rank order of this dm rank rating.
	*
	* @return the rank order of this dm rank rating
	*/
	public int getRankOrder() {
		return _dmRankRating.getRankOrder();
	}

	/**
	* Sets the rank order of this dm rank rating.
	*
	* @param rankOrder the rank order of this dm rank rating
	*/
	public void setRankOrder(int rankOrder) {
		_dmRankRating.setRankOrder(rankOrder);
	}

	/**
	* Returns the is delete of this dm rank rating.
	*
	* @return the is delete of this dm rank rating
	*/
	public int getIsDelete() {
		return _dmRankRating.getIsDelete();
	}

	/**
	* Sets the is delete of this dm rank rating.
	*
	* @param isDelete the is delete of this dm rank rating
	*/
	public void setIsDelete(int isDelete) {
		_dmRankRating.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this dm rank rating.
	*
	* @return the marked as delete of this dm rank rating
	*/
	public int getMarkedAsDelete() {
		return _dmRankRating.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this dm rank rating.
	*
	* @param markedAsDelete the marked as delete of this dm rank rating
	*/
	public void setMarkedAsDelete(int markedAsDelete) {
		_dmRankRating.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this dm rank rating.
	*
	* @return the modified date of this dm rank rating
	*/
	public java.util.Date getModifiedDate() {
		return _dmRankRating.getModifiedDate();
	}

	/**
	* Sets the modified date of this dm rank rating.
	*
	* @param modifiedDate the modified date of this dm rank rating
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dmRankRating.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this dm rank rating.
	*
	* @return the requested date of this dm rank rating
	*/
	public java.util.Date getRequestedDate() {
		return _dmRankRating.getRequestedDate();
	}

	/**
	* Sets the requested date of this dm rank rating.
	*
	* @param requestedDate the requested date of this dm rank rating
	*/
	public void setRequestedDate(java.util.Date requestedDate) {
		_dmRankRating.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this dm rank rating.
	*
	* @return the sync version of this dm rank rating
	*/
	public java.lang.String getSyncVersion() {
		return _dmRankRating.getSyncVersion();
	}

	/**
	* Sets the sync version of this dm rank rating.
	*
	* @param syncVersion the sync version of this dm rank rating
	*/
	public void setSyncVersion(java.lang.String syncVersion) {
		_dmRankRating.setSyncVersion(syncVersion);
	}

	public boolean isNew() {
		return _dmRankRating.isNew();
	}

	public void setNew(boolean n) {
		_dmRankRating.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmRankRating.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmRankRating.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmRankRating.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmRankRating.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmRankRating.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmRankRating.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmRankRating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmRankRatingWrapper((DmRankRating)_dmRankRating.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmRankRating dmRankRating) {
		return _dmRankRating.compareTo(dmRankRating);
	}

	@Override
	public int hashCode() {
		return _dmRankRating.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmRankRating> toCacheModel() {
		return _dmRankRating.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmRankRating toEscapedModel() {
		return new DmRankRatingWrapper(_dmRankRating.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmRankRating.toString();
	}

	public java.lang.String toXmlString() {
		return _dmRankRating.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmRankRating.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmRankRating getWrappedDmRankRating() {
		return _dmRankRating;
	}

	public DmRankRating getWrappedModel() {
		return _dmRankRating;
	}

	public void resetOriginalValues() {
		_dmRankRating.resetOriginalValues();
	}

	private DmRankRating _dmRankRating;
}