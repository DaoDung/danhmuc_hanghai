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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.result.model.ResultHistoryMinistry;

import java.util.List;

/**
 * The persistence utility for the result history ministry service. This utility wraps {@link ResultHistoryMinistryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResultHistoryMinistryPersistence
 * @see ResultHistoryMinistryPersistenceImpl
 * @generated
 */
public class ResultHistoryMinistryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ResultHistoryMinistry resultHistoryMinistry) {
		getPersistence().clearCache(resultHistoryMinistry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ResultHistoryMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResultHistoryMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResultHistoryMinistry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ResultHistoryMinistry update(
		ResultHistoryMinistry resultHistoryMinistry, boolean merge)
		throws SystemException {
		return getPersistence().update(resultHistoryMinistry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ResultHistoryMinistry update(
		ResultHistoryMinistry resultHistoryMinistry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(resultHistoryMinistry, merge, serviceContext);
	}

	/**
	* Caches the result history ministry in the entity cache if it is enabled.
	*
	* @param resultHistoryMinistry the result history ministry
	*/
	public static void cacheResult(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry) {
		getPersistence().cacheResult(resultHistoryMinistry);
	}

	/**
	* Caches the result history ministries in the entity cache if it is enabled.
	*
	* @param resultHistoryMinistries the result history ministries
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> resultHistoryMinistries) {
		getPersistence().cacheResult(resultHistoryMinistries);
	}

	/**
	* Creates a new result history ministry with the primary key. Does not add the result history ministry to the database.
	*
	* @param id the primary key for the new result history ministry
	* @return the new result history ministry
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the result history ministry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry that was removed
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.result.model.ResultHistoryMinistry updateImpl(
		vn.gt.dao.result.model.ResultHistoryMinistry resultHistoryMinistry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(resultHistoryMinistry, merge);
	}

	/**
	* Returns the result history ministry with the primary key or throws a {@link vn.gt.dao.result.NoSuchResultHistoryMinistryException} if it could not be found.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the result history ministry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the result history ministry
	* @return the result history ministry, or <code>null</code> if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the result history ministry where requestCode = &#63; or throws a {@link vn.gt.dao.result.NoSuchResultHistoryMinistryException} if it could not be found.
	*
	* @param requestCode the request code
	* @return the matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns the result history ministry where requestCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param requestCode the request code
	* @return the matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRequestCode(requestCode);
	}

	/**
	* Returns the result history ministry where requestCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param requestCode the request code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching result history ministry, or <code>null</code> if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry fetchByRequestCode(
		java.lang.String requestCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode(requestCode, retrieveFromCache);
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
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByDocumentNameAnddocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByDocumentNameAnddocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the result history ministries before and after the current result history ministry in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result history ministry
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry[] findByDocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode);
	}

	/**
	* Returns a range of all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode, start, end);
	}

	/**
	* Returns an ordered range of all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode, start, end, orderByComparator);
	}

	/**
	* Returns the first result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByDocumentNameAnddocumentYearAndMinistryCode_First(
		long documentName, int documentYear, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMinistryCode_First(documentName,
			documentYear, ministryCode, orderByComparator);
	}

	/**
	* Returns the last result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByDocumentNameAnddocumentYearAndMinistryCode_Last(
		long documentName, int documentYear, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMinistryCode_Last(documentName,
			documentYear, ministryCode, orderByComparator);
	}

	/**
	* Returns the result history ministries before and after the current result history ministry in the ordered set where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result history ministry
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry[] findByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByDocumentNameAnddocumentYearAndMinistryCode_PrevAndNext(id,
			documentName, documentYear, ministryCode, orderByComparator);
	}

	/**
	* Returns all the result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMinistryCode(ministryCode);
	}

	/**
	* Returns a range of all the result history ministries where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @return the range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMinistryCode(ministryCode, start, end);
	}

	/**
	* Returns an ordered range of all the result history ministries where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ministryCode the ministry code
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findByMinistryCode(
		java.lang.String ministryCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMinistryCode(ministryCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first result history ministry in the ordered set where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByMinistryCode_First(
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByMinistryCode_First(ministryCode, orderByComparator);
	}

	/**
	* Returns the last result history ministry in the ordered set where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a matching result history ministry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry findByMinistryCode_Last(
		java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByMinistryCode_Last(ministryCode, orderByComparator);
	}

	/**
	* Returns the result history ministries before and after the current result history ministry in the ordered set where ministryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current result history ministry
	* @param ministryCode the ministry code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next result history ministry
	* @throws vn.gt.dao.result.NoSuchResultHistoryMinistryException if a result history ministry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.result.model.ResultHistoryMinistry[] findByMinistryCode_PrevAndNext(
		long id, java.lang.String ministryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		return getPersistence()
				   .findByMinistryCode_PrevAndNext(id, ministryCode,
			orderByComparator);
	}

	/**
	* Returns all the result history ministries.
	*
	* @return the result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the result history ministries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of result history ministries
	* @param end the upper bound of the range of result history ministries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.result.model.ResultHistoryMinistry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the result history ministry where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.result.NoSuchResultHistoryMinistryException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Removes all the result history ministries where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYear(documentName, documentYear);
	}

	/**
	* Removes all the result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode);
	}

	/**
	* Removes all the result history ministries where ministryCode = &#63; from the database.
	*
	* @param ministryCode the ministry code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMinistryCode(ministryCode);
	}

	/**
	* Removes all the result history ministries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of result history ministries where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns the number of result history ministries where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of result history ministries where documentName = &#63; and documentYear = &#63; and ministryCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param ministryCode the ministry code
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAnddocumentYearAndMinistryCode(
		long documentName, int documentYear, java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAnddocumentYearAndMinistryCode(documentName,
			documentYear, ministryCode);
	}

	/**
	* Returns the number of result history ministries where ministryCode = &#63;.
	*
	* @param ministryCode the ministry code
	* @return the number of matching result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMinistryCode(java.lang.String ministryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMinistryCode(ministryCode);
	}

	/**
	* Returns the number of result history ministries.
	*
	* @return the number of result history ministries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResultHistoryMinistryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResultHistoryMinistryPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.result.service.ClpSerializer.getServletContextName(),
					ResultHistoryMinistryPersistence.class.getName());

			ReferenceRegistry.registerReference(ResultHistoryMinistryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ResultHistoryMinistryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ResultHistoryMinistryUtil.class,
			"_persistence");
	}

	private static ResultHistoryMinistryPersistence _persistence;
}