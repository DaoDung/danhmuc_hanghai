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
 * The utility for the dm enterrise local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmEnterriseLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmEnterriseLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmEnterriseLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmEnterriseLocalServiceImpl
 * @generated
 */
public class DmEnterriseLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmEnterriseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm enterrise to the database. Also notifies the appropriate model listeners.
	*
	* @param dmEnterrise the dm enterrise
	* @return the dm enterrise that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise addDmEnterrise(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmEnterrise(dmEnterrise);
	}

	/**
	* Creates a new dm enterrise with the primary key. Does not add the dm enterrise to the database.
	*
	* @param id the primary key for the new dm enterrise
	* @return the new dm enterrise
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise createDmEnterrise(int id) {
		return getService().createDmEnterrise(id);
	}

	/**
	* Deletes the dm enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm enterrise
	* @throws PortalException if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmEnterrise(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmEnterrise(id);
	}

	/**
	* Deletes the dm enterrise from the database. Also notifies the appropriate model listeners.
	*
	* @param dmEnterrise the dm enterrise
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmEnterrise(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmEnterrise(dmEnterrise);
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

	public static vn.gt.dao.danhmuc.model.DmEnterrise fetchDmEnterrise(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmEnterrise(id);
	}

	/**
	* Returns the dm enterrise with the primary key.
	*
	* @param id the primary key of the dm enterrise
	* @return the dm enterrise
	* @throws PortalException if a dm enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise getDmEnterrise(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmEnterrise(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm enterrises
	* @param end the upper bound of the range of dm enterrises (not inclusive)
	* @return the range of dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmEnterrise> getDmEnterrises(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmEnterrises(start, end);
	}

	/**
	* Returns the number of dm enterrises.
	*
	* @return the number of dm enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmEnterrisesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmEnterrisesCount();
	}

	/**
	* Updates the dm enterrise in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmEnterrise the dm enterrise
	* @return the dm enterrise that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise updateDmEnterrise(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmEnterrise(dmEnterrise);
	}

	/**
	* Updates the dm enterrise in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmEnterrise the dm enterrise
	* @param merge whether to merge the dm enterrise with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm enterrise that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmEnterrise updateDmEnterrise(
		vn.gt.dao.danhmuc.model.DmEnterrise dmEnterrise, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmEnterrise(dmEnterrise, merge);
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

	public static DmEnterriseLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmEnterriseLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmEnterriseLocalService.class.getName(), portletClassLoader);

			_service = new DmEnterriseLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmEnterriseLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmEnterriseLocalService.class);
		}

		return _service;
	}

	public void setService(DmEnterriseLocalService service) {
		MethodCache.remove(DmEnterriseLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmEnterriseLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmEnterriseLocalService.class);
	}

	private static DmEnterriseLocalService _service;
}