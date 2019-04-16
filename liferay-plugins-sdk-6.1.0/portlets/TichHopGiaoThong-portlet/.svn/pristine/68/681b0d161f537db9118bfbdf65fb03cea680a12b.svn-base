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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the dm g t function type local service. This utility wraps {@link vn.gt.dao.danhmucgt.service.impl.DmGTFunctionTypeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmGTFunctionTypeLocalService
 * @see vn.gt.dao.danhmucgt.service.base.DmGTFunctionTypeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.impl.DmGTFunctionTypeLocalServiceImpl
 * @generated
 */
public class DmGTFunctionTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmucgt.service.impl.DmGTFunctionTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm g t function type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @return the dm g t function type that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTFunctionType addDmGTFunctionType(
		vn.gt.dao.danhmucgt.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmGTFunctionType(dmGTFunctionType);
	}

	/**
	* Creates a new dm g t function type with the primary key. Does not add the dm g t function type to the database.
	*
	* @param id the primary key for the new dm g t function type
	* @return the new dm g t function type
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTFunctionType createDmGTFunctionType(
		long id) {
		return getService().createDmGTFunctionType(id);
	}

	/**
	* Deletes the dm g t function type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t function type
	* @throws PortalException if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmGTFunctionType(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmGTFunctionType(id);
	}

	/**
	* Deletes the dm g t function type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmGTFunctionType(
		vn.gt.dao.danhmucgt.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmGTFunctionType(dmGTFunctionType);
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

	public static vn.gt.dao.danhmucgt.model.DmGTFunctionType fetchDmGTFunctionType(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmGTFunctionType(id);
	}

	/**
	* Returns the dm g t function type with the primary key.
	*
	* @param id the primary key of the dm g t function type
	* @return the dm g t function type
	* @throws PortalException if a dm g t function type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTFunctionType getDmGTFunctionType(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGTFunctionType(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm g t function types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t function types
	* @param end the upper bound of the range of dm g t function types (not inclusive)
	* @return the range of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTFunctionType> getDmGTFunctionTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGTFunctionTypes(start, end);
	}

	/**
	* Returns the number of dm g t function types.
	*
	* @return the number of dm g t function types
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmGTFunctionTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGTFunctionTypesCount();
	}

	/**
	* Updates the dm g t function type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @return the dm g t function type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTFunctionType updateDmGTFunctionType(
		vn.gt.dao.danhmucgt.model.DmGTFunctionType dmGTFunctionType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmGTFunctionType(dmGTFunctionType);
	}

	/**
	* Updates the dm g t function type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGTFunctionType the dm g t function type
	* @param merge whether to merge the dm g t function type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm g t function type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTFunctionType updateDmGTFunctionType(
		vn.gt.dao.danhmucgt.model.DmGTFunctionType dmGTFunctionType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmGTFunctionType(dmGTFunctionType, merge);
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

	public static java.lang.String findNameByFunctionTypeCode(
		java.lang.String functionTypeCode) {
		return getService().findNameByFunctionTypeCode(functionTypeCode);
	}

	public static int countByFunctionTypeCode(java.lang.String functionTypeCode) {
		return getService().countByFunctionTypeCode(functionTypeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmGTFunctionTypeLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmGTFunctionTypeLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmGTFunctionTypeLocalService.class.getName(),
					portletClassLoader);

			_service = new DmGTFunctionTypeLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmGTFunctionTypeLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmGTFunctionTypeLocalService.class);
		}

		return _service;
	}

	public void setService(DmGTFunctionTypeLocalService service) {
		MethodCache.remove(DmGTFunctionTypeLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmGTFunctionTypeLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmGTFunctionTypeLocalService.class);
	}

	private static DmGTFunctionTypeLocalService _service;
}