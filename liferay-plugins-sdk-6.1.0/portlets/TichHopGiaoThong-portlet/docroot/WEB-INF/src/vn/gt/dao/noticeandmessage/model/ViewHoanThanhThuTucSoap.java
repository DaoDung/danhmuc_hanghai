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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.gt.dao.noticeandmessage.service.http.ViewHoanThanhThuTucServiceSoap}.
 *
 * @author    win_64
 * @see       vn.gt.dao.noticeandmessage.service.http.ViewHoanThanhThuTucServiceSoap
 * @generated
 */
public class ViewHoanThanhThuTucSoap implements Serializable {
	public static ViewHoanThanhThuTucSoap toSoapModel(ViewHoanThanhThuTuc model) {
		ViewHoanThanhThuTucSoap soapModel = new ViewHoanThanhThuTucSoap();

		soapModel.setCVHH(model.getCVHH());
		soapModel.setMaritimeOrder(model.getMaritimeOrder());
		soapModel.setNC_KYSO(model.getNC_KYSO());
		soapModel.setXC_KYSO(model.getXC_KYSO());
		soapModel.setQC_KYSO(model.getQC_KYSO());
		soapModel.setVC_KYSO(model.getVC_KYSO());
		soapModel.setRC_KYSO(model.getRC_KYSO());
		soapModel.setCCV_KYSO(model.getCCV_KYSO());
		soapModel.setCCR_KYSO(model.getCCR_KYSO());
		soapModel.setVCDK_KYSO(model.getVCDK_KYSO());
		soapModel.setRCDK_KYSO(model.getRCDK_KYSO());
		soapModel.setNCDK_KYSO(model.getNCDK_KYSO());
		soapModel.setXCDK_KYSO(model.getXCDK_KYSO());
		soapModel.setVCTND_KYSO(model.getVCTND_KYSO());
		soapModel.setRCTND_KYSO(model.getRCTND_KYSO());
		soapModel.setNC_DUYET(model.getNC_DUYET());
		soapModel.setXC_DUYET(model.getXC_DUYET());
		soapModel.setQC_DUYET(model.getQC_DUYET());
		soapModel.setVC_DUYET(model.getVC_DUYET());
		soapModel.setRC_DUYET(model.getRC_DUYET());
		soapModel.setCCV_DUYET(model.getCCV_DUYET());
		soapModel.setCCR_DUYET(model.getCCR_DUYET());
		soapModel.setVCDK_DUYET(model.getVCDK_DUYET());
		soapModel.setRCDK_DUYET(model.getRCDK_DUYET());
		soapModel.setNCDK_DUYET(model.getNCDK_DUYET());
		soapModel.setXCDK_DUYET(model.getXCDK_DUYET());
		soapModel.setVCTND_DUYET(model.getVCTND_DUYET());
		soapModel.setRCTND_DUYET(model.getRCTND_DUYET());
		soapModel.setNCPTTND_DUYET(model.getNCPTTND_DUYET());
		soapModel.setXCPTTND_DUYET(model.getXCPTTND_DUYET());
		soapModel.setNCPTTND_KYSO(model.getNCPTTND_KYSO());
		soapModel.setXCPTTND_KYSO(model.getXCPTTND_KYSO());

		return soapModel;
	}

