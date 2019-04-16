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
 * This class is a wrapper for {@link DmUnitGeneralLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmUnitGeneralLocalService
 * @generated
 */
public class DmUnitGeneralLocalServiceWrapper
	implements DmUnitGeneralLocalService,
		ServiceWrapper<DmUnitGeneralLocalService> {
	public DmUnitGeneralLocalServiceWrapper(
		DmUnitGeneralLocalService dmUnitGeneralLocalService) {
		_dmUnitGeneralLocalService = dmUnitGeneralLocalService;
	}

	/**
	* Adds the dm unit general to the database. Also notifies the appropriate model listeners.
	*
	* @param dmUnitGeneral the dm unit general
	* @return the dm unit general that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmUnitGeneral addDmUnitGeneral(
		vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.addDmUnitGeneral(dmUnitGeneral);
	}

	/**
	* Creates a new dm unit general with the primary key. Does not add the dm unit general to the database.
	*
	* @param id the primary key for the new dm unit general
	* @return the new dm unit general
	*/
	public vn.gt.dao.danhmuc.model.DmUnitGeneral createDmUnitGeneral(int id) {
		return _dmUnitGeneralLocalService.createDmUnitGeneral(id);
	}

	/**
	* Deletes the dm unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm unit general
	* @throws PortalException if a dm unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmUnitGeneral(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmUnitGeneralLocalService.deleteDmUnitGeneral(id);
	}

	/**
	* Deletes the dm unit general from the database. Also notifies the appropriate model listeners.
	*
	* @param dmUnitGeneral the dm unit general
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmUnitGeneral(
		vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmUnitGeneralLocalService.deleteDmUnitGeneral(dmUnitGeneral);
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
		return _dmUnitGeneralLocalService.dynamicQuery(dynamicQuery);
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
		return _dmUnitGeneralLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmUnitGeneralLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmUnitGeneralLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmUnitGeneral fetchDmUnitGeneral(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.fetchDmUnitGeneral(id);
	}

	/**
	* Returns the dm unit general with the primary key.
	*
	* @param id the primary key of the dm unit general
	* @return the dm unit general
	* @throws PortalException if a dm unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmUnitGeneral getDmUnitGeneral(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.getDmUnitGeneral(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm unit generals
	* @param end the upper bound of the range of dm unit generals (not inclusive)
	* @return the range of dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> getDmUnitGenerals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.getDmUnitGenerals(start, end);
	}

	/**
	* Returns the number of dm unit generals.
	*
	* @return the number of dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public int getDmUnitGeneralsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.getDmUnitGeneralsCount();
	}

	/**
	* Updates the dm unit general in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmUnitGeneral the dm unit general
	* @return the dm unit general that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmUnitGeneral updateDmUnitGeneral(
		vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.updateDmUnitGeneral(dmUnitGeneral);
	}

	/**
	* Updates the dm unit general in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmUnitGeneral the dm unit general
	* @param merge whether to merge the dm unit general with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm unit general that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmUnitGeneral updateDmUnitGeneral(
		vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmUnitGeneralLocalService.updateDmUnitGeneral(dmUnitGeneral,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmUnitGeneralLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmUnitGeneralLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmUnitGeneral getByUnitCode(
		java.lang.String unitCode) {
		return _dmUnitGeneralLocalService.getByUnitCode(unitCode);
	}

	public vn.gt.dao.danhmuc.model.DmUnitGeneral getByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion) {
		return _dmUnitGeneralLocalService.getByUnitCodeAndSyncVersion(unitCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmUnitGeneralLocalService getWrappedDmUnitGeneralLocalService() {
		return _dmUnitGeneralLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmUnitGeneralLocalService(
		DmUnitGeneralLocalService dmUnitGeneralLocalService) {
		_dmUnitGeneralLocalService = dmUnitGeneralLocalService;
	}

	public DmUnitGeneralLocalService getWrappedService() {
		return _dmUnitGeneralLocalService;
	}

	public void setWrappedService(
		DmUnitGeneralLocalService dmUnitGeneralLocalService) {
		_dmUnitGeneralLocalService = dmUnitGeneralLocalService;
	}

	private DmUnitGeneralLocalService _dmUnitGeneralLocalService;
}