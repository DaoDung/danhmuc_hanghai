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
 * The utility for the result history ministry local service. This utility wraps {@link vn.gt.dao.result.service.impl.ResultHistoryMinistryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see ResultHistoryMinistryLocalService
 * @see vn.gt.dao.result.service.base.ResultHistoryMinistryLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.impl.ResultHistoryMinistryLocalServiceImpl
 * @generated
 */
public class ResultHistoryMinistryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.result.service.impl.ResultHistoryMinistryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the result history ministry to the database. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @return the result history ministry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry addResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addResultHistoryMinistry(resultHistoryMinistry);
	}

	/**
	* Creates a new result history ministry with the primary key. Does not add the result history ministry to the database.
	*
	* @param id the primary key for the new result history ministry
	* @return the new result history ministry
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry createResultHistoryMinistry(
		long id) {
		return getService().createResultHistoryMinistry(id);
	}

	/**
	* Deletes the result history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result history ministry
	* @throws PortalException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteResultHistoryMinistry(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteResultHistoryMinistry(id);
	}

	/**
	* Deletes the result history ministry from the database. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteResultHistoryMinistry(resultHistoryMinistry);
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

	public static vn.gt.dao.result.model.ResultHistoryMinistry fetchResultHistoryMinistry(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchResultHistoryMinistry(id);
	}

	/**
	* Returns the result history ministry with the primary key.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry
	* @throws PortalException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry getResultHistoryMinistry(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultHistoryMinistry(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> getResultHistoryMinistries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultHistoryMinistries(start, end);
	}

	/**
	* Returns the number of result history ministries.
	*
	* @return the number of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int getResultHistoryMinistriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultHistoryMinistriesCount();
	}

	/**
	* Updates the result history ministry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @return the result history ministry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry updateResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateResultHistoryMinistry(resultHistoryMinistry);
	}

	/**
	* Updates the result history ministry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultHistoryMinistry the result history ministry
	* @param merge whether to merge the result history ministry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the result history ministry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry updateResultHistoryMinistry(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateResultHistoryMinistry(resultHistoryMinistry, merge);
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

	public static vn.gt.dao.result.model.ResultHistoryMinistry findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		int documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode) {
		return getService()
				   .findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode);
	}

	/**
	* Returns all the result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode) {
		return getService().findByMinistryCode(ministryCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findDistinctMinistryCode(
		long documentName, int documentYear) {
		return getService().findDistinctMinistryCode(documentName, documentYear);
	}

	public static vn.gt.dao.result.model.ResultHistoryMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String businessTypeCode) {
		return getService()
				   .findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(documentName,
			documentYear, ministryCode, businessTypeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static ResultHistoryMinistryLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ResultHistoryMinistryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					ResultHistoryMinistryLocalService.class.getName(),
					portletClassLoader);

			_service = new ResultHistoryMinistryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(ResultHistoryMinistryLocalServiceUtil.class,
				"_service");
			MethodCache.remove(ResultHistoryMinistryLocalService.class);
		}

		return _service;
	}

	public void setService(ResultHistoryMinistryLocalService service) {
		MethodCache.remove(ResultHistoryMinistryLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(ResultHistoryMinistryLocalServiceUtil.class,
			"_service");
		MethodCache.remove(ResultHistoryMinistryLocalService.class);
	}

	private static ResultHistoryMinistryLocalService _service;
}