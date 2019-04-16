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
 * This class is a wrapper for {@link TempAttachmentDeclarationHealth}.
 * </p>
 *
 * @author    win_64
 * @see       TempAttachmentDeclarationHealth
 * @generated
 */
public class TempAttachmentDeclarationHealthWrapper
	implements TempAttachmentDeclarationHealth,
		ModelWrapper<TempAttachmentDeclarationHealth> {
	public TempAttachmentDeclarationHealthWrapper(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		_tempAttachmentDeclarationHealth = tempAttachmentDeclarationHealth;
	}

	public Class<?> getModelClass() {
		return TempAttachmentDeclarationHealth.class;
	}

	public String getModelClassName() {
		return TempAttachmentDeclarationHealth.class.getName();
	}

	/**
	* Returns the primary key of this temp attachment declaration health.
	*
	* @return the primary key of this temp attachment declaration health
	*/
	public long getPrimaryKey() {
		return _tempAttachmentDeclarationHealth.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp attachment declaration health.
	*
	* @param primaryKey the primary key of this temp attachment declaration health
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempAttachmentDeclarationHealth.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp attachment declaration health.
	*
	* @return the ID of this temp attachment declaration health
	*/
	public long getId() {
		return _tempAttachmentDeclarationHealth.getId();
	}

	/**
	* Sets the ID of this temp attachment declaration health.
	*
	* @param id the ID of this temp attachment declaration health
	*/
	public void setId(long id) {
		_tempAttachmentDeclarationHealth.setId(id);
	}

	/**
	* Returns the request code of this temp attachment declaration health.
	*
	* @return the request code of this temp attachment declaration health
	*/
	public java.lang.String getRequestCode() {
		return _tempAttachmentDeclarationHealth.getRequestCode();
	}

	/**
	* Sets the request code of this temp attachment declaration health.
	*
	* @param requestCode the request code of this temp attachment declaration health
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempAttachmentDeclarationHealth.setRequestCode(requestCode);
	}

	/**
	* Returns the attachment code of this temp attachment declaration health.
	*
	* @return the attachment code of this temp attachment declaration health
	*/
	public java.lang.String getAttachmentCode() {
		return _tempAttachmentDeclarationHealth.getAttachmentCode();
	}

	/**
	* Sets the attachment code of this temp attachment declaration health.
	*
	* @param attachmentCode the attachment code of this temp attachment declaration health
	*/
	public void setAttachmentCode(java.lang.String attachmentCode) {
		_tempAttachmentDeclarationHealth.setAttachmentCode(attachmentCode);
	}

	/**
	* Returns the passenger or crew code of this temp attachment declaration health.
	*
	* @return the passenger or crew code of this temp attachment declaration health
	*/
	public java.lang.String getPassengerOrCrewCode() {
		return _tempAttachmentDeclarationHealth.getPassengerOrCrewCode();
	}

	/**
	* Sets the passenger or crew code of this temp attachment declaration health.
	*
	* @param passengerOrCrewCode the passenger or crew code of this temp attachment declaration health
	*/
	public void setPassengerOrCrewCode(java.lang.String passengerOrCrewCode) {
		_tempAttachmentDeclarationHealth.setPassengerOrCrewCode(passengerOrCrewCode);
	}

	/**
	* Returns the name of this temp attachment declaration health.
	*
	* @return the name of this temp attachment declaration health
	*/
	public java.lang.String getName() {
		return _tempAttachmentDeclarationHealth.getName();
	}

	/**
	* Sets the name of this temp attachment declaration health.
	*
	* @param name the name of this temp attachment declaration health
	*/
	public void setName(java.lang.String name) {
		_tempAttachmentDeclarationHealth.setName(name);
	}

	/**
	* Returns the age of this temp attachment declaration health.
	*
	* @return the age of this temp attachment declaration health
	*/
	public int getAge() {
		return _tempAttachmentDeclarationHealth.getAge();
	}

	/**
	* Sets the age of this temp attachment declaration health.
	*
	* @param age the age of this temp attachment declaration health
	*/
	public void setAge(int age) {
		_tempAttachmentDeclarationHealth.setAge(age);
	}

	/**
	* Returns the sex of this temp attachment declaration health.
	*
	* @return the sex of this temp attachment declaration health
	*/
	public int getSex() {
		return _tempAttachmentDeclarationHealth.getSex();
	}

	/**
	* Sets the sex of this temp attachment declaration health.
	*
	* @param sex the sex of this temp attachment declaration health
	*/
	public void setSex(int sex) {
		_tempAttachmentDeclarationHealth.setSex(sex);
	}

	/**
	* Returns the nationality of this temp attachment declaration health.
	*
	* @return the nationality of this temp attachment declaration health
	*/
	public java.lang.String getNationality() {
		return _tempAttachmentDeclarationHealth.getNationality();
	}

	/**
	* Sets the nationality of this temp attachment declaration health.
	*
	* @param nationality the nationality of this temp attachment declaration health
	*/
	public void setNationality(java.lang.String nationality) {
		_tempAttachmentDeclarationHealth.setNationality(nationality);
	}

	/**
	* Returns the port join vessel code of this temp attachment declaration health.
	*
	* @return the port join vessel code of this temp attachment declaration health
	*/
	public java.lang.String getPortJoinVesselCode() {
		return _tempAttachmentDeclarationHealth.getPortJoinVesselCode();
	}

	/**
	* Sets the port join vessel code of this temp attachment declaration health.
	*
	* @param portJoinVesselCode the port join vessel code of this temp attachment declaration health
	*/
	public void setPortJoinVesselCode(java.lang.String portJoinVesselCode) {
		_tempAttachmentDeclarationHealth.setPortJoinVesselCode(portJoinVesselCode);
	}

	/**
	* Returns the date join vessel of this temp attachment declaration health.
	*
	* @return the date join vessel of this temp attachment declaration health
	*/
	public java.util.Date getDateJoinVessel() {
		return _tempAttachmentDeclarationHealth.getDateJoinVessel();
	}

	/**
	* Sets the date join vessel of this temp attachment declaration health.
	*
	* @param dateJoinVessel the date join vessel of this temp attachment declaration health
	*/
	public void setDateJoinVessel(java.util.Date dateJoinVessel) {
		_tempAttachmentDeclarationHealth.setDateJoinVessel(dateJoinVessel);
	}

	/**
	* Returns the class or rating of this temp attachment declaration health.
	*
	* @return the class or rating of this temp attachment declaration health
	*/
	public int getClassOrRating() {
		return _tempAttachmentDeclarationHealth.getClassOrRating();
	}

	/**
	* Sets the class or rating of this temp attachment declaration health.
	*
	* @param classOrRating the class or rating of this temp attachment declaration health
	*/
	public void setClassOrRating(int classOrRating) {
		_tempAttachmentDeclarationHealth.setClassOrRating(classOrRating);
	}

	/**
	* Returns the nature of illness of this temp attachment declaration health.
	*
	* @return the nature of illness of this temp attachment declaration health
	*/
	public java.lang.String getNatureOfIllness() {
		return _tempAttachmentDeclarationHealth.getNatureOfIllness();
	}

	/**
	* Sets the nature of illness of this temp attachment declaration health.
	*
	* @param natureOfIllness the nature of illness of this temp attachment declaration health
	*/
	public void setNatureOfIllness(java.lang.String natureOfIllness) {
		_tempAttachmentDeclarationHealth.setNatureOfIllness(natureOfIllness);
	}

	/**
	* Returns the date of onset of symptom of this temp attachment declaration health.
	*
	* @return the date of onset of symptom of this temp attachment declaration health
	*/
	public java.util.Date getDateOfOnsetOfSymptom() {
		return _tempAttachmentDeclarationHealth.getDateOfOnsetOfSymptom();
	}

	/**
	* Sets the date of onset of symptom of this temp attachment declaration health.
	*
	* @param dateOfOnsetOfSymptom the date of onset of symptom of this temp attachment declaration health
	*/
	public void setDateOfOnsetOfSymptom(java.util.Date dateOfOnsetOfSymptom) {
		_tempAttachmentDeclarationHealth.setDateOfOnsetOfSymptom(dateOfOnsetOfSymptom);
	}

	/**
	* Returns the reported medical officer of this temp attachment declaration health.
	*
	* @return the reported medical officer of this temp attachment declaration health
	*/
	public int getReportedMedicalOfficer() {
		return _tempAttachmentDeclarationHealth.getReportedMedicalOfficer();
	}

	/**
	* Sets the reported medical officer of this temp attachment declaration health.
	*
	* @param reportedMedicalOfficer the reported medical officer of this temp attachment declaration health
	*/
	public void setReportedMedicalOfficer(int reportedMedicalOfficer) {
		_tempAttachmentDeclarationHealth.setReportedMedicalOfficer(reportedMedicalOfficer);
	}

	/**
	* Returns the disposal of case of this temp attachment declaration health.
	*
	* @return the disposal of case of this temp attachment declaration health
	*/
	public java.lang.String getDisposalOfCase() {
		return _tempAttachmentDeclarationHealth.getDisposalOfCase();
	}

	/**
	* Sets the disposal of case of this temp attachment declaration health.
	*
	* @param disposalOfCase the disposal of case of this temp attachment declaration health
	*/
	public void setDisposalOfCase(java.lang.String disposalOfCase) {
		_tempAttachmentDeclarationHealth.setDisposalOfCase(disposalOfCase);
	}

	/**
	* Returns the medicines or other of this temp attachment declaration health.
	*
	* @return the medicines or other of this temp attachment declaration health
	*/
	public java.lang.String getMedicinesOrOther() {
		return _tempAttachmentDeclarationHealth.getMedicinesOrOther();
	}

	/**
	* Sets the medicines or other of this temp attachment declaration health.
	*
	* @param medicinesOrOther the medicines or other of this temp attachment declaration health
	*/
	public void setMedicinesOrOther(java.lang.String medicinesOrOther) {
		_tempAttachmentDeclarationHealth.setMedicinesOrOther(medicinesOrOther);
	}

	/**
	* Returns the comments of this temp attachment declaration health.
	*
	* @return the comments of this temp attachment declaration health
	*/
	public java.lang.String getComments() {
		return _tempAttachmentDeclarationHealth.getComments();
	}

	/**
	* Sets the comments of this temp attachment declaration health.
	*
	* @param comments the comments of this temp attachment declaration health
	*/
	public void setComments(java.lang.String comments) {
		_tempAttachmentDeclarationHealth.setComments(comments);
	}

	public boolean isNew() {
		return _tempAttachmentDeclarationHealth.isNew();
	}

	public void setNew(boolean n) {
		_tempAttachmentDeclarationHealth.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempAttachmentDeclarationHealth.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempAttachmentDeclarationHealth.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempAttachmentDeclarationHealth.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempAttachmentDeclarationHealth.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempAttachmentDeclarationHealth.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempAttachmentDeclarationHealth.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempAttachmentDeclarationHealth.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempAttachmentDeclarationHealthWrapper((TempAttachmentDeclarationHealth)_tempAttachmentDeclarationHealth.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		return _tempAttachmentDeclarationHealth.compareTo(tempAttachmentDeclarationHealth);
	}

	@Override
	public int hashCode() {
		return _tempAttachmentDeclarationHealth.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth> toCacheModel() {
		return _tempAttachmentDeclarationHealth.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth toEscapedModel() {
		return new TempAttachmentDeclarationHealthWrapper(_tempAttachmentDeclarationHealth.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempAttachmentDeclarationHealth.toString();
	}

	public java.lang.String toXmlString() {
		return _tempAttachmentDeclarationHealth.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempAttachmentDeclarationHealth.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempAttachmentDeclarationHealth getWrappedTempAttachmentDeclarationHealth() {
		return _tempAttachmentDeclarationHealth;
	}

	public TempAttachmentDeclarationHealth getWrappedModel() {
		return _tempAttachmentDeclarationHealth;
	}

	public void resetOriginalValues() {
		_tempAttachmentDeclarationHealth.resetOriginalValues();
	}

	private TempAttachmentDeclarationHealth _tempAttachmentDeclarationHealth;
}