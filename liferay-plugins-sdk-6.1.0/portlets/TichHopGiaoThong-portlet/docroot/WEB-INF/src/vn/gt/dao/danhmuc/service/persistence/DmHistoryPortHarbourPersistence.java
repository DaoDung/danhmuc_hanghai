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

import vn.gt.dao.danhmuc.model.DmHistoryPortHarbour;

/**
 * The persistence interface for the dm history port harbour service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryPortHarbourPersistenceImpl
 * @see DmHistoryPortHarbourUtil
 * @generated
 */
public interface DmHistoryPortHarbourPersistence extends BasePersistence<DmHistoryPortHarbour> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryPortHarbourUtil} to access the dm history port harbour persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history port harbour in the entity cache if it is enabled.
	*
	* @param dmHistoryPortHarbour the dm history port harbour
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryPortHarbour dmHistoryPortHarbour);

	/**
	* Caches the dm history port harbours in the entity cache if it is enabled.
	*
	* @param dmHistoryPortHarbours the dm history port harbours
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> dmHistoryPortHarbours);

	/**
	* Creates a new dm history port harbour with the primary key. Does not add the dm history port harbour to the database.
	*
	* @param id the primary key for the new dm history port harbour
	* @return the new dm history port harbour
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour create(int id);

	/**
	* Removes the dm history port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryPortHarbour dmHistoryPortHarbour,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history port harbour with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException} if it could not be found.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the dm history port harbour with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour, or <code>null</code> if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history port harbours where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findByPortHarbourCode(
		java.lang.String portHarbourCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour findByPortHarbourCode_First(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the last dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour findByPortHarbourCode_Last(
		java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the dm history port harbours before and after the current dm history port harbour in the ordered set where portHarbourCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history port harbour
	* @param portHarbourCode the port harbour code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour[] findByPortHarbourCode_PrevAndNext(
		int id, java.lang.String portHarbourCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException} if it could not be found.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the matching dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour findByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour fetchByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history port harbour, or <code>null</code> if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour fetchByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history port harbours where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findByPortRegionCode(
		java.lang.String portRegionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour findByPortRegionCode_First(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the last dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a matching dm history port harbour could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour findByPortRegionCode_Last(
		java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns the dm history port harbours before and after the current dm history port harbour in the ordered set where portRegionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history port harbour
	* @param portRegionCode the port region code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history port harbour
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryPortHarbour[] findByPortRegionCode_PrevAndNext(
		int id, java.lang.String portRegionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Returns all the dm history port harbours.
	*
	* @return the dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryPortHarbour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history port harbours where portHarbourCode = &#63; from the database.
	*
	* @param portHarbourCode the port harbour code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history port harbour where portHarbourCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryPortHarbourException;

	/**
	* Removes all the dm history port harbours where portRegionCode = &#63; from the database.
	*
	* @param portRegionCode the port region code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history port harbours from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history port harbours where portHarbourCode = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @return the number of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortHarbourCode(java.lang.String portHarbourCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history port harbours where portHarbourCode = &#63; and syncVersion = &#63;.
	*
	* @param portHarbourCode the port harbour code
	* @param syncVersion the sync version
	* @return the number of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortHarbourCodeAndSyncVersion(
		java.lang.String portHarbourCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history port harbours where portRegionCode = &#63;.
	*
	* @param portRegionCode the port region code
	* @return the number of matching dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortRegionCode(java.lang.String portRegionCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history port harbours.
	*
	* @return the number of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}