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

package vn.gt.dao.nhapcanh.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.nhapcanh.model.CrewList;

/**
 * The persistence interface for the crew list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CrewListPersistenceImpl
 * @see CrewListUtil
 * @generated
 */
public interface CrewListPersistence extends BasePersistence<CrewList> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CrewListUtil} to access the crew list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the crew list in the entity cache if it is enabled.
	*
	* @param crewList the crew list
	*/
	public void cacheResult(vn.gt.dao.nhapcanh.model.CrewList crewList);

	/**
	* Caches the crew lists in the entity cache if it is enabled.
	*
	* @param crewLists the crew lists
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.nhapcanh.model.CrewList> crewLists);

	/**
	* Creates a new crew list with the primary key. Does not add the crew list to the database.
	*
	* @param id the primary key for the new crew list
	* @return the new crew list
	*/
	public vn.gt.dao.nhapcanh.model.CrewList create(long id);

	/**
	* Removes the crew list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the crew list
	* @return the crew list that was removed
	* @throws vn.gt.dao.nhapcanh.NoSuchCrewListException if a crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchCrewListException;

	public vn.gt.dao.nhapcanh.model.CrewList updateImpl(
		vn.gt.dao.nhapcanh.model.CrewList crewList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the crew list with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchCrewListException} if it could not be found.
	*
	* @param id the primary key of the crew list
	* @return the crew list
	* @throws vn.gt.dao.nhapcanh.NoSuchCrewListException if a crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchCrewListException;

	/**
	* Returns the crew list with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the crew list
	* @return the crew list, or <code>null</code> if a crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the crew lists.
	*
	* @return the crew lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.CrewList> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the crew lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of crew lists
	* @param end the upper bound of the range of crew lists (not inclusive)
	* @return the range of crew lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.CrewList> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the crew lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of crew lists
	* @param end the upper bound of the range of crew lists (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of crew lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.CrewList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the crew lists from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of crew lists.
	*
	* @return the number of crew lists
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}