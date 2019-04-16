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
 * This class is a wrapper for {@link DmRepresentativeLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmRepresentativeLocalService
 * @generated
 */
public class DmRepresentativeLocalServiceWrapper
	implements DmRepresentativeLocalService,
		ServiceWrapper<DmRepresentativeLocalService> {
	public DmRepresentativeLocalServiceWrapper(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		_dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	/**
	* Adds the dm representative to the database. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @return the dm representative that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative addDmRepresentative(
		vn.gt.dao.danhmuc.model.DmRepresentative dmRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.addDmRepresentative(dmRepresentative);
	}

	/**
	* Creates a new dm representative with the primary key. Does not add the dm representative to the database.
	*
	* @param id the primary key for the new dm representative
	* @return the new dm representative
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative createDmRepresentative(
		int id) {
		return _dmRepresentativeLocalService.createDmRepresentative(id);
	}

	/**
	* Deletes the dm representative with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm representative
	* @throws PortalException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmRepresentative(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmRepresentativeLocalService.deleteDmRepresentative(id);
	}

	/**
	* Deletes the dm representative from the database. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmRepresentative(
		vn.gt.dao.danhmuc.model.DmRepresentative dmRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmRepresentativeLocalService.deleteDmRepresentative(dmRepresentative);
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
		return _dmRepresentativeLocalService.dynamicQuery(dynamicQuery);
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
		return _dmRepresentativeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmRepresentativeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmRepresentativeLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmRepresentative fetchDmRepresentative(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.fetchDmRepresentative(id);
	}

	/**
	* Returns the dm representative with the primary key.
	*
	* @param id the primary key of the dm representative
	* @return the dm representative
	* @throws PortalException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative getDmRepresentative(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getDmRepresentative(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm representatives
	* @param end the upper bound of the range of dm representatives (not inclusive)
	* @return the range of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> getDmRepresentatives(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getDmRepresentatives(start, end);
	}

	/**
	* Returns the number of dm representatives.
	*
	* @return the number of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public int getDmRepresentativesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.getDmRepresentativesCount();
	}

	/**
	* Updates the dm representative in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @return the dm representative that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative updateDmRepresentative(
		vn.gt.dao.danhmuc.model.DmRepresentative dmRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.updateDmRepresentative(dmRepresentative);
	}

	/**
	* Updates the dm representative in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmRepresentative the dm representative
	* @param merge whether to merge the dm representative with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm representative that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative updateDmRepresentative(
		vn.gt.dao.danhmuc.model.DmRepresentative dmRepresentative, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmRepresentativeLocalService.updateDmRepresentative(dmRepresentative,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmRepresentativeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmRepresentativeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmRepresentative getByRepCode(
		java.lang.String repCode) {
		return _dmRepresentativeLocalService.getByRepCode(repCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findByMaritimeCode(
		java.lang.String maritimeCode) {
		return _dmRepresentativeLocalService.findByMaritimeCode(maritimeCode);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findDanhSachDmRepresentative(
		java.lang.String maritimeCode, int start, int end) {
		return _dmRepresentativeLocalService.findDanhSachDmRepresentative(maritimeCode,
			start, end);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findDmRepresentativeByMaritimeCode(
		java.lang.String maritimeCode) {
		return _dmRepresentativeLocalService.findDmRepresentativeByMaritimeCode(maritimeCode);
	}

	public int countDanhSachDmRepresentative(java.lang.String maritimeCode) {
		return _dmRepresentativeLocalService.countDanhSachDmRepresentative(maritimeCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmRepresentativeLocalService getWrappedDmRepresentativeLocalService() {
		return _dmRepresentativeLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmRepresentativeLocalService(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		_dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	public DmRepresentativeLocalService getWrappedService() {
		return _dmRepresentativeLocalService;
	}

	public void setWrappedService(
		DmRepresentativeLocalService dmRepresentativeLocalService) {
		_dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	private DmRepresentativeLocalService _dmRepresentativeLocalService;
}