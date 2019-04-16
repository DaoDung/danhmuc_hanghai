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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link IssueShiftingOrderChanel}.
 * </p>
 *
 * @author    win_64
 * @see       IssueShiftingOrderChanel
 * @generated
 */
public class IssueShiftingOrderChanelWrapper implements IssueShiftingOrderChanel,
	ModelWrapper<IssueShiftingOrderChanel> {
	public IssueShiftingOrderChanelWrapper(
		IssueShiftingOrderChanel issueShiftingOrderChanel) {
		_issueShiftingOrderChanel = issueShiftingOrderChanel;
	}

	public Class<?> getModelClass() {
		return IssueShiftingOrderChanel.class;
	}

	public String getModelClassName() {
		return IssueShiftingOrderChanel.class.getName();
	}

	/**
	* Returns the primary key of this issue shifting order chanel.
	*
	* @return the primary key of this issue shifting order chanel
	*/
	public vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK getPrimaryKey() {
		return _issueShiftingOrderChanel.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue shifting order chanel.
	*
	* @param primaryKey the primary key of this issue shifting order chanel
	*/
	public void setPrimaryKey(
		vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK primaryKey) {
		_issueShiftingOrderChanel.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the shifting order ID of this issue shifting order chanel.
	*
	* @return the shifting order ID of this issue shifting order chanel
	*/
	public long getShiftingOrderId() {
		return _issueShiftingOrderChanel.getShiftingOrderId();
	}

	/**
	* Sets the shifting order ID of this issue shifting order chanel.
	*
	* @param shiftingOrderId the shifting order ID of this issue shifting order chanel
	*/
	public void setShiftingOrderId(long shiftingOrderId) {
		_issueShiftingOrderChanel.setShiftingOrderId(shiftingOrderId);
	}

	/**
	* Returns the chanel code of this issue shifting order chanel.
	*
	* @return the chanel code of this issue shifting order chanel
	*/
	public java.lang.String getChanelCode() {
		return _issueShiftingOrderChanel.getChanelCode();
	}

	/**
	* Sets the chanel code of this issue shifting order chanel.
	*
	* @param chanelCode the chanel code of this issue shifting order chanel
	*/
	public void setChanelCode(java.lang.String chanelCode) {
		_issueShiftingOrderChanel.setChanelCode(chanelCode);
	}

	/**
	* Returns the chanel name of this issue shifting order chanel.
	*
	* @return the chanel name of this issue shifting order chanel
	*/
	public java.lang.String getChanelName() {
		return _issueShiftingOrderChanel.getChanelName();
	}

	/**
	* Sets the chanel name of this issue shifting order chanel.
	*
	* @param chanelName the chanel name of this issue shifting order chanel
	*/
	public void setChanelName(java.lang.String chanelName) {
		_issueShiftingOrderChanel.setChanelName(chanelName);
	}

	/**
	* Returns the order of this issue shifting order chanel.
	*
	* @return the order of this issue shifting order chanel
	*/
	public int getOrder() {
		return _issueShiftingOrderChanel.getOrder();
	}

	/**
	* Sets the order of this issue shifting order chanel.
	*
	* @param order the order of this issue shifting order chanel
	*/
	public void setOrder(int order) {
		_issueShiftingOrderChanel.setOrder(order);
	}

	public boolean isNew() {
		return _issueShiftingOrderChanel.isNew();
	}

	public void setNew(boolean n) {
		_issueShiftingOrderChanel.setNew(n);
	}

	public boolean isCachedModel() {
		return _issueShiftingOrderChanel.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_issueShiftingOrderChanel.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _issueShiftingOrderChanel.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _issueShiftingOrderChanel.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issueShiftingOrderChanel.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issueShiftingOrderChanel.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issueShiftingOrderChanel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssueShiftingOrderChanelWrapper((IssueShiftingOrderChanel)_issueShiftingOrderChanel.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel issueShiftingOrderChanel) {
		return _issueShiftingOrderChanel.compareTo(issueShiftingOrderChanel);
	}

	@Override
	public int hashCode() {
		return _issueShiftingOrderChanel.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel> toCacheModel() {
		return _issueShiftingOrderChanel.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel toEscapedModel() {
		return new IssueShiftingOrderChanelWrapper(_issueShiftingOrderChanel.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issueShiftingOrderChanel.toString();
	}

	public java.lang.String toXmlString() {
		return _issueShiftingOrderChanel.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueShiftingOrderChanel.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public IssueShiftingOrderChanel getWrappedIssueShiftingOrderChanel() {
		return _issueShiftingOrderChanel;
	}

	public IssueShiftingOrderChanel getWrappedModel() {
		return _issueShiftingOrderChanel;
	}

	public void resetOriginalValues() {
		_issueShiftingOrderChanel.resetOriginalValues();
	}

	private IssueShiftingOrderChanel _issueShiftingOrderChanel;
}