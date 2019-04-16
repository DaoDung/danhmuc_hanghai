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

package vn.gt.dao.result.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author win_64
 */
public class TempDebitNoteLocalServiceClp implements TempDebitNoteLocalService {
	public TempDebitNoteLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addTempDebitNoteMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addTempDebitNote", vn.gt.dao.result.model.TempDebitNote.class);

		_createTempDebitNoteMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createTempDebitNote", long.class);

		_deleteTempDebitNoteMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteTempDebitNote", long.class);

		_deleteTempDebitNoteMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteTempDebitNote",
				vn.gt.dao.result.model.TempDebitNote.class);

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

		_fetchTempDebitNoteMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchTempDebitNote", long.class);

		_getTempDebitNoteMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempDebitNote", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getTempDebitNotesMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempDebitNotes", int.class, int.class);

		_getTempDebitNotesCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getTempDebitNotesCount");

		_updateTempDebitNoteMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateTempDebitNote",
				vn.gt.dao.result.model.TempDebitNote.class);

		_updateTempDebitNoteMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateTempDebitNote",
				vn.gt.dao.result.model.TempDebitNote.class, boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_doTempDebitNoteMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"doTempDebitNote", long.class, int.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class,
				java.util.Date.class, int.class, java.lang.String.class,
				int.class, java.lang.String.class, java.util.Date.class,
				java.util.Date.class, double.class, java.lang.String.class,
				java.lang.String.class, java.lang.String.class);

		_findByMarkasdeletedSearchMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByMarkasdeletedSearch", int.class, int.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String[].class, int.class, int.class);

		_countByMarkasdeletedSearchMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByMarkasdeletedSearch", int.class, int.class,
				java.lang.String.class, java.lang.String.class,
				java.lang.String[].class);

		_findByMarkasdeletedMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByMarkasdeleted", int.class, int.class,
				java.lang.String[].class, int.class, int.class);

		_countByMarkasdeletedMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByMarkasdeleted", int.class, int.class,
				java.lang.String[].class);

		_findByMarkasdeletedAllMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByMarkasdeletedAll", int.class, int.class, int.class);

		_countByMarkasdeletedAllMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByMarkasdeletedAll", int.class);

		_findByDocumentNameAnddocumentYearMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentNameAnddocumentYear", long.class, int.class);

		_getByNumberDebitMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"getByNumberDebit", java.lang.String.class);

		_getDebitNoteByTransactionIdMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"getDebitNoteByTransactionId", java.lang.String.class);
	}

	public vn.gt.dao.result.model.TempDebitNote addTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTempDebitNoteMethodKey0,
				ClpSerializer.translateInput(tempDebitNote));

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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.TempDebitNote createTempDebitNote(long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createTempDebitNoteMethodKey1,
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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTempDebitNoteMethodKey2,
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

	public void deleteTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteTempDebitNoteMethodKey3,
				ClpSerializer.translateInput(tempDebitNote));

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

	public vn.gt.dao.result.model.TempDebitNote fetchTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchTempDebitNoteMethodKey8,
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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.TempDebitNote getTempDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempDebitNoteMethodKey9,
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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> getTempDebitNotes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempDebitNotesMethodKey11,
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

		return (java.util.List<vn.gt.dao.result.model.TempDebitNote>)ClpSerializer.translateOutput(returnObj);
	}

	public int getTempDebitNotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTempDebitNotesCountMethodKey12);

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

	public vn.gt.dao.result.model.TempDebitNote updateTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTempDebitNoteMethodKey13,
				ClpSerializer.translateInput(tempDebitNote));

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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.TempDebitNote updateTempDebitNote(
		vn.gt.dao.result.model.TempDebitNote tempDebitNote, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateTempDebitNoteMethodKey14,
				ClpSerializer.translateInput(tempDebitNote), merge);

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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
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

	public vn.gt.dao.result.model.TempDebitNote doTempDebitNote(
		long documentName, int documentYear, java.lang.String corporationid,
		java.lang.String debitnotenumber, java.lang.String division,
		java.lang.String financialaccountant, java.util.Date fromdate,
		int markasdeleted, java.lang.String organization, int paymenttype,
		java.lang.String reportby, java.util.Date reportdate,
		java.util.Date todate, double totalpayment,
		java.lang.String transactionid, java.lang.String mariTimeCode,
		java.lang.String currency) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_doTempDebitNoteMethodKey17,
				documentName, documentYear,
				ClpSerializer.translateInput(corporationid),
				ClpSerializer.translateInput(debitnotenumber),
				ClpSerializer.translateInput(division),
				ClpSerializer.translateInput(financialaccountant),
				ClpSerializer.translateInput(fromdate), markasdeleted,
				ClpSerializer.translateInput(organization), paymenttype,
				ClpSerializer.translateInput(reportby),
				ClpSerializer.translateInput(reportdate),
				ClpSerializer.translateInput(todate), totalpayment,
				ClpSerializer.translateInput(transactionid),
				ClpSerializer.translateInput(mariTimeCode),
				ClpSerializer.translateInput(currency));

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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedSearch(
		int mariTimeCode, int markasdeleted, java.lang.String documentName,
		java.lang.String debitnotenumber, java.lang.String[] documentTypeCode,
		int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByMarkasdeletedSearchMethodKey18,
				mariTimeCode, markasdeleted,
				ClpSerializer.translateInput(documentName),
				ClpSerializer.translateInput(debitnotenumber),
				ClpSerializer.translateInput(documentTypeCode), start, end);

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

		return (java.util.List<vn.gt.dao.result.model.TempDebitNote>)ClpSerializer.translateOutput(returnObj);
	}

	public long countByMarkasdeletedSearch(int mariTimeCode, int markasdeleted,
		java.lang.String documentName, java.lang.String debitnotenumber,
		java.lang.String[] documentTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByMarkasdeletedSearchMethodKey19,
				mariTimeCode, markasdeleted,
				ClpSerializer.translateInput(documentName),
				ClpSerializer.translateInput(debitnotenumber),
				ClpSerializer.translateInput(documentTypeCode));

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

		return ((Long)returnObj).longValue();
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeleted(
		int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCode, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByMarkasdeletedMethodKey20,
				markasdeleted, mariTimeCode,
				ClpSerializer.translateInput(documentTypeCode), start, end);

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

		return (java.util.List<vn.gt.dao.result.model.TempDebitNote>)ClpSerializer.translateOutput(returnObj);
	}

	public long countByMarkasdeleted(int markasdeleted, int mariTimeCode,
		java.lang.String[] documentTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByMarkasdeletedMethodKey21,
				markasdeleted, mariTimeCode,
				ClpSerializer.translateInput(documentTypeCode));

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

		return ((Long)returnObj).longValue();
	}

	public java.util.List<vn.gt.dao.result.model.TempDebitNote> findByMarkasdeletedAll(
		int markasdeleted, int start, int end) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByMarkasdeletedAllMethodKey22,
				markasdeleted, start, end);

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

		return (java.util.List<vn.gt.dao.result.model.TempDebitNote>)ClpSerializer.translateOutput(returnObj);
	}

	public long countByMarkasdeletedAll(int markasdeleted) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByMarkasdeletedAllMethodKey23,
				markasdeleted);

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

		return ((Long)returnObj).longValue();
	}

	public vn.gt.dao.result.model.TempDebitNote findByDocumentNameAnddocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentNameAnddocumentYearMethodKey24,
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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.TempDebitNote getByNumberDebit(
		java.lang.String debitnotenumber) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByNumberDebitMethodKey25,
				ClpSerializer.translateInput(debitnotenumber));

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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.TempDebitNote getDebitNoteByTransactionId(
		java.lang.String transactionId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDebitNoteByTransactionIdMethodKey26,
				ClpSerializer.translateInput(transactionId));

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

		return (vn.gt.dao.result.model.TempDebitNote)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTempDebitNoteMethodKey0;
	private MethodKey _createTempDebitNoteMethodKey1;
	private MethodKey _deleteTempDebitNoteMethodKey2;
	private MethodKey _deleteTempDebitNoteMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchTempDebitNoteMethodKey8;
	private MethodKey _getTempDebitNoteMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getTempDebitNotesMethodKey11;
	private MethodKey _getTempDebitNotesCountMethodKey12;
	private MethodKey _updateTempDebitNoteMethodKey13;
	private MethodKey _updateTempDebitNoteMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _doTempDebitNoteMethodKey17;
	private MethodKey _findByMarkasdeletedSearchMethodKey18;
	private MethodKey _countByMarkasdeletedSearchMethodKey19;
	private MethodKey _findByMarkasdeletedMethodKey20;
	private MethodKey _countByMarkasdeletedMethodKey21;
	private MethodKey _findByMarkasdeletedAllMethodKey22;
	private MethodKey _countByMarkasdeletedAllMethodKey23;
	private MethodKey _findByDocumentNameAnddocumentYearMethodKey24;
	private MethodKey _getByNumberDebitMethodKey25;
	private MethodKey _getDebitNoteByTransactionIdMethodKey26;
}