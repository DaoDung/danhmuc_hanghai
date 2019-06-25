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

import vn.gt.dao.danhmuc.model.DmShipType;

/**
 * The persistence interface for the dm ship type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmShipTypePersistenceImpl
 * @see DmShipTypeUtil
 * @generated
 */
public interface DmShipTypePersistence extends BasePersistence<DmShipType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmShipTypeUtil} to access the dm ship type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm ship type in the entity cache if it is enabled.
	*
	* @param dmShipType the dm ship type
	*/
	public void cacheResult(vn.gt.dao.danhmuc.model.DmShipType dmShipType);

	/**
	* Caches the dm ship types in the entity cache if it is enabled.
	*
	* @param dmShipTypes the dm ship types
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmShipType> dmShipTypes);

	/**
	* Creates a new dm ship type with the primary key. Does not add the dm ship type to the database.
	*
	* @param id the primary key for the new dm ship type
	* @return the new dm ship type
	*/
	public vn.gt.dao.danhmuc.model.DmShipType create(int id);

	/**
	* Removes the dm ship type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm ship type
	* @return the dm ship type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmShipType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmShipTypeException;

	public vn.gt.dao.danhmuc.model.DmShipType updateImpl(
		vn.gt.dao.danhmuc.model.DmShipType dmShipType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm ship type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmShipTypeException} if it could not be found.
	*
	* @param id the primary key of the dm ship type
	* @return the dm ship type
	* @throws vn.gt.dao.danhmuc.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmShipType findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmShipTypeException;

	/**
	* Returns the dm ship type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm ship type
	* @return the dm ship type, or <code>null</code> if a dm ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmShipType fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm ship types where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the matching dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmShipType> findByShipTypeCode(
		java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ship types where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of dm ship types
	* @param end the upper bound of the range of dm ship types (not inclusive)
	* @return the range of matching dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmShipType> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ship types where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of dm ship types
	* @param end the upper bound of the range of dm ship types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmShipType> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm ship type in the ordered set where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm ship type
	* @throws vn.gt.dao.danhmuc.NoSuchDmShipTypeException if a matching dm ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmShipType findByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmShipTypeException;

	/**
	* Returns the last dm ship type in the ordered set where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm ship type
	* @throws vn.gt.dao.danhmuc.NoSuchDmShipTypeException if a matching dm ship type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmShipType findByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmShipTypeException;

	/**
	* Returns the dm ship types before and after the current dm ship type in the ordered set where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm ship type
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm ship type
	* @throws vn.gt.dao.danhmuc.NoSuchDmShipTypeException if a dm ship type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmShipType[] findByShipTypeCode_PrevAndNext(
		int id, java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmShipTypeException;

	/**
	* Returns all the dm ship types.
	*
	* @return the dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmShipType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ship types
	* @param end the upper bound of the range of dm ship types (not inclusive)
	* @return the range of dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmShipType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm ship types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm ship types
	* @param end the upper bound of the range of dm ship types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmShipType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ship types where shipTypeCode = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm ship types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ship types where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the number of matching dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm ship types.
	*
	* @return the number of dm ship types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}