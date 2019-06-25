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

import vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose;

import java.util.List;

/**
 * The persistence utility for the dm history arrival purpose service. This utility wraps {@link DmHistoryArrivalPurposePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmHistoryArrivalPurposePersistence
 * @see DmHistoryArrivalPurposePersistenceImpl
 * @generated
 */
public class DmHistoryArrivalPurposeUtil {
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
	public static void clearCache(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		getPersistence().clearCache(dmHistoryArrivalPurpose);
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
	public static List<DmHistoryArrivalPurpose> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryArrivalPurpose> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryArrivalPurpose> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmHistoryArrivalPurpose update(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose, boolean merge)
		throws SystemException {
		return getPersistence().update(dmHistoryArrivalPurpose, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmHistoryArrivalPurpose update(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(dmHistoryArrivalPurpose, merge, serviceContext);
	}

	/**
	* Caches the dm history arrival purpose in the entity cache if it is enabled.
	*
	* @param dmHistoryArrivalPurpose the dm history arrival purpose
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		getPersistence().cacheResult(dmHistoryArrivalPurpose);
	}

	/**
	* Caches the dm history arrival purposes in the entity cache if it is enabled.
	*
	* @param dmHistoryArrivalPurposes the dm history arrival purposes
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> dmHistoryArrivalPurposes) {
		getPersistence().cacheResult(dmHistoryArrivalPurposes);
	}

	/**
	* Creates a new dm history arrival purpose with the primary key. Does not add the dm history arrival purpose to the database.
	*
	* @param id the primary key for the new dm history arrival purpose
	* @return the new dm history arrival purpose
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history arrival purpose
	* @return the dm history arrival purpose that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose updateImpl(
		vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryArrivalPurpose, merge);
	}

	/**
	* Returns the dm history arrival purpose with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException} if it could not be found.
	*
	* @param id the primary key of the dm history arrival purpose
	* @return the dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history arrival purpose
	* @return the dm history arrival purpose, or <code>null</code> if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history arrival purposes where purposeCode = &#63;.
	*
	* @param purposeCode the purpose code
	* @return the matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPurposeCode(purposeCode);
	}

	/**
	* Returns a range of all the dm history arrival purposes where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @return the range of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPurposeCode(purposeCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm history arrival purposes where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findByPurposeCode(
		java.lang.String purposeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPurposeCode(purposeCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm history arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPurposeCode_First(
		java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		return getPersistence()
				   .findByPurposeCode_First(purposeCode, orderByComparator);
	}

	/**
	* Returns the last dm history arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPurposeCode_Last(
		java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		return getPersistence()
				   .findByPurposeCode_Last(purposeCode, orderByComparator);
	}

	/**
	* Returns the dm history arrival purposes before and after the current dm history arrival purpose in the ordered set where purposeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm history arrival purpose
	* @param purposeCode the purpose code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose[] findByPurposeCode_PrevAndNext(
		int id, java.lang.String purposeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		return getPersistence()
				   .findByPurposeCode_PrevAndNext(id, purposeCode,
			orderByComparator);
	}

	/**
	* Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException} if it could not be found.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @return the matching dm history arrival purpose
	* @throws vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose findByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		return getPersistence()
				   .findByPurposeCodeAndSyncVersion(purposeCode, syncVersion);
	}

	/**
	* Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @return the matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose fetchByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPurposeCodeAndSyncVersion(purposeCode, syncVersion);
	}

	/**
	* Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose fetchByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPurposeCodeAndSyncVersion(purposeCode, syncVersion,
			retrieveFromCache);
	}

	/**
	* Returns all the dm history arrival purposes.
	*
	* @return the dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm history arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @return the range of dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm history arrival purposes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history arrival purposes
	* @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmHistoryArrivalPurpose> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history arrival purposes where purposeCode = &#63; from the database.
	*
	* @param purposeCode the purpose code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPurposeCode(java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPurposeCode(purposeCode);
	}

	/**
	* Removes the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmHistoryArrivalPurposeException {
		getPersistence()
			.removeByPurposeCodeAndSyncVersion(purposeCode, syncVersion);
	}

	/**
	* Removes all the dm history arrival purposes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history arrival purposes where purposeCode = &#63;.
	*
	* @param purposeCode the purpose code
	* @return the number of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPurposeCode(java.lang.String purposeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPurposeCode(purposeCode);
	}

	/**
	* Returns the number of dm history arrival purposes where purposeCode = &#63; and syncVersion = &#63;.
	*
	* @param purposeCode the purpose code
	* @param syncVersion the sync version
	* @return the number of matching dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPurposeCodeAndSyncVersion(
		java.lang.String purposeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPurposeCodeAndSyncVersion(purposeCode, syncVersion);
	}

	/**
	* Returns the number of dm history arrival purposes.
	*
	* @return the number of dm history arrival purposes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryArrivalPurposePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryArrivalPurposePersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmHistoryArrivalPurposePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryArrivalPurposeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmHistoryArrivalPurposePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmHistoryArrivalPurposeUtil.class,
			"_persistence");
	}

	private static DmHistoryArrivalPurposePersistence _persistence;
}