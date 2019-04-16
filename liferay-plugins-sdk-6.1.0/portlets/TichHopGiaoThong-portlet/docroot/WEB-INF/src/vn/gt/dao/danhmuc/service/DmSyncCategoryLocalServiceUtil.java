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
 * The utility for the dm sync category local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmSyncCategoryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmSyncCategoryLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmSyncCategoryLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmSyncCategoryLocalServiceImpl
 * @generated
 */
public class DmSyncCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmSyncCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm sync category to the database. Also notifies the appropriate model listeners.
	*
	* @param dmSyncCategory the dm sync category
	* @return the dm sync category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory addDmSyncCategory(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmSyncCategory(dmSyncCategory);
	}

	/**
	* Creates a new dm sync category with the primary key. Does not add the dm sync category to the database.
	*
	* @param id the primary key for the new dm sync category
	* @return the new dm sync category
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory createDmSyncCategory(
		long id) {
		return getService().createDmSyncCategory(id);
	}

	/**
	* Deletes the dm sync category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm sync category
	* @throws PortalException if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmSyncCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmSyncCategory(id);
	}

	/**
	* Deletes the dm sync category from the database. Also notifies the appropriate model listeners.
	*
	* @param dmSyncCategory the dm sync category
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmSyncCategory(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmSyncCategory(dmSyncCategory);
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

	public static vn.gt.dao.danhmuc.model.DmSyncCategory fetchDmSyncCategory(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmSyncCategory(id);
	}

	/**
	* Returns the dm sync category with the primary key.
	*
	* @param id the primary key of the dm sync category
	* @return the dm sync category
	* @throws PortalException if a dm sync category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory getDmSyncCategory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmSyncCategory(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm sync categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm sync categories
	* @param end the upper bound of the range of dm sync categories (not inclusive)
	* @return the range of dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmSyncCategory> getDmSyncCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmSyncCategories(start, end);
	}

	/**
	* Returns the number of dm sync categories.
	*
	* @return the number of dm sync categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmSyncCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmSyncCategoriesCount();
	}

	/**
	* Updates the dm sync category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmSyncCategory the dm sync category
	* @return the dm sync category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory updateDmSyncCategory(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmSyncCategory(dmSyncCategory);
	}

	/**
	* Updates the dm sync category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmSyncCategory the dm sync category
	* @param merge whether to merge the dm sync category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm sync category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmSyncCategory updateDmSyncCategory(
		vn.gt.dao.danhmuc.model.DmSyncCategory dmSyncCategory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmSyncCategory(dmSyncCategory, merge);
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

	public static void clearService() {
		_service = null;
	}

	public static DmSyncCategoryLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmSyncCategoryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmSyncCategoryLocalService.class.getName(),
					portletClassLoader);

			_service = new DmSyncCategoryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmSyncCategoryLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmSyncCategoryLocalService.class);
		}

		return _service;
	}

	public void setService(DmSyncCategoryLocalService service) {
		MethodCache.remove(DmSyncCategoryLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmSyncCategoryLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmSyncCategoryLocalService.class);
	}

	private static DmSyncCategoryLocalService _service;
}