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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig;

import java.util.List;

/**
 * The persistence utility for the temp maritime payment config service. This utility wraps {@link TempMaritimePaymentConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempMaritimePaymentConfigPersistence
 * @see TempMaritimePaymentConfigPersistenceImpl
 * @generated
 */
public class TempMaritimePaymentConfigUtil {
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
		TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		getPersistence().clearCache(tempMaritimePaymentConfig);
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
	public static List<TempMaritimePaymentConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempMaritimePaymentConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempMaritimePaymentConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static TempMaritimePaymentConfig update(
		TempMaritimePaymentConfig tempMaritimePaymentConfig, boolean merge)
		throws SystemException {
		return getPersistence().update(tempMaritimePaymentConfig, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static TempMaritimePaymentConfig update(
		TempMaritimePaymentConfig tempMaritimePaymentConfig, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(tempMaritimePaymentConfig, merge, serviceContext);
	}

	/**
	* Caches the temp maritime payment config in the entity cache if it is enabled.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	*/
	public static void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig) {
		getPersistence().cacheResult(tempMaritimePaymentConfig);
	}

	/**
	* Caches the temp maritime payment configs in the entity cache if it is enabled.
	*
	* @param tempMaritimePaymentConfigs the temp maritime payment configs
	*/
	public static void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> tempMaritimePaymentConfigs) {
		getPersistence().cacheResult(tempMaritimePaymentConfigs);
	}

	/**
	* Creates a new temp maritime payment config with the primary key. Does not add the temp maritime payment config to the database.
	*
	* @param id the primary key for the new temp maritime payment config
	* @return the new temp maritime payment config
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp maritime payment config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException {
		return getPersistence().remove(id);
	}

	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig updateImpl(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempMaritimePaymentConfig, merge);
	}

	/**
	* Returns the temp maritime payment config with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException} if it could not be found.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp maritime payment config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config, or <code>null</code> if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns the temp maritime payment config where maritimeCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException} if it could not be found.
	*
	* @param maritimeCode the maritime code
	* @return the matching temp maritime payment config
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a matching temp maritime payment config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException {
		return getPersistence().findByMaritimeCode(maritimeCode);
	}

	/**
	* Returns the temp maritime payment config where maritimeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maritimeCode the maritime code
	* @return the matching temp maritime payment config, or <code>null</code> if a matching temp maritime payment config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaritimeCode(maritimeCode);
	}

	/**
	* Returns the temp maritime payment config where maritimeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp maritime payment config, or <code>null</code> if a matching temp maritime payment config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchByMaritimeCode(
		java.lang.String maritimeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaritimeCode(maritimeCode, retrieveFromCache);
	}

	/**
	* Returns all the temp maritime payment configs.
	*
	* @return the temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp maritime payment configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp maritime payment configs
	* @param end the upper bound of the range of temp maritime payment configs (not inclusive)
	* @return the range of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp maritime payment configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of temp maritime payment configs
	* @param end the upper bound of the range of temp maritime payment configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the temp maritime payment config where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException {
		getPersistence().removeByMaritimeCode(maritimeCode);
	}

	/**
	* Removes all the temp maritime payment configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp maritime payment configs where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaritimeCode(maritimeCode);
	}

	/**
	* Returns the number of temp maritime payment configs.
	*
	* @return the number of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempMaritimePaymentConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempMaritimePaymentConfigPersistence)PortletBeanLocatorUtil.locate(vn.gt.dao.noticeandmessage.service.ClpSerializer.getServletContextName(),
					TempMaritimePaymentConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(TempMaritimePaymentConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(TempMaritimePaymentConfigPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(TempMaritimePaymentConfigUtil.class,
			"_persistence");
	}

	private static TempMaritimePaymentConfigPersistence _persistence;
}