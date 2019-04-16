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
public class TempNoTiceShipMessageLocalServiceClp
	implements TempNoTiceShipMessageLocalService {
	public TempNoTiceShipMessageLocalServiceClp(
		ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addTempNoTiceShipMessageMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addTempNoTiceShipMessage",
				vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage.class);

		_createTempNoTiceShipMessageMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createTempNoTiceShipMessage", long.class);

		_deleteTempNoTiceShipMessageMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteTempNoTiceShipMessage", long.class);

		_deleteTempNoTiceShipMessageMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteTempNoTiceShipMessage",
				vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage.class);

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

		_fetchTempNoTiceShipMessageMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchTempNoTiceShipMessage", long.class);

		_getTempNoTiceShipMessageMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempNoTiceShipMessage", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getTempNoTiceShipMessagesMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempNoTiceShipMessages", int.class, int.class);

		_getTempNoTiceShipMessagesCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempNoTiceShipMessagesCount");

		_updateTempNoTiceShipMessageMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateTempNoTiceShipMessage",
				vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage.class);

		_updateTempNoTiceShipMessageMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateTempNoTiceShipMessage",
				vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage.class,
				boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_countBydocumentNameAnddocumentYearMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"countBydocumentNameAnddocumentYear", long.class, int.class);

		_findByRequestCodeMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByRequestCode", java.lang.String.class);

		_findBydocumentNameAnddocumentYearMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findBydocumentNameAnddocumentYear", long.class, int.class);

		_findTempNoTiceShipMessageByRequestCodeMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempNoTiceShipMessageByRequestCode", java.lang.String.class);

		_findTempNoTiceShipMessageXbByRequestCodeMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempNoTiceShipMessageXbByRequestCode",
				java.lang.String.class);

		_findTempNoTiceShipMessageTbByRequestCodeMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findTempNoTiceShipMessageTbByRequestCode",
				java.lang.String.class);

		_findBydocumentNameAndDocumentYearAndNoticeShipTypeMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"findBydocumentNameAndDocumentYearAndNoticeShipType",
				long.class, int.class, java.lang.String.class);

		_findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumnMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn",
				long.class, int.class, java.lang.String.class,
				java.lang.String.class, boolean.class);

		_getXacBaoLastByDocumentNameAndDocumentYearMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"getXacBaoLastByDocumentNameAndDocumentYear", long.class,
				long.class);

		_getThongBaoLastByDocumentNameAndDocumentYearMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"getThongBaoLastByDocumentNameAndDocumentYear", long.class,
				long.class);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage addTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTempNoTiceShipMessageMethodKey0,
				ClpSerializer.translateInput(tempNoTiceShipMessage));

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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage createTempNoTiceShipMessage(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createTempNoTiceShipMessageMethodKey1,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTempNoTiceShipMessage(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTempNoTiceShipMessageMethodKey2,
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

	public void deleteTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTempNoTiceShipMessageMethodKey3,
				ClpSerializer.translateInput(tempNoTiceShipMessage));

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

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage fetchTempNoTiceShipMessage(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchTempNoTiceShipMessageMethodKey8,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getTempNoTiceShipMessage(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempNoTiceShipMessageMethodKey9,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> getTempNoTiceShipMessages(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempNoTiceShipMessagesMethodKey11,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage>)ClpSerializer.translateOutput(returnObj);
	}

	public int getTempNoTiceShipMessagesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempNoTiceShipMessagesCountMethodKey12);

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

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTempNoTiceShipMessageMethodKey13,
				ClpSerializer.translateInput(tempNoTiceShipMessage));

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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage updateTempNoTiceShipMessage(
		vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage tempNoTiceShipMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTempNoTiceShipMessageMethodKey14,
				ClpSerializer.translateInput(tempNoTiceShipMessage), merge);

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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
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

	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countBydocumentNameAnddocumentYearMethodKey17,
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

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByRequestCodeMethodKey18,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findBydocumentNameAnddocumentYearMethodKey19,
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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempNoTiceShipMessageByRequestCodeMethodKey20,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageXbByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempNoTiceShipMessageXbByRequestCodeMethodKey21,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage findTempNoTiceShipMessageTbByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findTempNoTiceShipMessageTbByRequestCodeMethodKey22,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, java.lang.String noticeShipType)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findBydocumentNameAndDocumentYearAndNoticeShipTypeMethodKey23,
				documentName, documentYear,
				ClpSerializer.translateInput(noticeShipType));

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage> findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(
		long documentName, int documentYear, java.lang.String noticeShipType,
		java.lang.String orderByColumn, boolean ascOrdesc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumnMethodKey24,
				documentName, documentYear,
				ClpSerializer.translateInput(noticeShipType),
				ClpSerializer.translateInput(orderByColumn), ascOrdesc);

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

		return (java.util.List<vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getXacBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getXacBaoLastByDocumentNameAndDocumentYearMethodKey25,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage getThongBaoLastByDocumentNameAndDocumentYear(
		long documentName, long documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getThongBaoLastByDocumentNameAndDocumentYearMethodKey26,
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

		return (vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTempNoTiceShipMessageMethodKey0;
	private MethodKey _createTempNoTiceShipMessageMethodKey1;
	private MethodKey _deleteTempNoTiceShipMessageMethodKey2;
	private MethodKey _deleteTempNoTiceShipMessageMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchTempNoTiceShipMessageMethodKey8;
	private MethodKey _getTempNoTiceShipMessageMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getTempNoTiceShipMessagesMethodKey11;
	private MethodKey _getTempNoTiceShipMessagesCountMethodKey12;
	private MethodKey _updateTempNoTiceShipMessageMethodKey13;
	private MethodKey _updateTempNoTiceShipMessageMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _countBydocumentNameAnddocumentYearMethodKey17;
	private MethodKey _findByRequestCodeMethodKey18;
	private MethodKey _findBydocumentNameAnddocumentYearMethodKey19;
	private MethodKey _findTempNoTiceShipMessageByRequestCodeMethodKey20;
	private MethodKey _findTempNoTiceShipMessageXbByRequestCodeMethodKey21;
	private MethodKey _findTempNoTiceShipMessageTbByRequestCodeMethodKey22;
	private MethodKey _findBydocumentNameAndDocumentYearAndNoticeShipTypeMethodKey23;
	private MethodKey _findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumnMethodKey24;
	private MethodKey _getXacBaoLastByDocumentNameAndDocumentYearMethodKey25;
	private MethodKey _getThongBaoLastByDocumentNameAndDocumentYearMethodKey26;
}