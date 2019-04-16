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

import com.liferay.portal.kernel.util.StringPool;

import vn.gt.dao.noticeandmessage.model.TempWasteList;
import vn.gt.dao.noticeandmessage.service.TempWasteListLocalServiceUtil;

/**
 * The extended model implementation for the TempNoTiceShipMessage service. Represents a row in the &quot;TEMP_NOTICE_SHIP_MESSAGE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage} interface.
 * </p>
 *
 * @author win_64
 */
public class TempNoTiceShipMessageImpl extends TempNoTiceShipMessageBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a temp no tice ship message model instance should use the {@link vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage} interface instead.
	 */
	public TempNoTiceShipMessageImpl() {
	}
	
	public double getWeight01() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste01");
		
		if(wasteList != null) {
			return wasteList.getWeight();
		}
		
		return 0d;
	}

	public String getUnit01() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste01");
		
		if(wasteList != null) {
			return wasteList.getUnit();
		}
		
		return StringPool.BLANK;
	}

	public double getWeight02() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste02");
		
		if(wasteList != null) {
			return wasteList.getWeight();
		}
		
		return 0d;
	}

	public String getUnit02() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste02");
		
		if(wasteList != null) {
			return wasteList.getUnit();
		}
		
		return StringPool.BLANK;
	}

	public double getWeight03() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste03");
		
		if(wasteList != null) {
			return wasteList.getWeight();
		}
		
		return 0d;
	}

	public String getUnit03() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste03");
		
		if(wasteList != null) {
			return wasteList.getUnit();
		}
		
		return StringPool.BLANK;
	}

	public double getWeight04() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste04");
		
		if(wasteList != null) {
			return wasteList.getWeight();
		}
		
		return 0d;
	}

	public String getUnit04() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste04");
		
		if(wasteList != null) {
			return wasteList.getUnit();
		}
		
		return StringPool.BLANK;
	}

	public double getWeight05() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste05");
		
		if(wasteList != null) {
			return wasteList.getWeight();
		}
		
		return 0d;
	}

	public String getUnit05() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste05");
		
		if(wasteList != null) {
			return wasteList.getUnit();
		}
		
		return StringPool.BLANK;
	}

	public double getWeight06() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste06");
		
		if(wasteList != null) {
			return wasteList.getWeight();
		}
		
		return 0d;
	}

	public String getUnit06() {
		TempWasteList wasteList = TempWasteListLocalServiceUtil.getWasteList(getRequestCode(), "waste06");
		
		if(wasteList != null) {
			return wasteList.getUnit();
		}
		
		return StringPool.BLANK;
	}

	public void setWeight01(double weight01) {
		this.weight01 = weight01;
	}

	public void setUnit01(String unit01) {
		this.unit01 = unit01;
	}

	public void setWeight02(double weight02) {
		this.weight02 = weight02;
	}

	public void setUnit02(String unit02) {
		this.unit02 = unit02;
	}

	public void setWeight03(double weight03) {
		this.weight03 = weight03;
	}

	public void setUnit03(String unit03) {
		this.unit03 = unit03;
	}

	public void setWeight04(double weight04) {
		this.weight04 = weight04;
	}

	public void setUnit04(String unit04) {
		this.unit04 = unit04;
	}

	public void setWeight05(double weight05) {
		this.weight05 = weight05;
	}

	public void setUnit05(String unit05) {
		this.unit05 = unit05;
	}

	public void setWeight06(double weight06) {
		this.weight06 = weight06;
	}

	public void setUnit06(String unit06) {
		this.unit06 = unit06;
	}

	private double weight01;
	private String unit01;
	private double weight02;
	private String unit02;
	private double weight03;
	private String unit03;
	private double weight04;
	private String unit04;
	private double weight05;
	private String unit05;
	private double weight06;
	private String unit06;
}