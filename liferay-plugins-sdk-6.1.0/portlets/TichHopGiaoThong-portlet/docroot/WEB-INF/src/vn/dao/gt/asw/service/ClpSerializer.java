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

package vn.dao.gt.asw.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.dao.gt.asw.model.AswmsgMessageQueueClp;
import vn.dao.gt.asw.model.MonitorMessageQueueClp;

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

		if (oldModelClassName.equals(AswmsgMessageQueueClp.class.getName())) {
			return translateInputAswmsgMessageQueue(oldModel);
		}

		if (oldModelClassName.equals(MonitorMessageQueueClp.class.getName())) {
			return translateInputMonitorMessageQueue(oldModel);
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

	public static Object translateInputAswmsgMessageQueue(BaseModel<?> oldModel) {
		AswmsgMessageQueueClp oldCplModel = (AswmsgMessageQueueClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.dao.gt.asw.model.impl.AswmsgMessageQueueImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setVersion",
						new Class[] { String.class });

				String value1 = oldCplModel.getVersion();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMessageId",
						new Class[] { String.class });

				String value2 = oldCplModel.getMessageId();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setSenderName",
						new Class[] { String.class });

				String value3 = oldCplModel.getSenderName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setSenderIdentity",
						new Class[] { String.class });

				String value4 = oldCplModel.getSenderIdentity();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setSenderCountryCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getSenderCountryCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSenderMinistryCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getSenderMinistryCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setSenderOrganizationCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getSenderOrganizationCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setSenderUnitCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getSenderUnitCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setReceiverName",
						new Class[] { String.class });

				String value9 = oldCplModel.getReceiverName();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setReceiverIdentity",
						new Class[] { String.class });

				String value10 = oldCplModel.getReceiverIdentity();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setReceiverCountryCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getReceiverCountryCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setReceiverMinistryCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getReceiverMinistryCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setReceiverOrganizationCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getReceiverOrganizationCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setReceiverUnitCode",
						new Class[] { String.class });

				String value14 = oldCplModel.getReceiverUnitCode();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value15 = oldCplModel.getDocumentType();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setType",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getType());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setFunction",
						new Class[] { String.class });

				String value17 = oldCplModel.getFunction();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setReference",
						new Class[] { Long.TYPE });

				Long value18 = new Long(oldCplModel.getReference());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setPreReference",
						new Class[] { Long.TYPE });

				Long value19 = new Long(oldCplModel.getPreReference());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getDocumentYear());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setSendDate",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getSendDate();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setSignature",
						new Class[] { String.class });

				String value22 = oldCplModel.getSignature();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setSystemSignature",
						new Class[] { String.class });

				String value23 = oldCplModel.getSystemSignature();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setAllContent",
						new Class[] { String.class });

				String value24 = oldCplModel.getAllContent();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setCreatedTime",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getCreatedTime();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setWebservice",
						new Class[] { Integer.TYPE });

				Integer value26 = new Integer(oldCplModel.getWebservice());

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setValidated",
						new Class[] { Integer.TYPE });

				Integer value27 = new Integer(oldCplModel.getValidated());

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setPriority",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getPriority());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value29 = oldCplModel.getDescription();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setValidationCode",
						new Class[] { String.class });

				String value30 = oldCplModel.getValidationCode();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setSoLanGui",
						new Class[] { Integer.TYPE });

				Integer value31 = new Integer(oldCplModel.getSoLanGui());

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setHoSoThuTucId",
						new Class[] { Long.TYPE });

				Long value32 = new Long(oldCplModel.getHoSoThuTucId());

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setPhieuXuLyPhuId",
						new Class[] { Long.TYPE });

				Long value33 = new Long(oldCplModel.getPhieuXuLyPhuId());

				method33.invoke(newModel, value33);

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

	public static Object translateInputMonitorMessageQueue(
		BaseModel<?> oldModel) {
		MonitorMessageQueueClp oldCplModel = (MonitorMessageQueueClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.dao.gt.asw.model.impl.MonitorMessageQueueImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setVersion",
						new Class[] { String.class });

				String value1 = oldCplModel.getVersion();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMessageId",
						new Class[] { String.class });

				String value2 = oldCplModel.getMessageId();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setSenderName",
						new Class[] { String.class });

				String value3 = oldCplModel.getSenderName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setSenderIdentity",
						new Class[] { String.class });

				String value4 = oldCplModel.getSenderIdentity();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setSenderCountryCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getSenderCountryCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSenderMinistryCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getSenderMinistryCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setSenderOrganizationCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getSenderOrganizationCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setSenderUnitCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getSenderUnitCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setReceiverName",
						new Class[] { String.class });

				String value9 = oldCplModel.getReceiverName();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setReceiverIdentity",
						new Class[] { String.class });

				String value10 = oldCplModel.getReceiverIdentity();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setReceiverCountryCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getReceiverCountryCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setReceiverMinistryCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getReceiverMinistryCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setReceiverOrganizationCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getReceiverOrganizationCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setReceiverUnitCode",
						new Class[] { String.class });

				String value14 = oldCplModel.getReceiverUnitCode();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value15 = oldCplModel.getDocumentType();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setType",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getType());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setFunction",
						new Class[] { String.class });

				String value17 = oldCplModel.getFunction();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setReference",
						new Class[] { Long.TYPE });

				Long value18 = new Long(oldCplModel.getReference());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setPreReference",
						new Class[] { Long.TYPE });

				Long value19 = new Long(oldCplModel.getPreReference());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getDocumentYear());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setSendDate",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getSendDate();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setCreatedTime",
						new Class[] { Date.class });

				Date value22 = oldCplModel.getCreatedTime();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setWebservice",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getWebservice());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setValidated",
						new Class[] { Integer.TYPE });

				Integer value24 = new Integer(oldCplModel.getValidated());

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setPriority",
						new Class[] { Integer.TYPE });

				Integer value25 = new Integer(oldCplModel.getPriority());

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value26 = oldCplModel.getDescription();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setValidationCode",
						new Class[] { String.class });

				String value27 = oldCplModel.getValidationCode();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setSoLanGui",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getSoLanGui());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setHoSoThuTucId",
						new Class[] { Long.TYPE });

				Long value29 = new Long(oldCplModel.getHoSoThuTucId());

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setPhieuXuLyPhuId",
						new Class[] { Long.TYPE });

				Long value30 = new Long(oldCplModel.getPhieuXuLyPhuId());

				method30.invoke(newModel, value30);

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
					"vn.dao.gt.asw.model.impl.AswmsgMessageQueueImpl")) {
			return translateOutputAswmsgMessageQueue(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.dao.gt.asw.model.impl.MonitorMessageQueueImpl")) {
			return translateOutputMonitorMessageQueue(oldModel);
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

	public static Object translateOutputAswmsgMessageQueue(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				AswmsgMessageQueueClp newModel = new AswmsgMessageQueueClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getVersion");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setVersion(value1);

				Method method2 = oldModelClass.getMethod("getMessageId");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMessageId(value2);

				Method method3 = oldModelClass.getMethod("getSenderName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setSenderName(value3);

				Method method4 = oldModelClass.getMethod("getSenderIdentity");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setSenderIdentity(value4);

				Method method5 = oldModelClass.getMethod("getSenderCountryCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setSenderCountryCode(value5);

				Method method6 = oldModelClass.getMethod(
						"getSenderMinistryCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setSenderMinistryCode(value6);

				Method method7 = oldModelClass.getMethod(
						"getSenderOrganizationCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setSenderOrganizationCode(value7);

				Method method8 = oldModelClass.getMethod("getSenderUnitCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setSenderUnitCode(value8);

				Method method9 = oldModelClass.getMethod("getReceiverName");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setReceiverName(value9);

				Method method10 = oldModelClass.getMethod("getReceiverIdentity");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverIdentity(value10);

				Method method11 = oldModelClass.getMethod(
						"getReceiverCountryCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverCountryCode(value11);

				Method method12 = oldModelClass.getMethod(
						"getReceiverMinistryCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverMinistryCode(value12);

				Method method13 = oldModelClass.getMethod(
						"getReceiverOrganizationCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverOrganizationCode(value13);

				Method method14 = oldModelClass.getMethod("getReceiverUnitCode");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverUnitCode(value14);

				Method method15 = oldModelClass.getMethod("getDocumentType");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentType(value15);

				Method method16 = oldModelClass.getMethod("getType");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setType(value16);

				Method method17 = oldModelClass.getMethod("getFunction");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setFunction(value17);

				Method method18 = oldModelClass.getMethod("getReference");

				Long value18 = (Long)method18.invoke(oldModel, (Object[])null);

				newModel.setReference(value18);

				Method method19 = oldModelClass.getMethod("getPreReference");

				Long value19 = (Long)method19.invoke(oldModel, (Object[])null);

				newModel.setPreReference(value19);

				Method method20 = oldModelClass.getMethod("getDocumentYear");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value20);

				Method method21 = oldModelClass.getMethod("getSendDate");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setSendDate(value21);

				Method method22 = oldModelClass.getMethod("getSignature");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setSignature(value22);

				Method method23 = oldModelClass.getMethod("getSystemSignature");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setSystemSignature(value23);

				Method method24 = oldModelClass.getMethod("getAllContent");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setAllContent(value24);

				Method method25 = oldModelClass.getMethod("getCreatedTime");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setCreatedTime(value25);

				Method method26 = oldModelClass.getMethod("getWebservice");

				Integer value26 = (Integer)method26.invoke(oldModel,
						(Object[])null);

				newModel.setWebservice(value26);

				Method method27 = oldModelClass.getMethod("getValidated");

				Integer value27 = (Integer)method27.invoke(oldModel,
						(Object[])null);

				newModel.setValidated(value27);

				Method method28 = oldModelClass.getMethod("getPriority");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setPriority(value28);

				Method method29 = oldModelClass.getMethod("getDescription");

				String value29 = (String)method29.invoke(oldModel,
						(Object[])null);

				newModel.setDescription(value29);

				Method method30 = oldModelClass.getMethod("getValidationCode");

				String value30 = (String)method30.invoke(oldModel,
						(Object[])null);

				newModel.setValidationCode(value30);

				Method method31 = oldModelClass.getMethod("getSoLanGui");

				Integer value31 = (Integer)method31.invoke(oldModel,
						(Object[])null);

				newModel.setSoLanGui(value31);

				Method method32 = oldModelClass.getMethod("getHoSoThuTucId");

				Long value32 = (Long)method32.invoke(oldModel, (Object[])null);

				newModel.setHoSoThuTucId(value32);

				Method method33 = oldModelClass.getMethod("getPhieuXuLyPhuId");

				Long value33 = (Long)method33.invoke(oldModel, (Object[])null);

				newModel.setPhieuXuLyPhuId(value33);

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

	public static Object translateOutputMonitorMessageQueue(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				MonitorMessageQueueClp newModel = new MonitorMessageQueueClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getVersion");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setVersion(value1);

				Method method2 = oldModelClass.getMethod("getMessageId");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMessageId(value2);

				Method method3 = oldModelClass.getMethod("getSenderName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setSenderName(value3);

				Method method4 = oldModelClass.getMethod("getSenderIdentity");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setSenderIdentity(value4);

				Method method5 = oldModelClass.getMethod("getSenderCountryCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setSenderCountryCode(value5);

				Method method6 = oldModelClass.getMethod(
						"getSenderMinistryCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setSenderMinistryCode(value6);

				Method method7 = oldModelClass.getMethod(
						"getSenderOrganizationCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setSenderOrganizationCode(value7);

				Method method8 = oldModelClass.getMethod("getSenderUnitCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setSenderUnitCode(value8);

				Method method9 = oldModelClass.getMethod("getReceiverName");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setReceiverName(value9);

				Method method10 = oldModelClass.getMethod("getReceiverIdentity");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverIdentity(value10);

				Method method11 = oldModelClass.getMethod(
						"getReceiverCountryCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverCountryCode(value11);

				Method method12 = oldModelClass.getMethod(
						"getReceiverMinistryCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverMinistryCode(value12);

				Method method13 = oldModelClass.getMethod(
						"getReceiverOrganizationCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverOrganizationCode(value13);

				Method method14 = oldModelClass.getMethod("getReceiverUnitCode");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverUnitCode(value14);

				Method method15 = oldModelClass.getMethod("getDocumentType");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentType(value15);

				Method method16 = oldModelClass.getMethod("getType");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setType(value16);

				Method method17 = oldModelClass.getMethod("getFunction");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setFunction(value17);

				Method method18 = oldModelClass.getMethod("getReference");

				Long value18 = (Long)method18.invoke(oldModel, (Object[])null);

				newModel.setReference(value18);

				Method method19 = oldModelClass.getMethod("getPreReference");

				Long value19 = (Long)method19.invoke(oldModel, (Object[])null);

				newModel.setPreReference(value19);

				Method method20 = oldModelClass.getMethod("getDocumentYear");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value20);

				Method method21 = oldModelClass.getMethod("getSendDate");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setSendDate(value21);

				Method method22 = oldModelClass.getMethod("getCreatedTime");

				Date value22 = (Date)method22.invoke(oldModel, (Object[])null);

				newModel.setCreatedTime(value22);

				Method method23 = oldModelClass.getMethod("getWebservice");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setWebservice(value23);

				Method method24 = oldModelClass.getMethod("getValidated");

				Integer value24 = (Integer)method24.invoke(oldModel,
						(Object[])null);

				newModel.setValidated(value24);

				Method method25 = oldModelClass.getMethod("getPriority");

				Integer value25 = (Integer)method25.invoke(oldModel,
						(Object[])null);

				newModel.setPriority(value25);

				Method method26 = oldModelClass.getMethod("getDescription");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setDescription(value26);

				Method method27 = oldModelClass.getMethod("getValidationCode");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setValidationCode(value27);

				Method method28 = oldModelClass.getMethod("getSoLanGui");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setSoLanGui(value28);

				Method method29 = oldModelClass.getMethod("getHoSoThuTucId");

				Long value29 = (Long)method29.invoke(oldModel, (Object[])null);

				newModel.setHoSoThuTucId(value29);

				Method method30 = oldModelClass.getMethod("getPhieuXuLyPhuId");

				Long value30 = (Long)method30.invoke(oldModel, (Object[])null);

				newModel.setPhieuXuLyPhuId(value30);

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