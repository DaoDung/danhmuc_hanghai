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

import vn.gt.dao.danhmuc.model.DmGoods;

/**
 * The persistence interface for the dm goods service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGoodsPersistenceImpl
 * @see DmGoodsUtil
 * @generated
 */
public interface DmGoodsPersistence extends BasePersistence<DmGoods> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGoodsUtil} to access the dm goods persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm goods in the entity cache if it is enabled.
	*
	* @param dmGoods the dm goods
	*/
	public void cacheResult(vn.gt.dao.danhmuc.model.DmGoods dmGoods);

	/**
	* Caches the dm goodses in the entity cache if it is enabled.
	*
	* @param dmGoodses the dm goodses
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmGoods> dmGoodses);

	/**
	* Creates a new dm goods with the primary key. Does not add the dm goods to the database.
	*
	* @param id the primary key for the new dm goods
	* @return the new dm goods
	*/
	public vn.gt.dao.danhmuc.model.DmGoods create(int id);

	/**
	* Removes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm goods
	* @return the dm goods that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsException;

	public vn.gt.dao.danhmuc.model.DmGoods updateImpl(
		vn.gt.dao.danhmuc.model.DmGoods dmGoods, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm goods with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmGoodsException} if it could not be found.
	*
	* @param id the primary key of the dm goods
	* @return the dm goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsException;

	/**
	* Returns the dm goods with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm goods
	* @return the dm goods, or <code>null</code> if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm goodses where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @return the matching dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm goodses where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param start the lower bound of the range of dm goodses
	* @param end the upper bound of the range of dm goodses (not inclusive)
	* @return the range of matching dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm goodses where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param start the lower bound of the range of dm goodses
	* @param end the upper bound of the range of dm goodses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> findByGoodsItemCode(
		java.lang.String goodsItemCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm goods in the ordered set where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a matching dm goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods findByGoodsItemCode_First(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsException;

	/**
	* Returns the last dm goods in the ordered set where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a matching dm goods could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods findByGoodsItemCode_Last(
		java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsException;

	/**
	* Returns the dm goodses before and after the current dm goods in the ordered set where goodsItemCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm goods
	* @param goodsItemCode the goods item code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm goods
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods[] findByGoodsItemCode_PrevAndNext(
		int id, java.lang.String goodsItemCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsException;

	/**
	* Returns all the dm goodses.
	*
	* @return the dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm goodses
	* @param end the upper bound of the range of dm goodses (not inclusive)
	* @return the range of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm goodses
	* @param end the upper bound of the range of dm goodses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm goodses where goodsItemCode = &#63; from the database.
	*
	* @param goodsItemCode the goods item code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGoodsItemCode(java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm goodses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm goodses where goodsItemCode = &#63;.
	*
	* @param goodsItemCode the goods item code
	* @return the number of matching dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGoodsItemCode(java.lang.String goodsItemCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm goodses.
	*
	* @return the number of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}