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
 * This class is a wrapper for {@link IssueAcceptance}.
 * </p>
 *
 * @author    win_64
 * @see       IssueAcceptance
 * @generated
 */
public class IssueAcceptanceWrapper implements IssueAcceptance,
	ModelWrapper<IssueAcceptance> {
	public IssueAcceptanceWrapper(IssueAcceptance issueAcceptance) {
		_issueAcceptance = issueAcceptance;
	}

	public Class<?> getModelClass() {
		return IssueAcceptance.class;
	}

	public String getModelClassName() {
		return IssueAcceptance.class.getName();
	}

	/**
	* Returns the primary key of this issue acceptance.
	*
	* @return the primary key of this issue acceptance
	*/
	public long getPrimaryKey() {
		return _issueAcceptance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue acceptance.
	*
	* @param primaryKey the primary key of this issue acceptance
	*/
	public void setPrimaryKey(long primaryKey) {
		_issueAcceptance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue acceptance.
	*
	* @return the ID of this issue acceptance
	*/
	public long getId() {
		return _issueAcceptance.getId();
	}

	/**
	* Sets the ID of this issue acceptance.
	*
	* @param id the ID of this issue acceptance
	*/
	public void setId(long id) {
		_issueAcceptance.setId(id);
	}

	/**
	* Returns the request code of this issue acceptance.
	*
	* @return the request code of this issue acceptance
	*/
	public java.lang.String getRequestCode() {
		return _issueAcceptance.getRequestCode();
	}

	/**
	* Sets the request code of this issue acceptance.
	*
	* @param requestCode the request code of this issue acceptance
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_issueAcceptance.setRequestCode(requestCode);
	}

	/**
	* Returns the number port clearance of this issue acceptance.
	*
	* @return the number port clearance of this issue acceptance
	*/
	public java.lang.String getNumberPortClearance() {
		return _issueAcceptance.getNumberPortClearance();
	}

	/**
	* Sets the number port clearance of this issue acceptance.
	*
	* @param numberPortClearance the number port clearance of this issue acceptance
	*/
	public void setNumberPortClearance(java.lang.String numberPortClearance) {
		_issueAcceptance.setNumberPortClearance(numberPortClearance);
	}

	/**
	* Returns the document name of this issue acceptance.
	*
	* @return the document name of this issue acceptance
	*/
	public long getDocumentName() {
		return _issueAcceptance.getDocumentName();
	}

	/**
	* Sets the document name of this issue acceptance.
	*
	* @param documentName the document name of this issue acceptance
	*/
	public void setDocumentName(long documentName) {
		_issueAcceptance.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this issue acceptance.
	*
	* @return the document year of this issue acceptance
	*/
	public int getDocumentYear() {
		return _issueAcceptance.getDocumentYear();
	}

	/**
	* Sets the document year of this issue acceptance.
	*
	* @param documentYear the document year of this issue acceptance
	*/
	public void setDocumentYear(int documentYear) {
		_issueAcceptance.setDocumentYear(documentYear);
	}

	/**
	* Returns the portof authority of this issue acceptance.
	*
	* @return the portof authority of this issue acceptance
	*/
	public java.lang.String getPortofAuthority() {
		return _issueAcceptance.getPortofAuthority();
	}

	/**
	* Sets the portof authority of this issue acceptance.
	*
	* @param portofAuthority the portof authority of this issue acceptance
	*/
	public void setPortofAuthority(java.lang.String portofAuthority) {
		_issueAcceptance.setPortofAuthority(portofAuthority);
	}

	/**
	* Returns the name of ship of this issue acceptance.
	*
	* @return the name of ship of this issue acceptance
	*/
	public java.lang.String getNameOfShip() {
		return _issueAcceptance.getNameOfShip();
	}

	/**
	* Sets the name of ship of this issue acceptance.
	*
	* @param nameOfShip the name of ship of this issue acceptance
	*/
	public void setNameOfShip(java.lang.String nameOfShip) {
		_issueAcceptance.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this issue acceptance.
	*
	* @return the flag state of ship of this issue acceptance
	*/
	public java.lang.String getFlagStateOfShip() {
		return _issueAcceptance.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this issue acceptance.
	*
	* @param flagStateOfShip the flag state of ship of this issue acceptance
	*/
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_issueAcceptance.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the number of crews of this issue acceptance.
	*
	* @return the number of crews of this issue acceptance
	*/
	public int getNumberOfCrews() {
		return _issueAcceptance.getNumberOfCrews();
	}

	/**
	* Sets the number of crews of this issue acceptance.
	*
	* @param numberOfCrews the number of crews of this issue acceptance
	*/
	public void setNumberOfCrews(int numberOfCrews) {
		_issueAcceptance.setNumberOfCrews(numberOfCrews);
	}

	/**
	* Returns the number of passengers of this issue acceptance.
	*
	* @return the number of passengers of this issue acceptance
	*/
	public int getNumberOfPassengers() {
		return _issueAcceptance.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this issue acceptance.
	*
	* @param numberOfPassengers the number of passengers of this issue acceptance
	*/
	public void setNumberOfPassengers(int numberOfPassengers) {
		_issueAcceptance.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the call sign of this issue acceptance.
	*
	* @return the call sign of this issue acceptance
	*/
	public java.lang.String getCallSign() {
		return _issueAcceptance.getCallSign();
	}

	/**
	* Sets the call sign of this issue acceptance.
	*
	* @param callSign the call sign of this issue acceptance
	*/
	public void setCallSign(java.lang.String callSign) {
		_issueAcceptance.setCallSign(callSign);
	}

	/**
	* Returns the name of master of this issue acceptance.
	*
	* @return the name of master of this issue acceptance
	*/
	public java.lang.String getNameOfMaster() {
		return _issueAcceptance.getNameOfMaster();
	}

	/**
	* Sets the name of master of this issue acceptance.
	*
	* @param nameOfMaster the name of master of this issue acceptance
	*/
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_issueAcceptance.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the cargo of this issue acceptance.
	*
	* @return the cargo of this issue acceptance
	*/
	public java.lang.String getCargo() {
		return _issueAcceptance.getCargo();
	}

	/**
	* Sets the cargo of this issue acceptance.
	*
	* @param cargo the cargo of this issue acceptance
	*/
	public void setCargo(java.lang.String cargo) {
		_issueAcceptance.setCargo(cargo);
	}

	/**
	* Returns the volume cargo of this issue acceptance.
	*
	* @return the volume cargo of this issue acceptance
	*/
	public double getVolumeCargo() {
		return _issueAcceptance.getVolumeCargo();
	}

	/**
	* Sets the volume cargo of this issue acceptance.
	*
	* @param volumeCargo the volume cargo of this issue acceptance
	*/
	public void setVolumeCargo(double volumeCargo) {
		_issueAcceptance.setVolumeCargo(volumeCargo);
	}

	/**
	* Returns the cargo unit of this issue acceptance.
	*
	* @return the cargo unit of this issue acceptance
	*/
	public java.lang.String getCargoUnit() {
		return _issueAcceptance.getCargoUnit();
	}

	/**
	* Sets the cargo unit of this issue acceptance.
	*
	* @param cargoUnit the cargo unit of this issue acceptance
	*/
	public void setCargoUnit(java.lang.String cargoUnit) {
		_issueAcceptance.setCargoUnit(cargoUnit);
	}

	/**
	* Returns the cargo description of this issue acceptance.
	*
	* @return the cargo description of this issue acceptance
	*/
	public java.lang.String getCargoDescription() {
		return _issueAcceptance.getCargoDescription();
	}

	/**
	* Sets the cargo description of this issue acceptance.
	*
	* @param cargoDescription the cargo description of this issue acceptance
	*/
	public void setCargoDescription(java.lang.String cargoDescription) {
		_issueAcceptance.setCargoDescription(cargoDescription);
	}

	/**
	* Returns the transit cargo of this issue acceptance.
	*
	* @return the transit cargo of this issue acceptance
	*/
	public java.lang.String getTransitCargo() {
		return _issueAcceptance.getTransitCargo();
	}

	/**
	* Sets the transit cargo of this issue acceptance.
	*
	* @param transitCargo the transit cargo of this issue acceptance
	*/
	public void setTransitCargo(java.lang.String transitCargo) {
		_issueAcceptance.setTransitCargo(transitCargo);
	}

	/**
	* Returns the volume transit cargo of this issue acceptance.
	*
	* @return the volume transit cargo of this issue acceptance
	*/
	public double getVolumeTransitCargo() {
		return _issueAcceptance.getVolumeTransitCargo();
	}

	/**
	* Sets the volume transit cargo of this issue acceptance.
	*
	* @param volumeTransitCargo the volume transit cargo of this issue acceptance
	*/
	public void setVolumeTransitCargo(double volumeTransitCargo) {
		_issueAcceptance.setVolumeTransitCargo(volumeTransitCargo);
	}

	/**
	* Returns the transit cargo unit of this issue acceptance.
	*
	* @return the transit cargo unit of this issue acceptance
	*/
	public java.lang.String getTransitCargoUnit() {
		return _issueAcceptance.getTransitCargoUnit();
	}

	/**
	* Sets the transit cargo unit of this issue acceptance.
	*
	* @param transitCargoUnit the transit cargo unit of this issue acceptance
	*/
	public void setTransitCargoUnit(java.lang.String transitCargoUnit) {
		_issueAcceptance.setTransitCargoUnit(transitCargoUnit);
	}

	/**
	* Returns the time of departure of this issue acceptance.
	*
	* @return the time of departure of this issue acceptance
	*/
	public java.util.Date getTimeOfDeparture() {
		return _issueAcceptance.getTimeOfDeparture();
	}

	/**
	* Sets the time of departure of this issue acceptance.
	*
	* @param timeOfDeparture the time of departure of this issue acceptance
	*/
	public void setTimeOfDeparture(java.util.Date timeOfDeparture) {
		_issueAcceptance.setTimeOfDeparture(timeOfDeparture);
	}

	/**
	* Returns the port code of this issue acceptance.
	*
	* @return the port code of this issue acceptance
	*/
	public java.lang.String getPortCode() {
		return _issueAcceptance.getPortCode();
	}

	/**
	* Sets the port code of this issue acceptance.
	*
	* @param portCode the port code of this issue acceptance
	*/
	public void setPortCode(java.lang.String portCode) {
		_issueAcceptance.setPortCode(portCode);
	}

	/**
	* Returns the port wharf code of this issue acceptance.
	*
	* @return the port wharf code of this issue acceptance
	*/
	public java.lang.String getPortWharfCode() {
		return _issueAcceptance.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this issue acceptance.
	*
	* @param portWharfCode the port wharf code of this issue acceptance
	*/
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_issueAcceptance.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the port harbour code of this issue acceptance.
	*
	* @return the port harbour code of this issue acceptance
	*/
	public java.lang.String getPortHarbourCode() {
		return _issueAcceptance.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this issue acceptance.
	*
	* @param portHarbourCode the port harbour code of this issue acceptance
	*/
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_issueAcceptance.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the next port of call code of this issue acceptance.
	*
	* @return the next port of call code of this issue acceptance
	*/
	public java.lang.String getNextPortOfCallCode() {
		return _issueAcceptance.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this issue acceptance.
	*
	* @param nextPortOfCallCode the next port of call code of this issue acceptance
	*/
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_issueAcceptance.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the valid until of this issue acceptance.
	*
	* @return the valid until of this issue acceptance
	*/
	public java.util.Date getValidUntil() {
		return _issueAcceptance.getValidUntil();
	}

	/**
	* Sets the valid until of this issue acceptance.
	*
	* @param validUntil the valid until of this issue acceptance
	*/
	public void setValidUntil(java.util.Date validUntil) {
		_issueAcceptance.setValidUntil(validUntil);
	}

	/**
	* Returns the issue date of this issue acceptance.
	*
	* @return the issue date of this issue acceptance
	*/
	public java.util.Date getIssueDate() {
		return _issueAcceptance.getIssueDate();
	}

	/**
	* Sets the issue date of this issue acceptance.
	*
	* @param issueDate the issue date of this issue acceptance
	*/
	public void setIssueDate(java.util.Date issueDate) {
		_issueAcceptance.setIssueDate(issueDate);
	}

	/**
	* Returns the director of maritime of this issue acceptance.
	*
	* @return the director of maritime of this issue acceptance
	*/
	public java.lang.String getDirectorOfMaritime() {
		return _issueAcceptance.getDirectorOfMaritime();
	}

	/**
	* Sets the director of maritime of this issue acceptance.
	*
	* @param directorOfMaritime the director of maritime of this issue acceptance
	*/
	public void setDirectorOfMaritime(java.lang.String directorOfMaritime) {
		_issueAcceptance.setDirectorOfMaritime(directorOfMaritime);
	}

	/**
	* Returns the certificate no of this issue acceptance.
	*
	* @return the certificate no of this issue acceptance
	*/
	public java.lang.String getCertificateNo() {
		return _issueAcceptance.getCertificateNo();
	}

	/**
	* Sets the certificate no of this issue acceptance.
	*
	* @param certificateNo the certificate no of this issue acceptance
	*/
	public void setCertificateNo(java.lang.String certificateNo) {
		_issueAcceptance.setCertificateNo(certificateNo);
	}

	/**
	* Returns the request state of this issue acceptance.
	*
	* @return the request state of this issue acceptance
	*/
	public int getRequestState() {
		return _issueAcceptance.getRequestState();
	}

	/**
	* Sets the request state of this issue acceptance.
	*
	* @param requestState the request state of this issue acceptance
	*/
	public void setRequestState(int requestState) {
		_issueAcceptance.setRequestState(requestState);
	}

	/**
	* Returns the gt of this issue acceptance.
	*
	* @return the gt of this issue acceptance
	*/
	public double getGt() {
		return _issueAcceptance.getGt();
	}

	/**
	* Sets the gt of this issue acceptance.
	*
	* @param gt the gt of this issue acceptance
	*/
	public void setGt(double gt) {
		_issueAcceptance.setGt(gt);
	}

	/**
	* Returns the dwt of this issue acceptance.
	*
	* @return the dwt of this issue acceptance
	*/
	public double getDwt() {
		return _issueAcceptance.getDwt();
	}

	/**
	* Sets the dwt of this issue acceptance.
	*
	* @param dwt the dwt of this issue acceptance
	*/
	public void setDwt(double dwt) {
		_issueAcceptance.setDwt(dwt);
	}

	/**
	* Returns the version no of this issue acceptance.
	*
	* @return the version no of this issue acceptance
	*/
	public java.lang.String getVersionNo() {
		return _issueAcceptance.getVersionNo();
	}

	/**
	* Sets the version no of this issue acceptance.
	*
	* @param versionNo the version no of this issue acceptance
	*/
	public void setVersionNo(java.lang.String versionNo) {
		_issueAcceptance.setVersionNo(versionNo);
	}

	/**
	* Returns the is approval of this issue acceptance.
	*
	* @return the is approval of this issue acceptance
	*/
	public int getIsApproval() {
		return _issueAcceptance.getIsApproval();
	}

	/**
	* Sets the is approval of this issue acceptance.
	*
	* @param isApproval the is approval of this issue acceptance
	*/
	public void setIsApproval(int isApproval) {
		_issueAcceptance.setIsApproval(isApproval);
	}

	/**
	* Returns the approval date of this issue acceptance.
	*
	* @return the approval date of this issue acceptance
	*/
	public java.util.Date getApprovalDate() {
		return _issueAcceptance.getApprovalDate();
	}

	/**
	* Sets the approval date of this issue acceptance.
	*
	* @param approvalDate the approval date of this issue acceptance
	*/
	public void setApprovalDate(java.util.Date approvalDate) {
		_issueAcceptance.setApprovalDate(approvalDate);
	}

	/**
	* Returns the approval name of this issue acceptance.
	*
	* @return the approval name of this issue acceptance
	*/
	public java.lang.String getApprovalName() {
		return _issueAcceptance.getApprovalName();
	}

	/**
	* Sets the approval name of this issue acceptance.
	*
	* @param approvalName the approval name of this issue acceptance
	*/
	public void setApprovalName(java.lang.String approvalName) {
		_issueAcceptance.setApprovalName(approvalName);
	}

	/**
	* Returns the remarks of this issue acceptance.
	*
	* @return the remarks of this issue acceptance
	*/
	public java.lang.String getRemarks() {
		return _issueAcceptance.getRemarks();
	}

	/**
	* Sets the remarks of this issue acceptance.
	*
	* @param remarks the remarks of this issue acceptance
	*/
	public void setRemarks(java.lang.String remarks) {
		_issueAcceptance.setRemarks(remarks);
	}

	/**
	* Returns the is cancel of this issue acceptance.
	*
	* @return the is cancel of this issue acceptance
	*/
	public int getIsCancel() {
		return _issueAcceptance.getIsCancel();
	}

	/**
	* Sets the is cancel of this issue acceptance.
	*
	* @param isCancel the is cancel of this issue acceptance
	*/
	public void setIsCancel(int isCancel) {
		_issueAcceptance.setIsCancel(isCancel);
	}

	/**
	* Returns the cancel date of this issue acceptance.
	*
	* @return the cancel date of this issue acceptance
	*/
	public java.util.Date getCancelDate() {
		return _issueAcceptance.getCancelDate();
	}

	/**
	* Sets the cancel date of this issue acceptance.
	*
	* @param cancelDate the cancel date of this issue acceptance
	*/
	public void setCancelDate(java.util.Date cancelDate) {
		_issueAcceptance.setCancelDate(cancelDate);
	}

	/**
	* Returns the cancel name of this issue acceptance.
	*
	* @return the cancel name of this issue acceptance
	*/
	public java.lang.String getCancelName() {
		return _issueAcceptance.getCancelName();
	}

	/**
	* Sets the cancel name of this issue acceptance.
	*
	* @param cancelName the cancel name of this issue acceptance
	*/
	public void setCancelName(java.lang.String cancelName) {
		_issueAcceptance.setCancelName(cancelName);
	}

	/**
	* Returns the cancel note of this issue acceptance.
	*
	* @return the cancel note of this issue acceptance
	*/
	public java.lang.String getCancelNote() {
		return _issueAcceptance.getCancelNote();
	}

	/**
	* Sets the cancel note of this issue acceptance.
	*
	* @param cancelNote the cancel note of this issue acceptance
	*/
	public void setCancelNote(java.lang.String cancelNote) {
		_issueAcceptance.setCancelNote(cancelNote);
	}

	/**
	* Returns the representative of this issue acceptance.
	*
	* @return the representative of this issue acceptance
	*/
	public java.lang.String getRepresentative() {
		return _issueAcceptance.getRepresentative();
	}

	/**
	* Sets the representative of this issue acceptance.
	*
	* @param representative the representative of this issue acceptance
	*/
	public void setRepresentative(java.lang.String representative) {
		_issueAcceptance.setRepresentative(representative);
	}

	/**
	* Returns the sign date of this issue acceptance.
	*
	* @return the sign date of this issue acceptance
	*/
	public java.util.Date getSignDate() {
		return _issueAcceptance.getSignDate();
	}

	/**
	* Sets the sign date of this issue acceptance.
	*
	* @param signDate the sign date of this issue acceptance
	*/
	public void setSignDate(java.util.Date signDate) {
		_issueAcceptance.setSignDate(signDate);
	}

	/**
	* Returns the sign name of this issue acceptance.
	*
	* @return the sign name of this issue acceptance
	*/
	public java.lang.String getSignName() {
		return _issueAcceptance.getSignName();
	}

	/**
	* Sets the sign name of this issue acceptance.
	*
	* @param signName the sign name of this issue acceptance
	*/
	public void setSignName(java.lang.String signName) {
		_issueAcceptance.setSignName(signName);
	}

	/**
	* Returns the sign title of this issue acceptance.
	*
	* @return the sign title of this issue acceptance
	*/
	public java.lang.String getSignTitle() {
		return _issueAcceptance.getSignTitle();
	}

	/**
	* Sets the sign title of this issue acceptance.
	*
	* @param signTitle the sign title of this issue acceptance
	*/
	public void setSignTitle(java.lang.String signTitle) {
		_issueAcceptance.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this issue acceptance.
	*
	* @return the sign place of this issue acceptance
	*/
	public java.lang.String getSignPlace() {
		return _issueAcceptance.getSignPlace();
	}

	/**
	* Sets the sign place of this issue acceptance.
	*
	* @param signPlace the sign place of this issue acceptance
	*/
	public void setSignPlace(java.lang.String signPlace) {
		_issueAcceptance.setSignPlace(signPlace);
	}

	/**
	* Returns the stamp status of this issue acceptance.
	*
	* @return the stamp status of this issue acceptance
	*/
	public long getStampStatus() {
		return _issueAcceptance.getStampStatus();
	}

	/**
	* Sets the stamp status of this issue acceptance.
	*
	* @param stampStatus the stamp status of this issue acceptance
	*/
	public void setStampStatus(long stampStatus) {
		_issueAcceptance.setStampStatus(stampStatus);
	}

	/**
	* Returns the attached file of this issue acceptance.
	*
	* @return the attached file of this issue acceptance
	*/
	public long getAttachedFile() {
		return _issueAcceptance.getAttachedFile();
	}

	/**
	* Sets the attached file of this issue acceptance.
	*
	* @param attachedFile the attached file of this issue acceptance
	*/
	public void setAttachedFile(long attachedFile) {
		_issueAcceptance.setAttachedFile(attachedFile);
	}

	public boolean isNew() {
		return _issueAcceptance.isNew();
	}

	public void setNew(boolean n) {
		_issueAcceptance.setNew(n);
	}

	public boolean isCachedModel() {
		return _issueAcceptance.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_issueAcceptance.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _issueAcceptance.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _issueAcceptance.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issueAcceptance.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issueAcceptance.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issueAcceptance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssueAcceptanceWrapper((IssueAcceptance)_issueAcceptance.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.IssueAcceptance issueAcceptance) {
		return _issueAcceptance.compareTo(issueAcceptance);
	}

	@Override
	public int hashCode() {
		return _issueAcceptance.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.IssueAcceptance> toCacheModel() {
		return _issueAcceptance.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.IssueAcceptance toEscapedModel() {
		return new IssueAcceptanceWrapper(_issueAcceptance.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issueAcceptance.toString();
	}

	public java.lang.String toXmlString() {
		return _issueAcceptance.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueAcceptance.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public IssueAcceptance getWrappedIssueAcceptance() {
		return _issueAcceptance;
	}

	public IssueAcceptance getWrappedModel() {
		return _issueAcceptance;
	}

	public void resetOriginalValues() {
		_issueAcceptance.resetOriginalValues();
	}

	private IssueAcceptance _issueAcceptance;
}