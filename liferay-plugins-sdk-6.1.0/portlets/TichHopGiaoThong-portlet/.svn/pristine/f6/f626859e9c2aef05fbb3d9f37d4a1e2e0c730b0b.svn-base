<%@page import="vn.gt.dao.danhmucgt.model.impl.DmGTBusinessTypeImpl"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="vn.gt.dao.noticeandmessage.service.InterfaceRequestLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.InterfaceRequest"%>
<%@page import="vn.gt.tichhop.report.ReportFunction"%>
<%@page import="vn.gt.dao.result.service.ResultNotificationLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultNotification"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.dao.result.service.ResultMinistryLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.model.ResultMinistry"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmMinistryLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmMinistryLocalService"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmMinistry"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGTBusinessTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGTBusinessType"%>
<%@page import="vn.gt.dao.result.model.ResultDeclaration"%>
<%@page import="vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/main.js"></script>

<%
	String loaiThuTuc = "";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
		loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	}
	DmGTBusinessType dmGtBusinessType = null;
	ResultDeclaration resultDeclaration = null;
	DmGtStatus dmGtStatus = null;
	int k;
	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
%>

<div class="AccordionPanel AccordionPanelOpen">
	<div class="AccordionPanelTab">
		<h4>
			<liferay-ui:message key="vn.dtt.kehoach.thongtinkhaibao" /><img src="<%=request.getContextPath()%>/img/front/next_tle.png">
		</h4>
		<div class="righttle"></div>
	</div>
	<div class="AccordionPanelContent" style="height: 130px; display: block;">
		<table class="table_noboder boder">
			<thead>
				<tr>
					<th width="15px" class="text-center">STT</th>
					<th width="15%" class="text-center"><liferay-ui:message key="vn.dtt.kehoach.thoigiankhaibao" /></th>
					<th class="text-center"><liferay-ui:message key="vn.dtt.kehoach.bankhai" /></th>
					<th width="13%" class="text-center"><liferay-ui:message key="vn.dtt.kehoach.languicuoi" /></th>
					<th width="13%" class="text-center"><liferay-ui:message key="vn.dtt.kehoach.sogioconlai" /></th>
					<th width="13%" class="text-center"><liferay-ui:message key="vn.dtt.kehoach.trangthaibankhai" /></th>
					<th width="13%" class="text-center"><liferay-ui:message key="vn.dtt.kehoach.ghichu" /></th>
				</tr>
			</thead>
			<!-- Thong tinh trang cac ban khai click LoaiThuTuc -- Thanh phan ho so -- muc Thong tin khai bao  -->
			<tbody>
				<%
				
				List<ResultDeclaration> allResultDeclaration = ResultDeclarationLocalServiceUtil.findByDocumentNameAndDocumentYearOrderByBusinessOrder(FormatData.convertToLong(documentName), documentYear);
				if ((allResultDeclaration != null) && (allResultDeclaration.size() > 0)) {
					String remarks = "";
					int index = 1;
					for (int i = 0; i < allResultDeclaration.size(); i++) {
						resultDeclaration = (ResultDeclaration) allResultDeclaration.get(i);
						k = resultDeclaration.getBusinessOrder();
						dmGtBusinessType = DmGTBusinessTypeLocalServiceUtil.getByBusinessTypeCode(resultDeclaration.getBusinessTypeCode());
						if (Validator.isNull(dmGtBusinessType)) {
							dmGtBusinessType = new DmGTBusinessTypeImpl();
						}
						
						//count = 0 thi' continue khoi vong lap co chi so i = ?
						int count = Utils.countBanKhai(String.valueOf(resultDeclaration.getDocumentName()), resultDeclaration.getDocumentYear(), dmGtBusinessType.getBusinessTypeCode());
						if (count == 0) { continue; }
						
						if ((loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0 && dmGtBusinessType.getBusinessTypeCode() == MessageType.BAN_KHAI_DU_TRU_CUA_TAU) ||
							(loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0 && dmGtBusinessType.getBusinessTypeCode() == MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN) ||
							(loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0 && dmGtBusinessType.getBusinessTypeCode() == MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI)) {
							continue;
						} else if ((loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 && dmGtBusinessType.getBusinessTypeCode() == MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN) ||
									(loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 && dmGtBusinessType.getBusinessTypeCode() == MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI) ||
									(loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 && dmGtBusinessType.getBusinessTypeCode() == MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM)) {
							continue;
						}
						
						dmGtStatus = DmGtStatusLocalServiceUtil.findByStatusCode(resultDeclaration.getRequestState(), 3);
						
						//remarks
						if (Validator.isNotNull(dmGtBusinessType) && dmGtBusinessType.getRemarks() != null && dmGtBusinessType.getRemarks().trim().length() > 0) {
							remarks = dmGtBusinessType.getRemarks();
						} else {
			            	String interfaceRequest = "";
			            	if (Validator.isNotNull(resultDeclaration.getRequestCode())) {
			            		interfaceRequest = InterfaceRequestLocalServiceUtil.getRemarksByRequestCode(resultDeclaration.getRequestCode());
			            	}
			            	if (interfaceRequest != null) {
			            		remarks = interfaceRequest;
			            	} else {
								if (Validator.isNotNull(resultDeclaration.getRemainingTime())) {
									if (resultDeclaration.getRemainingTime().startsWith("-")) {
										remarks= "Gửi muộn";
									}
								}
							}
						}
				%>
				<tr>
					<input type="hidden" name="requestCode_<%=k %>" value="<%=resultDeclaration.getRequestCode()%>">
					<td class="text-center"><%=index%></td>
					<td class="text-center" width="20px"><%=FormatData.parseDateToTringType3(resultDeclaration.getDeclarationTime()) %></td>
					<td class="text-left"><%=Validator.isNotNull(dmGtBusinessType) ? dmGtBusinessType.getBusinessTypeNameVN() : ""%></td>
					<td class="text-center"><%=Validator.isNotNull(resultDeclaration.getLatestSend()) ? resultDeclaration.getLatestSend() : ""%></td>
					<td class="text-center"><%=Validator.isNotNull(resultDeclaration.getRemainingTime()) ? resultDeclaration.getRemainingTime() : ""%></td>
					<td class="text-center"><%=Validator.isNotNull(dmGtStatus) ? dmGtStatus.getStatusName() : ""%></td>
					<td class="text-left"><%=remarks%></td>
				</tr>
				<%	
					index++;
					}
				}
				%>
			</tbody>
		</table>
		<br>
		<%ResultNotification notification = ResultNotificationLocalServiceUtil.findByBusinessTypeCodeOrderbyLastestDate("05, 99, 9927, 9928, 9929, 9925, 9920", FormatData.convertToLong(documentName), documentYear);%>
		<table class="table_noboder">
			<tbody>
				<%
				if (notification != null && 
						(notification.getBusinessTypeCode() == 05 || notification.getBusinessTypeCode() == 9927||
						notification.getBusinessTypeCode() == 9928 || notification.getBusinessTypeCode() == 9929)) {
					if (notification.getLatestDate() != null && notification.getRemarks().length() > 0) {
					%>
						<tr>
							<td align="center">
								<b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU SỬA ĐỔI BỔ SUNG : <%=Validator.isNotNull(notification.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(notification.getLatestDate())) : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getRemarks()) ? (notification.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : notification.getRemarks()) : StringPool.BLANK %></font></b>
							</td>
						</tr>
					<%
					}
					if (notification.getResponseTime() != null) {
					%>
						<tr>
							<td align="center"><b><font color="blue">PHẢN HỒI TỪ CẢNG VỤ : <%=Validator.isNotNull(notification.getOfficerName()) ? notification.getOfficerName() : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getResponseTime()) ? FormatData.parseDateToTringType3(notification.getResponseTime()) : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getResponse()) ? notification.getResponse() : StringPool.BLANK%></font></b></td>
						</tr>
					<%
					}
				} else if (notification != null && notification.getBusinessTypeCode() == 99) {
					if (notification.getLatestDate() != null && notification.getRemarks().length() > 0) {
					%>
						<tr>
							<td align="center"><b><font color="red">DOANH NGHIỆP GỬI YÊU CẦU HỦY THỦ TỤC : <%=Validator.isNotNull(notification.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(notification.getLatestDate())) : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getRemarks()) ? (notification.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : notification.getRemarks()) : StringPool.BLANK %></font></b>
							</td>
						</tr>
					<%
					}
					if (notification.getResponseTime() != null) {
					%>
						<tr>
							<td align="center">
								<b><font color="blue">PHẢN HỒI TỪ CẢNG VỤ : <%=Validator.isNotNull(notification.getOfficerName()) ? notification.getOfficerName() : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getResponseTime()) ? FormatData.parseDateToTringType3(notification.getResponseTime()) : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getResponse()) ? notification.getResponse() : StringPool.BLANK%></font>
								</b>
							</td>
						</tr>
					<%
					}
				} else if (notification != null && notification.getBusinessTypeCode() == 9920) {
					if (notification.getLatestDate() != null && notification.getRemarks().length() > 0) {
					%>
						<tr>
							<td align="center"><b><font color="red">DOANH NGHIỆP XUẤT TRÌNH: <%=Validator.isNotNull(notification.getLatestDate()) ? ReportFunction.parserDateToString3LT(FormatData.parseStringToDate(notification.getLatestDate())) : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getRemarks()) ? (notification.getRemarks().equalsIgnoreCase("NIL") ? "Mới gửi" : notification.getRemarks()) : StringPool.BLANK %></font></b>
							</td>
						</tr>
					<%
					}
					if (notification.getResponseTime() != null) {
					%>
						<tr>
							<td align="center">
								<b><font color="blue">PHẢN HỒI TỪ CẢNG VỤ : <%=Validator.isNotNull(notification.getOfficerName()) ? notification.getOfficerName() : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getResponseTime()) ? FormatData.parseDateToTringType3(notification.getResponseTime()) : StringPool.BLANK%>
										- <%=Validator.isNotNull(notification.getResponse()) ? notification.getResponse() : StringPool.BLANK%></font>
								</b>
							</td>
						</tr>
					<%
					}
				}
				%>
			</tbody>
		</table>
	</div>
