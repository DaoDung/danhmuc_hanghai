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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the dm security level local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmSecurityLevelLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmSecurityLevelLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmSecurityLevelLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmSecurityLevelLocalServiceImpl
 * @generated
 */
public class DmSecurityLevelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmSecurityLevelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm security level to the database. Also notifies the appropriate model listeners.
	*
	* @param dmSecurityLevel the dm security level
	* @return the dm security level that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel addDmSecurityLevel(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmSecurityLevel(dmSecurityLevel);
	}

	/**
	* Creates a new dm security level with the primary key. Does not add the dm security level to the database.
	*
	* @param id the primary key for the new dm security level
	* @return the new dm security level
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel createDmSecurityLevel(
		int id) {
		return getService().createDmSecurityLevel(id);
	}

	/**
	* Deletes the dm security level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm security level
	* @throws PortalException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmSecurityLevel(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmSecurityLevel(id);
	}

	/**
	* Deletes the dm security level from the database. Also notifies the appropriate model listeners.
	*
	* @param dmSecurityLevel the dm security level
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmSecurityLevel(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmSecurityLevel(dmSecurityLevel);
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

	public static vn.gt.dao.danhmuc.model.DmSecurityLevel fetchDmSecurityLevel(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmSecurityLevel(id);
	}

	/**
	* Returns the dm security level with the primary key.
	*
	* @param id the primary key of the dm security level
	* @return the dm security level
	* @throws PortalException if a dm security level with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel getDmSecurityLevel(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmSecurityLevel(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm security levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm security levels
	* @param end the upper bound of the range of dm security levels (not inclusive)
	* @return the range of dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSecurityLevel> getDmSecurityLevels(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmSecurityLevels(start, end);
	}

	/**
	* Returns the number of dm security levels.
	*
	* @return the number of dm security levels
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmSecurityLevelsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmSecurityLevelsCount();
	}

	/**
	* Updates the dm security level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmSecurityLevel the dm security level
	* @return the dm security level that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel updateDmSecurityLevel(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmSecurityLevel(dmSecurityLevel);
	}

	/**
	* Updates the dm security level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmSecurityLevel the dm security level
	* @param merge whether to merge the dm security level with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm security level that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSecurityLevel updateDmSecurityLevel(
		vn.gt.dao.danhmuc.model.DmSecurityLevel dmSecurityLevel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmSecurityLevel(dmSecurityLevel, merge);
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

	public static vn.gt.dao.danhmuc.model.DmSecurityLevel getBySecurityLevelCode(
		java.lang.String securityLevelCode) {
		return getService().getBySecurityLevelCode(securityLevelCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmSecurityLevelLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmSecurityLevelLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmSecurityLevelLocalService.class.getName(),
					portletClassLoader);

			_service = new DmSecurityLevelLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmSecurityLevelLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmSecurityLevelLocalService.class);
		}

		return _service;
	}

	public void setService(DmSecurityLevelLocalService service) {
		MethodCache.remove(DmSecurityLevelLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmSecurityLevelLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmSecurityLevelLocalService.class);
	}

	private static DmSecurityLevelLocalService _service;
}