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

import vn.gt.dao.danhmuc.model.DmShipAgency;
import vn.gt.dao.danhmuc.model.DmShipAgencyModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the DmShipAgency service. Represents a row in the &quot;DM_SHIP_AGENCY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.gt.dao.danhmuc.model.DmShipAgencyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmShipAgencyImpl}.
 * </p>
 *
 * @author win_64
 * @see DmShipAgencyImpl
 * @see vn.gt.dao.danhmuc.model.DmShipAgency
 * @see vn.gt.dao.danhmuc.model.DmShipAgencyModel
 * @generated
 */
public class DmShipAgencyModelImpl extends BaseModelImpl<DmShipAgency>
	implements DmShipAgencyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm ship agency model instance should use the {@link vn.gt.dao.danhmuc.model.DmShipAgency} interface instead.
	 */
	public static final String TABLE_NAME = "DM_SHIP_AGENCY";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "ShipAgencyCode", Types.VARCHAR },
			{ "ShipAgencyName", Types.VARCHAR },
			{ "ShipAgencyNameVN", Types.VARCHAR },
			{ "TaxCode", Types.VARCHAR },
			{ "StateCode", Types.VARCHAR },
			{ "CityCode", Types.VARCHAR },
			{ "Address", Types.VARCHAR },
			{ "AddressVN", Types.VARCHAR },
			{ "Phone", Types.VARCHAR },
			{ "Fax", Types.VARCHAR },
			{ "Email", Types.VARCHAR },
			{ "Description", Types.VARCHAR },
			{ "Contacter", Types.VARCHAR },
			{ "Position", Types.VARCHAR },
			{ "ContactTell", Types.VARCHAR },
			{ "IsDelete", Types.INTEGER },
			{ "MarkedAsDelete", Types.INTEGER },
			{ "ModifiedDate", Types.TIMESTAMP },
			{ "RequestedDate", Types.TIMESTAMP },
			{ "SyncVersion", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table DM_SHIP_AGENCY (id INTEGER not null primary key,ShipAgencyCode VARCHAR(75) null,ShipAgencyName VARCHAR(75) null,ShipAgencyNameVN VARCHAR(75) null,TaxCode VARCHAR(75) null,StateCode VARCHAR(75) null,CityCode VARCHAR(75) null,Address VARCHAR(75) null,AddressVN VARCHAR(75) null,Phone VARCHAR(75) null,Fax VARCHAR(75) null,Email VARCHAR(75) null,Description VARCHAR(75) null,Contacter VARCHAR(75) null,Position VARCHAR(75) null,ContactTell VARCHAR(75) null,IsDelete INTEGER,MarkedAsDelete INTEGER,ModifiedDate DATE null,RequestedDate DATE null,SyncVersion VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_SHIP_AGENCY";
	public static final String ORDER_BY_JPQL = " ORDER BY dmShipAgency.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_SHIP_AGENCY.id ASC";
	public static final String DATA_SOURCE = "gtDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gt.dao.danhmuc.model.DmShipAgency"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gt.dao.danhmuc.model.DmShipAgency"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gt.dao.danhmuc.model.DmShipAgency"),
			true);
	public static long SHIPAGENCYCODE_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.gt.dao.danhmuc.model.DmShipAgency"));

	public DmShipAgencyModelImpl() {
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
		return DmShipAgency.class;
	}

	public String getModelClassName() {
		return DmShipAgency.class.getName();
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getShipAgencyCode() {
		if (_shipAgencyCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipAgencyCode;
		}
	}

	public void setShipAgencyCode(String shipAgencyCode) {
		_columnBitmask |= SHIPAGENCYCODE_COLUMN_BITMASK;

		if (_originalShipAgencyCode == null) {
			_originalShipAgencyCode = _shipAgencyCode;
		}

		_shipAgencyCode = shipAgencyCode;
	}

	public String getOriginalShipAgencyCode() {
		return GetterUtil.getString(_originalShipAgencyCode);
	}

	public String getShipAgencyName() {
		if (_shipAgencyName == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipAgencyName;
		}
	}

	public void setShipAgencyName(String shipAgencyName) {
		_shipAgencyName = shipAgencyName;
	}

	public String getShipAgencyNameVN() {
		if (_shipAgencyNameVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _shipAgencyNameVN;
		}
	}

	public void setShipAgencyNameVN(String shipAgencyNameVN) {
		_shipAgencyNameVN = shipAgencyNameVN;
	}

	public String getTaxCode() {
		if (_taxCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _taxCode;
		}
	}

	public void setTaxCode(String taxCode) {
		_taxCode = taxCode;
	}

	public String getStateCode() {
		if (_stateCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateCode;
		}
	}

	public void setStateCode(String stateCode) {
		_stateCode = stateCode;
	}

	public String getCitycode() {
		if (_citycode == null) {
			return StringPool.BLANK;
		}
		else {
			return _citycode;
		}
	}

	public void setCitycode(String citycode) {
		_citycode = citycode;
	}

	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddressVN() {
		if (_addressVN == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressVN;
		}
	}

	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;
	}

	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getFax() {
		if (_fax == null) {
			return StringPool.BLANK;
		}
		else {
			return _fax;
		}
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getContacter() {
		if (_contacter == null) {
			return StringPool.BLANK;
		}
		else {
			return _contacter;
		}
	}

	public void setContacter(String contacter) {
		_contacter = contacter;
	}

	public String getPosition() {
		if (_position == null) {
			return StringPool.BLANK;
		}
		else {
			return _position;
		}
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getContactTell() {
		if (_contactTell == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactTell;
		}
	}

	public void setContactTell(String contactTell) {
		_contactTell = contactTell;
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
	public DmShipAgency toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (DmShipAgency)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		DmShipAgencyImpl dmShipAgencyImpl = new DmShipAgencyImpl();

		dmShipAgencyImpl.setId(getId());
		dmShipAgencyImpl.setShipAgencyCode(getShipAgencyCode());
		dmShipAgencyImpl.setShipAgencyName(getShipAgencyName());
		dmShipAgencyImpl.setShipAgencyNameVN(getShipAgencyNameVN());
		dmShipAgencyImpl.setTaxCode(getTaxCode());
		dmShipAgencyImpl.setStateCode(getStateCode());
		dmShipAgencyImpl.setCitycode(getCitycode());
		dmShipAgencyImpl.setAddress(getAddress());
		dmShipAgencyImpl.setAddressVN(getAddressVN());
		dmShipAgencyImpl.setPhone(getPhone());
		dmShipAgencyImpl.setFax(getFax());
		dmShipAgencyImpl.setEmail(getEmail());
		dmShipAgencyImpl.setDescription(getDescription());
		dmShipAgencyImpl.setContacter(getContacter());
		dmShipAgencyImpl.setPosition(getPosition());
		dmShipAgencyImpl.setContactTell(getContactTell());
		dmShipAgencyImpl.setIsDelete(getIsDelete());
		dmShipAgencyImpl.setMarkedAsDelete(getMarkedAsDelete());
		dmShipAgencyImpl.setModifiedDate(getModifiedDate());
		dmShipAgencyImpl.setRequestedDate(getRequestedDate());
		dmShipAgencyImpl.setSyncVersion(getSyncVersion());

		dmShipAgencyImpl.resetOriginalValues();

		return dmShipAgencyImpl;
	}

	public int compareTo(DmShipAgency dmShipAgency) {
		int value = 0;

		if (getId() < dmShipAgency.getId()) {
			value = -1;
		}
		else if (getId() > dmShipAgency.getId()) {
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

		DmShipAgency dmShipAgency = null;

		try {
			dmShipAgency = (DmShipAgency)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = dmShipAgency.getPrimaryKey();

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
		DmShipAgencyModelImpl dmShipAgencyModelImpl = this;

		dmShipAgencyModelImpl._originalShipAgencyCode = dmShipAgencyModelImpl._shipAgencyCode;

		dmShipAgencyModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DmShipAgency> toCacheModel() {
		DmShipAgencyCacheModel dmShipAgencyCacheModel = new DmShipAgencyCacheModel();

		dmShipAgencyCacheModel.id = getId();

		dmShipAgencyCacheModel.shipAgencyCode = getShipAgencyCode();

		String shipAgencyCode = dmShipAgencyCacheModel.shipAgencyCode;

		if ((shipAgencyCode != null) && (shipAgencyCode.length() == 0)) {
			dmShipAgencyCacheModel.shipAgencyCode = null;
		}

		dmShipAgencyCacheModel.shipAgencyName = getShipAgencyName();

		String shipAgencyName = dmShipAgencyCacheModel.shipAgencyName;

		if ((shipAgencyName != null) && (shipAgencyName.length() == 0)) {
			dmShipAgencyCacheModel.shipAgencyName = null;
		}

		dmShipAgencyCacheModel.shipAgencyNameVN = getShipAgencyNameVN();

		String shipAgencyNameVN = dmShipAgencyCacheModel.shipAgencyNameVN;

		if ((shipAgencyNameVN != null) && (shipAgencyNameVN.length() == 0)) {
			dmShipAgencyCacheModel.shipAgencyNameVN = null;
		}

		dmShipAgencyCacheModel.taxCode = getTaxCode();

		String taxCode = dmShipAgencyCacheModel.taxCode;

		if ((taxCode != null) && (taxCode.length() == 0)) {
			dmShipAgencyCacheModel.taxCode = null;
		}

		dmShipAgencyCacheModel.stateCode = getStateCode();

		String stateCode = dmShipAgencyCacheModel.stateCode;

		if ((stateCode != null) && (stateCode.length() == 0)) {
			dmShipAgencyCacheModel.stateCode = null;
		}

		dmShipAgencyCacheModel.citycode = getCitycode();

		String citycode = dmShipAgencyCacheModel.citycode;

		if ((citycode != null) && (citycode.length() == 0)) {
			dmShipAgencyCacheModel.citycode = null;
		}

		dmShipAgencyCacheModel.address = getAddress();

		String address = dmShipAgencyCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			dmShipAgencyCacheModel.address = null;
		}

		dmShipAgencyCacheModel.addressVN = getAddressVN();

		String addressVN = dmShipAgencyCacheModel.addressVN;

		if ((addressVN != null) && (addressVN.length() == 0)) {
			dmShipAgencyCacheModel.addressVN = null;
		}

		dmShipAgencyCacheModel.phone = getPhone();

		String phone = dmShipAgencyCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			dmShipAgencyCacheModel.phone = null;
		}

		dmShipAgencyCacheModel.fax = getFax();

		String fax = dmShipAgencyCacheModel.fax;

		if ((fax != null) && (fax.length() == 0)) {
			dmShipAgencyCacheModel.fax = null;
		}

		dmShipAgencyCacheModel.email = getEmail();

		String email = dmShipAgencyCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			dmShipAgencyCacheModel.email = null;
		}

		dmShipAgencyCacheModel.description = getDescription();

		String description = dmShipAgencyCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			dmShipAgencyCacheModel.description = null;
		}

		dmShipAgencyCacheModel.contacter = getContacter();

		String contacter = dmShipAgencyCacheModel.contacter;

		if ((contacter != null) && (contacter.length() == 0)) {
			dmShipAgencyCacheModel.contacter = null;
		}

		dmShipAgencyCacheModel.position = getPosition();

		String position = dmShipAgencyCacheModel.position;

		if ((position != null) && (position.length() == 0)) {
			dmShipAgencyCacheModel.position = null;
		}

		dmShipAgencyCacheModel.contactTell = getContactTell();

		String contactTell = dmShipAgencyCacheModel.contactTell;

		if ((contactTell != null) && (contactTell.length() == 0)) {
			dmShipAgencyCacheModel.contactTell = null;
		}

		dmShipAgencyCacheModel.isDelete = getIsDelete();

		dmShipAgencyCacheModel.markedAsDelete = getMarkedAsDelete();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dmShipAgencyCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dmShipAgencyCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date requestedDate = getRequestedDate();

		if (requestedDate != null) {
			dmShipAgencyCacheModel.requestedDate = requestedDate.getTime();
		}
		else {
			dmShipAgencyCacheModel.requestedDate = Long.MIN_VALUE;
		}

		dmShipAgencyCacheModel.syncVersion = getSyncVersion();

		String syncVersion = dmShipAgencyCacheModel.syncVersion;

		if ((syncVersion != null) && (syncVersion.length() == 0)) {
			dmShipAgencyCacheModel.syncVersion = null;
		}

		return dmShipAgencyCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", shipAgencyName=");
		sb.append(getShipAgencyName());
		sb.append(", shipAgencyNameVN=");
		sb.append(getShipAgencyNameVN());
		sb.append(", taxCode=");
		sb.append(getTaxCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contacter=");
		sb.append(getContacter());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", contactTell=");
		sb.append(getContactTell());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.gt.dao.danhmuc.model.DmShipAgency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyName</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyNameVN</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxCode</column-name><column-value><![CDATA[");
		sb.append(getTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contacter</column-name><column-value><![CDATA[");
		sb.append(getContacter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactTell</column-name><column-value><![CDATA[");
		sb.append(getContactTell());
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

	private static ClassLoader _classLoader = DmShipAgency.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			DmShipAgency.class
		};
	private int _id;
	private String _shipAgencyCode;
	private String _originalShipAgencyCode;
	private String _shipAgencyName;
	private String _shipAgencyNameVN;
	private String _taxCode;
	private String _stateCode;
	private String _citycode;
	private String _address;
	private String _addressVN;
	private String _phone;
	private String _fax;
	private String _email;
	private String _description;
	private String _contacter;
	private String _position;
	private String _contactTell;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private long _columnBitmask;
	private DmShipAgency _escapedModelProxy;
}