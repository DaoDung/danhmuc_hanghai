<%@page import="org.apache.poi.ss.formula.functions.Vlookup"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhai"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.tichhop.report.ReportFunction"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortHarbour"%>
<%@page import="vn.gt.dao.result.service.ResultNotificationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultNotification"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmState"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="vn.gt.utils.DateUtils"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultDeclaration"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.lang.Integer"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryState"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultCompetion"%>
<%@page import="vn.gt.dao.result.model.impl.ResultCompetionImpl"%>
<%@page import="vn.gt.dao.result.service.ResultCompetionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/"; </script>
<style>
	.table_noboder img { float:left !important; margin-right:5px; }
</style>
<%
	String loaiThuTuc = "";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
		loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	}
	
	long documentName = FormatData.convertToLong(renderRequest.getParameter(PageType.DOCUMENT_NAME));
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	
	LogFactoryUtil.getLog(KeHoachAction.class).info( "===/xac_nhan_hoan_thanh_thu_tuc_xuat_canh.jsp===documentName==" + documentName + "==documentYear==" + documentYear);
	
	String hoTenLogin=PortalUtil.getUser(request).getFullName();
	List<TempDocument> tempDocuments = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(documentName, documentYear);
	TempDocument tempDoc = null;
	if (tempDocuments != null && tempDocuments.size() > 0) {
		tempDoc = tempDocuments.get(0);
	} else {
		tempDoc = new TempDocumentImpl();
	}
	
	TempGeneralDeclaration banKhaiChungLast = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
	if (Validator.isNull(banKhaiChungLast)) { banKhaiChungLast = new TempGeneralDeclarationImpl(); }

	LogFactoryUtil.getLog(ThuTucAction.class).info("========tempDoc.getStateCode(): " + tempDoc.getStateCode());
	LogFactoryUtil.getLog(ThuTucAction.class).info("========tempDoc.Grt(): " + tempDoc.getGrt());
	
	DmHistoryState dmHisState = DmHistoryStateLocalServiceUtil.getByStateCode(tempDoc.getStateCode());
	String maStCode = "";
	if(dmHisState == null) {
		maStCode = "";
	} else {
		maStCode = dmHisState.getStateCode();
	}
	DmGtStatus dmGtStatus = DmGtStatusLocalServiceUtil.findByStatusCode(tempDoc.getDocumentStatusCode(), MessageType.ROLE_THU_TUC);
	DmPort dmPort = DmPortLocalServiceUtil.getByPortCode(Validator.isNotNull(banKhaiChungLast.getPortOfArrivalCode()) ? banKhaiChungLast.getPortOfArrivalCode() : tempDoc.getPortCode());
	DmHistoryMaritime dmHisMaritime = DmHistoryMaritimeLocalServiceUtil.getByMaritimeCode(tempDoc.getMaritimeCode());
	//PortHarbour la ben cang,
	List<DmPortHarbour> lstPortHarbour = DmPortHarbourLocalServiceUtil.findByPortRegionCode(dmHisMaritime.getMaritimeCode());
	if (Validator.isNull(lstPortHarbour)) { lstPortHarbour = new ArrayList<DmPortHarbour>(); }
	
	ResultCompetion result = ResultCompetionLocalServiceUtil.findByDocumentNameAndDocumentYear(documentName, documentYear);
	if (result == null) {
		result = new ResultCompetionImpl();
	}
	
	Map<Integer, Date> lstDate = new HashMap<Integer, Date>();
	
	lstDate.put(KeyParams.HAI_QUAN, (Validator.isNotNull(result.getResponseTimeHQ()) && result.getResponseStatusHQ() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeHQ() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.BIEN_PHONG, (Validator.isNotNull(result.getResponseTimeBP()) && result.getResponseStatusBP() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeBP() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.HANG_HAI, (Validator.isNotNull(result.getResponseTimeCVHH()) && result.getResponseStatusCVHH() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeCVHH() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	
	String valcongdung   = "";
	String valcaptau     = "";
	String valgiaycnatktvbvmt   = ""; 
	String valgiayphepnhapkhau   = "";
	String valnuocsxmaychinh   = "";
	String valnuocsxmayphu   = "";
	String valvatlieuvo   = "";
	String valnoidongtau   = "";
	String valnamdongtau   = "";
	String valsodangkiem   = "";
	String valkieumayphu   = "";
	String valkieumaychinh   = "";
	
	double valchieudaithietke  = 0.0;
	double valchieudailonnhat   = 0.0;
	double valchieurongthietke   = 0.0;
	double valchieuronglonnhat   = 0.0;
	Integer valsonguoiduocphepcho   = 0;
	double valsuckeoday   = 0.0;
	Integer valsoluongmaychinh   = 0;
	Integer valsoluongmayphu   = 0;
	double valchieucaoman   = 0.0;
	double valchieuchim   = 0.0;
	double valmankho   = 0.0;
	double valtrongtaitoanphan   = 0.0;
	double valdungtichtoanphan   = 0.0;
	double valcongsuatmaychinh   = 0.0;
	double valcongsuatmayphu   = 0.0;
	
	List<Entry<Integer,Date>> lstDateAsc = DateUtils.comparatorDateDesc(lstDate);
	

	LogFactoryUtil.getLog(ThuTucAction.class).info("===xac_nhan_hoan_thanh_cap_nhat_du_lieu_pttnd.jsp/===documentName==" + documentName + "==documentYear==" + documentYear);
	ResultNotification notification = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("05, 99, 9927, 9928, 9929, 9920", documentName, documentYear);
	if (tempDoc.getDocumentStatusCode() == TrangThaiBanKhai.THUTUC_CHO_PHE_DUYET_HOAN_THANH_THU_TUC || tempDoc.getDocumentStatusCode() == TrangThaiBanKhai.THUTUC_YEU_CAU_SUA_DOI_BO_SUNG) {
				
	
		%>
		
		<div style="height:10px"></div>
		<table class="table_noboder">
			<tbody>
			<%
			if (notification != null &&
				(notification.getBusinessTypeCode() == 05 || notification.getBusinessTypeCode() == 9927 || notification.getBusinessTypeCode() == 9928 || notification.getBusinessTypeCode() == 9929 || notification.getBusinessTypeCode() == 9925)) {
				if (notification.getLatestDate() != null && notification.getRemarks().length() > 0) {
					%>
					<tr>
					<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU SỬA ĐỔI BỔ SUNG : <%=Validator.isNotNull(notification.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(notification.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getRemarks()) ? (notification.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : notification.getRemarks()) : StringPool.BLANK %></font></b></td>
					</tr>
					<%
				}
			
				if (notification.getResponseTime() != null) {
					%>
					<tr>
					<td align="center"><b><font color="blue">PHẢN HỒI TỪ CẢNG VỤ : <%=Validator.isNotNull(notification.getOfficerName()) ? notification.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getResponseTime()) ? FormatData.parseDateToTringType3(notification.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getResponse()) ? notification.getResponse() : StringPool.BLANK%></font></b></td>
					</tr>
					<%
				}
			} else if (notification != null && notification.getBusinessTypeCode() == 99) {
				if (notification.getLatestDate() != null && notification.getRemarks().length() > 0) {
					%>
					<tr>
					<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY THỦ TỤC : <%=Validator.isNotNull(notification.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(notification.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getRemarks()) ? (notification.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : notification.getRemarks()) : StringPool.BLANK %></font></b></td>
					</tr>
					<%
				}
				if (notification.getResponseTime() != null) {
					%>
					<tr>
					<td align="center"><b><font color="blue">PHẢN HỒI TỪ CẢNG VỤ : <%=Validator.isNotNull(notification.getOfficerName()) ? notification.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getResponseTime()) ? FormatData.parseDateToTringType3(notification.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getResponse()) ? notification.getResponse() : StringPool.BLANK%></font></b></td>
					</tr>
					<%
				}
			} else if (notification != null && notification.getBusinessTypeCode() == 9920) {
				if (notification.getLatestDate() != null && notification.getRemarks().length() > 0) {
					%>
					<tr>
					<td align="center"><b><font color="red">DOANH NGHIỆP XUẤT TRÌNH : <%=Validator.isNotNull(notification.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(notification.getLatestDate())) : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getRemarks()) ? (notification.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : notification.getRemarks()) : StringPool.BLANK %></font></b></td>
					</tr>
					<%
				}
				if (notification.getResponseTime() != null) {
					%>
					<tr>
					<td align="center"><b><font color="blue">PHẢN HỒI TỪ CẢNG VỤ : <%=Validator.isNotNull(notification.getOfficerName()) ? notification.getOfficerName() : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getResponseTime()) ? FormatData.parseDateToTringType3(notification.getResponseTime()) : StringPool.BLANK%> - <%=Validator.isNotNull(notification.getResponse()) ? notification.getResponse() : StringPool.BLANK%></font></b></td>
					</tr>
					<%
				}
			}
			%>
			</tbody>
		</table>
		<%
	}
	%>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message   key="vn.dtt.thutuc.phanhoicuacoquan" /></div>

<!-- --xac_nhan_hoan_thanh_thu_tuc_xuat_canh.jsp/-----------Kết quả phê duyệt hồ sơ------------------Phản hồi của các cơ quan chuyên ngành---------------- -->

<div class="wd-content-container bgdanhsach">
	<div class="boxnd">
		<table class="wd-table">
			<thead>
				<tr>
					<th><liferay-ui:message key="vn.dtt.thutuc.phanhoicuacoquan" /></th>
					<th><liferay-ui:message key="vn.dtt.thutuc.trangthai" /></th>
					<th><liferay-ui:message key="vn.dtt.thutuc.thoigianpheduyet" /></th>
					<th><liferay-ui:message key="vn.dtt.thutuc.thongbao" /></th>
				</tr>
			</thead>
			
			<%
				if(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThuTuc || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThuTuc){
					for (int i = 0; i < lstDateAsc.size(); i++) {
						if (lstDateAsc.get(i).getKey().compareTo(KeyParams.HANG_HAI) == 0) {
							//hanghai
							%>
							<tr>
								<td class="text-left"><liferay-ui:message key="vn.dtt.thutuc.hanghai" /></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusCVHH()) : ""%></td>
								<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusCVHH()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeCVHH()) : "")%></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseCVHH() : ""%></td>
							</tr>
							<%
						}
					}					
				}else{			
					for (int i = 0; i < lstDateAsc.size(); i++) {
						if (lstDateAsc.get(i).getKey().compareTo(KeyParams.HAI_QUAN) == 0) {
							//haiquan
							%>
							<tr>
								<td class="text-left"><%= i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.haiquan" /></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusHQ()) : ""%></td>
								<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusHQ()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeHQ()) : "")%></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseHQ() : ""%></td>
							</tr>
							<%
						} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.BIEN_PHONG) == 0) {
							//bienphong
							%>
							<tr>
								<td class="text-left"><%= i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.bienphong" /></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusBP()) : ""%></td>
								<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusBP()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeBP()) : "")%></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseBP() : ""%></td>
							</tr>
							<%
						} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.HANG_HAI) == 0) {
							//hanghai
							%>
							<tr>
								<td class="text-left"><%= i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.hanghai" /></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusCVHH()) : ""%></td>
								<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusCVHH()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeCVHH()) : "")%></td>
								<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseCVHH() : ""%></td>
							</tr>
							<%
						}
					}
				}
			%>
		</table>
	</div>
