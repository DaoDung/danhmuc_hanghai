<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhai"%>
<%@page import="vn.gt.tichhop.report.ReportFunction"%>
<%@page import="vn.gt.dao.result.service.ResultNotificationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultNotification"%>
<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultDeclaration"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.utils.GetNameFunction"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryPort"%>
<%@page import="vn.gt.dao.result.model.impl.ResultCompetionImpl"%>
<%@page import="vn.gt.dao.result.service.ResultCompetionLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultCompetion"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.DateUtils"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryState"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryMaritime"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/"; </script>
<style> .table_noboder img { float:left !important; margin-right:5px; } </style>
<%
	String loaiThuTuc = "";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
		loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	}
	long documentName = FormatData.convertToLong(renderRequest.getParameter(PageType.DOCUMENT_NAME));
	boolean checkDuyetHoSo = true;
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	
	ResultCompetion result = ResultCompetionLocalServiceUtil.findByDocumentNameAndDocumentYear(documentName, documentYear);
	if (result == null) {
		result = new ResultCompetionImpl();
	}
	
	Map<Integer, Date> lstDate = new HashMap<Integer, Date>();
	
	lstDate.put(KeyParams.HAI_QUAN, (Validator.isNotNull(result.getResponseTimeHQ()) && result.getResponseStatusHQ() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeHQ() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.BIEN_PHONG, (Validator.isNotNull(result.getResponseTimeBP()) && result.getResponseStatusBP() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeBP() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.YTE_QUOCTE, (Validator.isNotNull(result.getResponseTimeYT()) && result.getResponseStatusYT() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeYT() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.DONG_VAT, (Validator.isNotNull(result.getResponseTimeDV()) && result.getResponseStatusDV() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeDV() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.THUC_VAT, (Validator.isNotNull(result.getResponseTimeTV()) && result.getResponseStatusTV() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeTV() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	lstDate.put(KeyParams.HANG_HAI, (Validator.isNotNull(result.getResponseTimeCVHH()) && result.getResponseStatusCVHH() != MessageType.CHO_PHE_DUYET) ? result.getResponseTimeCVHH() : DateUtils.stringToDate("2000-09-27 07:30:00", "yyyy-MM-dd HH:mm:ss"));
	
	List<Entry<Integer,Date>> lstDateAsc = DateUtils.comparatorDateDesc(lstDate);
	
	String hoTenLogin = PortalUtil.getUser(request).getFullName();
	List<TempDocument> tempDocuments = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(documentName, documentYear);
	TempDocument tempDoc = null;
	
	if (tempDocuments != null && tempDocuments.size() > 0) {
		tempDoc = tempDocuments.get(0);
	} else {
		tempDoc = new TempDocumentImpl();
	}
%>
<!-- xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp/ Menu/ Kết quả phê duyệt hồ sơ / Chờ phê duyệt hoàn thành thủ tục -->
<%
LogFactoryUtil.getLog(ThuTucAction.class).info("===xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp/===documentName==" + documentName + "==documentYear==" + documentYear);
ResultNotification notification = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("05, 99, 9927, 9928, 9929, 9925", documentName, documentYear);
if (tempDoc.getDocumentStatusCode() == TrangThaiBanKhai.THUTUC_CHO_PHE_DUYET_HOAN_THANH_THU_TUC || tempDoc.getDocumentStatusCode() == TrangThaiBanKhai.THUTUC_YEU_CAU_SUA_DOI_BO_SUNG) {
%>
<div style="height:10px"></div>
<table class="table_noboder">
	<tbody>
	<%
	if (notification != null &&
		(notification.getBusinessTypeCode() == 05 || notification.getBusinessTypeCode() == 9927 || notification.getBusinessTypeCode() == 9928 || notification.getBusinessTypeCode() == 9929)) {
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
	}
	%>
	</tbody>
</table>
<%
}
%>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.phanhoicuacoquan" /></div>

<!-- --xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp/-----------Kết quả phê duyệt hồ sơ------------------Phản hồi của các cơ quan chuyên ngành---------------- -->

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
				<tbody>
					<%
					if(MessageType.LOAT_THU_TUC_VAO_CANG == loaiThuTuc){
						for (int i = 0; i < lstDateAsc.size(); i++) {
							if (lstDateAsc.get(i).getKey().compareTo(KeyParams.HANG_HAI) == 0) {
								%>
								<tr>
									<td class="text-left"> <liferay-ui:message key="vn.dtt.thutuc.hanghai" /></td>
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
									<td class="text-left"><%=i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.haiquan" /></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusHQ()) : ""%></td>
									<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusHQ()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeHQ()) : "")%></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseHQ() : ""%></td>
								</tr>
								<%
							} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.BIEN_PHONG) == 0) {
								//bienphong
								%>
								<tr>
									<td class="text-left"><%=i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.bienphong" /></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusBP()) : ""%></td>
									<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusBP()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeBP()) : "")%></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseBP() : ""%></td>
								</tr>
								<%
							} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.YTE_QUOCTE) == 0) {
								//ytequocte
								%>
								<tr>
									<td class="text-left"><%=i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.ytequocte" /></td> 
									<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusYT()) : ""%></td>
									<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusYT()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeYT()) : "")%></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseYT() : ""%></td>
								</tr>
								<%
							} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.THUC_VAT) == 0) {
								//cqkiemdichthucvat
								%>
								<tr>
									<td class="text-left"><%=i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.cqkiemdichthucvat" /></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusTV()) : ""%></td>
									<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusTV()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeTV()) : "")%></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseTV() : ""%></td>
								</tr>
								<%
							} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.DONG_VAT) == 0) {
								//cqkiemdichdongvat
								%>
								<tr>
									<td class="text-left"><%=i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.cqkiemdichdongvat" /></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusDV()) : ""%></td>
									<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusDV()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeDV()) : "")%></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseDV() : ""%></td>
								</tr>
								<%
							} else if (lstDateAsc.get(i).getKey().compareTo(KeyParams.HANG_HAI) == 0) {
								//hanghai
								%>
								<tr>
									<td class="text-left"><%=i + 1%>. <liferay-ui:message key="vn.dtt.thutuc.hanghai" /></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? CheckBusinessUtil.getResponseStatus(result.getResponseStatusCVHH()) : ""%></td>
									<td class="text-left"><%=CheckBusinessUtil.isChoPheDuyet(result.getResponseStatusCVHH()) ? "" : (Validator.isNotNull(result) ? FormatData.parseDateToTringType3(result.getResponseTimeCVHH()) : "")%></td>
									<td class="text-left"><%=Validator.isNotNull(result) ? result.getResponseCVHH() : ""%></td>
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
<%
	DmHistoryMaritime dmHisMaritime = DmHistoryMaritimeLocalServiceUtil.getByMaritimeCode(tempDoc.getMaritimeCode());
	DmHistoryState dmHisState = DmHistoryStateLocalServiceUtil.getByStateCode(tempDoc.getStateCode());
	String maStCode = "";
	if(dmHisState == null) {
		maStCode = "";
	} else {
		maStCode = dmHisState.getStateCode();
	}
	
	LogFactoryUtil.getLog(ThuTucAction.class).info("===xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp/===loaiThuTuc==" + loaiThuTuc);
	double valgrossTonnage = 0;
	if(MessageType.LOAT_THU_TUC_VAO_CANG == loaiThuTuc){
		TempGeneralDeclaration general = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
		if (general != null) {
			valgrossTonnage = general.getGrossTonnage();
		}
	} else {
		valgrossTonnage = tempDoc.getGrt();
	}
	
	
	DmGtStatus dmGtStatus = DmGtStatusLocalServiceUtil.findByStatusCode(tempDoc.getDocumentStatusCode(), MessageType.ROLE_THU_TUC);
	DmPort dmPort = DmPortLocalServiceUtil.getByPortCode(tempDoc.getPortCode());
%>
<div style="height: 10px">&nbsp;</div>

<!---/xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp---------------- ket qua xac nhan hoan thanh thu tuc --------------------------->

<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.ketquaxacnhan" /></div>
<form id="xacNhanHoanThanhThuTucNhapCanh" name="xacNhanHoanThanhThuTucNhapCanh">
	<div class="AccordionPanelContent">
		<div class="tbl_left boxlabel" style="width: 49%">
			<table class="table_noboder">
				<thead>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.cangvu" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu"><input type="text" name="maritimeCodeName" id="maritimeCodeName" readonly="true" 
						value="<%=Validator.isNotNull(dmHisMaritime) ? dmHisMaritime.getMaritimeNameVN() : tempDoc.getMaritimeCode()%>"/></td>
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
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.nhapcang" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu"><input type="text" required="true" name="portOfArrivalName" id="portOfArrivalName" readonly="true"
						value="<%=Validator.isNotNull(dmPort) ? dmPort.getPortName() : tempDoc.getPortCode()%>"/></td>
						<td><input type="hidden" name="portOfArrivalCode" id="portOfArrivalCode" value="<%=dmPort.getPortCode()%>"></td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.thutuc.trangthai" /></th>
						<td class="text-leftu"><input type="text" readonly = "true" name="requestStateName" id="requestStateName"
						value="<%=Validator.isNotNull(dmGtStatus) ? dmGtStatus.getStatusName() : tempDoc.getStateCode() %>"/></td>
						<td><input type="hidden" name="requestState" id="requestState" value="<%=dmGtStatus.getStatusCode()%>"></td>
					</tr>
				</thead>
			</table>
		</div>
		
		<div class="tbl_left boxlabel" style="width: 49%">
			<table class="table_noboder">
				<thead>
					<%
					if (result.getCertificateNo()!= null && result.getCertificateNo().length() > 0) {
						String [] resultsGet = result.getCertificateNo().trim().split("/");
						if(resultsGet == null || resultsGet.length == 0) {
							resultsGet = new String[1];
							resultsGet[0] = "";
						}
					%>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.sochungnhan" /></th>
						<td class="text-leftu">
							<input type="text" name="certificateNo" id="certificateNo" readonly="readonly" style="width: 60%" value="<%=resultsGet[0]%>">
							<input type="text" name="maritimeReference" id="maritimeReference" readonly="readonly" style="width: 37%" value="<%=dmHisMaritime.getMaritimeReference()%>">
						</td>
					</tr>
					<%
					} else {
					%>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.sochungnhan" /></th>
						<td class="text-leftu">
							<input type="text" name="certificateNo" id="certificateNo" style="width: 60%" value="<%=result.getCertificateNo()%>">
							<input type="text" name="maritimeReference" id="maritimeReference" readonly="readonly" style="width: 37%" value="<%=dmHisMaritime.getMaritimeReference()%>">
						</td>
					</tr>
					<%
					}
					%>
					
					
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.quoctich" /></th>
						<td class="text-leftu"><input type="text" readonly="readonly" name="flagStateOfShip_Name" id="flagStateOfShip_Name" value="<%=Validator.isNotNull(dmHisState) ? dmHisState.getStateName() : tempDoc.getStateCode() %>"/></td>
						<td><input type="hidden" name="flagStateOfShip" id="flagStateOfShip" value="<%=maStCode%>"></td>
					</tr>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.dungtichtoanphan" /></th>
						<td class="text-leftu"><input type="text" name="grossTonnage" id="grossTonnage" readonly="readonly"
						value="<%=(valgrossTonnage > 0) ? valgrossTonnage : StringPool.BLANK %>"/>
						</td>
					</tr>
					<%
					if(result.getResponseTimeCVHH() != null){
					%>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.thoigianpheduyet" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu">
							<input type="text" name="approvalTime" style="width: 98%" required="true" id="approvalTime" readonly="readonly"
								value="<%=FormatData.parseDateToTringType3(result.getResponseTimeCVHH())%>">
						</td>
					</tr>
					<%
					} else {
					%>
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.thoigianpheduyet" />&nbsp;<font color="red">(*)</font></th>
						<td class="text-leftu">
							<input type="text" name="approvalTime" style="width: 98%" required="true" id="approvalTime"
								value="<%= FormatData.parseDateToTringType3(new Date()) %>"
								onclick="gtCalendar('approvalTime')">
						</td>
					</tr>
					<%
					}
					%>
					
					<tr>
						<th class="text-left" width="35%"><liferay-ui:message key="vn.dtt.thutuc.canbopheduyet" /></th>
						<td class="text-leftu"><input type="text" name="approvalName" id="approvalName" readonly="readonly" value="<%=Validator.isNotNull(result.getApprovalName()) ? result.getApprovalName() : hoTenLogin%>"/>
						</td>
					</tr>
				</thead>
			</table>
		</div>
	</div>
</form>

<div style="height: 10px">&nbsp;</div>

<!-----/xac_nhan_hoan_thanh_thu_tuc_nhap_canh.jsp---------------------Thong tin doi chieu ho so --------------------------- -->

<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.thongtindoichieu" /></div>
	<div class="AccordionPanelContent">
		<div class="boxnd">
			<table class="table_noboder">
				<thead>
					<tr>
						<th style="width: 35%"><liferay-ui:message key="vn.dtt.thutuc.danhsachdoichieu" /></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<%
				ResultDeclaration resultDeclaType = null;
				List<ResultDeclaration> resultType = ResultDeclarationLocalServiceUtil.findResultDeclarationByDocumentNameAndDocumentYearNXDoiChieu(documentName, documentYear);
				if (resultType != null && resultType.size() > 0) {
					for (int i = 0; i < resultType.size(); i++) {
						resultDeclaType = resultType.get(i);
						
						if (resultDeclaType.getBusinessTypeCode() == 10) {
							%>
							<tr>
								<td class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.bankhaianninh" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
									<td class="text-left"><div align="left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></div></td>
								<%} else {
									checkDuyetHoSo = false;
									%>
									<td class="text-left"><div align="left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></div></td>
								<%}%>
							</tr>
							<%
						}
						
						if (resultDeclaType.getBusinessTypeCode() == 50) {
							%>
							<tr>
								<td class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.bankhaichung" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
									<td class="text-left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></td>
								<%} else {
									checkDuyetHoSo = false;
									%>
									<td class="text-left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></td>
								<%}%>
							</tr>
							<%
							
						}
					
						if (resultDeclaType.getBusinessTypeCode() == 51) {
							%>
							<tr>
								<td class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.danhsachthuyenvien" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
									<td class="text-left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></td>
								<%} else {
									checkDuyetHoSo = false;
									%>
									<td class="text-left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></td>
								<%}%>
							</tr>
							<%
						}
						
						if (resultDeclaType.getBusinessTypeCode() == 53) {
							System.out.println("hanghoanguyhiem==" + resultDeclaType.getBusinessTypeCode());
							%>
							<tr>
								<td class="text-left">&nbsp;&nbsp;<liferay-ui:message key="vn.dtt.thutuc.hanghoanguyhiem" /></td>
								<%if (resultDeclaType.getRequestState() == 9) {%>
									<td class="text-left"><img src="<%=request.getContextPath()%>/img/front/icon_tich.png"></td>
								<%} else {
									checkDuyetHoSo = false;
									%>
									<td class="text-left"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg"></td>
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
