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

package vn.gt.dao.danhmuc.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the dm port region local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see DmPortRegionLocalServiceUtil
 * @see vn.gt.dao.danhmuc.service.base.DmPortRegionLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.impl.DmPortRegionLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DmPortRegionLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmPortRegionLocalServiceUtil} to access the dm port region local service. Add custom service methods to {@link vn.gt.dao.danhmuc.service.impl.DmPortRegionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dm port region to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @return the dm port region that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion addDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dm port region with the primary key. Does not add the dm port region to the database.
	*
	* @param id the primary key for the new dm port region
	* @return the new dm port region
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion createDmPortRegion(int id);

	/**
	* Deletes the dm port region with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port region
	* @throws PortalException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dm port region from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.danhmuc.model.DmPortRegion fetchDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm port region with the primary key.
	*
	* @param id the primary key of the dm port region
	* @return the dm port region
	* @throws PortalException if a dm port region with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.danhmuc.model.DmPortRegion getDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm port regions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm port regions
	* @param end the upper bound of the range of dm port regions (not inclusive)
	* @return the range of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> getDmPortRegions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm port regions.
	*
	* @return the number of dm port regions
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDmPortRegionsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dm port region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @return the dm port region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion updateDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dm port region in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortRegion the dm port region
	* @param merge whether to merge the dm port region with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm port region that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmPortRegion updateDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.danhmuc.model.DmPortRegion getByPortRegionCode(
		java.lang.String portRegionCode);

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findPortRegionByPortRegionRef(
		java.lang.String portRegionRef);

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findPortRegionByPortCodeName(
		java.lang.String portCode);

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findDanhSachDmPortRegion(
		java.lang.String maritimeCode, java.lang.String portRegionName,
		java.lang.String portCode, int start, int end);

	public int countDanhSachDmPortRegion(java.lang.String maritimeCode,
		java.lang.String portRegionName, java.lang.String portCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.danhmuc.model.DmPortRegion getFirstPortRegion();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.gt.dao.danhmuc.model.DmPortRegion getLastPortRegion();
}