</div>

<div style="height: 10px">&nbsp;</div>

<!--------------------------- ket qua xac nhan --------------------------->
<!-- <div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.ketquaxacnhan" /> </div> -->
<div class="AccordionPanel">
            <div class="AccordionPanelTab"><h4><liferay-ui:message key="vn.dtt.thutuc.ketquaxacnhan" /><img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
                <div class="righttle"></div>
            </div>
            
          

<form id="xacNhanHoanThanhThuTucPTTND" name="xacNhanHoanThanhThuTucPTTND">
	<div class="AccordionPanelContent">
		<div class="tbl_left boxlabel" style="width: 49%">
			<table class="table_noboder">
				<thead>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.cangvu" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu">
							<input type="text" readonly="true"
									name="maritimeCodeName" id="maritimeCodeName"  
									value="<%=Validator.isNotNull(dmHisMaritime) ? dmHisMaritime.getMaritimeNameVN() : tempDoc.getMaritimeCode()%>"/>
						</td>
						<td><input type="hidden" name="maritimeCode" id="maritimeCode" value="<%=tempDoc.getMaritimeCode()%>"></td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tentau" /></th>
						<td class="text-leftu"><input type="text" name="nameOfShip" id="nameOfShip" readonly="true" value="<%=tempDoc.getShipName()%>"/></td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tenthuyentruong" /></th>
						<td class="text-leftu"><input type="text" readonly = "true" name="nameOfMaster" id="nameOfMaster" value="<%=tempDoc.getShipCaptain() %>"/></td>
					</tr>
			<!-- 
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.nhapcang" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu">
							<input type="text" required="true" readonly="true"
								name="portOfArrivalName" id="portOfArrivalName" 
								value="<%=Validator.isNotNull(dmPort) ? dmPort.getPortName() : tempDoc.getPortCode()%>"/>
						</td>
						<td><input type="hidden" name="portOfArrivalCode" id="portOfArrivalCode" value="<%=dmPort.getPortCode()%>"></td>
					</tr>
			-->
					<!-- ben cang -->
					<tr>
							<%
							if(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThuTuc){ 
							%>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.roicangben" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
							<%} else if (MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThuTuc) { %>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.vaocangben" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
							<% }%>
						<td class="text-leftu">
							<%
							String comparatorHarbourCode = Validator.isNotNull(banKhaiChungLast.getPortHarbourCode()) ? banKhaiChungLast.getPortHarbourCode() : "";										
								
								LogFactoryUtil.getLog(KeHoachAction.class).info("===xac_nhan_hoan_thanh_cap_nhat_du_lieu_pttnd.jsp===PortHarbourCode==" + (Validator.isNotNull(banKhaiChungLast.getPortHarbourCode()) ? banKhaiChungLast.getPortHarbourCode() : "==null"));
								LogFactoryUtil.getLog(KeHoachAction.class).info("===xac_nhan_hoan_thanh_cap_nhat_du_lieu_pttnd.jsp===comparatorHarbourCode===" + comparatorHarbourCode);
								
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
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.trangthai" /></th>
						<td class="text-leftu"><input type="text" readonly = "true" name="requestStateName" id="requestStateName"
						value="<%=Validator.isNotNull(dmGtStatus) ? dmGtStatus.getStatusName() : tempDoc.getDocumentStatusCode() %>"/></td>
						<td><input type="hidden" name="requestState" id="requestState" value="<%=dmGtStatus.getStatusCode()%>"></td>
					</tr>
				</thead>
			</table>
		</div>
		
		<div class="tbl_left boxlabel" style="width: 49%">
			<table class="table_noboder">
				<thead>
				<%
					double valGrossTonnage = 0;
					double valNetTonnage = 0;				
					
					if (Validator.isNotNull(banKhaiChungLast)) {
						valGrossTonnage = banKhaiChungLast.getGrossTonnage();
						valNetTonnage = banKhaiChungLast.getNetTonnage();
						
					}
					
					if (result.getCertificateNo() != null && result.getCertificateNo().length() > 0) {
					String [] resultsGet = result.getCertificateNo().trim().split("/");
					if (resultsGet == null || resultsGet.length == 0) {
						resultsGet = new String[1];
						resultsGet[0] = "";
					}
					%>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.sochungnhan" /></th>
						<td class="text-leftu">
						<input type="text" style="width: 60%" readonly="readonly"
								name="certificateNo"
								id="certificateNo"
								value="<%=resultsGet[0]%>">
								
						<input type="text" style="width: 37%" readonly="readonly"
								name="maritimeReference"
								id="maritimeReference" 
								value="<%=dmHisMaritime.getMaritimeReference()%>">
						</td>
					</tr>
				<%} else {
					
				%>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.sochungnhan" /></th>
						<td class="text-leftu">
						<input type="text" name="certificateNo" id="certificateNo" style="width: 60%" value="<%=result.getCertificateNo()%>">
						<input type="text" name="maritimeReference" id="maritimeReference" readonly="true" style="width: 37%" 
						value="<%=Validator.isNotNull(dmHisMaritime) ? dmHisMaritime.getMaritimeReference() : tempDoc.getMaritimeCode()%>">
						</td>
					</tr>
				<%
				}
				%>
				<tr>
					<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
					<td class="text-leftu"><input type="text" readonly="true" name="flagStateOfShip_Name" id="flagStateOfShip_Name" 
						value="<%=Validator.isNotNull(dmHisState) ? dmHisState.getStateName() : tempDoc.getStateCode() %>"/></td>
					<td><input type="hidden" name="flagStateOfShip" id="flagStateOfShip" value="<%=dmHisState.getStateCode()%>"></td>
				</tr>
				
				<tr>
					<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.dungtichtoanphan" /></th>
					<td class="text-leftu">
						<input type="text" name="grossTonnage" id="grossTonnage" value="<%=(valGrossTonnage > 0) ? valGrossTonnage : StringPool.BLANK %>"/>
					</td>
				</tr>
					
					<%if (result.getResponseTimeCVHH() != null) {%>
						<tr>
							<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.thoigianpheduyet" />&nbsp;<font color="red">(*)</font></th>
							<td class="text-leftu">
								<input type="text" name="approvalTime" id="approvalTime" style="width: 98%" required="true" readonly="true"
									value="<%= FormatData.parseDateToTringType3(result.getResponseTimeCVHH()) %>">
							</td>
						</tr>
					<%} else {%>
						<tr>
							<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.thoigianpheduyet" />&nbsp;<font color="red">(*)</font></th>
							<td class="text-leftu">
								<input type="text" name="approvalTime" style="width: 98%" required="true" id="approvalTime"
									value="<%= FormatData.parseDateToTringType3(new Date()) %>"
									onclick="gtCalendar('approvalTime')">
							</td>
						</tr>
					<%}%>
					
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.canbopheduyet" /></th>
						<td class="text-leftu"><input type="text" name="approvalName" id="approvalName" readonly="true"
						value="<%=Validator.isNotNull(result.getApprovalName()) ? result.getApprovalName() : hoTenLogin%>"/>
						</td>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</form>


