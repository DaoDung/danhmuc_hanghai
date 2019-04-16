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

package vn.gt.dao.danhmucgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DmGtRouteConfig service. Represents a row in the &quot;DM_GT_ROUTE_CONFIG&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigImpl}.
 * </p>
 *
 * @author win_64
 * @see DmGtRouteConfig
 * @see vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigImpl
 * @see vn.gt.dao.danhmucgt.model.impl.DmGtRouteConfigModelImpl
 * @generated
 */
public interface DmGtRouteConfigModel extends BaseModel<DmGtRouteConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm gt route config model instance should use the {@link DmGtRouteConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this dm gt route config.
	 *
	 * @return the primary key of this dm gt route config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dm gt route config.
	 *
	 * @param primaryKey the primary key of this dm gt route config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this dm gt route config.
	 *
	 * @return the ID of this dm gt route config
	 */
	public long getId();

	/**
	 * Sets the ID of this dm gt route config.
	 *
	 * @param id the ID of this dm gt route config
	 */
	public void setId(long id);

	/**
	 * Returns the route code of this dm gt route config.
	 *
	 * @return the route code of this dm gt route config
	 */
	@AutoEscape
	public String getRouteCode();

	/**
	 * Sets the route code of this dm gt route config.
	 *
	 * @param routeCode the route code of this dm gt route config
	 */
	public void setRouteCode(String routeCode);

	/**
	 * Returns the organization code of this dm gt route config.
	 *
	 * @return the organization code of this dm gt route config
	 */
	@AutoEscape
	public String getOrganizationCode();

	/**
	 * Sets the organization code of this dm gt route config.
	 *
	 * @param organizationCode the organization code of this dm gt route config
	 */
	public void setOrganizationCode(String organizationCode);

	/**
	 * Returns the loc code of this dm gt route config.
	 *
	 * @return the loc code of this dm gt route config
	 */
	@AutoEscape
	public String getLocCode();

	/**
	 * Sets the loc code of this dm gt route config.
	 *
	 * @param locCode the loc code of this dm gt route config
	 */
	public void setLocCode(String locCode);

	/**
	 * Returns the ip name of this dm gt route config.
	 *
	 * @return the ip name of this dm gt route config
	 */
	@AutoEscape
	public String getIpName();

	/**
	 * Sets the ip name of this dm gt route config.
	 *
	 * @param ipName the ip name of this dm gt route config
	 */
	public void setIpName(String ipName);

	/**
	 * Returns the port name of this dm gt route config.
	 *
	 * @return the port name of this dm gt route config
	 */
	@AutoEscape
	public String getPortName();

	/**
	 * Sets the port name of this dm gt route config.
	 *
	 * @param portName the port name of this dm gt route config
	 */
	public void setPortName(String portName);

	/**
	 * Returns the link address of this dm gt route config.
	 *
	 * @return the link address of this dm gt route config
	 */
	@AutoEscape
	public String getLinkAddress();

	/**
	 * Sets the link address of this dm gt route config.
	 *
	 * @param linkAddress the link address of this dm gt route config
	 */
	public void setLinkAddress(String linkAddress);

	/**
	 * Returns the is delete of this dm gt route config.
	 *
	 * @return the is delete of this dm gt route config
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm gt route config.
	 *
	 * @param isDelete the is delete of this dm gt route config
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm gt route config.
	 *
	 * @return the marked as delete of this dm gt route config
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm gt route config.
	 *
	 * @param markedAsDelete the marked as delete of this dm gt route config
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm gt route config.
	 *
	 * @return the modified date of this dm gt route config
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm gt route config.
	 *
	 * @param modifiedDate the modified date of this dm gt route config
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm gt route config.
	 *
	 * @return the requested date of this dm gt route config
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm gt route config.
	 *
	 * @param requestedDate the requested date of this dm gt route config
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm gt route config.
	 *
	 * @return the sync version of this dm gt route config
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm gt route config.
	 *
	 * @param syncVersion the sync version of this dm gt route config
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

	public int compareTo(DmGtRouteConfig dmGtRouteConfig);

	public int hashCode();

	public CacheModel<DmGtRouteConfig> toCacheModel();

	public DmGtRouteConfig toEscapedModel();

	public String toString();

	public String toXmlString();
}