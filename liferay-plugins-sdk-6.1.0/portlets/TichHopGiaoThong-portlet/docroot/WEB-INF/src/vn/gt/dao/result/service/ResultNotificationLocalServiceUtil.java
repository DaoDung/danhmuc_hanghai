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

package vn.gt.dao.result.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the result notification local service. This utility wraps {@link vn.gt.dao.result.service.impl.ResultNotificationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see ResultNotificationLocalService
 * @see vn.gt.dao.result.service.base.ResultNotificationLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.impl.ResultNotificationLocalServiceImpl
 * @generated
 */
public class ResultNotificationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.result.service.impl.ResultNotificationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the result notification to the database. Also notifies the appropriate model listeners.
	*
	* @param resultNotification the result notification
	* @return the result notification that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification addResultNotification(
		vn.gt.dao.result.model.ResultNotification resultNotification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addResultNotification(resultNotification);
	}

	/**
	* Creates a new result notification with the primary key. Does not add the result notification to the database.
	*
	* @param id the primary key for the new result notification
	* @return the new result notification
	*/
	public static vn.gt.dao.result.model.ResultNotification createResultNotification(
		long id) {
		return getService().createResultNotification(id);
	}

	/**
	* Deletes the result notification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result notification
	* @throws PortalException if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteResultNotification(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteResultNotification(id);
	}

	/**
	* Deletes the result notification from the database. Also notifies the appropriate model listeners.
	*
	* @param resultNotification the result notification
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteResultNotification(
		vn.gt.dao.result.model.ResultNotification resultNotification)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteResultNotification(resultNotification);
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

	public static vn.gt.dao.result.model.ResultNotification fetchResultNotification(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchResultNotification(id);
	}

	/**
	* Returns the result notification with the primary key.
	*
	* @param id the primary key of the result notification
	* @return the result notification
	* @throws PortalException if a result notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification getResultNotification(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultNotification(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result notifications
	* @param end the upper bound of the range of result notifications (not inclusive)
	* @return the range of result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> getResultNotifications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultNotifications(start, end);
	}

	/**
	* Returns the number of result notifications.
	*
	* @return the number of result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int getResultNotificationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultNotificationsCount();
	}

	/**
	* Updates the result notification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultNotification the result notification
	* @return the result notification that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification updateResultNotification(
		vn.gt.dao.result.model.ResultNotification resultNotification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateResultNotification(resultNotification);
	}

	/**
	* Updates the result notification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultNotification the result notification
	* @param merge whether to merge the result notification with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the result notification that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultNotification updateResultNotification(
		vn.gt.dao.result.model.ResultNotification resultNotification,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateResultNotification(resultNotification, merge);
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

	/**
	* Returns all the result notifications where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	public static vn.gt.dao.result.model.ResultNotification findByBusinessTypeCodeOrderbyLastestDate(
		java.lang.String businessTypeCode, long documentName, int documentYear) {
		return getService()
				   .findByBusinessTypeCodeOrderbyLastestDate(businessTypeCode,
			documentName, documentYear);
	}

	public static vn.gt.dao.result.model.ResultNotification findByBusinessTypeCode(
		int businessTypeCode, long documentName, int documentYear) {
		return getService()
				   .findByBusinessTypeCode(businessTypeCode, documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultNotification> findByMaritimeCodeOrderbyLastestDate(
		java.lang.String maritimeCode) {
		return getService().findByMaritimeCodeOrderbyLastestDate(maritimeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static ResultNotificationLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ResultNotificationLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					ResultNotificationLocalService.class.getName(),
					portletClassLoader);

			_service = new ResultNotificationLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(ResultNotificationLocalServiceUtil.class,
				"_service");
			MethodCache.remove(ResultNotificationLocalService.class);
		}

		return _service;
	}

	public void setService(ResultNotificationLocalService service) {
		MethodCache.remove(ResultNotificationLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(ResultNotificationLocalServiceUtil.class,
			"_service");
		MethodCache.remove(ResultNotificationLocalService.class);
	}

	private static ResultNotificationLocalService _service;
}