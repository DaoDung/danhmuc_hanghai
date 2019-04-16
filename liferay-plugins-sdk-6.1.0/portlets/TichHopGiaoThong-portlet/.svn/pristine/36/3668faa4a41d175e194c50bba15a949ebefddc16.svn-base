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
 * The utility for the dm passport type local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmPassportTypeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmPassportTypeLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmPassportTypeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmPassportTypeLocalServiceImpl
 * @generated
 */
public class DmPassportTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmPassportTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm passport type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @return the dm passport type that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPassportType addDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmPassportType(dmPassportType);
	}

	/**
	* Creates a new dm passport type with the primary key. Does not add the dm passport type to the database.
	*
	* @param id the primary key for the new dm passport type
	* @return the new dm passport type
	*/
	public static vn.gt.dao.danhmuc.model.DmPassportType createDmPassportType(
		int id) {
		return getService().createDmPassportType(id);
	}

	/**
	* Deletes the dm passport type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm passport type
	* @throws PortalException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPassportType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPassportType(id);
	}

	/**
	* Deletes the dm passport type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPassportType(dmPassportType);
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

	public static vn.gt.dao.danhmuc.model.DmPassportType fetchDmPassportType(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmPassportType(id);
	}

	/**
	* Returns the dm passport type with the primary key.
	*
	* @param id the primary key of the dm passport type
	* @return the dm passport type
	* @throws PortalException if a dm passport type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPassportType getDmPassportType(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPassportType(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPassportType> getDmPassportTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPassportTypes(start, end);
	}

	/**
	* Returns the number of dm passport types.
	*
	* @return the number of dm passport types
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmPassportTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPassportTypesCount();
	}

	/**
	* Updates the dm passport type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @return the dm passport type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPassportType updateDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPassportType(dmPassportType);
	}

	/**
	* Updates the dm passport type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPassportType the dm passport type
	* @param merge whether to merge the dm passport type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm passport type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPassportType updateDmPassportType(
		vn.gt.dao.danhmuc.model.DmPassportType dmPassportType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPassportType(dmPassportType, merge);
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

	public static vn.gt.dao.danhmuc.model.DmPassportType getByPassportTypeCode(
		java.lang.String passportTypeCode) {
		return getService().getByPassportTypeCode(passportTypeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmPassportTypeLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmPassportTypeLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmPassportTypeLocalService.class.getName(),
					portletClassLoader);

			_service = new DmPassportTypeLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmPassportTypeLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmPassportTypeLocalService.class);
		}

		return _service;
	}

	public void setService(DmPassportTypeLocalService service) {
		MethodCache.remove(DmPassportTypeLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmPassportTypeLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmPassportTypeLocalService.class);
	}

	private static DmPassportTypeLocalService _service;
}