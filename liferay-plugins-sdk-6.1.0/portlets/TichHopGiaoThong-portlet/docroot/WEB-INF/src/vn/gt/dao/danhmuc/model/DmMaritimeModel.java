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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DmMaritime service. Represents a row in the &quot;DM_MARITIME&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.danhmuc.model.impl.DmMaritimeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl}.
 * </p>
 *
 * @author win_64
 * @see DmMaritime
 * @see vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl
 * @see vn.gt.dao.danhmuc.model.impl.DmMaritimeModelImpl
 * @generated
 */
public interface DmMaritimeModel extends BaseModel<DmMaritime> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm maritime model instance should use the {@link DmMaritime} interface instead.
	 */

	/**
	 * Returns the primary key of this dm maritime.
	 *
	 * @return the primary key of this dm maritime
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm maritime.
	 *
	 * @param primaryKey the primary key of this dm maritime
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm maritime.
	 *
	 * @return the ID of this dm maritime
	 */
	public int getId();

	/**
	 * Sets the ID of this dm maritime.
	 *
	 * @param id the ID of this dm maritime
	 */
	public void setId(int id);

	/**
	 * Returns the maritime code of this dm maritime.
	 *
	 * @return the maritime code of this dm maritime
	 */
	@AutoEscape
	public String getMaritimeCode();

	/**
	 * Sets the maritime code of this dm maritime.
	 *
	 * @param maritimeCode the maritime code of this dm maritime
	 */
	public void setMaritimeCode(String maritimeCode);

	/**
	 * Returns the maritime reference of this dm maritime.
	 *
	 * @return the maritime reference of this dm maritime
	 */
	@AutoEscape
	public String getMaritimeReference();

	/**
	 * Sets the maritime reference of this dm maritime.
	 *
	 * @param maritimeReference the maritime reference of this dm maritime
	 */
	public void setMaritimeReference(String maritimeReference);

	/**
	 * Returns the maritime order of this dm maritime.
	 *
	 * @return the maritime order of this dm maritime
	 */
	public int getMaritimeOrder();

	/**
	 * Sets the maritime order of this dm maritime.
	 *
	 * @param maritimeOrder the maritime order of this dm maritime
	 */
	public void setMaritimeOrder(int maritimeOrder);

	/**
	 * Returns the maritime name of this dm maritime.
	 *
	 * @return the maritime name of this dm maritime
	 */
	@AutoEscape
	public String getMaritimeName();

	/**
	 * Sets the maritime name of this dm maritime.
	 *
	 * @param maritimeName the maritime name of this dm maritime
	 */
	public void setMaritimeName(String maritimeName);

	/**
	 * Returns the maritime name v n of this dm maritime.
	 *
	 * @return the maritime name v n of this dm maritime
	 */
	@AutoEscape
	public String getMaritimeNameVN();

	/**
	 * Sets the maritime name v n of this dm maritime.
	 *
	 * @param maritimeNameVN the maritime name v n of this dm maritime
	 */
	public void setMaritimeNameVN(String maritimeNameVN);

	/**
	 * Returns the address of this dm maritime.
	 *
	 * @return the address of this dm maritime
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this dm maritime.
	 *
	 * @param address the address of this dm maritime
	 */
	public void setAddress(String address);

	/**
	 * Returns the address v n of this dm maritime.
	 *
	 * @return the address v n of this dm maritime
	 */
	@AutoEscape
	public String getAddressVN();

	/**
	 * Sets the address v n of this dm maritime.
	 *
	 * @param addressVN the address v n of this dm maritime
	 */
	public void setAddressVN(String addressVN);

	/**
	 * Returns the state code of this dm maritime.
	 *
	 * @return the state code of this dm maritime
	 */
	@AutoEscape
	public String getStateCode();

	/**
	 * Sets the state code of this dm maritime.
	 *
	 * @param stateCode the state code of this dm maritime
	 */
	public void setStateCode(String stateCode);

	/**
	 * Returns the citycode of this dm maritime.
	 *
	 * @return the citycode of this dm maritime
	 */
	@AutoEscape
	public String getCitycode();

	/**
	 * Sets the citycode of this dm maritime.
	 *
	 * @param citycode the citycode of this dm maritime
	 */
	public void setCitycode(String citycode);

	/**
	 * Returns the is delete of this dm maritime.
	 *
	 * @return the is delete of this dm maritime
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm maritime.
	 *
	 * @param isDelete the is delete of this dm maritime
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm maritime.
	 *
	 * @return the marked as delete of this dm maritime
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm maritime.
	 *
	 * @param markedAsDelete the marked as delete of this dm maritime
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm maritime.
	 *
	 * @return the modified date of this dm maritime
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm maritime.
	 *
	 * @param modifiedDate the modified date of this dm maritime
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm maritime.
	 *
	 * @return the requested date of this dm maritime
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm maritime.
	 *
	 * @param requestedDate the requested date of this dm maritime
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm maritime.
	 *
	 * @return the sync version of this dm maritime
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm maritime.
	 *
	 * @param syncVersion the sync version of this dm maritime
	 */
	public void setSyncVersion(String syncVersion);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(DmMaritime dmMaritime);

	public int hashCode();

	public CacheModel<DmMaritime> toCacheModel();

	public DmMaritime toEscapedModel();

	public String toString();

	public String toXmlString();
}