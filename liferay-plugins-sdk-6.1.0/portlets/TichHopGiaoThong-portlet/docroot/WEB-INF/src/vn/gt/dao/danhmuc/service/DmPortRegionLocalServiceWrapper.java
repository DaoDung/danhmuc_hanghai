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
 * This class is a wrapper for {@link DmPortRegionLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmPortRegionLocalService
 * @generated
 */
public class DmPortRegionLocalServiceWrapper implements DmPortRegionLocalService,
	ServiceWrapper<DmPortRegionLocalService> {
	public DmPortRegionLocalServiceWrapper(
		DmPortRegionLocalService dmPortRegionLocalService) {
		_dmPortRegionLocalService = dmPortRegionLocalService;
	}

	/**
	* Adds the dm port region to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @return the dm port region that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion addDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.addDmPortRegion(dmPortRegion);
	}

	/**
	* Creates a new dm port region with the primary key. Does not add the dm port region to the database.
	*
	* @param id the primary key for the new dm port region
	* @return the new dm port region
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion createDmPortRegion(int id) {
		return _dmPortRegionLocalService.createDmPortRegion(id);
	}

	/**
	* Deletes the dm port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port region
	* @throws PortalException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmPortRegionLocalService.deleteDmPortRegion(id);
	}

	/**
	* Deletes the dm port region from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPortRegionLocalService.deleteDmPortRegion(dmPortRegion);
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
		return _dmPortRegionLocalService.dynamicQuery(dynamicQuery);
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
		return _dmPortRegionLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmPortRegionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dmPortRegionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion fetchDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.fetchDmPortRegion(id);
	}

	/**
	* Returns the dm port region with the primary key.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region
	* @throws PortalException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion getDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.getDmPortRegion(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> getDmPortRegions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.getDmPortRegions(start, end);
	}

	/**
	* Returns the number of dm port regions.
	*
	* @return the number of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	public int getDmPortRegionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.getDmPortRegionsCount();
	}

	/**
	* Updates the dm port region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @return the dm port region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion updateDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.updateDmPortRegion(dmPortRegion);
	}

	/**
	* Updates the dm port region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @param merge whether to merge the dm port region with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm port region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion updateDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortRegionLocalService.updateDmPortRegion(dmPortRegion, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmPortRegionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmPortRegionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion getByPortRegionCode(
		java.lang.String portRegionCode) {
		return _dmPortRegionLocalService.getByPortRegionCode(portRegionCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findPortRegionByPortRegionRef(
		java.lang.String portRegionRef) {
		return _dmPortRegionLocalService.findPortRegionByPortRegionRef(portRegionRef);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findPortRegionByPortCodeName(
		java.lang.String portCode) {
		return _dmPortRegionLocalService.findPortRegionByPortCodeName(portCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findDanhSachDmPortRegion(
		java.lang.String maritimeCode, java.lang.String portRegionName,
		java.lang.String portCode, int start, int end) {
		return _dmPortRegionLocalService.findDanhSachDmPortRegion(maritimeCode,
			portRegionName, portCode, start, end);
	}

	public int countDanhSachDmPortRegion(java.lang.String maritimeCode,
		java.lang.String portRegionName, java.lang.String portCode) {
		return _dmPortRegionLocalService.countDanhSachDmPortRegion(maritimeCode,
			portRegionName, portCode);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion getFirstPortRegion() {
		return _dmPortRegionLocalService.getFirstPortRegion();
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion getLastPortRegion() {
		return _dmPortRegionLocalService.getLastPortRegion();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmPortRegionLocalService getWrappedDmPortRegionLocalService() {
		return _dmPortRegionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmPortRegionLocalService(
		DmPortRegionLocalService dmPortRegionLocalService) {
		_dmPortRegionLocalService = dmPortRegionLocalService;
	}

	public DmPortRegionLocalService getWrappedService() {
		return _dmPortRegionLocalService;
	}

	public void setWrappedService(
		DmPortRegionLocalService dmPortRegionLocalService) {
		_dmPortRegionLocalService = dmPortRegionLocalService;
	}

	private DmPortRegionLocalService _dmPortRegionLocalService;
}