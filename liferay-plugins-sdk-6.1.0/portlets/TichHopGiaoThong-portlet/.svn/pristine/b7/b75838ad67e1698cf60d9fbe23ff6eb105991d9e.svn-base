<%@page import="vn.gt.dao.danhmuc.model.DmSyncCategory"%>
<%@page import="vn.gt.dao.danhmuc.service.DmSyncCategoryLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.nhapcanh.model.DocumentGeneral"%>
<%@page import="vn.gt.dao.nhapcanh.service.DocumentGeneralLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="vn.gt.portlet.Utils"%>
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
  	
  	PortletURL portletUrl = renderResponse.createRenderURL();

   	long uid = PortalUtil.getUserId(request);
   	long	 cqqlId = -1;
   	List<DmMaritime> maritimes=  DmMaritimeLocalServiceUtil.findAll();
 %>

<form name ="searchIpmsListForm" method = "post" action = "<%=portletUrl.toString()%>">
		<%
			SearchContainer searchContainer = null;
			if (currentTransPage > 0) {
				searchContainer = new SearchContainer(renderRequest, null, null
						,SearchContainer.DEFAULT_CUR_PARAM, currentTransPage, 10, portletUrl, null, null);	
			} else {
				searchContainer = new SearchContainer(renderRequest, null, null
						, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, null);
			} 
			
			int start = searchContainer.getStart();
			int end = searchContainer.getEnd();

			List<DmSyncCategory> results = DmSyncCategoryLocalServiceUtil.getDmSyncCategories(start, end);

			long longTotal = DmSyncCategoryLocalServiceUtil.getDmSyncCategories(-1, -1).size();
 			int total = Integer.parseInt(String.valueOf(longTotal));
		    searchContainer.setTotal(total);
		    searchContainer.setResults(results);
		    searchContainer.setTotal(total);
			if(results != null){
		    List items = results;//searchContainer.getResultRows();
		    %>
	<div class="container-user-sign clearfix container-fluid">
				<h3 class="col-xs-12">
					<span class="page-header" style="display: block !important">
						<i class="fa fa-th-list"></i> 
						Bảng danh mục nghiệp vụ Hàng hải
						<a style="float: right;" class="btn btn-primary" href="<%=returnUrl %>"><i class="fa fa-reply"></i> Quay lại</a>	
					</span>
				</h3>
				<div class="col-xs-12">
						<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
				</div>
				<div class="col-xs-12">
					<table class="wd-table">
						<thead>
							<tr>
								<th width="5%" class="text-center">STT</th>
								<th >Mã danh mục</th>
								<th >Tên danh mục</th>		
													
							</tr>
						</thead>
						<tbody>
		    <%
			for (int i=0; i < results.size(); i++) {
				DmSyncCategory category = (DmSyncCategory) items.get(i);
				if ((category.getCategoryId().contains("DMDC_SHIP")) == false) {
			%>
							<tr>
								
								<%
								PortletURL editUrl = renderResponse.createRenderURL();
								editUrl.setParameter("jspPage", "/html/danhmuc/view-" + category.getCategoryId() + ".jsp");
								editUrl.setParameter("categoryId", category.getCategoryId());
								editUrl.setParameter("backURL", themeDisplay.getURLCurrent());
								%>
								
								<td class="text-center" ><%=(searchContainer.getStart()+i+1)%></td>
								<td class="text-left" ><%=category.getCategoryId()%> </td>
								<%
									if ((category.getCategoryId().contains("DM_PORT_REGION") ) || (category.getCategoryId().contains("DM_PORT_WHARF") )
									|| (category.getCategoryId().contains("DM_PORT_HARBOUR") ) 
									|| (category.getCategoryId().contains("DM_MARITIME") ) 
									|| (category.getCategoryId().contains("DM_DATAITEM_GROUP107"))
									|| (category.getCategoryId().contains("DM_TUYEN_LUONG"))){
								%>
									<td class="text-left" ><a href="<%=editUrl.toString()%>"><%=category.getCategoryDescription()%> </a></td>
								<%} else {%>
									<td class="text-left" ><%=category.getCategoryDescription()%> </td>
								<%}  %>
								
							</tr>
							<% } }
						}%>							
						</tbody>
					</table>
					
 		</div>
 		
 		</div>
</form>		
<script type="text/javascript">
		if (<%= searchContainer.getStart() < 5 %>) {
			// var pageTrans = document.searchTransForm.<portlet:namespace />page; 
			// if (pageTrans) {
				// pageTrans.value = "1";
			// }
		}
</script>