<%@page import="vn.gt.portlet.thongtintau.ThongTinTauUtils"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gt.portlet.thongtintau.ThongTinTauAction"%>
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
List<Layout> rootLayouts = LayoutLocalServiceUtil.getLayouts(themeDisplay.getLayout().getGroup().getGroupId(), themeDisplay.getLayout().getPrivateLayout());
String requestUrl = themeDisplay.getURLCurrent().replaceAll("%2F", "/");
%>
<div class="wd-sidebar">
     <ul class="danhsachhoso">
   <% if  (flagLanguage.contains("VN")) { %>
          <h2 class="tlemenu">TRA CỨU THÔNG TIN TÀU</h2>
	<%	} else { %>
	<h2 class="tlemenu">TRA CỨU THÔNG TIN /Quick links</h2>
	<%	}%>
          <%
          String url = "";
          String menuId = (String)portletSession.getAttribute(MenuConstraint.SESSION_MENU_SELECTED,PortletSession.APPLICATION_SCOPE);
          
          if (ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED).trim().length()>0){
        	  menuId=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED);
        	  requestUrl=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED);
          }else if ((ParamUtil.getString(request, "flagMenu").trim().length()>0) && menuId.contains("/group/ke-hoach")){
        	  menuId="/group/ke-hoach/"+ThongTinTauUtils.getUrlFlag(flagMenu);
        	  requestUrl="/group/ke-hoach/"+ThongTinTauUtils.getUrlFlag(flagMenu);
          }else if ((ParamUtil.getString(request, "flagMenu").trim().length()>0) && menuId.contains("/group/thu-tuc")){
        	  menuId="/group/thu-tuc/"+ThongTinTauUtils.getUrlFlag(flagMenu);
        	  requestUrl="/group/thu-tuc/"+ThongTinTauUtils.getUrlFlag(flagMenu);
          } else if ((ParamUtil.getString(request, "flagMenu").trim().length()>0) && themeDisplay.getScopeGroup().getName().equalsIgnoreCase("guest")){
        	  menuId = "/" + ThongTinTauUtils.getUrlFlag(flagMenu);
        	  requestUrl = "/"+ThongTinTauUtils.getUrlFlag(flagMenu);
          }
          if (menuId != null && menuId.length() > 0 ) {
        	  for (Layout obj1 : rootLayouts) {
        		  List<Layout> childrens = obj1.getAllChildren();
                  if(childrens != null &&childrens.size() > 0) {
                      for (Layout child : childrens) {
                    	url = MenuConstraint.getURL(child);

						if(!child.getPrivateLayout()) {
							url = child.getFriendlyURL();
						}

                    	  if (requestUrl.contains(url)) {
                    		  menuId = url;
                              portletSession.setAttribute(MenuConstraint.SESSION_MENU_SELECTED, menuId ,PortletSession.APPLICATION_SCOPE);
                              if (url.contains("giay-phep-roi-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.GIAY_PHEP_ROI_CANG) ,PortletSession.APPLICATION_SCOPE);
                              } else if (url.contains("giay-phep-qua-canh")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.GIAY_PHEP_QUA_CANH) ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("giay-phep-tau-thuyen-vao-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("giay-phep-tau-thuyen-roi-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("giay-phep-pttnd-vao-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              }else if (url.contains("giay-phep-pttnd-roi-cang")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              } else if (url.contains("thong-tin-tau")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.THONG_TIN_TAU) ,PortletSession.APPLICATION_SCOPE);
                              } else if (url.contains("ke-hoach-dieu-dong-tau")) {
                                  portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.KE_HOACH_DIEU_DONG_TAU) ,PortletSession.APPLICATION_SCOPE);
                              }
                              break;
                    	  }
                      }
                  }
        	  }
          }
          
          for (Layout obj1 : rootLayouts) {
              if (obj1.getFriendlyURL().contains("quan-ly-thong-tin-tau") 
            		  || obj1.getFriendlyURL().contains("tra-cuu-giay-phep")) {
                  List<Layout> childrens = obj1.getAllChildren();
                  boolean status = true;
                  if(childrens != null &&childrens.size() > 0) {
                      for (Layout child : childrens) {
                          url = MenuConstraint.getURL(child);

		          		  if(!child.getPrivateLayout()) {
	                      	url = child.getFriendlyURL();
                          }
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
        	  if (!(obj1.getFriendlyURL().contains("quan-ly-thong-tin-tau") 
        			  || obj1.getFriendlyURL().contains("tra-cuu-giay-phep"))) {
                  continue;
              }
        	  List<Layout> childrens = obj1.getAllChildren();
        	  if(childrens != null && childrens.size() > 0) {
        		  for (Layout child : childrens) {
        			  
        			  url = MenuConstraint.getURL(child);
        			  
        			  if(!child.getPrivateLayout()) {
	                      	url = child.getFriendlyURL();
                      }
                      
        			  if (menuId == null || menuId.length() == 0 ) {
                          menuId = url;
                          portletSession.setAttribute(MenuConstraint.SESSION_MENU_SELECTED, menuId ,PortletSession.APPLICATION_SCOPE);
                          if (url.contains("giay-phep-roi-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.GIAY_PHEP_ROI_CANG) ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (url.contains("giay-phep-qua-canh")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.GIAY_PHEP_QUA_CANH) ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }else if (menuId.contains("giay-phep-tau-thuyen-vao-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }else if (menuId.contains("giay-phep-tau-thuyen-roi-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (menuId.contains("giay-phep-pttnd-vao-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_VAO_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }else if (menuId.contains("giay-phep-pttnd-roi-cang")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, MessageType.LOAT_THU_TUC_ROI_CANG_PTTND ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (url.contains("thong-tin-tau")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.THONG_TIN_TAU) ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          } else if (url.contains("ke-hoach-dieu-dong-tau")) {
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC, String.valueOf(ThongTinTauAction.KE_HOACH_DIEU_DONG_TAU) ,PortletSession.APPLICATION_SCOPE);
                              portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                          }
                      }
                      if (MenuConstraint.getSelected(menuId, url, "active").length() > 0) {
                    	  portletSession.setAttribute(MessageType.LOAT_THU_TUC_TEN, child.getNameCurrentValue() ,PortletSession.APPLICATION_SCOPE);
                      }
                      %>
                      
                      
                      <portlet:actionURL var="sendDataToRegistrationPortletURL"   name="menu"  >
                      </portlet:actionURL>
                      <%

                      if (url.contains("giay-phep-roi-cang")) {
                          %>
                          <li class="roicang">
                          <%
                      } else if (url.contains("giay-phep-qua-canh")) {
                          %>
                          <li class="KH_dieudong">
                          <%
                      } else if (url.contains("thong-tin-tau")) {
                          %>
                          <li class="tt_tau">
                          <%
                      } else if (url.contains("ke-hoach-dieu-dong-tau")) {
                          %>
                          <li class="kehoach_dieudong">
                          <%
                      }else if (url.contains("giay-phep-tau-thuyen-vao-cang") || url.contains("giay-phep-pttnd-vao-cang")) {
                          %>
                          <li class="vaocang">
                          <%
                      } else if (url.contains("giay-phep-tau-thuyen-roi-cang")|| url.contains("giay-phep-pttnd-roi-cang")) {
                          %>
                          <li class="roicang">
                          <%
                      } else {
     			%><li class="test"><%
                      }
                      %>
                       <aui:form action="<%=sendDataToRegistrationPortletURL%>" method="POST" name="myForm" id="myForm">
                           <input type="hidden" name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" id="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value=""/>
                            <%

                            
                      if (flagLanguage.contains("VN")) {
                          %>
                           <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')"  >
		                               <%=child.getNameCurrentValue() %>
                          </a>
                           <%
                      }else if (flagLanguage.contains("EN") && url.contains("giay-phep-roi-cang")) {
                          %>
                          <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')"  >
		                                <%=child.getNameCurrentValue() %><br><%="Port Clearance" %>
                          </a>
                          <%
                     } else if (flagLanguage.contains("EN") && url.contains("ke-hoach-dieu-dong-tau")) {
                         %>
                         <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')"  >
	                                <%=child.getNameCurrentValue() %><br><%="Shifting Order" %>
                         </a>
                         <%
                     } else if (flagLanguage.contains("EN") && url.contains("giay-phep-qua-canh")) {
                         %>
                         <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')"  >
	                                <%=child.getNameCurrentValue() %><br><%="Permission For Transit" %>
                         </a>
                         <%
                     } else if (flagLanguage.contains("EN") && url.contains("thong-tin-tau")) {
                    	// Cuc HHVN yeu cau khong public 
                         %>
                         
                        <%--  
                        <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')"  >
	                               <%="Ship Certificate Review" %>
                         </a> --%>
                         <%
                      } else if (flagLanguage.contains("EN")) {
	     			%>
	     			 <a <%=MenuConstraint.getSelected(menuId, url, "active") %>   onclick="getData('<%=url%>','<%=sendDataToRegistrationPortletURL%>')"  >
	                               <%=child.getNameCurrentValue() %>
                         </a>
    					<%
                      }
                      %>
                         
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
     %>
</div>
<script type="text/javascript">
	function getData(data,url) {
		document.getElementById("SESSION_MENU_SELECTED").value=data;
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	}
</script>
