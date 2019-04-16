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

package vn.gt.dao.result.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.result.model.ResultDeclaration;

/**
 * The persistence interface for the result declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultDeclarationPersistenceImpl
 * @see ResultDeclarationUtil
 * @generated
 */
public interface ResultDeclarationPersistence extends BasePersistence<ResultDeclaration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultDeclarationUtil} to access the result declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the result declaration in the entity cache if it is enabled.
	*
	* @param resultDeclaration the result declaration
	*/
	public void cacheResult(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration);

	/**
	* Caches the result declarations in the entity cache if it is enabled.
	*
	* @param resultDeclarations the result declarations
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.result.model.ResultDeclaration> resultDeclarations);

	/**
	* Creates a new result declaration with the primary key. Does not add the result declaration to the database.
	*
	* @param id the primary key for the new result declaration
	* @return the new result declaration
	*/
	public vn.gt.dao.result.model.ResultDeclaration create(long id);

	/**
	* Removes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration that was removed
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	public vn.gt.dao.result.model.ResultDeclaration updateImpl(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result declaration with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultDeclarationException} if it could not be found.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declaration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration, or <code>null</code> if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result declaration where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultDeclarationException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declaration where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result declaration where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result declarations where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result declarations where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result declarations where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByBusinessTypeCode(
		int businessTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByBusinessTypeCode_First(
		int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByBusinessTypeCode_Last(
		int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result declaration
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration[] findByBusinessTypeCode_PrevAndNext(
		long id, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYear_First(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYear_Last(
		int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result declaration
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration[] findByDocumentNameAndBusinessTypeCodeAndDocumentYear_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_First(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the last result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_Last(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result declaration
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration[] findByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode_PrevAndNext(
		long id, int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultDeclarationException} if it could not be found.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result declaration, or <code>null</code> if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration fetchByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the last result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result declaration
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration[] findByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @return the matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByRequestCodeAndBusinessTypeCode_First(
		java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the last result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a matching result declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration findByRequestCodeAndBusinessTypeCode_Last(
		java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns the result declarations before and after the current result declaration in the ordered set where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result declaration
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result declaration
	* @throws vn.gt.dao.result.NoSuchResultDeclarationException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.result.model.ResultDeclaration[] findByRequestCodeAndBusinessTypeCode_PrevAndNext(
		long id, java.lang.String requestCode, int businessTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Returns all the result declarations.
	*
	* @return the result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the result declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the result declaration where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Removes all the result declarations where businessTypeCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the result declaration where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultDeclarationException;

	/**
	* Removes all the result declarations where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result declarations where requestCode = &#63; and businessTypeCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the result declarations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where businessTypeCode = &#63; and documentName = &#63; and documentYear = &#63; and requestCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestCode the request code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByfndDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations where requestCode = &#63; and businessTypeCode = &#63;.
	*
	* @param requestCode the request code
	* @param businessTypeCode the business type code
	* @return the number of matching result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of result declarations.
	*
	* @return the number of result declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public ResultDeclaration remove(ResultDeclaration resultDeclaration)
		throws SystemException;
}