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
public class DmMaritimeLocalServiceClp implements DmMaritimeLocalService {
	public DmMaritimeLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addDmMaritimeMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addDmMaritime", vn.gt.dao.danhmuc.model.DmMaritime.class);

		_createDmMaritimeMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createDmMaritime", int.class);

		_deleteDmMaritimeMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmMaritime", int.class);

		_deleteDmMaritimeMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmMaritime", vn.gt.dao.danhmuc.model.DmMaritime.class);

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

		_fetchDmMaritimeMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchDmMaritime", int.class);

		_getDmMaritimeMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmMaritime", int.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getDmMaritimesMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmMaritimes", int.class, int.class);

		_getDmMaritimesCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmMaritimesCount");

		_updateDmMaritimeMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmMaritime", vn.gt.dao.danhmuc.model.DmMaritime.class);

		_updateDmMaritimeMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmMaritime", vn.gt.dao.danhmuc.model.DmMaritime.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findAllMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findAll");

		_findAllMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findAll", int.class, int.class);

		_getByMaritimeCodeMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByMaritimeCode", java.lang.String.class);

		_getByMaritimeReferenceMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByMaritimeReference", java.lang.String.class);

		_countByMaritimeCodeMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByMaritimeCode", java.lang.String.class);

		_findRangeOrderByMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findRangeOrderBy", int.class, int.class,
				com.liferay.portal.kernel.util.OrderByComparator.class);

		_getAllMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"getAll");

		_getFirstMaritimeMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"getFirstMaritime");

		_getLastMaritimeMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"getLastMaritime");

		_findDanhSachDmMaritimeMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachDmMaritime", java.lang.String.class, int.class,
				int.class);

		_countDanhSachDmMaritimeMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachDmMaritime", java.lang.String.class, int.class,
				int.class);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime addDmMaritime(
		vn.gt.dao.danhmuc.model.DmMaritime dmMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addDmMaritimeMethodKey0,
				ClpSerializer.translateInput(dmMaritime));

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime createDmMaritime(int id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createDmMaritimeMethodKey1,
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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteDmMaritime(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmMaritimeMethodKey2,
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

	public void deleteDmMaritime(vn.gt.dao.danhmuc.model.DmMaritime dmMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmMaritimeMethodKey3,
				ClpSerializer.translateInput(dmMaritime));

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

	public vn.gt.dao.danhmuc.model.DmMaritime fetchDmMaritime(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchDmMaritimeMethodKey8,
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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime getDmMaritime(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmMaritimeMethodKey9,
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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> getDmMaritimes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmMaritimesMethodKey11,
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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmMaritime>)ClpSerializer.translateOutput(returnObj);
	}

	public int getDmMaritimesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmMaritimesCountMethodKey12);

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

	public vn.gt.dao.danhmuc.model.DmMaritime updateDmMaritime(
		vn.gt.dao.danhmuc.model.DmMaritime dmMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmMaritimeMethodKey13,
				ClpSerializer.translateInput(dmMaritime));

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime updateDmMaritime(
		vn.gt.dao.danhmuc.model.DmMaritime dmMaritime, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmMaritimeMethodKey14,
				ClpSerializer.translateInput(dmMaritime), merge);

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findAll() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findAllMethodKey17);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmMaritime>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findAll(
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findAllMethodKey18,
				start, end);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmMaritime>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime getByMaritimeCode(
		java.lang.String maritimeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByMaritimeCodeMethodKey19,
				ClpSerializer.translateInput(maritimeCode));

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime getByMaritimeReference(
		java.lang.String maritimeReference) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByMaritimeReferenceMethodKey20,
				ClpSerializer.translateInput(maritimeReference));

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public int countByMaritimeCode(java.lang.String maritimeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByMaritimeCodeMethodKey21,
				ClpSerializer.translateInput(maritimeCode));

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

	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findRangeOrderBy(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findRangeOrderByMethodKey22,
				start, end, ClpSerializer.translateInput(orderByComparator));

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmMaritime>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> getAll() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllMethodKey23);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmMaritime>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime getFirstMaritime() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getFirstMaritimeMethodKey24);

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmMaritime getLastMaritime() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getLastMaritimeMethodKey25);

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

		return (vn.gt.dao.danhmuc.model.DmMaritime)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmMaritime> findDanhSachDmMaritime(
		java.lang.String maritimeCode, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachDmMaritimeMethodKey26,
				ClpSerializer.translateInput(maritimeCode), start, end);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmMaritime>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachDmMaritime(java.lang.String maritimeCode,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachDmMaritimeMethodKey27,
				ClpSerializer.translateInput(maritimeCode), start, end);

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
	private MethodKey _addDmMaritimeMethodKey0;
	private MethodKey _createDmMaritimeMethodKey1;
	private MethodKey _deleteDmMaritimeMethodKey2;
	private MethodKey _deleteDmMaritimeMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchDmMaritimeMethodKey8;
	private MethodKey _getDmMaritimeMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getDmMaritimesMethodKey11;
	private MethodKey _getDmMaritimesCountMethodKey12;
	private MethodKey _updateDmMaritimeMethodKey13;
	private MethodKey _updateDmMaritimeMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findAllMethodKey17;
	private MethodKey _findAllMethodKey18;
	private MethodKey _getByMaritimeCodeMethodKey19;
	private MethodKey _getByMaritimeReferenceMethodKey20;
	private MethodKey _countByMaritimeCodeMethodKey21;
	private MethodKey _findRangeOrderByMethodKey22;
	private MethodKey _getAllMethodKey23;
	private MethodKey _getFirstMaritimeMethodKey24;
	private MethodKey _getLastMaritimeMethodKey25;
	private MethodKey _findDanhSachDmMaritimeMethodKey26;
	private MethodKey _countDanhSachDmMaritimeMethodKey27;
}