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
 * This class is a wrapper for {@link TempGoodsItemsService}.
 * </p>
 *
 * @author    win_64
 * @see       TempGoodsItemsService
 * @generated
 */
public class TempGoodsItemsServiceWrapper implements TempGoodsItemsService,
	ServiceWrapper<TempGoodsItemsService> {
	public TempGoodsItemsServiceWrapper(
		TempGoodsItemsService tempGoodsItemsService) {
		_tempGoodsItemsService = tempGoodsItemsService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempGoodsItemsService getWrappedTempGoodsItemsService() {
		return _tempGoodsItemsService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempGoodsItemsService(
		TempGoodsItemsService tempGoodsItemsService) {
		_tempGoodsItemsService = tempGoodsItemsService;
	}

	public TempGoodsItemsService getWrappedService() {
		return _tempGoodsItemsService;
	}

	public void setWrappedService(TempGoodsItemsService tempGoodsItemsService) {
		_tempGoodsItemsService = tempGoodsItemsService;
	}

	private TempGoodsItemsService _tempGoodsItemsService;
}