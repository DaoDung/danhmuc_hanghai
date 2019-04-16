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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig;

/**
 * The persistence interface for the temp maritime payment config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TempMaritimePaymentConfigPersistenceImpl
 * @see TempMaritimePaymentConfigUtil
 * @generated
 */
public interface TempMaritimePaymentConfigPersistence extends BasePersistence<TempMaritimePaymentConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TempMaritimePaymentConfigUtil} to access the temp maritime payment config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the temp maritime payment config in the entity cache if it is enabled.
	*
	* @param tempMaritimePaymentConfig the temp maritime payment config
	*/
	public void cacheResult(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig);

	/**
	* Caches the temp maritime payment configs in the entity cache if it is enabled.
	*
	* @param tempMaritimePaymentConfigs the temp maritime payment configs
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> tempMaritimePaymentConfigs);

	/**
	* Creates a new temp maritime payment config with the primary key. Does not add the temp maritime payment config to the database.
	*
	* @param id the primary key for the new temp maritime payment config
	* @return the new temp maritime payment config
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig create(
		long id);

	/**
	* Removes the temp maritime payment config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config that was removed
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException;

	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig updateImpl(
		vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig tempMaritimePaymentConfig,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp maritime payment config with the primary key or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException} if it could not be found.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException;

	/**
	* Returns the temp maritime payment config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp maritime payment config
	* @return the temp maritime payment config, or <code>null</code> if a temp maritime payment config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp maritime payment config where maritimeCode = &#63; or throws a {@link vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException} if it could not be found.
	*
	* @param maritimeCode the maritime code
	* @return the matching temp maritime payment config
	* @throws vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException if a matching temp maritime payment config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig findByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException;

	/**
	* Returns the temp maritime payment config where maritimeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maritimeCode the maritime code
	* @return the matching temp maritime payment config, or <code>null</code> if a matching temp maritime payment config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchByMaritimeCode(
		java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the temp maritime payment config where maritimeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maritimeCode the maritime code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching temp maritime payment config, or <code>null</code> if a matching temp maritime payment config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig fetchByMaritimeCode(
		java.lang.String maritimeCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the temp maritime payment configs.
	*
	* @return the temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the temp maritime payment config where maritimeCode = &#63; from the database.
	*
	* @param maritimeCode the maritime code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.noticeandmessage.NoSuchTempMaritimePaymentConfigException;

	/**
	* Removes all the temp maritime payment configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp maritime payment configs where maritimeCode = &#63;.
	*
	* @param maritimeCode the maritime code
	* @return the number of matching temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaritimeCode(java.lang.String maritimeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of temp maritime payment configs.
	*
	* @return the number of temp maritime payment configs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}