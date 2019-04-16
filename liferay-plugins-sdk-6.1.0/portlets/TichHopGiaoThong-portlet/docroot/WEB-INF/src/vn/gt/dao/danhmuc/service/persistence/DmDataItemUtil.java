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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.danhmuc.model.DmDataItem;

import java.util.List;

/**
 * The persistence utility for the dm data item service. This utility wraps {@link DmDataItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistence
 * @see DmDataItemPersistenceImpl
 * @generated
 */
public class DmDataItemUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DmDataItem dmDataItem) {
		getPersistence().clearCache(dmDataItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmDataItem remove(DmDataItem dmDataItem)
		throws SystemException {
		return getPersistence().remove(dmDataItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmDataItem update(DmDataItem dmDataItem, boolean merge)
		throws SystemException {
		return getPersistence().update(dmDataItem, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmDataItem update(DmDataItem dmDataItem, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmDataItem, merge, serviceContext);
	}

	/**
	* Caches the dm data item in the entity cache if it is enabled.
	*
	* @param dmDataItem the dm data item
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem) {
		getPersistence().cacheResult(dmDataItem);
	}

	/**
	* Caches the dm data items in the entity cache if it is enabled.
	*
	* @param dmDataItems the dm data items
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> dmDataItems) {
		getPersistence().cacheResult(dmDataItems);
	}

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param Id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence().remove(Id);
	}

	public static vn.gt.dao.danhmuc.model.DmDataItem updateImpl(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmDataItem, merge);
	}

	/**
	* Returns the dm data item with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDataItemException} if it could not be found.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmDataItemException} if it could not be found.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the matching dm data item
	* @throws vn.gt.dao.danhmuc.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence().findByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem fetchByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Returns the dm data item where DataGroupId = &#63; and Code0 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmDataItem fetchByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndCode0(DataGroupId, Code0,
			retrieveFromCache);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Node1 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupIdAndNode1(DataGroupId, Node1);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndNode1(DataGroupId, Node1, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndNode1(DataGroupId, Node1, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode1_First(
		long DataGroupId, java.lang.String Node1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndNode1_First(DataGroupId, Node1,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode1_Last(
		long DataGroupId, java.lang.String Node1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndNode1_Last(DataGroupId, Node1,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndNode1_PrevAndNext(
		long Id, long DataGroupId, java.lang.String Node1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndNode1_PrevAndNext(Id, DataGroupId,
			Node1, orderByComparator);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Node2 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode2(
		long DataGroupId, java.lang.String Node2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupIdAndNode2(DataGroupId, Node2);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode2(
		long DataGroupId, java.lang.String Node2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndNode2(DataGroupId, Node2, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode2(
		long DataGroupId, java.lang.String Node2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndNode2(DataGroupId, Node2, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode2_First(
		long DataGroupId, java.lang.String Node2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndNode2_First(DataGroupId, Node2,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndNode2_Last(
		long DataGroupId, java.lang.String Node2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndNode2_Last(DataGroupId, Node2,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndNode2_PrevAndNext(
		long Id, long DataGroupId, java.lang.String Node2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndNode2_PrevAndNext(Id, DataGroupId,
			Node2, orderByComparator);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevelandShortName_First(
		long DataGroupId, int Level, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelandShortName_First(DataGroupId,
			Level, ShortName, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevelandShortName_Last(
		long DataGroupId, int Level, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelandShortName_Last(DataGroupId,
			Level, ShortName, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndLevelandShortName_PrevAndNext(
		long Id, long DataGroupId, int Level, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelandShortName_PrevAndNext(Id,
			DataGroupId, Level, ShortName, orderByComparator);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupIdAndLevel(DataGroupId, Level);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel(DataGroupId, Level, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel(DataGroupId, Level, start, end,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevel_First(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_First(DataGroupId, Level,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndLevel_Last(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_Last(DataGroupId, Level,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(
		long Id, long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_PrevAndNext(Id, DataGroupId,
			Level, orderByComparator);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupId(DataGroupId);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupId(DataGroupId, start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupId(DataGroupId, start, end, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupId_First(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupId_First(DataGroupId, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupId_Last(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupId_Last(DataGroupId, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupId_PrevAndNext(
		long Id, long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupId_PrevAndNext(Id, DataGroupId,
			orderByComparator);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndShortName(DataGroupId, ShortName);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndShortName(DataGroupId, ShortName,
			start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndShortName(DataGroupId, ShortName,
			start, end, orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndShortName_First(
		long DataGroupId, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndShortName_First(DataGroupId, ShortName,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndShortName_Last(
		long DataGroupId, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndShortName_Last(DataGroupId, ShortName,
			orderByComparator);
	}

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
	public static vn.gt.dao.danhmuc.model.DmDataItem[] findByDataGroupIdAndShortName_PrevAndNext(
		long Id, long DataGroupId, java.lang.String ShortName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndShortName_PrevAndNext(Id, DataGroupId,
			ShortName, orderByComparator);
	}

	/**
	* Returns all the dm data items.
	*
	* @return the dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the dm data item where DataGroupId = &#63; and Code0 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndCode0(long DataGroupId,
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmDataItemException {
		getPersistence().removeByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Node1 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndNode1(long DataGroupId,
		java.lang.String Node1)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndNode1(DataGroupId, Node1);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Node2 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndNode2(long DataGroupId,
		java.lang.String Node2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndNode2(DataGroupId, Node2);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Level = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndLevel(DataGroupId, Level);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupId(long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupId(DataGroupId);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and ShortName = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndShortName(long DataGroupId,
		java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndShortName(DataGroupId, ShortName);
	}

	/**
	* Removes all the dm data items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndCode0(long DataGroupId,
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Node1 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node1 the node1
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndNode1(long DataGroupId,
		java.lang.String Node1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndNode1(DataGroupId, Node1);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Node2 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Node2 the node2
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndNode2(long DataGroupId,
		java.lang.String Node2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndNode2(DataGroupId, Node2);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Level = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param ShortName the short name
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndLevelandShortName(long DataGroupId,
		int Level, java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDataGroupIdAndLevelandShortName(DataGroupId, Level,
			ShortName);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndLevel(DataGroupId, Level);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupId(long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupId(DataGroupId);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and ShortName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param ShortName the short name
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndShortName(long DataGroupId,
		java.lang.String ShortName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDataGroupIdAndShortName(DataGroupId, ShortName);
	}

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmDataItemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmDataItemPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmDataItemPersistence.class.getName());

			ReferenceRegistry.registerReference(DmDataItemUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmDataItemPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmDataItemUtil.class, "_persistence");
	}

	private static DmDataItemPersistence _persistence;
}