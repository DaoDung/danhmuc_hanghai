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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmHistoryGoodsTypeLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryGoodsTypeLocalService
 * @generated
 */
public class DmHistoryGoodsTypeLocalServiceWrapper
	implements DmHistoryGoodsTypeLocalService,
		ServiceWrapper<DmHistoryGoodsTypeLocalService> {
	public DmHistoryGoodsTypeLocalServiceWrapper(
		DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService) {
		_dmHistoryGoodsTypeLocalService = dmHistoryGoodsTypeLocalService;
	}

	/**
	* Adds the dm history goods type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoodsType the dm history goods type
	* @return the dm history goods type that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType addDmHistoryGoodsType(
		vn.gt.dao.danhmuc.model.DmHistoryGoodsType dmHistoryGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.addDmHistoryGoodsType(dmHistoryGoodsType);
	}

	/**
	* Creates a new dm history goods type with the primary key. Does not add the dm history goods type to the database.
	*
	* @param id the primary key for the new dm history goods type
	* @return the new dm history goods type
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType createDmHistoryGoodsType(
		int id) {
		return _dmHistoryGoodsTypeLocalService.createDmHistoryGoodsType(id);
	}

	/**
	* Deletes the dm history goods type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods type
	* @throws PortalException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryGoodsType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoodsTypeLocalService.deleteDmHistoryGoodsType(id);
	}

	/**
	* Deletes the dm history goods type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoodsType the dm history goods type
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryGoodsType(
		vn.gt.dao.danhmuc.model.DmHistoryGoodsType dmHistoryGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoodsTypeLocalService.deleteDmHistoryGoodsType(dmHistoryGoodsType);
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
		return _dmHistoryGoodsTypeLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryGoodsTypeLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
		return _dmHistoryGoodsTypeLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _dmHistoryGoodsTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType fetchDmHistoryGoodsType(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.fetchDmHistoryGoodsType(id);
	}

	/**
	* Returns the dm history goods type with the primary key.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type
	* @throws PortalException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType getDmHistoryGoodsType(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.getDmHistoryGoodsType(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @return the range of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoodsType> getDmHistoryGoodsTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.getDmHistoryGoodsTypes(start, end);
	}

	/**
	* Returns the number of dm history goods types.
	*
	* @return the number of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryGoodsTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.getDmHistoryGoodsTypesCount();
	}

	/**
	* Updates the dm history goods type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoodsType the dm history goods type
	* @return the dm history goods type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType updateDmHistoryGoodsType(
		vn.gt.dao.danhmuc.model.DmHistoryGoodsType dmHistoryGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.updateDmHistoryGoodsType(dmHistoryGoodsType);
	}

	/**
	* Updates the dm history goods type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoodsType the dm history goods type
	* @param merge whether to merge the dm history goods type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history goods type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType updateDmHistoryGoodsType(
		vn.gt.dao.danhmuc.model.DmHistoryGoodsType dmHistoryGoodsType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsTypeLocalService.updateDmHistoryGoodsType(dmHistoryGoodsType,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryGoodsTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryGoodsTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryGoodsType findByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion) {
		return _dmHistoryGoodsTypeLocalService.findByGoodsTypeCodeAndSyncVersion(goodsTypeCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryGoodsTypeLocalService getWrappedDmHistoryGoodsTypeLocalService() {
		return _dmHistoryGoodsTypeLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryGoodsTypeLocalService(
		DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService) {
		_dmHistoryGoodsTypeLocalService = dmHistoryGoodsTypeLocalService;
	}

	public DmHistoryGoodsTypeLocalService getWrappedService() {
		return _dmHistoryGoodsTypeLocalService;
	}

	public void setWrappedService(
		DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService) {
		_dmHistoryGoodsTypeLocalService = dmHistoryGoodsTypeLocalService;
	}

	private DmHistoryGoodsTypeLocalService _dmHistoryGoodsTypeLocalService;
}