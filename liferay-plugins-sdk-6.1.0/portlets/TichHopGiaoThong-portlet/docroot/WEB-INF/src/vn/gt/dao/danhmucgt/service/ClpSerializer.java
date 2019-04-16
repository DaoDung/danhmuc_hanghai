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

package vn.gt.dao.danhmucgt.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.gt.dao.danhmucgt.model.DmCertificateClp;
import vn.gt.dao.danhmucgt.model.DmGTBusinessTypeClp;
import vn.gt.dao.danhmucgt.model.DmGTFunctionTypeClp;
import vn.gt.dao.danhmucgt.model.DmGTShipPositionClp;
import vn.gt.dao.danhmucgt.model.DmGtOrganizationClp;
import vn.gt.dao.danhmucgt.model.DmGtReportCategoryClp;
import vn.gt.dao.danhmucgt.model.DmGtReportTemplateClp;
import vn.gt.dao.danhmucgt.model.DmGtRouteConfigClp;
import vn.gt.dao.danhmucgt.model.DmGtStatusClp;
import vn.gt.dao.danhmucgt.model.DmGtVersionClp;
import vn.gt.dao.danhmucgt.model.DmHistoryMinistryClp;
import vn.gt.dao.danhmucgt.model.DmMinistryClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"TichHopGiaoThong-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"TichHopGiaoThong-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "TichHopGiaoThong-portlet";
			}

			return _servletContextName;
		}
	}

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(DmCertificateClp.class.getName())) {
			return translateInputDmCertificate(oldModel);
		}

		if (oldModelClassName.equals(DmGTBusinessTypeClp.class.getName())) {
			return translateInputDmGTBusinessType(oldModel);
		}

		if (oldModelClassName.equals(DmGTFunctionTypeClp.class.getName())) {
			return translateInputDmGTFunctionType(oldModel);
		}

		if (oldModelClassName.equals(DmGtOrganizationClp.class.getName())) {
			return translateInputDmGtOrganization(oldModel);
		}

		if (oldModelClassName.equals(DmGtReportCategoryClp.class.getName())) {
			return translateInputDmGtReportCategory(oldModel);
		}

		if (oldModelClassName.equals(DmGtReportTemplateClp.class.getName())) {
			return translateInputDmGtReportTemplate(oldModel);
		}

		if (oldModelClassName.equals(DmGtRouteConfigClp.class.getName())) {
			return translateInputDmGtRouteConfig(oldModel);
		}

		if (oldModelClassName.equals(DmGTShipPositionClp.class.getName())) {
			return translateInputDmGTShipPosition(oldModel);
		}

		if (oldModelClassName.equals(DmGtStatusClp.class.getName())) {
			return translateInputDmGtStatus(oldModel);
		}

		if (oldModelClassName.equals(DmGtVersionClp.class.getName())) {
			return translateInputDmGtVersion(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryMinistryClp.class.getName())) {
			return translateInputDmHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(DmMinistryClp.class.getName())) {
			return translateInputDmMinistry(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputDmCertificate(BaseModel<?> oldModel) {
		DmCertificateClp oldCplModel = (DmCertificateClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmCertificateImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setCertificateCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getCertificateCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setCertificateName",
						new Class[] { String.class });

				String value2 = oldCplModel.getCertificateName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setCertificateNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getCertificateNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setCertificateOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getCertificateOrder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGTBusinessType(BaseModel<?> oldModel) {
		DmGTBusinessTypeClp oldCplModel = (DmGTBusinessTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGTBusinessTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setBusinessTypeCode",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getBusinessTypeCode());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setBusinessTypeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getBusinessTypeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setBusinessTypeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getBusinessTypeNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setBusinessTypeOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getBusinessTypeOrder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value10 = oldCplModel.getRemarks();

				method10.invoke(newModel, value10);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGTFunctionType(BaseModel<?> oldModel) {
		DmGTFunctionTypeClp oldCplModel = (DmGTFunctionTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGTFunctionTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setFunctionTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getFunctionTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setFunctionTypeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getFunctionTypeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setFunctionTypeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getFunctionTypeNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setFunctionTypeOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getFunctionTypeOrder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGtOrganization(BaseModel<?> oldModel) {
		DmGtOrganizationClp oldCplModel = (DmGtOrganizationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGtOrganizationImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getOrganizationCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setOrganizationName",
						new Class[] { String.class });

				String value2 = oldCplModel.getOrganizationName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setOrganizationNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getOrganizationNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setOrganizationorder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getOrganizationorder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGtReportCategory(BaseModel<?> oldModel) {
		DmGtReportCategoryClp oldCplModel = (DmGtReportCategoryClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGtReportCategoryImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setCategory",
						new Class[] { String.class });

				String value1 = oldCplModel.getCategory();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setCategoryName",
						new Class[] { String.class });

				String value2 = oldCplModel.getCategoryName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setCategoryOrder",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getCategoryOrder());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getIsDelete());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getMarkedAsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getModifiedDate();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getRequestedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value8 = oldCplModel.getSyncVersion();

				method8.invoke(newModel, value8);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGtReportTemplate(BaseModel<?> oldModel) {
		DmGtReportTemplateClp oldCplModel = (DmGtReportTemplateClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGtReportTemplateImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setReportCode",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getReportCode());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setReportName",
						new Class[] { String.class });

				String value2 = oldCplModel.getReportName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setReportType",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getReportType());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setCategory",
						new Class[] { String.class });

				String value4 = oldCplModel.getCategory();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value5 = oldCplModel.getDescription();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getIsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getMarkedAsDelete());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getModifiedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getRequestedDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value10 = oldCplModel.getSyncVersion();

				method10.invoke(newModel, value10);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGtRouteConfig(BaseModel<?> oldModel) {
		DmGtRouteConfigClp oldCplModel = (DmGtRouteConfigClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRouteCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getRouteCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getOrganizationCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setLocCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getLocCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setIpName",
						new Class[] { String.class });

				String value4 = oldCplModel.getIpName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortName",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortName();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setLinkAddress",
						new Class[] { String.class });

				String value6 = oldCplModel.getLinkAddress();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getIsDelete());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getMarkedAsDelete());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getModifiedDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value10 = oldCplModel.getRequestedDate();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value11 = oldCplModel.getSyncVersion();

				method11.invoke(newModel, value11);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGTShipPosition(BaseModel<?> oldModel) {
		DmGTShipPositionClp oldCplModel = (DmGTShipPositionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGTShipPositionImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPositionCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPositionCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPositionName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPositionName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value3 = oldCplModel.getRemarks();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPositionOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPositionOrder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGtStatus(BaseModel<?> oldModel) {
		DmGtStatusClp oldCplModel = (DmGtStatusClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGtStatusImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setStatusCode",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getStatusCode());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setStatusName",
						new Class[] { String.class });

				String value2 = oldCplModel.getStatusName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setType",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getType());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value4 = oldCplModel.getDescription();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmGtVersion(BaseModel<?> oldModel) {
		DmGtVersionClp oldCplModel = (DmGtVersionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmGtVersionImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setVersionName",
						new Class[] { String.class });

				String value1 = oldCplModel.getVersionName();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setVersionDate",
						new Class[] { Date.class });

				Date value2 = oldCplModel.getVersionDate();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setVersionDeployer",
						new Class[] { String.class });

				String value3 = oldCplModel.getVersionDeployer();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setContents",
						new Class[] { String.class });

				String value4 = oldCplModel.getContents();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value5 = oldCplModel.getDescription();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setDbFileName",
						new Class[] { String.class });

				String value6 = oldCplModel.getDbFileName();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDbFileSize",
						new Class[] { String.class });

				String value7 = oldCplModel.getDbFileSize();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setDbDescription",
						new Class[] { String.class });

				String value8 = oldCplModel.getDbDescription();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setAppFileName",
						new Class[] { String.class });

				String value9 = oldCplModel.getAppFileName();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setAppFileSize",
						new Class[] { String.class });

				String value10 = oldCplModel.getAppFileSize();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setAppDescription",
						new Class[] { String.class });

				String value11 = oldCplModel.getAppDescription();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setSpecFileName",
						new Class[] { String.class });

				String value12 = oldCplModel.getSpecFileName();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSpecFileSize",
						new Class[] { String.class });

				String value13 = oldCplModel.getSpecFileSize();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setSpecDescription",
						new Class[] { String.class });

				String value14 = oldCplModel.getSpecDescription();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value15 = oldCplModel.getOrganizationCode();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getIsDelete());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getMarkedAsDelete());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value18 = oldCplModel.getModifiedDate();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value19 = oldCplModel.getRequestedDate();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value20 = oldCplModel.getSyncVersion();

				method20.invoke(newModel, value20);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmHistoryMinistry(BaseModel<?> oldModel) {
		DmHistoryMinistryClp oldCplModel = (DmHistoryMinistryClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmHistoryMinistryImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setMinistryCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getMinistryCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMinistryName",
						new Class[] { String.class });

				String value2 = oldCplModel.getMinistryName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setMinistryNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getMinistryNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMinistryOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getMinistryOrder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInputDmMinistry(BaseModel<?> oldModel) {
		DmMinistryClp oldCplModel = (DmMinistryClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmucgt.model.impl.DmMinistryImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setMinistryCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getMinistryCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMinistryName",
						new Class[] { String.class });

				String value2 = oldCplModel.getMinistryName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setMinistryNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getMinistryNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMinistryOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getMinistryOrder());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsDelete());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getMarkedAsDelete());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getModifiedDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestedDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value9 = oldCplModel.getSyncVersion();

				method9.invoke(newModel, value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmCertificateImpl")) {
			return translateOutputDmCertificate(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGTBusinessTypeImpl")) {
			return translateOutputDmGTBusinessType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGTFunctionTypeImpl")) {
			return translateOutputDmGTFunctionType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGtOrganizationImpl")) {
			return translateOutputDmGtOrganization(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGtReportCategoryImpl")) {
			return translateOutputDmGtReportCategory(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGtReportTemplateImpl")) {
			return translateOutputDmGtReportTemplate(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigImpl")) {
			return translateOutputDmGtRouteConfig(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGTShipPositionImpl")) {
			return translateOutputDmGTShipPosition(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGtStatusImpl")) {
			return translateOutputDmGtStatus(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmGtVersionImpl")) {
			return translateOutputDmGtVersion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmHistoryMinistryImpl")) {
			return translateOutputDmHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmucgt.model.impl.DmMinistryImpl")) {
			return translateOutputDmMinistry(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutputDmCertificate(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmCertificateClp newModel = new DmCertificateClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getCertificateCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setCertificateCode(value1);

				Method method2 = oldModelClass.getMethod("getCertificateName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCertificateName(value2);

				Method method3 = oldModelClass.getMethod("getCertificateNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setCertificateNameVN(value3);

				Method method4 = oldModelClass.getMethod("getCertificateOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateOrder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGTBusinessType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGTBusinessTypeClp newModel = new DmGTBusinessTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getBusinessTypeCode");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getBusinessTypeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setBusinessTypeName(value2);

				Method method3 = oldModelClass.getMethod(
						"getBusinessTypeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setBusinessTypeNameVN(value3);

				Method method4 = oldModelClass.getMethod("getBusinessTypeOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessTypeOrder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				Method method10 = oldModelClass.getMethod("getRemarks");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value10);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGTFunctionType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGTFunctionTypeClp newModel = new DmGTFunctionTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getFunctionTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setFunctionTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getFunctionTypeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setFunctionTypeName(value2);

				Method method3 = oldModelClass.getMethod(
						"getFunctionTypeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setFunctionTypeNameVN(value3);

				Method method4 = oldModelClass.getMethod("getFunctionTypeOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setFunctionTypeOrder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGtOrganization(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGtOrganizationClp newModel = new DmGtOrganizationClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getOrganizationCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setOrganizationCode(value1);

				Method method2 = oldModelClass.getMethod("getOrganizationName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setOrganizationName(value2);

				Method method3 = oldModelClass.getMethod(
						"getOrganizationNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setOrganizationNameVN(value3);

				Method method4 = oldModelClass.getMethod("getOrganizationorder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setOrganizationorder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGtReportCategory(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGtReportCategoryClp newModel = new DmGtReportCategoryClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getCategory");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setCategory(value1);

				Method method2 = oldModelClass.getMethod("getCategoryName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCategoryName(value2);

				Method method3 = oldModelClass.getMethod("getCategoryOrder");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setCategoryOrder(value3);

				Method method4 = oldModelClass.getMethod("getIsDelete");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value4);

				Method method5 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value5);

				Method method6 = oldModelClass.getMethod("getModifiedDate");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value6);

				Method method7 = oldModelClass.getMethod("getRequestedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value7);

				Method method8 = oldModelClass.getMethod("getSyncVersion");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value8);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGtReportTemplate(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGtReportTemplateClp newModel = new DmGtReportTemplateClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getReportCode");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setReportCode(value1);

				Method method2 = oldModelClass.getMethod("getReportName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setReportName(value2);

				Method method3 = oldModelClass.getMethod("getReportType");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setReportType(value3);

				Method method4 = oldModelClass.getMethod("getCategory");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setCategory(value4);

				Method method5 = oldModelClass.getMethod("getDescription");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setDescription(value5);

				Method method6 = oldModelClass.getMethod("getIsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value6);

				Method method7 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value7);

				Method method8 = oldModelClass.getMethod("getModifiedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value8);

				Method method9 = oldModelClass.getMethod("getRequestedDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value9);

				Method method10 = oldModelClass.getMethod("getSyncVersion");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value10);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGtRouteConfig(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGtRouteConfigClp newModel = new DmGtRouteConfigClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRouteCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRouteCode(value1);

				Method method2 = oldModelClass.getMethod("getOrganizationCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setOrganizationCode(value2);

				Method method3 = oldModelClass.getMethod("getLocCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setLocCode(value3);

				Method method4 = oldModelClass.getMethod("getIpName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setIpName(value4);

				Method method5 = oldModelClass.getMethod("getPortName");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortName(value5);

				Method method6 = oldModelClass.getMethod("getLinkAddress");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setLinkAddress(value6);

				Method method7 = oldModelClass.getMethod("getIsDelete");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value7);

				Method method8 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value8);

				Method method9 = oldModelClass.getMethod("getModifiedDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value9);

				Method method10 = oldModelClass.getMethod("getRequestedDate");

				Date value10 = (Date)method10.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value10);

				Method method11 = oldModelClass.getMethod("getSyncVersion");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value11);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGTShipPosition(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGTShipPositionClp newModel = new DmGTShipPositionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPositionCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPositionCode(value1);

				Method method2 = oldModelClass.getMethod("getPositionName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPositionName(value2);

				Method method3 = oldModelClass.getMethod("getRemarks");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setRemarks(value3);

				Method method4 = oldModelClass.getMethod("getPositionOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPositionOrder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGtStatus(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGtStatusClp newModel = new DmGtStatusClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getStatusCode");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setStatusCode(value1);

				Method method2 = oldModelClass.getMethod("getStatusName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setStatusName(value2);

				Method method3 = oldModelClass.getMethod("getType");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setType(value3);

				Method method4 = oldModelClass.getMethod("getDescription");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setDescription(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmGtVersion(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGtVersionClp newModel = new DmGtVersionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getVersionName");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setVersionName(value1);

				Method method2 = oldModelClass.getMethod("getVersionDate");

				Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

				newModel.setVersionDate(value2);

				Method method3 = oldModelClass.getMethod("getVersionDeployer");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setVersionDeployer(value3);

				Method method4 = oldModelClass.getMethod("getContents");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setContents(value4);

				Method method5 = oldModelClass.getMethod("getDescription");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setDescription(value5);

				Method method6 = oldModelClass.getMethod("getDbFileName");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setDbFileName(value6);

				Method method7 = oldModelClass.getMethod("getDbFileSize");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setDbFileSize(value7);

				Method method8 = oldModelClass.getMethod("getDbDescription");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setDbDescription(value8);

				Method method9 = oldModelClass.getMethod("getAppFileName");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setAppFileName(value9);

				Method method10 = oldModelClass.getMethod("getAppFileSize");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setAppFileSize(value10);

				Method method11 = oldModelClass.getMethod("getAppDescription");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setAppDescription(value11);

				Method method12 = oldModelClass.getMethod("getSpecFileName");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setSpecFileName(value12);

				Method method13 = oldModelClass.getMethod("getSpecFileSize");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSpecFileSize(value13);

				Method method14 = oldModelClass.getMethod("getSpecDescription");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setSpecDescription(value14);

				Method method15 = oldModelClass.getMethod("getOrganizationCode");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setOrganizationCode(value15);

				Method method16 = oldModelClass.getMethod("getIsDelete");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value16);

				Method method17 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value17);

				Method method18 = oldModelClass.getMethod("getModifiedDate");

				Date value18 = (Date)method18.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value18);

				Method method19 = oldModelClass.getMethod("getRequestedDate");

				Date value19 = (Date)method19.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value19);

				Method method20 = oldModelClass.getMethod("getSyncVersion");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value20);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmHistoryMinistry(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryMinistryClp newModel = new DmHistoryMinistryClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getMinistryCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setMinistryCode(value1);

				Method method2 = oldModelClass.getMethod("getMinistryName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMinistryName(value2);

				Method method3 = oldModelClass.getMethod("getMinistryNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setMinistryNameVN(value3);

				Method method4 = oldModelClass.getMethod("getMinistryOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setMinistryOrder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	public static Object translateOutputDmMinistry(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmMinistryClp newModel = new DmMinistryClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getMinistryCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setMinistryCode(value1);

				Method method2 = oldModelClass.getMethod("getMinistryName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMinistryName(value2);

				Method method3 = oldModelClass.getMethod("getMinistryNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setMinistryNameVN(value3);

				Method method4 = oldModelClass.getMethod("getMinistryOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setMinistryOrder(value4);

				Method method5 = oldModelClass.getMethod("getIsDelete");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value5);

				Method method6 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value6);

				Method method7 = oldModelClass.getMethod("getModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value7);

				Method method8 = oldModelClass.getMethod("getRequestedDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value8);

				Method method9 = oldModelClass.getMethod("getSyncVersion");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value9);

				return newModel;
			}
			catch (Exception e) {
				_log.error(e, e);
			}
		}
		finally {
			currentThread.setContextClassLoader(contextClassLoader);
		}

		return oldModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
	private static String _servletContextName;
}