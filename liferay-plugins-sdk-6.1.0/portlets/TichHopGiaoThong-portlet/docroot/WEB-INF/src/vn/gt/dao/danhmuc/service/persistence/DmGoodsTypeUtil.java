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

import vn.gt.dao.danhmuc.model.DmGoodsType;

import java.util.List;

/**
 * The persistence utility for the dm goods type service. This utility wraps {@link DmGoodsTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGoodsTypePersistence
 * @see DmGoodsTypePersistenceImpl
 * @generated
 */
public class DmGoodsTypeUtil {
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
	public static void clearCache(DmGoodsType dmGoodsType) {
		getPersistence().clearCache(dmGoodsType);
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
	public static List<DmGoodsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGoodsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGoodsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmGoodsType update(DmGoodsType dmGoodsType, boolean merge)
		throws SystemException {
		return getPersistence().update(dmGoodsType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmGoodsType update(DmGoodsType dmGoodsType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmGoodsType, merge, serviceContext);
	}

	/**
	* Caches the dm goods type in the entity cache if it is enabled.
	*
	* @param dmGoodsType the dm goods type
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmGoodsType dmGoodsType) {
		getPersistence().cacheResult(dmGoodsType);
	}

	/**
	* Caches the dm goods types in the entity cache if it is enabled.
	*
	* @param dmGoodsTypes the dm goods types
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> dmGoodsTypes) {
		getPersistence().cacheResult(dmGoodsTypes);
	}

	/**
	* Creates a new dm goods type with the primary key. Does not add the dm goods type to the database.
	*
	* @param id the primary key for the new dm goods type
	* @return the new dm goods type
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm goods type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmGoodsType updateImpl(
		vn.gt.dao.danhmuc.model.DmGoodsType dmGoodsType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGoodsType, merge);
	}

	/**
	* Returns the dm goods type with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException} if it could not be found.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm goods type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type, or <code>null</code> if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns a range of all the dm goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @return the range of matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGoodsTypeCode(goodsTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGoodsTypeCode(goodsTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm goods type
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a matching dm goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType findByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCode_First(goodsTypeCode, orderByComparator);
	}

	/**
	* Returns the last dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm goods type
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a matching dm goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType findByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCode_Last(goodsTypeCode, orderByComparator);
	}

	/**
	* Returns the dm goods types before and after the current dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm goods type
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm goods type
	* @throws vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmGoodsType[] findByGoodsTypeCode_PrevAndNext(
		int id, java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmGoodsTypeException {
		return getPersistence()
				   .findByGoodsTypeCode_PrevAndNext(id, goodsTypeCode,
			orderByComparator);
	}

	/**
	* Returns all the dm goods types.
	*
	* @return the dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @return the range of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmGoodsType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm goods types where goodsTypeCode = &#63; from the database.
	*
	* @param goodsTypeCode the goods type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Removes all the dm goods types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the number of matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGoodsTypeCode(goodsTypeCode);
	}

	/**
	* Returns the number of dm goods types.
	*
	* @return the number of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGoodsTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGoodsTypePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmGoodsTypePersistence.class.getName());

			ReferenceRegistry.registerReference(DmGoodsTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmGoodsTypePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmGoodsTypeUtil.class,
			"_persistence");
	}

	private static DmGoodsTypePersistence _persistence;
}