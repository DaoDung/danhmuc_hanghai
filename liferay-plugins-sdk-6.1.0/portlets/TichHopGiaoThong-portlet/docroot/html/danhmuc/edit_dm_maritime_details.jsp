<%@page import="vn.gt.dao.danhmuc.model.impl.DmMaritimeImpl"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.portlet.danhmuc.DanhMucAction"%>
<%@page import="vn.gt.portlet.business.Constans"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.utils.ConvertUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortHarbour"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortHarbourImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortWharf"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortWharfImpl"%>

<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<body>
<%
PortletURL actionUrl = renderResponse.createActionURL();
actionUrl.setParameter(ActionRequest.ACTION_NAME, "updateMaritime");
actionUrl.setParameter("backURL", themeDisplay.getURLCurrent());
actionUrl.setParameter("redirectURL",ParamUtil.getString(request, "redirectURL"));
%>
<%
//----Sua collection
	String collectionCode = ParamUtil.getString(request, "collectionId");
	DmMaritime collectionEdit = DmMaritimeLocalServiceUtil.getByMaritimeCode(collectionCode);
	if (Validator.isNull(collectionEdit)) { collectionEdit = new DmMaritimeImpl(); }
	LogFactoryUtil.getLog(DanhMucAction.class).info("======collectionCode===" + collectionCode);
	LogFactoryUtil.getLog(DanhMucAction.class).info("======collectionEdit===" + collectionEdit);
	
	
	String capmoidulieu = ParamUtil.getString(request, PageType.LAN_CAP_MOI_DU_LIEU);
	String danhdauxoa = ParamUtil.getString(request, PageType.LAN_XOA_DU_LIEU);
	String tenAction = "";
	if (capmoidulieu.length() > 0)
	{
		actionUrl.setParameter(PageType.LAN_CAP_MOI_DU_LIEU, PageType.LAN_CAP_MOI_DU_LIEU);
		tenAction = "Thêm mới Cảng vụ hàng hải";
	} else if (danhdauxoa.length() > 0)
	{
		actionUrl.setParameter(PageType.LAN_XOA_DU_LIEU, PageType.LAN_XOA_DU_LIEU);
		tenAction = "Đánh dấu Xóa Cảng vụ hàng hải";
	}
	else {
		actionUrl.setParameter(PageType.LAN_SUA_DU_LIEU, PageType.LAN_SUA_DU_LIEU);
		tenAction = "Cập nhật Cảng vụ hàng hải";
	}
	
	//user login, co truong hop user login ko thuoc cang vu nao
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	String maritimeportCode ="";
	
	if (Validator.isNull(portDefault)) {
		//not do something
		if (Validator.isNotNull(collectionEdit) && Validator.isNotNull(collectionCode) && collectionCode.length()>0) {
			maritimeportCode = collectionEdit.getMaritimeCode();
			}
	} else {
		maritimeportCode = portDefault.getPortCode();
	}
	
	String formDate = UUID.randomUUID().toString();	
	
%>

<script src="<%=request.getContextPath()%>/js/jquery-1.11.1.js" type="text/javascript"></script>
<script type="text/javascript">
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
	//$(document).ready(function(){ $('.textAreaAutosize').autosize(); });
</script>

