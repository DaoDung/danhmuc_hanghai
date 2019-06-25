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

import vn.gt.dao.danhmuc.model.HistoryRmdcShip;

/**
 * The persistence interface for the history rmdc ship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see HistoryRmdcShipPersistenceImpl
 * @see HistoryRmdcShipUtil
 * @generated
 */
public interface HistoryRmdcShipPersistence extends BasePersistence<HistoryRmdcShip> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HistoryRmdcShipUtil} to access the history rmdc ship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the history rmdc ship in the entity cache if it is enabled.
	*
	* @param historyRmdcShip the history rmdc ship
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.HistoryRmdcShip historyRmdcShip);

	/**
	* Caches the history rmdc ships in the entity cache if it is enabled.
	*
	* @param historyRmdcShips the history rmdc ships
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> historyRmdcShips);

	/**
	* Creates a new history rmdc ship with the primary key. Does not add the history rmdc ship to the database.
	*
	* @param id the primary key for the new history rmdc ship
	* @return the new history rmdc ship
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip create(long id);

	/**
	* Removes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	public vn.gt.dao.danhmuc.model.HistoryRmdcShip updateImpl(
		vn.gt.dao.danhmuc.model.HistoryRmdcShip historyRmdcShip, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history rmdc ship with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException} if it could not be found.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns the history rmdc ship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship, or <code>null</code> if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the history rmdc ships where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findBySyncVersion(
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the history rmdc ships where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findBySyncVersion(
		java.lang.String syncVersion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the history rmdc ships where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findBySyncVersion(
		java.lang.String syncVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip findBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns the last history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip findBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current history rmdc ship
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip[] findBySyncVersion_PrevAndNext(
		long id, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns all the history rmdc ships where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the history rmdc ships where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the history rmdc ships where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findByShipTypeCode(
		java.lang.String shipTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip findByShipTypeCode_First(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns the last history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a matching history rmdc ship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip findByShipTypeCode_Last(
		java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns the history rmdc ships before and after the current history rmdc ship in the ordered set where shipTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current history rmdc ship
	* @param shipTypeCode the ship type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history rmdc ship
	* @throws vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.HistoryRmdcShip[] findByShipTypeCode_PrevAndNext(
		long id, java.lang.String shipTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchHistoryRmdcShipException;

	/**
	* Returns all the history rmdc ships.
	*
	* @return the history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the history rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the history rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.HistoryRmdcShip> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the history rmdc ships where syncVersion = &#63; from the database.
	*
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the history rmdc ships where shipTypeCode = &#63; from the database.
	*
	* @param shipTypeCode the ship type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the history rmdc ships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history rmdc ships where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the number of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public int countBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history rmdc ships where shipTypeCode = &#63;.
	*
	* @param shipTypeCode the ship type code
	* @return the number of matching history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public int countByShipTypeCode(java.lang.String shipTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of history rmdc ships.
	*
	* @return the number of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}