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

import vn.gt.dao.danhmuc.model.DmRankRating;

import java.util.List;

/**
 * The persistence utility for the dm rank rating service. This utility wraps {@link DmRankRatingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmRankRatingPersistence
 * @see DmRankRatingPersistenceImpl
 * @generated
 */
public class DmRankRatingUtil {
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
	public static void clearCache(DmRankRating dmRankRating) {
		getPersistence().clearCache(dmRankRating);
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
	public static List<DmRankRating> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmRankRating> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmRankRating> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DmRankRating update(DmRankRating dmRankRating, boolean merge)
		throws SystemException {
		return getPersistence().update(dmRankRating, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DmRankRating update(DmRankRating dmRankRating, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmRankRating, merge, serviceContext);
	}

	/**
	* Caches the dm rank rating in the entity cache if it is enabled.
	*
	* @param dmRankRating the dm rank rating
	*/
	public static void cacheResult(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating) {
		getPersistence().cacheResult(dmRankRating);
	}

	/**
	* Caches the dm rank ratings in the entity cache if it is enabled.
	*
	* @param dmRankRatings the dm rank ratings
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> dmRankRatings) {
		getPersistence().cacheResult(dmRankRatings);
	}

	/**
	* Creates a new dm rank rating with the primary key. Does not add the dm rank rating to the database.
	*
	* @param id the primary key for the new dm rank rating
	* @return the new dm rank rating
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating that was removed
	* @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRankRatingException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.danhmuc.model.DmRankRating updateImpl(
		vn.gt.dao.danhmuc.model.DmRankRating dmRankRating, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmRankRating, merge);
	}

	/**
	* Returns the dm rank rating with the primary key or throws a {@link vn.gt.dao.danhmuc.NoSuchDmRankRatingException} if it could not be found.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating
	* @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRankRatingException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm rank rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating, or <code>null</code> if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm rank ratings where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @return the matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> findByRankCode(
		java.lang.String rankCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRankCode(rankCode);
	}

	/**
	* Returns a range of all the dm rank ratings where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rankCode the rank code
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @return the range of matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> findByRankCode(
		java.lang.String rankCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRankCode(rankCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm rank ratings where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rankCode the rank code
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> findByRankCode(
		java.lang.String rankCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRankCode(rankCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm rank rating in the ordered set where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm rank rating
	* @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a matching dm rank rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating findByRankCode_First(
		java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRankRatingException {
		return getPersistence().findByRankCode_First(rankCode, orderByComparator);
	}

	/**
	* Returns the last dm rank rating in the ordered set where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm rank rating
	* @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a matching dm rank rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating findByRankCode_Last(
		java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRankRatingException {
		return getPersistence().findByRankCode_Last(rankCode, orderByComparator);
	}

	/**
	* Returns the dm rank ratings before and after the current dm rank rating in the ordered set where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current dm rank rating
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm rank rating
	* @throws vn.gt.dao.danhmuc.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.danhmuc.model.DmRankRating[] findByRankCode_PrevAndNext(
		int id, java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmuc.NoSuchDmRankRatingException {
		return getPersistence()
				   .findByRankCode_PrevAndNext(id, rankCode, orderByComparator);
	}

	/**
	* Returns all the dm rank ratings.
	*
	* @return the dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm rank ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @return the range of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm rank ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.danhmuc.model.DmRankRating> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm rank ratings where rankCode = &#63; from the database.
	*
	* @param rankCode the rank code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRankCode(java.lang.String rankCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRankCode(rankCode);
	}

	/**
	* Removes all the dm rank ratings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm rank ratings where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @return the number of matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRankCode(java.lang.String rankCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRankCode(rankCode);
	}

	/**
	* Returns the number of dm rank ratings.
	*
	* @return the number of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmRankRatingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmRankRatingPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.danhmuc.service.ClpSerializer.getServletContextName(),
					DmRankRatingPersistence.class.getName());

			ReferenceRegistry.registerReference(DmRankRatingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DmRankRatingPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DmRankRatingUtil.class,
			"_persistence");
	}

	private static DmRankRatingPersistence _persistence;
}