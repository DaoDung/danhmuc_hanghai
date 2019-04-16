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
 * This class is a wrapper for {@link DmHistoryRankRatingLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryRankRatingLocalService
 * @generated
 */
public class DmHistoryRankRatingLocalServiceWrapper
	implements DmHistoryRankRatingLocalService,
		ServiceWrapper<DmHistoryRankRatingLocalService> {
	public DmHistoryRankRatingLocalServiceWrapper(
		DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService) {
		_dmHistoryRankRatingLocalService = dmHistoryRankRatingLocalService;
	}

	/**
	* Adds the dm history rank rating to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRankRating the dm history rank rating
	* @return the dm history rank rating that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRankRating addDmHistoryRankRating(
		vn.gt.dao.danhmuc.model.DmHistoryRankRating dmHistoryRankRating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.addDmHistoryRankRating(dmHistoryRankRating);
	}

	/**
	* Creates a new dm history rank rating with the primary key. Does not add the dm history rank rating to the database.
	*
	* @param id the primary key for the new dm history rank rating
	* @return the new dm history rank rating
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRankRating createDmHistoryRankRating(
		int id) {
		return _dmHistoryRankRatingLocalService.createDmHistoryRankRating(id);
	}

	/**
	* Deletes the dm history rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history rank rating
	* @throws PortalException if a dm history rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryRankRating(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryRankRatingLocalService.deleteDmHistoryRankRating(id);
	}

	/**
	* Deletes the dm history rank rating from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRankRating the dm history rank rating
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryRankRating(
		vn.gt.dao.danhmuc.model.DmHistoryRankRating dmHistoryRankRating)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryRankRatingLocalService.deleteDmHistoryRankRating(dmHistoryRankRating);
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
		return _dmHistoryRankRatingLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryRankRatingLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryRankRatingLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryRankRatingLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryRankRating fetchDmHistoryRankRating(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.fetchDmHistoryRankRating(id);
	}

	/**
	* Returns the dm history rank rating with the primary key.
	*
	* @param id the primary key of the dm history rank rating
	* @return the dm history rank rating
	* @throws PortalException if a dm history rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRankRating getDmHistoryRankRating(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.getDmHistoryRankRating(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history rank ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history rank ratings
	* @param end the upper bound of the range of dm history rank ratings (not inclusive)
	* @return the range of dm history rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRankRating> getDmHistoryRankRatings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.getDmHistoryRankRatings(start,
			end);
	}

	/**
	* Returns the number of dm history rank ratings.
	*
	* @return the number of dm history rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryRankRatingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.getDmHistoryRankRatingsCount();
	}

	/**
	* Updates the dm history rank rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRankRating the dm history rank rating
	* @return the dm history rank rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRankRating updateDmHistoryRankRating(
		vn.gt.dao.danhmuc.model.DmHistoryRankRating dmHistoryRankRating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.updateDmHistoryRankRating(dmHistoryRankRating);
	}

	/**
	* Updates the dm history rank rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRankRating the dm history rank rating
	* @param merge whether to merge the dm history rank rating with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history rank rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryRankRating updateDmHistoryRankRating(
		vn.gt.dao.danhmuc.model.DmHistoryRankRating dmHistoryRankRating,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryRankRatingLocalService.updateDmHistoryRankRating(dmHistoryRankRating,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryRankRatingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryRankRatingLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryRankRating getByRankCodeAndSyncVersion(
		java.lang.String rankCode, java.lang.String syncVersion) {
		return _dmHistoryRankRatingLocalService.getByRankCodeAndSyncVersion(rankCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryRankRatingLocalService getWrappedDmHistoryRankRatingLocalService() {
		return _dmHistoryRankRatingLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryRankRatingLocalService(
		DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService) {
		_dmHistoryRankRatingLocalService = dmHistoryRankRatingLocalService;
	}

	public DmHistoryRankRatingLocalService getWrappedService() {
		return _dmHistoryRankRatingLocalService;
	}

	public void setWrappedService(
		DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService) {
		_dmHistoryRankRatingLocalService = dmHistoryRankRatingLocalService;
	}

	private DmHistoryRankRatingLocalService _dmHistoryRankRatingLocalService;
}