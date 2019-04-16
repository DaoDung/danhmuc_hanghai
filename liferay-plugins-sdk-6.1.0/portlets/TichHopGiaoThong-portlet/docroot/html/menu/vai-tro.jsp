<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="java.util.List"%>
<%@page pageEncoding="UTF-8"%>

<div class="bt_top">
    <%
    boolean kehoach = false;
    boolean thutuc = false;
    boolean vanthu = false;
    boolean lanhdao = false;
    String urlKeHoach = "/group/ke-hoach";
    String urlThuTuc = "/group/thu-tuc";
    String urlVanThu = "/group/van-thu";
    String urlLanhDao = "/group/lanh-dao";
    String oldValue = (String)portletSession.getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE);
    long idKeHoachOr = 0;
    long idThuTucOr = 0;
    long idVanThuOrg = 0;
    long idLanhDaoOrg = 0;
    for (Organization og : user.getOrganizations()) {
    	if (og.getGroup().getFriendlyURL().contains("ke-hoach")) {
    		kehoach = true;
    		idKeHoachOr = og.getOrganizationId();
    		if (menuId != null && menuId.contains("/")) {
    			urlKeHoach = "/group" + og.getGroup().getFriendlyURL() + menuId.subSequence(menuId.lastIndexOf("/"), menuId.trim().length());
    		} else {
    			urlKeHoach = "/group" + og.getGroup().getFriendlyURL();
    		}
    	}
    	
    	if (og.getGroup().getFriendlyURL().contains("thu-tuc")) {
    		thutuc = true;
    		idThuTucOr = og.getOrganizationId();
    		if (menuId != null && menuId.contains("/")) {
    			urlThuTuc = "/group" + og.getGroup().getFriendlyURL() + menuId.subSequence(menuId.lastIndexOf("/"), menuId.trim().length());
            } else {
            	urlThuTuc = "/group" + og.getGroup().getFriendlyURL();
            }
        }
    	
    	if (og.getGroup().getFriendlyURL().contains("van-thu")) {
    		vanthu = true;
    		idVanThuOrg = og.getOrganizationId();
    		
//     		if (menuId != null && menuId.contains("/")) {
//     			urlVanThu = "/group" + og.getGroup().getFriendlyURL() + menuId.subSequence(menuId.lastIndexOf("/"), menuId.trim().length());
//             } else {
//             	urlVanThu = "/group" + og.getGroup().getFriendlyURL() + "/quan-ly-thu-tuc-tau-bien";
//             }
    		urlVanThu = "/group" + og.getGroup().getFriendlyURL() + "/quan-ly-thu-tuc-tau-bien";	
        }
    	
    	if (og.getGroup().getFriendlyURL().contains("lanh-dao")) {
    		lanhdao = true;
    		idLanhDaoOrg = og.getOrganizationId();
    		
    		urlLanhDao = "/group" + og.getGroup().getFriendlyURL() + "/quan-ly-thu-tuc-tau-bien";	
        }
    }
    
    if (kehoach && !thutuc) {
        portletSession.setAttribute(PageType.ROLE_TYPE, PageType.KE_HOACH ,PortletSession.APPLICATION_SCOPE);
        portletSession.setAttribute(PageType.ORGANIZATION_TYPE, String.valueOf(idKeHoachOr) ,PortletSession.APPLICATION_SCOPE);
        %>
        <a class="bt_thutucatvi" href="<%=urlKeHoach %>"><liferay-ui:message key="vn.dtt.kehoach.kehoach" /><img src="<%=request.getContextPath()%>/img/front/bt_active.png"></a>
        <%
    } else if (thutuc && !kehoach) {
        portletSession.setAttribute(PageType.ROLE_TYPE, PageType.THU_TUC ,PortletSession.APPLICATION_SCOPE);
        portletSession.setAttribute(PageType.ORGANIZATION_TYPE, String.valueOf(idThuTucOr) ,PortletSession.APPLICATION_SCOPE);
        %>
        <a class="bt_thutucatvi" href="<%=urlThuTuc %>"><liferay-ui:message key="vn.dtt.kehoach.thutuc" /><img src="<%=request.getContextPath()%>/img/front/bt_active.png"></a>
        <%
    } else if (thutuc && kehoach){
    	if (requestUrl.contains("/ke-hoach/")) {
        	portletSession.setAttribute(PageType.ROLE_TYPE, PageType.KE_HOACH ,PortletSession.APPLICATION_SCOPE);
            portletSession.setAttribute(PageType.ORGANIZATION_TYPE, String.valueOf(idKeHoachOr) ,PortletSession.APPLICATION_SCOPE);
            %>
            <a class="bt_thutucatvi" href="<%=urlKeHoach %>"><liferay-ui:message key="vn.dtt.kehoach.kehoach" /><img src="<%=request.getContextPath()%>/img/front/bt_active.png"></a>
            <a class="bt_kehoach" href="<%=urlThuTuc %>"><liferay-ui:message key="vn.dtt.kehoach.thutuc" /><img src="<%=request.getContextPath()%>/img/front/iconbt.png"></a>
            <%
        } else if (requestUrl.contains("/thu-tuc/")) {
        	portletSession.setAttribute(PageType.ROLE_TYPE, PageType.THU_TUC ,PortletSession.APPLICATION_SCOPE);
            portletSession.setAttribute(PageType.ORGANIZATION_TYPE, String.valueOf(idThuTucOr) ,PortletSession.APPLICATION_SCOPE);
            %>
            <a class="bt_kehoach" href="<%=urlKeHoach %>"><liferay-ui:message key="vn.dtt.kehoach.kehoach" /><img src="<%=request.getContextPath()%>/img/front/iconbt.png"></a>
            <a class="bt_thutucatvi" href="<%=urlThuTuc %>"><liferay-ui:message key="vn.dtt.kehoach.thutuc" /><img src="<%=request.getContextPath()%>/img/front/bt_active.png"></a>
            <%
        } else {
            portletSession.setAttribute(PageType.ROLE_TYPE, null ,PortletSession.APPLICATION_SCOPE);
        }
    } else if (vanthu && !thutuc && !kehoach) {
        portletSession.setAttribute(PageType.ROLE_TYPE, PageType.VAN_THU, PortletSession.APPLICATION_SCOPE);
        portletSession.setAttribute(PageType.ORGANIZATION_TYPE, String.valueOf(idVanThuOrg) ,PortletSession.APPLICATION_SCOPE);
        %>
        <a class="bt_thutucatvi" href="<%=urlVanThu %>"><liferay-ui:message key="vn.dtt.kehoach.vanthu" /><img src="<%=request.getContextPath()%>/img/front/bt_active.png"></a>
        <%
    } else if (lanhdao) {
        portletSession.setAttribute(PageType.ROLE_TYPE, PageType.LANH_DAO, PortletSession.APPLICATION_SCOPE);
        portletSession.setAttribute(PageType.ORGANIZATION_TYPE, String.valueOf(idLanhDaoOrg) ,PortletSession.APPLICATION_SCOPE);
        %>
        <a class="bt_thutucatvi" href="<%=urlLanhDao %>"><liferay-ui:message key="vn.dtt.kehoach.lanhdao" /><img src="<%=request.getContextPath()%>/img/front/bt_active.png"></a>
        <%
    }
    
    String newValue = (String)portletSession.getAttribute(PageType.ROLE_TYPE, PortletSession.APPLICATION_SCOPE);
    %>
</div>