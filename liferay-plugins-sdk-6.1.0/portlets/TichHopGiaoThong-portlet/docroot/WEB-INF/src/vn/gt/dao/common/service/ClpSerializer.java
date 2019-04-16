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

package vn.gt.dao.common.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.gt.dao.common.model.LogMessageValidationClp;
import vn.gt.dao.common.model.UserPortClp;
import vn.gt.dao.common.model.UserSignClp;

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

		if (oldModelClassName.equals(LogMessageValidationClp.class.getName())) {
			return translateInputLogMessageValidation(oldModel);
		}

		if (oldModelClassName.equals(UserPortClp.class.getName())) {
			return translateInputUserPort(oldModel);
		}

		if (oldModelClassName.equals(UserSignClp.class.getName())) {
			return translateInputUserSign(oldModel);
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

	public static Object translateInputLogMessageValidation(
		BaseModel<?> oldModel) {
		LogMessageValidationClp oldCplModel = (LogMessageValidationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.common.model.impl.LogMessageValidationImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRequestCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getRequestCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setRequestDirection",
						new Class[] { String.class });

				String value2 = oldCplModel.getRequestDirection();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRequestDate",
						new Class[] { Date.class });

				Date value3 = oldCplModel.getRequestDate();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value4 = new Long(oldCplModel.getDocumentName());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getDocumentYear());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value6 = oldCplModel.getDocumentType();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setTagProperty",
						new Class[] { String.class });

				String value7 = oldCplModel.getTagProperty();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setDataValidation",
						new Class[] { String.class });

				String value8 = oldCplModel.getDataValidation();

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

	public static Object translateInputUserPort(BaseModel<?> oldModel) {
		UserPortClp oldCplModel = (UserPortClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.common.model.impl.UserPortImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setUserId",
						new Class[] { Long.TYPE });

				Long value2 = new Long(oldCplModel.getUserId());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setCreateDate",
						new Class[] { Date.class });

				Date value3 = oldCplModel.getCreateDate();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setStatus",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getStatus());

				method4.invoke(newModel, value4);

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

	public static Object translateInputUserSign(BaseModel<?> oldModel) {
		UserSignClp oldCplModel = (UserSignClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.common.model.impl.UserSignImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setUserId",
						new Class[] { Long.TYPE });

				Long value1 = new Long(oldCplModel.getUserId());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setTitle",
						new Class[] { String.class });

				String value3 = oldCplModel.getTitle();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRepresentative",
						new Class[] { String.class });

				String value4 = oldCplModel.getRepresentative();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setFileChuKyId",
						new Class[] { Long.TYPE });

				Long value5 = new Long(oldCplModel.getFileChuKyId());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setFileConDauId",
						new Class[] { Long.TYPE });

				Long value6 = new Long(oldCplModel.getFileConDauId());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFileChungThuSoId",
						new Class[] { Long.TYPE });

				Long value7 = new Long(oldCplModel.getFileChungThuSoId());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setModifyUser",
						new Class[] { String.class });

				String value8 = oldCplModel.getModifyUser();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setModifyDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getModifyDate();

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
					"vn.gt.dao.common.model.impl.LogMessageValidationImpl")) {
			return translateOutputLogMessageValidation(oldModel);
		}

		if (oldModelClassName.equals("vn.gt.dao.common.model.impl.UserPortImpl")) {
			return translateOutputUserPort(oldModel);
		}

		if (oldModelClassName.equals("vn.gt.dao.common.model.impl.UserSignImpl")) {
			return translateOutputUserSign(oldModel);
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

	public static Object translateOutputLogMessageValidation(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				LogMessageValidationClp newModel = new LogMessageValidationClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getRequestDirection");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setRequestDirection(value2);

				Method method3 = oldModelClass.getMethod("getRequestDate");

				Date value3 = (Date)method3.invoke(oldModel, (Object[])null);

				newModel.setRequestDate(value3);

				Method method4 = oldModelClass.getMethod("getDocumentName");

				Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value4);

				Method method5 = oldModelClass.getMethod("getDocumentYear");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value5);

				Method method6 = oldModelClass.getMethod("getDocumentType");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value6);

				Method method7 = oldModelClass.getMethod("getTagProperty");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setTagProperty(value7);

				Method method8 = oldModelClass.getMethod("getDataValidation");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setDataValidation(value8);

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

	public static Object translateOutputUserPort(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				UserPortClp newModel = new UserPortClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value1);

				Method method2 = oldModelClass.getMethod("getUserId");

				Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

				newModel.setUserId(value2);

				Method method3 = oldModelClass.getMethod("getCreateDate");

				Date value3 = (Date)method3.invoke(oldModel, (Object[])null);

				newModel.setCreateDate(value3);

				Method method4 = oldModelClass.getMethod("getStatus");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setStatus(value4);

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

	public static Object translateOutputUserSign(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				UserSignClp newModel = new UserSignClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getUserId");

				Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

				newModel.setUserId(value1);

				Method method2 = oldModelClass.getMethod("getPortCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value2);

				Method method3 = oldModelClass.getMethod("getTitle");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setTitle(value3);

				Method method4 = oldModelClass.getMethod("getRepresentative");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setRepresentative(value4);

				Method method5 = oldModelClass.getMethod("getFileChuKyId");

				Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

				newModel.setFileChuKyId(value5);

				Method method6 = oldModelClass.getMethod("getFileConDauId");

				Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

				newModel.setFileConDauId(value6);

				Method method7 = oldModelClass.getMethod("getFileChungThuSoId");

				Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

				newModel.setFileChungThuSoId(value7);

				Method method8 = oldModelClass.getMethod("getModifyUser");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setModifyUser(value8);

				Method method9 = oldModelClass.getMethod("getModifyDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setModifyDate(value9);

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