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
 * The utility for the issue acceptance local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.IssueAcceptanceLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see IssueAcceptanceLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.IssueAcceptanceLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.IssueAcceptanceLocalServiceImpl
 * @generated
 */
public class IssueAcceptanceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.IssueAcceptanceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the issue acceptance to the database. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptance the issue acceptance
	* @return the issue acceptance that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance addIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addIssueAcceptance(issueAcceptance);
	}

	/**
	* Creates a new issue acceptance with the primary key. Does not add the issue acceptance to the database.
	*
	* @param id the primary key for the new issue acceptance
	* @return the new issue acceptance
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance createIssueAcceptance(
		long id) {
		return getService().createIssueAcceptance(id);
	}

	/**
	* Deletes the issue acceptance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue acceptance
	* @throws PortalException if a issue acceptance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssueAcceptance(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssueAcceptance(id);
	}

	/**
	* Deletes the issue acceptance from the database. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptance the issue acceptance
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssueAcceptance(issueAcceptance);
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

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance fetchIssueAcceptance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchIssueAcceptance(id);
	}

	/**
	* Returns the issue acceptance with the primary key.
	*
	* @param id the primary key of the issue acceptance
	* @return the issue acceptance
	* @throws PortalException if a issue acceptance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance getIssueAcceptance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueAcceptance(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue acceptances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue acceptances
	* @param end the upper bound of the range of issue acceptances (not inclusive)
	* @return the range of issue acceptances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> getIssueAcceptances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueAcceptances(start, end);
	}

	/**
	* Returns the number of issue acceptances.
	*
	* @return the number of issue acceptances
	* @throws SystemException if a system exception occurred
	*/
	public static int getIssueAcceptancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssueAcceptancesCount();
	}

	/**
	* Updates the issue acceptance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptance the issue acceptance
	* @return the issue acceptance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance updateIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateIssueAcceptance(issueAcceptance);
	}

	/**
	* Updates the issue acceptance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueAcceptance the issue acceptance
	* @param merge whether to merge the issue acceptance with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the issue acceptance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance updateIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateIssueAcceptance(issueAcceptance, merge);
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

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findIssueAcceptanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		return getService()
				   .findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	public static int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance findIssueAcceptanceByRequestCode(
		java.lang.String requestCode) {
		return getService().findIssueAcceptanceByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance findLastestIssueAcceptanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign) {
		return getService()
				   .findLastestIssueAcceptanceByPortNameAndCallSign(nameOfShip,
			callSign);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.IssueAcceptance getByRequestCode(
		java.lang.String requestCode) {
		return getService().getByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, int start, int end) {
		return getService()
				   .findIssueAcceptanceInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo, start, end);
	}

	public static int countIssueAcceptanceInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo) {
		return getService()
				   .countIssueAcceptanceInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc) {
		return getService()
				   .findByDocumentYearAndDocumentYearOrderByColumn(documentName,
			documentYear, orderByColumn, ascOrdesc);
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

	public static IssueAcceptanceLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					IssueAcceptanceLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					IssueAcceptanceLocalService.class.getName(),
					portletClassLoader);

			_service = new IssueAcceptanceLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(IssueAcceptanceLocalServiceUtil.class,
				"_service");
			MethodCache.remove(IssueAcceptanceLocalService.class);
		}

		return _service;
	}

	public void setService(IssueAcceptanceLocalService service) {
		MethodCache.remove(IssueAcceptanceLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(IssueAcceptanceLocalServiceUtil.class,
			"_service");
		MethodCache.remove(IssueAcceptanceLocalService.class);
	}

	private static IssueAcceptanceLocalService _service;
}