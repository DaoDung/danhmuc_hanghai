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

import vn.gt.dao.danhmuc.model.DmArrivalPurpose;

/**
 * The persistence interface for the dm arrival purpose service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmArrivalPurposePersistenceImpl
 * @see DmArrivalPurposeUtil
 * @generated
 */
public interface DmArrivalPurposePersistence extends BasePersistence<DmArrivalPurpose> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmArrivalPurposeUtil} to access the dm arrival purpose persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm arrival purpose in the entity cache if it is enabled.
	*
	* @param dmArrivalPurpose the dm arrival purpose
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmArrivalPurpose dmArrivalPurpose);

	/**
	* Caches the dm arrival purposes in the entity cache if it is enabled.
	*
	* @param dmArrivalPurposes the dm arrival purposes
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> dmArrivalPurposes);

	/**
	* Creates a new dm arrival purpose with the primary key. Does not add the dm arrival purpose to the database.
	*
	* @param id the primary key for the new dm arrival purpose
	* @return the new dm arrival purpose
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose create(int id);

	/**
	* Removes the dm arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm arrival purpose
	* @return the dm arrival purpose that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a dm arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException;

	public vn.gt.dao.danhmuc.model.DmArrivalPurpose updateImpl(
		vn.gt.dao.danhmuc.model.DmArrivalPurpose dmArrivalPurpose, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm arrival purpose with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException} if it could not be found.
	*
	* @param id the primary key of the dm arrival purpose
	* @return the dm arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a dm arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException;

	/**
	* Returns the dm arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm arrival purpose
	* @return the dm arrival purpose, or <code>null</code> if a dm arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm arrival purposes where purposeCode = &#63;.
	*
	* @param purposeCode the purpose code
	* @return the matching dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm arrival purposes where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param start the lower bound of the range of dm arrival purposes
	* @param end the upper bound of the range of dm arrival purposes (not inclusive)
	* @return the range of matching dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm arrival purposes where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param start the lower bound of the range of dm arrival purposes
	* @param end the upper bound of the range of dm arrival purposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a matching dm arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose findByPurposeCode_First(
		java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException;

	/**
	* Returns the last dm arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a matching dm arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose findByPurposeCode_Last(
		java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException;

	/**
	* Returns the dm arrival purposes before and after the current dm arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm arrival purpose
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException if a dm arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmArrivalPurpose[] findByPurposeCode_PrevAndNext(
		int id, java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmArrivalPurposeException;

	/**
	* Returns all the dm arrival purposes.
	*
	* @return the dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm arrival purposes
	* @param end the upper bound of the range of dm arrival purposes (not inclusive)
	* @return the range of dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm arrival purposes
	* @param end the upper bound of the range of dm arrival purposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmArrivalPurpose> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm arrival purposes where purposeCode = &#63; from the database.
	*
	* @param purposeCode the purpose code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPurposeCode(java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm arrival purposes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm arrival purposes where purposeCode = &#63;.
	*
	* @param purposeCode the purpose code
	* @return the number of matching dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public int countByPurposeCode(java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm arrival purposes.
	*
	* @return the number of dm arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmArrivalPurpose remove(DmArrivalPurpose dmArrivalPurpose)
		throws SystemException;
}