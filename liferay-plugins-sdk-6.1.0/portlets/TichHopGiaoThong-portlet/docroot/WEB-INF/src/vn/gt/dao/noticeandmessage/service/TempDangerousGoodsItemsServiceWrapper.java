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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempDangerousGoodsItemsService}.
 * </p>
 *
 * @author    win_64
 * @see       TempDangerousGoodsItemsService
 * @generated
 */
public class TempDangerousGoodsItemsServiceWrapper
	implements TempDangerousGoodsItemsService,
		ServiceWrapper<TempDangerousGoodsItemsService> {
	public TempDangerousGoodsItemsServiceWrapper(
		TempDangerousGoodsItemsService tempDangerousGoodsItemsService) {
		_tempDangerousGoodsItemsService = tempDangerousGoodsItemsService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempDangerousGoodsItemsService getWrappedTempDangerousGoodsItemsService() {
		return _tempDangerousGoodsItemsService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempDangerousGoodsItemsService(
		TempDangerousGoodsItemsService tempDangerousGoodsItemsService) {
		_tempDangerousGoodsItemsService = tempDangerousGoodsItemsService;
	}

	public TempDangerousGoodsItemsService getWrappedService() {
		return _tempDangerousGoodsItemsService;
	}

	public void setWrappedService(
		TempDangerousGoodsItemsService tempDangerousGoodsItemsService) {
		_tempDangerousGoodsItemsService = tempDangerousGoodsItemsService;
	}

	private TempDangerousGoodsItemsService _tempDangerousGoodsItemsService;
}