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

package vn.gt.dao.danhmuc.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.gt.dao.danhmuc.model.DmArrivalPurposeClp;
import vn.gt.dao.danhmuc.model.DmDataItemClp;
import vn.gt.dao.danhmuc.model.DmDocTypeClp;
import vn.gt.dao.danhmuc.model.DmEnterriseClp;
import vn.gt.dao.danhmuc.model.DmGoodsClp;
import vn.gt.dao.danhmuc.model.DmGoodsTypeClp;
import vn.gt.dao.danhmuc.model.DmHistoryArrivalPurposeClp;
import vn.gt.dao.danhmuc.model.DmHistoryDocTypeClp;
import vn.gt.dao.danhmuc.model.DmHistoryEnterriseClp;
import vn.gt.dao.danhmuc.model.DmHistoryGoodsClp;
import vn.gt.dao.danhmuc.model.DmHistoryGoodsTypeClp;
import vn.gt.dao.danhmuc.model.DmHistoryMaritimeClp;
import vn.gt.dao.danhmuc.model.DmHistoryPackageClp;
import vn.gt.dao.danhmuc.model.DmHistoryPassportTypeClp;
import vn.gt.dao.danhmuc.model.DmHistoryPortClp;
import vn.gt.dao.danhmuc.model.DmHistoryPortHarbourClp;
import vn.gt.dao.danhmuc.model.DmHistoryPortRegionClp;
import vn.gt.dao.danhmuc.model.DmHistoryPortWharfClp;
import vn.gt.dao.danhmuc.model.DmHistoryRankRatingClp;
import vn.gt.dao.danhmuc.model.DmHistoryRepresentativeClp;
import vn.gt.dao.danhmuc.model.DmHistorySecurityLevelClp;
import vn.gt.dao.danhmuc.model.DmHistoryShipAgencyClp;
import vn.gt.dao.danhmuc.model.DmHistoryShipTypeClp;
import vn.gt.dao.danhmuc.model.DmHistoryStateClp;
import vn.gt.dao.danhmuc.model.DmHistoryUnitGeneralClp;
import vn.gt.dao.danhmuc.model.DmMaritimeClp;
import vn.gt.dao.danhmuc.model.DmPackageClp;
import vn.gt.dao.danhmuc.model.DmPassportTypeClp;
import vn.gt.dao.danhmuc.model.DmPortClp;
import vn.gt.dao.danhmuc.model.DmPortHarbourClp;
import vn.gt.dao.danhmuc.model.DmPortRegionClp;
import vn.gt.dao.danhmuc.model.DmPortWharfClp;
import vn.gt.dao.danhmuc.model.DmRankRatingClp;
import vn.gt.dao.danhmuc.model.DmRepresentativeClp;
import vn.gt.dao.danhmuc.model.DmSecurityLevelClp;
import vn.gt.dao.danhmuc.model.DmShipAgencyClp;
import vn.gt.dao.danhmuc.model.DmShipTypeClp;
import vn.gt.dao.danhmuc.model.DmStateClp;
import vn.gt.dao.danhmuc.model.DmSyncCategoryClp;
import vn.gt.dao.danhmuc.model.DmTestN01RequestClp;
import vn.gt.dao.danhmuc.model.DmUnitGeneralClp;
import vn.gt.dao.danhmuc.model.HistoryRmdcShipClp;
import vn.gt.dao.danhmuc.model.HistorySyncVersionClp;
import vn.gt.dao.danhmuc.model.RmdcShipClp;
import vn.gt.dao.danhmuc.model.ThamSoHeThongClp;

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

		if (oldModelClassName.equals(DmArrivalPurposeClp.class.getName())) {
			return translateInputDmArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(DmDataItemClp.class.getName())) {
			return translateInputDmDataItem(oldModel);
		}

		if (oldModelClassName.equals(DmDocTypeClp.class.getName())) {
			return translateInputDmDocType(oldModel);
		}

		if (oldModelClassName.equals(DmEnterriseClp.class.getName())) {
			return translateInputDmEnterrise(oldModel);
		}

		if (oldModelClassName.equals(DmGoodsClp.class.getName())) {
			return translateInputDmGoods(oldModel);
		}

		if (oldModelClassName.equals(DmGoodsTypeClp.class.getName())) {
			return translateInputDmGoodsType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryArrivalPurposeClp.class.getName())) {
			return translateInputDmHistoryArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryDocTypeClp.class.getName())) {
			return translateInputDmHistoryDocType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryEnterriseClp.class.getName())) {
			return translateInputDmHistoryEnterrise(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryGoodsClp.class.getName())) {
			return translateInputDmHistoryGoods(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryGoodsTypeClp.class.getName())) {
			return translateInputDmHistoryGoodsType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryMaritimeClp.class.getName())) {
			return translateInputDmHistoryMaritime(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPackageClp.class.getName())) {
			return translateInputDmHistoryPackage(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPassportTypeClp.class.getName())) {
			return translateInputDmHistoryPassportType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortClp.class.getName())) {
			return translateInputDmHistoryPort(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortHarbourClp.class.getName())) {
			return translateInputDmHistoryPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortRegionClp.class.getName())) {
			return translateInputDmHistoryPortRegion(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryPortWharfClp.class.getName())) {
			return translateInputDmHistoryPortWharf(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryRankRatingClp.class.getName())) {
			return translateInputDmHistoryRankRating(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryRepresentativeClp.class.getName())) {
			return translateInputDmHistoryRepresentative(oldModel);
		}

		if (oldModelClassName.equals(DmHistorySecurityLevelClp.class.getName())) {
			return translateInputDmHistorySecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryShipAgencyClp.class.getName())) {
			return translateInputDmHistoryShipAgency(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryShipTypeClp.class.getName())) {
			return translateInputDmHistoryShipType(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryStateClp.class.getName())) {
			return translateInputDmHistoryState(oldModel);
		}

		if (oldModelClassName.equals(DmHistoryUnitGeneralClp.class.getName())) {
			return translateInputDmHistoryUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(DmMaritimeClp.class.getName())) {
			return translateInputDmMaritime(oldModel);
		}

		if (oldModelClassName.equals(DmPackageClp.class.getName())) {
			return translateInputDmPackage(oldModel);
		}

		if (oldModelClassName.equals(DmPassportTypeClp.class.getName())) {
			return translateInputDmPassportType(oldModel);
		}

		if (oldModelClassName.equals(DmPortClp.class.getName())) {
			return translateInputDmPort(oldModel);
		}

		if (oldModelClassName.equals(DmPortHarbourClp.class.getName())) {
			return translateInputDmPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(DmPortRegionClp.class.getName())) {
			return translateInputDmPortRegion(oldModel);
		}

		if (oldModelClassName.equals(DmPortWharfClp.class.getName())) {
			return translateInputDmPortWharf(oldModel);
		}

		if (oldModelClassName.equals(DmRankRatingClp.class.getName())) {
			return translateInputDmRankRating(oldModel);
		}

		if (oldModelClassName.equals(DmRepresentativeClp.class.getName())) {
			return translateInputDmRepresentative(oldModel);
		}

		if (oldModelClassName.equals(DmSecurityLevelClp.class.getName())) {
			return translateInputDmSecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(DmShipAgencyClp.class.getName())) {
			return translateInputDmShipAgency(oldModel);
		}

		if (oldModelClassName.equals(DmShipTypeClp.class.getName())) {
			return translateInputDmShipType(oldModel);
		}

		if (oldModelClassName.equals(DmStateClp.class.getName())) {
			return translateInputDmState(oldModel);
		}

		if (oldModelClassName.equals(DmSyncCategoryClp.class.getName())) {
			return translateInputDmSyncCategory(oldModel);
		}

		if (oldModelClassName.equals(DmTestN01RequestClp.class.getName())) {
			return translateInputDmTestN01Request(oldModel);
		}

		if (oldModelClassName.equals(DmUnitGeneralClp.class.getName())) {
			return translateInputDmUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(HistoryRmdcShipClp.class.getName())) {
			return translateInputHistoryRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(HistorySyncVersionClp.class.getName())) {
			return translateInputHistorySyncVersion(oldModel);
		}

		if (oldModelClassName.equals(RmdcShipClp.class.getName())) {
			return translateInputRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(ThamSoHeThongClp.class.getName())) {
			return translateInputThamSoHeThong(oldModel);
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

	public static Object translateInputDmArrivalPurpose(BaseModel<?> oldModel) {
		DmArrivalPurposeClp oldCplModel = (DmArrivalPurposeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmArrivalPurposeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPurposeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPurposeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPurposeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPurposeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPurposeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPurposeNameVN();

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

	public static Object translateInputDmDataItem(BaseModel<?> oldModel) {
		DmDataItemClp oldCplModel = (DmDataItemClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmDataItemImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setDataGroupId",
						new Class[] { Long.TYPE });

				Long value1 = new Long(oldCplModel.getDataGroupId());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setCode0",
						new Class[] { String.class });

				String value2 = oldCplModel.getCode0();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setNode1",
						new Class[] { String.class });

				String value3 = oldCplModel.getNode1();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setNode2",
						new Class[] { String.class });

				String value4 = oldCplModel.getNode2();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setNode3",
						new Class[] { String.class });

				String value5 = oldCplModel.getNode3();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setNode4",
						new Class[] { String.class });

				String value6 = oldCplModel.getNode4();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setLevel",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getLevel());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setName",
						new Class[] { String.class });

				String value8 = oldCplModel.getName();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setShortName",
						new Class[] { String.class });

				String value9 = oldCplModel.getShortName();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value10 = oldCplModel.getDescription();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setValidatedFrom",
						new Class[] { Date.class });

				Date value11 = oldCplModel.getValidatedFrom();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setValidatedTo",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getValidatedTo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setOrder",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getOrder());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setStatus",
						new Class[] { Integer.TYPE });

				Integer value14 = new Integer(oldCplModel.getStatus());

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

	public static Object translateInputDmDocType(BaseModel<?> oldModel) {
		DmDocTypeClp oldCplModel = (DmDocTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmDocTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setDocumentTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getDocumentTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value2 = oldCplModel.getDocumentType();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentTypeName",
						new Class[] { String.class });

				String value3 = oldCplModel.getDocumentTypeName();

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

	public static Object translateInputDmEnterrise(BaseModel<?> oldModel) {
		DmEnterriseClp oldCplModel = (DmEnterriseClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmEnterriseImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setEnterpriseCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getEnterpriseCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setEnterpriseTaxCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getEnterpriseTaxCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setEnterpriseName",
						new Class[] { String.class });

				String value3 = oldCplModel.getEnterpriseName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setEnterpriseShortName",
						new Class[] { String.class });

				String value4 = oldCplModel.getEnterpriseShortName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setEnterpriseForeignName",
						new Class[] { String.class });

				String value5 = oldCplModel.getEnterpriseForeignName();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setEnterprisePerson",
						new Class[] { String.class });

				String value6 = oldCplModel.getEnterprisePerson();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setEnterpriseHOAddress",
						new Class[] { String.class });

				String value7 = oldCplModel.getEnterpriseHOAddress();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getStateCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCityCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getCityCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setDistrictCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getDistrictCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setWardCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getWardCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setTelephoneNo",
						new Class[] { String.class });

				String value12 = oldCplModel.getTelephoneNo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRegistrationCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getRegistrationCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setRegistrationAddress",
						new Class[] { String.class });

				String value14 = oldCplModel.getRegistrationAddress();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setRegistrationDate",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getRegistrationDate();

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

				Method method21 = newModelClass.getMethod("setModifiedUser",
						new Class[] { String.class });

				String value21 = oldCplModel.getModifiedUser();

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

	public static Object translateInputDmGoods(BaseModel<?> oldModel) {
		DmGoodsClp oldCplModel = (DmGoodsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmGoodsImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setGoodsItemCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getGoodsItemCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setGoodsItemName",
						new Class[] { String.class });

				String value2 = oldCplModel.getGoodsItemName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setGoodsItemNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getGoodsItemNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGoodsItemOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getGoodsItemOrder());

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

	public static Object translateInputDmGoodsType(BaseModel<?> oldModel) {
		DmGoodsTypeClp oldCplModel = (DmGoodsTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmGoodsTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setGoodsTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getGoodsTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setGoodsTypeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getGoodsTypeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setGoodsTypeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getGoodsTypeNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGoodsTypeOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getGoodsTypeOrder());

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

	public static Object translateInputDmHistoryArrivalPurpose(
		BaseModel<?> oldModel) {
		DmHistoryArrivalPurposeClp oldCplModel = (DmHistoryArrivalPurposeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryArrivalPurposeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPurposeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPurposeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPurposeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPurposeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPurposeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPurposeNameVN();

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

	public static Object translateInputDmHistoryDocType(BaseModel<?> oldModel) {
		DmHistoryDocTypeClp oldCplModel = (DmHistoryDocTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryDocTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setDocumentTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getDocumentTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setDocumentType",
						new Class[] { String.class });

				String value2 = oldCplModel.getDocumentType();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDocumentTypeName",
						new Class[] { String.class });

				String value3 = oldCplModel.getDocumentTypeName();

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

	public static Object translateInputDmHistoryEnterrise(BaseModel<?> oldModel) {
		DmHistoryEnterriseClp oldCplModel = (DmHistoryEnterriseClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryEnterriseImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setEnterpriseCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getEnterpriseCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setEnterpriseTaxCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getEnterpriseTaxCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setEnterpriseName",
						new Class[] { String.class });

				String value3 = oldCplModel.getEnterpriseName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setEnterpriseShortName",
						new Class[] { String.class });

				String value4 = oldCplModel.getEnterpriseShortName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setEnterpriseForeignName",
						new Class[] { String.class });

				String value5 = oldCplModel.getEnterpriseForeignName();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setEnterprisePerson",
						new Class[] { String.class });

				String value6 = oldCplModel.getEnterprisePerson();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setEnterpriseHOAddress",
						new Class[] { String.class });

				String value7 = oldCplModel.getEnterpriseHOAddress();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getStateCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCityCode",
						new Class[] { String.class });

				String value9 = oldCplModel.getCityCode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setDistrictCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getDistrictCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setWardCode",
						new Class[] { String.class });

				String value11 = oldCplModel.getWardCode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setTelephoneNo",
						new Class[] { String.class });

				String value12 = oldCplModel.getTelephoneNo();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRegistrationCode",
						new Class[] { String.class });

				String value13 = oldCplModel.getRegistrationCode();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setRegistrationAddress",
						new Class[] { String.class });

				String value14 = oldCplModel.getRegistrationAddress();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setRegistrationDate",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getRegistrationDate();

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

				Method method21 = newModelClass.getMethod("setModifiedUser",
						new Class[] { String.class });

				String value21 = oldCplModel.getModifiedUser();

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

	public static Object translateInputDmHistoryGoods(BaseModel<?> oldModel) {
		DmHistoryGoodsClp oldCplModel = (DmHistoryGoodsClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryGoodsImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setGoodsItemCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getGoodsItemCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setGoodsItemName",
						new Class[] { String.class });

				String value2 = oldCplModel.getGoodsItemName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setGoodsItemNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getGoodsItemNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGoodsItemOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getGoodsItemOrder());

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

	public static Object translateInputDmHistoryGoodsType(BaseModel<?> oldModel) {
		DmHistoryGoodsTypeClp oldCplModel = (DmHistoryGoodsTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryGoodsTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setGoodsTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getGoodsTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setGoodsTypeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getGoodsTypeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setGoodsTypeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getGoodsTypeNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setGoodsTypeOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getGoodsTypeOrder());

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

	public static Object translateInputDmHistoryMaritime(BaseModel<?> oldModel) {
		DmHistoryMaritimeClp oldCplModel = (DmHistoryMaritimeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryMaritimeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getMaritimeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMaritimeReference",
						new Class[] { String.class });

				String value2 = oldCplModel.getMaritimeReference();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setMaritimeOrder",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getMaritimeOrder());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMaritimeName",
						new Class[] { String.class });

				String value4 = oldCplModel.getMaritimeName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setMaritimeNameVN",
						new Class[] { String.class });

				String value5 = oldCplModel.getMaritimeNameVN();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setAddress",
						new Class[] { String.class });

				String value6 = oldCplModel.getAddress();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setAddressVN",
						new Class[] { String.class });

				String value7 = oldCplModel.getAddressVN();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getStateCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCitycode",
						new Class[] { String.class });

				String value9 = oldCplModel.getCitycode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getIsDelete());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getMarkedAsDelete());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getModifiedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getRequestedDate();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value14 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmHistoryPackage(BaseModel<?> oldModel) {
		DmHistoryPackageClp oldCplModel = (DmHistoryPackageClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryPackageImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPackageCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPackageCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPackageName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPackageName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPackageNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPackageNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPackageOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPackageOrder());

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

	public static Object translateInputDmHistoryPassportType(
		BaseModel<?> oldModel) {
		DmHistoryPassportTypeClp oldCplModel = (DmHistoryPassportTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryPassportTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPassportTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPassportTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPassportType",
						new Class[] { String.class });

				String value2 = oldCplModel.getPassportType();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPassportTypeName",
						new Class[] { String.class });

				String value3 = oldCplModel.getPassportTypeName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPassportTypeNameVN",
						new Class[] { String.class });

				String value4 = oldCplModel.getPassportTypeNameVN();

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

	public static Object translateInputDmHistoryPort(BaseModel<?> oldModel) {
		DmHistoryPortClp oldCplModel = (DmHistoryPortClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryPortImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setLoCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getLoCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortName",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setFullName",
						new Class[] { String.class });

				String value4 = oldCplModel.getFullName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setFullNameVN",
						new Class[] { String.class });

				String value5 = oldCplModel.getFullNameVN();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortType",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortType();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortOrder",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getPortOrder());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setAddress",
						new Class[] { String.class });

				String value8 = oldCplModel.getAddress();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setAddressVN",
						new Class[] { String.class });

				String value9 = oldCplModel.getAddressVN();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getStateCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setCitycode",
						new Class[] { String.class });

				String value11 = oldCplModel.getCitycode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value12 = new Integer(oldCplModel.getIsDelete());

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getMarkedAsDelete());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value14 = oldCplModel.getModifiedDate();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getRequestedDate();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value16 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmHistoryPortHarbour(
		BaseModel<?> oldModel) {
		DmHistoryPortHarbourClp oldCplModel = (DmHistoryPortHarbourClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryPortHarbourImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortHarbourCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortHarbourName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortHarbourName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortHarbourNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortHarbourNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPortHarbourType",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPortHarbourType());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortRegion",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortRegion();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPortRegionCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNote",
						new Class[] { String.class });

				String value8 = oldCplModel.getNote();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getIsDelete());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getMarkedAsDelete());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value11 = oldCplModel.getModifiedDate();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getRequestedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value13 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmHistoryPortRegion(
		BaseModel<?> oldModel) {
		DmHistoryPortRegionClp oldCplModel = (DmHistoryPortRegionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryPortRegionImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortRegionCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortRegionName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortRegionName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortRegionNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortRegionNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPortRegionRef",
						new Class[] { String.class });

				String value4 = oldCplModel.getPortRegionRef();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortCode();

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

	public static Object translateInputDmHistoryPortWharf(BaseModel<?> oldModel) {
		DmHistoryPortWharfClp oldCplModel = (DmHistoryPortWharfClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryPortWharfImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortWharfCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortWharfCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortWharfName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortWharfName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortWharfNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortWharfNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPortWharfType",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPortWharfType());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortHarbourCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPortRegionCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNote",
						new Class[] { String.class });

				String value8 = oldCplModel.getNote();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getIsDelete());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getMarkedAsDelete());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value11 = oldCplModel.getModifiedDate();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getRequestedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value13 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmHistoryRankRating(
		BaseModel<?> oldModel) {
		DmHistoryRankRatingClp oldCplModel = (DmHistoryRankRatingClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryRankRatingImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRankCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getRankCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setRankName",
						new Class[] { String.class });

				String value2 = oldCplModel.getRankName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRankNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getRankNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRankOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getRankOrder());

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

	public static Object translateInputDmHistoryRepresentative(
		BaseModel<?> oldModel) {
		DmHistoryRepresentativeClp oldCplModel = (DmHistoryRepresentativeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryRepresentativeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRepCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getRepCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setRepName",
						new Class[] { String.class });

				String value2 = oldCplModel.getRepName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRepNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getRepNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRepLevel",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getRepLevel());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRepOrder",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getRepOrder());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getMaritimeCode();

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

	public static Object translateInputDmHistorySecurityLevel(
		BaseModel<?> oldModel) {
		DmHistorySecurityLevelClp oldCplModel = (DmHistorySecurityLevelClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistorySecurityLevelImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setSecurityLevelCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getSecurityLevelCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setSecurityLevel",
						new Class[] { String.class });

				String value2 = oldCplModel.getSecurityLevel();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setSecurityLevelName",
						new Class[] { String.class });

				String value3 = oldCplModel.getSecurityLevelName();

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

	public static Object translateInputDmHistoryShipAgency(
		BaseModel<?> oldModel) {
		DmHistoryShipAgencyClp oldCplModel = (DmHistoryShipAgencyClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryShipAgencyImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getShipAgencyCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setShipAgencyName",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipAgencyName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setShipAgencyNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getShipAgencyNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setTaxCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getTaxCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getStateCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCitycode",
						new Class[] { String.class });

				String value6 = oldCplModel.getCitycode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setAddress",
						new Class[] { String.class });

				String value7 = oldCplModel.getAddress();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setAddressVN",
						new Class[] { String.class });

				String value8 = oldCplModel.getAddressVN();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPhone",
						new Class[] { String.class });

				String value9 = oldCplModel.getPhone();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setFax",
						new Class[] { String.class });

				String value10 = oldCplModel.getFax();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setEmail",
						new Class[] { String.class });

				String value11 = oldCplModel.getEmail();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value12 = oldCplModel.getDescription();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setContacter",
						new Class[] { String.class });

				String value13 = oldCplModel.getContacter();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setPosition",
						new Class[] { String.class });

				String value14 = oldCplModel.getPosition();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setContactTell",
						new Class[] { String.class });

				String value15 = oldCplModel.getContactTell();

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

	public static Object translateInputDmHistoryShipType(BaseModel<?> oldModel) {
		DmHistoryShipTypeClp oldCplModel = (DmHistoryShipTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryShipTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getShipTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setShipTypeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipTypeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setShipTypeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getShipTypeNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setShipTypeOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getShipTypeOrder());

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

	public static Object translateInputDmHistoryState(BaseModel<?> oldModel) {
		DmHistoryStateClp oldCplModel = (DmHistoryStateClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryStateImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getStateCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setStateName",
						new Class[] { String.class });

				String value2 = oldCplModel.getStateName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value3 = oldCplModel.getDescription();

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

	public static Object translateInputDmHistoryUnitGeneral(
		BaseModel<?> oldModel) {
		DmHistoryUnitGeneralClp oldCplModel = (DmHistoryUnitGeneralClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmHistoryUnitGeneralImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setUnitCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getUnitCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setUnitName",
						new Class[] { String.class });

				String value2 = oldCplModel.getUnitName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getIsDelete());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getMarkedAsDelete());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getModifiedDate();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getRequestedDate();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value7 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmMaritime(BaseModel<?> oldModel) {
		DmMaritimeClp oldCplModel = (DmMaritimeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getMaritimeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setMaritimeReference",
						new Class[] { String.class });

				String value2 = oldCplModel.getMaritimeReference();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setMaritimeOrder",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getMaritimeOrder());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMaritimeName",
						new Class[] { String.class });

				String value4 = oldCplModel.getMaritimeName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setMaritimeNameVN",
						new Class[] { String.class });

				String value5 = oldCplModel.getMaritimeNameVN();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setAddress",
						new Class[] { String.class });

				String value6 = oldCplModel.getAddress();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setAddressVN",
						new Class[] { String.class });

				String value7 = oldCplModel.getAddressVN();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getStateCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setCitycode",
						new Class[] { String.class });

				String value9 = oldCplModel.getCitycode();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getIsDelete());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getMarkedAsDelete());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getModifiedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value13 = oldCplModel.getRequestedDate();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value14 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmPackage(BaseModel<?> oldModel) {
		DmPackageClp oldCplModel = (DmPackageClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmPackageImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPackageCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPackageCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPackageName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPackageName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPackageNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPackageNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPackageOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPackageOrder());

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

	public static Object translateInputDmPassportType(BaseModel<?> oldModel) {
		DmPassportTypeClp oldCplModel = (DmPassportTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmPassportTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPassportTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPassportTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPassportType",
						new Class[] { String.class });

				String value2 = oldCplModel.getPassportType();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPassportTypeName",
						new Class[] { String.class });

				String value3 = oldCplModel.getPassportTypeName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPassportTypeNameVN",
						new Class[] { String.class });

				String value4 = oldCplModel.getPassportTypeNameVN();

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

	public static Object translateInputDmPort(BaseModel<?> oldModel) {
		DmPortClp oldCplModel = (DmPortClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmPortImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setLoCode",
						new Class[] { String.class });

				String value2 = oldCplModel.getLoCode();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortName",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortName();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setFullName",
						new Class[] { String.class });

				String value4 = oldCplModel.getFullName();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setFullNameVN",
						new Class[] { String.class });

				String value5 = oldCplModel.getFullNameVN();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortType",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortType();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortOrder",
						new Class[] { Integer.TYPE });

				Integer value7 = new Integer(oldCplModel.getPortOrder());

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setAddress",
						new Class[] { String.class });

				String value8 = oldCplModel.getAddress();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setAddressVN",
						new Class[] { String.class });

				String value9 = oldCplModel.getAddressVN();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value10 = oldCplModel.getStateCode();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setCitycode",
						new Class[] { String.class });

				String value11 = oldCplModel.getCitycode();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value12 = new Integer(oldCplModel.getIsDelete());

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value13 = new Integer(oldCplModel.getMarkedAsDelete());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value14 = oldCplModel.getModifiedDate();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value15 = oldCplModel.getRequestedDate();

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value16 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmPortHarbour(BaseModel<?> oldModel) {
		DmPortHarbourClp oldCplModel = (DmPortHarbourClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmPortHarbourImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortHarbourCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortHarbourName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortHarbourName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortHarbourNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortHarbourNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPortHarbourType",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPortHarbourType());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortRegion",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortRegion();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPortRegionCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNote",
						new Class[] { String.class });

				String value8 = oldCplModel.getNote();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getIsDelete());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getMarkedAsDelete());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value11 = oldCplModel.getModifiedDate();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getRequestedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value13 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmPortRegion(BaseModel<?> oldModel) {
		DmPortRegionClp oldCplModel = (DmPortRegionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortRegionCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortRegionName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortRegionName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortRegionNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortRegionNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPortRegionRef",
						new Class[] { String.class });

				String value4 = oldCplModel.getPortRegionRef();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortCode();

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

	public static Object translateInputDmPortWharf(BaseModel<?> oldModel) {
		DmPortWharfClp oldCplModel = (DmPortWharfClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmPortWharfImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setPortWharfCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getPortWharfCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setPortWharfName",
						new Class[] { String.class });

				String value2 = oldCplModel.getPortWharfName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setPortWharfNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getPortWharfNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setPortWharfType",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getPortWharfType());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setPortCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getPortCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setPortHarbourCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getPortHarbourCode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setPortRegionCode",
						new Class[] { String.class });

				String value7 = oldCplModel.getPortRegionCode();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setNote",
						new Class[] { String.class });

				String value8 = oldCplModel.getNote();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value9 = new Integer(oldCplModel.getIsDelete());

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value10 = new Integer(oldCplModel.getMarkedAsDelete());

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value11 = oldCplModel.getModifiedDate();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getRequestedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value13 = oldCplModel.getSyncVersion();

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

	public static Object translateInputDmRankRating(BaseModel<?> oldModel) {
		DmRankRatingClp oldCplModel = (DmRankRatingClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmRankRatingImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRankCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getRankCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setRankName",
						new Class[] { String.class });

				String value2 = oldCplModel.getRankName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRankNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getRankNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRankOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getRankOrder());

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

	public static Object translateInputDmRepresentative(BaseModel<?> oldModel) {
		DmRepresentativeClp oldCplModel = (DmRepresentativeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmRepresentativeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRepCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getRepCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setRepName",
						new Class[] { String.class });

				String value2 = oldCplModel.getRepName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setRepNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getRepNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setRepLevel",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getRepLevel());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setRepOrder",
						new Class[] { Integer.TYPE });

				Integer value5 = new Integer(oldCplModel.getRepOrder());

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setMaritimeCode",
						new Class[] { String.class });

				String value6 = oldCplModel.getMaritimeCode();

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

	public static Object translateInputDmSecurityLevel(BaseModel<?> oldModel) {
		DmSecurityLevelClp oldCplModel = (DmSecurityLevelClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmSecurityLevelImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setSecurityLevelCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getSecurityLevelCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setSecurityLevel",
						new Class[] { String.class });

				String value2 = oldCplModel.getSecurityLevel();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setSecurityLevelName",
						new Class[] { String.class });

				String value3 = oldCplModel.getSecurityLevelName();

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

	public static Object translateInputDmShipAgency(BaseModel<?> oldModel) {
		DmShipAgencyClp oldCplModel = (DmShipAgencyClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmShipAgencyImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getShipAgencyCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setShipAgencyName",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipAgencyName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setShipAgencyNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getShipAgencyNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setTaxCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getTaxCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value5 = oldCplModel.getStateCode();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCitycode",
						new Class[] { String.class });

				String value6 = oldCplModel.getCitycode();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setAddress",
						new Class[] { String.class });

				String value7 = oldCplModel.getAddress();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setAddressVN",
						new Class[] { String.class });

				String value8 = oldCplModel.getAddressVN();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setPhone",
						new Class[] { String.class });

				String value9 = oldCplModel.getPhone();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setFax",
						new Class[] { String.class });

				String value10 = oldCplModel.getFax();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setEmail",
						new Class[] { String.class });

				String value11 = oldCplModel.getEmail();

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value12 = oldCplModel.getDescription();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setContacter",
						new Class[] { String.class });

				String value13 = oldCplModel.getContacter();

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setPosition",
						new Class[] { String.class });

				String value14 = oldCplModel.getPosition();

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setContactTell",
						new Class[] { String.class });

				String value15 = oldCplModel.getContactTell();

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

	public static Object translateInputDmShipType(BaseModel<?> oldModel) {
		DmShipTypeClp oldCplModel = (DmShipTypeClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmShipTypeImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getShipTypeCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setShipTypeName",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipTypeName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setShipTypeNameVN",
						new Class[] { String.class });

				String value3 = oldCplModel.getShipTypeNameVN();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setShipTypeOrder",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getShipTypeOrder());

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

	public static Object translateInputDmState(BaseModel<?> oldModel) {
		DmStateClp oldCplModel = (DmStateClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmStateImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getStateCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setStateName",
						new Class[] { String.class });

				String value2 = oldCplModel.getStateName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value3 = oldCplModel.getDescription();

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

	public static Object translateInputDmSyncCategory(BaseModel<?> oldModel) {
		DmSyncCategoryClp oldCplModel = (DmSyncCategoryClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmSyncCategoryImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setCategoryId",
						new Class[] { String.class });

				String value1 = oldCplModel.getCategoryId();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setCategoryDescription",
						new Class[] { String.class });

				String value2 = oldCplModel.getCategoryDescription();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setModifiedUser",
						new Class[] { String.class });

				String value3 = oldCplModel.getModifiedUser();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value4 = oldCplModel.getModifiedDate();

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

	public static Object translateInputDmTestN01Request(BaseModel<?> oldModel) {
		DmTestN01RequestClp oldCplModel = (DmTestN01RequestClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmTestN01RequestImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setRequestID",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getRequestID());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setEnterpriseCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getEnterpriseCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setTenDuAn",
						new Class[] { String.class });

				String value2 = oldCplModel.getTenDuAn();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setSuCanThietDauTu",
						new Class[] { String.class });

				String value3 = oldCplModel.getSuCanThietDauTu();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setViTri",
						new Class[] { String.class });

				String value4 = oldCplModel.getViTri();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setLoaiTauBienGioiHanVaoCang",
						new Class[] { String.class });

				String value5 = oldCplModel.getLoaiTauBienGioiHanVaoCang();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSoLuongCauCang",
						new Class[] { String.class });

				String value6 = oldCplModel.getSoLuongCauCang();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setTongDienTichXayDungDuKien",
						new Class[] { String.class });

				String value7 = oldCplModel.getTongDienTichXayDungDuKien();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setTaiLieulienQuan",
						new Class[] { String.class });

				String value8 = oldCplModel.getTaiLieulienQuan();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value9 = oldCplModel.getModifiedDate();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setModifiedUser",
						new Class[] { String.class });

				String value10 = oldCplModel.getModifiedUser();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setIsAuthorized",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getIsAuthorized());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setAuthorizedDate",
						new Class[] { Date.class });

				Date value12 = oldCplModel.getAuthorizedDate();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setAuthorizedUser",
						new Class[] { String.class });

				String value13 = oldCplModel.getAuthorizedUser();

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

	public static Object translateInputDmUnitGeneral(BaseModel<?> oldModel) {
		DmUnitGeneralClp oldCplModel = (DmUnitGeneralClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.DmUnitGeneralImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Integer.TYPE });

				Integer value0 = new Integer(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setUnitCode",
						new Class[] { String.class });

				String value1 = oldCplModel.getUnitCode();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setUnitName",
						new Class[] { String.class });

				String value2 = oldCplModel.getUnitName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getIsDelete());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value4 = new Integer(oldCplModel.getMarkedAsDelete());

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value5 = oldCplModel.getModifiedDate();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value6 = oldCplModel.getRequestedDate();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value7 = oldCplModel.getSyncVersion();

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

	public static Object translateInputHistoryRmdcShip(BaseModel<?> oldModel) {
		HistoryRmdcShipClp oldCplModel = (HistoryRmdcShipClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.HistoryRmdcShipImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setShipId",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getShipId());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setShipName",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setShipTypeId",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getShipTypeId());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getShipTypeCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setImo",
						new Class[] { String.class });

				String value5 = oldCplModel.getImo();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value6 = oldCplModel.getCallSign();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setStateId",
						new Class[] { String.class });

				String value7 = oldCplModel.getStateId();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getStateCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setRegistryNumber",
						new Class[] { String.class });

				String value9 = oldCplModel.getRegistryNumber();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setRegistryDate",
						new Class[] { Date.class });

				Date value10 = oldCplModel.getRegistryDate();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setRegistryPortId",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getRegistryPortId());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRegistryPortCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getRegistryPortCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setGt",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getGt());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setNrt",
						new Class[] { Double.TYPE });

				Double value14 = new Double(oldCplModel.getNrt());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getDwt());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setLength",
						new Class[] { Double.TYPE });

				Double value16 = new Double(oldCplModel.getLength());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setWidth",
						new Class[] { Double.TYPE });

				Double value17 = new Double(oldCplModel.getWidth());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setHeight",
						new Class[] { Double.TYPE });

				Double value18 = new Double(oldCplModel.getHeight());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setSailingSpeed",
						new Class[] { Double.TYPE });

				Double value19 = new Double(oldCplModel.getSailingSpeed());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setColor",
						new Class[] { String.class });

				String value20 = oldCplModel.getColor();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setBoneCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getBoneCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setMachineCode",
						new Class[] { String.class });

				String value22 = oldCplModel.getMachineCode();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setShipAgencyId",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getShipAgencyId());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value24 = oldCplModel.getShipAgencyCode();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setFishingBoatRegistration",
						new Class[] { String.class });

				String value25 = oldCplModel.getFishingBoatRegistration();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setRoleShip",
						new Class[] { Integer.TYPE });

				Integer value26 = new Integer(oldCplModel.getRoleShip());

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value27 = new Integer(oldCplModel.getIsDelete());

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getMarkedAsDelete());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value29 = oldCplModel.getModifiedDate();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value30 = oldCplModel.getRequestedDate();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value31 = oldCplModel.getSyncVersion();

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

	public static Object translateInputHistorySyncVersion(BaseModel<?> oldModel) {
		HistorySyncVersionClp oldCplModel = (HistorySyncVersionClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.HistorySyncVersionImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value1 = oldCplModel.getRequestedDate();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setTimeofPublish",
						new Class[] { Date.class });

				Date value2 = oldCplModel.getTimeofPublish();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setCategoryID",
						new Class[] { String.class });

				String value3 = oldCplModel.getCategoryID();

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setSyncUnit",
						new Class[] { String.class });

				String value4 = oldCplModel.getSyncUnit();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setSyncUser",
						new Class[] { String.class });

				String value5 = oldCplModel.getSyncUser();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value6 = oldCplModel.getSyncVersion();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setLatestValueDate",
						new Class[] { Date.class });

				Date value7 = oldCplModel.getLatestValueDate();

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

	public static Object translateInputRmdcShip(BaseModel<?> oldModel) {
		RmdcShipClp oldCplModel = (RmdcShipClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.RmdcShipImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setShipId",
						new Class[] { Integer.TYPE });

				Integer value1 = new Integer(oldCplModel.getShipId());

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setShipName",
						new Class[] { String.class });

				String value2 = oldCplModel.getShipName();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setShipTypeId",
						new Class[] { Integer.TYPE });

				Integer value3 = new Integer(oldCplModel.getShipTypeId());

				method3.invoke(newModel, value3);

				Method method4 = newModelClass.getMethod("setShipTypeCode",
						new Class[] { String.class });

				String value4 = oldCplModel.getShipTypeCode();

				method4.invoke(newModel, value4);

				Method method5 = newModelClass.getMethod("setImo",
						new Class[] { String.class });

				String value5 = oldCplModel.getImo();

				method5.invoke(newModel, value5);

				Method method6 = newModelClass.getMethod("setCallSign",
						new Class[] { String.class });

				String value6 = oldCplModel.getCallSign();

				method6.invoke(newModel, value6);

				Method method7 = newModelClass.getMethod("setStateId",
						new Class[] { String.class });

				String value7 = oldCplModel.getStateId();

				method7.invoke(newModel, value7);

				Method method8 = newModelClass.getMethod("setStateCode",
						new Class[] { String.class });

				String value8 = oldCplModel.getStateCode();

				method8.invoke(newModel, value8);

				Method method9 = newModelClass.getMethod("setRegistryNumber",
						new Class[] { String.class });

				String value9 = oldCplModel.getRegistryNumber();

				method9.invoke(newModel, value9);

				Method method10 = newModelClass.getMethod("setRegistryDate",
						new Class[] { Date.class });

				Date value10 = oldCplModel.getRegistryDate();

				method10.invoke(newModel, value10);

				Method method11 = newModelClass.getMethod("setRegistryPortId",
						new Class[] { Integer.TYPE });

				Integer value11 = new Integer(oldCplModel.getRegistryPortId());

				method11.invoke(newModel, value11);

				Method method12 = newModelClass.getMethod("setRegistryPortCode",
						new Class[] { String.class });

				String value12 = oldCplModel.getRegistryPortCode();

				method12.invoke(newModel, value12);

				Method method13 = newModelClass.getMethod("setGt",
						new Class[] { Double.TYPE });

				Double value13 = new Double(oldCplModel.getGt());

				method13.invoke(newModel, value13);

				Method method14 = newModelClass.getMethod("setNrt",
						new Class[] { Double.TYPE });

				Double value14 = new Double(oldCplModel.getNrt());

				method14.invoke(newModel, value14);

				Method method15 = newModelClass.getMethod("setDwt",
						new Class[] { Double.TYPE });

				Double value15 = new Double(oldCplModel.getDwt());

				method15.invoke(newModel, value15);

				Method method16 = newModelClass.getMethod("setLength",
						new Class[] { Double.TYPE });

				Double value16 = new Double(oldCplModel.getLength());

				method16.invoke(newModel, value16);

				Method method17 = newModelClass.getMethod("setWidth",
						new Class[] { Double.TYPE });

				Double value17 = new Double(oldCplModel.getWidth());

				method17.invoke(newModel, value17);

				Method method18 = newModelClass.getMethod("setHeight",
						new Class[] { Double.TYPE });

				Double value18 = new Double(oldCplModel.getHeight());

				method18.invoke(newModel, value18);

				Method method19 = newModelClass.getMethod("setSailingSpeed",
						new Class[] { Double.TYPE });

				Double value19 = new Double(oldCplModel.getSailingSpeed());

				method19.invoke(newModel, value19);

				Method method20 = newModelClass.getMethod("setColor",
						new Class[] { String.class });

				String value20 = oldCplModel.getColor();

				method20.invoke(newModel, value20);

				Method method21 = newModelClass.getMethod("setBoneCode",
						new Class[] { String.class });

				String value21 = oldCplModel.getBoneCode();

				method21.invoke(newModel, value21);

				Method method22 = newModelClass.getMethod("setMachineCode",
						new Class[] { String.class });

				String value22 = oldCplModel.getMachineCode();

				method22.invoke(newModel, value22);

				Method method23 = newModelClass.getMethod("setShipAgencyId",
						new Class[] { Integer.TYPE });

				Integer value23 = new Integer(oldCplModel.getShipAgencyId());

				method23.invoke(newModel, value23);

				Method method24 = newModelClass.getMethod("setShipAgencyCode",
						new Class[] { String.class });

				String value24 = oldCplModel.getShipAgencyCode();

				method24.invoke(newModel, value24);

				Method method25 = newModelClass.getMethod("setFishingBoatRegistration",
						new Class[] { String.class });

				String value25 = oldCplModel.getFishingBoatRegistration();

				method25.invoke(newModel, value25);

				Method method26 = newModelClass.getMethod("setRoleShip",
						new Class[] { Integer.TYPE });

				Integer value26 = new Integer(oldCplModel.getRoleShip());

				method26.invoke(newModel, value26);

				Method method27 = newModelClass.getMethod("setIsDelete",
						new Class[] { Integer.TYPE });

				Integer value27 = new Integer(oldCplModel.getIsDelete());

				method27.invoke(newModel, value27);

				Method method28 = newModelClass.getMethod("setMarkedAsDelete",
						new Class[] { Integer.TYPE });

				Integer value28 = new Integer(oldCplModel.getMarkedAsDelete());

				method28.invoke(newModel, value28);

				Method method29 = newModelClass.getMethod("setModifiedDate",
						new Class[] { Date.class });

				Date value29 = oldCplModel.getModifiedDate();

				method29.invoke(newModel, value29);

				Method method30 = newModelClass.getMethod("setRequestedDate",
						new Class[] { Date.class });

				Date value30 = oldCplModel.getRequestedDate();

				method30.invoke(newModel, value30);

				Method method31 = newModelClass.getMethod("setSyncVersion",
						new Class[] { String.class });

				String value31 = oldCplModel.getSyncVersion();

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

	public static Object translateInputThamSoHeThong(BaseModel<?> oldModel) {
		ThamSoHeThongClp oldCplModel = (ThamSoHeThongClp)oldModel;

		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				Class<?> newModelClass = Class.forName("vn.gt.dao.danhmuc.model.impl.ThamSoHeThongImpl",
						true, _classLoader);

				Object newModel = newModelClass.newInstance();

				Method method0 = newModelClass.getMethod("setId",
						new Class[] { Long.TYPE });

				Long value0 = new Long(oldCplModel.getId());

				method0.invoke(newModel, value0);

				Method method1 = newModelClass.getMethod("setValueData",
						new Class[] { String.class });

				String value1 = oldCplModel.getValueData();

				method1.invoke(newModel, value1);

				Method method2 = newModelClass.getMethod("setKeyData",
						new Class[] { String.class });

				String value2 = oldCplModel.getKeyData();

				method2.invoke(newModel, value2);

				Method method3 = newModelClass.getMethod("setDescription",
						new Class[] { String.class });

				String value3 = oldCplModel.getDescription();

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
					"vn.gt.dao.danhmuc.model.impl.DmArrivalPurposeImpl")) {
			return translateOutputDmArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmDataItemImpl")) {
			return translateOutputDmDataItem(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmDocTypeImpl")) {
			return translateOutputDmDocType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmEnterriseImpl")) {
			return translateOutputDmEnterrise(oldModel);
		}

		if (oldModelClassName.equals("vn.gt.dao.danhmuc.model.impl.DmGoodsImpl")) {
			return translateOutputDmGoods(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmGoodsTypeImpl")) {
			return translateOutputDmGoodsType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryArrivalPurposeImpl")) {
			return translateOutputDmHistoryArrivalPurpose(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryDocTypeImpl")) {
			return translateOutputDmHistoryDocType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryEnterriseImpl")) {
			return translateOutputDmHistoryEnterrise(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryGoodsImpl")) {
			return translateOutputDmHistoryGoods(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryGoodsTypeImpl")) {
			return translateOutputDmHistoryGoodsType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryMaritimeImpl")) {
			return translateOutputDmHistoryMaritime(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryPackageImpl")) {
			return translateOutputDmHistoryPackage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryPassportTypeImpl")) {
			return translateOutputDmHistoryPassportType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryPortImpl")) {
			return translateOutputDmHistoryPort(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryPortHarbourImpl")) {
			return translateOutputDmHistoryPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryPortRegionImpl")) {
			return translateOutputDmHistoryPortRegion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryPortWharfImpl")) {
			return translateOutputDmHistoryPortWharf(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryRankRatingImpl")) {
			return translateOutputDmHistoryRankRating(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryRepresentativeImpl")) {
			return translateOutputDmHistoryRepresentative(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistorySecurityLevelImpl")) {
			return translateOutputDmHistorySecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryShipAgencyImpl")) {
			return translateOutputDmHistoryShipAgency(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryShipTypeImpl")) {
			return translateOutputDmHistoryShipType(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryStateImpl")) {
			return translateOutputDmHistoryState(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmHistoryUnitGeneralImpl")) {
			return translateOutputDmHistoryUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl")) {
			return translateOutputDmMaritime(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmPackageImpl")) {
			return translateOutputDmPackage(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmPassportTypeImpl")) {
			return translateOutputDmPassportType(oldModel);
		}

		if (oldModelClassName.equals("vn.gt.dao.danhmuc.model.impl.DmPortImpl")) {
			return translateOutputDmPort(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmPortHarbourImpl")) {
			return translateOutputDmPortHarbour(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl")) {
			return translateOutputDmPortRegion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmPortWharfImpl")) {
			return translateOutputDmPortWharf(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmRankRatingImpl")) {
			return translateOutputDmRankRating(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmRepresentativeImpl")) {
			return translateOutputDmRepresentative(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmSecurityLevelImpl")) {
			return translateOutputDmSecurityLevel(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmShipAgencyImpl")) {
			return translateOutputDmShipAgency(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmShipTypeImpl")) {
			return translateOutputDmShipType(oldModel);
		}

		if (oldModelClassName.equals("vn.gt.dao.danhmuc.model.impl.DmStateImpl")) {
			return translateOutputDmState(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmSyncCategoryImpl")) {
			return translateOutputDmSyncCategory(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmTestN01RequestImpl")) {
			return translateOutputDmTestN01Request(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.DmUnitGeneralImpl")) {
			return translateOutputDmUnitGeneral(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.HistoryRmdcShipImpl")) {
			return translateOutputHistoryRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.HistorySyncVersionImpl")) {
			return translateOutputHistorySyncVersion(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.RmdcShipImpl")) {
			return translateOutputRmdcShip(oldModel);
		}

		if (oldModelClassName.equals(
					"vn.gt.dao.danhmuc.model.impl.ThamSoHeThongImpl")) {
			return translateOutputThamSoHeThong(oldModel);
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

	public static Object translateOutputDmArrivalPurpose(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmArrivalPurposeClp newModel = new DmArrivalPurposeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPurposeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPurposeCode(value1);

				Method method2 = oldModelClass.getMethod("getPurposeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPurposeName(value2);

				Method method3 = oldModelClass.getMethod("getPurposeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPurposeNameVN(value3);

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

	public static Object translateOutputDmDataItem(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmDataItemClp newModel = new DmDataItemClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getDataGroupId");

				Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

				newModel.setDataGroupId(value1);

				Method method2 = oldModelClass.getMethod("getCode0");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCode0(value2);

				Method method3 = oldModelClass.getMethod("getNode1");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setNode1(value3);

				Method method4 = oldModelClass.getMethod("getNode2");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setNode2(value4);

				Method method5 = oldModelClass.getMethod("getNode3");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setNode3(value5);

				Method method6 = oldModelClass.getMethod("getNode4");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setNode4(value6);

				Method method7 = oldModelClass.getMethod("getLevel");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setLevel(value7);

				Method method8 = oldModelClass.getMethod("getName");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setName(value8);

				Method method9 = oldModelClass.getMethod("getShortName");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setShortName(value9);

				Method method10 = oldModelClass.getMethod("getDescription");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setDescription(value10);

				Method method11 = oldModelClass.getMethod("getValidatedFrom");

				Date value11 = (Date)method11.invoke(oldModel, (Object[])null);

				newModel.setValidatedFrom(value11);

				Method method12 = oldModelClass.getMethod("getValidatedTo");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setValidatedTo(value12);

				Method method13 = oldModelClass.getMethod("getOrder");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setOrder(value13);

				Method method14 = oldModelClass.getMethod("getStatus");

				Integer value14 = (Integer)method14.invoke(oldModel,
						(Object[])null);

				newModel.setStatus(value14);

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

	public static Object translateOutputDmDocType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmDocTypeClp newModel = new DmDocTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getDocumentTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setDocumentTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentType");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value2);

				Method method3 = oldModelClass.getMethod("getDocumentTypeName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentTypeName(value3);

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

	public static Object translateOutputDmEnterrise(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmEnterriseClp newModel = new DmEnterriseClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getEnterpriseCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseCode(value1);

				Method method2 = oldModelClass.getMethod("getEnterpriseTaxCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseTaxCode(value2);

				Method method3 = oldModelClass.getMethod("getEnterpriseName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseName(value3);

				Method method4 = oldModelClass.getMethod(
						"getEnterpriseShortName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseShortName(value4);

				Method method5 = oldModelClass.getMethod(
						"getEnterpriseForeignName");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseForeignName(value5);

				Method method6 = oldModelClass.getMethod("getEnterprisePerson");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setEnterprisePerson(value6);

				Method method7 = oldModelClass.getMethod(
						"getEnterpriseHOAddress");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseHOAddress(value7);

				Method method8 = oldModelClass.getMethod("getStateCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value8);

				Method method9 = oldModelClass.getMethod("getCityCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCityCode(value9);

				Method method10 = oldModelClass.getMethod("getDistrictCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setDistrictCode(value10);

				Method method11 = oldModelClass.getMethod("getWardCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setWardCode(value11);

				Method method12 = oldModelClass.getMethod("getTelephoneNo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setTelephoneNo(value12);

				Method method13 = oldModelClass.getMethod("getRegistrationCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setRegistrationCode(value13);

				Method method14 = oldModelClass.getMethod(
						"getRegistrationAddress");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setRegistrationAddress(value14);

				Method method15 = oldModelClass.getMethod("getRegistrationDate");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setRegistrationDate(value15);

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

				Method method21 = oldModelClass.getMethod("getModifiedUser");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setModifiedUser(value21);

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

	public static Object translateOutputDmGoods(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGoodsClp newModel = new DmGoodsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getGoodsItemCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setGoodsItemCode(value1);

				Method method2 = oldModelClass.getMethod("getGoodsItemName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setGoodsItemName(value2);

				Method method3 = oldModelClass.getMethod("getGoodsItemNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setGoodsItemNameVN(value3);

				Method method4 = oldModelClass.getMethod("getGoodsItemOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setGoodsItemOrder(value4);

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

	public static Object translateOutputDmGoodsType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmGoodsTypeClp newModel = new DmGoodsTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getGoodsTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setGoodsTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getGoodsTypeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setGoodsTypeName(value2);

				Method method3 = oldModelClass.getMethod("getGoodsTypeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setGoodsTypeNameVN(value3);

				Method method4 = oldModelClass.getMethod("getGoodsTypeOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setGoodsTypeOrder(value4);

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

	public static Object translateOutputDmHistoryArrivalPurpose(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryArrivalPurposeClp newModel = new DmHistoryArrivalPurposeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPurposeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPurposeCode(value1);

				Method method2 = oldModelClass.getMethod("getPurposeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPurposeName(value2);

				Method method3 = oldModelClass.getMethod("getPurposeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPurposeNameVN(value3);

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

	public static Object translateOutputDmHistoryDocType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryDocTypeClp newModel = new DmHistoryDocTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getDocumentTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setDocumentTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getDocumentType");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setDocumentType(value2);

				Method method3 = oldModelClass.getMethod("getDocumentTypeName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDocumentTypeName(value3);

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

	public static Object translateOutputDmHistoryEnterrise(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryEnterriseClp newModel = new DmHistoryEnterriseClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getEnterpriseCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseCode(value1);

				Method method2 = oldModelClass.getMethod("getEnterpriseTaxCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseTaxCode(value2);

				Method method3 = oldModelClass.getMethod("getEnterpriseName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseName(value3);

				Method method4 = oldModelClass.getMethod(
						"getEnterpriseShortName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseShortName(value4);

				Method method5 = oldModelClass.getMethod(
						"getEnterpriseForeignName");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseForeignName(value5);

				Method method6 = oldModelClass.getMethod("getEnterprisePerson");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setEnterprisePerson(value6);

				Method method7 = oldModelClass.getMethod(
						"getEnterpriseHOAddress");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseHOAddress(value7);

				Method method8 = oldModelClass.getMethod("getStateCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value8);

				Method method9 = oldModelClass.getMethod("getCityCode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCityCode(value9);

				Method method10 = oldModelClass.getMethod("getDistrictCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setDistrictCode(value10);

				Method method11 = oldModelClass.getMethod("getWardCode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setWardCode(value11);

				Method method12 = oldModelClass.getMethod("getTelephoneNo");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setTelephoneNo(value12);

				Method method13 = oldModelClass.getMethod("getRegistrationCode");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setRegistrationCode(value13);

				Method method14 = oldModelClass.getMethod(
						"getRegistrationAddress");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setRegistrationAddress(value14);

				Method method15 = oldModelClass.getMethod("getRegistrationDate");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setRegistrationDate(value15);

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

				Method method21 = oldModelClass.getMethod("getModifiedUser");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setModifiedUser(value21);

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

	public static Object translateOutputDmHistoryGoods(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryGoodsClp newModel = new DmHistoryGoodsClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getGoodsItemCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setGoodsItemCode(value1);

				Method method2 = oldModelClass.getMethod("getGoodsItemName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setGoodsItemName(value2);

				Method method3 = oldModelClass.getMethod("getGoodsItemNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setGoodsItemNameVN(value3);

				Method method4 = oldModelClass.getMethod("getGoodsItemOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setGoodsItemOrder(value4);

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

	public static Object translateOutputDmHistoryGoodsType(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryGoodsTypeClp newModel = new DmHistoryGoodsTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getGoodsTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setGoodsTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getGoodsTypeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setGoodsTypeName(value2);

				Method method3 = oldModelClass.getMethod("getGoodsTypeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setGoodsTypeNameVN(value3);

				Method method4 = oldModelClass.getMethod("getGoodsTypeOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setGoodsTypeOrder(value4);

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

	public static Object translateOutputDmHistoryMaritime(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryMaritimeClp newModel = new DmHistoryMaritimeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getMaritimeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value1);

				Method method2 = oldModelClass.getMethod("getMaritimeReference");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMaritimeReference(value2);

				Method method3 = oldModelClass.getMethod("getMaritimeOrder");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimeOrder(value3);

				Method method4 = oldModelClass.getMethod("getMaritimeName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setMaritimeName(value4);

				Method method5 = oldModelClass.getMethod("getMaritimeNameVN");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setMaritimeNameVN(value5);

				Method method6 = oldModelClass.getMethod("getAddress");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setAddress(value6);

				Method method7 = oldModelClass.getMethod("getAddressVN");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setAddressVN(value7);

				Method method8 = oldModelClass.getMethod("getStateCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value8);

				Method method9 = oldModelClass.getMethod("getCitycode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCitycode(value9);

				Method method10 = oldModelClass.getMethod("getIsDelete");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value10);

				Method method11 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value11);

				Method method12 = oldModelClass.getMethod("getModifiedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value12);

				Method method13 = oldModelClass.getMethod("getRequestedDate");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value13);

				Method method14 = oldModelClass.getMethod("getSyncVersion");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value14);

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

	public static Object translateOutputDmHistoryPackage(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryPackageClp newModel = new DmHistoryPackageClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPackageCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPackageCode(value1);

				Method method2 = oldModelClass.getMethod("getPackageName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPackageName(value2);

				Method method3 = oldModelClass.getMethod("getPackageNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPackageNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPackageOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPackageOrder(value4);

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

	public static Object translateOutputDmHistoryPassportType(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryPassportTypeClp newModel = new DmHistoryPassportTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPassportTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getPassportType");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPassportType(value2);

				Method method3 = oldModelClass.getMethod("getPassportTypeName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeName(value3);

				Method method4 = oldModelClass.getMethod(
						"getPassportTypeNameVN");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeNameVN(value4);

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

	public static Object translateOutputDmHistoryPort(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryPortClp newModel = new DmHistoryPortClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value1);

				Method method2 = oldModelClass.getMethod("getLoCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setLoCode(value2);

				Method method3 = oldModelClass.getMethod("getPortName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortName(value3);

				Method method4 = oldModelClass.getMethod("getFullName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setFullName(value4);

				Method method5 = oldModelClass.getMethod("getFullNameVN");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setFullNameVN(value5);

				Method method6 = oldModelClass.getMethod("getPortType");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortType(value6);

				Method method7 = oldModelClass.getMethod("getPortOrder");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setPortOrder(value7);

				Method method8 = oldModelClass.getMethod("getAddress");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setAddress(value8);

				Method method9 = oldModelClass.getMethod("getAddressVN");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setAddressVN(value9);

				Method method10 = oldModelClass.getMethod("getStateCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setStateCode(value10);

				Method method11 = oldModelClass.getMethod("getCitycode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setCitycode(value11);

				Method method12 = oldModelClass.getMethod("getIsDelete");

				Integer value12 = (Integer)method12.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value12);

				Method method13 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value13);

				Method method14 = oldModelClass.getMethod("getModifiedDate");

				Date value14 = (Date)method14.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value14);

				Method method15 = oldModelClass.getMethod("getRequestedDate");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value15);

				Method method16 = oldModelClass.getMethod("getSyncVersion");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value16);

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

	public static Object translateOutputDmHistoryPortHarbour(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryPortHarbourClp newModel = new DmHistoryPortHarbourClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortHarbourCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourCode(value1);

				Method method2 = oldModelClass.getMethod("getPortHarbourName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourName(value2);

				Method method3 = oldModelClass.getMethod("getPortHarbourNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPortHarbourType");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourType(value4);

				Method method5 = oldModelClass.getMethod("getPortRegion");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortRegion(value5);

				Method method6 = oldModelClass.getMethod("getPortCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value6);

				Method method7 = oldModelClass.getMethod("getPortRegionCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPortRegionCode(value7);

				Method method8 = oldModelClass.getMethod("getNote");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNote(value8);

				Method method9 = oldModelClass.getMethod("getIsDelete");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value9);

				Method method10 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value10);

				Method method11 = oldModelClass.getMethod("getModifiedDate");

				Date value11 = (Date)method11.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value11);

				Method method12 = oldModelClass.getMethod("getRequestedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value12);

				Method method13 = oldModelClass.getMethod("getSyncVersion");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value13);

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

	public static Object translateOutputDmHistoryPortRegion(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryPortRegionClp newModel = new DmHistoryPortRegionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortRegionCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortRegionCode(value1);

				Method method2 = oldModelClass.getMethod("getPortRegionName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortRegionName(value2);

				Method method3 = oldModelClass.getMethod("getPortRegionNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortRegionNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPortRegionRef");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setPortRegionRef(value4);

				Method method5 = oldModelClass.getMethod("getPortCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value5);

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

	public static Object translateOutputDmHistoryPortWharf(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryPortWharfClp newModel = new DmHistoryPortWharfClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortWharfCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortWharfCode(value1);

				Method method2 = oldModelClass.getMethod("getPortWharfName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortWharfName(value2);

				Method method3 = oldModelClass.getMethod("getPortWharfNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortWharfNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPortWharfType");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPortWharfType(value4);

				Method method5 = oldModelClass.getMethod("getPortHarbourCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourCode(value5);

				Method method6 = oldModelClass.getMethod("getPortCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value6);

				Method method7 = oldModelClass.getMethod("getPortRegionCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPortRegionCode(value7);

				Method method8 = oldModelClass.getMethod("getNote");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNote(value8);

				Method method9 = oldModelClass.getMethod("getIsDelete");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value9);

				Method method10 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value10);

				Method method11 = oldModelClass.getMethod("getModifiedDate");

				Date value11 = (Date)method11.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value11);

				Method method12 = oldModelClass.getMethod("getRequestedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value12);

				Method method13 = oldModelClass.getMethod("getSyncVersion");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value13);

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

	public static Object translateOutputDmHistoryRankRating(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryRankRatingClp newModel = new DmHistoryRankRatingClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRankCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRankCode(value1);

				Method method2 = oldModelClass.getMethod("getRankName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setRankName(value2);

				Method method3 = oldModelClass.getMethod("getRankNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setRankNameVN(value3);

				Method method4 = oldModelClass.getMethod("getRankOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setRankOrder(value4);

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

	public static Object translateOutputDmHistoryRepresentative(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryRepresentativeClp newModel = new DmHistoryRepresentativeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRepCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRepCode(value1);

				Method method2 = oldModelClass.getMethod("getRepName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setRepName(value2);

				Method method3 = oldModelClass.getMethod("getRepNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setRepNameVN(value3);

				Method method4 = oldModelClass.getMethod("getRepLevel");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setRepLevel(value4);

				Method method5 = oldModelClass.getMethod("getRepOrder");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setRepOrder(value5);

				Method method6 = oldModelClass.getMethod("getMaritimeCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value6);

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

	public static Object translateOutputDmHistorySecurityLevel(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistorySecurityLevelClp newModel = new DmHistorySecurityLevelClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getSecurityLevelCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevelCode(value1);

				Method method2 = oldModelClass.getMethod("getSecurityLevel");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevel(value2);

				Method method3 = oldModelClass.getMethod("getSecurityLevelName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevelName(value3);

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

	public static Object translateOutputDmHistoryShipAgency(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryShipAgencyClp newModel = new DmHistoryShipAgencyClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getShipAgencyCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyCode(value1);

				Method method2 = oldModelClass.getMethod("getShipAgencyName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyName(value2);

				Method method3 = oldModelClass.getMethod("getShipAgencyNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyNameVN(value3);

				Method method4 = oldModelClass.getMethod("getTaxCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setTaxCode(value4);

				Method method5 = oldModelClass.getMethod("getStateCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value5);

				Method method6 = oldModelClass.getMethod("getCitycode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setCitycode(value6);

				Method method7 = oldModelClass.getMethod("getAddress");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setAddress(value7);

				Method method8 = oldModelClass.getMethod("getAddressVN");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setAddressVN(value8);

				Method method9 = oldModelClass.getMethod("getPhone");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setPhone(value9);

				Method method10 = oldModelClass.getMethod("getFax");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setFax(value10);

				Method method11 = oldModelClass.getMethod("getEmail");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setEmail(value11);

				Method method12 = oldModelClass.getMethod("getDescription");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setDescription(value12);

				Method method13 = oldModelClass.getMethod("getContacter");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setContacter(value13);

				Method method14 = oldModelClass.getMethod("getPosition");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setPosition(value14);

				Method method15 = oldModelClass.getMethod("getContactTell");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setContactTell(value15);

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

	public static Object translateOutputDmHistoryShipType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryShipTypeClp newModel = new DmHistoryShipTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getShipTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getShipTypeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipTypeName(value2);

				Method method3 = oldModelClass.getMethod("getShipTypeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setShipTypeNameVN(value3);

				Method method4 = oldModelClass.getMethod("getShipTypeOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setShipTypeOrder(value4);

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

	public static Object translateOutputDmHistoryState(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryStateClp newModel = new DmHistoryStateClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getStateCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value1);

				Method method2 = oldModelClass.getMethod("getStateName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setStateName(value2);

				Method method3 = oldModelClass.getMethod("getDescription");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDescription(value3);

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

	public static Object translateOutputDmHistoryUnitGeneral(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmHistoryUnitGeneralClp newModel = new DmHistoryUnitGeneralClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getUnitCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setUnitCode(value1);

				Method method2 = oldModelClass.getMethod("getUnitName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setUnitName(value2);

				Method method3 = oldModelClass.getMethod("getIsDelete");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value3);

				Method method4 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value4);

				Method method5 = oldModelClass.getMethod("getModifiedDate");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value5);

				Method method6 = oldModelClass.getMethod("getRequestedDate");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value6);

				Method method7 = oldModelClass.getMethod("getSyncVersion");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value7);

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

	public static Object translateOutputDmMaritime(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmMaritimeClp newModel = new DmMaritimeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getMaritimeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value1);

				Method method2 = oldModelClass.getMethod("getMaritimeReference");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setMaritimeReference(value2);

				Method method3 = oldModelClass.getMethod("getMaritimeOrder");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setMaritimeOrder(value3);

				Method method4 = oldModelClass.getMethod("getMaritimeName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setMaritimeName(value4);

				Method method5 = oldModelClass.getMethod("getMaritimeNameVN");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setMaritimeNameVN(value5);

				Method method6 = oldModelClass.getMethod("getAddress");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setAddress(value6);

				Method method7 = oldModelClass.getMethod("getAddressVN");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setAddressVN(value7);

				Method method8 = oldModelClass.getMethod("getStateCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value8);

				Method method9 = oldModelClass.getMethod("getCitycode");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setCitycode(value9);

				Method method10 = oldModelClass.getMethod("getIsDelete");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value10);

				Method method11 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value11);

				Method method12 = oldModelClass.getMethod("getModifiedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value12);

				Method method13 = oldModelClass.getMethod("getRequestedDate");

				Date value13 = (Date)method13.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value13);

				Method method14 = oldModelClass.getMethod("getSyncVersion");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value14);

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

	public static Object translateOutputDmPackage(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmPackageClp newModel = new DmPackageClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPackageCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPackageCode(value1);

				Method method2 = oldModelClass.getMethod("getPackageName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPackageName(value2);

				Method method3 = oldModelClass.getMethod("getPackageNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPackageNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPackageOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPackageOrder(value4);

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

	public static Object translateOutputDmPassportType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmPassportTypeClp newModel = new DmPassportTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPassportTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getPassportType");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPassportType(value2);

				Method method3 = oldModelClass.getMethod("getPassportTypeName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeName(value3);

				Method method4 = oldModelClass.getMethod(
						"getPassportTypeNameVN");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setPassportTypeNameVN(value4);

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

	public static Object translateOutputDmPort(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmPortClp newModel = new DmPortClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value1);

				Method method2 = oldModelClass.getMethod("getLoCode");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setLoCode(value2);

				Method method3 = oldModelClass.getMethod("getPortName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortName(value3);

				Method method4 = oldModelClass.getMethod("getFullName");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setFullName(value4);

				Method method5 = oldModelClass.getMethod("getFullNameVN");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setFullNameVN(value5);

				Method method6 = oldModelClass.getMethod("getPortType");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortType(value6);

				Method method7 = oldModelClass.getMethod("getPortOrder");

				Integer value7 = (Integer)method7.invoke(oldModel,
						(Object[])null);

				newModel.setPortOrder(value7);

				Method method8 = oldModelClass.getMethod("getAddress");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setAddress(value8);

				Method method9 = oldModelClass.getMethod("getAddressVN");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setAddressVN(value9);

				Method method10 = oldModelClass.getMethod("getStateCode");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setStateCode(value10);

				Method method11 = oldModelClass.getMethod("getCitycode");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setCitycode(value11);

				Method method12 = oldModelClass.getMethod("getIsDelete");

				Integer value12 = (Integer)method12.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value12);

				Method method13 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value13 = (Integer)method13.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value13);

				Method method14 = oldModelClass.getMethod("getModifiedDate");

				Date value14 = (Date)method14.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value14);

				Method method15 = oldModelClass.getMethod("getRequestedDate");

				Date value15 = (Date)method15.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value15);

				Method method16 = oldModelClass.getMethod("getSyncVersion");

				String value16 = (String)method16.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value16);

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

	public static Object translateOutputDmPortHarbour(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmPortHarbourClp newModel = new DmPortHarbourClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortHarbourCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourCode(value1);

				Method method2 = oldModelClass.getMethod("getPortHarbourName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourName(value2);

				Method method3 = oldModelClass.getMethod("getPortHarbourNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPortHarbourType");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPortHarbourType(value4);

				Method method5 = oldModelClass.getMethod("getPortRegion");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortRegion(value5);

				Method method6 = oldModelClass.getMethod("getPortCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value6);

				Method method7 = oldModelClass.getMethod("getPortRegionCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPortRegionCode(value7);

				Method method8 = oldModelClass.getMethod("getNote");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNote(value8);

				Method method9 = oldModelClass.getMethod("getIsDelete");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value9);

				Method method10 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value10);

				Method method11 = oldModelClass.getMethod("getModifiedDate");

				Date value11 = (Date)method11.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value11);

				Method method12 = oldModelClass.getMethod("getRequestedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value12);

				Method method13 = oldModelClass.getMethod("getSyncVersion");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value13);

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

	public static Object translateOutputDmPortRegion(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmPortRegionClp newModel = new DmPortRegionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortRegionCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortRegionCode(value1);

				Method method2 = oldModelClass.getMethod("getPortRegionName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortRegionName(value2);

				Method method3 = oldModelClass.getMethod("getPortRegionNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortRegionNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPortRegionRef");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setPortRegionRef(value4);

				Method method5 = oldModelClass.getMethod("getPortCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value5);

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

	public static Object translateOutputDmPortWharf(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmPortWharfClp newModel = new DmPortWharfClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getPortWharfCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setPortWharfCode(value1);

				Method method2 = oldModelClass.getMethod("getPortWharfName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setPortWharfName(value2);

				Method method3 = oldModelClass.getMethod("getPortWharfNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setPortWharfNameVN(value3);

				Method method4 = oldModelClass.getMethod("getPortWharfType");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setPortWharfType(value4);

				Method method5 = oldModelClass.getMethod("getPortCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setPortCode(value5);

				Method method6 = oldModelClass.getMethod("getPortHarbourCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setPortHarbourCode(value6);

				Method method7 = oldModelClass.getMethod("getPortRegionCode");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setPortRegionCode(value7);

				Method method8 = oldModelClass.getMethod("getNote");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setNote(value8);

				Method method9 = oldModelClass.getMethod("getIsDelete");

				Integer value9 = (Integer)method9.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value9);

				Method method10 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value10 = (Integer)method10.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value10);

				Method method11 = oldModelClass.getMethod("getModifiedDate");

				Date value11 = (Date)method11.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value11);

				Method method12 = oldModelClass.getMethod("getRequestedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value12);

				Method method13 = oldModelClass.getMethod("getSyncVersion");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value13);

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

	public static Object translateOutputDmRankRating(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmRankRatingClp newModel = new DmRankRatingClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRankCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRankCode(value1);

				Method method2 = oldModelClass.getMethod("getRankName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setRankName(value2);

				Method method3 = oldModelClass.getMethod("getRankNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setRankNameVN(value3);

				Method method4 = oldModelClass.getMethod("getRankOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setRankOrder(value4);

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

	public static Object translateOutputDmRepresentative(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmRepresentativeClp newModel = new DmRepresentativeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRepCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setRepCode(value1);

				Method method2 = oldModelClass.getMethod("getRepName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setRepName(value2);

				Method method3 = oldModelClass.getMethod("getRepNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setRepNameVN(value3);

				Method method4 = oldModelClass.getMethod("getRepLevel");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setRepLevel(value4);

				Method method5 = oldModelClass.getMethod("getRepOrder");

				Integer value5 = (Integer)method5.invoke(oldModel,
						(Object[])null);

				newModel.setRepOrder(value5);

				Method method6 = oldModelClass.getMethod("getMaritimeCode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setMaritimeCode(value6);

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

	public static Object translateOutputDmSecurityLevel(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmSecurityLevelClp newModel = new DmSecurityLevelClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getSecurityLevelCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevelCode(value1);

				Method method2 = oldModelClass.getMethod("getSecurityLevel");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevel(value2);

				Method method3 = oldModelClass.getMethod("getSecurityLevelName");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setSecurityLevelName(value3);

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

	public static Object translateOutputDmShipAgency(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmShipAgencyClp newModel = new DmShipAgencyClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getShipAgencyCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyCode(value1);

				Method method2 = oldModelClass.getMethod("getShipAgencyName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyName(value2);

				Method method3 = oldModelClass.getMethod("getShipAgencyNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setShipAgencyNameVN(value3);

				Method method4 = oldModelClass.getMethod("getTaxCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setTaxCode(value4);

				Method method5 = oldModelClass.getMethod("getStateCode");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value5);

				Method method6 = oldModelClass.getMethod("getCitycode");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setCitycode(value6);

				Method method7 = oldModelClass.getMethod("getAddress");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setAddress(value7);

				Method method8 = oldModelClass.getMethod("getAddressVN");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setAddressVN(value8);

				Method method9 = oldModelClass.getMethod("getPhone");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setPhone(value9);

				Method method10 = oldModelClass.getMethod("getFax");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setFax(value10);

				Method method11 = oldModelClass.getMethod("getEmail");

				String value11 = (String)method11.invoke(oldModel,
						(Object[])null);

				newModel.setEmail(value11);

				Method method12 = oldModelClass.getMethod("getDescription");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setDescription(value12);

				Method method13 = oldModelClass.getMethod("getContacter");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setContacter(value13);

				Method method14 = oldModelClass.getMethod("getPosition");

				String value14 = (String)method14.invoke(oldModel,
						(Object[])null);

				newModel.setPosition(value14);

				Method method15 = oldModelClass.getMethod("getContactTell");

				String value15 = (String)method15.invoke(oldModel,
						(Object[])null);

				newModel.setContactTell(value15);

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

	public static Object translateOutputDmShipType(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmShipTypeClp newModel = new DmShipTypeClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getShipTypeCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value1);

				Method method2 = oldModelClass.getMethod("getShipTypeName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipTypeName(value2);

				Method method3 = oldModelClass.getMethod("getShipTypeNameVN");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setShipTypeNameVN(value3);

				Method method4 = oldModelClass.getMethod("getShipTypeOrder");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setShipTypeOrder(value4);

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

	public static Object translateOutputDmState(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmStateClp newModel = new DmStateClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getStateCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value1);

				Method method2 = oldModelClass.getMethod("getStateName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setStateName(value2);

				Method method3 = oldModelClass.getMethod("getDescription");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDescription(value3);

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

	public static Object translateOutputDmSyncCategory(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmSyncCategoryClp newModel = new DmSyncCategoryClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getCategoryId");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setCategoryId(value1);

				Method method2 = oldModelClass.getMethod(
						"getCategoryDescription");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setCategoryDescription(value2);

				Method method3 = oldModelClass.getMethod("getModifiedUser");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setModifiedUser(value3);

				Method method4 = oldModelClass.getMethod("getModifiedDate");

				Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value4);

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

	public static Object translateOutputDmTestN01Request(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmTestN01RequestClp newModel = new DmTestN01RequestClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getRequestID");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setRequestID(value0);

				Method method1 = oldModelClass.getMethod("getEnterpriseCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setEnterpriseCode(value1);

				Method method2 = oldModelClass.getMethod("getTenDuAn");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setTenDuAn(value2);

				Method method3 = oldModelClass.getMethod("getSuCanThietDauTu");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setSuCanThietDauTu(value3);

				Method method4 = oldModelClass.getMethod("getViTri");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setViTri(value4);

				Method method5 = oldModelClass.getMethod(
						"getLoaiTauBienGioiHanVaoCang");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setLoaiTauBienGioiHanVaoCang(value5);

				Method method6 = oldModelClass.getMethod("getSoLuongCauCang");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setSoLuongCauCang(value6);

				Method method7 = oldModelClass.getMethod(
						"getTongDienTichXayDungDuKien");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setTongDienTichXayDungDuKien(value7);

				Method method8 = oldModelClass.getMethod("getTaiLieulienQuan");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setTaiLieulienQuan(value8);

				Method method9 = oldModelClass.getMethod("getModifiedDate");

				Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value9);

				Method method10 = oldModelClass.getMethod("getModifiedUser");

				String value10 = (String)method10.invoke(oldModel,
						(Object[])null);

				newModel.setModifiedUser(value10);

				Method method11 = oldModelClass.getMethod("getIsAuthorized");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setIsAuthorized(value11);

				Method method12 = oldModelClass.getMethod("getAuthorizedDate");

				Date value12 = (Date)method12.invoke(oldModel, (Object[])null);

				newModel.setAuthorizedDate(value12);

				Method method13 = oldModelClass.getMethod("getAuthorizedUser");

				String value13 = (String)method13.invoke(oldModel,
						(Object[])null);

				newModel.setAuthorizedUser(value13);

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

	public static Object translateOutputDmUnitGeneral(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				DmUnitGeneralClp newModel = new DmUnitGeneralClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Integer value0 = (Integer)method0.invoke(oldModel,
						(Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getUnitCode");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setUnitCode(value1);

				Method method2 = oldModelClass.getMethod("getUnitName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setUnitName(value2);

				Method method3 = oldModelClass.getMethod("getIsDelete");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value3);

				Method method4 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value4 = (Integer)method4.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value4);

				Method method5 = oldModelClass.getMethod("getModifiedDate");

				Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value5);

				Method method6 = oldModelClass.getMethod("getRequestedDate");

				Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value6);

				Method method7 = oldModelClass.getMethod("getSyncVersion");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value7);

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

	public static Object translateOutputHistoryRmdcShip(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				HistoryRmdcShipClp newModel = new HistoryRmdcShipClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getShipId");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setShipId(value1);

				Method method2 = oldModelClass.getMethod("getShipName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipName(value2);

				Method method3 = oldModelClass.getMethod("getShipTypeId");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setShipTypeId(value3);

				Method method4 = oldModelClass.getMethod("getShipTypeCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value4);

				Method method5 = oldModelClass.getMethod("getImo");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setImo(value5);

				Method method6 = oldModelClass.getMethod("getCallSign");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value6);

				Method method7 = oldModelClass.getMethod("getStateId");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setStateId(value7);

				Method method8 = oldModelClass.getMethod("getStateCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value8);

				Method method9 = oldModelClass.getMethod("getRegistryNumber");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setRegistryNumber(value9);

				Method method10 = oldModelClass.getMethod("getRegistryDate");

				Date value10 = (Date)method10.invoke(oldModel, (Object[])null);

				newModel.setRegistryDate(value10);

				Method method11 = oldModelClass.getMethod("getRegistryPortId");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setRegistryPortId(value11);

				Method method12 = oldModelClass.getMethod("getRegistryPortCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setRegistryPortCode(value12);

				Method method13 = oldModelClass.getMethod("getGt");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setGt(value13);

				Method method14 = oldModelClass.getMethod("getNrt");

				Double value14 = (Double)method14.invoke(oldModel,
						(Object[])null);

				newModel.setNrt(value14);

				Method method15 = oldModelClass.getMethod("getDwt");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value15);

				Method method16 = oldModelClass.getMethod("getLength");

				Double value16 = (Double)method16.invoke(oldModel,
						(Object[])null);

				newModel.setLength(value16);

				Method method17 = oldModelClass.getMethod("getWidth");

				Double value17 = (Double)method17.invoke(oldModel,
						(Object[])null);

				newModel.setWidth(value17);

				Method method18 = oldModelClass.getMethod("getHeight");

				Double value18 = (Double)method18.invoke(oldModel,
						(Object[])null);

				newModel.setHeight(value18);

				Method method19 = oldModelClass.getMethod("getSailingSpeed");

				Double value19 = (Double)method19.invoke(oldModel,
						(Object[])null);

				newModel.setSailingSpeed(value19);

				Method method20 = oldModelClass.getMethod("getColor");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setColor(value20);

				Method method21 = oldModelClass.getMethod("getBoneCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setBoneCode(value21);

				Method method22 = oldModelClass.getMethod("getMachineCode");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setMachineCode(value22);

				Method method23 = oldModelClass.getMethod("getShipAgencyId");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyId(value23);

				Method method24 = oldModelClass.getMethod("getShipAgencyCode");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyCode(value24);

				Method method25 = oldModelClass.getMethod(
						"getFishingBoatRegistration");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setFishingBoatRegistration(value25);

				Method method26 = oldModelClass.getMethod("getRoleShip");

				Integer value26 = (Integer)method26.invoke(oldModel,
						(Object[])null);

				newModel.setRoleShip(value26);

				Method method27 = oldModelClass.getMethod("getIsDelete");

				Integer value27 = (Integer)method27.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value27);

				Method method28 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value28);

				Method method29 = oldModelClass.getMethod("getModifiedDate");

				Date value29 = (Date)method29.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value29);

				Method method30 = oldModelClass.getMethod("getRequestedDate");

				Date value30 = (Date)method30.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value30);

				Method method31 = oldModelClass.getMethod("getSyncVersion");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value31);

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

	public static Object translateOutputHistorySyncVersion(
		BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				HistorySyncVersionClp newModel = new HistorySyncVersionClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getRequestedDate");

				Date value1 = (Date)method1.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value1);

				Method method2 = oldModelClass.getMethod("getTimeofPublish");

				Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

				newModel.setTimeofPublish(value2);

				Method method3 = oldModelClass.getMethod("getCategoryID");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setCategoryID(value3);

				Method method4 = oldModelClass.getMethod("getSyncUnit");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setSyncUnit(value4);

				Method method5 = oldModelClass.getMethod("getSyncUser");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setSyncUser(value5);

				Method method6 = oldModelClass.getMethod("getSyncVersion");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setSyncVersion(value6);

				Method method7 = oldModelClass.getMethod("getLatestValueDate");

				Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

				newModel.setLatestValueDate(value7);

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

	public static Object translateOutputRmdcShip(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				RmdcShipClp newModel = new RmdcShipClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getShipId");

				Integer value1 = (Integer)method1.invoke(oldModel,
						(Object[])null);

				newModel.setShipId(value1);

				Method method2 = oldModelClass.getMethod("getShipName");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setShipName(value2);

				Method method3 = oldModelClass.getMethod("getShipTypeId");

				Integer value3 = (Integer)method3.invoke(oldModel,
						(Object[])null);

				newModel.setShipTypeId(value3);

				Method method4 = oldModelClass.getMethod("getShipTypeCode");

				String value4 = (String)method4.invoke(oldModel, (Object[])null);

				newModel.setShipTypeCode(value4);

				Method method5 = oldModelClass.getMethod("getImo");

				String value5 = (String)method5.invoke(oldModel, (Object[])null);

				newModel.setImo(value5);

				Method method6 = oldModelClass.getMethod("getCallSign");

				String value6 = (String)method6.invoke(oldModel, (Object[])null);

				newModel.setCallSign(value6);

				Method method7 = oldModelClass.getMethod("getStateId");

				String value7 = (String)method7.invoke(oldModel, (Object[])null);

				newModel.setStateId(value7);

				Method method8 = oldModelClass.getMethod("getStateCode");

				String value8 = (String)method8.invoke(oldModel, (Object[])null);

				newModel.setStateCode(value8);

				Method method9 = oldModelClass.getMethod("getRegistryNumber");

				String value9 = (String)method9.invoke(oldModel, (Object[])null);

				newModel.setRegistryNumber(value9);

				Method method10 = oldModelClass.getMethod("getRegistryDate");

				Date value10 = (Date)method10.invoke(oldModel, (Object[])null);

				newModel.setRegistryDate(value10);

				Method method11 = oldModelClass.getMethod("getRegistryPortId");

				Integer value11 = (Integer)method11.invoke(oldModel,
						(Object[])null);

				newModel.setRegistryPortId(value11);

				Method method12 = oldModelClass.getMethod("getRegistryPortCode");

				String value12 = (String)method12.invoke(oldModel,
						(Object[])null);

				newModel.setRegistryPortCode(value12);

				Method method13 = oldModelClass.getMethod("getGt");

				Double value13 = (Double)method13.invoke(oldModel,
						(Object[])null);

				newModel.setGt(value13);

				Method method14 = oldModelClass.getMethod("getNrt");

				Double value14 = (Double)method14.invoke(oldModel,
						(Object[])null);

				newModel.setNrt(value14);

				Method method15 = oldModelClass.getMethod("getDwt");

				Double value15 = (Double)method15.invoke(oldModel,
						(Object[])null);

				newModel.setDwt(value15);

				Method method16 = oldModelClass.getMethod("getLength");

				Double value16 = (Double)method16.invoke(oldModel,
						(Object[])null);

				newModel.setLength(value16);

				Method method17 = oldModelClass.getMethod("getWidth");

				Double value17 = (Double)method17.invoke(oldModel,
						(Object[])null);

				newModel.setWidth(value17);

				Method method18 = oldModelClass.getMethod("getHeight");

				Double value18 = (Double)method18.invoke(oldModel,
						(Object[])null);

				newModel.setHeight(value18);

				Method method19 = oldModelClass.getMethod("getSailingSpeed");

				Double value19 = (Double)method19.invoke(oldModel,
						(Object[])null);

				newModel.setSailingSpeed(value19);

				Method method20 = oldModelClass.getMethod("getColor");

				String value20 = (String)method20.invoke(oldModel,
						(Object[])null);

				newModel.setColor(value20);

				Method method21 = oldModelClass.getMethod("getBoneCode");

				String value21 = (String)method21.invoke(oldModel,
						(Object[])null);

				newModel.setBoneCode(value21);

				Method method22 = oldModelClass.getMethod("getMachineCode");

				String value22 = (String)method22.invoke(oldModel,
						(Object[])null);

				newModel.setMachineCode(value22);

				Method method23 = oldModelClass.getMethod("getShipAgencyId");

				Integer value23 = (Integer)method23.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyId(value23);

				Method method24 = oldModelClass.getMethod("getShipAgencyCode");

				String value24 = (String)method24.invoke(oldModel,
						(Object[])null);

				newModel.setShipAgencyCode(value24);

				Method method25 = oldModelClass.getMethod(
						"getFishingBoatRegistration");

				String value25 = (String)method25.invoke(oldModel,
						(Object[])null);

				newModel.setFishingBoatRegistration(value25);

				Method method26 = oldModelClass.getMethod("getRoleShip");

				Integer value26 = (Integer)method26.invoke(oldModel,
						(Object[])null);

				newModel.setRoleShip(value26);

				Method method27 = oldModelClass.getMethod("getIsDelete");

				Integer value27 = (Integer)method27.invoke(oldModel,
						(Object[])null);

				newModel.setIsDelete(value27);

				Method method28 = oldModelClass.getMethod("getMarkedAsDelete");

				Integer value28 = (Integer)method28.invoke(oldModel,
						(Object[])null);

				newModel.setMarkedAsDelete(value28);

				Method method29 = oldModelClass.getMethod("getModifiedDate");

				Date value29 = (Date)method29.invoke(oldModel, (Object[])null);

				newModel.setModifiedDate(value29);

				Method method30 = oldModelClass.getMethod("getRequestedDate");

				Date value30 = (Date)method30.invoke(oldModel, (Object[])null);

				newModel.setRequestedDate(value30);

				Method method31 = oldModelClass.getMethod("getSyncVersion");

				String value31 = (String)method31.invoke(oldModel,
						(Object[])null);

				newModel.setSyncVersion(value31);

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

	public static Object translateOutputThamSoHeThong(BaseModel<?> oldModel) {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		try {
			currentThread.setContextClassLoader(_classLoader);

			try {
				ThamSoHeThongClp newModel = new ThamSoHeThongClp();

				Class<?> oldModelClass = oldModel.getClass();

				Method method0 = oldModelClass.getMethod("getId");

				Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

				newModel.setId(value0);

				Method method1 = oldModelClass.getMethod("getValueData");

				String value1 = (String)method1.invoke(oldModel, (Object[])null);

				newModel.setValueData(value1);

				Method method2 = oldModelClass.getMethod("getKeyData");

				String value2 = (String)method2.invoke(oldModel, (Object[])null);

				newModel.setKeyData(value2);

				Method method3 = oldModelClass.getMethod("getDescription");

				String value3 = (String)method3.invoke(oldModel, (Object[])null);

				newModel.setDescription(value3);

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