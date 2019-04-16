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

package vn.gt.dao.danhmucgt.service.impl;

import vn.gt.dao.danhmucgt.service.base.DmGTFunctionTypeLocalServiceBaseImpl;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the dm g t function type local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmucgt.service.base.DmGTFunctionTypeLocalServiceBaseImpl
 * @see vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalServiceUtil
 */
public class DmGTFunctionTypeLocalServiceImpl extends DmGTFunctionTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link vn.gt.dao.danhmucgt.service.DmGTFunctionTypeLocalServiceUtil}
	 * to access the dm g t function type local service.
	 */
	private Log log = LogFactoryUtil.getLog(DmGTFunctionTypeLocalServiceImpl.class);
	
	public String findNameByFunctionTypeCode(String functionTypeCode) {
		try {
			return dmGTFunctionTypePersistence.findByFunctionTypeCode(functionTypeCode).getFunctionTypeName();
		} catch (Exception e) {
			log.error("No DmGTFunctionType exists with the key {functionTypeCode= " + functionTypeCode + " }");
		}
		return "";
	}
	
	public int countByFunctionTypeCode(String functionTypeCode) {
		try {
			return dmGTFunctionTypePersistence.countByFunctionTypeCode(functionTypeCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}