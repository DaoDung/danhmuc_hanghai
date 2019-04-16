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

/**
 * The base model interface for the TempHealthQuestion service. Represents a row in the &quot;TEMP_HEALTH_QUESTION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionImpl}.
 * </p>
 *
 * @author win_64
 * @see TempHealthQuestion
 * @see vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionImpl
 * @see vn.gt.dao.noticeandmessage.model.impl.TempHealthQuestionModelImpl
 * @generated
 */
public interface TempHealthQuestionModel extends BaseModel<TempHealthQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp health question model instance should use the {@link TempHealthQuestion} interface instead.
	 */

	/**
	 * Returns the primary key of this temp health question.
	 *
	 * @return the primary key of this temp health question
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp health question.
	 *
	 * @param primaryKey the primary key of this temp health question
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp health question.
	 *
	 * @return the ID of this temp health question
	 */
	public long getId();

	/**
	 * Sets the ID of this temp health question.
	 *
	 * @param id the ID of this temp health question
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp health question.
	 *
	 * @return the request code of this temp health question
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp health question.
	 *
	 * @param requestCode the request code of this temp health question
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the health question code of this temp health question.
	 *
	 * @return the health question code of this temp health question
	 */
	@AutoEscape
	public String getHealthQuestionCode();

	/**
	 * Sets the health question code of this temp health question.
	 *
	 * @param healthQuestionCode the health question code of this temp health question
	 */
	public void setHealthQuestionCode(String healthQuestionCode);

	/**
	 * Returns the person died of this temp health question.
	 *
	 * @return the person died of this temp health question
	 */
	public int getPersonDied();

	/**
	 * Sets the person died of this temp health question.
	 *
	 * @param personDied the person died of this temp health question
	 */
	public void setPersonDied(int personDied);

	/**
	 * Returns the person died no of this temp health question.
	 *
	 * @return the person died no of this temp health question
	 */
	public int getPersonDiedNo();

	/**
	 * Sets the person died no of this temp health question.
	 *
	 * @param personDiedNo the person died no of this temp health question
	 */
	public void setPersonDiedNo(int personDiedNo);

	/**
	 * Returns the person died report of this temp health question.
	 *
	 * @return the person died report of this temp health question
	 */
	@AutoEscape
	public String getPersonDiedReport();

	/**
	 * Sets the person died report of this temp health question.
	 *
	 * @param personDiedReport the person died report of this temp health question
	 */
	public void setPersonDiedReport(String personDiedReport);

	/**
	 * Returns the isinfectious of this temp health question.
	 *
	 * @return the isinfectious of this temp health question
	 */
	public int getIsinfectious();

	/**
	 * Sets the isinfectious of this temp health question.
	 *
	 * @param isinfectious the isinfectious of this temp health question
	 */
	public void setIsinfectious(int isinfectious);

	/**
	 * Returns the infectious report of this temp health question.
	 *
	 * @return the infectious report of this temp health question
	 */
	@AutoEscape
	public String getInfectiousReport();

	/**
	 * Sets the infectious report of this temp health question.
	 *
	 * @param infectiousReport the infectious report of this temp health question
	 */
	public void setInfectiousReport(String infectiousReport);

	/**
	 * Returns the ill passengers greater nomal of this temp health question.
	 *
	 * @return the ill passengers greater nomal of this temp health question
	 */
	public int getIllPassengersGreaterNomal();

	/**
	 * Sets the ill passengers greater nomal of this temp health question.
	 *
	 * @param illPassengersGreaterNomal the ill passengers greater nomal of this temp health question
	 */
	public void setIllPassengersGreaterNomal(int illPassengersGreaterNomal);

	/**
	 * Returns the ill passengers no of this temp health question.
	 *
	 * @return the ill passengers no of this temp health question
	 */
	public int getIllPassengersNo();

	/**
	 * Sets the ill passengers no of this temp health question.
	 *
	 * @param illPassengersNo the ill passengers no of this temp health question
	 */
	public void setIllPassengersNo(int illPassengersNo);

	/**
	 * Returns the ill persons on board of this temp health question.
	 *
	 * @return the ill persons on board of this temp health question
	 */
	public int getIllPersonsOnBoard();

	/**
	 * Sets the ill persons on board of this temp health question.
	 *
	 * @param illPersonsOnBoard the ill persons on board of this temp health question
	 */
	public void setIllPersonsOnBoard(int illPersonsOnBoard);

	/**
	 * Returns the ill persons report of this temp health question.
	 *
	 * @return the ill persons report of this temp health question
	 */
	public int getIllPersonsReport();

	/**
	 * Sets the ill persons report of this temp health question.
	 *
	 * @param illPersonsReport the ill persons report of this temp health question
	 */
	public void setIllPersonsReport(int illPersonsReport);

	/**
	 * Returns the medical practitioner consulted of this temp health question.
	 *
	 * @return the medical practitioner consulted of this temp health question
	 */
	public int getMedicalPractitionerConsulted();

	/**
	 * Sets the medical practitioner consulted of this temp health question.
	 *
	 * @param medicalPractitionerConsulted the medical practitioner consulted of this temp health question
	 */
	public void setMedicalPractitionerConsulted(
		int medicalPractitionerConsulted);

	/**
	 * Returns the medical treatment or advice of this temp health question.
	 *
	 * @return the medical treatment or advice of this temp health question
	 */
	@AutoEscape
	public String getMedicalTreatmentOrAdvice();

	/**
	 * Sets the medical treatment or advice of this temp health question.
	 *
	 * @param medicalTreatmentOrAdvice the medical treatment or advice of this temp health question
	 */
	public void setMedicalTreatmentOrAdvice(String medicalTreatmentOrAdvice);

	/**
	 * Returns the infection or spread of disease of this temp health question.
	 *
	 * @return the infection or spread of disease of this temp health question
	 */
	public int getInfectionOrSpreadOfDisease();

	/**
	 * Sets the infection or spread of disease of this temp health question.
	 *
	 * @param infectionOrSpreadOfDisease the infection or spread of disease of this temp health question
	 */
	public void setInfectionOrSpreadOfDisease(int infectionOrSpreadOfDisease);

	/**
	 * Returns the infections report of this temp health question.
	 *
	 * @return the infections report of this temp health question
	 */
	@AutoEscape
	public String getInfectionsReport();

	/**
	 * Sets the infections report of this temp health question.
	 *
	 * @param infectionsReport the infections report of this temp health question
	 */
	public void setInfectionsReport(String infectionsReport);

	/**
	 * Returns the is sanitary of this temp health question.
	 *
	 * @return the is sanitary of this temp health question
	 */
	public int getIsSanitary();

	/**
	 * Sets the is sanitary of this temp health question.
	 *
	 * @param isSanitary the is sanitary of this temp health question
	 */
	public void setIsSanitary(int isSanitary);

	/**
	 * Returns the sanitary des of this temp health question.
	 *
	 * @return the sanitary des of this temp health question
	 */
	@AutoEscape
	public String getSanitaryDes();

	/**
	 * Sets the sanitary des of this temp health question.
	 *
	 * @param sanitaryDes the sanitary des of this temp health question
	 */
	public void setSanitaryDes(String sanitaryDes);

	/**
	 * Returns the is stowaways of this temp health question.
	 *
	 * @return the is stowaways of this temp health question
	 */
	public int getIsStowaways();

	/**
	 * Sets the is stowaways of this temp health question.
	 *
	 * @param isStowaways the is stowaways of this temp health question
	 */
	public void setIsStowaways(int isStowaways);

	/**
	 * Returns the join ship of this temp health question.
	 *
	 * @return the join ship of this temp health question
	 */
	@AutoEscape
	public String getJoinShip();

	/**
	 * Sets the join ship of this temp health question.
	 *
	 * @param joinShip the join ship of this temp health question
	 */
	public void setJoinShip(String joinShip);

	/**
	 * Returns the is animal of this temp health question.
	 *
	 * @return the is animal of this temp health question
	 */
	public int getIsAnimal();

	/**
	 * Sets the is animal of this temp health question.
	 *
	 * @param isAnimal the is animal of this temp health question
	 */
	public void setIsAnimal(int isAnimal);

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

	public int compareTo(TempHealthQuestion tempHealthQuestion);

	public int hashCode();

	public CacheModel<TempHealthQuestion> toCacheModel();

	public TempHealthQuestion toEscapedModel();

	public String toString();

	public String toXmlString();
}