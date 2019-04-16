<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.result.service.ResultCertificateLocalServiceUtil"%>
<%@page import="javax.portlet.RenderRequest"%>
<%@page import="java.util.Date"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmCertificate"%>
<%@page import="vn.gt.dao.result.model.ResultCertificate"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmCertificateLocalServiceUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepickerNew.js"></script>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>

<%

long documentName = FormatData.convertToLong(renderRequest.getParameter(PageType.DOCUMENT_NAME));;
int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
List<ResultCertificate> resultCertificates = ResultCertificateLocalServiceUtil.findByDocumentNameAndDocumentYear(documentName, documentYear);
List<DmCertificate> allDmCertificate = DmCertificateLocalServiceUtil.getDmCertificates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

List<TempDocument> listTempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(documentName, documentYear);
TempDocument tempDocument = null;
DmCertificate dmCertificate1 = null;
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

%>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;"><liferay-ui:message key="vn.dtt.thutuc.cacgiaytoxuattrinh" /></div>

<form id="cacGiayToPhaiXuatTrinh" name="cacGiayToPhaiXuatTrinh">
	<div class="AccordionPanelContent">
		<div class="boxnd">
			<table class="wd-table">
				<thead>
					<tr>
						<th class="text-left" width="15px"><liferay-ui:message key="vn.dtt.thutuc.stt" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.tengcn" /></th>
						<th class="text-left" width="40px"><liferay-ui:message key="vn.dtt.thutuc.gcndk" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngaycap" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayhethan" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.ngayktdinhky" /></th>
						<th class="text-left"><liferay-ui:message key="vn.dtt.thutuc.nguoikiemduyet" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.yeucauxuattrinh" /></th>
						<th class="text-left" width="18px"><liferay-ui:message key="vn.dtt.thutuc.dakiemtra" /></th>
					</tr>
				</thead>
				<tbody>
				<% if(tempDocument != null){
					if((tempDocument.getDocumentStatusCode() != 19) && (tempDocument.getDocumentStatusCode() != 10)){
				%>

				<%


						if((allDmCertificate != null) &&(allDmCertificate.size()>0)){

							for (int i=0; i < allDmCertificate.size(); i++) {
				                 dmCertificate1 = (DmCertificate) allDmCertificate.get (i);

				                 if((resultCertificates != null) &&(resultCertificates.size() > 0)){
				                	 for (int j=0; j < resultCertificates.size(); j++) {
				                		 resultCertificate = resultCertificates.get(j);
				                		 int rcCode = FormatData.convertToInt(resultCertificate.getCertificateCode());
				                		 if(tempDocument.getDocumentTypeCode().equals("4") ||tempDocument.getDocumentTypeCode().equals("5")) { %>
				                			 <%if(resultCertificate.getCertificateCode().equalsIgnoreCase(dmCertificate1.getCertificateCode()) && rcCode >= 37 && rcCode <= 53){
					                	 		 isExist = true;
					                	 		 k++; %>
					                	 		 	<tr>
													<td><%=k%></td>
													<td class="text-left"  width="250px"><%=dmCertificate1.getCertificateNameVN()%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=resultCertificate.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=dmCertificate1.getCertificateNameVN()%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=resultCertificate.getCertificateNo()%>>
													</td>

													<td class="text-left" width="140px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=FormatData.parseDateToTringType4(resultCertificate.getCertificateIssueDate())%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="140px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=FormatData.parseDateToTringType4(resultCertificate.getCertificateExpiredDate())%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
													</td>
													<td class="text-left" width="140px">
														<input type="text"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=FormatData.parseDateToTringType4(resultCertificate.getExaminationDate())%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															<% if(resultCertificate.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															<% if(resultCertificate.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>
					                	 		 <%} %>

				                		<%} else    { %>
				                		 <%if(resultCertificate.getCertificateCode().equalsIgnoreCase(dmCertificate1.getCertificateCode()) && rcCode >= 1 && rcCode <= 36){
					                	 		 isExist = true;
					                	 		 k++; %>
					                	 		 <tr>
													<td><%=k%></td>
													<td class="text-left"  width="250px"><%=dmCertificate1.getCertificateNameVN()%>
														<input type="hidden" name="certificateCode_<%=k %>"
															value="<%=resultCertificate.getCertificateCode()%>">
														<input type="hidden" name="certificateName_<%=k %>"
															value="<%=dmCertificate1.getCertificateNameVN()%>">
													</td>

													<td class="text-left" width="70px">
														<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"
															value=<%=resultCertificate.getCertificateNo()%>>
													</td>

													<td class="text-left" width="140px">
														<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>"
															style="width: 100%" required="true" id="certificateIssueDate_<%=k %>"
															value="<%=FormatData.parseDateToTringType4(resultCertificate.getCertificateIssueDate())%>"
															onclick="gtCalendar('certificateIssueDate_<%=k %>')">
													</td>
													<td class="text-left" width="140px">
														<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>"
															style="width: 100%" required="true" id="certificateExpiredDate_<%=k %>"
															value="<%=FormatData.parseDateToTringType4(resultCertificate.getCertificateExpiredDate())%>"
															onclick="gtCalendar('certificateExpiredDate_<%=k %>')">
													</td>
													<td class="text-left" width="140px">
														<input type="text"  class="egov-inputfield" name="examinationDate_<%=k %>"
															style="width: 100%" required="true" id="examinationDate_<%=k %>"
															value="<%=FormatData.parseDateToTringType4(resultCertificate.getExaminationDate())%>"
															onclick="gtCalendar('examinationDate_<%=k %>')">
													</td>
													<td class="text-left"><%=hoTenLogin%></td>
													<td class="text-left">
														<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
															required="true" id="mandatoryChecked_<%=k %> value="check"
															<% if(resultCertificate.getMandatory() == 1) {%>
																checked="on"
															<% }%>>
													</td>
													<td class="text-left">
														<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
															required="true" id="examniedChecked_<%=k %> value="check"
															<% if(resultCertificate.getIsExamined() == 1) {%>
																checked="on"
															<% }%>>
													</td>
												</tr>

					                	 		<% } %>
				                		<%}%>

				                	 	<% // them else
						            	}
									}
				                 if(isExist){
				                	 isExist = false;
				                 } else {
				                		 int rcCode = FormatData.convertToInt(dmCertificate1.getCertificateCode());

				                		 if(tempDocument.getDocumentTypeCode().equals("4") ||tempDocument.getDocumentTypeCode().equals("5")) { %>


				                		<%	 if(rcCode >= 37 && rcCode <= 53 && rcCode != 39){
					            			 k++;
			            				%>

			            				<tr>
												<td><%=k%></td>
												<td class="text-left" width="250px"><%=dmCertificate1.getCertificateNameVN()%>
													<input type="hidden" name="certificateCode_<%=k %>"
														value="<%=dmCertificate1.getCertificateCode()%>">
													<input type="hidden" name="certificateName_<%=k %>"
														value="<%=dmCertificate1.getCertificateNameVN()%>"></td>
												<td class="text-left" width="70px">
													<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"></td>
												<td class="text-left" width="140px">
													<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>" style="width: 100%"
														required="true" id="certificateIssueDate_<%=k %>"
														onclick="gtCalendar('certificateIssueDate_<%=k %>')"></td>
												<td class="text-left" width="140px">
													<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>" style="width: 100%"
														required="true" id="certificateExpiredDate_<%=k %>"
														onclick="gtCalendar('certificateExpiredDate_<%=k %>')"></td>
												<td class="text-left" width="140px">
													<input type="text"  class="egov-inputfield" name="examinationDate_<%=k %>" style="width: 100%"
														required="true" id="examinationDate_<%=k %>"

														onclick="gtCalendar('examinationDate_<%=k %>')"></td>
												<td class="text-left"><%=hoTenLogin%></td>
												<td class="text-left">
													<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
														required="true" id="mandatoryChecked_<%=k %> value="check"/>
												</td>
												<td class="text-left">
													<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
														required="true" id="examniedChecked_<%=k %> value="check"/>
												</td>
											</tr>



			            			<% }else if(rcCode == 39){ %>

                        <%}%>

				                		 <% } else {%>

				                		 <%	 if(rcCode >= 1 && rcCode <= 36){
					            			 k++;
			            				%>

			            				<tr>
												<td><%=k%></td>
												<td class="text-left" width="250px"><%=dmCertificate1.getCertificateNameVN()%>
													<input type="hidden" name="certificateCode_<%=k %>"
														value="<%=dmCertificate1.getCertificateCode()%>">
													<input type="hidden" name="certificateName_<%=k %>"
														value="<%=dmCertificate1.getCertificateNameVN()%>"></td>
												<td class="text-left" width="70px">
													<input type="text" class="egov-inputfield" style="width: 98%" name="registerNo_<%=k %>"></td>
												<td class="text-left" width="140px">
													<input type="text"  class="egov-inputfield" name="certificateIssueDate_<%=k %>" style="width: 100%"
														required="true" id="certificateIssueDate_<%=k %>"
														onclick="gtCalendar('certificateIssueDate_<%=k %>')"></td>
												<td class="text-left" width="140px">
													<input type="text"  class="egov-inputfield" name="certificateExpiredDate_<%=k %>" style="width: 100%"
														required="true" id="certificateExpiredDate_<%=k %>"
														onclick="gtCalendar('certificateExpiredDate_<%=k %>')"></td>
												<td class="text-left" width="140px">
													<input type="text"  class="egov-inputfield" name="examinationDate_<%=k %>" style="width: 100%"
														required="true" id="examinationDate_<%=k %>"

														onclick="gtCalendar('examinationDate_<%=k %>')"></td>
												<td class="text-left"><%=hoTenLogin%></td>
												<td class="text-left">
													<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
														required="true" id="mandatoryChecked_<%=k %> value="check"/>
												</td>
												<td class="text-left">
													<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
														required="true" id="examniedChecked_<%=k %> value="check"/>
												</td>
											</tr>



			            			<% } %>

				                		 <% } %>

				            <%    	}
								}
							}
				         %>
						<%} else {

				                 if((resultCertificates != null) &&(resultCertificates.size() > 0)){
				                	 for (int i=0; i < resultCertificates.size(); i++) {
				                		 resultCertificate = resultCertificates.get(i);

				                		 for (int j=0; j < allDmCertificate.size(); j++) {
							                 if(allDmCertificate.get(j).getCertificateCode().equalsIgnoreCase(resultCertificate.getCertificateCode())){
							                	 dmCertificate1 = allDmCertificate.get(j);
							                	 break;
							                 }

				                		 }

				                		 int rcCode = FormatData.convertToInt(resultCertificate.getCertificateCode());

				                		 if(tempDocument.getDocumentTypeCode().equals("4") ||tempDocument.getDocumentTypeCode().equals("5")) { %>
				                			 <% if(resultCertificate.getCertificateCode().equalsIgnoreCase(dmCertificate1.getCertificateCode()) && rcCode >= 37 && rcCode <= 53){
					                			 k++;
					     				        %>
					     				        <tr>
												<td><%=k%></td>
												<td class="text-left"  width="250px"><%=Validator.isNotNull(dmCertificate1) ? dmCertificate1.getCertificateNameVN() : "" %></td>
												<td class="text-left" width="70px"><%=resultCertificate.getCertificateNo()%></td>
												<td class="text-left" width="140px"><%=FormatData.parseDateToTringType4(resultCertificate.getCertificateIssueDate())%></td>
												<td class="text-left" width="140px"><%=FormatData.parseDateToTringType4(resultCertificate.getCertificateExpiredDate())%></td>
												<td class="text-left" width="140px"><%=FormatData.parseDateToTringType4(resultCertificate.getExaminationDate())%></td>
												<td class="text-left"><%=hoTenLogin%></td>
												<td class="text-left">
													<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
														required="true" id="mandatoryChecked_<%=k %> value="check"
														<%
														System.out.println("resultCertificate.getMandatory()" + resultCertificate.getMandatory());
														if(resultCertificate.getMandatory() == 1) {%>
															checked="on"


														<% }%>DISABLED>
												</td>
												<td class="text-left">
													<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
														required="true" id="examniedChecked_<%=k %> value="check"
														<% if(resultCertificate.getIsExamined() == 1) {%>
															checked="on"
														<% }%>DISABLED>
												</td>
											</tr>

					     				        <% } %>

				                		 <% }  else {%>
				                		 	 <% if(resultCertificate.getCertificateCode().equalsIgnoreCase(dmCertificate1.getCertificateCode()) && rcCode >= 1 && rcCode <= 36){
					                			 k++;
					     				        %>
					     				        <tr>
												<td><%=k%></td>
												<td class="text-left"  width="250px"><%=Validator.isNotNull(dmCertificate1) ? dmCertificate1.getCertificateNameVN() : "" %></td>
												<td class="text-left" width="70px"><%=resultCertificate.getCertificateNo()%></td>
												<td class="text-left" width="140px"><%=FormatData.parseDateToTringType4(resultCertificate.getCertificateIssueDate())%></td>
												<td class="text-left" width="140px"><%=FormatData.parseDateToTringType4(resultCertificate.getCertificateExpiredDate())%></td>
												<td class="text-left" width="140px"><%=FormatData.parseDateToTringType4(resultCertificate.getExaminationDate())%></td>
												<td class="text-left"><%=hoTenLogin%></td>
												<td class="text-left">
													<input type="checkbox" class="mandatoryChecked" name="mandatoryChecked_<%=k %>" style="width: 100%"
														required="true" id="mandatoryChecked_<%=k %> value="check"
														<%
														System.out.println("resultCertificate.getMandatory()" + resultCertificate.getMandatory());
														if(resultCertificate.getMandatory() == 1) {%>
															checked="on"


														<% }%>DISABLED>
												</td>
												<td class="text-left">
													<input type="checkbox" name="examniedChecked_<%=k %>" style="width: 100%"
														required="true" id="examniedChecked_<%=k %> value="check"
														<% if(resultCertificate.getIsExamined() == 1) {%>
															checked="on"
														<% }%>DISABLED>
												</td>
											</tr>

					     				        <% } %>
				                		 <% } %>

								<%	}
								}
							}
						}
					%>


				</tbody>
			</table>
			<input type="hidden" name="docCount" value="<%=k%>"> <input
				type="hidden" name="hoTenLogin" value="<%=hoTenLogin%>">
		</div>
	</div>
</form>
