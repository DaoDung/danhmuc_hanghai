

<%@page import="vn.dtt.cmon.portlet.ipmslist.utils.ConvertUtil"%>
<%@page import="vn.dtt.cmon.dao.hosohcc.service.HoSoTTHCCongLocalServiceUtil"%>
<%@page import="vn.dtt.sharedservice.bpm.consumer.uengine.IBrmsService"%>
<%@page import="vn.dtt.sharedservice.bpm.consumer.uengine.IBrms"%>
<%@page import="vn.dtt.sharedservice.bpm.consumer.uengine.WorkList"%>
<%@page import="vn.dtt.cmon.dao.hosohcc.service.YKienTraoDoiLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dao.hosohcc.model.YKienTraoDoi"%>
<%@page import="vn.dtt.cmon.dao.dvc.service.ThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dao.dvc.model.ThuTucHanhChinh"%>
<%@page import="vn.dtt.cmon.dao.hosohcc.service.TrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.portlet.transaction.TransactionUtils"%>
<%@page import="vn.dtt.cmon.dao.cd.service.CongDanLocalServiceUtil"%>
<%@page import="vn.dtt.cmon.dao.cd.model.CongDan"%>
<%@page import="vn.dtt.cmon.dao.nsd.model.TaiKhoanNguoiDung"%>
<%@page import="vn.dtt.cmon.dao.hosohcc.model.HoSoTTHCCong"%>

<%@page import="com.liferay.portal.model.User"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.exception.SystemException"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.util.Date"%>

<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@page pageEncoding="UTF-8"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />
<head>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/css-citizen.css" type="text/css" media="screen" />	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/css-citizen-transaction.css" type="text/css" media="screen" />	

	<script src="<%=request.getContextPath()%>/js/egov-common.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-1.8.0.min.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.ui.core.js" type="text/javascript"></script>		
	<script src="<%=request.getContextPath()%>/js/jquery.uniform.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/jquery-ui-1.8.15.custom.min.js" type="text/javascript"></script>		
	<script src="<%=request.getContextPath()%>/js/jquery.ui.accordion.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.fancybox-1.3.4.pack.js" type="text/javascript"></script>		
	<script src="<%=request.getContextPath()%>/js/js-citizen.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/js/js_citizen_transaction.js" type="text/javascript"></script>		


</head>
<%
	String transIdStr = ParamUtil.getString(request, "ipmsId","");
	String transType = ParamUtil.getString(request, "transType","");
	String currentTransPage = ParamUtil.getString(request, "currentTransPage","");
	String transactionKeyword = ParamUtil.getString(request, "transactionKeyword","");
	//String  pagingYkXl1= ParamUtil.getString(request, "pagingYkXl","");
	String  pagingYkXl2=  (String)request.getAttribute("pagingYkXl");

	Object pagingYkXl1 = request.getAttribute("pagingYkXl");
	boolean reloadPaging = pagingYkXl1 == null? false: true;
	if(reloadPaging) {
		request.removeAttribute("pagingYkXl");
	}
	
	
	if(reloadPage) {
		transIdStr = (String) request.getAttribute("ipmsId");
		transType = (String) request.getAttribute("transType");
		currentTransPage = (String) request.getAttribute("currentTransPage");
		transactionKeyword = (String) request.getAttribute("transactionKeyword");
		request.removeAttribute("transType");
		request.removeAttribute("currentTransPage");
		request.removeAttribute("transactionKeyword");
		request.removeAttribute("ipmsId");
	}
	
	long transId = 0;
	if (transIdStr.length() > 0) {
		transId = Long.parseLong(transIdStr);
	}
	//HoSoTTHCCong instance = HoSoTTHCCongLocalServiceUtil.fetchHoSoTTHCCong(transId);
	HoSoTTHCCong instance = TransactionUtils.getHoSoTTHCCong(transId);
	//HoSoTTHCCong instance = (HoSoTTHCCong) request.getAttribute("instance"); 

	String tieude = LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.yeuCauHuy");

     User currentUser = PortalUtil.getUser(request);
     String portalUrl = PortalUtil.getPortalURL(request);

    	List<TaiKhoanNguoiDung> taiKhoanNguoiDungs = null;
    	long congDanId = instance.getCongDanNopId();
    	long tKCongdanId = 0;
    	if (congDanId > 0 ){
    		
	 		CongDan congDan =ConvertUtil.findCongDanById(congDanId);
	 		if(congDan != null){
	 			tKCongdanId= congDan.getTaiKhoanNguoiDungId() == null ? 0 : congDan.getTaiKhoanNguoiDungId() ;
	 			if(tKCongdanId  ==  0){
	 			}
	 		}
    	}
    	String status ; 
  
		String maHoSo = instance.getMaSoHoSo();  //  1372060799232       "1371442333793";
        IBrms  service = new IBrmsService().getIBrmsPort();
        List<WorkList> workLists = service.getWorkListByMaHoSo(maHoSo);
        
        PortletURL listYkienXlUrl = renderResponse.createRenderURL();
        listYkienXlUrl.setParameter("pagingYkXl", "YES");
        listYkienXlUrl.setParameter("ipmsId", String.valueOf(instance.getId()));
        listYkienXlUrl.setParameter(TransactionUtils.PARAM_VIEW_TYPE, TransactionUtils.VIEW_TRANSACTION_DETAILS);
        listYkienXlUrl.setParameter("transType", transType);
        listYkienXlUrl.setParameter("currentTransPage", currentTransPage);
        listYkienXlUrl.setParameter("transactionKeyword", transactionKeyword);  
