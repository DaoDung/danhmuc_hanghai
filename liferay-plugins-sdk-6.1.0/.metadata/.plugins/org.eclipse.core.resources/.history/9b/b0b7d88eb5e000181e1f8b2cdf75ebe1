<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="java.util.List"%>
<%@page pageEncoding="UTF-8"%>


<%
List<Layout> rootLayouts = LayoutLocalServiceUtil.getLayouts(themeDisplay.getLayout().getGroup().getGroupId(),true);
String requestUrl = themeDisplay.getURLCurrent().replaceAll("%2F", "/");

%>
<div class="wd-sidebar">
	<ul class="danhsachhoso">
		<h2 class="tlemenu">BÁO CÁO THỐNG KÊ</h2>
		<%
          String url = "";
          String menuId = (String)portletSession.getAttribute(MenuConstraint.SESSION_MENU_SELECTED,PortletSession.APPLICATION_SCOPE);
         
          if (menuId != null && menuId.length() > 0 ) {
              menuId = menuId.replaceAll("/group/ke-hoach/", "/group/thu-tuc/");
          }
          
          if (menuId != null && menuId.length() > 0 ) {
        	  for (Layout obj1 : rootLayouts) {
        		  List<Layout> childrens = obj1.getAllChildren();
                  if(childrens != null &&childrens.size() > 0) {
                      for (Layout child : childrens) {
                    	  url = MenuConstraint.getURL(child);
                    	  if (requestUrl.contains(url)) {
                    		  menuId = url;
                              portletSession.setAttribute(MenuConstraint.SESSION_MENU_SELECTED, menuId ,PortletSession.APPLICATION_SCOPE);
                              break;
                    	  }
                      }
                  }
        	  }
          }
          
          for (Layout obj1 : rootLayouts) {
              if (obj1.getFriendlyURL().contains("bao-cao-thong-ke")) {
                  List<Layout> childrens = obj1.getAllChildren();
                  boolean status = true;
                  if(childrens != null &&childrens.size() > 0) {
                      for (Layout child : childrens) {
                          url = MenuConstraint.getURL(child);
                          if (url != null && menuId != null && url.compareTo(menuId) == 0) {
                              status = false;
                              break;
                          }
                      }
                      if (status) {
                          menuId = null;
                      }
                  }
              }
          }
          
          for (Layout obj1 : rootLayouts) {
        	  // Chi lay level 1.
        	 
        	  if (!obj1.getFriendlyURL().contains("bao-cao-thong-ke")) {
                  continue;
              }
        	  List<Layout> childrens = obj1.getAllChildren();
        	  if(childrens != null &&childrens.size() > 0) {
        		  for (Layout child : childrens) {
        			  
        			  url = MenuConstraint.getURL(child);
                      if (menuId == null || menuId.length() == 0 ) {
                          menuId = url;
                          portletSession.setAttribute(MenuConstraint.SESSION_MENU_SELECTED, menuId ,PortletSession.APPLICATION_SCOPE);
                      }
                      %>
		<portlet:actionURL var="sendDataToRegistrationPortletURL">
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=url %>" />
		</portlet:actionURL>
		<%
		if (url.contains("bao-cao-doi-chieu")) {
		%>
		<li class="baocao_doichieu">
			<%
                      } else if (url.contains("bao-cao-chi-tiet")) {
                          %>
		
		<li class="baocao_ct">
			<%
                      } else if (url.contains("bao-cao-khac")) {
                          %>
		
		<li class="baocao_khac">
			<%
                      } else if (url.contains("bao-cao-tong-hop")) {
                          %>
		
		<li class="baocao_th">
			<%
                      }
                      %> <a <%=MenuConstraint.getSelected(menuId, url, "active") %> href="<%=sendDataToRegistrationPortletURL.toString() %>"> <%=child.getNameCurrentValue() %>
		</a>
		</li>
		<%
                      
        		  }
        	  }
          }
          %>
	</ul>
	<%
     String loaiThuTuc = "";
     if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
         loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
     }
     %>
</div>