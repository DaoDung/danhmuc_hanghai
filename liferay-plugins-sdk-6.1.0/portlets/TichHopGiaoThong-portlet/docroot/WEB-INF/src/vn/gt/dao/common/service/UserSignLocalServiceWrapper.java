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
 * This class is a wrapper for {@link UserSignLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       UserSignLocalService
 * @generated
 */
public class UserSignLocalServiceWrapper implements UserSignLocalService,
	ServiceWrapper<UserSignLocalService> {
	public UserSignLocalServiceWrapper(
		UserSignLocalService userSignLocalService) {
		_userSignLocalService = userSignLocalService;
	}

	/**
	* Adds the user sign to the database. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @return the user sign that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign addUserSign(
		vn.gt.dao.common.model.UserSign userSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.addUserSign(userSign);
	}

	/**
	* Creates a new user sign with the primary key. Does not add the user sign to the database.
	*
	* @param id the primary key for the new user sign
	* @return the new user sign
	*/
	public vn.gt.dao.common.model.UserSign createUserSign(long id) {
		return _userSignLocalService.createUserSign(id);
	}

	/**
	* Deletes the user sign with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user sign
	* @throws PortalException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUserSign(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_userSignLocalService.deleteUserSign(id);
	}

	/**
	* Deletes the user sign from the database. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @throws SystemException if a system exception occurred
	*/
	public void deleteUserSign(vn.gt.dao.common.model.UserSign userSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userSignLocalService.deleteUserSign(userSign);
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
		return _userSignLocalService.dynamicQuery(dynamicQuery);
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
		return _userSignLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _userSignLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _userSignLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.common.model.UserSign fetchUserSign(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.fetchUserSign(id);
	}

	/**
	* Returns the user sign with the primary key.
	*
	* @param id the primary key of the user sign
	* @return the user sign
	* @throws PortalException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign getUserSign(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.getUserSign(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user signs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user signs
	* @param end the upper bound of the range of user signs (not inclusive)
	* @return the range of user signs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.common.model.UserSign> getUserSigns(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.getUserSigns(start, end);
	}

	/**
	* Returns the number of user signs.
	*
	* @return the number of user signs
	* @throws SystemException if a system exception occurred
	*/
	public int getUserSignsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.getUserSignsCount();
	}

	/**
	* Updates the user sign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @return the user sign that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign updateUserSign(
		vn.gt.dao.common.model.UserSign userSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.updateUserSign(userSign);
	}

	/**
	* Updates the user sign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @param merge whether to merge the user sign with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the user sign that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.common.model.UserSign updateUserSign(
		vn.gt.dao.common.model.UserSign userSign, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.updateUserSign(userSign, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _userSignLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userSignLocalService.setBeanIdentifier(beanIdentifier);
	}

	public void deleteUserSignById(long userSignId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_userSignLocalService.deleteUserSignById(userSignId);
	}

	public vn.gt.dao.common.model.UserSign updateUserSign(long userId,
		long userSignId, long accountId, java.lang.String maritimeCode,
		java.lang.String title, java.lang.String representative,
		java.lang.String chungThuSoName, java.io.File chungThuSoFile,
		boolean deleteFileChungThuSo, java.lang.String chuKySoName,
		java.io.File chuKySoFile, boolean deleteFileChuKySo,
		java.lang.String conDauName, java.io.File conDauFile,
		boolean deleteFileConDau)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSignLocalService.updateUserSign(userId, userSignId,
			accountId, maritimeCode, title, representative, chungThuSoName,
			chungThuSoFile, deleteFileChungThuSo, chuKySoName, chuKySoFile,
			deleteFileChuKySo, conDauName, conDauFile, deleteFileConDau);
	}

	public vn.gt.dao.common.model.UserSign getByUserId(long userId) {
		return _userSignLocalService.getByUserId(userId);
	}

	public java.util.List<vn.gt.dao.common.model.UserSign> getByPortCode(
		java.lang.String portCode, int start, int end) {
		return _userSignLocalService.getByPortCode(portCode, start, end);
	}

	public int countByPortCode(java.lang.String portCode) {
		return _userSignLocalService.countByPortCode(portCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UserSignLocalService getWrappedUserSignLocalService() {
		return _userSignLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUserSignLocalService(
		UserSignLocalService userSignLocalService) {
		_userSignLocalService = userSignLocalService;
	}

	public UserSignLocalService getWrappedService() {
		return _userSignLocalService;
	}

	public void setWrappedService(UserSignLocalService userSignLocalService) {
		_userSignLocalService = userSignLocalService;
	}

	private UserSignLocalService _userSignLocalService;
}