<div style="height: 10px">&nbsp;</div>

<!----------------------Thong tin doi chieu ho so --------------------------- -->
<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.thongtindoichieu" /></div>
	<div class="AccordionPanelContent">
		<div class="boxnd">
			<table class="table_noboder">
				<thead>
					<tr>
						<h5 style="width: 35%"><liferay-ui:message key="vn.dtt.thutuc.danhsachdoichieu" /></h>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<%
				ResultDeclaration resultDeclaType = null;
				List<ResultDeclaration> resultType = ResultDeclarationLocalServiceUtil.findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(documentName, documentYear);
				if (resultType != null && resultType.size() > 0) {
					for(int i = 0; i < resultType.size(); i++) {
						resultDeclaType = resultType.get(i);
						if (resultDeclaType.getBusinessTypeCode() == 10) {
							%>
							<tr>
								<td style="width: 18%" class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.bankhaianninh" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
								<td style="width: 75%" class="text-left">
									<div align="left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></div>
								</td>
								<%} else {%>
								<td style="width: 75%" class="text-left"><div align="left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></div></td>
								<%}%>
							</tr>
							<%
						}
						
						if (resultDeclaType.getBusinessTypeCode() == 50) {
							%>
							<tr>
								<td style="width: 18%" class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.bankhaichung" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
									<td style="width: 75%" class="text-left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></td>
								<%} else {%>
									<td style="width: 75%" class="text-left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></td>
								<%}%>
							</tr>
							<%
						}
						
						if (resultDeclaType.getBusinessTypeCode() == 51) {
							%>
							<tr>
								<td style="width: 18%" class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.danhsachthuyenvien" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
									<td style="width: 75%" class="text-left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></td>
								<%} else {%>
									<td style="width: 75%"class="text-left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></td>
								<%}%>
							</tr>
							<%
						}
					}
				}
			%>
			</tbody>
		</table>
	</div>
	</div>
