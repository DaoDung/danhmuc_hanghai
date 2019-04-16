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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.gt.dao.result.model.ResultCertificateClp;
import vn.gt.dao.result.model.ResultCompetionClp;
import vn.gt.dao.result.model.ResultDeclarationClp;
import vn.gt.dao.result.model.ResultHistoryMinistryClp;
import vn.gt.dao.result.model.ResultMinistryClp;
import vn.gt.dao.result.model.ResultNotificationClp;
import vn.gt.dao.result.model.TempDebitNoteClp;

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

		if (oldModelClassName.equals(ResultCertificateClp.class.getName())) {
			return translateInputResultCertificate(oldModel);
		}

		if (oldModelClassName.equals(ResultCompetionClp.class.getName())) {
			return translateInputResultCompetion(oldModel);
		}

		if (oldModelClassName.equals(ResultDeclarationClp.class.getName())) {
			return translateInputResultDeclaration(oldModel);
		}

		if (oldModelClassName.equals(ResultHistoryMinistryClp.class.getName())) {
			return translateInputResultHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(ResultMinistryClp.class.getName())) {
			return translateInputResultMinistry(oldModel);
		}

		if (oldModelClassName.equals(ResultNotificationClp.class.getName())) {
			return translateInputResultNotification(oldModel);
		}

		if (oldModelClassName.equals(TempDebitNoteClp.class.getName())) {
			return translateInputTempDebitNote(oldModel);
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

	public static Object translateInputResultCertificate(BaseModel<?> oldModel) {
		ResultCertificateClp oldCplModel = (ResultCertificateClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.ResultCertificateImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value1 = new Long(oldCplModel.getDocumentName());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getDocumentYear());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getMaritimeCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setCertificateCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getCertificateCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setCertificateOrder",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getCertificateOrder());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCertificateNo",
						new Class[] { String.class });

				String value6 = oldCplModel.getCertificateNo();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setCertificateIssueDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getCertificateIssueDate();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setCertificateExpiredDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getCertificateExpiredDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setExaminationDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getExaminationDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value10 = oldCplModel.getDescription();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setComment",
						new Class[] { String.class });

				String value11 = oldCplModel.getComment();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setApprovalName",
						new Class[] { String.class });

				String value12 = oldCplModel.getApprovalName();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setIsExamined",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getIsExamined());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setMandatory",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getMandatory());

				method14.invoke(newModel, value14);

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

	public static Object translateInputResultCompetion(BaseModel<?> oldModel) {
		ResultCompetionClp oldCplModel = (ResultCompetionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.ResultCompetionImpl",
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

				Method method2 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getRequestState());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value5 = oldCplModel.getNameOfShip();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getFlagStateOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value7 = oldCplModel.getNameOfMaster();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setGrossTonnage",
						new Class[] { Double.TYPE });

				Double value8 = new Double(oldCplModel.getGrossTonnage());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPortOfArrivalCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getPortOfArrivalCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getMaritimeCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setDivision",
						new Class[] { String.class });

				String value11 = oldCplModel.getDivision();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setApprovalName",
						new Class[] { String.class });

				String value12 = oldCplModel.getApprovalName();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setApprovalTime",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getApprovalTime();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setCertificateNo",
						new Class[] { String.class });

				String value14 = oldCplModel.getCertificateNo();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setResponseStatusHQ",
						new Class[] { Integer.TYPE });

				Integer value15 = new Integer(oldCplModel.getResponseStatusHQ());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setResponseStatusBP",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getResponseStatusBP());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setResponseStatusYT",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getResponseStatusYT());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setResponseStatusDV",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getResponseStatusDV());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setResponseStatusTV",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getResponseStatusTV());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setResponseStatusCVHH",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getResponseStatusCVHH());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setResponseTimeHQ",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getResponseTimeHQ();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setResponseTimeBP",
						new Class[] { Date.class });

				Date value22 = oldCplModel.getResponseTimeBP();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setResponseTimeYT",
						new Class[] { Date.class });

				Date value23 = oldCplModel.getResponseTimeYT();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setResponseTimeDV",
						new Class[] { Date.class });

				Date value24 = oldCplModel.getResponseTimeDV();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setResponseTimeTV",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getResponseTimeTV();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setResponseTimeCVHH",
						new Class[] { Date.class });

				Date value26 = oldCplModel.getResponseTimeCVHH();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setResponseHQ",
						new Class[] { String.class });

				String value27 = oldCplModel.getResponseHQ();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setResponseBP",
						new Class[] { String.class });

				String value28 = oldCplModel.getResponseBP();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setResponseYT",
						new Class[] { String.class });

				String value29 = oldCplModel.getResponseYT();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setResponseDV",
						new Class[] { String.class });

				String value30 = oldCplModel.getResponseDV();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setResponseTV",
						new Class[] { String.class });

				String value31 = oldCplModel.getResponseTV();

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setResponseCVHH",
						new Class[] { String.class });

				String value32 = oldCplModel.getResponseCVHH();

				method32.invoke(newModel, value32);

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

	public static Object translateInputResultDeclaration(BaseModel<?> oldModel) {
		ResultDeclarationClp oldCplModel = (ResultDeclarationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.ResultDeclarationImpl",
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

				Method method2 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getRequestState());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setBusinessOrder",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getBusinessOrder());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setBusinessTypeCode",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getBusinessTypeCode());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setLatestSend",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getLatestSend());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setDeclarationTime",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getDeclarationTime();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setArrivalDepartureTime",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getArrivalDepartureTime();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setRemainingTime",
						new Class[] { String.class });

				String value10 = oldCplModel.getRemainingTime();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value11 = oldCplModel.getRemarks();

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

	public static Object translateInputResultHistoryMinistry(
		BaseModel<?> oldModel) {
		ResultHistoryMinistryClp oldCplModel = (ResultHistoryMinistryClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.ResultHistoryMinistryImpl",
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

				Method method2 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getRequestState());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setMinistryCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getMinistryCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setOrganization",
						new Class[] { String.class });

				String value6 = oldCplModel.getOrganization();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDivision",
						new Class[] { String.class });

				String value7 = oldCplModel.getDivision();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setOfficerName",
						new Class[] { String.class });

				String value8 = oldCplModel.getOfficerName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setLatestDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getLatestDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setBusinessTypeCode",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getBusinessTypeCode());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setResponse",
						new Class[] { String.class });

				String value11 = oldCplModel.getResponse();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value12 = oldCplModel.getRemarks();

				method12.invoke(newModel, value12);

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

	public static Object translateInputResultMinistry(BaseModel<?> oldModel) {
		ResultMinistryClp oldCplModel = (ResultMinistryClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.ResultMinistryImpl",
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

				Method method2 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getRequestState());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setMinistryCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getMinistryCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setOrganization",
						new Class[] { String.class });

				String value6 = oldCplModel.getOrganization();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDivision",
						new Class[] { String.class });

				String value7 = oldCplModel.getDivision();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setOfficerName",
						new Class[] { String.class });

				String value8 = oldCplModel.getOfficerName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setLatestDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getLatestDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setBusinessTypeCode",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getBusinessTypeCode());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setResponse",
						new Class[] { String.class });

				String value11 = oldCplModel.getResponse();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value12 = oldCplModel.getRemarks();

				method12.invoke(newModel, value12);

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

	public static Object translateInputResultNotification(BaseModel<?> oldModel) {
		ResultNotificationClp oldCplModel = (ResultNotificationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.ResultNotificationImpl",
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

				Method method2 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getRequestState());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getMaritimeCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRole",
						new Class[] { Long.TYPE });

				Long value6 = new Long(oldCplModel.getRole());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setResponse",
						new Class[] { String.class });

				String value7 = oldCplModel.getResponse();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setOrganization",
						new Class[] { String.class });

				String value8 = oldCplModel.getOrganization();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDivision",
						new Class[] { String.class });

				String value9 = oldCplModel.getDivision();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setOfficerName",
						new Class[] { String.class });

				String value10 = oldCplModel.getOfficerName();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setLatestDate",
						new Class[] { String.class });

				String value11 = oldCplModel.getLatestDate();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setBusinessTypeCode",
						new Class[] { Integer.TYPE });

				Integer value12 = new Integer(oldCplModel.getBusinessTypeCode());

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value13 = oldCplModel.getRemarks();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setIsReply",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getIsReply());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setResponseTime",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getResponseTime();

				method15.invoke(newModel, value15);

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

	public static Object translateInputTempDebitNote(BaseModel<?> oldModel) {
		TempDebitNoteClp oldCplModel = (TempDebitNoteClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.result.model.impl.TempDebitNoteImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setATTACHEDFILE",
						new Class[] { Long.TYPE });

				Long value1 = new Long(oldCplModel.getATTACHEDFILE());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setCorporationid",
						new Class[] { String.class });

				String value2 = oldCplModel.getCorporationid();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDebitnotenumber",
						new Class[] { String.class });

				String value3 = oldCplModel.getDebitnotenumber();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDivision",
						new Class[] { String.class });

				String value4 = oldCplModel.getDivision();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value5 = new Long(oldCplModel.getDocumentName());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getDocumentYear());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFinancialaccountant",
						new Class[] { String.class });

				String value7 = oldCplModel.getFinancialaccountant();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setFromdate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getFromdate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setMarkasdeleted",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getMarkasdeleted());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setOrganization",
						new Class[] { String.class });

				String value10 = oldCplModel.getOrganization();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setPaymenttype",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getPaymenttype());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setReportby",
						new Class[] { String.class });

				String value12 = oldCplModel.getReportby();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setReportdate",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getReportdate();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setTodate",
						new Class[] { Date.class });

				Date value14 = oldCplModel.getTodate();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setTotalpayment",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getTotalpayment());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setTransactionid",
						new Class[] { String.class });

				String value16 = oldCplModel.getTransactionid();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setMariTimeCode",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getMariTimeCode());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setComments",
						new Class[] { String.class });

				String value18 = oldCplModel.getComments();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setDocumentTypeCode",
						new Class[] { String.class });

				String value19 = oldCplModel.getDocumentTypeCode();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setKeypayGoodCode",
						new Class[] { String.class });

				String value20 = oldCplModel.getKeypayGoodCode();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setKeypayMerchantCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getKeypayMerchantCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setPaymentGateStatusCode",
						new Class[] { String.class });

				String value22 = oldCplModel.getPaymentGateStatusCode();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setPaymentGateResponseData",
						new Class[] { String.class });

				String value23 = oldCplModel.getPaymentGateResponseData();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setPaymentGateCheckCode",
						new Class[] { Integer.TYPE });

				Integer value24 = new Integer(oldCplModel.getPaymentGateCheckCode());

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setPaymentGateCheckResponseData",
						new Class[] { String.class });

				String value25 = oldCplModel.getPaymentGateCheckResponseData();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setKeypayURL",
						new Class[] { String.class });

				String value26 = oldCplModel.getKeypayURL();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setCurrency",
						new Class[] { String.class });

				String value27 = oldCplModel.getCurrency();

				method27.invoke(newModel, value27);

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
					"vn.gt.dao.result.model.impl.ResultCertificateImpl")) {
			return translateOutputResultCertificate(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.result.model.impl.ResultCompetionImpl")) {
			return translateOutputResultCompetion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.result.model.impl.ResultDeclarationImpl")) {
			return translateOutputResultDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.result.model.impl.ResultHistoryMinistryImpl")) {
			return translateOutputResultHistoryMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.result.model.impl.ResultMinistryImpl")) {
			return translateOutputResultMinistry(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.result.model.impl.ResultNotificationImpl")) {
			return translateOutputResultNotification(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.result.model.impl.TempDebitNoteImpl")) {
			return translateOutputTempDebitNote(oldModel);
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

	public static Object translateOutputResultCertificate(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResultCertificateClp newModel = new ResultCertificateClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getDocumentName");

				Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value1);

				Method method2 = oldModelClass.getMethod("getDocumentYear");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value2);

				Method method3 = oldModelClass.getMethod("getMaritimeCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value3);

				Method method4 = oldModelClass.getMethod("getCertificateCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setCertificateCode(value4);

				Method method5 = oldModelClass.getMethod("getCertificateOrder");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateOrder(value5);

				Method method6 = oldModelClass.getMethod("getCertificateNo");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setCertificateNo(value6);

				Method method7 = oldModelClass.getMethod(
						"getCertificateIssueDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setCertificateIssueDate(value7);

				Method method8 = oldModelClass.getMethod(
						"getCertificateExpiredDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setCertificateExpiredDate(value8);

				Method method9 = oldModelClass.getMethod("getExaminationDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setExaminationDate(value9);

				Method method10 = oldModelClass.getMethod("getDescription");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setDescription(value10);

				Method method11 = oldModelClass.getMethod("getComment");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setComment(value11);

				Method method12 = oldModelClass.getMethod("getApprovalName");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setApprovalName(value12);

				Method method13 = oldModelClass.getMethod("getIsExamined");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setIsExamined(value13);

				Method method14 = oldModelClass.getMethod("getMandatory");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setMandatory(value14);

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

	public static Object translateOutputResultCompetion(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResultCompetionClp newModel = new ResultCompetionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getRequestState");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getNameOfShip");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value5);

				Method method6 = oldModelClass.getMethod("getFlagStateOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value6);

				Method method7 = oldModelClass.getMethod("getNameOfMaster");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNameOfMaster(value7);

				Method method8 = oldModelClass.getMethod("getGrossTonnage");

				Double value8 = (Double)method8.invoke(oldModel, (Object[])null);

				newModel.setGrossTonnage(value8);

				Method method9 = oldModelClass.getMethod("getPortOfArrivalCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setPortOfArrivalCode(value9);

				Method method10 = oldModelClass.getMethod("getMaritimeCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimeCode(value10);

				Method method11 = oldModelClass.getMethod("getDivision");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setDivision(value11);

				Method method12 = oldModelClass.getMethod("getApprovalName");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setApprovalName(value12);

				Method method13 = oldModelClass.getMethod("getApprovalTime");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setApprovalTime(value13);

				Method method14 = oldModelClass.getMethod("getCertificateNo");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateNo(value14);

				Method method15 = oldModelClass.getMethod("getResponseStatusHQ");

				Integer value15 = (Integer)method15.invoke(oldModel,
						(Object[])null);

				newModel.setResponseStatusHQ(value15);

				Method method16 = oldModelClass.getMethod("getResponseStatusBP");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setResponseStatusBP(value16);

				Method method17 = oldModelClass.getMethod("getResponseStatusYT");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setResponseStatusYT(value17);

				Method method18 = oldModelClass.getMethod("getResponseStatusDV");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setResponseStatusDV(value18);

				Method method19 = oldModelClass.getMethod("getResponseStatusTV");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setResponseStatusTV(value19);

				Method method20 = oldModelClass.getMethod(
						"getResponseStatusCVHH");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setResponseStatusCVHH(value20);

				Method method21 = oldModelClass.getMethod("getResponseTimeHQ");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setResponseTimeHQ(value21);

				Method method22 = oldModelClass.getMethod("getResponseTimeBP");

				Date value22 = (Date)method22.invoke(oldModel, (Object[])null);

				newModel.setResponseTimeBP(value22);

				Method method23 = oldModelClass.getMethod("getResponseTimeYT");

				Date value23 = (Date)method23.invoke(oldModel, (Object[])null);

				newModel.setResponseTimeYT(value23);

				Method method24 = oldModelClass.getMethod("getResponseTimeDV");

				Date value24 = (Date)method24.invoke(oldModel, (Object[])null);

				newModel.setResponseTimeDV(value24);

				Method method25 = oldModelClass.getMethod("getResponseTimeTV");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setResponseTimeTV(value25);

				Method method26 = oldModelClass.getMethod("getResponseTimeCVHH");

				Date value26 = (Date)method26.invoke(oldModel, (Object[])null);

				newModel.setResponseTimeCVHH(value26);

				Method method27 = oldModelClass.getMethod("getResponseHQ");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setResponseHQ(value27);

				Method method28 = oldModelClass.getMethod("getResponseBP");

				String value28 = (String)method28.invoke(oldModel,
						(Object[])null);

				newModel.setResponseBP(value28);

				Method method29 = oldModelClass.getMethod("getResponseYT");

				String value29 = (String)method29.invoke(oldModel,
						(Object[])null);

				newModel.setResponseYT(value29);

				Method method30 = oldModelClass.getMethod("getResponseDV");

				String value30 = (String)method30.invoke(oldModel,
						(Object[])null);

				newModel.setResponseDV(value30);

				Method method31 = oldModelClass.getMethod("getResponseTV");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setResponseTV(value31);

				Method method32 = oldModelClass.getMethod("getResponseCVHH");

				String value32 = (String)method32.invoke(oldModel,
						(Object[])null);

				newModel.setResponseCVHH(value32);

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

	public static Object translateOutputResultDeclaration(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResultDeclarationClp newModel = new ResultDeclarationClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getRequestState");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getBusinessOrder");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessOrder(value5);

				Method method6 = oldModelClass.getMethod("getBusinessTypeCode");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessTypeCode(value6);

				Method method7 = oldModelClass.getMethod("getLatestSend");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setLatestSend(value7);

				Method method8 = oldModelClass.getMethod("getDeclarationTime");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setDeclarationTime(value8);

				Method method9 = oldModelClass.getMethod(
						"getArrivalDepartureTime");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setArrivalDepartureTime(value9);

				Method method10 = oldModelClass.getMethod("getRemainingTime");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setRemainingTime(value10);

				Method method11 = oldModelClass.getMethod("getRemarks");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value11);

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

	public static Object translateOutputResultHistoryMinistry(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResultHistoryMinistryClp newModel = new ResultHistoryMinistryClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getRequestState");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getMinistryCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setMinistryCode(value5);

				Method method6 = oldModelClass.getMethod("getOrganization");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setOrganization(value6);

				Method method7 = oldModelClass.getMethod("getDivision");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setDivision(value7);

				Method method8 = oldModelClass.getMethod("getOfficerName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setOfficerName(value8);

				Method method9 = oldModelClass.getMethod("getLatestDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setLatestDate(value9);

				Method method10 = oldModelClass.getMethod("getBusinessTypeCode");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessTypeCode(value10);

				Method method11 = oldModelClass.getMethod("getResponse");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setResponse(value11);

				Method method12 = oldModelClass.getMethod("getRemarks");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value12);

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

	public static Object translateOutputResultMinistry(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResultMinistryClp newModel = new ResultMinistryClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getRequestState");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getMinistryCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setMinistryCode(value5);

				Method method6 = oldModelClass.getMethod("getOrganization");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setOrganization(value6);

				Method method7 = oldModelClass.getMethod("getDivision");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setDivision(value7);

				Method method8 = oldModelClass.getMethod("getOfficerName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setOfficerName(value8);

				Method method9 = oldModelClass.getMethod("getLatestDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setLatestDate(value9);

				Method method10 = oldModelClass.getMethod("getBusinessTypeCode");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessTypeCode(value10);

				Method method11 = oldModelClass.getMethod("getResponse");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setResponse(value11);

				Method method12 = oldModelClass.getMethod("getRemarks");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value12);

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

	public static Object translateOutputResultNotification(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResultNotificationClp newModel = new ResultNotificationClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getRequestState");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getMaritimeCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value5);

				Method method6 = oldModelClass.getMethod("getRole");

				Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

				newModel.setRole(value6);

				Method method7 = oldModelClass.getMethod("getResponse");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setResponse(value7);

				Method method8 = oldModelClass.getMethod("getOrganization");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setOrganization(value8);

				Method method9 = oldModelClass.getMethod("getDivision");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setDivision(value9);

				Method method10 = oldModelClass.getMethod("getOfficerName");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setOfficerName(value10);

				Method method11 = oldModelClass.getMethod("getLatestDate");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setLatestDate(value11);

				Method method12 = oldModelClass.getMethod("getBusinessTypeCode");

				Integer value12 = (Integer)method12.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessTypeCode(value12);

				Method method13 = oldModelClass.getMethod("getRemarks");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value13);

				Method method14 = oldModelClass.getMethod("getIsReply");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setIsReply(value14);

				Method method15 = oldModelClass.getMethod("getResponseTime");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setResponseTime(value15);

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

	public static Object translateOutputTempDebitNote(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDebitNoteClp newModel = new TempDebitNoteClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getATTACHEDFILE");

				Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

				newModel.setATTACHEDFILE(value1);

				Method method2 = oldModelClass.getMethod("getCorporationid");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCorporationid(value2);

				Method method3 = oldModelClass.getMethod("getDebitnotenumber");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDebitnotenumber(value3);

				Method method4 = oldModelClass.getMethod("getDivision");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setDivision(value4);

				Method method5 = oldModelClass.getMethod("getDocumentName");

				Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value5);

				Method method6 = oldModelClass.getMethod("getDocumentYear");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value6);

				Method method7 = oldModelClass.getMethod(
						"getFinancialaccountant");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFinancialaccountant(value7);

				Method method8 = oldModelClass.getMethod("getFromdate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setFromdate(value8);

				Method method9 = oldModelClass.getMethod("getMarkasdeleted");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setMarkasdeleted(value9);

				Method method10 = oldModelClass.getMethod("getOrganization");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setOrganization(value10);

				Method method11 = oldModelClass.getMethod("getPaymenttype");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setPaymenttype(value11);

				Method method12 = oldModelClass.getMethod("getReportby");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setReportby(value12);

				Method method13 = oldModelClass.getMethod("getReportdate");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setReportdate(value13);

				Method method14 = oldModelClass.getMethod("getTodate");

				Date value14 = (Date)method14.invoke(oldModel, (Object[])null);

				newModel.setTodate(value14);

				Method method15 = oldModelClass.getMethod("getTotalpayment");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setTotalpayment(value15);

				Method method16 = oldModelClass.getMethod("getTransactionid");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setTransactionid(value16);

				Method method17 = oldModelClass.getMethod("getMariTimeCode");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setMariTimeCode(value17);

				Method method18 = oldModelClass.getMethod("getComments");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setComments(value18);

				Method method19 = oldModelClass.getMethod("getDocumentTypeCode");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentTypeCode(value19);

				Method method20 = oldModelClass.getMethod("getKeypayGoodCode");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setKeypayGoodCode(value20);

				Method method21 = oldModelClass.getMethod(
						"getKeypayMerchantCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setKeypayMerchantCode(value21);

				Method method22 = oldModelClass.getMethod(
						"getPaymentGateStatusCode");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setPaymentGateStatusCode(value22);

				Method method23 = oldModelClass.getMethod(
						"getPaymentGateResponseData");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setPaymentGateResponseData(value23);

				Method method24 = oldModelClass.getMethod(
						"getPaymentGateCheckCode");

				Integer value24 = (Integer)method24.invoke(oldModel,
						(Object[])null);

				newModel.setPaymentGateCheckCode(value24);

				Method method25 = oldModelClass.getMethod(
						"getPaymentGateCheckResponseData");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setPaymentGateCheckResponseData(value25);

				Method method26 = oldModelClass.getMethod("getKeypayURL");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setKeypayURL(value26);

				Method method27 = oldModelClass.getMethod("getCurrency");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setCurrency(value27);

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