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

package vn.gt.dao.noticeandmessage.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.noticeandmessage.model.InterfaceRequest;
import vn.gt.dao.noticeandmessage.service.base.InterfaceRequestLocalServiceBaseImpl;

/**
 * The implementation of the interface request local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.noticeandmessage.service.base.InterfaceRequestLocalServiceBaseImpl
 * @see vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil
 */
public class InterfaceRequestLocalServiceImpl extends InterfaceRequestLocalServiceBaseImpl {
	
	public InterfaceRequest findByRequestCode(String requestCode) {
		try {
			return interfaceRequestFinder.findInterfaceRequestByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public InterfaceRequest findInterfaceRequestByRequestCode(String requestCode) {
		try {
			return interfaceRequestFinder.findInterfaceRequestByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Date getRequestedDateByRequestCode(String requestCode) {
		try {
			return interfaceRequestFinder.getRequestedDateByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getFunctionTypeByRequestCode(String requestCode) {
		try {
			return interfaceRequestFinder.getFunctionTypeByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getRemarksByRequestCode(String requestCode) {
		try {
			return interfaceRequestFinder.getRemarksByRequestCode(requestCode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int updateInterfaceRequest(String sql) {
		try {
			return interfaceRequestFinder.updateInterfaceRequest(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public InterfaceRequest fetchByF_BY_documentNameRef(String documentNameRef, String businessType) {
		try {
			return interfaceRequestPersistence.fetchByF_BY_documentNameRef(documentNameRef, businessType);
		} catch (SystemException e) {
			return null;
		}
	}
}