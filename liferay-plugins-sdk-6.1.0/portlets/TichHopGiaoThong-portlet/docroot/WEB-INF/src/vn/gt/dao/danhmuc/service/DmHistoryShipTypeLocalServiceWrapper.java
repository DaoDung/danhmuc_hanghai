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
 * This class is a wrapper for {@link DmHistoryShipTypeLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryShipTypeLocalService
 * @generated
 */
public class DmHistoryShipTypeLocalServiceWrapper
	implements DmHistoryShipTypeLocalService,
		ServiceWrapper<DmHistoryShipTypeLocalService> {
	public DmHistoryShipTypeLocalServiceWrapper(
		DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService) {
		_dmHistoryShipTypeLocalService = dmHistoryShipTypeLocalService;
	}

	/**
	* Adds the dm history ship type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryShipType the dm history ship type
	* @return the dm history ship type that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryShipType addDmHistoryShipType(
		vn.gt.dao.danhmuc.model.DmHistoryShipType dmHistoryShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.addDmHistoryShipType(dmHistoryShipType);
	}

	/**
	* Creates a new dm history ship type with the primary key. Does not add the dm history ship type to the database.
	*
	* @param id the primary key for the new dm history ship type
	* @return the new dm history ship type
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryShipType createDmHistoryShipType(
		int id) {
		return _dmHistoryShipTypeLocalService.createDmHistoryShipType(id);
	}

	/**
	* Deletes the dm history ship type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history ship type
	* @throws PortalException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryShipType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryShipTypeLocalService.deleteDmHistoryShipType(id);
	}

	/**
	* Deletes the dm history ship type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryShipType the dm history ship type
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryShipType(
		vn.gt.dao.danhmuc.model.DmHistoryShipType dmHistoryShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryShipTypeLocalService.deleteDmHistoryShipType(dmHistoryShipType);
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
		return _dmHistoryShipTypeLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryShipTypeLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
		return _dmHistoryShipTypeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmHistoryShipTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryShipType fetchDmHistoryShipType(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.fetchDmHistoryShipType(id);
	}

	/**
	* Returns the dm history ship type with the primary key.
	*
	* @param id the primary key of the dm history ship type
	* @return the dm history ship type
	* @throws PortalException if a dm history ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryShipType getDmHistoryShipType(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.getDmHistoryShipType(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history ship types
	* @param end the upper bound of the range of dm history ship types (not inclusive)
	* @return the range of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryShipType> getDmHistoryShipTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.getDmHistoryShipTypes(start, end);
	}

	/**
	* Returns the number of dm history ship types.
	*
	* @return the number of dm history ship types
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryShipTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.getDmHistoryShipTypesCount();
	}

	/**
	* Updates the dm history ship type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryShipType the dm history ship type
	* @return the dm history ship type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryShipType updateDmHistoryShipType(
		vn.gt.dao.danhmuc.model.DmHistoryShipType dmHistoryShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.updateDmHistoryShipType(dmHistoryShipType);
	}

	/**
	* Updates the dm history ship type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryShipType the dm history ship type
	* @param merge whether to merge the dm history ship type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history ship type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryShipType updateDmHistoryShipType(
		vn.gt.dao.danhmuc.model.DmHistoryShipType dmHistoryShipType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryShipTypeLocalService.updateDmHistoryShipType(dmHistoryShipType,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryShipTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryShipTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryShipType findByShipTypeCodeAndSyncVersion(
		java.lang.String shipTypeCode, java.lang.String syncVersion) {
		return _dmHistoryShipTypeLocalService.findByShipTypeCodeAndSyncVersion(shipTypeCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryShipTypeLocalService getWrappedDmHistoryShipTypeLocalService() {
		return _dmHistoryShipTypeLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryShipTypeLocalService(
		DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService) {
		_dmHistoryShipTypeLocalService = dmHistoryShipTypeLocalService;
	}

	public DmHistoryShipTypeLocalService getWrappedService() {
		return _dmHistoryShipTypeLocalService;
	}

	public void setWrappedService(
		DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService) {
		_dmHistoryShipTypeLocalService = dmHistoryShipTypeLocalService;
	}

	private DmHistoryShipTypeLocalService _dmHistoryShipTypeLocalService;
}