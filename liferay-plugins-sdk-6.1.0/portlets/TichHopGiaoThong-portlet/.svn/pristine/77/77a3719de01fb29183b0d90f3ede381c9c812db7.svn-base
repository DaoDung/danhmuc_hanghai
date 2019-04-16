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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the result declaration local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see ResultDeclarationLocalServiceUtil
 * @see vn.gt.dao.result.service.base.ResultDeclarationLocalServiceBaseImpl
 * @see vn.gt.dao.result.service.impl.ResultDeclarationLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ResultDeclarationLocalService
	extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultDeclarationLocalServiceUtil} to access the result declaration local service. Add custom service methods to {@link vn.gt.dao.result.service.impl.ResultDeclarationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the result declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration addResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new result declaration with the primary key. Does not add the result declaration to the database.
	*
	* @param id the primary key for the new result declaration
	* @return the new result declaration
	*/
	public vn.gt.dao.result.model.ResultDeclaration createResultDeclaration(
		long id);

	/**
	* Deletes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result declaration
	* @throws PortalException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResultDeclaration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the result declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @throws SystemException if a system exception occurred
	*/
	public void deleteResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.result.model.ResultDeclaration fetchResultDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result declaration with the primary key.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration
	* @throws PortalException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.result.model.ResultDeclaration getResultDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> getResultDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations.
	*
	* @return the number of result declarations
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getResultDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the result declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration updateResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the result declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @param merge whether to merge the result declaration with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the result declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration updateResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByBusinessTypeCode(
		int businessTypeCode);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode);

	public vn.gt.dao.result.model.ResultDeclaration findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYearOrderByBusinessOrder(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(
		long documentName, int documentYear);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(
		long documentName, int documentYear);

	public int countByRequestCode(java.lang.String requestCode);

	public vn.gt.dao.result.model.ResultDeclaration findByRequestCode(
		java.lang.String requestCode);

	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear);

	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear);

	public int countByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode);

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode);
}