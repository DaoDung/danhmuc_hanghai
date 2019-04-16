<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.impl.UserSignImpl"%>
<%@page import="vn.gt.dao.common.service.UserSignLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserSign"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>

<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletURL"%>

<%@ include file="init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	Boolean rolequantri = false;
	Boolean rolevanthu = false;
	Boolean rolelanhdao = false;
	User currentuser = UserLocalServiceUtil.fetchUser(themeDisplay.getUserId());
	for (Organization og : currentuser.getOrganizations()) {
		if (og.getName().equalsIgnoreCase(LanguageUtil.get(locale, "dong-bo"))) {
			rolequantri = true;    		
		}
		if (og.getGroup().getFriendlyURL().contains("van-thu")) {
			rolevanthu = true;    		
		}
		if (og.getGroup().getFriendlyURL().contains("lanh-dao")) {
			rolelanhdao = true;    		
		}
	}
	boolean roleBGTVT = false;
	UserPort userPort = UserPortLocalServiceUtil.findByUserId(themeDisplay.getUserId());
	if (userPort == null) {
		roleBGTVT= true;
	}
	
	UserSign userSign = UserSignLocalServiceUtil.getByUserId(themeDisplay.getUserId());
	
	if (userSign == null) { userSign = new UserSignImpl(); } 
	
	String portCode = userSign.getPortCode();
	
	PortletURL renderURL = renderResponse.createRenderURL();
	renderURL.setParameter("jspPage", "/html/quanlynguoidung/view.jsp");
	
	SearchContainer<UserSign> searchContainer = new SearchContainer<UserSign>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, renderURL, null, "");
	
	List<UserSign> userSigns = new ArrayList<UserSign>();
	int total = UserSignLocalServiceUtil.countByPortCode(portCode);
	
	if (roleBGTVT == true){
		userSigns = UserSignLocalServiceUtil.getByPortCode(portCode, searchContainer.getStart(), searchContainer.getEnd());
		searchContainer.setTotal(total);
		searchContainer.setResults(userSigns);
	} else if ((rolevanthu == true) || (rolelanhdao == true)) {
		userSigns = new ArrayList<UserSign>();
		if (portCode.isEmpty() || portCode== null){
			total = 0;
		}else{
			userSigns.add(userSign);
			total = 1;
		}
		
		
		searchContainer.setTotal(total);
		searchContainer.setResults(userSigns);
	}
	
	
	PortletURL updateURL = renderResponse.createRenderURL();
	updateURL.setParameter("userSignId", String.valueOf(userSign.getId()));
	updateURL.setParameter("jspPage", "/html/quanlynguoidung/edit.jsp");
	updateURL.setParameter("backURL", themeDisplay.getURLCurrent());
	
	

	
	
%>
<div class="container-user-sign clearfix container-fluid">
	<h3 class="col-xs-12">
	<span class="page-header">
		<i class="fa fa-th-list"></i> 
		Danh sách tài khoản ký số đã cập nhật
	</span>
	<a style="float: right;" class="btn btn-primary" href="<%=returnUrl %>"><i class="fa fa-reply"></i> Quay lại</a>
	<a style="float: right;" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
		<%		
		 if (rolequantri) {
		%>
		<a style="float: right;" class="btn btn-primary" href="<%=updateURL.toString() %>"><i class="fa fa-plus"></i> Thêm mới</a>
		<% } %>
		
	</h3>
	<div class="col-xs-12">
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />	
	</div>
	<div class="col-xs-12">
		<aui:form action="" name="fm" method="POST">
			<aui:input type="hidden" name="redirectURL" value="<%= themeDisplay.getURLCurrent() %>" />
			
			<table class="table table-striped table-bordered table-condensed table-hover">
				<thead>
					<tr>
						<th width="5%" class="text-center">STT</th>
						<th class="text-center">Cảng vụ</th>
						<th width="20%" class="text-center">Tài khoản</th>
						<th width="20%" class="text-center">Tên cán bộ</th>
						<th width="10%" class="text-center">Thao tác</th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (UserSign item : userSigns) {
					
					PortletURL editUrl = renderResponse.createRenderURL();
					editUrl.setParameter("jspPage", "/html/quanlynguoidung/edit.jsp");
					editUrl.setParameter("userSignId", String.valueOf(item.getId()));
					editUrl.setParameter("backURL", themeDisplay.getURLCurrent());
					
					PortletURL deleteUrl = renderResponse.createActionURL();
					deleteUrl.setParameter(ActionRequest.ACTION_NAME, "deleteUserSign");
					deleteUrl.setParameter("userSignId", String.valueOf(item.getId()));
					deleteUrl.setParameter("redirectURL", themeDisplay.getURLCurrent());
				%>
					<tr>
						<td class="text-center">
							<%									
							 if (rolequantri) {
							%>
							<a href="<%=editUrl.toString() %>">
								<%=(index++) + searchContainer.getStart() %>
							</a>
							<%    } else { %>
							<%=(index++) + searchContainer.getStart() %>
							<%									
							}
							%>
							
						</td>
						
						<td class="text-left">
							<%
							DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(item.getPortCode());
							%>
														<%									
							 if (rolequantri) {
							%>
							<a href="<%=editUrl.toString() %>">
								<%=maritime != null ? maritime.getMaritimeNameVN() : "" %>
							</a>
							<%    } else { %>
							<%=maritime != null ? maritime.getMaritimeNameVN() : "" %>
							<%									
							}
							%>
							
						</td>
						<td class="text-center">
							<%
							User user_ = null;
								try {
									user_ = UserLocalServiceUtil.getUser(item.getUserId());
								} catch(Exception e) {
									
								}
							%>
														<%									
							 if (rolequantri) {
							%>
							<a href="<%=editUrl.toString() %>">
								<%=user_ != null ? user_.getEmailAddress() : "" %>
							</a>
							<%    } else { %>
							<%=user_ != null ? user_.getEmailAddress() : "" %>
							<%									
							}
							%>
							
						</td>
						<td class="text-center">
														<%									
							 if (rolequantri) {
							%>
							<a href="<%=editUrl.toString() %>">
								<%=item.getTitle() %>
							</a>
							<%    } else { %>
							<%=item.getTitle() %>
							<%									
							}
							%>

						</td>
						<td class="text-center">
							<%
							 if (rolequantri) {
							%>
							<a href="<%=editUrl.toString() %>" class="btn"><i class="fa fa-edit"></i></a>
							<a onclick="submitForm('fm', '<%=deleteUrl.toString()%>')" class="btn"><i class="fa fa-remove"></i></a>
							<%    } %>
							
						</td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
			
			
		</aui:form>
	</div>
</div>

<script type="text/javascript">
function submitForm(idForm, url) {
	document.getElementById('<portlet:namespace/>' + idForm).action = url;
	
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById('<portlet:namespace/>' + idForm).submit(); 
	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}
</script>