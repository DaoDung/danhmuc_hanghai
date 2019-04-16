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

import vn.gt.dao.danhmuc.model.ThamSoHeThong;

import java.util.List;

/**
 * The persistence utility for the tham so he thong service. This utility wraps {@link ThamSoHeThongPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ThamSoHeThongPersistence
 * @see ThamSoHeThongPersistenceImpl
 * @generated
 */
public class ThamSoHeThongUtil {
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
	public static void clearCache(ThamSoHeThong thamSoHeThong) {
		getPersistence().clearCache(thamSoHeThong);
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
	public static List<ThamSoHeThong> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ThamSoHeThong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ThamSoHeThong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static ThamSoHeThong remove(ThamSoHeThong thamSoHeThong)
		throws SystemException {
		return getPersistence().remove(thamSoHeThong);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ThamSoHeThong update(ThamSoHeThong thamSoHeThong,
		boolean merge) throws SystemException {
		return getPersistence().update(thamSoHeThong, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ThamSoHeThong update(ThamSoHeThong thamSoHeThong,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(thamSoHeThong, merge, serviceContext);
	}

	/**
	* Caches the tham so he thong in the entity cache if it is enabled.
	*
	* @param thamSoHeThong the tham so he thong
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.ThamSoHeThong thamSoHeThong) {
		getPersistence().cacheResult(thamSoHeThong);
	}

	/**
	* Caches the tham so he thongs in the entity cache if it is enabled.
	*
	* @param thamSoHeThongs the tham so he thongs
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.ThamSoHeThong> thamSoHeThongs) {
		getPersistence().cacheResult(thamSoHeThongs);
	}

	/**
	* Creates a new tham so he thong with the primary key. Does not add the tham so he thong to the database.
	*
	* @param id the primary key for the new tham so he thong
	* @return the new tham so he thong
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchThamSoHeThongException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.ThamSoHeThong updateImpl(
		vn.gt.dao.danhmuc.model.ThamSoHeThong thamSoHeThong, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(thamSoHeThong, merge);
	}

	/**
	* Returns the tham so he thong with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchThamSoHeThongException} if it could not be found.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong
	* @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchThamSoHeThongException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tham so he thong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong, or <code>null</code> if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the tham so he thong where keyData = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchThamSoHeThongException} if it could not be found.
	*
	* @param keyData the key data
	* @return the matching tham so he thong
	* @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong findByKeyData(
		java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchThamSoHeThongException {
		return getPersistence().findByKeyData(keyData);
	}

	/**
	* Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keyData the key data
	* @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong fetchByKeyData(
		java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByKeyData(keyData);
	}

	/**
	* Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keyData the key data
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong fetchByKeyData(
		java.lang.String keyData, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByKeyData(keyData, retrieveFromCache);
	}

	/**
	* Returns the tham so he thong where keyData = &#63; and description = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchThamSoHeThongException} if it could not be found.
	*
	* @param keyData the key data
	* @param description the description
	* @return the matching tham so he thong
	* @throws vn.gt.dao.danhmuc.NoSuchThamSoHeThongException if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong findByKeyDataAndDescription(
		java.lang.String keyData, java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchThamSoHeThongException {
		return getPersistence().findByKeyDataAndDescription(keyData, description);
	}

	/**
	* Returns the tham so he thong where keyData = &#63; and description = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keyData the key data
	* @param description the description
	* @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong fetchByKeyDataAndDescription(
		java.lang.String keyData, java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByKeyDataAndDescription(keyData, description);
	}

	/**
	* Returns the tham so he thong where keyData = &#63; and description = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keyData the key data
	* @param description the description
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.ThamSoHeThong fetchByKeyDataAndDescription(
		java.lang.String keyData, java.lang.String description,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByKeyDataAndDescription(keyData, description,
			retrieveFromCache);
	}

	/**
	* Returns all the tham so he thongs.
	*
	* @return the tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.ThamSoHeThong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tham so he thongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tham so he thongs
	* @param end the upper bound of the range of tham so he thongs (not inclusive)
	* @return the range of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.ThamSoHeThong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tham so he thongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tham so he thongs
	* @param end the upper bound of the range of tham so he thongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.ThamSoHeThong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the tham so he thong where keyData = &#63; from the database.
	*
	* @param keyData the key data
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByKeyData(java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchThamSoHeThongException {
		getPersistence().removeByKeyData(keyData);
	}

	/**
	* Removes the tham so he thong where keyData = &#63; and description = &#63; from the database.
	*
	* @param keyData the key data
	* @param description the description
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByKeyDataAndDescription(java.lang.String keyData,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchThamSoHeThongException {
		getPersistence().removeByKeyDataAndDescription(keyData, description);
	}

	/**
	* Removes all the tham so he thongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tham so he thongs where keyData = &#63;.
	*
	* @param keyData the key data
	* @return the number of matching tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByKeyData(java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByKeyData(keyData);
	}

	/**
	* Returns the number of tham so he thongs where keyData = &#63; and description = &#63;.
	*
	* @param keyData the key data
	* @param description the description
	* @return the number of matching tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByKeyDataAndDescription(java.lang.String keyData,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByKeyDataAndDescription(keyData, description);
	}

	/**
	* Returns the number of tham so he thongs.
	*
	* @return the number of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ThamSoHeThongPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ThamSoHeThongPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					ThamSoHeThongPersistence.class.getName());

			ReferenceRegistry.registerReference(ThamSoHeThongUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ThamSoHeThongPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ThamSoHeThongUtil.class,
			"_persistence");
	}

	private static ThamSoHeThongPersistence _persistence;
}