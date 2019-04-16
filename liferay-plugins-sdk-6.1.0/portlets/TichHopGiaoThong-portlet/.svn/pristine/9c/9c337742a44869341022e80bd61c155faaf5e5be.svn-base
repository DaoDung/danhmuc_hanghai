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
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortRegionImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortHarbour"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortHarbourImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortWharf"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmPortWharfImpl"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.utils.ConvertUtil"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.ArrayList"%>
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

<%
PortletURL actionUrl = renderResponse.createActionURL();
actionUrl.setParameter(ActionRequest.ACTION_NAME, "updatePortHarbour");
actionUrl.setParameter("backURL", themeDisplay.getURLCurrent());
actionUrl.setParameter("redirectURL",ParamUtil.getString(request, "redirectURL"));
%>

<%
//----Sua collection
	String collectionCode = ParamUtil.getString(request, "collectionId");
	DmPortHarbour collectionEdit = DmPortHarbourLocalServiceUtil.getByPortHarbourCode(collectionCode);
	if (Validator.isNull(collectionEdit)) { collectionEdit = new DmPortHarbourImpl(); }
	LogFactoryUtil.getLog(DanhMucAction.class).info("======collectionCode===" + collectionCode);
	LogFactoryUtil.getLog(DanhMucAction.class).info("======collectionEdit===" + collectionEdit);
	
	
	//PortHarbour la ben cang,
		
		List<DmPortRegion>  lstPortRegion = DmPortRegionLocalServiceUtil.getDmPortRegions(QueryUtil.ALL_POS, QueryUtil.ALL_POS);		
		DmPortRegion portRegionDetails = null;	
		
	if (Validator.isNotNull(collectionEdit.getPortRegion())) {
		portRegionDetails =  DmPortRegionLocalServiceUtil.getByPortRegionCode(collectionEdit.getPortRegion());
				
	}
	
	
	String capmoidulieu = ParamUtil.getString(request, PageType.LAN_CAP_MOI_DU_LIEU);
	String danhdauxoa = ParamUtil.getString(request, PageType.LAN_XOA_DU_LIEU);
	String tenAction = "";
	if (capmoidulieu.length() > 0)
	{
		actionUrl.setParameter(PageType.LAN_CAP_MOI_DU_LIEU, PageType.LAN_CAP_MOI_DU_LIEU);
		tenAction = "Thêm mới bến cảng";
	} else if (danhdauxoa.length() > 0)
	{
		actionUrl.setParameter(PageType.LAN_XOA_DU_LIEU, PageType.LAN_XOA_DU_LIEU);
		tenAction = "Đánh dấu Xóa bến cảng";
	}
	else {
		actionUrl.setParameter(PageType.LAN_SUA_DU_LIEU, PageType.LAN_SUA_DU_LIEU);
		tenAction = "Cập nhật bến cảng";
	}
	
	
	//user login, co truong hop user login ko thuoc cang vu nao
	User userLogin = PortalUtil.getUser(request);
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	String maritimeportCode ="";
	
	if (Validator.isNull(portDefault)) {
		//not do something
		if (Validator.isNotNull(collectionEdit) && Validator.isNotNull(collectionCode) && collectionCode.length()>0) {
			maritimeportCode = collectionEdit.getPortRegionCode();
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
<div style="width: 100%; text-align: center; font-weight: bolder;">Thông tin cập nhật Bến cảng</div>
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
						<select name="maritimeCode" id="maritimeCode" onchange="onClickSelectHoldMaritimePortCode(<%=maritimeportCode.trim()%>)">
						
						<option value="" selected>--- LỰA CHỌN --- </option>
						<%
							String portCode = StringPool.BLANK;
							if (portDefault != null){
								portCode = portDefault.getPortCode();	
							}
							if (Validator.isNotNull(portRegionDetails)) {
								portCode = portRegionDetails.getPortRegionRef();
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
						<td class="text-leftu">
						<%
						String portCodeName = StringPool.BLANK;
						if (Validator.isNotNull(portRegionDetails)) {
							portCodeName= portRegionDetails.getPortCode();
						}						
						%>		
							<input type="text" id="portCodeName" name="portCodeName" value="<%=portCodeName%>" readonly ="true">
						</td>
					</tr>
					<!-- Khu vực hàng hải-->
					<tr>
						<th class="text-left" width="30%">Khu vực hàng hải&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
						<%
						String comparatorPortRegionCode = Validator.isNotNull(collectionEdit.getPortRegion()) ?
								collectionEdit.getPortRegion() : StringPool.BLANK;
						%>
						
							<input type="text" hidden="true" id="portRegionCode" name="portRegionCode" value="<%=comparatorPortRegionCode%>">
									
							<select id="holdPortRegionCode" name="holdPortRegionCode" style="width: 91%" onchange="onClickSelectHoldPortRegionCode()">
								<%if (Validator.isNull(collectionEdit.getPortRegion()) ||
										((collectionEdit.getPortRegion() != null) && (collectionEdit.getPortRegion().length() == 0)) ) {%>
									<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
								<%}%>
								<%for (DmPortRegion item : lstPortRegion) {%>
									<option <%=item.getPortRegionCode().equalsIgnoreCase(comparatorPortRegionCode) ? "selected" : "" %>
										value="<%=item.getPortRegionCode()%>" ><%=item.getPortRegionNameVN() %></option>
								<%}%>
							</select>
						</td>
					</tr>
					<!-- ben cang -->
					<tr>
						<th class="text-left" width="30%">Bến cảng&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-left">
							<%
							String comparatorPortHarbourName = Validator.isNotNull(collectionEdit.getPortHarbourNameVN()) ?
									collectionEdit.getPortHarbourNameVN() : StringPool.BLANK;
								
								LogFactoryUtil.getLog(DanhMucAction.class).info("===PortHarbourNameVN==" + (Validator.isNotNull(collectionEdit.getPortHarbourNameVN()) ? collectionEdit.getPortHarbourNameVN() : "==null"));
								LogFactoryUtil.getLog(DanhMucAction.class).info("===comparatorHarbourCode===" + comparatorPortHarbourName);
								
							%>							
							<input type="text" style="width: 91%;" id="portHarbourNameVN" name="portHarbourNameVN" value="<%=comparatorPortHarbourName%>" oninvalid="validateScorecard(this)" >
						</td>
					</tr>
					
					<!-- ben cang -->
					<tr hidden="true">
					<th class="text-left" width="30%">Ký hiệu bến cảng &nbsp;<span style="color:#FF0000;">(*)</span> &nbsp;</th>
						<td class="text-leftu" >
						<%
						String comparatorPortHarbourCode = Validator.isNotNull(collectionEdit.getPortHarbourCode()) ?
								collectionEdit.getPortHarbourCode() : StringPool.BLANK;
						%>
						
							<input style="width: 30%;" type="text" id="portHarbourCode" name="portHarbourCode" maxlength="5" value="<%=comparatorPortHarbourCode%>" >
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
						<th class="text-left" width="30%" style="vertical-align: top;">Ghi chú</th>
						<td class="text-left">
							<textarea style="overflow: hidden; word-wrap: break-word; resize: horizontal;
								height: 50px; width: 91%; border: 1px solid #d4d4d4;
								font-family: 'Times New Roman', Georgia, serif; font-size: 15px;"
								class="textAreaAutosize"
								id="remarks"
								name="remarks"><%=Validator.isNotNull(collectionEdit.getNote()) ? collectionEdit.getNote().trim() : StringPool.BLANK %></textarea>
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

<portlet:actionURL var="findPortNameByPortRegionCode" name="findPortNameByPortRegionCode"/>
<portlet:actionURL var="findPortRegionByMaritimeCode" name="findPortRegionByMaritimeCode"/>
<portlet:actionURL var="findPortHarbourByMaritimeCode" name="findPortHarbourByMaritimeCode"/>
<portlet:actionURL var="findPortHarbourByPortRegionCode" name="findPortHarbourByPortRegionCode"/>

<input type="text" hidden="true" id="sRegionCode" name="sRegionCode" value = "<%=StringUtil.valueOf("")%>" />


<script type="text/javascript">
var v_url = '<%=findPortHarbourByMaritimeCode.toString()%>';
var v_urlPortRegionList = '<%=findPortRegionByMaritimeCode.toString()%>';
var v_urlPortHarbourList = '<%=findPortHarbourByPortRegionCode.toString()%>';
var v_urlPortName = '<%=findPortNameByPortRegionCode.toString()%>';

function onClickSelectHoldMaritimePortCode(portCode) {
	
	var maritimeCode = $("select#maritimeCode").val();
	
	console.log('maritimeCode==' + maritimeCode);

	
	if (maritimeCode == "") {
		
		var select = $('#holdPortRegionCode');
		select.find('option').remove();
		$('<option>').val('').text('---- Lựa chọn ------').appendTo(select);
		
		$("input[id=portCodeName]").val("");
		console.log('portCodeName======change==' + $("input[id=portCodeName]").val());
		//return;
	}
	
	$.ajax({
		type : 'GET',
		url : v_urlPortRegionList,
		data : {

			maritimeCode : maritimeCode
		},
		success : function(data) {
			console.log('=(2)==thanh cong');
			var lstData = JSON.parse(data);
			console.log(lstData);
			
			if (typeof lstData != 'undefined' || typeof lstData != null) {
				if (lstData.length > 0) {
					//xoa du lieu cu
					var select = $('#holdPortRegionCode');
					select.find('option').remove();
					if (maritimeCode == "") {
						$('<option>').val('').text('---- Lựa chọn ------').appendTo(select);
					}else
					{
						$("input[id=portRegionCode]").val(lstData[0].id);
						$("input[id=portCodeName]").val(lstData[0].portname);
					}
					
					//data of parameter
					$.each(lstData, function(idx, obj) {
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
					});

					console.log('portRegionCode======change==' + $("input[id=portRegionCode]").val());
					
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
		
	if (maritimeCode == "" && document.getElementById('submitButton') != null) {
		console.log('onClickSelectHoldMaritimePortCode==block==' + maritimeCode);	
		if (document.getElementById('submitButton').disabled == false) {
			document.getElementById('submitButton').disabled = true;
			document.getElementById('submitButton').value = 'Tạm khóa chức năng ' + document.getElementById('submitButton').value;
		}
		return;
	}
	else if (maritimeCode == portCode && document.getElementById('submitButton') != null){
		if (document.getElementById('submitButton').disabled == true) {
			document.getElementById('submitButton').disabled = false;
			document.getElementById('submitButton').value = document.getElementById('submitButton').value.replace('Tạm khóa chức năng ','') ;
		}
	}
	else if (document.getElementById('submitButton') != null){
		console.log('onClickSelectHoldMaritimePortCode==block==' + maritimeCode);
		if (document.getElementById('submitButton').disabled == false) {
			document.getElementById('submitButton').disabled = true;
			document.getElementById('submitButton').value = 'Tạm khóa chức năng ' + document.getElementById('submitButton').value;
		}
		return;
		
	}	
}

function onClickSelectHoldPortRegionCode() {
	
	var portRegionCode = $("select#holdPortRegionCode").val();	
	console.log('portRegionCode==' + portRegionCode);

	
	if (portRegionCode == "") {
		//var select = $('#holdPortWharfCode');
		//select.find('option').remove();
		//$('<option>').val('').text('---- Lựa chọn ------').appendTo(select);
		return;
	}
	
	$.ajax({
		type : 'GET',
		url : v_urlPortName,
		data : {
			portRegionCode : portRegionCode
		},
		success : function(data) {
			console.log('=(2)==thanh cong');
			var lstDataRegion = JSON.parse(data);
			console.log(lstDataRegion);
			
			if (typeof lstDataRegion != 'undefined' || typeof lstDataRegion != null) {
				if (lstDataRegion.length > 0) {
					$("input[id=portCodeName]").val(lstDataRegion[0].portname);					
					console.log('portCodeName======change==' + $("input[id=portCodeName]").val());					
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

function onClickSelectHoldPortHarbourCode() {
	
	var maritimeCode = $("select#maritimeCode").val();	
	console.log('maritimeCode==' + maritimeCode);

	
	if (maritimeCode == "") {
		
		return;
	}
	
	$.ajax({
		type : 'GET',
		url : v_url,
		data : {

			maritimeCode : maritimeCode
		},
		success : function(data) {
			console.log('=(2)==thanh cong');
			var lstData = JSON.parse(data);
			console.log(lstData);
			
			if (typeof lstData != 'undefined' || typeof lstData != null) {
				if (lstData.length > 0) {
					//xoa du lieu cu trong khu vuc cang
					var select = $('#holdPortHarbourCode');
					select.find('option').remove();
					
					//$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
					$("input[id=portHarbourCode]").val(lstData[0].id);
					//data of parameter
					$.each(lstData, function(idx, obj) {
						$('<option>').val(obj.id).text(obj.name).appendTo(select);
					});
					
					console.log('portHarbourCode======change==' + $("input[id=portHarbourCode]").val());
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
//khu vuc hang hai
$(document).ready(function() {
	$('#holdPortRegionCode').change(function(event) {
		var code = $("select#holdPortRegionCode").val();
		console.log('holdPortRegionCode==change==' + code);
		
		$("input[id=portRegionCode]").val(code);
		console.log('portRegionCode======change==' + $("input[id=portRegionCode]").val());
	});
});


function validateScorecard(component) {
	var message = 'Cần nhập Tên bến cảng.';
	component.setCustomValidity(message);
}

var Accordion1 = new Spry.Widget.Accordion("Accordion1");
var Accordion2 = new Spry.Widget.Accordion("Accordion2");

function goBack() {
	//window.history.back()
	window.history.go(-2);
}

function validatorDanhMucNghiepVu() {
	var holdMaritimeCode = $("select#maritimeCode").val();
	
	var valueDMportCodeName = $("input[id=portCodeName").val(); // Cang bien hang hai
	var dataDMportCodeName = $.trim(valueDMportCodeName);
	
	var valueDMportRegionCode = $("input[id=portRegionCode").val(); // Ky hieu Khu vuc hang hai
	var dataDMportRegionCode = $.trim(valueDMportRegionCode);
	
	var valueDMportHarbourCode = $("input[id=portHarbourCode").val(); // Ky hieu Ben cang
	var dataDMportHarbourCode = $.trim(valueDMportHarbourCode);
	
	var valueDMportHarbourNameVN = $("input[id=portHarbourNameVN").val(); // Ten ben cang
	var dataDMportHarbourNameVN = $.trim(valueDMportHarbourNameVN);
	

	if (holdMaritimeCode === '' || typeof holdMaritimeCode === 'undefined') {
		alert("Đề nghị chọn Cảng vụ Hàng hải (Thông tin nghiệp vụ bắt buộc) !");
		return false;
	} else if (dataDMportCodeName.length == 0) {
		alert("Đề nghị điền vào ô Cảng biển hàng hải!");
		return false;
	
	} else if (dataDMportRegionCode.length == 0) {
		alert("Đề nghị điền vào ô Khu vực hàng hải!");
		return false;
	
	} else if (dataDMportHarbourNameVN.length == 0) {
		alert("Đề nghị điền vào ô Bến cảng!");
		return false;
	
	} /* else if (dataDMportHarbourCode.length == 0) {
		alert("Đề nghị điền vào ô Ký hiệu bến cảng!");
		return false;
	
	}  */
	else {
		return true;
	}
}

</script>