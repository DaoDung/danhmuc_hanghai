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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the user sign local service. This utility wraps {@link vn.gt.dao.common.service.impl.UserSignLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see UserSignLocalService
 * @see vn.gt.dao.common.service.base.UserSignLocalServiceBaseImpl
 * @see vn.gt.dao.common.service.impl.UserSignLocalServiceImpl
 * @generated
 */
public class UserSignLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.common.service.impl.UserSignLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user sign to the database. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @return the user sign that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserSign addUserSign(
		vn.gt.dao.common.model.UserSign userSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserSign(userSign);
	}

	/**
	* Creates a new user sign with the primary key. Does not add the user sign to the database.
	*
	* @param id the primary key for the new user sign
	* @return the new user sign
	*/
	public static vn.gt.dao.common.model.UserSign createUserSign(long id) {
		return getService().createUserSign(id);
	}

	/**
	* Deletes the user sign with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user sign
	* @throws PortalException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteUserSign(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserSign(id);
	}

	/**
	* Deletes the user sign from the database. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteUserSign(vn.gt.dao.common.model.UserSign userSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserSign(userSign);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static vn.gt.dao.common.model.UserSign fetchUserSign(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserSign(id);
	}

	/**
	* Returns the user sign with the primary key.
	*
	* @param id the primary key of the user sign
	* @return the user sign
	* @throws PortalException if a user sign with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserSign getUserSign(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSign(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.gt.dao.common.model.UserSign> getUserSigns(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSigns(start, end);
	}

	/**
	* Returns the number of user signs.
	*
	* @return the number of user signs
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserSignsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSignsCount();
	}

	/**
	* Updates the user sign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @return the user sign that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserSign updateUserSign(
		vn.gt.dao.common.model.UserSign userSign)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserSign(userSign);
	}

	/**
	* Updates the user sign in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSign the user sign
	* @param merge whether to merge the user sign with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the user sign that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserSign updateUserSign(
		vn.gt.dao.common.model.UserSign userSign, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserSign(userSign, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static void deleteUserSignById(long userSignId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserSignById(userSignId);
	}

	public static vn.gt.dao.common.model.UserSign updateUserSign(long userId,
		long userSignId, long accountId, java.lang.String maritimeCode,
		java.lang.String title, java.lang.String representative,
		java.lang.String chungThuSoName, java.io.File chungThuSoFile,
		boolean deleteFileChungThuSo, java.lang.String chuKySoName,
		java.io.File chuKySoFile, boolean deleteFileChuKySo,
		java.lang.String conDauName, java.io.File conDauFile,
		boolean deleteFileConDau)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateUserSign(userId, userSignId, accountId, maritimeCode,
			title, representative, chungThuSoName, chungThuSoFile,
			deleteFileChungThuSo, chuKySoName, chuKySoFile, deleteFileChuKySo,
			conDauName, conDauFile, deleteFileConDau);
	}

	public static vn.gt.dao.common.model.UserSign getByUserId(long userId) {
		return getService().getByUserId(userId);
	}

	public static java.util.List<vn.gt.dao.common.model.UserSign> getByPortCode(
		java.lang.String portCode, int start, int end) {
		return getService().getByPortCode(portCode, start, end);
	}

	public static int countByPortCode(java.lang.String portCode) {
		return getService().countByPortCode(portCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserSignLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserSignLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					UserSignLocalService.class.getName(), portletClassLoader);

			_service = new UserSignLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(UserSignLocalServiceUtil.class,
				"_service");
			MethodCache.remove(UserSignLocalService.class);
		}

		return _service;
	}

	public void setService(UserSignLocalService service) {
		MethodCache.remove(UserSignLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(UserSignLocalServiceUtil.class,
			"_service");
		MethodCache.remove(UserSignLocalService.class);
	}

	private static UserSignLocalService _service;
}