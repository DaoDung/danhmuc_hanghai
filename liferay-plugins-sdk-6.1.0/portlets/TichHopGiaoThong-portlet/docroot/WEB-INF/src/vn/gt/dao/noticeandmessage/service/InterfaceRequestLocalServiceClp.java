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

package vn.gt.dao.noticeandmessage.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author win_64
 */
public class InterfaceRequestLocalServiceClp
	implements InterfaceRequestLocalService {
	public InterfaceRequestLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addInterfaceRequestMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addInterfaceRequest",
				vn.gt.dao.noticeandmessage.model.InterfaceRequest.class);

		_createInterfaceRequestMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createInterfaceRequest", long.class);

		_deleteInterfaceRequestMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteInterfaceRequest", long.class);

		_deleteInterfaceRequestMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteInterfaceRequest",
				vn.gt.dao.noticeandmessage.model.InterfaceRequest.class);

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

		_fetchInterfaceRequestMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchInterfaceRequest", long.class);

		_getInterfaceRequestMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getInterfaceRequest", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getInterfaceRequestsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getInterfaceRequests", int.class, int.class);

		_getInterfaceRequestsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getInterfaceRequestsCount");

		_updateInterfaceRequestMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateInterfaceRequest",
				vn.gt.dao.noticeandmessage.model.InterfaceRequest.class);

		_updateInterfaceRequestMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateInterfaceRequest",
				vn.gt.dao.noticeandmessage.model.InterfaceRequest.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findByRequestCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByRequestCode", java.lang.String.class);

		_findInterfaceRequestByRequestCodeMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findInterfaceRequestByRequestCode", java.lang.String.class);

		_getRequestedDateByRequestCodeMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"getRequestedDateByRequestCode", java.lang.String.class);

		_getFunctionTypeByRequestCodeMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"getFunctionTypeByRequestCode", java.lang.String.class);

		_getRemarksByRequestCodeMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"getRemarksByRequestCode", java.lang.String.class);

		_updateInterfaceRequestMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateInterfaceRequest", java.lang.String.class);

		_fetchByF_BY_documentNameRefMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchByF_BY_documentNameRef", java.lang.String.class,
				java.lang.String.class);
	}

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest addInterfaceRequest(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addInterfaceRequestMethodKey0,
				ClpSerializer.translateInput(interfaceRequest));

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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest createInterfaceRequest(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createInterfaceRequestMethodKey1,
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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteInterfaceRequest(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteInterfaceRequestMethodKey2,
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

	public void deleteInterfaceRequest(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteInterfaceRequestMethodKey3,
				ClpSerializer.translateInput(interfaceRequest));

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

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchInterfaceRequest(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchInterfaceRequestMethodKey8,
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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest getInterfaceRequest(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getInterfaceRequestMethodKey9,
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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest> getInterfaceRequests(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getInterfaceRequestsMethodKey11,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.InterfaceRequest>)ClpSerializer.translateOutput(returnObj);
	}

	public int getInterfaceRequestsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getInterfaceRequestsCountMethodKey12);

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

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest updateInterfaceRequest(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateInterfaceRequestMethodKey13,
				ClpSerializer.translateInput(interfaceRequest));

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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest updateInterfaceRequest(
		vn.gt.dao.noticeandmessage.model.InterfaceRequest interfaceRequest,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateInterfaceRequestMethodKey14,
				ClpSerializer.translateInput(interfaceRequest), merge);

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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
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

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByRequestCodeMethodKey17,
				ClpSerializer.translateInput(requestCode));

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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest findInterfaceRequestByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findInterfaceRequestByRequestCodeMethodKey18,
				ClpSerializer.translateInput(requestCode));

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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.Date getRequestedDateByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getRequestedDateByRequestCodeMethodKey19,
				ClpSerializer.translateInput(requestCode));

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

		return (java.util.Date)ClpSerializer.translateOutput(returnObj);
	}

	public java.lang.String getFunctionTypeByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getFunctionTypeByRequestCodeMethodKey20,
				ClpSerializer.translateInput(requestCode));

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

	public java.lang.String getRemarksByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getRemarksByRequestCodeMethodKey21,
				ClpSerializer.translateInput(requestCode));

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

	public int updateInterfaceRequest(java.lang.String sql) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateInterfaceRequestMethodKey22,
				ClpSerializer.translateInput(sql));

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

	public vn.gt.dao.noticeandmessage.model.InterfaceRequest fetchByF_BY_documentNameRef(
		java.lang.String documentNameRef, java.lang.String businessType) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchByF_BY_documentNameRefMethodKey23,
				ClpSerializer.translateInput(documentNameRef),
				ClpSerializer.translateInput(businessType));

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

		return (vn.gt.dao.noticeandmessage.model.InterfaceRequest)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addInterfaceRequestMethodKey0;
	private MethodKey _createInterfaceRequestMethodKey1;
	private MethodKey _deleteInterfaceRequestMethodKey2;
	private MethodKey _deleteInterfaceRequestMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchInterfaceRequestMethodKey8;
	private MethodKey _getInterfaceRequestMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getInterfaceRequestsMethodKey11;
	private MethodKey _getInterfaceRequestsCountMethodKey12;
	private MethodKey _updateInterfaceRequestMethodKey13;
	private MethodKey _updateInterfaceRequestMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findByRequestCodeMethodKey17;
	private MethodKey _findInterfaceRequestByRequestCodeMethodKey18;
	private MethodKey _getRequestedDateByRequestCodeMethodKey19;
	private MethodKey _getFunctionTypeByRequestCodeMethodKey20;
	private MethodKey _getRemarksByRequestCodeMethodKey21;
	private MethodKey _updateInterfaceRequestMethodKey22;
	private MethodKey _fetchByF_BY_documentNameRefMethodKey23;
}