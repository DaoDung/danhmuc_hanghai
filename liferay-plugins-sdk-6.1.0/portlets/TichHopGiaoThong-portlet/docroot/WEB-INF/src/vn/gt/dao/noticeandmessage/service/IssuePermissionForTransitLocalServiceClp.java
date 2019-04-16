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
public class IssuePermissionForTransitLocalServiceClp
	implements IssuePermissionForTransitLocalService {
	public IssuePermissionForTransitLocalServiceClp(
		ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addIssuePermissionForTransitMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addIssuePermissionForTransit",
				vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit.class);

		_createIssuePermissionForTransitMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createIssuePermissionForTransit", long.class);

		_deleteIssuePermissionForTransitMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteIssuePermissionForTransit", long.class);

		_deleteIssuePermissionForTransitMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteIssuePermissionForTransit",
				vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit.class);

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

		_fetchIssuePermissionForTransitMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchIssuePermissionForTransit", long.class);

		_getIssuePermissionForTransitMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssuePermissionForTransit", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getIssuePermissionForTransitsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssuePermissionForTransits", int.class, int.class);

		_getIssuePermissionForTransitsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getIssuePermissionForTransitsCount");

		_updateIssuePermissionForTransitMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateIssuePermissionForTransit",
				vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit.class);

		_updateIssuePermissionForTransitMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateIssuePermissionForTransit",
				vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findIssuePermissionForTransitByDocumentYearAndDocumentYearMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePermissionForTransitByDocumentYearAndDocumentYear",
				long.class, int.class);

		_findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestStateMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState",
				long.class, int.class, int.class);

		_findByrequestCodeMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByrequestCode", java.lang.String.class);

		_getByrequestCodeMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByrequestCode", java.lang.String.class);

		_findBydocumentNameAndDocumentYearMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findBydocumentNameAndDocumentYear", long.class, int.class);

		_findBydocumentNameAndDocumentYearMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findBydocumentNameAndDocumentYear", long.class, int.class,
				int.class, int.class);

		_findIssuePermissionForTransitInfoMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePermissionForTransitInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, int.class, int.class);

		_countIssuePermissionForTransitInfoMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"countIssuePermissionForTransitInfo", java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class);

		_findIssuePermissionForTransitInfoByCertificateNumberMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"findIssuePermissionForTransitInfoByCertificateNumber",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class, int.class,
				int.class);

		_countIssuePermissionForTransitInfoByCertificateNumberMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"countIssuePermissionForTransitInfoByCertificateNumber",
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_countByDocumentNameAndDocumentYearMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentNameAndDocumentYear", long.class, int.class);

		_findByDocumentYearAndDocumentYearOrderByColumnMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentYearAndDocumentYearOrderByColumn", long.class,
				int.class, java.lang.String.class, boolean.class);

		_getByDocumentNameAndDocumentYearAndVersionNoMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByDocumentNameAndDocumentYearAndVersionNo", long.class,
				int.class, java.lang.String.class);

		_capGiayPhepSoMethodKey30 = new MethodKey(_classLoaderProxy.getClassName(),
				"capGiayPhepSo", java.lang.String.class);

		_findByF_LAST_numberPortClearanceMethodKey31 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByF_LAST_numberPortClearance", long.class, int.class,
				java.lang.String.class);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit addIssuePermissionForTransit(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addIssuePermissionForTransitMethodKey0,
				ClpSerializer.translateInput(issuePermissionForTransit));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit createIssuePermissionForTransit(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createIssuePermissionForTransitMethodKey1,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteIssuePermissionForTransit(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteIssuePermissionForTransitMethodKey2,
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

	public void deleteIssuePermissionForTransit(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteIssuePermissionForTransitMethodKey3,
				ClpSerializer.translateInput(issuePermissionForTransit));

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

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit fetchIssuePermissionForTransit(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchIssuePermissionForTransitMethodKey8,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit getIssuePermissionForTransit(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssuePermissionForTransitMethodKey9,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> getIssuePermissionForTransits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssuePermissionForTransitsMethodKey11,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public int getIssuePermissionForTransitsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getIssuePermissionForTransitsCountMethodKey12);

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

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit updateIssuePermissionForTransit(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateIssuePermissionForTransitMethodKey13,
				ClpSerializer.translateInput(issuePermissionForTransit));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit updateIssuePermissionForTransit(
		vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit issuePermissionForTransit,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateIssuePermissionForTransitMethodKey14,
				ClpSerializer.translateInput(issuePermissionForTransit), merge);

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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findIssuePermissionForTransitByDocumentYearAndDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePermissionForTransitByDocumentYearAndDocumentYearMethodKey17,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestState(
		long documentName, int documentYear, int requestState) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestStateMethodKey18,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByrequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByrequestCodeMethodKey19,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit getByrequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByrequestCodeMethodKey20,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findBydocumentNameAndDocumentYearMethodKey21,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findBydocumentNameAndDocumentYear(
		long documentName, int documentYear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findBydocumentNameAndDocumentYearMethodKey22,
				documentName, documentYear, start, end);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findIssuePermissionForTransitInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePermissionForTransitInfoMethodKey23,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public int countIssuePermissionForTransitInfo(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countIssuePermissionForTransitInfoMethodKey24,
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findIssuePermissionForTransitInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findIssuePermissionForTransitInfoByCertificateNumberMethodKey25,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public int countIssuePermissionForTransitInfoByCertificateNumber(
		java.lang.String requestState, java.lang.String maritimeCode,
		java.lang.String portCode, java.lang.String shipName,
		java.lang.String callSign, java.lang.String shipDateFrom,
		java.lang.String shipDateTo, java.lang.String certificateNumber) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countIssuePermissionForTransitInfoByCertificateNumberMethodKey26,
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

	public int countByDocumentNameAndDocumentYear(long documentName,
		int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDocumentNameAndDocumentYearMethodKey27,
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit> findByDocumentYearAndDocumentYearOrderByColumn(
		long documentName, int documentYear, java.lang.String orderByColumn,
		boolean ascOrdesc) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentYearAndDocumentYearOrderByColumnMethodKey28,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit getByDocumentNameAndDocumentYearAndVersionNo(
		long documentName, int documentYear, java.lang.String versionNo) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByDocumentNameAndDocumentYearAndVersionNoMethodKey29,
				documentName, documentYear,
				ClpSerializer.translateInput(versionNo));

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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public java.lang.String capGiayPhepSo(java.lang.String maritimeReference)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_capGiayPhepSoMethodKey30,
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

	public vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit findByF_LAST_numberPortClearance(
		long documentName, int documentYear,
		java.lang.String numberPortClearance) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByF_LAST_numberPortClearanceMethodKey31,
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

		return (vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addIssuePermissionForTransitMethodKey0;
	private MethodKey _createIssuePermissionForTransitMethodKey1;
	private MethodKey _deleteIssuePermissionForTransitMethodKey2;
	private MethodKey _deleteIssuePermissionForTransitMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchIssuePermissionForTransitMethodKey8;
	private MethodKey _getIssuePermissionForTransitMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getIssuePermissionForTransitsMethodKey11;
	private MethodKey _getIssuePermissionForTransitsCountMethodKey12;
	private MethodKey _updateIssuePermissionForTransitMethodKey13;
	private MethodKey _updateIssuePermissionForTransitMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findIssuePermissionForTransitByDocumentYearAndDocumentYearMethodKey17;
	private MethodKey _findIssuePermissionForTransitByDocumentYearAndDocumentYearAndRequestStateMethodKey18;
	private MethodKey _findByrequestCodeMethodKey19;
	private MethodKey _getByrequestCodeMethodKey20;
	private MethodKey _findBydocumentNameAndDocumentYearMethodKey21;
	private MethodKey _findBydocumentNameAndDocumentYearMethodKey22;
	private MethodKey _findIssuePermissionForTransitInfoMethodKey23;
	private MethodKey _countIssuePermissionForTransitInfoMethodKey24;
	private MethodKey _findIssuePermissionForTransitInfoByCertificateNumberMethodKey25;
	private MethodKey _countIssuePermissionForTransitInfoByCertificateNumberMethodKey26;
	private MethodKey _countByDocumentNameAndDocumentYearMethodKey27;
	private MethodKey _findByDocumentYearAndDocumentYearOrderByColumnMethodKey28;
	private MethodKey _getByDocumentNameAndDocumentYearAndVersionNoMethodKey29;
	private MethodKey _capGiayPhepSoMethodKey30;
	private MethodKey _findByF_LAST_numberPortClearanceMethodKey31;
}