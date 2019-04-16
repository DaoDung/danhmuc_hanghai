<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
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
          <h2 class="tlemenu">Danh sách hồ sơ
          </h2>
          <%
          String url = "";
          String menuId = (String)portletSession.getAttribute(MenuConstraint.SESSION_MENU_SELECTED,PortletSession.APPLICATION_SCOPE);
          if (menuId != null && menuId.length() > 0 ) {
               menuId = menuId.replaceAll("/group/thu-tuc/", "/group/ke-hoach/");
          }
          if (ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED).trim().length()>0){
        	  menuId=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED);
        	  requestUrl=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED);
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
                              if (url.contains("danh-sach-tau-thuyen-nhap-canh")) {
                            	  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_NHAP_CANH ,PortletSession.APPLICATION_SCOPE);
                              } else if (url.contains("danh-sach-tau-thuyen-xuat-canh")) {
                            	  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_XUAT_CANH ,PortletSession.APPLICATION_SCOPE);
                              } else if (url.contains("danh-sach-tau-thuyen-qua-canh")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_QUA_CANH ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("danh-sach-tau-thuyen-vao-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("danh-sach-tau-thuyen-roi-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("pttnd-vao-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("pttnd-roi-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              } else if (url.contains("lich-su-tau-thuyen-di-chuyen")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN ,PortletSession.APPLICATION_SCOPE);
                              }
                              break;
                    	  }
                      }
                  }
        	  }
          }
          
          for (Layout obj1 : rootLayouts) {
              if (obj1.getFriendlyURL().contains("quan-ly-thu-tuc-tau-bien")) {
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
        	 if (!obj1.getFriendlyURL().contains("quan-ly-thu-tuc-tau-bien")) {
                  continue;
              }
        	  List<Layout> childrens = obj1.getAllChildren();
        	  if(childrens != null &&childrens.size() > 0) {
        		  for (Layout child : childrens) {
        			  
        			  url = MenuConstraint.getURL(child);
                      if (menuId == null || menuId.length() == 0 ) {
                          menuId = url;
                          portletSession.setAttribute(MenuConstraint.SESSION_MENU_SELECTED, menuId ,PortletSession.APPLICATION_SCOPE);
                          if (url.contains("danh-sach-tau-thuyen-nhap-canh")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_NHAP_CANH ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (menuId.contains("danh-sach-tau-thuyen-xuat-canh")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_XUAT_CANH ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (menuId.contains("danh-sach-tau-thuyen-qua-canh")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_QUA_CANH ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }else if (menuId.contains("danh-sach-tau-thuyen-vao-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }else if (menuId.contains("danh-sach-tau-thuyen-roi-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (menuId.contains("pttnd-vao-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }else if (menuId.contains("pttnd-roi-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (menuId.contains("lich-su-tau-thuyen-di-chuyen")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }
                      }
                      if (MenuConstraint.getSelected(menuId, url, "active").length() > 0) {
                    	  portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                      }
                      %>
                      <portlet:actionURL var="sendDataToRegistrationPortletURL"  name="menuKeHoach" >
                      </portlet:actionURL>
                      <%
                      if (url.contains("danh-sach-tau-thuyen-nhap-canh")) {
                          %>
                          <li class="nhapcanh">
                          <%
                      } else if (url.contains("danh-sach-tau-thuyen-xuat-canh")) {
                    	  %>
                          <li class="xuatcanh">
                          <%
                      } else if (url.contains("danh-sach-tau-thuyen-qua-canh")) {
                    	  %>
                          <li class="quacanh">
                          <%
                      } else if (url.contains("danh-sach-tau-thuyen-vao-cang") || url.contains("pttnd-vao-cang")) {
                          %>
                          <li class="vaocang">
                          <%
                      } else if (url.contains("danh-sach-tau-thuyen-roi-cang") || url.contains("pttnd-roi-cang")) {
                          %>
                          <li class="roicang">
                          <%
                      } else if (url.contains("lich-su-tau-thuyen-di-chuyen")) {
                    	  %>
                          <li class="lichsu">
                          <%
                      }
                      %>
                       <aui:form action="<%=sendDataToRegistrationPortletURL%>" method="POST" name="myForm" id="myForm">
                       <input type="hidden" name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" id="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value=""/>
                          <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')" >
                               <%=child.getNameCurrentValue() %>
                          </a>
                       </aui:form>   
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
    if (pageType != null && FormatData.convertToInt(pageType.toString()) == PageType.KE_HOACH_DETAIL) {
    	%>
        <jsp:include page="/html/menu/menu-kehoach-detail.jsp"/>
        <%
    } 
     %>
</div>

<script type="text/javascript">
	function getData(data,url) {
		document.getElementById("SESSION_MENU_SELECTED").value=data;
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}
</script>