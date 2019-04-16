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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.danhmuc.model.DmTestN01Request;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing DmTestN01Request in entity cache.
 *
 * @author win_64
 * @see DmTestN01Request
 * @generated
 */
public class DmTestN01RequestCacheModel implements CacheModel<DmTestN01Request>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{requestID=");
		sb.append(requestID);
		sb.append(", enterpriseCode=");
		sb.append(enterpriseCode);
		sb.append(", tenDuAn=");
		sb.append(tenDuAn);
		sb.append(", suCanThietDauTu=");
		sb.append(suCanThietDauTu);
		sb.append(", viTri=");
		sb.append(viTri);
		sb.append(", loaiTauBienGioiHanVaoCang=");
		sb.append(loaiTauBienGioiHanVaoCang);
		sb.append(", soLuongCauCang=");
		sb.append(soLuongCauCang);
		sb.append(", tongDienTichXayDungDuKien=");
		sb.append(tongDienTichXayDungDuKien);
		sb.append(", taiLieulienQuan=");
		sb.append(taiLieulienQuan);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedUser=");
		sb.append(modifiedUser);
		sb.append(", isAuthorized=");
		sb.append(isAuthorized);
		sb.append(", authorizedDate=");
		sb.append(authorizedDate);
		sb.append(", authorizedUser=");
		sb.append(authorizedUser);
		sb.append("}");

		return sb.toString();
	}

	public DmTestN01Request toEntityModel() {
		DmTestN01RequestImpl dmTestN01RequestImpl = new DmTestN01RequestImpl();

		dmTestN01RequestImpl.setRequestID(requestID);

		if (enterpriseCode == null) {
			dmTestN01RequestImpl.setEnterpriseCode(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setEnterpriseCode(enterpriseCode);
		}

		if (tenDuAn == null) {
			dmTestN01RequestImpl.setTenDuAn(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setTenDuAn(tenDuAn);
		}

		if (suCanThietDauTu == null) {
			dmTestN01RequestImpl.setSuCanThietDauTu(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setSuCanThietDauTu(suCanThietDauTu);
		}

		if (viTri == null) {
			dmTestN01RequestImpl.setViTri(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setViTri(viTri);
		}

		if (loaiTauBienGioiHanVaoCang == null) {
			dmTestN01RequestImpl.setLoaiTauBienGioiHanVaoCang(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setLoaiTauBienGioiHanVaoCang(loaiTauBienGioiHanVaoCang);
		}

		if (soLuongCauCang == null) {
			dmTestN01RequestImpl.setSoLuongCauCang(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setSoLuongCauCang(soLuongCauCang);
		}

		if (tongDienTichXayDungDuKien == null) {
			dmTestN01RequestImpl.setTongDienTichXayDungDuKien(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setTongDienTichXayDungDuKien(tongDienTichXayDungDuKien);
		}

		if (taiLieulienQuan == null) {
			dmTestN01RequestImpl.setTaiLieulienQuan(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setTaiLieulienQuan(taiLieulienQuan);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dmTestN01RequestImpl.setModifiedDate(null);
		}
		else {
			dmTestN01RequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (modifiedUser == null) {
			dmTestN01RequestImpl.setModifiedUser(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setModifiedUser(modifiedUser);
		}

		dmTestN01RequestImpl.setIsAuthorized(isAuthorized);

		if (authorizedDate == Long.MIN_VALUE) {
			dmTestN01RequestImpl.setAuthorizedDate(null);
		}
		else {
			dmTestN01RequestImpl.setAuthorizedDate(new Date(authorizedDate));
		}

		if (authorizedUser == null) {
			dmTestN01RequestImpl.setAuthorizedUser(StringPool.BLANK);
		}
		else {
			dmTestN01RequestImpl.setAuthorizedUser(authorizedUser);
		}

		dmTestN01RequestImpl.resetOriginalValues();

		return dmTestN01RequestImpl;
	}

	public int requestID;
	public String enterpriseCode;
	public String tenDuAn;
	public String suCanThietDauTu;
	public String viTri;
	public String loaiTauBienGioiHanVaoCang;
	public String soLuongCauCang;
	public String tongDienTichXayDungDuKien;
	public String taiLieulienQuan;
	public long modifiedDate;
	public String modifiedUser;
	public int isAuthorized;
	public long authorizedDate;
	public String authorizedUser;
}