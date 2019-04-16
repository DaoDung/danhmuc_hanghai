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

import vn.gt.dao.noticeandmessage.model.TempDocument;

import java.util.List;

/**
 * The persistence utility for the temp document service. This utility wraps {@link TempDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempDocumentPersistence
 * @see TempDocumentPersistenceImpl
 * @generated
 */
public class TempDocumentUtil {
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
	public static void clearCache(TempDocument tempDocument) {
		getPersistence().clearCache(tempDocument);
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
	public static List<TempDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TempDocument update(TempDocument tempDocument, boolean merge)
		throws SystemException {
		return getPersistence().update(tempDocument, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TempDocument update(TempDocument tempDocument, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tempDocument, merge, serviceContext);
	}

	/**
	* Caches the temp document in the entity cache if it is enabled.
	*
	* @param tempDocument the temp document
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument) {
		getPersistence().cacheResult(tempDocument);
	}

	/**
	* Caches the temp documents in the entity cache if it is enabled.
	*
	* @param tempDocuments the temp documents
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> tempDocuments) {
		getPersistence().cacheResult(tempDocuments);
	}

	/**
	* Creates a new temp document with the primary key. Does not add the temp document to the database.
	*
	* @param id the primary key for the new temp document
	* @return the new temp document
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp document
	* @return the temp document that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.TempDocument updateImpl(
		vn.gt.dao.noticeandmessage.model.TempDocument tempDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempDocument, merge);
	}

	/**
	* Returns the temp document with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempDocumentException} if it could not be found.
	*
	* @param id the primary key of the temp document
	* @return the temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp document
	* @return the temp document, or <code>null</code> if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYear_First(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear_First(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYear_Last(
		long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear_Last(documentName,
			documentYear, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp document
	* @param documentName the document name
	* @param documentYear the document year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument[] findByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYear_PrevAndNext(id,
			documentName, documentYear, orderByComparator);
	}

	/**
	* Returns all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns a range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState_First(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState_Last(documentName,
			documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp document
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument[] findByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTemDocumentByDocumentNameAndDocumentYearRequestState_PrevAndNext(id,
			documentName, documentYear, requestState, orderByComparator);
	}

	/**
	* Returns the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempDocumentException} if it could not be found.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @return the matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByF_B_N_Y_TYPE(
		long documentName, int documentYear, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByF_B_N_Y_TYPE(documentName, documentYear,
			documentTypeCode);
	}

	/**
	* Returns the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @return the matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument fetchByF_B_N_Y_TYPE(
		long documentName, int documentYear, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_B_N_Y_TYPE(documentName, documentYear,
			documentTypeCode);
	}

	/**
	* Returns the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp document, or <code>null</code> if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument fetchByF_B_N_Y_TYPE(
		long documentName, int documentYear, java.lang.String documentTypeCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_B_N_Y_TYPE(documentName, documentYear,
			documentTypeCode, retrieveFromCache);
	}

	/**
	* Returns all the temp documents where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the temp documents where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp document
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Returns all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode);
	}

	/**
	* Returns a range of all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByTempDocumentByShipNameSMSAndDocumentTypeCode(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByTempDocumentByShipNameSMSAndDocumentTypeCode_First(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTempDocumentByShipNameSMSAndDocumentTypeCode_First(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByTempDocumentByShipNameSMSAndDocumentTypeCode_Last(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTempDocumentByShipNameSMSAndDocumentTypeCode_Last(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp document
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument[] findByTempDocumentByShipNameSMSAndDocumentTypeCode_PrevAndNext(
		long id, java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByTempDocumentByShipNameSMSAndDocumentTypeCode_PrevAndNext(id,
			shipName, callSign, shipTypeCode, documentYear, documentTypeCode,
			orderByComparator);
	}

	/**
	* Returns all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @return the matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByF_documentTypeCode_maritimeCode(
		java.lang.String documentTypeCode, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode);
	}

	/**
	* Returns a range of all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByF_documentTypeCode_maritimeCode(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findByF_documentTypeCode_maritimeCode(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode, start, end, orderByComparator);
	}

	/**
	* Returns the first temp document in the ordered set where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByF_documentTypeCode_maritimeCode_First(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByF_documentTypeCode_maritimeCode_First(documentTypeCode,
			maritimeCode, orderByComparator);
	}

	/**
	* Returns the last temp document in the ordered set where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a matching temp document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument findByF_documentTypeCode_maritimeCode_Last(
		java.lang.String documentTypeCode, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByF_documentTypeCode_maritimeCode_Last(documentTypeCode,
			maritimeCode, orderByComparator);
	}

	/**
	* Returns the temp documents before and after the current temp document in the ordered set where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current temp document
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp document
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempDocumentException if a temp document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempDocument[] findByF_documentTypeCode_maritimeCode_PrevAndNext(
		long id, java.lang.String documentTypeCode,
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		return getPersistence()
				   .findByF_documentTypeCode_maritimeCode_PrevAndNext(id,
			documentTypeCode, maritimeCode, orderByComparator);
	}

	/**
	* Returns all the temp documents.
	*
	* @return the temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @return the range of temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp documents
	* @param end the upper bound of the range of temp documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp documents where documentName = &#63; and documentYear = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Removes all the temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Removes the temp document where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_B_N_Y_TYPE(long documentName,
		int documentYear, java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempDocumentException {
		getPersistence()
			.removeByF_B_N_Y_TYPE(documentName, documentYear, documentTypeCode);
	}

	/**
	* Removes all the temp documents where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Removes all the temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63; from the database.
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTempDocumentByShipNameSMSAndDocumentTypeCode(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode);
	}

	/**
	* Removes all the temp documents where documentTypeCode = &#63; and maritimeCode = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_documentTypeCode_maritimeCode(
		java.lang.String documentTypeCode, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode);
	}

	/**
	* Removes all the temp documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp documents where documentName = &#63; and documentYear = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTemDocumentByDocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTemDocumentByDocumentNameAndDocumentYear(documentName,
			documentYear);
	}

	/**
	* Returns the number of temp documents where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param requestState the request state
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTemDocumentByDocumentNameAndDocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTemDocumentByDocumentNameAndDocumentYearRequestState(documentName,
			documentYear, requestState);
	}

	/**
	* Returns the number of temp documents where documentName = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* @param documentName the document name
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_B_N_Y_TYPE(long documentName, int documentYear,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_B_N_Y_TYPE(documentName, documentYear,
			documentTypeCode);
	}

	/**
	* Returns the number of temp documents where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns the number of temp documents where shipName = &#63; and callSign = &#63; and shipTypeCode = &#63; and documentYear = &#63; and documentTypeCode = &#63;.
	*
	* @param shipName the ship name
	* @param callSign the call sign
	* @param shipTypeCode the ship type code
	* @param documentYear the document year
	* @param documentTypeCode the document type code
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTempDocumentByShipNameSMSAndDocumentTypeCode(
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipTypeCode, int documentYear,
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTempDocumentByShipNameSMSAndDocumentTypeCode(shipName,
			callSign, shipTypeCode, documentYear, documentTypeCode);
	}

	/**
	* Returns the number of temp documents where documentTypeCode = &#63; and maritimeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @param maritimeCode the maritime code
	* @return the number of matching temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_documentTypeCode_maritimeCode(
		java.lang.String documentTypeCode, java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_documentTypeCode_maritimeCode(documentTypeCode,
			maritimeCode);
	}

	/**
	* Returns the number of temp documents.
	*
	* @return the number of temp documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempDocumentPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempDocumentPersistence.class.getName());

			ReferenceRegistry.registerReference(TempDocumentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(TempDocumentPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(TempDocumentUtil.class,
			"_persistence");
	}

	private static TempDocumentPersistence _persistence;
}