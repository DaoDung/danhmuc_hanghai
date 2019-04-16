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

import vn.gt.dao.danhmuc.model.DmDataItem;

/**
 * The persistence interface for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistenceImpl
 * @see DmDataItemUtil
 * @generated
 */
public interface DmDataItemPersistence extends BasePersistence<DmDataItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm data item in the entity cache if it is enabled.
	*
	* @param dmDataItem the dm data item
	*/
	public void cacheResult(vn.gt.dao.danhmuc.model.DmDataItem dmDataItem);

	/**
	* Caches the dm data items in the entity cache if it is enabled.
	*
	* @param dmDataItems the dm data items
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> dmDataItems);

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param Id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem create(long Id);

	/**
	* Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	public vn.gt.dao.danhmuc.model.DmDataItem updateImpl(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDataItemException} if it could not be found.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDataItemException} if it could not be found.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem fetchByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem fetchByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Node1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode1_First(
		long DataGroupId, java.lang.String Node1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Node1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode1_Last(
		long DataGroupId, java.lang.String Node1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Node1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndNode1_PrevAndNext(
		long Id, long DataGroupId, java.lang.String Node1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode2(
		long DataGroupId, java.lang.String Node2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode2(
		long DataGroupId, java.lang.String Node2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode2(
		long DataGroupId, java.lang.String Node2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Node2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode2_First(
		long DataGroupId, java.lang.String Node2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Node2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode2_Last(
		long DataGroupId, java.lang.String Node2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Node2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndNode2_PrevAndNext(
		long Id, long DataGroupId, java.lang.String Node2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevelandShortName_First(
		long DataGroupId, int Level, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevelandShortName_Last(
		long DataGroupId, int Level, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndLevelandShortName_PrevAndNext(
		long Id, long DataGroupId, int Level, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevel_First(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevel_Last(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(
		long Id, long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns all the dm data items where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupId_First(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupId_Last(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupId_PrevAndNext(
		long Id, long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndShortName_First(
		long DataGroupId, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndShortName_Last(
		long DataGroupId, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and ShortName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndShortName_PrevAndNext(
		long Id, long DataGroupId, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Returns all the dm data items.
	*
	* @return the dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm data item where DataGroupId = &#63; and Code0 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndCode0(long DataGroupId,
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException;

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Node1 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndNode1(long DataGroupId,
		java.lang.String Node1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Node2 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndNode2(long DataGroupId,
		java.lang.String Node2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndLevelandShortName(long DataGroupId,
		int Level, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Level = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items where DataGroupId = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupId(long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items where DataGroupId = &#63; and ShortName = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndShortName(long DataGroupId,
		java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndCode0(long DataGroupId,
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Node1 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndNode1(long DataGroupId,
		java.lang.String Node1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Node2 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndNode2(long DataGroupId,
		java.lang.String Node2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndLevelandShortName(long DataGroupId,
		int Level, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupId(long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndShortName(long DataGroupId,
		java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public DmDataItem remove(DmDataItem dmDataItem) throws SystemException;
}