package vn.gt.tichhop.report.ShiftingOrder;

import vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl;

public class ShiftingOrderModel extends IssueShiftingOrderImpl {
	
	private String maritimeName;
	private String maritimeNameVN;
	private String chanel;
	private String documentTypeCode;
	
	private String portRegionCode;
	
	public ShiftingOrderModel() {
	}
	
	public String getMaritimeName() {
		return maritimeName;
	}
	
	public void setMaritimeName(String maritimeName) {
		this.maritimeName = maritimeName;
	}
	
	public String getMaritimeNameVN() {
		return maritimeNameVN;
	}
	
	public void setMaritimeNameVN(String maritimeNameVN) {
		this.maritimeNameVN = maritimeNameVN;
	}
	
	public void setChanel(String chanel) {
		this.chanel = chanel;
	}
	
	public String getChanel() {
		return chanel;
	}

	public String getPortRegionCode() {
		return portRegionCode;
	}

	public void setPortRegionCode(String portRegionCode) {
		this.portRegionCode = portRegionCode;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}
}
