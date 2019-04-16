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

package vn.gt.dao.result.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ResultDeclaration}.
 * </p>
 *
 * @author    win_64
 * @see       ResultDeclaration
 * @generated
 */
public class ResultDeclarationWrapper implements ResultDeclaration,
	ModelWrapper<ResultDeclaration> {
	public ResultDeclarationWrapper(ResultDeclaration resultDeclaration) {
		_resultDeclaration = resultDeclaration;
	}

	public Class<?> getModelClass() {
		return ResultDeclaration.class;
	}

	public String getModelClassName() {
		return ResultDeclaration.class.getName();
	}

	/**
	* Returns the primary key of this result declaration.
	*
	* @return the primary key of this result declaration
	*/
	public long getPrimaryKey() {
		return _resultDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this result declaration.
	*
	* @param primaryKey the primary key of this result declaration
	*/
	public void setPrimaryKey(long primaryKey) {
		_resultDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this result declaration.
	*
	* @return the ID of this result declaration
	*/
	public long getId() {
		return _resultDeclaration.getId();
	}

	/**
	* Sets the ID of this result declaration.
	*
	* @param id the ID of this result declaration
	*/
	public void setId(long id) {
		_resultDeclaration.setId(id);
	}

	/**
	* Returns the request code of this result declaration.
	*
	* @return the request code of this result declaration
	*/
	public java.lang.String getRequestCode() {
		return _resultDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this result declaration.
	*
	* @param requestCode the request code of this result declaration
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_resultDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this result declaration.
	*
	* @return the request state of this result declaration
	*/
	public int getRequestState() {
		return _resultDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this result declaration.
	*
	* @param requestState the request state of this result declaration
	*/
	public void setRequestState(int requestState) {
		_resultDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this result declaration.
	*
	* @return the document name of this result declaration
	*/
	public long getDocumentName() {
		return _resultDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this result declaration.
	*
	* @param documentName the document name of this result declaration
	*/
	public void setDocumentName(long documentName) {
		_resultDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this result declaration.
	*
	* @return the document year of this result declaration
	*/
	public int getDocumentYear() {
		return _resultDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this result declaration.
	*
	* @param documentYear the document year of this result declaration
	*/
	public void setDocumentYear(int documentYear) {
		_resultDeclaration.setDocumentYear(documentYear);
	}

	/**
	* Returns the business order of this result declaration.
	*
	* @return the business order of this result declaration
	*/
	public int getBusinessOrder() {
		return _resultDeclaration.getBusinessOrder();
	}

	/**
	* Sets the business order of this result declaration.
	*
	* @param businessOrder the business order of this result declaration
	*/
	public void setBusinessOrder(int businessOrder) {
		_resultDeclaration.setBusinessOrder(businessOrder);
	}

	/**
	* Returns the business type code of this result declaration.
	*
	* @return the business type code of this result declaration
	*/
	public int getBusinessTypeCode() {
		return _resultDeclaration.getBusinessTypeCode();
	}

	/**
	* Sets the business type code of this result declaration.
	*
	* @param businessTypeCode the business type code of this result declaration
	*/
	public void setBusinessTypeCode(int businessTypeCode) {
		_resultDeclaration.setBusinessTypeCode(businessTypeCode);
	}

	/**
	* Returns the latest send of this result declaration.
	*
	* @return the latest send of this result declaration
	*/
	public int getLatestSend() {
		return _resultDeclaration.getLatestSend();
	}

	/**
	* Sets the latest send of this result declaration.
	*
	* @param latestSend the latest send of this result declaration
	*/
	public void setLatestSend(int latestSend) {
		_resultDeclaration.setLatestSend(latestSend);
	}

	/**
	* Returns the declaration time of this result declaration.
	*
	* @return the declaration time of this result declaration
	*/
	public java.util.Date getDeclarationTime() {
		return _resultDeclaration.getDeclarationTime();
	}

	/**
	* Sets the declaration time of this result declaration.
	*
	* @param declarationTime the declaration time of this result declaration
	*/
	public void setDeclarationTime(java.util.Date declarationTime) {
		_resultDeclaration.setDeclarationTime(declarationTime);
	}

	/**
	* Returns the arrival departure time of this result declaration.
	*
	* @return the arrival departure time of this result declaration
	*/
	public java.util.Date getArrivalDepartureTime() {
		return _resultDeclaration.getArrivalDepartureTime();
	}

	/**
	* Sets the arrival departure time of this result declaration.
	*
	* @param arrivalDepartureTime the arrival departure time of this result declaration
	*/
	public void setArrivalDepartureTime(java.util.Date arrivalDepartureTime) {
		_resultDeclaration.setArrivalDepartureTime(arrivalDepartureTime);
	}

	/**
	* Returns the remaining time of this result declaration.
	*
	* @return the remaining time of this result declaration
	*/
	public java.lang.String getRemainingTime() {
		return _resultDeclaration.getRemainingTime();
	}

	/**
	* Sets the remaining time of this result declaration.
	*
	* @param remainingTime the remaining time of this result declaration
	*/
	public void setRemainingTime(java.lang.String remainingTime) {
		_resultDeclaration.setRemainingTime(remainingTime);
	}

	/**
	* Returns the remarks of this result declaration.
	*
	* @return the remarks of this result declaration
	*/
	public java.lang.String getRemarks() {
		return _resultDeclaration.getRemarks();
	}

	/**
	* Sets the remarks of this result declaration.
	*
	* @param remarks the remarks of this result declaration
	*/
	public void setRemarks(java.lang.String remarks) {
		_resultDeclaration.setRemarks(remarks);
	}

	public boolean isNew() {
		return _resultDeclaration.isNew();
	}

	public void setNew(boolean n) {
		_resultDeclaration.setNew(n);
	}

	public boolean isCachedModel() {
		return _resultDeclaration.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_resultDeclaration.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _resultDeclaration.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _resultDeclaration.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_resultDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _resultDeclaration.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_resultDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResultDeclarationWrapper((ResultDeclaration)_resultDeclaration.clone());
	}

	public int compareTo(
		vn.gt.dao.result.model.ResultDeclaration resultDeclaration) {
		return _resultDeclaration.compareTo(resultDeclaration);
	}

	@Override
	public int hashCode() {
		return _resultDeclaration.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.result.model.ResultDeclaration> toCacheModel() {
		return _resultDeclaration.toCacheModel();
	}

	public vn.gt.dao.result.model.ResultDeclaration toEscapedModel() {
		return new ResultDeclarationWrapper(_resultDeclaration.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _resultDeclaration.toString();
	}

	public java.lang.String toXmlString() {
		return _resultDeclaration.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_resultDeclaration.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public ResultDeclaration getWrappedResultDeclaration() {
		return _resultDeclaration;
	}

	public ResultDeclaration getWrappedModel() {
		return _resultDeclaration;
	}

	public void resetOriginalValues() {
		_resultDeclaration.resetOriginalValues();
	}

	private ResultDeclaration _resultDeclaration;
}