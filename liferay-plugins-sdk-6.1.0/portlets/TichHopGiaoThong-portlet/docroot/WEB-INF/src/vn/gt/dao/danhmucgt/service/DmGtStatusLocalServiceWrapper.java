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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmGtStatusLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmGtStatusLocalService
 * @generated
 */
public class DmGtStatusLocalServiceWrapper implements DmGtStatusLocalService,
	ServiceWrapper<DmGtStatusLocalService> {
	public DmGtStatusLocalServiceWrapper(
		DmGtStatusLocalService dmGtStatusLocalService) {
		_dmGtStatusLocalService = dmGtStatusLocalService;
	}

	/**
	* Adds the dm gt status to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtStatus the dm gt status
	* @return the dm gt status that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus addDmGtStatus(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.addDmGtStatus(dmGtStatus);
	}

	/**
	* Creates a new dm gt status with the primary key. Does not add the dm gt status to the database.
	*
	* @param id the primary key for the new dm gt status
	* @return the new dm gt status
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus createDmGtStatus(long id) {
		return _dmGtStatusLocalService.createDmGtStatus(id);
	}

	/**
	* Deletes the dm gt status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt status
	* @throws PortalException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmGtStatus(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmGtStatusLocalService.deleteDmGtStatus(id);
	}

	/**
	* Deletes the dm gt status from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtStatus the dm gt status
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmGtStatus(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGtStatusLocalService.deleteDmGtStatus(dmGtStatus);
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
		return _dmGtStatusLocalService.dynamicQuery(dynamicQuery);
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
		return _dmGtStatusLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmGtStatusLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _dmGtStatusLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmucgt.model.DmGtStatus fetchDmGtStatus(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.fetchDmGtStatus(id);
	}

	/**
	* Returns the dm gt status with the primary key.
	*
	* @param id the primary key of the dm gt status
	* @return the dm gt status
	* @throws PortalException if a dm gt status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus getDmGtStatus(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.getDmGtStatus(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm gt statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt statuses
	* @param end the upper bound of the range of dm gt statuses (not inclusive)
	* @return the range of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> getDmGtStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.getDmGtStatuses(start, end);
	}

	/**
	* Returns the number of dm gt statuses.
	*
	* @return the number of dm gt statuses
	* @throws SystemException if a system exception occurred
	*/
	public int getDmGtStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.getDmGtStatusesCount();
	}

	/**
	* Updates the dm gt status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGtStatus the dm gt status
	* @return the dm gt status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus updateDmGtStatus(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.updateDmGtStatus(dmGtStatus);
	}

	/**
	* Updates the dm gt status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGtStatus the dm gt status
	* @param merge whether to merge the dm gt status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm gt status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtStatus updateDmGtStatus(
		vn.gt.dao.danhmucgt.model.DmGtStatus dmGtStatus, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtStatusLocalService.updateDmGtStatus(dmGtStatus, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmGtStatusLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGtStatusLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmucgt.model.DmGtStatus findByStatusCode(
		int statusCode, int type) {
		return _dmGtStatusLocalService.findByStatusCode(statusCode, type);
	}

	public java.lang.String findNameByStatusCode(int statusCode, int type) {
		return _dmGtStatusLocalService.findNameByStatusCode(statusCode, type);
	}

	public int countByStatusCode(int statusCode, int type) {
		return _dmGtStatusLocalService.countByStatusCode(statusCode, type);
	}

	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtStatus> findByType(
		int type) {
		return _dmGtStatusLocalService.findByType(type);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmGtStatusLocalService getWrappedDmGtStatusLocalService() {
		return _dmGtStatusLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmGtStatusLocalService(
		DmGtStatusLocalService dmGtStatusLocalService) {
		_dmGtStatusLocalService = dmGtStatusLocalService;
	}

	public DmGtStatusLocalService getWrappedService() {
		return _dmGtStatusLocalService;
	}

	public void setWrappedService(DmGtStatusLocalService dmGtStatusLocalService) {
		_dmGtStatusLocalService = dmGtStatusLocalService;
	}

	private DmGtStatusLocalService _dmGtStatusLocalService;
}