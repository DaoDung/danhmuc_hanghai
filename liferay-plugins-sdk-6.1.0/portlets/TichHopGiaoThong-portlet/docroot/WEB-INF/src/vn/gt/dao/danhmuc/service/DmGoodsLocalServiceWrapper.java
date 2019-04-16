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
 * This class is a wrapper for {@link DmGoodsLocalService}.
 * </p>
 *
 * @author    win_64
 * @see       DmGoodsLocalService
 * @generated
 */
public class DmGoodsLocalServiceWrapper implements DmGoodsLocalService,
	ServiceWrapper<DmGoodsLocalService> {
	public DmGoodsLocalServiceWrapper(DmGoodsLocalService dmGoodsLocalService) {
		_dmGoodsLocalService = dmGoodsLocalService;
	}

	/**
	* Adds the dm goods to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @return the dm goods that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods addDmGoods(
		vn.gt.dao.danhmuc.model.DmGoods dmGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.addDmGoods(dmGoods);
	}

	/**
	* Creates a new dm goods with the primary key. Does not add the dm goods to the database.
	*
	* @param id the primary key for the new dm goods
	* @return the new dm goods
	*/
	public vn.gt.dao.danhmuc.model.DmGoods createDmGoods(int id) {
		return _dmGoodsLocalService.createDmGoods(id);
	}

	/**
	* Deletes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm goods
	* @throws PortalException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmGoods(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dmGoodsLocalService.deleteDmGoods(id);
	}

	/**
	* Deletes the dm goods from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDmGoods(vn.gt.dao.danhmuc.model.DmGoods dmGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmGoodsLocalService.deleteDmGoods(dmGoods);
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
		return _dmGoodsLocalService.dynamicQuery(dynamicQuery);
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
		return _dmGoodsLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _dmGoodsLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dmGoodsLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.gt.dao.danhmuc.model.DmGoods fetchDmGoods(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.fetchDmGoods(id);
	}

	/**
	* Returns the dm goods with the primary key.
	*
	* @param id the primary key of the dm goods
	* @return the dm goods
	* @throws PortalException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods getDmGoods(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getDmGoods(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dm goodses
	* @param end the upper bound of the range of dm goodses (not inclusive)
	* @return the range of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.gt.dao.danhmuc.model.DmGoods> getDmGoodses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getDmGoodses(start, end);
	}

	/**
	* Returns the number of dm goodses.
	*
	* @return the number of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	public int getDmGoodsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getDmGoodsesCount();
	}

	/**
	* Updates the dm goods in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @return the dm goods that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods updateDmGoods(
		vn.gt.dao.danhmuc.model.DmGoods dmGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.updateDmGoods(dmGoods);
	}

	/**
	* Updates the dm goods in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @param merge whether to merge the dm goods with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dm goods that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.gt.dao.danhmuc.model.DmGoods updateDmGoods(
		vn.gt.dao.danhmuc.model.DmGoods dmGoods, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.updateDmGoods(dmGoods, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dmGoodsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGoodsLocalService.setBeanIdentifier(beanIdentifier);
	}

	public vn.gt.dao.danhmuc.model.DmGoods getByGoodsItemCode(
		java.lang.String goodsItemCode) {
		return _dmGoodsLocalService.getByGoodsItemCode(goodsItemCode);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DmGoodsLocalService getWrappedDmGoodsLocalService() {
		return _dmGoodsLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDmGoodsLocalService(
		DmGoodsLocalService dmGoodsLocalService) {
		_dmGoodsLocalService = dmGoodsLocalService;
	}

	public DmGoodsLocalService getWrappedService() {
		return _dmGoodsLocalService;
	}

	public void setWrappedService(DmGoodsLocalService dmGoodsLocalService) {
		_dmGoodsLocalService = dmGoodsLocalService;
	}

	private DmGoodsLocalService _dmGoodsLocalService;
}