<div style="height: 10px">&nbsp;</div>
<div style="width: 100%; text-align: center; font-weight: bolder;">Thông tin cập nhật Cảng vụ hàng hải</div>
	<div class="AccordionPanelContent">
	
		<!------------------- column 1 ------------------->
		<div class="tbl_left " style="width: 49%">
		<form id="userForm" name="userForm" method="post" action="<%=actionUrl.toString() %>">
			<table class="table_noboder">
				<thead>
					<tr>
						<input type="text" hidden="true" id="idCollection" name="idCollection" value="<%=Validator.isNotNull(collectionEdit.getId()) ? collectionEdit.getId() : StringPool.BLANK%>">
						<input type="text" hidden="true" id="<%=PageType.REQUEST_CODE%>" name="<%=PageType.REQUEST_CODE%>" value="<%=collectionCode%>" />
						
					</tr>
					<!-- Cảng vụ hàng hải -->
					<!-- Cảng vụ hàng hải-->
					<tr>
						<th class="text-left" width="30%">Cảng vụ hàng hải&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-left" >
						<%
						
						String comparatorMaritimeNameVN = Validator.isNotNull(collectionEdit.getMaritimeNameVN()) ?
								collectionEdit.getMaritimeNameVN() : StringPool.BLANK;
						%>
						<input type="text" style="width: 91%;" id="MaritimeNameVN" name="MaritimeNameVN" maxlength="250" value="<%=comparatorMaritimeNameVN%>" oninvalid="validateScorecard(this)" >
						</td>
						
					</tr>
					
					<!-- Cảng vụ hàng hải-->
					<tr>
						<th class="text-left" width="30%">Cảng vụ hàng hải (tiếng Anh)&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-left" >
						<%
						
						String comparatorMaritimeName = Validator.isNotNull(collectionEdit.getMaritimeName()) ?
								collectionEdit.getMaritimeName() : StringPool.BLANK;
						%>
						<input type="text" style="width: 91%;" id="MaritimeName" name="MaritimeName" maxlength="250" value="<%=comparatorMaritimeName%>" oninvalid="validateScorecard(this)" >
						</td>
						
					</tr>
					<tr>
						<th class="text-left" width="30%">Thời điểm cập nhật&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<input type="text" style="width: 91%"
									name="modifiedDate" id="modifiedDate"
									value="<%= FormatData.parseDateToTringType3(new Date()) %>"
									onclick="gtCalendar('modifiedDate')">
							<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('modifiedDate')">
						</td>
					</tr>					
					
					<!-- Địa chỉ Cảng vụ hàng hải-->
					<tr>
						<th class="text-left" width="30%">Tỉnh /Thành phố&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
						<%
						
						String comparatorCityCode = Validator.isNotNull(collectionEdit.getCitycode()) ?
								collectionEdit.getCitycode() : StringPool.BLANK;
						%>
						<input type="text" style="width: 48%;" id="CityCode" name="CityCode" maxlength="20" value="<%=comparatorCityCode%>"  >
						</td>
						
					</tr>
					
					<!-- Địa chỉ Cảng vụ hàng hải-->
					<tr>
						<th class="text-left" width="30%">Địa chỉ đầy đủ&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
						<%
						
						String comparatorAddress = Validator.isNotNull(collectionEdit.getAddress()) ?
								collectionEdit.getAddress() : StringPool.BLANK;
						%>
						<input type="text" style="width: 91%;" id="Address" name="Address" maxlength="250" value="<%=comparatorAddress%>"  >
						</td>
						
					</tr>
					
					<!-- Ký hiệu -->
					<tr>
					<th class="text-left" width="30%">Ký hiệu cảng vụ &nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
						<%
						String comparatorMaritimeCode = Validator.isNotNull(collectionEdit.getMaritimeCode()) ?
								collectionEdit.getMaritimeCode() : StringPool.BLANK;
						String comparatorMaritimeReference = Validator.isNotNull(collectionEdit.getMaritimeReference()) ?
								collectionEdit.getMaritimeReference() : StringPool.BLANK;							
						%>
						
							<input hidden="true" style="width: 30%;" type="number" id="maritimeCode" name="maritimeCode" maxlength="3" min="1" max="999" required="" value="<%=comparatorMaritimeCode%>"  >							
							<input style="width: 48%;" type="text" id="MaritimeReference" name="MaritimeReference" maxlength="3" required="" value="<%=comparatorMaritimeReference%>" oninvalid="validateScorecard(this)" >
						</td>
						
					</tr>
					
					<tr hidden="true">
						<th class="text-left" width="30%"><span>Phiên bản</span></th>
						<td class="text-leftu">
							<%
							String iVersionNo = "";
							if (capmoidulieu.length() > 0) {
								iVersionNo = (1) + "";
							} else {
								iVersionNo = Validator.isNotNull(collectionEdit.getSyncVersion()) ? collectionEdit.getSyncVersion() : 1 + "";
							}
							%>
							<input readonly="readonly" type="text" id="versionNo" name="versionNo" value="<%= iVersionNo%>">
						</td>
					</tr>	
					
					<tr>
				      <td colspan="2">&nbsp;</td>
				    </tr>
				    <tr>
				    <th class="text-left" width="30%"><span>&nbsp;</span></th>
				    <td>
				      	<%
				    	if (capmoidulieu.length() > 0 && maritimeportCode =="") {
				    		%>
				    		<input type="button" name="submitButtonQuantri" id="submitButtonQuantri"  value="<%=tenAction%>" onclick="if(validatorDanhMucNghiepVu(<%=maritimeportCode.trim()%>)) submit()"/>
				    		 <%
				    	} else {
						%>
				      		<input type="button" name="submitButton" id="submitButton"  value="<%=tenAction%>" onclick="if(validatorDanhMucNghiepVu(<%=maritimeportCode.trim()%>)) submit()"/>
				    		 <%
				    	}
						%>
				      	<input type="button" value="Quay lại" onclick="history.back(-1)" />
				      </td>
				    </tr>
				</thead>
				</form>
			</table>
		</div>
		
		<!------------------- column 2 ------------------->
		<div class="tbl_left " style="width: 49%">
			<table class="table_noboder">
				<thead>
					<tr>
						
					</tr>
					
					
				</thead>
			</table>
		</div>
	</div>
	<div class="AccordionPanelContent" style="padding-top: 0px">
		<div class="tbl_left " style="width: 100%">
			<table class="table_noboder">
				<thead>
					
				</thead>
			</table>
			
		</div>
	</div>

