<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.portlet.business.Constans"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<body>
<%
PortletURL actionUrl = renderResponse.createActionURL();
actionUrl.setParameter(ActionRequest.ACTION_NAME, "addUserToPort");
String keyWord = renderRequest.getParameter("searchKeyWord");
String actionTyPe= ParamUtil.getString(request, "ActionType");
if ( Validator.isNull (actionTyPe)) {
	actionTyPe = "";
}
List<User> users = UserLocalServiceUtil.getUsers(0, 1000);

List<UserPort> userPorts = UserPortLocalServiceUtil.findAll(0, 1000);
List<User> users2 = Utils.getListUser(users, userPorts); 

List<DmMaritime> dmPorts=  DmMaritimeLocalServiceUtil.findAll();
%>
<div class="wd-main-content">	
		<form id="userForm" name="userForm" method="post" action="<%=actionUrl.toString() %>">
		  <table border="0">
		    <tr>
		      <td colspan="2" align = "left">	
		      	<liferay-ui:error key="err.status" message = "err.status"/>
				<liferay-ui:error key="err.portHarbourCode" message = "err.portHarbourCode"/>
				<liferay-ui:error key="err.portHarbourCode_count" message = "err.portHarbourCode_count"/>
				<liferay-ui:error key="err.userId" message = "err.userId"/>
			  </td>	
		    </tr>
		    <tr>
		      <td style="width: 20%;">
		      		<label class ="egov-label"><liferay-ui:message	key="vn.gt.userpor_code" /><font color="red">(*)</font></label>
		      </td>
		      <td>
		      
		      		<select name="portCode" id="portCode"	>
											<%
											String portCode = ParamUtil.getString(request, "portCode");
											
											//ActionUtils.getValueString(request, "portHarbourCode");
											for (DmMaritime item : dmPorts) {
												%>
													<option value="<%=item.getMaritimeCode()%>"
													<%=ActionUtils.checkData(item.getMaritimeCode(),portCode)%>><%=item.getMaritimeNameVN()%></option>
													<%
												}
											%>
											</select>
		      
		      
		      </td>
		    </tr>
		    <tr>
		      <td colspan ="1">
		      		<label class ="egov-label"><liferay-ui:message	key="vn.gt.status" /><font color="red">(*)</font></label>
		      </td>
		     <td colspan ="1">
		      <%String status = ActionUtils.getValueString(request, "status");  
		      %>
	            <select
						class="egov-select" name="status" id="status"							
						class="egov-select" style="width: 40%;">
							<option>
								<liferay-ui:message
									key="vn.gt.status" />
							</option>
						<option value="<%=Constans.ACTIVE %>"		<%=ActionUtils.checkData(status,Constans.ACTIVE)%> ><liferay-ui:message	key="vn.gt.active" /></option>
						<option value="<%=Constans.DEACTIVE %>"		<%=ActionUtils.checkData(status,Constans.DEACTIVE)%> ><liferay-ui:message	key="vn.gt.deactive" /></option>
				</select>
		      </td>
		    </tr>
		    <tr>
		      <td colspan ="1">
		      		<label class ="egov-label"><liferay-ui:message	key="vn.gt.danhsach.user" /><font color="red">(*)</font></label>
		      </td>
		      <td colspan ="1">
  	               <select
				class="egov-select" name="userId" id="userId"							
				class="egov-select" style="width: 40%;">
					<option>
						<liferay-ui:message key="vn.gt.danhsach.user" />
					</option>
					<%
					long userId = ActionUtils.getValueLong(request, "userId");
					for (User item : users2) {
						%>
					<option value="<%=item.getUserId()%>"
									<%=ActionUtils.checkData(item.getUserId(),userId)%>><%=item.getEmailAddress()%></option>
					<%
					}
					%>
							
			</select>
		      </td>
		    </tr>
		    <tr>
		      <td colspan="2">&nbsp;</td>
		    </tr>
		    <tr>
		    <td>
		      	<input type="submit" name="submitButton"  value="Cập nhật" />
		      	<input type="button" value="Quay lại" onclick="history.back(-1)" />
		      </td>
		    </tr>
		  </table>
		</form>
	</div>
</body>
<script type="text/javascript">
     function goBack() {
         //window.history.back()
         window.history.go(-2);
     }
</script>
