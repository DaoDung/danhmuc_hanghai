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
 * The utility for the issue shifting order local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.IssueShiftingOrderLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see IssueShiftingOrderLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.IssueShiftingOrderLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.IssueShiftingOrderLocalServiceImpl
 * @generated
 */
public class IssueShiftingOrderLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.IssueShiftingOrderLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the issue shifting order to the database. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrder the issue shifting order
	* @return the issue shifting order that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder addIssueShiftingOrder(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrder issueShiftingOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addIssueShiftingOrder(issueShiftingOrder);
	}

	/**
	* Creates a new issue shifting order with the primary key. Does not add the issue shifting order to the database.
	*
	* @param id the primary key for the new issue shifting order
	* @return the new issue shifting order
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder createIssueShiftingOrder(
		long id) {
		return getService().createIssueShiftingOrder(id);
	}

	/**
	* Deletes the issue shifting order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue shifting order
	* @throws PortalException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssueShiftingOrder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssueShiftingOrder(id);
	}

	/**
	* Deletes the issue shifting order from the database. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrder the issue shifting order
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssueShiftingOrder(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrder issueShiftingOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssueShiftingOrder(issueShiftingOrder);
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

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder fetchIssueShiftingOrder(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchIssueShiftingOrder(id);
	}

	/**
	* Returns the issue shifting order with the primary key.
	*
	* @param id the primary key of the issue shifting order
	* @return the issue shifting order
	* @throws PortalException if a issue shifting order with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder getIssueShiftingOrder(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueShiftingOrder(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue shifting orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue shifting orders
	* @param end the upper bound of the range of issue shifting orders (not inclusive)
	* @return the range of issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> getIssueShiftingOrders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueShiftingOrders(start, end);
	}

	/**
	* Returns the number of issue shifting orders.
	*
	* @return the number of issue shifting orders
	* @throws SystemException if a system exception occurred
	*/
	public static int getIssueShiftingOrdersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueShiftingOrdersCount();
	}

	/**
	* Updates the issue shifting order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrder the issue shifting order
	* @return the issue shifting order that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder updateIssueShiftingOrder(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrder issueShiftingOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateIssueShiftingOrder(issueShiftingOrder);
	}

	/**
	* Updates the issue shifting order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueShiftingOrder the issue shifting order
	* @param merge whether to merge the issue shifting order with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the issue shifting order that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder updateIssueShiftingOrder(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrder issueShiftingOrder,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateIssueShiftingOrder(issueShiftingOrder, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int requestState) {
		return getService()
				   .findIssueShiftingOrderByDocumentYearAndDocumentYear(documentName,
			documentYear, requestState);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder getByRequestCode(
		java.lang.String requestCode) {
		return getService().getByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		return getService()
				   .findIssueShiftingOrderInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo,
			certificateNumber, start, end);
	}

	public static int countIssueShiftingOrderInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		return getService()
				   .countIssueShiftingOrderInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo,
			certificateNumber);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findIssueShiftingOrderInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		return getService()
				   .findIssueShiftingOrderInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber, start, end);
	}

	public static int countIssueShiftingOrderInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		return getService()
				   .countIssueShiftingOrderInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueShiftingOrder> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String nameColumn,
		boolean ascOrdesc) {
		return getService()
				   .findByDocumentYearAndDocumentYearOrderByColumn(documentName,
			documentYear, nameColumn, ascOrdesc);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder getByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo) {
		return getService()
				   .getByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueShiftingOrder getVersionNoMaxByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .getVersionNoMaxByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		return getService()
				   .countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static java.lang.String capGiayPhepSo(
		java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().capGiayPhepSo(maritimeReference);
	}

	public static void clearService() {
		_service = null;
	}

	public static IssueShiftingOrderLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					IssueShiftingOrderLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					IssueShiftingOrderLocalService.class.getName(),
					portletClassLoader);

			_service = new IssueShiftingOrderLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(IssueShiftingOrderLocalServiceUtil.class,
				"_service");
			MethodCache.remove(IssueShiftingOrderLocalService.class);
		}

		return _service;
	}

	public void setService(IssueShiftingOrderLocalService service) {
		MethodCache.remove(IssueShiftingOrderLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(IssueShiftingOrderLocalServiceUtil.class,
			"_service");
		MethodCache.remove(IssueShiftingOrderLocalService.class);
	}

	private static IssueShiftingOrderLocalService _service;
}