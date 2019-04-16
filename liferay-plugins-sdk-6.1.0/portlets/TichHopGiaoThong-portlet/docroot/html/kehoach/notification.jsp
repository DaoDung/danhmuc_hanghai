<%@page import="javax.portlet.RenderResponse"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portlet.PortletURLFactory"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGTBusinessTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGTBusinessType"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.gt.dao.result.service.ResultNotificationLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.dao.result.model.ResultNotification"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page pageEncoding="UTF-8"%>

<style>
a.selected {
  background-color:#1F75CC;
  color:white;
  z-index:100;
}

.messagepop {
  background-color:#FFFFFF;
  border:1px solid #999999;
  cursor:default;
  display:none;
  margin-top: 15px;
  position:absolute;
  text-align:left;
  width:600px;
  height: 400px;
  z-index:50;
  padding: 25px 25px 20px;
  overflow: scroll;
}

label {
  display: block;
  margin-bottom: 3px;
  padding-left: 15px;
  text-indent: -15px;
}

.messagepop p, .messagepop.div {
  border-bottom: 1px solid #EFEFEF;
  margin: 8px 0;
  padding-bottom: 8px;
}

.close_messagepop{		
	color:red;
	font-weight: bold;
}
.close_div{	
	text-align:right;
	padding-right:2%;
}
</style>
<%
String maritimeCode = null;
if(portDefault != null) {
	maritimeCode = portDefault.getPortCode();
}
List<ResultNotification> lstNotifications = null;

lstNotifications = ResultNotificationLocalServiceUtil.findByMaritimeCodeOrderbyLastestDate(maritimeCode);
%>
<div class="messagepop pop">
	<div class="close_div"><a class="close_messagepop" href="#" title="Đóng">X</a></div>	
	<% 
	if (lstNotifications != null) {
	for(ResultNotification notification : lstNotifications) {
		DmGTBusinessType businessType = DmGTBusinessTypeLocalServiceUtil.getByBusinessTypeCode(notification.getBusinessTypeCode());
		
		// get ship name 
		long noDocumentName = notification.getDocumentName();
		int noDocumentYear = notification.getDocumentYear();
		TempDocument tmpDocument = TempDocumentLocalServiceUtil.getByDocumentNameAndDocumentYear(noDocumentName, noDocumentYear);
		String shipName = "";
		String tmpDocName = ""; 
		String tmpDocYear = "";
		String msgType = "";
		String tmpPageType = "";
		String selectedMenu = "";
		
		
		if (tmpDocument != null) {
			shipName = tmpDocument.getShipName();
			tmpDocName = String.valueOf(tmpDocument.getDocumentName());
			tmpDocYear = String.valueOf(tmpDocument.getDocumentYear());
			msgType = String.valueOf(PageType.THANH_PHAN_HO_SO);
			tmpPageType = String.valueOf(PageType.KE_HOACH_DETAIL);
			selectedMenu = ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED);
		}
		System.out.println("**** SHIP NAME:" + shipName);
		if(notification.getRemarks().trim().length() > 0 && notification.getRemarks().trim().equals("NIL")) {
			
		%>
		<p><label>			
		<%
			if (!StringPool.BLANK.equals(shipName)) {
				PortletURL viewDetailsUrl = renderResponse.createActionURL();
				viewDetailsUrl.setParameter(ActionRequest.ACTION_NAME, "deleteNewsAndViewDetailsHS");
				viewDetailsUrl.setParameter("notificationId", String.valueOf(notification.getId()));
				viewDetailsUrl.setParameter(PageType.DOCUMENT_NAME, tmpDocName);
				viewDetailsUrl.setParameter(PageType.DOCUMENT_YEAR, tmpDocYear);
				viewDetailsUrl.setParameter(PageType.MESSAGE_TYPE, msgType);
				viewDetailsUrl.setParameter(PageType.PAGE_TYPE, tmpPageType);
				viewDetailsUrl.setParameter(MenuConstraint.SESSION_MENU_SELECTED, selectedMenu);
		%>
		<a href="<%=viewDetailsUrl.toString()%>">[<%=shipName%>]</a>
		<%	
			}
		%> 
		<%=noDocumentName%>---[<%=FormatData.parseDateToTringType3(FormatData.parseStringToDate(notification.getLatestDate()))%>] Mới : <%=(businessType != null) ? businessType.getBusinessTypeName() : notification.getBusinessTypeCode()%></label></p>
		<%
		} else if(notification.getRemarks().trim().length() > 0) {
		%>
		<p><label>
		<%
			if (!StringPool.BLANK.equals(shipName)) {
		%>
		<a href=""><%=shipName%></a>
		<%	
			}
		%>
		<%=noDocumentName%>---[<%=FormatData.parseDateToTringType3(FormatData.parseStringToDate(notification.getLatestDate()))%>] <%=notification.getRemarks() %>---<%=(businessType != null) ? businessType.getBusinessTypeName() : notification.getBusinessTypeCode()%></label></p>
		<%	
		}
	}
	}
	%>
	<!-- <p><a class="close" href="/"><font color="red">Quay lại</font></a></p> -->
</div>
<a href="/contact" id="contact"><h2 class="tlemenu tlemain"><font color="blue">TIN MỚI</font></h2></a>

<script type="text/javascript">

$(document).on('click','.close_messagepop',function(){	
	$(this).parent().parent().hide();
});

function deselect(e) {
	  $('.pop').slideFadeToggle(function() {
	    e.removeClass('selected');
	  });    
	}

	$(function() {
	  $('#contact').on('click', function() {
	    if($(this).hasClass('selected')) {
	      deselect($(this));               
	    } else {
	      $(this).addClass('selected');
	      $('.pop').slideFadeToggle();
	    }
	    return false;
	  });

	  $('.close').on('click', function() {
	    deselect($('#contact'));
	    return false;
	  });
	});

	$.fn.slideFadeToggle = function(easing, callback) {
	  return this.animate({ opacity: 'toggle', height: 'toggle' }, 'fast', easing, callback);
	};
</script>


