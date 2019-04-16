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

package vn.gt.dao.danhmuc.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.danhmuc.service.DmTestN01RequestLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class DmTestN01RequestClp extends BaseModelImpl<DmTestN01Request>
	implements DmTestN01Request {
	public DmTestN01RequestClp() {
	}

	public Class<?> getModelClass() {
		return DmTestN01Request.class;
	}

	public String getModelClassName() {
		return DmTestN01Request.class.getName();
	}

	public int getPrimaryKey() {
		return _requestID;
	}

	public void setPrimaryKey(int primaryKey) {
		setRequestID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_requestID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public int getRequestID() {
		return _requestID;
	}

	public void setRequestID(int requestID) {
		_requestID = requestID;
	}

	public String getEnterpriseCode() {
		return _enterpriseCode;
	}

	public void setEnterpriseCode(String enterpriseCode) {
		_enterpriseCode = enterpriseCode;
	}

	public String getTenDuAn() {
		return _tenDuAn;
	}

	public void setTenDuAn(String tenDuAn) {
		_tenDuAn = tenDuAn;
	}

	public String getSuCanThietDauTu() {
		return _suCanThietDauTu;
	}

	public void setSuCanThietDauTu(String suCanThietDauTu) {
		_suCanThietDauTu = suCanThietDauTu;
	}

	public String getViTri() {
		return _viTri;
	}

	public void setViTri(String viTri) {
		_viTri = viTri;
	}

	public String getLoaiTauBienGioiHanVaoCang() {
		return _loaiTauBienGioiHanVaoCang;
	}

	public void setLoaiTauBienGioiHanVaoCang(String loaiTauBienGioiHanVaoCang) {
		_loaiTauBienGioiHanVaoCang = loaiTauBienGioiHanVaoCang;
	}

	public String getSoLuongCauCang() {
		return _soLuongCauCang;
	}

	public void setSoLuongCauCang(String soLuongCauCang) {
		_soLuongCauCang = soLuongCauCang;
	}

	public String getTongDienTichXayDungDuKien() {
		return _tongDienTichXayDungDuKien;
	}

	public void setTongDienTichXayDungDuKien(String tongDienTichXayDungDuKien) {
		_tongDienTichXayDungDuKien = tongDienTichXayDungDuKien;
	}

	public String getTaiLieulienQuan() {
		return _taiLieulienQuan;
	}

	public void setTaiLieulienQuan(String taiLieulienQuan) {
		_taiLieulienQuan = taiLieulienQuan;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getModifiedUser() {
		return _modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		_modifiedUser = modifiedUser;
	}

	public int getIsAuthorized() {
		return _isAuthorized;
	}

	public void setIsAuthorized(int isAuthorized) {
		_isAuthorized = isAuthorized;
	}

	public Date getAuthorizedDate() {
		return _authorizedDate;
	}

	public void setAuthorizedDate(Date authorizedDate) {
		_authorizedDate = authorizedDate;
	}

	public String getAuthorizedUser() {
		return _authorizedUser;
	}

	public void setAuthorizedUser(String authorizedUser) {
		_authorizedUser = authorizedUser;
	}

	public void persist() throws SystemException {
		DmTestN01RequestLocalServiceUtil.updateDmTestN01Request(this);
	}

	@Override
	public DmTestN01Request toEscapedModel() {
		return (DmTestN01Request)Proxy.newProxyInstance(DmTestN01Request.class.getClassLoader(),
			new Class[] { DmTestN01Request.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmTestN01RequestClp clone = new DmTestN01RequestClp();

		clone.setRequestID(getRequestID());
		clone.setEnterpriseCode(getEnterpriseCode());
		clone.setTenDuAn(getTenDuAn());
		clone.setSuCanThietDauTu(getSuCanThietDauTu());
		clone.setViTri(getViTri());
		clone.setLoaiTauBienGioiHanVaoCang(getLoaiTauBienGioiHanVaoCang());
		clone.setSoLuongCauCang(getSoLuongCauCang());
		clone.setTongDienTichXayDungDuKien(getTongDienTichXayDungDuKien());
		clone.setTaiLieulienQuan(getTaiLieulienQuan());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedUser(getModifiedUser());
		clone.setIsAuthorized(getIsAuthorized());
		clone.setAuthorizedDate(getAuthorizedDate());
		clone.setAuthorizedUser(getAuthorizedUser());

		return clone;
	}

	public int compareTo(DmTestN01Request dmTestN01Request) {
		int value = 0;

		if (getRequestID() < dmTestN01Request.getRequestID()) {
			value = -1;
		}
		else if (getRequestID() > dmTestN01Request.getRequestID()) {
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

		DmTestN01RequestClp dmTestN01Request = null;

		try {
			dmTestN01Request = (DmTestN01RequestClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmTestN01Request.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{requestID=");
		sb.append(getRequestID());
		sb.append(", enterpriseCode=");
		sb.append(getEnterpriseCode());
		sb.append(", tenDuAn=");
		sb.append(getTenDuAn());
		sb.append(", suCanThietDauTu=");
		sb.append(getSuCanThietDauTu());
		sb.append(", viTri=");
		sb.append(getViTri());
		sb.append(", loaiTauBienGioiHanVaoCang=");
		sb.append(getLoaiTauBienGioiHanVaoCang());
		sb.append(", soLuongCauCang=");
		sb.append(getSoLuongCauCang());
		sb.append(", tongDienTichXayDungDuKien=");
		sb.append(getTongDienTichXayDungDuKien());
		sb.append(", taiLieulienQuan=");
		sb.append(getTaiLieulienQuan());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedUser=");
		sb.append(getModifiedUser());
		sb.append(", isAuthorized=");
		sb.append(getIsAuthorized());
		sb.append(", authorizedDate=");
		sb.append(getAuthorizedDate());
		sb.append(", authorizedUser=");
		sb.append(getAuthorizedUser());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmTestN01Request");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requestID</column-name><column-value><![CDATA[");
		sb.append(getRequestID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enterpriseCode</column-name><column-value><![CDATA[");
		sb.append(getEnterpriseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenDuAn</column-name><column-value><![CDATA[");
		sb.append(getTenDuAn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>suCanThietDauTu</column-name><column-value><![CDATA[");
		sb.append(getSuCanThietDauTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viTri</column-name><column-value><![CDATA[");
		sb.append(getViTri());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiTauBienGioiHanVaoCang</column-name><column-value><![CDATA[");
		sb.append(getLoaiTauBienGioiHanVaoCang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongCauCang</column-name><column-value><![CDATA[");
		sb.append(getSoLuongCauCang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongDienTichXayDungDuKien</column-name><column-value><![CDATA[");
		sb.append(getTongDienTichXayDungDuKien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiLieulienQuan</column-name><column-value><![CDATA[");
		sb.append(getTaiLieulienQuan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAuthorized</column-name><column-value><![CDATA[");
		sb.append(getIsAuthorized());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorizedDate</column-name><column-value><![CDATA[");
		sb.append(getAuthorizedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorizedUser</column-name><column-value><![CDATA[");
		sb.append(getAuthorizedUser());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _requestID;
	private String _enterpriseCode;
	private String _tenDuAn;
	private String _suCanThietDauTu;
	private String _viTri;
	private String _loaiTauBienGioiHanVaoCang;
	private String _soLuongCauCang;
	private String _tongDienTichXayDungDuKien;
	private String _taiLieulienQuan;
	private Date _modifiedDate;
	private String _modifiedUser;
	private int _isAuthorized;
	private Date _authorizedDate;
	private String _authorizedUser;
}