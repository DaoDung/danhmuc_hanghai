<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.portlet.thongtintau.ThongTinTauAction"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.common.model.impl.UserPortImpl"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmPort"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/datetimepicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<script type="text/javascript">
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>
<style>
.bt{
   float: center;
}
</style>
<%

	PortletURL searchUrl = renderResponse.createActionURL();
	searchUrl.setParameter(ActionRequest.ACTION_NAME, "search");

//Cang vu
	List<DmMaritime> maritimes = DmMaritimeLocalServiceUtil.getDmMaritimes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (maritimes == null) { maritimes = new ArrayList<DmMaritime>(); }
//Cang bien
	List<DmPort> dmPortsCangRoi = DmPortLocalServiceUtil.getDmPorts(0, 50);
	UserPort portDefault = new UserPortImpl();
	User userLogin = PortalUtil.getUser(request);
	if (userLogin != null && userLogin.getUserId() > 0) {
		portDefault = UserPortLocalServiceUtil.findByUserId(userLogin.getUserId());
	}
	
	
	
	if (Validator.isNull(portDefault)) {
		//not do something
	} else {
		if (Validator.isNull(maritimeCode)) {
			maritimeCode = portDefault.getPortCode();;
		}
	}

%>

<aui:form action="<%=searchUrl.toString()%>"	name="myForm" id="myForm"	method="POST">
<% if (flagLanguage.contains("EN")) { %>
	<div class="bgtlemain">
	     <h2 class="tlemenu tlemain"><liferay-ui:message key="vn.dtt.kehoach.timkiem" /> /Search criteria</h2>
	     <!-- VaiTro -->
	     <%@ include file="/html/menu/vai-tro.jsp"%>
	</div>
	
	<div class="wd-main-content wd-page-staff bgsearch">
	   <div class="boxsearch">
		   <div class="tbl_left boxlabel">
		       <table class="table_noboder">
		           <thead>
						<tr>
						<th class="text-left" width="30%"><br><liferay-ui:message key="vn.dtt.kehoach.cangvu" /> 
							<input type="hidden" name="flagMenu" id="flagMenu"	value="<%= Utils.checkLoaiThuTuc(loaiThuTuc)%>" />
						</th>
						<td class="text-leftu">
						Maritime Administration Of <br>
							<select name="maritimeCode"
										id="maritimeCode"
										style="width: 98%;">
									<%if (Validator.isNull(portDefault)) {
											if (Validator.isNull(maritimeCode)) {%>
												<option selected value="LUA_CHON" style="width: 100%">---- Select ------</option>
											<%} else {%>
												<option selected value="LUA_CHON" style="width: 100%">---- Select ------</option>
											<%}%>
									<%} else {%>
											<option selected value="LUA_CHON" style="width: 100%">---- Select ------</option>
									<%}%>
									
									<% for (DmMaritime maritime : maritimes) { %>
										<option
										<%=maritime.getMaritimeCode().trim().equals(maritimeCode) ? "selected" : "" %>
										value="<%=maritime.getMaritimeCode().trim()%>"><%=maritime.getCitycode() %></option>
									<% } %>
								</select>
						</td>
					</tr>
					<tr hidden>
	                    <th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.kehoach.cangbien" /></th>
	                    <td class="text-leftu">
							<select name="portCode" id="portCode" style="width: 98%;">
								<%
									//TODO hash code cang den, do PortFindByLoCode, in db co portCode=null
								%>
								<option selected value="LUA_CHON1" style="width: 100%">---- Select ------</option>
								<%
									// Cang den
									List<DmPort> dmPorts;
									if (Validator.isNull(maritimeCode)) {
										dmPorts = DmPortLocalServiceUtil.getDmPorts(0, 50);
									} else {
										dmPorts = DmPortLocalServiceUtil.findByLoCode(maritimeCode);
									}
									
									if (Validator.isNull(dmPorts)) { dmPorts = new ArrayList<DmPort>(); };
									for (DmPort item: dmPorts) {
								%>
									<option <%=item.getPortCode().equalsIgnoreCase(portCode)? "selected" : ""%> 
									value="<%=item.getPortCode()%>"><%=item.getPortName() %></option>
								<% } %>
							</select>
						</td>
	                </tr>
	                <tr >
	                    <th class="text-left" width="86px"><br>Số giấy phép</th>
	                    <td class="text-leftu">
	                    		Number <br>
								<input type="text" name="certificateNumber" id="certificateNumber" class="egov-inputfield" style="width: 98%" 
								value='<%=certificateNumber%>'/>
						</td>
	                </tr>
			        </thead>
			    </table>
			</div>
			
		    <div class="tbl_left boxlabel">
		        <table class="table_noboder">
		            <thead>
		                <tr>
		                    <th class="text-left" width="86px"><br><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
							<td class="text-leftu">
								Name of Ship<br>
								<input type="text" name="shipName" id="shipName" class="egov-inputfield" style="width: 98%" 
								value='<%=shipName%>'/>
							</td>
						</tr>
		                
		                <tr>
			                <th class="text-left" width="86px"><br><liferay-ui:message key="vn.dtt.kehoach.tungay" /></th>
			                <td class="text-leftu">
			                	Time of Arrival/ Departure From<br>
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateFrom"
										id="shipDateFrom"
										value="<%=shipDateFrom %>"
										onclick="gtCalendar('shipDateFrom')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateFrom')">
							</td>
		                </tr>
		
		            </thead>
		        </table>
			</div>
		  	<div class="tbl_left boxlabel">
			    <table class="table_noboder">
			       <thead>
			           <tr>
		                    <th class="text-left" width="86px"><br><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
		                    <td class="text-leftu">
		                    	Call Sign<br>
								<input type="text" name="callSign" id="callSign" class="egov-inputfield"
									style="width: 98%" value="<%=callSign %>" />
							</td>
		                </tr>
		                <tr>
		                   <th class="text-left"><br><liferay-ui:message key="vn.dtt.kehoach.denngay" /></th>
		                   <td class="text-leftu">
		                   		Time of Arrival/ Departure To<br>
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateTo"
										id="shipDateTo"
										value="<%=shipDateTo %>"
										onclick="gtCalendar('shipDateTo')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateTo')">
							</td>
						</tr>
		        	</thead>
		    	</table>
			</div>
		    <div class="wd-select">
             <button type="submit">
             	<i class="icon-fl ico_icon-search"></i><liferay-ui:message key="vn.dtt.kehoach.timkiem"/> /Search
		     </button>
		       
		    </div>  
		</div>  
	</div>
	
<%	} else { %>
	
		<div class="bgtlemain">
	     <h2 class="tlemenu tlemain"><liferay-ui:message key="vn.dtt.kehoach.timkiem" /></h2>
	     <!-- VaiTro -->
	     <%@ include file="/html/menu/vai-tro.jsp"%>
	</div>	
	<div class="wd-main-content wd-page-staff bgsearch">
	   <div class="boxsearch">
		   <div class="tbl_left boxlabel">
		       <table class="table_noboder">
		           <thead>
						<tr>
						<th class="text-left" width="30%"><liferay-ui:message key="vn.dtt.kehoach.cangvu" />
							<input type="hidden" name="flagMenu" id="flagMenu"	value="<%= Utils.checkLoaiThuTuc(loaiThuTuc)%>" />
						</th>
						<td class="text-leftu">
							<select name="maritimeCode"
										id="maritimeCode"
										style="width: 98%;">
									<%if (Validator.isNull(portDefault)) {
											if (Validator.isNull(maritimeCode)) {%>
												<option selected value="LUA_CHON" style="width: 100%">---- Lựa chọn ------</option>
											<%} else {%>
												<option selected value="LUA_CHON" style="width: 100%">---- Lựa chọn ------</option>
											<%}%>
									<%} else {%>
											<option selected value="LUA_CHON" style="width: 100%">---- Lựa chọn ------</option>
									<%}%>
									
									<% for (DmMaritime maritime : maritimes) { %>
										<option
										<%=maritime.getMaritimeCode().trim().equals(maritimeCode) ? "selected" : "" %>
										value="<%=maritime.getMaritimeCode().trim()%>"><%=maritime.getCitycode() %></option>
									<% } %>
								</select>
						</td>
					</tr>
						<tr>
	                    <th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.kehoach.cangbien" /></th>
	                    <td class="text-leftu">
							<select name="portCode" id="portCode" style="width: 98%;">
								<%
									//TODO hash code cang den, do PortFindByLoCode, in db co portCode=null
								%>
								<option selected value="LUA_CHON1" style="width: 100%">---- Lựa chọn ------</option>
								<%
									// Cang den
									List<DmPort> dmPorts;
									if (Validator.isNull(maritimeCode)) {
										dmPorts = DmPortLocalServiceUtil.getDmPorts(0, 50);
									} else {
										dmPorts = DmPortLocalServiceUtil.findByLoCode(maritimeCode);
									}
									
									if (Validator.isNull(dmPorts)) { dmPorts = new ArrayList<DmPort>(); };
									for (DmPort item: dmPorts) {
								%>
									<option <%=item.getPortCode().equalsIgnoreCase(portCode)? "selected" : ""%> 
									value="<%=item.getPortCode()%>"><%=item.getPortName() %></option>
								<% } %>
							</select>
						</td>
	                </tr>
			        </thead>
			    </table>
			</div>
			
		    <div class="tbl_left boxlabel">
		        <table class="table_noboder">
		            <thead>
		                <tr>
		                    <th class="text-left" width="86px"><liferay-ui:message  key="vn.dtt.kehoach.tentau" /></th>
							<td class="text-leftu">
								<input type="text" name="shipName" id="shipName" class="egov-inputfield" style="width: 98%" 
								value='<%=shipName%>'/>
							</td>
						</tr>
		                
		                <tr>
			                <th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.kehoach.tungay" /></th>
			                <td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateFrom"
										id="shipDateFrom"
										value="<%=shipDateFrom %>"
										onclick="gtCalendar('shipDateFrom')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateFrom')">
							</td>
		                </tr>
		
		            </thead>
		        </table>
			</div>
		  	<div class="tbl_left boxlabel">
			    <table class="table_noboder">
			       <thead>
			           <tr>
		                    <th class="text-left" width="86px"><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
		                    <td class="text-leftu">
								<input type="text" name="callSign" id="callSign" class="egov-inputfield"
									style="width: 98%" value="<%=callSign %>" />
							</td>
		                </tr>
		                <tr>
		                   <th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.denngay" /></th>
		                   <td class="text-leftu">
								<input type="text"
										class="egov-inputfield"
										style="width: 86%"
										name="shipDateTo"
										id="shipDateTo"
										value="<%=shipDateTo %>"
										onclick="gtCalendar('shipDateTo')" />
								<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png"
										onclick="gtCalendar('shipDateTo')">
							</td>
						</tr>
		        	</thead>
		    	</table>
			</div>
		    <div class="wd-select">
             <button type="submit">
             	<i class="icon-fl ico_icon-search"></i><liferay-ui:message key="vn.dtt.kehoach.timkiem"/>
		     </button>
		       
		    </div>  
		</div>  
	</div>
	
	
<%	} %>
</aui:form>

<portlet:actionURL var="findPortRegionAndPortBymaritimeCode" name="findPortRegionAndPortBymaritimeCode"/>
<script>
var url = '<%=findPortRegionAndPortBymaritimeCode.toString()%>';

$(document).ready(function() {
	$('#maritimeCode').change(function(event) {
		
		var code = $("select#maritimeCode").val();
		if (code == "")
			return;
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				maritimeCode : code
			},
			success : function(dataJSON) {
				//preferred
				var data2 = JSON.parse(dataJSON);
				
				console.log(data2);
				
				

				//Cang den
				var selPortCode = $('#portCode');
				selPortCode.find('option').remove();//xoa du lieu
				$('<option>').val("").text("---- Lựa chọn ------").appendTo(selPortCode);
				for ( var i = 0; i < data2.idPort.length; i++) {
					$('<option>').val(data2.idPort[i]).text(data2.namePort[i]).appendTo(selPortCode);
				}
			}
		});
	});
});

</script>

<style type="text/css">
#calBorder {
    top: 0 !important;
}
</style>
