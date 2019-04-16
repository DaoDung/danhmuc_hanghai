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
 * This class is a wrapper for {@link DmHistoryPortRegionLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryPortRegionLocalService
 * @generated
 */
public class DmHistoryPortRegionLocalServiceWrapper
	implements DmHistoryPortRegionLocalService,
		ServiceWrapper<DmHistoryPortRegionLocalService> {
	public DmHistoryPortRegionLocalServiceWrapper(
		DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService) {
		_dmHistoryPortRegionLocalService = dmHistoryPortRegionLocalService;
	}

	/**
	* Adds the dm history port region to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortRegion the dm history port region
	* @return the dm history port region that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion addDmHistoryPortRegion(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.addDmHistoryPortRegion(dmHistoryPortRegion);
	}

	/**
	* Creates a new dm history port region with the primary key. Does not add the dm history port region to the database.
	*
	* @param id the primary key for the new dm history port region
	* @return the new dm history port region
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion createDmHistoryPortRegion(
		int id) {
		return _dmHistoryPortRegionLocalService.createDmHistoryPortRegion(id);
	}

	/**
	* Deletes the dm history port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port region
	* @throws PortalException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortRegionLocalService.deleteDmHistoryPortRegion(id);
	}

	/**
	* Deletes the dm history port region from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortRegion the dm history port region
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryPortRegion(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryPortRegionLocalService.deleteDmHistoryPortRegion(dmHistoryPortRegion);
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
		return _dmHistoryPortRegionLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryPortRegionLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryPortRegionLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryPortRegionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion fetchDmHistoryPortRegion(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.fetchDmHistoryPortRegion(id);
	}

	/**
	* Returns the dm history port region with the primary key.
	*
	* @param id the primary key of the dm history port region
	* @return the dm history port region
	* @throws PortalException if a dm history port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion getDmHistoryPortRegion(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.getDmHistoryPortRegion(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history port regions
	* @param end the upper bound of the range of dm history port regions (not inclusive)
	* @return the range of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortRegion> getDmHistoryPortRegions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.getDmHistoryPortRegions(start,
			end);
	}

	/**
	* Returns the number of dm history port regions.
	*
	* @return the number of dm history port regions
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryPortRegionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.getDmHistoryPortRegionsCount();
	}

	/**
	* Updates the dm history port region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortRegion the dm history port region
	* @return the dm history port region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion updateDmHistoryPortRegion(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.updateDmHistoryPortRegion(dmHistoryPortRegion);
	}

	/**
	* Updates the dm history port region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortRegion the dm history port region
	* @param merge whether to merge the dm history port region with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history port region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion updateDmHistoryPortRegion(
		vn.gt.dao.danhmuc.model.DmHistoryPortRegion dmHistoryPortRegion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortRegionLocalService.updateDmHistoryPortRegion(dmHistoryPortRegion,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryPortRegionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryPortRegionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryPortRegion findByPortRegionCodeAndSyncVersion(
		java.lang.String portRegionCode, java.lang.String syncVersion) {
		return _dmHistoryPortRegionLocalService.findByPortRegionCodeAndSyncVersion(portRegionCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryPortRegionLocalService getWrappedDmHistoryPortRegionLocalService() {
		return _dmHistoryPortRegionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryPortRegionLocalService(
		DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService) {
		_dmHistoryPortRegionLocalService = dmHistoryPortRegionLocalService;
	}

	public DmHistoryPortRegionLocalService getWrappedService() {
		return _dmHistoryPortRegionLocalService;
	}

	public void setWrappedService(
		DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService) {
		_dmHistoryPortRegionLocalService = dmHistoryPortRegionLocalService;
	}

	private DmHistoryPortRegionLocalService _dmHistoryPortRegionLocalService;
}