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
 * This class is a wrapper for {@link DmHistoryMaritimeLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryMaritimeLocalService
 * @generated
 */
public class DmHistoryMaritimeLocalServiceWrapper
	implements DmHistoryMaritimeLocalService,
		ServiceWrapper<DmHistoryMaritimeLocalService> {
	public DmHistoryMaritimeLocalServiceWrapper(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		_dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	/**
	* Adds the dm history maritime to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @return the dm history maritime that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime addDmHistoryMaritime(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.addDmHistoryMaritime(dmHistoryMaritime);
	}

	/**
	* Creates a new dm history maritime with the primary key. Does not add the dm history maritime to the database.
	*
	* @param id the primary key for the new dm history maritime
	* @return the new dm history maritime
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime createDmHistoryMaritime(
		int id) {
		return _dmHistoryMaritimeLocalService.createDmHistoryMaritime(id);
	}

	/**
	* Deletes the dm history maritime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history maritime
	* @throws PortalException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryMaritime(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryMaritimeLocalService.deleteDmHistoryMaritime(id);
	}

	/**
	* Deletes the dm history maritime from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryMaritime(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryMaritimeLocalService.deleteDmHistoryMaritime(dmHistoryMaritime);
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
		return _dmHistoryMaritimeLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryMaritimeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmHistoryMaritimeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmHistoryMaritimeLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryMaritime fetchDmHistoryMaritime(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.fetchDmHistoryMaritime(id);
	}

	/**
	* Returns the dm history maritime with the primary key.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime
	* @throws PortalException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime getDmHistoryMaritime(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getDmHistoryMaritime(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @return the range of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> getDmHistoryMaritimes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getDmHistoryMaritimes(start, end);
	}

	/**
	* Returns the number of dm history maritimes.
	*
	* @return the number of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryMaritimesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getDmHistoryMaritimesCount();
	}

	/**
	* Updates the dm history maritime in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @return the dm history maritime that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime updateDmHistoryMaritime(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.updateDmHistoryMaritime(dmHistoryMaritime);
	}

	/**
	* Updates the dm history maritime in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @param merge whether to merge the dm history maritime with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history maritime that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryMaritime updateDmHistoryMaritime(
		vn.gt.dao.danhmuc.model.DmHistoryMaritime dmHistoryMaritime,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.updateDmHistoryMaritime(dmHistoryMaritime,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryMaritimeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryMaritimeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryMaritime getByMaritimeCode(
		java.lang.String maritimeCode) {
		return _dmHistoryMaritimeLocalService.getByMaritimeCode(maritimeCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryMaritime> findAllDmHistoryMaritimeOrderAsc() {
		return _dmHistoryMaritimeLocalService.findAllDmHistoryMaritimeOrderAsc();
	}

	public vn.gt.dao.danhmuc.model.DmHistoryMaritime getByMaritimeCodeAndSyncVersion(
		java.lang.String maritimeCode, java.lang.String syncVersion) {
		return _dmHistoryMaritimeLocalService.getByMaritimeCodeAndSyncVersion(maritimeCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryMaritimeLocalService getWrappedDmHistoryMaritimeLocalService() {
		return _dmHistoryMaritimeLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryMaritimeLocalService(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		_dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	public DmHistoryMaritimeLocalService getWrappedService() {
		return _dmHistoryMaritimeLocalService;
	}

	public void setWrappedService(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		_dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	private DmHistoryMaritimeLocalService _dmHistoryMaritimeLocalService;
}