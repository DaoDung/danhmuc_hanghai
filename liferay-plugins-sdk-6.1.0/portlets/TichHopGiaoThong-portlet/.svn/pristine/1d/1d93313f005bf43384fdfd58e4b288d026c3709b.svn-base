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
 * The utility for the issue port clearance local service. This utility wraps {@link vn.gt.dao.noticeandmessage.service.impl.IssuePortClearanceLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see IssuePortClearanceLocalService
 * @see vn.gt.dao.noticeandmessage.service.base.IssuePortClearanceLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.impl.IssuePortClearanceLocalServiceImpl
 * @generated
 */
public class IssuePortClearanceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.noticeandmessage.service.impl.IssuePortClearanceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the issue port clearance to the database. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance addIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addIssuePortClearance(issuePortClearance);
	}

	/**
	* Creates a new issue port clearance with the primary key. Does not add the issue port clearance to the database.
	*
	* @param id the primary key for the new issue port clearance
	* @return the new issue port clearance
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance createIssuePortClearance(
		long id) {
		return getService().createIssuePortClearance(id);
	}

	/**
	* Deletes the issue port clearance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue port clearance
	* @throws PortalException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssuePortClearance(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssuePortClearance(id);
	}

	/**
	* Deletes the issue port clearance from the database. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteIssuePortClearance(issuePortClearance);
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

	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance fetchIssuePortClearance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchIssuePortClearance(id);
	}

	/**
	* Returns the issue port clearance with the primary key.
	*
	* @param id the primary key of the issue port clearance
	* @return the issue port clearance
	* @throws PortalException if a issue port clearance with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance getIssuePortClearance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssuePortClearance(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue port clearances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue port clearances
	* @param end the upper bound of the range of issue port clearances (not inclusive)
	* @return the range of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> getIssuePortClearances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssuePortClearances(start, end);
	}

	/**
	* Returns the number of issue port clearances.
	*
	* @return the number of issue port clearances
	* @throws SystemException if a system exception occurred
	*/
	public static int getIssuePortClearancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getIssuePortClearancesCount();
	}

	/**
	* Updates the issue port clearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @return the issue port clearance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance updateIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateIssuePortClearance(issuePortClearance);
	}

	/**
	* Updates the issue port clearance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issuePortClearance the issue port clearance
	* @param merge whether to merge the issue port clearance with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the issue port clearance that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance updateIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateIssuePortClearance(issuePortClearance, merge);
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

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findIssuePortClearanceByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		return getService()
				   .findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	public static int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByRequestCode(
		java.lang.String requestCode) {
		return getService().findIssuePortClearanceByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance findLastestIssuePortClearanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign) {
		return getService()
				   .findLastestIssuePortClearanceByPortNameAndCallSign(nameOfShip,
			callSign);
	}

	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance findLatestCertificateOfIssuePortClearance(
		java.lang.String nameOfShip, java.lang.String callSign,
		java.lang.String certificateNo) {
		return getService()
				   .findLatestCertificateOfIssuePortClearance(nameOfShip,
			callSign, certificateNo);
	}

	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance getByRequestCode(
		java.lang.String requestCode) {
		return getService().getByRequestCode(requestCode);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		return getService()
				   .findIssuePortClearanceInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo,
			certificateNumber, start, end);
	}

	public static int countIssuePortClearanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		return getService()
				   .countIssuePortClearanceInfo(requestState, maritimeCode,
			portCode, shipName, callSign, shipDateFrom, shipDateTo,
			certificateNumber);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		return getService()
				   .findIssuePortClearanceInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber, start, end);
	}

	public static int countIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		return getService()
				   .countIssuePortClearanceInfoByCertificateNumber(requestState,
			maritimeCode, portCode, shipName, callSign, shipDateFrom,
			shipDateTo, certificateNumber);
	}

	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findByDocumentYearAndDocumentYearOrderByColumn(
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

	public static vn.gt.dao.noticeandmessage.model.IssuePortClearance findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPortClearance) {
		return getService()
				   .findByF_LAST_numberPortClearance(documentName,
			documentYear, numberPortClearance);
	}

	public static void clearService() {
		_service = null;
	}

	public static IssuePortClearanceLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					IssuePortClearanceLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					IssuePortClearanceLocalService.class.getName(),
					portletClassLoader);

			_service = new IssuePortClearanceLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(IssuePortClearanceLocalServiceUtil.class,
				"_service");
			MethodCache.remove(IssuePortClearanceLocalService.class);
		}

		return _service;
	}

	public void setService(IssuePortClearanceLocalService service) {
		MethodCache.remove(IssuePortClearanceLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(IssuePortClearanceLocalServiceUtil.class,
			"_service");
		MethodCache.remove(IssuePortClearanceLocalService.class);
	}

	private static IssuePortClearanceLocalService _service;
}