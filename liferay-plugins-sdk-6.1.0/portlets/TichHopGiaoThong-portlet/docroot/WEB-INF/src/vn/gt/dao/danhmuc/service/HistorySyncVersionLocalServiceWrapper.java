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

package vn.gt.dao.danhmuc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link HistorySyncVersionLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       HistorySyncVersionLocalService
 * @generated
 */
public class HistorySyncVersionLocalServiceWrapper
	implements HistorySyncVersionLocalService,
		ServiceWrapper<HistorySyncVersionLocalService> {
	public HistorySyncVersionLocalServiceWrapper(
		HistorySyncVersionLocalService historySyncVersionLocalService) {
		_historySyncVersionLocalService = historySyncVersionLocalService;
	}

	/**
	* Adds the history sync version to the database. Also notifies the appropriate model listeners.
	*
	* @param historySyncVersion the history sync version
	* @return the history sync version that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistorySyncVersion addHistorySyncVersion(
		vn.gt.dao.danhmuc.model.HistorySyncVersion historySyncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.addHistorySyncVersion(historySyncVersion);
	}

	/**
	* Creates a new history sync version with the primary key. Does not add the history sync version to the database.
	*
	* @param id the primary key for the new history sync version
	* @return the new history sync version
	*/
	public vn.gt.dao.danhmuc.model.HistorySyncVersion createHistorySyncVersion(
		long id) {
		return _historySyncVersionLocalService.createHistorySyncVersion(id);
	}

	/**
	* Deletes the history sync version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history sync version
	* @throws PortalException if a history sync version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHistorySyncVersion(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_historySyncVersionLocalService.deleteHistorySyncVersion(id);
	}

	/**
	* Deletes the history sync version from the database. Also notifies the appropriate model listeners.
	*
	* @param historySyncVersion the history sync version
	* @throws SystemException if a system exception occurred
	*/
	public void deleteHistorySyncVersion(
		vn.gt.dao.danhmuc.model.HistorySyncVersion historySyncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_historySyncVersionLocalService.deleteHistorySyncVersion(historySyncVersion);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.HistorySyncVersion fetchHistorySyncVersion(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.fetchHistorySyncVersion(id);
	}

	/**
	* Returns the history sync version with the primary key.
	*
	* @param id the primary key of the history sync version
	* @return the history sync version
	* @throws PortalException if a history sync version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistorySyncVersion getHistorySyncVersion(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.getHistorySyncVersion(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the history sync versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of history sync versions
	* @param end the upper bound of the range of history sync versions (not inclusive)
	* @return the range of history sync versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistorySyncVersion> getHistorySyncVersions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.getHistorySyncVersions(start, end);
	}

	/**
	* Returns the number of history sync versions.
	*
	* @return the number of history sync versions
	* @throws SystemException if a system exception occurred
	*/
	public int getHistorySyncVersionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.getHistorySyncVersionsCount();
	}

	/**
	* Updates the history sync version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historySyncVersion the history sync version
	* @return the history sync version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistorySyncVersion updateHistorySyncVersion(
		vn.gt.dao.danhmuc.model.HistorySyncVersion historySyncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.updateHistorySyncVersion(historySyncVersion);
	}

	/**
	* Updates the history sync version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historySyncVersion the history sync version
	* @param merge whether to merge the history sync version with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the history sync version that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistorySyncVersion updateHistorySyncVersion(
		vn.gt.dao.danhmuc.model.HistorySyncVersion historySyncVersion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.updateHistorySyncVersion(historySyncVersion,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _historySyncVersionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_historySyncVersionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.String getsyncVersion(java.util.Date requestedDate,
		java.lang.String categoryID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historySyncVersionLocalService.getsyncVersion(requestedDate,
			categoryID);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public HistorySyncVersionLocalService getWrappedHistorySyncVersionLocalService() {
		return _historySyncVersionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedHistorySyncVersionLocalService(
		HistorySyncVersionLocalService historySyncVersionLocalService) {
		_historySyncVersionLocalService = historySyncVersionLocalService;
	}

	public HistorySyncVersionLocalService getWrappedService() {
		return _historySyncVersionLocalService;
	}

	public void setWrappedService(
		HistorySyncVersionLocalService historySyncVersionLocalService) {
		_historySyncVersionLocalService = historySyncVersionLocalService;
	}

	private HistorySyncVersionLocalService _historySyncVersionLocalService;
}