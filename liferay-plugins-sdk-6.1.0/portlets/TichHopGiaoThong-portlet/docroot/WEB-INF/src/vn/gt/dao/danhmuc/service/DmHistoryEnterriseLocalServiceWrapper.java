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
 * This class is a wrapper for {@link DmHistoryEnterriseLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryEnterriseLocalService
 * @generated
 */
public class DmHistoryEnterriseLocalServiceWrapper
	implements DmHistoryEnterriseLocalService,
		ServiceWrapper<DmHistoryEnterriseLocalService> {
	public DmHistoryEnterriseLocalServiceWrapper(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		_dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	/**
	* Adds the dm history enterrise to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @return the dm history enterrise that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise addDmHistoryEnterrise(
		vn.gt.dao.danhmuc.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.addDmHistoryEnterrise(dmHistoryEnterrise);
	}

	/**
	* Creates a new dm history enterrise with the primary key. Does not add the dm history enterrise to the database.
	*
	* @param id the primary key for the new dm history enterrise
	* @return the new dm history enterrise
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise createDmHistoryEnterrise(
		int id) {
		return _dmHistoryEnterriseLocalService.createDmHistoryEnterrise(id);
	}

	/**
	* Deletes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history enterrise
	* @throws PortalException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryEnterrise(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryEnterriseLocalService.deleteDmHistoryEnterrise(id);
	}

	/**
	* Deletes the dm history enterrise from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryEnterrise(
		vn.gt.dao.danhmuc.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryEnterriseLocalService.deleteDmHistoryEnterrise(dmHistoryEnterrise);
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
		return _dmHistoryEnterriseLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryEnterriseLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryEnterriseLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryEnterriseLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise fetchDmHistoryEnterrise(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.fetchDmHistoryEnterrise(id);
	}

	/**
	* Returns the dm history enterrise with the primary key.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise
	* @throws PortalException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise getDmHistoryEnterrise(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getDmHistoryEnterrise(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryEnterrise> getDmHistoryEnterrises(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getDmHistoryEnterrises(start, end);
	}

	/**
	* Returns the number of dm history enterrises.
	*
	* @return the number of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryEnterrisesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getDmHistoryEnterrisesCount();
	}

	/**
	* Updates the dm history enterrise in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @return the dm history enterrise that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise updateDmHistoryEnterrise(
		vn.gt.dao.danhmuc.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.updateDmHistoryEnterrise(dmHistoryEnterrise);
	}

	/**
	* Updates the dm history enterrise in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @param merge whether to merge the dm history enterrise with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history enterrise that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryEnterrise updateDmHistoryEnterrise(
		vn.gt.dao.danhmuc.model.DmHistoryEnterrise dmHistoryEnterrise,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.updateDmHistoryEnterrise(dmHistoryEnterrise,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryEnterriseLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryEnterriseLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryEnterriseLocalService getWrappedDmHistoryEnterriseLocalService() {
		return _dmHistoryEnterriseLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryEnterriseLocalService(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		_dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	public DmHistoryEnterriseLocalService getWrappedService() {
		return _dmHistoryEnterriseLocalService;
	}

	public void setWrappedService(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		_dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	private DmHistoryEnterriseLocalService _dmHistoryEnterriseLocalService;
}