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
 * This class is a wrapper for {@link DmPassportTypeLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmPassportTypeLocalService
 * @generated
 */
public class DmPassportTypeLocalServiceWrapper
	implements DmPassportTypeLocalService,
		ServiceWrapper<DmPassportTypeLocalService> {
	public DmPassportTypeLocalServiceWrapper(
		DmPassportTypeLocalService dmPassportTypeLocalService) {
		_dmPassportTypeLocalService = dmPassportTypeLocalService;
	}

	/**
	* Adds the dm passport type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @return the dm passport type that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPassportType addDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.addDmPassportType(dmPassportType);
	}

	/**
	* Creates a new dm passport type with the primary key. Does not add the dm passport type to the database.
	*
	* @param id the primary key for the new dm passport type
	* @return the new dm passport type
	*/
	public vn.gt.dao.danhmuc.model.DmPassportType createDmPassportType(int id) {
		return _dmPassportTypeLocalService.createDmPassportType(id);
	}

	/**
	* Deletes the dm passport type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm passport type
	* @throws PortalException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPassportType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmPassportTypeLocalService.deleteDmPassportType(id);
	}

	/**
	* Deletes the dm passport type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmPassportTypeLocalService.deleteDmPassportType(dmPassportType);
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
		return _dmPassportTypeLocalService.dynamicQuery(dynamicQuery);
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
		return _dmPassportTypeLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmPassportTypeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmPassportTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmPassportType fetchDmPassportType(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.fetchDmPassportType(id);
	}

	/**
	* Returns the dm passport type with the primary key.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type
	* @throws PortalException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPassportType getDmPassportType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.getDmPassportType(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm passport types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm passport types
	* @param end the upper bound of the range of dm passport types (not inclusive)
	* @return the range of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmPassportType> getDmPassportTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.getDmPassportTypes(start, end);
	}

	/**
	* Returns the number of dm passport types.
	*
	* @return the number of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public int getDmPassportTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.getDmPassportTypesCount();
	}

	/**
	* Updates the dm passport type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @return the dm passport type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPassportType updateDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.updateDmPassportType(dmPassportType);
	}

	/**
	* Updates the dm passport type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @param merge whether to merge the dm passport type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm passport type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPassportType updateDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPassportTypeLocalService.updateDmPassportType(dmPassportType,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmPassportTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmPassportTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmPassportType getByPassportTypeCode(
		java.lang.String passportTypeCode) {
		return _dmPassportTypeLocalService.getByPassportTypeCode(passportTypeCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmPassportTypeLocalService getWrappedDmPassportTypeLocalService() {
		return _dmPassportTypeLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmPassportTypeLocalService(
		DmPassportTypeLocalService dmPassportTypeLocalService) {
		_dmPassportTypeLocalService = dmPassportTypeLocalService;
	}

	public DmPassportTypeLocalService getWrappedService() {
		return _dmPassportTypeLocalService;
	}

	public void setWrappedService(
		DmPassportTypeLocalService dmPassportTypeLocalService) {
		_dmPassportTypeLocalService = dmPassportTypeLocalService;
	}

	private DmPassportTypeLocalService _dmPassportTypeLocalService;
}