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

import vn.gt.dao.noticeandmessage.model.ViewHoanThanhThuTuc;

import java.io.Serializable;

/**
 * The cache model class for representing ViewHoanThanhThuTuc in entity cache.
 *
 * @author win_64
 * @see ViewHoanThanhThuTuc
 * @generated
 */
public class ViewHoanThanhThuTucCacheModel implements CacheModel<ViewHoanThanhThuTuc>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{CVHH=");
		sb.append(CVHH);
		sb.append(", MaritimeOrder=");
		sb.append(MaritimeOrder);
		sb.append(", NC_KYSO=");
		sb.append(NC_KYSO);
		sb.append(", XC_KYSO=");
		sb.append(XC_KYSO);
		sb.append(", QC_KYSO=");
		sb.append(QC_KYSO);
		sb.append(", VC_KYSO=");
		sb.append(VC_KYSO);
		sb.append(", RC_KYSO=");
		sb.append(RC_KYSO);
		sb.append(", CCV_KYSO=");
		sb.append(CCV_KYSO);
		sb.append(", CCR_KYSO=");
		sb.append(CCR_KYSO);
		sb.append(", VCDK_KYSO=");
		sb.append(VCDK_KYSO);
		sb.append(", RCDK_KYSO=");
		sb.append(RCDK_KYSO);
		sb.append(", NCDK_KYSO=");
		sb.append(NCDK_KYSO);
		sb.append(", XCDK_KYSO=");
		sb.append(XCDK_KYSO);
		sb.append(", VCTND_KYSO=");
		sb.append(VCTND_KYSO);
		sb.append(", RCTND_KYSO=");
		sb.append(RCTND_KYSO);
		sb.append(", NC_DUYET=");
		sb.append(NC_DUYET);
		sb.append(", XC_DUYET=");
		sb.append(XC_DUYET);
		sb.append(", QC_DUYET=");
		sb.append(QC_DUYET);
		sb.append(", VC_DUYET=");
		sb.append(VC_DUYET);
		sb.append(", RC_DUYET=");
		sb.append(RC_DUYET);
		sb.append(", CCV_DUYET=");
		sb.append(CCV_DUYET);
		sb.append(", CCR_DUYET=");
		sb.append(CCR_DUYET);
		sb.append(", VCDK_DUYET=");
		sb.append(VCDK_DUYET);
		sb.append(", RCDK_DUYET=");
		sb.append(RCDK_DUYET);
		sb.append(", NCDK_DUYET=");
		sb.append(NCDK_DUYET);
		sb.append(", XCDK_DUYET=");
		sb.append(XCDK_DUYET);
		sb.append(", VCTND_DUYET=");
		sb.append(VCTND_DUYET);
		sb.append(", RCTND_DUYET=");
		sb.append(RCTND_DUYET);
		sb.append(", NCPTTND_DUYET=");
		sb.append(NCPTTND_DUYET);
		sb.append(", XCPTTND_DUYET=");
		sb.append(XCPTTND_DUYET);
		sb.append(", NCPTTND_KYSO=");
		sb.append(NCPTTND_KYSO);
		sb.append(", XCPTTND_KYSO=");
		sb.append(XCPTTND_KYSO);
		sb.append("}");

