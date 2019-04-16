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

<%@page import="vn.gt.dao.danhmuc.model.DmDataItem"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmDataItemImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil"%>

<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<body>
<%
PortletURL actionUrl = renderResponse.createActionURL();
actionUrl.setParameter(ActionRequest.ACTION_NAME, "updateReferencePortItem107");
actionUrl.setParameter("backURL", themeDisplay.getURLCurrent());
actionUrl.setParameter("redirectURL",ParamUtil.getString(request, "redirectURL"));
%>
<%
//----Sua collection
	String collectionCode = ParamUtil.getString(request, "collectionId");
	int DataGroupId = MessageType.NHOM_DM_CANG_BIEN_HANG_HAI;
	List <DmDataItem> dmDataItem = DmDataItemLocalServiceUtil.findByDataGroupIdAndShortName(DataGroupId, collectionCode);
	DmDataItem collectionEdit = new DmDataItemImpl();
	if (dmDataItem != null && dmDataItem.size() > 0)
	   {
		collectionEdit = dmDataItem.get(0);
	   }
	if (Validator.isNull(collectionEdit)) { collectionEdit = new DmDataItemImpl(); }
	LogFactoryUtil.getLog(DanhMucAction.class).info("======collectionCode===" + collectionCode);
	LogFactoryUtil.getLog(DanhMucAction.class).info("======collectionEdit===" + collectionEdit);
	
	
	String capmoidulieu = ParamUtil.getString(request, PageType.LAN_CAP_MOI_DU_LIEU);
	String danhdauxoa = ParamUtil.getString(request, PageType.LAN_XOA_DU_LIEU);
	String tenAction = "";
	if (capmoidulieu.length() > 0)
	{
		actionUrl.setParameter(PageType.LAN_CAP_MOI_DU_LIEU, PageType.LAN_CAP_MOI_DU_LIEU);
		tenAction = "Thêm mới Cảng biển hàng hải";
	} else if (danhdauxoa.length() > 0)
	{
		actionUrl.setParameter(PageType.LAN_XOA_DU_LIEU, PageType.LAN_XOA_DU_LIEU);
		tenAction = "Đánh dấu Xóa cảng biển hàng hải";
	}
	else {
		actionUrl.setParameter(PageType.LAN_SUA_DU_LIEU, PageType.LAN_SUA_DU_LIEU);
		tenAction = "Cập nhật Cảng biển hàng hải";
	}
	
	//user login, co truong hop user login ko thuoc cang vu nao
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	String maritimeportCode ="";
	
	if (Validator.isNull(portDefault)) {
		//not do something
		if (Validator.isNotNull(collectionEdit) && Validator.isNotNull(collectionCode) && collectionCode.length()>0) {
			maritimeportCode = collectionEdit.getNode1();
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
<div style="width: 100%; text-align: center; font-weight: bolder;">Thông tin cập nhật Cảng biển hàng hải</div>
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
					<tr >
					<th class="text-left" width="40%">Cảng vụ hàng hải</th>
					<td class="text-leftu">
						<select name="maritimeCode" id="maritimeCode" style="width: 91%" onchange="onClickSelectHoldMaritimePortCode(<%=maritimeportCode.trim()%>)">
						
						<option value="" selected>--- LỰA CHỌN --- </option>
						<%
							String portCode = StringPool.BLANK;
							if (portDefault != null){
								portCode = portDefault.getPortCode();	
							}
							if (Validator.isNotNull(collectionEdit) && Validator.isNotNull(collectionCode) && collectionCode.length()>0) {
								portCode = collectionEdit.getNode1();
							}

							List<DmMaritime> maritime = DmMaritimeLocalServiceUtil.getDmMaritimes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
							for (DmMaritime item : maritime) {
								%>
									<option value="<%=item.getMaritimeCode()%>"
									<%=ActionUtils.checkData(item.getMaritimeCode(),portCode)%>><%=item.getMaritimeNameVN()%></option>
									<%
								}
							%>
						</select>
						
						
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
					
					<!-- Cảng biển hàng hải-->
					
					<tr>
						<th class="text-left" width="30%">Cảng biển hàng hải&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-left" >
						<%
						String portCodeName = StringPool.BLANK;
						if (Validator.isNotNull(collectionEdit.getName())) {
							portCodeName= collectionEdit.getName();
						}						
						%>		
							<input type="text" style="width: 91%" id="DataItem107Name" name="DataItem107Name" value="<%=portCodeName%>">
						</td>
					</tr>
					
					
					<!-- cang bien-->
					<tr hidden="true">
					<th class="text-left" width="30%">Ký hiệu &nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu" >
						<%						
						String comparatorPortCode = Validator.isNotNull(collectionEdit.getShortName()) ?
								collectionEdit.getShortName() : StringPool.BLANK;					
						%>
						
							<input style="width: 48%;" type="text" id="DataItem107Node2" name="DataItem107Node2" maxlength="5" value="<%=comparatorPortCode%>" >							
							
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
								iVersionNo = (1) + "";
							}
							%>
							<input readonly="readonly" type="text" id="versionNo" name="versionNo" value="<%= iVersionNo%>">
						</td>
					</tr>	
					
					<tr>					
						<th class="text-left" width="30%" style="vertical-align: top;">Ghi chú</th>
						<td class="text-left">
							<textarea style="overflow: hidden; word-wrap: break-word; resize: horizontal;
								height: 50px; width: 91%; border: 1px solid #d4d4d4;
								font-family: 'Times New Roman', Georgia, serif; font-size: 15px;"
								class="textAreaAutosize"
								id="remarks"
								name="remarks"><%=Validator.isNotNull(collectionEdit.getDescription()) ? collectionEdit.getDescription().trim() : StringPool.BLANK %></textarea>
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
				    		<input type="button" name="submitButtonQuantri" id="submitButtonQuantri"  value="<%=tenAction%>" onclick="if(validatorDanhMucNghiepVu()) submit()"/>
				    		 <%
				    	} else {
						%>
				      		<input type="button" name="submitButton" id="submitButton"  value="<%=tenAction%>" onclick="if(validatorDanhMucNghiepVu()) submit()"/>
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
	var message = 'Cần nhập tên khu vực hàng hải.';
	component.setCustomValidity(message);
}

