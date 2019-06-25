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

package vn.gt.dao.result.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.gt.dao.result.model.ResultCompetion;
import vn.gt.dao.result.model.ResultCompetionModel;
import vn.gt.dao.result.model.ResultCompetionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the ResultCompetion service. Represents a row in the &quot;RESULT_COMPLETION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.result.model.ResultCompetionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResultCompetionImpl}.
 * </p>
 *
 * @author win_64
 * @see ResultCompetionImpl
 * @see vn.gt.dao.result.model.ResultCompetion
 * @see vn.gt.dao.result.model.ResultCompetionModel
 * @generated
 */
@JSON(strict = true)
public class ResultCompetionModelImpl extends BaseModelImpl<ResultCompetion>
	implements ResultCompetionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a result competion model instance should use the {@link vn.gt.dao.result.model.ResultCompetion} interface instead.
	 */
	public static final String TABLE_NAME = "RESULT_COMPLETION";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "NameOfShip", Types.VARCHAR },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "NameOfMaster", Types.VARCHAR },
			{ "GrossTonnage", Types.DOUBLE },
			{ "PortOfArrivalCode", Types.VARCHAR },
			{ "MaritimeCode", Types.VARCHAR },
			{ "Division", Types.VARCHAR },
			{ "ApprovalName", Types.VARCHAR },
			{ "ApprovalTime", Types.TIMESTAMP },
			{ "CertificateNo", Types.VARCHAR },
			{ "ResponseStatusHQ", Types.INTEGER },
			{ "ResponseStatusBP", Types.INTEGER },
			{ "ResponseStatusYT", Types.INTEGER },
			{ "ResponseStatusDV", Types.INTEGER },
			{ "ResponseStatusTV", Types.INTEGER },
			{ "ResponseStatusCVHH", Types.INTEGER },
			{ "ResponseTimeHQ", Types.TIMESTAMP },
			{ "ResponseTimeBP", Types.TIMESTAMP },
			{ "ResponseTimeYT", Types.TIMESTAMP },
			{ "ResponseTimeDV", Types.TIMESTAMP },
			{ "ResponseTimeTV", Types.TIMESTAMP },
			{ "ResponseTimeCVHH", Types.TIMESTAMP },
			{ "ResponseHQ", Types.VARCHAR },
			{ "ResponseBP", Types.VARCHAR },
			{ "ResponseYT", Types.VARCHAR },
			{ "ResponseDV", Types.VARCHAR },
			{ "ResponseTV", Types.VARCHAR },
			{ "ResponseCVHH", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table RESULT_COMPLETION (id LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,DocumentYear INTEGER,NameOfShip VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,NameOfMaster VARCHAR(75) null,GrossTonnage DOUBLE,PortOfArrivalCode VARCHAR(75) null,MaritimeCode VARCHAR(75) null,Division VARCHAR(75) null,ApprovalName VARCHAR(75) null,ApprovalTime DATE null,CertificateNo VARCHAR(75) null,ResponseStatusHQ INTEGER,ResponseStatusBP INTEGER,ResponseStatusYT INTEGER,ResponseStatusDV INTEGER,ResponseStatusTV INTEGER,ResponseStatusCVHH INTEGER,ResponseTimeHQ DATE null,ResponseTimeBP DATE null,ResponseTimeYT DATE null,ResponseTimeDV DATE null,ResponseTimeTV DATE null,ResponseTimeCVHH DATE null,ResponseHQ VARCHAR(75) null,ResponseBP VARCHAR(75) null,ResponseYT VARCHAR(75) null,ResponseDV VARCHAR(75) null,ResponseTV VARCHAR(75) null,ResponseCVHH VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table RESULT_COMPLETION";
	public static final String ORDER_BY_JPQL = " ORDER BY resultCompetion.id DESC";
	public static final String ORDER_BY_SQL = " ORDER BY RESULT_COMPLETION.id DESC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.result.model.ResultCompetion"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.result.model.ResultCompetion"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.result.model.ResultCompetion"),
			true);
	public static long DOCUMENTNAME_COLUMN_BITMASK = 1L;
	public static long DOCUMENTYEAR_COLUMN_BITMASK = 2L;
	public static long REQUESTCODE_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ResultCompetion toModel(ResultCompetionSoap soapModel) {
		ResultCompetion model = new ResultCompetionImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setNameOfMaster(soapModel.getNameOfMaster());
		model.setGrossTonnage(soapModel.getGrossTonnage());
		model.setPortOfArrivalCode(soapModel.getPortOfArrivalCode());
		model.setMaritimeCode(soapModel.getMaritimeCode());
		model.setDivision(soapModel.getDivision());
		model.setApprovalName(soapModel.getApprovalName());
		model.setApprovalTime(soapModel.getApprovalTime());
		model.setCertificateNo(soapModel.getCertificateNo());
		model.setResponseStatusHQ(soapModel.getResponseStatusHQ());
		model.setResponseStatusBP(soapModel.getResponseStatusBP());
		model.setResponseStatusYT(soapModel.getResponseStatusYT());
		model.setResponseStatusDV(soapModel.getResponseStatusDV());
		model.setResponseStatusTV(soapModel.getResponseStatusTV());
		model.setResponseStatusCVHH(soapModel.getResponseStatusCVHH());
		model.setResponseTimeHQ(soapModel.getResponseTimeHQ());
		model.setResponseTimeBP(soapModel.getResponseTimeBP());
		model.setResponseTimeYT(soapModel.getResponseTimeYT());
		model.setResponseTimeDV(soapModel.getResponseTimeDV());
		model.setResponseTimeTV(soapModel.getResponseTimeTV());
		model.setResponseTimeCVHH(soapModel.getResponseTimeCVHH());
		model.setResponseHQ(soapModel.getResponseHQ());
		model.setResponseBP(soapModel.getResponseBP());
		model.setResponseYT(soapModel.getResponseYT());
		model.setResponseDV(soapModel.getResponseDV());
		model.setResponseTV(soapModel.getResponseTV());
		model.setResponseCVHH(soapModel.getResponseCVHH());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ResultCompetion> toModels(
		ResultCompetionSoap[] soapModels) {
		List<ResultCompetion> models = new ArrayList<ResultCompetion>(soapModels.length);

		for (ResultCompetionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.result.model.ResultCompetion"));

	public ResultCompetionModelImpl() {
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

	public Class<?> getModelClass() {
		return ResultCompetion.class;
	}

	public String getModelClassName() {
		return ResultCompetion.class.getName();
	}

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	public void setRequestCode(String requestCode) {
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	public int getRequestState() {
		return _requestState;
	}

	public void setRequestState(int requestState) {
		_requestState = requestState;
	}

	@JSON
	public long getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(long documentName) {
		_columnBitmask |= DOCUMENTNAME_COLUMN_BITMASK;

		if (!_setOriginalDocumentName) {
			_setOriginalDocumentName = true;

			_originalDocumentName = _documentName;
		}

		_documentName = documentName;
	}

	public long getOriginalDocumentName() {
		return _originalDocumentName;
	}

	@JSON
	public int getDocumentYear() {
		return _documentYear;
	}

	public void setDocumentYear(int documentYear) {
		_columnBitmask |= DOCUMENTYEAR_COLUMN_BITMASK;

		if (!_setOriginalDocumentYear) {
			_setOriginalDocumentYear = true;

			_originalDocumentYear = _documentYear;
		}

		_documentYear = documentYear;
	}

	public int getOriginalDocumentYear() {
		return _originalDocumentYear;
	}

	@JSON
	public String getNameOfShip() {
		if (_nameOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfShip;
		}
	}

	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	@JSON
	public String getFlagStateOfShip() {
		if (_flagStateOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _flagStateOfShip;
		}
	}

	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	@JSON
	public String getNameOfMaster() {
		if (_nameOfMaster == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfMaster;
		}
	}

	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	@JSON
	public double getGrossTonnage() {
		return _grossTonnage;
	}

	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;
	}

	@JSON
	public String getPortOfArrivalCode() {
		if (_portOfArrivalCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portOfArrivalCode;
		}
	}

	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	@JSON
	public String getMaritimeCode() {
		if (_maritimeCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _maritimeCode;
		}
	}

	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;
	}

	@JSON
	public String getDivision() {
		if (_division == null) {
			return StringPool.BLANK;
		}
		else {
			return _division;
		}
	}

	public void setDivision(String division) {
		_division = division;
	}

	@JSON
	public String getApprovalName() {
		if (_approvalName == null) {
			return StringPool.BLANK;
		}
		else {
			return _approvalName;
		}
	}

	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;
	}

	@JSON
	public Date getApprovalTime() {
		return _approvalTime;
	}

	public void setApprovalTime(Date approvalTime) {
		_approvalTime = approvalTime;
	}

	@JSON
	public String getCertificateNo() {
		if (_certificateNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _certificateNo;
		}
	}

	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;
	}

	@JSON
	public int getResponseStatusHQ() {
		return _responseStatusHQ;
	}

	public void setResponseStatusHQ(int responseStatusHQ) {
		_responseStatusHQ = responseStatusHQ;
	}

	@JSON
	public int getResponseStatusBP() {
		return _responseStatusBP;
	}

	public void setResponseStatusBP(int responseStatusBP) {
		_responseStatusBP = responseStatusBP;
	}

	@JSON
	public int getResponseStatusYT() {
		return _responseStatusYT;
	}

	public void setResponseStatusYT(int responseStatusYT) {
		_responseStatusYT = responseStatusYT;
	}

	@JSON
	public int getResponseStatusDV() {
		return _responseStatusDV;
	}

	public void setResponseStatusDV(int responseStatusDV) {
		_responseStatusDV = responseStatusDV;
	}

	@JSON
	public int getResponseStatusTV() {
		return _responseStatusTV;
	}

	public void setResponseStatusTV(int responseStatusTV) {
		_responseStatusTV = responseStatusTV;
	}

	@JSON
	public int getResponseStatusCVHH() {
		return _responseStatusCVHH;
	}

	public void setResponseStatusCVHH(int responseStatusCVHH) {
		_responseStatusCVHH = responseStatusCVHH;
	}

	@JSON
	public Date getResponseTimeHQ() {
		return _responseTimeHQ;
	}

	public void setResponseTimeHQ(Date responseTimeHQ) {
		_responseTimeHQ = responseTimeHQ;
	}

	@JSON
	public Date getResponseTimeBP() {
		return _responseTimeBP;
	}

	public void setResponseTimeBP(Date responseTimeBP) {
		_responseTimeBP = responseTimeBP;
	}

	@JSON
	public Date getResponseTimeYT() {
		return _responseTimeYT;
	}

	public void setResponseTimeYT(Date responseTimeYT) {
		_responseTimeYT = responseTimeYT;
	}

	@JSON
	public Date getResponseTimeDV() {
		return _responseTimeDV;
	}

	public void setResponseTimeDV(Date responseTimeDV) {
		_responseTimeDV = responseTimeDV;
	}

	@JSON
	public Date getResponseTimeTV() {
		return _responseTimeTV;
	}

	public void setResponseTimeTV(Date responseTimeTV) {
		_responseTimeTV = responseTimeTV;
	}

	@JSON
	public Date getResponseTimeCVHH() {
		return _responseTimeCVHH;
	}

	public void setResponseTimeCVHH(Date responseTimeCVHH) {
		_responseTimeCVHH = responseTimeCVHH;
	}

	@JSON
	public String getResponseHQ() {
		if (_responseHQ == null) {
			return StringPool.BLANK;
		}
		else {
			return _responseHQ;
		}
	}

	public void setResponseHQ(String responseHQ) {
		_responseHQ = responseHQ;
	}

	@JSON
	public String getResponseBP() {
		if (_responseBP == null) {
			return StringPool.BLANK;
		}
		else {
			return _responseBP;
		}
	}

	public void setResponseBP(String responseBP) {
		_responseBP = responseBP;
	}

	@JSON
	public String getResponseYT() {
		if (_responseYT == null) {
			return StringPool.BLANK;
		}
		else {
			return _responseYT;
		}
	}

	public void setResponseYT(String responseYT) {
		_responseYT = responseYT;
	}

	@JSON
	public String getResponseDV() {
		if (_responseDV == null) {
			return StringPool.BLANK;
		}
		else {
			return _responseDV;
		}
	}

	public void setResponseDV(String responseDV) {
		_responseDV = responseDV;
	}

	@JSON
	public String getResponseTV() {
		if (_responseTV == null) {
			return StringPool.BLANK;
		}
		else {
			return _responseTV;
		}
	}

	public void setResponseTV(String responseTV) {
		_responseTV = responseTV;
	}

	@JSON
	public String getResponseCVHH() {
		if (_responseCVHH == null) {
			return StringPool.BLANK;
		}
		else {
			return _responseCVHH;
		}
	}

	public void setResponseCVHH(String responseCVHH) {
		_responseCVHH = responseCVHH;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ResultCompetion toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ResultCompetion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ResultCompetion.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ResultCompetionImpl resultCompetionImpl = new ResultCompetionImpl();

		resultCompetionImpl.setId(getId());
		resultCompetionImpl.setRequestCode(getRequestCode());
		resultCompetionImpl.setRequestState(getRequestState());
		resultCompetionImpl.setDocumentName(getDocumentName());
		resultCompetionImpl.setDocumentYear(getDocumentYear());
		resultCompetionImpl.setNameOfShip(getNameOfShip());
		resultCompetionImpl.setFlagStateOfShip(getFlagStateOfShip());
		resultCompetionImpl.setNameOfMaster(getNameOfMaster());
		resultCompetionImpl.setGrossTonnage(getGrossTonnage());
		resultCompetionImpl.setPortOfArrivalCode(getPortOfArrivalCode());
		resultCompetionImpl.setMaritimeCode(getMaritimeCode());
		resultCompetionImpl.setDivision(getDivision());
		resultCompetionImpl.setApprovalName(getApprovalName());
		resultCompetionImpl.setApprovalTime(getApprovalTime());
		resultCompetionImpl.setCertificateNo(getCertificateNo());
		resultCompetionImpl.setResponseStatusHQ(getResponseStatusHQ());
		resultCompetionImpl.setResponseStatusBP(getResponseStatusBP());
		resultCompetionImpl.setResponseStatusYT(getResponseStatusYT());
		resultCompetionImpl.setResponseStatusDV(getResponseStatusDV());
		resultCompetionImpl.setResponseStatusTV(getResponseStatusTV());
		resultCompetionImpl.setResponseStatusCVHH(getResponseStatusCVHH());
		resultCompetionImpl.setResponseTimeHQ(getResponseTimeHQ());
		resultCompetionImpl.setResponseTimeBP(getResponseTimeBP());
		resultCompetionImpl.setResponseTimeYT(getResponseTimeYT());
		resultCompetionImpl.setResponseTimeDV(getResponseTimeDV());
		resultCompetionImpl.setResponseTimeTV(getResponseTimeTV());
		resultCompetionImpl.setResponseTimeCVHH(getResponseTimeCVHH());
		resultCompetionImpl.setResponseHQ(getResponseHQ());
		resultCompetionImpl.setResponseBP(getResponseBP());
		resultCompetionImpl.setResponseYT(getResponseYT());
		resultCompetionImpl.setResponseDV(getResponseDV());
		resultCompetionImpl.setResponseTV(getResponseTV());
		resultCompetionImpl.setResponseCVHH(getResponseCVHH());

		resultCompetionImpl.resetOriginalValues();

		return resultCompetionImpl;
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

		ResultCompetion resultCompetion = null;

		try {
			resultCompetion = (ResultCompetion)obj;
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
	public void resetOriginalValues() {
		ResultCompetionModelImpl resultCompetionModelImpl = this;

		resultCompetionModelImpl._originalRequestCode = resultCompetionModelImpl._requestCode;

		resultCompetionModelImpl._originalDocumentName = resultCompetionModelImpl._documentName;

		resultCompetionModelImpl._setOriginalDocumentName = false;

		resultCompetionModelImpl._originalDocumentYear = resultCompetionModelImpl._documentYear;

		resultCompetionModelImpl._setOriginalDocumentYear = false;

		resultCompetionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ResultCompetion> toCacheModel() {
		ResultCompetionCacheModel resultCompetionCacheModel = new ResultCompetionCacheModel();

		resultCompetionCacheModel.id = getId();

		resultCompetionCacheModel.requestCode = getRequestCode();

		String requestCode = resultCompetionCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			resultCompetionCacheModel.requestCode = null;
		}

		resultCompetionCacheModel.requestState = getRequestState();

		resultCompetionCacheModel.documentName = getDocumentName();

		resultCompetionCacheModel.documentYear = getDocumentYear();

		resultCompetionCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = resultCompetionCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			resultCompetionCacheModel.nameOfShip = null;
		}

		resultCompetionCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = resultCompetionCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			resultCompetionCacheModel.flagStateOfShip = null;
		}

		resultCompetionCacheModel.nameOfMaster = getNameOfMaster();

		String nameOfMaster = resultCompetionCacheModel.nameOfMaster;

		if ((nameOfMaster != null) && (nameOfMaster.length() == 0)) {
			resultCompetionCacheModel.nameOfMaster = null;
		}

		resultCompetionCacheModel.grossTonnage = getGrossTonnage();

		resultCompetionCacheModel.portOfArrivalCode = getPortOfArrivalCode();

		String portOfArrivalCode = resultCompetionCacheModel.portOfArrivalCode;

		if ((portOfArrivalCode != null) && (portOfArrivalCode.length() == 0)) {
			resultCompetionCacheModel.portOfArrivalCode = null;
		}

		resultCompetionCacheModel.maritimeCode = getMaritimeCode();

		String maritimeCode = resultCompetionCacheModel.maritimeCode;

		if ((maritimeCode != null) && (maritimeCode.length() == 0)) {
			resultCompetionCacheModel.maritimeCode = null;
		}

		resultCompetionCacheModel.division = getDivision();

		String division = resultCompetionCacheModel.division;

		if ((division != null) && (division.length() == 0)) {
			resultCompetionCacheModel.division = null;
		}

		resultCompetionCacheModel.approvalName = getApprovalName();

		String approvalName = resultCompetionCacheModel.approvalName;

		if ((approvalName != null) && (approvalName.length() == 0)) {
			resultCompetionCacheModel.approvalName = null;
		}

		Date approvalTime = getApprovalTime();

		if (approvalTime != null) {
			resultCompetionCacheModel.approvalTime = approvalTime.getTime();
		}
		else {
			resultCompetionCacheModel.approvalTime = Long.MIN_VALUE;
		}

		resultCompetionCacheModel.certificateNo = getCertificateNo();

		String certificateNo = resultCompetionCacheModel.certificateNo;

		if ((certificateNo != null) && (certificateNo.length() == 0)) {
			resultCompetionCacheModel.certificateNo = null;
		}

		resultCompetionCacheModel.responseStatusHQ = getResponseStatusHQ();

		resultCompetionCacheModel.responseStatusBP = getResponseStatusBP();

		resultCompetionCacheModel.responseStatusYT = getResponseStatusYT();

		resultCompetionCacheModel.responseStatusDV = getResponseStatusDV();

		resultCompetionCacheModel.responseStatusTV = getResponseStatusTV();

		resultCompetionCacheModel.responseStatusCVHH = getResponseStatusCVHH();

		Date responseTimeHQ = getResponseTimeHQ();

		if (responseTimeHQ != null) {
			resultCompetionCacheModel.responseTimeHQ = responseTimeHQ.getTime();
		}
		else {
			resultCompetionCacheModel.responseTimeHQ = Long.MIN_VALUE;
		}

		Date responseTimeBP = getResponseTimeBP();

		if (responseTimeBP != null) {
			resultCompetionCacheModel.responseTimeBP = responseTimeBP.getTime();
		}
		else {
			resultCompetionCacheModel.responseTimeBP = Long.MIN_VALUE;
		}

		Date responseTimeYT = getResponseTimeYT();

		if (responseTimeYT != null) {
			resultCompetionCacheModel.responseTimeYT = responseTimeYT.getTime();
		}
		else {
			resultCompetionCacheModel.responseTimeYT = Long.MIN_VALUE;
		}

		Date responseTimeDV = getResponseTimeDV();

		if (responseTimeDV != null) {
			resultCompetionCacheModel.responseTimeDV = responseTimeDV.getTime();
		}
		else {
			resultCompetionCacheModel.responseTimeDV = Long.MIN_VALUE;
		}

		Date responseTimeTV = getResponseTimeTV();

		if (responseTimeTV != null) {
			resultCompetionCacheModel.responseTimeTV = responseTimeTV.getTime();
		}
		else {
			resultCompetionCacheModel.responseTimeTV = Long.MIN_VALUE;
		}

		Date responseTimeCVHH = getResponseTimeCVHH();

		if (responseTimeCVHH != null) {
			resultCompetionCacheModel.responseTimeCVHH = responseTimeCVHH.getTime();
		}
		else {
			resultCompetionCacheModel.responseTimeCVHH = Long.MIN_VALUE;
		}

		resultCompetionCacheModel.responseHQ = getResponseHQ();

		String responseHQ = resultCompetionCacheModel.responseHQ;

		if ((responseHQ != null) && (responseHQ.length() == 0)) {
			resultCompetionCacheModel.responseHQ = null;
		}

		resultCompetionCacheModel.responseBP = getResponseBP();

		String responseBP = resultCompetionCacheModel.responseBP;

		if ((responseBP != null) && (responseBP.length() == 0)) {
			resultCompetionCacheModel.responseBP = null;
		}

		resultCompetionCacheModel.responseYT = getResponseYT();

		String responseYT = resultCompetionCacheModel.responseYT;

		if ((responseYT != null) && (responseYT.length() == 0)) {
			resultCompetionCacheModel.responseYT = null;
		}

		resultCompetionCacheModel.responseDV = getResponseDV();

		String responseDV = resultCompetionCacheModel.responseDV;

		if ((responseDV != null) && (responseDV.length() == 0)) {
			resultCompetionCacheModel.responseDV = null;
		}

		resultCompetionCacheModel.responseTV = getResponseTV();

		String responseTV = resultCompetionCacheModel.responseTV;

		if ((responseTV != null) && (responseTV.length() == 0)) {
			resultCompetionCacheModel.responseTV = null;
		}

		resultCompetionCacheModel.responseCVHH = getResponseCVHH();

		String responseCVHH = resultCompetionCacheModel.responseCVHH;

		if ((responseCVHH != null) && (responseCVHH.length() == 0)) {
			resultCompetionCacheModel.responseCVHH = null;
		}

		return resultCompetionCacheModel;
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

	private static ClassLoader _classLoader = ResultCompetion.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ResultCompetion.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
	private int _requestState;
	private long _documentName;
	private long _originalDocumentName;
	private boolean _setOriginalDocumentName;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
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
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ResultCompetion _escapedModelProxy;
}