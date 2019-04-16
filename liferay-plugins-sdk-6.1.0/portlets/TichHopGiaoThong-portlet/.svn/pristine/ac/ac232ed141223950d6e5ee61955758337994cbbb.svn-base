<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalService"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortHarbour"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.utils.ConvertUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.dao.danhmuc.model.DmRepresentative"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.dao.danhmuc.service.DmArrivalPurposeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmArrivalPurpose"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortWharf"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempNoTiceShipMessageImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage"%>
<%@page import="java.util.Date"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<%

	String loaiThuTuc = "";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
		loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	}

	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	String requestCodeKeHoach = ParamUtil.getString(request, PageType.REQUEST_CODE);
	
	List<TempDocument> tempDocuments = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	
	TempDocument tempDoc = null;
	
	if (Validator.isNotNull(tempDocuments) && tempDocuments.size() > 0) {
		tempDoc = tempDocuments.get(0);
	} else {
		tempDoc = new TempDocumentImpl();
	}
	
	TempNoTiceShipMessage thongbao = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (thongbao == null) { thongbao = new TempNoTiceShipMessageImpl(); }
	//du lieu lay tu Xac bao, TEMP_NOTICE_SHIP_MESSAGE, NoticeOfArrival trong file xsls
	//Xac bao
	//String noticeShipType = "2";
	//lay ra xac bao moi nhat
	TempNoTiceShipMessage noticeShipXacBao = TempNoTiceShipMessageLocalServiceUtil.getXacBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (noticeShipXacBao == null) { noticeShipXacBao = new TempNoTiceShipMessageImpl(); }
	
	//user login, co truong hop user login ko thuoc cang vu nao
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	List<DmPort> ports = null;
	
	if (portDefault != null) {
		ports = DmPortLocalServiceUtil.findByLoCode(portDefault.getPortCode());
	}
	
	if (ports == null) { ports = new ArrayList<DmPort>(); }
	
	
	
	DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDoc.getMaritimeCode());
	if (Validator.isNull(maritime)) { maritime = new DmMaritimeImpl(); }
	
	//PortHarbour la ben cang,
	List<DmPortHarbour> lstPortHarbour = DmPortHarbourLocalServiceUtil.findByPortRegionCode(maritime.getMaritimeCode());
	if (Validator.isNull(lstPortHarbour)) { lstPortHarbour = new ArrayList<DmPortHarbour>(); }
	
	//PortWharf la cau cang
	List<DmPortWharf> lstPortWharf = null;
	if (Validator.isNotNull(tempDoc.getPortRegionCode())) {
		if (lstPortHarbour.size() > 0) {
			if (Validator.isNotNull(noticeShipXacBao.getPortHarbourCode())) {
				lstPortWharf = DmPortWharfLocalServiceUtil.findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(tempDoc.getPortRegionCode(), noticeShipXacBao.getPortHarbourCode(), KeyParams.ORDER_BY_ASC);
			} else {
				lstPortWharf = DmPortWharfLocalServiceUtil.findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(tempDoc.getPortRegionCode(), lstPortHarbour.get(0).getPortHarbourCode(), KeyParams.ORDER_BY_ASC);
			}
			
		}
	}

	

	//muc dinh roi cang
	List<DmArrivalPurpose> arrivalPurposes = DmArrivalPurposeLocalServiceUtil.getDmArrivalPurposes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	//----Sua lenh dieu dong
	IssueShiftingOrder shiftingOrderEdit = null;
	
	if(Validator.isNotNull(requestCodeKeHoach)) {
		shiftingOrderEdit = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodeKeHoach);
	}
	
	if (Validator.isNull(shiftingOrderEdit)) { shiftingOrderEdit = new IssueShiftingOrderImpl(); }
	
	int countShiftOrder = IssueShiftingOrderLocalServiceUtil.countByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (Validator.isNotNull(shiftingOrderEdit.getPortHarbourCode())) {
		lstPortWharf = DmPortWharfLocalServiceUtil.findByPortHarbourCodeOrNull(shiftingOrderEdit.getPortHarbourCode(), KeyParams.ORDER_BY_ASC);
	}
	
	if (lstPortWharf == null || lstPortWharf.size() == 0) {
		lstPortWharf = DmPortWharfLocalServiceUtil.getDmPortWharfs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	String capLenhDieuDong = ParamUtil.getString(request, PageType.LAN_CAP_LENH_DIEU_DONG);
	LogFactoryUtil.getLog(KeHoachAction.class).info("===/cap_lenh_dieu_dong.jsp===requestCodeKeHoach===" + requestCodeKeHoach + "===countShiftOrder===" + countShiftOrder);
	
	String formDate = UUID.randomUUID().toString();
	String lyDoCapLai = ParamUtil.getString(request, "lyDoCapLaiShifOrder");
	LogFactoryUtil.getLog(KeHoachAction.class).info("===/cap_lenh_dieu_dong.jsp===lyDoCapLai===" + lyDoCapLai);
	String shipname ;
	String arrivalDateStr;
	
	//dung.le edit
	if(tempDoc.getDocumentTypeCode().equals("NC") || tempDoc.getDocumentTypeCode().equals("4")){
		shipname = tempDoc.getShipName();
		arrivalDateStr= FormatData.parseDateToTringType3(tempDoc.getShipDateFrom());
	}else {
		 shipname = Validator.isNotNull(noticeShipXacBao.getShipName()) ? noticeShipXacBao.getShipName() : "";
		 arrivalDateStr= FormatData.parseDateToTringType3(noticeShipXacBao.getArrivalDate());
	}
%>
<script type="text/javascript">
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
	$(document).ready(function(){ $('.textAreaAutosize').autosize(); });
</script>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;">LỆNH ĐIỀU ĐỘNG</div>
	<div class="AccordionPanelContent">
	
		<!------------------- column 1 ------------------->
		<div class="tbl_left boxlabel" style="width: 49%">
			<table class="table_noboder">
				<thead>
					<tr>
						<input type="text" hidden="true" id="maritimeCode" name="maritimeCode" value="<%=tempDoc.getMaritimeCode()%>">
						<input type="text" hidden="true" id="stateCode" name="stateCode"value="<%=tempDoc.getStateCode()%>">
						<input type="text" hidden="true" id="idIssueShiftingOrder" name="idIssueShiftingOrder" value="<%=Validator.isNotNull(shiftingOrderEdit.getId()) ? shiftingOrderEdit.getId() : StringPool.BLANK%>">
						<input type="text" hidden="true" id="requestCodeShifOrder" name="requestCodeShifOrder" value="<%=Validator.isNotNull(shiftingOrderEdit.getRequestCode()) ? shiftingOrderEdit.getRequestCode() : UUID.randomUUID().toString()%>">
						<input type="text" hidden="true" id="lyDoCapLaiShifOrder" name="lyDoCapLaiShifOrder" value="<%=lyDoCapLai%>" />
						<input type="text" hidden="true" id="<%=PageType.REQUEST_CODE%>" name="<%=PageType.REQUEST_CODE%>" value="<%=requestCodeKeHoach%>" />
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.tencau" /></th>
						<td class="text-leftu">
							<input type="text" class="egov-inputfield" style="width: 98%" readonly="readonly"
									id="shipName" name="shipName"
									value="<%=shipname%>">
						</td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigianden" /></th>
						<td class="text-leftu">
							<input type="text" class="egov-inputfield" style="width: 98%" readonly="readonly"
									id="arrivalDate" name="arrivalDate"
									value="<%=arrivalDateStr%>">
						</td>
					</tr>
					
					
					<!-- Di chuyen toi -->
					<!-- ben cang -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.bencang" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<%
							String comparatorHarbourCode = Validator.isNotNull(shiftingOrderEdit.getPortHarbourCode()) ?
								shiftingOrderEdit.getPortHarbourCode() :
								(Validator.isNotNull(noticeShipXacBao.getPortHarbourCode()) ? 
										noticeShipXacBao.getPortHarbourCode() : "");
										//noticeShipXacBao.getPortHarbourCode() : lstPortHarbour.get(0).getPortHarbourCode());
								
								LogFactoryUtil.getLog(KeHoachAction.class).info("===cap_lenh_dieu_dong.jsp===noticeShipXacBao==PortHarbourCode==" + (Validator.isNotNull(noticeShipXacBao.getPortHarbourCode()) ? noticeShipXacBao.getPortHarbourCode() : "==null"));
								LogFactoryUtil.getLog(KeHoachAction.class).info("===cap_lenh_dieu_dong.jsp===comparatorHarbourCode===" + comparatorHarbourCode);
								
							%>
							<input type="text" hidden="true" id="portHarbourCode" name="portHarbourCode" value="<%=comparatorHarbourCode%>">
									
							<select id="holdPortHarbourCode" name="holdPortHarbourCode" style="width: 98%" onchange="onClickSelectHoldPortHarbourCode()">
								<%if (Validator.isNull(noticeShipXacBao.getPortHarbourCode()) ||
									((noticeShipXacBao.getPortHarbourCode() != null) && (noticeShipXacBao.getPortHarbourCode().length() == 0)) ) {%>
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
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.caucang" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
						<%
						String comparatorPortWharfCode = Validator.isNotNull(shiftingOrderEdit.getAnchoringPortWharfCode()) ?
							shiftingOrderEdit.getAnchoringPortWharfCode() : 
								(Validator.isNotNull(noticeShipXacBao.getPortWharfCode()) ?
										noticeShipXacBao.getPortWharfCode() : "");
										//noticeShipXacBao.getPortWharfCode() : lstPortWharf.get(0).getPortWharfCode());
						%>
						
							<input type="text" hidden="true" id="portWharfCode" name="portWharfCode" value="<%=comparatorPortWharfCode%>">
									
							<select id="holdPortWharfCode" name="holdPortWharfCode" style="width: 98%">
								<%if (Validator.isNull(noticeShipXacBao.getPortWharfCode()) ||
										((noticeShipXacBao.getPortWharfCode() != null) && (noticeShipXacBao.getPortWharfCode().length() == 0)) ) {%>
									<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
								<%}%>
								<%for (DmPortWharf item : lstPortWharf) {%>
									<option <%=item.getPortWharfCode().equalsIgnoreCase(comparatorPortWharfCode) ? "selected" : "" %>
										value="<%=item.getPortWharfCode()%>" ><%=item.getPortWharfNameVN() + "&nbsp;-&nbsp;" + item.getPortCode()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
					<!-- muc dich neo dau -->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.mucdichneodau" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<select id="purposeName" name="purposeName" style="width: 98%">
								<%for (DmArrivalPurpose item : arrivalPurposes) {%>
									<option <%=item.getPurposeCode().equalsIgnoreCase(noticeShipXacBao.getPurposeCode()) ? "selected" : "" %>
										value="<%=item.getPurposeName()%>" ><%=item.getPurposeName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
										
					  
					<tr hidden="true">
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.cangtoi" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<select id="arrivalPortCode" name="arrivalPortCode" style="width: 98%">
							    <option value="VNZZZ" selected>--- LỰA CHỌN --- </option> 								
								<% 
									String comparatorArrivalPortCode = Validator.isNotNull(shiftingOrderEdit.getAnchoringPortCode()) ? 
											shiftingOrderEdit.getAnchoringPortCode() : 
												(Validator.isNotNull(tempDoc.getPortCode()) ? tempDoc.getPortCode() : "VNZZZ");
											
									for (DmPort item : ports) {	%>
									<option <%=item.getPortCode().equalsIgnoreCase(comparatorArrivalPortCode) ? "selected" : "" %>
										value="<%=item.getPortCode()%>" ><%=item.getPortName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					
				</thead>
			</table>
		</div>
		
		<!------------------- column 2 ------------------->
		<div class="tbl_left boxlabel" style="width: 49%">
			<table class="table_noboder">
				<thead>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.thoigiandieudong" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<%
								if(MessageType.LOAT_THU_TUC_VAO_CANG == loaiThuTuc || MessageType.LOAT_THU_TUC_ROI_CANG == loaiThuTuc){
									%>
										<input type="text" style="width: 91%"
											name="purposeDate" id="purposeDate"
											value="<%= FormatData.parseDateToTringType3(thongbao.getArrivalDate())  %>"
											onclick="gtCalendar('purposeDate')">
									<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('purposeDate')">
									<%
								}else{
									LogFactoryUtil.getLog("html_ke_hoach_cap_lenh_dieu_dong_jsp").info("===shipName===" + shipname);
									LogFactoryUtil.getLog("html_ke_hoach_cap_lenh_dieu_dong_jsp").info("===shiftingOrderEdit.getShiftingDate()===" + shiftingOrderEdit.getShiftingDate());
									LogFactoryUtil.getLog("html_ke_hoach_cap_lenh_dieu_dong_jsp").info("===noticeShipXacBao.getArrivalDate()===" + noticeShipXacBao.getArrivalDate());
							%>				
							<input type="text" style="width: 91%"
									name="purposeDate" id="purposeDate"
									value="<%= Validator.isNotNull(shiftingOrderEdit.getShiftingDate()) ? FormatData.parseDateToTringType3(shiftingOrderEdit.getShiftingDate()) : FormatData.parseDateToTringType3(noticeShipXacBao.getArrivalDate())  %>"
									onclick="gtCalendar('purposeDate')">
							<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('purposeDate')">
							<%	
								}
							%>
						</td>
					</tr>
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.ngaycap" />&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<input type="text" style="width: 91%"
									name="issueDate" id="issueDate"
									value="<%= FormatData.parseDateToTringType3(new Date()) %>"
									onclick="gtCalendar('issueDate')">
							<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('issueDate')">
						</td>
					</tr>
					
					
					<!-- ---------Giay phep so --------------- -->
					<%
					
					%>
					<tr>
						<th class="text-left" width="30%">
							<liferay-ui:message key="vn.dtt.kehoach.giayphepso" />&nbsp;<span style="color:#FF0000;">(*)</span>
						</th>
						<!-- ??? IssueShiftingOrderLocalServiceUtil.capGiayPhepSo(maritime.getMaritimeReference())-->
						<td class="text-leftu">
							<input type="text" style="width: 60%;float: left; margin-right: 10px;"
									id="certificateNo"
									name="certificateNo"
									value="<%=Validator.isNotNull(shiftingOrderEdit.getCertificateNo()) ?
											ConvertUtil.splitString(shiftingOrderEdit.getCertificateNo()) :
											StringPool.BLANK%>"
									oninvalid="validateScorecard(this)" />
									
							<input type="text" readonly="readonly" style="width: 35%; border: none;"
									id="unitCertificateNo"
									name="unitCertificateNo"
									value="<%=Validator.isNotNull(maritime.getMaritimeReference()) ? maritime.getMaritimeReference() : StringPool.BLANK%>">
						</td>
					</tr>
					
					<!------------ dai dien cang vu --- nguoi ki ---------->
					<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.daidiencangvu" /></th>
						<td class="text-leftu">
							<%
							String sRepresentative = Validator.isNotNull(shiftingOrderEdit.getRepresentative()) ? shiftingOrderEdit.getRepresentative() : StringPool.BLANK;
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
										<%for (DmRepresentative item : lstRepresentative) {
											if (item.getRepLevel() == 1 || item.getRepLevel() == 2 ) {
										%>
											<option value="<%=item.getRepName()%>" <%=item.getRepName().equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%=item.getRepName()%></option>
										<%} }%>
									<%
									} else {
										//thuoc mot cang vu, co dai dien default > 0
										%>
										<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>
										<%
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
					
					<tr hidden="true">
						<th class="text-left" width="30%"><span><liferay-ui:message key="vn.dtt.kehoach.version" /></span></th>
						<td class="text-leftu">
							<%
							String iVersionNo = "";
							if (capLenhDieuDong.length() > 0) {
								iVersionNo = (countShiftOrder + 1) + "";
							} else {
								iVersionNo = Validator.isNotNull(shiftingOrderEdit.getVersionNo()) ? shiftingOrderEdit.getVersionNo() : 1 + "";
							}
							%>
							<input readonly="readonly" type="text" id="versionNo" name="versionNo" value="<%= iVersionNo%>">
						</td>
					</tr>
				</thead>
			</table>
		</div>
	</div>
	<div class="AccordionPanelContent" style="padding-top: 0px">
		<div class="tbl_left boxlabel" style="width: 100%">
			<table class="table_noboder">
				<thead>
					<tr>
					<%if(tempDoc.getDocumentTypeCode().equals("4")) {
						
					} else {
					%>
						<th class="text-left" width="14.7%" style="vertical-align: top;"><liferay-ui:message key="vn.dtt.kehoach.lydodieudong" /></th>
						<td class="text-leftu">
							<textarea style="overflow: hidden; word-wrap: break-word; resize: horizontal;
										height: 50px; width: 99%; border: 1px solid #d4d4d4;
										font-family: 'Times New Roman', Georgia, serif; font-size: 15px;"
										class="textAreaAutosize"
										id="reasonToShift"
										name="reasonToShift"><%=Validator.isNotNull(shiftingOrderEdit.getReasonToShift()) ? shiftingOrderEdit.getReasonToShift() : StringPool.BLANK%></textarea>
						</td>
						<% } %> 
					</tr>
				</thead>
			</table>
			
		</div>
	</div>

<portlet:actionURL var="findPortWhartByPortRegionAndHarbour" name="findPortWhartByPortRegionAndHarbour"/>
<input type="text" hidden="true" id="sRegionCode" name="sRegionCode" value = "<%=StringUtil.valueOf(tempDoc.getPortRegionCode())%>" />
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

function validateScorecard(component) {
	var message = 'Cần nhập số giấy phép.';
	component.setCustomValidity(message);
}

var Accordion1 = new Spry.Widget.Accordion("Accordion1");
var Accordion2 = new Spry.Widget.Accordion("Accordion2");

function goBack() {
	//window.history.back()
	window.history.go(-2);
}

</script>