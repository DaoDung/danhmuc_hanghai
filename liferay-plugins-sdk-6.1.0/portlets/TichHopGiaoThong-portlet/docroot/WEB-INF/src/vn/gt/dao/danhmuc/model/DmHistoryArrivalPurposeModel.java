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
 * The base model interface for the DmHistoryArrivalPurpose service. Represents a row in the &quot;DM_HISTORY_ARRIVAL_PURPOSE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.danhmuc.model.impl.DmHistoryArrivalPurposeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.danhmuc.model.impl.DmHistoryArrivalPurposeImpl}.
 * </p>
 *
 * @author win_64
 * @see DmHistoryArrivalPurpose
 * @see vn.gt.dao.danhmuc.model.impl.DmHistoryArrivalPurposeImpl
 * @see vn.gt.dao.danhmuc.model.impl.DmHistoryArrivalPurposeModelImpl
 * @generated
 */
public interface DmHistoryArrivalPurposeModel extends BaseModel<DmHistoryArrivalPurpose> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dm history arrival purpose model instance should use the {@link DmHistoryArrivalPurpose} interface instead.
	 */

	/**
	 * Returns the primary key of this dm history arrival purpose.
	 *
	 * @return the primary key of this dm history arrival purpose
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this dm history arrival purpose.
	 *
	 * @param primaryKey the primary key of this dm history arrival purpose
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this dm history arrival purpose.
	 *
	 * @return the ID of this dm history arrival purpose
	 */
	public int getId();

	/**
	 * Sets the ID of this dm history arrival purpose.
	 *
	 * @param id the ID of this dm history arrival purpose
	 */
	public void setId(int id);

	/**
	 * Returns the purpose code of this dm history arrival purpose.
	 *
	 * @return the purpose code of this dm history arrival purpose
	 */
	@AutoEscape
	public String getPurposeCode();

	/**
	 * Sets the purpose code of this dm history arrival purpose.
	 *
	 * @param purposeCode the purpose code of this dm history arrival purpose
	 */
	public void setPurposeCode(String purposeCode);

	/**
	 * Returns the purpose name of this dm history arrival purpose.
	 *
	 * @return the purpose name of this dm history arrival purpose
	 */
	@AutoEscape
	public String getPurposeName();

	/**
	 * Sets the purpose name of this dm history arrival purpose.
	 *
	 * @param purposeName the purpose name of this dm history arrival purpose
	 */
	public void setPurposeName(String purposeName);

	/**
	 * Returns the purpose name v n of this dm history arrival purpose.
	 *
	 * @return the purpose name v n of this dm history arrival purpose
	 */
	@AutoEscape
	public String getPurposeNameVN();

	/**
	 * Sets the purpose name v n of this dm history arrival purpose.
	 *
	 * @param purposeNameVN the purpose name v n of this dm history arrival purpose
	 */
	public void setPurposeNameVN(String purposeNameVN);

	/**
	 * Returns the is delete of this dm history arrival purpose.
	 *
	 * @return the is delete of this dm history arrival purpose
	 */
	public int getIsDelete();

	/**
	 * Sets the is delete of this dm history arrival purpose.
	 *
	 * @param isDelete the is delete of this dm history arrival purpose
	 */
	public void setIsDelete(int isDelete);

	/**
	 * Returns the marked as delete of this dm history arrival purpose.
	 *
	 * @return the marked as delete of this dm history arrival purpose
	 */
	public int getMarkedAsDelete();

	/**
	 * Sets the marked as delete of this dm history arrival purpose.
	 *
	 * @param markedAsDelete the marked as delete of this dm history arrival purpose
	 */
	public void setMarkedAsDelete(int markedAsDelete);

	/**
	 * Returns the modified date of this dm history arrival purpose.
	 *
	 * @return the modified date of this dm history arrival purpose
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dm history arrival purpose.
	 *
	 * @param modifiedDate the modified date of this dm history arrival purpose
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the requested date of this dm history arrival purpose.
	 *
	 * @return the requested date of this dm history arrival purpose
	 */
	public Date getRequestedDate();

	/**
	 * Sets the requested date of this dm history arrival purpose.
	 *
	 * @param requestedDate the requested date of this dm history arrival purpose
	 */
	public void setRequestedDate(Date requestedDate);

	/**
	 * Returns the sync version of this dm history arrival purpose.
	 *
	 * @return the sync version of this dm history arrival purpose
	 */
	@AutoEscape
	public String getSyncVersion();

	/**
	 * Sets the sync version of this dm history arrival purpose.
	 *
	 * @param syncVersion the sync version of this dm history arrival purpose
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

	public int compareTo(DmHistoryArrivalPurpose dmHistoryArrivalPurpose);

	public int hashCode();

	public CacheModel<DmHistoryArrivalPurpose> toCacheModel();

	public DmHistoryArrivalPurpose toEscapedModel();

	public String toString();

	public String toXmlString();
}