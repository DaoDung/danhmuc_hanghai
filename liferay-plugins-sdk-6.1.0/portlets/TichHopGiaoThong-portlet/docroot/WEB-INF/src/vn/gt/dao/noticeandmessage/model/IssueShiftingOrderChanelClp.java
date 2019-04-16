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

package vn.gt.dao.noticeandmessage.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderChanelLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.persistence.IssueShiftingOrderChanelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author win_64
 */
public class IssueShiftingOrderChanelClp extends BaseModelImpl<IssueShiftingOrderChanel>
	implements IssueShiftingOrderChanel {
	public IssueShiftingOrderChanelClp() {
	}

	public Class<?> getModelClass() {
		return IssueShiftingOrderChanel.class;
	}

	public String getModelClassName() {
		return IssueShiftingOrderChanel.class.getName();
	}

	public IssueShiftingOrderChanelPK getPrimaryKey() {
		return new IssueShiftingOrderChanelPK(_shiftingOrderId, _chanelCode);
	}

	public void setPrimaryKey(IssueShiftingOrderChanelPK primaryKey) {
		setShiftingOrderId(primaryKey.shiftingOrderId);
		setChanelCode(primaryKey.chanelCode);
	}

	public Serializable getPrimaryKeyObj() {
		return new IssueShiftingOrderChanelPK(_shiftingOrderId, _chanelCode);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((IssueShiftingOrderChanelPK)primaryKeyObj);
	}

	public long getShiftingOrderId() {
		return _shiftingOrderId;
	}

	public void setShiftingOrderId(long shiftingOrderId) {
		_shiftingOrderId = shiftingOrderId;
	}

	public String getChanelCode() {
		return _chanelCode;
	}

	public void setChanelCode(String chanelCode) {
		_chanelCode = chanelCode;
	}

	public String getChanelName() {
		return _chanelName;
	}

	public void setChanelName(String chanelName) {
		_chanelName = chanelName;
	}

	public int getOrder() {
		return _order;
	}

	public void setOrder(int order) {
		_order = order;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueShiftingOrderChanelLocalServiceUtil.addIssueShiftingOrderChanel(this);
		}
		else {
			IssueShiftingOrderChanelLocalServiceUtil.updateIssueShiftingOrderChanel(this);
		}
	}

	@Override
	public IssueShiftingOrderChanel toEscapedModel() {
		return (IssueShiftingOrderChanel)Proxy.newProxyInstance(IssueShiftingOrderChanel.class.getClassLoader(),
			new Class[] { IssueShiftingOrderChanel.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueShiftingOrderChanelClp clone = new IssueShiftingOrderChanelClp();

		clone.setShiftingOrderId(getShiftingOrderId());
		clone.setChanelCode(getChanelCode());
		clone.setChanelName(getChanelName());
		clone.setOrder(getOrder());

		return clone;
	}

	public int compareTo(IssueShiftingOrderChanel issueShiftingOrderChanel) {
		int value = 0;

		if (getOrder() < issueShiftingOrderChanel.getOrder()) {
			value = -1;
		}
		else if (getOrder() > issueShiftingOrderChanel.getOrder()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		IssueShiftingOrderChanelClp issueShiftingOrderChanel = null;

		try {
			issueShiftingOrderChanel = (IssueShiftingOrderChanelClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		IssueShiftingOrderChanelPK primaryKey = issueShiftingOrderChanel.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{shiftingOrderId=");
		sb.append(getShiftingOrderId());
		sb.append(", chanelCode=");
		sb.append(getChanelCode());
		sb.append(", chanelName=");
		sb.append(getChanelName());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.noticeandmessage.model.IssueShiftingOrderChanel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>shiftingOrderId</column-name><column-value><![CDATA[");
		sb.append(getShiftingOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chanelCode</column-name><column-value><![CDATA[");
		sb.append(getChanelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chanelName</column-name><column-value><![CDATA[");
		sb.append(getChanelName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _shiftingOrderId;
	private String _chanelCode;
	private String _chanelName;
	private int _order;
}