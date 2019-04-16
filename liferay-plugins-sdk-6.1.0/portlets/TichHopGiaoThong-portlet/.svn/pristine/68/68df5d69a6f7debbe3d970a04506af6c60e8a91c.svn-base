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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestClp;
import vn.gt.dao.noticeandmessage.model.HistoryInterfaceRequestFieldClp;
import vn.gt.dao.noticeandmessage.model.InterfaceRequestClp;
import vn.gt.dao.noticeandmessage.model.InterfaceRequestFieldClp;
import vn.gt.dao.noticeandmessage.model.IssueAcceptanceClp;
import vn.gt.dao.noticeandmessage.model.IssueAcceptanceForTransitClp;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransitClp;
import vn.gt.dao.noticeandmessage.model.IssuePortClearanceClp;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanelClp;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrderClp;
import vn.gt.dao.noticeandmessage.model.ModifyClp;
import vn.gt.dao.noticeandmessage.model.NoticeShipMessageClp;
import vn.gt.dao.noticeandmessage.model.TempAnimalQuarantineClp;
import vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealthClp;
import vn.gt.dao.noticeandmessage.model.TempCargoDeclarationClp;
import vn.gt.dao.noticeandmessage.model.TempCargoItemsClp;
import vn.gt.dao.noticeandmessage.model.TempCrewDetailsClp;
import vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclarationClp;
import vn.gt.dao.noticeandmessage.model.TempCrewEffectsItemsClp;
import vn.gt.dao.noticeandmessage.model.TempCrewListClp;
import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsItemsClp;
import vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifestClp;
import vn.gt.dao.noticeandmessage.model.TempDeclarationForAnimalQuarantineClp;
import vn.gt.dao.noticeandmessage.model.TempDeclarationForPlantQuarantineClp;
import vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealthClp;
import vn.gt.dao.noticeandmessage.model.TempDocumentClp;
import vn.gt.dao.noticeandmessage.model.TempGeneralDeclarationClp;
import vn.gt.dao.noticeandmessage.model.TempGoodsItemsClp;
import vn.gt.dao.noticeandmessage.model.TempHealthCrewPassengerListClp;
import vn.gt.dao.noticeandmessage.model.TempHealthQuestionClp;
import vn.gt.dao.noticeandmessage.model.TempMaritimePaymentConfigClp;
import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessageClp;
import vn.gt.dao.noticeandmessage.model.TempPassengerDetailsClp;
import vn.gt.dao.noticeandmessage.model.TempPassengerListClp;
import vn.gt.dao.noticeandmessage.model.TempPersonListClp;
import vn.gt.dao.noticeandmessage.model.TempPlantQuarantineClp;
import vn.gt.dao.noticeandmessage.model.TempShipSecurityMessageClp;
import vn.gt.dao.noticeandmessage.model.TempShipSecurityPortItemsClp;
import vn.gt.dao.noticeandmessage.model.TempShipStoresDeclarationClp;
import vn.gt.dao.noticeandmessage.model.TempShipStoresItemsClp;
import vn.gt.dao.noticeandmessage.model.TempUnitGeneralClp;
import vn.gt.dao.noticeandmessage.model.TempWasteListClp;
import vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTucClp;

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

		if (oldModelClassName.equals(HistoryInterfaceRequestClp.class.getName())) {
			return translateInputHistoryInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(
					HistoryInterfaceRequestFieldClp.class.getName())) {
			return translateInputHistoryInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(InterfaceRequestClp.class.getName())) {
			return translateInputInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(InterfaceRequestFieldClp.class.getName())) {
			return translateInputInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(IssueAcceptanceClp.class.getName())) {
			return translateInputIssueAcceptance(oldModel);
		}

		if (oldModelClassName.equals(
					IssueAcceptanceForTransitClp.class.getName())) {
			return translateInputIssueAcceptanceForTransit(oldModel);
		}

		if (oldModelClassName.equals(
					IssuePermissionForTransitClp.class.getName())) {
			return translateInputIssuePermissionForTransit(oldModel);
		}

		if (oldModelClassName.equals(IssuePortClearanceClp.class.getName())) {
			return translateInputIssuePortClearance(oldModel);
		}

		if (oldModelClassName.equals(IssueShiftingOrderClp.class.getName())) {
			return translateInputIssueShiftingOrder(oldModel);
		}

		if (oldModelClassName.equals(
					IssueShiftingOrderChanelClp.class.getName())) {
			return translateInputIssueShiftingOrderChanel(oldModel);
		}

		if (oldModelClassName.equals(ModifyClp.class.getName())) {
			return translateInputModify(oldModel);
		}

		if (oldModelClassName.equals(NoticeShipMessageClp.class.getName())) {
			return translateInputNoticeShipMessage(oldModel);
		}

		if (oldModelClassName.equals(TempAnimalQuarantineClp.class.getName())) {
			return translateInputTempAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					TempAttachmentDeclarationHealthClp.class.getName())) {
			return translateInputTempAttachmentDeclarationHealth(oldModel);
		}

		if (oldModelClassName.equals(TempCargoDeclarationClp.class.getName())) {
			return translateInputTempCargoDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempCargoItemsClp.class.getName())) {
			return translateInputTempCargoItems(oldModel);
		}

		if (oldModelClassName.equals(TempCrewDetailsClp.class.getName())) {
			return translateInputTempCrewDetails(oldModel);
		}

		if (oldModelClassName.equals(
					TempCrewEffectsDeclarationClp.class.getName())) {
			return translateInputTempCrewEffectsDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempCrewEffectsItemsClp.class.getName())) {
			return translateInputTempCrewEffectsItems(oldModel);
		}

		if (oldModelClassName.equals(TempCrewListClp.class.getName())) {
			return translateInputTempCrewList(oldModel);
		}

		if (oldModelClassName.equals(TempDangerousGoodsItemsClp.class.getName())) {
			return translateInputTempDangerousGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					TempDangerousGoodsNanifestClp.class.getName())) {
			return translateInputTempDangerousGoodsNanifest(oldModel);
		}

		if (oldModelClassName.equals(
					TempDeclarationForAnimalQuarantineClp.class.getName())) {
			return translateInputTempDeclarationForAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					TempDeclarationForPlantQuarantineClp.class.getName())) {
			return translateInputTempDeclarationForPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(TempDeclarationOfHealthClp.class.getName())) {
			return translateInputTempDeclarationOfHealth(oldModel);
		}

		if (oldModelClassName.equals(TempDocumentClp.class.getName())) {
			return translateInputTempDocument(oldModel);
		}

		if (oldModelClassName.equals(TempGeneralDeclarationClp.class.getName())) {
			return translateInputTempGeneralDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempGoodsItemsClp.class.getName())) {
			return translateInputTempGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					TempHealthCrewPassengerListClp.class.getName())) {
			return translateInputTempHealthCrewPassengerList(oldModel);
		}

		if (oldModelClassName.equals(TempHealthQuestionClp.class.getName())) {
			return translateInputTempHealthQuestion(oldModel);
		}

		if (oldModelClassName.equals(
					TempMaritimePaymentConfigClp.class.getName())) {
			return translateInputTempMaritimePaymentConfig(oldModel);
		}

		if (oldModelClassName.equals(TempNoTiceShipMessageClp.class.getName())) {
			return translateInputTempNoTiceShipMessage(oldModel);
		}

		if (oldModelClassName.equals(TempPassengerDetailsClp.class.getName())) {
			return translateInputTempPassengerDetails(oldModel);
		}

		if (oldModelClassName.equals(TempPassengerListClp.class.getName())) {
			return translateInputTempPassengerList(oldModel);
		}

		if (oldModelClassName.equals(TempPersonListClp.class.getName())) {
			return translateInputTempPersonList(oldModel);
		}

		if (oldModelClassName.equals(TempPlantQuarantineClp.class.getName())) {
			return translateInputTempPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(TempShipSecurityMessageClp.class.getName())) {
			return translateInputTempShipSecurityMessage(oldModel);
		}

		if (oldModelClassName.equals(
					TempShipSecurityPortItemsClp.class.getName())) {
			return translateInputTempShipSecurityPortItems(oldModel);
		}

		if (oldModelClassName.equals(
					TempShipStoresDeclarationClp.class.getName())) {
			return translateInputTempShipStoresDeclaration(oldModel);
		}

		if (oldModelClassName.equals(TempShipStoresItemsClp.class.getName())) {
			return translateInputTempShipStoresItems(oldModel);
		}

		if (oldModelClassName.equals(TempUnitGeneralClp.class.getName())) {
			return translateInputTempUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(TempWasteListClp.class.getName())) {
			return translateInputTempWasteList(oldModel);
		}

		if (oldModelClassName.equals(ViewHoanThanhThuTucClp.class.getName())) {
			return translateInputViewHoanThanhThuTuc(oldModel);
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

	public static Object translateInputHistoryInterfaceRequest(
		BaseModel<?> oldModel) {
		HistoryInterfaceRequestClp oldCplModel = (HistoryInterfaceRequestClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.HistoryInterfaceRequestImpl",
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

				Method method2 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getOrganizationCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setLocCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getLocCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRequestDate",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getRequestDate();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getRequestedDate();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRequestDirection",
						new Class[] { String.class });

				String value6 = oldCplModel.getRequestDirection();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getRequestState());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestResponseTime",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestResponseTime();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value9 = oldCplModel.getDocumentType();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setBusinessType",
						new Class[] { String.class });

				String value10 = oldCplModel.getBusinessType();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setFunctionType",
						new Class[] { String.class });

				String value11 = oldCplModel.getFunctionType();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRequestContent",
						new Class[] { String.class });

				String value12 = oldCplModel.getRequestContent();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSenderName",
						new Class[] { String.class });

				String value13 = oldCplModel.getSenderName();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setRequestVersion",
						new Class[] { String.class });

				String value14 = oldCplModel.getRequestVersion();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setSenderIdentify",
						new Class[] { String.class });

				String value15 = oldCplModel.getSenderIdentify();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setReceiverName",
						new Class[] { String.class });

				String value16 = oldCplModel.getReceiverName();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSendingDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getSendingDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setReceiverIdentify",
						new Class[] { String.class });

				String value18 = oldCplModel.getReceiverIdentify();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value19 = oldCplModel.getRemarks();

				method19.invoke(newModel, value19);

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

	public static Object translateInputHistoryInterfaceRequestField(
		BaseModel<?> oldModel) {
		HistoryInterfaceRequestFieldClp oldCplModel = (HistoryInterfaceRequestFieldClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.HistoryInterfaceRequestFieldImpl",
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

				Method method2 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getOrganizationCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setLocCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getLocCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRequestDate",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getRequestDate();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getRequestedDate();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRequestDirection",
						new Class[] { String.class });

				String value6 = oldCplModel.getRequestDirection();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getRequestState());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestResponseTime",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestResponseTime();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value9 = oldCplModel.getDocumentType();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setBusinessType",
						new Class[] { String.class });

				String value10 = oldCplModel.getBusinessType();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setFunctionType",
						new Class[] { String.class });

				String value11 = oldCplModel.getFunctionType();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setSenderName",
						new Class[] { String.class });

				String value12 = oldCplModel.getSenderName();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRequestVersion",
						new Class[] { String.class });

				String value13 = oldCplModel.getRequestVersion();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setSenderIdentify",
						new Class[] { String.class });

				String value14 = oldCplModel.getSenderIdentify();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setReceiverName",
						new Class[] { String.class });

				String value15 = oldCplModel.getReceiverName();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSendingDate",
						new Class[] { Date.class });

				Date value16 = oldCplModel.getSendingDate();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setReceiverIdentify",
						new Class[] { String.class });

				String value17 = oldCplModel.getReceiverIdentify();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value18 = oldCplModel.getRemarks();

				method18.invoke(newModel, value18);

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

	public static Object translateInputInterfaceRequest(BaseModel<?> oldModel) {
		InterfaceRequestClp oldCplModel = (InterfaceRequestClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestImpl",
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

				Method method2 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getOrganizationCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setLocCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getLocCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRequestDate",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getRequestDate();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getRequestedDate();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRequestDirection",
						new Class[] { String.class });

				String value6 = oldCplModel.getRequestDirection();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getRequestState());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestResponseTime",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestResponseTime();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value9 = oldCplModel.getDocumentType();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setDocumentNameRef",
						new Class[] { String.class });

				String value10 = oldCplModel.getDocumentNameRef();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setBusinessType",
						new Class[] { String.class });

				String value11 = oldCplModel.getBusinessType();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setFunctionType",
						new Class[] { String.class });

				String value12 = oldCplModel.getFunctionType();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRequestContent",
						new Class[] { String.class });

				String value13 = oldCplModel.getRequestContent();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setSenderName",
						new Class[] { String.class });

				String value14 = oldCplModel.getSenderName();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setRequestVersion",
						new Class[] { String.class });

				String value15 = oldCplModel.getRequestVersion();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSenderIdentify",
						new Class[] { String.class });

				String value16 = oldCplModel.getSenderIdentify();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setReceiverName",
						new Class[] { String.class });

				String value17 = oldCplModel.getReceiverName();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setSendingDate",
						new Class[] { Date.class });

				Date value18 = oldCplModel.getSendingDate();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setReceiverIdentify",
						new Class[] { String.class });

				String value19 = oldCplModel.getReceiverIdentify();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value20 = oldCplModel.getRemarks();

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

	public static Object translateInputInterfaceRequestField(
		BaseModel<?> oldModel) {
		InterfaceRequestFieldClp oldCplModel = (InterfaceRequestFieldClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestFieldImpl",
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

				Method method2 = newModelClass.getMethod("setOrganizationCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getOrganizationCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setLocCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getLocCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRequestDate",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getRequestDate();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getRequestedDate();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRequestDirection",
						new Class[] { String.class });

				String value6 = oldCplModel.getRequestDirection();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getRequestState());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setRequestResponseTime",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getRequestResponseTime();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value9 = oldCplModel.getDocumentType();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setDocumentNameRef",
						new Class[] { String.class });

				String value10 = oldCplModel.getDocumentNameRef();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setBusinessType",
						new Class[] { String.class });

				String value11 = oldCplModel.getBusinessType();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setFunctionType",
						new Class[] { String.class });

				String value12 = oldCplModel.getFunctionType();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSenderName",
						new Class[] { String.class });

				String value13 = oldCplModel.getSenderName();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setRequestVersion",
						new Class[] { String.class });

				String value14 = oldCplModel.getRequestVersion();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setSenderIdentify",
						new Class[] { String.class });

				String value15 = oldCplModel.getSenderIdentify();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setReceiverName",
						new Class[] { String.class });

				String value16 = oldCplModel.getReceiverName();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSendingDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getSendingDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setReceiverIdentify",
						new Class[] { String.class });

				String value18 = oldCplModel.getReceiverIdentify();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value19 = oldCplModel.getRemarks();

				method19.invoke(newModel, value19);

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

	public static Object translateInputIssueAcceptance(BaseModel<?> oldModel) {
		IssueAcceptanceClp oldCplModel = (IssueAcceptanceClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceImpl",
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

				Method method2 = newModelClass.getMethod("setNumberPortClearance",
						new Class[] { String.class });

				String value2 = oldCplModel.getNumberPortClearance();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortofAuthority",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortofAuthority();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getFlagStateOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNumberOfCrews",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getNumberOfCrews());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getNumberOfPassengers());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value10 = oldCplModel.getCallSign();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value11 = oldCplModel.getNameOfMaster();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setCargo",
						new Class[] { String.class });

				String value12 = oldCplModel.getCargo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setVolumeCargo",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getVolumeCargo());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setCargoUnit",
						new Class[] { String.class });

				String value14 = oldCplModel.getCargoUnit();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setCargoDescription",
						new Class[] { String.class });

				String value15 = oldCplModel.getCargoDescription();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setTransitCargo",
						new Class[] { String.class });

				String value16 = oldCplModel.getTransitCargo();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setVolumeTransitCargo",
						new Class[] { Double.TYPE });

				Double value17 = new Double(oldCplModel.getVolumeTransitCargo());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setTransitCargoUnit",
						new Class[] { String.class });

				String value18 = oldCplModel.getTransitCargoUnit();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setTimeOfDeparture",
						new Class[] { Date.class });

				Date value19 = oldCplModel.getTimeOfDeparture();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value20 = oldCplModel.getPortCode();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setPortWharfCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getPortWharfCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value22 = oldCplModel.getPortHarbourCode();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setNextPortOfCallCode",
						new Class[] { String.class });

				String value23 = oldCplModel.getNextPortOfCallCode();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setValidUntil",
						new Class[] { Date.class });

				Date value24 = oldCplModel.getValidUntil();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setIssueDate",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getIssueDate();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setDirectorOfMaritime",
						new Class[] { String.class });

				String value26 = oldCplModel.getDirectorOfMaritime();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setCertificateNo",
						new Class[] { String.class });

				String value27 = oldCplModel.getCertificateNo();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getRequestState());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setGt",
						new Class[] { Double.TYPE });

				Double value29 = new Double(oldCplModel.getGt());

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value30 = new Double(oldCplModel.getDwt());

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setVersionNo",
						new Class[] { String.class });

				String value31 = oldCplModel.getVersionNo();

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setIsApproval",
						new Class[] { Integer.TYPE });

				Integer value32 = new Integer(oldCplModel.getIsApproval());

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setApprovalDate",
						new Class[] { Date.class });

				Date value33 = oldCplModel.getApprovalDate();

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setApprovalName",
						new Class[] { String.class });

				String value34 = oldCplModel.getApprovalName();

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value35 = oldCplModel.getRemarks();

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setIsCancel",
						new Class[] { Integer.TYPE });

				Integer value36 = new Integer(oldCplModel.getIsCancel());

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setCancelDate",
						new Class[] { Date.class });

				Date value37 = oldCplModel.getCancelDate();

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setCancelName",
						new Class[] { String.class });

				String value38 = oldCplModel.getCancelName();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setCancelNote",
						new Class[] { String.class });

				String value39 = oldCplModel.getCancelNote();

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setRepresentative",
						new Class[] { String.class });

				String value40 = oldCplModel.getRepresentative();

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value41 = oldCplModel.getSignDate();

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setSignName",
						new Class[] { String.class });

				String value42 = oldCplModel.getSignName();

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setSignTitle",
						new Class[] { String.class });

				String value43 = oldCplModel.getSignTitle();

				method43.invoke(newModel, value43);

				Method method44 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value44 = oldCplModel.getSignPlace();

				method44.invoke(newModel, value44);

				Method method45 = newModelClass.getMethod("setStampStatus",
						new Class[] { Long.TYPE });

				Long value45 = new Long(oldCplModel.getStampStatus());

				method45.invoke(newModel, value45);

				Method method46 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value46 = new Long(oldCplModel.getAttachedFile());

				method46.invoke(newModel, value46);

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

	public static Object translateInputIssueAcceptanceForTransit(
		BaseModel<?> oldModel) {
		IssueAcceptanceForTransitClp oldCplModel = (IssueAcceptanceForTransitClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceForTransitImpl",
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

				Method method2 = newModelClass.getMethod("setNumberAcceptanceForTransit",
						new Class[] { String.class });

				String value2 = oldCplModel.getNumberAcceptanceForTransit();

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

				Method method7 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value7 = oldCplModel.getCallSign();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value8 = oldCplModel.getNameOfMaster();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setLoa",
						new Class[] { Double.TYPE });

				Double value9 = new Double(oldCplModel.getLoa());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setUnitLOA",
						new Class[] { String.class });

				String value10 = oldCplModel.getUnitLOA();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setBreadth",
						new Class[] { Double.TYPE });

				Double value11 = new Double(oldCplModel.getBreadth());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setUnitBreadth",
						new Class[] { String.class });

				String value12 = oldCplModel.getUnitBreadth();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setGrossTonnage",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getGrossTonnage());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setGrossTonnageUnit",
						new Class[] { String.class });

				String value14 = oldCplModel.getGrossTonnageUnit();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setNetTonnage",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getNetTonnage());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setNetTonnageUnit",
						new Class[] { String.class });

				String value16 = oldCplModel.getNetTonnageUnit();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value17 = new Double(oldCplModel.getDwt());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setUnitDWT",
						new Class[] { String.class });

				String value18 = oldCplModel.getUnitDWT();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setShownDraftxF",
						new Class[] { Double.TYPE });

				Double value19 = new Double(oldCplModel.getShownDraftxF());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setUnitShownDraftxF",
						new Class[] { String.class });

				String value20 = oldCplModel.getUnitShownDraftxF();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setShownDraftxA",
						new Class[] { Double.TYPE });

				Double value21 = new Double(oldCplModel.getShownDraftxA());

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setUnitShownDraftxA",
						new Class[] { String.class });

				String value22 = oldCplModel.getUnitShownDraftxA();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setClearanceHeight",
						new Class[] { Double.TYPE });

				Double value23 = new Double(oldCplModel.getClearanceHeight());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setUnitClearanceHeight",
						new Class[] { String.class });

				String value24 = oldCplModel.getUnitClearanceHeight();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setPermittedTransitFrom",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getPermittedTransitFrom();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setPermittedTransitTo",
						new Class[] { Date.class });

				Date value26 = oldCplModel.getPermittedTransitTo();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setTimeOfDeparture",
						new Class[] { Date.class });

				Date value27 = oldCplModel.getTimeOfDeparture();

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

	public static Object translateInputIssuePermissionForTransit(
		BaseModel<?> oldModel) {
		IssuePermissionForTransitClp oldCplModel = (IssuePermissionForTransitClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.IssuePermissionForTransitImpl",
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

				Method method2 = newModelClass.getMethod("setNumberPermissionForTransit",
						new Class[] { String.class });

				String value2 = oldCplModel.getNumberPermissionForTransit();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getRequestState());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortofAuthority",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortofAuthority();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getNameOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value8 = oldCplModel.getFlagStateOfShip();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setGt",
						new Class[] { Double.TYPE });

				Double value9 = new Double(oldCplModel.getGt());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setNumberOfCrews",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getNumberOfCrews());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getNumberOfPassengers());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value12 = oldCplModel.getCallSign();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value13 = oldCplModel.getNameOfMaster();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setTransitCargo",
						new Class[] { String.class });

				String value14 = oldCplModel.getTransitCargo();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setVolumeCargo",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getVolumeCargo());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setCargoUnit",
						new Class[] { String.class });

				String value16 = oldCplModel.getCargoUnit();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setCargoDescription",
						new Class[] { String.class });

				String value17 = oldCplModel.getCargoDescription();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setPermittedTransitFrom",
						new Class[] { String.class });

				String value18 = oldCplModel.getPermittedTransitFrom();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setPermittedTransitTo",
						new Class[] { String.class });

				String value19 = oldCplModel.getPermittedTransitTo();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setTimeOfDeparture",
						new Class[] { Date.class });

				Date value20 = oldCplModel.getTimeOfDeparture();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setValidUntil",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getValidUntil();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setDateOfSign",
						new Class[] { Date.class });

				Date value22 = oldCplModel.getDateOfSign();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value23 = oldCplModel.getUserCreated();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setDirectorOfMaritime",
						new Class[] { String.class });

				String value24 = oldCplModel.getDirectorOfMaritime();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setCreatedDate",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getCreatedDate();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setCertificateNo",
						new Class[] { String.class });

				String value26 = oldCplModel.getCertificateNo();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setVersionNo",
						new Class[] { String.class });

				String value27 = oldCplModel.getVersionNo();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setIsApproval",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getIsApproval());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setApprovalDate",
						new Class[] { Date.class });

				Date value29 = oldCplModel.getApprovalDate();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setApprovalName",
						new Class[] { String.class });

				String value30 = oldCplModel.getApprovalName();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value31 = oldCplModel.getRemarks();

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setIsCancel",
						new Class[] { Integer.TYPE });

				Integer value32 = new Integer(oldCplModel.getIsCancel());

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setCancelDate",
						new Class[] { Date.class });

				Date value33 = oldCplModel.getCancelDate();

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setCancelName",
						new Class[] { String.class });

				String value34 = oldCplModel.getCancelName();

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setCancelNote",
						new Class[] { String.class });

				String value35 = oldCplModel.getCancelNote();

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setRepresentative",
						new Class[] { String.class });

				String value36 = oldCplModel.getRepresentative();

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setDigitalAttachedFile",
						new Class[] { Long.TYPE });

				Long value37 = new Long(oldCplModel.getDigitalAttachedFile());

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value38 = oldCplModel.getSignDate();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setSignName",
						new Class[] { String.class });

				String value39 = oldCplModel.getSignName();

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setSignTitle",
						new Class[] { String.class });

				String value40 = oldCplModel.getSignTitle();

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value41 = oldCplModel.getSignPlace();

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setStampStatus",
						new Class[] { Long.TYPE });

				Long value42 = new Long(oldCplModel.getStampStatus());

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value43 = new Long(oldCplModel.getAttachedFile());

				method43.invoke(newModel, value43);

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

	public static Object translateInputIssuePortClearance(BaseModel<?> oldModel) {
		IssuePortClearanceClp oldCplModel = (IssuePortClearanceClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceImpl",
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

				Method method2 = newModelClass.getMethod("setNumberPortClearance",
						new Class[] { String.class });

				String value2 = oldCplModel.getNumberPortClearance();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortofAuthority",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortofAuthority();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getFlagStateOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNumberOfCrews",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getNumberOfCrews());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getNumberOfPassengers());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value10 = oldCplModel.getCallSign();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value11 = oldCplModel.getNameOfMaster();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setCargo",
						new Class[] { String.class });

				String value12 = oldCplModel.getCargo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setVolumeCargo",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getVolumeCargo());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setCargoUnit",
						new Class[] { String.class });

				String value14 = oldCplModel.getCargoUnit();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setCargoDescription",
						new Class[] { String.class });

				String value15 = oldCplModel.getCargoDescription();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setTransitCargo",
						new Class[] { String.class });

				String value16 = oldCplModel.getTransitCargo();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setVolumeTransitCargo",
						new Class[] { Double.TYPE });

				Double value17 = new Double(oldCplModel.getVolumeTransitCargo());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setTransitCargoUnit",
						new Class[] { String.class });

				String value18 = oldCplModel.getTransitCargoUnit();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setTimeOfDeparture",
						new Class[] { Date.class });

				Date value19 = oldCplModel.getTimeOfDeparture();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setNextProvinceCode",
						new Class[] { String.class });

				String value20 = oldCplModel.getNextProvinceCode();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setNextPortOfCallCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getNextPortOfCallCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setMaritimePortCode",
						new Class[] { String.class });

				String value22 = oldCplModel.getMaritimePortCode();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value23 = oldCplModel.getPortCode();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value24 = oldCplModel.getPortHarbourCode();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setValidUntil",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getValidUntil();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setIssueDate",
						new Class[] { Date.class });

				Date value26 = oldCplModel.getIssueDate();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setDirectorOfMaritime",
						new Class[] { String.class });

				String value27 = oldCplModel.getDirectorOfMaritime();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setCertificateNo",
						new Class[] { String.class });

				String value28 = oldCplModel.getCertificateNo();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value29 = new Integer(oldCplModel.getRequestState());

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setGt",
						new Class[] { Double.TYPE });

				Double value30 = new Double(oldCplModel.getGt());

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value31 = new Double(oldCplModel.getDwt());

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setNextMaritimePortCode",
						new Class[] { String.class });

				String value32 = oldCplModel.getNextMaritimePortCode();

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setNextPortRegionCode",
						new Class[] { String.class });

				String value33 = oldCplModel.getNextPortRegionCode();

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setNextPortHarbourCode",
						new Class[] { String.class });

				String value34 = oldCplModel.getNextPortHarbourCode();

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setNextPortWharfCode",
						new Class[] { String.class });

				String value35 = oldCplModel.getNextPortWharfCode();

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setVersionNo",
						new Class[] { String.class });

				String value36 = oldCplModel.getVersionNo();

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setIsApproval",
						new Class[] { Integer.TYPE });

				Integer value37 = new Integer(oldCplModel.getIsApproval());

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setApprovalDate",
						new Class[] { Date.class });

				Date value38 = oldCplModel.getApprovalDate();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setApprovalName",
						new Class[] { String.class });

				String value39 = oldCplModel.getApprovalName();

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value40 = oldCplModel.getRemarks();

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setIsCancel",
						new Class[] { Integer.TYPE });

				Integer value41 = new Integer(oldCplModel.getIsCancel());

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setCancelDate",
						new Class[] { Date.class });

				Date value42 = oldCplModel.getCancelDate();

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setCancelName",
						new Class[] { String.class });

				String value43 = oldCplModel.getCancelName();

				method43.invoke(newModel, value43);

				Method method44 = newModelClass.getMethod("setCancelNote",
						new Class[] { String.class });

				String value44 = oldCplModel.getCancelNote();

				method44.invoke(newModel, value44);

				Method method45 = newModelClass.getMethod("setRepresentative",
						new Class[] { String.class });

				String value45 = oldCplModel.getRepresentative();

				method45.invoke(newModel, value45);

				Method method46 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value46 = oldCplModel.getSignDate();

				method46.invoke(newModel, value46);

				Method method47 = newModelClass.getMethod("setSignName",
						new Class[] { String.class });

				String value47 = oldCplModel.getSignName();

				method47.invoke(newModel, value47);

				Method method48 = newModelClass.getMethod("setSignTitle",
						new Class[] { String.class });

				String value48 = oldCplModel.getSignTitle();

				method48.invoke(newModel, value48);

				Method method49 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value49 = oldCplModel.getSignPlace();

				method49.invoke(newModel, value49);

				Method method50 = newModelClass.getMethod("setStampStatus",
						new Class[] { Long.TYPE });

				Long value50 = new Long(oldCplModel.getStampStatus());

				method50.invoke(newModel, value50);

				Method method51 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value51 = new Long(oldCplModel.getAttachedFile());

				method51.invoke(newModel, value51);

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

	public static Object translateInputIssueShiftingOrder(BaseModel<?> oldModel) {
		IssueShiftingOrderClp oldCplModel = (IssueShiftingOrderClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl",
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

				Method method2 = newModelClass.getMethod("setNumberShiftingOrder",
						new Class[] { String.class });

				String value2 = oldCplModel.getNumberShiftingOrder();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value3 = new Long(oldCplModel.getDocumentName());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getDocumentYear());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortofAuthority",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortofAuthority();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getFlagStateOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setAnchoringPortCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getAnchoringPortCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setAnchoringPortWharfCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getAnchoringPortWharfCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getPortHarbourCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setShiftingPortWharfCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getShiftingPortWharfCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setShiftingDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getShiftingDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setReasonToShift",
						new Class[] { String.class });

				String value13 = oldCplModel.getReasonToShift();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setIssueDate",
						new Class[] { Date.class });

				Date value14 = oldCplModel.getIssueDate();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDirectorOfMaritime",
						new Class[] { String.class });

				String value15 = oldCplModel.getDirectorOfMaritime();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setCertificateNo",
						new Class[] { String.class });

				String value16 = oldCplModel.getCertificateNo();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setRequestState",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getRequestState());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setVersionNo",
						new Class[] { String.class });

				String value18 = oldCplModel.getVersionNo();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setIsApproval",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getIsApproval());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setApprovalDate",
						new Class[] { Date.class });

				Date value20 = oldCplModel.getApprovalDate();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setApprovalName",
						new Class[] { String.class });

				String value21 = oldCplModel.getApprovalName();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value22 = oldCplModel.getRemarks();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setIsCancel",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getIsCancel());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setCancelDate",
						new Class[] { Date.class });

				Date value24 = oldCplModel.getCancelDate();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setCancelName",
						new Class[] { String.class });

				String value25 = oldCplModel.getCancelName();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setCancelNote",
						new Class[] { String.class });

				String value26 = oldCplModel.getCancelNote();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setRepresentative",
						new Class[] { String.class });

				String value27 = oldCplModel.getRepresentative();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setDigitalAttachedFile",
						new Class[] { Long.TYPE });

				Long value28 = new Long(oldCplModel.getDigitalAttachedFile());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value29 = oldCplModel.getSignDate();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setSignName",
						new Class[] { String.class });

				String value30 = oldCplModel.getSignName();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setSignTitle",
						new Class[] { String.class });

				String value31 = oldCplModel.getSignTitle();

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value32 = oldCplModel.getSignPlace();

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setStampStatus",
						new Class[] { Integer.TYPE });

				Integer value33 = new Integer(oldCplModel.getStampStatus());

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value34 = new Long(oldCplModel.getAttachedFile());

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setShownDraftxF",
						new Class[] { Double.TYPE });

				Double value35 = new Double(oldCplModel.getShownDraftxF());

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setUnitShownDraftxF",
						new Class[] { String.class });

				String value36 = oldCplModel.getUnitShownDraftxF();

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setShownDraftxA",
						new Class[] { Double.TYPE });

				Double value37 = new Double(oldCplModel.getShownDraftxA());

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setUnitShownDraftxA",
						new Class[] { String.class });

				String value38 = oldCplModel.getUnitShownDraftxA();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setLoa",
						new Class[] { Double.TYPE });

				Double value39 = new Double(oldCplModel.getLoa());

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setLoaUnit",
						new Class[] { String.class });

				String value40 = oldCplModel.getLoaUnit();

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value41 = new Double(oldCplModel.getDwt());

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setDwtUnit",
						new Class[] { String.class });

				String value42 = oldCplModel.getDwtUnit();

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setTugBoat",
						new Class[] { String.class });

				String value43 = oldCplModel.getTugBoat();

				method43.invoke(newModel, value43);

				Method method44 = newModelClass.getMethod("setFrom",
						new Class[] { String.class });

				String value44 = oldCplModel.getFrom();

				method44.invoke(newModel, value44);

				Method method45 = newModelClass.getMethod("setTo",
						new Class[] { String.class });

				String value45 = oldCplModel.getTo();

				method45.invoke(newModel, value45);

				Method method46 = newModelClass.getMethod("setTaxCodeOfShipownersAgents",
						new Class[] { String.class });

				String value46 = oldCplModel.getTaxCodeOfShipownersAgents();

				method46.invoke(newModel, value46);

				Method method47 = newModelClass.getMethod("setNameOfShipownersAgents",
						new Class[] { String.class });

				String value47 = oldCplModel.getNameOfShipownersAgents();

				method47.invoke(newModel, value47);

				Method method48 = newModelClass.getMethod("setShipAgencyAddress",
						new Class[] { String.class });

				String value48 = oldCplModel.getShipAgencyAddress();

				method48.invoke(newModel, value48);

				Method method49 = newModelClass.getMethod("setShipAgencyPhone",
						new Class[] { String.class });

				String value49 = oldCplModel.getShipAgencyPhone();

				method49.invoke(newModel, value49);

				Method method50 = newModelClass.getMethod("setShipAgencyFax",
						new Class[] { String.class });

				String value50 = oldCplModel.getShipAgencyFax();

				method50.invoke(newModel, value50);

				Method method51 = newModelClass.getMethod("setShipAgencyEmail",
						new Class[] { String.class });

				String value51 = oldCplModel.getShipAgencyEmail();

				method51.invoke(newModel, value51);

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

	public static Object translateInputIssueShiftingOrderChanel(
		BaseModel<?> oldModel) {
		IssueShiftingOrderChanelClp oldCplModel = (IssueShiftingOrderChanelClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderChanelImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setShiftingOrderId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getShiftingOrderId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setChanelCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getChanelCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setChanelName",
						new Class[] { String.class });

				String value2 = oldCplModel.getChanelName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setOrder",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getOrder());

				method3.invoke(newModel, value3);

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

	public static Object translateInputModify(BaseModel<?> oldModel) {
		ModifyClp oldCplModel = (ModifyClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.ModifyImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setModifyCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getModifyCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setModifyDesc",
						new Class[] { String.class });

				String value2 = oldCplModel.getModifyDesc();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setOrganization",
						new Class[] { String.class });

				String value3 = oldCplModel.getOrganization();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDivision",
						new Class[] { String.class });

				String value4 = oldCplModel.getDivision();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setName",
						new Class[] { String.class });

				String value5 = oldCplModel.getName();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setModifyDate",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getModifyDate();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value7 = new Long(oldCplModel.getDocumentName());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Long.TYPE });

				Long value8 = new Long(oldCplModel.getDocumentYear());

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

	public static Object translateInputNoticeShipMessage(BaseModel<?> oldModel) {
		NoticeShipMessageClp oldCplModel = (NoticeShipMessageClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.NoticeShipMessageImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setNoticeShipCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getNoticeShipCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value2 = new Long(oldCplModel.getDocumentName());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value3 = oldCplModel.getUserCreated();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setConfirmTime",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getConfirmTime());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value5 = oldCplModel.getCallSign();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setArrivalDate",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getArrivalDate();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setArrivalPortCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getArrivalPortCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setPortGoingToCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getPortGoingToCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setNameAndAddOfShipOwners",
						new Class[] { String.class });

				String value9 = oldCplModel.getNameAndAddOfShipOwners();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setClearanceHeight",
						new Class[] { Long.TYPE });

				Long value10 = new Long(oldCplModel.getClearanceHeight());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setShownDraft",
						new Class[] { Long.TYPE });

				Long value11 = new Long(oldCplModel.getShownDraft());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setDwt",
						new Class[] { Long.TYPE });

				Long value12 = new Long(oldCplModel.getDwt());

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getShipAgencyCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setPurposeCode",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getPurposeCode());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setCrewNumber",
						new Class[] { Long.TYPE });

				Long value15 = new Long(oldCplModel.getCrewNumber());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setPassengerNumber",
						new Class[] { Long.TYPE });

				Long value16 = new Long(oldCplModel.getPassengerNumber());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setQuantityAndTypeOfCargo",
						new Class[] { String.class });

				String value17 = oldCplModel.getQuantityAndTypeOfCargo();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setOtherPersons",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getOtherPersons());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value19 = oldCplModel.getRemarks();

				method19.invoke(newModel, value19);

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

	public static Object translateInputTempAnimalQuarantine(
		BaseModel<?> oldModel) {
		TempAnimalQuarantineClp oldCplModel = (TempAnimalQuarantineClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempAnimalQuarantineImpl",
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

				Method method5 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value5 = oldCplModel.getUserCreated();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getFlagStateOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNumberOfCrew",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getNumberOfCrew());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getNumberOfPassengers());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getLastPortOfCallCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNextPortOfCallCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getNextPortOfCallCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setAnimalNameFirst",
						new Class[] { String.class });

				String value12 = oldCplModel.getAnimalNameFirst();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setAnimalNameBetween",
						new Class[] { String.class });

				String value13 = oldCplModel.getAnimalNameBetween();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setAnimalNameThis",
						new Class[] { String.class });

				String value14 = oldCplModel.getAnimalNameThis();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value15 = oldCplModel.getNameOfMaster();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value16 = oldCplModel.getSignPlace();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getSignDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getMasterSigned());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getMasterSignedImage());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value20 = new Long(oldCplModel.getAttachedFile());

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

	public static Object translateInputTempAttachmentDeclarationHealth(
		BaseModel<?> oldModel) {
		TempAttachmentDeclarationHealthClp oldCplModel = (TempAttachmentDeclarationHealthClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempAttachmentDeclarationHealthImpl",
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

				Method method2 = newModelClass.getMethod("setAttachmentCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getAttachmentCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPassengerOrCrewCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getPassengerOrCrewCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setName",
						new Class[] { String.class });

				String value4 = oldCplModel.getName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setAge",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getAge());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSex",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getSex());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setNationality",
						new Class[] { String.class });

				String value7 = oldCplModel.getNationality();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setPortJoinVesselCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getPortJoinVesselCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDateJoinVessel",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getDateJoinVessel();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setClassOrRating",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getClassOrRating());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNatureOfIllness",
						new Class[] { String.class });

				String value11 = oldCplModel.getNatureOfIllness();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setDateOfOnsetOfSymptom",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getDateOfOnsetOfSymptom();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setReportedMedicalOfficer",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getReportedMedicalOfficer());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setDisposalOfCase",
						new Class[] { String.class });

				String value14 = oldCplModel.getDisposalOfCase();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setMedicinesOrOther",
						new Class[] { String.class });

				String value15 = oldCplModel.getMedicinesOrOther();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setComments",
						new Class[] { String.class });

				String value16 = oldCplModel.getComments();

				method16.invoke(newModel, value16);

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

	public static Object translateInputTempCargoDeclaration(
		BaseModel<?> oldModel) {
		TempCargoDeclarationClp oldCplModel = (TempCargoDeclarationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempCargoDeclarationImpl",
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

				Method method4 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value4 = oldCplModel.getUserCreated();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsArrival());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value7 = oldCplModel.getImoNumber();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setCallsign",
						new Class[] { String.class });

				String value8 = oldCplModel.getCallsign();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value9 = oldCplModel.getVoyageNumber();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setPortReport",
						new Class[] { String.class });

				String value10 = oldCplModel.getPortReport();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value11 = oldCplModel.getFlagStateOfShip();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value12 = oldCplModel.getNameOfMaster();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setPortOfLoading",
						new Class[] { String.class });

				String value13 = oldCplModel.getPortOfLoading();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setListGoods",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getListGoods());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value15 = oldCplModel.getSignPlace();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value16 = oldCplModel.getSignDate();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getMasterSigned());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getMasterSignedImage());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value19 = new Long(oldCplModel.getAttachedFile());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getDocumentYear());

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

	public static Object translateInputTempCargoItems(BaseModel<?> oldModel) {
		TempCargoItemsClp oldCplModel = (TempCargoItemsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempCargoItemsImpl",
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

				Method method2 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value2 = new Long(oldCplModel.getDocumentName());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getDocumentYear());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setCargoCategory",
						new Class[] { String.class });

				String value4 = oldCplModel.getCargoCategory();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setCargoType",
						new Class[] { String.class });

				String value5 = oldCplModel.getCargoType();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCargoCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getCargoCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value7 = oldCplModel.getDescription();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setQuantity",
						new Class[] { Double.TYPE });

				Double value8 = new Double(oldCplModel.getQuantity());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setUnit",
						new Class[] { String.class });

				String value9 = oldCplModel.getUnit();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setSequence",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getSequence());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value11 = oldCplModel.getModifiedDate();

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

	public static Object translateInputTempCrewDetails(BaseModel<?> oldModel) {
		TempCrewDetailsClp oldCplModel = (TempCrewDetailsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempCrewDetailsImpl",
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

				Method method2 = newModelClass.getMethod("setCrewcode",
						new Class[] { String.class });

				String value2 = oldCplModel.getCrewcode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setFamilyName",
						new Class[] { String.class });

				String value3 = oldCplModel.getFamilyName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGivenName",
						new Class[] { String.class });

				String value4 = oldCplModel.getGivenName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRankCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getRankCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNationality",
						new Class[] { String.class });

				String value6 = oldCplModel.getNationality();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDateOfBirth",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getDateOfBirth();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setPlaceOfBirth",
						new Class[] { String.class });

				String value8 = oldCplModel.getPlaceOfBirth();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPassportNumber",
						new Class[] { String.class });

				String value9 = oldCplModel.getPassportNumber();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setPassportTypeCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getPassportTypeCode();

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

	public static Object translateInputTempCrewEffectsDeclaration(
		BaseModel<?> oldModel) {
		TempCrewEffectsDeclarationClp oldCplModel = (TempCrewEffectsDeclarationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsDeclarationImpl",
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

				Method method4 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value4 = oldCplModel.getUserCreated();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value5 = oldCplModel.getNameOfShip();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value6 = oldCplModel.getImoNumber();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setCallsign",
						new Class[] { String.class });

				String value7 = oldCplModel.getCallsign();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value8 = oldCplModel.getVoyageNumber();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value9 = oldCplModel.getFlagStateOfShip();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value10 = oldCplModel.getNameOfMaster();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setListCrewEffects",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getListCrewEffects());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value12 = oldCplModel.getSignPlace();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getSignDate();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getMasterSigned());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value15 = new Integer(oldCplModel.getMasterSignedImage());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value16 = new Long(oldCplModel.getAttachedFile());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getDocumentYear());

				method17.invoke(newModel, value17);

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

	public static Object translateInputTempCrewEffectsItems(
		BaseModel<?> oldModel) {
		TempCrewEffectsItemsClp oldCplModel = (TempCrewEffectsItemsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsItemsImpl",
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

				Method method2 = newModelClass.getMethod("setCrewEffectItemcode",
						new Class[] { String.class });

				String value2 = oldCplModel.getCrewEffectItemcode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setFamilyName",
						new Class[] { String.class });

				String value3 = oldCplModel.getFamilyName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGivenName",
						new Class[] { String.class });

				String value4 = oldCplModel.getGivenName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRankOrratingCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getRankOrratingCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setEffectsIneligibleForRelief",
						new Class[] { String.class });

				String value6 = oldCplModel.getEffectsIneligibleForRelief();

				method6.invoke(newModel, value6);

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

	public static Object translateInputTempCrewList(BaseModel<?> oldModel) {
		TempCrewListClp oldCplModel = (TempCrewListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempCrewListImpl",
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

				Method method5 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value5 = oldCplModel.getUserCreated();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getIsArrival());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getNameOfShip();

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
						new Class[] { String.class });

				String value10 = oldCplModel.getVoyageNumber();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setPortOfArrivalCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getPortOfArrivalCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setDateOfArrival",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getDateOfArrival();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value13 = oldCplModel.getFlagStateOfShip();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value14 = oldCplModel.getLastPortOfCallCode();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setCrewList",
						new Class[] { Integer.TYPE });

				Integer value15 = new Integer(oldCplModel.getCrewList());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value16 = oldCplModel.getSignPlace();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getSignDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getMasterSigned());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getMasterSignedImage());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value20 = new Long(oldCplModel.getAttachedFile());

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

	public static Object translateInputTempDangerousGoodsItems(
		BaseModel<?> oldModel) {
		TempDangerousGoodsItemsClp oldCplModel = (TempDangerousGoodsItemsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsItemsImpl",
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

				Method method2 = newModelClass.getMethod("setDangerousGoodItemCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getDangerousGoodItemCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRefNumber",
						new Class[] { String.class });

				String value3 = oldCplModel.getRefNumber();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMarksContainer",
						new Class[] { String.class });

				String value4 = oldCplModel.getMarksContainer();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNumberContainer",
						new Class[] { String.class });

				String value5 = oldCplModel.getNumberContainer();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNumberOfPackage",
						new Class[] { String.class });

				String value6 = oldCplModel.getNumberOfPackage();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setKindOfPackages",
						new Class[] { String.class });

				String value7 = oldCplModel.getKindOfPackages();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setProperShippingName",
						new Class[] { String.class });

				String value8 = oldCplModel.getProperShippingName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setGoodClass",
						new Class[] { String.class });

				String value9 = oldCplModel.getGoodClass();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setUnNumber",
						new Class[] { String.class });

				String value10 = oldCplModel.getUnNumber();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setPackingGroup",
						new Class[] { String.class });

				String value11 = oldCplModel.getPackingGroup();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setSubsidiaryRisk",
						new Class[] { String.class });

				String value12 = oldCplModel.getSubsidiaryRisk();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setFlashPoint",
						new Class[] { String.class });

				String value13 = oldCplModel.getFlashPoint();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setMarinePollutant",
						new Class[] { String.class });

				String value14 = oldCplModel.getMarinePollutant();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setGrossWeight",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getGrossWeight());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setEms",
						new Class[] { String.class });

				String value16 = oldCplModel.getEms();

				method16.invoke(newModel, value16);

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

	public static Object translateInputTempDangerousGoodsNanifest(
		BaseModel<?> oldModel) {
		TempDangerousGoodsNanifestClp oldCplModel = (TempDangerousGoodsNanifestClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsNanifestImpl",
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

				Method method4 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value4 = oldCplModel.getUserCreated();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value5 = oldCplModel.getNameOfShip();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getFlagStateOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setMasterName",
						new Class[] { String.class });

				String value7 = oldCplModel.getMasterName();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value8 = oldCplModel.getImoNumber();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCallsign",
						new Class[] { String.class });

				String value9 = oldCplModel.getCallsign();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value10 = oldCplModel.getVoyageNumber();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setPortOfLoadingCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getPortOfLoadingCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setPortOfDischargeCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getPortOfDischargeCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setShippingAgent",
						new Class[] { String.class });

				String value13 = oldCplModel.getShippingAgent();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setAdditionalRemark",
						new Class[] { String.class });

				String value14 = oldCplModel.getAdditionalRemark();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setListDangerousGoods",
						new Class[] { Integer.TYPE });

				Integer value15 = new Integer(oldCplModel.getListDangerousGoods());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value16 = oldCplModel.getSignPlace();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getSignDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getMasterSigned());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getMasterSignedImage());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value20 = new Long(oldCplModel.getAttachedFile());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value21 = new Integer(oldCplModel.getDocumentYear());

				method21.invoke(newModel, value21);

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

	public static Object translateInputTempDeclarationForAnimalQuarantine(
		BaseModel<?> oldModel) {
		TempDeclarationForAnimalQuarantineClp oldCplModel = (TempDeclarationForAnimalQuarantineClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempDeclarationForAnimalQuarantineImpl",
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

				Method method5 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value5 = oldCplModel.getUserCreated();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getFlagStateOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNumberOfCrew",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getNumberOfCrew());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getNumberOfPassengers());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getLastPortOfCallCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNextPortOfCallCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getNextPortOfCallCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setAnimalNameFirst",
						new Class[] { String.class });

				String value12 = oldCplModel.getAnimalNameFirst();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setAnimalNameBetween",
						new Class[] { String.class });

				String value13 = oldCplModel.getAnimalNameBetween();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setAnimalNameThis",
						new Class[] { String.class });

				String value14 = oldCplModel.getAnimalNameThis();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value15 = oldCplModel.getNameOfMaster();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value16 = oldCplModel.getSignPlace();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getSignDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getMasterSigned());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getMasterSignedImage());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value20 = new Long(oldCplModel.getAttachedFile());

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

	public static Object translateInputTempDeclarationForPlantQuarantine(
		BaseModel<?> oldModel) {
		TempDeclarationForPlantQuarantineClp oldCplModel = (TempDeclarationForPlantQuarantineClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempDeclarationForPlantQuarantineImpl",
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

				Method method4 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value4 = oldCplModel.getUserCreated();

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

				Method method8 = newModelClass.getMethod("setDoctorName",
						new Class[] { String.class });

				String value8 = oldCplModel.getDoctorName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setNumberOfCrew",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getNumberOfCrew());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getNumberOfPassengers());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getLastPortOfCallCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setNextPortOfCallCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getNextPortOfCallCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setFirstPortOfLoadingCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getFirstPortOfLoadingCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setDateOfdeparture",
						new Class[] { Date.class });

				Date value14 = oldCplModel.getDateOfdeparture();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setPlantNameFirst",
						new Class[] { String.class });

				String value15 = oldCplModel.getPlantNameFirst();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setPlantNameBetween",
						new Class[] { String.class });

				String value16 = oldCplModel.getPlantNameBetween();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setPlantNameThis",
						new Class[] { String.class });

				String value17 = oldCplModel.getPlantNameThis();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value18 = oldCplModel.getSignPlace();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value19 = oldCplModel.getSignDate();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getMasterSigned());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value21 = new Integer(oldCplModel.getMasterSignedImage());

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value22 = new Long(oldCplModel.getAttachedFile());

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getDocumentYear());

				method23.invoke(newModel, value23);

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

	public static Object translateInputTempDeclarationOfHealth(
		BaseModel<?> oldModel) {
		TempDeclarationOfHealthClp oldCplModel = (TempDeclarationOfHealthClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempDeclarationOfHealthImpl",
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

				Method method5 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value5 = oldCplModel.getUserCreated();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSubmittedPortCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getSubmittedPortCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setDateSubmitted",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getDateSubmitted();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value8 = oldCplModel.getNameOfShip();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setRegistration",
						new Class[] { String.class });

				String value9 = oldCplModel.getRegistration();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value10 = oldCplModel.getImoNumber();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setArrivingFrom",
						new Class[] { String.class });

				String value11 = oldCplModel.getArrivingFrom();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setSailingTo",
						new Class[] { String.class });

				String value12 = oldCplModel.getSailingTo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setNationality",
						new Class[] { String.class });

				String value13 = oldCplModel.getNationality();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setMasterName",
						new Class[] { String.class });

				String value14 = oldCplModel.getMasterName();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setGrossTonnage",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getGrossTonnage());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setGrossTonnageUnit",
						new Class[] { String.class });

				String value16 = oldCplModel.getGrossTonnageUnit();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setTonnage",
						new Class[] { Double.TYPE });

				Double value17 = new Double(oldCplModel.getTonnage());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setTonnageUnit",
						new Class[] { String.class });

				String value18 = oldCplModel.getTonnageUnit();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setCertificatecarried",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getCertificatecarried());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setIssuedAt",
						new Class[] { String.class });

				String value20 = oldCplModel.getIssuedAt();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setIssueDate",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getIssueDate();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setReInspectionrequired",
						new Class[] { Integer.TYPE });

				Integer value22 = new Integer(oldCplModel.getReInspectionrequired());

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setIsShipVisitedWHO",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getIsShipVisitedWHO());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setVisitedWHOPortCode",
						new Class[] { String.class });

				String value24 = oldCplModel.getVisitedWHOPortCode();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setDateOfVisitedWHO",
						new Class[] { Date.class });

				Date value25 = oldCplModel.getDateOfVisitedWHO();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setListPortName",
						new Class[] { String.class });

				String value26 = oldCplModel.getListPortName();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setDoctorName",
						new Class[] { String.class });

				String value27 = oldCplModel.getDoctorName();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setDoctorSigndate",
						new Class[] { Date.class });

				Date value28 = oldCplModel.getDoctorSigndate();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value29 = oldCplModel.getSignPlace();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value30 = oldCplModel.getSignDate();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value31 = new Integer(oldCplModel.getMasterSigned());

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value32 = new Integer(oldCplModel.getMasterSignedImage());

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value33 = new Long(oldCplModel.getAttachedFile());

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

	public static Object translateInputTempDocument(BaseModel<?> oldModel) {
		TempDocumentClp oldCplModel = (TempDocumentClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl",
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

				Method method5 = newModelClass.getMethod("setDocumentTypeCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getDocumentTypeCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value6 = oldCplModel.getUserCreated();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getShipAgencyCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setShipName",
						new Class[] { String.class });

				String value8 = oldCplModel.getShipName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getShipTypeCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getStateCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setShipCaptain",
						new Class[] { String.class });

				String value11 = oldCplModel.getShipCaptain();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setImo",
						new Class[] { String.class });

				String value12 = oldCplModel.getImo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setGrt",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getGrt());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setNt",
						new Class[] { Double.TYPE });

				Double value14 = new Double(oldCplModel.getNt());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getDwt());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setUnitGRT",
						new Class[] { String.class });

				String value16 = oldCplModel.getUnitGRT();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setUnitNT",
						new Class[] { String.class });

				String value17 = oldCplModel.getUnitNT();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setUnitDWT",
						new Class[] { String.class });

				String value18 = oldCplModel.getUnitDWT();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value19 = oldCplModel.getCallSign();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setPreDocumentName",
						new Class[] { String.class });

				String value20 = oldCplModel.getPreDocumentName();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setCreatedDate",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getCreatedDate();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setLastModifiedDate",
						new Class[] { Date.class });

				Date value22 = oldCplModel.getLastModifiedDate();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setFlowFlag",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getFlowFlag());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setDocumentStatusCode",
						new Class[] { Integer.TYPE });

				Integer value24 = new Integer(oldCplModel.getDocumentStatusCode());

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setLocationCode",
						new Class[] { String.class });

				String value25 = oldCplModel.getLocationCode();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value26 = oldCplModel.getMaritimeCode();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value27 = oldCplModel.getPortRegionCode();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value28 = oldCplModel.getPortCode();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setLastPortCode",
						new Class[] { String.class });

				String value29 = oldCplModel.getLastPortCode();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setShipPosition",
						new Class[] { Integer.TYPE });

				Integer value30 = new Integer(oldCplModel.getShipPosition());

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setShipOwnerCode",
						new Class[] { String.class });

				String value31 = oldCplModel.getShipOwnerCode();

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setArrivalShipAgency",
						new Class[] { String.class });

				String value32 = oldCplModel.getArrivalShipAgency();

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setDepartureShipAgency",
						new Class[] { String.class });

				String value33 = oldCplModel.getDepartureShipAgency();

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setShipDateFrom",
						new Class[] { Date.class });

				Date value34 = oldCplModel.getShipDateFrom();

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setShipDateTo",
						new Class[] { Date.class });

				Date value35 = oldCplModel.getShipDateTo();

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setUpgradeVersion",
						new Class[] { Integer.TYPE });

				Integer value36 = new Integer(oldCplModel.getUpgradeVersion());

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setNameOfShipownersAgents",
						new Class[] { String.class });

				String value37 = oldCplModel.getNameOfShipownersAgents();

				method37.invoke(newModel, value37);

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

	public static Object translateInputTempGeneralDeclaration(
		BaseModel<?> oldModel) {
		TempGeneralDeclarationClp oldCplModel = (TempGeneralDeclarationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl",
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

				Method method4 = newModelClass.getMethod("setDocumentReference",
						new Class[] { Long.TYPE });

				Long value4 = new Long(oldCplModel.getDocumentReference());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getDocumentYear());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value6 = oldCplModel.getUserCreated();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getIsArrival());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value8 = oldCplModel.getNameOfShip();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getShipTypeCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value10 = oldCplModel.getImoNumber();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value11 = oldCplModel.getCallSign();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value12 = oldCplModel.getVoyageNumber();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setPortOfArrivalCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getPortOfArrivalCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setDateOfArrival",
						new Class[] { Date.class });

				Date value14 = oldCplModel.getDateOfArrival();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value15 = oldCplModel.getPortHarbourCode();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value16 = oldCplModel.getPortRegionCode();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setPortWharfCode",
						new Class[] { String.class });

				String value17 = oldCplModel.getPortWharfCode();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value18 = oldCplModel.getFlagStateOfShip();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value19 = oldCplModel.getNameOfMaster();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value20 = oldCplModel.getLastPortOfCallCode();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setCertificateOfRegistryNumber",
						new Class[] { String.class });

				String value21 = oldCplModel.getCertificateOfRegistryNumber();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setCertificateOfRegistryDate",
						new Class[] { Date.class });

				Date value22 = oldCplModel.getCertificateOfRegistryDate();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setCertificateOfRegistryPortName",
						new Class[] { String.class });

				String value23 = oldCplModel.getCertificateOfRegistryPortName();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setTaxCodeOfShipownersAgents",
						new Class[] { String.class });

				String value24 = oldCplModel.getTaxCodeOfShipownersAgents();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setNameOfShipownersAgents",
						new Class[] { String.class });

				String value25 = oldCplModel.getNameOfShipownersAgents();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setShipAgencyAddress",
						new Class[] { String.class });

				String value26 = oldCplModel.getShipAgencyAddress();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setShipAgencyPhone",
						new Class[] { String.class });

				String value27 = oldCplModel.getShipAgencyPhone();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setShipAgencyFax",
						new Class[] { String.class });

				String value28 = oldCplModel.getShipAgencyFax();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setShipAgencyEmail",
						new Class[] { String.class });

				String value29 = oldCplModel.getShipAgencyEmail();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setGrossTonnage",
						new Class[] { Double.TYPE });

				Double value30 = new Double(oldCplModel.getGrossTonnage());

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setNetTonnage",
						new Class[] { Double.TYPE });

				Double value31 = new Double(oldCplModel.getNetTonnage());

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setPositionOfShipInport",
						new Class[] { String.class });

				String value32 = oldCplModel.getPositionOfShipInport();

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setBriefParticularsOfVoyage",
						new Class[] { String.class });

				String value33 = oldCplModel.getBriefParticularsOfVoyage();

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setPreviousPortsOfCall",
						new Class[] { String.class });

				String value34 = oldCplModel.getPreviousPortsOfCall();

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setSubsequentPortsOfCall",
						new Class[] { String.class });

				String value35 = oldCplModel.getSubsequentPortsOfCall();

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setDischargedPorts",
						new Class[] { String.class });

				String value36 = oldCplModel.getDischargedPorts();

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setRemainingCargo",
						new Class[] { String.class });

				String value37 = oldCplModel.getRemainingCargo();

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setBriefDescriptionOfTheCargo",
						new Class[] { String.class });

				String value38 = oldCplModel.getBriefDescriptionOfTheCargo();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setNumberOfCrew",
						new Class[] { Integer.TYPE });

				Integer value39 = new Integer(oldCplModel.getNumberOfCrew());

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value40 = new Integer(oldCplModel.getNumberOfPassengers());

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setShipRequirementsInTermsOfWaste",
						new Class[] { String.class });

				String value41 = oldCplModel.getShipRequirementsInTermsOfWaste();

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value42 = oldCplModel.getRemarks();

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setNumberCargoDeclaration",
						new Class[] { String.class });

				String value43 = oldCplModel.getNumberCargoDeclaration();

				method43.invoke(newModel, value43);

				Method method44 = newModelClass.getMethod("setNumberShipStoreDeclaration",
						new Class[] { String.class });

				String value44 = oldCplModel.getNumberShipStoreDeclaration();

				method44.invoke(newModel, value44);

				Method method45 = newModelClass.getMethod("setNumberCrewList",
						new Class[] { String.class });

				String value45 = oldCplModel.getNumberCrewList();

				method45.invoke(newModel, value45);

				Method method46 = newModelClass.getMethod("setNumberPassengerList",
						new Class[] { String.class });

				String value46 = oldCplModel.getNumberPassengerList();

				method46.invoke(newModel, value46);

				Method method47 = newModelClass.getMethod("setNumberCrewEffects",
						new Class[] { String.class });

				String value47 = oldCplModel.getNumberCrewEffects();

				method47.invoke(newModel, value47);

				Method method48 = newModelClass.getMethod("setNumberHealthMaritime",
						new Class[] { String.class });

				String value48 = oldCplModel.getNumberHealthMaritime();

				method48.invoke(newModel, value48);

				Method method49 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value49 = oldCplModel.getSignPlace();

				method49.invoke(newModel, value49);

				Method method50 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value50 = oldCplModel.getSignDate();

				method50.invoke(newModel, value50);

				Method method51 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value51 = new Integer(oldCplModel.getMasterSigned());

				method51.invoke(newModel, value51);

				Method method52 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value52 = new Integer(oldCplModel.getMasterSignedImage());

				method52.invoke(newModel, value52);

				Method method53 = newModelClass.getMethod("setCargoOnBoard",
						new Class[] { String.class });

				String value53 = oldCplModel.getCargoOnBoard();

				method53.invoke(newModel, value53);

				Method method54 = newModelClass.getMethod("setCargo",
						new Class[] { String.class });

				String value54 = oldCplModel.getCargo();

				method54.invoke(newModel, value54);

				Method method55 = newModelClass.getMethod("setVolumeCargo",
						new Class[] { Double.TYPE });

				Double value55 = new Double(oldCplModel.getVolumeCargo());

				method55.invoke(newModel, value55);

				Method method56 = newModelClass.getMethod("setCargoUnit",
						new Class[] { String.class });

				String value56 = oldCplModel.getCargoUnit();

				method56.invoke(newModel, value56);

				Method method57 = newModelClass.getMethod("setCargoDescription",
						new Class[] { String.class });

				String value57 = oldCplModel.getCargoDescription();

				method57.invoke(newModel, value57);

				Method method58 = newModelClass.getMethod("setRatedPower",
						new Class[] { String.class });

				String value58 = oldCplModel.getRatedPower();

				method58.invoke(newModel, value58);

				Method method59 = newModelClass.getMethod("setSeatingCapacity",
						new Class[] { String.class });

				String value59 = oldCplModel.getSeatingCapacity();

				method59.invoke(newModel, value59);

				Method method60 = newModelClass.getMethod("setLyingCapacity",
						new Class[] { String.class });

				String value60 = oldCplModel.getLyingCapacity();

				method60.invoke(newModel, value60);

				Method method61 = newModelClass.getMethod("setMaritimePortCode",
						new Class[] { String.class });

				String value61 = oldCplModel.getMaritimePortCode();

				method61.invoke(newModel, value61);

				Method method62 = newModelClass.getMethod("setLastProvinceCode",
						new Class[] { String.class });

				String value62 = oldCplModel.getLastProvinceCode();

				method62.invoke(newModel, value62);

				Method method63 = newModelClass.getMethod("setNextProvinceCode",
						new Class[] { String.class });

				String value63 = oldCplModel.getNextProvinceCode();

				method63.invoke(newModel, value63);

				Method method64 = newModelClass.getMethod("setLastMaritimePortCode",
						new Class[] { String.class });

				String value64 = oldCplModel.getLastMaritimePortCode();

				method64.invoke(newModel, value64);

				Method method65 = newModelClass.getMethod("setLastPortRegionCode",
						new Class[] { String.class });

				String value65 = oldCplModel.getLastPortRegionCode();

				method65.invoke(newModel, value65);

				Method method66 = newModelClass.getMethod("setLastPortHarbourCode",
						new Class[] { String.class });

				String value66 = oldCplModel.getLastPortHarbourCode();

				method66.invoke(newModel, value66);

				Method method67 = newModelClass.getMethod("setLastPortWharfCode",
						new Class[] { String.class });

				String value67 = oldCplModel.getLastPortWharfCode();

				method67.invoke(newModel, value67);

				Method method68 = newModelClass.getMethod("setNextMaritimePortCode",
						new Class[] { String.class });

				String value68 = oldCplModel.getNextMaritimePortCode();

				method68.invoke(newModel, value68);

				Method method69 = newModelClass.getMethod("setNextPortRegionCode",
						new Class[] { String.class });

				String value69 = oldCplModel.getNextPortRegionCode();

				method69.invoke(newModel, value69);

				Method method70 = newModelClass.getMethod("setNextPortHarbourCode",
						new Class[] { String.class });

				String value70 = oldCplModel.getNextPortHarbourCode();

				method70.invoke(newModel, value70);

				Method method71 = newModelClass.getMethod("setNextPortWharfCode",
						new Class[] { String.class });

				String value71 = oldCplModel.getNextPortWharfCode();

				method71.invoke(newModel, value71);

				Method method72 = newModelClass.getMethod("setLink",
						new Class[] { String.class });

				String value72 = oldCplModel.getLink();

				method72.invoke(newModel, value72);

				Method method73 = newModelClass.getMethod("setQrCode",
						new Class[] { String.class });

				String value73 = oldCplModel.getQrCode();

				method73.invoke(newModel, value73);

				Method method74 = newModelClass.getMethod("setPortClearanceNo",
						new Class[] { String.class });

				String value74 = oldCplModel.getPortClearanceNo();

				method74.invoke(newModel, value74);

				Method method75 = newModelClass.getMethod("setLoa",
						new Class[] { Double.TYPE });

				Double value75 = new Double(oldCplModel.getLoa());

				method75.invoke(newModel, value75);

				Method method76 = newModelClass.getMethod("setUnitLOA",
						new Class[] { String.class });

				String value76 = oldCplModel.getUnitLOA();

				method76.invoke(newModel, value76);

				Method method77 = newModelClass.getMethod("setBreadth",
						new Class[] { Double.TYPE });

				Double value77 = new Double(oldCplModel.getBreadth());

				method77.invoke(newModel, value77);

				Method method78 = newModelClass.getMethod("setUnitBreadth",
						new Class[] { String.class });

				String value78 = oldCplModel.getUnitBreadth();

				method78.invoke(newModel, value78);

				Method method79 = newModelClass.getMethod("setClearanceHeight",
						new Class[] { Double.TYPE });

				Double value79 = new Double(oldCplModel.getClearanceHeight());

				method79.invoke(newModel, value79);

				Method method80 = newModelClass.getMethod("setUnitClearanceHeight",
						new Class[] { String.class });

				String value80 = oldCplModel.getUnitClearanceHeight();

				method80.invoke(newModel, value80);

				Method method81 = newModelClass.getMethod("setShownDraftxF",
						new Class[] { Double.TYPE });

				Double value81 = new Double(oldCplModel.getShownDraftxF());

				method81.invoke(newModel, value81);

				Method method82 = newModelClass.getMethod("setUnitShownDraftxF",
						new Class[] { String.class });

				String value82 = oldCplModel.getUnitShownDraftxF();

				method82.invoke(newModel, value82);

				Method method83 = newModelClass.getMethod("setShownDraftxA",
						new Class[] { Double.TYPE });

				Double value83 = new Double(oldCplModel.getShownDraftxA());

				method83.invoke(newModel, value83);

				Method method84 = newModelClass.getMethod("setUnitShownDraftxA",
						new Class[] { String.class });

				String value84 = oldCplModel.getUnitShownDraftxA();

				method84.invoke(newModel, value84);

				Method method85 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value85 = new Double(oldCplModel.getDwt());

				method85.invoke(newModel, value85);

				Method method86 = newModelClass.getMethod("setUnitDWT",
						new Class[] { String.class });

				String value86 = oldCplModel.getUnitDWT();

				method86.invoke(newModel, value86);

				Method method87 = newModelClass.getMethod("setTimeOfPORTArrival",
						new Class[] { Date.class });

				Date value87 = oldCplModel.getTimeOfPORTArrival();

				method87.invoke(newModel, value87);

				Method method88 = newModelClass.getMethod("setTimeOfPilotOnBoard",
						new Class[] { Date.class });

				Date value88 = oldCplModel.getTimeOfPilotOnBoard();

				method88.invoke(newModel, value88);

				Method method89 = newModelClass.getMethod("setTugBoat",
						new Class[] { String.class });

				String value89 = oldCplModel.getTugBoat();

				method89.invoke(newModel, value89);

				Method method90 = newModelClass.getMethod("setDo_",
						new Class[] { String.class });

				String value90 = oldCplModel.getDo_();

				method90.invoke(newModel, value90);

				Method method91 = newModelClass.getMethod("setFo",
						new Class[] { String.class });

				String value91 = oldCplModel.getFo();

				method91.invoke(newModel, value91);

				Method method92 = newModelClass.getMethod("setFw",
						new Class[] { String.class });

				String value92 = oldCplModel.getFw();

				method92.invoke(newModel, value92);

				Method method93 = newModelClass.getMethod("setPlaceOfReception",
						new Class[] { String.class });

				String value93 = oldCplModel.getPlaceOfReception();

				method93.invoke(newModel, value93);

				Method method94 = newModelClass.getMethod("setNameOfShipOwners",
						new Class[] { String.class });

				String value94 = oldCplModel.getNameOfShipOwners();

				method94.invoke(newModel, value94);

				Method method95 = newModelClass.getMethod("setAddressOfShipOwners",
						new Class[] { String.class });

				String value95 = oldCplModel.getAddressOfShipOwners();

				method95.invoke(newModel, value95);

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

	public static Object translateInputTempGoodsItems(BaseModel<?> oldModel) {
		TempGoodsItemsClp oldCplModel = (TempGoodsItemsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempGoodsItemsImpl",
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

				Method method2 = newModelClass.getMethod("setBillOfLadingNo",
						new Class[] { String.class });

				String value2 = oldCplModel.getBillOfLadingNo();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setGoodItemCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getGoodItemCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGoodItemDescription",
						new Class[] { String.class });

				String value4 = oldCplModel.getGoodItemDescription();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNumberOfPackage",
						new Class[] { Long.TYPE });

				Long value5 = new Long(oldCplModel.getNumberOfPackage());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setKindOfPackages",
						new Class[] { String.class });

				String value6 = oldCplModel.getKindOfPackages();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setMarksandNosofGoods",
						new Class[] { String.class });

				String value7 = oldCplModel.getMarksandNosofGoods();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setGrossWeight",
						new Class[] { Double.TYPE });

				Double value8 = new Double(oldCplModel.getGrossWeight());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setGrossWeightUnit",
						new Class[] { String.class });

				String value9 = oldCplModel.getGrossWeightUnit();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setMeasurement",
						new Class[] { Double.TYPE });

				Double value10 = new Double(oldCplModel.getMeasurement());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setMeasurementUnit",
						new Class[] { String.class });

				String value11 = oldCplModel.getMeasurementUnit();

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

	public static Object translateInputTempHealthCrewPassengerList(
		BaseModel<?> oldModel) {
		TempHealthCrewPassengerListClp oldCplModel = (TempHealthCrewPassengerListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListImpl",
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

				Method method2 = newModelClass.getMethod("setHealthCrewPassengerCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getHealthCrewPassengerCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPassengerOrCrewCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getPassengerOrCrewCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPassengerOrCrewName",
						new Class[] { String.class });

				String value4 = oldCplModel.getPassengerOrCrewName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setClassOrRating",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getClassOrRating());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setStateVisitedCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getStateVisitedCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortVisitedCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPortVisitedCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setFromDate",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getFromDate();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setToDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getToDate();

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

	public static Object translateInputTempHealthQuestion(BaseModel<?> oldModel) {
		TempHealthQuestionClp oldCplModel = (TempHealthQuestionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionImpl",
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

				Method method2 = newModelClass.getMethod("setHealthQuestionCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getHealthQuestionCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPersonDied",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getPersonDied());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPersonDiedNo",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPersonDiedNo());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPersonDiedReport",
						new Class[] { String.class });

				String value5 = oldCplModel.getPersonDiedReport();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setIsinfectious",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getIsinfectious());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setInfectiousReport",
						new Class[] { String.class });

				String value7 = oldCplModel.getInfectiousReport();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setIllPassengersGreaterNomal",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getIllPassengersGreaterNomal());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setIllPassengersNo",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getIllPassengersNo());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setIllPersonsOnBoard",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getIllPersonsOnBoard());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setIllPersonsReport",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getIllPersonsReport());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setMedicalPractitionerConsulted",
						new Class[] { Integer.TYPE });

				Integer value12 = new Integer(oldCplModel.getMedicalPractitionerConsulted());

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setMedicalTreatmentOrAdvice",
						new Class[] { String.class });

				String value13 = oldCplModel.getMedicalTreatmentOrAdvice();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setInfectionOrSpreadOfDisease",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getInfectionOrSpreadOfDisease());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setInfectionsReport",
						new Class[] { String.class });

				String value15 = oldCplModel.getInfectionsReport();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setIsSanitary",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getIsSanitary());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setSanitaryDes",
						new Class[] { String.class });

				String value17 = oldCplModel.getSanitaryDes();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setIsStowaways",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getIsStowaways());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setJoinShip",
						new Class[] { String.class });

				String value19 = oldCplModel.getJoinShip();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setIsAnimal",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getIsAnimal());

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

	public static Object translateInputTempMaritimePaymentConfig(
		BaseModel<?> oldModel) {
		TempMaritimePaymentConfigClp oldCplModel = (TempMaritimePaymentConfigClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempMaritimePaymentConfigImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getMaritimeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMerchantCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getMerchantCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setMerchantKey",
						new Class[] { String.class });

				String value3 = oldCplModel.getMerchantKey();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMerchantName",
						new Class[] { String.class });

				String value4 = oldCplModel.getMerchantName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setKeypayDomain",
						new Class[] { String.class });

				String value5 = oldCplModel.getKeypayDomain();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setKeypayVersion",
						new Class[] { String.class });

				String value6 = oldCplModel.getKeypayVersion();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setReturnURL",
						new Class[] { String.class });

				String value7 = oldCplModel.getReturnURL();

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

	public static Object translateInputTempNoTiceShipMessage(
		BaseModel<?> oldModel) {
		TempNoTiceShipMessageClp oldCplModel = (TempNoTiceShipMessageClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl",
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

				Method method3 = newModelClass.getMethod("setNoticeShipType",
						new Class[] { String.class });

				String value3 = oldCplModel.getNoticeShipType();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setNoticeShipCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getNoticeShipCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value5 = new Long(oldCplModel.getDocumentName());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value6 = oldCplModel.getUserCreated();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setConfirmTime",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getConfirmTime());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setShipName",
						new Class[] { String.class });

				String value8 = oldCplModel.getShipName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getShipTypeCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getStateCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setShipCaptain",
						new Class[] { String.class });

				String value11 = oldCplModel.getShipCaptain();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setImo",
						new Class[] { String.class });

				String value12 = oldCplModel.getImo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setGrt",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getGrt());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value14 = new Double(oldCplModel.getDwt());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setUnitGRT",
						new Class[] { String.class });

				String value15 = oldCplModel.getUnitGRT();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setUnitDWT",
						new Class[] { String.class });

				String value16 = oldCplModel.getUnitDWT();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value17 = oldCplModel.getCallSign();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setArrivalDate",
						new Class[] { Date.class });

				Date value18 = oldCplModel.getArrivalDate();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setArrivalPortCode",
						new Class[] { String.class });

				String value19 = oldCplModel.getArrivalPortCode();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value20 = oldCplModel.getPortHarbourCode();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getPortRegionCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setPortWharfCode",
						new Class[] { String.class });

				String value22 = oldCplModel.getPortWharfCode();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setPortGoingToStateName",
						new Class[] { String.class });

				String value23 = oldCplModel.getPortGoingToStateName();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setPortGoingToCode",
						new Class[] { String.class });

				String value24 = oldCplModel.getPortGoingToCode();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setNameOfShipOwners",
						new Class[] { String.class });

				String value25 = oldCplModel.getNameOfShipOwners();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setAddressOfShipOwners",
						new Class[] { String.class });

				String value26 = oldCplModel.getAddressOfShipOwners();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setShipOwnerstateCode",
						new Class[] { String.class });

				String value27 = oldCplModel.getShipOwnerstateCode();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setShipOwnerPhone",
						new Class[] { String.class });

				String value28 = oldCplModel.getShipOwnerPhone();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setShipOwnerFax",
						new Class[] { String.class });

				String value29 = oldCplModel.getShipOwnerFax();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setShipOwnerEmail",
						new Class[] { String.class });

				String value30 = oldCplModel.getShipOwnerEmail();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setLoa",
						new Class[] { Double.TYPE });

				Double value31 = new Double(oldCplModel.getLoa());

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setBreadth",
						new Class[] { Double.TYPE });

				Double value32 = new Double(oldCplModel.getBreadth());

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setClearanceHeight",
						new Class[] { Double.TYPE });

				Double value33 = new Double(oldCplModel.getClearanceHeight());

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setShownDraftxF",
						new Class[] { Double.TYPE });

				Double value34 = new Double(oldCplModel.getShownDraftxF());

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setShownDraftxA",
						new Class[] { Double.TYPE });

				Double value35 = new Double(oldCplModel.getShownDraftxA());

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setUnitLOA",
						new Class[] { String.class });

				String value36 = oldCplModel.getUnitLOA();

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setUnitBreadth",
						new Class[] { String.class });

				String value37 = oldCplModel.getUnitBreadth();

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setUnitClearanceHeight",
						new Class[] { String.class });

				String value38 = oldCplModel.getUnitClearanceHeight();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setUnitShownDraftxF",
						new Class[] { String.class });

				String value39 = oldCplModel.getUnitShownDraftxF();

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setUnitShownDraftxA",
						new Class[] { String.class });

				String value40 = oldCplModel.getUnitShownDraftxA();

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setCertificateOfRegistryNumber",
						new Class[] { String.class });

				String value41 = oldCplModel.getCertificateOfRegistryNumber();

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setCertificateOfRegistryDate",
						new Class[] { Date.class });

				Date value42 = oldCplModel.getCertificateOfRegistryDate();

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setCertificateOfRegistryPortName",
						new Class[] { String.class });

				String value43 = oldCplModel.getCertificateOfRegistryPortName();

				method43.invoke(newModel, value43);

				Method method44 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value44 = oldCplModel.getShipAgencyCode();

				method44.invoke(newModel, value44);

				Method method45 = newModelClass.getMethod("setShipAgencyAddress",
						new Class[] { String.class });

				String value45 = oldCplModel.getShipAgencyAddress();

				method45.invoke(newModel, value45);

				Method method46 = newModelClass.getMethod("setShipAgencyPhone",
						new Class[] { String.class });

				String value46 = oldCplModel.getShipAgencyPhone();

				method46.invoke(newModel, value46);

				Method method47 = newModelClass.getMethod("setShipAgencyFax",
						new Class[] { String.class });

				String value47 = oldCplModel.getShipAgencyFax();

				method47.invoke(newModel, value47);

				Method method48 = newModelClass.getMethod("setShipAgencyEmail",
						new Class[] { String.class });

				String value48 = oldCplModel.getShipAgencyEmail();

				method48.invoke(newModel, value48);

				Method method49 = newModelClass.getMethod("setPurposeCode",
						new Class[] { String.class });

				String value49 = oldCplModel.getPurposeCode();

				method49.invoke(newModel, value49);

				Method method50 = newModelClass.getMethod("setPurposeSpecified",
						new Class[] { String.class });

				String value50 = oldCplModel.getPurposeSpecified();

				method50.invoke(newModel, value50);

				Method method51 = newModelClass.getMethod("setCrewNumber",
						new Class[] { Long.TYPE });

				Long value51 = new Long(oldCplModel.getCrewNumber());

				method51.invoke(newModel, value51);

				Method method52 = newModelClass.getMethod("setUnitCrew",
						new Class[] { String.class });

				String value52 = oldCplModel.getUnitCrew();

				method52.invoke(newModel, value52);

				Method method53 = newModelClass.getMethod("setPassengerNumber",
						new Class[] { Long.TYPE });

				Long value53 = new Long(oldCplModel.getPassengerNumber());

				method53.invoke(newModel, value53);

				Method method54 = newModelClass.getMethod("setUnitPassenger",
						new Class[] { String.class });

				String value54 = oldCplModel.getUnitPassenger();

				method54.invoke(newModel, value54);

				Method method55 = newModelClass.getMethod("setQuantityAndTypeOfCargo",
						new Class[] { String.class });

				String value55 = oldCplModel.getQuantityAndTypeOfCargo();

				method55.invoke(newModel, value55);

				Method method56 = newModelClass.getMethod("setUnitQuantityofCargo",
						new Class[] { String.class });

				String value56 = oldCplModel.getUnitQuantityofCargo();

				method56.invoke(newModel, value56);

				Method method57 = newModelClass.getMethod("setTypeOfCargo",
						new Class[] { String.class });

				String value57 = oldCplModel.getTypeOfCargo();

				method57.invoke(newModel, value57);

				Method method58 = newModelClass.getMethod("setOtherPersons",
						new Class[] { Integer.TYPE });

				Integer value58 = new Integer(oldCplModel.getOtherPersons());

				method58.invoke(newModel, value58);

				Method method59 = newModelClass.getMethod("setRemarks",
						new Class[] { String.class });

				String value59 = oldCplModel.getRemarks();

				method59.invoke(newModel, value59);

				Method method60 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value60 = oldCplModel.getSignPlace();

				method60.invoke(newModel, value60);

				Method method61 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value61 = oldCplModel.getSignDate();

				method61.invoke(newModel, value61);

				Method method62 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value62 = new Integer(oldCplModel.getMasterSigned());

				method62.invoke(newModel, value62);

				Method method63 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value63 = new Integer(oldCplModel.getMasterSignedImage());

				method63.invoke(newModel, value63);

				Method method64 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value64 = new Integer(oldCplModel.getDocumentYear());

				method64.invoke(newModel, value64);

				Method method65 = newModelClass.getMethod("setNameOfShipAgent",
						new Class[] { String.class });

				String value65 = oldCplModel.getNameOfShipAgent();

				method65.invoke(newModel, value65);

				Method method66 = newModelClass.getMethod("setDocumentReference",
						new Class[] { Long.TYPE });

				Long value66 = new Long(oldCplModel.getDocumentReference());

				method66.invoke(newModel, value66);

				Method method67 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value67 = new Integer(oldCplModel.getIsArrival());

				method67.invoke(newModel, value67);

				Method method68 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value68 = oldCplModel.getVoyageNumber();

				method68.invoke(newModel, value68);

				Method method69 = newModelClass.getMethod("setNetTonnage",
						new Class[] { Double.TYPE });

				Double value69 = new Double(oldCplModel.getNetTonnage());

				method69.invoke(newModel, value69);

				Method method70 = newModelClass.getMethod("setNetTonnageUnit",
						new Class[] { String.class });

				String value70 = oldCplModel.getNetTonnageUnit();

				method70.invoke(newModel, value70);

				Method method71 = newModelClass.getMethod("setPositionOfShipInPort",
						new Class[] { String.class });

				String value71 = oldCplModel.getPositionOfShipInPort();

				method71.invoke(newModel, value71);

				Method method72 = newModelClass.getMethod("setBriefParticularsOfVoyage",
						new Class[] { String.class });

				String value72 = oldCplModel.getBriefParticularsOfVoyage();

				method72.invoke(newModel, value72);

				Method method73 = newModelClass.getMethod("setPreviousPortsOfCall",
						new Class[] { String.class });

				String value73 = oldCplModel.getPreviousPortsOfCall();

				method73.invoke(newModel, value73);

				Method method74 = newModelClass.getMethod("setSubsequentPortsOfCall",
						new Class[] { String.class });

				String value74 = oldCplModel.getSubsequentPortsOfCall();

				method74.invoke(newModel, value74);

				Method method75 = newModelClass.getMethod("setDischargedPorts",
						new Class[] { String.class });

				String value75 = oldCplModel.getDischargedPorts();

				method75.invoke(newModel, value75);

				Method method76 = newModelClass.getMethod("setRemainingCargo",
						new Class[] { String.class });

				String value76 = oldCplModel.getRemainingCargo();

				method76.invoke(newModel, value76);

				Method method77 = newModelClass.getMethod("setShipRequirementsInTermsOfWaste",
						new Class[] { String.class });

				String value77 = oldCplModel.getShipRequirementsInTermsOfWaste();

				method77.invoke(newModel, value77);

				Method method78 = newModelClass.getMethod("setNumberCargoDeclaration",
						new Class[] { Integer.TYPE });

				Integer value78 = new Integer(oldCplModel.getNumberCargoDeclaration());

				method78.invoke(newModel, value78);

				Method method79 = newModelClass.getMethod("setNumberShipStoreDeclaration",
						new Class[] { Integer.TYPE });

				Integer value79 = new Integer(oldCplModel.getNumberShipStoreDeclaration());

				method79.invoke(newModel, value79);

				Method method80 = newModelClass.getMethod("setNumberCrewList",
						new Class[] { Integer.TYPE });

				Integer value80 = new Integer(oldCplModel.getNumberCrewList());

				method80.invoke(newModel, value80);

				Method method81 = newModelClass.getMethod("setNumberPassengerList",
						new Class[] { Integer.TYPE });

				Integer value81 = new Integer(oldCplModel.getNumberPassengerList());

				method81.invoke(newModel, value81);

				Method method82 = newModelClass.getMethod("setNumberCrewEffectsDeclaration",
						new Class[] { Integer.TYPE });

				Integer value82 = new Integer(oldCplModel.getNumberCrewEffectsDeclaration());

				method82.invoke(newModel, value82);

				Method method83 = newModelClass.getMethod("setNumberHealthMaritimeDeclaration",
						new Class[] { Integer.TYPE });

				Integer value83 = new Integer(oldCplModel.getNumberHealthMaritimeDeclaration());

				method83.invoke(newModel, value83);

				Method method84 = newModelClass.getMethod("setPortClearanceNo",
						new Class[] { String.class });

				String value84 = oldCplModel.getPortClearanceNo();

				method84.invoke(newModel, value84);

				Method method85 = newModelClass.getMethod("setTimeOfPORTArrival",
						new Class[] { Date.class });

				Date value85 = oldCplModel.getTimeOfPORTArrival();

				method85.invoke(newModel, value85);

				Method method86 = newModelClass.getMethod("setTimeOfPilotOnBoard",
						new Class[] { Date.class });

				Date value86 = oldCplModel.getTimeOfPilotOnBoard();

				method86.invoke(newModel, value86);

				Method method87 = newModelClass.getMethod("setTugBoat",
						new Class[] { String.class });

				String value87 = oldCplModel.getTugBoat();

				method87.invoke(newModel, value87);

				Method method88 = newModelClass.getMethod("setDo_",
						new Class[] { String.class });

				String value88 = oldCplModel.getDo_();

				method88.invoke(newModel, value88);

				Method method89 = newModelClass.getMethod("setFo",
						new Class[] { String.class });

				String value89 = oldCplModel.getFo();

				method89.invoke(newModel, value89);

				Method method90 = newModelClass.getMethod("setFw",
						new Class[] { String.class });

				String value90 = oldCplModel.getFw();

				method90.invoke(newModel, value90);

				Method method91 = newModelClass.getMethod("setPlaceOfReception",
						new Class[] { String.class });

				String value91 = oldCplModel.getPlaceOfReception();

				method91.invoke(newModel, value91);

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

	public static Object translateInputTempPassengerDetails(
		BaseModel<?> oldModel) {
		TempPassengerDetailsClp oldCplModel = (TempPassengerDetailsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempPassengerDetailsImpl",
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

				Method method2 = newModelClass.getMethod("setPassengerCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getPassengerCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setFamilyName",
						new Class[] { String.class });

				String value3 = oldCplModel.getFamilyName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGivenName",
						new Class[] { String.class });

				String value4 = oldCplModel.getGivenName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNationality",
						new Class[] { String.class });

				String value5 = oldCplModel.getNationality();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setBirthDay",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getBirthDay();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setBirthPlace",
						new Class[] { String.class });

				String value7 = oldCplModel.getBirthPlace();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setTypeOfIdentity",
						new Class[] { String.class });

				String value8 = oldCplModel.getTypeOfIdentity();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPassportExpiredDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getPassportExpiredDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setSerialNumberOfIdentity",
						new Class[] { String.class });

				String value10 = oldCplModel.getSerialNumberOfIdentity();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setPortOfEmbarkation",
						new Class[] { String.class });

				String value11 = oldCplModel.getPortOfEmbarkation();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setPortOfDisembarkation",
						new Class[] { String.class });

				String value12 = oldCplModel.getPortOfDisembarkation();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setIsTransit",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getIsTransit());

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

	public static Object translateInputTempPassengerList(BaseModel<?> oldModel) {
		TempPassengerListClp oldCplModel = (TempPassengerListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempPassengerListImpl",
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

				Method method4 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value4 = oldCplModel.getUserCreated();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getIsArrival());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortOfArrivalCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPortOfArrivalCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setDateOfArrival",
						new Class[] { Date.class });

				Date value8 = oldCplModel.getDateOfArrival();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value9 = oldCplModel.getImoNumber();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value10 = oldCplModel.getCallSign();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value11 = oldCplModel.getVoyageNumber();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value12 = oldCplModel.getFlagStateOfShip();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setListPassengers",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getListPassengers());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value14 = oldCplModel.getSignPlace();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getSignDate();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getMasterSigned());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getMasterSignedImage());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value18 = new Long(oldCplModel.getAttachedFile());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getDocumentYear());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setNumberOfLeftPassengers",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getNumberOfLeftPassengers());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setNumberOfVNmeses",
						new Class[] { Integer.TYPE });

				Integer value21 = new Integer(oldCplModel.getNumberOfVNmeses());

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setNumberOfForeigners",
						new Class[] { Integer.TYPE });

				Integer value22 = new Integer(oldCplModel.getNumberOfForeigners());

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setTotalPassengers",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getTotalPassengers());

				method23.invoke(newModel, value23);

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

	public static Object translateInputTempPersonList(BaseModel<?> oldModel) {
		TempPersonListClp oldCplModel = (TempPersonListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempPersonListImpl",
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

				Method method2 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value2 = new Long(oldCplModel.getDocumentName());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getDocumentYear());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setName",
						new Class[] { String.class });

				String value4 = oldCplModel.getName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setAge",
						new Class[] { String.class });

				String value5 = oldCplModel.getAge();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNationalCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getNationalCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setNationalName",
						new Class[] { String.class });

				String value7 = oldCplModel.getNationalName();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setIlnessStatus",
						new Class[] { String.class });

				String value8 = oldCplModel.getIlnessStatus();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setReasonOfDead",
						new Class[] { String.class });

				String value9 = oldCplModel.getReasonOfDead();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setPersonType",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getPersonType());

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

	public static Object translateInputTempPlantQuarantine(
		BaseModel<?> oldModel) {
		TempPlantQuarantineClp oldCplModel = (TempPlantQuarantineClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempPlantQuarantineImpl",
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

				Method method4 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value4 = oldCplModel.getUserCreated();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getDocumentYear());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value6 = oldCplModel.getNameOfShip();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setFlagStateOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getFlagStateOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value8 = oldCplModel.getNameOfMaster();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setDoctorName",
						new Class[] { String.class });

				String value9 = oldCplModel.getDoctorName();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setNumberOfCrew",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getNumberOfCrew());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNumberOfPassengers",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getNumberOfPassengers());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getLastPortOfCallCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setNextPortOfCallCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getNextPortOfCallCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setFirstPortOfLoadingCode",
						new Class[] { String.class });

				String value14 = oldCplModel.getFirstPortOfLoadingCode();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDateOfdeparture",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getDateOfdeparture();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setPlantNameFirst",
						new Class[] { String.class });

				String value16 = oldCplModel.getPlantNameFirst();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setPlantNameBetween",
						new Class[] { String.class });

				String value17 = oldCplModel.getPlantNameBetween();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setPlantNameThis",
						new Class[] { String.class });

				String value18 = oldCplModel.getPlantNameThis();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value19 = oldCplModel.getSignPlace();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value20 = oldCplModel.getSignDate();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value21 = new Integer(oldCplModel.getMasterSigned());

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value22 = new Integer(oldCplModel.getMasterSignedImage());

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value23 = new Long(oldCplModel.getAttachedFile());

				method23.invoke(newModel, value23);

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

	public static Object translateInputTempShipSecurityMessage(
		BaseModel<?> oldModel) {
		TempShipSecurityMessageClp oldCplModel = (TempShipSecurityMessageClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempShipSecurityMessageImpl",
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

				Method method3 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getDocumentYear());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setShipSecurityCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getShipSecurityCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value5 = new Long(oldCplModel.getDocumentName());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value6 = oldCplModel.getUserCreated();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getShipAgencyCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNameOfShipAgent",
						new Class[] { String.class });

				String value8 = oldCplModel.getNameOfShipAgent();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setShipName",
						new Class[] { String.class });

				String value9 = oldCplModel.getShipName();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getShipTypeCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getStateCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setShipCaptain",
						new Class[] { String.class });

				String value12 = oldCplModel.getShipCaptain();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setImo",
						new Class[] { String.class });

				String value13 = oldCplModel.getImo();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setGrt",
						new Class[] { Double.TYPE });

				Double value14 = new Double(oldCplModel.getGrt());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setUnitGRT",
						new Class[] { String.class });

				String value15 = oldCplModel.getUnitGRT();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setCrewNumber",
						new Class[] { Long.TYPE });

				Long value16 = new Long(oldCplModel.getCrewNumber());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setArrivalDate",
						new Class[] { Date.class });

				Date value17 = oldCplModel.getArrivalDate();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setPurposeCode",
						new Class[] { String.class });

				String value18 = oldCplModel.getPurposeCode();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setPurposeSpecified",
						new Class[] { String.class });

				String value19 = oldCplModel.getPurposeSpecified();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value20 = oldCplModel.getPortRegionCode();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setPortWharfCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getPortWharfCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setShipAgencyPhone",
						new Class[] { String.class });

				String value22 = oldCplModel.getShipAgencyPhone();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setShipAgencyFax",
						new Class[] { String.class });

				String value23 = oldCplModel.getShipAgencyFax();

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setIsInternationalShipSecurity",
						new Class[] { Integer.TYPE });

				Integer value24 = new Integer(oldCplModel.getIsInternationalShipSecurity());

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setNameOfISSC",
						new Class[] { String.class });

				String value25 = oldCplModel.getNameOfISSC();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setDateOfISSC",
						new Class[] { Date.class });

				Date value26 = oldCplModel.getDateOfISSC();

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setDateOfExpiryISSC",
						new Class[] { Date.class });

				Date value27 = oldCplModel.getDateOfExpiryISSC();

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setSecurityLevelCode",
						new Class[] { String.class });

				String value28 = oldCplModel.getSecurityLevelCode();

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setSecurityFromDate",
						new Class[] { Date.class });

				Date value29 = oldCplModel.getSecurityFromDate();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setIsAdditionalSecurityMeasures",
						new Class[] { Integer.TYPE });

				Integer value30 = new Integer(oldCplModel.getIsAdditionalSecurityMeasures());

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setAdditionalSecurityDetail",
						new Class[] { String.class });

				String value31 = oldCplModel.getAdditionalSecurityDetail();

				method31.invoke(newModel, value31);

				Method method32 = newModelClass.getMethod("setIsMaintainSecurity",
						new Class[] { Integer.TYPE });

				Integer value32 = new Integer(oldCplModel.getIsMaintainSecurity());

				method32.invoke(newModel, value32);

				Method method33 = newModelClass.getMethod("setMaintainSecurityDetail",
						new Class[] { String.class });

				String value33 = oldCplModel.getMaintainSecurityDetail();

				method33.invoke(newModel, value33);

				Method method34 = newModelClass.getMethod("setLatitude",
						new Class[] { String.class });

				String value34 = oldCplModel.getLatitude();

				method34.invoke(newModel, value34);

				Method method35 = newModelClass.getMethod("setLongitude",
						new Class[] { String.class });

				String value35 = oldCplModel.getLongitude();

				method35.invoke(newModel, value35);

				Method method36 = newModelClass.getMethod("setHasShipSecurityPortItems",
						new Class[] { Integer.TYPE });

				Integer value36 = new Integer(oldCplModel.getHasShipSecurityPortItems());

				method36.invoke(newModel, value36);

				Method method37 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value37 = oldCplModel.getSignPlace();

				method37.invoke(newModel, value37);

				Method method38 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value38 = oldCplModel.getSignDate();

				method38.invoke(newModel, value38);

				Method method39 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value39 = new Integer(oldCplModel.getMasterSigned());

				method39.invoke(newModel, value39);

				Method method40 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value40 = new Integer(oldCplModel.getMasterSignedImage());

				method40.invoke(newModel, value40);

				Method method41 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value41 = oldCplModel.getCallSign();

				method41.invoke(newModel, value41);

				Method method42 = newModelClass.getMethod("setArrivalPortCode",
						new Class[] { String.class });

				String value42 = oldCplModel.getArrivalPortCode();

				method42.invoke(newModel, value42);

				Method method43 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value43 = oldCplModel.getPortHarbourCode();

				method43.invoke(newModel, value43);

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

	public static Object translateInputTempShipSecurityPortItems(
		BaseModel<?> oldModel) {
		TempShipSecurityPortItemsClp oldCplModel = (TempShipSecurityPortItemsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempShipSecurityPortItemsImpl",
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

				Method method2 = newModelClass.getMethod("setShipSecurityPortItemCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipSecurityPortItemCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortCode();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setDateArrival",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getDateArrival();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setDateDeparture",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getDateDeparture();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSecurityLevelCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getSecurityLevelCode();

				method6.invoke(newModel, value6);

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

	public static Object translateInputTempShipStoresDeclaration(
		BaseModel<?> oldModel) {
		TempShipStoresDeclarationClp oldCplModel = (TempShipStoresDeclarationClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempShipStoresDeclarationImpl",
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

				Method method5 = newModelClass.getMethod("setUserCreated",
						new Class[] { String.class });

				String value5 = oldCplModel.getUserCreated();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setIsArrival",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getIsArrival());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setNameOfShip",
						new Class[] { String.class });

				String value7 = oldCplModel.getNameOfShip();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setImoNumber",
						new Class[] { String.class });

				String value8 = oldCplModel.getImoNumber();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCallsign",
						new Class[] { String.class });

				String value9 = oldCplModel.getCallsign();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setVoyageNumber",
						new Class[] { String.class });

				String value10 = oldCplModel.getVoyageNumber();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNationalityOfShip",
						new Class[] { String.class });

				String value11 = oldCplModel.getNationalityOfShip();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setPortOfArrivalCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getPortOfArrivalCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setDateOfArrival",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getDateOfArrival();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setLastPortOfCallCode",
						new Class[] { String.class });

				String value14 = oldCplModel.getLastPortOfCallCode();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setNumberOfPersonsOnBoat",
						new Class[] { Integer.TYPE });

				Integer value15 = new Integer(oldCplModel.getNumberOfPersonsOnBoat());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setPeriodOfStay",
						new Class[] { String.class });

				String value16 = oldCplModel.getPeriodOfStay();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setPeriodOfStayUnit",
						new Class[] { String.class });

				String value17 = oldCplModel.getPeriodOfStayUnit();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setNameOfMaster",
						new Class[] { String.class });

				String value18 = oldCplModel.getNameOfMaster();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setListShipsStores",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getListShipsStores());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setSignPlace",
						new Class[] { String.class });

				String value20 = oldCplModel.getSignPlace();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setSignDate",
						new Class[] { Date.class });

				Date value21 = oldCplModel.getSignDate();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setMasterSigned",
						new Class[] { Integer.TYPE });

				Integer value22 = new Integer(oldCplModel.getMasterSigned());

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setMasterSignedImage",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getMasterSignedImage());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setAttachedFile",
						new Class[] { Long.TYPE });

				Long value24 = new Long(oldCplModel.getAttachedFile());

				method24.invoke(newModel, value24);

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

	public static Object translateInputTempShipStoresItems(
		BaseModel<?> oldModel) {
		TempShipStoresItemsClp oldCplModel = (TempShipStoresItemsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempShipStoresItemsImpl",
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

				Method method2 = newModelClass.getMethod("setShipsstoreItemCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipsstoreItemCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setNameOfArticle",
						new Class[] { String.class });

				String value3 = oldCplModel.getNameOfArticle();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setQuantity",
						new Class[] { String.class });

				String value4 = oldCplModel.getQuantity();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setQuantityUnit",
						new Class[] { String.class });

				String value5 = oldCplModel.getQuantityUnit();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setLocationOnBoat",
						new Class[] { String.class });

				String value6 = oldCplModel.getLocationOnBoat();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setUseInBoat",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getUseInBoat());

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

	public static Object translateInputTempUnitGeneral(BaseModel<?> oldModel) {
		TempUnitGeneralClp oldCplModel = (TempUnitGeneralClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempUnitGeneralImpl",
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

				Method method2 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value2 = new Long(oldCplModel.getDocumentName());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getDocumentYear());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGrossTonnageUnit",
						new Class[] { String.class });

				String value4 = oldCplModel.getGrossTonnageUnit();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNetTonnageUnit",
						new Class[] { String.class });

				String value5 = oldCplModel.getNetTonnageUnit();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setUnitDWT",
						new Class[] { String.class });

				String value6 = oldCplModel.getUnitDWT();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setUnitLOA",
						new Class[] { String.class });

				String value7 = oldCplModel.getUnitLOA();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setUnitBreadth",
						new Class[] { String.class });

				String value8 = oldCplModel.getUnitBreadth();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setUnitClearanceHeight",
						new Class[] { String.class });

				String value9 = oldCplModel.getUnitClearanceHeight();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setUnitShownDraft",
						new Class[] { String.class });

				String value10 = oldCplModel.getUnitShownDraft();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setUnitShownDraftxF",
						new Class[] { String.class });

				String value11 = oldCplModel.getUnitShownDraftxF();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setUnitShownDraftxA",
						new Class[] { String.class });

				String value12 = oldCplModel.getUnitShownDraftxA();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setUnitHorsePower",
						new Class[] { String.class });

				String value13 = oldCplModel.getUnitHorsePower();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setUnitRemainingOnBoardxB",
						new Class[] { String.class });

				String value14 = oldCplModel.getUnitRemainingOnBoardxB();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setUnitRemainingOnBoardxS",
						new Class[] { String.class });

				String value15 = oldCplModel.getUnitRemainingOnBoardxS();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setUnitFO",
						new Class[] { String.class });

				String value16 = oldCplModel.getUnitFO();

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setUnitLO",
						new Class[] { String.class });

				String value17 = oldCplModel.getUnitLO();

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setUnitFW",
						new Class[] { String.class });

				String value18 = oldCplModel.getUnitFW();

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setUnitDO",
						new Class[] { String.class });

				String value19 = oldCplModel.getUnitDO();

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setUnitSludgeOil",
						new Class[] { String.class });

				String value20 = oldCplModel.getUnitSludgeOil();

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

	public static Object translateInputTempWasteList(BaseModel<?> oldModel) {
		TempWasteListClp oldCplModel = (TempWasteListClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.TempWasteListImpl",
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

				Method method2 = newModelClass.getMethod("setDocumentName",
						new Class[] { Long.TYPE });

				Long value2 = new Long(oldCplModel.getDocumentName());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentYear",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getDocumentYear());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setTypeCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getTypeCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setTypeName",
						new Class[] { String.class });

				String value5 = oldCplModel.getTypeName();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setWeight",
						new Class[] { Double.TYPE });

				Double value6 = new Double(oldCplModel.getWeight());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setUnit",
						new Class[] { String.class });

				String value7 = oldCplModel.getUnit();

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

	public static Object translateInputViewHoanThanhThuTuc(
		BaseModel<?> oldModel) {
		ViewHoanThanhThuTucClp oldCplModel = (ViewHoanThanhThuTucClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.noticeandmessage.model.impl.ViewHoanThanhThuTucImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setCVHH",
						new Class[] { String.class });

				String value0 = oldCplModel.getCVHH();

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setMaritimeOrder",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getMaritimeOrder());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setNC_KYSO",
						new Class[] { Integer.TYPE });

				Integer value2 = new Integer(oldCplModel.getNC_KYSO());

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setXC_KYSO",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getXC_KYSO());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setQC_KYSO",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getQC_KYSO());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setVC_KYSO",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getVC_KYSO());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRC_KYSO",
						new Class[] { Integer.TYPE });

				Integer value6 = new Integer(oldCplModel.getRC_KYSO());

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setCCV_KYSO",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getCCV_KYSO());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setCCR_KYSO",
						new Class[] { Integer.TYPE });

				Integer value8 = new Integer(oldCplModel.getCCR_KYSO());

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setVCDK_KYSO",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getVCDK_KYSO());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setRCDK_KYSO",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getRCDK_KYSO());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setNCDK_KYSO",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getNCDK_KYSO());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setXCDK_KYSO",
						new Class[] { Integer.TYPE });

				Integer value12 = new Integer(oldCplModel.getXCDK_KYSO());

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setVCTND_KYSO",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getVCTND_KYSO());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setRCTND_KYSO",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getRCTND_KYSO());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setNC_DUYET",
						new Class[] { Integer.TYPE });

				Integer value15 = new Integer(oldCplModel.getNC_DUYET());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setXC_DUYET",
						new Class[] { Integer.TYPE });

				Integer value16 = new Integer(oldCplModel.getXC_DUYET());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setQC_DUYET",
						new Class[] { Integer.TYPE });

				Integer value17 = new Integer(oldCplModel.getQC_DUYET());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setVC_DUYET",
						new Class[] { Integer.TYPE });

				Integer value18 = new Integer(oldCplModel.getVC_DUYET());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setRC_DUYET",
						new Class[] { Integer.TYPE });

				Integer value19 = new Integer(oldCplModel.getRC_DUYET());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setCCV_DUYET",
						new Class[] { Integer.TYPE });

				Integer value20 = new Integer(oldCplModel.getCCV_DUYET());

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setCCR_DUYET",
						new Class[] { Integer.TYPE });

				Integer value21 = new Integer(oldCplModel.getCCR_DUYET());

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setVCDK_DUYET",
						new Class[] { Integer.TYPE });

				Integer value22 = new Integer(oldCplModel.getVCDK_DUYET());

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setRCDK_DUYET",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getRCDK_DUYET());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setNCDK_DUYET",
						new Class[] { Integer.TYPE });

				Integer value24 = new Integer(oldCplModel.getNCDK_DUYET());

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setXCDK_DUYET",
						new Class[] { Integer.TYPE });

				Integer value25 = new Integer(oldCplModel.getXCDK_DUYET());

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setVCTND_DUYET",
						new Class[] { Integer.TYPE });

				Integer value26 = new Integer(oldCplModel.getVCTND_DUYET());

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setRCTND_DUYET",
						new Class[] { Integer.TYPE });

				Integer value27 = new Integer(oldCplModel.getRCTND_DUYET());

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setNCPTTND_DUYET",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getNCPTTND_DUYET());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setXCPTTND_DUYET",
						new Class[] { Integer.TYPE });

				Integer value29 = new Integer(oldCplModel.getXCPTTND_DUYET());

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setNCPTTND_KYSO",
						new Class[] { Integer.TYPE });

				Integer value30 = new Integer(oldCplModel.getNCPTTND_KYSO());

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setXCPTTND_KYSO",
						new Class[] { Integer.TYPE });

				Integer value31 = new Integer(oldCplModel.getXCPTTND_KYSO());

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
					"vn.gt.dao.noticeandmessage.model.impl.HistoryInterfaceRequestImpl")) {
			return translateOutputHistoryInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.HistoryInterfaceRequestFieldImpl")) {
			return translateOutputHistoryInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestImpl")) {
			return translateOutputInterfaceRequest(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.InterfaceRequestFieldImpl")) {
			return translateOutputInterfaceRequestField(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceImpl")) {
			return translateOutputIssueAcceptance(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceForTransitImpl")) {
			return translateOutputIssueAcceptanceForTransit(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.IssuePermissionForTransitImpl")) {
			return translateOutputIssuePermissionForTransit(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceImpl")) {
			return translateOutputIssuePortClearance(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl")) {
			return translateOutputIssueShiftingOrder(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderChanelImpl")) {
			return translateOutputIssueShiftingOrderChanel(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.ModifyImpl")) {
			return translateOutputModify(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.NoticeShipMessageImpl")) {
			return translateOutputNoticeShipMessage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempAnimalQuarantineImpl")) {
			return translateOutputTempAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempAttachmentDeclarationHealthImpl")) {
			return translateOutputTempAttachmentDeclarationHealth(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempCargoDeclarationImpl")) {
			return translateOutputTempCargoDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempCargoItemsImpl")) {
			return translateOutputTempCargoItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempCrewDetailsImpl")) {
			return translateOutputTempCrewDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsDeclarationImpl")) {
			return translateOutputTempCrewEffectsDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempCrewEffectsItemsImpl")) {
			return translateOutputTempCrewEffectsItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempCrewListImpl")) {
			return translateOutputTempCrewList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsItemsImpl")) {
			return translateOutputTempDangerousGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsNanifestImpl")) {
			return translateOutputTempDangerousGoodsNanifest(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempDeclarationForAnimalQuarantineImpl")) {
			return translateOutputTempDeclarationForAnimalQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempDeclarationForPlantQuarantineImpl")) {
			return translateOutputTempDeclarationForPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempDeclarationOfHealthImpl")) {
			return translateOutputTempDeclarationOfHealth(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl")) {
			return translateOutputTempDocument(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl")) {
			return translateOutputTempGeneralDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempGoodsItemsImpl")) {
			return translateOutputTempGoodsItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListImpl")) {
			return translateOutputTempHealthCrewPassengerList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionImpl")) {
			return translateOutputTempHealthQuestion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempMaritimePaymentConfigImpl")) {
			return translateOutputTempMaritimePaymentConfig(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl")) {
			return translateOutputTempNoTiceShipMessage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempPassengerDetailsImpl")) {
			return translateOutputTempPassengerDetails(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempPassengerListImpl")) {
			return translateOutputTempPassengerList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempPersonListImpl")) {
			return translateOutputTempPersonList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempPlantQuarantineImpl")) {
			return translateOutputTempPlantQuarantine(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempShipSecurityMessageImpl")) {
			return translateOutputTempShipSecurityMessage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempShipSecurityPortItemsImpl")) {
			return translateOutputTempShipSecurityPortItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempShipStoresDeclarationImpl")) {
			return translateOutputTempShipStoresDeclaration(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempShipStoresItemsImpl")) {
			return translateOutputTempShipStoresItems(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempUnitGeneralImpl")) {
			return translateOutputTempUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.TempWasteListImpl")) {
			return translateOutputTempWasteList(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.noticeandmessage.model.impl.ViewHoanThanhThuTucImpl")) {
			return translateOutputViewHoanThanhThuTuc(oldModel);
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

	public static Object translateOutputHistoryInterfaceRequest(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				HistoryInterfaceRequestClp newModel = new HistoryInterfaceRequestClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getOrganizationCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setOrganizationCode(value2);

				Method method3 = oldModelClass.getMethod("getLocCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setLocCode(value3);

				Method method4 = oldModelClass.getMethod("getRequestDate");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setRequestDate(value4);

				Method method5 = oldModelClass.getMethod("getRequestedDate");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value5);

				Method method6 = oldModelClass.getMethod("getRequestDirection");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setRequestDirection(value6);

				Method method7 = oldModelClass.getMethod("getRequestState");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value7);

				Method method8 = oldModelClass.getMethod(
						"getRequestResponseTime");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestResponseTime(value8);

				Method method9 = oldModelClass.getMethod("getDocumentType");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value9);

				Method method10 = oldModelClass.getMethod("getBusinessType");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessType(value10);

				Method method11 = oldModelClass.getMethod("getFunctionType");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setFunctionType(value11);

				Method method12 = oldModelClass.getMethod("getRequestContent");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setRequestContent(value12);

				Method method13 = oldModelClass.getMethod("getSenderName");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSenderName(value13);

				Method method14 = oldModelClass.getMethod("getRequestVersion");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setRequestVersion(value14);

				Method method15 = oldModelClass.getMethod("getSenderIdentify");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setSenderIdentify(value15);

				Method method16 = oldModelClass.getMethod("getReceiverName");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverName(value16);

				Method method17 = oldModelClass.getMethod("getSendingDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setSendingDate(value17);

				Method method18 = oldModelClass.getMethod("getReceiverIdentify");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverIdentify(value18);

				Method method19 = oldModelClass.getMethod("getRemarks");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value19);

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

	public static Object translateOutputHistoryInterfaceRequestField(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				HistoryInterfaceRequestFieldClp newModel = new HistoryInterfaceRequestFieldClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getOrganizationCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setOrganizationCode(value2);

				Method method3 = oldModelClass.getMethod("getLocCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setLocCode(value3);

				Method method4 = oldModelClass.getMethod("getRequestDate");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setRequestDate(value4);

				Method method5 = oldModelClass.getMethod("getRequestedDate");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value5);

				Method method6 = oldModelClass.getMethod("getRequestDirection");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setRequestDirection(value6);

				Method method7 = oldModelClass.getMethod("getRequestState");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value7);

				Method method8 = oldModelClass.getMethod(
						"getRequestResponseTime");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestResponseTime(value8);

				Method method9 = oldModelClass.getMethod("getDocumentType");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value9);

				Method method10 = oldModelClass.getMethod("getBusinessType");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessType(value10);

				Method method11 = oldModelClass.getMethod("getFunctionType");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setFunctionType(value11);

				Method method12 = oldModelClass.getMethod("getSenderName");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setSenderName(value12);

				Method method13 = oldModelClass.getMethod("getRequestVersion");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setRequestVersion(value13);

				Method method14 = oldModelClass.getMethod("getSenderIdentify");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setSenderIdentify(value14);

				Method method15 = oldModelClass.getMethod("getReceiverName");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverName(value15);

				Method method16 = oldModelClass.getMethod("getSendingDate");

				Date value16 = (Date)method16.invoke(oldModel, (Object[])null);

				newModel.setSendingDate(value16);

				Method method17 = oldModelClass.getMethod("getReceiverIdentify");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverIdentify(value17);

				Method method18 = oldModelClass.getMethod("getRemarks");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value18);

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

	public static Object translateOutputInterfaceRequest(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				InterfaceRequestClp newModel = new InterfaceRequestClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getOrganizationCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setOrganizationCode(value2);

				Method method3 = oldModelClass.getMethod("getLocCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setLocCode(value3);

				Method method4 = oldModelClass.getMethod("getRequestDate");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setRequestDate(value4);

				Method method5 = oldModelClass.getMethod("getRequestedDate");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value5);

				Method method6 = oldModelClass.getMethod("getRequestDirection");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setRequestDirection(value6);

				Method method7 = oldModelClass.getMethod("getRequestState");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value7);

				Method method8 = oldModelClass.getMethod(
						"getRequestResponseTime");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestResponseTime(value8);

				Method method9 = oldModelClass.getMethod("getDocumentType");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value9);

				Method method10 = oldModelClass.getMethod("getDocumentNameRef");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentNameRef(value10);

				Method method11 = oldModelClass.getMethod("getBusinessType");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessType(value11);

				Method method12 = oldModelClass.getMethod("getFunctionType");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setFunctionType(value12);

				Method method13 = oldModelClass.getMethod("getRequestContent");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setRequestContent(value13);

				Method method14 = oldModelClass.getMethod("getSenderName");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setSenderName(value14);

				Method method15 = oldModelClass.getMethod("getRequestVersion");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setRequestVersion(value15);

				Method method16 = oldModelClass.getMethod("getSenderIdentify");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSenderIdentify(value16);

				Method method17 = oldModelClass.getMethod("getReceiverName");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverName(value17);

				Method method18 = oldModelClass.getMethod("getSendingDate");

				Date value18 = (Date)method18.invoke(oldModel, (Object[])null);

				newModel.setSendingDate(value18);

				Method method19 = oldModelClass.getMethod("getReceiverIdentify");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverIdentify(value19);

				Method method20 = oldModelClass.getMethod("getRemarks");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value20);

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

	public static Object translateOutputInterfaceRequestField(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				InterfaceRequestFieldClp newModel = new InterfaceRequestFieldClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getOrganizationCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setOrganizationCode(value2);

				Method method3 = oldModelClass.getMethod("getLocCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setLocCode(value3);

				Method method4 = oldModelClass.getMethod("getRequestDate");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setRequestDate(value4);

				Method method5 = oldModelClass.getMethod("getRequestedDate");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value5);

				Method method6 = oldModelClass.getMethod("getRequestDirection");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setRequestDirection(value6);

				Method method7 = oldModelClass.getMethod("getRequestState");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value7);

				Method method8 = oldModelClass.getMethod(
						"getRequestResponseTime");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setRequestResponseTime(value8);

				Method method9 = oldModelClass.getMethod("getDocumentType");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value9);

				Method method10 = oldModelClass.getMethod("getDocumentNameRef");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentNameRef(value10);

				Method method11 = oldModelClass.getMethod("getBusinessType");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setBusinessType(value11);

				Method method12 = oldModelClass.getMethod("getFunctionType");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setFunctionType(value12);

				Method method13 = oldModelClass.getMethod("getSenderName");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSenderName(value13);

				Method method14 = oldModelClass.getMethod("getRequestVersion");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setRequestVersion(value14);

				Method method15 = oldModelClass.getMethod("getSenderIdentify");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setSenderIdentify(value15);

				Method method16 = oldModelClass.getMethod("getReceiverName");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverName(value16);

				Method method17 = oldModelClass.getMethod("getSendingDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setSendingDate(value17);

				Method method18 = oldModelClass.getMethod("getReceiverIdentify");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setReceiverIdentify(value18);

				Method method19 = oldModelClass.getMethod("getRemarks");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value19);

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

	public static Object translateOutputIssueAcceptance(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				IssueAcceptanceClp newModel = new IssueAcceptanceClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getNumberPortClearance");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setNumberPortClearance(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getPortofAuthority");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortofAuthority(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getFlagStateOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value7);

				Method method8 = oldModelClass.getMethod("getNumberOfCrews");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrews(value8);

				Method method9 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value9);

				Method method10 = oldModelClass.getMethod("getCallSign");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value10);

				Method method11 = oldModelClass.getMethod("getNameOfMaster");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value11);

				Method method12 = oldModelClass.getMethod("getCargo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setCargo(value12);

				Method method13 = oldModelClass.getMethod("getVolumeCargo");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setVolumeCargo(value13);

				Method method14 = oldModelClass.getMethod("getCargoUnit");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setCargoUnit(value14);

				Method method15 = oldModelClass.getMethod("getCargoDescription");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setCargoDescription(value15);

				Method method16 = oldModelClass.getMethod("getTransitCargo");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setTransitCargo(value16);

				Method method17 = oldModelClass.getMethod(
						"getVolumeTransitCargo");

				Double value17 = (Double)method17.invoke(oldModel,
						(Object[])null);

				newModel.setVolumeTransitCargo(value17);

				Method method18 = oldModelClass.getMethod("getTransitCargoUnit");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setTransitCargoUnit(value18);

				Method method19 = oldModelClass.getMethod("getTimeOfDeparture");

				Date value19 = (Date)method19.invoke(oldModel, (Object[])null);

				newModel.setTimeOfDeparture(value19);

				Method method20 = oldModelClass.getMethod("getPortCode");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setPortCode(value20);

				Method method21 = oldModelClass.getMethod("getPortWharfCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setPortWharfCode(value21);

				Method method22 = oldModelClass.getMethod("getPortHarbourCode");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourCode(value22);

				Method method23 = oldModelClass.getMethod(
						"getNextPortOfCallCode");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortOfCallCode(value23);

				Method method24 = oldModelClass.getMethod("getValidUntil");

				Date value24 = (Date)method24.invoke(oldModel, (Object[])null);

				newModel.setValidUntil(value24);

				Method method25 = oldModelClass.getMethod("getIssueDate");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setIssueDate(value25);

				Method method26 = oldModelClass.getMethod(
						"getDirectorOfMaritime");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setDirectorOfMaritime(value26);

				Method method27 = oldModelClass.getMethod("getCertificateNo");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateNo(value27);

				Method method28 = oldModelClass.getMethod("getRequestState");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value28);

				Method method29 = oldModelClass.getMethod("getGt");

				Double value29 = (Double)method29.invoke(oldModel,
						(Object[])null);

				newModel.setGt(value29);

				Method method30 = oldModelClass.getMethod("getDwt");

				Double value30 = (Double)method30.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value30);

				Method method31 = oldModelClass.getMethod("getVersionNo");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setVersionNo(value31);

				Method method32 = oldModelClass.getMethod("getIsApproval");

				Integer value32 = (Integer)method32.invoke(oldModel,
						(Object[])null);

				newModel.setIsApproval(value32);

				Method method33 = oldModelClass.getMethod("getApprovalDate");

				Date value33 = (Date)method33.invoke(oldModel, (Object[])null);

				newModel.setApprovalDate(value33);

				Method method34 = oldModelClass.getMethod("getApprovalName");

				String value34 = (String)method34.invoke(oldModel,
						(Object[])null);

				newModel.setApprovalName(value34);

				Method method35 = oldModelClass.getMethod("getRemarks");

				String value35 = (String)method35.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value35);

				Method method36 = oldModelClass.getMethod("getIsCancel");

				Integer value36 = (Integer)method36.invoke(oldModel,
						(Object[])null);

				newModel.setIsCancel(value36);

				Method method37 = oldModelClass.getMethod("getCancelDate");

				Date value37 = (Date)method37.invoke(oldModel, (Object[])null);

				newModel.setCancelDate(value37);

				Method method38 = oldModelClass.getMethod("getCancelName");

				String value38 = (String)method38.invoke(oldModel,
						(Object[])null);

				newModel.setCancelName(value38);

				Method method39 = oldModelClass.getMethod("getCancelNote");

				String value39 = (String)method39.invoke(oldModel,
						(Object[])null);

				newModel.setCancelNote(value39);

				Method method40 = oldModelClass.getMethod("getRepresentative");

				String value40 = (String)method40.invoke(oldModel,
						(Object[])null);

				newModel.setRepresentative(value40);

				Method method41 = oldModelClass.getMethod("getSignDate");

				Date value41 = (Date)method41.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value41);

				Method method42 = oldModelClass.getMethod("getSignName");

				String value42 = (String)method42.invoke(oldModel,
						(Object[])null);

				newModel.setSignName(value42);

				Method method43 = oldModelClass.getMethod("getSignTitle");

				String value43 = (String)method43.invoke(oldModel,
						(Object[])null);

				newModel.setSignTitle(value43);

				Method method44 = oldModelClass.getMethod("getSignPlace");

				String value44 = (String)method44.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value44);

				Method method45 = oldModelClass.getMethod("getStampStatus");

				Long value45 = (Long)method45.invoke(oldModel, (Object[])null);

				newModel.setStampStatus(value45);

				Method method46 = oldModelClass.getMethod("getAttachedFile");

				Long value46 = (Long)method46.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value46);

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

	public static Object translateOutputIssueAcceptanceForTransit(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				IssueAcceptanceForTransitClp newModel = new IssueAcceptanceForTransitClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getNumberAcceptanceForTransit");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setNumberAcceptanceForTransit(value2);

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

				Method method7 = oldModelClass.getMethod("getCallSign");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value7);

				Method method8 = oldModelClass.getMethod("getNameOfMaster");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNameOfMaster(value8);

				Method method9 = oldModelClass.getMethod("getLoa");

				Double value9 = (Double)method9.invoke(oldModel, (Object[])null);

				newModel.setLoa(value9);

				Method method10 = oldModelClass.getMethod("getUnitLOA");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setUnitLOA(value10);

				Method method11 = oldModelClass.getMethod("getBreadth");

				Double value11 = (Double)method11.invoke(oldModel,
						(Object[])null);

				newModel.setBreadth(value11);

				Method method12 = oldModelClass.getMethod("getUnitBreadth");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setUnitBreadth(value12);

				Method method13 = oldModelClass.getMethod("getGrossTonnage");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setGrossTonnage(value13);

				Method method14 = oldModelClass.getMethod("getGrossTonnageUnit");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setGrossTonnageUnit(value14);

				Method method15 = oldModelClass.getMethod("getNetTonnage");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setNetTonnage(value15);

				Method method16 = oldModelClass.getMethod("getNetTonnageUnit");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setNetTonnageUnit(value16);

				Method method17 = oldModelClass.getMethod("getDwt");

				Double value17 = (Double)method17.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value17);

				Method method18 = oldModelClass.getMethod("getUnitDWT");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setUnitDWT(value18);

				Method method19 = oldModelClass.getMethod("getShownDraftxF");

				Double value19 = (Double)method19.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxF(value19);

				Method method20 = oldModelClass.getMethod("getUnitShownDraftxF");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxF(value20);

				Method method21 = oldModelClass.getMethod("getShownDraftxA");

				Double value21 = (Double)method21.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxA(value21);

				Method method22 = oldModelClass.getMethod("getUnitShownDraftxA");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxA(value22);

				Method method23 = oldModelClass.getMethod("getClearanceHeight");

				Double value23 = (Double)method23.invoke(oldModel,
						(Object[])null);

				newModel.setClearanceHeight(value23);

				Method method24 = oldModelClass.getMethod(
						"getUnitClearanceHeight");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setUnitClearanceHeight(value24);

				Method method25 = oldModelClass.getMethod(
						"getPermittedTransitFrom");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setPermittedTransitFrom(value25);

				Method method26 = oldModelClass.getMethod(
						"getPermittedTransitTo");

				Date value26 = (Date)method26.invoke(oldModel, (Object[])null);

				newModel.setPermittedTransitTo(value26);

				Method method27 = oldModelClass.getMethod("getTimeOfDeparture");

				Date value27 = (Date)method27.invoke(oldModel, (Object[])null);

				newModel.setTimeOfDeparture(value27);

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

	public static Object translateOutputIssuePermissionForTransit(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				IssuePermissionForTransitClp newModel = new IssuePermissionForTransitClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getNumberPermissionForTransit");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setNumberPermissionForTransit(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getRequestState");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value5);

				Method method6 = oldModelClass.getMethod("getPortofAuthority");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortofAuthority(value6);

				Method method7 = oldModelClass.getMethod("getNameOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value7);

				Method method8 = oldModelClass.getMethod("getFlagStateOfShip");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value8);

				Method method9 = oldModelClass.getMethod("getGt");

				Double value9 = (Double)method9.invoke(oldModel, (Object[])null);

				newModel.setGt(value9);

				Method method10 = oldModelClass.getMethod("getNumberOfCrews");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrews(value10);

				Method method11 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value11);

				Method method12 = oldModelClass.getMethod("getCallSign");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value12);

				Method method13 = oldModelClass.getMethod("getNameOfMaster");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value13);

				Method method14 = oldModelClass.getMethod("getTransitCargo");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setTransitCargo(value14);

				Method method15 = oldModelClass.getMethod("getVolumeCargo");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setVolumeCargo(value15);

				Method method16 = oldModelClass.getMethod("getCargoUnit");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setCargoUnit(value16);

				Method method17 = oldModelClass.getMethod("getCargoDescription");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setCargoDescription(value17);

				Method method18 = oldModelClass.getMethod(
						"getPermittedTransitFrom");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setPermittedTransitFrom(value18);

				Method method19 = oldModelClass.getMethod(
						"getPermittedTransitTo");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setPermittedTransitTo(value19);

				Method method20 = oldModelClass.getMethod("getTimeOfDeparture");

				Date value20 = (Date)method20.invoke(oldModel, (Object[])null);

				newModel.setTimeOfDeparture(value20);

				Method method21 = oldModelClass.getMethod("getValidUntil");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setValidUntil(value21);

				Method method22 = oldModelClass.getMethod("getDateOfSign");

				Date value22 = (Date)method22.invoke(oldModel, (Object[])null);

				newModel.setDateOfSign(value22);

				Method method23 = oldModelClass.getMethod("getUserCreated");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setUserCreated(value23);

				Method method24 = oldModelClass.getMethod(
						"getDirectorOfMaritime");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setDirectorOfMaritime(value24);

				Method method25 = oldModelClass.getMethod("getCreatedDate");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setCreatedDate(value25);

				Method method26 = oldModelClass.getMethod("getCertificateNo");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateNo(value26);

				Method method27 = oldModelClass.getMethod("getVersionNo");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setVersionNo(value27);

				Method method28 = oldModelClass.getMethod("getIsApproval");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setIsApproval(value28);

				Method method29 = oldModelClass.getMethod("getApprovalDate");

				Date value29 = (Date)method29.invoke(oldModel, (Object[])null);

				newModel.setApprovalDate(value29);

				Method method30 = oldModelClass.getMethod("getApprovalName");

				String value30 = (String)method30.invoke(oldModel,
						(Object[])null);

				newModel.setApprovalName(value30);

				Method method31 = oldModelClass.getMethod("getRemarks");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value31);

				Method method32 = oldModelClass.getMethod("getIsCancel");

				Integer value32 = (Integer)method32.invoke(oldModel,
						(Object[])null);

				newModel.setIsCancel(value32);

				Method method33 = oldModelClass.getMethod("getCancelDate");

				Date value33 = (Date)method33.invoke(oldModel, (Object[])null);

				newModel.setCancelDate(value33);

				Method method34 = oldModelClass.getMethod("getCancelName");

				String value34 = (String)method34.invoke(oldModel,
						(Object[])null);

				newModel.setCancelName(value34);

				Method method35 = oldModelClass.getMethod("getCancelNote");

				String value35 = (String)method35.invoke(oldModel,
						(Object[])null);

				newModel.setCancelNote(value35);

				Method method36 = oldModelClass.getMethod("getRepresentative");

				String value36 = (String)method36.invoke(oldModel,
						(Object[])null);

				newModel.setRepresentative(value36);

				Method method37 = oldModelClass.getMethod(
						"getDigitalAttachedFile");

				Long value37 = (Long)method37.invoke(oldModel, (Object[])null);

				newModel.setDigitalAttachedFile(value37);

				Method method38 = oldModelClass.getMethod("getSignDate");

				Date value38 = (Date)method38.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value38);

				Method method39 = oldModelClass.getMethod("getSignName");

				String value39 = (String)method39.invoke(oldModel,
						(Object[])null);

				newModel.setSignName(value39);

				Method method40 = oldModelClass.getMethod("getSignTitle");

				String value40 = (String)method40.invoke(oldModel,
						(Object[])null);

				newModel.setSignTitle(value40);

				Method method41 = oldModelClass.getMethod("getSignPlace");

				String value41 = (String)method41.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value41);

				Method method42 = oldModelClass.getMethod("getStampStatus");

				Long value42 = (Long)method42.invoke(oldModel, (Object[])null);

				newModel.setStampStatus(value42);

				Method method43 = oldModelClass.getMethod("getAttachedFile");

				Long value43 = (Long)method43.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value43);

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

	public static Object translateOutputIssuePortClearance(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				IssuePortClearanceClp newModel = new IssuePortClearanceClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getNumberPortClearance");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setNumberPortClearance(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getPortofAuthority");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortofAuthority(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getFlagStateOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value7);

				Method method8 = oldModelClass.getMethod("getNumberOfCrews");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrews(value8);

				Method method9 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value9);

				Method method10 = oldModelClass.getMethod("getCallSign");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value10);

				Method method11 = oldModelClass.getMethod("getNameOfMaster");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value11);

				Method method12 = oldModelClass.getMethod("getCargo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setCargo(value12);

				Method method13 = oldModelClass.getMethod("getVolumeCargo");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setVolumeCargo(value13);

				Method method14 = oldModelClass.getMethod("getCargoUnit");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setCargoUnit(value14);

				Method method15 = oldModelClass.getMethod("getCargoDescription");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setCargoDescription(value15);

				Method method16 = oldModelClass.getMethod("getTransitCargo");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setTransitCargo(value16);

				Method method17 = oldModelClass.getMethod(
						"getVolumeTransitCargo");

				Double value17 = (Double)method17.invoke(oldModel,
						(Object[])null);

				newModel.setVolumeTransitCargo(value17);

				Method method18 = oldModelClass.getMethod("getTransitCargoUnit");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setTransitCargoUnit(value18);

				Method method19 = oldModelClass.getMethod("getTimeOfDeparture");

				Date value19 = (Date)method19.invoke(oldModel, (Object[])null);

				newModel.setTimeOfDeparture(value19);

				Method method20 = oldModelClass.getMethod("getNextProvinceCode");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setNextProvinceCode(value20);

				Method method21 = oldModelClass.getMethod(
						"getNextPortOfCallCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortOfCallCode(value21);

				Method method22 = oldModelClass.getMethod("getMaritimePortCode");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimePortCode(value22);

				Method method23 = oldModelClass.getMethod("getPortCode");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setPortCode(value23);

				Method method24 = oldModelClass.getMethod("getPortHarbourCode");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourCode(value24);

				Method method25 = oldModelClass.getMethod("getValidUntil");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setValidUntil(value25);

				Method method26 = oldModelClass.getMethod("getIssueDate");

				Date value26 = (Date)method26.invoke(oldModel, (Object[])null);

				newModel.setIssueDate(value26);

				Method method27 = oldModelClass.getMethod(
						"getDirectorOfMaritime");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setDirectorOfMaritime(value27);

				Method method28 = oldModelClass.getMethod("getCertificateNo");

				String value28 = (String)method28.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateNo(value28);

				Method method29 = oldModelClass.getMethod("getRequestState");

				Integer value29 = (Integer)method29.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value29);

				Method method30 = oldModelClass.getMethod("getGt");

				Double value30 = (Double)method30.invoke(oldModel,
						(Object[])null);

				newModel.setGt(value30);

				Method method31 = oldModelClass.getMethod("getDwt");

				Double value31 = (Double)method31.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value31);

				Method method32 = oldModelClass.getMethod(
						"getNextMaritimePortCode");

				String value32 = (String)method32.invoke(oldModel,
						(Object[])null);

				newModel.setNextMaritimePortCode(value32);

				Method method33 = oldModelClass.getMethod(
						"getNextPortRegionCode");

				String value33 = (String)method33.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortRegionCode(value33);

				Method method34 = oldModelClass.getMethod(
						"getNextPortHarbourCode");

				String value34 = (String)method34.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortHarbourCode(value34);

				Method method35 = oldModelClass.getMethod(
						"getNextPortWharfCode");

				String value35 = (String)method35.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortWharfCode(value35);

				Method method36 = oldModelClass.getMethod("getVersionNo");

				String value36 = (String)method36.invoke(oldModel,
						(Object[])null);

				newModel.setVersionNo(value36);

				Method method37 = oldModelClass.getMethod("getIsApproval");

				Integer value37 = (Integer)method37.invoke(oldModel,
						(Object[])null);

				newModel.setIsApproval(value37);

				Method method38 = oldModelClass.getMethod("getApprovalDate");

				Date value38 = (Date)method38.invoke(oldModel, (Object[])null);

				newModel.setApprovalDate(value38);

				Method method39 = oldModelClass.getMethod("getApprovalName");

				String value39 = (String)method39.invoke(oldModel,
						(Object[])null);

				newModel.setApprovalName(value39);

				Method method40 = oldModelClass.getMethod("getRemarks");

				String value40 = (String)method40.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value40);

				Method method41 = oldModelClass.getMethod("getIsCancel");

				Integer value41 = (Integer)method41.invoke(oldModel,
						(Object[])null);

				newModel.setIsCancel(value41);

				Method method42 = oldModelClass.getMethod("getCancelDate");

				Date value42 = (Date)method42.invoke(oldModel, (Object[])null);

				newModel.setCancelDate(value42);

				Method method43 = oldModelClass.getMethod("getCancelName");

				String value43 = (String)method43.invoke(oldModel,
						(Object[])null);

				newModel.setCancelName(value43);

				Method method44 = oldModelClass.getMethod("getCancelNote");

				String value44 = (String)method44.invoke(oldModel,
						(Object[])null);

				newModel.setCancelNote(value44);

				Method method45 = oldModelClass.getMethod("getRepresentative");

				String value45 = (String)method45.invoke(oldModel,
						(Object[])null);

				newModel.setRepresentative(value45);

				Method method46 = oldModelClass.getMethod("getSignDate");

				Date value46 = (Date)method46.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value46);

				Method method47 = oldModelClass.getMethod("getSignName");

				String value47 = (String)method47.invoke(oldModel,
						(Object[])null);

				newModel.setSignName(value47);

				Method method48 = oldModelClass.getMethod("getSignTitle");

				String value48 = (String)method48.invoke(oldModel,
						(Object[])null);

				newModel.setSignTitle(value48);

				Method method49 = oldModelClass.getMethod("getSignPlace");

				String value49 = (String)method49.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value49);

				Method method50 = oldModelClass.getMethod("getStampStatus");

				Long value50 = (Long)method50.invoke(oldModel, (Object[])null);

				newModel.setStampStatus(value50);

				Method method51 = oldModelClass.getMethod("getAttachedFile");

				Long value51 = (Long)method51.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value51);

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

	public static Object translateOutputIssueShiftingOrder(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				IssueShiftingOrderClp newModel = new IssueShiftingOrderClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getNumberShiftingOrder");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setNumberShiftingOrder(value2);

				Method method3 = oldModelClass.getMethod("getDocumentName");

				Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value3);

				Method method4 = oldModelClass.getMethod("getDocumentYear");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value4);

				Method method5 = oldModelClass.getMethod("getPortofAuthority");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortofAuthority(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getFlagStateOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value7);

				Method method8 = oldModelClass.getMethod("getAnchoringPortCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setAnchoringPortCode(value8);

				Method method9 = oldModelClass.getMethod(
						"getAnchoringPortWharfCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setAnchoringPortWharfCode(value9);

				Method method10 = oldModelClass.getMethod("getPortHarbourCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourCode(value10);

				Method method11 = oldModelClass.getMethod(
						"getShiftingPortWharfCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setShiftingPortWharfCode(value11);

				Method method12 = oldModelClass.getMethod("getShiftingDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setShiftingDate(value12);

				Method method13 = oldModelClass.getMethod("getReasonToShift");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setReasonToShift(value13);

				Method method14 = oldModelClass.getMethod("getIssueDate");

				Date value14 = (Date)method14.invoke(oldModel, (Object[])null);

				newModel.setIssueDate(value14);

				Method method15 = oldModelClass.getMethod(
						"getDirectorOfMaritime");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setDirectorOfMaritime(value15);

				Method method16 = oldModelClass.getMethod("getCertificateNo");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateNo(value16);

				Method method17 = oldModelClass.getMethod("getRequestState");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setRequestState(value17);

				Method method18 = oldModelClass.getMethod("getVersionNo");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setVersionNo(value18);

				Method method19 = oldModelClass.getMethod("getIsApproval");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setIsApproval(value19);

				Method method20 = oldModelClass.getMethod("getApprovalDate");

				Date value20 = (Date)method20.invoke(oldModel, (Object[])null);

				newModel.setApprovalDate(value20);

				Method method21 = oldModelClass.getMethod("getApprovalName");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setApprovalName(value21);

				Method method22 = oldModelClass.getMethod("getRemarks");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value22);

				Method method23 = oldModelClass.getMethod("getIsCancel");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setIsCancel(value23);

				Method method24 = oldModelClass.getMethod("getCancelDate");

				Date value24 = (Date)method24.invoke(oldModel, (Object[])null);

				newModel.setCancelDate(value24);

				Method method25 = oldModelClass.getMethod("getCancelName");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setCancelName(value25);

				Method method26 = oldModelClass.getMethod("getCancelNote");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setCancelNote(value26);

				Method method27 = oldModelClass.getMethod("getRepresentative");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setRepresentative(value27);

				Method method28 = oldModelClass.getMethod(
						"getDigitalAttachedFile");

				Long value28 = (Long)method28.invoke(oldModel, (Object[])null);

				newModel.setDigitalAttachedFile(value28);

				Method method29 = oldModelClass.getMethod("getSignDate");

				Date value29 = (Date)method29.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value29);

				Method method30 = oldModelClass.getMethod("getSignName");

				String value30 = (String)method30.invoke(oldModel,
						(Object[])null);

				newModel.setSignName(value30);

				Method method31 = oldModelClass.getMethod("getSignTitle");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setSignTitle(value31);

				Method method32 = oldModelClass.getMethod("getSignPlace");

				String value32 = (String)method32.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value32);

				Method method33 = oldModelClass.getMethod("getStampStatus");

				Integer value33 = (Integer)method33.invoke(oldModel,
						(Object[])null);

				newModel.setStampStatus(value33);

				Method method34 = oldModelClass.getMethod("getAttachedFile");

				Long value34 = (Long)method34.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value34);

				Method method35 = oldModelClass.getMethod("getShownDraftxF");

				Double value35 = (Double)method35.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxF(value35);

				Method method36 = oldModelClass.getMethod("getUnitShownDraftxF");

				String value36 = (String)method36.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxF(value36);

				Method method37 = oldModelClass.getMethod("getShownDraftxA");

				Double value37 = (Double)method37.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxA(value37);

				Method method38 = oldModelClass.getMethod("getUnitShownDraftxA");

				String value38 = (String)method38.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxA(value38);

				Method method39 = oldModelClass.getMethod("getLoa");

				Double value39 = (Double)method39.invoke(oldModel,
						(Object[])null);

				newModel.setLoa(value39);

				Method method40 = oldModelClass.getMethod("getLoaUnit");

				String value40 = (String)method40.invoke(oldModel,
						(Object[])null);

				newModel.setLoaUnit(value40);

				Method method41 = oldModelClass.getMethod("getDwt");

				Double value41 = (Double)method41.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value41);

				Method method42 = oldModelClass.getMethod("getDwtUnit");

				String value42 = (String)method42.invoke(oldModel,
						(Object[])null);

				newModel.setDwtUnit(value42);

				Method method43 = oldModelClass.getMethod("getTugBoat");

				String value43 = (String)method43.invoke(oldModel,
						(Object[])null);

				newModel.setTugBoat(value43);

				Method method44 = oldModelClass.getMethod("getFrom");

				String value44 = (String)method44.invoke(oldModel,
						(Object[])null);

				newModel.setFrom(value44);

				Method method45 = oldModelClass.getMethod("getTo");

				String value45 = (String)method45.invoke(oldModel,
						(Object[])null);

				newModel.setTo(value45);

				Method method46 = oldModelClass.getMethod(
						"getTaxCodeOfShipownersAgents");

				String value46 = (String)method46.invoke(oldModel,
						(Object[])null);

				newModel.setTaxCodeOfShipownersAgents(value46);

				Method method47 = oldModelClass.getMethod(
						"getNameOfShipownersAgents");

				String value47 = (String)method47.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfShipownersAgents(value47);

				Method method48 = oldModelClass.getMethod(
						"getShipAgencyAddress");

				String value48 = (String)method48.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyAddress(value48);

				Method method49 = oldModelClass.getMethod("getShipAgencyPhone");

				String value49 = (String)method49.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyPhone(value49);

				Method method50 = oldModelClass.getMethod("getShipAgencyFax");

				String value50 = (String)method50.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyFax(value50);

				Method method51 = oldModelClass.getMethod("getShipAgencyEmail");

				String value51 = (String)method51.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyEmail(value51);

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

	public static Object translateOutputIssueShiftingOrderChanel(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				IssueShiftingOrderChanelClp newModel = new IssueShiftingOrderChanelClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getShiftingOrderId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setShiftingOrderId(value0);

				Method method1 = oldModelClass.getMethod("getChanelCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setChanelCode(value1);

				Method method2 = oldModelClass.getMethod("getChanelName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setChanelName(value2);

				Method method3 = oldModelClass.getMethod("getOrder");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setOrder(value3);

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

	public static Object translateOutputModify(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ModifyClp newModel = new ModifyClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getModifyCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setModifyCode(value1);

				Method method2 = oldModelClass.getMethod("getModifyDesc");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setModifyDesc(value2);

				Method method3 = oldModelClass.getMethod("getOrganization");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setOrganization(value3);

				Method method4 = oldModelClass.getMethod("getDivision");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setDivision(value4);

				Method method5 = oldModelClass.getMethod("getName");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setName(value5);

				Method method6 = oldModelClass.getMethod("getModifyDate");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setModifyDate(value6);

				Method method7 = oldModelClass.getMethod("getDocumentName");

				Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value7);

				Method method8 = oldModelClass.getMethod("getDocumentYear");

				Long value8 = (Long)method8.invoke(oldModel, (Object[])null);

				newModel.setDocumentYear(value8);

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

	public static Object translateOutputNoticeShipMessage(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				NoticeShipMessageClp newModel = new NoticeShipMessageClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getNoticeShipCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setNoticeShipCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentName");

				Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value2);

				Method method3 = oldModelClass.getMethod("getUserCreated");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value3);

				Method method4 = oldModelClass.getMethod("getConfirmTime");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setConfirmTime(value4);

				Method method5 = oldModelClass.getMethod("getCallSign");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value5);

				Method method6 = oldModelClass.getMethod("getArrivalDate");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setArrivalDate(value6);

				Method method7 = oldModelClass.getMethod("getArrivalPortCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setArrivalPortCode(value7);

				Method method8 = oldModelClass.getMethod("getPortGoingToCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setPortGoingToCode(value8);

				Method method9 = oldModelClass.getMethod(
						"getNameAndAddOfShipOwners");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setNameAndAddOfShipOwners(value9);

				Method method10 = oldModelClass.getMethod("getClearanceHeight");

				Long value10 = (Long)method10.invoke(oldModel, (Object[])null);

				newModel.setClearanceHeight(value10);

				Method method11 = oldModelClass.getMethod("getShownDraft");

				Long value11 = (Long)method11.invoke(oldModel, (Object[])null);

				newModel.setShownDraft(value11);

				Method method12 = oldModelClass.getMethod("getDwt");

				Long value12 = (Long)method12.invoke(oldModel, (Object[])null);

				newModel.setDwt(value12);

				Method method13 = oldModelClass.getMethod("getShipAgencyCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyCode(value13);

				Method method14 = oldModelClass.getMethod("getPurposeCode");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setPurposeCode(value14);

				Method method15 = oldModelClass.getMethod("getCrewNumber");

				Long value15 = (Long)method15.invoke(oldModel, (Object[])null);

				newModel.setCrewNumber(value15);

				Method method16 = oldModelClass.getMethod("getPassengerNumber");

				Long value16 = (Long)method16.invoke(oldModel, (Object[])null);

				newModel.setPassengerNumber(value16);

				Method method17 = oldModelClass.getMethod(
						"getQuantityAndTypeOfCargo");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setQuantityAndTypeOfCargo(value17);

				Method method18 = oldModelClass.getMethod("getOtherPersons");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setOtherPersons(value18);

				Method method19 = oldModelClass.getMethod("getRemarks");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value19);

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

	public static Object translateOutputTempAnimalQuarantine(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempAnimalQuarantineClp newModel = new TempAnimalQuarantineClp();

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

				Method method5 = oldModelClass.getMethod("getUserCreated");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getFlagStateOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value7);

				Method method8 = oldModelClass.getMethod("getNumberOfCrew");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrew(value8);

				Method method9 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value9);

				Method method10 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value10);

				Method method11 = oldModelClass.getMethod(
						"getNextPortOfCallCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortOfCallCode(value11);

				Method method12 = oldModelClass.getMethod("getAnimalNameFirst");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setAnimalNameFirst(value12);

				Method method13 = oldModelClass.getMethod(
						"getAnimalNameBetween");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setAnimalNameBetween(value13);

				Method method14 = oldModelClass.getMethod("getAnimalNameThis");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setAnimalNameThis(value14);

				Method method15 = oldModelClass.getMethod("getNameOfMaster");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value15);

				Method method16 = oldModelClass.getMethod("getSignPlace");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value16);

				Method method17 = oldModelClass.getMethod("getSignDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value17);

				Method method18 = oldModelClass.getMethod("getMasterSigned");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value18);

				Method method19 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value19);

				Method method20 = oldModelClass.getMethod("getAttachedFile");

				Long value20 = (Long)method20.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value20);

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

	public static Object translateOutputTempAttachmentDeclarationHealth(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempAttachmentDeclarationHealthClp newModel = new TempAttachmentDeclarationHealthClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getAttachmentCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setAttachmentCode(value2);

				Method method3 = oldModelClass.getMethod(
						"getPassengerOrCrewCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPassengerOrCrewCode(value3);

				Method method4 = oldModelClass.getMethod("getName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setName(value4);

				Method method5 = oldModelClass.getMethod("getAge");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setAge(value5);

				Method method6 = oldModelClass.getMethod("getSex");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setSex(value6);

				Method method7 = oldModelClass.getMethod("getNationality");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNationality(value7);

				Method method8 = oldModelClass.getMethod(
						"getPortJoinVesselCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setPortJoinVesselCode(value8);

				Method method9 = oldModelClass.getMethod("getDateJoinVessel");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setDateJoinVessel(value9);

				Method method10 = oldModelClass.getMethod("getClassOrRating");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setClassOrRating(value10);

				Method method11 = oldModelClass.getMethod("getNatureOfIllness");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNatureOfIllness(value11);

				Method method12 = oldModelClass.getMethod(
						"getDateOfOnsetOfSymptom");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setDateOfOnsetOfSymptom(value12);

				Method method13 = oldModelClass.getMethod(
						"getReportedMedicalOfficer");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setReportedMedicalOfficer(value13);

				Method method14 = oldModelClass.getMethod("getDisposalOfCase");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setDisposalOfCase(value14);

				Method method15 = oldModelClass.getMethod("getMedicinesOrOther");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setMedicinesOrOther(value15);

				Method method16 = oldModelClass.getMethod("getComments");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setComments(value16);

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

	public static Object translateOutputTempCargoDeclaration(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempCargoDeclarationClp newModel = new TempCargoDeclarationClp();

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

				Method method4 = oldModelClass.getMethod("getUserCreated");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value4);

				Method method5 = oldModelClass.getMethod("getIsArrival");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getImoNumber");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value7);

				Method method8 = oldModelClass.getMethod("getCallsign");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setCallsign(value8);

				Method method9 = oldModelClass.getMethod("getVoyageNumber");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setVoyageNumber(value9);

				Method method10 = oldModelClass.getMethod("getPortReport");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setPortReport(value10);

				Method method11 = oldModelClass.getMethod("getFlagStateOfShip");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setFlagStateOfShip(value11);

				Method method12 = oldModelClass.getMethod("getNameOfMaster");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value12);

				Method method13 = oldModelClass.getMethod("getPortOfLoading");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfLoading(value13);

				Method method14 = oldModelClass.getMethod("getListGoods");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setListGoods(value14);

				Method method15 = oldModelClass.getMethod("getSignPlace");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value15);

				Method method16 = oldModelClass.getMethod("getSignDate");

				Date value16 = (Date)method16.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value16);

				Method method17 = oldModelClass.getMethod("getMasterSigned");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value17);

				Method method18 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value18);

				Method method19 = oldModelClass.getMethod("getAttachedFile");

				Long value19 = (Long)method19.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value19);

				Method method20 = oldModelClass.getMethod("getDocumentYear");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value20);

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

	public static Object translateOutputTempCargoItems(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempCargoItemsClp newModel = new TempCargoItemsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentName");

				Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value2);

				Method method3 = oldModelClass.getMethod("getDocumentYear");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value3);

				Method method4 = oldModelClass.getMethod("getCargoCategory");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setCargoCategory(value4);

				Method method5 = oldModelClass.getMethod("getCargoType");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setCargoType(value5);

				Method method6 = oldModelClass.getMethod("getCargoCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setCargoCode(value6);

				Method method7 = oldModelClass.getMethod("getDescription");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setDescription(value7);

				Method method8 = oldModelClass.getMethod("getQuantity");

				Double value8 = (Double)method8.invoke(oldModel, (Object[])null);

				newModel.setQuantity(value8);

				Method method9 = oldModelClass.getMethod("getUnit");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setUnit(value9);

				Method method10 = oldModelClass.getMethod("getSequence");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setSequence(value10);

				Method method11 = oldModelClass.getMethod("getModifiedDate");

				Date value11 = (Date)method11.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value11);

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

	public static Object translateOutputTempCrewDetails(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempCrewDetailsClp newModel = new TempCrewDetailsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getCrewcode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCrewcode(value2);

				Method method3 = oldModelClass.getMethod("getFamilyName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setFamilyName(value3);

				Method method4 = oldModelClass.getMethod("getGivenName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setGivenName(value4);

				Method method5 = oldModelClass.getMethod("getRankCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setRankCode(value5);

				Method method6 = oldModelClass.getMethod("getNationality");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNationality(value6);

				Method method7 = oldModelClass.getMethod("getDateOfBirth");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setDateOfBirth(value7);

				Method method8 = oldModelClass.getMethod("getPlaceOfBirth");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setPlaceOfBirth(value8);

				Method method9 = oldModelClass.getMethod("getPassportNumber");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setPassportNumber(value9);

				Method method10 = oldModelClass.getMethod("getPassportTypeCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setPassportTypeCode(value10);

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

	public static Object translateOutputTempCrewEffectsDeclaration(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempCrewEffectsDeclarationClp newModel = new TempCrewEffectsDeclarationClp();

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

				Method method4 = oldModelClass.getMethod("getUserCreated");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value4);

				Method method5 = oldModelClass.getMethod("getNameOfShip");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value5);

				Method method6 = oldModelClass.getMethod("getImoNumber");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value6);

				Method method7 = oldModelClass.getMethod("getCallsign");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setCallsign(value7);

				Method method8 = oldModelClass.getMethod("getVoyageNumber");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setVoyageNumber(value8);

				Method method9 = oldModelClass.getMethod("getFlagStateOfShip");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value9);

				Method method10 = oldModelClass.getMethod("getNameOfMaster");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value10);

				Method method11 = oldModelClass.getMethod("getListCrewEffects");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setListCrewEffects(value11);

				Method method12 = oldModelClass.getMethod("getSignPlace");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value12);

				Method method13 = oldModelClass.getMethod("getSignDate");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value13);

				Method method14 = oldModelClass.getMethod("getMasterSigned");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value14);

				Method method15 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value15 = (Integer)method15.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value15);

				Method method16 = oldModelClass.getMethod("getAttachedFile");

				Long value16 = (Long)method16.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value16);

				Method method17 = oldModelClass.getMethod("getDocumentYear");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value17);

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

	public static Object translateOutputTempCrewEffectsItems(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempCrewEffectsItemsClp newModel = new TempCrewEffectsItemsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getCrewEffectItemcode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCrewEffectItemcode(value2);

				Method method3 = oldModelClass.getMethod("getFamilyName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setFamilyName(value3);

				Method method4 = oldModelClass.getMethod("getGivenName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setGivenName(value4);

				Method method5 = oldModelClass.getMethod("getRankOrratingCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setRankOrratingCode(value5);

				Method method6 = oldModelClass.getMethod(
						"getEffectsIneligibleForRelief");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setEffectsIneligibleForRelief(value6);

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

	public static Object translateOutputTempCrewList(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempCrewListClp newModel = new TempCrewListClp();

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

				Method method5 = oldModelClass.getMethod("getUserCreated");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value5);

				Method method6 = oldModelClass.getMethod("getIsArrival");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value6);

				Method method7 = oldModelClass.getMethod("getNameOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value7);

				Method method8 = oldModelClass.getMethod("getImoNumber");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value8);

				Method method9 = oldModelClass.getMethod("getCallSign");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value9);

				Method method10 = oldModelClass.getMethod("getVoyageNumber");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value10);

				Method method11 = oldModelClass.getMethod(
						"getPortOfArrivalCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfArrivalCode(value11);

				Method method12 = oldModelClass.getMethod("getDateOfArrival");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setDateOfArrival(value12);

				Method method13 = oldModelClass.getMethod("getFlagStateOfShip");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setFlagStateOfShip(value13);

				Method method14 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value14);

				Method method15 = oldModelClass.getMethod("getCrewList");

				Integer value15 = (Integer)method15.invoke(oldModel,
						(Object[])null);

				newModel.setCrewList(value15);

				Method method16 = oldModelClass.getMethod("getSignPlace");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value16);

				Method method17 = oldModelClass.getMethod("getSignDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value17);

				Method method18 = oldModelClass.getMethod("getMasterSigned");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value18);

				Method method19 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value19);

				Method method20 = oldModelClass.getMethod("getAttachedFile");

				Long value20 = (Long)method20.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value20);

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

	public static Object translateOutputTempDangerousGoodsItems(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDangerousGoodsItemsClp newModel = new TempDangerousGoodsItemsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getDangerousGoodItemCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setDangerousGoodItemCode(value2);

				Method method3 = oldModelClass.getMethod("getRefNumber");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setRefNumber(value3);

				Method method4 = oldModelClass.getMethod("getMarksContainer");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setMarksContainer(value4);

				Method method5 = oldModelClass.getMethod("getNumberContainer");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNumberContainer(value5);

				Method method6 = oldModelClass.getMethod("getNumberOfPackage");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNumberOfPackage(value6);

				Method method7 = oldModelClass.getMethod("getKindOfPackages");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setKindOfPackages(value7);

				Method method8 = oldModelClass.getMethod(
						"getProperShippingName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setProperShippingName(value8);

				Method method9 = oldModelClass.getMethod("getGoodClass");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setGoodClass(value9);

				Method method10 = oldModelClass.getMethod("getUnNumber");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setUnNumber(value10);

				Method method11 = oldModelClass.getMethod("getPackingGroup");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setPackingGroup(value11);

				Method method12 = oldModelClass.getMethod("getSubsidiaryRisk");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setSubsidiaryRisk(value12);

				Method method13 = oldModelClass.getMethod("getFlashPoint");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setFlashPoint(value13);

				Method method14 = oldModelClass.getMethod("getMarinePollutant");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setMarinePollutant(value14);

				Method method15 = oldModelClass.getMethod("getGrossWeight");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setGrossWeight(value15);

				Method method16 = oldModelClass.getMethod("getEms");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setEms(value16);

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

	public static Object translateOutputTempDangerousGoodsNanifest(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDangerousGoodsNanifestClp newModel = new TempDangerousGoodsNanifestClp();

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

				Method method4 = oldModelClass.getMethod("getUserCreated");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value4);

				Method method5 = oldModelClass.getMethod("getNameOfShip");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value5);

				Method method6 = oldModelClass.getMethod("getFlagStateOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value6);

				Method method7 = oldModelClass.getMethod("getMasterName");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setMasterName(value7);

				Method method8 = oldModelClass.getMethod("getImoNumber");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value8);

				Method method9 = oldModelClass.getMethod("getCallsign");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCallsign(value9);

				Method method10 = oldModelClass.getMethod("getVoyageNumber");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value10);

				Method method11 = oldModelClass.getMethod(
						"getPortOfLoadingCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfLoadingCode(value11);

				Method method12 = oldModelClass.getMethod(
						"getPortOfDischargeCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfDischargeCode(value12);

				Method method13 = oldModelClass.getMethod("getShippingAgent");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setShippingAgent(value13);

				Method method14 = oldModelClass.getMethod("getAdditionalRemark");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setAdditionalRemark(value14);

				Method method15 = oldModelClass.getMethod(
						"getListDangerousGoods");

				Integer value15 = (Integer)method15.invoke(oldModel,
						(Object[])null);

				newModel.setListDangerousGoods(value15);

				Method method16 = oldModelClass.getMethod("getSignPlace");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value16);

				Method method17 = oldModelClass.getMethod("getSignDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value17);

				Method method18 = oldModelClass.getMethod("getMasterSigned");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value18);

				Method method19 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value19);

				Method method20 = oldModelClass.getMethod("getAttachedFile");

				Long value20 = (Long)method20.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value20);

				Method method21 = oldModelClass.getMethod("getDocumentYear");

				Integer value21 = (Integer)method21.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value21);

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

	public static Object translateOutputTempDeclarationForAnimalQuarantine(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDeclarationForAnimalQuarantineClp newModel = new TempDeclarationForAnimalQuarantineClp();

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

				Method method5 = oldModelClass.getMethod("getUserCreated");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getFlagStateOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value7);

				Method method8 = oldModelClass.getMethod("getNumberOfCrew");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrew(value8);

				Method method9 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value9);

				Method method10 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value10);

				Method method11 = oldModelClass.getMethod(
						"getNextPortOfCallCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortOfCallCode(value11);

				Method method12 = oldModelClass.getMethod("getAnimalNameFirst");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setAnimalNameFirst(value12);

				Method method13 = oldModelClass.getMethod(
						"getAnimalNameBetween");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setAnimalNameBetween(value13);

				Method method14 = oldModelClass.getMethod("getAnimalNameThis");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setAnimalNameThis(value14);

				Method method15 = oldModelClass.getMethod("getNameOfMaster");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value15);

				Method method16 = oldModelClass.getMethod("getSignPlace");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value16);

				Method method17 = oldModelClass.getMethod("getSignDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value17);

				Method method18 = oldModelClass.getMethod("getMasterSigned");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value18);

				Method method19 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value19);

				Method method20 = oldModelClass.getMethod("getAttachedFile");

				Long value20 = (Long)method20.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value20);

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

	public static Object translateOutputTempDeclarationForPlantQuarantine(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDeclarationForPlantQuarantineClp newModel = new TempDeclarationForPlantQuarantineClp();

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

				Method method4 = oldModelClass.getMethod("getUserCreated");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value4);

				Method method5 = oldModelClass.getMethod("getNameOfShip");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value5);

				Method method6 = oldModelClass.getMethod("getFlagStateOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value6);

				Method method7 = oldModelClass.getMethod("getNameOfMaster");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNameOfMaster(value7);

				Method method8 = oldModelClass.getMethod("getDoctorName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setDoctorName(value8);

				Method method9 = oldModelClass.getMethod("getNumberOfCrew");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrew(value9);

				Method method10 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value10);

				Method method11 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value11);

				Method method12 = oldModelClass.getMethod(
						"getNextPortOfCallCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortOfCallCode(value12);

				Method method13 = oldModelClass.getMethod(
						"getFirstPortOfLoadingCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setFirstPortOfLoadingCode(value13);

				Method method14 = oldModelClass.getMethod("getDateOfdeparture");

				Date value14 = (Date)method14.invoke(oldModel, (Object[])null);

				newModel.setDateOfdeparture(value14);

				Method method15 = oldModelClass.getMethod("getPlantNameFirst");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setPlantNameFirst(value15);

				Method method16 = oldModelClass.getMethod("getPlantNameBetween");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setPlantNameBetween(value16);

				Method method17 = oldModelClass.getMethod("getPlantNameThis");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setPlantNameThis(value17);

				Method method18 = oldModelClass.getMethod("getSignPlace");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value18);

				Method method19 = oldModelClass.getMethod("getSignDate");

				Date value19 = (Date)method19.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value19);

				Method method20 = oldModelClass.getMethod("getMasterSigned");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value20);

				Method method21 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value21 = (Integer)method21.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value21);

				Method method22 = oldModelClass.getMethod("getAttachedFile");

				Long value22 = (Long)method22.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value22);

				Method method23 = oldModelClass.getMethod("getDocumentYear");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value23);

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

	public static Object translateOutputTempDeclarationOfHealth(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDeclarationOfHealthClp newModel = new TempDeclarationOfHealthClp();

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

				Method method5 = oldModelClass.getMethod("getUserCreated");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value5);

				Method method6 = oldModelClass.getMethod("getSubmittedPortCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setSubmittedPortCode(value6);

				Method method7 = oldModelClass.getMethod("getDateSubmitted");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setDateSubmitted(value7);

				Method method8 = oldModelClass.getMethod("getNameOfShip");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value8);

				Method method9 = oldModelClass.getMethod("getRegistration");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setRegistration(value9);

				Method method10 = oldModelClass.getMethod("getImoNumber");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setImoNumber(value10);

				Method method11 = oldModelClass.getMethod("getArrivingFrom");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setArrivingFrom(value11);

				Method method12 = oldModelClass.getMethod("getSailingTo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setSailingTo(value12);

				Method method13 = oldModelClass.getMethod("getNationality");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setNationality(value13);

				Method method14 = oldModelClass.getMethod("getMasterName");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setMasterName(value14);

				Method method15 = oldModelClass.getMethod("getGrossTonnage");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setGrossTonnage(value15);

				Method method16 = oldModelClass.getMethod("getGrossTonnageUnit");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setGrossTonnageUnit(value16);

				Method method17 = oldModelClass.getMethod("getTonnage");

				Double value17 = (Double)method17.invoke(oldModel,
						(Object[])null);

				newModel.setTonnage(value17);

				Method method18 = oldModelClass.getMethod("getTonnageUnit");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setTonnageUnit(value18);

				Method method19 = oldModelClass.getMethod(
						"getCertificatecarried");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setCertificatecarried(value19);

				Method method20 = oldModelClass.getMethod("getIssuedAt");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setIssuedAt(value20);

				Method method21 = oldModelClass.getMethod("getIssueDate");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setIssueDate(value21);

				Method method22 = oldModelClass.getMethod(
						"getReInspectionrequired");

				Integer value22 = (Integer)method22.invoke(oldModel,
						(Object[])null);

				newModel.setReInspectionrequired(value22);

				Method method23 = oldModelClass.getMethod("getIsShipVisitedWHO");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setIsShipVisitedWHO(value23);

				Method method24 = oldModelClass.getMethod(
						"getVisitedWHOPortCode");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setVisitedWHOPortCode(value24);

				Method method25 = oldModelClass.getMethod("getDateOfVisitedWHO");

				Date value25 = (Date)method25.invoke(oldModel, (Object[])null);

				newModel.setDateOfVisitedWHO(value25);

				Method method26 = oldModelClass.getMethod("getListPortName");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setListPortName(value26);

				Method method27 = oldModelClass.getMethod("getDoctorName");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setDoctorName(value27);

				Method method28 = oldModelClass.getMethod("getDoctorSigndate");

				Date value28 = (Date)method28.invoke(oldModel, (Object[])null);

				newModel.setDoctorSigndate(value28);

				Method method29 = oldModelClass.getMethod("getSignPlace");

				String value29 = (String)method29.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value29);

				Method method30 = oldModelClass.getMethod("getSignDate");

				Date value30 = (Date)method30.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value30);

				Method method31 = oldModelClass.getMethod("getMasterSigned");

				Integer value31 = (Integer)method31.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value31);

				Method method32 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value32 = (Integer)method32.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value32);

				Method method33 = oldModelClass.getMethod("getAttachedFile");

				Long value33 = (Long)method33.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value33);

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

	public static Object translateOutputTempDocument(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempDocumentClp newModel = new TempDocumentClp();

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

				Method method5 = oldModelClass.getMethod("getDocumentTypeCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setDocumentTypeCode(value5);

				Method method6 = oldModelClass.getMethod("getUserCreated");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value6);

				Method method7 = oldModelClass.getMethod("getShipAgencyCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyCode(value7);

				Method method8 = oldModelClass.getMethod("getShipName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setShipName(value8);

				Method method9 = oldModelClass.getMethod("getShipTypeCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value9);

				Method method10 = oldModelClass.getMethod("getStateCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setStateCode(value10);

				Method method11 = oldModelClass.getMethod("getShipCaptain");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setShipCaptain(value11);

				Method method12 = oldModelClass.getMethod("getImo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setImo(value12);

				Method method13 = oldModelClass.getMethod("getGrt");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setGrt(value13);

				Method method14 = oldModelClass.getMethod("getNt");

				Double value14 = (Double)method14.invoke(oldModel,
						(Object[])null);

				newModel.setNt(value14);

				Method method15 = oldModelClass.getMethod("getDwt");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value15);

				Method method16 = oldModelClass.getMethod("getUnitGRT");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setUnitGRT(value16);

				Method method17 = oldModelClass.getMethod("getUnitNT");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setUnitNT(value17);

				Method method18 = oldModelClass.getMethod("getUnitDWT");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setUnitDWT(value18);

				Method method19 = oldModelClass.getMethod("getCallSign");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value19);

				Method method20 = oldModelClass.getMethod("getPreDocumentName");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setPreDocumentName(value20);

				Method method21 = oldModelClass.getMethod("getCreatedDate");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setCreatedDate(value21);

				Method method22 = oldModelClass.getMethod("getLastModifiedDate");

				Date value22 = (Date)method22.invoke(oldModel, (Object[])null);

				newModel.setLastModifiedDate(value22);

				Method method23 = oldModelClass.getMethod("getFlowFlag");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setFlowFlag(value23);

				Method method24 = oldModelClass.getMethod(
						"getDocumentStatusCode");

				Integer value24 = (Integer)method24.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentStatusCode(value24);

				Method method25 = oldModelClass.getMethod("getLocationCode");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setLocationCode(value25);

				Method method26 = oldModelClass.getMethod("getMaritimeCode");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimeCode(value26);

				Method method27 = oldModelClass.getMethod("getPortRegionCode");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setPortRegionCode(value27);

				Method method28 = oldModelClass.getMethod("getPortCode");

				String value28 = (String)method28.invoke(oldModel,
						(Object[])null);

				newModel.setPortCode(value28);

				Method method29 = oldModelClass.getMethod("getLastPortCode");

				String value29 = (String)method29.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortCode(value29);

				Method method30 = oldModelClass.getMethod("getShipPosition");

				Integer value30 = (Integer)method30.invoke(oldModel,
						(Object[])null);

				newModel.setShipPosition(value30);

				Method method31 = oldModelClass.getMethod("getShipOwnerCode");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setShipOwnerCode(value31);

				Method method32 = oldModelClass.getMethod(
						"getArrivalShipAgency");

				String value32 = (String)method32.invoke(oldModel,
						(Object[])null);

				newModel.setArrivalShipAgency(value32);

				Method method33 = oldModelClass.getMethod(
						"getDepartureShipAgency");

				String value33 = (String)method33.invoke(oldModel,
						(Object[])null);

				newModel.setDepartureShipAgency(value33);

				Method method34 = oldModelClass.getMethod("getShipDateFrom");

				Date value34 = (Date)method34.invoke(oldModel, (Object[])null);

				newModel.setShipDateFrom(value34);

				Method method35 = oldModelClass.getMethod("getShipDateTo");

				Date value35 = (Date)method35.invoke(oldModel, (Object[])null);

				newModel.setShipDateTo(value35);

				Method method36 = oldModelClass.getMethod("getUpgradeVersion");

				Integer value36 = (Integer)method36.invoke(oldModel,
						(Object[])null);

				newModel.setUpgradeVersion(value36);

				Method method37 = oldModelClass.getMethod(
						"getNameOfShipownersAgents");

				String value37 = (String)method37.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfShipownersAgents(value37);

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

	public static Object translateOutputTempGeneralDeclaration(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempGeneralDeclarationClp newModel = new TempGeneralDeclarationClp();

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

				Method method4 = oldModelClass.getMethod("getDocumentReference");

				Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

				newModel.setDocumentReference(value4);

				Method method5 = oldModelClass.getMethod("getDocumentYear");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value5);

				Method method6 = oldModelClass.getMethod("getUserCreated");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value6);

				Method method7 = oldModelClass.getMethod("getIsArrival");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value7);

				Method method8 = oldModelClass.getMethod("getNameOfShip");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value8);

				Method method9 = oldModelClass.getMethod("getShipTypeCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value9);

				Method method10 = oldModelClass.getMethod("getImoNumber");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setImoNumber(value10);

				Method method11 = oldModelClass.getMethod("getCallSign");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value11);

				Method method12 = oldModelClass.getMethod("getVoyageNumber");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value12);

				Method method13 = oldModelClass.getMethod(
						"getPortOfArrivalCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfArrivalCode(value13);

				Method method14 = oldModelClass.getMethod("getDateOfArrival");

				Date value14 = (Date)method14.invoke(oldModel, (Object[])null);

				newModel.setDateOfArrival(value14);

				Method method15 = oldModelClass.getMethod("getPortHarbourCode");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourCode(value15);

				Method method16 = oldModelClass.getMethod("getPortRegionCode");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setPortRegionCode(value16);

				Method method17 = oldModelClass.getMethod("getPortWharfCode");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setPortWharfCode(value17);

				Method method18 = oldModelClass.getMethod("getFlagStateOfShip");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setFlagStateOfShip(value18);

				Method method19 = oldModelClass.getMethod("getNameOfMaster");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value19);

				Method method20 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value20);

				Method method21 = oldModelClass.getMethod(
						"getCertificateOfRegistryNumber");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateOfRegistryNumber(value21);

				Method method22 = oldModelClass.getMethod(
						"getCertificateOfRegistryDate");

				Date value22 = (Date)method22.invoke(oldModel, (Object[])null);

				newModel.setCertificateOfRegistryDate(value22);

				Method method23 = oldModelClass.getMethod(
						"getCertificateOfRegistryPortName");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateOfRegistryPortName(value23);

				Method method24 = oldModelClass.getMethod(
						"getTaxCodeOfShipownersAgents");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setTaxCodeOfShipownersAgents(value24);

				Method method25 = oldModelClass.getMethod(
						"getNameOfShipownersAgents");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfShipownersAgents(value25);

				Method method26 = oldModelClass.getMethod(
						"getShipAgencyAddress");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyAddress(value26);

				Method method27 = oldModelClass.getMethod("getShipAgencyPhone");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyPhone(value27);

				Method method28 = oldModelClass.getMethod("getShipAgencyFax");

				String value28 = (String)method28.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyFax(value28);

				Method method29 = oldModelClass.getMethod("getShipAgencyEmail");

				String value29 = (String)method29.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyEmail(value29);

				Method method30 = oldModelClass.getMethod("getGrossTonnage");

				Double value30 = (Double)method30.invoke(oldModel,
						(Object[])null);

				newModel.setGrossTonnage(value30);

				Method method31 = oldModelClass.getMethod("getNetTonnage");

				Double value31 = (Double)method31.invoke(oldModel,
						(Object[])null);

				newModel.setNetTonnage(value31);

				Method method32 = oldModelClass.getMethod(
						"getPositionOfShipInport");

				String value32 = (String)method32.invoke(oldModel,
						(Object[])null);

				newModel.setPositionOfShipInport(value32);

				Method method33 = oldModelClass.getMethod(
						"getBriefParticularsOfVoyage");

				String value33 = (String)method33.invoke(oldModel,
						(Object[])null);

				newModel.setBriefParticularsOfVoyage(value33);

				Method method34 = oldModelClass.getMethod(
						"getPreviousPortsOfCall");

				String value34 = (String)method34.invoke(oldModel,
						(Object[])null);

				newModel.setPreviousPortsOfCall(value34);

				Method method35 = oldModelClass.getMethod(
						"getSubsequentPortsOfCall");

				String value35 = (String)method35.invoke(oldModel,
						(Object[])null);

				newModel.setSubsequentPortsOfCall(value35);

				Method method36 = oldModelClass.getMethod("getDischargedPorts");

				String value36 = (String)method36.invoke(oldModel,
						(Object[])null);

				newModel.setDischargedPorts(value36);

				Method method37 = oldModelClass.getMethod("getRemainingCargo");

				String value37 = (String)method37.invoke(oldModel,
						(Object[])null);

				newModel.setRemainingCargo(value37);

				Method method38 = oldModelClass.getMethod(
						"getBriefDescriptionOfTheCargo");

				String value38 = (String)method38.invoke(oldModel,
						(Object[])null);

				newModel.setBriefDescriptionOfTheCargo(value38);

				Method method39 = oldModelClass.getMethod("getNumberOfCrew");

				Integer value39 = (Integer)method39.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrew(value39);

				Method method40 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value40 = (Integer)method40.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value40);

				Method method41 = oldModelClass.getMethod(
						"getShipRequirementsInTermsOfWaste");

				String value41 = (String)method41.invoke(oldModel,
						(Object[])null);

				newModel.setShipRequirementsInTermsOfWaste(value41);

				Method method42 = oldModelClass.getMethod("getRemarks");

				String value42 = (String)method42.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value42);

				Method method43 = oldModelClass.getMethod(
						"getNumberCargoDeclaration");

				String value43 = (String)method43.invoke(oldModel,
						(Object[])null);

				newModel.setNumberCargoDeclaration(value43);

				Method method44 = oldModelClass.getMethod(
						"getNumberShipStoreDeclaration");

				String value44 = (String)method44.invoke(oldModel,
						(Object[])null);

				newModel.setNumberShipStoreDeclaration(value44);

				Method method45 = oldModelClass.getMethod("getNumberCrewList");

				String value45 = (String)method45.invoke(oldModel,
						(Object[])null);

				newModel.setNumberCrewList(value45);

				Method method46 = oldModelClass.getMethod(
						"getNumberPassengerList");

				String value46 = (String)method46.invoke(oldModel,
						(Object[])null);

				newModel.setNumberPassengerList(value46);

				Method method47 = oldModelClass.getMethod(
						"getNumberCrewEffects");

				String value47 = (String)method47.invoke(oldModel,
						(Object[])null);

				newModel.setNumberCrewEffects(value47);

				Method method48 = oldModelClass.getMethod(
						"getNumberHealthMaritime");

				String value48 = (String)method48.invoke(oldModel,
						(Object[])null);

				newModel.setNumberHealthMaritime(value48);

				Method method49 = oldModelClass.getMethod("getSignPlace");

				String value49 = (String)method49.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value49);

				Method method50 = oldModelClass.getMethod("getSignDate");

				Date value50 = (Date)method50.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value50);

				Method method51 = oldModelClass.getMethod("getMasterSigned");

				Integer value51 = (Integer)method51.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value51);

				Method method52 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value52 = (Integer)method52.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value52);

				Method method53 = oldModelClass.getMethod("getCargoOnBoard");

				String value53 = (String)method53.invoke(oldModel,
						(Object[])null);

				newModel.setCargoOnBoard(value53);

				Method method54 = oldModelClass.getMethod("getCargo");

				String value54 = (String)method54.invoke(oldModel,
						(Object[])null);

				newModel.setCargo(value54);

				Method method55 = oldModelClass.getMethod("getVolumeCargo");

				Double value55 = (Double)method55.invoke(oldModel,
						(Object[])null);

				newModel.setVolumeCargo(value55);

				Method method56 = oldModelClass.getMethod("getCargoUnit");

				String value56 = (String)method56.invoke(oldModel,
						(Object[])null);

				newModel.setCargoUnit(value56);

				Method method57 = oldModelClass.getMethod("getCargoDescription");

				String value57 = (String)method57.invoke(oldModel,
						(Object[])null);

				newModel.setCargoDescription(value57);

				Method method58 = oldModelClass.getMethod("getRatedPower");

				String value58 = (String)method58.invoke(oldModel,
						(Object[])null);

				newModel.setRatedPower(value58);

				Method method59 = oldModelClass.getMethod("getSeatingCapacity");

				String value59 = (String)method59.invoke(oldModel,
						(Object[])null);

				newModel.setSeatingCapacity(value59);

				Method method60 = oldModelClass.getMethod("getLyingCapacity");

				String value60 = (String)method60.invoke(oldModel,
						(Object[])null);

				newModel.setLyingCapacity(value60);

				Method method61 = oldModelClass.getMethod("getMaritimePortCode");

				String value61 = (String)method61.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimePortCode(value61);

				Method method62 = oldModelClass.getMethod("getLastProvinceCode");

				String value62 = (String)method62.invoke(oldModel,
						(Object[])null);

				newModel.setLastProvinceCode(value62);

				Method method63 = oldModelClass.getMethod("getNextProvinceCode");

				String value63 = (String)method63.invoke(oldModel,
						(Object[])null);

				newModel.setNextProvinceCode(value63);

				Method method64 = oldModelClass.getMethod(
						"getLastMaritimePortCode");

				String value64 = (String)method64.invoke(oldModel,
						(Object[])null);

				newModel.setLastMaritimePortCode(value64);

				Method method65 = oldModelClass.getMethod(
						"getLastPortRegionCode");

				String value65 = (String)method65.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortRegionCode(value65);

				Method method66 = oldModelClass.getMethod(
						"getLastPortHarbourCode");

				String value66 = (String)method66.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortHarbourCode(value66);

				Method method67 = oldModelClass.getMethod(
						"getLastPortWharfCode");

				String value67 = (String)method67.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortWharfCode(value67);

				Method method68 = oldModelClass.getMethod(
						"getNextMaritimePortCode");

				String value68 = (String)method68.invoke(oldModel,
						(Object[])null);

				newModel.setNextMaritimePortCode(value68);

				Method method69 = oldModelClass.getMethod(
						"getNextPortRegionCode");

				String value69 = (String)method69.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortRegionCode(value69);

				Method method70 = oldModelClass.getMethod(
						"getNextPortHarbourCode");

				String value70 = (String)method70.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortHarbourCode(value70);

				Method method71 = oldModelClass.getMethod(
						"getNextPortWharfCode");

				String value71 = (String)method71.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortWharfCode(value71);

				Method method72 = oldModelClass.getMethod("getLink");

				String value72 = (String)method72.invoke(oldModel,
						(Object[])null);

				newModel.setLink(value72);

				Method method73 = oldModelClass.getMethod("getQrCode");

				String value73 = (String)method73.invoke(oldModel,
						(Object[])null);

				newModel.setQrCode(value73);

				Method method74 = oldModelClass.getMethod("getPortClearanceNo");

				String value74 = (String)method74.invoke(oldModel,
						(Object[])null);

				newModel.setPortClearanceNo(value74);

				Method method75 = oldModelClass.getMethod("getLoa");

				Double value75 = (Double)method75.invoke(oldModel,
						(Object[])null);

				newModel.setLoa(value75);

				Method method76 = oldModelClass.getMethod("getUnitLOA");

				String value76 = (String)method76.invoke(oldModel,
						(Object[])null);

				newModel.setUnitLOA(value76);

				Method method77 = oldModelClass.getMethod("getBreadth");

				Double value77 = (Double)method77.invoke(oldModel,
						(Object[])null);

				newModel.setBreadth(value77);

				Method method78 = oldModelClass.getMethod("getUnitBreadth");

				String value78 = (String)method78.invoke(oldModel,
						(Object[])null);

				newModel.setUnitBreadth(value78);

				Method method79 = oldModelClass.getMethod("getClearanceHeight");

				Double value79 = (Double)method79.invoke(oldModel,
						(Object[])null);

				newModel.setClearanceHeight(value79);

				Method method80 = oldModelClass.getMethod(
						"getUnitClearanceHeight");

				String value80 = (String)method80.invoke(oldModel,
						(Object[])null);

				newModel.setUnitClearanceHeight(value80);

				Method method81 = oldModelClass.getMethod("getShownDraftxF");

				Double value81 = (Double)method81.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxF(value81);

				Method method82 = oldModelClass.getMethod("getUnitShownDraftxF");

				String value82 = (String)method82.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxF(value82);

				Method method83 = oldModelClass.getMethod("getShownDraftxA");

				Double value83 = (Double)method83.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxA(value83);

				Method method84 = oldModelClass.getMethod("getUnitShownDraftxA");

				String value84 = (String)method84.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxA(value84);

				Method method85 = oldModelClass.getMethod("getDwt");

				Double value85 = (Double)method85.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value85);

				Method method86 = oldModelClass.getMethod("getUnitDWT");

				String value86 = (String)method86.invoke(oldModel,
						(Object[])null);

				newModel.setUnitDWT(value86);

				Method method87 = oldModelClass.getMethod(
						"getTimeOfPORTArrival");

				Date value87 = (Date)method87.invoke(oldModel, (Object[])null);

				newModel.setTimeOfPORTArrival(value87);

				Method method88 = oldModelClass.getMethod(
						"getTimeOfPilotOnBoard");

				Date value88 = (Date)method88.invoke(oldModel, (Object[])null);

				newModel.setTimeOfPilotOnBoard(value88);

				Method method89 = oldModelClass.getMethod("getTugBoat");

				String value89 = (String)method89.invoke(oldModel,
						(Object[])null);

				newModel.setTugBoat(value89);

				Method method90 = oldModelClass.getMethod("getDo_");

				String value90 = (String)method90.invoke(oldModel,
						(Object[])null);

				newModel.setDo_(value90);

				Method method91 = oldModelClass.getMethod("getFo");

				String value91 = (String)method91.invoke(oldModel,
						(Object[])null);

				newModel.setFo(value91);

				Method method92 = oldModelClass.getMethod("getFw");

				String value92 = (String)method92.invoke(oldModel,
						(Object[])null);

				newModel.setFw(value92);

				Method method93 = oldModelClass.getMethod("getPlaceOfReception");

				String value93 = (String)method93.invoke(oldModel,
						(Object[])null);

				newModel.setPlaceOfReception(value93);

				Method method94 = oldModelClass.getMethod("getNameOfShipOwners");

				String value94 = (String)method94.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfShipOwners(value94);

				Method method95 = oldModelClass.getMethod(
						"getAddressOfShipOwners");

				String value95 = (String)method95.invoke(oldModel,
						(Object[])null);

				newModel.setAddressOfShipOwners(value95);

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

	public static Object translateOutputTempGoodsItems(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempGoodsItemsClp newModel = new TempGoodsItemsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getBillOfLadingNo");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setBillOfLadingNo(value2);

				Method method3 = oldModelClass.getMethod("getGoodItemCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setGoodItemCode(value3);

				Method method4 = oldModelClass.getMethod(
						"getGoodItemDescription");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setGoodItemDescription(value4);

				Method method5 = oldModelClass.getMethod("getNumberOfPackage");

				Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

				newModel.setNumberOfPackage(value5);

				Method method6 = oldModelClass.getMethod("getKindOfPackages");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setKindOfPackages(value6);

				Method method7 = oldModelClass.getMethod(
						"getMarksandNosofGoods");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setMarksandNosofGoods(value7);

				Method method8 = oldModelClass.getMethod("getGrossWeight");

				Double value8 = (Double)method8.invoke(oldModel, (Object[])null);

				newModel.setGrossWeight(value8);

				Method method9 = oldModelClass.getMethod("getGrossWeightUnit");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setGrossWeightUnit(value9);

				Method method10 = oldModelClass.getMethod("getMeasurement");

				Double value10 = (Double)method10.invoke(oldModel,
						(Object[])null);

				newModel.setMeasurement(value10);

				Method method11 = oldModelClass.getMethod("getMeasurementUnit");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setMeasurementUnit(value11);

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

	public static Object translateOutputTempHealthCrewPassengerList(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempHealthCrewPassengerListClp newModel = new TempHealthCrewPassengerListClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getHealthCrewPassengerCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setHealthCrewPassengerCode(value2);

				Method method3 = oldModelClass.getMethod(
						"getPassengerOrCrewCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPassengerOrCrewCode(value3);

				Method method4 = oldModelClass.getMethod(
						"getPassengerOrCrewName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setPassengerOrCrewName(value4);

				Method method5 = oldModelClass.getMethod("getClassOrRating");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setClassOrRating(value5);

				Method method6 = oldModelClass.getMethod("getStateVisitedCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setStateVisitedCode(value6);

				Method method7 = oldModelClass.getMethod("getPortVisitedCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPortVisitedCode(value7);

				Method method8 = oldModelClass.getMethod("getFromDate");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setFromDate(value8);

				Method method9 = oldModelClass.getMethod("getToDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setToDate(value9);

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

	public static Object translateOutputTempHealthQuestion(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempHealthQuestionClp newModel = new TempHealthQuestionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getHealthQuestionCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setHealthQuestionCode(value2);

				Method method3 = oldModelClass.getMethod("getPersonDied");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setPersonDied(value3);

				Method method4 = oldModelClass.getMethod("getPersonDiedNo");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPersonDiedNo(value4);

				Method method5 = oldModelClass.getMethod("getPersonDiedReport");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPersonDiedReport(value5);

				Method method6 = oldModelClass.getMethod("getIsinfectious");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setIsinfectious(value6);

				Method method7 = oldModelClass.getMethod("getInfectiousReport");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setInfectiousReport(value7);

				Method method8 = oldModelClass.getMethod(
						"getIllPassengersGreaterNomal");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setIllPassengersGreaterNomal(value8);

				Method method9 = oldModelClass.getMethod("getIllPassengersNo");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setIllPassengersNo(value9);

				Method method10 = oldModelClass.getMethod(
						"getIllPersonsOnBoard");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setIllPersonsOnBoard(value10);

				Method method11 = oldModelClass.getMethod("getIllPersonsReport");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setIllPersonsReport(value11);

				Method method12 = oldModelClass.getMethod(
						"getMedicalPractitionerConsulted");

				Integer value12 = (Integer)method12.invoke(oldModel,
						(Object[])null);

				newModel.setMedicalPractitionerConsulted(value12);

				Method method13 = oldModelClass.getMethod(
						"getMedicalTreatmentOrAdvice");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setMedicalTreatmentOrAdvice(value13);

				Method method14 = oldModelClass.getMethod(
						"getInfectionOrSpreadOfDisease");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setInfectionOrSpreadOfDisease(value14);

				Method method15 = oldModelClass.getMethod("getInfectionsReport");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setInfectionsReport(value15);

				Method method16 = oldModelClass.getMethod("getIsSanitary");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setIsSanitary(value16);

				Method method17 = oldModelClass.getMethod("getSanitaryDes");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setSanitaryDes(value17);

				Method method18 = oldModelClass.getMethod("getIsStowaways");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setIsStowaways(value18);

				Method method19 = oldModelClass.getMethod("getJoinShip");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setJoinShip(value19);

				Method method20 = oldModelClass.getMethod("getIsAnimal");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setIsAnimal(value20);

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

	public static Object translateOutputTempMaritimePaymentConfig(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempMaritimePaymentConfigClp newModel = new TempMaritimePaymentConfigClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getMaritimeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value1);

				Method method2 = oldModelClass.getMethod("getMerchantCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMerchantCode(value2);

				Method method3 = oldModelClass.getMethod("getMerchantKey");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setMerchantKey(value3);

				Method method4 = oldModelClass.getMethod("getMerchantName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setMerchantName(value4);

				Method method5 = oldModelClass.getMethod("getKeypayDomain");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setKeypayDomain(value5);

				Method method6 = oldModelClass.getMethod("getKeypayVersion");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setKeypayVersion(value6);

				Method method7 = oldModelClass.getMethod("getReturnURL");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setReturnURL(value7);

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

	public static Object translateOutputTempNoTiceShipMessage(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempNoTiceShipMessageClp newModel = new TempNoTiceShipMessageClp();

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

				Method method3 = oldModelClass.getMethod("getNoticeShipType");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setNoticeShipType(value3);

				Method method4 = oldModelClass.getMethod("getNoticeShipCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setNoticeShipCode(value4);

				Method method5 = oldModelClass.getMethod("getDocumentName");

				Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value5);

				Method method6 = oldModelClass.getMethod("getUserCreated");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value6);

				Method method7 = oldModelClass.getMethod("getConfirmTime");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setConfirmTime(value7);

				Method method8 = oldModelClass.getMethod("getShipName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setShipName(value8);

				Method method9 = oldModelClass.getMethod("getShipTypeCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value9);

				Method method10 = oldModelClass.getMethod("getStateCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setStateCode(value10);

				Method method11 = oldModelClass.getMethod("getShipCaptain");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setShipCaptain(value11);

				Method method12 = oldModelClass.getMethod("getImo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setImo(value12);

				Method method13 = oldModelClass.getMethod("getGrt");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setGrt(value13);

				Method method14 = oldModelClass.getMethod("getDwt");

				Double value14 = (Double)method14.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value14);

				Method method15 = oldModelClass.getMethod("getUnitGRT");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setUnitGRT(value15);

				Method method16 = oldModelClass.getMethod("getUnitDWT");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setUnitDWT(value16);

				Method method17 = oldModelClass.getMethod("getCallSign");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value17);

				Method method18 = oldModelClass.getMethod("getArrivalDate");

				Date value18 = (Date)method18.invoke(oldModel, (Object[])null);

				newModel.setArrivalDate(value18);

				Method method19 = oldModelClass.getMethod("getArrivalPortCode");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setArrivalPortCode(value19);

				Method method20 = oldModelClass.getMethod("getPortHarbourCode");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourCode(value20);

				Method method21 = oldModelClass.getMethod("getPortRegionCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setPortRegionCode(value21);

				Method method22 = oldModelClass.getMethod("getPortWharfCode");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setPortWharfCode(value22);

				Method method23 = oldModelClass.getMethod(
						"getPortGoingToStateName");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setPortGoingToStateName(value23);

				Method method24 = oldModelClass.getMethod("getPortGoingToCode");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setPortGoingToCode(value24);

				Method method25 = oldModelClass.getMethod("getNameOfShipOwners");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfShipOwners(value25);

				Method method26 = oldModelClass.getMethod(
						"getAddressOfShipOwners");

				String value26 = (String)method26.invoke(oldModel,
						(Object[])null);

				newModel.setAddressOfShipOwners(value26);

				Method method27 = oldModelClass.getMethod(
						"getShipOwnerstateCode");

				String value27 = (String)method27.invoke(oldModel,
						(Object[])null);

				newModel.setShipOwnerstateCode(value27);

				Method method28 = oldModelClass.getMethod("getShipOwnerPhone");

				String value28 = (String)method28.invoke(oldModel,
						(Object[])null);

				newModel.setShipOwnerPhone(value28);

				Method method29 = oldModelClass.getMethod("getShipOwnerFax");

				String value29 = (String)method29.invoke(oldModel,
						(Object[])null);

				newModel.setShipOwnerFax(value29);

				Method method30 = oldModelClass.getMethod("getShipOwnerEmail");

				String value30 = (String)method30.invoke(oldModel,
						(Object[])null);

				newModel.setShipOwnerEmail(value30);

				Method method31 = oldModelClass.getMethod("getLoa");

				Double value31 = (Double)method31.invoke(oldModel,
						(Object[])null);

				newModel.setLoa(value31);

				Method method32 = oldModelClass.getMethod("getBreadth");

				Double value32 = (Double)method32.invoke(oldModel,
						(Object[])null);

				newModel.setBreadth(value32);

				Method method33 = oldModelClass.getMethod("getClearanceHeight");

				Double value33 = (Double)method33.invoke(oldModel,
						(Object[])null);

				newModel.setClearanceHeight(value33);

				Method method34 = oldModelClass.getMethod("getShownDraftxF");

				Double value34 = (Double)method34.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxF(value34);

				Method method35 = oldModelClass.getMethod("getShownDraftxA");

				Double value35 = (Double)method35.invoke(oldModel,
						(Object[])null);

				newModel.setShownDraftxA(value35);

				Method method36 = oldModelClass.getMethod("getUnitLOA");

				String value36 = (String)method36.invoke(oldModel,
						(Object[])null);

				newModel.setUnitLOA(value36);

				Method method37 = oldModelClass.getMethod("getUnitBreadth");

				String value37 = (String)method37.invoke(oldModel,
						(Object[])null);

				newModel.setUnitBreadth(value37);

				Method method38 = oldModelClass.getMethod(
						"getUnitClearanceHeight");

				String value38 = (String)method38.invoke(oldModel,
						(Object[])null);

				newModel.setUnitClearanceHeight(value38);

				Method method39 = oldModelClass.getMethod("getUnitShownDraftxF");

				String value39 = (String)method39.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxF(value39);

				Method method40 = oldModelClass.getMethod("getUnitShownDraftxA");

				String value40 = (String)method40.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxA(value40);

				Method method41 = oldModelClass.getMethod(
						"getCertificateOfRegistryNumber");

				String value41 = (String)method41.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateOfRegistryNumber(value41);

				Method method42 = oldModelClass.getMethod(
						"getCertificateOfRegistryDate");

				Date value42 = (Date)method42.invoke(oldModel, (Object[])null);

				newModel.setCertificateOfRegistryDate(value42);

				Method method43 = oldModelClass.getMethod(
						"getCertificateOfRegistryPortName");

				String value43 = (String)method43.invoke(oldModel,
						(Object[])null);

				newModel.setCertificateOfRegistryPortName(value43);

				Method method44 = oldModelClass.getMethod("getShipAgencyCode");

				String value44 = (String)method44.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyCode(value44);

				Method method45 = oldModelClass.getMethod(
						"getShipAgencyAddress");

				String value45 = (String)method45.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyAddress(value45);

				Method method46 = oldModelClass.getMethod("getShipAgencyPhone");

				String value46 = (String)method46.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyPhone(value46);

				Method method47 = oldModelClass.getMethod("getShipAgencyFax");

				String value47 = (String)method47.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyFax(value47);

				Method method48 = oldModelClass.getMethod("getShipAgencyEmail");

				String value48 = (String)method48.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyEmail(value48);

				Method method49 = oldModelClass.getMethod("getPurposeCode");

				String value49 = (String)method49.invoke(oldModel,
						(Object[])null);

				newModel.setPurposeCode(value49);

				Method method50 = oldModelClass.getMethod("getPurposeSpecified");

				String value50 = (String)method50.invoke(oldModel,
						(Object[])null);

				newModel.setPurposeSpecified(value50);

				Method method51 = oldModelClass.getMethod("getCrewNumber");

				Long value51 = (Long)method51.invoke(oldModel, (Object[])null);

				newModel.setCrewNumber(value51);

				Method method52 = oldModelClass.getMethod("getUnitCrew");

				String value52 = (String)method52.invoke(oldModel,
						(Object[])null);

				newModel.setUnitCrew(value52);

				Method method53 = oldModelClass.getMethod("getPassengerNumber");

				Long value53 = (Long)method53.invoke(oldModel, (Object[])null);

				newModel.setPassengerNumber(value53);

				Method method54 = oldModelClass.getMethod("getUnitPassenger");

				String value54 = (String)method54.invoke(oldModel,
						(Object[])null);

				newModel.setUnitPassenger(value54);

				Method method55 = oldModelClass.getMethod(
						"getQuantityAndTypeOfCargo");

				String value55 = (String)method55.invoke(oldModel,
						(Object[])null);

				newModel.setQuantityAndTypeOfCargo(value55);

				Method method56 = oldModelClass.getMethod(
						"getUnitQuantityofCargo");

				String value56 = (String)method56.invoke(oldModel,
						(Object[])null);

				newModel.setUnitQuantityofCargo(value56);

				Method method57 = oldModelClass.getMethod("getTypeOfCargo");

				String value57 = (String)method57.invoke(oldModel,
						(Object[])null);

				newModel.setTypeOfCargo(value57);

				Method method58 = oldModelClass.getMethod("getOtherPersons");

				Integer value58 = (Integer)method58.invoke(oldModel,
						(Object[])null);

				newModel.setOtherPersons(value58);

				Method method59 = oldModelClass.getMethod("getRemarks");

				String value59 = (String)method59.invoke(oldModel,
						(Object[])null);

				newModel.setRemarks(value59);

				Method method60 = oldModelClass.getMethod("getSignPlace");

				String value60 = (String)method60.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value60);

				Method method61 = oldModelClass.getMethod("getSignDate");

				Date value61 = (Date)method61.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value61);

				Method method62 = oldModelClass.getMethod("getMasterSigned");

				Integer value62 = (Integer)method62.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value62);

				Method method63 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value63 = (Integer)method63.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value63);

				Method method64 = oldModelClass.getMethod("getDocumentYear");

				Integer value64 = (Integer)method64.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value64);

				Method method65 = oldModelClass.getMethod("getNameOfShipAgent");

				String value65 = (String)method65.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfShipAgent(value65);

				Method method66 = oldModelClass.getMethod(
						"getDocumentReference");

				Long value66 = (Long)method66.invoke(oldModel, (Object[])null);

				newModel.setDocumentReference(value66);

				Method method67 = oldModelClass.getMethod("getIsArrival");

				Integer value67 = (Integer)method67.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value67);

				Method method68 = oldModelClass.getMethod("getVoyageNumber");

				String value68 = (String)method68.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value68);

				Method method69 = oldModelClass.getMethod("getNetTonnage");

				Double value69 = (Double)method69.invoke(oldModel,
						(Object[])null);

				newModel.setNetTonnage(value69);

				Method method70 = oldModelClass.getMethod("getNetTonnageUnit");

				String value70 = (String)method70.invoke(oldModel,
						(Object[])null);

				newModel.setNetTonnageUnit(value70);

				Method method71 = oldModelClass.getMethod(
						"getPositionOfShipInPort");

				String value71 = (String)method71.invoke(oldModel,
						(Object[])null);

				newModel.setPositionOfShipInPort(value71);

				Method method72 = oldModelClass.getMethod(
						"getBriefParticularsOfVoyage");

				String value72 = (String)method72.invoke(oldModel,
						(Object[])null);

				newModel.setBriefParticularsOfVoyage(value72);

				Method method73 = oldModelClass.getMethod(
						"getPreviousPortsOfCall");

				String value73 = (String)method73.invoke(oldModel,
						(Object[])null);

				newModel.setPreviousPortsOfCall(value73);

				Method method74 = oldModelClass.getMethod(
						"getSubsequentPortsOfCall");

				String value74 = (String)method74.invoke(oldModel,
						(Object[])null);

				newModel.setSubsequentPortsOfCall(value74);

				Method method75 = oldModelClass.getMethod("getDischargedPorts");

				String value75 = (String)method75.invoke(oldModel,
						(Object[])null);

				newModel.setDischargedPorts(value75);

				Method method76 = oldModelClass.getMethod("getRemainingCargo");

				String value76 = (String)method76.invoke(oldModel,
						(Object[])null);

				newModel.setRemainingCargo(value76);

				Method method77 = oldModelClass.getMethod(
						"getShipRequirementsInTermsOfWaste");

				String value77 = (String)method77.invoke(oldModel,
						(Object[])null);

				newModel.setShipRequirementsInTermsOfWaste(value77);

				Method method78 = oldModelClass.getMethod(
						"getNumberCargoDeclaration");

				Integer value78 = (Integer)method78.invoke(oldModel,
						(Object[])null);

				newModel.setNumberCargoDeclaration(value78);

				Method method79 = oldModelClass.getMethod(
						"getNumberShipStoreDeclaration");

				Integer value79 = (Integer)method79.invoke(oldModel,
						(Object[])null);

				newModel.setNumberShipStoreDeclaration(value79);

				Method method80 = oldModelClass.getMethod("getNumberCrewList");

				Integer value80 = (Integer)method80.invoke(oldModel,
						(Object[])null);

				newModel.setNumberCrewList(value80);

				Method method81 = oldModelClass.getMethod(
						"getNumberPassengerList");

				Integer value81 = (Integer)method81.invoke(oldModel,
						(Object[])null);

				newModel.setNumberPassengerList(value81);

				Method method82 = oldModelClass.getMethod(
						"getNumberCrewEffectsDeclaration");

				Integer value82 = (Integer)method82.invoke(oldModel,
						(Object[])null);

				newModel.setNumberCrewEffectsDeclaration(value82);

				Method method83 = oldModelClass.getMethod(
						"getNumberHealthMaritimeDeclaration");

				Integer value83 = (Integer)method83.invoke(oldModel,
						(Object[])null);

				newModel.setNumberHealthMaritimeDeclaration(value83);

				Method method84 = oldModelClass.getMethod("getPortClearanceNo");

				String value84 = (String)method84.invoke(oldModel,
						(Object[])null);

				newModel.setPortClearanceNo(value84);

				Method method85 = oldModelClass.getMethod(
						"getTimeOfPORTArrival");

				Date value85 = (Date)method85.invoke(oldModel, (Object[])null);

				newModel.setTimeOfPORTArrival(value85);

				Method method86 = oldModelClass.getMethod(
						"getTimeOfPilotOnBoard");

				Date value86 = (Date)method86.invoke(oldModel, (Object[])null);

				newModel.setTimeOfPilotOnBoard(value86);

				Method method87 = oldModelClass.getMethod("getTugBoat");

				String value87 = (String)method87.invoke(oldModel,
						(Object[])null);

				newModel.setTugBoat(value87);

				Method method88 = oldModelClass.getMethod("getDo_");

				String value88 = (String)method88.invoke(oldModel,
						(Object[])null);

				newModel.setDo_(value88);

				Method method89 = oldModelClass.getMethod("getFo");

				String value89 = (String)method89.invoke(oldModel,
						(Object[])null);

				newModel.setFo(value89);

				Method method90 = oldModelClass.getMethod("getFw");

				String value90 = (String)method90.invoke(oldModel,
						(Object[])null);

				newModel.setFw(value90);

				Method method91 = oldModelClass.getMethod("getPlaceOfReception");

				String value91 = (String)method91.invoke(oldModel,
						(Object[])null);

				newModel.setPlaceOfReception(value91);

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

	public static Object translateOutputTempPassengerDetails(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempPassengerDetailsClp newModel = new TempPassengerDetailsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getPassengerCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPassengerCode(value2);

				Method method3 = oldModelClass.getMethod("getFamilyName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setFamilyName(value3);

				Method method4 = oldModelClass.getMethod("getGivenName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setGivenName(value4);

				Method method5 = oldModelClass.getMethod("getNationality");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNationality(value5);

				Method method6 = oldModelClass.getMethod("getBirthDay");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setBirthDay(value6);

				Method method7 = oldModelClass.getMethod("getBirthPlace");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setBirthPlace(value7);

				Method method8 = oldModelClass.getMethod("getTypeOfIdentity");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setTypeOfIdentity(value8);

				Method method9 = oldModelClass.getMethod(
						"getPassportExpiredDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setPassportExpiredDate(value9);

				Method method10 = oldModelClass.getMethod(
						"getSerialNumberOfIdentity");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setSerialNumberOfIdentity(value10);

				Method method11 = oldModelClass.getMethod(
						"getPortOfEmbarkation");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfEmbarkation(value11);

				Method method12 = oldModelClass.getMethod(
						"getPortOfDisembarkation");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfDisembarkation(value12);

				Method method13 = oldModelClass.getMethod("getIsTransit");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setIsTransit(value13);

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

	public static Object translateOutputTempPassengerList(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempPassengerListClp newModel = new TempPassengerListClp();

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

				Method method4 = oldModelClass.getMethod("getUserCreated");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value4);

				Method method5 = oldModelClass.getMethod("getIsArrival");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getPortOfArrivalCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPortOfArrivalCode(value7);

				Method method8 = oldModelClass.getMethod("getDateOfArrival");

				Date value8 = (Date)method8.invoke(oldModel, (Object[])null);

				newModel.setDateOfArrival(value8);

				Method method9 = oldModelClass.getMethod("getImoNumber");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value9);

				Method method10 = oldModelClass.getMethod("getCallSign");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value10);

				Method method11 = oldModelClass.getMethod("getVoyageNumber");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value11);

				Method method12 = oldModelClass.getMethod("getFlagStateOfShip");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setFlagStateOfShip(value12);

				Method method13 = oldModelClass.getMethod("getListPassengers");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setListPassengers(value13);

				Method method14 = oldModelClass.getMethod("getSignPlace");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value14);

				Method method15 = oldModelClass.getMethod("getSignDate");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value15);

				Method method16 = oldModelClass.getMethod("getMasterSigned");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value16);

				Method method17 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value17);

				Method method18 = oldModelClass.getMethod("getAttachedFile");

				Long value18 = (Long)method18.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value18);

				Method method19 = oldModelClass.getMethod("getDocumentYear");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value19);

				Method method20 = oldModelClass.getMethod(
						"getNumberOfLeftPassengers");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfLeftPassengers(value20);

				Method method21 = oldModelClass.getMethod("getNumberOfVNmeses");

				Integer value21 = (Integer)method21.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfVNmeses(value21);

				Method method22 = oldModelClass.getMethod(
						"getNumberOfForeigners");

				Integer value22 = (Integer)method22.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfForeigners(value22);

				Method method23 = oldModelClass.getMethod("getTotalPassengers");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setTotalPassengers(value23);

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

	public static Object translateOutputTempPersonList(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempPersonListClp newModel = new TempPersonListClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentName");

				Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value2);

				Method method3 = oldModelClass.getMethod("getDocumentYear");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value3);

				Method method4 = oldModelClass.getMethod("getName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setName(value4);

				Method method5 = oldModelClass.getMethod("getAge");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setAge(value5);

				Method method6 = oldModelClass.getMethod("getNationalCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNationalCode(value6);

				Method method7 = oldModelClass.getMethod("getNationalName");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNationalName(value7);

				Method method8 = oldModelClass.getMethod("getIlnessStatus");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setIlnessStatus(value8);

				Method method9 = oldModelClass.getMethod("getReasonOfDead");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setReasonOfDead(value9);

				Method method10 = oldModelClass.getMethod("getPersonType");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setPersonType(value10);

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

	public static Object translateOutputTempPlantQuarantine(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempPlantQuarantineClp newModel = new TempPlantQuarantineClp();

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

				Method method4 = oldModelClass.getMethod("getUserCreated");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value4);

				Method method5 = oldModelClass.getMethod("getDocumentYear");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value5);

				Method method6 = oldModelClass.getMethod("getNameOfShip");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value6);

				Method method7 = oldModelClass.getMethod("getFlagStateOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setFlagStateOfShip(value7);

				Method method8 = oldModelClass.getMethod("getNameOfMaster");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNameOfMaster(value8);

				Method method9 = oldModelClass.getMethod("getDoctorName");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setDoctorName(value9);

				Method method10 = oldModelClass.getMethod("getNumberOfCrew");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfCrew(value10);

				Method method11 = oldModelClass.getMethod(
						"getNumberOfPassengers");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPassengers(value11);

				Method method12 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value12);

				Method method13 = oldModelClass.getMethod(
						"getNextPortOfCallCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setNextPortOfCallCode(value13);

				Method method14 = oldModelClass.getMethod(
						"getFirstPortOfLoadingCode");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setFirstPortOfLoadingCode(value14);

				Method method15 = oldModelClass.getMethod("getDateOfdeparture");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setDateOfdeparture(value15);

				Method method16 = oldModelClass.getMethod("getPlantNameFirst");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setPlantNameFirst(value16);

				Method method17 = oldModelClass.getMethod("getPlantNameBetween");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setPlantNameBetween(value17);

				Method method18 = oldModelClass.getMethod("getPlantNameThis");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setPlantNameThis(value18);

				Method method19 = oldModelClass.getMethod("getSignPlace");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value19);

				Method method20 = oldModelClass.getMethod("getSignDate");

				Date value20 = (Date)method20.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value20);

				Method method21 = oldModelClass.getMethod("getMasterSigned");

				Integer value21 = (Integer)method21.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value21);

				Method method22 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value22 = (Integer)method22.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value22);

				Method method23 = oldModelClass.getMethod("getAttachedFile");

				Long value23 = (Long)method23.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value23);

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

	public static Object translateOutputTempShipSecurityMessage(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempShipSecurityMessageClp newModel = new TempShipSecurityMessageClp();

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

				Method method3 = oldModelClass.getMethod("getDocumentYear");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value3);

				Method method4 = oldModelClass.getMethod("getShipSecurityCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setShipSecurityCode(value4);

				Method method5 = oldModelClass.getMethod("getDocumentName");

				Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value5);

				Method method6 = oldModelClass.getMethod("getUserCreated");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value6);

				Method method7 = oldModelClass.getMethod("getShipAgencyCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyCode(value7);

				Method method8 = oldModelClass.getMethod("getNameOfShipAgent");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNameOfShipAgent(value8);

				Method method9 = oldModelClass.getMethod("getShipName");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setShipName(value9);

				Method method10 = oldModelClass.getMethod("getShipTypeCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setShipTypeCode(value10);

				Method method11 = oldModelClass.getMethod("getStateCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setStateCode(value11);

				Method method12 = oldModelClass.getMethod("getShipCaptain");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setShipCaptain(value12);

				Method method13 = oldModelClass.getMethod("getImo");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setImo(value13);

				Method method14 = oldModelClass.getMethod("getGrt");

				Double value14 = (Double)method14.invoke(oldModel,
						(Object[])null);

				newModel.setGrt(value14);

				Method method15 = oldModelClass.getMethod("getUnitGRT");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setUnitGRT(value15);

				Method method16 = oldModelClass.getMethod("getCrewNumber");

				Long value16 = (Long)method16.invoke(oldModel, (Object[])null);

				newModel.setCrewNumber(value16);

				Method method17 = oldModelClass.getMethod("getArrivalDate");

				Date value17 = (Date)method17.invoke(oldModel, (Object[])null);

				newModel.setArrivalDate(value17);

				Method method18 = oldModelClass.getMethod("getPurposeCode");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setPurposeCode(value18);

				Method method19 = oldModelClass.getMethod("getPurposeSpecified");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setPurposeSpecified(value19);

				Method method20 = oldModelClass.getMethod("getPortRegionCode");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setPortRegionCode(value20);

				Method method21 = oldModelClass.getMethod("getPortWharfCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setPortWharfCode(value21);

				Method method22 = oldModelClass.getMethod("getShipAgencyPhone");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyPhone(value22);

				Method method23 = oldModelClass.getMethod("getShipAgencyFax");

				String value23 = (String)method23.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyFax(value23);

				Method method24 = oldModelClass.getMethod(
						"getIsInternationalShipSecurity");

				Integer value24 = (Integer)method24.invoke(oldModel,
						(Object[])null);

				newModel.setIsInternationalShipSecurity(value24);

				Method method25 = oldModelClass.getMethod("getNameOfISSC");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfISSC(value25);

				Method method26 = oldModelClass.getMethod("getDateOfISSC");

				Date value26 = (Date)method26.invoke(oldModel, (Object[])null);

				newModel.setDateOfISSC(value26);

				Method method27 = oldModelClass.getMethod("getDateOfExpiryISSC");

				Date value27 = (Date)method27.invoke(oldModel, (Object[])null);

				newModel.setDateOfExpiryISSC(value27);

				Method method28 = oldModelClass.getMethod(
						"getSecurityLevelCode");

				String value28 = (String)method28.invoke(oldModel,
						(Object[])null);

				newModel.setSecurityLevelCode(value28);

				Method method29 = oldModelClass.getMethod("getSecurityFromDate");

				Date value29 = (Date)method29.invoke(oldModel, (Object[])null);

				newModel.setSecurityFromDate(value29);

				Method method30 = oldModelClass.getMethod(
						"getIsAdditionalSecurityMeasures");

				Integer value30 = (Integer)method30.invoke(oldModel,
						(Object[])null);

				newModel.setIsAdditionalSecurityMeasures(value30);

				Method method31 = oldModelClass.getMethod(
						"getAdditionalSecurityDetail");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setAdditionalSecurityDetail(value31);

				Method method32 = oldModelClass.getMethod(
						"getIsMaintainSecurity");

				Integer value32 = (Integer)method32.invoke(oldModel,
						(Object[])null);

				newModel.setIsMaintainSecurity(value32);

				Method method33 = oldModelClass.getMethod(
						"getMaintainSecurityDetail");

				String value33 = (String)method33.invoke(oldModel,
						(Object[])null);

				newModel.setMaintainSecurityDetail(value33);

				Method method34 = oldModelClass.getMethod("getLatitude");

				String value34 = (String)method34.invoke(oldModel,
						(Object[])null);

				newModel.setLatitude(value34);

				Method method35 = oldModelClass.getMethod("getLongitude");

				String value35 = (String)method35.invoke(oldModel,
						(Object[])null);

				newModel.setLongitude(value35);

				Method method36 = oldModelClass.getMethod(
						"getHasShipSecurityPortItems");

				Integer value36 = (Integer)method36.invoke(oldModel,
						(Object[])null);

				newModel.setHasShipSecurityPortItems(value36);

				Method method37 = oldModelClass.getMethod("getSignPlace");

				String value37 = (String)method37.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value37);

				Method method38 = oldModelClass.getMethod("getSignDate");

				Date value38 = (Date)method38.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value38);

				Method method39 = oldModelClass.getMethod("getMasterSigned");

				Integer value39 = (Integer)method39.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value39);

				Method method40 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value40 = (Integer)method40.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value40);

				Method method41 = oldModelClass.getMethod("getCallSign");

				String value41 = (String)method41.invoke(oldModel,
						(Object[])null);

				newModel.setCallSign(value41);

				Method method42 = oldModelClass.getMethod("getArrivalPortCode");

				String value42 = (String)method42.invoke(oldModel,
						(Object[])null);

				newModel.setArrivalPortCode(value42);

				Method method43 = oldModelClass.getMethod("getPortHarbourCode");

				String value43 = (String)method43.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourCode(value43);

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

	public static Object translateOutputTempShipSecurityPortItems(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempShipSecurityPortItemsClp newModel = new TempShipSecurityPortItemsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getShipSecurityPortItemCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipSecurityPortItemCode(value2);

				Method method3 = oldModelClass.getMethod("getPortCode");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value3);

				Method method4 = oldModelClass.getMethod("getDateArrival");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setDateArrival(value4);

				Method method5 = oldModelClass.getMethod("getDateDeparture");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setDateDeparture(value5);

				Method method6 = oldModelClass.getMethod("getSecurityLevelCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevelCode(value6);

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

	public static Object translateOutputTempShipStoresDeclaration(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempShipStoresDeclarationClp newModel = new TempShipStoresDeclarationClp();

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

				Method method5 = oldModelClass.getMethod("getUserCreated");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setUserCreated(value5);

				Method method6 = oldModelClass.getMethod("getIsArrival");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setIsArrival(value6);

				Method method7 = oldModelClass.getMethod("getNameOfShip");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setNameOfShip(value7);

				Method method8 = oldModelClass.getMethod("getImoNumber");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setImoNumber(value8);

				Method method9 = oldModelClass.getMethod("getCallsign");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCallsign(value9);

				Method method10 = oldModelClass.getMethod("getVoyageNumber");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setVoyageNumber(value10);

				Method method11 = oldModelClass.getMethod(
						"getNationalityOfShip");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNationalityOfShip(value11);

				Method method12 = oldModelClass.getMethod(
						"getPortOfArrivalCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setPortOfArrivalCode(value12);

				Method method13 = oldModelClass.getMethod("getDateOfArrival");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setDateOfArrival(value13);

				Method method14 = oldModelClass.getMethod(
						"getLastPortOfCallCode");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setLastPortOfCallCode(value14);

				Method method15 = oldModelClass.getMethod(
						"getNumberOfPersonsOnBoat");

				Integer value15 = (Integer)method15.invoke(oldModel,
						(Object[])null);

				newModel.setNumberOfPersonsOnBoat(value15);

				Method method16 = oldModelClass.getMethod("getPeriodOfStay");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setPeriodOfStay(value16);

				Method method17 = oldModelClass.getMethod("getPeriodOfStayUnit");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setPeriodOfStayUnit(value17);

				Method method18 = oldModelClass.getMethod("getNameOfMaster");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setNameOfMaster(value18);

				Method method19 = oldModelClass.getMethod("getListShipsStores");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setListShipsStores(value19);

				Method method20 = oldModelClass.getMethod("getSignPlace");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setSignPlace(value20);

				Method method21 = oldModelClass.getMethod("getSignDate");

				Date value21 = (Date)method21.invoke(oldModel, (Object[])null);

				newModel.setSignDate(value21);

				Method method22 = oldModelClass.getMethod("getMasterSigned");

				Integer value22 = (Integer)method22.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSigned(value22);

				Method method23 = oldModelClass.getMethod(
						"getMasterSignedImage");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setMasterSignedImage(value23);

				Method method24 = oldModelClass.getMethod("getAttachedFile");

				Long value24 = (Long)method24.invoke(oldModel, (Object[])null);

				newModel.setAttachedFile(value24);

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

	public static Object translateOutputTempShipStoresItems(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempShipStoresItemsClp newModel = new TempShipStoresItemsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod(
						"getShipsstoreItemCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipsstoreItemCode(value2);

				Method method3 = oldModelClass.getMethod("getNameOfArticle");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setNameOfArticle(value3);

				Method method4 = oldModelClass.getMethod("getQuantity");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setQuantity(value4);

				Method method5 = oldModelClass.getMethod("getQuantityUnit");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setQuantityUnit(value5);

				Method method6 = oldModelClass.getMethod("getLocationOnBoat");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setLocationOnBoat(value6);

				Method method7 = oldModelClass.getMethod("getUseInBoat");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setUseInBoat(value7);

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

	public static Object translateOutputTempUnitGeneral(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempUnitGeneralClp newModel = new TempUnitGeneralClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentName");

				Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value2);

				Method method3 = oldModelClass.getMethod("getDocumentYear");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value3);

				Method method4 = oldModelClass.getMethod("getGrossTonnageUnit");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setGrossTonnageUnit(value4);

				Method method5 = oldModelClass.getMethod("getNetTonnageUnit");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNetTonnageUnit(value5);

				Method method6 = oldModelClass.getMethod("getUnitDWT");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setUnitDWT(value6);

				Method method7 = oldModelClass.getMethod("getUnitLOA");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setUnitLOA(value7);

				Method method8 = oldModelClass.getMethod("getUnitBreadth");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setUnitBreadth(value8);

				Method method9 = oldModelClass.getMethod(
						"getUnitClearanceHeight");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setUnitClearanceHeight(value9);

				Method method10 = oldModelClass.getMethod("getUnitShownDraft");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraft(value10);

				Method method11 = oldModelClass.getMethod("getUnitShownDraftxF");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxF(value11);

				Method method12 = oldModelClass.getMethod("getUnitShownDraftxA");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setUnitShownDraftxA(value12);

				Method method13 = oldModelClass.getMethod("getUnitHorsePower");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setUnitHorsePower(value13);

				Method method14 = oldModelClass.getMethod(
						"getUnitRemainingOnBoardxB");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setUnitRemainingOnBoardxB(value14);

				Method method15 = oldModelClass.getMethod(
						"getUnitRemainingOnBoardxS");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setUnitRemainingOnBoardxS(value15);

				Method method16 = oldModelClass.getMethod("getUnitFO");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setUnitFO(value16);

				Method method17 = oldModelClass.getMethod("getUnitLO");

				String value17 = (String)method17.invoke(oldModel,
						(Object[])null);

				newModel.setUnitLO(value17);

				Method method18 = oldModelClass.getMethod("getUnitFW");

				String value18 = (String)method18.invoke(oldModel,
						(Object[])null);

				newModel.setUnitFW(value18);

				Method method19 = oldModelClass.getMethod("getUnitDO");

				String value19 = (String)method19.invoke(oldModel,
						(Object[])null);

				newModel.setUnitDO(value19);

				Method method20 = oldModelClass.getMethod("getUnitSludgeOil");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setUnitSludgeOil(value20);

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

	public static Object translateOutputTempWasteList(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				TempWasteListClp newModel = new TempWasteListClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentName");

				Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentName(value2);

				Method method3 = oldModelClass.getMethod("getDocumentYear");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setDocumentYear(value3);

				Method method4 = oldModelClass.getMethod("getTypeCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setTypeCode(value4);

				Method method5 = oldModelClass.getMethod("getTypeName");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setTypeName(value5);

				Method method6 = oldModelClass.getMethod("getWeight");

				Double value6 = (Double)method6.invoke(oldModel, (Object[])null);

				newModel.setWeight(value6);

				Method method7 = oldModelClass.getMethod("getUnit");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setUnit(value7);

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

	public static Object translateOutputViewHoanThanhThuTuc(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ViewHoanThanhThuTucClp newModel = new ViewHoanThanhThuTucClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getCVHH");

				String value0 = (String)method0.invoke(oldModel, (Object[])null);

				newModel.setCVHH(value0);

				Method method1 = oldModelClass.getMethod("getMaritimeOrder");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimeOrder(value1);

				Method method2 = oldModelClass.getMethod("getNC_KYSO");

				Integer value2 = (Integer)method2.invoke(oldModel,
						(Object[])null);

				newModel.setNC_KYSO(value2);

				Method method3 = oldModelClass.getMethod("getXC_KYSO");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setXC_KYSO(value3);

				Method method4 = oldModelClass.getMethod("getQC_KYSO");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setQC_KYSO(value4);

				Method method5 = oldModelClass.getMethod("getVC_KYSO");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setVC_KYSO(value5);

				Method method6 = oldModelClass.getMethod("getRC_KYSO");

				Integer value6 = (Integer)method6.invoke(oldModel,
						(Object[])null);

				newModel.setRC_KYSO(value6);

				Method method7 = oldModelClass.getMethod("getCCV_KYSO");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setCCV_KYSO(value7);

				Method method8 = oldModelClass.getMethod("getCCR_KYSO");

				Integer value8 = (Integer)method8.invoke(oldModel,
						(Object[])null);

				newModel.setCCR_KYSO(value8);

				Method method9 = oldModelClass.getMethod("getVCDK_KYSO");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setVCDK_KYSO(value9);

				Method method10 = oldModelClass.getMethod("getRCDK_KYSO");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setRCDK_KYSO(value10);

				Method method11 = oldModelClass.getMethod("getNCDK_KYSO");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setNCDK_KYSO(value11);

				Method method12 = oldModelClass.getMethod("getXCDK_KYSO");

				Integer value12 = (Integer)method12.invoke(oldModel,
						(Object[])null);

				newModel.setXCDK_KYSO(value12);

				Method method13 = oldModelClass.getMethod("getVCTND_KYSO");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setVCTND_KYSO(value13);

				Method method14 = oldModelClass.getMethod("getRCTND_KYSO");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setRCTND_KYSO(value14);

				Method method15 = oldModelClass.getMethod("getNC_DUYET");

				Integer value15 = (Integer)method15.invoke(oldModel,
						(Object[])null);

				newModel.setNC_DUYET(value15);

				Method method16 = oldModelClass.getMethod("getXC_DUYET");

				Integer value16 = (Integer)method16.invoke(oldModel,
						(Object[])null);

				newModel.setXC_DUYET(value16);

				Method method17 = oldModelClass.getMethod("getQC_DUYET");

				Integer value17 = (Integer)method17.invoke(oldModel,
						(Object[])null);

				newModel.setQC_DUYET(value17);

				Method method18 = oldModelClass.getMethod("getVC_DUYET");

				Integer value18 = (Integer)method18.invoke(oldModel,
						(Object[])null);

				newModel.setVC_DUYET(value18);

				Method method19 = oldModelClass.getMethod("getRC_DUYET");

				Integer value19 = (Integer)method19.invoke(oldModel,
						(Object[])null);

				newModel.setRC_DUYET(value19);

				Method method20 = oldModelClass.getMethod("getCCV_DUYET");

				Integer value20 = (Integer)method20.invoke(oldModel,
						(Object[])null);

				newModel.setCCV_DUYET(value20);

				Method method21 = oldModelClass.getMethod("getCCR_DUYET");

				Integer value21 = (Integer)method21.invoke(oldModel,
						(Object[])null);

				newModel.setCCR_DUYET(value21);

				Method method22 = oldModelClass.getMethod("getVCDK_DUYET");

				Integer value22 = (Integer)method22.invoke(oldModel,
						(Object[])null);

				newModel.setVCDK_DUYET(value22);

				Method method23 = oldModelClass.getMethod("getRCDK_DUYET");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setRCDK_DUYET(value23);

				Method method24 = oldModelClass.getMethod("getNCDK_DUYET");

				Integer value24 = (Integer)method24.invoke(oldModel,
						(Object[])null);

				newModel.setNCDK_DUYET(value24);

				Method method25 = oldModelClass.getMethod("getXCDK_DUYET");

				Integer value25 = (Integer)method25.invoke(oldModel,
						(Object[])null);

				newModel.setXCDK_DUYET(value25);

				Method method26 = oldModelClass.getMethod("getVCTND_DUYET");

				Integer value26 = (Integer)method26.invoke(oldModel,
						(Object[])null);

				newModel.setVCTND_DUYET(value26);

				Method method27 = oldModelClass.getMethod("getRCTND_DUYET");

				Integer value27 = (Integer)method27.invoke(oldModel,
						(Object[])null);

				newModel.setRCTND_DUYET(value27);

				Method method28 = oldModelClass.getMethod("getNCPTTND_DUYET");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setNCPTTND_DUYET(value28);

				Method method29 = oldModelClass.getMethod("getXCPTTND_DUYET");

				Integer value29 = (Integer)method29.invoke(oldModel,
						(Object[])null);

				newModel.setXCPTTND_DUYET(value29);

				Method method30 = oldModelClass.getMethod("getNCPTTND_KYSO");

				Integer value30 = (Integer)method30.invoke(oldModel,
						(Object[])null);

				newModel.setNCPTTND_KYSO(value30);

				Method method31 = oldModelClass.getMethod("getXCPTTND_KYSO");

				Integer value31 = (Integer)method31.invoke(oldModel,
						(Object[])null);

				newModel.setXCPTTND_KYSO(value31);

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