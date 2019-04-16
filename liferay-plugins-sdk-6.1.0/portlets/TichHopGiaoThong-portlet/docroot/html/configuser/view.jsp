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
<%@ include file="/html/init.jsp"%>
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
   	List<DmMaritime> dmPorts=  DmMaritimeLocalServiceUtil.findAll();
 %>
<form name ="searchIpmsListForm" method = "post" action = "<%=portletUrl.toString()%>" class="searchTransForm">
<div class="wd-content-container">
					<h2 class="tlemenu"><liferay-ui:message key="vn.gt.user_port.timkiem" /></h2>
				<div class="boxsearch">
								<thead>
									<tr>
									<td colspan="1"></td>
										<th width="90px"><liferay-ui:message key="vn.gt.user.port" />
										</th>
										<td>
											<select name="portCode" id="portCode"	>
											<%
											String portCode = ParamUtil.getString(request, "portCode");
											if (portCode == null) {
												portCode = "";
											} else {
												portCode = portCode.trim();
											}
											
											//ActionUtils.getValueString(request, "portHarbourCode");
											for (DmMaritime item : dmPorts) {
												%>
													<option  <%=item.getMaritimeCode().trim().equals(portCode) ? "selected" : ""%> value="<%=item.getMaritimeCode()%>"
													<%=ActionUtils.checkData(item.getMaritimeCode(),portCode)%>><%=item.getMaritimeNameVN()%></option>
													<%
												}
											%>
											</select>
										</td>
										<td>
										<%

									  	PortletURL nopHoSoRequestUrl = renderResponse.createRenderURL();
										nopHoSoRequestUrl.setParameter("jspPage", "/html/configuser/adduser.jsp");
										nopHoSoRequestUrl.setParameter("portCode", portCode);
										nopHoSoRequestUrl.setParameter("transactionKeyword", transactionKeyword);
										nopHoSoRequestUrl.setParameter("transType", transType);
									  	if (transactionKeyword.equals(StringPool.BLANK)) {
									  		transactionKeyword = defaultSearchStr;
									  	}
										%>
											<button type="button" onclick="javascript: window.location = '<%=nopHoSoRequestUrl.toString() %>'" >
											<img src="<%=request.getContextPath()%>/img/icon/icon_trakq.png"><liferay-ui:message
													key="vn.gt.add" />
											</button>
										</td>
										<td>
										<button type="submit"><i class="icon-fl ico_icon-search"></i><liferay-ui:message
													key="vn.gt.user_port.timkiem" /></button>
										</td>
									</tr>
								</thead>
						</div>
		<br />	
		<%
			String searchTransKeyword = transactionKeyword;
			if (searchTransKeyword.equals(defaultSearchStr)) {
				searchTransKeyword = null;
			}
			if (portCode != null && portCode.trim().length() > 0) {
				portletUrl.setParameter("portCode", portCode.trim());
			}
			
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

			List<UserPort> results = UserPortLocalServiceUtil.findByPortCode(portCode, start, end);

			long longTotal = UserPortLocalServiceUtil.countByPortCode(portCode);
 			int total = Integer.parseInt(String.valueOf(longTotal));
		    searchContainer.setTotal(total);
		    searchContainer.setResults(results);
		    searchContainer.setTotal(total);
			if(results != null){
		    List items = results;//searchContainer.getResultRows();
		    %>
<div class="wd-content-container bgdanhsach">
				<h2 class="tlemenu">
				<liferay-ui:message	key="vn.gt.danhsach.user" />
				</h2>
				<div class="boxnd">
					<table class="wd-table">
						<thead>
							<tr>
								<th  width="15px"><liferay-ui:message key="vn.gt.stt" /></th>
								<th><liferay-ui:message key="vn.gt.port.code" /></th>
								<th><liferay-ui:message key="vn.gt.status" /></th>
								<th><liferay-ui:message key="vn.gt.user_email" /></th>
								<th><liferay-ui:message key="vn.gt.ceatedate" /></th>
								<th><liferay-ui:message key="vn.gt.action" /></th>
							</tr>
						</thead>
						<tbody>
		    <%
			for (int i=0; i < results.size(); i++) {
				UserPort instance = (UserPort) items.get(i);
				String userId=  String.valueOf(instance.getUserId());
				User user_edit = UserLocalServiceUtil.fetchUserById(instance.getUserId());
			%>
							<tr>
								<td class="text-left"><%=(searchContainer.getStart()+i+1)%></td>
								<td class="text-left"><%=instance.getPortCode()%> </td>
								<td class="text-left">
								<%if(instance.getStatus()==1){ %>
									<liferay-ui:message key="vn.gt.active" />
								<%}else{%>
									<liferay-ui:message key="vn.gt.deactive" />
								<%} %>
								</td>
									<td class="text-left">
									<%if(user_edit!= null){ %>
									<%= user_edit.getEmailAddress()%>
									<%} %>
									</td>
								<td class="text-left"><%= vn.gt.utils.FormatData.parseDateToTring(instance.getCreateDate()) %></td>
								<td class="text-left">
								<%
							   	PortletURL editUrl = renderResponse.createRenderURL();
							   	editUrl.setParameter("jspPage", "/html/configuser/edituser.jsp");
							   	editUrl.setParameter("USER_PORTID", instance.getId()+"");
								%>
									<a href="<%=editUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_tiepnhan.png"></a>
									<a href="<%=editUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_xemhs.png"></a>
									<a href="<%=editUrl.toString()%>"><img src="<%=request.getContextPath()%>/img/icon/icon_trakq.png"></a>
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
<script type="text/javascript">
		if (<%= searchContainer.getStart() < 5 %>) {
			var pageTrans = document.searchTransForm.<portlet:namespace />page; 
			if (pageTrans) {
				pageTrans.value = "1";
			}
		}
</script>