</div> 
 
<div class="AccordionPanel" style="display: none;">
            <div class="AccordionPanelTab"><h4>Dữ liệu phương tiện thủy nội địa<img src="<%=request.getContextPath()%>/img/front/next_tle.png" ></h4>
                <div class="righttle"></div>
            </div>
            <!-- the textarea nhap noi dung cua mot so trang thai ho so -->            
            <div class="boxnd" align = "left" id = "goBack" style="display: none;"><br>
            
            <div align = "left" ><br>
            <div class="tbl_left boxlabel" style="width: 48%">
				<table class="table_noboder">
					<thead>					
						<tr>					
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.chuphuongtien" />&nbsp;<font color="red">(*)</font></th>
							<td class="text-leftu">
								<input type="text" style="width: 99%" readonly="true" name="chuphuongtien" id="chuphuongtien"  
										value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getNameOfShipownersAgents() : "---"%>"/>
							</td>						
						</tr>
						<tr>
							<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.diachichuphuongtien" />&nbsp;<font color="red">(*)</font></th>
							<td class="text-leftu"><input type="text" style="width: 99%" name="diachichuphuongtien" id="diachichuphuongtien" readonly="true" value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getShipAgencyAddress() : "---"%>"/></td>
						</tr>
	            	</thead>
				</table>
			</div>
						
			
			<div class="tbl_left boxlabel" style="width: 48%">
				<table class="table_noboder">
					<thead>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.dienthoaichuphuongtien" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu">
							<input type="text" style="width: 99%" readonly="true" name="dienthoaichuphuongtien" id="dienthoaichuphuongtien"  
									value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getShipAgencyPhone() : "---"%>"/>
						</td>						
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.emailchuphuongtien" />&nbsp;</th>
						<td class="text-leftu"><input type="text" style="width: 99%" name="emailchuphuongtien" id="emailchuphuongtien" readonly="true" value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getShipAgencyEmail() : "---"%>"/></td>
					</tr>
					</thead>
				</table>
			</div>
			</div>
			
            <table class="table_noboder">
				<thead>
					<tr>						
						<th style="width: 100%"><liferay-ui:message key="vn.dtt.thutuc.denghiCucDuongThuyNoiDiaVN" /></th>												
					</tr>
					
				</thead>
				<tbody>
				</tbody>
			</table>
			
			<div align = "left" ><br>	
			<div class="tbl_left boxlabel" style="width: 48%">
			<table class="table_noboder">
				<thead>
				
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.tenphuongtien" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu">
							<input type="text" style="width: 99%" readonly="true" name="tenphuongtien" id="tenphuongtien"  
									value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getNameOfShip() : "---"%>"/>
						</td>						
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.congdung" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu"><input type="text" style="width: 99%" name="congdung" id="congdung" readonly="true" value="<%=(!StringPool.BLANK.equals(valcongdung)) ? valcongdung : "---"%>"/></td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.captau" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu"><input type="text" style="width: 99%" readonly = "true" name="captau" id="captau" value="<%=(!StringPool.BLANK.equals(valcaptau)) ? valcaptau : "---"%>"/></td>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.chieudaithietke" />&nbsp;m<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="chieudaithietke" id="chieudaithietke" value="<%=valchieudaithietke  %>"/>
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.chieudailonnhat" />&nbsp;m<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="chieudailonnhat" id="chieudailonnhat" value="<%=valchieudailonnhat   %>"/>
									</td>
					
							</tr>
							</thead>
						</table>	
						</td>
						
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.chieurongthietke" />&nbsp;m<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" width="15%"
									name="chieurongthietke" id="chieurongthietke" value="<%=valchieurongthietke   %>"/>
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.chieuronglonnhat" />&nbsp;m<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="chieuronglonnhat" id="chieuronglonnhat" value="<%=valchieuronglonnhat   %>"/>
							</td>
					
							</tr>
							</thead>
						</table>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.songuoiduocphepcho" />&nbsp;người<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="songuoiduocphepcho" id="songuoiduocphepcho" value="<%=valsonguoiduocphepcho   %>"/>
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.suckeoday" />&nbsp;tấn<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="suckeoday" id="suckeoday" value="<%=valsuckeoday   %>"/>
									</td>
					
							</tr>
							</thead>
						</table>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluongmaychinh" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu" >							
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="soluongmaychinh" id="soluongmaychinh" value="<%=valsoluongmaychinh   %>"/>
							</td>
							<th class="text-left" width="25%"><liferay-ui:message key="vn.dtt.thutuc.kieumaychinh" />&nbsp;<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="kieumaychinh" id="kieumaychinh" value="<%=(!StringPool.BLANK.equals(valkieumaychinh)) ? valkieumaychinh    : "---"%>"/>
									</td>
					
							</tr>
							</thead>
						</table>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.soluongmayphu" /></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="soluongmayphu" id="soluongmayphu" value="<%=valsoluongmayphu   %>"/>
							</td>
							<th class="text-left" width="25%"><liferay-ui:message key="vn.dtt.thutuc.kieumayphu" />&nbsp;</th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="kieumayphu" id="kieumayphu" value="<%=(!StringPool.BLANK.equals(valkieumayphu)) ? valkieumayphu    : "---"%>"/>
									</td>
					
							</tr>
							</thead>
						</table>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.giayphepnhapkhau" />&nbsp;</th>
						<td class="text-leftu"><input type="text" style="width: 99%" style="width: 100%" name="giayphepnhapkhau" id="giayphepnhapkhau" readonly="true" value="<%=(!StringPool.BLANK.equals(valgiayphepnhapkhau)) ? valgiayphepnhapkhau    : "---"%>"/></td>
					</tr>
				
				</thead>
			</table>
		</div>
		
			<div class="tbl_left boxlabel" style="width: 48%">
			<table class="table_noboder">
				<thead>
				<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.sodangkiem" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="sodangkiem" id="sodangkiem" value="<%=(!StringPool.BLANK.equals(valsodangkiem)) ? valsodangkiem    : "---"%>"/>
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.namdongtau" />&nbsp;<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="namdongtau" id="namdongtau" value="<%=(!StringPool.BLANK.equals(valnamdongtau)) ? valnamdongtau    : "---"%>"/>
							</td>
							</tr>
							</thead>
						</table>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.noidongtau" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu"><input type="text" style="width: 99%" style="width: 100%" name="noidongtau" id="noidongtau" readonly="true" value="<%=(!StringPool.BLANK.equals(valnoidongtau)) ? valnoidongtau    : "---"%>"/></td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.vatlieuvo" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu"><input type="text" style="width: 99%" style="width: 100%" readonly = "true" name="vatlieuvo" id="vatlieuvo" value="<%=(!StringPool.BLANK.equals(valvatlieuvo)) ? valvatlieuvo    : "---"%>"/></td>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.chieucaoman" />&nbsp;m<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="chieucaoman" id="chieucaoman" value="<%=valchieucaoman   %>"/>
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.chieuchim" />&nbsp;m<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="chieuchim" id="chieuchim" value="<%=valchieuchim   %>"/>
							</td>
							</tr>
							</thead>
						</table>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.mankho" />&nbsp;m<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="mankho" id="mankho" value="<%=valmankho   %>"/>
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.trongtaitoanphan" />&nbsp;tấn<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="trongtaitoanphan" id="trongtaitoanphan" value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getNetTonnage() : valtrongtaitoanphan  %>"/>
							</td>
							</tr>
							</thead>
						</table>
					</tr>
					<tr>					
						<th class="text-left" width="30%"></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							
							</td>
							<th class="text-left" width="45%"><liferay-ui:message key="vn.dtt.thutuc.dungtichtoanphan" />:&nbsp;tấn<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="dungtichtoanphan" id="dungtichtoanphan" value="<%=Validator.isNotNull(banKhaiChungLast) ? banKhaiChungLast.getGrossTonnage() : valdungtichtoanphan   %>"/>
							</td>
							</tr>
							</thead>
						</table>
					</tr>
					<tr>					
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.congsuatmaychinh" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="congsuatmaychinh" id="congsuatmaychinh" value="<%=valcongsuatmaychinh   %>"/>
							</td>
							<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.nuocsxmaychinh" />&nbsp;<font color="red">(*)</font></th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="nuocsxmaychinh" id="nuocsxmaychinh" value="<%=(!StringPool.BLANK.equals(valnuocsxmaychinh)) ? valnuocsxmaychinh   : "---"%>"/>
							</td>
							</tr>
							</thead>
						</table>
					</tr>
					<tr>				
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.congsuatmayphu" />&nbsp;</th>
						<td class="text-leftu" >
						<table class="table_noboder">
							<thead>
							<tr>
							<td class="text-leftu" width="25%">
							<input type="text" readonly="true" 
									name="congsuatmayphu" id="congsuatmayphu" value="<%=valcongsuatmayphu   %>"/>
							</td>
							<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.nuocsxmayphu" />&nbsp;</th>
							
							<td class="text-leftu" >
							<input type="text" readonly="true" 
									name="nuocsxmayphu" id="nuocsxmayphu" value="<%=(!StringPool.BLANK.equals(valnuocsxmayphu)) ? valnuocsxmayphu   : "---"%>"/>
							</td>
							</tr>
							</thead>
						</table>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.giaycnatktvbvmt" />&nbsp;</th>
						<td class="text-leftu"><input type="text" readonly="true" 
							style="width: 99%" name="giaycnatktvbvmt" id="giaycnatktvbvmt" value="<%=(!StringPool.BLANK.equals(valgiaycnatktvbvmt)) ? valgiaycnatktvbvmt      : "---"%>"/>
							</td>
					</tr>
					</thead>
			</table>
			
			
		</div>
		
			</div>
					
					<table class="table_noboder">
				<thead>
					<tr>						
						<th style="width: 100%; font-style: italic;"><font color="red"><liferay-ui:message key="vn.dtt.thutuc.ghichudangky" /></font></th>												
					</tr>
					
				</thead>
				<tbody>
				</tbody>
			</table>
			<div align = "left" ><br>	</div>					
			</div>
					 	
			<button class="bt" id = "goBackButton" type="button" onclick="displaygoBackInput();" ></i>Xem / Quay lại</button><br>
            
</div>          

<script type="text/javascript">
function displaygoBackInput() {
	var component = document.getElementById('goBack');	
	
	if (component.style.display == 'none') {
		component.style.display = '';	
		
	} else if (component.style.display == '') {
		component.style.display = 'none';	
		
	}
	
}


</script>