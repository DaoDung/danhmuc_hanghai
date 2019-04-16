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
public class DmPortWharfLocalServiceClp implements DmPortWharfLocalService {
	public DmPortWharfLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addDmPortWharfMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addDmPortWharf", vn.gt.dao.danhmuc.model.DmPortWharf.class);

		_createDmPortWharfMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createDmPortWharf", int.class);

		_deleteDmPortWharfMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmPortWharf", int.class);

		_deleteDmPortWharfMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteDmPortWharf", vn.gt.dao.danhmuc.model.DmPortWharf.class);

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

		_fetchDmPortWharfMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchDmPortWharf", int.class);

		_getDmPortWharfMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmPortWharf", int.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getDmPortWharfsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmPortWharfs", int.class, int.class);

		_getDmPortWharfsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDmPortWharfsCount");

		_updateDmPortWharfMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmPortWharf", vn.gt.dao.danhmuc.model.DmPortWharf.class);

		_updateDmPortWharfMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateDmPortWharf", vn.gt.dao.danhmuc.model.DmPortWharf.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_getByPortWharfCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByPortWharfCode", java.lang.String.class);

		_findByPortRegionCodeMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByPortRegionCode", java.lang.String.class);

		_findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCodeMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode",
				java.lang.String.class, java.lang.String.class, boolean.class);

		_findByPortHarbourCodeOrNullMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByPortHarbourCodeOrNull", java.lang.String.class,
				boolean.class);

		_findByPortRegionCodeOrderPortCodeMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByPortRegionCodeOrderPortCode", java.lang.String.class,
				boolean.class);

		_findDanhSachDmPortWharfMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDanhSachDmPortWharf", java.lang.String.class,
				java.lang.String.class, java.lang.String.class, boolean.class,
				int.class, int.class);

		_countDanhSachDmPortWharfMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDanhSachDmPortWharf", java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findDongBoDmPortWharfMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDongBoDmPortWharf", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, boolean.class, int.class, int.class);

		_countDongBoDmPortWharfMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"countDongBoDmPortWharf", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_getFirstPortWharfMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"getFirstPortWharf");

		_getLastPortWharfMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"getLastPortWharf");
	}

	public vn.gt.dao.danhmuc.model.DmPortWharf addDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addDmPortWharfMethodKey0,
				ClpSerializer.translateInput(dmPortWharf));

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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortWharf createDmPortWharf(int id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createDmPortWharfMethodKey1,
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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmPortWharfMethodKey2,
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

	public void deleteDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteDmPortWharfMethodKey3,
				ClpSerializer.translateInput(dmPortWharf));

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

	public vn.gt.dao.danhmuc.model.DmPortWharf fetchDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchDmPortWharfMethodKey8,
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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortWharf getDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmPortWharfMethodKey9,
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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> getDmPortWharfs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmPortWharfsMethodKey11,
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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public int getDmPortWharfsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDmPortWharfsCountMethodKey12);

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

	public vn.gt.dao.danhmuc.model.DmPortWharf updateDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmPortWharfMethodKey13,
				ClpSerializer.translateInput(dmPortWharf));

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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortWharf updateDmPortWharf(
		vn.gt.dao.danhmuc.model.DmPortWharf dmPortWharf, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDmPortWharfMethodKey14,
				ClpSerializer.translateInput(dmPortWharf), merge);

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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
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

	public vn.gt.dao.danhmuc.model.DmPortWharf getByPortWharfCode(
		java.lang.String portWharfCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByPortWharfCodeMethodKey17,
				ClpSerializer.translateInput(portWharfCode));

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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCode(
		java.lang.String portRegionCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByPortRegionCodeMethodKey18,
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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		boolean ascOrdesc) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCodeMethodKey19,
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(portHarbourCode), ascOrdesc);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortHarbourCodeOrNull(
		java.lang.String portHarbourCode, boolean ascOrdesc) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByPortHarbourCodeOrNullMethodKey20,
				ClpSerializer.translateInput(portHarbourCode), ascOrdesc);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findByPortRegionCodeOrderPortCode(
		java.lang.String portRegionCode, boolean ascOrdesc) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByPortRegionCodeOrderPortCodeMethodKey21,
				ClpSerializer.translateInput(portRegionCode), ascOrdesc);

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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDanhSachDmPortWharf(
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN, boolean ascOrdesc, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDanhSachDmPortWharfMethodKey22,
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(portHarbourCode),
				ClpSerializer.translateInput(PortWharfNameVN), ascOrdesc,
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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDanhSachDmPortWharf(java.lang.String portRegionCode,
		java.lang.String portHarbourCode, java.lang.String PortWharfNameVN) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDanhSachDmPortWharfMethodKey23,
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(portHarbourCode),
				ClpSerializer.translateInput(PortWharfNameVN));

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

	public java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf> findDongBoDmPortWharf(
		java.lang.String MaritimeCode, java.lang.String portRegionCode,
		java.lang.String portHarbourCode, java.lang.String PortWharfNameVN,
		boolean ascOrdesc, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDongBoDmPortWharfMethodKey24,
				ClpSerializer.translateInput(MaritimeCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(portHarbourCode),
				ClpSerializer.translateInput(PortWharfNameVN), ascOrdesc,
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

		return (java.util.List<vn.gt.dao.danhmuc.model.DmPortWharf>)ClpSerializer.translateOutput(returnObj);
	}

	public int countDongBoDmPortWharf(java.lang.String MaritimeCode,
		java.lang.String portRegionCode, java.lang.String portHarbourCode,
		java.lang.String PortWharfNameVN) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDongBoDmPortWharfMethodKey25,
				ClpSerializer.translateInput(MaritimeCode),
				ClpSerializer.translateInput(portRegionCode),
				ClpSerializer.translateInput(portHarbourCode),
				ClpSerializer.translateInput(PortWharfNameVN));

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

	public vn.gt.dao.danhmuc.model.DmPortWharf getFirstPortWharf() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getFirstPortWharfMethodKey26);

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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.danhmuc.model.DmPortWharf getLastPortWharf() {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getLastPortWharfMethodKey27);

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

		return (vn.gt.dao.danhmuc.model.DmPortWharf)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addDmPortWharfMethodKey0;
	private MethodKey _createDmPortWharfMethodKey1;
	private MethodKey _deleteDmPortWharfMethodKey2;
	private MethodKey _deleteDmPortWharfMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchDmPortWharfMethodKey8;
	private MethodKey _getDmPortWharfMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getDmPortWharfsMethodKey11;
	private MethodKey _getDmPortWharfsCountMethodKey12;
	private MethodKey _updateDmPortWharfMethodKey13;
	private MethodKey _updateDmPortWharfMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _getByPortWharfCodeMethodKey17;
	private MethodKey _findByPortRegionCodeMethodKey18;
	private MethodKey _findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCodeMethodKey19;
	private MethodKey _findByPortHarbourCodeOrNullMethodKey20;
	private MethodKey _findByPortRegionCodeOrderPortCodeMethodKey21;
	private MethodKey _findDanhSachDmPortWharfMethodKey22;
	private MethodKey _countDanhSachDmPortWharfMethodKey23;
	private MethodKey _findDongBoDmPortWharfMethodKey24;
	private MethodKey _countDongBoDmPortWharfMethodKey25;
	private MethodKey _getFirstPortWharfMethodKey26;
	private MethodKey _getLastPortWharfMethodKey27;
}