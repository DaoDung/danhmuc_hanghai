<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.dao.danhmuc.model.DmSyncCategory"%>
<%@page import="vn.gt.dao.danhmuc.service.DmSyncCategoryLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortWharf"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortHarbour"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.gt.dao.nhapcanh.model.DocumentGeneral"%>
<%@page import="vn.gt.dao.nhapcanh.service.DocumentGeneralLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/danhmuc/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
 <%
 	SimpleDateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
 	int ACTIVATED=0;
 	String defaultSearchStr = "Nh&#7853;p m&#227; h&#7891; s&#417;";
  	String transactionKeyword  = ParamUtil.getString(request,"transactionKeyword", StringPool.BLANK);
  	int currentTransPage  = ParamUtil.getInteger(request,"currentTransPage");
  	String transType = ParamUtil.getString(request, "transType", "0");
  	

  	
  	PortletURL backUrl = renderResponse.createRenderURL();
	backUrl.setParameter("jspPage", "/html/danhmuc/view.jsp");

	
   	long uid = PortalUtil.getUserId(request);
   	long	 cqqlId = -1;
   	
   	Boolean rolequantri = false;
	User currentuser = UserLocalServiceUtil.fetchUser(themeDisplay.getUserId());
	for (Organization og : currentuser.getOrganizations()) {
    	if (og.getGroup().getFriendlyURL().contains("dong-bo")) {
    		rolequantri = true;    		
    	}
    }
	UserPort portDefault = UserPortLocalServiceUtil.findByUserId(currentuser.getUserId());
	String portCode ="";
	
	if (Validator.isNull(portDefault)) {
		//not do something
	} else {
		portCode = portDefault.getPortCode();
	}
	DmPortRegion portRegionDetails = null;	
	
	String maritimeCode= ParamUtil.getString(request, "maritimeCode").trim();
	String holdPortRegionCode = ParamUtil.getString(request, "holdPortRegionCode").trim();
	String holdPortHarbourCode = ParamUtil.getString(request, "holdPortHarbourCode").trim();
	String portWharfNameVN = ParamUtil.getString(request, "portWharfNameVN").trim();
	
	if (maritimeCode == "") {
		maritimeCode = portCode;
	}
	
	PortletURL portletUrl = renderResponse.createRenderURL() ;
	portletUrl.setParameter("jspPage", "/html/danhmuc/view-DM_PORT_WHARF.jsp");
  	
  	PortletURL portletUrlParam = renderResponse.createRenderURL() ;
  	portletUrlParam.setParameter("jspPage", "/html/danhmuc/view-DM_PORT_WHARF.jsp");
  	portletUrlParam.setParameter("maritimeCode", maritimeCode);
  	portletUrlParam.setParameter("holdPortRegionCode", holdPortRegionCode);
  	portletUrlParam.setParameter("holdPortHarbourCode", holdPortHarbourCode);
  	portletUrlParam.setParameter("portWharfNameVN", portWharfNameVN);


 %>
