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

package vn.gt.dao.nhapcanh.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.gt.dao.nhapcanh.model.CrewListClp;
import vn.gt.dao.nhapcanh.model.DocumentClp;
import vn.gt.dao.nhapcanh.model.DocumentGeneralClp;
import vn.gt.dao.nhapcanh.model.PassengerListClp;
import vn.gt.dao.nhapcanh.model.ResponseBoClp;

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

		if (oldModelClassName.equals(CrewListClp.class.getName())) {
			return translateInputCrewList(oldModel);
		}

		if (oldModelClassName.equals(DocumentClp.class.getName())) {
			return translateInputDocument(oldModel);
		}

		if (oldModelClassName.equals(DocumentGeneralClp.class.getName())) {
			return translateInputDocumentGeneral(oldModel);
		}

		if (oldModelClassName.equals(PassengerListClp.class.getName())) {
			return translateInputPassengerList(oldModel);
		}

		if (oldModelClassName.equals(ResponseBoClp.class.getName())) {
			return translateInputResponseBo(oldModel);
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

	public static Object translateInputCrewList(BaseModel<?> oldModel) {
		CrewListClp oldCplModel = (CrewListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.nhapcanh.model.impl.CrewListImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setCrewCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getCrewCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentNo",
						new Class[] { String.class });

				String value2 = oldCplModel.getDocumentNo();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getStateCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setBirthDay",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getBirthDay();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setBirthPlace",
						new Class[] { String.class });

				String value5 = oldCplModel.getBirthPlace();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setFamilyName",
						new Class[] { String.class });

				String value6 = oldCplModel.getFamilyName();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFullName",
						new Class[] { String.class });

				String value7 = oldCplModel.getFullName();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setGivenName",
						new Class[] { String.class });

				String value8 = oldCplModel.getGivenName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPassportNumber",
						new Class[] { String.class });

				String value9 = oldCplModel.getPassportNumber();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setPassportType",
						new Class[] { String.class });

				String value10 = oldCplModel.getPassportType();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setRankCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getRankCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setCreateDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getCreateDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setModifyDate",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getModifyDate();

				method13.invoke(newModel, value13);

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

	public static Object translateInputDocument(BaseModel<?> oldModel) {
		DocumentClp oldCplModel = (DocumentClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.nhapcanh.model.impl.DocumentImpl",
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

				Method method2 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value2 = oldCplModel.getUserCreated();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentTypeCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getDocumentTypeCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value4 = oldCplModel.getCallSign();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPreDocumentName",
						new Class[] { String.class });

				String value5 = oldCplModel.getPreDocumentName();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCreatedDate",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getCreatedDate();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setLastModifiedDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getLastModifiedDate();

				method7.invoke(newModel, value7);

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

	public static Object translateInputDocumentGeneral(BaseModel<?> oldModel) {
		DocumentGeneralClp oldCplModel = (DocumentGeneralClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.nhapcanh.model.impl.DocumentGeneralImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setDocumentNo",
						new Class[] { String.class });

				String value1 = oldCplModel.getDocumentNo();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentFunction",
						new Class[] { String.class });

				String value2 = oldCplModel.getDocumentFunction();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getIsArrival());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setIsDeparture",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getIsDeparture());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setShipCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getShipCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setArrivalOrDeparturePortCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getArrivalOrDeparturePortCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setTimeArrivalOrDeparture",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getTimeArrivalOrDeparture();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value8 = oldCplModel.getImoNumber();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value9 = oldCplModel.getCallSign();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getVoyageNumber());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setShipNationCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getShipNationCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value12 = oldCplModel.getNameOfMaster();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setLastPort",
						new Class[] { String.class });

				String value13 = oldCplModel.getLastPort();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setContactDetailShipAgent",
						new Class[] { String.class });

				String value14 = oldCplModel.getContactDetailShipAgent();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setGrossTonnage",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getGrossTonnage());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setNetTonnage",
						new Class[] { Double.TYPE });

				Double value16 = new Double(oldCplModel.getNetTonnage());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setPositionShipInPort",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getPositionShipInPort());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setBriefParticularsVoyage",
						new Class[] { String.class });

				String value18 = oldCplModel.getBriefParticularsVoyage();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setBriefDescriptionCargo",
						new Class[] { String.class });

				String value19 = oldCplModel.getBriefDescriptionCargo();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setCrewNumber",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getCrewNumber());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setPassengerNumber",
						new Class[] { Integer.TYPE });

				Integer value21 = new Integer(oldCplModel.getPassengerNumber());

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value22 = oldCplModel.getRemarks();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setCargoDeclaration",
						new Class[] { String.class });

				String value23 = oldCplModel.getCargoDeclaration();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setShipStoresDeclaration",
						new Class[] { String.class });

				String value24 = oldCplModel.getShipStoresDeclaration();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setCrewList",
						new Class[] { String.class });

				String value25 = oldCplModel.getCrewList();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setPassengerList",
						new Class[] { String.class });

				String value26 = oldCplModel.getPassengerList();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setShipRequirements",
						new Class[] { String.class });

				String value27 = oldCplModel.getShipRequirements();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setIsCrewEffectDeclaration",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getIsCrewEffectDeclaration());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setIsMaritimeDeclarationHealth",
						new Class[] { Integer.TYPE });

				Integer value29 = new Integer(oldCplModel.getIsMaritimeDeclarationHealth());

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setCreateDate",
						new Class[] { Date.class });

				Date value30 = oldCplModel.getCreateDate();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setModifyDate",
						new Class[] { Date.class });

				Date value31 = oldCplModel.getModifyDate();

				method31.invoke(newModel, value31);

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

	public static Object translateInputPassengerList(BaseModel<?> oldModel) {
		PassengerListClp oldCplModel = (PassengerListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.nhapcanh.model.impl.PassengerListImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPassengerCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPassengerCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentNo",
						new Class[] { String.class });

				String value2 = oldCplModel.getDocumentNo();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setFullName",
						new Class[] { String.class });

				String value3 = oldCplModel.getFullName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getStateCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setBirthDay",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getBirthDay();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setBirthPlace",
						new Class[] { String.class });

				String value6 = oldCplModel.getBirthPlace();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPassportTypeCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPassportTypeCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setPassPortNo",
						new Class[] { String.class });

				String value8 = oldCplModel.getPassPortNo();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPortCheckInCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getPortCheckInCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setPortCheckOutCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getPortCheckOutCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setIsTransit",
						new Class[] { Boolean.TYPE });

				Boolean value11 = new Boolean(oldCplModel.getIsTransit());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setCreateDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getCreateDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setModifyDate",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getModifyDate();

				method13.invoke(newModel, value13);

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

	public static Object translateInputResponseBo(BaseModel<?> oldModel) {
		ResponseBoClp oldCplModel = (ResponseBoClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.nhapcanh.model.impl.ResponseBoImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setIsSuccess",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getIsSuccess());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setErrorMessage",
						new Class[] { String.class });

				String value2 = oldCplModel.getErrorMessage();

				method2.invoke(newModel, value2);

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
					"vn.gt.dao.nhapcanh.model.impl.CrewListImpl")) {
			return translateOutputCrewList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.nhapcanh.model.impl.DocumentImpl")) {
			return translateOutputDocument(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.nhapcanh.model.impl.DocumentGeneralImpl")) {
			return translateOutputDocumentGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.nhapcanh.model.impl.PassengerListImpl")) {
			return translateOutputPassengerList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.nhapcanh.model.impl.ResponseBoImpl")) {
			return translateOutputResponseBo(oldModel);
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

	public static Object translateOutputCrewList(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				CrewListClp newModel = new CrewListClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getCrewCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setCrewCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentNo");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentNo(value2);

				Method method3 = oldModelClass.getMethod("getStateCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value3);

				Method method4 = oldModelClass.getMethod("getBirthDay");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setBirthDay(value4);

				Method method5 = oldModelClass.getMethod("getBirthPlace");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setBirthPlace(value5);

				Method method6 = oldModelClass.getMethod("getFamilyName");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setFamilyName(value6);

				Method method7 = oldModelClass.getMethod("getFullName");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFullName(value7);

				Method method8 = oldModelClass.getMethod("getGivenName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setGivenName(value8);

				Method method9 = oldModelClass.getMethod("getPassportNumber");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setPassportNumber(value9);

				Method method10 = oldModelClass.getMethod("getPassportType");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setPassportType(value10);

				Method method11 = oldModelClass.getMethod("getRankCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setRankCode(value11);

				Method method12 = oldModelClass.getMethod("getCreateDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setCreateDate(value12);

				Method method13 = oldModelClass.getMethod("getModifyDate");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setModifyDate(value13);

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

	public static Object translateOutputDocument(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DocumentClp newModel = new DocumentClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getDocumentName");

				Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value1);

				Method method2 = oldModelClass.getMethod("getUserCreated");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value2);

				Method method3 = oldModelClass.getMethod("getDocumentTypeCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentTypeCode(value3);

				Method method4 = oldModelClass.getMethod("getCallSign");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value4);

				Method method5 = oldModelClass.getMethod("getPreDocumentName");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPreDocumentName(value5);

				Method method6 = oldModelClass.getMethod("getCreatedDate");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setCreatedDate(value6);

				Method method7 = oldModelClass.getMethod("getLastModifiedDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setLastModifiedDate(value7);

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

	public static Object translateOutputDocumentGeneral(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DocumentGeneralClp newModel = new DocumentGeneralClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getDocumentNo");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setDocumentNo(value1);

				Method method2 = oldModelClass.getMethod("getDocumentFunction");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentFunction(value2);

				Method method3 = oldModelClass.getMethod("getIsArrival");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value3);

				Method method4 = oldModelClass.getMethod("getIsDeparture");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setIsDeparture(value4);

				Method method5 = oldModelClass.getMethod("getShipCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setShipCode(value5);

				Method method6 = oldModelClass.getMethod(
						"getArrivalOrDeparturePortCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setArrivalOrDeparturePortCode(value6);

				Method method7 = oldModelClass.getMethod(
						"getTimeArrivalOrDeparture");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setTimeArrivalOrDeparture(value7);

				Method method8 = oldModelClass.getMethod("getImoNumber");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value8);

				Method method9 = oldModelClass.getMethod("getCallSign");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value9);

				Method method10 = oldModelClass.getMethod("getVoyageNumber");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value10);

				Method method11 = oldModelClass.getMethod("getShipNationCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setShipNationCode(value11);

				Method method12 = oldModelClass.getMethod("getNameOfMaster");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value12);

				Method method13 = oldModelClass.getMethod("getLastPort");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setLastPort(value13);

				Method method14 = oldModelClass.getMethod(
						"getContactDetailShipAgent");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setContactDetailShipAgent(value14);

				Method method15 = oldModelClass.getMethod("getGrossTonnage");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setGrossTonnage(value15);

				Method method16 = oldModelClass.getMethod("getNetTonnage");

				Double value16 = (Double)method16.invoke(oldModel,
						(Object[])null);

				newModel.setNetTonnage(value16);

				Method method17 = oldModelClass.getMethod(
						"getPositionShipInPort");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setPositionShipInPort(value17);

				Method method18 = oldModelClass.getMethod(
						"getBriefParticularsVoyage");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setBriefParticularsVoyage(value18);

				Method method19 = oldModelClass.getMethod(
						"getBriefDescriptionCargo");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setBriefDescriptionCargo(value19);

				Method method20 = oldModelClass.getMethod("getCrewNumber");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setCrewNumber(value20);

				Method method21 = oldModelClass.getMethod("getPassengerNumber");

				Integer value21 = (Integer)method21.invoke(oldModel,
						(Object[])null);

				newModel.setPassengerNumber(value21);

				Method method22 = oldModelClass.getMethod("getRemarks");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value22);

				Method method23 = oldModelClass.getMethod("getCargoDeclaration");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setCargoDeclaration(value23);

				Method method24 = oldModelClass.getMethod(
						"getShipStoresDeclaration");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setShipStoresDeclaration(value24);

				Method method25 = oldModelClass.getMethod("getCrewList");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setCrewList(value25);

				Method method26 = oldModelClass.getMethod("getPassengerList");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setPassengerList(value26);

				Method method27 = oldModelClass.getMethod("getShipRequirements");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setShipRequirements(value27);

				Method method28 = oldModelClass.getMethod(
						"getIsCrewEffectDeclaration");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setIsCrewEffectDeclaration(value28);

				Method method29 = oldModelClass.getMethod(
						"getIsMaritimeDeclarationHealth");

				Integer value29 = (Integer)method29.invoke(oldModel,
						(Object[])null);

				newModel.setIsMaritimeDeclarationHealth(value29);

				Method method30 = oldModelClass.getMethod("getCreateDate");

				Date value30 = (Date)method30.invoke(oldModel, (Object[])null);

				newModel.setCreateDate(value30);

				Method method31 = oldModelClass.getMethod("getModifyDate");

				Date value31 = (Date)method31.invoke(oldModel, (Object[])null);

				newModel.setModifyDate(value31);

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

	public static Object translateOutputPassengerList(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				PassengerListClp newModel = new PassengerListClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPassengerCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPassengerCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentNo");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentNo(value2);

				Method method3 = oldModelClass.getMethod("getFullName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setFullName(value3);

				Method method4 = oldModelClass.getMethod("getStateCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value4);

				Method method5 = oldModelClass.getMethod("getBirthDay");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setBirthDay(value5);

				Method method6 = oldModelClass.getMethod("getBirthPlace");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setBirthPlace(value6);

				Method method7 = oldModelClass.getMethod("getPassportTypeCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeCode(value7);

				Method method8 = oldModelClass.getMethod("getPassPortNo");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setPassPortNo(value8);

				Method method9 = oldModelClass.getMethod("getPortCheckInCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setPortCheckInCode(value9);

				Method method10 = oldModelClass.getMethod("getPortCheckOutCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setPortCheckOutCode(value10);

				Method method11 = oldModelClass.getMethod("getIsTransit");

				Boolean value11 = (Boolean)method11.invoke(oldModel,
						(Object[])null);

				newModel.setIsTransit(value11);

				Method method12 = oldModelClass.getMethod("getCreateDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setCreateDate(value12);

				Method method13 = oldModelClass.getMethod("getModifyDate");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setModifyDate(value13);

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

	public static Object translateOutputResponseBo(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ResponseBoClp newModel = new ResponseBoClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getIsSuccess");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setIsSuccess(value1);

				Method method2 = oldModelClass.getMethod("getErrorMessage");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setErrorMessage(value2);

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