var Accordion1 = new Spry.Widget.Accordion("Accordion1");
var Accordion2 = new Spry.Widget.Accordion("Accordion2");

function goBack() {
	//window.history.back()
	window.history.go(-2);
}

function onClickSelectHoldMaritimePortCode(portCode) {
	var maritimeportCode = $('#maritimeCode').val();	
	
	console.log('onClickSelectHoldMaritimePortCode==change==' + maritimeportCode);
	if (maritimeportCode == "" && document.getElementById('submitButton') != null) {
		console.log('onClickSelectHoldMaritimePortCode==block==' + maritimeportCode);	
		if (document.getElementById('submitButton').disabled == false) {
			document.getElementById('submitButton').disabled = true;
			document.getElementById('submitButton').value = 'Tạm khóa chức năng ' + document.getElementById('submitButton').value;
		}
		return;
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
	
}

function validatorDanhMucNghiepVu() { 
	var valueDMportCodeName = $("input[id=DataItem107Name").val(); // Cang bien hang hai
	var dataDMportCodeName = $.trim(valueDMportCodeName);
	
	var valueDMDataItem107Node2 = $("input[id=DataItem107Node2").val(); // Ky hieu Cang bien hang hai
	var dataDMDataItem107Node2 = $.trim(valueDMDataItem107Node2);
	
	var holdMaritimeCode = $("select#maritimeCode").val();
	
	if (holdMaritimeCode === '' || typeof holdMaritimeCode === 'undefined') {
		alert("Đề nghị chọn Cảng vụ Hàng hải (Thông tin nghiệp vụ bắt buộc) !");
		return false;
	} else if (dataDMportCodeName.length == 0) {
		alert("Đề nghị điền vào ô Cảng biển hàng hải!");
		return false;
	
	} /* else if (dataDMDataItem107Node2.length == 0) {
		alert("Đề nghị điền vào ô Ký hiệu cảng biển hàng hải!");
		return false;
	
	}  */
	else {
		return true;
	}
}


</script>
