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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TempHealthCrewPassengerList service. Represents a row in the &quot;TEMP_HEALTH_CREW_PAX_LIST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListImpl}.
 * </p>
 *
 * @author win_64
 * @see TempHealthCrewPassengerList
 * @see vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListImpl
 * @see vn.gt.dao.noticeandmessage.model.impl.TempHealthCrewPassengerListModelImpl
 * @generated
 */
public interface TempHealthCrewPassengerListModel extends BaseModel<TempHealthCrewPassengerList> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp health crew passenger list model instance should use the {@link TempHealthCrewPassengerList} interface instead.
	 */

	/**
	 * Returns the primary key of this temp health crew passenger list.
	 *
	 * @return the primary key of this temp health crew passenger list
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp health crew passenger list.
	 *
	 * @param primaryKey the primary key of this temp health crew passenger list
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp health crew passenger list.
	 *
	 * @return the ID of this temp health crew passenger list
	 */
	public long getId();

	/**
	 * Sets the ID of this temp health crew passenger list.
	 *
	 * @param id the ID of this temp health crew passenger list
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp health crew passenger list.
	 *
	 * @return the request code of this temp health crew passenger list
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp health crew passenger list.
	 *
	 * @param requestCode the request code of this temp health crew passenger list
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the health crew passenger code of this temp health crew passenger list.
	 *
	 * @return the health crew passenger code of this temp health crew passenger list
	 */
	@AutoEscape
	public String getHealthCrewPassengerCode();

	/**
	 * Sets the health crew passenger code of this temp health crew passenger list.
	 *
	 * @param healthCrewPassengerCode the health crew passenger code of this temp health crew passenger list
	 */
	public void setHealthCrewPassengerCode(String healthCrewPassengerCode);

	/**
	 * Returns the passenger or crew code of this temp health crew passenger list.
	 *
	 * @return the passenger or crew code of this temp health crew passenger list
	 */
	@AutoEscape
	public String getPassengerOrCrewCode();

	/**
	 * Sets the passenger or crew code of this temp health crew passenger list.
	 *
	 * @param passengerOrCrewCode the passenger or crew code of this temp health crew passenger list
	 */
	public void setPassengerOrCrewCode(String passengerOrCrewCode);

	/**
	 * Returns the passenger or crew name of this temp health crew passenger list.
	 *
	 * @return the passenger or crew name of this temp health crew passenger list
	 */
	@AutoEscape
	public String getPassengerOrCrewName();

	/**
	 * Sets the passenger or crew name of this temp health crew passenger list.
	 *
	 * @param passengerOrCrewName the passenger or crew name of this temp health crew passenger list
	 */
	public void setPassengerOrCrewName(String passengerOrCrewName);

	/**
	 * Returns the class or rating of this temp health crew passenger list.
	 *
	 * @return the class or rating of this temp health crew passenger list
	 */
	public int getClassOrRating();

	/**
	 * Sets the class or rating of this temp health crew passenger list.
	 *
	 * @param classOrRating the class or rating of this temp health crew passenger list
	 */
	public void setClassOrRating(int classOrRating);

	/**
	 * Returns the state visited code of this temp health crew passenger list.
	 *
	 * @return the state visited code of this temp health crew passenger list
	 */
	@AutoEscape
	public String getStateVisitedCode();

	/**
	 * Sets the state visited code of this temp health crew passenger list.
	 *
	 * @param stateVisitedCode the state visited code of this temp health crew passenger list
	 */
	public void setStateVisitedCode(String stateVisitedCode);

	/**
	 * Returns the port visited code of this temp health crew passenger list.
	 *
	 * @return the port visited code of this temp health crew passenger list
	 */
	@AutoEscape
	public String getPortVisitedCode();

	/**
	 * Sets the port visited code of this temp health crew passenger list.
	 *
	 * @param portVisitedCode the port visited code of this temp health crew passenger list
	 */
	public void setPortVisitedCode(String portVisitedCode);

	/**
	 * Returns the from date of this temp health crew passenger list.
	 *
	 * @return the from date of this temp health crew passenger list
	 */
	public Date getFromDate();

	/**
	 * Sets the from date of this temp health crew passenger list.
	 *
	 * @param fromDate the from date of this temp health crew passenger list
	 */
	public void setFromDate(Date fromDate);

	/**
	 * Returns the to date of this temp health crew passenger list.
	 *
	 * @return the to date of this temp health crew passenger list
	 */
	public Date getToDate();

	/**
	 * Sets the to date of this temp health crew passenger list.
	 *
	 * @param toDate the to date of this temp health crew passenger list
	 */
	public void setToDate(Date toDate);

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

	public int compareTo(
		TempHealthCrewPassengerList tempHealthCrewPassengerList);

	public int hashCode();

	public CacheModel<TempHealthCrewPassengerList> toCacheModel();

	public TempHealthCrewPassengerList toEscapedModel();

	public String toString();

	public String toXmlString();
}