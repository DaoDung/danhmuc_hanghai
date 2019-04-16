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

package vn.gt.dao.danhmuc.service.persistence;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmuc.model.DmHistoryDocType;

/**
 * The persistence interface for the dm history doc type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryDocTypePersistenceImpl
 * @see DmHistoryDocTypeUtil
 * @generated
 */
public interface DmHistoryDocTypePersistence extends BasePersistence<DmHistoryDocType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryDocTypeUtil} to access the dm history doc type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history doc type in the entity cache if it is enabled.
	*
	* @param dmHistoryDocType the dm history doc type
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryDocType dmHistoryDocType);

	/**
	* Caches the dm history doc types in the entity cache if it is enabled.
	*
	* @param dmHistoryDocTypes the dm history doc types
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryDocType> dmHistoryDocTypes);

	/**
	* Creates a new dm history doc type with the primary key. Does not add the dm history doc type to the database.
	*
	* @param id the primary key for the new dm history doc type
	* @return the new dm history doc type
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType create(int id);

	/**
	* Removes the dm history doc type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;

	public vn.gt.dao.danhmuc.model.DmHistoryDocType updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryDocType dmHistoryDocType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the dm history doc type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history doc type
	* @return the dm history doc type, or <code>null</code> if a dm history doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param documentType the document type
	* @return the matching dm history doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType findByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentType the document type
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType fetchByDocumentType(
		java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentType the document type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType fetchByDocumentType(
		java.lang.String documentType, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException} if it could not be found.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the matching dm history doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType findByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history doc type where documentType = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history doc type, or <code>null</code> if a matching dm history doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryDocType fetchByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history doc types.
	*
	* @return the dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryDocType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history doc types
	* @param end the upper bound of the range of dm history doc types (not inclusive)
	* @return the range of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryDocType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history doc types
	* @param end the upper bound of the range of dm history doc types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryDocType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history doc type where documentType = &#63; from the database.
	*
	* @param documentType the document type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentType(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;

	/**
	* Removes the dm history doc type where documentType = &#63; and syncVersion = &#63; from the database.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryDocTypeException;

	/**
	* Removes all the dm history doc types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history doc types where documentType = &#63;.
	*
	* @param documentType the document type
	* @return the number of matching dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentType(java.lang.String documentType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history doc types where documentType = &#63; and syncVersion = &#63;.
	*
	* @param documentType the document type
	* @param syncVersion the sync version
	* @return the number of matching dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentTypeAndSyncVersion(
		java.lang.String documentType, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history doc types.
	*
	* @return the number of dm history doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmHistoryDocType remove(DmHistoryDocType dmHistoryDocType)
		throws SystemException;
}