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
 * The utility for the dm doc type local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmDocTypeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmDocTypeLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmDocTypeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmDocTypeLocalServiceImpl
 * @generated
 */
public class DmDocTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmDocTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm doc type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmDocType the dm doc type
	* @return the dm doc type that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType addDmDocType(
		vn.gt.dao.danhmuc.model.DmDocType dmDocType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmDocType(dmDocType);
	}

	/**
	* Creates a new dm doc type with the primary key. Does not add the dm doc type to the database.
	*
	* @param id the primary key for the new dm doc type
	* @return the new dm doc type
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType createDmDocType(int id) {
		return getService().createDmDocType(id);
	}

	/**
	* Deletes the dm doc type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm doc type
	* @throws PortalException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmDocType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmDocType(id);
	}

	/**
	* Deletes the dm doc type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmDocType the dm doc type
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmDocType(
		vn.gt.dao.danhmuc.model.DmDocType dmDocType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmDocType(dmDocType);
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

	public static vn.gt.dao.danhmuc.model.DmDocType fetchDmDocType(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmDocType(id);
	}

	/**
	* Returns the dm doc type with the primary key.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type
	* @throws PortalException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType getDmDocType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDocType(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @return the range of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDocType> getDmDocTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDocTypes(start, end);
	}

	/**
	* Returns the number of dm doc types.
	*
	* @return the number of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmDocTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDocTypesCount();
	}

	/**
	* Updates the dm doc type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmDocType the dm doc type
	* @return the dm doc type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType updateDmDocType(
		vn.gt.dao.danhmuc.model.DmDocType dmDocType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmDocType(dmDocType);
	}

	/**
	* Updates the dm doc type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmDocType the dm doc type
	* @param merge whether to merge the dm doc type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm doc type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDocType updateDmDocType(
		vn.gt.dao.danhmuc.model.DmDocType dmDocType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmDocType(dmDocType, merge);
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

	public static vn.gt.dao.danhmuc.model.DmDocType getByDocumentTypeCode(
		java.lang.String documentTypeCode) {
		return getService().getByDocumentTypeCode(documentTypeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmDocTypeLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmDocTypeLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmDocTypeLocalService.class.getName(), portletClassLoader);

			_service = new DmDocTypeLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmDocTypeLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmDocTypeLocalService.class);
		}

		return _service;
	}

	public void setService(DmDocTypeLocalService service) {
		MethodCache.remove(DmDocTypeLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmDocTypeLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmDocTypeLocalService.class);
	}

	private static DmDocTypeLocalService _service;
}