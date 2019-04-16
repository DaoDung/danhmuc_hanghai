
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
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %> 
<%@ page import="javax.portlet.PortletURL" %>
<portlet:defineObjects />
<head>
			
</head>
 <%
 
 	SimpleDateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
 	int ACTIVATED=0;
 	String defaultSearchStr = "Nh&#7853;p m&#227; h&#7891; s&#417;";
  	String transactionKeyword  = ParamUtil.getString(request,"transactionKeyword", StringPool.BLANK);
  	int currentTransPage  = ParamUtil.getInteger(request,"currentTransPage");
  	String transType = ParamUtil.getString(request, "transType", "0");
  	
  	PortletURL nopHoSoRequestUrl = renderResponse.createRenderURL();
	nopHoSoRequestUrl.setParameter("jspPage", "/html/portlet/ipmslistportlet/view.jsp");
	nopHoSoRequestUrl.setParameter("jsp_include", "/html/portlet/ipmslistportlet/offline/nopHoSoOffline.jsp");
	nopHoSoRequestUrl.setParameter("transactionKeyword", transactionKeyword);
	nopHoSoRequestUrl.setParameter("transType", transType);
	nopHoSoRequestUrl.setParameter("tabs1", "tab.ipmslist.dangHD");
	
  	if (transactionKeyword.equals(StringPool.BLANK)) {
  		transactionKeyword = defaultSearchStr;
  	}

  	PortletURL portletUrl = renderResponse.createRenderURL();

  	portletUrl.setParameter(Utils.PARAM_VIEW_TYPE, Utils.VIEW_TRANSACTION_LIST);	
  	portletUrl.setParameter("tabs1", "tab.ipmslist.dangHD");	
  	
 	//User currentUser = PortalUtil.getUser(request);
   	long uid = PortalUtil.getUserId(request);
   	long	 cqqlId = -1;
   	//List<CongChuc>  congChucs =	 null;	

	
 %>
<form name ="searchIpmsListForm" method = "post" action = "<%=portletUrl.toString()%>" class="searchTransForm">

	<liferay-ui:success message="vn.dtt.registry.sucessfuly.message" key="vn.dtt.registry.sucessfuly.message"/>

<div class="egov-container">	
	<table cellpadding="0" cellspacing="0"  class="egov-table"  width="100%">
		<tr>
		    <th align = "center"><liferay-ui:message key="vn.dtt.cmon.ipms.list.stt"/></th>
		    <th scope="col"><liferay-ui:message key="vn.dtt.cmon.ipms.list.maHs"/></th>
		    <th scope="col"><liferay-ui:message key="vn.dtt.cmon.ipms.list.dvc"/></th>
		    <th scope="col"><liferay-ui:message key="vn.dtt.cmon.ipms.list.nguoiGui"/></th>
		    <th scope="col"><liferay-ui:message key="vn.dtt.cmon.ipms.list.ngayNop"/></th>
		    <th scope="col"><liferay-ui:message key="vn.dtt.cmon.ipms.list.ngayHenTra"/></th>
		</tr>
		<%
			String searchTransKeyword = transactionKeyword;
			if (searchTransKeyword.equals(defaultSearchStr)) {
				searchTransKeyword = null;
			}
			portletUrl.setParameter("transType", transType);
			if (searchTransKeyword != null) {
				portletUrl.setParameter("transactionKeyword", searchTransKeyword);
			}
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
			
			// TODO user login se duoc gan cho Co quan quan ly sau, ma ung dung QLDT doc tu file config 10052
			List<DocumentGeneral>	results = DocumentGeneralLocalServiceUtil.findAll(start, end);


			long longTotal = DocumentGeneralLocalServiceUtil.countAll();
				
 			int total = Integer.parseInt(String.valueOf(longTotal));
		    searchContainer.setTotal(total);
		    searchContainer.setResults(results);
		    searchContainer.setTotal(total);
			
		    List items = results;//searchContainer.getResultRows();
			for (int i=0; i < results.size(); i++) {
				DocumentGeneral instance = (DocumentGeneral) items.get(i);
		%>
			<tr>
				<td><%=(searchContainer.getStart()+i+1)%></td>
				<td><%=instance.getDocumentNo()%> </td>
				<td  align = "left" class="bold">
					<portlet:renderURL var="brms_viewDetails">
	 				   	<portlet:param name="ipmsId" value="<%=String.valueOf(instance.getId())%>" />
						<portlet:param name="<%=Utils.PARAM_VIEW_TYPE%>" value="<%=Utils.VIEW_TRANSACTION_DETAILS%>" />
						<portlet:param name="transType" value="<%=transType%>" />
					 	<portlet:param name="currentTransPage" value="<%=String.valueOf(searchContainer.getCur())%>" />
					 	<portlet:param name="transactionKeyword" value="<%=transactionKeyword%>" />
					 	<portlet:param name="tabs1" value="tab.ipmslist.dangHD" />
					 </portlet:renderURL>
					<a href="<%=brms_viewDetails%>"><%= instance.getCrewNumber()%></a>
				</td>
				<td align = "left">	
					<%= instance.getBriefDescriptionCargo() %>
				</td>	
				<td>
					<%= instance.getCallSign()%>
				</td>
				
				<td>
					aaa	
				</td>
			</tr>
		<% } %>
	</table>

		<br />
		<div id = "paginationTrans">
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</div>
</div> 		
</form>		
<script type="text/javascript">
		if (<%= searchContainer.getStart() < 5 %>) {
			var pageTrans = document.searchTransForm.<portlet:namespace />page; 
			if (pageTrans) {
				pageTrans.value = "1";
			}
		}
</script>