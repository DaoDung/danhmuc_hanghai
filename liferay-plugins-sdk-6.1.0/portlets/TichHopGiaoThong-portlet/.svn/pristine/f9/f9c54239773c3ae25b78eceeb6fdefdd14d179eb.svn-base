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
 * The utility for the user port local service. This utility wraps {@link vn.gt.dao.common.service.impl.UserPortLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see UserPortLocalService
 * @see vn.gt.dao.common.service.base.UserPortLocalServiceBaseImpl
 * @see vn.gt.dao.common.service.impl.UserPortLocalServiceImpl
 * @generated
 */
public class UserPortLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.common.service.impl.UserPortLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user port to the database. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @return the user port that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort addUserPort(
		vn.gt.dao.common.model.UserPort userPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserPort(userPort);
	}

	/**
	* Creates a new user port with the primary key. Does not add the user port to the database.
	*
	* @param id the primary key for the new user port
	* @return the new user port
	*/
	public static vn.gt.dao.common.model.UserPort createUserPort(long id) {
		return getService().createUserPort(id);
	}

	/**
	* Deletes the user port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the user port
	* @throws PortalException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteUserPort(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserPort(id);
	}

	/**
	* Deletes the user port from the database. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteUserPort(vn.gt.dao.common.model.UserPort userPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteUserPort(userPort);
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

	public static vn.gt.dao.common.model.UserPort fetchUserPort(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserPort(id);
	}

	/**
	* Returns the user port with the primary key.
	*
	* @param id the primary key of the user port
	* @return the user port
	* @throws PortalException if a user port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort getUserPort(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserPort(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.gt.dao.common.model.UserPort> getUserPorts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserPorts(start, end);
	}

	/**
	* Returns the number of user ports.
	*
	* @return the number of user ports
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserPortsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserPortsCount();
	}

	/**
	* Updates the user port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @return the user port that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort updateUserPort(
		vn.gt.dao.common.model.UserPort userPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserPort(userPort);
	}

	/**
	* Updates the user port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userPort the user port
	* @param merge whether to merge the user port with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the user port that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.common.model.UserPort updateUserPort(
		vn.gt.dao.common.model.UserPort userPort, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserPort(userPort, merge);
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

	public static java.util.List<vn.gt.dao.common.model.UserPort> findByPortCode(
		java.lang.String portCode, int start, int end) {
		return getService().findByPortCode(portCode, start, end);
	}

	public static vn.gt.dao.common.model.UserPort findByUserId(long userId) {
		return getService().findByUserId(userId);
	}

	public static int countByPortCode(java.lang.String portHarbourCode) {
		return getService().countByPortCode(portHarbourCode);
	}

	public static java.util.List<vn.gt.dao.common.model.UserPort> findAll(
		int start, int end) {
		return getService().findAll(start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserPortLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserPortLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					UserPortLocalService.class.getName(), portletClassLoader);

			_service = new UserPortLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(UserPortLocalServiceUtil.class,
				"_service");
			MethodCache.remove(UserPortLocalService.class);
		}

		return _service;
	}

	public void setService(UserPortLocalService service) {
		MethodCache.remove(UserPortLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(UserPortLocalServiceUtil.class,
			"_service");
		MethodCache.remove(UserPortLocalService.class);
	}

	private static UserPortLocalService _service;
}