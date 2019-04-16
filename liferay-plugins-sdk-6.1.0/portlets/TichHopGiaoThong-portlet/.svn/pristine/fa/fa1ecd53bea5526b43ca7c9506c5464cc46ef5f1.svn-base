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
 * The utility for the dm history representative local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmHistoryRepresentativeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmHistoryRepresentativeLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmHistoryRepresentativeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmHistoryRepresentativeLocalServiceImpl
 * @generated
 */
public class DmHistoryRepresentativeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmHistoryRepresentativeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm history representative to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRepresentative the dm history representative
	* @return the dm history representative that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative addDmHistoryRepresentative(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmHistoryRepresentative(dmHistoryRepresentative);
	}

	/**
	* Creates a new dm history representative with the primary key. Does not add the dm history representative to the database.
	*
	* @param id the primary key for the new dm history representative
	* @return the new dm history representative
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative createDmHistoryRepresentative(
		int id) {
		return getService().createDmHistoryRepresentative(id);
	}

	/**
	* Deletes the dm history representative with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history representative
	* @throws PortalException if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmHistoryRepresentative(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmHistoryRepresentative(id);
	}

	/**
	* Deletes the dm history representative from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRepresentative the dm history representative
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmHistoryRepresentative(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmHistoryRepresentative(dmHistoryRepresentative);
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

	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative fetchDmHistoryRepresentative(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmHistoryRepresentative(id);
	}

	/**
	* Returns the dm history representative with the primary key.
	*
	* @param id the primary key of the dm history representative
	* @return the dm history representative
	* @throws PortalException if a dm history representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative getDmHistoryRepresentative(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmHistoryRepresentative(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history representatives
	* @param end the upper bound of the range of dm history representatives (not inclusive)
	* @return the range of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryRepresentative> getDmHistoryRepresentatives(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmHistoryRepresentatives(start, end);
	}

	/**
	* Returns the number of dm history representatives.
	*
	* @return the number of dm history representatives
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmHistoryRepresentativesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmHistoryRepresentativesCount();
	}

	/**
	* Updates the dm history representative in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRepresentative the dm history representative
	* @return the dm history representative that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative updateDmHistoryRepresentative(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDmHistoryRepresentative(dmHistoryRepresentative);
	}

	/**
	* Updates the dm history representative in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryRepresentative the dm history representative
	* @param merge whether to merge the dm history representative with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history representative that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative updateDmHistoryRepresentative(
		vn.gt.dao.danhmuc.model.DmHistoryRepresentative dmHistoryRepresentative,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDmHistoryRepresentative(dmHistoryRepresentative, merge);
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

	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative getByRepCode(
		java.lang.String repCode) {
		return getService().getByRepCode(repCode);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryRepresentative getByRepCodeAndSyncVersion(
		java.lang.String syncVersion, java.lang.String repCode) {
		return getService().getByRepCodeAndSyncVersion(syncVersion, repCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmHistoryRepresentativeLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmHistoryRepresentativeLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmHistoryRepresentativeLocalService.class.getName(),
					portletClassLoader);

			_service = new DmHistoryRepresentativeLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmHistoryRepresentativeLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmHistoryRepresentativeLocalService.class);
		}

		return _service;
	}

	public void setService(DmHistoryRepresentativeLocalService service) {
		MethodCache.remove(DmHistoryRepresentativeLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmHistoryRepresentativeLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmHistoryRepresentativeLocalService.class);
	}

	private static DmHistoryRepresentativeLocalService _service;
}