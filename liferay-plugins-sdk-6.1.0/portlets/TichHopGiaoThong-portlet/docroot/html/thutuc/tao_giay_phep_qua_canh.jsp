<%@page import="vn.gt.utils.DateUtils"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmRepresentative"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssuePermissionForTransitImpl"%>
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
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="vn.gt.dao.danhmuc.service.DmUnitGeneralLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmUnitGeneral"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmGoodsImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmGoods"%>
<%@page import="vn.gt.dao.danhmuc.service.DmGoodsLocalServiceUtil"%>
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
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	String messageType = renderRequest.getParameter(PageType.MESSAGE_TYPE);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	String requestCodethuTuc = ParamUtil.getString(request, PageType.REQUEST_CODE);
	
	//du lieu lay tu, Temp_Document
	TempDocument tempDoc = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (Validator.isNull(tempDoc)) {
		tempDoc = new TempDocumentImpl();
	}
	
	DmState dmState = DmStateLocalServiceUtil.getByStateCode(tempDoc.getStateCode());
	
	//fill du lieu cang den
	UserPort userPort = UserPortLocalServiceUtil.findByUserId(user.getUserId());
	List<DmPort> ports = null;
	
	if (userPort != null) {
		ports = DmPortLocalServiceUtil.findByLoCode(userPort.getPortCode());
	}
	
	if (Validator.isNull(ports)) { 
		ports = new ArrayList<DmPort>(); 
	}
	
	List<DmUnitGeneral> units = DmUnitGeneralLocalServiceUtil.getDmUnitGenerals(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (Validator.isNull(units)) { units = new ArrayList<DmUnitGeneral>(); }
	
	DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDoc.getMaritimeCode().trim());

	if (Validator.isNull(maritime)) {maritime = new DmMaritimeImpl(); }
	
	//Loai hang hoa qua canh, du lieu lay loai hang hoa
	//Xac bao
	String noticeShipType = "2";
	List<TempNoTiceShipMessage> quaCanhs = TempNoTiceShipMessageLocalServiceUtil.
		findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, noticeShipType);
	
	TempNoTiceShipMessage tempNoticeShip = null;
	
	if (Validator.isNotNull(quaCanhs) && quaCanhs.size() > 0) {
		tempNoticeShip = quaCanhs.get(0);
	} else {
		tempNoticeShip = new TempNoTiceShipMessageImpl();
	}
	
	DmGoods dmGoods = DmGoodsLocalServiceUtil.getByGoodsItemCode(tempNoticeShip.getTypeOfCargo());
	if (Validator.isNull(dmGoods)) {
		dmGoods = new DmGoodsImpl();
	}
	
	List<DmGoods> dsHangHoa = DmGoodsLocalServiceUtil.getDmGoodses(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (Validator.isNull(dsHangHoa)) {
		dsHangHoa = new ArrayList<DmGoods>();
	}
	
	TempGeneralDeclaration generalDeclaration = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (Validator.isNull(generalDeclaration)) { generalDeclaration = new TempGeneralDeclarationImpl(); }
	
	// Sua giay phep qua canh
	IssuePermissionForTransit perForTransitEdit = null;
	if(Validator.isNotNull(requestCodethuTuc)) {
		perForTransitEdit = IssuePermissionForTransitLocalServiceUtil.getByrequestCode(requestCodethuTuc);
	}
	if (Validator.isNull(perForTransitEdit)) { perForTransitEdit = new IssuePermissionForTransitImpl(); }
		
	int countPerForTransit = IssuePermissionForTransitLocalServiceUtil.countByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	
	String capPerForTransit = ParamUtil.getString(request, PageType.LAN_CAP_PERMISSION_FOR_TRANSIT);
	
	String lyDoCapLai = ParamUtil.getString(request, "lyDoCapLaiPermissionForTransit");
	
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
		tempcargoitems = TempCargoItemsLocalServiceUtil.findBydocumentNameAnddocumentYearAndRequestCode(FormatData.convertToLong(documentName), documentYear, generalDeclaration.getRequestCode());
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
	
	
	System.out.println("===tao_giay_phep_qua_canh.jsp===lyDoCapLai===" + lyDoCapLai);
	System.out.println("===tao_giay_phep_qua_canh.jsp===request_ThuTuc===" + requestCodethuTuc + "===count_PerForTransit===" + countPerForTransit + "==cap_PortClearance==" + capPerForTransit);
%>

<script type="text/javascript">var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;">GIẤY PHÉP QUÁ CẢNH</div>
	<div class="AccordionPanelContent">
		<!---------------------------  COLUMN 1 --------------------------->
		<div class="tbl_left boxlabel" style="width: 49.99%">
			<table class="table_noboder">
				<thead>
					<tr>
						<input type="text" hidden="true" id="idPerForTransit" name="idPerForTransit" value="<%=Validator.isNotNull(perForTransitEdit.getId()) ? perForTransitEdit.getId() : StringPool.BLANK%>">
						<input type="text" hidden="true" id="requestCodePerForTransit" name="requestCodePerForTransit" value="<%=Validator.isNotNull(perForTransitEdit.getRequestCode()) ? perForTransitEdit.getRequestCode() : UUID.randomUUID().toString()%>">
						<input type="text" hidden="true" id="numberPermissionForTransit" name="numberPermissionForTransit" value="<%=Validator.isNotNull(perForTransitEdit.getNumberPermissionForTransit()) ? perForTransitEdit.getNumberPermissionForTransit() : new Random().nextInt(100000)%>">
						<input type="text" hidden="true" id="lyDoCapLaiPermissionForTransit" name="lyDoCapLaiPermissionForTransit" value="<%=lyDoCapLai%>">
						
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tentau" /></th>
						<td class="text-leftu">
							<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
									name="nameOfship" id="nameOfship"
									value="<%= tempDoc.getShipName()%>">
						</td>
					</tr>
					
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.hohieu" /></th>
						<td class="text-leftu" >
							<input type="text" style="width: 98%" readonly="readonly" class="egov-inputfield"
									name="callSign" id="callSign"
									value="<%=Validator.isNotNull(tempDoc.getCallSign()) ? tempDoc.getCallSign() : StringPool.BLANK%>">
						</td>
					</tr>
					
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tenthuyentruong" /></th>
						<td class="text-leftu">
							<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
									name="nameOfMaster" id="nameOfMaster"
									value="<%=Validator.isNotNull(tempDoc.getShipCaptain()) ? tempDoc.getShipCaptain() : Validator.isNotNull(tempDoc.getCallSign()) %>">
						</td>
					</tr>
					
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluonghanhkhach" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
							<input type="text" name="numberOfPassengers" id="numberOfPassengers" hidden="true"
									value="<%=Validator.isNotNull(tempNoticeShip.getPassengerNumber()) ? tempNoticeShip.getPassengerNumber() : StringPool.BLANK%>">
							<input type="text" class="egov-inputfield" readonly="readonly" style="width: 98%"
									value="<%=Validator.isNotNull(tempNoticeShip.getPassengerNumber()) ? tempNoticeShip.getPassengerNumber() + " Pers" : StringPool.BLANK%>">
						</td>
					</tr>
					
					
					<tr hidden="true">
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.loaihanghoaquacanh" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<% String sTransitOfCargo = Validator.isNotNull(perForTransitEdit.getTransitCargo()) ? perForTransitEdit.getTransitCargo() : dmGoods.getGoodsItemCode(); %>
							<select name="transitOfCargo" id="transitOfCargo" style="width: 98%" >
								<% for (DmGoods item : dsHangHoa) { %>
									<option <%=item.getGoodsItemCode().equalsIgnoreCase(sTransitOfCargo) ? "selected" : "" %>
										value="<%=item.getGoodsItemCode()%>"><%=item.getGoodsItemName()%></option>
								<% } %>
							</select>
						</td>
					</tr>
					
					
					<!-- Duoc phep qua canh Viet Nam tu: khu vuc cang -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.khuvucangtu" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
							<%
							List<DmPortRegion> lstRegion = DmPortRegionLocalServiceUtil.getDmPortRegions(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
							String sPermittedTransitFrom = Validator.isNotNull(perForTransitEdit.getPermittedTransitFrom()) ? perForTransitEdit.getPermittedTransitFrom() : lstRegion.get(0).getPortRegionCode();
							%>
							<input type="text" hidden="true"
									id="permittedTransitFrom"
									name="permittedTransitFrom" 
									value="<%= sPermittedTransitFrom %>">
							<select id="holdPermittedTransitFrom" name="holdPermittedTransitFrom">
								<%for (DmPortRegion item : lstRegion) {%>
									<option
										<%=item.getPortRegionCode().equalsIgnoreCase(sPermittedTransitFrom) ? "selected" : "" %>
										value="<%=item.getPortRegionCode()%>"><%=item.getPortRegionNameVN()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
					
					<!-- thoi gian khoi hanh -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigiankhoihanh" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
							<input type="text" required
									id="timeOfDeparture" name="timeOfDeparture"
									onclick="gtCalendar('timeOfDeparture')"
									value="<%= Validator.isNotNull(tempDoc.getShipDateFrom()) ? FormatData.parseDateToTringType3(tempDoc.getShipDateFrom()) : (Validator.isNotNull(generalDeclaration.getDateOfArrival()) ? FormatData.parseDateToTringType3(generalDeclaration.getDateOfArrival()) : StringPool.BLANK) %>">
						</td>
					</tr>
					
					<!-- ngay cap giay phep -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.ngaycapgiayphep" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
							<input type="text" required
									id="dateOfSign"
									name="dateOfSign"
									onclick="gtCalendar('dateOfSign')"
									value="<%= Validator.isNotNull(perForTransitEdit.getDateOfSign()) ? FormatData.parseDateToTringType3(perForTransitEdit.getDateOfSign()) :FormatData.parseDateToTringType3(new Date())%>">
						</td>
					</tr>
				</thead>
			</table>
		</div>
		
		<!---------------------------  COLUMN 2 --------------------------->
		<div class="tbl_left boxlabel" style="width: 49.99%">
			<table class="table_noboder">
				<thead>
					<!-- so luong hanh khach -->
					<input type="text" name="passengerNumber" id="passengerNumber" value="<%=Validator.isNotNull(tempNoticeShip.getPassengerNumber()) ? tempNoticeShip.getPassengerNumber() : StringPool.BLANK%>" hidden="true">
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
						<td class="text-leftu" colspan="2">
							<input type="text" hidden="true" name="stateCode" id="stateCode" value="<%=tempDoc.getStateCode()%>">
							<input type="text" style="width: 98%" class="egov-inputfield"
									readonly="readonly"
									value="<%=Validator.isNotNull(dmState.getStateName()) ? dmState.getStateName() : tempDoc.getStateCode()%>">
						</td>
					</tr>
					
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.gt" /></th>
						<td class="text-leftu" colspan="2">
							<input type="text" name="grt" id="grt" value="<%=tempDoc.getGrt()%>" hidden="true">
							
							<%
							String unitGrt = tempDoc.getUnitGRT();
							for (DmUnitGeneral item : units) {
								if (item.getUnitCode().trim().equalsIgnoreCase(tempDoc.getUnitGRT())) {
									unitGrt = item.getUnitName();
									break;
								}
							}
							%>
							<input type="text" style="width: 98%" class="egov-inputfield"
									readonly="readonly"
									value="<%= tempDoc.getGrt() + " " + unitGrt%>">
						</td>
					</tr>
					
					<!-- cang lam thu tuc qua canh -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.canglamthutucquacanh" /></th>
						<td class="text-leftu" colspan="2">
							<input type="text" hidden="true"
									id="portofAuthority"
									name="portofAuthority"
									value="<%=tempDoc.getMaritimeCode().trim()%>">
							<input type="text" readonly="readonly"
									id="portofAuthority"
									name="portofAuthority"
									value="<%=Validator.isNotNull(maritime.getMaritimeNameVN()) ? maritime.getMaritimeNameVN() : tempDoc.getMaritimeCode()%>">
						</td>
					</tr>

					<!-- so luong thuyen vien -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluongthuyenvien" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" colspan="2">
							<input type="text" hidden="true"
									name="numberOfCrews" id="numberOfCrews"
									value="<%=Validator.isNotNull(tempNoticeShip.getCrewNumber()) ? tempNoticeShip.getCrewNumber() : StringPool.BLANK%>">
							<input type="text" style="width: 98%" class="egov-inputfield"
									readonly="readonly"
									value="<%=Validator.isNotNull(tempNoticeShip.getCrewNumber()) ? tempNoticeShip.getCrewNumber() + " Pers" : StringPool.BLANK%>">
						</td>
					</tr>
					
					
					
					<!-- so luong loai hang hoa qua canh -->
					<tr hidden="true">
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluong" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<%
							String sVolumeTransitCargo = "";
							if (Validator.isNotNull(perForTransitEdit.getVolumeCargo())) {
								sVolumeTransitCargo = perForTransitEdit.getVolumeCargo() + "";
							} else {
								sVolumeTransitCargo = Validator.isNotNull(tempNoticeShip.getQuantityAndTypeOfCargo()) ? tempNoticeShip.getQuantityAndTypeOfCargo() : StringPool.BLANK;
							}
							
							String sCargoUnit = Validator.isNotNull(perForTransitEdit.getCargoUnit()) ? perForTransitEdit.getCargoUnit() : tempNoticeShip.getUnitQuantityofCargo() ;
							%>
							<input type="text" required style="width: 52.2%" class="egov-inputfield"
									value="<%= sVolumeTransitCargo %>"
									name="volumeTransitCargo"
									id="volumeTransitCargo">
								
							<select name="unitVolumeTransitCargo" id="unitVolumeTransitCargo" style="width: 45%">
								<%for (DmUnitGeneral unit : units) {%>
									<option
										<%=unit.getUnitCode().equalsIgnoreCase(sCargoUnit) ? "selected" : "" %>
										value="<%=unit.getUnitCode()%>"><%=unit.getUnitName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
					<!-- Duoc phep qua canh den, dl tu dm_quoc_gia, dm_state -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.duocphepquacanhden" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						
						<td class="text-leftu" colspan="2">
						<%
						List<DmState> lstState = DmStateLocalServiceUtil.getAllOrderByName();
						String sPermittedTransitTo = Validator.isNotNull(perForTransitEdit.getPermittedTransitTo()) ? perForTransitEdit.getPermittedTransitTo() : lstState.get(0).getStateCode();
						%>
							<input  hidden="true"
									id=permittedTransitTo
									name="permittedTransitTo" 
									value="<%=sPermittedTransitTo%>" />
							
							<select id="holdPermittedTransitTo" name="holdPermittedTransitTo">
								<%for (DmState state : lstState) {%>
									<option <%=state.getStateCode().equalsIgnoreCase(sPermittedTransitTo) ? "selected" : "" %>
										value="<%=state.getStateCode()%>"><%=state.getStateName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
					
					
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.thoigianhieuluc" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" colspan="2">
							<%
							String thoiGianHieuLuc = Validator.isNotNull(tempDoc.getShipDateFrom()) ? 
									DateUtils.getAfterNumberOfDayAgrument(tempDoc.getShipDateFrom(), 1) : 
									(Validator.isNotNull(generalDeclaration.getDateOfArrival()) ? 
											DateUtils.getAfterNumberOfDayAgrument(generalDeclaration.getDateOfArrival(), 1) : DateUtils.getAfterNumberOfDayAgrument(new Date(), 1));
							%>
						
							<input type="text" required
									id="validUntil" name="validUntil"
									onclick="gtCalendar('validUntil')"
									value="<%=Validator.isNotNull(perForTransitEdit.getValidUntil()) ? FormatData.parseDateToTringType3(perForTransitEdit.getValidUntil()) : thoiGianHieuLuc%>">
						
						</td>
					</tr>
					
					<!-------------------- giay phep so -------------------->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.giayphepso" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" colspan="2">
						<!--  ?? IssuePortClearanceLocalServiceUtil.capGiayPhepSo(maritime.getMaritimeReference()) -->
							<input type="text" required style="width: 52.2%" class="egov-inputfield"
									name="certificateNo"
									id="certificateNo"
									value="<%=Validator.isNotNull(perForTransitEdit.getCertificateNo()) ?
											ConvertUtil.splitString(perForTransitEdit.getCertificateNo()) :
											StringPool.BLANK%>">
								
							<input type="text" readonly="readonly" style="width: 45%"
									id="unitCertificateNo"
									name="unitCertificateNo"
									value="<%=Validator.isNotNull(maritime.getMaritimeReference()) ? maritime.getMaritimeReference() : StringPool.BLANK %>">
						</td>
					</tr>
					
					<!-- dai dien cang vu -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.daidiencangvu" /></th>
						<td class="text-leftu">
							<%
								String sRepresentative = Validator.isNotNull(perForTransitEdit.getRepresentative()) ? perForTransitEdit.getRepresentative() : StringPool.BLANK;
								List<DmRepresentative> dmRepresentatives = new ArrayList<DmRepresentative>();
								if (userPort != null) {
									//thuoc mot cang vu, nhung ko co dai dien default, hoac co dai dien size > 0
									if (Validator.isNotNull(userPort.getPortCode())) {
										dmRepresentatives = DmRepresentativeLocalServiceUtil.findByMaritimeCode(userPort.getPortCode());
									}
									if (dmRepresentatives == null) { dmRepresentatives = new ArrayList<DmRepresentative>(); }
								} else {
									//ko thuoc cang vu nao
									dmRepresentatives = DmRepresentativeLocalServiceUtil.getDmRepresentatives(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
								}
							%>
							<select id="representative" name="representative" style="width: 98%">
								<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>
								<%for (DmRepresentative item : dmRepresentatives) {
									if (item.getRepLevel() == 1 || item.getRepLevel() == 2 ) {
								%>
									<option value="<%=item.getRepName()%>" <%=item.getRepName().equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%=item.getRepName()%></option>
								<%} }%>
							</select>
						</td>
					</tr>
					
					<tr hidden="true">
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.version" /></th>
						<td class="text-leftu">
							<%
							String iVersionNo = "";
							if (capPerForTransit.length() > 0) {
								iVersionNo = (countPerForTransit + 1) + "";
							} else {
								iVersionNo = Validator.isNotNull(perForTransitEdit.getVersionNo()) ? perForTransitEdit.getVersionNo() : 1 + "";
							}
							%>
							<input type="text" readonly="readonly"
									id="versionNo" name="versionNo"
									value="<%= iVersionNo%>">
						</td>
					</tr>
				</thead>
			</table>
		</div>
	</div>
<script type="text/javascript">
	$(document).ready(function() {
		$('#holdPermittedTransitTo').change(function(event) {
			var code = $("select#holdPermittedTransitTo").val();
			$("input[id=permittedTransitTo]").val(code);
		});

		$('#holdPermittedTransitFrom').change(function(event) {
			var code = $("select#holdPermittedTransitFrom").val();
			$("input[id=permittedTransitFrom]").val(code);
		});
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
								
								<% for(DmDataItem item : cargoType) {%>
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

