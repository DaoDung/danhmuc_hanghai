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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel;

import java.io.Serializable;

/**
 * The cache model class for representing IssueShiftingOrderChanel in entity cache.
 *
 * @author win_64
 * @see IssueShiftingOrderChanel
 * @generated
 */
public class IssueShiftingOrderChanelCacheModel implements CacheModel<IssueShiftingOrderChanel>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{shiftingOrderId=");
		sb.append(shiftingOrderId);
		sb.append(", chanelCode=");
		sb.append(chanelCode);
		sb.append(", chanelName=");
		sb.append(chanelName);
		sb.append(", order=");
		sb.append(order);
		sb.append("}");

		return sb.toString();
	}

	public IssueShiftingOrderChanel toEntityModel() {
		IssueShiftingOrderChanelImpl issueShiftingOrderChanelImpl = new IssueShiftingOrderChanelImpl();

		issueShiftingOrderChanelImpl.setShiftingOrderId(shiftingOrderId);

		if (chanelCode == null) {
			issueShiftingOrderChanelImpl.setChanelCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderChanelImpl.setChanelCode(chanelCode);
		}

		if (chanelName == null) {
			issueShiftingOrderChanelImpl.setChanelName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderChanelImpl.setChanelName(chanelName);
		}

		issueShiftingOrderChanelImpl.setOrder(order);

		issueShiftingOrderChanelImpl.resetOriginalValues();

		return issueShiftingOrderChanelImpl;
	}

	public long shiftingOrderId;
	public String chanelCode;
	public String chanelName;
	public int order;
}