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
public class DmPortRegionLocalServiceClp implements DmPortRegionLocalService {
	public DmPortRegionLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addDmPortRegionMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addDmPortRegion", vn.gt.dao.danhmuc.model.DmPortRegion.class);

		_createDmPortRegionMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createDmPortRegion", int.class);

		_deleteDmPortRegionMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmPortRegion", int.class);

		_deleteDmPortRegionMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmPortRegion", vn.gt.dao.danhmuc.model.DmPortRegion.class);

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

		_fetchDmPortRegionMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchDmPortRegion", int.class);

		_getDmPortRegionMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmPortRegion", int.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getDmPortRegionsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmPortRegions", int.class, int.class);

		_getDmPortRegionsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmPortRegionsCount");

		_updateDmPortRegionMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmPortRegion", vn.gt.dao.danhmuc.model.DmPortRegion.class);

		_updateDmPortRegionMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmPortRegion",
				vn.gt.dao.danhmuc.model.DmPortRegion.class, boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_getByPortRegionCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByPortRegionCode", java.lang.String.class);

		_findPortRegionByPortRegionRefMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findPortRegionByPortRegionRef", java.lang.String.class);

		_findPortRegionByPortCodeNameMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findPortRegionByPortCodeName", java.lang.String.class);

		_findDanhSachDmPortRegionMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachDmPortRegion", java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countDanhSachDmPortRegionMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachDmPortRegion", java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_getFirstPortRegionMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"getFirstPortRegion");

		_getLastPortRegionMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"getLastPortRegion");
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion addDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addDmPortRegionMethodKey0,
				ClpSerializer.translateInput(dmPortRegion));

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion createDmPortRegion(int id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createDmPortRegionMethodKey1,
				id);

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmPortRegionMethodKey2,
				id);

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

	public void deleteDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmPortRegionMethodKey3,
				ClpSerializer.translateInput(dmPortRegion));

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

	public vn.gt.dao.danhmuc.model.DmPortRegion fetchDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchDmPortRegionMethodKey8,
				id);

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion getDmPortRegion(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmPortRegionMethodKey9,
				id);

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> getDmPortRegions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmPortRegionsMethodKey11,
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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion>)ClpSerializer.translateOutput(returnObj);
	}

	public int getDmPortRegionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmPortRegionsCountMethodKey12);

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

	public vn.gt.dao.danhmuc.model.DmPortRegion updateDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmPortRegionMethodKey13,
				ClpSerializer.translateInput(dmPortRegion));

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion updateDmPortRegion(
		vn.gt.dao.danhmuc.model.DmPortRegion dmPortRegion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmPortRegionMethodKey14,
				ClpSerializer.translateInput(dmPortRegion), merge);

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
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

	public vn.gt.dao.danhmuc.model.DmPortRegion getByPortRegionCode(
		java.lang.String portRegionCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByPortRegionCodeMethodKey17,
				ClpSerializer.translateInput(portRegionCode));

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findPortRegionByPortRegionRef(
		java.lang.String portRegionRef) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findPortRegionByPortRegionRefMethodKey18,
				ClpSerializer.translateInput(portRegionRef));

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findPortRegionByPortCodeName(
		java.lang.String portCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findPortRegionByPortCodeNameMethodKey19,
				ClpSerializer.translateInput(portCode));

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion> findDanhSachDmPortRegion(
		java.lang.String maritimeCode, java.lang.String portRegionName,
		java.lang.String portCode, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachDmPortRegionMethodKey20,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portRegionName),
				ClpSerializer.translateInput(portCode), start, end);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortRegion>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachDmPortRegion(java.lang.String maritimeCode,
		java.lang.String portRegionName, java.lang.String portCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachDmPortRegionMethodKey21,
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portRegionName),
				ClpSerializer.translateInput(portCode));

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

	public vn.gt.dao.danhmuc.model.DmPortRegion getFirstPortRegion() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getFirstPortRegionMethodKey22);

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortRegion getLastPortRegion() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getLastPortRegionMethodKey23);

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

		return (vn.gt.dao.danhmuc.model.DmPortRegion)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addDmPortRegionMethodKey0;
	private MethodKey _createDmPortRegionMethodKey1;
	private MethodKey _deleteDmPortRegionMethodKey2;
	private MethodKey _deleteDmPortRegionMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchDmPortRegionMethodKey8;
	private MethodKey _getDmPortRegionMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getDmPortRegionsMethodKey11;
	private MethodKey _getDmPortRegionsCountMethodKey12;
	private MethodKey _updateDmPortRegionMethodKey13;
	private MethodKey _updateDmPortRegionMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _getByPortRegionCodeMethodKey17;
	private MethodKey _findPortRegionByPortRegionRefMethodKey18;
	private MethodKey _findPortRegionByPortCodeNameMethodKey19;
	private MethodKey _findDanhSachDmPortRegionMethodKey20;
	private MethodKey _countDanhSachDmPortRegionMethodKey21;
	private MethodKey _getFirstPortRegionMethodKey22;
	private MethodKey _getLastPortRegionMethodKey23;
}