%>


<div class="wd-data-item">
	<div class="wd-details">
		<portlet:renderURL var="brms_viewList">
		 	<portlet:param name="<%=TransactionUtils.PARAM_VIEW_TYPE%>" value="<%=TransactionUtils.VIEW_TRANSACTION_LIST%>" />
		 	<portlet:param name="transType" value="<%=transType%>" />
		 	<portlet:param name="currentTransPage" value="<%=currentTransPage%>" />
		 	<portlet:param name="transactionKeyword" value="<%=transactionKeyword%>" />
		 	<portlet:param name="tabs1" value="<%=tabs1%>" />
		</portlet:renderURL>
		<liferay-ui:error key="YCHuy-required" message="vn.dtt.brms.registry.viewTransaction.details.YCHuy-required"></liferay-ui:error>
		
		<div style="float: right;">
				<a class="wd-detail-back" href="<%=brms_viewList%>" >
			<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.back"/>
		</a> 
		</div>
		<%
		
			portletSession.setAttribute("returnURL", brms_viewList, PortletSession.APPLICATION_SCOPE);
			if (instance != null) {
		%>
		<div class="egov-container">
			<h2 class="wd-title-details">
				<liferay-ui:message key="vn.dtt.brms.registry.viewTransactionDetails.chitiet" />
			</h2>			
	<!-- 		<% if (request.getAttribute("huy_success") != null) { %>	
					<font color="blue"><liferay-ui:message key="vn.dtt.brms.registry.viewTransactionDetails.huySuccess" /></font>	
			<% } %>  -->
			<table border="0" class="egov-table-form">
				<tr>
					<td>
						<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.name" /> :
					</td>
					<td  colspan="3" class="wd-fw-bold">
						<%= instance.getTenThuTucHanhChinh() %>
					</td>
				</tr>
				<tr>
					<td>
						<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.code" /> :
					</td>					
					<td class="wd-fw-bold">
						<%= instance.getMaSoHoSo() %>
					</td>
					<td>
						<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.status"/> :
					</td>
					<td class="wd-fw-bold">				
						<%=TrangThaiHoSoLocalServiceUtil.getTrangThaiHoSo(instance.getTrangThaiHoSo()).getTrangThai()  %>
					</td>							
				</tr>
				<tr>
					<td>
						<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.ngayNop" /> :
					</td>
					<td class="wd-fw-bold">
						<%= instance.getNgayNopHoSo()==null? "":sdf.format(instance.getNgayNopHoSo()) %>
					</td>
					<td>
						<liferay-ui:message key="vn.dtt.cmon.ipms.list.ngayHenTrakq" /> :
					</td>
					<td class="wd-fw-bold">
						<%= (instance.getNgayHenTraKetQua()==null? "":sdf.format(instance.getNgayHenTraKetQua())) %>
					</td>							
				</tr>
								

			</table>
			<div id="wd-fancy-configuration-template" class="wd-fancy-document-list">
				<fieldset>					
					<div class="wd-submit">
						<%
							long transPortletId = 0;  
							String[] app;
							String transPortletName = "";
							String schemaName =instance.getMaUngDung().trim().toLowerCase();
							String delimiter = "_";
							String maQuyTrinh="";
							//schemaName ="dkkd";// schemaName.split(delimiter);
							String strPortletId= prefs.getValue(schemaName+"Id",null);
							if (strPortletId==null || strPortletId==""){
								transPortletId=0;
							}else{
								transPortletId = Long.parseLong(strPortletId);
							}
							transPortletName = prefs.getValue(schemaName+"Name","");
							System.out.println("\n gett transPortletId :" + transPortletId + ":transPortletName:" + transPortletName);
							ThuTucHanhChinh thuTucHanhChinh = ThuTucHanhChinhLocalServiceUtil.fetchThuTucHanhChinh(instance.getThuTucHanhChinhId());
							if(thuTucHanhChinh !=null) {
								maQuyTrinh = thuTucHanhChinh.getMa();
							}
						%>
						<liferay-portlet:renderURL plid="<%=transPortletId%>" 
							portletName="<%=transPortletName%>" var="LINK">
 							<liferay-portlet:param name="<%=TransactionUtils.PARAM_PORTLET_NAME%>" value="<%=schemaName%>" />
 							<liferay-portlet:param name="<%=TransactionUtils.PARAM_ID%>" value="<%=String.valueOf(instance.getId())%>" />
 							<liferay-portlet:param name="<%=TransactionUtils.PARAM_ID_QUY_TRINH%>" value="<%=String.valueOf(instance.getThuTucHanhChinhId())%>" />
							<liferay-portlet:param name="maQuyTrinh" value="<%=maQuyTrinh%>" />
							<liferay-portlet:param name="accountCanBo" value="<%=currentUser.getEmailAddress()%>" />
							<liferay-portlet:param name="from" value="Officer" />
							<liferay-portlet:param name="backURL" value="<%= PortalUtil.getCurrentCompleteURL(request) %>" />
							
						</liferay-portlet:renderURL>
						<form  method="post" name="form_document_upload" id="form_document_upload">
						<input  type="button"  class="wd-button"  onclick="toggle_visibility('list3');btnColor(this, '#fff200');" value="<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.worklist")%>" />

						<% if (instance.getLoaiHoSo() == 1) { %>
							    
							<% } else { %>
							    	<input  type="button" onclick="javascript: window.location='<%=LINK%>';" class="wd-button" value="<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.xemGiaoDich")%>" />
							<% } %>

						<% if (instance.getTrangThaiHoSo() == 6|| instance.getTrangThaiHoSo() == 8 || instance.getTrangThaiHoSo() == 5){ %>
							    
							<% } else { %>
							<input type="button" class="wd-button" onclick="toggle_visibility('list1');" value="<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.ykienxuly")%>" />  
							<% } %>

							<input type="button" class="wd-button" onclick="toggle_visibility('list2');" value="<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.thongTinPhanHoi")%>" />	
							
							
						</form>
						
					</div>
					
					<!-- Yeu cau Huy Ho So -->
					<portlet:actionURL var="huyHoSoURL" name="huyHoSo">
						<portlet:param name="ipmsId" value="<%=String.valueOf(instance.getId())%>"></portlet:param>
						<portlet:param name="nguoiNhan" value="<%=String.valueOf(tKCongdanId)%>"></portlet:param>
						<portlet:param name="transType" value="<%=transType%>"></portlet:param>
						<portlet:param name="currentTransPage" value="<%=currentTransPage%>"></portlet:param>
						<portlet:param name="transactionKeyword" value="<%=transactionKeyword%>"></portlet:param>
						<portlet:param name="tabs1" value="<%=tabs1%>" />
																		
					</portlet:actionURL>
					<div id ="list1" class="wd-submit" style="display:none;">
						<form method="post" name="<portlet:namespace />form_yeuCauHuy" action="<%=huyHoSoURL%>">
						<table  class="egov-table-form"  cellpadding="0" cellspacing="0" border="0"   >
						  <tr>
						  	<input type="hidden" name="<portlet:namespace />nguoiNhan" id="nguoiNhan"  value="<%=tKCongdanId%>"/>
						    <td width="24%"><liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.tieuDe" /></td>
						    <td  align="left"><input type="text" class="egov-inputfield" style="width:80%" name="<portlet:namespace />tieude" id="tieude" /></td>
						  </tr>
						  <tr>
						    <td><liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.noiDung" /></td>
						    <td align="left"><textarea name="<portlet:namespace />noiDung" rows="5" class="egov-textarea"  style="width:80%"></textarea></td>
						  </tr>
						</table>						
							<input type="button" onclick='<portlet:namespace />submitHuy();' class="wd-button" value="<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.gui")%>" />
						</form>
					</div>
					<!-- End Yeu cau Huy Ho So -->
					
					<!-- Yeu cau Huy Ho So -->
							<% if (reloadPaging) { %>
							   <div id ="list2" class="wd-submit wd-list-transaction" style="display:;">	
							<% } else { %>
								<div id ="list2" class="wd-submit wd-list-transaction" style="display:none;">	
							<% } %>
										
						<fieldset class="wd-list-transaction-form">
							<table cellpadding="0" cellspacing="0" class="egov-table" >
								<thead>
									<tr>
										<th><liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.nguoiGui" /></th>
										<th><liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.tieuDe" /></th>
										<th><liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.ngayGui" /></th>
									</tr>
								</thead>
								<tbody>
								
								<%
	
							        								
								
									SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 10, listYkienXlUrl, null, null);
									
									List<YKienTraoDoi>	results = YKienTraoDoiLocalServiceUtil.findByHoSoTTHCCongId(instance.getId(), searchContainer.getStart(), searchContainer.getEnd()); 								
									
									long longTotal = YKienTraoDoiLocalServiceUtil.countByHoSoTTHCCongId(instance.getId());
								    int total = Integer.parseInt(String.valueOf(longTotal));
							    	searchContainer.setTotal(total);
							    	searchContainer.setResults(results);		
							
									for (int i=0; i < results.size(); i++) {
										YKienTraoDoi yKienTraoDoi = (YKienTraoDoi) results.get(i);
									%>
										<portlet:actionURL var="getPhanHoiDetailsURL" name="getPhanHoiDetails">
											<portlet:param name="idPhanHoi" value="<%= Long.toString(yKienTraoDoi.getId()) %>" />
										</portlet:actionURL>
										<tr onclick="getPhanHoiByAjax('<%=getPhanHoiDetailsURL.toString()%>');">
											<td><a href="#"><%= TransactionUtils.gettebNguoiDUng(yKienTraoDoi.getNguoiGuiId()) %></a></td>
											 <td align = "left"><a href="#"><%= yKienTraoDoi.getTieuDe() %></a></td>
											<td><a href="#"><%= sdf.format(yKienTraoDoi.getThoiGianGuiYKien()) %></a></td>
										</tr>
								
								
									<%  } %>
								</tbody>
								
							</table>
						</fieldset>
						<fieldset id ="thongTinPhanHoiDetails" style="margin-top: 2px;" hidden="true">
							<b>
								<label class="egov-label-header"> <liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.chiTietTitle" /> </label>
							</b>
							<table class="egov-table-form"  cellpadding="0" cellspacing="0" border="0"  >
								<tr>
									<td width="100">
										<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.tieuDe" />
									</td>
									<td id ="cmonTransTieude"></td>
								</tr>
								<tr>
									<td>
										<liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.details.noiDung" />
									</td>
									<td id ="cmonTransNoiDung"></td>
								</tr>
							</table>
						</fieldset>
		<div id = "paginationTrans">
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</div>
						
					</div>
					<!-- End Yeu cau Huy Ho So -->
					<% if (reloadPaging) { %>
							    <div id ="list3" class="wd-submit" style="display:none;">
							<% } else { %>
								<div id ="list3" class="wd-submit" style="display:;">
							<% } %>
					
					
					
						
							<table cellpadding="0" cellspacing="0" class="egov-table" >
								<thead>
									<tr>
										<th><liferay-ui:message key="vn.dtt.brms.registry.viewTransaction.stt" /></th>
										<th><liferay-ui:message key="vn.dtt.worklist.name" /></th>
										<th><liferay-ui:message key="vn.dtt.worklist.cbxl" /></th>
										<th><liferay-ui:message key="vn.dtt.worklist.status" /></th>
										<th><liferay-ui:message key="vn.dtt.worklist.start" /></th>
										<th><liferay-ui:message key="vn.dtt.worklist.end" /></th>
										<th><liferay-ui:message key="vn.dtt.worklist.pb" /></th>
									</tr>
								</thead>
								<tbody>
								<%
									if(workLists != null) {
									for (int i=0; i < workLists.size(); i++) {
										WorkList workList = (WorkList) workLists.get(i);
									%>
										
		                                	<tr  style="cursor: pointer;"
	        	    							onClick="viewTaskInfo('<%=portalUrl%>','<%=workList.getTaskid()%>', '<%= workList.getInstid()%>', '<%= workList.getTrctag()%>', '<%=workList.getInfo()%>')" >
								
										
											<td><%=(i+1)%></td>
											<td align="left"><%=workList.getTitle()%></td>	
											<td align="left"><%=TransactionUtils.getNguoiDungbyEmail(workList.getEndpoint())%></td>
											
											<%	if("COMPLETED".equals(workList.getInfo())){
													status = "Hoàn thành";
												}else
													status ="Đang xử lý"; 
											%>											
										<td align="left"><%=status%></td>	
											<td><%=workList.getStartDate()%></td>	
											<td><%=workList.getEndDate()%></td>									
											<td align="left"><%=TransactionUtils.getPhongbanEmail(workList.getEndpoint())%></td>
										</tr>
								
								
									<%  }} %>								
								
								</tbody>
								
							</table>
					</div>
					
					
					
					
					
				</fieldset>
				
			</div>
			<!-- End Cancel -->
		</div>
		<% } else { %>
			<br />
			<liferay-ui:message key="vn.dtt.brms.registry.viewTransactionDetails.khongCoGiaoDich" />	
		<% } %>
	</div>
</div>



<script type="text/javascript">
	function <portlet:namespace />submitHuy() {
		var form = document.<portlet:namespace />form_yeuCauHuy;
		var noiDungHuy = form.<portlet:namespace />noiDung; 
		var nguoiNhan = form.<portlet:namespace />nguoiNhan;
		var tieude = form.<portlet:namespace />tieude; 

		if ('null'== nguoiNhan.value || '0'== nguoiNhan.value ) {
			var str = "<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.tknguoidungid.blank")%>";
			alert(str);
			return
		}		

		if (tieude.value.trim().length == 0) {
			var str = "<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.tieude.blank")%>";
			alert(str);
			return
		}		
		if (noiDungHuy.value.trim().length == 0) {
			var str = "<%=LanguageUtil.get(pageContext, "vn.dtt.brms.registry.viewTransaction.details.NoiDungHuy.blank")%>";
			alert(str);
			return
		}

	

		
		form.submit();
	}

    function <portlet:namespace/>showPopup(t, w, url) {
        var options = {
            width: w,
            modal: true,
            position: ['center', 10],
            title: t
        };
        window.alert('url=' + url);
        var message = Liferay.Popup(options);
        jQuery(message).load(url);
    } 	
	
</script>

