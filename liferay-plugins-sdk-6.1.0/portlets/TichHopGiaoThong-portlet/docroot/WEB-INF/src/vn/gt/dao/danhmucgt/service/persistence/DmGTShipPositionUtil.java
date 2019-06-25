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

package vn.gt.dao.danhmucgt.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.danhmucgt.model.DmGTShipPosition;

import java.util.List;

/**
 * The persistence utility for the dm g t ship position service. This utility wraps {@link DmGTShipPositionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGTShipPositionPersistence
 * @see DmGTShipPositionPersistenceImpl
 * @generated
 */
public class DmGTShipPositionUtil {
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
	public static void clearCache(DmGTShipPosition dmGTShipPosition) {
		getPersistence().clearCache(dmGTShipPosition);
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
	public static List<DmGTShipPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGTShipPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGTShipPosition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmGTShipPosition update(DmGTShipPosition dmGTShipPosition,
		boolean merge) throws SystemException {
		return getPersistence().update(dmGTShipPosition, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmGTShipPosition update(DmGTShipPosition dmGTShipPosition,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmGTShipPosition, merge, serviceContext);
	}

	/**
	* Caches the dm g t ship position in the entity cache if it is enabled.
	*
	* @param dmGTShipPosition the dm g t ship position
	*/
	public static void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition) {
		getPersistence().cacheResult(dmGTShipPosition);
	}

	/**
	* Caches the dm g t ship positions in the entity cache if it is enabled.
	*
	* @param dmGTShipPositions the dm g t ship positions
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> dmGTShipPositions) {
		getPersistence().cacheResult(dmGTShipPositions);
	}

	/**
	* Creates a new dm g t ship position with the primary key. Does not add the dm g t ship position to the database.
	*
	* @param id the primary key for the new dm g t ship position
	* @return the new dm g t ship position
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm g t ship position with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition updateImpl(
		vn.gt.dao.danhmucgt.model.DmGTShipPosition dmGTShipPosition,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGTShipPosition, merge);
	}

	/**
	* Returns the dm g t ship position with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException} if it could not be found.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm g t ship position with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm g t ship position
	* @return the dm g t ship position, or <code>null</code> if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm g t ship positions where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @return the matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPositionCode(positionCode);
	}

	/**
	* Returns a range of all the dm g t ship positions where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPositionCode(positionCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm g t ship positions where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findByPositionCode(
		java.lang.String positionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPositionCode(positionCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition findByPositionCode_First(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException {
		return getPersistence()
				   .findByPositionCode_First(positionCode, orderByComparator);
	}

	/**
	* Returns the last dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a matching dm g t ship position could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition findByPositionCode_Last(
		java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException {
		return getPersistence()
				   .findByPositionCode_Last(positionCode, orderByComparator);
	}

	/**
	* Returns the dm g t ship positions before and after the current dm g t ship position in the ordered set where positionCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm g t ship position
	* @param positionCode the position code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm g t ship position
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException if a dm g t ship position with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmucgt.model.DmGTShipPosition[] findByPositionCode_PrevAndNext(
		long id, java.lang.String positionCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGTShipPositionException {
		return getPersistence()
				   .findByPositionCode_PrevAndNext(id, positionCode,
			orderByComparator);
	}

	/**
	* Returns all the dm g t ship positions.
	*
	* @return the dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @return the range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm g t ship positions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm g t ship positions
	* @param end the upper bound of the range of dm g t ship positions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmucgt.model.DmGTShipPosition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm g t ship positions where positionCode = &#63; from the database.
	*
	* @param positionCode the position code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPositionCode(java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPositionCode(positionCode);
	}

	/**
	* Removes all the dm g t ship positions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm g t ship positions where positionCode = &#63;.
	*
	* @param positionCode the position code
	* @return the number of matching dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPositionCode(java.lang.String positionCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPositionCode(positionCode);
	}

	/**
	* Returns the number of dm g t ship positions.
	*
	* @return the number of dm g t ship positions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGTShipPositionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGTShipPositionPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmucgt.service.ClpSerializer.getServletContextName(),
					DmGTShipPositionPersistence.class.getName());

			ReferenceRegistry.registerReference(DmGTShipPositionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmGTShipPositionPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmGTShipPositionUtil.class,
			"_persistence");
	}

	private static DmGTShipPositionPersistence _persistence;
}