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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmucgt.model.DmGTShipPosition;

/**
 * The persistence interface for the dm g t ship position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGTShipPositionPersistenceImpl
 * @see DmGTShipPositionUtil
 * @generated
 */
public interface DmGTShipPositionPersistence extends BasePersistence<DmGTShipPosition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGTShipPositionUtil} to access the dm g t ship position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm g t ship position in the entity cache if it is enabled.
	*
	* @param dmGTShipPosition the dm g t ship position
	*/
	public void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition);

	/**
	* Caches the dm g t ship positions in the entity cache if it is enabled.
	*
	* @param dmGTShipPositions the dm g t ship positions
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> dmGTShipPositions);

	/**
	* Creates a new dm g t ship position with the primary key. Does not add the dm g t ship position to the database.
	*
	* @param id the primary key for the new dm g t ship position
	* @return the new dm g t ship position
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition create(long id);

	/**
	* Removes the dm g t ship position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException;

	public vn.gt.dao.danhmucgt.model.DmGTShipPosition updateImpl(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm g t ship position with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException} if it could not be found.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException;

	/**
	* Returns the dm g t ship position with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position, or <code>null</code> if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm g t ship positions where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @return the matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm g t ship positions where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm g t ship positions where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition findByPositionCode_First(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException;

	/**
	* Returns the last dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition findByPositionCode_Last(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException;

	/**
	* Returns the dm g t ship positions before and after the current dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm g t ship position
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGTShipPosition[] findByPositionCode_PrevAndNext(
		long id, java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException;

	/**
	* Returns all the dm g t ship positions.
	*
	* @return the dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm g t ship positions where positionCode = &#63; from the database.
	*
	* @param positionCode the position code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPositionCode(java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm g t ship positions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t ship positions where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @return the number of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPositionCode(java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm g t ship positions.
	*
	* @return the number of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmGTShipPosition remove(DmGTShipPosition dmGTShipPosition)
		throws SystemException;
}