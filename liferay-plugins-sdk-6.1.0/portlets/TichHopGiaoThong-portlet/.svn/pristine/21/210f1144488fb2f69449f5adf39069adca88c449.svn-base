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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;

import java.util.List;

/**
 * The persistence utility for the issue permission for transit service. This utility wraps {@link IssuePermissionForTransitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssuePermissionForTransitPersistence
 * @see IssuePermissionForTransitPersistenceImpl
 * @generated
 */
public class IssuePermissionForTransitUtil {
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
	public static void clearCache(
		IssuePermissionForTransit issuePermissionForTransit) {
		getPersistence().clearCache(issuePermissionForTransit);
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
	public static List<IssuePermissionForTransit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssuePermissionForTransit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssuePermissionForTransit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static IssuePermissionForTransit update(
		IssuePermissionForTransit issuePermissionForTransit, boolean merge)
		throws SystemException {
		return getPersistence().update(issuePermissionForTransit, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static IssuePermissionForTransit update(
		IssuePermissionForTransit issuePermissionForTransit, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(issuePermissionForTransit, merge, serviceContext);
	}

	/**
	* Caches the issue permission for transit in the entity cache if it is enabled.
	*
	* @param issuePermissionForTransit the issue permission for transit
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit) {
		getPersistence().cacheResult(issuePermissionForTransit);
	}

	/**
	* Caches the issue permission for transits in the entity cache if it is enabled.
	*
	* @param issuePermissionForTransits the issue permission for transits
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> issuePermissionForTransits) {
		getPersistence().cacheResult(issuePermissionForTransits);
	}

	/**
	* Creates a new issue permission for transit with the primary key. Does not add the issue permission for transit to the database.
	*
	* @param id the primary key for the new issue permission for transit
	* @return the new issue permission for transit
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the issue permission for transit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit updateImpl(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issuePermissionForTransit, merge);
	}

	/**
	* Returns the issue permission for transit with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException} if it could not be found.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the issue permission for transit with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue permission for transit
	* @return the issue permission for transit, or <code>null</code> if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current issue permission for transit
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit[] findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByfindIssuePermissionForTransitByDocumentYearAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState, retrieveFromCache);
	}

	/**
	* Returns all the issue permission for transits where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestCode(requestCode);
	}

	/**
	* Returns a range of all the issue permission for transits where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByrequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByrequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByrequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByrequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByrequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByrequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current issue permission for transit
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit[] findByrequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByrequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findBydocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findBydocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current issue permission for transit
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit[] findBydocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findBydocumentNameAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit fetchByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching issue permission for transit, or <code>null</code> if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit fetchByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo, retrieveFromCache);
	}

	/**
	* Returns all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @return the matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_LAST_numberPortClearance(documentName,
			documentYear, numberPermissionForTransit);
	}

	/**
	* Returns a range of all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPermissionForTransit, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_LAST_numberPortClearance(documentName,
			documentYear, numberPermissionForTransit, start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPermissionForTransit, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_LAST_numberPortClearance(documentName,
			documentYear, numberPermissionForTransit, start, end,
			orderByComparator);
	}

	/**
	* Returns the first issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByF_LAST_numberPortClearance_First(
		long documentName, int documentYear,
		java.lang.String numberPermissionForTransit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByF_LAST_numberPortClearance_First(documentName,
			documentYear, numberPermissionForTransit, orderByComparator);
	}

	/**
	* Returns the last issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a matching issue permission for transit could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByF_LAST_numberPortClearance_Last(
		long documentName, int documentYear,
		java.lang.String numberPermissionForTransit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByF_LAST_numberPortClearance_Last(documentName,
			documentYear, numberPermissionForTransit, orderByComparator);
	}

	/**
	* Returns the issue permission for transits before and after the current issue permission for transit in the ordered set where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current issue permission for transit
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue permission for transit
	* @throws vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException if a issue permission for transit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit[] findByF_LAST_numberPortClearance_PrevAndNext(
		long id, long documentName, int documentYear,
		java.lang.String numberPermissionForTransit,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		return getPersistence()
				   .findByF_LAST_numberPortClearance_PrevAndNext(id,
			documentName, documentYear, numberPermissionForTransit,
			orderByComparator);
	}

	/**
	* Returns all the issue permission for transits.
	*
	* @return the issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue permission for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @return the range of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue permission for transits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issue permission for transits
	* @param end the upper bound of the range of issue permission for transits (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Removes the issue permission for transit where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		getPersistence()
			.removeByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Removes all the issue permission for transits where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByrequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByrequestCode(requestCode);
	}

	/**
	* Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeBydocumentNameAndDocumentYear(documentName, documentYear);
	}

	/**
	* Removes the issue permission for transit where documentName = &#63; and documentYear = &#63; and versionNo = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchIssuePermissionForTransitException {
		getPersistence()
			.removeByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Removes all the issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_LAST_numberPortClearance(long documentName,
		int documentYear, java.lang.String numberPermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByF_LAST_numberPortClearance(documentName, documentYear,
			numberPermissionForTransit);
	}

	/**
	* Removes all the issue permission for transits from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByfindIssuePermissionForTransitByDocumentYearAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of issue permission for transits where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByrequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByrequestCode(requestCode);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydocumentNameAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBydocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and versionNo = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param versionNo the version no
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocumentNameAndDocumentYearAndVersionNo(documentName,
			documentYear, versionNo);
	}

	/**
	* Returns the number of issue permission for transits where documentName = &#63; and documentYear = &#63; and numberPermissionForTransit = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param numberPermissionForTransit the number permission for transit
	* @return the number of matching issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_LAST_numberPortClearance(long documentName,
		int documentYear, java.lang.String numberPermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_LAST_numberPortClearance(documentName,
			documentYear, numberPermissionForTransit);
	}

	/**
	* Returns the number of issue permission for transits.
	*
	* @return the number of issue permission for transits
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssuePermissionForTransitPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssuePermissionForTransitPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					IssuePermissionForTransitPersistence.class.getName());

			ReferenceRegistry.registerReference(IssuePermissionForTransitUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(IssuePermissionForTransitPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(IssuePermissionForTransitUtil.class,
			"_persistence");
	}

	private static IssuePermissionForTransitPersistence _persistence;
}