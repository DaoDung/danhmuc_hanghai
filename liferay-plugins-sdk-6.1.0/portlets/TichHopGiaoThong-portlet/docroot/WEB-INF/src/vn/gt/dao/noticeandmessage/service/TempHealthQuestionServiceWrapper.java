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
 * This class is a wrapper for {@link TempHealthQuestionService}.
 * </p>
 *
 * @author    win_64
 * @see       TempHealthQuestionService
 * @generated
 */
public class TempHealthQuestionServiceWrapper
	implements TempHealthQuestionService,
		ServiceWrapper<TempHealthQuestionService> {
	public TempHealthQuestionServiceWrapper(
		TempHealthQuestionService tempHealthQuestionService) {
		_tempHealthQuestionService = tempHealthQuestionService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TempHealthQuestionService getWrappedTempHealthQuestionService() {
		return _tempHealthQuestionService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTempHealthQuestionService(
		TempHealthQuestionService tempHealthQuestionService) {
		_tempHealthQuestionService = tempHealthQuestionService;
	}

	public TempHealthQuestionService getWrappedService() {
		return _tempHealthQuestionService;
	}

	public void setWrappedService(
		TempHealthQuestionService tempHealthQuestionService) {
		_tempHealthQuestionService = tempHealthQuestionService;
	}

	private TempHealthQuestionService _tempHealthQuestionService;
}