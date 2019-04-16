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

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TempNoTiceShipMessage service. Represents a row in the &quot;TEMP_NOTICE_SHIP_MESSAGE&quot; database table, with each column mapped to a property of this class.
 *
 * @author win_64
 * @see TempNoTiceShipMessageModel
 * @see vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl
 * @see vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageModelImpl
 * @generated
 */
public interface TempNoTiceShipMessage extends TempNoTiceShipMessageModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public double getWeight01();

	public java.lang.String getUnit01();

	public double getWeight02();

	public java.lang.String getUnit02();

	public double getWeight03();

	public java.lang.String getUnit03();

	public double getWeight04();

	public java.lang.String getUnit04();

	public double getWeight05();

	public java.lang.String getUnit05();

	public double getWeight06();

	public java.lang.String getUnit06();

	public void setWeight01(double weight01);

	public void setUnit01(java.lang.String unit01);

	public void setWeight02(double weight02);

	public void setUnit02(java.lang.String unit02);

	public void setWeight03(double weight03);

	public void setUnit03(java.lang.String unit03);

	public void setWeight04(double weight04);

	public void setUnit04(java.lang.String unit04);

	public void setWeight05(double weight05);

	public void setUnit05(java.lang.String unit05);

	public void setWeight06(double weight06);

	public void setUnit06(java.lang.String unit06);
}