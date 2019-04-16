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
 * The utility for the dm test n01 request local service. This utility wraps {@link vn.gt.dao.danhmuc.service.impl.DmTestN01RequestLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmTestN01RequestLocalService
 * @see vn.gt.dao.danhmuc.service.base.DmTestN01RequestLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmTestN01RequestLocalServiceImpl
 * @generated
 */
public class DmTestN01RequestLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmTestN01RequestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm test n01 request to the database. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @return the dm test n01 request that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request addDmTestN01Request(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmTestN01Request(dmTestN01Request);
	}

	/**
	* Creates a new dm test n01 request with the primary key. Does not add the dm test n01 request to the database.
	*
	* @param requestID the primary key for the new dm test n01 request
	* @return the new dm test n01 request
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request createDmTestN01Request(
		int requestID) {
		return getService().createDmTestN01Request(requestID);
	}

	/**
	* Deletes the dm test n01 request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param requestID the primary key of the dm test n01 request
	* @throws PortalException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmTestN01Request(int requestID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmTestN01Request(requestID);
	}

	/**
	* Deletes the dm test n01 request from the database. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDmTestN01Request(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDmTestN01Request(dmTestN01Request);
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

	public static vn.gt.dao.danhmuc.model.DmTestN01Request fetchDmTestN01Request(
		int requestID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmTestN01Request(requestID);
	}

	/**
	* Returns the dm test n01 request with the primary key.
	*
	* @param requestID the primary key of the dm test n01 request
	* @return the dm test n01 request
	* @throws PortalException if a dm test n01 request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request getDmTestN01Request(
		int requestID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmTestN01Request(requestID);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm test n01 requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm test n01 requests
	* @param end the upper bound of the range of dm test n01 requests (not inclusive)
	* @return the range of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmTestN01Request> getDmTestN01Requests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmTestN01Requests(start, end);
	}

	/**
	* Returns the number of dm test n01 requests.
	*
	* @return the number of dm test n01 requests
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmTestN01RequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmTestN01RequestsCount();
	}

	/**
	* Updates the dm test n01 request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @return the dm test n01 request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request updateDmTestN01Request(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmTestN01Request(dmTestN01Request);
	}

	/**
	* Updates the dm test n01 request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmTestN01Request the dm test n01 request
	* @param merge whether to merge the dm test n01 request with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm test n01 request that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmTestN01Request updateDmTestN01Request(
		vn.gt.dao.danhmuc.model.DmTestN01Request dmTestN01Request, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmTestN01Request(dmTestN01Request, merge);
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

	public static DmTestN01RequestLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmTestN01RequestLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					DmTestN01RequestLocalService.class.getName(),
					portletClassLoader);

			_service = new DmTestN01RequestLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(DmTestN01RequestLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DmTestN01RequestLocalService.class);
		}

		return _service;
	}

	public void setService(DmTestN01RequestLocalService service) {
		MethodCache.remove(DmTestN01RequestLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DmTestN01RequestLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DmTestN01RequestLocalService.class);
	}

	private static DmTestN01RequestLocalService _service;
}