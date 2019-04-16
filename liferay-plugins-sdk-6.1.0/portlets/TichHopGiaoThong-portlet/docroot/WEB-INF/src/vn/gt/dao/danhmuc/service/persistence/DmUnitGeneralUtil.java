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

import vn.gt.dao.danhmuc.model.DmUnitGeneral;

import java.util.List;

/**
 * The persistence utility for the dm unit general service. This utility wraps {@link DmUnitGeneralPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmUnitGeneralPersistence
 * @see DmUnitGeneralPersistenceImpl
 * @generated
 */
public class DmUnitGeneralUtil {
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
	public static void clearCache(DmUnitGeneral dmUnitGeneral) {
		getPersistence().clearCache(dmUnitGeneral);
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
	public static List<DmUnitGeneral> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmUnitGeneral> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmUnitGeneral> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DmUnitGeneral remove(DmUnitGeneral dmUnitGeneral)
		throws SystemException {
		return getPersistence().remove(dmUnitGeneral);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmUnitGeneral update(DmUnitGeneral dmUnitGeneral,
		boolean merge) throws SystemException {
		return getPersistence().update(dmUnitGeneral, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmUnitGeneral update(DmUnitGeneral dmUnitGeneral,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmUnitGeneral, merge, serviceContext);
	}

	/**
	* Caches the dm unit general in the entity cache if it is enabled.
	*
	* @param dmUnitGeneral the dm unit general
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral) {
		getPersistence().cacheResult(dmUnitGeneral);
	}

	/**
	* Caches the dm unit generals in the entity cache if it is enabled.
	*
	* @param dmUnitGenerals the dm unit generals
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> dmUnitGenerals) {
		getPersistence().cacheResult(dmUnitGenerals);
	}

	/**
	* Creates a new dm unit general with the primary key. Does not add the dm unit general to the database.
	*
	* @param id the primary key for the new dm unit general
	* @return the new dm unit general
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm unit general
	* @return the dm unit general that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmUnitGeneral updateImpl(
		vn.gt.dao.danhmuc.model.DmUnitGeneral dmUnitGeneral, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmUnitGeneral, merge);
	}

	/**
	* Returns the dm unit general with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException} if it could not be found.
	*
	* @param id the primary key of the dm unit general
	* @return the dm unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm unit general with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm unit general
	* @return the dm unit general, or <code>null</code> if a dm unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm unit generals where unitCode = &#63;.
	*
	* @param unitCode the unit code
	* @return the matching dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> findByUnitCode(
		java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUnitCode(unitCode);
	}

	/**
	* Returns a range of all the dm unit generals where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param start the lower bound of the range of dm unit generals
	* @param end the upper bound of the range of dm unit generals (not inclusive)
	* @return the range of matching dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> findByUnitCode(
		java.lang.String unitCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUnitCode(unitCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm unit generals where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param start the lower bound of the range of dm unit generals
	* @param end the upper bound of the range of dm unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> findByUnitCode(
		java.lang.String unitCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUnitCode(unitCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException if a matching dm unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral findByUnitCode_First(
		java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		return getPersistence().findByUnitCode_First(unitCode, orderByComparator);
	}

	/**
	* Returns the last dm unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException if a matching dm unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral findByUnitCode_Last(
		java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		return getPersistence().findByUnitCode_Last(unitCode, orderByComparator);
	}

	/**
	* Returns the dm unit generals before and after the current dm unit general in the ordered set where unitCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm unit general
	* @param unitCode the unit code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral[] findByUnitCode_PrevAndNext(
		int id, java.lang.String unitCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		return getPersistence()
				   .findByUnitCode_PrevAndNext(id, unitCode, orderByComparator);
	}

	/**
	* Returns the dm unit general where unitCode = &#63; and syncVersion = &#63; or throws a {@link vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException} if it could not be found.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the matching dm unit general
	* @throws vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException if a matching dm unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral findByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		return getPersistence()
				   .findByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Returns the dm unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the matching dm unit general, or <code>null</code> if a matching dm unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral fetchByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Returns the dm unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm unit general, or <code>null</code> if a matching dm unit general could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmUnitGeneral fetchByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUnitCodeAndSyncVersion(unitCode, syncVersion,
			retrieveFromCache);
	}

	/**
	* Returns all the dm unit generals.
	*
	* @return the dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm unit generals
	* @param end the upper bound of the range of dm unit generals (not inclusive)
	* @return the range of dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm unit generals
	* @param end the upper bound of the range of dm unit generals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmUnitGeneral> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm unit generals where unitCode = &#63; from the database.
	*
	* @param unitCode the unit code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUnitCode(java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUnitCode(unitCode);
	}

	/**
	* Removes the dm unit general where unitCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUnitCodeAndSyncVersion(
		java.lang.String unitCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmUnitGeneralException {
		getPersistence().removeByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Removes all the dm unit generals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm unit generals where unitCode = &#63;.
	*
	* @param unitCode the unit code
	* @return the number of matching dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUnitCode(java.lang.String unitCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUnitCode(unitCode);
	}

	/**
	* Returns the number of dm unit generals where unitCode = &#63; and syncVersion = &#63;.
	*
	* @param unitCode the unit code
	* @param syncVersion the sync version
	* @return the number of matching dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUnitCodeAndSyncVersion(java.lang.String unitCode,
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByUnitCodeAndSyncVersion(unitCode, syncVersion);
	}

	/**
	* Returns the number of dm unit generals.
	*
	* @return the number of dm unit generals
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmUnitGeneralPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmUnitGeneralPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmUnitGeneralPersistence.class.getName());

			ReferenceRegistry.registerReference(DmUnitGeneralUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmUnitGeneralPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmUnitGeneralUtil.class,
			"_persistence");
	}

	private static DmUnitGeneralPersistence _persistence;
}