	public static ViewHoanThanhThuTucSoap[] toSoapModels(
		ViewHoanThanhThuTuc[] models) {
		ViewHoanThanhThuTucSoap[] soapModels = new ViewHoanThanhThuTucSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ViewHoanThanhThuTucSoap[][] toSoapModels(
		ViewHoanThanhThuTuc[][] models) {
		ViewHoanThanhThuTucSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ViewHoanThanhThuTucSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ViewHoanThanhThuTucSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ViewHoanThanhThuTucSoap[] toSoapModels(
		List<ViewHoanThanhThuTuc> models) {
		List<ViewHoanThanhThuTucSoap> soapModels = new ArrayList<ViewHoanThanhThuTucSoap>(models.size());

		for (ViewHoanThanhThuTuc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ViewHoanThanhThuTucSoap[soapModels.size()]);
	}

	public ViewHoanThanhThuTucSoap() {
	}

	public String getPrimaryKey() {
		return _CVHH;
	}

	public void setPrimaryKey(String pk) {
		setCVHH(pk);
	}

	public String getCVHH() {
		return _CVHH;
	}

	public void setCVHH(String CVHH) {
		_CVHH = CVHH;
	}

	public int getMaritimeOrder() {
		return _MaritimeOrder;
	}

	public void setMaritimeOrder(int MaritimeOrder) {
		_MaritimeOrder = MaritimeOrder;
	}

	public int getNC_KYSO() {
		return _NC_KYSO;
	}

	public void setNC_KYSO(int NC_KYSO) {
		_NC_KYSO = NC_KYSO;
	}

	public int getXC_KYSO() {
		return _XC_KYSO;
	}

	public void setXC_KYSO(int XC_KYSO) {
		_XC_KYSO = XC_KYSO;
	}

	public int getQC_KYSO() {
		return _QC_KYSO;
	}

	public void setQC_KYSO(int QC_KYSO) {
		_QC_KYSO = QC_KYSO;
	}

	public int getVC_KYSO() {
		return _VC_KYSO;
	}

	public void setVC_KYSO(int VC_KYSO) {
		_VC_KYSO = VC_KYSO;
	}

	public int getRC_KYSO() {
		return _RC_KYSO;
	}

	public void setRC_KYSO(int RC_KYSO) {
		_RC_KYSO = RC_KYSO;
	}

	public int getCCV_KYSO() {
		return _CCV_KYSO;
	}

	public void setCCV_KYSO(int CCV_KYSO) {
		_CCV_KYSO = CCV_KYSO;
	}

	public int getCCR_KYSO() {
		return _CCR_KYSO;
	}

	public void setCCR_KYSO(int CCR_KYSO) {
		_CCR_KYSO = CCR_KYSO;
	}

	public int getVCDK_KYSO() {
		return _VCDK_KYSO;
	}

	public void setVCDK_KYSO(int VCDK_KYSO) {
		_VCDK_KYSO = VCDK_KYSO;
	}

	public int getRCDK_KYSO() {
		return _RCDK_KYSO;
	}

	public void setRCDK_KYSO(int RCDK_KYSO) {
		_RCDK_KYSO = RCDK_KYSO;
	}

	public int getNCDK_KYSO() {
		return _NCDK_KYSO;
	}

	public void setNCDK_KYSO(int NCDK_KYSO) {
		_NCDK_KYSO = NCDK_KYSO;
	}

	public int getXCDK_KYSO() {
		return _XCDK_KYSO;
	}

	public void setXCDK_KYSO(int XCDK_KYSO) {
		_XCDK_KYSO = XCDK_KYSO;
	}

	public int getVCTND_KYSO() {
		return _VCTND_KYSO;
	}

	public void setVCTND_KYSO(int VCTND_KYSO) {
		_VCTND_KYSO = VCTND_KYSO;
	}

	public int getRCTND_KYSO() {
		return _RCTND_KYSO;
	}

	public void setRCTND_KYSO(int RCTND_KYSO) {
		_RCTND_KYSO = RCTND_KYSO;
	}

	public int getNC_DUYET() {
		return _NC_DUYET;
	}

	public void setNC_DUYET(int NC_DUYET) {
		_NC_DUYET = NC_DUYET;
	}

	public int getXC_DUYET() {
		return _XC_DUYET;
	}

	public void setXC_DUYET(int XC_DUYET) {
		_XC_DUYET = XC_DUYET;
	}

	public int getQC_DUYET() {
		return _QC_DUYET;
	}

	public void setQC_DUYET(int QC_DUYET) {
		_QC_DUYET = QC_DUYET;
	}

	public int getVC_DUYET() {
		return _VC_DUYET;
	}

	public void setVC_DUYET(int VC_DUYET) {
		_VC_DUYET = VC_DUYET;
	}

	public int getRC_DUYET() {
		return _RC_DUYET;
	}

	public void setRC_DUYET(int RC_DUYET) {
		_RC_DUYET = RC_DUYET;
	}

	public int getCCV_DUYET() {
		return _CCV_DUYET;
	}

	public void setCCV_DUYET(int CCV_DUYET) {
		_CCV_DUYET = CCV_DUYET;
	}

	public int getCCR_DUYET() {
		return _CCR_DUYET;
	}

	public void setCCR_DUYET(int CCR_DUYET) {
		_CCR_DUYET = CCR_DUYET;
	}

	public int getVCDK_DUYET() {
		return _VCDK_DUYET;
	}

	public void setVCDK_DUYET(int VCDK_DUYET) {
		_VCDK_DUYET = VCDK_DUYET;
	}

	public int getRCDK_DUYET() {
		return _RCDK_DUYET;
	}

	public void setRCDK_DUYET(int RCDK_DUYET) {
		_RCDK_DUYET = RCDK_DUYET;
	}

	public int getNCDK_DUYET() {
		return _NCDK_DUYET;
	}

	public void setNCDK_DUYET(int NCDK_DUYET) {
		_NCDK_DUYET = NCDK_DUYET;
	}

	public int getXCDK_DUYET() {
		return _XCDK_DUYET;
	}

	public void setXCDK_DUYET(int XCDK_DUYET) {
		_XCDK_DUYET = XCDK_DUYET;
	}

	public int getVCTND_DUYET() {
		return _VCTND_DUYET;
	}

	public void setVCTND_DUYET(int VCTND_DUYET) {
		_VCTND_DUYET = VCTND_DUYET;
	}

	public int getRCTND_DUYET() {
		return _RCTND_DUYET;
	}

	public void setRCTND_DUYET(int RCTND_DUYET) {
		_RCTND_DUYET = RCTND_DUYET;
	}

	public int getNCPTTND_DUYET() {
		return _NCPTTND_DUYET;
	}

	public void setNCPTTND_DUYET(int NCPTTND_DUYET) {
		_NCPTTND_DUYET = NCPTTND_DUYET;
	}

	public int getXCPTTND_DUYET() {
		return _XCPTTND_DUYET;
	}

	public void setXCPTTND_DUYET(int XCPTTND_DUYET) {
		_XCPTTND_DUYET = XCPTTND_DUYET;
	}

	public int getNCPTTND_KYSO() {
		return _NCPTTND_KYSO;
	}

	public void setNCPTTND_KYSO(int NCPTTND_KYSO) {
		_NCPTTND_KYSO = NCPTTND_KYSO;
	}

	public int getXCPTTND_KYSO() {
		return _XCPTTND_KYSO;
	}

	public void setXCPTTND_KYSO(int XCPTTND_KYSO) {
		_XCPTTND_KYSO = XCPTTND_KYSO;
	}

	private String _CVHH;
	private int _MaritimeOrder;
	private int _NC_KYSO;
	private int _XC_KYSO;
	private int _QC_KYSO;
	private int _VC_KYSO;
	private int _RC_KYSO;
	private int _CCV_KYSO;
	private int _CCR_KYSO;
	private int _VCDK_KYSO;
	private int _RCDK_KYSO;
	private int _NCDK_KYSO;
	private int _XCDK_KYSO;
	private int _VCTND_KYSO;
	private int _RCTND_KYSO;
	private int _NC_DUYET;
	private int _XC_DUYET;
	private int _QC_DUYET;
	private int _VC_DUYET;
	private int _RC_DUYET;
	private int _CCV_DUYET;
	private int _CCR_DUYET;
	private int _VCDK_DUYET;
	private int _RCDK_DUYET;
	private int _NCDK_DUYET;
	private int _XCDK_DUYET;
	private int _VCTND_DUYET;
	private int _RCTND_DUYET;
	private int _NCPTTND_DUYET;
	private int _XCPTTND_DUYET;
	private int _NCPTTND_KYSO;
	private int _XCPTTND_KYSO;
}