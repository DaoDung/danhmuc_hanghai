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

package vn.gt.dao.noticeandmessage.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.gt.dao.noticeandmessage.model.TempAttachmentDeclarationHealth;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing TempAttachmentDeclarationHealth in entity cache.
 *
 * @author win_64
 * @see TempAttachmentDeclarationHealth
 * @generated
 */
public class TempAttachmentDeclarationHealthCacheModel implements CacheModel<TempAttachmentDeclarationHealth>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", attachmentCode=");
		sb.append(attachmentCode);
		sb.append(", passengerOrCrewCode=");
		sb.append(passengerOrCrewCode);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", portJoinVesselCode=");
		sb.append(portJoinVesselCode);
		sb.append(", dateJoinVessel=");
		sb.append(dateJoinVessel);
		sb.append(", classOrRating=");
		sb.append(classOrRating);
		sb.append(", natureOfIllness=");
		sb.append(natureOfIllness);
		sb.append(", dateOfOnsetOfSymptom=");
		sb.append(dateOfOnsetOfSymptom);
		sb.append(", reportedMedicalOfficer=");
		sb.append(reportedMedicalOfficer);
		sb.append(", disposalOfCase=");
		sb.append(disposalOfCase);
		sb.append(", medicinesOrOther=");
		sb.append(medicinesOrOther);
		sb.append(", comments=");
		sb.append(comments);
		sb.append("}");

		return sb.toString();
	}

	public TempAttachmentDeclarationHealth toEntityModel() {
		TempAttachmentDeclarationHealthImpl tempAttachmentDeclarationHealthImpl = new TempAttachmentDeclarationHealthImpl();

		tempAttachmentDeclarationHealthImpl.setId(id);

		if (requestCode == null) {
			tempAttachmentDeclarationHealthImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setRequestCode(requestCode);
		}

		if (attachmentCode == null) {
			tempAttachmentDeclarationHealthImpl.setAttachmentCode(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setAttachmentCode(attachmentCode);
		}

		if (passengerOrCrewCode == null) {
			tempAttachmentDeclarationHealthImpl.setPassengerOrCrewCode(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setPassengerOrCrewCode(passengerOrCrewCode);
		}

		if (name == null) {
			tempAttachmentDeclarationHealthImpl.setName(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setName(name);
		}

		tempAttachmentDeclarationHealthImpl.setAge(age);
		tempAttachmentDeclarationHealthImpl.setSex(sex);

		if (nationality == null) {
			tempAttachmentDeclarationHealthImpl.setNationality(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setNationality(nationality);
		}

		if (portJoinVesselCode == null) {
			tempAttachmentDeclarationHealthImpl.setPortJoinVesselCode(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setPortJoinVesselCode(portJoinVesselCode);
		}

		if (dateJoinVessel == Long.MIN_VALUE) {
			tempAttachmentDeclarationHealthImpl.setDateJoinVessel(null);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setDateJoinVessel(new Date(
					dateJoinVessel));
		}

		tempAttachmentDeclarationHealthImpl.setClassOrRating(classOrRating);

		if (natureOfIllness == null) {
			tempAttachmentDeclarationHealthImpl.setNatureOfIllness(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setNatureOfIllness(natureOfIllness);
		}

		if (dateOfOnsetOfSymptom == Long.MIN_VALUE) {
			tempAttachmentDeclarationHealthImpl.setDateOfOnsetOfSymptom(null);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setDateOfOnsetOfSymptom(new Date(
					dateOfOnsetOfSymptom));
		}

		tempAttachmentDeclarationHealthImpl.setReportedMedicalOfficer(reportedMedicalOfficer);

		if (disposalOfCase == null) {
			tempAttachmentDeclarationHealthImpl.setDisposalOfCase(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setDisposalOfCase(disposalOfCase);
		}

		if (medicinesOrOther == null) {
			tempAttachmentDeclarationHealthImpl.setMedicinesOrOther(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setMedicinesOrOther(medicinesOrOther);
		}

		if (comments == null) {
			tempAttachmentDeclarationHealthImpl.setComments(StringPool.BLANK);
		}
		else {
			tempAttachmentDeclarationHealthImpl.setComments(comments);
		}

		tempAttachmentDeclarationHealthImpl.resetOriginalValues();

		return tempAttachmentDeclarationHealthImpl;
	}

	public long id;
	public String requestCode;
	public String attachmentCode;
	public String passengerOrCrewCode;
	public String name;
	public int age;
	public int sex;
	public String nationality;
	public String portJoinVesselCode;
	public long dateJoinVessel;
	public int classOrRating;
	public String natureOfIllness;
	public long dateOfOnsetOfSymptom;
	public int reportedMedicalOfficer;
	public String disposalOfCase;
	public String medicinesOrOther;
	public String comments;
}