<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiXuatCanh"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPassengerDetails"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPassengerList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewDetailsLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPassengerDetailsLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewDetails"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewList"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmRepresentative"%>
<%@page import="vn.gt.constant.Constants"%>
<%@page import="java.util.Random"%>
<%@page import="vn.gt.utils.ConvertUtil"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmDataItemImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDataItem"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmGoodsTypeImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmGoodsTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmGoodsType"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmUnitGeneralImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempCargoItemsImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCargoItemsLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCargoItems"%>

<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="vn.gt.dao.danhmuc.service.DmUnitGeneralLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmUnitGeneral"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortHarbour"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.ArrayList"%>

<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortWharf"%>
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
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssuePortClearanceImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssueAcceptanceImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueAcceptance"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
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
	
	
	//Thong bao moi nhat
	
	TempGeneralDeclaration banKhaiChungLast = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (Validator.isNull(banKhaiChungLast)) { banKhaiChungLast = new TempGeneralDeclarationImpl(); }
	
	DmGoodsType dmGoodsType = DmGoodsTypeLocalServiceUtil.getByGoodsTypeCode(banKhaiChungLast.getCargo().trim());
	/* if (Validator.isNull(dmGoodsType)) {
		dmGoodsType = new DmGoodsTypeImpl();
	} */
	
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
	
	DmPort cangRoiLast = DmPortLocalServiceUtil.getByPortCode(tempDoc.getPortCode().trim());
	if (Validator.isNull(cangRoiLast) || tempDoc.getPortCode().trim().length() == 0) { cangRoiLast = new DmPortImpl(); }
	
	List<DmUnitGeneral> units = DmUnitGeneralLocalServiceUtil.getDmUnitGenerals(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (Validator.isNull(units)) { units = new ArrayList<DmUnitGeneral>(); }
	
	DmUnitGeneral dmUnitGeneral = DmUnitGeneralLocalServiceUtil.getByUnitCode(banKhaiChungLast.getCargoUnit());
	if (Validator.isNull(dmUnitGeneral)) {
		dmUnitGeneral = new DmUnitGeneralImpl();
	}
	
	DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDoc.getMaritimeCode());
	if (Validator.isNull(maritime)) { maritime = new DmMaritimeImpl(); }
	
	//PortHarbour la ben cang,
	List<DmPortHarbour> lstPortHarbour = DmPortHarbourLocalServiceUtil.findByPortRegionCode(maritime.getMaritimeCode());
	if (Validator.isNull(lstPortHarbour)) { lstPortHarbour = new ArrayList<DmPortHarbour>(); }
	
	//PortWharf la cau cang
	List<DmPortWharf> lstPortWharf = null;
	if (Validator.isNotNull(tempDoc.getPortRegionCode())) {
		if (lstPortHarbour.size() > 0) {
			if (Validator.isNotNull(banKhaiChungLast.getPortHarbourCode())) {
				lstPortWharf = DmPortWharfLocalServiceUtil.findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(tempDoc.getPortRegionCode(), banKhaiChungLast.getPortHarbourCode(), KeyParams.ORDER_BY_ASC);
			} else {
				lstPortWharf = DmPortWharfLocalServiceUtil.findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(tempDoc.getPortRegionCode(), lstPortHarbour.get(0).getPortHarbourCode(), KeyParams.ORDER_BY_ASC);
			}
			
		}
	}
	
	// Sua giay phep vao cang PTTND
	IssueAcceptance AcceptanceEdit = null;
	if(Validator.isNotNull(requestCodethuTuc)) {
		AcceptanceEdit = IssueAcceptanceLocalServiceUtil.getByRequestCode(requestCodethuTuc);
	}
	
	if (requestCodethuTuc.trim().length() == 0)	{ AcceptanceEdit = new IssueAcceptanceImpl(); }
	if (Validator.isNull(AcceptanceEdit)) { AcceptanceEdit = new IssueAcceptanceImpl(); }
	
	if (Validator.isNotNull(AcceptanceEdit.getPortHarbourCode())) {
		lstPortWharf = DmPortWharfLocalServiceUtil.findByPortHarbourCodeOrNull(AcceptanceEdit.getPortHarbourCode(), KeyParams.ORDER_BY_ASC);
	}
	int countAcceptance = IssueAcceptanceLocalServiceUtil.countByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	
	String capAcceptance = ParamUtil.getString(request, PageType.LAN_CAP_ISSUE_ACCEPTANCE);
	
	String lyDoCapLaiGiayPhep = ParamUtil.getString(request, PageType.HUY_HO_SO);

	List<Map<String, String>> listCargoItems = new ArrayList<Map<String, String>>();
	
	List<DmDataItem> portMaritime = DmDataItemLocalServiceUtil.findByDataGroupIdAndNode1(Constants.DM_PORT_MARITIME, tempDoc.getMaritimeCode());
	if (Validator.isNull(portMaritime)) { portMaritime = new ArrayList<DmDataItem>(); }
	
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
		
	
		
	
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===request_ThuTuc======" + requestCodethuTuc);
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===count_Acceptance=" + countAcceptance);
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===cap_Acceptance===" + capAcceptance);
	LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===lyDoCapLaiGiayPhep===" + lyDoCapLaiGiayPhep);
