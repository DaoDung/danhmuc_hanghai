

<%@page import="vn.gt.utils.ActionUtils"%>
<%@ include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<portlet:actionURL var="callMessageFromHaiQuan"	name="callMessageFromHaiQuan">

	<portlet:param name="jspPage"	value="/html/portlet/ipms/chamduthdvpddfdi/registry_chamdutvpdd.jsp" />
</portlet:actionURL>


<head>



</head>



<script type="text/javascript">
	function setCommit(){
		chkValue = document.getElementById("chkButton").checked;
		submitButton = document.getElementById("submitButton");
		if(!chkValue){
			submitButton.disabled=true;
			}else{
				submitButton.disabled=false;
		}
		}

	function redisable(){

		document.getElementById("chkButton").checked = false;
		document.getElementById("submitButton").disabled = true;	
		//reDrawSelectPx('idHuyenDiaChiTruSoChinh','idXaDiaChiTruSoChinh','hiddenIdTruSo');
		//reDrawSelectPx('idHuyenVpDD','idXaVpDD','hiddenIdXaVpDD');
	}
</script>

<%
   String xmlData = request.getParameter("RESULT");
String xmlData2 = (String)renderRequest.getAttribute("RESULT");
%>	
	<body onload="redisable();">
			<aui:form action="<%=callMessageFromHaiQuan%>"	name="myForm" id="myForm"	method="POST">
	
	<ul>
		<li class="step1-active"><span>&nbsp;</span><label class="egov-p-20"><liferay-ui:message	key="vn.dtt.step1" /></label></li>
		<li class="step2"><span>&nbsp;</span><label class="egov-p-20"><liferay-ui:message	key="vn.dtt.step2" /></label></li>
	</ul>
	

	
	
						<table  align="center" border="0"  class="egov-table-form">
							<tr>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
							</tr>
							
							
							
							
							<tr>
								<td colspan="6" >
										<input type="hidden" value="" name="idQuyTrinh" id="idQuyTrinh"/>
										
								</td>
							</tr>	
						
							
													
							<tr>
								<td colspan="6" align="center">
									<p class="egov-p-18"><liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.header1" /></p>
									<p class="egov-p-16"><liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.header2" /></p>
								</td>
							</tr>
							<tr>
				      <td>&nbsp;</td>
				      <td>&nbsp;</td>
				      <td>&nbsp;</td>     
				    
				  		 <td colspan="3">
										<div align="center">
											<label class="egov-label-note"> Ngày <%=ActionUtils.getTitle(new SimpleDateFormat("dd"))%>,
												tháng <%=ActionUtils.getTitle(new SimpleDateFormat("MM"))%>, năm
												<%=ActionUtils.getTitle(new SimpleDateFormat("yyyy"))%>
											</label>
											 
										</div>
									</td>
				    </tr>
								
							<tr>
								<td colspan="6" align="center">				
									<p class="egov-p-20"><liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.tieuDeForm" /></p>
								</td>
							</tr>
							


				<!-- ERROR -->
				<tr>
					<td colspan="6">
						<select style="display: none;"	id="egov-form-errors">

							<option value="idCoQuanQuanLyHs">
								<liferay-ui:error key="err.idCoQuanQuanLyHs"	
									message="vn.dtt.ipms.dnfdi.chamdutvpdd.form.err.idCoQuanQuanLyHs"></liferay-ui:error>
							</option>

							<option value="websiteVpDD">
								<liferay-ui:error key="err.websiteVpDD"
									message="vn.dtt.ipms.dnfdi.chamdutvpdd.form.err.websiteVpDD"></liferay-ui:error>
									<liferay-ui:error key="err.webChiNhanhKoDungDinhDang"
							message="vn.dtt.ipms.doanhnghiep.capgiaychungnhandautubot.error.dinhDangWeb"></liferay-ui:error>
							</option>

					</select> 								

					</td>
				</tr>
				 
					<tr>
					<td width="16.67%">&nbsp;</td>
					<td width="16.67%">&nbsp;</td>
					<td width="16.67%">&nbsp;</td>
					<td width="16.67%">&nbsp;</td>
					<td width="16.67%">&nbsp;</td>
					<td width="16.67%">&nbsp;</td>
				</tr>

				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-header">
								A. &nbsp; &nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.thongTinDoanhNghiep" />
							</label>
					</td>
				</tr>	
							
				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.ref_version&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="ref_version" id="ref_version" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>

				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.ref_messageId&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="ref_messageId" id="ref_version" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>
					

				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.frm_name&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="frm_name" id="frm_name" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>

				
				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.frm_identity&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="frm_identity" id="frm_identity" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>

				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.to_name&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="to_name" id="to_name" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>

				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.to_identity&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="to_identity" id="to_identity" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>





				<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.documentType&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="documentType" id="documentType" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>


			<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.type&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="type_" id="type_" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>


			<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.function&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="function" id="function" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>



			<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.reference&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="reference" id="reference" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>



			<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.preReference&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="preReference" id="preReference" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>



			<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.documentYear&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="documentYear" id="documentYear" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>




			<tr>
					<td colspan="6">
							<br>
							<label class="egov-label-bold">
								2.&nbsp;<liferay-ui:message	key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.giayToChungThucViecThanhLap" />
							</label>
					</td>
				</tr>					


				<tr>
					
					<td colspan="6">
						<label class="egov-label-bold">1.sendDate&nbsp;<liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.doanhNghiep" /></label><label class="egov-label-red">*</label>
						<br>
							<input type="text" name="sendDate" id="sendDate" class="egov-inputfield" style="width:98%"  />
						</td>
				</tr>






							<tr>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
								<td width="16.67%">&nbsp;</td>
							</tr>	

	<tr>
     <td colspan="6">
      <div id="text"></div>
     </td>
    </tr>

