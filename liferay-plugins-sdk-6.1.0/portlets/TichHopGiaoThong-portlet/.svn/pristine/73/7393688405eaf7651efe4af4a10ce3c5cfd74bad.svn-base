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
 * The utility for the dm port local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmPortLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmPortLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmPortLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmPortLocalServiceImpl
 * @generated
 */
public class DmPortLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmPortLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm port to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPort the dm port
	* @return the dm port that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort addDmPort(
		vn.gt.dao.danhmuc.model.DmPort dmPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmPort(dmPort);
	}

	/**
	* Creates a new dm port with the primary key. Does not add the dm port to the database.
	*
	* @param id the primary key for the new dm port
	* @return the new dm port
	*/
	public static vn.gt.dao.danhmuc.model.DmPort createDmPort(int id) {
		return getService().createDmPort(id);
	}

	/**
	* Deletes the dm port with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port
	* @throws PortalException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPort(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPort(id);
	}

	/**
	* Deletes the dm port from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPort the dm port
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPort(vn.gt.dao.danhmuc.model.DmPort dmPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPort(dmPort);
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

	public static vn.gt.dao.danhmuc.model.DmPort fetchDmPort(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmPort(id);
	}

	/**
	* Returns the dm port with the primary key.
	*
	* @param id the primary key of the dm port
	* @return the dm port
	* @throws PortalException if a dm port with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort getDmPort(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPort(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm ports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ports
	* @param end the upper bound of the range of dm ports (not inclusive)
	* @return the range of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> getDmPorts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPorts(start, end);
	}

	/**
	* Returns the number of dm ports.
	*
	* @return the number of dm ports
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmPortsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortsCount();
	}

	/**
	* Updates the dm port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPort the dm port
	* @return the dm port that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort updateDmPort(
		vn.gt.dao.danhmuc.model.DmPort dmPort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPort(dmPort);
	}

	/**
	* Updates the dm port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPort the dm port
	* @param merge whether to merge the dm port with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm port that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPort updateDmPort(
		vn.gt.dao.danhmuc.model.DmPort dmPort, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPort(dmPort, merge);
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

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll() {
		return getService().findAll();
	}

	public static vn.gt.dao.danhmuc.model.DmPort getByPortCode(
		java.lang.String portCode) {
		return getService().getByPortCode(portCode);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByLoCode(
		java.lang.String loCode) {
		return getService().findByLoCode(loCode);
	}

	public static int countByPortCode(java.lang.String portCode) {
		return getService().countByPortCode(portCode);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findAll(
		int start, int end) {
		return getService().findAll(start, end);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPort> findByStateCodeAndCityCode(
		java.lang.String stateCode, java.lang.String citycode) {
		return getService().findByStateCodeAndCityCode(stateCode, citycode);
	}

	public static vn.gt.dao.danhmuc.model.DmPort fetchByPortCodeLoCode(
		java.lang.String portCode, java.lang.String loCode) {
		return getService().fetchByPortCodeLoCode(portCode, loCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmPortLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmPortLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmPortLocalService.class.getName(), portletClassLoader);

			_service = new DmPortLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmPortLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmPortLocalService.class);
		}

		return _service;
	}

	public void setService(DmPortLocalService service) {
		MethodCache.remove(DmPortLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmPortLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmPortLocalService.class);
	}

	private static DmPortLocalService _service;
}