</div>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.kehoach.phanhoicuacoquan" /></div>
<div class="wd-content-container bgdanhsach">
	<div class="boxnd">
		<table class="wd-table">
			<thead>
				<tr>
					<th width="15px" class="text-center"><liferay-ui:message key="vn.dtt.kehoach.stt" /></th>
					<th><liferay-ui:message key="vn.dtt.kehoach.tencoquan" /></th>
					<th><liferay-ui:message key="vn.dtt.kehoach.hoso" /></th>
					<th><liferay-ui:message key="vn.dtt.kehoach.ghichu" /></th>
				</tr>
			</thead>
			<tbody>
			<%
			List<ResultMinistry> allResultMinistry = ResultMinistryLocalServiceUtil.findDistinctMinistryCode(FormatData.convertToLong(documentName), documentYear);
			String ministry = "";
			if (allResultMinistry != null && allResultMinistry.size() > 0) {
				for (int i = 0; i < allResultMinistry.size(); i++) {
					ministry = String.valueOf(allResultMinistry.get(i));
					DmMinistry dmMinistry = DmMinistryLocalServiceUtil.findByMinistryCode(ministry);
				
					PortletURL kehoachsURL = renderResponse.createRenderURL();
					kehoachsURL.setParameter("jspPage", "/html/baocao/thongtintau/bao_cao_phan_hoi_cqcn_export.jsp");
					kehoachsURL.setParameter("documentName", String.valueOf(documentName));
					kehoachsURL.setParameter("documentYear", String.valueOf(documentYear));
					kehoachsURL.setParameter("ministryCode", URLEncoder.encode(ministry));
					kehoachsURL.setWindowState(LiferayWindowState.POP_UP);
					kehoachsURL.setPortletMode(PortletMode.VIEW);
					%>
					<tr>
						<td><%=i+1 %></td>
						<td><%=Validator.isNotNull(dmMinistry) ? dmMinistry.getMinistryNameVN() : ""%></td>
						<%
						LogFactoryUtil.getLog(KeHoachAction.class).info("==thanh_phan_ho_so_ke_hoach.jsp==documentName==" + documentName + "==documentYear==" + documentYear + "==ministry==" + ministry);
						ResultMinistry instance2 = ResultMinistryLocalServiceUtil.findDocumentNameAndDocumentYeahAndMinistryAndBusinessTypeCodePhanHoi(FormatData.convertToLong(documentName), documentYear, ministry, "99, 26");
						if (instance2 != null && instance2.getResponse().trim().equals("21")) {
						%>
							<td><liferay-ui:message key="vn.dtt.kehoach.chapnhan" /></td>
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("20")) {%>
							<td>Thông báo làm thủ tục trực tiếp</td>
							
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("22")) {%>
							<td><liferay-ui:message key="vn.dtt.kehoach.tuchoi" /></td>
							
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("23")) {%>
							<td><liferay-ui:message key="vn.dtt.kehoach.pheduyet" /></td>
							
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("24")) {%>
							<td><liferay-ui:message key="vn.dtt.kehoach.huythutuc" /></td>
							
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("26")) {
							//if (instance2.getOrganization().equalsIgnoreCase("SYSTEM")) {
							//	
							//	<td><liferay-ui:message key="vn.dtt.kehoach.pheduyet" /></td>
							//	
							//} else {
								
							//}
							//0 tu choi
							//1 phe duyet
							//2 yeu cau bo sung
						%>
							<td><liferay-ui:message key="vn.dtt.kehoach.yeucaubosung" /></td>
						
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("27")) {%>
							<td><liferay-ui:message key="vn.dtt.kehoach.yeucaubosung" /></td>
							
						<%} else if(instance2 != null && instance2.getResponse().trim().equals("28")) {%>
							<td><liferay-ui:message key="vn.dtt.kehoach.yeucaubosung" /></td>
							
						<%} else {%>
							<td></td>
						<%}%>
						<td><a href="javascript:viewKetQuaHoSo('<%=kehoachsURL.toString()%>', 'Phản hồi của các cơ quan chuyên ngành')">Xem</a></td>
					</tr>
				<%
				}
			}
			%>
			</tbody>
		</table>
	</div>
</div>
