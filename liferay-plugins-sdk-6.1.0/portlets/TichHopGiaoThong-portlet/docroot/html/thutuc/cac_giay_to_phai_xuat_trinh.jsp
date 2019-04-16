<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.service.ResultCertificateLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewDetailsLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewDetails"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempCrewDetailsImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewList"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="java.util.Date"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmCertificate"%>
<%@page import="vn.gt.dao.result.model.ResultCertificate"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmCertificateLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepickerNew.js"></script>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>

<%

long documentName = FormatData.convertToLong(renderRequest.getParameter(PageType.DOCUMENT_NAME));
int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));

List<TempDocument> listTempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(documentName, documentYear);
TempDocument tempDocument = null;
List<ResultCertificate> Certificate1 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYear(documentName, documentYear);


if((listTempDocument != null) && (listTempDocument.size()>0)){
	tempDocument = listTempDocument.get(0);
}

ResultCertificate resultCertificate = null;
String hoTenLogin=PortalUtil.getUser(request).getFullName();
int k = 0;
int docCount = 0;
String isRender = ParamUtil.getString(request, "isRender");
String registerNo;
String certificateCode;
String certificateName;
String certificateIssueDate;
String certificateExpiredDate;
String examinationDate;
String checked;
boolean isExist = false;
String lCode = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
%>

<div style="height: 10px">&nbsp;</div>

