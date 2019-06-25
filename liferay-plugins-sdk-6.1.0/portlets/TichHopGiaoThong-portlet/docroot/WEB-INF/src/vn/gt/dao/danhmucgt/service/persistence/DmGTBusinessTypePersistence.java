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

package vn.gt.dao.danhmucgt.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmucgt.model.DmGTBusinessType;

/**
 * The persistence interface for the dm g t business type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGTBusinessTypePersistenceImpl
 * @see DmGTBusinessTypeUtil
 * @generated
 */
public interface DmGTBusinessTypePersistence extends BasePersistence<DmGTBusinessType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGTBusinessTypeUtil} to access the dm g t business type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm g t business type in the entity cache if it is enabled.
	*
	* @param dmGTBusinessType the dm g t business type
	*/
	public void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGTBusinessType dmGTBusinessType);

	/**
	* Caches the dm g t business types in the entity cache if it is enabled.
	*
	* @param dmGTBusinessTypes the dm g t business types
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGTBusinessType> dmGTBusinessTypes);

	/**
	* Creates a new dm g t business type with the primary key. Does not add the dm g t business type to the database.
	*
	* @param id the primary key for the new dm g t business type
	* @return the new dm g t business type
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType create(long id);

	/**
	* Removes the dm g t business type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException;

	public vn.gt.dao.danhmucgt.model.DmGTBusinessType updateImpl(
		vn.gt.dao.danhmucgt.model.DmGTBusinessType dmGTBusinessType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t business type with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException} if it could not be found.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException;

	/**
	* Returns the dm g t business type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm g t business type
	* @return the dm g t business type, or <code>null</code> if a dm g t business type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t business type where businessTypeCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException} if it could not be found.
	*
	* @param businessTypeCode the business type code
	* @return the matching dm g t business type
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException if a matching dm g t business type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType findByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException;

	/**
	* Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param businessTypeCode the business type code
	* @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType fetchByBusinessTypeCode(
		int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t business type where businessTypeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param businessTypeCode the business type code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm g t business type, or <code>null</code> if a matching dm g t business type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTBusinessType fetchByBusinessTypeCode(
		int businessTypeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm g t business types.
	*
	* @return the dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTBusinessType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm g t business types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t business types
	* @param end the upper bound of the range of dm g t business types (not inclusive)
	* @return the range of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTBusinessType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm g t business types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t business types
	* @param end the upper bound of the range of dm g t business types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTBusinessType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm g t business type where businessTypeCode = &#63; from the database.
	*
	* @param businessTypeCode the business type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTBusinessTypeException;

	/**
	* Removes all the dm g t business types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t business types where businessTypeCode = &#63;.
	*
	* @param businessTypeCode the business type code
	* @return the number of matching dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public int countByBusinessTypeCode(int businessTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t business types.
	*
	* @return the number of dm g t business types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}