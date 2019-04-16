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
 * This class is a wrapper for {@link TempHealthQuestion}.
 * </p>
 *
 * @author    win_64
 * @see       TempHealthQuestion
 * @generated
 */
public class TempHealthQuestionWrapper implements TempHealthQuestion,
	ModelWrapper<TempHealthQuestion> {
	public TempHealthQuestionWrapper(TempHealthQuestion tempHealthQuestion) {
		_tempHealthQuestion = tempHealthQuestion;
	}

	public Class<?> getModelClass() {
		return TempHealthQuestion.class;
	}

	public String getModelClassName() {
		return TempHealthQuestion.class.getName();
	}

	/**
	* Returns the primary key of this temp health question.
	*
	* @return the primary key of this temp health question
	*/
	public long getPrimaryKey() {
		return _tempHealthQuestion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp health question.
	*
	* @param primaryKey the primary key of this temp health question
	*/
	public void setPrimaryKey(long primaryKey) {
		_tempHealthQuestion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp health question.
	*
	* @return the ID of this temp health question
	*/
	public long getId() {
		return _tempHealthQuestion.getId();
	}

	/**
	* Sets the ID of this temp health question.
	*
	* @param id the ID of this temp health question
	*/
	public void setId(long id) {
		_tempHealthQuestion.setId(id);
	}

	/**
	* Returns the request code of this temp health question.
	*
	* @return the request code of this temp health question
	*/
	public java.lang.String getRequestCode() {
		return _tempHealthQuestion.getRequestCode();
	}

	/**
	* Sets the request code of this temp health question.
	*
	* @param requestCode the request code of this temp health question
	*/
	public void setRequestCode(java.lang.String requestCode) {
		_tempHealthQuestion.setRequestCode(requestCode);
	}

	/**
	* Returns the health question code of this temp health question.
	*
	* @return the health question code of this temp health question
	*/
	public java.lang.String getHealthQuestionCode() {
		return _tempHealthQuestion.getHealthQuestionCode();
	}

	/**
	* Sets the health question code of this temp health question.
	*
	* @param healthQuestionCode the health question code of this temp health question
	*/
	public void setHealthQuestionCode(java.lang.String healthQuestionCode) {
		_tempHealthQuestion.setHealthQuestionCode(healthQuestionCode);
	}

	/**
	* Returns the person died of this temp health question.
	*
	* @return the person died of this temp health question
	*/
	public int getPersonDied() {
		return _tempHealthQuestion.getPersonDied();
	}

	/**
	* Sets the person died of this temp health question.
	*
	* @param personDied the person died of this temp health question
	*/
	public void setPersonDied(int personDied) {
		_tempHealthQuestion.setPersonDied(personDied);
	}

	/**
	* Returns the person died no of this temp health question.
	*
	* @return the person died no of this temp health question
	*/
	public int getPersonDiedNo() {
		return _tempHealthQuestion.getPersonDiedNo();
	}

	/**
	* Sets the person died no of this temp health question.
	*
	* @param personDiedNo the person died no of this temp health question
	*/
	public void setPersonDiedNo(int personDiedNo) {
		_tempHealthQuestion.setPersonDiedNo(personDiedNo);
	}

	/**
	* Returns the person died report of this temp health question.
	*
	* @return the person died report of this temp health question
	*/
	public java.lang.String getPersonDiedReport() {
		return _tempHealthQuestion.getPersonDiedReport();
	}

	/**
	* Sets the person died report of this temp health question.
	*
	* @param personDiedReport the person died report of this temp health question
	*/
	public void setPersonDiedReport(java.lang.String personDiedReport) {
		_tempHealthQuestion.setPersonDiedReport(personDiedReport);
	}

	/**
	* Returns the isinfectious of this temp health question.
	*
	* @return the isinfectious of this temp health question
	*/
	public int getIsinfectious() {
		return _tempHealthQuestion.getIsinfectious();
	}

	/**
	* Sets the isinfectious of this temp health question.
	*
	* @param isinfectious the isinfectious of this temp health question
	*/
	public void setIsinfectious(int isinfectious) {
		_tempHealthQuestion.setIsinfectious(isinfectious);
	}

	/**
	* Returns the infectious report of this temp health question.
	*
	* @return the infectious report of this temp health question
	*/
	public java.lang.String getInfectiousReport() {
		return _tempHealthQuestion.getInfectiousReport();
	}

	/**
	* Sets the infectious report of this temp health question.
	*
	* @param infectiousReport the infectious report of this temp health question
	*/
	public void setInfectiousReport(java.lang.String infectiousReport) {
		_tempHealthQuestion.setInfectiousReport(infectiousReport);
	}

	/**
	* Returns the ill passengers greater nomal of this temp health question.
	*
	* @return the ill passengers greater nomal of this temp health question
	*/
	public int getIllPassengersGreaterNomal() {
		return _tempHealthQuestion.getIllPassengersGreaterNomal();
	}

	/**
	* Sets the ill passengers greater nomal of this temp health question.
	*
	* @param illPassengersGreaterNomal the ill passengers greater nomal of this temp health question
	*/
	public void setIllPassengersGreaterNomal(int illPassengersGreaterNomal) {
		_tempHealthQuestion.setIllPassengersGreaterNomal(illPassengersGreaterNomal);
	}

	/**
	* Returns the ill passengers no of this temp health question.
	*
	* @return the ill passengers no of this temp health question
	*/
	public int getIllPassengersNo() {
		return _tempHealthQuestion.getIllPassengersNo();
	}

	/**
	* Sets the ill passengers no of this temp health question.
	*
	* @param illPassengersNo the ill passengers no of this temp health question
	*/
	public void setIllPassengersNo(int illPassengersNo) {
		_tempHealthQuestion.setIllPassengersNo(illPassengersNo);
	}

	/**
	* Returns the ill persons on board of this temp health question.
	*
	* @return the ill persons on board of this temp health question
	*/
	public int getIllPersonsOnBoard() {
		return _tempHealthQuestion.getIllPersonsOnBoard();
	}

	/**
	* Sets the ill persons on board of this temp health question.
	*
	* @param illPersonsOnBoard the ill persons on board of this temp health question
	*/
	public void setIllPersonsOnBoard(int illPersonsOnBoard) {
		_tempHealthQuestion.setIllPersonsOnBoard(illPersonsOnBoard);
	}

	/**
	* Returns the ill persons report of this temp health question.
	*
	* @return the ill persons report of this temp health question
	*/
	public int getIllPersonsReport() {
		return _tempHealthQuestion.getIllPersonsReport();
	}

	/**
	* Sets the ill persons report of this temp health question.
	*
	* @param illPersonsReport the ill persons report of this temp health question
	*/
	public void setIllPersonsReport(int illPersonsReport) {
		_tempHealthQuestion.setIllPersonsReport(illPersonsReport);
	}

	/**
	* Returns the medical practitioner consulted of this temp health question.
	*
	* @return the medical practitioner consulted of this temp health question
	*/
	public int getMedicalPractitionerConsulted() {
		return _tempHealthQuestion.getMedicalPractitionerConsulted();
	}

	/**
	* Sets the medical practitioner consulted of this temp health question.
	*
	* @param medicalPractitionerConsulted the medical practitioner consulted of this temp health question
	*/
	public void setMedicalPractitionerConsulted(
		int medicalPractitionerConsulted) {
		_tempHealthQuestion.setMedicalPractitionerConsulted(medicalPractitionerConsulted);
	}

	/**
	* Returns the medical treatment or advice of this temp health question.
	*
	* @return the medical treatment or advice of this temp health question
	*/
	public java.lang.String getMedicalTreatmentOrAdvice() {
		return _tempHealthQuestion.getMedicalTreatmentOrAdvice();
	}

	/**
	* Sets the medical treatment or advice of this temp health question.
	*
	* @param medicalTreatmentOrAdvice the medical treatment or advice of this temp health question
	*/
	public void setMedicalTreatmentOrAdvice(
		java.lang.String medicalTreatmentOrAdvice) {
		_tempHealthQuestion.setMedicalTreatmentOrAdvice(medicalTreatmentOrAdvice);
	}

	/**
	* Returns the infection or spread of disease of this temp health question.
	*
	* @return the infection or spread of disease of this temp health question
	*/
	public int getInfectionOrSpreadOfDisease() {
		return _tempHealthQuestion.getInfectionOrSpreadOfDisease();
	}

	/**
	* Sets the infection or spread of disease of this temp health question.
	*
	* @param infectionOrSpreadOfDisease the infection or spread of disease of this temp health question
	*/
	public void setInfectionOrSpreadOfDisease(int infectionOrSpreadOfDisease) {
		_tempHealthQuestion.setInfectionOrSpreadOfDisease(infectionOrSpreadOfDisease);
	}

	/**
	* Returns the infections report of this temp health question.
	*
	* @return the infections report of this temp health question
	*/
	public java.lang.String getInfectionsReport() {
		return _tempHealthQuestion.getInfectionsReport();
	}

	/**
	* Sets the infections report of this temp health question.
	*
	* @param infectionsReport the infections report of this temp health question
	*/
	public void setInfectionsReport(java.lang.String infectionsReport) {
		_tempHealthQuestion.setInfectionsReport(infectionsReport);
	}

	/**
	* Returns the is sanitary of this temp health question.
	*
	* @return the is sanitary of this temp health question
	*/
	public int getIsSanitary() {
		return _tempHealthQuestion.getIsSanitary();
	}

	/**
	* Sets the is sanitary of this temp health question.
	*
	* @param isSanitary the is sanitary of this temp health question
	*/
	public void setIsSanitary(int isSanitary) {
		_tempHealthQuestion.setIsSanitary(isSanitary);
	}

	/**
	* Returns the sanitary des of this temp health question.
	*
	* @return the sanitary des of this temp health question
	*/
	public java.lang.String getSanitaryDes() {
		return _tempHealthQuestion.getSanitaryDes();
	}

	/**
	* Sets the sanitary des of this temp health question.
	*
	* @param sanitaryDes the sanitary des of this temp health question
	*/
	public void setSanitaryDes(java.lang.String sanitaryDes) {
		_tempHealthQuestion.setSanitaryDes(sanitaryDes);
	}

	/**
	* Returns the is stowaways of this temp health question.
	*
	* @return the is stowaways of this temp health question
	*/
	public int getIsStowaways() {
		return _tempHealthQuestion.getIsStowaways();
	}

	/**
	* Sets the is stowaways of this temp health question.
	*
	* @param isStowaways the is stowaways of this temp health question
	*/
	public void setIsStowaways(int isStowaways) {
		_tempHealthQuestion.setIsStowaways(isStowaways);
	}

	/**
	* Returns the join ship of this temp health question.
	*
	* @return the join ship of this temp health question
	*/
	public java.lang.String getJoinShip() {
		return _tempHealthQuestion.getJoinShip();
	}

	/**
	* Sets the join ship of this temp health question.
	*
	* @param joinShip the join ship of this temp health question
	*/
	public void setJoinShip(java.lang.String joinShip) {
		_tempHealthQuestion.setJoinShip(joinShip);
	}

	/**
	* Returns the is animal of this temp health question.
	*
	* @return the is animal of this temp health question
	*/
	public int getIsAnimal() {
		return _tempHealthQuestion.getIsAnimal();
	}

	/**
	* Sets the is animal of this temp health question.
	*
	* @param isAnimal the is animal of this temp health question
	*/
	public void setIsAnimal(int isAnimal) {
		_tempHealthQuestion.setIsAnimal(isAnimal);
	}

	public boolean isNew() {
		return _tempHealthQuestion.isNew();
	}

	public void setNew(boolean n) {
		_tempHealthQuestion.setNew(n);
	}

	public boolean isCachedModel() {
		return _tempHealthQuestion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tempHealthQuestion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tempHealthQuestion.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tempHealthQuestion.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempHealthQuestion.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempHealthQuestion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempHealthQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempHealthQuestionWrapper((TempHealthQuestion)_tempHealthQuestion.clone());
	}

	public int compareTo(
		vn.gt.dao.noticeandmessage.model.TempHealthQuestion tempHealthQuestion) {
		return _tempHealthQuestion.compareTo(tempHealthQuestion);
	}

	@Override
	public int hashCode() {
		return _tempHealthQuestion.hashCode();
	}

	public com.liferay.portal.model.CacheModel<vn.gt.dao.noticeandmessage.model.TempHealthQuestion> toCacheModel() {
		return _tempHealthQuestion.toCacheModel();
	}

	public vn.gt.dao.noticeandmessage.model.TempHealthQuestion toEscapedModel() {
		return new TempHealthQuestionWrapper(_tempHealthQuestion.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempHealthQuestion.toString();
	}

	public java.lang.String toXmlString() {
		return _tempHealthQuestion.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempHealthQuestion.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public TempHealthQuestion getWrappedTempHealthQuestion() {
		return _tempHealthQuestion;
	}

	public TempHealthQuestion getWrappedModel() {
		return _tempHealthQuestion;
	}

	public void resetOriginalValues() {
		_tempHealthQuestion.resetOriginalValues();
	}

	private TempHealthQuestion _tempHealthQuestion;
}