		return sb.toString();
	}

	public ViewHoanThanhThuTuc toEntityModel() {
		ViewHoanThanhThuTucImpl viewHoanThanhThuTucImpl = new ViewHoanThanhThuTucImpl();

		if (CVHH == null) {
			viewHoanThanhThuTucImpl.setCVHH(StringPool.BLANK);
		}
		else {
			viewHoanThanhThuTucImpl.setCVHH(CVHH);
		}

		viewHoanThanhThuTucImpl.setMaritimeOrder(MaritimeOrder);
		viewHoanThanhThuTucImpl.setNC_KYSO(NC_KYSO);
		viewHoanThanhThuTucImpl.setXC_KYSO(XC_KYSO);
		viewHoanThanhThuTucImpl.setQC_KYSO(QC_KYSO);
		viewHoanThanhThuTucImpl.setVC_KYSO(VC_KYSO);
		viewHoanThanhThuTucImpl.setRC_KYSO(RC_KYSO);
		viewHoanThanhThuTucImpl.setCCV_KYSO(CCV_KYSO);
		viewHoanThanhThuTucImpl.setCCR_KYSO(CCR_KYSO);
		viewHoanThanhThuTucImpl.setVCDK_KYSO(VCDK_KYSO);
		viewHoanThanhThuTucImpl.setRCDK_KYSO(RCDK_KYSO);
		viewHoanThanhThuTucImpl.setNCDK_KYSO(NCDK_KYSO);
		viewHoanThanhThuTucImpl.setXCDK_KYSO(XCDK_KYSO);
		viewHoanThanhThuTucImpl.setVCTND_KYSO(VCTND_KYSO);
		viewHoanThanhThuTucImpl.setRCTND_KYSO(RCTND_KYSO);
		viewHoanThanhThuTucImpl.setNC_DUYET(NC_DUYET);
		viewHoanThanhThuTucImpl.setXC_DUYET(XC_DUYET);
		viewHoanThanhThuTucImpl.setQC_DUYET(QC_DUYET);
		viewHoanThanhThuTucImpl.setVC_DUYET(VC_DUYET);
		viewHoanThanhThuTucImpl.setRC_DUYET(RC_DUYET);
		viewHoanThanhThuTucImpl.setCCV_DUYET(CCV_DUYET);
		viewHoanThanhThuTucImpl.setCCR_DUYET(CCR_DUYET);
		viewHoanThanhThuTucImpl.setVCDK_DUYET(VCDK_DUYET);
		viewHoanThanhThuTucImpl.setRCDK_DUYET(RCDK_DUYET);
		viewHoanThanhThuTucImpl.setNCDK_DUYET(NCDK_DUYET);
		viewHoanThanhThuTucImpl.setXCDK_DUYET(XCDK_DUYET);
		viewHoanThanhThuTucImpl.setVCTND_DUYET(VCTND_DUYET);
		viewHoanThanhThuTucImpl.setRCTND_DUYET(RCTND_DUYET);
		viewHoanThanhThuTucImpl.setNCPTTND_DUYET(NCPTTND_DUYET);
		viewHoanThanhThuTucImpl.setXCPTTND_DUYET(XCPTTND_DUYET);
		viewHoanThanhThuTucImpl.setNCPTTND_KYSO(NCPTTND_KYSO);
		viewHoanThanhThuTucImpl.setXCPTTND_KYSO(XCPTTND_KYSO);

		viewHoanThanhThuTucImpl.resetOriginalValues();

		return viewHoanThanhThuTucImpl;
	}

	public String CVHH;
	public int MaritimeOrder;
	public int NC_KYSO;
	public int XC_KYSO;
	public int QC_KYSO;
	public int VC_KYSO;
	public int RC_KYSO;
	public int CCV_KYSO;
	public int CCR_KYSO;
	public int VCDK_KYSO;
	public int RCDK_KYSO;
	public int NCDK_KYSO;
	public int XCDK_KYSO;
	public int VCTND_KYSO;
	public int RCTND_KYSO;
	public int NC_DUYET;
	public int XC_DUYET;
	public int QC_DUYET;
	public int VC_DUYET;
	public int RC_DUYET;
	public int CCV_DUYET;
	public int CCR_DUYET;
	public int VCDK_DUYET;
	public int RCDK_DUYET;
	public int NCDK_DUYET;
	public int XCDK_DUYET;
	public int VCTND_DUYET;
	public int RCTND_DUYET;
	public int NCPTTND_DUYET;
	public int XCPTTND_DUYET;
	public int NCPTTND_KYSO;
	public int XCPTTND_KYSO;
}