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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author win_64
 */
public class DmDataItemLocalServiceClp implements DmDataItemLocalService {
	public DmDataItemLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addDmDataItemMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addDmDataItem", vn.gt.dao.danhmuc.model.DmDataItem.class);

		_createDmDataItemMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createDmDataItem", long.class);

		_deleteDmDataItemMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmDataItem", long.class);

		_deleteDmDataItemMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmDataItem", vn.gt.dao.danhmuc.model.DmDataItem.class);

		_dynamicQueryMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class);

		_dynamicQueryMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class,
				int.class, int.class);

		_dynamicQueryMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQuery",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class,
				int.class, int.class,
				com.liferay.portal.kernel.util.OrderByComparator.class);

		_dynamicQueryCountMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
				"dynamicQueryCount",
				com.liferay.portal.kernel.dao.orm.DynamicQuery.class);

		_fetchDmDataItemMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchDmDataItem", long.class);

		_getDmDataItemMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmDataItem", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getDmDataItemsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmDataItems", int.class, int.class);

		_getDmDataItemsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmDataItemsCount");

		_updateDmDataItemMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmDataItem", vn.gt.dao.danhmuc.model.DmDataItem.class);

		_updateDmDataItemMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmDataItem", vn.gt.dao.danhmuc.model.DmDataItem.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findByDataGroupIdAndCode0MethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDataGroupIdAndCode0", long.class, java.lang.String.class);

		_findByDataGroupIdMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDataGroupId", long.class);

		_findByDataGroupIdAndLevelMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDataGroupIdAndLevel", long.class, int.class);

		_findByDataGroupIdAndLevelandShortNameMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDataGroupIdAndLevelandShortName", long.class, int.class,
				java.lang.String.class);

		_findByDataGroupIdAndNode1MethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDataGroupIdAndNode1", long.class, java.lang.String.class);

		_findByDataGroupIdAndShortNameMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDataGroupIdAndShortName", long.class,
				java.lang.String.class);

		_getAllByDataGroupIDMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"getAllByDataGroupID", long.class, int.class, int.class);

		_getByNode2AndDataGroupIDMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByNode2AndDataGroupID", long.class, java.lang.String.class);

		_getAllByNode1Node2AndDataGroupIDMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"getAllByNode1Node2AndDataGroupID", long.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countByNode1Node2AndDataGroupIDMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByNode1Node2AndDataGroupID", long.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);
	}

	public vn.gt.dao.danhmuc.model.DmDataItem addDmDataItem(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addDmDataItemMethodKey0,
				ClpSerializer.translateInput(dmDataItem));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmDataItem createDmDataItem(long Id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createDmDataItemMethodKey1,
				Id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmDataItemMethodKey2,
				Id);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteDmDataItem(vn.gt.dao.danhmuc.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmDataItemMethodKey3,
				ClpSerializer.translateInput(dmDataItem));

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey4,
				ClpSerializer.translateInput(dynamicQuery));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey5,
				ClpSerializer.translateInput(dynamicQuery), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryMethodKey6,
				ClpSerializer.translateInput(dynamicQuery), start, end,
				ClpSerializer.translateInput(orderByComparator));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_dynamicQueryCountMethodKey7,
				ClpSerializer.translateInput(dynamicQuery));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	public vn.gt.dao.danhmuc.model.DmDataItem fetchDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchDmDataItemMethodKey8,
				Id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmDataItem getDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmDataItemMethodKey9,
				Id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getPersistedModelMethodKey10,
				ClpSerializer.translateInput(primaryKeyObj));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmDataItemsMethodKey11,
				start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public int getDmDataItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmDataItemsCountMethodKey12);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public vn.gt.dao.danhmuc.model.DmDataItem updateDmDataItem(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmDataItemMethodKey13,
				ClpSerializer.translateInput(dmDataItem));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmDataItem updateDmDataItem(
		vn.gt.dao.danhmuc.model.DmDataItem dmDataItem, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmDataItemMethodKey14,
				ClpSerializer.translateInput(dmDataItem), merge);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getBeanIdentifierMethodKey15);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		MethodHandler methodHandler = new MethodHandler(_setBeanIdentifierMethodKey16,
				ClpSerializer.translateInput(beanIdentifier));

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public vn.gt.dao.danhmuc.model.DmDataItem findByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDataGroupIdAndCode0MethodKey17,
				DataGroupId, ClpSerializer.translateInput(Code0));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupId(
		long DataGroupId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDataGroupIdMethodKey18,
				DataGroupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDataGroupIdAndLevelMethodKey19,
				DataGroupId, Level);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndLevelandShortName(
		long DataGroupId, int Level, java.lang.String ShortName) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDataGroupIdAndLevelandShortNameMethodKey20,
				DataGroupId, Level, ClpSerializer.translateInput(ShortName));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndNode1(
		long DataGroupId, java.lang.String Node1) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDataGroupIdAndNode1MethodKey21,
				DataGroupId, ClpSerializer.translateInput(Node1));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> findByDataGroupIdAndShortName(
		long DataGroupId, java.lang.String ShortName) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDataGroupIdAndShortNameMethodKey22,
				DataGroupId, ClpSerializer.translateInput(ShortName));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> getAllByDataGroupID(
		long datagroupid, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllByDataGroupIDMethodKey23,
				datagroupid, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmDataItem getByNode2AndDataGroupID(
		long datagroupid, java.lang.String node2) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByNode2AndDataGroupIDMethodKey24,
				datagroupid, ClpSerializer.translateInput(node2));

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (vn.gt.dao.danhmuc.model.DmDataItem)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmDataItem> getAllByNode1Node2AndDataGroupID(
		long datagroupid, java.lang.String node1, java.lang.String node2,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllByNode1Node2AndDataGroupIDMethodKey25,
				datagroupid, ClpSerializer.translateInput(node1),
				ClpSerializer.translateInput(node2), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<vn.gt.dao.danhmuc.model.DmDataItem>)ClpSerializer.translateOutput(returnObj);
	}

	public int countByNode1Node2AndDataGroupID(long datagroupid,
		java.lang.String node1, java.lang.String node2, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByNode1Node2AndDataGroupIDMethodKey26,
				datagroupid, ClpSerializer.translateInput(node1),
				ClpSerializer.translateInput(node2), start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addDmDataItemMethodKey0;
	private MethodKey _createDmDataItemMethodKey1;
	private MethodKey _deleteDmDataItemMethodKey2;
	private MethodKey _deleteDmDataItemMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchDmDataItemMethodKey8;
	private MethodKey _getDmDataItemMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getDmDataItemsMethodKey11;
	private MethodKey _getDmDataItemsCountMethodKey12;
	private MethodKey _updateDmDataItemMethodKey13;
	private MethodKey _updateDmDataItemMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findByDataGroupIdAndCode0MethodKey17;
	private MethodKey _findByDataGroupIdMethodKey18;
	private MethodKey _findByDataGroupIdAndLevelMethodKey19;
	private MethodKey _findByDataGroupIdAndLevelandShortNameMethodKey20;
	private MethodKey _findByDataGroupIdAndNode1MethodKey21;
	private MethodKey _findByDataGroupIdAndShortNameMethodKey22;
	private MethodKey _getAllByDataGroupIDMethodKey23;
	private MethodKey _getByNode2AndDataGroupIDMethodKey24;
	private MethodKey _getAllByNode1Node2AndDataGroupIDMethodKey25;
	private MethodKey _countByNode1Node2AndDataGroupIDMethodKey26;
}