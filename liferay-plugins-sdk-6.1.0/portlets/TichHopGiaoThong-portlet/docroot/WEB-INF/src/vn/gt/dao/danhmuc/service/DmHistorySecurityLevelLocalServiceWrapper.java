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
 * This class is a wrapper for {@link DmHistorySecurityLevelLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistorySecurityLevelLocalService
 * @generated
 */
public class DmHistorySecurityLevelLocalServiceWrapper
	implements DmHistorySecurityLevelLocalService,
		ServiceWrapper<DmHistorySecurityLevelLocalService> {
	public DmHistorySecurityLevelLocalServiceWrapper(
		DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService) {
		_dmHistorySecurityLevelLocalService = dmHistorySecurityLevelLocalService;
	}

	/**
	* Adds the dm history security level to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistorySecurityLevel the dm history security level
	* @return the dm history security level that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel addDmHistorySecurityLevel(
		vn.gt.dao.danhmuc.model.DmHistorySecurityLevel dmHistorySecurityLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.addDmHistorySecurityLevel(dmHistorySecurityLevel);
	}

	/**
	* Creates a new dm history security level with the primary key. Does not add the dm history security level to the database.
	*
	* @param id the primary key for the new dm history security level
	* @return the new dm history security level
	*/
	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel createDmHistorySecurityLevel(
		int id) {
		return _dmHistorySecurityLevelLocalService.createDmHistorySecurityLevel(id);
	}

	/**
	* Deletes the dm history security level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history security level
	* @throws PortalException if a dm history security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistorySecurityLevel(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistorySecurityLevelLocalService.deleteDmHistorySecurityLevel(id);
	}

	/**
	* Deletes the dm history security level from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistorySecurityLevel the dm history security level
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistorySecurityLevel(
		vn.gt.dao.danhmuc.model.DmHistorySecurityLevel dmHistorySecurityLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistorySecurityLevelLocalService.deleteDmHistorySecurityLevel(dmHistorySecurityLevel);
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
		return _dmHistorySecurityLevelLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistorySecurityLevelLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistorySecurityLevelLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistorySecurityLevelLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel fetchDmHistorySecurityLevel(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.fetchDmHistorySecurityLevel(id);
	}

	/**
	* Returns the dm history security level with the primary key.
	*
	* @param id the primary key of the dm history security level
	* @return the dm history security level
	* @throws PortalException if a dm history security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel getDmHistorySecurityLevel(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.getDmHistorySecurityLevel(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history security levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history security levels
	* @param end the upper bound of the range of dm history security levels (not inclusive)
	* @return the range of dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistorySecurityLevel> getDmHistorySecurityLevels(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.getDmHistorySecurityLevels(start,
			end);
	}

	/**
	* Returns the number of dm history security levels.
	*
	* @return the number of dm history security levels
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistorySecurityLevelsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.getDmHistorySecurityLevelsCount();
	}

	/**
	* Updates the dm history security level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistorySecurityLevel the dm history security level
	* @return the dm history security level that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel updateDmHistorySecurityLevel(
		vn.gt.dao.danhmuc.model.DmHistorySecurityLevel dmHistorySecurityLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.updateDmHistorySecurityLevel(dmHistorySecurityLevel);
	}

	/**
	* Updates the dm history security level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistorySecurityLevel the dm history security level
	* @param merge whether to merge the dm history security level with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history security level that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel updateDmHistorySecurityLevel(
		vn.gt.dao.danhmuc.model.DmHistorySecurityLevel dmHistorySecurityLevel,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistorySecurityLevelLocalService.updateDmHistorySecurityLevel(dmHistorySecurityLevel,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistorySecurityLevelLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistorySecurityLevelLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistorySecurityLevel getBySecurityLevelCodeAndSyncVersion(
		java.lang.String securityLevelCode, java.lang.String syncVersion) {
		return _dmHistorySecurityLevelLocalService.getBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistorySecurityLevelLocalService getWrappedDmHistorySecurityLevelLocalService() {
		return _dmHistorySecurityLevelLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistorySecurityLevelLocalService(
		DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService) {
		_dmHistorySecurityLevelLocalService = dmHistorySecurityLevelLocalService;
	}

	public DmHistorySecurityLevelLocalService getWrappedService() {
		return _dmHistorySecurityLevelLocalService;
	}

	public void setWrappedService(
		DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService) {
		_dmHistorySecurityLevelLocalService = dmHistorySecurityLevelLocalService;
	}

	private DmHistorySecurityLevelLocalService _dmHistorySecurityLevelLocalService;
}