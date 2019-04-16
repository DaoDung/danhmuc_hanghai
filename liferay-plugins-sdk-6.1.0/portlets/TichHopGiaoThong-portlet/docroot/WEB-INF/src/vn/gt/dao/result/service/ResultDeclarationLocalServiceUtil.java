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
 * The utility for the result declaration local service. This utility wraps {@link vn.gt.dao.result.service.impl.ResultDeclarationLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see ResultDeclarationLocalService
 * @see vn.gt.dao.result.service.base.ResultDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.impl.ResultDeclarationLocalServiceImpl
 * @generated
 */
public class ResultDeclarationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gt.dao.result.service.impl.ResultDeclarationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the result declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultDeclaration addResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addResultDeclaration(resultDeclaration);
	}

	/**
	* Creates a new result declaration with the primary key. Does not add the result declaration to the database.
	*
	* @param id the primary key for the new result declaration
	* @return the new result declaration
	*/
	public static vn.gt.dao.result.model.ResultDeclaration createResultDeclaration(
		long id) {
		return getService().createResultDeclaration(id);
	}

	/**
	* Deletes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result declaration
	* @throws PortalException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteResultDeclaration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteResultDeclaration(id);
	}

	/**
	* Deletes the result declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteResultDeclaration(resultDeclaration);
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

	public static vn.gt.dao.result.model.ResultDeclaration fetchResultDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchResultDeclaration(id);
	}

	/**
	* Returns the result declaration with the primary key.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration
	* @throws PortalException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultDeclaration getResultDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultDeclaration(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> getResultDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultDeclarations(start, end);
	}

	/**
	* Returns the number of result declarations.
	*
	* @return the number of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int getResultDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getResultDeclarationsCount();
	}

	/**
	* Updates the result declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultDeclaration updateResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateResultDeclaration(resultDeclaration);
	}

	/**
	* Updates the result declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @param merge whether to merge the result declaration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the result declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultDeclaration updateResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateResultDeclaration(resultDeclaration, merge);
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

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByBusinessTypeCode(
		int businessTypeCode) {
		return getService()
				   .findResultDeclarationByBusinessTypeCode(businessTypeCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode) {
		return getService()
				   .DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	public static vn.gt.dao.result.model.ResultDeclaration findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode) {
		return getService()
				   .findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode) {
		return getService()
				   .FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(businessTypeCode,
			documentName, documentYear, requestCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAndDocumentYear(documentName, documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYearOrderByBusinessOrder(
		long documentName, int documentYear) {
		return getService()
				   .findByDocumentNameAndDocumentYearOrderByBusinessOrder(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
		long documentName, int documentYear) {
		return getService()
				   .findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(
		long documentName, int documentYear) {
		return getService()
				   .findResultDeclarationByDocumentNameAndDocumentYearXcReport(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(
		long documentName, int documentYear) {
		return getService()
				   .findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(documentName,
			documentYear);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(
		long documentName, int documentYear) {
		return getService()
				   .findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(documentName,
			documentYear);
	}

	public static int countByRequestCode(java.lang.String requestCode) {
		return getService().countByRequestCode(requestCode);
	}

	public static vn.gt.dao.result.model.ResultDeclaration findByRequestCode(
		java.lang.String requestCode) {
		return getService().findByRequestCode(requestCode);
	}

	public static int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear) {
		return getService()
				   .countByDocumentNameAndBusinessTypeCodeAndDocumentYear(businessTypeCode,
			documentName, documentYear);
	}

	public static int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		return getService()
				   .countByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	public static int countByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode) {
		return getService()
				   .countByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode);
	}

	public static java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode) {
		return getService()
				   .findByRequestCodeAndBusinessTypeCode(requestCode,
			businessTypeCode);
	}

	public static void clearService() {
		_service = null;
	}

	public static ResultDeclarationLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ResultDeclarationLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					ResultDeclarationLocalService.class.getName(),
					portletClassLoader);

			_service = new ResultDeclarationLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(ResultDeclarationLocalServiceUtil.class,
				"_service");
			MethodCache.remove(ResultDeclarationLocalService.class);
		}

		return _service;
	}

	public void setService(ResultDeclarationLocalService service) {
		MethodCache.remove(ResultDeclarationLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(ResultDeclarationLocalServiceUtil.class,
			"_service");
		MethodCache.remove(ResultDeclarationLocalService.class);
	}

	private static ResultDeclarationLocalService _service;
}