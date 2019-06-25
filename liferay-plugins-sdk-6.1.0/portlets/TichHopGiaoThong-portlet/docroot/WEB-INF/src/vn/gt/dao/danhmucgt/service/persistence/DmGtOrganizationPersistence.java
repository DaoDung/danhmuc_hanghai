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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.gt.dao.danhmucgt.model.DmGtOrganization;

/**
 * The persistence interface for the dm gt organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmGtOrganizationPersistenceImpl
 * @see DmGtOrganizationUtil
 * @generated
 */
public interface DmGtOrganizationPersistence extends BasePersistence<DmGtOrganization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGtOrganizationUtil} to access the dm gt organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm gt organization in the entity cache if it is enabled.
	*
	* @param dmGtOrganization the dm gt organization
	*/
	public void cacheResult(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization);

	/**
	* Caches the dm gt organizations in the entity cache if it is enabled.
	*
	* @param dmGtOrganizations the dm gt organizations
	*/
	public void cacheResult(
		java.util.List<vn.gt.dao.danhmucgt.model.DmGtOrganization> dmGtOrganizations);

	/**
	* Creates a new dm gt organization with the primary key. Does not add the dm gt organization to the database.
	*
	* @param id the primary key for the new dm gt organization
	* @return the new dm gt organization
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization create(long id);

	/**
	* Removes the dm gt organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization that was removed
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException;

	public vn.gt.dao.danhmucgt.model.DmGtOrganization updateImpl(
		vn.gt.dao.danhmucgt.model.DmGtOrganization dmGtOrganization,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt organization with the primary key or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException} if it could not be found.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException;

	/**
	* Returns the dm gt organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt organization
	* @return the dm gt organization, or <code>null</code> if a dm gt organization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt organization where organizationCode = &#63; or throws a {@link vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException} if it could not be found.
	*
	* @param organizationCode the organization code
	* @return the matching dm gt organization
	* @throws vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException if a matching dm gt organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization findByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException;

	/**
	* Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param organizationCode the organization code
	* @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization fetchByOrganizationCode(
		java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm gt organization where organizationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param organizationCode the organization code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt organization, or <code>null</code> if a matching dm gt organization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmucgt.model.DmGtOrganization fetchByOrganizationCode(
		java.lang.String organizationCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm gt organizations.
	*
	* @return the dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtOrganization> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm gt organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt organizations
	* @param end the upper bound of the range of dm gt organizations (not inclusive)
	* @return the range of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtOrganization> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm gt organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm gt organizations
	* @param end the upper bound of the range of dm gt organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmucgt.model.DmGtOrganization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm gt organization where organizationCode = &#63; from the database.
	*
	* @param organizationCode the organization code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.gt.dao.danhmucgt.NoSuchDmGtOrganizationException;

	/**
	* Removes all the dm gt organizations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt organizations where organizationCode = &#63;.
	*
	* @param organizationCode the organization code
	* @return the number of matching dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrganizationCode(java.lang.String organizationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm gt organizations.
	*
	* @return the number of dm gt organizations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}