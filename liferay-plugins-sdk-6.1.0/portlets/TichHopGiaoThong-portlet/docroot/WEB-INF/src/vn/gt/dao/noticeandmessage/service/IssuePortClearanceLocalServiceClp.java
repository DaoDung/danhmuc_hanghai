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
public class IssuePortClearanceLocalServiceClp
	implements IssuePortClearanceLocalService {
	public IssuePortClearanceLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addIssuePortClearanceMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addIssuePortClearance",
				vn.gt.dao.noticeandmessage.model.IssuePortClearance.class);

		_createIssuePortClearanceMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createIssuePortClearance", long.class);

		_deleteIssuePortClearanceMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteIssuePortClearance", long.class);

		_deleteIssuePortClearanceMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteIssuePortClearance",
				vn.gt.dao.noticeandmessage.model.IssuePortClearance.class);

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

		_fetchIssuePortClearanceMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchIssuePortClearance", long.class);

		_getIssuePortClearanceMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssuePortClearance", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getIssuePortClearancesMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssuePortClearances", int.class, int.class);

		_getIssuePortClearancesCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssuePortClearancesCount");

		_updateIssuePortClearanceMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateIssuePortClearance",
				vn.gt.dao.noticeandmessage.model.IssuePortClearance.class);

		_updateIssuePortClearanceMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateIssuePortClearance",
				vn.gt.dao.noticeandmessage.model.IssuePortClearance.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findIssuePortClearanceByDocumentYearAndDocumentYearMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePortClearanceByDocumentYearAndDocumentYear",
				long.class, int.class);

		_findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestStateMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState",
				long.class, int.class, int.class);

		_countByDocumentYearAndDocumentYearMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentYearAndDocumentYear", long.class, int.class);

		_findIssuePortClearanceByRequestCodeMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePortClearanceByRequestCode", java.lang.String.class);

		_findLastestIssuePortClearanceByPortNameAndCallSignMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findLastestIssuePortClearanceByPortNameAndCallSign",
				java.lang.String.class, java.lang.String.class);

		_findLatestCertificateOfIssuePortClearanceMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findLatestCertificateOfIssuePortClearance",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findByRequestCodeMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByRequestCode", java.lang.String.class);

		_getByRequestCodeMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByRequestCode", java.lang.String.class);

		_findIssuePortClearanceInfoMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePortClearanceInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countIssuePortClearanceInfoMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"countIssuePortClearanceInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findIssuePortClearanceInfoByCertificateNumberMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePortClearanceInfoByCertificateNumber",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countIssuePortClearanceInfoByCertificateNumberMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
				"countIssuePortClearanceInfoByCertificateNumber",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findByDocumentYearAndDocumentYearOrderByColumnMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentYearAndDocumentYearOrderByColumn", long.class,
				int.class, java.lang.String.class, boolean.class);

		_countByDocumentNameAndDocumentYearMethodKey30 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentNameAndDocumentYear", long.class, int.class);

		_capGiayPhepSoMethodKey31 = new MethodKey(_classLoaderProxy.getClassName(),
				"capGiayPhepSo", java.lang.String.class);

		_findByF_LAST_numberPortClearanceMethodKey32 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByF_LAST_numberPortClearance", long.class, int.class,
				java.lang.String.class);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance addIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addIssuePortClearanceMethodKey0,
				ClpSerializer.translateInput(issuePortClearance));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance createIssuePortClearance(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createIssuePortClearanceMethodKey1,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteIssuePortClearance(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteIssuePortClearanceMethodKey2,
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

	public void deleteIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteIssuePortClearanceMethodKey3,
				ClpSerializer.translateInput(issuePortClearance));

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

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance fetchIssuePortClearance(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchIssuePortClearanceMethodKey8,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance getIssuePortClearance(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssuePortClearanceMethodKey9,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> getIssuePortClearances(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssuePortClearancesMethodKey11,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public int getIssuePortClearancesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssuePortClearancesCountMethodKey12);

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

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance updateIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateIssuePortClearanceMethodKey13,
				ClpSerializer.translateInput(issuePortClearance));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance updateIssuePortClearance(
		vn.gt.dao.noticeandmessage.model.IssuePortClearance issuePortClearance,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateIssuePortClearanceMethodKey14,
				ClpSerializer.translateInput(issuePortClearance), merge);

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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePortClearanceByDocumentYearAndDocumentYearMethodKey17,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestStateMethodKey18,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countByDocumentYearAndDocumentYear(long documentName,
		int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDocumentYearAndDocumentYearMethodKey19,
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePortClearanceByRequestCodeMethodKey20,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findLastestIssuePortClearanceByPortNameAndCallSign(
		java.lang.String nameOfShip, java.lang.String callSign) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findLastestIssuePortClearanceByPortNameAndCallSignMethodKey21,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findLatestCertificateOfIssuePortClearance(
		java.lang.String nameOfShip, java.lang.String callSign,
		java.lang.String certificateNo) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findLatestCertificateOfIssuePortClearanceMethodKey22,
				ClpSerializer.translateInput(nameOfShip),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(certificateNo));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findByRequestCode(
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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance getByRequestCode(
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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePortClearanceInfoMethodKey25,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo),
				ClpSerializer.translateInput(certificateNumber), start, end);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countIssuePortClearanceInfo(java.lang.String requestState,
		java.lang.String maritimeCode, java.lang.String portCode,
		java.lang.String shipName, java.lang.String callSign,
		java.lang.String shipDateFrom, java.lang.String shipDateTo,
		java.lang.String certificateNumber) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countIssuePortClearanceInfoMethodKey26,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo),
				ClpSerializer.translateInput(certificateNumber));

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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePortClearanceInfoByCertificateNumberMethodKey27,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo),
				ClpSerializer.translateInput(certificateNumber), start, end);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countIssuePortClearanceInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countIssuePortClearanceInfoByCertificateNumberMethodKey28,
				ClpSerializer.translateInput(requestState),
				ClpSerializer.translateInput(maritimeCode),
				ClpSerializer.translateInput(portCode),
				ClpSerializer.translateInput(shipName),
				ClpSerializer.translateInput(callSign),
				ClpSerializer.translateInput(shipDateFrom),
				ClpSerializer.translateInput(shipDateTo),
				ClpSerializer.translateInput(certificateNumber));

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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentYearAndDocumentYearOrderByColumnMethodKey29,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePortClearance>)ClpSerializer.translateOutput(returnObj);
	}

	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDocumentNameAndDocumentYearMethodKey30,
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

		MethodHandler methodHandler = new MethodHandler(_capGiayPhepSoMethodKey31,
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

	public vn.gt.dao.noticeandmessage.model.IssuePortClearance findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPortClearance) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByF_LAST_numberPortClearanceMethodKey32,
				documentName, documentYear,
				ClpSerializer.translateInput(numberPortClearance));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePortClearance)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addIssuePortClearanceMethodKey0;
	private MethodKey _createIssuePortClearanceMethodKey1;
	private MethodKey _deleteIssuePortClearanceMethodKey2;
	private MethodKey _deleteIssuePortClearanceMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchIssuePortClearanceMethodKey8;
	private MethodKey _getIssuePortClearanceMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getIssuePortClearancesMethodKey11;
	private MethodKey _getIssuePortClearancesCountMethodKey12;
	private MethodKey _updateIssuePortClearanceMethodKey13;
	private MethodKey _updateIssuePortClearanceMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findIssuePortClearanceByDocumentYearAndDocumentYearMethodKey17;
	private MethodKey _findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestStateMethodKey18;
	private MethodKey _countByDocumentYearAndDocumentYearMethodKey19;
	private MethodKey _findIssuePortClearanceByRequestCodeMethodKey20;
	private MethodKey _findLastestIssuePortClearanceByPortNameAndCallSignMethodKey21;
	private MethodKey _findLatestCertificateOfIssuePortClearanceMethodKey22;
	private MethodKey _findByRequestCodeMethodKey23;
	private MethodKey _getByRequestCodeMethodKey24;
	private MethodKey _findIssuePortClearanceInfoMethodKey25;
	private MethodKey _countIssuePortClearanceInfoMethodKey26;
	private MethodKey _findIssuePortClearanceInfoByCertificateNumberMethodKey27;
	private MethodKey _countIssuePortClearanceInfoByCertificateNumberMethodKey28;
	private MethodKey _findByDocumentYearAndDocumentYearOrderByColumnMethodKey29;
	private MethodKey _countByDocumentNameAndDocumentYearMethodKey30;
	private MethodKey _capGiayPhepSoMethodKey31;
	private MethodKey _findByF_LAST_numberPortClearanceMethodKey32;
}