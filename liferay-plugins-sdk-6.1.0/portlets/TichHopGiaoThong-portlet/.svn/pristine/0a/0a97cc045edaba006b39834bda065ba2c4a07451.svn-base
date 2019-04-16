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

import vn.gt.dao.danhmuc.model.DmMaritime;

/**
 * The persistence interface for the dm maritime service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmMaritimePersistenceImpl
 * @see DmMaritimeUtil
 * @generated
 */
public interface DmMaritimePersistence extends BasePersistence<DmMaritime> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmMaritimeUtil} to access the dm maritime persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm maritime in the entity cache if it is enabled.
	*
	* @param dmMaritime the dm maritime
	*/
	public void cacheResult(vn.gt.dao.danhmuc.model.DmMaritime dmMaritime);

	/**
	* Caches the dm maritimes in the entity cache if it is enabled.
	*
	* @param dmMaritimes the dm maritimes
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> dmMaritimes);

	/**
	* Creates a new dm maritime with the primary key. Does not add the dm maritime to the database.
	*
	* @param id the primary key for the new dm maritime
	* @return the new dm maritime
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime create(int id);

	/**
	* Removes the dm maritime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm maritime
	* @return the dm maritime that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	public vn.gt.dao.danhmuc.model.DmMaritime updateImpl(
		vn.gt.dao.danhmuc.model.DmMaritime dmMaritime, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritime with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmMaritimeException} if it could not be found.
	*
	* @param id the primary key of the dm maritime
	* @return the dm maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Returns the dm maritime with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm maritime
	* @return the dm maritime, or <code>null</code> if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritime where maritimeCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmMaritimeException} if it could not be found.
	*
	* @param maritimeCode the maritime code
	* @return the matching dm maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Returns the dm maritime where maritimeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maritimeCode the maritime code
	* @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime fetchByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritime where maritimeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime fetchByMaritimeCode(
		java.lang.String maritimeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritime where maritimeReference = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmMaritimeException} if it could not be found.
	*
	* @param maritimeReference the maritime reference
	* @return the matching dm maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime findByMaritimeReference(
		java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Returns the dm maritime where maritimeReference = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maritimeReference the maritime reference
	* @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime fetchByMaritimeReference(
		java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm maritime where maritimeReference = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maritimeReference the maritime reference
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm maritime, or <code>null</code> if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime fetchByMaritimeReference(
		java.lang.String maritimeReference, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @return the matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findByDelete(
		int isDelete, int markedAsDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @return the range of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findByDelete(
		int isDelete, int markedAsDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findByDelete(
		int isDelete, int markedAsDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm maritime in the ordered set where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime findByDelete_First(int isDelete,
		int markedAsDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Returns the last dm maritime in the ordered set where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a matching dm maritime could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime findByDelete_Last(int isDelete,
		int markedAsDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Returns the dm maritimes before and after the current dm maritime in the ordered set where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm maritime
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm maritime
	* @throws vn.gt.dao.danhmuc.NoSuchDmMaritimeException if a dm maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmMaritime[] findByDelete_PrevAndNext(
		int id, int isDelete, int markedAsDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Returns all the dm maritimes.
	*
	* @return the dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @return the range of dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm maritimes
	* @param end the upper bound of the range of dm maritimes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm maritime where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Removes the dm maritime where maritimeReference = &#63; from the database.
	*
	* @param maritimeReference the maritime reference
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeReference(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmMaritimeException;

	/**
	* Removes all the dm maritimes where isDelete = &#63; and markedAsDelete = &#63; from the database.
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDelete(int isDelete, int markedAsDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm maritimes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm maritimes where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm maritimes where maritimeReference = &#63;.
	*
	* @param maritimeReference the maritime reference
	* @return the number of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeReference(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm maritimes where isDelete = &#63; and markedAsDelete = &#63;.
	*
	* @param isDelete the is delete
	* @param markedAsDelete the marked as delete
	* @return the number of matching dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countByDelete(int isDelete, int markedAsDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm maritimes.
	*
	* @return the number of dm maritimes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmMaritime remove(DmMaritime dmMaritime) throws SystemException;
}