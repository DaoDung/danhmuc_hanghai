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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmuc.model.DmDocType;

/**
 * The persistence interface for the dm doc type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDocTypePersistenceImpl
 * @see DmDocTypeUtil
 * @generated
 */
public interface DmDocTypePersistence extends BasePersistence<DmDocType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDocTypeUtil} to access the dm doc type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm doc type in the entity cache if it is enabled.
	*
	* @param dmDocType the dm doc type
	*/
	public void cacheResult(vn.gt.dao.danhmuc.model.DmDocType dmDocType);

	/**
	* Caches the dm doc types in the entity cache if it is enabled.
	*
	* @param dmDocTypes the dm doc types
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmDocType> dmDocTypes);

	/**
	* Creates a new dm doc type with the primary key. Does not add the dm doc type to the database.
	*
	* @param id the primary key for the new dm doc type
	* @return the new dm doc type
	*/
	public vn.gt.dao.danhmuc.model.DmDocType create(int id);

	/**
	* Removes the dm doc type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDocType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException;

	public vn.gt.dao.danhmuc.model.DmDocType updateImpl(
		vn.gt.dao.danhmuc.model.DmDocType dmDocType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm doc type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDocTypeException} if it could not be found.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDocType findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException;

	/**
	* Returns the dm doc type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm doc type
	* @return the dm doc type, or <code>null</code> if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDocType fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm doc types where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findByDocumentTypeCode(
		java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm doc types where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @return the range of matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm doc types where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findByDocumentTypeCode(
		java.lang.String documentTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm doc type in the ordered set where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a matching dm doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDocType findByDocumentTypeCode_First(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException;

	/**
	* Returns the last dm doc type in the ordered set where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a matching dm doc type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDocType findByDocumentTypeCode_Last(
		java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException;

	/**
	* Returns the dm doc types before and after the current dm doc type in the ordered set where documentTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm doc type
	* @param documentTypeCode the document type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm doc type
	* @throws vn.gt.dao.danhmuc.NoSuchDmDocTypeException if a dm doc type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDocType[] findByDocumentTypeCode_PrevAndNext(
		int id, java.lang.String documentTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDocTypeException;

	/**
	* Returns all the dm doc types.
	*
	* @return the dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @return the range of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm doc types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm doc types
	* @param end the upper bound of the range of dm doc types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDocType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm doc types where documentTypeCode = &#63; from the database.
	*
	* @param documentTypeCode the document type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocumentTypeCode(java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm doc types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm doc types where documentTypeCode = &#63;.
	*
	* @param documentTypeCode the document type code
	* @return the number of matching dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocumentTypeCode(java.lang.String documentTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm doc types.
	*
	* @return the number of dm doc types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}