%>

<script type="text/javascript">var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;">GIẤY PHÉP VÀO CẢNG (Cho phương tiện thủy nội địa)</div>
<div class="AccordionPanelContent">

	<!--------------------------------- COLUMN 1  --------------------------------->
	<div class="tbl_left boxlabel" style="width: 45%">
		<table class="table_noboder">
			<thead>
				<tr>
					<input type="text" hidden="true" name="maritimeCode" value="<%=tempDoc.getMaritimeCode()%>">
					<input type="text" hidden="true" name="stateCode" value="<%=tempDoc.getStateCode()%>">
					<input type="text" hidden="true" id="idAcceptance" name="idAcceptance" value="<%=Validator.isNotNull(AcceptanceEdit.getId()) ? AcceptanceEdit.getId() : StringPool.BLANK%>">
					<input type="text" hidden="true" id="requestCodeAcceptance" name="requestCodeAcceptance" value="<%=Validator.isNotNull(AcceptanceEdit.getRequestCode()) ? AcceptanceEdit.getRequestCode() : UUID.randomUUID().toString()%>">
					<input type="text" hidden="true" id="numberAcceptance" name="numberAcceptance" value="<%=Validator.isNotNull(AcceptanceEdit.getNumberPortClearance()) ? AcceptanceEdit.getNumberPortClearance() : String.valueOf(new Random().nextInt(100000))%>">
					<input type="text" hidden="true" id="lyDoCapLaiAcceptance" name="lyDoCapLaiAcceptance" value="<%=lyDoCapLaiGiayPhep%>">
					
					<%
					String tenTau = tempDoc.getShipName();
					
					if (AcceptanceEdit.getNameOfShip().equalsIgnoreCase(tempDoc.getShipName()) )
					{
						tenTau = tempDoc.getShipName();
					}else if (AcceptanceEdit.getNameOfShip().length() > 0)
					{
						tenTau = AcceptanceEdit.getNameOfShip();						
					}
					LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===tenTau======" + tenTau);
					LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===AcceptanceEdit.getNameOfShip()======" + AcceptanceEdit.getNameOfShip());
					LogFactoryUtil.getLog(ThuTucAction.class).info("===/pttnd_tao_giay_phep_vao_cang.jsp===tempDoc.getShipName()======" + tempDoc.getShipName());
					%>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.tentau" /></th>
					<td class="text-leftu">
						<input type="text" class="egov-inputfield" style="width: 98%"
								name="nameOfship" id="nameOfship" value="<%=tenTau%>">
					</td>
				</tr>
				
				<tr>
					<!-- tau noi dia, always quoc tich:VN -->
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
					<%
					List<DmState> lstState = DmStateLocalServiceUtil.getDmStates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					if (lstState != null && lstState.size() > 0) {
						for (DmState state:lstState) {
							if ("VN".equals(state.getStateCode())) {
								%>
								<td class="text-leftu" colspan="2">
									<input type="text" hidden="true" name="flagStateOfShip_Name" id="flagStateOfShip_Name" value="<%=state.getStateCode()%>">
									<input type="text" style="width: 98%" class="egov-inputfield" readonly="true" value="<%=state.getStateName()%>">
								</td>
								<%
							break;
							}
						}
					}
					%>
				</tr>	
				
				<!-- ho hieu tau la id primary key -->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.sodangky" /></th>
					<td class="text-leftu" colspan="2">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="true"
								name="callSign" id="callSign"
								value="<%=Validator.isNotNull(tempDoc.getCallSign()) ? tempDoc.getCallSign() : StringPool.BLANK%>">
					</td>
				</tr>
				
				<!-- gt  -->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.gt" /></th>
					<td class="text-leftu">
					<%
					double gpvcDWT = 0;
					double gpvcGRT = 0;
					if (tempDoc.getDwt() > 0 )
					{
						gpvcDWT = tempDoc.getDwt();
					}else if (AcceptanceEdit.getDwt() > 0 )
					{
						gpvcDWT = AcceptanceEdit.getDwt();
					}
					
					
					if (tempDoc.getGrt() > 0 )
					{
						gpvcGRT = tempDoc.getGrt();
					}else if (AcceptanceEdit.getGt() > 0 )
					{
						gpvcGRT = AcceptanceEdit.getGt();
					}
					
						
						if ((tempDoc.getDocumentTypeCode().equals("6") || tempDoc.getDocumentTypeCode().equals("7")) && (tempDoc.getShipTypeCode().equals("SMS")))
						{
						%>
						<input type="text" style="width: 98%" class="egov-inputfield"
								name="grt" id="grt" 
								value="<%=(gpvcGRT > 0) ? gpvcGRT : StringPool.BLANK%>">
						<%
						}
						else 
						{
						%>
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
								name="grt" id="grt" 
								value="<%=(gpvcGRT > 0) ? gpvcGRT : StringPool.BLANK%>">	
						<%
						}
						%>
						
					</td>
				</tr>
				<!-- dwt  -->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.trongtaitoanphan" /></th>
					<td class="text-leftu">
					<%
						if ((tempDoc.getDocumentTypeCode().equals("6") || tempDoc.getDocumentTypeCode().equals("7")) && (tempDoc.getShipTypeCode().equals("SMS")))
						{
						%>
						<input type="text" style="width: 98%" class="egov-inputfield"
								name="dwt" id="dwt" 
								value="<%=(gpvcDWT > 0) ? gpvcDWT : StringPool.BLANK%>">
						<%
						}
						else 
						{
						%>
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
								name="dwt" id="dwt" 
								value="<%=(gpvcDWT > 0) ? gpvcDWT : StringPool.BLANK%>">	
						<%
						}
						%>
						
					</td>
				</tr>
				
				<!-- ten thuyen truong -->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.tenthuyentruong" /></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" class="egov-inputfield" readonly="readonly"
								name="nameOfMaster" id="nameOfMaster"
								value="<%=tempDoc.getShipCaptain()%>">
					</td>
				</tr>
				
				<!-- so luong thuyen vien -->
				<tr style="display: none;">
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.soluongthuyenvien" /></th>
					<td class="text-leftu" colspan="2">
						<%
						/* List<TempCrewList> tempCrewList = null;						
						tempCrewList = TempCrewListLocalServiceUtil.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear); 
						
						List<TempCrewDetails> lstTempCrewDetails = null;
						if (tempCrewList != null && tempCrewList.size() > 0) {
							TempCrewList tmpCrewList = tempCrewList.get(0);
							
							lstTempCrewDetails = TempCrewDetailsLocalServiceUtil.findByRequestCode(tmpCrewList.getRequestCode());
						} */
						
						List<TempCrewDetails> lstTempCrewDetails = null;						
						TempCrewList tmpCrewList = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
						if (tmpCrewList != null  && tmpCrewList.getRequestCode().length() > 0) {
							lstTempCrewDetails = TempCrewDetailsLocalServiceUtil.findByRequestCode(tmpCrewList.getRequestCode());
						}
						%>
					
						<input readonly="readonly" type="text" name="numberOfCrews" id="numberOfCrews" style="width: 48%"
								value="<%= (AcceptanceEdit.getNumberOfCrews() > 0) ? AcceptanceEdit.getNumberOfCrews() : (Validator.isNotNull(lstTempCrewDetails) ? lstTempCrewDetails.size() : StringPool.BLANK)%>"/>
						
						<input type="text" style="width: 48.7%" readonly="readonly"
								id="unitNumberOfCrews"
								name="unitNumberOfCrews"
								value="Người">
						
						
					</td>
				</tr>
				
				<!-- so luong hanh khach -->
				<tr>
					<%
					/* List<TempPassengerList> tempPassengerList = null;
					tempPassengerList = TempPassengerListLocalServiceUtil.findByDocumentNameAndDocumentYearOrderByDescRequestDate(FormatData.convertToLong(documentName), documentYear);
					 
					List<TempPassengerDetails> lstTempPassengerDetails = null;
					if(tempPassengerList != null && tempPassengerList.size() > 0)
					{
						TempPassengerList tmpPassengerList = tempPassengerList.get(0);
						lstTempPassengerDetails = TempPassengerDetailsLocalServiceUtil.findByRequestCode(tmpPassengerList.getRequestCode());
					} */
					List<TempPassengerDetails> lstTempPassengerDetails = null;
					TempPassengerList tmpPassengerList = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
					if (tmpPassengerList != null  && tmpPassengerList.getRequestCode().length() > 0) {		
						lstTempPassengerDetails = TempPassengerDetailsLocalServiceUtil.findByRequestCode(tmpPassengerList.getRequestCode());
					}
					%>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.soluonghanhkhach" /></th>
					<td class="text-leftu" >
						
						<%
						if ((tempDoc.getDocumentTypeCode().equals("6") || tempDoc.getDocumentTypeCode().equals("7")) && (tempDoc.getShipTypeCode().equals("SMS")))
						{
						%>
						<input type="text" style="width: 48.7%" 
								name="numberOfPassengers" id="numberOfPassengers"
								value="<%= (AcceptanceEdit.getNumberOfPassengers() > 0) ? AcceptanceEdit.getNumberOfPassengers() : (Validator.isNotNull(lstTempPassengerDetails) ? lstTempPassengerDetails.size() : StringPool.BLANK)%>"/>
						<%
						}
						else 
						{
						%>
						<input type="text" style="width: 48.7%" readonly="readonly"
								name="numberOfPassengers" id="numberOfPassengers"
								value="<%= (AcceptanceEdit.getNumberOfPassengers() > 0) ? AcceptanceEdit.getNumberOfPassengers() : (Validator.isNotNull(lstTempPassengerDetails) ? lstTempPassengerDetails.size() : StringPool.BLANK)%>"/>	
						<%
						}
						%>
						<input type="text" style="width: 48.7%" readonly="readonly"
								id="unitNumberOfPassengers"
								name="unitNumberOfPassengers"
								value="Người">
						
						
					</td>
				</tr>
				
				<!-- loai hang hoa -->
				<tr hidden="true">
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.loaihanghoa" /></th>
					<td class="text-leftu">
						<select name="typeOfCargo" id="typeOfCargo">
						<%
						String sLoaiHangHoa = "";
						List<DmGoodsType> lstDmGoodType = DmGoodsTypeLocalServiceUtil.getDmGoodsTypes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
						if(lstDmGoodType != null && lstDmGoodType.size() > 0){
							String cargo = (AcceptanceEdit.getCargo().trim().length() > 0) ? AcceptanceEdit.getCargo().trim() : banKhaiChungLast.getCargo().trim();
							
							if(cargo != null){
								for(DmGoodsType goodTypeItem: lstDmGoodType){
									String goodTypeCode = goodTypeItem.getGoodsTypeCode();
									sLoaiHangHoa = goodTypeCode.equalsIgnoreCase(cargo)? goodTypeItem.getGoodsTypeNameVN() : goodTypeItem.getGoodsTypeName();
									%>
									<option value="<%=goodTypeCode%>" <%=goodTypeCode.trim().equalsIgnoreCase(cargo) ? "selected" : "" %>><%=goodTypeItem.getGoodsTypeNameVN() %></option>
									<%
								}
							}else{
								%>
									<option value="LUA_CHON" selected>--- LỰA CHỌN --- </option>
								<%
								for(DmGoodsType goodTypeItem: lstDmGoodType){
									String goodTypeCode = goodTypeItem.getGoodsTypeCode();
									%>
									<option value="<%=goodTypeCode%>"><%=goodTypeItem.getGoodsTypeNameVN() %></option>
									<%
								}
							}
						}
						
							
						%>
						</select>
						
					
					</td>
				</tr>
				
				<!-- so luong loai hang hoa-->
				<tr hidden="true">
					<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluong" /></th>
					<td class="text-leftu">
						<input type="text" style="width: 48%" class="egov-inputfield"
								name="volumeCargo" id="volumeCargo"
								value="<%= (Validator.isNotNull(banKhaiChungLast.getVolumeCargo()) ? banKhaiChungLast.getVolumeCargo() : banKhaiChungLast.getVolumeCargo())%>">
						
						<select name="unitVolumeCargo" id="unitVolumeCargo"  style="width: 48.7%">
						<%
						String sUnit = "";
						List<DmUnitGeneral> lstDmUnitGeneral = DmUnitGeneralLocalServiceUtil.getDmUnitGenerals(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
						if(lstDmUnitGeneral != null && lstDmUnitGeneral.size() > 0){
							String unitType = (AcceptanceEdit.getCargoUnit().trim().length() > 0) ? AcceptanceEdit.getCargoUnit().trim() : banKhaiChungLast.getCargoUnit().trim();
							if(unitType != null && unitType.length() > 0){
								for(DmUnitGeneral unitGeneral: lstDmUnitGeneral){
									String unitTypeCode = unitGeneral.getUnitCode().trim();
									sUnit = unitTypeCode.equalsIgnoreCase(unitType)? unitGeneral.getUnitName() : unitGeneral.getUnitName();
									%>
									<option value="<%=unitTypeCode%>" <%=unitTypeCode.trim().equalsIgnoreCase(unitType) ? "selected" : "" %>><%=unitGeneral.getUnitName() %></option>
									<%
								}
							}else{
								%>
									<option value="LUA_CHON" selected>--- LỰA CHỌN --- </option>
								<%
								for(DmUnitGeneral unitGeneral: lstDmUnitGeneral){
									String unitTypeCode = unitGeneral.getUnitCode();
									%>
									<option  value="<%=unitTypeCode%>"><%=unitGeneral.getUnitName() %></option>
									<%
								}
							}
						}					
							
						%>
						</select>
						
					</td>
				</tr>
			</thead>
		</table>
	</div>
	
	<div class="tbl_left boxlabel" style="width: 10%">
	</div>
	
	<!----------- COLUMN 2 ----------->
	<div class="tbl_left boxlabel" style="width: 45%">
		<table class="table_noboder">
			<thead>				
				
				<!-- CANG DEN - CANG ROI --- x-->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.gpvaocangbien" /></th>
					<td class="text-leftu" colspan="2">
						<%
						if (Validator.isNotNull(tempDoc.getPortRegionCode())) {
							DmPortRegion vaocangbien = DmPortRegionLocalServiceUtil.getByPortRegionCode(tempDoc.getPortRegionCode().trim());
							if (Validator.isNull(vaocangbien) || tempDoc.getPortRegionCode().trim().length() == 0) { vaocangbien = new DmPortRegionImpl(); }
						
							%>
							<%
						if ((tempDoc.getDocumentTypeCode().equals("6") || tempDoc.getDocumentTypeCode().equals("7")) && (tempDoc.getShipTypeCode().equals("SMS")) )
						{
						%>							
							<!--<input type="text" style="width: 98%" class="egov-inputfield" id="portCode" name="portCode" value="<%=tempDoc.getPortRegionCode()%>"> -->
							<select class="form-control " 
							id="portCode" name="portCode">
								<option value="">--- Lựa chọn ---</option>
								
								<% for(DmDataItem item : portMaritime) {%>
									<option value="<%= item.getDescription() %>" ><%= item.getName() %></option>
								<%} %>
							</select>
						<%
						}
						else 
						{
						%>
							<input type="hidden" id="portCode" name="portCode" value="<%=vaocangbien.getPortCode()%>">
							<input type="text" style="width: 98%" class="egov-inputfield" readonly="true" value="<%=vaocangbien.getPortCode()%>">	
						<%
						}
						%>
							
							
						<%} else {%>
							<select id="portCode" name="portCode" style="width: 98%">
								<%for (DmPort port : ports) {%>
									<option <%=port.getPortCode().trim().equalsIgnoreCase(tempDoc.getPortCode()) ? "selected" : ""%>
										value="<%=port.getPortCode()%>" ><%=port.getPortName()%></option>
								<%}%>
							</select>
						<%}%>
					</td>
				</tr>
				
				<!-- Di chuyen toi -->
					<!-- ben cang -->
					<tr>
						<th class="text-left" width="30%">Bến cảng&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<%
							String comparatorHarbourCode = Validator.isNotNull(AcceptanceEdit.getPortHarbourCode()) ?
									AcceptanceEdit.getPortHarbourCode() :
								(Validator.isNotNull(banKhaiChungLast.getPortHarbourCode()) ? 
										banKhaiChungLast.getPortHarbourCode() : "");
								
							%>
							<input type="text" hidden="true" id="portHarbourCode" name="portHarbourCode" value="<%=comparatorHarbourCode%>">
									
							<select id="holdPortHarbourCode" name="holdPortHarbourCode" style="width: 98%" onchange="onClickSelectHoldPortHarbourCode()">
								<%if (Validator.isNull(banKhaiChungLast.getPortHarbourCode()) ||
									((banKhaiChungLast.getPortHarbourCode() != null) && (banKhaiChungLast.getPortHarbourCode().length() == 0)) ) {%>
									<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
								<%}%>
								<%for (DmPortHarbour item : lstPortHarbour) {%>
									<option <%=item.getPortHarbourCode().equalsIgnoreCase(comparatorHarbourCode) ? "selected" : "" %>
										value="<%=item.getPortHarbourCode()%>" ><%=item.getPortHarbourName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
					<!-- cau cang -->
					<tr>
						<th class="text-left" width="30%">Cầu cảng&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
						<%
						String comparatorPortWharfCode = Validator.isNotNull(AcceptanceEdit.getPortWharfCode()) ?
								AcceptanceEdit.getPortWharfCode() : 
								(Validator.isNotNull(banKhaiChungLast.getPortWharfCode()) ?
										banKhaiChungLast.getPortWharfCode() : "");
										
						%>
						
							<input type="text" hidden="true" id="portWharfCode" name="portWharfCode" value="<%=comparatorPortWharfCode%>">
									
							<select id="holdPortWharfCode" name="holdPortWharfCode" style="width: 98%">
								<%if (Validator.isNull(banKhaiChungLast.getPortWharfCode()) ||
										((banKhaiChungLast.getPortWharfCode() != null) && (banKhaiChungLast.getPortWharfCode().length() == 0)) ) {%>
									<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
								<%}%>
								<%for (DmPortWharf item : lstPortWharf) {%>
									<option <%=item.getPortWharfCode().equalsIgnoreCase(comparatorPortWharfCode) ? "selected" : "" %>
										value="<%=item.getPortWharfCode()%>" ><%=item.getPortWharfNameVN() + "&nbsp;-&nbsp;" + item.getPortCode()%></option>
								<%}%>
							</select>
						</td>
					</tr>
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
					String sTimeOfValidUntil = "";	
					if (Validator.isNotNull(AcceptanceEdit.getTimeOfDeparture())) {
						sTimeOfDeparture = FormatData.parseDateToTringType3(AcceptanceEdit.getTimeOfDeparture());
						sTimeOfValidUntil = FormatData.parseDateToTringType3(AcceptanceEdit.getValidUntil());						
					} else {
						sTimeOfDeparture = FormatData.parseDateToTringType3(Validator.isNotNull(dateofarrival.getDateOfArrival()) ? dateofarrival.getDateOfArrival() : new Date());
						sTimeOfValidUntil = FormatData.parseDateToTringType3(Validator.isNotNull(dateofarrival.getSignDate()) ? dateofarrival.getSignDate() : new Date());
					}
					String gpvcDateFrom = "";
					String gpvcDateTo = "";
						
					String thoigianvaocang = StringPool.BLANK;
					thoigianvaocang = FormatData.parseDateToTringType3(tempDoc.getShipDateFrom());
					String thoigianroicang = StringPool.BLANK;
					thoigianroicang = FormatData.parseDateToTringType3(tempDoc.getShipDateTo());
					//System.out.print("======ThoiGian roi cang===  "+ thoigianroicangg );
					
					List<IssueAcceptance> lstTaoOrSuaGiayPhep = IssueAcceptanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(
			       				FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
					
					if (messageType.compareTo(String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)) == 0 &&
							lstTaoOrSuaGiayPhep != null && lstTaoOrSuaGiayPhep.size() == 0 && tempDoc.getDocumentStatusCode() == TrangThaiBanKhaiXuatCanh.DE_NGHI_CAP_GIAY_PHEP) {
						gpvcDateFrom = thoigianvaocang;
						gpvcDateTo = thoigianroicang;
						//System.out.print("======ThoiGian roi cang gprc===  "+ gprc );
						
						
								
					} else {
						gpvcDateFrom = sTimeOfDeparture;
						gpvcDateTo = sTimeOfValidUntil;
						
						//System.out.print("======ThoiGian roi cang gprc===else  "+ gprc );
					}
					
				%>
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.trongthoihan" />&nbsp;Từ ngày&nbsp;<span style="color:#FF0000;">(*)</span></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" required
								id="timeOfDeparture"
								name="timeOfDeparture"
								value="<%=gpvcDateFrom%>"
								onclick="gtCalendar('timeOfDeparture')">
					</td>
				</tr>
				
				<!-- ??? thoi gian hieu luc = thoigianroicang + 24h 1 ngay -->	
				<!-- ??? thoi gian hieu luc = thoigianHIENTAI + 24h 1 ngay -->
				<%
									
					
				%>
				<tr>
					<th class="text-left" width="40%">Đến ngày&nbsp;<span style="color:#FF0000;">(*)</span></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" required="true"
								id="timeOfValidUntil"
								name="timeOfValidUntil"
								value="<%=gpvcDateTo%>"
								onclick="gtCalendar('timeOfValidUntil')">
					</td>
				</tr>
				
				
				
				<!-- giay phep so -->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.giayphepso" />&nbsp;<span style="color:#FF0000;">(*)</th>
					<td class="text-leftu" colspan="2">
						<!--  ?? IssueAcceptanceLocalServiceUtil.capGiayPhepSo(maritime.getMaritimeReference()) -->
						<%
							// Process to display certificateNo
							String displayCertificateNo = ConvertUtil.getValueFromStringList(AcceptanceEdit.getCertificateNo(), "/", 0);
							String displayCertificateNoUnit = ConvertUtil.getValueFromStringList(AcceptanceEdit.getCertificateNo(), "/", 1);
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
								value="<%=!StringPool.BLANK.equals(displayCertificateNoUnit) ? displayCertificateNoUnit : maritimeReference%>">
						
						<%--
						<input type="text" class="egov-inputfield" style="width: 48%"
								name="certificateNo"
								id="certificateNo"
								value="<%=Validator.isNotNull(AcceptanceEdit.getCertificateNo()) ?
										ConvertUtil.splitString(AcceptanceEdit.getCertificateNo()) :
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
				String sTimeOfCertificate = FormatData.parseDateToTringType3(new Date());
				%>
				<tr>
					<th class="text-left" width="40%">Ngày cấp phép&nbsp;<span style="color:#FF0000;">(*)</span></th>
					<td class="text-leftu">
						<input type="text" style="width: 98%" required="true"
								id="issueDate" name="issueDate"
								value="<%=sTimeOfCertificate%>"
								onclick="gtCalendar('issueDate')">
					</td>
				</tr>
				
				
				<!-- CANG DEN, TEMdOCUMENT, LASTPORTcode, danhmuc dmport, cung dong cang roi, ko chinh sua -->
				<!-- install db: nexportofcallcode = lastportcode -->
				<%
				DmPort cangden = DmPortLocalServiceUtil.getByPortCode(Validator.isNotNull(banKhaiChungLast.getLastPortOfCallCode()) ? banKhaiChungLast.getLastPortOfCallCode() : tempDoc.getLastPortCode());
				if (Validator.isNull(cangden)) { cangden = new DmPortImpl(); }
				%>
				<tr style="display: none;">
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.cangden"/></th>
					<td class="text-leftu" >
					
						<input type="text" hidden="true"
								name="nextPortOfCallCode" id="nextPortOfCallCode"
								value="<%=Validator.isNotNull(banKhaiChungLast.getLastPortOfCallCode()) ? banKhaiChungLast.getLastPortOfCallCode() :
									(Validator.isNotNull(tempDoc.getLastPortCode()) ? tempDoc.getLastPortCode() : StringPool.BLANK)%>">
								
						<input type="text" class="egov-inputfield" readonly="true" style="width: 98%"
								value="<%=Validator.isNotNull(cangden.getPortName()) ? cangden.getPortName() : StringPool.BLANK%>">
					</td>
				</tr>
				
				<!-- dai dien cang vu -->
				<tr>
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.kehoach.daidiencangvu" /></th>
					<td class="text-leftu">
						<%
							User userLogin = PortalUtil.getUser(request);
							UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
							String sRepresentative = Validator.isNotNull(AcceptanceEdit.getRepresentative()) ? AcceptanceEdit.getRepresentative() : StringPool.BLANK;
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
								} else {
									%>
									<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>									
									<%
									//thuoc mot cang vu, co dai dien default > 0
									for (DmRepresentative item : lstRepresentative) {
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
					<th class="text-left" width="40%"><liferay-ui:message key="vn.dtt.thutuc.version" /></th>
					<td class="text-leftu">
						<%
						String iVersionNo = "";
						if (capAcceptance.length() > 0) {
							iVersionNo = (countAcceptance + 1) + "";
						} else {
							iVersionNo = Validator.isNotNull(AcceptanceEdit.getVersionNo()) ? AcceptanceEdit.getVersionNo() : 1+"";
						}
						%>
						<input  type="text" id="versionNo" name="versionNo" value="<%=iVersionNo%>">
					</td>
				</tr>
				<tr style="height: 28px" hidden="true">
					<th class="text-left" width="40%">&nbsp;</th>
					<td class="text-leftu">&nbsp;</td>
				</tr>
				
				<tr style="height: 28px">					
					<td class="text-left" colspan="2"><span style="color:#FF0000;">(*) </span><liferay-ui:message key="vn.dtt.thutuc.truongbatbuoc" /></td>
				</tr>
			</thead>
		</table>
	</div>
</div>

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
				<th class="text-uppercase" width="10%">Đơn vị</th>
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
<portlet:actionURL var="findPortWhartByPortRegionAndHarbour" name="findPortWhartByPortRegionAndHarbour"/>
<input type="text" hidden="true" id="sRegionCode" name="sRegionCode" value = "<%=StringUtil.valueOf(tempDoc.getPortRegionCode())%>" />

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

<script type="text/javascript">
var v_url = '<%=findPortWhartByPortRegionAndHarbour.toString()%>';

function onClickSelectHoldPortHarbourCode() {
	
	var regionCode = $('#sRegionCode').val();
	var portHarbourCode = $("select#holdPortHarbourCode").val();
	
	console.log('portRegionCode==' + regionCode);
	console.log('portHarbourCode=' + portHarbourCode);
	
	if (portHarbourCode == "") {
		//var select = $('#holdPortWharfCode');
		//select.find('option').remove();
		//$('<option>').val('').text('---- Lựa chọn ------').appendTo(select);
		return;
	}
	
	$.ajax({
		type : 'GET',
		url : v_url,
		data : {
			portRegionCode : regionCode,
			portHarbourCode : portHarbourCode
		},
		success : function(data) {
			console.log('=(2)==thanh cong');
			//var data2 = JSON.parse(data);
			//var lstData = JSON.parse(JSON.stringify(data));
			var lstData = JSON.parse(data);
			console.log(lstData);
			
			if (typeof lstData != 'undefined' || typeof lstData != null) {
				if (lstData.length > 0) {
					//xoa du lieu cu trong khu vuc cang
					var select = $('#holdPortWharfCode');
					select.find('option').remove();
					
					//$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
					$("input[id=portWharfCode]").val(lstData[0].id);
					//data of parameter
					$.each(lstData, function(idx, obj) {
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
					});
					
					//mac dinh phan tu index = 0 la selected
					//$('<option selected>').val(data2.id[0]).text(data2.name[0]).appendTo(select);
					//$("input[id=portWharfCode]").val(data2.id[0]);
					console.log('portWharfCode======change==' + $("input[id=portWharfCode]").val());
					
					//chay tu phan tu thu 2
					//for ( var i = 1; i < data2.id.length; i++) {
					//	$('<option>').val(data2.id[i]).text(data2.name[i]).appendTo(select);
					//}
				}
			}
		}, beforeSend: function(data) {
			console.log("=(1)==beforeSend==" + data);
		}, complete: function(data) {
			console.log("=(3) finally==complete==" + data);
		}, error: function(data) {
			console.log("=(2) neu that bai==error==" + data);
		}
	});
}

//ben cang
$(document).ready(function() {
	$('#holdPortHarbourCode').change(function(event) {
		var code = $("select#holdPortHarbourCode").val();
		console.log('holdPortHarbourCode==change==' + code);
		
		$("input[id=portHarbourCode]").val(code);
		console.log('portHarbourCode======change==' + $("input[id=portHarbourCode]").val());
	});
});

//cau cang
$(document).ready(function() {
	$('#holdPortWharfCode').change(function(event) {
		var code = $("select#holdPortWharfCode").val();
		console.log('holdPortWharfCode==change==' + code);
		
		$("input[id=portWharfCode]").val(code);
		console.log('portWharfCode======change==' + $("input[id=portWharfCode]").val());
	});
});
	
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

.hh-table .form-control {
	display: block;
    height: 30px;
    line-height: 1.42857;
    padding: 4px 10px;
    width: 100%;
}
</style>