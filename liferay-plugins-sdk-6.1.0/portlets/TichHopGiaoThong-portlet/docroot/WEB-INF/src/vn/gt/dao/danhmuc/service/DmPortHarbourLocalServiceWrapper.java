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
 * This class is a wrapper for {@link DmPortHarbourLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmPortHarbourLocalService
 * @generated
 */
public class DmPortHarbourLocalServiceWrapper
	implements DmPortHarbourLocalService,
		ServiceWrapper<DmPortHarbourLocalService> {
	public DmPortHarbourLocalServiceWrapper(
		DmPortHarbourLocalService dmPortHarbourLocalService) {
		_dmPortHarbourLocalService = dmPortHarbourLocalService;
	}

	/**
	* Adds the dm port harbour to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @return the dm port harbour that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortHarbour addDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.addDmPortHarbour(dmPortHarbour);
	}

	/**
	* Creates a new dm port harbour with the primary key. Does not add the dm port harbour to the database.
	*
	* @param id the primary key for the new dm port harbour
	* @return the new dm port harbour
	*/
	public vn.gt.dao.danhmuc.model.DmPortHarbour createDmPortHarbour(int id) {
		return _dmPortHarbourLocalService.createDmPortHarbour(id);
	}

	/**
	* Deletes the dm port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port harbour
	* @throws PortalException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPortHarbour(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmPortHarbourLocalService.deleteDmPortHarbour(id);
	}

	/**
	* Deletes the dm port harbour from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPortHarbourLocalService.deleteDmPortHarbour(dmPortHarbour);
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
		return _dmPortHarbourLocalService.dynamicQuery(dynamicQuery);
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
		return _dmPortHarbourLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmPortHarbourLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _dmPortHarbourLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmPortHarbour fetchDmPortHarbour(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.fetchDmPortHarbour(id);
	}

	/**
	* Returns the dm port harbour with the primary key.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour
	* @throws PortalException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortHarbour getDmPortHarbour(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.getDmPortHarbour(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> getDmPortHarbours(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.getDmPortHarbours(start, end);
	}

	/**
	* Returns the number of dm port harbours.
	*
	* @return the number of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int getDmPortHarboursCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.getDmPortHarboursCount();
	}

	/**
	* Updates the dm port harbour in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @return the dm port harbour that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortHarbour updateDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.updateDmPortHarbour(dmPortHarbour);
	}

	/**
	* Updates the dm port harbour in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @param merge whether to merge the dm port harbour with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm port harbour that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortHarbour updateDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortHarbourLocalService.updateDmPortHarbour(dmPortHarbour,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmPortHarbourLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmPortHarbourLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmPortHarbour getByPortHarbourCode(
		java.lang.String portHarbourCode) {
		return _dmPortHarbourLocalService.getByPortHarbourCode(portHarbourCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode) {
		return _dmPortHarbourLocalService.findByPortRegionCode(portRegionCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegion(
		java.lang.String portRegion) {
		return _dmPortHarbourLocalService.findByPortRegion(portRegion);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findDanhSachDmPortHarbour(
		java.lang.String maritimeCode, java.lang.String portRegion,
		java.lang.String portHarbourName, int start, int end) {
		return _dmPortHarbourLocalService.findDanhSachDmPortHarbour(maritimeCode,
			portRegion, portHarbourName, start, end);
	}

	public int countDanhSachDmPortHarbour(java.lang.String maritimeCode,
		java.lang.String portRegion, java.lang.String portHarbourName) {
		return _dmPortHarbourLocalService.countDanhSachDmPortHarbour(maritimeCode,
			portRegion, portHarbourName);
	}

	public vn.gt.dao.danhmuc.model.DmPortHarbour getFirstPortHarbour() {
		return _dmPortHarbourLocalService.getFirstPortHarbour();
	}

	public vn.gt.dao.danhmuc.model.DmPortHarbour getLastPortHarbour() {
		return _dmPortHarbourLocalService.getLastPortHarbour();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmPortHarbourLocalService getWrappedDmPortHarbourLocalService() {
		return _dmPortHarbourLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmPortHarbourLocalService(
		DmPortHarbourLocalService dmPortHarbourLocalService) {
		_dmPortHarbourLocalService = dmPortHarbourLocalService;
	}

	public DmPortHarbourLocalService getWrappedService() {
		return _dmPortHarbourLocalService;
	}

	public void setWrappedService(
		DmPortHarbourLocalService dmPortHarbourLocalService) {
		_dmPortHarbourLocalService = dmPortHarbourLocalService;
	}

	private DmPortHarbourLocalService _dmPortHarbourLocalService;
}