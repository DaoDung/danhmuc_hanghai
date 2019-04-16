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

package vn.gt.dao.danhmuc.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.gt.dao.danhmuc.model.DmHistoryRankRating;
import vn.gt.dao.danhmuc.service.DmHistoryRankRatingLocalServiceUtil;

/**
 * The extended model base implementation for the DmHistoryRankRating service. Represents a row in the &quot;DM_HISTORY_RANK_RATING&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmHistoryRankRatingImpl}.
 * </p>
 *
 * @author win_64
 * @see DmHistoryRankRatingImpl
 * @see vn.gt.dao.danhmuc.model.DmHistoryRankRating
 * @generated
 */
public abstract class DmHistoryRankRatingBaseImpl
	extends DmHistoryRankRatingModelImpl implements DmHistoryRankRating {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm history rank rating model instance should use the {@link DmHistoryRankRating} interface instead.
	 */
	public void persist() throws SystemException {
		DmHistoryRankRatingLocalServiceUtil.updateDmHistoryRankRating(this);
	}
}