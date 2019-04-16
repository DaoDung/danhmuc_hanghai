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

package vn.gt.dao.noticeandmessage.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author win_64
 */
public class IssueShiftingOrderChanelPK implements Comparable<IssueShiftingOrderChanelPK>,
	Serializable {
	public long shiftingOrderId;
	public String chanelCode;

	public IssueShiftingOrderChanelPK() {
	}

	public IssueShiftingOrderChanelPK(long shiftingOrderId, String chanelCode) {
		this.shiftingOrderId = shiftingOrderId;
		this.chanelCode = chanelCode;
	}

	public long getShiftingOrderId() {
		return shiftingOrderId;
	}

	public void setShiftingOrderId(long shiftingOrderId) {
		this.shiftingOrderId = shiftingOrderId;
	}

	public String getChanelCode() {
		return chanelCode;
	}

	public void setChanelCode(String chanelCode) {
		this.chanelCode = chanelCode;
	}

	public int compareTo(IssueShiftingOrderChanelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (shiftingOrderId < pk.shiftingOrderId) {
			value = -1;
		}
		else if (shiftingOrderId > pk.shiftingOrderId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = chanelCode.compareTo(pk.chanelCode);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		IssueShiftingOrderChanelPK pk = null;

		try {
			pk = (IssueShiftingOrderChanelPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((shiftingOrderId == pk.shiftingOrderId) &&
				(chanelCode.equals(pk.chanelCode))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(shiftingOrderId) + String.valueOf(chanelCode)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("shiftingOrderId");
		sb.append(StringPool.EQUAL);
		sb.append(shiftingOrderId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("chanelCode");
		sb.append(StringPool.EQUAL);
		sb.append(chanelCode);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}