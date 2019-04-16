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
public class ResultMinistryLocalServiceClp implements ResultMinistryLocalService {
	public ResultMinistryLocalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;

		_addResultMinistryMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
				"addResultMinistry", vn.gt.dao.result.model.ResultMinistry.class);

		_createResultMinistryMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
				"createResultMinistry", long.class);

		_deleteResultMinistryMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteResultMinistry", long.class);

		_deleteResultMinistryMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
				"deleteResultMinistry",
				vn.gt.dao.result.model.ResultMinistry.class);

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

		_fetchResultMinistryMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
				"fetchResultMinistry", long.class);

		_getResultMinistryMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
				"getResultMinistry", long.class);

		_getPersistedModelMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
				"getPersistedModel", java.io.Serializable.class);

		_getResultMinistriesMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
				"getResultMinistries", int.class, int.class);

		_getResultMinistriesCountMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
				"getResultMinistriesCount");

		_updateResultMinistryMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateResultMinistry",
				vn.gt.dao.result.model.ResultMinistry.class);

		_updateResultMinistryMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
				"updateResultMinistry",
				vn.gt.dao.result.model.ResultMinistry.class, boolean.class);

		_getBeanIdentifierMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
				"getBeanIdentifier");

		_setBeanIdentifierMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
				"setBeanIdentifier", java.lang.String.class);

		_findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCodeMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
				"findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode",
				int.class, int.class, java.lang.String.class, int.class);

		_findDistinctMinistryCodeMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDistinctMinistryCode", long.class, int.class);

		_findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodeMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode",
				long.class, int.class, java.lang.String.class,
				java.lang.String.class);

		_findDocNameAndDocYearAndMinistryCodeMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDocNameAndDocYearAndMinistryCode", int.class, int.class,
				java.lang.String.class);

		_findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoiMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
				"findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoi",
				long.class, int.class, java.lang.String.class,
				java.lang.String.class);
	}

	public vn.gt.dao.result.model.ResultMinistry addResultMinistry(
		vn.gt.dao.result.model.ResultMinistry resultMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addResultMinistryMethodKey0,
				ClpSerializer.translateInput(resultMinistry));

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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultMinistry createResultMinistry(long id) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_createResultMinistryMethodKey1,
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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteResultMinistry(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteResultMinistryMethodKey2,
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

	public void deleteResultMinistry(
		vn.gt.dao.result.model.ResultMinistry resultMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteResultMinistryMethodKey3,
				ClpSerializer.translateInput(resultMinistry));

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

	public vn.gt.dao.result.model.ResultMinistry fetchResultMinistry(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_fetchResultMinistryMethodKey8,
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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultMinistry getResultMinistry(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getResultMinistryMethodKey9,
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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> getResultMinistries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getResultMinistriesMethodKey11,
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

		return (java.util.List<vn.gt.dao.result.model.ResultMinistry>)ClpSerializer.translateOutput(returnObj);
	}

	public int getResultMinistriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getResultMinistriesCountMethodKey12);

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

	public vn.gt.dao.result.model.ResultMinistry updateResultMinistry(
		vn.gt.dao.result.model.ResultMinistry resultMinistry)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateResultMinistryMethodKey13,
				ClpSerializer.translateInput(resultMinistry));

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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultMinistry updateResultMinistry(
		vn.gt.dao.result.model.ResultMinistry resultMinistry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateResultMinistryMethodKey14,
				ClpSerializer.translateInput(resultMinistry), merge);

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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
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

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCode(
		int documentName, int documentYear, java.lang.String ministryCode,
		int businessTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCodeMethodKey17,
				documentName, documentYear,
				ClpSerializer.translateInput(ministryCode), businessTypeCode);

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

		return (java.util.List<vn.gt.dao.result.model.ResultMinistry>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findDistinctMinistryCode(
		long documentName, int documentYear) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDistinctMinistryCodeMethodKey18,
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

		return (java.util.List<vn.gt.dao.result.model.ResultMinistry>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCode(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String businessTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodeMethodKey19,
				documentName, documentYear,
				ClpSerializer.translateInput(ministryCode),
				ClpSerializer.translateInput(businessTypeCode));

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

		return (java.util.List<vn.gt.dao.result.model.ResultMinistry>)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List<vn.gt.dao.result.model.ResultMinistry> findDocNameAndDocYearAndMinistryCode(
		int documentName, int documentYear, java.lang.String ministryCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDocNameAndDocYearAndMinistryCodeMethodKey20,
				documentName, documentYear,
				ClpSerializer.translateInput(ministryCode));

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

		return (java.util.List<vn.gt.dao.result.model.ResultMinistry>)ClpSerializer.translateOutput(returnObj);
	}

	public vn.gt.dao.result.model.ResultMinistry findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoi(
		long documentName, int documentYear, java.lang.String ministryCode,
		java.lang.String lstBusinessTypeCode) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoiMethodKey21,
				documentName, documentYear,
				ClpSerializer.translateInput(ministryCode),
				ClpSerializer.translateInput(lstBusinessTypeCode));

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

		return (vn.gt.dao.result.model.ResultMinistry)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addResultMinistryMethodKey0;
	private MethodKey _createResultMinistryMethodKey1;
	private MethodKey _deleteResultMinistryMethodKey2;
	private MethodKey _deleteResultMinistryMethodKey3;
	private MethodKey _dynamicQueryMethodKey4;
	private MethodKey _dynamicQueryMethodKey5;
	private MethodKey _dynamicQueryMethodKey6;
	private MethodKey _dynamicQueryCountMethodKey7;
	private MethodKey _fetchResultMinistryMethodKey8;
	private MethodKey _getResultMinistryMethodKey9;
	private MethodKey _getPersistedModelMethodKey10;
	private MethodKey _getResultMinistriesMethodKey11;
	private MethodKey _getResultMinistriesCountMethodKey12;
	private MethodKey _updateResultMinistryMethodKey13;
	private MethodKey _updateResultMinistryMethodKey14;
	private MethodKey _getBeanIdentifierMethodKey15;
	private MethodKey _setBeanIdentifierMethodKey16;
	private MethodKey _findByDocumentNameAnddocumentYearMinistryCodeBusinessTypeCodeMethodKey17;
	private MethodKey _findDistinctMinistryCodeMethodKey18;
	private MethodKey _findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodeMethodKey19;
	private MethodKey _findDocNameAndDocYearAndMinistryCodeMethodKey20;
	private MethodKey _findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoiMethodKey21;
}