<script type="text/javascript">	
	function validateScorecard(component) {
	var message = 'Cần nhập đủ tên, ký hiệu Cảng vụ hàng hải.';
	component.setCustomValidity(message);
}

var Accordion1 = new Spry.Widget.Accordion("Accordion1");
var Accordion2 = new Spry.Widget.Accordion("Accordion2");

function goBack() {
	//window.history.back()
	window.history.go(-2);
}          

function validatorDanhMucNghiepVu(portCode) {
	var valueDMMaritimeNameVN = $("input[id=MaritimeNameVN").val(); // Cảng vụ hàng hải
	var dataDMMaritimeNameVN = $.trim(valueDMMaritimeNameVN);
	
	var valueDMMaritimeName = $("input[id=MaritimeName").val(); // Cảng vụ hàng hải (tiếng Anh)
	var dataDMMaritimeName = $.trim(valueDMMaritimeName);
	
	var valueDMCityCode = $("input[id=CityCode").val(); // Tỉnh /Thành phố 
	var dataDMCityCode = $.trim(valueDMCityCode);
	
	var valueDMAddress = $("input[id=Address").val(); 	// Địa chỉ
	var dataDMAddress = $.trim(valueDMAddress);
	
	var valueDMmaritimeCode = $("input[id=maritimeCode").val(); // Mã cảng vụ 
	var dataDMmaritimeCode = $.trim(valueDMmaritimeCode);
	
	var valueDMMaritimeReference = $("input[id=MaritimeReference").val(); // Ky hieu Cang vu hang hai
	var dataDMMaritimeReference = $.trim(valueDMMaritimeReference);
	
	var maritimeportCode = $('#maritimeCode').val();

	if (maritimeportCode == "" && document.getElementById('submitButton') != null) {
		console.log('onClickSelectHoldMaritimePortCode==block==' + maritimeportCode);	
		if (document.getElementById('submitButton').disabled == false) {
			//document.getElementById('submitButton').disabled = true;
			//document.getElementById('submitButton').value = 'Tạm khóa chức năng ' + document.getElementById('submitButton').value;
		}
		//return;
	}
	else if (maritimeportCode == portCode && document.getElementById('submitButton') != null){
		if (document.getElementById('submitButton').disabled == true) {
			document.getElementById('submitButton').disabled = false;
			document.getElementById('submitButton').value = document.getElementById('submitButton').value.replace('Tạm khóa chức năng ','') ;
		}
	}
	else if (document.getElementById('submitButton') != null){
		console.log('onClickSelectHoldMaritimePortCode==block==' + maritimeportCode);
		if (document.getElementById('submitButton').disabled == false) {
			document.getElementById('submitButton').disabled = true;
			document.getElementById('submitButton').value = 'Tạm khóa chức năng ' + document.getElementById('submitButton').value;
		}
		return;
		
	}
	
	if (dataDMMaritimeNameVN.length == 0) {
		alert("Đề nghị điền vào ô Cảng vụ Hàng hải (Thông tin nghiệp vụ bắt buộc) !");
		return false;
	} else if (dataDMMaritimeName.length == 0) {
		alert("Đề nghị điền vào ô Cảng vụ hàng hải (tiếng Anh)!");
		return false;
	
	} else if (dataDMCityCode.length == 0) {
		alert("Đề nghị điền vào ô Tỉnh /Thành phố !");
		return false;
	
	} else if (dataDMAddress.length == 0) {
		alert("Đề nghị điền vào ô Địa chỉ đầy đủ!");
		return false;
	
	} /* else if (dataDMmaritimeCode.length == 0) {
		alert("Đề nghị điền vào ô Mã cảng vụ !");
		return false;
	
	}  */else if (dataDMMaritimeReference.length == 0) {
		alert("Đề nghị điền vào ô Ký hiệu cảng vụ hàng hải!");
		return false;
	
	} else {
		return true;
	}
}
</script>
