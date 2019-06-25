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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.nhapcanh.model.ResponseBo;

/**
 * The persistence interface for the response bo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ResponseBoPersistenceImpl
 * @see ResponseBoUtil
 * @generated
 */
public interface ResponseBoPersistence extends BasePersistence<ResponseBo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResponseBoUtil} to access the response bo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the response bo in the entity cache if it is enabled.
	*
	* @param responseBo the response bo
	*/
	public void cacheResult(vn.gt.dao.nhapcanh.model.ResponseBo responseBo);

	/**
	* Caches the response bos in the entity cache if it is enabled.
	*
	* @param responseBos the response bos
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> responseBos);

	/**
	* Creates a new response bo with the primary key. Does not add the response bo to the database.
	*
	* @param id the primary key for the new response bo
	* @return the new response bo
	*/
	public vn.gt.dao.nhapcanh.model.ResponseBo create(long id);

	/**
	* Removes the response bo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the response bo
	* @return the response bo that was removed
	* @throws vn.gt.dao.nhapcanh.NoSuchResponseBoException if a response bo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.ResponseBo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchResponseBoException;

	public vn.gt.dao.nhapcanh.model.ResponseBo updateImpl(
		vn.gt.dao.nhapcanh.model.ResponseBo responseBo, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the response bo with the primary key or throws a {@link vn.gt.dao.nhapcanh.NoSuchResponseBoException} if it could not be found.
	*
	* @param id the primary key of the response bo
	* @return the response bo
	* @throws vn.gt.dao.nhapcanh.NoSuchResponseBoException if a response bo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.ResponseBo findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.nhapcanh.NoSuchResponseBoException;

	/**
	* Returns the response bo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the response bo
	* @return the response bo, or <code>null</code> if a response bo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.ResponseBo fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the response bos.
	*
	* @return the response bos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.gt.dao.nhapcanh.model.ResponseBo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the response bos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of response bos.
	*
	* @return the number of response bos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}