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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException;
import vn.gt.dao.danhmuc.model.DmHistoryGoods;
import vn.gt.dao.danhmuc.service.base.DmHistoryGoodsLocalServiceBaseImpl;

/**
 * The implementation of the dm history goods local service.
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gt.dao.danhmuc.service.DmHistoryGoodsLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.gt.dao.danhmuc.service.base.DmHistoryGoodsLocalServiceBaseImpl
 * @see vn.gt.dao.danhmuc.service.DmHistoryGoodsLocalServiceUtil
 */
public class DmHistoryGoodsLocalServiceImpl extends DmHistoryGoodsLocalServiceBaseImpl {
	
	private Log log = LogFactoryUtil.getLog(DmHistoryGoodsLocalServiceImpl.class);
	
	/*
	 * NOTE FOR DEVELOPERS: Never reference this interface directly. Always use {@link vn.gt.dao.danhmuc.service.DmHistoryGoodsLocalServiceUtil} to
	 * access the dm history goods local service.
	 */
	public DmHistoryGoods findByGoodsItemCodeAndSyncVersion(String goodsItemCode, String syncVersion) {
		try {
			return dmHistoryGoodsPersistence.findByGoodsItemCodeAndSyncVersion(goodsItemCode, syncVersion);
		} catch (NoSuchDmHistoryGoodsException e) {
			log.info("vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException: No DmHistoryGoods exists with the key {goodsItemCode=" + goodsItemCode +", syncVersion=" + syncVersion +"}");
		} catch (SystemException e) {
			log.info("vn.gt.dao.danhmuc.NoSuchDmHistoryGoodsException: No DmHistoryGoods exists with the key {goodsItemCode=" + goodsItemCode +", syncVersion=" + syncVersion +"}");
		}
		return null;
	}
}