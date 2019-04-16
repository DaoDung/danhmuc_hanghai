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
 * This class is a wrapper for {@link DmHistoryGoodsLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmHistoryGoodsLocalService
 * @generated
 */
public class DmHistoryGoodsLocalServiceWrapper
	implements DmHistoryGoodsLocalService,
		ServiceWrapper<DmHistoryGoodsLocalService> {
	public DmHistoryGoodsLocalServiceWrapper(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		_dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	/**
	* Adds the dm history goods to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @return the dm history goods that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods addDmHistoryGoods(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.addDmHistoryGoods(dmHistoryGoods);
	}

	/**
	* Creates a new dm history goods with the primary key. Does not add the dm history goods to the database.
	*
	* @param id the primary key for the new dm history goods
	* @return the new dm history goods
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods createDmHistoryGoods(int id) {
		return _dmHistoryGoodsLocalService.createDmHistoryGoods(id);
	}

	/**
	* Deletes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods
	* @throws PortalException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryGoods(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoodsLocalService.deleteDmHistoryGoods(id);
	}

	/**
	* Deletes the dm history goods from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmHistoryGoods(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmHistoryGoodsLocalService.deleteDmHistoryGoods(dmHistoryGoods);
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
		return _dmHistoryGoodsLocalService.dynamicQuery(dynamicQuery);
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
		return _dmHistoryGoodsLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmHistoryGoodsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _dmHistoryGoodsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryGoods fetchDmHistoryGoods(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.fetchDmHistoryGoods(id);
	}

	/**
	* Returns the dm history goods with the primary key.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods
	* @throws PortalException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods getDmHistoryGoods(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getDmHistoryGoods(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @return the range of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmHistoryGoods> getDmHistoryGoodses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getDmHistoryGoodses(start, end);
	}

	/**
	* Returns the number of dm history goodses.
	*
	* @return the number of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	public int getDmHistoryGoodsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getDmHistoryGoodsesCount();
	}

	/**
	* Updates the dm history goods in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @return the dm history goods that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods updateDmHistoryGoods(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.updateDmHistoryGoods(dmHistoryGoods);
	}

	/**
	* Updates the dm history goods in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @param merge whether to merge the dm history goods with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm history goods that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmHistoryGoods updateDmHistoryGoods(
		vn.gt.dao.danhmuc.model.DmHistoryGoods dmHistoryGoods, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.updateDmHistoryGoods(dmHistoryGoods,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryGoodsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryGoodsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmHistoryGoods findByGoodsItemCodeAndSyncVersion(
		java.lang.String goodsItemCode, java.lang.String syncVersion) {
		return _dmHistoryGoodsLocalService.findByGoodsItemCodeAndSyncVersion(goodsItemCode,
			syncVersion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmHistoryGoodsLocalService getWrappedDmHistoryGoodsLocalService() {
		return _dmHistoryGoodsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryGoodsLocalService(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		_dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	public DmHistoryGoodsLocalService getWrappedService() {
		return _dmHistoryGoodsLocalService;
	}

	public void setWrappedService(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		_dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	private DmHistoryGoodsLocalService _dmHistoryGoodsLocalService;
}