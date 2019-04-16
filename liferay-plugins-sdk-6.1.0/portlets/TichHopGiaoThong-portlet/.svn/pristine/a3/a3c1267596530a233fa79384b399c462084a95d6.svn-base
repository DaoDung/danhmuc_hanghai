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

package vn.gt.dao.noticeandmessage.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the issue shifting order chanel local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.IssueShiftingOrderChanelLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see IssueShiftingOrderChanelLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.IssueShiftingOrderChanelLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.IssueShiftingOrderChanelLocalServiceImpl
 * @generated
 */
public class IssueShiftingOrderChanelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.IssueShiftingOrderChanelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the issue shifting order chanel to the database. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrderChanel the issue shifting order chanel
	* @return the issue shifting order chanel that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel addIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addIssueShiftingOrderChanel(issueShiftingOrderChanel);
	}

	/**
	* Creates a new issue shifting order chanel with the primary key. Does not add the issue shifting order chanel to the database.
	*
	* @param issueShiftingOrderChanelPK the primary key for the new issue shifting order chanel
	* @return the new issue shifting order chanel
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel createIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK) {
		return getService()
				   .createIssueShiftingOrderChanel(issueShiftingOrderChanelPK);
	}

	/**
	* Deletes the issue shifting order chanel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	* @throws PortalException if a issue shifting order chanel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssueShiftingOrderChanel(issueShiftingOrderChanelPK);
	}

	/**
	* Deletes the issue shifting order chanel from the database. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrderChanel the issue shifting order chanel
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssueShiftingOrderChanel(issueShiftingOrderChanel);
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

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel fetchIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchIssueShiftingOrderChanel(issueShiftingOrderChanelPK);
	}

	/**
	* Returns the issue shifting order chanel with the primary key.
	*
	* @param issueShiftingOrderChanelPK the primary key of the issue shifting order chanel
	* @return the issue shifting order chanel
	* @throws PortalException if a issue shifting order chanel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel getIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK issueShiftingOrderChanelPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getIssueShiftingOrderChanel(issueShiftingOrderChanelPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue shifting order chanels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue shifting order chanels
	* @param end the upper bound of the range of issue shifting order chanels (not inclusive)
	* @return the range of issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> getIssueShiftingOrderChanels(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueShiftingOrderChanels(start, end);
	}

	/**
	* Returns the number of issue shifting order chanels.
	*
	* @return the number of issue shifting order chanels
	* @throws SystemException if a system exception occurred
	*/
	public static int getIssueShiftingOrderChanelsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueShiftingOrderChanelsCount();
	}

	/**
	* Updates the issue shifting order chanel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrderChanel the issue shifting order chanel
	* @return the issue shifting order chanel that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel updateIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateIssueShiftingOrderChanel(issueShiftingOrderChanel);
	}

	/**
	* Updates the issue shifting order chanel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrderChanel the issue shifting order chanel
	* @param merge whether to merge the issue shifting order chanel with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the issue shifting order chanel that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel updateIssueShiftingOrderChanel(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateIssueShiftingOrderChanel(issueShiftingOrderChanel,
			merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> findByShiftingOrderId(
		long shiftingOrderId) {
		return getService().findByShiftingOrderId(shiftingOrderId);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> getShiftingOrderChanel(
		long shiftingOrderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getShiftingOrderChanel(shiftingOrderId);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel getShiftingOrderChanel(
		long shiftingOrderId, java.lang.String chanelCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getShiftingOrderChanel(shiftingOrderId, chanelCode);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel addShiftingOrderChanel(
		long shiftingOrderId, java.lang.String chanelCode,
		java.lang.String chanelName, int order)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addShiftingOrderChanel(shiftingOrderId, chanelCode,
			chanelName, order);
	}

	public static void clearService() {
		_service = null;
	}

	public static IssueShiftingOrderChanelLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					IssueShiftingOrderChanelLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					IssueShiftingOrderChanelLocalService.class.getName(),
					portletClassLoader);

			_service = new IssueShiftingOrderChanelLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(IssueShiftingOrderChanelLocalServiceUtil.class,
				"_service");
			MethodCache.remove(IssueShiftingOrderChanelLocalService.class);
		}

		return _service;
	}

	public void setService(IssueShiftingOrderChanelLocalService service) {
		MethodCache.remove(IssueShiftingOrderChanelLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(IssueShiftingOrderChanelLocalServiceUtil.class,
			"_service");
		MethodCache.remove(IssueShiftingOrderChanelLocalService.class);
	}

	private static IssueShiftingOrderChanelLocalService _service;
}