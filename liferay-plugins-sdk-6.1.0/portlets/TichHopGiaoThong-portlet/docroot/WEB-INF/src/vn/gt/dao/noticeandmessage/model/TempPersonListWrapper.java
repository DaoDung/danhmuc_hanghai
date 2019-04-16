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

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link TempPersonList}.
 * </p>
 *
 * @author    win_64
 * @see       TempPersonList
 * @generated
 */
public class TempPersonListWrapper implements TempPersonList,
	ModelWrapper<TempPersonList> {
	public TempPersonListWrapper(TempPersonList tempPersonList) {
		_tempPersonList = tempPersonList;
	}

	public Class<?> getModelClass() {
		return TempPersonList.class;
	}

	public String getModelClassName() {
		return TempPersonList.class.getName();
	}

	/**
	* Returns the primary key of this temp person list.
	*
	* @return the primary key of this temp person list
	*/
	public long getPrimaryKey() {
		return _tempPersonList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp person list.
	*
	* @param primaryKey the primary key of this temp person list
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempPersonList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp person list.
	*
	* @return the ID of this temp person list
	*/
	public long getId() {
		return _tempPersonList.getId();
	}

	/**
	* Sets the ID of this temp person list.
	*
	* @param id the ID of this temp person list
	*/
	public void setId(long id) {
		_tempPersonList.setId(id);
	}

	/**
	* Returns the request code of this temp person list.
	*
	* @return the request code of this temp person list
	*/
	public java.lang.String getRequestCode() {
		return _tempPersonList.getRequestCode();
	}

	/**
	* Sets the request code of this temp person list.
	*
	* @param requestCode the request code of this temp person list
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempPersonList.setRequestCode(requestCode);
	}

	/**
	* Returns the document name of this temp person list.
	*
	* @return the document name of this temp person list
	*/
	public long getDocumentName() {
		return _tempPersonList.getDocumentName();
	}

	/**
	* Sets the document name of this temp person list.
	*
	* @param documentName the document name of this temp person list
	*/
	public void setDocumentName(long documentName) {
		_tempPersonList.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp person list.
	*
	* @return the document year of this temp person list
	*/
	public int getDocumentYear() {
		return _tempPersonList.getDocumentYear();
	}

	/**
	* Sets the document year of this temp person list.
	*
	* @param documentYear the document year of this temp person list
	*/
	public void setDocumentYear(int documentYear) {
		_tempPersonList.setDocumentYear(documentYear);
	}

	/**
	* Returns the name of this temp person list.
	*
	* @return the name of this temp person list
	*/
	public java.lang.String getName() {
		return _tempPersonList.getName();
	}

	/**
	* Sets the name of this temp person list.
	*
	* @param name the name of this temp person list
	*/
	public void setName(java.lang.String name) {
		_tempPersonList.setName(name);
	}

	/**
	* Returns the age of this temp person list.
	*
	* @return the age of this temp person list
	*/
	public java.lang.String getAge() {
		return _tempPersonList.getAge();
	}

	/**
	* Sets the age of this temp person list.
	*
	* @param age the age of this temp person list
	*/
	public void setAge(java.lang.String age) {
		_tempPersonList.setAge(age);
	}

	/**
	* Returns the national code of this temp person list.
	*
	* @return the national code of this temp person list
	*/
	public java.lang.String getNationalCode() {
		return _tempPersonList.getNationalCode();
	}

	/**
	* Sets the national code of this temp person list.
	*
	* @param nationalCode the national code of this temp person list
	*/
	public void setNationalCode(java.lang.String nationalCode) {
		_tempPersonList.setNationalCode(nationalCode);
	}

	/**
	* Returns the national name of this temp person list.
	*
	* @return the national name of this temp person list
	*/
	public java.lang.String getNationalName() {
		return _tempPersonList.getNationalName();
	}

	/**
	* Sets the national name of this temp person list.
	*
	* @param nationalName the national name of this temp person list
	*/
	public void setNationalName(java.lang.String nationalName) {
		_tempPersonList.setNationalName(nationalName);
	}

	/**
	* Returns the ilness status of this temp person list.
	*
	* @return the ilness status of this temp person list
	*/
	public java.lang.String getIlnessStatus() {
		return _tempPersonList.getIlnessStatus();
	}

	/**
	* Sets the ilness status of this temp person list.
	*
	* @param ilnessStatus the ilness status of this temp person list
	*/
	public void setIlnessStatus(java.lang.String ilnessStatus) {
		_tempPersonList.setIlnessStatus(ilnessStatus);
	}

	/**
	* Returns the reason of dead of this temp person list.
	*
	* @return the reason of dead of this temp person list
	*/
	public java.lang.String getReasonOfDead() {
		return _tempPersonList.getReasonOfDead();
	}

	/**
	* Sets the reason of dead of this temp person list.
	*
	* @param reasonOfDead the reason of dead of this temp person list
	*/
	public void setReasonOfDead(java.lang.String reasonOfDead) {
		_tempPersonList.setReasonOfDead(reasonOfDead);
	}

	/**
	* Returns the person type of this temp person list.
	*
	* @return the person type of this temp person list
	*/
	public int getPersonType() {
		return _tempPersonList.getPersonType();
	}

	/**
	* Sets the person type of this temp person list.
	*
	* @param personType the person type of this temp person list
	*/
	public void setPersonType(int personType) {
		_tempPersonList.setPersonType(personType);
	}

	public boolean isNew() {
		return _tempPersonList.isNew();
	}

	public void setNew(boolean n) {
		_tempPersonList.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempPersonList.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempPersonList.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempPersonList.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempPersonList.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempPersonList.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempPersonList.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempPersonList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempPersonListWrapper((TempPersonList)_tempPersonList.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempPersonList tempPersonList) {
		return _tempPersonList.compareTo(tempPersonList);
	}

	@Override
	public int hashCode() {
		return _tempPersonList.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempPersonList> toCacheModel() {
		return _tempPersonList.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempPersonList toEscapedModel() {
		return new TempPersonListWrapper(_tempPersonList.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempPersonList.toString();
	}

	public java.lang.String toXmlString() {
		return _tempPersonList.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempPersonList.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempPersonList getWrappedTempPersonList() {
		return _tempPersonList;
	}

	public TempPersonList getWrappedModel() {
		return _tempPersonList;
	}

	public void resetOriginalValues() {
		_tempPersonList.resetOriginalValues();
	}

	private TempPersonList _tempPersonList;
}