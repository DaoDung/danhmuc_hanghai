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

package vn.gt.dao.nhapcanh.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.nhapcanh.model.ResponseBo;

import java.util.List;

/**
 * The persistence utility for the response bo service. This utility wraps {@link ResponseBoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResponseBoPersistence
 * @see ResponseBoPersistenceImpl
 * @generated
 */
public class ResponseBoUtil {
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
	public static void clearCache(ResponseBo responseBo) {
		getPersistence().clearCache(responseBo);
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
	public static List<ResponseBo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ResponseBo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ResponseBo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static ResponseBo remove(ResponseBo responseBo)
		throws SystemException {
		return getPersistence().remove(responseBo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ResponseBo update(ResponseBo responseBo, boolean merge)
		throws SystemException {
		return getPersistence().update(responseBo, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ResponseBo update(ResponseBo responseBo, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(responseBo, merge, serviceContext);
	}

	/**
	* Caches the response bo in the entity cache if it is enabled.
	*
	* @param responseBo the response bo
	*/
	public static void cacheResult(
		vn.gt.dao.nhapcanh.model.ResponseBo responseBo) {
		getPersistence().cacheResult(responseBo);
	}

	/**
	* Caches the response bos in the entity cache if it is enabled.
	*
	* @param responseBos the response bos
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> responseBos) {
		getPersistence().cacheResult(responseBos);
	}

	/**
	* Creates a new response bo with the primary key. Does not add the response bo to the database.
	*
	* @param id the primary key for the new response bo
	* @return the new response bo
	*/
	public static vn.gt.dao.nhapcanh.model.ResponseBo create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the response bo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the response bo
	* @return the response bo that was removed
	* @throws vn.gt.dao.nhapcanh.NoSuchResponseBoException if a response bo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.nhapcanh.model.ResponseBo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchResponseBoException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.nhapcanh.model.ResponseBo updateImpl(
		vn.gt.dao.nhapcanh.model.ResponseBo responseBo, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(responseBo, merge);
	}

	/**
	* Returns the response bo with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchResponseBoException} if it could not be found.
	*
	* @param id the primary key of the response bo
	* @return the response bo
	* @throws vn.gt.dao.nhapcanh.NoSuchResponseBoException if a response bo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.nhapcanh.model.ResponseBo findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchResponseBoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the response bo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the response bo
	* @return the response bo, or <code>null</code> if a response bo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.nhapcanh.model.ResponseBo fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the response bos.
	*
	* @return the response bos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the response bos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of response bos
	* @param end the upper bound of the range of response bos (not inclusive)
	* @return the range of response bos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the response bos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of response bos
	* @param end the upper bound of the range of response bos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of response bos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the response bos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of response bos.
	*
	* @return the number of response bos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ResponseBoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ResponseBoPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.nhapcanh.service.ClpSerializer.getServletContextName(),
					ResponseBoPersistence.class.getName());

			ReferenceRegistry.registerReference(ResponseBoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ResponseBoPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ResponseBoUtil.class, "_persistence");
	}

	private static ResponseBoPersistence _persistence;
}