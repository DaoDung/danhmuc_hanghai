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

package vn.gt.dao.danhmuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import vn.gt.dao.danhmuc.model.ThamSoHeThong;
import vn.gt.dao.danhmuc.service.base.ThamSoHeThongLocalServiceBaseImpl;

/**
 * The implementation of the tham so he thong local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.danhmuc.service.ThamSoHeThongLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.ThamSoHeThongLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.ThamSoHeThongLocalServiceUtil
 */
public class ThamSoHeThongLocalServiceImpl
	extends ThamSoHeThongLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.ThamSoHeThongLocalServiceUtil} to access the tham so he thong local service.
	 */
	public ThamSoHeThong findByKeyData(String keyData) {
		try {
			return thamSoHeThongPersistence.findByKeyData(keyData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ThamSoHeThong findByKeyDataAndDescription(String keyData, String description) {
		try {
			return thamSoHeThongPersistence.findByKeyDataAndDescription(keyData, description);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}