<!-- Cam Ket -->						
						<tr>
							
							<td colspan="6">
							
									<input id="chkButton" type="checkbox" class="egov-checkbox" onchange="setCommit();"/>  &nbsp;  
									<label class="egov-label"> <liferay-ui:message key="vn.dtt.checkbox" /></label>							<br> <br>
						<div class="egov-terms">
								<p>* &nbsp;<label class="egov-label"><liferay-ui:message key="vn.dtt.ipms.dnfdi.chamdutvpdd.form.camKet" /></label></p>
								
							</div>
							</td>
						</tr>
						<tr>
								<td colspan="3" ><div align="left">
									<input type="submit" class="egov-button" name="submitButton" id="submitButton" 
									value="<liferay-ui:message key="vn.dtt.button.buocTiepTheo" />" disabled="disabled"/>
											<input type="button" class="egov-button"
										value="<liferay-ui:message key="vn.dtt.ipms.form.draft"/>"
										 />
								</div></td>	
						</tr>
						<tr>
						
						
						<tr>
								<td colspan="3" ><div align="left">
						<%=xmlData %>
								</div></td>	
						</tr>
						<tr>
						
						
						<tr>
								<td colspan="3" ><div align="left">
						<%=xmlData2 %>
								</div></td>	
						</tr>
						<tr>
						
						
					</table>
					
		</aui:form>			
				</div>			
</body>

<portlet:actionURL var="getDonViHanhChinhByIdURL"
	name="getDonViHanhChinhById">
	<portlet:param name="jspPage" value="/html/portlet/ipms/chamduthdvpddfdi/registry_chamdutvpdd.jsp" />
</portlet:actionURL>
<script src="<%=request.getContextPath()%>/js/egov-common.js" type="text/javascript"></script>

<script type="text/javascript">
function setSelectedPhuongXa(inputValue ){
	document.getElementById("hiddenIdTruSo").value = inputValue;
}

function setSelectedPhuongXaVpDD(inputValue ){
	document.getElementById("hiddenIdXaVpDD").value = inputValue;
}


var url = '<%=getDonViHanhChinhByIdURL.toString()%>';

	function setNameDVHC(nameSelect, nameSet) {
		document.getElementById(nameSet).value = document.getElementById(nameSelect).options[document.getElementById(nameSelect).selectedIndex].text;
	}

	function summitForm(url) {
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}

</script>

