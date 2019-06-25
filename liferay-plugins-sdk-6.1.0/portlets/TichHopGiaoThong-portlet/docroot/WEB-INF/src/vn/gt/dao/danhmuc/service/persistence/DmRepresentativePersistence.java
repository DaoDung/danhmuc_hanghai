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

import vn.gt.dao.danhmuc.model.DmRepresentative;

/**
 * The persistence interface for the dm representative service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmRepresentativePersistenceImpl
 * @see DmRepresentativeUtil
 * @generated
 */
public interface DmRepresentativePersistence extends BasePersistence<DmRepresentative> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmRepresentativeUtil} to access the dm representative persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm representative in the entity cache if it is enabled.
	*
	* @param dmRepresentative the dm representative
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmRepresentative dmRepresentative);

	/**
	* Caches the dm representatives in the entity cache if it is enabled.
	*
	* @param dmRepresentatives the dm representatives
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> dmRepresentatives);

	/**
	* Creates a new dm representative with the primary key. Does not add the dm representative to the database.
	*
	* @param id the primary key for the new dm representative
	* @return the new dm representative
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative create(int id);

	/**
	* Removes the dm representative with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm representative
	* @return the dm representative that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	public vn.gt.dao.danhmuc.model.DmRepresentative updateImpl(
		vn.gt.dao.danhmuc.model.DmRepresentative dmRepresentative, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm representative with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmRepresentativeException} if it could not be found.
	*
	* @param id the primary key of the dm representative
	* @return the dm representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	/**
	* Returns the dm representative with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm representative
	* @return the dm representative, or <code>null</code> if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm representative where repCode = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmRepresentativeException} if it could not be found.
	*
	* @param repCode the rep code
	* @return the matching dm representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmRepresentativeException if a matching dm representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative findByRepCode(
		java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	/**
	* Returns the dm representative where repCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param repCode the rep code
	* @return the matching dm representative, or <code>null</code> if a matching dm representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative fetchByRepCode(
		java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm representative where repCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param repCode the rep code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm representative, or <code>null</code> if a matching dm representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative fetchByRepCode(
		java.lang.String repCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm representatives where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the matching dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm representatives where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm representatives
	* @param end the upper bound of the range of dm representatives (not inclusive)
	* @return the range of matching dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm representatives where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param start the lower bound of the range of dm representatives
	* @param end the upper bound of the range of dm representatives (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findByMaritimeCode(
		java.lang.String maritimeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm representative in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmRepresentativeException if a matching dm representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative findByMaritimeCode_First(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	/**
	* Returns the last dm representative in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmRepresentativeException if a matching dm representative could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative findByMaritimeCode_Last(
		java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	/**
	* Returns the dm representatives before and after the current dm representative in the ordered set where maritimeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm representative
	* @param maritimeCode the maritime code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm representative
	* @throws vn.gt.dao.danhmuc.NoSuchDmRepresentativeException if a dm representative with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmRepresentative[] findByMaritimeCode_PrevAndNext(
		int id, java.lang.String maritimeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	/**
	* Returns all the dm representatives.
	*
	* @return the dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm representatives
	* @param end the upper bound of the range of dm representatives (not inclusive)
	* @return the range of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm representatives.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm representatives
	* @param end the upper bound of the range of dm representatives (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmRepresentative> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm representative where repCode = &#63; from the database.
	*
	* @param repCode the rep code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRepCode(java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRepresentativeException;

	/**
	* Removes all the dm representatives where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm representatives from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm representatives where repCode = &#63;.
	*
	* @param repCode the rep code
	* @return the number of matching dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public int countByRepCode(java.lang.String repCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm representatives where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm representatives.
	*
	* @return the number of dm representatives
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}