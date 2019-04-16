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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.gt.dao.danhmuc.model.DmRankRating;
import vn.gt.dao.danhmuc.model.DmRankRatingModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmRankRating service. Represents a row in the &quot;DM_RANK_RATING&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmRankRatingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmRankRatingImpl}.
 * </p>
 *
 * @author win_64
 * @see DmRankRatingImpl
 * @see vn.gt.dao.danhmuc.model.DmRankRating
 * @see vn.gt.dao.danhmuc.model.DmRankRatingModel
 * @generated
 */
public class DmRankRatingModelImpl extends BaseModelImpl<DmRankRating>
	implements DmRankRatingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm rank rating model instance should use the {@link vn.gt.dao.danhmuc.model.DmRankRating} interface instead.
	 */
	public static final String TABLE_NAME = "DM_RANK_RATING";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "RankCode", Types.VARCHAR },
			{ "RankName", Types.VARCHAR },
			{ "RankNameVN", Types.VARCHAR },
			{ "RankOrder", Types.INTEGER },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_RANK_RATING (id INTEGER not null primary key,RankCode VARCHAR(75) null,RankName VARCHAR(75) null,RankNameVN VARCHAR(75) null,RankOrder INTEGER,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_RANK_RATING";
	public static final String ORDER_BY_JPQL = " ORDER BY dmRankRating.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_RANK_RATING.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmRankRating"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmRankRating"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmRankRating"),
			true);
	public static long RANKCODE_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmRankRating"));

	public DmRankRatingModelImpl() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return DmRankRating.class;
	}

	public String getModelClassName() {
		return DmRankRating.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getRankCode() {
		if (_rankCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _rankCode;
		}
	}

	public void setRankCode(String rankCode) {
		_columnBitmask |= RANKCODE_COLUMN_BITMASK;

		if (_originalRankCode == null) {
			_originalRankCode = _rankCode;
		}

		_rankCode = rankCode;
	}

	public String getOriginalRankCode() {
		return GetterUtil.getString(_originalRankCode);
	}

	public String getRankName() {
		if (_rankName == null) {
			return StringPool.BLANK;
		}
		else {
			return _rankName;
		}
	}

	public void setRankName(String rankName) {
		_rankName = rankName;
	}

	public String getRankNameVN() {
		if (_rankNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _rankNameVN;
		}
	}

	public void setRankNameVN(String rankNameVN) {
		_rankNameVN = rankNameVN;
	}

	public int getRankOrder() {
		return _rankOrder;
	}

	public void setRankOrder(int rankOrder) {
		_rankOrder = rankOrder;
	}

	public int getIsDelete() {
		return _isDelete;
	}

	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;
	}

	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getRequestedDate() {
		return _requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;
	}

	public String getSyncVersion() {
		if (_syncVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _syncVersion;
		}
	}

	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public DmRankRating toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmRankRating)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmRankRatingImpl dmRankRatingImpl = new DmRankRatingImpl();

		dmRankRatingImpl.setId(getId());
		dmRankRatingImpl.setRankCode(getRankCode());
		dmRankRatingImpl.setRankName(getRankName());
		dmRankRatingImpl.setRankNameVN(getRankNameVN());
		dmRankRatingImpl.setRankOrder(getRankOrder());
		dmRankRatingImpl.setIsDelete(getIsDelete());
		dmRankRatingImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmRankRatingImpl.setModifiedDate(getModifiedDate());
		dmRankRatingImpl.setRequestedDate(getRequestedDate());
		dmRankRatingImpl.setSyncVersion(getSyncVersion());

		dmRankRatingImpl.resetOriginalValues();

		return dmRankRatingImpl;
	}

	public int compareTo(DmRankRating dmRankRating) {
		int value = 0;

		if (getId() < dmRankRating.getId()) {
			value = -1;
		}
		else if (getId() > dmRankRating.getId()) {
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

		DmRankRating dmRankRating = null;

		try {
			dmRankRating = (DmRankRating)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmRankRating.getPrimaryKey();

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
	public void resetOriginalValues() {
		DmRankRatingModelImpl dmRankRatingModelImpl = this;

		dmRankRatingModelImpl._originalRankCode = dmRankRatingModelImpl._rankCode;

		dmRankRatingModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmRankRating> toCacheModel() {
		DmRankRatingCacheModel dmRankRatingCacheModel = new DmRankRatingCacheModel();

		dmRankRatingCacheModel.id = getId();

		dmRankRatingCacheModel.rankCode = getRankCode();

		String rankCode = dmRankRatingCacheModel.rankCode;

		if ((rankCode != null) && (rankCode.length() == 0)) {
			dmRankRatingCacheModel.rankCode = null;
		}

		dmRankRatingCacheModel.rankName = getRankName();

		String rankName = dmRankRatingCacheModel.rankName;

		if ((rankName != null) && (rankName.length() == 0)) {
			dmRankRatingCacheModel.rankName = null;
		}

		dmRankRatingCacheModel.rankNameVN = getRankNameVN();

		String rankNameVN = dmRankRatingCacheModel.rankNameVN;

		if ((rankNameVN != null) && (rankNameVN.length() == 0)) {
			dmRankRatingCacheModel.rankNameVN = null;
		}

		dmRankRatingCacheModel.rankOrder = getRankOrder();

		dmRankRatingCacheModel.isDelete = getIsDelete();

		dmRankRatingCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmRankRatingCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmRankRatingCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmRankRatingCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmRankRatingCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmRankRatingCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmRankRatingCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmRankRatingCacheModel.syncVersion = null;
		}

		return dmRankRatingCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", rankCode=");
		sb.append(getRankCode());
		sb.append(", rankName=");
		sb.append(getRankName());
		sb.append(", rankNameVN=");
		sb.append(getRankNameVN());
		sb.append(", rankOrder=");
		sb.append(getRankOrder());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmRankRating");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankCode</column-name><column-value><![CDATA[");
		sb.append(getRankCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankName</column-name><column-value><![CDATA[");
		sb.append(getRankName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankNameVN</column-name><column-value><![CDATA[");
		sb.append(getRankNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankOrder</column-name><column-value><![CDATA[");
		sb.append(getRankOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DmRankRating.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmRankRating.class
		};
	private int _id;
	private String _rankCode;
	private String _originalRankCode;
	private String _rankName;
	private String _rankNameVN;
	private int _rankOrder;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmRankRating _escapedModelProxy;
}