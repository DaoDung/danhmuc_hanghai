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

import vn.gt.dao.danhmuc.model.DmHistoryGoods;

/**
 * The persistence interface for the dm history goods service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryGoodsPersistenceImpl
 * @see DmHistoryGoodsUtil
 * @generated
 */
public interface DmHistoryGoodsPersistence extends BasePersistence<DmHistoryGoods> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryGoodsUtil} to access the dm history goods persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm history goods in the entity cache if it is enabled.
	*
	* @param dmHistoryGoods the dm history goods
	*/
	public void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods);

	/**
	* Caches the dm history goodses in the entity cache if it is enabled.
	*
	* @param dmHistoryGoodses the dm history goodses
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> dmHistoryGoodses);

	/**
	* Creates a new dm history goods with the primary key. Does not add the dm history goods to the database.
	*
	* @param id the primary key for the new dm history goods
	* @return the new dm history goods
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods create(int id);

	/**
	* Removes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	public vn.gt.dao.danhmuc.model.DmHistoryGoods updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history goods with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException} if it could not be found.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	/**
	* Returns the dm history goods with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods, or <code>null</code> if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history goodses where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @return the matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history goodses where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @return the range of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history goodses where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods findByGoodsItemCode_First(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	/**
	* Returns the last dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods findByGoodsItemCode_Last(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	/**
	* Returns the dm history goodses before and after the current dm history goods in the ordered set where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history goods
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods[] findByGoodsItemCode_PrevAndNext(
		int id, java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	/**
	* Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException} if it could not be found.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the matching dm history goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods findByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	/**
	* Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history goods, or <code>null</code> if a matching dm history goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods fetchByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history goodses.
	*
	* @return the dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @return the range of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history goodses where goodsItemCode = &#63; from the database.
	*
	* @param goodsItemCode the goods item code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGoodsItemCode(java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history goods where goodsItemCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;

	/**
	* Removes all the dm history goodses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history goodses where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @return the number of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGoodsItemCode(java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history goodses where goodsItemCode = &#63; and syncVersion = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @param syncVersion the sync version
	* @return the number of matching dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history goodses.
	*
	* @return the number of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}