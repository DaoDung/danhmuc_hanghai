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

package vn.gt.dao.common.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link UserPortLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       UserPortLocalService
 * @generated
 */
public class UserPortLocalServiceWrapper implements UserPortLocalService,
	ServiceWrapper<UserPortLocalService> {
	public UserPortLocalServiceWrapper(
		UserPortLocalService userPortLocalService) {
		_userPortLocalService = userPortLocalService;
	}

	/**
	* Adds the user port to the database. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @return the user port that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserPort addUserPort(
		vn.gt.dao.common.model.UserPort userPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.addUserPort(userPort);
	}

	/**
	* Creates a new user port with the primary key. Does not add the user port to the database.
	*
	* @param id the primary key for the new user port
	* @return the new user port
	*/
	public vn.gt.dao.common.model.UserPort createUserPort(long id) {
		return _userPortLocalService.createUserPort(id);
	}

	/**
	* Deletes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user port
	* @throws PortalException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUserPort(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userPortLocalService.deleteUserPort(id);
	}

	/**
	* Deletes the user port from the database. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUserPort(vn.gt.dao.common.model.UserPort userPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userPortLocalService.deleteUserPort(userPort);
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
		return _userPortLocalService.dynamicQuery(dynamicQuery);
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
		return _userPortLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _userPortLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _userPortLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.common.model.UserPort fetchUserPort(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.fetchUserPort(id);
	}

	/**
	* Returns the user port with the primary key.
	*
	* @param id the primary key of the user port
	* @return the user port
	* @throws PortalException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserPort getUserPort(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.getUserPort(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user ports
	* @param end the upper bound of the range of user ports (not inclusive)
	* @return the range of user ports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserPort> getUserPorts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.getUserPorts(start, end);
	}

	/**
	* Returns the number of user ports.
	*
	* @return the number of user ports
	* @throws SystemException if a system exception occurred
	*/
	public int getUserPortsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.getUserPortsCount();
	}

	/**
	* Updates the user port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @return the user port that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserPort updateUserPort(
		vn.gt.dao.common.model.UserPort userPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.updateUserPort(userPort);
	}

	/**
	* Updates the user port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @param merge whether to merge the user port with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the user port that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserPort updateUserPort(
		vn.gt.dao.common.model.UserPort userPort, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userPortLocalService.updateUserPort(userPort, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _userPortLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userPortLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.gt.dao.common.model.UserPort> findByPortCode(
		java.lang.String portCode, int start, int end) {
		return _userPortLocalService.findByPortCode(portCode, start, end);
	}

	public vn.gt.dao.common.model.UserPort findByUserId(long userId) {
		return _userPortLocalService.findByUserId(userId);
	}

	public int countByPortCode(java.lang.String portHarbourCode) {
		return _userPortLocalService.countByPortCode(portHarbourCode);
	}

	public java.util.List<vn.gt.dao.common.model.UserPort> findAll(int start,
		int end) {
		return _userPortLocalService.findAll(start, end);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UserPortLocalService getWrappedUserPortLocalService() {
		return _userPortLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUserPortLocalService(
		UserPortLocalService userPortLocalService) {
		_userPortLocalService = userPortLocalService;
	}

	public UserPortLocalService getWrappedService() {
		return _userPortLocalService;
	}

	public void setWrappedService(UserPortLocalService userPortLocalService) {
		_userPortLocalService = userPortLocalService;
	}

	private UserPortLocalService _userPortLocalService;
}