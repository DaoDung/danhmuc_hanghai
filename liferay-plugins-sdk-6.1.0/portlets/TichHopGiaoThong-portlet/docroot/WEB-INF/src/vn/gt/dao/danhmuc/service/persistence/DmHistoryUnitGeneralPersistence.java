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

import vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral;

/**
 * The persistence interface for the dm history unit general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryUnitGeneralPersistenceImpl
 * @see DmHistoryUnitGeneralUtil
 * @generated
 */
public interface DmHistoryUnitGeneralPersistence extends BasePersistence<DmHistoryUnitGeneral> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryUnitGeneralUtil} to access the dm history unit general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history unit general in the entity cache if it is enabled.
	*
	* @param dmHistoryUnitGeneral the dm history unit general
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral dmHistoryUnitGeneral);

	/**
	* Caches the dm history unit generals in the entity cache if it is enabled.
	*
	* @param dmHistoryUnitGenerals the dm history unit generals
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> dmHistoryUnitGenerals);

	/**
	* Creates a new dm history unit general with the primary key. Does not add the dm history unit general to the database.
	*
	* @param id the primary key for the new dm history unit general
	* @return the new dm history unit general
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral create(int id);

	/**
	* Removes the dm history unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral dmHistoryUnitGeneral,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history unit general with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException} if it could not be found.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	/**
	* Returns the dm history unit general with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general, or <code>null</code> if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history unit generals where unitCode = &#63;.
	*
	* @param unitCode the unit code
	* @return the matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findByUnitCode(
		java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history unit generals where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @return the range of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findByUnitCode(
		java.lang.String unitCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history unit generals where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findByUnitCode(
		java.lang.String unitCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByUnitCode_First(
		java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	/**
	* Returns the last dm history unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByUnitCode_Last(
		java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	/**
	* Returns the dm history unit generals before and after the current dm history unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history unit general
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral[] findByUnitCode_PrevAndNext(
		int id, java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	/**
	* Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException} if it could not be found.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the matching dm history unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral findByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	/**
	* Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral fetchByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral fetchByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history unit generals.
	*
	* @return the dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @return the range of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryUnitGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history unit generals where unitCode = &#63; from the database.
	*
	* @param unitCode the unit code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUnitCode(java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history unit general where unitCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUnitCodeAndSyncVersion(java.lang.String unitCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryUnitGeneralException;

	/**
	* Removes all the dm history unit generals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history unit generals where unitCode = &#63;.
	*
	* @param unitCode the unit code
	* @return the number of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public int countByUnitCode(java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history unit generals where unitCode = &#63; and syncVersion = &#63;.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the number of matching dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public int countByUnitCodeAndSyncVersion(java.lang.String unitCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history unit generals.
	*
	* @return the number of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}