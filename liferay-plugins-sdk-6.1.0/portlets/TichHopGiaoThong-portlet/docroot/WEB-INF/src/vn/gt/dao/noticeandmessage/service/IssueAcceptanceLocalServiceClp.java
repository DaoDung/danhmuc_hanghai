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
public class IssueAcceptanceLocalServiceClp
	implements IssueAcceptanceLocalService {
	public IssueAcceptanceLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addIssueAcceptanceMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addIssueAcceptance",
				vn.gt.dao.noticeandmessage.model.IssueAcceptance.class);

		_createIssueAcceptanceMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createIssueAcceptance", long.class);

		_deleteIssueAcceptanceMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteIssueAcceptance", long.class);

		_deleteIssueAcceptanceMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteIssueAcceptance",
				vn.gt.dao.noticeandmessage.model.IssueAcceptance.class);

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

		_fetchIssueAcceptanceMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchIssueAcceptance", long.class);

		_getIssueAcceptanceMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssueAcceptance", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getIssueAcceptancesMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssueAcceptances", int.class, int.class);

		_getIssueAcceptancesCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssueAcceptancesCount");

		_updateIssueAcceptanceMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateIssueAcceptance",
				vn.gt.dao.noticeandmessage.model.IssueAcceptance.class);

		_updateIssueAcceptanceMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateIssueAcceptance",
				vn.gt.dao.noticeandmessage.model.IssueAcceptance.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_fetchByRequestCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchByRequestCode", java.lang.String.class);

		_findIssueAcceptanceByDocumentYearAndDocumentYearMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssueAcceptanceByDocumentYearAndDocumentYear", long.class,
				int.class);

		_findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestStateMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState",
				long.class, int.class, int.class);

		_countByDocumentYearAndDocumentYearMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentYearAndDocumentYear", long.class, int.class);

		_findIssueAcceptanceByRequestCodeMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssueAcceptanceByRequestCode", java.lang.String.class);

		_findLastestIssueAcceptanceByPortNameAndCallSignMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findLastestIssueAcceptanceByPortNameAndCallSign",
				java.lang.String.class, java.lang.String.class);

		_findByRequestCodeMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByRequestCode", java.lang.String.class);

		_getByRequestCodeMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByRequestCode", java.lang.String.class);

		_findIssueAcceptanceInfoMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssueAcceptanceInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countIssueAcceptanceInfoMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"countIssueAcceptanceInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findByDocumentYearAndDocumentYearOrderByColumnMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentYearAndDocumentYearOrderByColumn", long.class,
				int.class, java.lang.String.class, boolean.class);

		_countByDocumentNameAndDocumentYearMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentNameAndDocumentYear", long.class, int.class);

		_capGiayPhepSoMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
				"capGiayPhepSo", java.lang.String.class);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance addIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addIssueAcceptanceMethodKey0,
				ClpSerializer.translateInput(issueAcceptance));

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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance createIssueAcceptance(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createIssueAcceptanceMethodKey1,
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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteIssueAcceptance(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteIssueAcceptanceMethodKey2,
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

	public void deleteIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteIssueAcceptanceMethodKey3,
				ClpSerializer.translateInput(issueAcceptance));

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

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance fetchIssueAcceptance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchIssueAcceptanceMethodKey8,
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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance getIssueAcceptance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssueAcceptanceMethodKey9,
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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> getIssueAcceptances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssueAcceptancesMethodKey11,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance>)ClpSerializer.translateOutput(returnObj);
	}

	public int getIssueAcceptancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssueAcceptancesCountMethodKey12);

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

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance updateIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateIssueAcceptanceMethodKey13,
				ClpSerializer.translateInput(issueAcceptance));

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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance updateIssueAcceptance(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateIssueAcceptanceMethodKey14,
				ClpSerializer.translateInput(issueAcceptance), merge);

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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
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

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance fetchByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchByRequestCodeMethodKey17,
				ClpSerializer.translateInput(requestCode));

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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssueAcceptanceByDocumentYearAndDocumentYearMethodKey18,
				documentName, documentYear);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestStateMethodKey19,
				documentName, documentYear, requestState);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDocumentYearAndDocumentYearMethodKey20,
				documentName, documentYear);

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

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance findIssueAcceptanceByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssueAcceptanceByRequestCodeMethodKey21,
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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance findLastestIssueAcceptanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findLastestIssueAcceptanceByPortNameAndCallSignMethodKey22,
				ClpSerializer.translateInput(nameOfShip),
				ClpSerializer.translateInput(callSign));

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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance findByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByRequestCodeMethodKey23,
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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance getByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByRequestCodeMethodKey24,
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

		return (vn.gt.dao.noticeandmessage.model.IssueAcceptance)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findIssueAcceptanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssueAcceptanceInfoMethodKey25,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo), start, end);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countIssueAcceptanceInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countIssueAcceptanceInfoMethodKey26,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo));

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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentYearAndDocumentYearOrderByColumnMethodKey27,
				documentName, documentYear,
				ClpSerializer.translateInput(orderByColumn), ascOrdesc);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssueAcceptance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDocumentNameAndDocumentYearMethodKey28,
				documentName, documentYear);

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

	public java.lang.String capGiayPhepSo(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_capGiayPhepSoMethodKey29,
				ClpSerializer.translateInput(maritimeReference));

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

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addIssueAcceptanceMethodKey0;
	private MethodKey _createIssueAcceptanceMethodKey1;
	private MethodKey _deleteIssueAcceptanceMethodKey2;
	private MethodKey _deleteIssueAcceptanceMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchIssueAcceptanceMethodKey8;
	private MethodKey _getIssueAcceptanceMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getIssueAcceptancesMethodKey11;
	private MethodKey _getIssueAcceptancesCountMethodKey12;
	private MethodKey _updateIssueAcceptanceMethodKey13;
	private MethodKey _updateIssueAcceptanceMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _fetchByRequestCodeMethodKey17;
	private MethodKey _findIssueAcceptanceByDocumentYearAndDocumentYearMethodKey18;
	private MethodKey _findIssueAcceptanceByDocumentYearAndDocumentYearAndRequestStateMethodKey19;
	private MethodKey _countByDocumentYearAndDocumentYearMethodKey20;
	private MethodKey _findIssueAcceptanceByRequestCodeMethodKey21;
	private MethodKey _findLastestIssueAcceptanceByPortNameAndCallSignMethodKey22;
	private MethodKey _findByRequestCodeMethodKey23;
	private MethodKey _getByRequestCodeMethodKey24;
	private MethodKey _findIssueAcceptanceInfoMethodKey25;
	private MethodKey _countIssueAcceptanceInfoMethodKey26;
	private MethodKey _findByDocumentYearAndDocumentYearOrderByColumnMethodKey27;
	private MethodKey _countByDocumentNameAndDocumentYearMethodKey28;
	private MethodKey _capGiayPhepSoMethodKey29;
}