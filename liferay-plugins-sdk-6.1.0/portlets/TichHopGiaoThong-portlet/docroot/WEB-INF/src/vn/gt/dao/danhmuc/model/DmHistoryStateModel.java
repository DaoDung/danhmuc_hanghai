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
 * The base model interface for the DmHistoryState service. Represents a row in the &quot;dm_history_state&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.danhmuc.model.impl.DmHistoryStateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.danhmuc.model.impl.DmHistoryStateImpl}.
 * </p>
 *
 * @author win_64
 * @see DmHistoryState
 * @see vn.gt.dao.danhmuc.model.impl.DmHistoryStateImpl
 * @see vn.gt.dao.danhmuc.model.impl.DmHistoryStateModelImpl
 * @generated
 */
public interface DmHistoryStateModel extends BaseModel<DmHistoryState> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm history state model instance should use the {@link DmHistoryState} interface instead.
	 */

	/**
	 * Returns the primary key of this dm history state.
	 *
	 * @return the primary key of this dm history state
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm history state.
	 *
	 * @param primaryKey the primary key of this dm history state
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm history state.
	 *
	 * @return the ID of this dm history state
	 */
	public int getId();

	/**
	 * Sets the ID of this dm history state.
	 *
	 * @param id the ID of this dm history state
	 */
	public void setId(int id);

	/**
	 * Returns the state code of this dm history state.
	 *
	 * @return the state code of this dm history state
	 */
	@AutoEscape
	public String getStateCode();

	/**
	 * Sets the state code of this dm history state.
	 *
	 * @param stateCode the state code of this dm history state
	 */
	public void setStateCode(String stateCode);

	/**
	 * Returns the state name of this dm history state.
	 *
	 * @return the state name of this dm history state
	 */
	@AutoEscape
	public String getStateName();

	/**
	 * Sets the state name of this dm history state.
	 *
	 * @param stateName the state name of this dm history state
	 */
	public void setStateName(String stateName);

	/**
	 * Returns the description of this dm history state.
	 *
	 * @return the description of this dm history state
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dm history state.
	 *
	 * @param description the description of this dm history state
	 */
	public void setDescription(String description);

	/**
	 * Returns the is delete of this dm history state.
	 *
	 * @return the is delete of this dm history state
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm history state.
	 *
	 * @param isDelete the is delete of this dm history state
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm history state.
	 *
	 * @return the marked as delete of this dm history state
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm history state.
	 *
	 * @param markedAsDelete the marked as delete of this dm history state
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm history state.
	 *
	 * @return the modified date of this dm history state
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm history state.
	 *
	 * @param modifiedDate the modified date of this dm history state
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm history state.
	 *
	 * @return the requested date of this dm history state
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm history state.
	 *
	 * @param requestedDate the requested date of this dm history state
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm history state.
	 *
	 * @return the sync version of this dm history state
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm history state.
	 *
	 * @param syncVersion the sync version of this dm history state
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

	public int compareTo(DmHistoryState dmHistoryState);

	public int hashCode();

	public CacheModel<DmHistoryState> toCacheModel();

	public DmHistoryState toEscapedModel();

	public String toString();

	public String toXmlString();
}