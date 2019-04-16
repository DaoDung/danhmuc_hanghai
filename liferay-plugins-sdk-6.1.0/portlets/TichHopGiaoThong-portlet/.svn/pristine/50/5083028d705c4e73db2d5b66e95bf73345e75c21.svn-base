<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.dao.danhmuc.model.DmSyncCategory"%>
<%@page import="vn.gt.dao.danhmuc.service.DmSyncCategoryLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDataItem"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPortRegion"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortRegionLocalServiceUtil"%>
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
	String portCodeName = ParamUtil.getString(request, "portCodeName").trim();
	String portCodeNode2 = ParamUtil.getString(request, "portCodeNode2").trim();
	String portRegionNameVN = ParamUtil.getString(request, "portRegionNameVN").trim();
	
	if (maritimeCode == "") {
		maritimeCode = portCode;
	}

	PortletURL sPortletUrl = renderResponse.createRenderURL();
	sPortletUrl.setParameter("jspPage", "/html/danhmuc/view-DM_PORT_REGION.jsp");
   	
	
   	PortletURL portletUrl = renderResponse.createRenderURL();
   	portletUrl.setParameter("jspPage", "/html/danhmuc/view-DM_PORT_REGION.jsp");
   	portletUrl.setParameter("maritimeCode", maritimeCode);
   	portletUrl.setParameter("portCodeName", portCodeName);
   	portletUrl.setParameter("portCodeNode2", portCodeNode2);
   	portletUrl.setParameter("portRegionNameVN", portRegionNameVN);
  	
	PortletURL actionUrlSearchPortRegion = renderResponse.createActionURL();
	actionUrlSearchPortRegion.setParameter(ActionRequest.ACTION_NAME, "actionSearchPortRegion");
 %>
<form name ="searchIpmsListForm" method = "POST" action = "<%=sPortletUrl.toString() %>" class="searchTransForm">
<div class="container-user-sign clearfix container-fluid">
				<h3 class="col-xs-12 page-header"><i class="fa fa-th-list"></i> 
								<liferay-ui:message key="vn.gt.user_port.tracuu" /> 
								- Danh sách Khu vực hàng hải </h3>
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
								<select name='<portlet:namespace />maritimeCode' id="maritimeCode" style="width: 98%; margin-left: -50px;" >
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
							<th width="40%">Cảng biển hàng hải:&nbsp;
							</th>
							<td>
							<input type="hidden" id="portCodeName" name="<portlet:namespace />portCodeName" value="<%=portCodeName%>">
								<select disabled id="portCodeNode2" name="<portlet:namespace />portCodeNode2" style="width: 98%; margin-left: -50px;" onchange="onClickSelectHoldPortCodeName()">
								<option selected value="" style="width: 100%">---- Xem tất cả ------</option>
								<%
								String comparatorPortCodeName = "";
								List<DmDataItem> lstPortCodeName = DmDataItemLocalServiceUtil.getAllByDataGroupID(MessageType.NHOM_DM_CANG_BIEN_HANG_HAI, QueryUtil.ALL_POS, QueryUtil.ALL_POS);								
								for (DmDataItem item : lstPortCodeName) {
									%>
										
										<option <%=item.getNode2().equalsIgnoreCase(portCodeNode2) ? "selected" : "" %>
										value="<%=item.getNode2()%>" ><%=item.getName() %></option>
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
								<%						
								String comparatorPortWharfNameVN = StringPool.BLANK;
								%>
						<input type="text" id="portRegionNameVN" name="<portlet:namespace />portRegionNameVN" value="<%=portRegionNameVN%>" style="margin-left: -50px;"  >
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
						addCollectionUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portregion_details.jsp");
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
						,SearchContainer.DEFAULT_CUR_PARAM, currentTransPage, 10, portletUrl, null, null);	
			} else {
				searchContainer = new SearchContainer(renderRequest, null, null
						, SearchContainer.DEFAULT_CUR_PARAM, 10, portletUrl, null, null);
			} 
			
			int start = searchContainer.getStart();
			int end = searchContainer.getEnd();

			//List<DmPortRegion> results = DmPortRegionLocalServiceUtil.getDmPortRegions(start, end);
			List<DmPortRegion> results = DmPortRegionLocalServiceUtil.findDanhSachDmPortRegion(maritimeCode, portRegionNameVN, portCodeName, start, end);

			//long longTotal = DmPortRegionLocalServiceUtil.getDmPortRegions(-1, -1).size();
			long longTotal = DmPortRegionLocalServiceUtil.countDanhSachDmPortRegion(maritimeCode, portRegionNameVN, portCodeName);
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
								<th>Mã Khu vực hàng hải</th>
								<th>Tên Khu vực hàng hải</th>								
								<th>Cảng biển hàng hải</th>	
								<th>Trạng thái</th>							
								<th>Thao tác</th>
							</tr>
						</thead>
						<tbody>
		    <%
			for (int i=0; i < results.size(); i++) {
				DmPortRegion category = (DmPortRegion) items.get(i);
			%>
							<tr>
								<td class="text-center"><%=(searchContainer.getStart()+i+1)%></td>
								<td class="text-left"><%=category.getPortRegionCode()%> </td>
								<td class="text-left"><%=category.getPortRegionNameVN()%> </td>								
								<td class="text-left"><%=category.getPortCode()%> </td>
								<td class="text-left">
								<%
									String sTinhTrang = "";
									if (category.getIsDelete() == 0)
									{
										sTinhTrang = "Đang sử dụng";
								%>
									<%=sTinhTrang%>
								<%	
								 
									} else 
									{
										sTinhTrang = "Đã đánh dấu xóa" ;
								%>
									<font color="red"><%=sTinhTrang%></font>
								<%	
									} 
								%>
								
								</td>
								<td class="text-left">
								<%
								PortletURL editUrl = renderResponse.createRenderURL();
								editUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portregion_details.jsp");
								editUrl.setParameter("collectionId", category.getPortRegionCode());
								editUrl.setParameter(PageType.LAN_SUA_DU_LIEU, PageType.LAN_SUA_DU_LIEU);
								editUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
								
								PortletURL markupDeleteUrl = renderResponse.createRenderURL();
								markupDeleteUrl.setParameter("jspPage", "/html/danhmuc/edit_dm_portregion_details.jsp");
								markupDeleteUrl.setParameter("collectionId", category.getPortRegionCode());
								markupDeleteUrl.setParameter(PageType.LAN_XOA_DU_LIEU, PageType.LAN_XOA_DU_LIEU);
								markupDeleteUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
								%>
								
									<%		
		
									if (rolequantri && (portCode =="" || portCode.equals(category.getPortRegionRef())) ) {
									%>
									<a name="xemsua" id="xemsua" href="<%=editUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png">Xem, sửa</a>
									<% 
									if (category.getIsDelete() == 0)
									{
									%>
									<a name="danhdauxoa" id="danhdauxoa" href="<%=markupDeleteUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_delete.jpg">Đánh dấu xóa</a>
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
<portlet:actionURL var="findPortNameByPortCodeNode2" name="findPortNameByPortCodeNode2"/>
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
		var v_urlPortCodeName = '<%=findPortNameByPortCodeNode2.toString()%>';

		function onClickSelectHoldPortCodeName() {
			
			
		}
		
		
</script>