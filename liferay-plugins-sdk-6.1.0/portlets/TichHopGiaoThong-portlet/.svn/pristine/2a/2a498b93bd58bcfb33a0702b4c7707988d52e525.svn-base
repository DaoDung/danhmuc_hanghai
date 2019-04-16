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
 * The utility for the dm port harbour local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmPortHarbourLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmPortHarbourLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmPortHarbourLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmPortHarbourLocalServiceImpl
 * @generated
 */
public class DmPortHarbourLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmPortHarbourLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm port harbour to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @return the dm port harbour that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour addDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmPortHarbour(dmPortHarbour);
	}

	/**
	* Creates a new dm port harbour with the primary key. Does not add the dm port harbour to the database.
	*
	* @param id the primary key for the new dm port harbour
	* @return the new dm port harbour
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour createDmPortHarbour(
		int id) {
		return getService().createDmPortHarbour(id);
	}

	/**
	* Deletes the dm port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port harbour
	* @throws PortalException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPortHarbour(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPortHarbour(id);
	}

	/**
	* Deletes the dm port harbour from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmPortHarbour(dmPortHarbour);
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

	public static vn.gt.dao.danhmuc.model.DmPortHarbour fetchDmPortHarbour(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmPortHarbour(id);
	}

	/**
	* Returns the dm port harbour with the primary key.
	*
	* @param id the primary key of the dm port harbour
	* @return the dm port harbour
	* @throws PortalException if a dm port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour getDmPortHarbour(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortHarbour(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port harbours
	* @param end the upper bound of the range of dm port harbours (not inclusive)
	* @return the range of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> getDmPortHarbours(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortHarbours(start, end);
	}

	/**
	* Returns the number of dm port harbours.
	*
	* @return the number of dm port harbours
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmPortHarboursCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmPortHarboursCount();
	}

	/**
	* Updates the dm port harbour in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @return the dm port harbour that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour updateDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPortHarbour(dmPortHarbour);
	}

	/**
	* Updates the dm port harbour in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortHarbour the dm port harbour
	* @param merge whether to merge the dm port harbour with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm port harbour that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmPortHarbour updateDmPortHarbour(
		vn.gt.dao.danhmuc.model.DmPortHarbour dmPortHarbour, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmPortHarbour(dmPortHarbour, merge);
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

	public static vn.gt.dao.danhmuc.model.DmPortHarbour getByPortHarbourCode(
		java.lang.String portHarbourCode) {
		return getService().getByPortHarbourCode(portHarbourCode);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode) {
		return getService().findByPortRegionCode(portRegionCode);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findByPortRegion(
		java.lang.String portRegion) {
		return getService().findByPortRegion(portRegion);
	}

	public static java.util.List<vn.gt.dao.danhmuc.model.DmPortHarbour> findDanhSachDmPortHarbour(
		java.lang.String maritimeCode, java.lang.String portRegion,
		java.lang.String portHarbourName, int start, int end) {
		return getService()
				   .findDanhSachDmPortHarbour(maritimeCode, portRegion,
			portHarbourName, start, end);
	}

	public static int countDanhSachDmPortHarbour(
		java.lang.String maritimeCode, java.lang.String portRegion,
		java.lang.String portHarbourName) {
		return getService()
				   .countDanhSachDmPortHarbour(maritimeCode, portRegion,
			portHarbourName);
	}

	public static vn.gt.dao.danhmuc.model.DmPortHarbour getFirstPortHarbour() {
		return getService().getFirstPortHarbour();
	}

	public static vn.gt.dao.danhmuc.model.DmPortHarbour getLastPortHarbour() {
		return getService().getLastPortHarbour();
	}

	public static void clearService() {
		_service = null;
	}

	public static DmPortHarbourLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmPortHarbourLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmPortHarbourLocalService.class.getName(),
					portletClassLoader);

			_service = new DmPortHarbourLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmPortHarbourLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmPortHarbourLocalService.class);
		}

		return _service;
	}

	public void setService(DmPortHarbourLocalService service) {
		MethodCache.remove(DmPortHarbourLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmPortHarbourLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmPortHarbourLocalService.class);
	}

	private static DmPortHarbourLocalService _service;
}