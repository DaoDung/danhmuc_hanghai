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

package vn.gt.dao.nhapcanh.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link CrewListLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       CrewListLocalService
 * @generated
 */
public class CrewListLocalServiceWrapper implements CrewListLocalService,
	ServiceWrapper<CrewListLocalService> {
	public CrewListLocalServiceWrapper(
		CrewListLocalService crewListLocalService) {
		_crewListLocalService = crewListLocalService;
	}

	/**
	* Adds the crew list to the database. Also notifies the appropriate model listeners.
	*
	* @param crewList the crew list
	* @return the crew list that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList addCrewList(
		vn.gt.dao.nhapcanh.model.CrewList crewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.addCrewList(crewList);
	}

	/**
	* Creates a new crew list with the primary key. Does not add the crew list to the database.
	*
	* @param id the primary key for the new crew list
	* @return the new crew list
	*/
	public vn.gt.dao.nhapcanh.model.CrewList createCrewList(long id) {
		return _crewListLocalService.createCrewList(id);
	}

	/**
	* Deletes the crew list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the crew list
	* @throws PortalException if a crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCrewList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_crewListLocalService.deleteCrewList(id);
	}

	/**
	* Deletes the crew list from the database. Also notifies the appropriate model listeners.
	*
	* @param crewList the crew list
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCrewList(vn.gt.dao.nhapcanh.model.CrewList crewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		_crewListLocalService.deleteCrewList(crewList);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.dynamicQuery(dynamicQuery);
	}

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
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.nhapcanh.model.CrewList fetchCrewList(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.fetchCrewList(id);
	}

	/**
	* Returns the crew list with the primary key.
	*
	* @param id the primary key of the crew list
	* @return the crew list
	* @throws PortalException if a crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList getCrewList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.getCrewList(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the crew lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of crew lists
	* @param end the upper bound of the range of crew lists (not inclusive)
	* @return the range of crew lists
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.nhapcanh.model.CrewList> getCrewLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.getCrewLists(start, end);
	}

	/**
	* Returns the number of crew lists.
	*
	* @return the number of crew lists
	* @throws SystemException if a system exception occurred
	*/
	public int getCrewListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.getCrewListsCount();
	}

	/**
	* Updates the crew list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crewList the crew list
	* @return the crew list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList updateCrewList(
		vn.gt.dao.nhapcanh.model.CrewList crewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.updateCrewList(crewList);
	}

	/**
	* Updates the crew list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param crewList the crew list
	* @param merge whether to merge the crew list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the crew list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.nhapcanh.model.CrewList updateCrewList(
		vn.gt.dao.nhapcanh.model.CrewList crewList, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _crewListLocalService.updateCrewList(crewList, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _crewListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_crewListLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public CrewListLocalService getWrappedCrewListLocalService() {
		return _crewListLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedCrewListLocalService(
		CrewListLocalService crewListLocalService) {
		_crewListLocalService = crewListLocalService;
	}

	public CrewListLocalService getWrappedService() {
		return _crewListLocalService;
	}

	public void setWrappedService(CrewListLocalService crewListLocalService) {
		_crewListLocalService = crewListLocalService;
	}

	private CrewListLocalService _crewListLocalService;
}