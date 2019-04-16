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
public class ResultDeclarationLocalServiceClp
	implements ResultDeclarationLocalService {
	public ResultDeclarationLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addResultDeclarationMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addResultDeclaration",
				vn.gt.dao.result.model.ResultDeclaration.class);

		_createResultDeclarationMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createResultDeclaration", long.class);

		_deleteResultDeclarationMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteResultDeclaration", long.class);

		_deleteResultDeclarationMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteResultDeclaration",
				vn.gt.dao.result.model.ResultDeclaration.class);

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

		_fetchResultDeclarationMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchResultDeclaration", long.class);

		_getResultDeclarationMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getResultDeclaration", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getResultDeclarationsMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getResultDeclarations", int.class, int.class);

		_getResultDeclarationsCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getResultDeclarationsCount");

		_updateResultDeclarationMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateResultDeclaration",
				vn.gt.dao.result.model.ResultDeclaration.class);

		_updateResultDeclarationMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateResultDeclaration",
				vn.gt.dao.result.model.ResultDeclaration.class, boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findResultDeclarationByBusinessTypeCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findResultDeclarationByBusinessTypeCode", int.class);

		_findByDocumentNameAndBusinessTypeCodeAndDocumentYearMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentNameAndBusinessTypeCodeAndDocumentYear",
				int.class, long.class, int.class);

		_DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
				int.class, long.class, int.class, java.lang.String.class);

		_findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
				int.class, long.class, int.class, java.lang.String.class);

		_FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode",
				int.class, long.class, int.class, java.lang.String.class);

		_findByDocumentNameAndDocumentYearMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentNameAndDocumentYear", long.class, int.class);

		_findByDocumentNameAndDocumentYearOrderByBusinessOrderMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentNameAndDocumentYearOrderByBusinessOrder",
				long.class, int.class);

		_findResultDeclarationByDocumentNameAndDocumentYearNcQcReportMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
				"findResultDeclarationByDocumentNameAndDocumentYearNcQcReport",
				long.class, int.class);

		_findResultDeclarationByDocumentNameAndDocumentYearXcReportMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
				"findResultDeclarationByDocumentNameAndDocumentYearXcReport",
				long.class, int.class);

		_findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieuMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
				"findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu",
				long.class, int.class);

		_findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieuMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
				"findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu",
				long.class, int.class);

		_countByRequestCodeMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByRequestCode", java.lang.String.class);

		_findByRequestCodeMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByRequestCode", java.lang.String.class);

		_countByDocumentNameAndBusinessTypeCodeAndDocumentYearMethodKey30 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentNameAndBusinessTypeCodeAndDocumentYear",
				int.class, long.class, int.class);

		_countByDocumentNameAndDocumentYearMethodKey31 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByDocumentNameAndDocumentYear", long.class, int.class);

		_countByRequestCodeAndBusinessTypeCodeMethodKey32 = new MethodKey(_classLoaderProxy.getClassName(),
				"countByRequestCodeAndBusinessTypeCode",
				java.lang.String.class, int.class);

		_findByRequestCodeAndBusinessTypeCodeMethodKey33 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByRequestCodeAndBusinessTypeCode", java.lang.String.class,
				int.class);
	}

	public vn.gt.dao.result.model.ResultDeclaration addResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addResultDeclarationMethodKey0,
				ClpSerializer.translateInput(resultDeclaration));

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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultDeclaration createResultDeclaration(
		long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createResultDeclarationMethodKey1,
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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteResultDeclaration(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteResultDeclarationMethodKey2,
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

	public void deleteResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteResultDeclarationMethodKey3,
				ClpSerializer.translateInput(resultDeclaration));

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

	public vn.gt.dao.result.model.ResultDeclaration fetchResultDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchResultDeclarationMethodKey8,
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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultDeclaration getResultDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getResultDeclarationMethodKey9,
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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> getResultDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getResultDeclarationsMethodKey11,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public int getResultDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getResultDeclarationsCountMethodKey12);

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

	public vn.gt.dao.result.model.ResultDeclaration updateResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateResultDeclarationMethodKey13,
				ClpSerializer.translateInput(resultDeclaration));

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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultDeclaration updateResultDeclaration(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateResultDeclarationMethodKey14,
				ClpSerializer.translateInput(resultDeclaration), merge);

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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByBusinessTypeCode(
		int businessTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findResultDeclarationByBusinessTypeCodeMethodKey17,
				businessTypeCode);

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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentNameAndBusinessTypeCodeAndDocumentYearMethodKey18,
				businessTypeCode, documentName, documentYear);

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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey19,
				businessTypeCode, documentName, documentYear,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultDeclaration findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey20,
				businessTypeCode, documentName, documentYear,
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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCode(
		int businessTypeCode, long documentName, int documentYear,
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey21,
				businessTypeCode, documentName, documentYear,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYear(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentNameAndDocumentYearMethodKey22,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByDocumentNameAndDocumentYearOrderByBusinessOrder(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentNameAndDocumentYearOrderByBusinessOrderMethodKey23,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findResultDeclarationByDocumentNameAndDocumentYearNcQcReportMethodKey24,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearXcReport(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findResultDeclarationByDocumentNameAndDocumentYearXcReportMethodKey25,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieuMethodKey26,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieu(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieuMethodKey27,
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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public int countByRequestCode(java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByRequestCodeMethodKey28,
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

		return ((Integer)returnObj).intValue();
	}

	public vn.gt.dao.result.model.ResultDeclaration findByRequestCode(
		java.lang.String requestCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByRequestCodeMethodKey29,
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

		return (vn.gt.dao.result.model.ResultDeclaration)ClpSerializer.translateOutput(returnObj);
	}

	public int countByDocumentNameAndBusinessTypeCodeAndDocumentYear(
		int businessTypeCode, long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDocumentNameAndBusinessTypeCodeAndDocumentYearMethodKey30,
				businessTypeCode, documentName, documentYear);

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

		MethodHandler methodHandler = new MethodHandler(_countByDocumentNameAndDocumentYearMethodKey31,
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

	public int countByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByRequestCodeAndBusinessTypeCodeMethodKey32,
				ClpSerializer.translateInput(requestCode), businessTypeCode);

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

	public java.util.List<vn.gt.dao.result.model.ResultDeclaration> findByRequestCodeAndBusinessTypeCode(
		java.lang.String requestCode, int businessTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByRequestCodeAndBusinessTypeCodeMethodKey33,
				ClpSerializer.translateInput(requestCode), businessTypeCode);

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

		return (java.util.List<vn.gt.dao.result.model.ResultDeclaration>)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addResultDeclarationMethodKey0;
	private MethodKey _createResultDeclarationMethodKey1;
	private MethodKey _deleteResultDeclarationMethodKey2;
	private MethodKey _deleteResultDeclarationMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchResultDeclarationMethodKey8;
	private MethodKey _getResultDeclarationMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getResultDeclarationsMethodKey11;
	private MethodKey _getResultDeclarationsCountMethodKey12;
	private MethodKey _updateResultDeclarationMethodKey13;
	private MethodKey _updateResultDeclarationMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findResultDeclarationByBusinessTypeCodeMethodKey17;
	private MethodKey _findByDocumentNameAndBusinessTypeCodeAndDocumentYearMethodKey18;
	private MethodKey _DocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey19;
	private MethodKey _findbyDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey20;
	private MethodKey _FindByDocumentNameAndBusinessTypeCodeAndDocumentYearRequestCodeMethodKey21;
	private MethodKey _findByDocumentNameAndDocumentYearMethodKey22;
	private MethodKey _findByDocumentNameAndDocumentYearOrderByBusinessOrderMethodKey23;
	private MethodKey _findResultDeclarationByDocumentNameAndDocumentYearNcQcReportMethodKey24;
	private MethodKey _findResultDeclarationByDocumentNameAndDocumentYearXcReportMethodKey25;
	private MethodKey _findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieuMethodKey26;
	private MethodKey _findResultDeclarationByDocumentNameAndDocumentYearQCDoiChieuMethodKey27;
	private MethodKey _countByRequestCodeMethodKey28;
	private MethodKey _findByRequestCodeMethodKey29;
	private MethodKey _countByDocumentNameAndBusinessTypeCodeAndDocumentYearMethodKey30;
	private MethodKey _countByDocumentNameAndDocumentYearMethodKey31;
	private MethodKey _countByRequestCodeAndBusinessTypeCodeMethodKey32;
	private MethodKey _findByRequestCodeAndBusinessTypeCodeMethodKey33;
}