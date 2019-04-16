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

package vn.gt.dao.danhmuc.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DmDataItem}.
 * </p>
 *
 * @author    win_64
 * @see       DmDataItem
 * @generated
 */
public class DmDataItemWrapper implements DmDataItem, ModelWrapper<DmDataItem> {
	public DmDataItemWrapper(DmDataItem dmDataItem) {
		_dmDataItem = dmDataItem;
	}

	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	public String getModelClassName() {
		return DmDataItem.class.getName();
	}

	/**
	* Returns the primary key of this dm data item.
	*
	* @return the primary key of this dm data item
	*/
	public long getPrimaryKey() {
		return _dmDataItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm data item.
	*
	* @param primaryKey the primary key of this dm data item
	*/
	public void setPrimaryKey(long primaryKey) {
		_dmDataItem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm data item.
	*
	* @return the ID of this dm data item
	*/
	public long getId() {
		return _dmDataItem.getId();
	}

	/**
	* Sets the ID of this dm data item.
	*
	* @param Id the ID of this dm data item
	*/
	public void setId(long Id) {
		_dmDataItem.setId(Id);
	}

	/**
	* Returns the data group ID of this dm data item.
	*
	* @return the data group ID of this dm data item
	*/
	public long getDataGroupId() {
		return _dmDataItem.getDataGroupId();
	}

	/**
	* Sets the data group ID of this dm data item.
	*
	* @param DataGroupId the data group ID of this dm data item
	*/
	public void setDataGroupId(long DataGroupId) {
		_dmDataItem.setDataGroupId(DataGroupId);
	}

	/**
	* Returns the code0 of this dm data item.
	*
	* @return the code0 of this dm data item
	*/
	public java.lang.String getCode0() {
		return _dmDataItem.getCode0();
	}

	/**
	* Sets the code0 of this dm data item.
	*
	* @param Code0 the code0 of this dm data item
	*/
	public void setCode0(java.lang.String Code0) {
		_dmDataItem.setCode0(Code0);
	}

	/**
	* Returns the node1 of this dm data item.
	*
	* @return the node1 of this dm data item
	*/
	public java.lang.String getNode1() {
		return _dmDataItem.getNode1();
	}

	/**
	* Sets the node1 of this dm data item.
	*
	* @param Node1 the node1 of this dm data item
	*/
	public void setNode1(java.lang.String Node1) {
		_dmDataItem.setNode1(Node1);
	}

	/**
	* Returns the node2 of this dm data item.
	*
	* @return the node2 of this dm data item
	*/
	public java.lang.String getNode2() {
		return _dmDataItem.getNode2();
	}

	/**
	* Sets the node2 of this dm data item.
	*
	* @param Node2 the node2 of this dm data item
	*/
	public void setNode2(java.lang.String Node2) {
		_dmDataItem.setNode2(Node2);
	}

	/**
	* Returns the node3 of this dm data item.
	*
	* @return the node3 of this dm data item
	*/
	public java.lang.String getNode3() {
		return _dmDataItem.getNode3();
	}

	/**
	* Sets the node3 of this dm data item.
	*
	* @param Node3 the node3 of this dm data item
	*/
	public void setNode3(java.lang.String Node3) {
		_dmDataItem.setNode3(Node3);
	}

	/**
	* Returns the node4 of this dm data item.
	*
	* @return the node4 of this dm data item
	*/
	public java.lang.String getNode4() {
		return _dmDataItem.getNode4();
	}

	/**
	* Sets the node4 of this dm data item.
	*
	* @param Node4 the node4 of this dm data item
	*/
	public void setNode4(java.lang.String Node4) {
		_dmDataItem.setNode4(Node4);
	}

	/**
	* Returns the level of this dm data item.
	*
	* @return the level of this dm data item
	*/
	public int getLevel() {
		return _dmDataItem.getLevel();
	}

	/**
	* Sets the level of this dm data item.
	*
	* @param Level the level of this dm data item
	*/
	public void setLevel(int Level) {
		_dmDataItem.setLevel(Level);
	}

	/**
	* Returns the name of this dm data item.
	*
	* @return the name of this dm data item
	*/
	public java.lang.String getName() {
		return _dmDataItem.getName();
	}

	/**
	* Sets the name of this dm data item.
	*
	* @param Name the name of this dm data item
	*/
	public void setName(java.lang.String Name) {
		_dmDataItem.setName(Name);
	}

	/**
	* Returns the short name of this dm data item.
	*
	* @return the short name of this dm data item
	*/
	public java.lang.String getShortName() {
		return _dmDataItem.getShortName();
	}

	/**
	* Sets the short name of this dm data item.
	*
	* @param ShortName the short name of this dm data item
	*/
	public void setShortName(java.lang.String ShortName) {
		_dmDataItem.setShortName(ShortName);
	}

	/**
	* Returns the description of this dm data item.
	*
	* @return the description of this dm data item
	*/
	public java.lang.String getDescription() {
		return _dmDataItem.getDescription();
	}

	/**
	* Sets the description of this dm data item.
	*
	* @param Description the description of this dm data item
	*/
	public void setDescription(java.lang.String Description) {
		_dmDataItem.setDescription(Description);
	}

	/**
	* Returns the validated from of this dm data item.
	*
	* @return the validated from of this dm data item
	*/
	public java.util.Date getValidatedFrom() {
		return _dmDataItem.getValidatedFrom();
	}

	/**
	* Sets the validated from of this dm data item.
	*
	* @param ValidatedFrom the validated from of this dm data item
	*/
	public void setValidatedFrom(java.util.Date ValidatedFrom) {
		_dmDataItem.setValidatedFrom(ValidatedFrom);
	}

	/**
	* Returns the validated to of this dm data item.
	*
	* @return the validated to of this dm data item
	*/
	public java.util.Date getValidatedTo() {
		return _dmDataItem.getValidatedTo();
	}

	/**
	* Sets the validated to of this dm data item.
	*
	* @param ValidatedTo the validated to of this dm data item
	*/
	public void setValidatedTo(java.util.Date ValidatedTo) {
		_dmDataItem.setValidatedTo(ValidatedTo);
	}

	/**
	* Returns the order of this dm data item.
	*
	* @return the order of this dm data item
	*/
	public int getOrder() {
		return _dmDataItem.getOrder();
	}

	/**
	* Sets the order of this dm data item.
	*
	* @param Order the order of this dm data item
	*/
	public void setOrder(int Order) {
		_dmDataItem.setOrder(Order);
	}

	/**
	* Returns the status of this dm data item.
	*
	* @return the status of this dm data item
	*/
	public int getStatus() {
		return _dmDataItem.getStatus();
	}

	/**
	* Sets the status of this dm data item.
	*
	* @param Status the status of this dm data item
	*/
	public void setStatus(int Status) {
		_dmDataItem.setStatus(Status);
	}

	public boolean isNew() {
		return _dmDataItem.isNew();
	}

	public void setNew(boolean n) {
		_dmDataItem.setNew(n);
	}

	public boolean isCachedModel() {
		return _dmDataItem.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_dmDataItem.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _dmDataItem.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _dmDataItem.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmDataItem.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmDataItem.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmDataItem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmDataItemWrapper((DmDataItem)_dmDataItem.clone());
	}

	public int compareTo(vn.gt.dao.danhmuc.model.DmDataItem dmDataItem) {
		return _dmDataItem.compareTo(dmDataItem);
	}

	@Override
	public int hashCode() {
		return _dmDataItem.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.danhmuc.model.DmDataItem> toCacheModel() {
		return _dmDataItem.toCacheModel();
	}

	public vn.gt.dao.danhmuc.model.DmDataItem toEscapedModel() {
		return new DmDataItemWrapper(_dmDataItem.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmDataItem.toString();
	}

	public java.lang.String toXmlString() {
		return _dmDataItem.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmDataItem.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public DmDataItem getWrappedDmDataItem() {
		return _dmDataItem;
	}

	public DmDataItem getWrappedModel() {
		return _dmDataItem;
	}

	public void resetOriginalValues() {
		_dmDataItem.resetOriginalValues();
	}

	private DmDataItem _dmDataItem;
}