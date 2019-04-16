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
 * The base model interface for the TempDangerousGoodsNanifest service. Represents a row in the &quot;TEMP_DANGEROUS_GOODS_MANIFEST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsNanifestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsNanifestImpl}.
 * </p>
 *
 * @author win_64
 * @see TempDangerousGoodsNanifest
 * @see vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsNanifestImpl
 * @see vn.gt.dao.noticeandmessage.model.impl.TempDangerousGoodsNanifestModelImpl
 * @generated
 */
public interface TempDangerousGoodsNanifestModel extends BaseModel<TempDangerousGoodsNanifest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp dangerous goods nanifest model instance should use the {@link TempDangerousGoodsNanifest} interface instead.
	 */

	/**
	 * Returns the primary key of this temp dangerous goods nanifest.
	 *
	 * @return the primary key of this temp dangerous goods nanifest
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp dangerous goods nanifest.
	 *
	 * @param primaryKey the primary key of this temp dangerous goods nanifest
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp dangerous goods nanifest.
	 *
	 * @return the ID of this temp dangerous goods nanifest
	 */
	public long getId();

	/**
	 * Sets the ID of this temp dangerous goods nanifest.
	 *
	 * @param id the ID of this temp dangerous goods nanifest
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp dangerous goods nanifest.
	 *
	 * @return the request code of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp dangerous goods nanifest.
	 *
	 * @param requestCode the request code of this temp dangerous goods nanifest
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the request state of this temp dangerous goods nanifest.
	 *
	 * @return the request state of this temp dangerous goods nanifest
	 */
	public int getRequestState();

	/**
	 * Sets the request state of this temp dangerous goods nanifest.
	 *
	 * @param requestState the request state of this temp dangerous goods nanifest
	 */
	public void setRequestState(int requestState);

	/**
	 * Returns the document name of this temp dangerous goods nanifest.
	 *
	 * @return the document name of this temp dangerous goods nanifest
	 */
	public long getDocumentName();

	/**
	 * Sets the document name of this temp dangerous goods nanifest.
	 *
	 * @param documentName the document name of this temp dangerous goods nanifest
	 */
	public void setDocumentName(long documentName);

	/**
	 * Returns the user created of this temp dangerous goods nanifest.
	 *
	 * @return the user created of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getUserCreated();

	/**
	 * Sets the user created of this temp dangerous goods nanifest.
	 *
	 * @param userCreated the user created of this temp dangerous goods nanifest
	 */
	public void setUserCreated(String userCreated);

	/**
	 * Returns the name of ship of this temp dangerous goods nanifest.
	 *
	 * @return the name of ship of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getNameOfShip();

	/**
	 * Sets the name of ship of this temp dangerous goods nanifest.
	 *
	 * @param nameOfShip the name of ship of this temp dangerous goods nanifest
	 */
	public void setNameOfShip(String nameOfShip);

	/**
	 * Returns the flag state of ship of this temp dangerous goods nanifest.
	 *
	 * @return the flag state of ship of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getFlagStateOfShip();

	/**
	 * Sets the flag state of ship of this temp dangerous goods nanifest.
	 *
	 * @param flagStateOfShip the flag state of ship of this temp dangerous goods nanifest
	 */
	public void setFlagStateOfShip(String flagStateOfShip);

	/**
	 * Returns the master name of this temp dangerous goods nanifest.
	 *
	 * @return the master name of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getMasterName();

	/**
	 * Sets the master name of this temp dangerous goods nanifest.
	 *
	 * @param masterName the master name of this temp dangerous goods nanifest
	 */
	public void setMasterName(String masterName);

	/**
	 * Returns the imo number of this temp dangerous goods nanifest.
	 *
	 * @return the imo number of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getImoNumber();

	/**
	 * Sets the imo number of this temp dangerous goods nanifest.
	 *
	 * @param imoNumber the imo number of this temp dangerous goods nanifest
	 */
	public void setImoNumber(String imoNumber);

	/**
	 * Returns the callsign of this temp dangerous goods nanifest.
	 *
	 * @return the callsign of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getCallsign();

	/**
	 * Sets the callsign of this temp dangerous goods nanifest.
	 *
	 * @param callsign the callsign of this temp dangerous goods nanifest
	 */
	public void setCallsign(String callsign);

	/**
	 * Returns the voyage number of this temp dangerous goods nanifest.
	 *
	 * @return the voyage number of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getVoyageNumber();

	/**
	 * Sets the voyage number of this temp dangerous goods nanifest.
	 *
	 * @param voyageNumber the voyage number of this temp dangerous goods nanifest
	 */
	public void setVoyageNumber(String voyageNumber);

	/**
	 * Returns the port of loading code of this temp dangerous goods nanifest.
	 *
	 * @return the port of loading code of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getPortOfLoadingCode();

	/**
	 * Sets the port of loading code of this temp dangerous goods nanifest.
	 *
	 * @param portOfLoadingCode the port of loading code of this temp dangerous goods nanifest
	 */
	public void setPortOfLoadingCode(String portOfLoadingCode);

	/**
	 * Returns the port of discharge code of this temp dangerous goods nanifest.
	 *
	 * @return the port of discharge code of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getPortOfDischargeCode();

	/**
	 * Sets the port of discharge code of this temp dangerous goods nanifest.
	 *
	 * @param portOfDischargeCode the port of discharge code of this temp dangerous goods nanifest
	 */
	public void setPortOfDischargeCode(String portOfDischargeCode);

	/**
	 * Returns the shipping agent of this temp dangerous goods nanifest.
	 *
	 * @return the shipping agent of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getShippingAgent();

	/**
	 * Sets the shipping agent of this temp dangerous goods nanifest.
	 *
	 * @param shippingAgent the shipping agent of this temp dangerous goods nanifest
	 */
	public void setShippingAgent(String shippingAgent);

	/**
	 * Returns the additional remark of this temp dangerous goods nanifest.
	 *
	 * @return the additional remark of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getAdditionalRemark();

	/**
	 * Sets the additional remark of this temp dangerous goods nanifest.
	 *
	 * @param additionalRemark the additional remark of this temp dangerous goods nanifest
	 */
	public void setAdditionalRemark(String additionalRemark);

	/**
	 * Returns the list dangerous goods of this temp dangerous goods nanifest.
	 *
	 * @return the list dangerous goods of this temp dangerous goods nanifest
	 */
	public int getListDangerousGoods();

	/**
	 * Sets the list dangerous goods of this temp dangerous goods nanifest.
	 *
	 * @param listDangerousGoods the list dangerous goods of this temp dangerous goods nanifest
	 */
	public void setListDangerousGoods(int listDangerousGoods);

	/**
	 * Returns the sign place of this temp dangerous goods nanifest.
	 *
	 * @return the sign place of this temp dangerous goods nanifest
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this temp dangerous goods nanifest.
	 *
	 * @param signPlace the sign place of this temp dangerous goods nanifest
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this temp dangerous goods nanifest.
	 *
	 * @return the sign date of this temp dangerous goods nanifest
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this temp dangerous goods nanifest.
	 *
	 * @param signDate the sign date of this temp dangerous goods nanifest
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the master signed of this temp dangerous goods nanifest.
	 *
	 * @return the master signed of this temp dangerous goods nanifest
	 */
	public int getMasterSigned();

	/**
	 * Sets the master signed of this temp dangerous goods nanifest.
	 *
	 * @param masterSigned the master signed of this temp dangerous goods nanifest
	 */
	public void setMasterSigned(int masterSigned);

	/**
	 * Returns the master signed image of this temp dangerous goods nanifest.
	 *
	 * @return the master signed image of this temp dangerous goods nanifest
	 */
	public int getMasterSignedImage();

	/**
	 * Sets the master signed image of this temp dangerous goods nanifest.
	 *
	 * @param masterSignedImage the master signed image of this temp dangerous goods nanifest
	 */
	public void setMasterSignedImage(int masterSignedImage);

	/**
	 * Returns the attached file of this temp dangerous goods nanifest.
	 *
	 * @return the attached file of this temp dangerous goods nanifest
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this temp dangerous goods nanifest.
	 *
	 * @param attachedFile the attached file of this temp dangerous goods nanifest
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the document year of this temp dangerous goods nanifest.
	 *
	 * @return the document year of this temp dangerous goods nanifest
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this temp dangerous goods nanifest.
	 *
	 * @param documentYear the document year of this temp dangerous goods nanifest
	 */
	public void setDocumentYear(int documentYear);

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

	public int compareTo(TempDangerousGoodsNanifest tempDangerousGoodsNanifest);

	public int hashCode();

	public CacheModel<TempDangerousGoodsNanifest> toCacheModel();

	public TempDangerousGoodsNanifest toEscapedModel();

	public String toString();

	public String toXmlString();
}