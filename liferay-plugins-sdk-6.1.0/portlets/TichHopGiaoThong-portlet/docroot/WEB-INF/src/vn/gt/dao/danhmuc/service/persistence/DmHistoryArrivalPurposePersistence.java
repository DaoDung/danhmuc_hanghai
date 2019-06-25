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

import vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose;

/**
 * The persistence interface for the dm history arrival purpose service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryArrivalPurposePersistenceImpl
 * @see DmHistoryArrivalPurposeUtil
 * @generated
 */
public interface DmHistoryArrivalPurposePersistence extends BasePersistence<DmHistoryArrivalPurpose> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryArrivalPurposeUtil} to access the dm history arrival purpose persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history arrival purpose in the entity cache if it is enabled.
	*
	* @param dmHistoryArrivalPurpose the dm history arrival purpose
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose);

	/**
	* Caches the dm history arrival purposes in the entity cache if it is enabled.
	*
	* @param dmHistoryArrivalPurposes the dm history arrival purposes
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> dmHistoryArrivalPurposes);

	/**
	* Creates a new dm history arrival purpose with the primary key. Does not add the dm history arrival purpose to the database.
	*
	* @param id the primary key for the new dm history arrival purpose
	* @return the new dm history arrival purpose
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose create(int id);

	/**
	* Removes the dm history arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history arrival purpose
	* @return the dm history arrival purpose that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history arrival purpose with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException} if it could not be found.
	*
	* @param id the primary key of the dm history arrival purpose
	* @return the dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	/**
	* Returns the dm history arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history arrival purpose
	* @return the dm history arrival purpose, or <code>null</code> if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history arrival purposes where purposeCode = &#63;.
	*
	* @param purposeCode the purpose code
	* @return the matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history arrival purposes where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @return the range of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history arrival purposes where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPurposeCode_First(
		java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	/**
	* Returns the last dm history arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPurposeCode_Last(
		java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	/**
	* Returns the dm history arrival purposes before and after the current dm history arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history arrival purpose
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose[] findByPurposeCode_PrevAndNext(
		int id, java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	/**
	* Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException} if it could not be found.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @return the matching dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	/**
	* Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @return the matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose fetchByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose fetchByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history arrival purposes.
	*
	* @return the dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @return the range of dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history arrival purposes where purposeCode = &#63; from the database.
	*
	* @param purposeCode the purpose code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPurposeCode(java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException;

	/**
	* Removes all the dm history arrival purposes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history arrival purposes where purposeCode = &#63;.
	*
	* @param purposeCode the purpose code
	* @return the number of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public int countByPurposeCode(java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history arrival purposes where purposeCode = &#63; and syncVersion = &#63;.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @return the number of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public int countByPurposeCodeAndSyncVersion(java.lang.String purposeCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history arrival purposes.
	*
	* @return the number of dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}