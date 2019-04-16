<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiXuatCanh"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmRepresentative"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceImpl"%>
<%@page import="java.util.Random"%>
<%@page import="vn.gt.utils.ConvertUtil"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmDataItemImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDataItem"%>
<%@page import="vn.gt.constant.Constants"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempCargoItemsImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCargoItems"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmGoodsTypeImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmGoodsTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmGoodsType"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortImpl"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="vn.gt.dao.danhmuc.service.DmUnitGeneralLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmUnitGeneral"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
	String loaiThuTuc = "";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
		loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	}

	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	String messageType = renderRequest.getParameter(PageType.MESSAGE_TYPE);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	String requestCodethuTuc = ParamUtil.getString(request, PageType.REQUEST_CODE);
	
	//du lieu lay tu, Temp_Document, fill NT, DWT from DmDocument
	TempDocument tempDoc = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (Validator.isNull(tempDoc)) { tempDoc = new TempDocumentImpl(); }
	
	//du lieu lay loai hang hoa
	//Thong bao moi nhat
	TempNoTiceShipMessage thongBaoLast = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	//List<TempNoTiceShipMessage> tempNoticeShipList = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG);
	//if (tempNoticeShipList != null && tempNoticeShipList.size() > 0) {
	//	tempNoticeShip = tempNoticeShipList.get(0);
	//} else {
	//	tempNoticeShip = new TempNoTiceShipMessageImpl();
	//}
	if (Validator.isNull(thongBaoLast)) { thongBaoLast = new TempNoTiceShipMessageImpl(); }
	
	TempGeneralDeclaration banKhaiChungLast = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (Validator.isNull(banKhaiChungLast)) { banKhaiChungLast = new TempGeneralDeclarationImpl(); }
	
	DmGoodsType dmGoodsType = DmGoodsTypeLocalServiceUtil.getByGoodsTypeCode(thongBaoLast.getTypeOfCargo());
	if (Validator.isNull(dmGoodsType)) {
		dmGoodsType = new DmGoodsTypeImpl();
	}
	List<DmGoodsType> dmGoodsTypeLst = DmGoodsTypeLocalServiceUtil.getDmGoodsTypes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	DmState dmState = DmStateLocalServiceUtil.getByStateCode(Validator.isNotNull(banKhaiChungLast.getFlagStateOfShip()) ? banKhaiChungLast.getFlagStateOfShip() : tempDoc.getStateCode());
	String maStCode = "";
	if(dmState == null) {
		maStCode = "";
	} else {
		maStCode = dmState.getStateCode();
	}
	
	//fill du lieu cang den
	UserPort userPort = UserPortLocalServiceUtil.findByUserId(user.getUserId());
	List<DmPort> ports = null;
	if (userPort != null) { ports = DmPortLocalServiceUtil.findByLoCode(userPort.getPortCode()); }
	if (Validator.isNull(ports)) { ports = new ArrayList<DmPort>(); }
	
	DmPort cangRoiLast = DmPortLocalServiceUtil.getByPortCode(banKhaiChungLast.getPortOfArrivalCode());
	if (Validator.isNull(cangRoiLast)) { cangRoiLast = new DmPortImpl(); }
	
	List<DmUnitGeneral> units = DmUnitGeneralLocalServiceUtil.getDmUnitGenerals(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (Validator.isNull(units)) { units = new ArrayList<DmUnitGeneral>(); }
	
	
	DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDoc.getMaritimeCode());
	if (Validator.isNull(maritime)) { maritime = new DmMaritimeImpl(); }
	
	// Sua giay phep xuat canh
	IssuePortClearance portClearanceEdit = null;
	if(Validator.isNotNull(requestCodethuTuc)) {
		portClearanceEdit = IssuePortClearanceLocalServiceUtil.getByRequestCode(requestCodethuTuc);
	}
	
	if (requestCodethuTuc.trim().length() == 0) { portClearanceEdit = new IssuePortClearanceImpl(); }
	if (Validator.isNull(portClearanceEdit)) { portClearanceEdit = new IssuePortClearanceImpl(); }
	
		
	int countPortClearance = IssuePortClearanceLocalServiceUtil.countByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	
	String capPortClearance = ParamUtil.getString(request, PageType.LAN_CAP_PORT_CLEARANCE);
	
	String lyDoCapLaiGiayPhep = ParamUtil.getString(request, PageType.HUY_HO_SO);

	List<Map<String, String>> listCargoItems = new ArrayList<Map<String, String>>();
	List<DmDataItem> cargoCategory = DmDataItemLocalServiceUtil.findByDataGroupId(Constants.DM_LOAI_HANG_HOA);
	if (Validator.isNull(cargoCategory)) { cargoCategory = new ArrayList<DmDataItem>(); }
	
		
	List<DmDataItem> cargoType = DmDataItemLocalServiceUtil.findByDataGroupId(Constants.DM_NHOM_HANG_HOA);
	if (Validator.isNull(cargoType)) { cargoType = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> cargoCode = DmDataItemLocalServiceUtil.findByDataGroupId(Constants.DM_TEN_HANG_HOA);
	if (Validator.isNull(cargoCode)) { cargoCode = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> unitCargo = DmDataItemLocalServiceUtil.findByDataGroupId(Constants.DM_DON_VI_TINH);
	if (Validator.isNull(unitCargo)) { unitCargo = new ArrayList<DmDataItem>(); }
	
	
	List<TempCargoItems> tempcargoitems = null;
	
	if(requestCodethuTuc != null && requestCodethuTuc.trim().length() > 0){
		tempcargoitems = TempCargoItemsLocalServiceUtil.findByRequestCode(requestCodethuTuc);
	}else{
		tempcargoitems = TempCargoItemsLocalServiceUtil.findBydocumentNameAnddocumentYearAndRequestCode(FormatData.convertToLong(documentName), documentYear, banKhaiChungLast.getRequestCode());
	} 
	if (Validator.isNull(tempcargoitems)) { tempcargoitems = new ArrayList<TempCargoItems>(); }
	
	int indexInc = 0;
	
	if ((tempcargoitems != null) && (tempcargoitems.size()> 0)) {
		
		for(TempCargoItems item : tempcargoitems) {	
			if (item.getCargoCategory().trim().equalsIgnoreCase("VC"))
			{
			indexInc ++;
			
			Map<String, String> mHangHoa = new HashMap<String, String>();
			mHangHoa.put("index", String.valueOf(indexInc));
			mHangHoa.put("CARGO_TYPE" + indexInc, item.getCargoType().trim());
			mHangHoa.put("CARGO_NAME" + indexInc, item.getCargoCode().trim());
			mHangHoa.put("CARGO_DESCRIPTION" + indexInc, item.getDescription().trim());
			mHangHoa.put("CARGO_QUANTITY" + indexInc, String.valueOf(item.getQuantity()));
			mHangHoa.put("CARGO_UNIT" + indexInc, item.getUnit().trim());
			
			listCargoItems.add(mHangHoa);
			}			
		}
	} 
	if (listCargoItems.size() == 0)	
	{
		indexInc += 1;
		
		Map<String, String> mHangHoa = new HashMap<String, String>();
		mHangHoa.put("index", String.valueOf(indexInc));
		mHangHoa.put("CARGO_TYPE" + indexInc, "");
		mHangHoa.put("CARGO_NAME" + indexInc, "");
		mHangHoa.put("CARGO_DESCRIPTION" + indexInc, "");
		mHangHoa.put("CARGO_QUANTITY" + indexInc, "");
		mHangHoa.put("CARGO_UNIT" + indexInc, "");
		
		listCargoItems.add(mHangHoa);
	}
	
	
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/tao_giay_phep_roi_cang.jsp===request_ThuTuc======" + requestCodethuTuc);
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/tao_giay_phep_roi_cang.jsp===count_PortClearance=" + countPortClearance);
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/tao_giay_phep_roi_cang.jsp===cap_PortClearance===" + capPortClearance);
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/tao_giay_phep_roi_cang.jsp===lyDoCapLaiGiayPhep===" + lyDoCapLaiGiayPhep);
%>

<script type="text/javascript">var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;">GIẤY PHÉP RỜI CẢNG</div>
<div class="AccordionPanelContent">

	<!--------------------------------- COLUMN 1  --------------------------------->
	<div class="tbl_left boxlabel" style="width: 33.33%">
		<table class="table_noboder">
			<thead>
				<tr>
					<input type="text" hidden="true" name="maritimeCode" value="<%=tempDoc.getMaritimeCode()%>">
					<input type="text" hidden="true" name="stateCode" value="<%=tempDoc.getStateCode()%>">
					<input type="text" hidden="true" id="idPortClearance" name="idPortClearance" value="<%=Validator.isNotNull(portClearanceEdit.getId()) ? portClearanceEdit.getId() : StringPool.BLANK%>">
					<input type="text" hidden="true" id="requestCodePortClearance" name="requestCodePortClearance" value="<%=Validator.isNotNull(portClearanceEdit.getRequestCode()) ? portClearanceEdit.getRequestCode() : UUID.randomUUID().toString()%>">
					<input type="text" hidden="true" id="numberPortClearance" name="numberPortClearance" value="<%=Validator.isNotNull(portClearanceEdit.getNumberPortClearance()) ? portClearanceEdit.getNumberPortClearance() : String.valueOf(new Random().nextInt(100000))%>">
					<input type="text" hidden="true" id="lyDoCapLaiPortClearance" name="lyDoCapLaiPortClearance" value="<%=lyDoCapLaiGiayPhep%>">
					
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tentau" /></th>
					<td class="text-leftu">
						<input type="text" class="egov-inputfield" readonly="readonly" style="width: 98%"
								name="nameOfship" id="nameOfship"
								value="<%=tempDoc.getShipName()%>">
					</td>
				</tr>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.gt" /></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
								name="grt" id="grt" 
								value="<%=tempDoc.getGrt()%>">
					</td>
				</tr>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tenthuyentruong" /></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
								name="nameOfMaster" id="nameOfMaster"
								value="<%=tempDoc.getShipCaptain()%>">
					</td>
				</tr>
				
				<tr hidden="true">
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.loaihanghoa" /></th>
					<td class="text-leftu">
						<%
						String sLoaiHangHoa = "";
						String loaiHangHoa = "";
						if (dmGoodsType.getGoodsTypeNameVN() != null && dmGoodsType.getGoodsTypeNameVN().trim().length() > 0) {
							sLoaiHangHoa = dmGoodsType.getGoodsTypeNameVN();
							loaiHangHoa = dmGoodsType.getGoodsTypeCode();
							
						} else if (dmGoodsType.getGoodsTypeName() != null) {
							sLoaiHangHoa = dmGoodsType.getGoodsTypeName();
							loaiHangHoa = dmGoodsType.getGoodsTypeCode();
						} else {
							sLoaiHangHoa = thongBaoLast.getTypeOfCargo();
							loaiHangHoa = thongBaoLast.getTypeOfCargo();
						}
						%>
						
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
								name="holdTypeOfCargo" id="holdTypeOfCargo"
								value="<%=sLoaiHangHoa%>">
						<%--
						<select id="typeOfCargo" name="typeOfCargo">
						<%
						for (DmGoodsType item : dmGoodsTypeLst) {
							%>
							<option <%=item.getGoodsTypeCode().equalsIgnoreCase(loaiHangHoa) ? "selected" : "" %>
									value="<%=item.getGoodsTypeCode()%>"><%=(dmGoodsType.getGoodsTypeNameVN() != null && dmGoodsType.getGoodsTypeNameVN().trim().length() > 0) ? dmGoodsType.getGoodsTypeNameVN() :dmGoodsType.getGoodsTypeName()%></option>
							<%
						}
						%>
						</select>
						--%>
						
						<input type="text" hidden="true"
								name="typeOfCargo" id="typeOfCargo"
								value="<%=loaiHangHoa%>">
					</td>
				</tr>
				
				<%
				if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) != 0
						&& loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) != 0
						&& loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) != 0) {
				%>
				<!-- loai hang hoa qua canh -->
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.loaihanghoaquacanh" />&nbsp;<span style="color:#FF0000;">(*)</th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" class="egov-inputfield" required
								name="transitOfCargo"
								id="transitOfCargo"
								value="<%= Validator.isNotNull(portClearanceEdit.getTransitCargo()) ? portClearanceEdit.getTransitCargo() : "As per Manifest"%>">
					</td>
				</tr>
				
				<%
				}
				%>
				
				<!-- ???? date of arrival of row cuoi cung ban khai chung, -->
				<%
					List<TempGeneralDeclaration> datadateofarrivals =  TempGeneralDeclarationLocalServiceUtil.findByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
					TempGeneralDeclaration dateofarrival = null;
					if(Validator.isNotNull(datadateofarrivals) && datadateofarrivals.size() > 0) {
						dateofarrival = datadateofarrivals.get(datadateofarrivals.size() - 1);
					}
					if (Validator.isNull(dateofarrival)) {
						dateofarrival = new TempGeneralDeclarationImpl();
					}
					String sTimeOfDeparture = "";
					if (Validator.isNotNull(portClearanceEdit.getTimeOfDeparture())) {
						sTimeOfDeparture = FormatData.parseDateToTringType3(portClearanceEdit.getTimeOfDeparture());
					} else {
						sTimeOfDeparture = FormatData.parseDateToTringType3(Validator.isNotNull(dateofarrival.getDateOfArrival()) ? dateofarrival.getDateOfArrival() : new Date());
					}
					
					String thoigianroicangg = "";
					thoigianroicangg = FormatData.parseDateToTringType3(tempDoc.getShipDateTo());
					//System.out.print("======ThoiGian roi cang===  "+ thoigianroicangg );
					String gprc = "";
					
					List<IssuePortClearance> lstTaoOrSuaGiayPhepXuatCanh =
			       			IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(
			       				FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
					if(messageType.compareTo(String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)) == 0 &&
	          				lstTaoOrSuaGiayPhepXuatCanh != null && lstTaoOrSuaGiayPhepXuatCanh.size() == 0 && tempDoc.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) {
						gprc = thoigianroicangg;
						//System.out.print("======ThoiGian roi cang gprc===  "+ gprc );
					} else {
						gprc = sTimeOfDeparture;
						//System.out.print("======ThoiGian roi cang gprc===else  "+ gprc );
					}
				%>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianroicang" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" required
								id="timeOfDeparture"
								name="timeOfDeparture"
								value="<%=gprc%>"
								onclick="gtCalendar('timeOfDeparture')">
					</td>
				</tr>
				
				
				
				<!-- ??? thoi gian hieu luc = thoigianroicang + 24h 1 ngay -->
				<!-- ??? thoi gian hieu luc = thoigianHIENTAI + 24h 1 ngay -->
				<%
					String sTimeOfValidUntil = "";
					//if (Validator.isNotNull(portClearanceEdit.getValidUntil())) {
					//	sTimeOfValidUntil = FormatData.parseDateToTringType3(portClearanceEdit.getValidUntil());
					//} else {
					//	sTimeOfValidUntil = FormatData.congNgay(Validator.isNotNull(dateofarrival.getDateOfArrival()) ? dateofarrival.getDateOfArrival() : new Date());
					//}
					sTimeOfValidUntil = FormatData.congNgay(new Date());
				%>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianhieuluc" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" required="true"
								id="timeOfValidUntil"
								name="timeOfValidUntil"
								value="<%=sTimeOfValidUntil%>"
								onclick="gtCalendar('timeOfValidUntil')">
					</td>
				</tr>
			</thead>
		</table>
	</div>
	
	<!----------- COLUMN 2 ----------->
	<div class="tbl_left boxlabel" style="width: 33.33%">
		<table class="table_noboder">
			<thead>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
					<td class="text-leftu" colspan="2">
					<%
						List<DmState> lstState = DmStateLocalServiceUtil.getDmStates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);					
							if(lstState != null && lstState.size() > 0){
								for(DmState state:lstState){
									if(maStCode.equals(state.getStateCode())){
										%>
											<input type="text" hidden="true" name="stateCode" id="stateCode" value="<%=tempDoc.getStateCode()%>">
											<input type="text" style="width: 98%" class="egov-inputfield" readonly="true" value="<%=state.getStateName()%>">
										<%
									}
								}
							}
						%>						
					</td>
				</tr>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.nt" /></th>
					<td class="text-leftu" colspan="2">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="true"
								name="nt" id="nt"
								value="<%=Validator.isNotNull(tempDoc.getNt()) ? tempDoc.getNt() : StringPool.BLANK%>">
					</td>
				</tr>
				
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluongthuyenvien" /></th>
					<td class="text-leftu" colspan="2">
						<input type="text" hidden="true"
								name="numberOfCrews" id="numberOfCrews"
								value="<%=Validator.isNotNull(banKhaiChungLast.getNumberOfCrew()) ? (banKhaiChungLast.getNumberOfCrew()) :
									(Validator.isNotNull(thongBaoLast.getCrewNumber()) ? thongBaoLast.getCrewNumber() : StringPool.BLANK)%>">
						<input type="text" style="width: 98%" class="egov-inputfield"
								readonly="true"
								value="<%=Validator.isNotNull(banKhaiChungLast.getNumberOfCrew()) ? (banKhaiChungLast.getNumberOfCrew() + " Pers") : 
									(Validator.isNotNull(thongBaoLast.getCrewNumber()) ? (thongBaoLast.getCrewNumber() + " Pers") : StringPool.BLANK)%>">
					</td>
				</tr>
				
				<!-- so luong loai hang hoa-->
				<tr hidden="true">
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluong" /></th>
					<td class="text-leftu">
						<input type="text" style="width: 48%" class="egov-inputfield" 
								name="volumeCargo" id="volumeCargo"
								value="<%= Validator.isNotNull(portClearanceEdit.getVolumeCargo()) ? portClearanceEdit.getVolumeCargo() : "0"%>">
						<%
						for (DmUnitGeneral unit : units) {
							if (unit.getUnitCode().equalsIgnoreCase(thongBaoLast.getUnitQuantityofCargo())) {
								%>
								<input type="text" name="unitVolumeCargo" id="unitVolumeCargo" style="width: 48.7%" hidden="true" value="<%=unit.getUnitCode()%>">
								<input type="text" style="width: 48.7%" readonly="readonly" value="<%=unit.getUnitName()%>">
								<%
								break;
								}
							}
						%>
					</td>
				</tr>
				
				<!-- so luong loai hang hoa qua canh -->
				<%
					if(loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) != 0
							&& loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) != 0
							&& loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) != 0){
				%>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluong" />&nbsp;<span style="color:#FF0000;">(*)</th>
					<td class="text-leftu">
						<input type="text" class="egov-inputfield" style="width: 48%" required
								name="volumeTransitCargo" id="volumeTransitCargo"
								value="<%=Validator.isNotNull(portClearanceEdit.getVolumeTransitCargo()) ? portClearanceEdit.getVolumeTransitCargo() : "0"%>">
						
						<select name="unitVolumeTransitCargo" id="unitVolumeTransitCargo" style="width: 48.7%">
							<%
							String sUnitVolumeTransitCargo = Validator.isNotNull(portClearanceEdit.getTransitCargoUnit()) ? portClearanceEdit.getTransitCargoUnit() : "";
							for (DmUnitGeneral unit : units) {
							%>
								<option <%=unit.getUnitCode().equalsIgnoreCase(sUnitVolumeTransitCargo) ? "selected" : "" %>
									value="<%=unit.getUnitCode()%>"><%=unit.getUnitName()%></option>
							<%}%>
						</select>
					</td>
				</tr>
				<%
					}
				%>
				
				<!-- CANG DEN - CANG ROI --- x-->
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.cangroi" /></th>
					<td class="text-leftu" colspan="2">
						<%
						if (Validator.isNotNull(cangRoiLast.getPortName())) {
							%>
							<input type="hidden" id="cangroi" name="cangroi" value="<%=cangRoiLast.getPortCode()%>">
							<input type="text" style="width: 98%" class="egov-inputfield" readonly="true" value="<%=cangRoiLast.getPortName()%>">
						<%} else {%>
							<select id="cangroi" name="cangroi" style="width: 98%">
								<%for (DmPort port : ports) {%>
									<option <%=port.getPortCode().equalsIgnoreCase(banKhaiChungLast.getPortOfArrivalCode()) ? "selected" : ""%>
										value="<%=port.getPortCode()%>" ><%=port.getPortName()%></option>
								<%}%>
							</select>
						<%}%>
						
					</td>
				</tr>
				
				<!-- giay phep so -->
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.giayphepso" />&nbsp;<span style="color:#FF0000;">(*)</th>
					<td class="text-leftu" colspan="2">
						<!--  ?? IssuePortClearanceLocalServiceUtil.capGiayPhepSo(maritime.getMaritimeReference()) -->
						
						<%
							// Process to display certificateNo
							String displayCertificateNo = ConvertUtil.getValueFromStringList(portClearanceEdit.getCertificateNo(), "/", 0);
							String displayCertificateNoUnit = ConvertUtil.getValueFromStringList(portClearanceEdit.getCertificateNo(), "/", 1);
							String maritimeReference = Validator.isNotNull(maritime.getMaritimeReference()) ? maritime.getMaritimeReference() : StringPool.BLANK;
						%>
						
						<input type="text" class="egov-inputfield" style="width: 48%"
								name="certificateNo"
								id="certificateNo"
								value="<%=displayCertificateNo%>">
						<!-- Only set default value, remove readonly behavious -->
						<input type="text" style="width: 48.7%"
								id="unitCertificateNo"
								name="unitCertificateNo"
								value="<%=!StringPool.BLANK.equals(displayCertificateNoUnit) ? displayCertificateNoUnit :maritimeReference%>">
						
						<%-- 
						<input type="text" class="egov-inputfield" style="width: 48%"
								name="certificateNo"
								id="certificateNo"
								value="<%=Validator.isNotNull(portClearanceEdit.getCertificateNo()) ?
										ConvertUtil.splitString(portClearanceEdit.getCertificateNo()) :
										StringPool.BLANK%>">
						
						<input  type="text" style="width: 48.7%"
								id="unitCertificateNo"
								name="unitCertificateNo"
								value="<%= Validator.isNotNull(maritime.getMaritimeReference()) ? maritime.getMaritimeReference() : StringPool.BLANK%>">
						--%>
					</td>
				</tr>
				
				
				<!-- ----------Ngay cap phep-------------- -->
				<%
				sTimeOfValidUntil = FormatData.parseDateToTringType3(new Date());
				%>
				<tr>
					<th class="text-left" width="30%">Ngày cấp phép&nbsp;<span style="color:#FF0000;">(*)</span></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" required="true"
								id="issueDate" name="issueDate"
								value="<%=sTimeOfValidUntil%>"
								onclick="gtCalendar('issueDate')">
					</td>
				</tr>
				
			</thead>
		</table>
	</div>
	
	<!-- ----------------COLUMN 3---------------------- -->
	<div class="tbl_left boxlabel" style="width: 33.33%">
		<table class="table_noboder">
			<thead>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.hohieu" /></th>
					<td class="text-leftu" colspan="2">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="true"
								name="callSign" id="callSign"
								value="<%=Validator.isNotNull(tempDoc.getCallSign()) ? tempDoc.getCallSign() : StringPool.BLANK%>">
					</td>
				</tr>
				
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.dwt" /></th>
					<td class="text-leftu" colspan="2">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="true"
								name="dwt" id="dwt"
								value="<%=Validator.isNotNull(tempDoc.getDwt()) ? tempDoc.getDwt() : StringPool.BLANK%>">
					</td>
				</tr>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluonghanhkhach" /></th>
					<td class="text-leftu" >
						<input type="text" hidden="true"
								name="numberOfPassengers" id="numberOfPassengers"
								value="<%=Validator.isNotNull(banKhaiChungLast.getNumberOfPassengers()) ? (banKhaiChungLast.getNumberOfPassengers()) :
										(Validator.isNotNull(thongBaoLast.getPassengerNumber()) ? thongBaoLast.getPassengerNumber() : StringPool.BLANK)%>">
								
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="true"
								value="<%=Validator.isNotNull(banKhaiChungLast.getNumberOfPassengers()) ? (banKhaiChungLast.getNumberOfPassengers() + " Pers") :
										(Validator.isNotNull(thongBaoLast.getPassengerNumber()) ? thongBaoLast.getPassengerNumber() + " Pers" : StringPool.BLANK)%>">
					</td>
				</tr>
				
				<tr style="height: 28px">
					<th class="text-left" width="30%">&nbsp;</th>
					<td class="text-leftu">&nbsp;</td>
				</tr>
				<tr style="height: 28px">
					<th class="text-left" width="30%">&nbsp;</th>
					<td class="text-leftu">&nbsp;</td>
				</tr>
				
				
				<!-- CANG DEN, TEMdOCUMENT, LASTPORTcode, danhmuc dmport, cung dong cang roi, ko chinh sua -->
				<!-- install db: nexportofcallcode = lastportcode -->
				<%
				DmPort cangden = DmPortLocalServiceUtil.getByPortCode(Validator.isNotNull(banKhaiChungLast.getLastPortOfCallCode()) ? banKhaiChungLast.getLastPortOfCallCode() : tempDoc.getLastPortCode());
				if (Validator.isNull(cangden)) { cangden = new DmPortImpl(); }
				%>
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.cangden"/></th>
					<td class="text-leftu" >
					
						<input type="text" hidden="true"
								name="nextPortOfCallCode" id="nextPortOfCallCode"
								value="<%=Validator.isNotNull(banKhaiChungLast.getLastPortOfCallCode()) ? banKhaiChungLast.getLastPortOfCallCode() :
									(Validator.isNotNull(tempDoc.getLastPortCode()) ? tempDoc.getLastPortCode() : StringPool.BLANK)%>">
						<%if (cangden != null  && cangden.getPortCode().contains("ZZZ")) {
						%>
						<input type="text" class="egov-inputfield" style="width: 98%" name="remarks" id="remarks" title="Nhập tên cảng thay cho ZZZ"  placeholder="Nhập tên cảng thay cho ZZZ"
							value="<%=Validator.isNotNull(portClearanceEdit.getRemarks()) ? portClearanceEdit.getRemarks() : StringPool.BLANK%>">								
						<%
						} else {  	
						%>
						<input type="text" class="egov-inputfield" readonly="true" style="width: 98%"
								value="<%=Validator.isNotNull(cangden.getPortName()) ? cangden.getPortName() : StringPool.BLANK%>">
						<%
								}
						%>		
						
					</td>
				</tr>
				
				
				<!-- dai dien cang vu, nguoi ki -->
				<tr>
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.daidiencangvu" /></th>
					<td class="text-leftu">
						
						
						<%
							User userLogin = PortalUtil.getUser(request);
							UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
							String sRepresentative = Validator.isNotNull(portClearanceEdit.getRepresentative()) ? portClearanceEdit.getRepresentative() : StringPool.BLANK;
							List<DmRepresentative> lstRepresentative = new ArrayList<DmRepresentative>();
							if (portDefault != null) {
								//thuoc mot cang vu, nhung ko co dai dien default, hoac co dai dien size > 0
								if (Validator.isNotNull(portDefault.getPortCode())) {
									lstRepresentative = DmRepresentativeLocalServiceUtil.findByMaritimeCode(portDefault.getPortCode());
								}
								if (lstRepresentative == null) { lstRepresentative = new ArrayList<DmRepresentative>(); }
							} else {
								//ko thuoc cang vu nao
							}
						%>
						<select id="representative" name="representative" style="width: 98%">
							<%if (portDefault != null) {
								if (lstRepresentative.size() == 0) {
									lstRepresentative = DmRepresentativeLocalServiceUtil.getDmRepresentatives(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
									//thuoc mot cang vu, nhung ko dai dien default
									%>
									<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>
								<%
								} else {  	//thuoc mot cang vu, co dai dien default > 0
									%>
								
									<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>
								<%	for (DmRepresentative item : lstRepresentative) {
									if (item.getRepLevel() == 1 || item.getRepLevel() == 2 ) {
								%>
									<option value="<%=item.getRepName()%>" <%=item.getRepName().equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%=item.getRepName()%></option>
									<%} }%>
									
								<%
								}
							%>
							<!-- ko thuoc dai dien cang vu nao -->
							<%} else if (portDefault == null) {%>
								<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>
								<%for (DmRepresentative item : lstRepresentative) {
									if (item.getRepLevel() == 1 || item.getRepLevel() == 2 ) {
								%>
									<option value="<%=item.getRepName()%>" <%=item.getRepName().equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%=item.getRepName()%></option>
								<%} }%>
							<%}%>
						</select>
					</td>
				</tr>
				
				<!-- ko hien thi, nhung co su dung -->
				<tr hidden="true">
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.version" /></th>
					<td class="text-leftu">
						<%
						String iVersionNo = "";
						if (capPortClearance.length() > 0) {
							iVersionNo = (countPortClearance + 1) + "";
						} else {
							iVersionNo = Validator.isNotNull(portClearanceEdit.getVersionNo()) ? portClearanceEdit.getVersionNo() : 1+"";
						}
						%>
						<input  type="text" id="versionNo" name="versionNo" value="<%=iVersionNo%>">
					</td>
				</tr>
			</thead>
		</table>
	</div>
</div>
<script type="text/javascript">
	$("#volumeTransitCargo").change(function() {
		var volumn = $('#volumeTransitCargo').val();
		var fVolumn = parseFloat(volumn);
		if (isNaN(fVolumn) | fVolumn === 0) {
			$('#volumeTransitCargo').val("0");
		} else {
			var arrayVolumn = volumn.split(".");
			if (arrayVolumn.length > 2) {
				$('#volumeTransitCargo').val("0");
			} else {
				for (i = 0; i < arrayVolumn.length; i++) {
					arrayVolumn[i] = $.trim(arrayVolumn[i]);
					var sSpaceVolumn = arrayVolumn[i].split(" ");
					var temp = "";
					for (j = 0; j < sSpaceVolumn.length; j++) { temp = temp + sSpaceVolumn[j]; }
					arrayVolumn[i] = temp;
				}
				if (arrayVolumn.length == 2) { $('#volumeTransitCargo').val(arrayVolumn[0] + "." + arrayVolumn[1]); } else { $('#volumeTransitCargo').val(arrayVolumn[0]); }
			}
		}
	});
</script>

<div class="col-xs-12 PA0">
	<table class="table_noboder">
		<thead>				
			
			<!-- CANG DEN - CANG ROI --- x-->
			<tr>
				<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.hanghoavanchuyen" /></th>
				<td class="text-leftu" colspan="2">
					<input type="button" class="btn btn-primary btn-sm" 
						onclick="addRow('<portlet:namespace/>dataTable', '<portlet:namespace />rowLengthId', '<portlet:namespace/>rowIndex')" 
						value="Thêm khai báo hàng hóa" />
				</td>
			</tr>
			</thead>
	</table>
</div>

<div class="AccordionPanelContent">
	<input type="hidden" id="<portlet:namespace />rowLengthId" name="<portlet:namespace />rowLengthId" value="<%= listCargoItems.size() %>">
	
	<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
		<thead>
			<tr>
				<th class="text-uppercase" width="5%"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
				<th class="text-uppercase" width="20%"><liferay-ui:message key="vn.dtt.thutuc.loaihanghoa" /></th>
				<th class="text-uppercase" width="20%"><liferay-ui:message key="vn.dtt.thutuc.tenhanghoa" /></th>
				<th class="text-uppercase" width="30%"><liferay-ui:message key="vn.dtt.thutuc.motahanghoa" /></th>
				<th class="text-uppercase" width="10%"><liferay-ui:message key="vn.dtt.thutuc.soluong" /></th>
				<th class="text-uppercase" width="10%"><liferay-ui:message key="vn.dtt.thutuc.donvi" /></th>
				<th class="text-uppercase" width="5%"><liferay-ui:message key="vn.dtt.thutuc.xoa" /></th>
			</tr>
		</thead>
		<tbody>
			<% 
				for(int i = 0; i < listCargoItems.size(); i++) { 
					Map<String, String> mlistCargoItems = listCargoItems.get(i);
					
					String index = mlistCargoItems.get("index");
			%>
				<tr>
					<td>
						<input type="hidden" name='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
						<input type="text" class="noBorder text-center form-control" 
							readonly="readonly" name='stt' value="<%= i+1 %>">
					</td>
					<td>
						<select class="form-control general_cargo " 
							id='<%= "CARGO_TYPE" + (i + 1) %>'
							name='<%= "CARGO_TYPE" + (i + 1) %>'>
								<option value="">--- Lựa chọn ---</option>
								
								<% for(DmDataItem item : cargoType) { %>
									<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_TYPE" + index)) ? "selected" : "" %>><%= item.getName() %></option>
								<%} %>
						</select>
					</td>
					<td>
						<select class="form-control " 
							id='<%= "CARGO_NAME" + (i + 1) %>'
							name='<%= "CARGO_NAME" + (i + 1) %>'>
								<option value="">--- Lựa chọn ---</option>
								
								<% for(DmDataItem item : cargoCode) {%>
									<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_NAME" + index)) ? "selected" : "" %>><%= item.getName() %></option>
								<%} %>
						</select>
					</td>
					<td>
						<input class="form-control" type="text" 
							id='<%= "CARGO_DESCRIPTION" + (i + 1) %>' 
							name='<%= "CARGO_DESCRIPTION" + (i + 1) %>' 
							value="<%= mlistCargoItems.get("CARGO_DESCRIPTION" + index) %>">
					</td>
					<td>
						<input class="form-control" type="text" 
							id='<%= "CARGO_QUANTITY" + (i + 1) %>' 
							name='<%= "CARGO_QUANTITY" + (i + 1) %>' 
							value="<%= mlistCargoItems.get("CARGO_QUANTITY" + index) %>">
					</td>
					<td>
						<select class="form-control " 
							id='<%= "CARGO_UNIT" + (i + 1) %>'
							name='<%= "CARGO_UNIT" + (i + 1) %>'>
								<option value="">--- Lựa chọn ---</option>
								
								<% for(DmDataItem item : unitCargo) {%>
									<option value="<%= item.getCode0() %>" <%=item.getCode0().trim().equalsIgnoreCase(mlistCargoItems.get("CARGO_UNIT" + index)) ? "selected" : "" %>><%= item.getName() %></option>
								<%} %>
						</select>
					</td>
					<td>
						<input type="button" class="btn btn-sm" 
							onclick="deleteRow('<portlet:namespace/>dataTable', this)" value="Xóa" />
					</td>
				</tr>
			<%} %>
		</tbody>
	</table>
</div>


<portlet:resourceURL var="resourceURL" ></portlet:resourceURL>

<script type="text/javascript">

$(document).ready(function() {
	var setTenHangHoa = function(selLoaiHangHoa) {
		var loaiHangHoaId = selLoaiHangHoa.attr('id');
		var suff = loaiHangHoaId.substr('CARGO_TYPE'.length, loaiHangHoaId.length);
		var selTenHangHoa = $('#CARGO_NAME' + suff);
		
		if(selTenHangHoa.length > 0) {
			var valueSelected = selTenHangHoa.val();
			
			$.ajax({
				url: '<%=resourceURL%>',
				dataType: 'json',
				data : {
					loaiHangHoa : selLoaiHangHoa.val(),
					type: 'findTenHangHoa'
				},
				type: 'get',
				success : function(data) {
					selTenHangHoa.find('option').remove();
					
					$('<option>').val("").text("--- Lựa chọn ---").appendTo(selTenHangHoa);
					
					$.each(data, function(idx, obj) {
						if(valueSelected == obj.code) {
							$('<option>').val(obj.code).text(obj.name).attr("selected","selected").appendTo(selTenHangHoa);
						} else {
							$('<option>').val(obj.code).text(obj.name).appendTo(selTenHangHoa);
						}
						
					});
				}
			});
		}
	}
	
	$('.general_cargo').each(function(){
		if($(this).val() != '') {
			setTenHangHoa($(this));
		}
	})
	
	$(document.body).delegate('.general_cargo', "change", function(){
		setTenHangHoa($(this));
	});
	
	$(document.body).delegate('.general_cargo', "change", function(){
		setTenHangHoa($(this));
	});
	
})
</script>

<script type="text/javascript">	
	function deleteRow(tableID, el) {
		var table = document.getElementById(tableID);
		var tbody = table.getElementsByTagName('tbody')[0];
		var rowCount = tbody.rows.length;
		
		if (rowCount <= 1) {
			alert("Không thể xóa tất cả các dòng.");
		} else {
			var i = el.parentNode.parentNode.rowIndex;
			table.deleteRow(i);
		}
	}
	
	function addRow(tableID, rowLengthId, rowIndexName) {
		var table = document.getElementById(tableID);
		var tbody = table.getElementsByTagName('tbody')[0];
		
		var old_row_inc = "";
		
		// Lay gia tri rowIndex cua row duoc clone
		for(var k = 0; k < tbody.rows[0].getElementsByTagName('input').length; k++) {
			var input = tbody.rows[0].getElementsByTagName('input')[k];
			var nameInput = tbody.rows[0].getElementsByTagName('input')[k].getAttribute('name');
			
			if(nameInput === rowIndexName) {
				old_row_inc = input.value;
				break;
			}
		}
		
		var new_row_inc = parseInt(document.getElementById(rowLengthId).value) + 1;
		
		document.getElementById(rowLengthId).value = new_row_inc;
		
		var newRow = tbody.rows[0].cloneNode(true);
		
		// Set lai name cho input theo dinh dang name = NAME + rowIndex
		for(var k = 0; k < newRow.getElementsByTagName('input').length; k++) {
			var input = newRow.getElementsByTagName('input')[k];
			
			var nameInput = input.getAttribute('name');
			var idInput = input.getAttribute('id');
			
			if(nameInput) {
				if(nameInput === rowIndexName || nameInput === 'stt') {
					input.value = new_row_inc;
				} else {
					var defaultName = nameInput;
					
					if(nameInput.lastIndexOf(old_row_inc) > 0) {
						defaultName = nameInput.slice(0, nameInput.lastIndexOf(old_row_inc));
						nameInput = defaultName + new_row_inc;
						
						if(idInput != undefined && idInput != null) {
							idInput = idInput.slice(0, idInput.lastIndexOf(old_row_inc)) + new_row_inc;
						}
					}
					
					input.setAttribute("name", nameInput);
					
					if(idInput != undefined && idInput != null) {
						input.setAttribute('id', idInput);
					}
				}
			}
		}
		
		// Set lai name cho textarea theo dinh dang name = NAME + rowIndex
		for(var k = 0; k < newRow.getElementsByTagName('textarea').length; k++) {
			var input = newRow.getElementsByTagName('textarea')[k];
			
			var nameInput = input.getAttribute('name');
			var idInput = input.getAttribute('id');
			
			if(nameInput) {
				var defaultName = nameInput;
				
				if(nameInput.lastIndexOf(old_row_inc) > 0) {
					defaultName = nameInput.slice(0, nameInput.lastIndexOf(old_row_inc));
					nameInput = defaultName + new_row_inc;
					
					if(idInput != undefined && idInput != null) {
						idInput = idInput.slice(0, idInput.lastIndexOf(old_row_inc)) + new_row_inc;
					}
				}
				
				input.setAttribute("name", nameInput);
				
				if(idInput != undefined && idInput != null) {
					input.setAttribute('id', idInput);
				}
			}
		}
		
		// Set lai name cho textarea theo dinh dang name = NAME + rowIndex
		for(var k = 0; k < newRow.getElementsByTagName('select').length; k++) {
			var input = newRow.getElementsByTagName('select')[k];
			
			var nameInput = input.getAttribute('name');
			var idInput = input.getAttribute('id');
			
			if(nameInput) {
				var defaultName = nameInput;
				
				if(nameInput.lastIndexOf(old_row_inc) > 0) {
					defaultName = nameInput.slice(0, nameInput.lastIndexOf(old_row_inc));
					nameInput = defaultName + new_row_inc;
					
					if(idInput != undefined && idInput != null) {
						idInput = idInput.slice(0, idInput.lastIndexOf(old_row_inc)) + new_row_inc;
					}
				}
				
				input.setAttribute("name", nameInput);
				
				if(idInput != undefined && idInput != null) {
					input.setAttribute('id', idInput);
				}
			}
		}
		
		tbody.appendChild(newRow);
	}
</script>

<style>
.table {
    margin-bottom: 10px;
    margin-top: 10px;
    max-width: 100%;
    width: 100%;
}
.table th {
    background-color: #e9e9e9;
    font-weight: bold;
    text-align: center;
}
.table-bordered {
    border: 1px solid #ddd;
}
.table-bordered > thead > tr > th, .table-bordered > tbody > tr > th, .table-bordered > tfoot > tr > th, .table-bordered > thead > tr > td, .table-bordered > tbody > tr > td, .table-bordered > tfoot > tr > td {
    border: 1px solid #ddd;
}
.table-condensed > thead > tr > th, .table-condensed > tbody > tr > th, .table-condensed > tfoot > tr > th, .table-condensed > thead > tr > td, .table-condensed > tbody > tr > td, .table-condensed > tfoot > tr > td {
    padding: 5px;
}
.table > thead > tr > th {
    border-bottom: 2px solid #ddd;
    vertical-align: bottom;
}
.table > thead > tr > th, .table > tbody > tr > th, .table > tfoot > tr > th, .table > thead > tr > td, .table > tbody > tr > td, .table > tfoot > tr > td {
    border-top: 1px solid #ddd;
    line-height: 1.42857;
    padding: 8px;
    vertical-align: top;
}

.noBorder {
	border: medium none !important;
    box-shadow: none !important;
    background: #FFF !important;
}

.form-control {
	display: block;
    height: 30px;
    line-height: 1.42857;
    padding: 4px 10px;
    width: 100%;
}

.radio, .checkbox {
    display: block;
    margin-bottom: 10px;
    margin-top: 10px;
    position: relative;
}

.radio-inline, .checkbox-inline {
    cursor: pointer;
    display: inline-block;
    font-weight: normal;
    margin-bottom: 0;
    padding-left: 20px;
    position: relative;
    vertical-align: middle;
}

.radio label, .checkbox label {
    cursor: pointer;
    font-weight: normal;
    margin-bottom: 0;
    min-height: 20px;
    padding-left: 20px;
}
label.toggleRadio {
	font-weight: bold !important;
}

.col-xs-12 {
	width: 100%;
}

.col-xs-1, .col-xs-2, .col-xs-3, .col-xs-4, .col-xs-5, .col-xs-6, .col-xs-7, .col-xs-8, .col-xs-9, .col-xs-10, .col-xs-11, .col-xs-12 {
	float: left;
}

.col-xs-1, .col-sm-1, .col-md-1, .col-lg-1, .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2, .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3, .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4, .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5, .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6, .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7, .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8, .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9, .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10, .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11, .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {
	min-height: 1px;
	padding-left: 15px;
	padding-right: 15px;
	position: relative;
}

.PA0 {
    padding-left: 0;
    padding-right: 0;
}
.textlabel {
    margin-top: 8px;
    padding-right: 0;
}
label {
    display: inline-block;
    font-weight: bold;
    margin-bottom: 5px;
    max-width: 100%;
}
p {
    margin: 0 0 10px;
}
.radio input[type="radio"], .radio-inline input[type="radio"], .checkbox input[type="checkbox"], .checkbox-inline input[type="checkbox"] {
    margin-left: -20px;
    position: absolute;
}
.col-xs-12{width:100%}.col-xs-11{width:91.66666667%}.col-xs-10{width:83.33333333%}.col-xs-9{width:75%}.col-xs-8{width:66.66666667%}.col-xs-7{width:58.33333333%}.col-xs-6{width:50%}.col-xs-5{width:41.66666667%}.col-xs-4{width:33.33333333%}.col-xs-3{width:25%}.col-xs-2{width:16.66666667%}.col-xs-1{width:8.33333333%}
</style>
