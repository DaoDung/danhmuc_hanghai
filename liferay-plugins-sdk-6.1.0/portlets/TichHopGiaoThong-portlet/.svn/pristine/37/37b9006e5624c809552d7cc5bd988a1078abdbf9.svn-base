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
 * The utility for the dm gt organization local service. This utility wraps {@link vn.gt.dao.danhmucgt.service.impl.DmGtOrganizationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmGtOrganizationLocalService
 * @see vn.gt.dao.danhmucgt.service.base.DmGtOrganizationLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.impl.DmGtOrganizationLocalServiceImpl
 * @generated
 */
public class DmGtOrganizationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmucgt.service.impl.DmGtOrganizationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm gt organization to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtOrganization the dm gt organization
	* @return the dm gt organization that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtOrganization addDmGtOrganization(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmGtOrganization(dmGtOrganization);
	}

	/**
	* Creates a new dm gt organization with the primary key. Does not add the dm gt organization to the database.
	*
	* @param id the primary key for the new dm gt organization
	* @return the new dm gt organization
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtOrganization createDmGtOrganization(
		long id) {
		return getService().createDmGtOrganization(id);
	}

	/**
	* Deletes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt organization
	* @throws PortalException if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmGtOrganization(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmGtOrganization(id);
	}

	/**
	* Deletes the dm gt organization from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtOrganization the dm gt organization
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmGtOrganization(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmGtOrganization(dmGtOrganization);
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

	public static vn.gt.dao.danhmucgt.model.DmGtOrganization fetchDmGtOrganization(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmGtOrganization(id);
	}

	/**
	* Returns the dm gt organization with the primary key.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization
	* @throws PortalException if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtOrganization getDmGtOrganization(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGtOrganization(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm gt organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt organizations
	* @param end the upper bound of the range of dm gt organizations (not inclusive)
	* @return the range of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGtOrganization> getDmGtOrganizations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGtOrganizations(start, end);
	}

	/**
	* Returns the number of dm gt organizations.
	*
	* @return the number of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmGtOrganizationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmGtOrganizationsCount();
	}

	/**
	* Updates the dm gt organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGtOrganization the dm gt organization
	* @return the dm gt organization that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtOrganization updateDmGtOrganization(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmGtOrganization(dmGtOrganization);
	}

	/**
	* Updates the dm gt organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGtOrganization the dm gt organization
	* @param merge whether to merge the dm gt organization with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm gt organization that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGtOrganization updateDmGtOrganization(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmGtOrganization(dmGtOrganization, merge);
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

	public static vn.gt.dao.danhmucgt.model.DmGtOrganization findByOrganizationCode(
		java.lang.String organizationCode) {
		return getService().findByOrganizationCode(organizationCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmGtOrganizationLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmGtOrganizationLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmGtOrganizationLocalService.class.getName(),
					portletClassLoader);

			_service = new DmGtOrganizationLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmGtOrganizationLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmGtOrganizationLocalService.class);
		}

		return _service;
	}

	public void setService(DmGtOrganizationLocalService service) {
		MethodCache.remove(DmGtOrganizationLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmGtOrganizationLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmGtOrganizationLocalService.class);
	}

	private static DmGtOrganizationLocalService _service;
}