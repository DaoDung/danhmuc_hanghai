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
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
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
	
	String maritimeCode= ParamUtil.getString(request, "maritimeCode").trim();
	String holdPortRegionCode = ParamUtil.getString(request, "holdPortRegionCode").trim();
	String portHarbourNameVN = ParamUtil.getString(request, "portHarbourNameVN").trim();
	
	PortletURL portletUrl = renderResponse.createRenderURL() ;
  	portletUrl.setParameter("jspPage", "/html/danhmuc/view-DM_PORT_HARBOUR.jsp");
  	
	PortletURL portletUrlParam = renderResponse.createRenderURL() ;
	portletUrlParam.setParameter("jspPage", "/html/danhmuc/view-DM_PORT_HARBOUR.jsp");
	portletUrlParam.setParameter("maritimeCode", maritimeCode);
	portletUrlParam.setParameter("holdPortRegionCode", holdPortRegionCode);
	portletUrlParam.setParameter("portHarbourNameVN", portHarbourNameVN);
	
	if (maritimeCode == "") {
		maritimeCode = portCode;
	}
 %>
<form name ="searchIpmsListForm" method = "post" action = "<%=portletUrl.toString()%>" class="searchTransForm">
<div class="container-user-sign clearfix container-fluid">
				<h3 class="col-xs-12 page-header"><i class="fa fa-th-list"></i> 
								<liferay-ui:message key="vn.gt.user_port.tracuu" /> 
								- Danh sách Bến cảng </h3>
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
								<select name="maritimeCode" id="maritimeCode" style="width: 98%; margin-left: -50px;" onchange="onClickSelectHoldMaritimePortCode(<%=portCode.trim()%>)">
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
								<select id="holdPortRegionCode" name="holdPortRegionCode" style="width: 98%; margin-left: -50px;">
								<option selected value="" style="width: 100%">---- Xem tất cả ------</option>
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
								<%						
								String comparatorPortWharfNameVN = StringPool.BLANK;
								%>
								<input type="text" id="portHarbourNameVN" name="portHarbourNameVN" value="<%=portHarbourNameVN%>" style="margin-left: -50px;" >
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
							addCollectionUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portharbour_details.jsp");
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

			//List<DmPortHarbour> results = DmPortHarbourLocalServiceUtil.getDmPortHarbours(start, end);
			List<DmPortHarbour> results = DmPortHarbourLocalServiceUtil.findDanhSachDmPortHarbour(maritimeCode, holdPortRegionCode, portHarbourNameVN, start, end);

			//long longTotal = DmPortHarbourLocalServiceUtil.getDmPortHarbours(-1, -1).size();
			long longTotal = DmPortHarbourLocalServiceUtil.countDanhSachDmPortHarbour(maritimeCode, holdPortRegionCode, portHarbourNameVN);
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
								<th>Mã Bến cảng</th>
								<th>Tên Bến cảng</th>								
								<th>Cảng biển hàng hải</th>
								<th>Khu vực hàng hải</th>
								<th>Trạng thái</th>
								<th>Thao tác</th>
							</tr>
						</thead>
						<tbody>
		    <%
			for (int i=0; i < results.size(); i++) {
				String valuePortCode = "";
				String valuePortRegionNameVN = "";
				DmPortHarbour category = (DmPortHarbour) items.get(i);				
				DmPortRegion dmPortRegionItem = DmPortRegionLocalServiceUtil.getByPortRegionCode(category.getPortRegion());		
				if (dmPortRegionItem != null){
					valuePortCode = dmPortRegionItem.getPortCode();
					valuePortRegionNameVN = dmPortRegionItem.getPortRegionNameVN();
				}
			%>
							<tr>
								<td class="text-center"><%=(searchContainer.getStart()+i+1)%></td>
								<td class="text-left"><%=category.getPortHarbourCode()%> </td>
								<td class="text-left"><%=category.getPortHarbourNameVN()%> </td>
								<td class="text-left"><%= valuePortCode %> </td>
								<td class="text-left"><%= valuePortRegionNameVN%> </td>								
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
								editUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portharbour_details.jsp");
								editUrl.setParameter("collectionId", category.getPortHarbourCode());
								editUrl.setParameter(PageType.LAN_SUA_DU_LIEU, PageType.LAN_SUA_DU_LIEU);
								editUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
								
								PortletURL markupDeleteUrl = renderResponse.createRenderURL();
								markupDeleteUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portharbour_details.jsp");
								markupDeleteUrl.setParameter("collectionId", category.getPortHarbourCode());
								markupDeleteUrl.setParameter(PageType.LAN_XOA_DU_LIEU, PageType.LAN_XOA_DU_LIEU);
								markupDeleteUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
								%>
								<%		
		
								if (rolequantri && (portCode =="" || portCode.equals(category.getPortRegionCode())) ) {
								%>
									<a href="<%=editUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png">Xem, sửa</a>
									<% 
									if (category.getIsDelete() == 0)
									{
									%>
									<a href="<%=markupDeleteUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg">Đánh dấu xóa</a>
									<% 
									}
									%>
								<%    } %>
									
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
								
				var selectRegion = $('#holdPortRegionCode');
				selectRegion.find('option').remove();
				$('<option>').val('').text('---- Lựa chọn ------').appendTo(selectRegion);
				
				
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
			
			
		}
</script>