<form name ="searchIpmsListForm" method = "post" action = "<%=portletUrl.toString()%>" class="searchTransForm">
<div class="container-user-sign clearfix container-fluid">
				<h3 class="col-xs-12 page-header"><i class="fa fa-th-list"></i> 
								<liferay-ui:message key="vn.gt.user_port.tracuu" /> 
								- Danh sách Cầu cảng </h3>
				<div class="boxnd">	
				<!----------------------- column 2 ----------------------->
			<div class="tbl_left boxlabel">
			<table class="table_noboder">
				
					<thead>
						<tr>
						<td colspan="1"></td>
							<th width="40%">Cảng vụ hàng hải:&nbsp;
							</th>
							<td>
								<select name="maritimeCode" id="maritimeCode" style="width: 98%; margin-left: -50px;" onchange="onClickSelectHoldMaritimePortCode(<%=portCode.trim()%>)" >
								<option selected value="---" style="width: 100%">---- Xem tất cả ------</option>
								<%
							
								List<DmMaritime> maritime = DmMaritimeLocalServiceUtil.getDmMaritimes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
								for (DmMaritime item : maritime) {
									%>
										
										<option  <%=item.getMaritimeCode().trim().equals(maritimeCode) ? "selected" : ""%> value="<%=item.getMaritimeCode().trim()%>"
										<%=ActionUtils.checkData(item.getMaritimeCode().trim(),maritimeCode)%>><%=item.getCitycode()%></option>
										<%
									}
								%>
								</select>
							</td>
							
							</tr>
					</thead>
				</table>
		</div>	
		
			<div class="tbl_left boxlabel">
			<table class="table_noboder">
				
					<thead>
						<tr>
						<td colspan="1"></td>
							<th width="40%">Khu vực hàng hải:&nbsp;
							</th>
							<td>
								<select id="holdPortRegionCode" name="holdPortRegionCode" style="width: 98%; margin-left: -50px;" onchange="onClickSelectHoldPortRegionCode()">
								<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
								<%
								String comparatorPortRegionCode = "";
								List<DmPortRegion>  lstPortRegion = DmPortRegionLocalServiceUtil.getDmPortRegions(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
								for (DmPortRegion item : lstPortRegion) {
									%>
										
										<option <%=item.getPortRegionCode().equalsIgnoreCase(holdPortRegionCode) ? "selected" : "" %>
										value="<%=item.getPortRegionCode()%>" ><%=item.getPortRegionNameVN() %></option>
										<%
									}
								%>
								</select>
							</td>
							
							</tr>
					</thead>
				</table>
		</div>			
		
		<div class="tbl_left boxlabel">
			<table class="table_noboder">
				
					<thead>
						<tr>
						<td colspan="1"></td>
							<th width="40%">Bến cảng:&nbsp;
							</th>
							<td>
								<select id="holdPortHarbourCode" name="holdPortHarbourCode" style="width: 98%; margin-left: -50px;" >
								<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
								<%
								String comparatorHarbourCode = "";
								List<DmPortHarbour> lstPortHarbour = DmPortHarbourLocalServiceUtil.getDmPortHarbours(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
								for (DmPortHarbour item : lstPortHarbour) {
									%>										
										<option <%=item.getPortHarbourCode().equalsIgnoreCase(holdPortHarbourCode) ? "selected" : "" %>
										value="<%=item.getPortHarbourCode()%>" ><%=item.getPortHarbourName()%></option>
										<%
									}
								%>
								</select>
								
								
							</td>
							
							</tr>
					</thead>
				</table>
		</div>			
		
		<div class="tbl_left boxlabel">
			<table class="table_noboder">
				
					<thead>
						<tr>
						<td colspan="1"></td>
							<th width="40%">Cầu cảng:&nbsp;
							</th>
							<td>
								<%						
								String comparatorPortWharfNameVN = StringPool.BLANK;
								%>
						<input type="text" id="portWharfNameVN" name="portWharfNameVN" value="<%=portWharfNameVN%>" style="width: 98%; margin-left: -50px;" >
							</td>
							
							</tr>
					</thead>
				</table>
		</div>					
			</div>
			<div >
			
						<tr>
						<td>
						<p style="text-align:center"> 
							<%

							PortletURL addCollectionUrl = renderResponse.createRenderURL();
							addCollectionUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portwharf_details.jsp");
							addCollectionUrl.setParameter("collectionId", StringPool.BLANK);
							addCollectionUrl.setParameter(PageType.LAN_CAP_MOI_DU_LIEU, PageType.LAN_CAP_MOI_DU_LIEU);
							addCollectionUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
							%>
							<button class="btn btn-primary" type="submit"><i class="icon-fl ico_icon-search"></i><liferay-ui:message
									key="vn.gt.user_port.timkiem" /></button>
							<%		
		
							 if (rolequantri) {
							%>
								<button class="btn btn-primary" type="button" onclick="javascript: window.location = '<%=addCollectionUrl.toString() %>'" >
								<img src="<%=request.getContextPath()%>/img/icon/icon_trakq.png"><liferay-ui:message
										key="vn.gt.add" />
								</button>
							<%    } %>
								
								<button class="btn btn-primary" type="button" onclick="javascript: window.location = '<%=backUrl.toString() %>'" />
							<i class="fa fa-reply"></i> Quay lại</button>
							</p>
						</td>
						
					</tr>
			</div>


		<%
			SearchContainer searchContainer = null;
			if (currentTransPage > 0) {
				searchContainer = new SearchContainer(renderRequest, null, null
						,SearchContainer.DEFAULT_CUR_PARAM, currentTransPage, 10, portletUrlParam, null, null);	
			} else {
				searchContainer = new SearchContainer(renderRequest, null, null
						, SearchContainer.DEFAULT_CUR_PARAM, 10, portletUrlParam, null, null);
			} 
			
			int start = searchContainer.getStart();
			int end = searchContainer.getEnd();

			//List<DmPortWharf> results = DmPortWharfLocalServiceUtil.getDmPortWharfs(start, end);
			List<DmPortWharf> results = DmPortWharfLocalServiceUtil.findDongBoDmPortWharf(maritimeCode, holdPortRegionCode, holdPortHarbourCode, portWharfNameVN, true, start, end);
			//long longTotal = DmPortWharfLocalServiceUtil.getDmPortWharfs(-1, -1).size();
			long longTotal = DmPortWharfLocalServiceUtil.countDongBoDmPortWharf(maritimeCode, holdPortRegionCode, holdPortHarbourCode, portWharfNameVN);
 			int total = Integer.parseInt(String.valueOf(longTotal));
		    searchContainer.setTotal(total);
		    searchContainer.setResults(results);
		    searchContainer.setTotal(total);
			if(results != null){
		    List items = results;//searchContainer.getResultRows();
		    %>
<div class="wd-content-container bgdanhsach">

				<div class="boxnd">
					<table class="wd-table">
						<thead>
							<tr>
								<th  width="10px" class="text-center">STT</th>
								<th>Mã Cầu cảng</th>								
								<th>Tên cầu cảng</th>
								<th>Bến cảng, khu neo</th>
								<th>Ghi chú</th>
								<th>Mã Bến cảng</th>
								<th>Mã Khu vực hàng hải</th>
								<th>Trạng thái</th>
								<th>Thao tác</th>
							</tr>
						</thead>
						<tbody>
		    <%
			for (int i=0; i < results.size(); i++) {
				DmPortWharf category = (DmPortWharf) items.get(i);
			%>
							<tr>
								<td class="text-center"><%=(searchContainer.getStart()+i+1)%></td>
								<td class="text-left"><%=category.getPortWharfCode()%> </td>
								<td class="text-left"><%=category.getPortWharfNameVN()%> </td>
								<td class="text-left"><%=category.getPortCode()%> </td>
								<td class="text-left"><%=category.getNote()%> </td>
								<td class="text-left"><%=category.getPortHarbourCode()%> </td>								
								<td class="text-left"><%=category.getPortRegionCode()%> </td>
								<td class="text-left">
								<%
									String sTinhTrang = "";
									if (category.getIsDelete() == 0)
									{
										sTinhTrang = "Đang sử dụng";
									} else 
									{
										sTinhTrang = "Đã đánh dấu xóa";
									} 
								%>
								<%=sTinhTrang%> 
								</td>
								<td class="text-left">
								<%
								PortletURL editUrl = renderResponse.createRenderURL();
								editUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portwharf_details.jsp");
								editUrl.setParameter("collectionId", category.getPortWharfCode());
								editUrl.setParameter(PageType.LAN_SUA_DU_LIEU, PageType.LAN_SUA_DU_LIEU);
								editUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
								
								PortletURL markupDeleteUrl = renderResponse.createRenderURL();
								markupDeleteUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portwharf_details.jsp");
								markupDeleteUrl.setParameter("collectionId", category.getPortWharfCode());
								markupDeleteUrl.setParameter(PageType.LAN_XOA_DU_LIEU, PageType.LAN_XOA_DU_LIEU);
								markupDeleteUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());								
								%>
								
								<%		
								portRegionDetails = null;
								if (Validator.isNotNull(category.getPortRegionCode())) {
									portRegionDetails =  DmPortRegionLocalServiceUtil.getByPortRegionCode(category.getPortRegionCode());
								}
		
								if (rolequantri && (portCode =="" || portCode.equals(portRegionDetails.getPortRegionRef())) ) {
								%>
									<a href="<%=editUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png">Xem, sửa</a>									
									<% 
									if (category.getIsDelete() == 0)
									{
									%>
									<a href="<%=markupDeleteUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg">Đánh dấu xóa</a>
									<% 
									}}
									%>
																	
								</td>							
								
							</tr>
							<% }
						}%>							
						</tbody>
					</table>
					<div class="tongso">
						<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
					</div>
 		</div>
</form>	

<portlet:actionURL var="findPortNameByPortRegionCode" name="findPortNameByPortRegionCode"/>
<portlet:actionURL var="findPortRegionByMaritimeCode" name="findPortRegionByMaritimeCode"/>
<portlet:actionURL var="findPortHarbourByMaritimeCode" name="findPortHarbourByMaritimeCode"/>
<portlet:actionURL var="findPortHarbourByPortRegionCode" name="findPortHarbourByPortRegionCode"/>

<input type="text" hidden="true" id="sRegionCode" name="sRegionCode" value = "<%=StringUtil.valueOf("")%>" />
	
<script type="text/javascript">
		if (<%= searchContainer.getStart() < 5 %>) {
// 			var pageTrans = document.searchTransForm.<portlet:namespace />page; 
// 			if (pageTrans) {
// 				pageTrans.value = "1";
// 			}
		}
		var v_url = '<%=findPortHarbourByMaritimeCode.toString()%>';
		var v_urlPortRegionList = '<%=findPortRegionByMaritimeCode.toString()%>';
		var v_urlPortHarbourList = '<%=findPortHarbourByPortRegionCode.toString()%>';
		var v_urlPortName = '<%=findPortNameByPortRegionCode.toString()%>';

		function onClickSelectHoldMaritimePortCode(portCode) {
			
			
			var maritimeCode = $("select#maritimeCode").val();
			
			console.log('maritimeCode==' + maritimeCode);

			
			if (maritimeCode == "") {
				var select = $('#holdPortHarbourCode');
				select.find('option').remove();
				$('<option>').val('').text('---- Lựa chọn ------').appendTo(select);
				
				var selectRegion = $('#holdPortRegionCode');
				selectRegion.find('option').remove();
				$('<option>').val('').text('---- Lựa chọn ------').appendTo(selectRegion);
				
				//$("input[id=portCodeName]").val("");
				//console.log('portCodeName======change==' + $("input[id=portCodeName]").val());
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
								
							}
							
							//data of parameter
							$.each(lstData, function(idx, obj) {
								$('<option>').val(obj.id).text(obj.name).appendTo(select);
							});

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
			
			onClickSelectHoldPortHarbourCode();	
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
				url : v_urlPortHarbourList,
				data : {
					portRegionCode : portRegionCode
				},
				success : function(data) {
					console.log('=(2)==thanh cong');
					var lstData = JSON.parse(data);
					console.log(lstData);
					
					if (typeof lstData != 'undefined' || typeof lstData != null) {
						if (lstData.length > 0) {
							//xoa du lieu cu trong ben cang
							var select = $('#holdPortHarbourCode');
							select.find('option').remove();
							
							
							//data of parameter
							$.each(lstData, function(idx, obj) {
								$('<option>').val(obj.id).text(obj.name).appendTo(select);
							});
							
							
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
							
							
							//data of parameter
							$.each(lstData, function(idx, obj) {
								$('<option>').val(obj.id).text(obj.name).appendTo(select);
							});
							
							
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
</script>