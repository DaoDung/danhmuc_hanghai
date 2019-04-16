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

package vn.gt.dao.result.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.result.service.ResultCompetionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author win_64
 */
public class ResultCompetionClp extends BaseModelImpl<ResultCompetion>
	implements ResultCompetion {
	public ResultCompetionClp() {
	}

	public Class<?> getModelClass() {
		return ResultCompetion.class;
	}

	public String getModelClassName() {
		return ResultCompetion.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getRequestCode() {
		return _requestCode;
	}

	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_documentName = documentName;
	}

	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;
	}

	public String getNameOfShip() {
		return _nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	public double getGrossTonnage() {
		return _grossTonnage;
	}

	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;
	}

	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	public String getMaritimeCode() {
		return _maritimeCode;
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	public String getDivision() {
		return _division;
	}

	public void setDivision(String division) {
		_division = division;
	}

	public String getApprovalName() {
		return _approvalName;
	}

	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;
	}

	public Date getApprovalTime() {
		return _approvalTime;
	}

	public void setApprovalTime(Date approvalTime) {
		_approvalTime = approvalTime;
	}

	public String getCertificateNo() {
		return _certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;
	}

	public int getResponseStatusHQ() {
		return _responseStatusHQ;
	}

	public void setResponseStatusHQ(int responseStatusHQ) {
		_responseStatusHQ = responseStatusHQ;
	}

	public int getResponseStatusBP() {
		return _responseStatusBP;
	}

	public void setResponseStatusBP(int responseStatusBP) {
		_responseStatusBP = responseStatusBP;
	}

	public int getResponseStatusYT() {
		return _responseStatusYT;
	}

	public void setResponseStatusYT(int responseStatusYT) {
		_responseStatusYT = responseStatusYT;
	}

	public int getResponseStatusDV() {
		return _responseStatusDV;
	}

	public void setResponseStatusDV(int responseStatusDV) {
		_responseStatusDV = responseStatusDV;
	}

	public int getResponseStatusTV() {
		return _responseStatusTV;
	}

	public void setResponseStatusTV(int responseStatusTV) {
		_responseStatusTV = responseStatusTV;
	}

	public int getResponseStatusCVHH() {
		return _responseStatusCVHH;
	}

	public void setResponseStatusCVHH(int responseStatusCVHH) {
		_responseStatusCVHH = responseStatusCVHH;
	}

	public Date getResponseTimeHQ() {
		return _responseTimeHQ;
	}

	public void setResponseTimeHQ(Date responseTimeHQ) {
		_responseTimeHQ = responseTimeHQ;
	}

	public Date getResponseTimeBP() {
		return _responseTimeBP;
	}

	public void setResponseTimeBP(Date responseTimeBP) {
		_responseTimeBP = responseTimeBP;
	}

	public Date getResponseTimeYT() {
		return _responseTimeYT;
	}

	public void setResponseTimeYT(Date responseTimeYT) {
		_responseTimeYT = responseTimeYT;
	}

	public Date getResponseTimeDV() {
		return _responseTimeDV;
	}

	public void setResponseTimeDV(Date responseTimeDV) {
		_responseTimeDV = responseTimeDV;
	}

	public Date getResponseTimeTV() {
		return _responseTimeTV;
	}

	public void setResponseTimeTV(Date responseTimeTV) {
		_responseTimeTV = responseTimeTV;
	}

	public Date getResponseTimeCVHH() {
		return _responseTimeCVHH;
	}

	public void setResponseTimeCVHH(Date responseTimeCVHH) {
		_responseTimeCVHH = responseTimeCVHH;
	}

	public String getResponseHQ() {
		return _responseHQ;
	}

	public void setResponseHQ(String responseHQ) {
		_responseHQ = responseHQ;
	}

	public String getResponseBP() {
		return _responseBP;
	}

	public void setResponseBP(String responseBP) {
		_responseBP = responseBP;
	}

	public String getResponseYT() {
		return _responseYT;
	}

	public void setResponseYT(String responseYT) {
		_responseYT = responseYT;
	}

	public String getResponseDV() {
		return _responseDV;
	}

	public void setResponseDV(String responseDV) {
		_responseDV = responseDV;
	}

	public String getResponseTV() {
		return _responseTV;
	}

	public void setResponseTV(String responseTV) {
		_responseTV = responseTV;
	}

	public String getResponseCVHH() {
		return _responseCVHH;
	}

	public void setResponseCVHH(String responseCVHH) {
		_responseCVHH = responseCVHH;
	}

	public void persist() throws SystemException {
		ResultCompetionLocalServiceUtil.updateResultCompetion(this);
	}

	@Override
	public ResultCompetion toEscapedModel() {
		return (ResultCompetion)Proxy.newProxyInstance(ResultCompetion.class.getClassLoader(),
			new Class[] { ResultCompetion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ResultCompetionClp clone = new ResultCompetionClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setPortOfArrivalCode(getPortOfArrivalCode());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setDivision(getDivision());
		clone.setApprovalName(getApprovalName());
		clone.setApprovalTime(getApprovalTime());
		clone.setCertificateNo(getCertificateNo());
		clone.setResponseStatusHQ(getResponseStatusHQ());
		clone.setResponseStatusBP(getResponseStatusBP());
		clone.setResponseStatusYT(getResponseStatusYT());
		clone.setResponseStatusDV(getResponseStatusDV());
		clone.setResponseStatusTV(getResponseStatusTV());
		clone.setResponseStatusCVHH(getResponseStatusCVHH());
		clone.setResponseTimeHQ(getResponseTimeHQ());
		clone.setResponseTimeBP(getResponseTimeBP());
		clone.setResponseTimeYT(getResponseTimeYT());
		clone.setResponseTimeDV(getResponseTimeDV());
		clone.setResponseTimeTV(getResponseTimeTV());
		clone.setResponseTimeCVHH(getResponseTimeCVHH());
		clone.setResponseHQ(getResponseHQ());
		clone.setResponseBP(getResponseBP());
		clone.setResponseYT(getResponseYT());
		clone.setResponseDV(getResponseDV());
		clone.setResponseTV(getResponseTV());
		clone.setResponseCVHH(getResponseCVHH());

		return clone;
	}

	public int compareTo(ResultCompetion resultCompetion) {
		int value = 0;

		if (getId() < resultCompetion.getId()) {
			value = -1;
		}
		else if (getId() > resultCompetion.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

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

		ResultCompetionClp resultCompetion = null;

		try {
			resultCompetion = (ResultCompetionClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = resultCompetion.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", division=");
		sb.append(getDivision());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", approvalTime=");
		sb.append(getApprovalTime());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", responseStatusHQ=");
		sb.append(getResponseStatusHQ());
		sb.append(", responseStatusBP=");
		sb.append(getResponseStatusBP());
		sb.append(", responseStatusYT=");
		sb.append(getResponseStatusYT());
		sb.append(", responseStatusDV=");
		sb.append(getResponseStatusDV());
		sb.append(", responseStatusTV=");
		sb.append(getResponseStatusTV());
		sb.append(", responseStatusCVHH=");
		sb.append(getResponseStatusCVHH());
		sb.append(", responseTimeHQ=");
		sb.append(getResponseTimeHQ());
		sb.append(", responseTimeBP=");
		sb.append(getResponseTimeBP());
		sb.append(", responseTimeYT=");
		sb.append(getResponseTimeYT());
		sb.append(", responseTimeDV=");
		sb.append(getResponseTimeDV());
		sb.append(", responseTimeTV=");
		sb.append(getResponseTimeTV());
		sb.append(", responseTimeCVHH=");
		sb.append(getResponseTimeCVHH());
		sb.append(", responseHQ=");
		sb.append(getResponseHQ());
		sb.append(", responseBP=");
		sb.append(getResponseBP());
		sb.append(", responseYT=");
		sb.append(getResponseYT());
		sb.append(", responseDV=");
		sb.append(getResponseDV());
		sb.append(", responseTV=");
		sb.append(getResponseTV());
		sb.append(", responseCVHH=");
		sb.append(getResponseCVHH());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(103);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.result.model.ResultCompetion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>division</column-name><column-value><![CDATA[");
		sb.append(getDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalTime</column-name><column-value><![CDATA[");
		sb.append(getApprovalTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusHQ</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusHQ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusBP</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusBP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusYT</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusYT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusDV</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusDV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusTV</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusTV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseStatusCVHH</column-name><column-value><![CDATA[");
		sb.append(getResponseStatusCVHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeHQ</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeHQ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeBP</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeBP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeYT</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeYT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeDV</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeDV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeTV</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeTV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTimeCVHH</column-name><column-value><![CDATA[");
		sb.append(getResponseTimeCVHH());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseHQ</column-name><column-value><![CDATA[");
		sb.append(getResponseHQ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseBP</column-name><column-value><![CDATA[");
		sb.append(getResponseBP());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseYT</column-name><column-value><![CDATA[");
		sb.append(getResponseYT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseDV</column-name><column-value><![CDATA[");
		sb.append(getResponseDV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseTV</column-name><column-value><![CDATA[");
		sb.append(getResponseTV());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>responseCVHH</column-name><column-value><![CDATA[");
		sb.append(getResponseCVHH());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _nameOfMaster;
	private double _grossTonnage;
	private String _portOfArrivalCode;
	private String _maritimeCode;
	private String _division;
	private String _approvalName;
	private Date _approvalTime;
	private String _certificateNo;
	private int _responseStatusHQ;
	private int _responseStatusBP;
	private int _responseStatusYT;
	private int _responseStatusDV;
	private int _responseStatusTV;
	private int _responseStatusCVHH;
	private Date _responseTimeHQ;
	private Date _responseTimeBP;
	private Date _responseTimeYT;
	private Date _responseTimeDV;
	private Date _responseTimeTV;
	private Date _responseTimeCVHH;
	private String _responseHQ;
	private String _responseBP;
	private String _responseYT;
	private String _responseDV;
	private String _responseTV;
	private String _responseCVHH;
}