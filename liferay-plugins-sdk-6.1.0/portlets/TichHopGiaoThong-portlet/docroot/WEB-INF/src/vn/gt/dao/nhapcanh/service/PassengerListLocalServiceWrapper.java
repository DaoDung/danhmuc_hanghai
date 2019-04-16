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

package vn.gt.dao.nhapcanh.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link PassengerListLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       PassengerListLocalService
 * @generated
 */
public class PassengerListLocalServiceWrapper
	implements PassengerListLocalService,
		ServiceWrapper<PassengerListLocalService> {
	public PassengerListLocalServiceWrapper(
		PassengerListLocalService passengerListLocalService) {
		_passengerListLocalService = passengerListLocalService;
	}

	/**
	* Adds the passenger list to the database. Also notifies the appropriate model listeners.
	*
	* @param passengerList the passenger list
	* @return the passenger list that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList addPassengerList(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.addPassengerList(passengerList);
	}

	/**
	* Creates a new passenger list with the primary key. Does not add the passenger list to the database.
	*
	* @param id the primary key for the new passenger list
	* @return the new passenger list
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList createPassengerList(long id) {
		return _passengerListLocalService.createPassengerList(id);
	}

	/**
	* Deletes the passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the passenger list
	* @throws PortalException if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deletePassengerList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_passengerListLocalService.deletePassengerList(id);
	}

	/**
	* Deletes the passenger list from the database. Also notifies the appropriate model listeners.
	*
	* @param passengerList the passenger list
	* @throws SystemException if a system exception occurred
	*/
	public void deletePassengerList(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList)
		throws com.liferay.portal.kernel.exception.SystemException {
		_passengerListLocalService.deletePassengerList(passengerList);
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
		return _passengerListLocalService.dynamicQuery(dynamicQuery);
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
		return _passengerListLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _passengerListLocalService.dynamicQuery(dynamicQuery, start,
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
		return _passengerListLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.nhapcanh.model.PassengerList fetchPassengerList(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.fetchPassengerList(id);
	}

	/**
	* Returns the passenger list with the primary key.
	*
	* @param id the primary key of the passenger list
	* @return the passenger list
	* @throws PortalException if a passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList getPassengerList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.getPassengerList(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the passenger lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of passenger lists
	* @param end the upper bound of the range of passenger lists (not inclusive)
	* @return the range of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.PassengerList> getPassengerLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.getPassengerLists(start, end);
	}

	/**
	* Returns the number of passenger lists.
	*
	* @return the number of passenger lists
	* @throws SystemException if a system exception occurred
	*/
	public int getPassengerListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.getPassengerListsCount();
	}

	/**
	* Updates the passenger list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param passengerList the passenger list
	* @return the passenger list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList updatePassengerList(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.updatePassengerList(passengerList);
	}

	/**
	* Updates the passenger list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param passengerList the passenger list
	* @param merge whether to merge the passenger list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the passenger list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.PassengerList updatePassengerList(
		vn.gt.dao.nhapcanh.model.PassengerList passengerList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _passengerListLocalService.updatePassengerList(passengerList,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _passengerListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_passengerListLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public PassengerListLocalService getWrappedPassengerListLocalService() {
		return _passengerListLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedPassengerListLocalService(
		PassengerListLocalService passengerListLocalService) {
		_passengerListLocalService = passengerListLocalService;
	}

	public PassengerListLocalService getWrappedService() {
		return _passengerListLocalService;
	}

	public void setWrappedService(
		PassengerListLocalService passengerListLocalService) {
		_passengerListLocalService = passengerListLocalService;
	}

	private PassengerListLocalService _passengerListLocalService;
}