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
 * The utility for the dm ship agency local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmShipAgencyLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmShipAgencyLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmShipAgencyLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmShipAgencyLocalServiceImpl
 * @generated
 */
public class DmShipAgencyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmShipAgencyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm ship agency to the database. Also notifies the appropriate model listeners.
	*
	* @param dmShipAgency the dm ship agency
	* @return the dm ship agency that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmShipAgency addDmShipAgency(
		vn.gt.dao.danhmuc.model.DmShipAgency dmShipAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmShipAgency(dmShipAgency);
	}

	/**
	* Creates a new dm ship agency with the primary key. Does not add the dm ship agency to the database.
	*
	* @param id the primary key for the new dm ship agency
	* @return the new dm ship agency
	*/
	public static vn.gt.dao.danhmuc.model.DmShipAgency createDmShipAgency(
		int id) {
		return getService().createDmShipAgency(id);
	}

	/**
	* Deletes the dm ship agency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm ship agency
	* @throws PortalException if a dm ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmShipAgency(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmShipAgency(id);
	}

	/**
	* Deletes the dm ship agency from the database. Also notifies the appropriate model listeners.
	*
	* @param dmShipAgency the dm ship agency
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmShipAgency(
		vn.gt.dao.danhmuc.model.DmShipAgency dmShipAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmShipAgency(dmShipAgency);
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

	public static vn.gt.dao.danhmuc.model.DmShipAgency fetchDmShipAgency(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmShipAgency(id);
	}

	/**
	* Returns the dm ship agency with the primary key.
	*
	* @param id the primary key of the dm ship agency
	* @return the dm ship agency
	* @throws PortalException if a dm ship agency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmShipAgency getDmShipAgency(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmShipAgency(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm ship agencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ship agencies
	* @param end the upper bound of the range of dm ship agencies (not inclusive)
	* @return the range of dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmShipAgency> getDmShipAgencies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmShipAgencies(start, end);
	}

	/**
	* Returns the number of dm ship agencies.
	*
	* @return the number of dm ship agencies
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmShipAgenciesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmShipAgenciesCount();
	}

	/**
	* Updates the dm ship agency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmShipAgency the dm ship agency
	* @return the dm ship agency that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmShipAgency updateDmShipAgency(
		vn.gt.dao.danhmuc.model.DmShipAgency dmShipAgency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmShipAgency(dmShipAgency);
	}

	/**
	* Updates the dm ship agency in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmShipAgency the dm ship agency
	* @param merge whether to merge the dm ship agency with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm ship agency that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmShipAgency updateDmShipAgency(
		vn.gt.dao.danhmuc.model.DmShipAgency dmShipAgency, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmShipAgency(dmShipAgency, merge);
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

	public static vn.gt.dao.danhmuc.model.DmShipAgency getByShipAgencyCode(
		java.lang.String shipAgencyCode) {
		return getService().getByShipAgencyCode(shipAgencyCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmShipAgencyLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmShipAgencyLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmShipAgencyLocalService.class.getName(), portletClassLoader);

			_service = new DmShipAgencyLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmShipAgencyLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmShipAgencyLocalService.class);
		}

		return _service;
	}

	public void setService(DmShipAgencyLocalService service) {
		MethodCache.remove(DmShipAgencyLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmShipAgencyLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmShipAgencyLocalService.class);
	}

	private static DmShipAgencyLocalService _service;
}