<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.cacgiaytoxuattrinh" /></div>
<div style="height: 10px">&nbsp;</div>
<% if (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
{ %>
	
<%} else if (tempDocument.getDocumentTypeCode().equals("6") || tempDocument.getDocumentTypeCode().equals("7") )%>
<%{ %>
	<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.giaytoxuattrinhchophuongtien" /></div>
<%} %>

<form id="cacGiayToPhaiXuatTrinh" name="cacGiayToPhaiXuatTrinh">
	<div class="AccordionPanelContent">
		<div class="boxnd">
			<table class="wd-table">
				<thead>
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="280px"><liferay-ui:message key="vn.dtt.thutuc.tengcn" /></th>
						<th class="text-left" width="80px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>											
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
				</thead>
				<tbody>
				<%						
						TempCrewList tmpCrewList = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(documentName, documentYear);
						List<TempCrewDetails> lstTempCrewDetails = null;
						if (tmpCrewList != null) {
							lstTempCrewDetails = TempCrewDetailsLocalServiceUtil.findByRequestCode(tmpCrewList.getRequestCode());
						}
						if (Validator.isNull(lstTempCrewDetails)) { lstTempCrewDetails = new ArrayList<TempCrewDetails>(); }
						%>
				<% if((tempDocument != null ) && (tempDocument.getDocumentStatusCode() != 10) ){
						
						List<ResultCertificate> resultCertificates = null;
						List<DmCertificate> allDmCertificate = new ArrayList<DmCertificate>();
						List<DmCertificate> someDmCertificate = new ArrayList<DmCertificate>();
						
						if (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						{
							for(DmCertificate dmCert : DmCertificateLocalServiceUtil.findBylCode(lCode)){
								if (dmCert.getCertificateCode().equals("39") || dmCert.getCertificateCode().equals("40")  || dmCert.getCertificateCode().equals("48") || dmCert.getCertificateCode().equals("49") || dmCert.getCertificateCode().equals("50")
										|| dmCert.getCertificateCode().equals("59") || dmCert.getCertificateCode().equals("60") || dmCert.getCertificateCode().equals("61") || dmCert.getCertificateCode().equals("62") )
								{
									//donothing
								} else
								{
									allDmCertificate.add(dmCert);
								}
									
							}							
						}
						else
						{					
							//for dm 61
							DmCertificate ettDm61 = DmCertificateLocalServiceUtil.fetchDmCertificate(61);
							
							List<ResultCertificate> resultCertificates61 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm61.getCertificateCode());
							System.out.println("resultCertificates_61______"+ettDm61.getCertificateCode());
							
							allDmCertificate.add(ettDm61);
							
							//for dm 62
							DmCertificate ettDm62 = DmCertificateLocalServiceUtil.fetchDmCertificate(62);
							
							List<ResultCertificate> resultCertificates62 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm62.getCertificateCode());
							System.out.println("resultCertificates_62______"+ettDm62.getCertificateCode());
							
							allDmCertificate.add(ettDm62);
							
							//for dm 59
							DmCertificate ettDm59 = DmCertificateLocalServiceUtil.fetchDmCertificate(59);
							List<ResultCertificate> resultCertificates59 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm59.getCertificateCode());
							System.out.println("resultCertificates_59______"+ettDm59.getCertificateCode());
							
							allDmCertificate.add(ettDm59);

						}
						
						System.out.println("allDmCertificate.size       " + allDmCertificate.size());
						ResultCertificate ettResult = null;
						%>
						<%						
						//for dm 39
						DmCertificate ettDm39 = DmCertificateLocalServiceUtil.fetchDmCertificate(39);
						
						List<ResultCertificate> resultCertificates39 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm39.getCertificateCode());
						System.out.println("resultCertificates_39______"+ettDm39.getCertificateCode());
						
						int NumberCrew_39 = ((Validator.isNotNull(lstTempCrewDetails) && Validator.isNotNull(resultCertificates39)) ? lstTempCrewDetails.size()-resultCertificates39.size() : 0);
												
						
						
						%>
						<%
						//for dm 40
						DmCertificate ettDm40 = DmCertificateLocalServiceUtil.fetchDmCertificate(40);
						
						List<ResultCertificate> resultCertificates40 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm40.getCertificateCode());
						System.out.println("resultCertificates_40______"+ettDm40.getCertificateCode());
						
						int NumberCrew_40 = ((Validator.isNotNull(lstTempCrewDetails) && Validator.isNotNull(resultCertificates40)) ? lstTempCrewDetails.size()-resultCertificates40.size() : 0);
						
						
						
						%>
						<%
						//for dm 60
						DmCertificate ettDm60 = DmCertificateLocalServiceUtil.fetchDmCertificate(60);
						
						List<ResultCertificate> resultCertificates60 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm60.getCertificateCode());
						System.out.println("resultCertificates_60______"+ettDm60.getCertificateCode());
						
						int NumberCrew_60 = ((Validator.isNotNull(lstTempCrewDetails) && Validator.isNotNull(resultCertificates60)) ? lstTempCrewDetails.size()-resultCertificates60.size() : 0);
						
						%>
						
						
						
						<%
						//for dm 48
						DmCertificate ettDm48 = DmCertificateLocalServiceUtil.fetchDmCertificate(48);
						
						List<ResultCertificate> resultCertificates48 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm48.getCertificateCode());
						System.out.println("resultCertificates_48______"+ettDm48.getCertificateCode());
						
						int NumberCrew_48 = ((Validator.isNotNull(lstTempCrewDetails) && Validator.isNotNull(resultCertificates48)) ? lstTempCrewDetails.size()-resultCertificates48.size() : 0);
						
						%>
						
						
						<%
						//for dm 49
						DmCertificate ettDm49 = DmCertificateLocalServiceUtil.fetchDmCertificate(49);
						
						List<ResultCertificate> resultCertificates49 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm49.getCertificateCode());
						System.out.println("resultCertificates_49______"+ettDm49.getCertificateCode());
						
						int NumberCrew_49 = ((Validator.isNotNull(lstTempCrewDetails) && Validator.isNotNull(resultCertificates49)) ? lstTempCrewDetails.size()-resultCertificates49.size() : 0);
						
						%>
						
						
						
						<%
						//for dm 50
						DmCertificate ettDm50 = DmCertificateLocalServiceUtil.fetchDmCertificate(50);
						
						List<ResultCertificate> resultCertificates50 = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm50.getCertificateCode());
						System.out.println("resultCertificates_50______"+ettDm50.getCertificateCode());
						
						int NumberCrew_50 = ((Validator.isNotNull(lstTempCrewDetails) && Validator.isNotNull(resultCertificates50)) ? lstTempCrewDetails.size()-resultCertificates50.size() : 0);
						
						%>
						
						<%
						
						k = 0;
						for(DmCertificate ettDm : allDmCertificate){
							k ++;
							resultCertificates = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYearAndCertificateCode(documentName, documentYear, ettDm.getCertificateCode());
							System.out.println("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp"+"=============docCount -- k -- ========" + k);
							if(resultCertificates.size() > 0 && Validator.isNotNull(resultCertificates)){
								ettResult = resultCertificates.get(0);
							}else{
								ettResult = null;
							}							
				%>
												<tr>
													<td><%=k%></td>
													<td class="text-left"  width="280px"><%=ettDm.getCertificateNameVN()%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=Validator.isNotNull(ettResult)?ettResult.getCertificateCode():ettDm.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=Validator.isNotNull(ettResult)?ettResult.getCertificateNo():StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=Validator.isNotNull(ettResult)?FormatData.parseDateToTringType4(ettResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=Validator.isNotNull(ettResult)?FormatData.parseDateToTringType4(ettResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=Validator.isNotNull(ettResult)?FormatData.parseDateToTringType4(ettResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>
													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															<% if(Validator.isNotNull(ettResult) && ettResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															<% if(Validator.isNotNull(ettResult) && ettResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>					

				<%} %>
				
						</tbody>
			</table>
						
				<%
					
					int index39 = k+1;
					int indexk39k = 0;
					int index40 = k+2;
					int indexk40k = 0;
					int index48 = k+3;
					int indexk48k = 0;
					int index49 = k+4;
					int indexk49k = 0;	
					int index50 = k+5;
					int indexk50k = 0;	
					
					int index60 = k+1;
					int indexk60k = 0;
					int k39 = 0;
					int k40 = 0;					
					int k60 = 0;
					int k48 = 0;
					int k49 = 0;					
					int k50 = 0;
					
					%>
					
					
								
					<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
					<div style="height: 30px">&nbsp;</div>
					<div style="width: 100%; text-align: center; font-weight: bolder;"><%=ettDm39.getCertificateNameVN()%></div>
					<div style="height: 10px">&nbsp;</div>
					<table class="wd-table">
					<thead>
					
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="280px"><liferay-ui:message key="vn.dtt.thutuc.tenthuyenvien" /> </th>
						<th class="text-left" width="40px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>												
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
					</thead>
					<tbody>
					<%} %>
					
					<%
						
					if ((lstTempCrewDetails.size() > 0 && resultCertificates39.size() == 0) 
					&& (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC")))
					{
					
				
					for(TempCrewDetails crew : lstTempCrewDetails){
						indexk39k++;
						k++;
						String CrewName = crew.getFamilyName() + " " + crew.getGivenName();						
				%>
												<tr>
													<td><%=index39%>.<%=indexk39k %></td>
													<td class="text-left"  width="280px" style="font-weight: bolder;"><%= CrewName %>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=ettDm39.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm39.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=Validator.isNotNull(crew)? CrewName:StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>
													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															checked="on">
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															>
													</td>
												</tr>					

					<%}} %>
				
					<%
					
					
					for(ResultCertificate certResult: resultCertificates39){
						
							if (certResult.getCertificateCode().equals("39") ) {
								indexk39k++;
								k39 = k + indexk39k;
								LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount -- k39 -- ========" + k39);
								%>			
								<tr>
													<td><%=index39%>.<%=indexk39k %></td>
													<td class="text-left"  width="280px"><%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>
														<input type="hidden" name="certificateCode_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getCertificateCode():ettDm39.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=certResult.getId() %>"
															value="<%=ettDm39.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>">	
													</td>
								
													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=certResult.getId() %>"
															value=<%=Validator.isNotNull(certResult)?certResult.getCertificateNo():StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=certResult.getId() %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="examinationDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=certResult.getId() %>')">
													</td>
													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="examniedChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
				<%}}%>
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
				</tbody>
				</table>
				
				
				<%}%>





				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
					<div style="height: 30px">&nbsp;</div>
					<div style="width: 100%; text-align: center; font-weight: bolder;"><%=ettDm40.getCertificateNameVN()%> </div>
					<div style="height: 10px">&nbsp;</div>
					<table class="wd-table">
					<thead>
					
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="280px"><liferay-ui:message key="vn.dtt.thutuc.tenthuyenvien" /> </th>
						<th class="text-left" width="40px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>												
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
					</thead>
					<tbody>
					<%} %>
					
					<%
						
						if ((lstTempCrewDetails.size() > 0 && resultCertificates40.size() == 0)
						&& (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC")))
						{						
					
						for(TempCrewDetails crew : lstTempCrewDetails){
							indexk40k++;
							k++;
							String CrewName = crew.getFamilyName() + " " + crew.getGivenName();								
				%>
												<tr>
													<td><%=index40%>.<%=indexk40k %></td>
													<td class="text-left"  width="280px" style="font-weight: bolder;"><%= CrewName%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=ettDm40.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm40.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=Validator.isNotNull(crew)? CrewName:StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															checked="on">
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															>
													</td>
												</tr>					

					<%}} %>
				
				
				<%
					
				// Khong duoc phep hoan doi thu tu :  39 --- 40------60---
					for(ResultCertificate certResult: resultCertificates40){
													
							if (certResult.getCertificateCode().equals("40") ) {
								indexk40k++;
								if (k39> 0)
								{
									k40 = k39 + indexk40k;
								}
								else
								{
									k40 = k+ indexk40k;
								}
								LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount -- k40 -- ========" + k40);
								%>			
								<tr>
													<td><%=index40%>.<%=indexk40k %></td>
													<td class="text-left"  width="280px"><%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>
														<input type="hidden" name="certificateCode_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getCertificateCode():ettDm40.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=certResult.getId() %>"
															value="<%=ettDm40.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>">
													</td>
								
										

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=certResult.getId() %>"
															value=<%=Validator.isNotNull(certResult)?certResult.getCertificateNo():StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=certResult.getId() %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="examinationDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=certResult.getId() %>')">
													</td>
																										
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="examniedChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
				<%}}%>
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
				</tbody>
				</table>
				
				
				<%}%>
				
				
				
				
				
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
					<div style="height: 30px">&nbsp;</div>
					<div style="width: 100%; text-align: center; font-weight: bolder;"><%=ettDm48.getCertificateNameVN()%> </div>
					<div style="height: 10px">&nbsp;</div>
					<table class="wd-table">
					<thead>
					
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="280px"><liferay-ui:message key="vn.dtt.thutuc.tenthuyenvien" /> </th>
						<th class="text-left" width="40px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>												
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
					</thead>
					<tbody>
					<%} %>
					
					<%
						
						if ((lstTempCrewDetails.size() > 0 && resultCertificates48.size() == 0)
						&& (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") ))
						{						
					
						for(TempCrewDetails crew : lstTempCrewDetails){
							indexk48k++;
							k++;
							String CrewName = crew.getFamilyName() + " " + crew.getGivenName();								
				%>
												<tr>
													<td><%=index48%>.<%=indexk48k %></td>
													<td class="text-left"  width="280px" style="font-weight: bolder;"><%= CrewName%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=ettDm48.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm48.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=Validator.isNotNull(crew)? CrewName:StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															checked="on">
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															>
													</td>
												</tr>					

					<%}} %>
				
				
				<%
					
				// Khong duoc phep hoan doi thu tu :  39 --- 48------60---
					for(ResultCertificate certResult: resultCertificates48){
													
							if (certResult.getCertificateCode().equals("48") ) {
								indexk48k++;
								if (k40> 0)
								{
									k48 = k40 + indexk48k;
								}
								else
								{
									if (k39> 0)
									{
										k48 = k39 + indexk48k;
									}
									else
									{
										k48 = k+ indexk48k;
									}
								}
								LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount -- k48 -- ========" + k48);
								%>			
								<tr>
													<td><%=index48%>.<%=indexk48k %></td>
													<td class="text-left"  width="280px"><%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>
														<input type="hidden" name="certificateCode_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getCertificateCode():ettDm48.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=certResult.getId() %>"
															value="<%=ettDm48.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>">
													</td>
								
										

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=certResult.getId() %>"
															value=<%=Validator.isNotNull(certResult)?certResult.getCertificateNo():StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=certResult.getId() %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="examinationDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=certResult.getId() %>')">
													</td>
																										
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="examniedChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
				<%}}%>
				
				<%
					
				if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
				</tbody>
				</table>
				
				
				<%}%>
				
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
					<div style="height: 30px">&nbsp;</div>
					<div style="width: 100%; text-align: center; font-weight: bolder;"><%=ettDm49.getCertificateNameVN()%> </div>
					<div style="height: 10px">&nbsp;</div>
					<table class="wd-table">
					<thead>
					
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="280px"><liferay-ui:message key="vn.dtt.thutuc.tenthuyenvien" /> </th>
						<th class="text-left" width="40px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>												
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
					</thead>
					<tbody>
					<%} %>
					
					<%
						
						if ((lstTempCrewDetails.size() > 0 && resultCertificates49.size() == 0)
						&& (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") ))
						{						
					
						for(TempCrewDetails crew : lstTempCrewDetails){
							indexk49k++;
							k++;
							String CrewName = crew.getFamilyName() + " " + crew.getGivenName();								
				%>
												<tr>
													<td><%=index49%>.<%=indexk49k %></td>
													<td class="text-left"  width="280px" style="font-weight: bolder;"><%= CrewName%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=ettDm49.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm49.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=Validator.isNotNull(crew)? CrewName:StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															checked="on">
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															>
													</td>
												</tr>					

					<%}} %>
				
				
				<%
					
				// Khong duoc phep hoan doi thu tu :  39 --- 49------60---
					for(ResultCertificate certResult: resultCertificates49){
													
							if (certResult.getCertificateCode().equals("49") ) {
								indexk49k++;
								if (k48> 0)
								{
									k49 = k48 + indexk49k;
								}
								else
								{									
									k49 = k+ resultCertificates39.size() + resultCertificates40.size() + indexk49k;
								}
								
								
								
								LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount -- k49 -- ========" + k49);
								%>			
								<tr>
													<td><%=index49%>.<%=indexk49k %></td>
													<td class="text-left"  width="280px"><%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>
														<input type="hidden" name="certificateCode_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getCertificateCode():ettDm49.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=certResult.getId() %>"
															value="<%=ettDm49.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>">
													</td>
								
										

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=certResult.getId() %>"
															value=<%=Validator.isNotNull(certResult)?certResult.getCertificateNo():StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=certResult.getId() %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="examinationDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=certResult.getId() %>')">
													</td>
																										
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="examniedChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
				<%}}%>
				
				<%
					
				if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
				</tbody>
				</table>
				
				
				<%}%>
				
				
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
					<div style="height: 30px">&nbsp;</div>
					<div style="width: 100%; text-align: center; font-weight: bolder;"><%=ettDm50.getCertificateNameVN()%> </div>
					<div style="height: 10px">&nbsp;</div>
					<table class="wd-table">
					<thead>
					
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="200px"><liferay-ui:message key="vn.dtt.thutuc.tenthuyenvien" /> </th>
						<th class="text-left" width="40px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left" width="140px">Mô tả</th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>												
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
					</thead>
					<tbody>
					<%} %>
					
					<%
						
						if ((lstTempCrewDetails.size() > 0 && resultCertificates50.size() == 0)
						&& (tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") ))
						{						
					
						for(TempCrewDetails crew : lstTempCrewDetails){
							indexk50k++;
							k++;
							String CrewName = crew.getFamilyName() + " " + crew.getGivenName();								
				%>
												<tr>
													<td><%=index50%>.<%=indexk50k %></td>
													<td class="text-left"  width="200px" style="font-weight: bolder;"><%= CrewName%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=ettDm50.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm50.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=Validator.isNotNull(crew)? CrewName:StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=StringPool.BLANK%>>
													</td>
													<td class="text-left" width="140px"><%=StringPool.BLANK%>
													<input type="hidden" name="description_<%=k %>"
															value="<%=StringPool.BLANK%>">
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>													
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															>
													</td>
												</tr>					

					<%}} %>
				
				
				<%
					
				// Khong duoc phep hoan doi thu tu :  39 --- 50------60---
					for(ResultCertificate certResult: resultCertificates50){
													
							if (certResult.getCertificateCode().equals("50") ) {
								indexk50k++;
								if (k49> 0)
								{
									k50 = k49 + indexk50k;
								}
								else
								{
									k50 = k+ resultCertificates39.size() + resultCertificates40.size() +  resultCertificates48.size() + indexk50k;
								}
								LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount -- k50 -- ========" + k50);
								%>			
								<tr>
													<td><%=index50%>.<%=indexk50k %></td>
													<td class="text-left"  width="200px"><%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>
														<input type="hidden" name="certificateCode_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getCertificateCode():ettDm50.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=certResult.getId() %>"
															value="<%=ettDm50.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>">
													</td>
								
										

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=certResult.getId() %>"
															value=<%=Validator.isNotNull(certResult)?certResult.getCertificateNo():StringPool.BLANK%>>
													</td>
													
													<td class="text-left" width="140px"><%=Validator.isNotNull(certResult)?certResult.getDescription():StringPool.BLANK%>
													<input type="hidden" name="description_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getDescription():StringPool.BLANK%>">
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=certResult.getId() %>')">
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="examinationDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=certResult.getId() %>')">
													</td>
																										
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="examniedChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
				<%}}%>
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("4") || tempDocument.getDocumentTypeCode().equals("5") || tempDocument.getDocumentTypeCode().equals("NC") || tempDocument.getDocumentTypeCode().equals("XC") || tempDocument.getDocumentTypeCode().equals("QC"))
						&& (lstTempCrewDetails.size() > 0))
					{		
					
					%>
				</tbody>
				</table>
				
				
				<%}%>
				
				
				
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("6") || tempDocument.getDocumentTypeCode().equals("7")) && (lstTempCrewDetails.size() > 0))
					{		
					
					%>
					<div style="height: 30px">&nbsp;</div>
					<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.giaytothuyenvien" /></div>
					<div style="height: 10px">&nbsp;</div>
					<table class="wd-table">
					<thead>
					
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left" width="280px"><liferay-ui:message key="vn.dtt.thutuc.tenthuyenvien" /> </th>
						<th class="text-left" width="80px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>												
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
					</thead>
					<tbody>
					<%} %>
				
				<%
						
						if ((lstTempCrewDetails.size() > 0 && resultCertificates60.size() == 0)
						&& (tempDocument.getDocumentTypeCode().equals("6") || tempDocument.getDocumentTypeCode().equals("7")))
						{
						
					
						for(TempCrewDetails crew : lstTempCrewDetails){
							indexk60k++;
							k++;
							String CrewName = crew.getFamilyName() + " " + crew.getGivenName();		
												
				%>
												<tr>
													<td><%=index60%>.<%=indexk60k %></td>
													<td class="text-left"  width="280px" style="font-weight: bolder;"><%=CrewName%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=ettDm60.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=ettDm60.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=k %>"
															value="<%=Validator.isNotNull(crew)? CrewName:StringPool.BLANK%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													
													<td class="text-left" width="130px">
														<input type="text" class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">													
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															checked="on">
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															>
													</td>
												</tr>					

					<%}} %>
				
				<%
					
					
					for(ResultCertificate certResult: resultCertificates60){
						
							
							
							if (certResult.getCertificateCode().equals("60") ) {
								indexk60k++;
								k60 = k+ indexk60k;
								LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount -- k60 -- ========" + k60);
								%>			
								<tr>
													<td><%=index60%>.<%=indexk60k %></td>
													<td class="text-left"  width="280px" style="font-weight: bolder;"><%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>
														<input type="hidden" name="certificateCode_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getCertificateCode():ettDm60.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=certResult.getId() %>"
															value="<%=ettDm60.getCertificateNameVN()%>">
														<input type="hidden" name="comment_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?certResult.getComment():StringPool.BLANK%>">
													</td>
								
					

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=certResult.getId() %>"
															value=<%=Validator.isNotNull(certResult)?certResult.getCertificateNo():StringPool.BLANK%>>
													</td>

													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateIssueDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateIssueDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left" width="130px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getCertificateExpiredDate()):StringPool.BLANK%>"
															onclick="gtCalendar('certificateExpiredDate_<%=certResult.getId() %>')">													
														<input type="hidden"  class="egov-inputfield" name="examinationDate_<%=certResult.getId() %>"
															style="width: 100%" required="true" id="examinationDate_<%=certResult.getId() %>"
															value="<%=Validator.isNotNull(certResult)?FormatData.parseDateToTringType4(certResult.getExaminationDate()):StringPool.BLANK%>"
															onclick="gtCalendar('examinationDate_<%=certResult.getId() %>')">
													</td>
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=certResult.getId() %>" style="width: 100%"
															required="true" id="examniedChecked_<%=certResult.getId() %> value="check"
															<% if(Validator.isNotNull(certResult) && certResult.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
				<%}}%>
								
				
				
				<%
					
					if ((tempDocument.getDocumentTypeCode().equals("6") || tempDocument.getDocumentTypeCode().equals("7")) && (lstTempCrewDetails.size() > 0))
					{		
					
					%>
				</tbody>
				</table>
					<%}%>			
				
				<%  
					docCount = k;
					//docCount = k+indexk39k+indexk40k+indexk59k+indexk60k;	
				LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount========" + docCount);
				} else {  
					docCount = k;
					LogFactoryUtil.getLog("html.kehoach.cac_giay_to_phai_xuat_trinh.jsp").info("=============docCount========" + docCount);
				%>
				
				
				
												<tr>
													<td>---</td>
													<td class="text-left"> ------
													
													</td>
													<td class="text-left"> ------
													
													</td>
													<td class="text-left"> ------
													
													</td>
													<td class="text-left"> ------
													
													</td>
													<td class="text-left"> ------
													
													</td>													
													<td class="text-left"> ------
													
													</td>
													<td class="text-left"> ------
													
													</td>
													
												</tr>
				<%} %>		
				</tbody>
			</table>
			<input type="hidden" name="docCount" value="<%=k%>"> 
			<input type="hidden" name="hoTenLogin" value="<%=hoTenLogin%>">
		</div>
	</div>
</form>
