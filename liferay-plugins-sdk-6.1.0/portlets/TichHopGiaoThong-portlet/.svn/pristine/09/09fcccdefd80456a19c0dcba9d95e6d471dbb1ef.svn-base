<%@page import="vn.gt.dao.common.service.UserSignLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserSign"%>
<%@page import="vn.gt.dao.common.model.impl.UserSignImpl"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiQuaCanh"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil_IW"%>
<%@page import="vn.gt.dao.noticeandmessage.service.NoticeShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhai"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiXuatCanh"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGtStatusLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGtStatus"%>
<%@page import="vn.gt.dao.danhmucgt.service.DmGTShipPositionLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmucgt.model.DmGTShipPosition"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryDocTypeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryDocType"%>
<%@page import="vn.gt.dao.danhmuc.model.DmDocType"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryStateLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryState"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmHistoryMaritime"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.portlet.Utils"%>

<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.gt.portlet.kehoach.KeHoachAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiNhapCanh"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil_IW"%>
<%@page import="vn.gt.dao.noticeandmessage.service.NoticeShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.IssueShiftingOrderImpl"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.gt.utils.document.ChuKiSoConstant"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.gt.portlet.Utils"%>

<%@page pageEncoding="UTF-8"%>
<style>
	.bt { float: center; }
	 #reject_data { }
</style>

<script type="text/javascript">
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";

</script>

<% 
        IssueShiftingOrder shiftingOrderEdit = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodeKeHoach);
		Boolean rolelanhdao = false;
		Boolean rolevanthu = false;
		Boolean rolequantri = false;
		User currentuser = UserLocalServiceUtil.fetchUser(themeDisplay.getUserId());
		for (Organization og : currentuser.getOrganizations()) {
			if (og.getGroup().getFriendlyURL().contains("dong-bo")) {
				rolequantri = true;    		
			}
			if (og.getGroup().getFriendlyURL().contains("van-thu")) {
				rolevanthu = true;    		
			}
			if (og.getGroup().getFriendlyURL().contains("lanh-dao")) {
				rolelanhdao = true;    		
			}
		}
         %>

<%
String lCode = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	String tieuDeBanKhai = "";
	if (renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI) != null && renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI).trim().length() > 0) {
		tieuDeBanKhai = renderRequest.getParameter(PageType.TIEU_DE_BAN_KHAI).trim();
	}

	TempDocument temp = null;
	List<TempDocument> liTempDocuments = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (liTempDocuments != null && liTempDocuments.size() > 0) {
		temp = liTempDocuments.get(0);
	}
	
	List<IssueShiftingOrder> lstShiftingOrder = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
	
	boolean flagKeHoachLenhDieuDong = true;
	//System.out.println("=========CACHE HAY KO========");
	
	if (messageType != null && FormatData.convertToInt(messageType) == MessageType.LENH_DIEU_DONG) {
		//check co xac bao NoticeShipType = 2, hien thi lenh dieu dong
		List<TempNoTiceShipMessage> tmNoTiceShipMessages= TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_DESC);
		
		if ((tmNoTiceShipMessages != null && tmNoTiceShipMessages.size() > 0) && (temp.getRequestState()==TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG)) {
			if (lstShiftingOrder.size() == 0) {
				flagKeHoachLenhDieuDong = false;
			}
		}
	}
	 
	if (messageType != null && FormatData.convertToInt(messageType) == MessageType.LENH_DIEU_DONG) {
		if(loaiThuTuc == "4" && (temp.getRequestState()==TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG) )  {
			//System.out.println("VAO CANG CHECK================");
			//String flagKeHoachLenhDieuDongInLand = renderRequest.getParameter("flagKeHoachLenhDieuDongInland");
			
			if (lstShiftingOrder.size() == 0) {
					//System.out.println("VAO DAY CHO FAIL");
					flagKeHoachLenhDieuDong = false;
				}
		
		}
	}
	
	
	
	String loaiThongTinChung = Utils.checkLoaiThuTuc(loaiThuTuc);
	
	//System.out.println("===============loaiThuTuc: " + loaiThuTuc);
	
	
	if (temp != null) {
		DmHistoryMaritime dmHisMaritime = DmHistoryMaritimeLocalServiceUtil.getByMaritimeCode(temp.getMaritimeCode());
		DmHistoryState dmHisState = DmHistoryStateLocalServiceUtil.getByStateCode(temp.getStateCode());
		DmGtStatus dmGtStatus = DmGtStatusLocalServiceUtil.findByStatusCode(temp.getRequestState(), MessageType.ROLE_KE_HOACH);
		DmGTShipPosition dmShipPosition = DmGTShipPositionLocalServiceUtil.getByPositionCode(String.valueOf(temp.getShipPosition()));
		DmHistoryDocType dmHistoryDocType = DmHistoryDocTypeLocalServiceUtil.findByDocumentType(temp.getDocumentTypeCode());
%>
<liferay-portlet:renderURL var="reTurnHomeURL" >
<liferay-portlet:param name="mvcPath" value="/html/kehoach/view.jsp"/>
</liferay-portlet:renderURL>
<div style="visibility: hidden; height: 0px; width: 0px;">
	<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>
</div>

<div class="bgtlemain">
	<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_QUA_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_VAO_CANG == loaiThongTinChung) {%>
		<% if (temp.getShipPosition() == 1) {%>
		<h2 class="tlemenu tlemain">Tàu đến cảng</h2>
		<% } else if (temp.getShipPosition() == 2) {%>
		<h2 class="tlemenu tlemain">Tàu trong cảng</h2>
		<%}%>
	<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_ROI_CANG == loaiThongTinChung) {%>
		<h2 class="tlemenu tlemain">Tàu rời cảng</h2>
		
	<%} else if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThongTinChung) {%>
	<h2 class="tlemenu tlemain">PT thủy nội địa rời cảng</h2>
	
	<%} else if (MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThongTinChung) {%>
	<h2 class="tlemenu tlemain">PT thủy nội địa vào cảng</h2>
	
	<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == loaiThongTinChung) {%>
		<h2 class="tlemenu tlemain">Tàu đến/ rời cảng</h2>
	<%}%>
	
	<!-- VaiTro -->
	<%@ include file="/html/menu/vai-tro.jsp"%>
</div>
	<div class="wd-main-content wd-page-staff">
		<div id="Accordion1" class="Accordion" tabindex="0">
		<div class="AccordionPanel">
			<div class="AccordionPanelTab">
				<h4>Thông tin chung<img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
				<div class="righttle"></div>
			</div>
			<div class="AccordionPanelContent">
				<div class="tbl_left">
					<table class="table_noboder">
						<thead>
							<tr>
								<th class="text-left" width="90px"><liferay-ui:message key="vn.dtt.kehoach.cangvu" /></th>
								<td class="text-leftu"><%=Validator.isNotNull(dmHisMaritime) ? dmHisMaritime.getMaritimeNameVN() : temp.getMaritimeCode()%></td>
							</tr>
							<tr>
								<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.tentau" /></th>
								<td class="text-leftu"><%=temp.getShipName()%></td>
							</tr>
							<tr>
								<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.taudenroi" /></th>
								<td class="text-leftu"><%=Validator.isNotNull(dmShipPosition) ? dmShipPosition.getRemarks() : temp.getShipPosition()%></td>
							</tr>
							<tr>
								<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.trangthai" /></th>
								<td class="text-leftu"><i><%=Validator.isNotNull(dmGtStatus) ? dmGtStatus.getStatusName() : temp.getRequestState()%></i></td>
							</tr>
						</thead>
					</table>
				</div>
				<div class="tbl_left">
					<table class="table_noboder">
						<thead>
							<tr>
								<th class="text-left" width="150px"><liferay-ui:message key="vn.dtt.kehoach.mabankhai" /></th>
								<td class="text-left"><%=temp.getDocumentName()%></td>
							</tr>
							<tr>
								<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.quoctich" /></th>
								<td class="text-leftu"><%=Validator.isNotNull(dmHisState) ? dmHisState.getStateName() : temp.getStateCode()%></td>
							</tr>
							<tr>
								<%if (MessageType.LOAT_THU_TUC_NHAP_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_QUA_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_VAO_CANG == loaiThongTinChung || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThongTinChung) {%>
									<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenroitu" /></th>
									<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateFrom())%></td>
									
								<%} else if (MessageType.LOAT_THU_TUC_XUAT_CANH == loaiThongTinChung || MessageType.LOAT_THU_TUC_ROI_CANG == loaiThongTinChung || MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThongTinChung) {%>
									<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenroitoi" /></th>
									<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateTo())%></td>
									
								<%} else if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == loaiThongTinChung) {%>
									<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenroitu" /></th>
									<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateFrom())%></td>
								<%}%>
							</tr>
						</thead>
					</table>
				</div>
				<div class="tbl_left">
					<table class="table_noboder">
						<thead>
							<tr>
								<th class="text-left" width="150px"><liferay-ui:message key="vn.dtt.kehoach.loaibankhai" /></th>
							<td class="text-leftu"><%=Validator.isNotNull(dmHistoryDocType) ? dmHistoryDocType.getDocumentTypeName() : temp.getDocumentTypeCode() %></td>
							</tr>
							<tr>								
								<%if (MessageType.LOAT_THU_TUC_ROI_CANG_PTTND == loaiThongTinChung || MessageType.LOAT_THU_TUC_VAO_CANG_PTTND == loaiThongTinChung) {%>
								<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.sodangky" /></th>
								<%} else  {%>
								<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.hohieu" /></th>
								<%} %>
								<td class="text-leftu"><%=temp.getCallSign()%></td>
							</tr>
							<%if (MessageType.LOAT_THU_TUC_DANG_DI_CHUYEN == loaiThongTinChung) {%>
								<tr>
									<th class="text-left"><liferay-ui:message key="vn.dtt.kehoach.thoigiandenroitoi" /></th>
									<td class="text-leftu"><%=FormatData.parseDateToTringType3(temp.getShipDateTo())%></td>
								</tr>
							<%}%>
						</thead>
					</table>
				</div>
			</div>
		</div>
                  <form id="userForm" name="userForm" method="post">
                  <%
                  if (messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) == 0) {
                      // La thanh phan ho so, danh sach cac ho so trong thong tin khai bao
                      %>
                      <jsp:include page="/html/kehoach/thanh_phan_ho_so_ke_hoach.jsp"></jsp:include>
                      <%
                  } else {
                      // Chi tiet ho so cho tung ho so (sub),
                      %>
                      <!-- Thong tin lich su ho so -->
                      <%@ include file="/html/kehoach/thong_tin_chung_ho_so_lich_su_ho_so.jsp"%>
                      
                      <div class="AccordionPanel">
                          <div class="AccordionPanelTab"><h4>Nội dung giấy tờ<img src="<%=request.getContextPath()%>/img/front/next_tle.png"></h4>
                              <div class="righttle"></div>
                          </div>
                          <!-- Cai nay chi tiet cho tung ho so o day -->
                          <%@ include file="/html/kehoach/chi_tiet_ho_so.jsp"%>
                          
                      </div>
                      <%
                  }
                  %>
              </div>
              
              <!-- chuc nang hien thi button -->
              <div class="boxbt">
                  <%
                  PortletURL actionUrlTiepNhan = renderResponse.createActionURL();
                  PortletURL actionUrlTuChoi = renderResponse.createActionURL();
                  PortletURL actionUrlHuy = renderResponse.createActionURL();
                  PortletURL actionUrlSua = renderResponse.createActionURL();
                  PortletURL actionUrlDuyet = renderResponse.createActionURL();
                  PortletURL actionUrlChoLanhDaoDuyet = renderResponse.createActionURL();
                  PortletURL actionUrlChuyenTraHoSo = renderResponse.createActionURL();
                  PortletURL actionUrlSuaDoiBoXung = renderResponse.createActionURL();
                  PortletURL actionUrlKyso = renderResponse.createActionURL();
                  PortletURL actionUrlDongDau = renderResponse.createActionURL();
                 
               		
                  
                  PortletURL actionUrlNopTrucTiep = renderResponse.createActionURL();	            
                  PortletURL actionUrlChuyenGiaoDien = renderResponse.createActionURL();
                  
                  
                  if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) {
                      actionUrlTiepNhan.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      
                      actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhDongDau");
                      actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhKyso");
                      actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      actionUrlSuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanh");
                      
                      actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienLenhDieuDong");
                      
                  } else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) { // Vao Cang Inland
                	 //System.out.println("========================VAO CANG====================");
                      actionUrlTiepNhan.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      
                      actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");
                      actionUrlSuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "keHoachVaoCang");                                            
                      actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienLenhDieuDong");
                      actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhDongDau");
                      actionUrlDongDau.setParameter("lCode", lCode);
                      actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachNhapCanhKyso");
                      actionUrlKyso.setParameter("lCode", lCode);
                      actionUrlKyso.setParameter("successPage", reTurnHomeURL.toString());
                      actionUrlDongDau.setParameter("successPage", reTurnHomeURL.toString());
                  } else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0) {
                      actionUrlTiepNhan.setParameter(ActionRequest.ACTION_NAME, "keHoachXuatCanh");
                      actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "keHoachXuatCanh");
                      actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "keHoachXuatCanh");
                      
                      actionUrlSuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "keHoachXuatCanh");
                      actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienLenhDieuDong");
                      
                  } else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) { // Roi Cang Inland
                      actionUrlTiepNhan.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      
                      actionUrlSuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                  } else if (loaiThuTuc != null && 
                		  (loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0 || 
                		  loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0)) { // PTTND Vao cang, Roi cang
                      actionUrlTiepNhan.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      actionUrlNopTrucTiep.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                      
                      actionUrlSuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "keHoachRoiCang");
                  }else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0) {
                      actionUrlTiepNhan.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlTuChoi.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlHuy.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlKyso.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanhKyso");
                      actionUrlDongDau.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanhDongDau");
                      actionUrlSua.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlDuyet.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlChoLanhDaoDuyet.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlChuyenTraHoSo.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      actionUrlSuaDoiBoXung.setParameter(ActionRequest.ACTION_NAME, "keHoachQuaCanh");
                      
                      actionUrlChuyenGiaoDien.setParameter(ActionRequest.ACTION_NAME, "chuyenGiaoDienLenhDieuDong");
                  } 
                  
                  actionUrlTiepNhan.setParameter(PageType.DOCUMENT_NAME, documentName);
                  if (messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) == 0) {
                	  
                      actionUrlTiepNhan.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                      actionUrlTuChoi.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                      actionUrlHuy.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                      actionUrlSuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                      actionUrlNopTrucTiep.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                      actionUrlChuyenGiaoDien.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                  } else {
                	  //dung.le edit
                	  if(loaiThuTuc == MessageType.LOAT_THU_TUC_VAO_CANG ) {
                		  if((temp.getRequestState() == TrangThaiBanKhai.CHO_TIEP_NHAN) || (temp.getRequestState()==TrangThaiBanKhai.KE_HOACH_YEU_CAU_SUA_DOI_BO_SUNG)) {
                			  actionUrlTiepNhan.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                    		  actionUrlSuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                    		  actionUrlTuChoi.setParameter(PageType.MESSAGE_TYPE, String.valueOf(PageType.THANH_PHAN_HO_SO));
                    		  
                		  } else {
                			  actionUrlTiepNhan.setParameter(PageType.MESSAGE_TYPE, messageType);
                    		  actionUrlSuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, messageType);
                    		  actionUrlTuChoi.setParameter(PageType.MESSAGE_TYPE, messageType);
                    		  
                		  }
                		 
                	  } else {
                		  actionUrlKyso.setParameter(PageType.MESSAGE_TYPE, messageType);
                          actionUrlDongDau.setParameter(PageType.MESSAGE_TYPE, messageType);
                		  actionUrlTiepNhan.setParameter(PageType.MESSAGE_TYPE, messageType);
                		  actionUrlSuaDoiBoXung.setParameter(PageType.MESSAGE_TYPE, messageType);
                		  actionUrlTuChoi.setParameter(PageType.MESSAGE_TYPE, messageType);
                		  
                	  }
                	  
                	 
                      
                      
                	  actionUrlNopTrucTiep.setParameter(PageType.MESSAGE_TYPE, messageType);
                	  actionUrlHuy.setParameter(PageType.MESSAGE_TYPE, messageType);
                      actionUrlSua.setParameter(PageType.MESSAGE_TYPE, messageType);
                      actionUrlDuyet.setParameter(PageType.MESSAGE_TYPE, messageType);
                      actionUrlChoLanhDaoDuyet.setParameter(PageType.MESSAGE_TYPE, messageType);
                      actionUrlChuyenTraHoSo.setParameter(PageType.MESSAGE_TYPE, messageType);
                      actionUrlChuyenGiaoDien.setParameter(PageType.MESSAGE_TYPE, messageType);
                  }
                  
                  
                  
                  actionUrlTiepNhan.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlTiepNhan.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlTiepNhan.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlTiepNhan.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TIEP_NHAN));
                  actionUrlTiepNhan.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodeKeHoach, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
                  actionUrlTiepNhan.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  actionUrlTuChoi.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlTuChoi.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlTuChoi.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlTuChoi.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlTuChoi.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_TU_CHOI));
                  actionUrlTuChoi.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodeKeHoach, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
                  actionUrlTuChoi.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  actionUrlNopTrucTiep.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlNopTrucTiep.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlNopTrucTiep.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlNopTrucTiep.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlNopTrucTiep.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_NOP_TRUC_TIEP));
                  actionUrlNopTrucTiep.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodeKeHoach, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
                  actionUrlNopTrucTiep.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  
                  actionUrlHuy.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlHuy.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlHuy.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlHuy.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlHuy.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_HUY));
                  actionUrlHuy.setParameter(PageType.REQUEST_CODE, CheckBusinessUtil.getRequestCode(requestCodeKeHoach, FormatData.convertToInt(documentName), documentYear, FormatData.convertToInt(messageType)));
                  actionUrlHuy.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  actionUrlSua.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlSua.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlSua.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlSua.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlSua.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_SUA));
                  actionUrlSua.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlSua.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  actionUrlDuyet.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlDuyet.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlDuyet.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlDuyet.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlDuyet.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DUYET));
                  actionUrlDuyet.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlDuyet.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  
                  actionUrlKyso.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlKyso.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlKyso.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlKyso.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlKyso.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_KYSO));
                  actionUrlKyso.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlKyso.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
               
                  
                  
                  actionUrlDongDau.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlDongDau.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlDongDau.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlDongDau.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlDongDau.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_DONGDAU));
                  actionUrlDongDau.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlDongDau.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  //hanh dong gui thong tin sua doi, hoac bo xung mot chứng từ nao do doi voi mot bo ho so
                  actionUrlSuaDoiBoXung.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlSuaDoiBoXung.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlSuaDoiBoXung.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlSuaDoiBoXung.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlSuaDoiBoXung.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_SUA_DOI));
                  actionUrlSuaDoiBoXung.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlSuaDoiBoXung.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  
                  //actionUrlChuyenGiaoDien luon ton tai requestCode
                  actionUrlChuyenGiaoDien.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlChuyenGiaoDien.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlChuyenGiaoDien.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlChuyenGiaoDien.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlChuyenGiaoDien.setParameter(PageType.ACTION_TYPE, "");
                  actionUrlChuyenGiaoDien.setParameter(PageType.REQUEST_CODE, ParamUtil.getString(request, PageType.REQUEST_CODE));
                  actionUrlChuyenGiaoDien.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  actionUrlChoLanhDaoDuyet.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlChoLanhDaoDuyet.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlChoLanhDaoDuyet.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlChoLanhDaoDuyet.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlChoLanhDaoDuyet.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_CHO_LANH_DAO_DUYET));
                  actionUrlChoLanhDaoDuyet.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlChoLanhDaoDuyet.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  actionUrlChuyenTraHoSo.setParameter(PageType.TIEU_DE_BAN_KHAI, tieuDeBanKhai);
                  actionUrlChuyenTraHoSo.setParameter(PageType.DOCUMENT_NAME, documentName);
                  actionUrlChuyenTraHoSo.setParameter(PageType.DOCUMENT_YEAR, String.valueOf(documentYear));
                  actionUrlChuyenTraHoSo.setParameter(PageType.PAGE_TYPE, pageType);
                  actionUrlChuyenTraHoSo.setParameter(PageType.ACTION_TYPE, String.valueOf(PageType.ACTION_TYPE_CHUYEN_TRA_HO_SO));
                  actionUrlChuyenTraHoSo.setParameter(PageType.REQUEST_CODE, requestCodeKeHoach);
                  actionUrlChuyenTraHoSo.setParameter(MenuConstraint.SESSION_MENU_SELECTED, ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED));
                  
                  _log.info("===thong_tin_chung_ho_so.jsp===DOCUMENT_NAME==" + documentName + "==DOCUMENT_YEAR==" + documentYear + "==PAGE_TYPE==" 
                  		+ pageType + "==ACTION_TYPE==" + PageType.ACTION_TYPE_SUA + "==REQUEST_CODE==" + ParamUtil.getString(request, PageType.REQUEST_CODE));
                  
                  int resultT = CheckBusinessUtil.checkRoleDisplayButton(loaiThuTuc, FormatData.convertToInt(messageType), newValue,temp, requestCodeKeHoach, request);
                  if(lCode.equalsIgnoreCase("4") || lCode.equalsIgnoreCase("5")){
                	  IssueShiftingOrder shiftOrder45 = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodeKeHoach);
                	  if(Validator.isNotNull(shiftOrder45) && shiftOrder45.getStampStatus() == 1){
                		  resultT = CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_DONG_DAU;
                	  }
                  }
                  _log.info("===thong_tin_chung_ho_so.jsp===resultT==" + resultT + "messageType" + FormatData.convertToInt(messageType));
                  
              if (flagKeHoachLenhDieuDong) {
               	   _log.info("===thong_tin_chung_ho_so.jsp===flag==KeHoachLenhDieuDong===true===RequestState===" + temp.getRequestState() + "====DocumentStatusCode====" + temp.getDocumentStatusCode() + "------Loai Thu Tuc: " + loaiThuTuc);
               	   
               	_log.info("=============RESULTTTTTT========" + resultT);
               	boolean asssoBoolen = false;
 				 if(lCode.equalsIgnoreCase("4") || lCode.equalsIgnoreCase("5")){
                 	  IssueShiftingOrder shiftOrder45 = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodeKeHoach);
                 	  if(Validator.isNotNull(shiftOrder45) && shiftOrder45.getStampStatus() == 1){
                 		asssoBoolen = true;
                 	  }else{
                 		asssoBoolen = false;
                 	  }
                   }
                  	if ((messageType.compareTo(String.valueOf(MessageType.LENH_DIEU_DONG)) == 0 && temp.getRequestState() == TrangThaiBanKhai.DA_CAP_LENH_DIEU_DONG && 
                  			(temp.getDocumentStatusCode() == TrangThaiBanKhai.DA_TIEP_NHAN_KE_HOACH || temp.getDocumentStatusCode() == TrangThaiBanKhai.DA_TIEP_NHAN_THU_TUC)) && !asssoBoolen) {
                  		
                  			//temp DocumentStatus = (10, 19) thi ko cho phep cap lai hoach huy lenh dieu dong
                  			
                  			_log.info("===thong_tin_chung_ho_so.jsp===temp DocumentStatus = (10, 19) thi ko cho phep cap lai hoach huy lenh dieu dong");
                  			
                  			if (((temp.getDocumentStatusCode() != TrangThaiBanKhaiNhapCanh.HUY_THU_TUC_TAU_THUYEN_NHAP_CANH )) && (temp.getDocumentStatusCode() != TrangThaiBanKhaiNhapCanh.PHE_DUYET_HOAN_THANH_THU_TUC)) {
                  				//kiem tra tat ca cac lenh dieu dong da cap
                  				_log.info("===thong_tin_chung_ho_so.jsp===KIEM TRA TAT CA CAC LENH DIEU DONG Da duyet het hay chua duyet het");
                  				
                  				boolean isDuyetHetShiftOrder = true;
                  				for (IssueShiftingOrder item: lstShiftingOrder) {
                  					if (item.getRequestState() !=  TrangThaiBanKhaiNhapCanh.CHAP_NHAN_BAN_KHAI) {
                  						isDuyetHetShiftOrder = false;
                  						break;
                  					}
                  				}
                  				
                  				
                  			/*	boolean isDuyetHetShiftOrder1 = false;
                  				if(loaiThuTuc=="4" || loaiThuTuc=="5") {
                  					isDuyetHetShiftOrder1 = true;
                  				} */ 
                  				
                  				
                  				
                  				_log.info("===thong_tin_chung_ho_so.jsp===isDuyetHetShiftOrder===" + isDuyetHetShiftOrder);
                  				
                  				if (isDuyetHetShiftOrder == true  ) {
                  					_log.info("===thong_tin_chung_ho_so.jsp===DA_DUYET_HET==Hien Thi Nut Huy Hoac Cap Lai tren phien ban bat ki==Xem thong bao yeu cau Huy / Cap lai");
                  					if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI_LAN_THU_N) {
                  						
                  						actionUrlTiepNhan.setParameter(PageType.LAN_CAP_LENH_DIEU_DONG, KeyParams.N_LAN);
                  						
                  						_log.info("===308===thong_tin_chung_ho_so.jsp===Cấp lệnh điều động-n lần====");
                  						%>
                  						<% if(messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) != 0) {
											%>
												<button id="btnTiepNhan" class="bt" type="button" onclick="if(validatorCLDD()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Cấp lệnh điều động</button>
											<% 	} %>
                  					<%
                  					} else {
                  						_log.info("===313===thong_tin_chung_ho_so.jsp===Cấp lại lệnh điều động-n lần====");
                  						_log.info("===314===thong_tin_chung_ho_so.jsp===Hủy lệnh điều động-n lần");
                  						actionUrlChuyenGiaoDien.setParameter(PageType.LAN_CAP_LENH_DIEU_DONG, KeyParams.N_LAN);
                  					%>
									       <button class="bt" type="button" onclick="displayInputRejectAndChangeAction('<%=actionUrlChuyenGiaoDien.toString() %>')"><i class="tiepnhan"></i>Cấp lại lệnh điều động</button>
                           					<button class="bt" type="button" onclick="displayInputRejectAndChangeAction('<%=actionUrlHuy.toString() %>')"><i class="tiepnhan"></i>Hủy lệnh điều động</button>
                  					<%}%>
                  				<%
                  				} else if (lstShiftingOrder.get(0).getRequestCode().compareTo(requestCodeKeHoach) == 0) {
                  					_log.info("===thong_tin_chung_ho_so.jsp===Co lenh dieu dong chua duyet" + "===REQUEST_CODE_KEHOACH==" + requestCodeKeHoach + "==REQUEST_CODE_moi nhat==" + lstShiftingOrder.get(0).getRequestCode());
								
                  					
                  						//co flag sua lenh dieu dong
                  						_log.info("===thong_tin_chung_ho_so.jsp===XEM LENH DIEU DONG MOI NHAT===xem ban in va hien nut DUYET, SUA====co flag DUYET va GUI lenh dieu dong====REQUEST_STATE=4");
                  						_log.info("===thong_tin_chung_ho_so.jsp===co flag SUA lenh dieu dong====n LAN====Request_state=3");
                  						
                  						if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI_LAN_THU_N) {
                  							
                  							_log.info("===thong_tin_chung_ho_so.jsp===Cập nhập lenh dieu dong n lan, lenh dieu dong moi nhat====-n lần- ldd chưa duyệt hết");
                  							
                  							actionUrlSua.setParameter(PageType.LAN_SUA_LENH_DIEU_DONG, KeyParams.N_LAN);
                  						%>
                  							<% if(messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) != 0) {
												%>
													<button id="btnTiepNhan" class="bt" type="button" onclick="if(validatorCLDD()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Cấp lệnh điều động</button>
												<% 	} %>
                  						<%
                  						} else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_SUA || resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI ) {                  							
                  							_log.info("===thong_tin_chung_ho_so.jsp===duyet va gui lenh dieu dong trong truong hop tat ca lenh dieu dong da duyet het");
                  							_log.info("===thong_tin_chung_ho_so.jsp===duyet va gui lenh dieu dong trong truong hop tat ca lenh dieu dong da duyet het====Duyệt lệnh điều động-n lần====Sửa lệnh điều động-n lần");
                  							
                  							actionUrlChuyenGiaoDien.setParameter(PageType.LAN_SUA_LENH_DIEU_DONG, KeyParams.N_LAN);
                  							actionUrlChoLanhDaoDuyet.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
                  							actionUrlChoLanhDaoDuyet.setParameter(KeyParams.N_LAN, KeyParams.N_LAN);
                  							actionUrlDuyet.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
                  							actionUrlDuyet.setParameter(KeyParams.N_LAN, KeyParams.N_LAN);
                  							actionUrlKyso.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
                  							actionUrlKyso.setParameter(KeyParams.N_LAN, KeyParams.N_LAN);
                  						%>
                  						<div id="duyetkylenhdieudong">
                  							<button class="bt" type="button" onclick="summitForm('<%=actionUrlDuyet.toString() %>')"><i class="tiepnhan"></i>Duyệt lệnh điều động</button>
                  							<%
                  							if (rolequantri && rolelanhdao){
											%>
											<button class="bt" type="button" id="showdatakyso" > <i class="tiepnhan"></i>Ký số BCY</button>
											<%    } else { %>
			               					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>
			               					<%    }  %>
                  							
            								<button class="bt" type="button" onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString() %>')"><i class="tiepnhan"></i>Sửa lệnh điều động</button>
                  						</div>
                  						
                  						<%}%>
                  						
                  					<%
                  					
                  				%>
                  				<%} else if (2==1) {
                  				%>
                      		<%
                  			}}
                  	} else {
                  		if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CHAP_NHAN_TU_CHOI) {
                  			
                  			
                  			if (messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) == 0) {
                  				_log.info("~~~~~~~Vao Thong Button Thong bao===== l122333 ");                 				//check dieu kien thong bao tu choi chap nhan ho so
                  				String satateBanKhaiAnNinh = "tuchoi";
                  				String satateThongBao = "tuchoi";
                  				
                  				if (loaiThuTuc != null && (loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0 || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
                  					TempShipSecurityMessage shipSecurity = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
                  					TempNoTiceShipMessage noticeShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
                  					
                  					if (shipSecurity != null && (shipSecurity.getRequestState() == 4 || shipSecurity.getRequestState() == 1) ) {
                  						satateBanKhaiAnNinh = "chapnhan";
                  					} else if (shipSecurity == null) {
                  						satateBanKhaiAnNinh = "chapnhan";
                  					}
                  					
                  					if (noticeShipMessage != null && (noticeShipMessage.getRequestState() == 4 || noticeShipMessage.getRequestState() == 1)) {
                  						satateThongBao = "chapnhan";
                  					} else if (noticeShipMessage == null) {
                  						satateThongBao = "chapnhan";
                  					}
								
								} else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0
										|| loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0
										|| loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0) {
									TempNoTiceShipMessage noticeShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
									if (noticeShipMessage != null && (noticeShipMessage.getRequestState() == 4 || noticeShipMessage.getRequestState() == 1)) {
                  						satateThongBao = "chapnhan";
                  					} else if (noticeShipMessage == null) {
                  						satateThongBao = "chapnhan";
                  					}
								}
                              %>
                              
                              <% 
                              	if(loaiThuTuc == "4") {
                              		
                              	} else { %>
                              		<input type="hidden" id="satateBanKhaiAnNinh" value="<%=satateBanKhaiAnNinh%>" />
                              <input type="hidden" id="satateThongBao" value="<%=satateThongBao%>" />
                              <input type="hidden" id="loaiThuTuc" value="<%=loaiThuTuc%>" />
                              
                              <button class="bt" type="button" onclick="if(validatorChapNhanHoSo()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Thông báo chấp thuận</button>
                              <button class="bt" type="button" onclick="displayInputReject();"><i class="chuyen"></i>Thông báo từ chối</button>
                               <% if (loaiThuTuc == MessageType.LOAT_THU_TUC_VAO_CANG_PTTND || loaiThuTuc == MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) { %>
                              <button class="bt" type="button" onclick="displayXacNhanNopTrucTiep();" style="display: none;"><i class="chuyen"></i>Thông báo làm TT trực tiếp</button>
                              <% } %>
                               <!-- button Thong bao NLTT lam thu tuc truc tiep, chi ap dung cho VaoCangPTTND va RoiCangPTTND, va Khong co du lieu dien tu cua PTTND -->
                               <!-- button sua doi bo xung, luon luon xuat hien o? moi truong hop, thong bao tu can bo hai quan toi nguoi dan -->
              					<button id="btnTiepNhan" class="bt" type="button" onclick="displayInputModify();"><i class="tiepnhan"></i>Thông báo hướng dẫn DN bổ sung</button>
                              		
                              <% } %>
                              
                              <%
                  			} else {
                 				%>
                 				
                 				<%if(loaiThuTuc == MessageType.LOAT_THU_TUC_VAO_CANG) {
                 					_log.info("~~~~~~~Vao Thong Button Thong bao===== l122333 ");                 				//check dieu kien thong bao tu choi chap nhan ho so
                      				String satateBanKhaiAnNinh = "tuchoi";
                      				String satateThongBao = "tuchoi";
                      				
                      				if (loaiThuTuc != null && (loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0 || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
                      					TempShipSecurityMessage shipSecurity = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
                      					TempNoTiceShipMessage noticeShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
                      					
                      					if (shipSecurity != null && (shipSecurity.getRequestState() == 4 || shipSecurity.getRequestState() == 1) ) {
                      						satateBanKhaiAnNinh = "chapnhan";
                      					} else if (shipSecurity == null) {
                      						satateBanKhaiAnNinh = "chapnhan";
                      					}
                      					
                      					if (noticeShipMessage != null && (noticeShipMessage.getRequestState() == 4 || noticeShipMessage.getRequestState() == 1)) {
                      						satateThongBao = "chapnhan";
                      					} else if (noticeShipMessage == null) {
                      						satateThongBao = "chapnhan";
                      					}
    								
    								} else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) {
    									TempNoTiceShipMessage noticeShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
    									if (noticeShipMessage != null && (noticeShipMessage.getRequestState() == 4 || noticeShipMessage.getRequestState() == 1)) {
                      						satateThongBao = "chapnhan";
                      					} else if (noticeShipMessage == null) {
                      						satateThongBao = "chapnhan";
                      					}
    								} %>
    								
    						  <input type="hidden" id="satateBanKhaiAnNinh" value="<%=satateBanKhaiAnNinh%>" />
                              <input type="hidden" id="satateThongBao" value="<%=satateThongBao%>" />
                              <input type="hidden" id="loaiThuTuc" value="<%=loaiThuTuc%>" />
                              
                              <button class="bt" type="button" onclick="if(validatorChapNhanHoSo()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Thông báo chấp thuận</button>
                            
                              <button class="bt" type="button" onclick="displayInputReject();"><i class="chuyen"></i>Thông báo từ chối</button>
                                
                               <!-- button sua doi bo xung, luon luon xuat hien o? moi truong hop, thong bao tu can bo hai quan toi nguoi dan -->
              					<button id="btnTiepNhan" class="bt" type="button" onclick="displayInputModify();"><i class="tiepnhan"></i>Thông báo hướng dẫn DN bổ sung</button>
                 				<% } else { %>
                 					
                 					
                 					<button class="bt" type="button" onclick="summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Tiếp nhận bản khai</button>
                              	<button class="bt" type="button" onclick="displayInputReject();"><i class="chuyen"></i>Từ chối bản khai</button>
                 			
                 			<%	}
                 				
                 				
                 				%>
                 				
                  				
                              	<%
                  			}
                  				
                       } else if(resultT == 1 && messageType.compareTo(String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)) == 0 && loaiThuTuc == MessageType.LOAT_THU_TUC_VAO_CANG && (temp.getRequestState()==TrangThaiBanKhai.CHO_TIEP_NHAN || temp.getRequestState()==TrangThaiBanKhai.KE_HOACH_YEU_CAU_SUA_DOI_BO_SUNG)) {
                    	   
                    	   _log.info("~~~~~~~Vao Thong Button Thong bao===== l122333 ");                 				
             				String satateBanKhaiAnNinh = "tuchoi";
             				String satateThongBao = "tuchoi";
             				
             				if (loaiThuTuc != null && (loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0 || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
             					TempShipSecurityMessage shipSecurity = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
             					TempNoTiceShipMessage noticeShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
             					
             					if (shipSecurity != null && (shipSecurity.getRequestState() == 4 || shipSecurity.getRequestState() == 1) ) {
             						satateBanKhaiAnNinh = "chapnhan";
             					} else if (shipSecurity == null) {
             						satateBanKhaiAnNinh = "chapnhan";
             					}
             					
             					if (noticeShipMessage != null && (noticeShipMessage.getRequestState() == 4 || noticeShipMessage.getRequestState() == 1)) {
             						satateThongBao = "chapnhan";
             					} else if (noticeShipMessage == null) {
             						satateThongBao = "chapnhan";
             					}
							
							} else if (loaiThuTuc != null && loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0 || loaiThuTuc.trim().compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) {
								TempNoTiceShipMessage noticeShipMessage = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(temp.getDocumentName(), temp.getDocumentYear());
								if (noticeShipMessage != null && (noticeShipMessage.getRequestState() == 4 || noticeShipMessage.getRequestState() == 1)) {
             						satateThongBao = "chapnhan";
             					} else if (noticeShipMessage == null) {
             						satateThongBao = "chapnhan";
             					}
							} %>
							
					  <input type="hidden" id="satateBanKhaiAnNinh" value="<%=satateBanKhaiAnNinh%>" />
                     <input type="hidden" id="satateThongBao" value="<%=satateThongBao%>" />
                     <input type="hidden" id="loaiThuTuc" value="<%=loaiThuTuc%>" />
                     <!-- 
                     
                     
                      <button class="bt" type="button" onclick="if(validatorChapNhanHoSo()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Thông báo chấp thuận</button>
                   
                     <button class="bt" type="button" onclick="displayInputReject();"><i class="chuyen"></i>Thông báo từ chối</button>
                      -->
                    
                      
                      <!-- button sua doi bo xung, luon luon xuat hien o? moi truong hop, thong bao tu can bo hai quan toi nguoi dan -->
     					<button class="bt" type="button" onclick="displayInputReject();"><i class="chuyen"></i>Thông báo từ chối</button>
     					<button id="btnTiepNhan" class="bt" type="button" onclick="displayInputModify();"><i class="tiepnhan"></i>Thông báo hướng dẫn DN bổ sung</button>
                        
                       
                    <%   }
                  		//truong hop LDD da duoc cap, co the sua hoac duyet lenh dieu dong
                  		else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_SUA || resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI ) {
							
                      		_log.info("===thong_tin_chung_ho_so.jsp===co flag SUA lenh dieu dong====1 LAN====Request_state=3");
                      		_log.info("===thong_tin_chung_ho_so.jsp===co flag SUA lenh dieu dong====Duyệt lệnh điều động-1 lần====Sửa lệnh điều động-1 lần");
                      		_log.info("=resultT =============" + resultT);
                      		IssueShiftingOrder issueShiftingOrderTest = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodeKeHoach);
                      		//System.out.println("============issueShiftingOrderTest.getRequestState()========" + issueShiftingOrderTest.getRequestState()); // inlandddd edit
                      		if(issueShiftingOrderTest!=null&&(issueShiftingOrderTest.getRequestState()==TrangThaiBanKhai.TRANG_THAI_BANG_KHAI_MOI||issueShiftingOrderTest.getRequestState()==TrangThaiBanKhai.TRANG_THAI_BANG_KHAI_SUA /*||issueShiftingOrderTest.getRequestState()==TrangThaiBanKhai.TRANG_THAI_BANG_KHAI_TIEP_NHAN*/)){
                       		actionUrlChuyenGiaoDien.setParameter(PageType.LAN_SUA_LENH_DIEU_DONG, KeyParams.MOT_LAN);
                       		
                       		actionUrlDuyet.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
                       		actionUrlDuyet.setParameter(KeyParams.MOT_LAN, KeyParams.MOT_LAN);
                       		actionUrlChoLanhDaoDuyet.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
  							actionUrlChoLanhDaoDuyet.setParameter(KeyParams.N_LAN, KeyParams.N_LAN);
  							actionUrlKyso.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
  							actionUrlKyso.setParameter(KeyParams.N_LAN, KeyParams.N_LAN);
                           	%>
                           	<div id="duyetkylenhdieudong">
               					<button class="bt" type="button" onclick="summitForm('<%=actionUrlDuyet.toString() %>')"><i class="tiepnhan"></i>Duyệt lệnh điều động</button>
               					<%
               					if (rolequantri && rolelanhdao){
								%>
								<button class="bt" type="button" id="showdatakyso" > <i class="tiepnhan"></i>Ký số BCY</button>
								<%    } else { %>
               					<button class="bt" type="button"  onclick="summitForm('<%=actionUrlChoLanhDaoDuyet.toString()%>')"><i class="tiepnhan"></i>Chuyển lãnh đạo ký số</button>
               					<%    }  %>
               					
               					<button class="bt" type="button" onclick="summitForm('<%=actionUrlChuyenGiaoDien.toString() %>')"><i class="tiepnhan"></i>Sửa lệnh điều động</button>
                            
                            </div>
                               <%
                      		}
                       }
                       
                  		 //chinh dong dau
                        
                       else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_BAN_KHAI_DONG_DAU) {
                          	
                    		_log.info("===chinh 9999999999999");
                     		IssueShiftingOrder issueShiftingOrderTest = IssueShiftingOrderLocalServiceUtil.getByRequestCode(requestCodeKeHoach);
                     		
                          	%>
                          	<div id="duyetkylenhdieudong">
                          	<% 
                          					actionUrlDongDau.setParameter(PageType.DUYET_VA_GUI_LENH_DIEU_DONG, "duyet_va_gui_ldd");
                          					actionUrlDongDau.setParameter(KeyParams.N_LAN, KeyParams.N_LAN);
              					%>
              						<%				
									 if (rolevanthu) {
									%>
									<button class="bt" type="button" onclick="getFileComputerHashDongDau('<%= actionUrlDongDau.toString()%>')"> <i class="tiepnhan"></i>Đóng dấu BCY</button>
									<%    } else { %>
	               					
	               					<%    }  %>
              						
            				
              						<input type="hidden" id="RequestCode" name="RequestCode" value="<%=issueShiftingOrderTest.getAttachedFile()%>">
              				</div>
                              <%
                     		
                      }
                      
                       else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_DONG_DAU_XONG) {
                         	
                   		_log.info("===chinh 9999999999999");
                    		
                         	%>
             						<button class="bt" type="button" onclick="displayInputRejectAndChangeAction('<%=actionUrlChuyenGiaoDien.toString() %>')"><i class="tiepnhan"></i>Cấp lại lệnh điều động</button>
                           			<button class="bt" type="button" onclick="displayInputRejectAndChangeAction('<%=actionUrlHuy.toString() %>')"><i class="tiepnhan"></i>Hủy lệnh điều động</button>
             			
                             <%
                    		
                     }
                       
                       
                       else if (resultT == CheckBusinessUtil.THAO_TAC_BAN_KHAI_CAP_LAI) {
                       	
                       	actionUrlSua.setParameter(PageType.LAN_SUA_LENH_DIEU_DONG, KeyParams.MOT_LAN);
                       	actionUrlTiepNhan.setParameter(PageType.LAN_SUA_LENH_DIEU_DONG, KeyParams.MOT_LAN);
                       	_log.info("===thong_tin_chung_ho_so.jsp=============Cập nhập lệnh điều động-1 lần");
                       	%>
                       		<% if(messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) != 0) {
				%>
					<button id="btnTiepNhan" class="bt" type="button" onclick="if(validatorCLDD()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Cấp lệnh điều động</button>
			<% 	} %>
                       	<%
                      	}
          			}
               } else {
				_log.info("===thong_tin_chung_ho_so.jsp=====HVQ KeHoachLenhDieuDong====false====Cap lenh dieu dong lan dau tien");
				actionUrlTiepNhan.setParameter(PageType.LAN_CAP_LENH_DIEU_DONG, KeyParams.MOT_LAN);
				if(messageType.compareTo(String.valueOf(PageType.THANH_PHAN_HO_SO)) != 0) {
				%>
					<button id="btnTiepNhan" class="bt" type="button" onclick="if(validatorCLDD()) summitForm('<%=actionUrlTiepNhan.toString() %>')"><i class="tiepnhan"></i>Cấp lệnh điều động</button>
			<% 	} %>
               	
               <%			
				}  
               %>
              
<!--               thong tin ky so -->
            <div class="tbl_left boxlabel" id="kstable" style="width: 49%">
			<table class="table_noboder">
				<thead>
					<tr>
						<th class="text-left" width="30%">Người ký&nbsp;<span style="color:#FF0000;">(*)</span>
						</th>
						<td class="text-leftu">
							<%
							String portCode_ = Validator.isNotNull(dmHisMaritime) ? dmHisMaritime.getMaritimeCode() : temp.getMaritimeCode();
							List<UserSign> userSigns = UserSignLocalServiceUtil.getByPortCode(portCode_, -1, -1);
							UserSign userSignDefault = UserSignLocalServiceUtil.getByUserId(themeDisplay.getUserId());
							if (userSignDefault == null) { userSignDefault = new UserSignImpl(); } 
							String userTitle = userSignDefault.getTitle();
							if (userTitle.isEmpty() || userTitle== null){
								userTitle = "Thiếu thông tin ký số";
							}else{
								
							}
							%>
							<label ><%=  userTitle%></label>	
							<select id="signName" name="signName" style="display: none;">
								<option value="" data-user-sign-id="">-- Chọn cán bộ --</option>
								<%
								for(UserSign userSign : userSigns) {
									
									User user_ = UserLocalServiceUtil.getUser(userSign.getUserId());
									User userLoginDefault = PortalUtil.getUser(request);
									String seld = "";
									
									String signName_ = Validator.isNotNull(shiftingOrderEdit) ? shiftingOrderEdit.getSignName() : "";
									if(userSign.getTitle().equalsIgnoreCase(signName_)) {
										seld = "selected=\"selected\"";
									}
								%>
								
								<option value="<%= userSign.getTitle() %> " <%=userSign.getUserId()== userLoginDefault.getUserId()? "selected" : "" %> data-user-sign-id="<%= userSign.getId() %>">
									<%= userSign.getTitle() + " - " + user_.getEmailAddress() %></option>
								
								<% } %>
							</select>
							<%-- <input type="text" class="egov-inputfield" style="width: 98%;text-transform: none;"
									id="signName" name="signName" value="<%=Validator.isNotNull(shiftingOrderEdit) ? shiftingOrderEdit.getSignName() : ""%>"> --%>
						</td>
					</tr>
					<tr>
						<th class="text-left" width="30%">Ngày ký&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<input type="text" style="width: 91%"
									name="signDate" id="signDate" value="<%=Validator.isNotNull(shiftingOrderEdit)?FormatData.parseDateToTringType3(shiftingOrderEdit.getIssueDate()):""%>"
									onclick="gtCalendar('signDate')">
							<img alt="" src="<%=request.getContextPath()%>/img/front/galden.png" onclick="gtCalendar('signDate')">
						</td>
					</tr>
					<tr> 
						<th class="text-left" width="30%">Địa điểm ký&nbsp;<span style="color:#FF0000;">(*)</span></th>
						<td class="text-leftu">
							<input type="text" class="egov-inputfield" style="width: 98%"
									id="signPlace" name="signPlace" value="<%=dmHisMaritime.getCitycode()%>">
						</td>
						<input type="hidden" id="fileId" name="fileId" value="">
					</tr>
					
					<tr>
                          <td style="text-align: center;">
                   
                          </td>
                          <td style="text-align: center;">
                          	<%
							 if (rolelanhdao) {
							%>
							<button class="bt" type="button" onclick="if(validatorTTKS()) getFileComputerHash('<%=actionUrlKyso.toString()%>')"><i class="tiepnhan"></i>Thực hiện</button>
							<%    } else { %>
              				
              					<%    }  %>
                          	
                              <button class="bt" type="button" id="quaylai"><i class="tiepnhan"></i>Quay lại</button>
                          </td>
                     </tr>
                      
      
				</thead>
			</table>
		</div>           
      
              
              <!-- div hien thi noi dung trong TRUONG HOP THONG BAO SUA DOI BO SUNG tu co quan hang hai den bo giao thong -->
              <div align="left" id="modify_data" style="display: none;"><br>
                  <table style="width: 60%">
                      <tr>
                          <td style="width: 100%">Nhập lý do&nbsp;<span style="color:#FF0000;">(*)</span>:</td>
                      </tr>
                      <tr>
                          <td style="width: 100%" class="text-left">
                              <textarea id="ly_do_suadoi_bosung" name="<%=PageType.LY_DO_SUADOI_BOSUNG%>" rows="4" cols="100" maxlength="3000"></textarea>
                          </td>
                      </tr>
                      <tr>
                          <td style="text-align: left;">
                              <button class="bt" type="button" onclick="if(validatorModify()) summitForm('<%=actionUrlSuaDoiBoXung.toString()%>')"><i class="tiepnhan"></i>Xác nhận</button>
                          </td>
                      </tr>
                  </table>
			</div>
              
              <!-- div hien thi noi dung trong TRUONG HOP TU CHOI HO SO thong bao sua doi bo sung tu co quan hang hai den bo giao thong -->
              <div align="left" id="reject_data" style="display: none;"><br>
                  <table style="width: 60%">
                      <tr>
                          <td style="width: 100%">Nhập lý do&nbsp;<span style="color:#FF0000;">(*)</span>:</td>
                      </tr>
                      <tr>
                          <td style="width: 100%" class="text-left">
                              <textarea id="LY_DO_TU_CHOI" name="<%=PageType.LY_DO_TU_CHOI%>" rows="4" cols="100" maxlength="3000"></textarea>
                          </td>
                      </tr>
                      <tr>
                          <td style="text-align: left;">
                              <button class="bt" type="button" onclick="if(validatorXacNhanTuChoi()) summitForm('<%=actionUrlTuChoi.toString()%>')"><i class="tiepnhan"></i>Xác nhận</button>
                          </td>
                      </tr>
                  </table>
			</div>
			
			<!-- div hien thi noi dung trong TRUONG HOP Thong bao NLTT den lam thu tuc truc tiep tai CVHH -->
              <div align="left" id="nop_hs_truc_tiep" style="display: none;"><br>
                  <table style="width: 60%">
                      <tr>
                          <td style="width: 100%">Nhập lý do thông báo làm thủ tục trực tiếp &nbsp;<span style="color:#FF0000;">(*)</span>:</td>
                      </tr>
                      <tr>
                          <td style="width: 100%" class="text-left">
                          		<% if (loaiThuTuc == MessageType.LOAT_THU_TUC_VAO_CANG_PTTND ) { %>
                          		<textarea id="LY_DO_NOP_TRUC_TIEP" name="<%=PageType.LY_DO_NOP_TRUC_TIEP%>" rows="10" cols="100" maxlength="3000"><liferay-ui:message key="vn.dtt.kehoach.tbgiaytonop" /></textarea>
                 				<% } else if ( loaiThuTuc == MessageType.LOAT_THU_TUC_ROI_CANG_PTTND){ %>                 				
                              	<textarea id="LY_DO_NOP_TRUC_TIEP" name="<%=PageType.LY_DO_NOP_TRUC_TIEP%>" rows="10" cols="100" maxlength="3000"><liferay-ui:message key="vn.dtt.kehoach.tbgiaytoxuat" /></textarea>
                              	<% }  %>
                          </td>
                      </tr>
                      <tr>
                          <td style="text-align: left;">
                              <button class="bt" type="button" onclick="if(validatorXacNhanNopTrucTiep()) summitForm('<%=actionUrlNopTrucTiep.toString()%>')"><i class="tiepnhan"></i>Gửi thông báo</button>
                          </td>
                      </tr>
                  </table>
			</div>
		</form>
	</div>
</div>
<%
}
%>
<!-- bo? caApplet cu~ -->
<!-- <div>
	<applet name='caApplet' id='caApplet' width="0" height="0"
			code='com.ecoit.asia.EcoitApplet.class'
			archive='CAAppletSimple.jar,bcprov-jdk15on-1.48.jar,bcpkix-jdk15on-1.48.jar,commons-codec-1.5.jar,commons-io-2.4.jar,commons-lang3-3.1.jar,commons-logging-1.1.jar,commons-net-3.2.jar,dom4j-1.6.1.jar,itextpdf-5.4.2.jar,jacob-1.14.3.jar,jaxen-1.1.jar,log4j-1.2.13.jar,fontbox-1.8.8.jar,pdfbox-1.8.8.jar,xalan-2.7.1.jar,xmlsec-1.5.1.jar'
			codebase='/TichHopGiaoThong-portlet/applet/'>
	</applet>
</div> -->
<portlet:resourceURL var="getDataAjax"></portlet:resourceURL>

<portlet:actionURL var="signatureURL" name="signature"></portlet:actionURL>
<portlet:actionURL var="rollbackSignatureURL" name="rollbackSignature"></portlet:actionURL>


<script type="text/javascript">

$(document).ready(function(){
	$("#kstable").hide();
	    $("#showdatakyso").click(function(){
	        $("#kstable").show();
	        $("#duyetkylenhdieudong").hide();
	        
	    });
	});
$(document).ready(function(){
    $("#quaylai").click(function(){
        $("#kstable").hide();
        $("#duyetkylenhdieudong").show();
    });
});




var dirChuKiSo = '<%=request.getContextPath() + "/kysotemp/"%>';
var complateSignatureURL = '<%=signatureURL%>';

	function getFileComputerHash(urlFromSubmit) {

	//	alert("-vao-----------getFileComputerHash----------");
		var url = '<%=getDataAjax%>';
		var nanoTime = $('#nanoTimePDF').val();
		
		url = url + "&nanoTimePDF="+nanoTime;
		
		
		
		 var rollbackSignatureURL = '<%=rollbackSignatureURL%>';
	//disable the button after user submitted
	
	var tieuDeBanKhai = '<%=tieuDeBanKhai%>';
	var documentName = '<%=documentName%>';
// 	alert("-vao-----------url"+url);
// 	alert("-vao-----------tieuDeBanKhai"+tieuDeBanKhai);
// 	alert("-vao-----------documentName"+documentName);

	var userSignId = 0;
	if($('#signName').length > 0) {
		userSignId = $('#signName option:selected').attr('data-user-sign-id');
	}
	
	$.ajax({
		type : 'POST',
		url : url,
		data : {
			tieuDeBanKhai : tieuDeBanKhai, 
			documentName : documentName,
			userSignId: userSignId,
			type: 'getComputerHash'
		},
		success : function(data) {
			if(data){
				var jsonData = JSON.parse(data);
				var hashComputers = jsonData.hashComputers;
				var signFieldNames = jsonData.signFieldNames;
				var filePaths = jsonData.filePaths;
				var msgs = jsonData.msg;
// 				alert("vao hashComputers.length loi"+data);
				for ( var i = 0; i < hashComputers.length; i++) {
				//	alert("vao hashComputers.length loi"+hashComputers.length);
					var hashComputer = hashComputers[i];
					var signFieldName = signFieldNames[i];
					var filePath = filePaths[i];
					var msg = msgs[i];
					if(plugin().valid){
// 						alert("hashComputer: " + hashComputer);
// 						alert("signFieldNames: " + msg);
						if(msg == 'success'){
							var code = plugin().Sign(hashComputer);
						//	alert("code: " + code);
							if(code ===0 || code === 7){
								var sign = plugin().Signature;
// 								alert("urlFromSubmit"+urlFromSubmit);
								completeSignature(sign, signFieldName, filePath, urlFromSubmit);
							
							}else{
								alert("Không ký được hồ sơ (" + code + ")");
								//rollbackSignature(plugin().ErrorMessage, filePath);
				            }
						}else{
							alert(msg);
						}
			        	
			        } else {
			         	alert("CryptoLib05Plugin trên trình duyệt không hoạt động");
			        }
				}
			}
		}
	});
}

function completeSignature(sign, signFieldName, filePath, urlFromSubmit) {
	//alert("--------- vao day completeSignature--------------");
// 	alert("urlFromSubmit"+urlFromSubmit);
	var msg = '';
	$.ajax({
		type : 'POST',
		url : complateSignatureURL,
		async : true,
		data : {
			sign : sign,
			signFieldName : signFieldName,
			filePath : filePath
		},
		success : function(data) {
			console.log("--data--", data);
			if (data){
				var jsonData = JSON.parse(data);
				msg = jsonData.msg;
				//msg = data.msg;
				console.log("--msg--", msg);
				console.log("--msg--", jsonData.filePath);
				console.log("--fileId--", jsonData.fileId);
				
				$("#fileId").val(jsonData.fileId);
				
			//	alert( "----vao day data- data------", data, "---- filePath---", data.filePath);
				
				if (msg === 'success') {
// 					alert("urlFromSubmit"+urlFromSubmit);
					var urlAction = document.getElementById('userForm').action;
					if (urlAction == '') {
// 						alert("urlFromSubmit"+urlFromSubmit);
						document.getElementById('userForm').action = urlFromSubmit;
					}
					document.getElementById('userForm').submit();
					
				} else {
					/* console.log("______ky So RESULT= HAMINH KO KY SO DC="); */
					//	alert("--------- vao day completeSignature- ky so ko dc-------------");
					showThongBaoMsgKySo();
				}
			}
		}
	});
	
//		document.getElementById("filePath").value = data.filePath;
	
}

// *************************************************************



//   chinh dong dau  17/12 

var url = '<%=getDataAjax%>';	
var complateSignatureURL = '<%=signatureURL%>';
var rollbackSignatureURL = '<%=rollbackSignatureURL%>';

function getFileComputerHashDongDau(urlFromSubmit) {
	
		//alert("-vao-----------getFileComputerHash--dong dau--------");
		
		
		var RequestCode = document.getElementById("RequestCode").value;
	//	alert("-vao-----------getFileComputerHash--dong dau RequestCode--------" +RequestCode);
	var tieuDeBanKhai = '<%=tieuDeBanKhai%>';
	var documentName = '<%=documentName%>';
	
	var userSignId = 0;
	if($('#signName').length > 0) {
		userSignId = $('#signName option:selected').attr('data-user-sign-id');
	}
	
	//alert("-vao-----------tieuDeBanKhai"+tieuDeBanKhai);
	//alert("-vao-----------documentName"+documentName);
//	$("#RequestCode").val(jsonData.RequestCode);
	$.ajax({
		type : 'POST',
		url : url,
		data : {
			tieuDeBanKhai : tieuDeBanKhai, 
			documentName : documentName,
			RequestCode:RequestCode,
			userSignId: userSignId,
			type:'getComputerHashDongDau'
		},
		success : function(data) {
			if(data){
				var jsonData = JSON.parse(data);
				var hashComputers = jsonData.hashComputers;
				var signFieldNames = jsonData.signFieldNames;
				var filePaths = jsonData.filePaths;
				var msgs = jsonData.msg;
			
				
				for ( var i = 0; i < hashComputers.length; i++) {
					var hashComputer = hashComputers[i];
					var signFieldName = signFieldNames[i];
					var filePath = filePaths[i];
					var msg = msgs[i];
					if(plugin().valid){
// 						alert("hashComputer: " + hashComputer);
						//alert("signFieldNames: " + signFieldNames);
						if(msg == 'success'){
							var code = plugin().Sign(hashComputer);
						//	alert("code: " + code);
							if(code ===0 || code === 7){
								var sign = plugin().Signature;
								completeSignatureDongDau(sign, signFieldName, filePath, urlFromSubmit);
							
							}else{
								alert("Không ký được hồ sơ (" + code + ")");
								//rollbackSignature(plugin().ErrorMessage, filePath);
				            }
						}else{
							alert(msg);
						}
			        	
			        } else {
			         	alert("CryptoLib05Plugin trên trình duyệt không hoạt động");
			        }
				}
			}
		}
	});
}




function completeSignatureDongDau(sign, signFieldName, filePath, urlFromSubmit) {
//	alert("--------- vao day completeSignature--------------");
	var msg = '';
	$.ajax({
		type : 'POST',
		url : complateSignatureURL,
		async : true,
		data : {
			sign : sign,
			signFieldName : signFieldName,
			filePath : filePath
		},
		success : function(data) {
			console.log("--data--", data);
			if (data){
				var jsonData = JSON.parse(data);
				msg = jsonData.msg;
				//msg = data.msg;
				console.log("--msg--", msg);
				console.log("--msg--", jsonData.filePath);
				console.log("--fileId--", jsonData.fileId);
				$("#fileId").val(jsonData.fileId);
				
				if (msg === 'success') {
		  		//	alert("--780------- vao day  dong dau Signature- success-------------");
		  			var urlAction = document.getElementById('userForm').action;
		  			if (urlAction == '') {
		  				document.getElementById('userForm').action = urlFromSubmit;
		  			}
		  			document.getElementById('userForm').submit();
		  		} else {
//		  			/* console.log("______ky So RESULT= HAMINH KO KY SO DC="); */
		  			//	alert("--------- vao day completeSignature- ky so ko dc-------------");
		  			showThongBaoMsgKySo();
		  		}
				
				
				//alert( "----vao day data- data------", data, "---- filePath---", data.filePath);
				
			}
		}
	});
	
		
}


	function plugin0()
	 {
	  return document.getElementById('plugin0');
	 }
	 plugin = plugin0;
	    
	 function ShowSetting()
	    {
	        if(plugin().valid){
	            plugin().ShowSetting();    
	        } else {
	            alert("CryptoLib05Plugin trên trình duyệt không hoạt động :(");
	        }
	    }

	 
	 
	 function Sign()
{
    if(plugin().valid){
        var str = document.getElementById("inHash").value;
        var x = plugin().Sign(str);
		alert(x);
        if(x===0 || x===7){
            document.getElementById("Signature").value = plugin().Signature;
        }else{
            document.getElementById("Signature").value = plugin().ErrorMessage;
        }
    } else {
        alert("CryptoLib05Plugin trên trình duyệt không hoạt động :(");
    }
}
function showThongBaoMsgKySo() {
/ console.log("==showThongBaoMsg =="); /
$("#div_WarningMsg").dialog({
title:'Xác nhận thay đổi',
     resizable: false,
     modal: true,
     width: '400px',
     
     closeOnEscape: false,
     open: function() {
         jQuery('.ui-widget-overlay').bind('click', function() {
             $('#div_WarningMsg').dialog('close');
         });
     }
});
}

function func_closeWarningDialog() {
$('#div_WarningMsg').dialog('close');
}


	var Accordion1 = new Spry.Widget.Accordion("Accordion1");
	var Accordion2 = new Spry.Widget.Accordion("Accordion2");

	function validatorChapNhanHoSo() {
		var satateBanKhaiAnNinh = $('#satateBanKhaiAnNinh').val();
		var satateThongBao = $('#satateThongBao').val();
		var loaiThuTuc = $('#loaiThuTuc').val();

		if (loaiThuTuc === 'NC' || loaiThuTuc === 'QC' || loaiThuTuc === '4') {
			if (satateBanKhaiAnNinh === 'tuchoi' && satateThongBao === 'tuchoi') {
				alert("Bản khai trong thành phần hồ sơ đã bị từ chối. Cán bộ cảng vụ không thể thực hiện chấp nhận hồ sơ !");
				return false;
			} else if (satateBanKhaiAnNinh === 'tuchoi') {
				alert("Bản khai trong thành phần hồ sơ đã bị từ chối. Cán bộ cảng vụ không thể thực hiện chấp nhận hồ sơ !");
				return false;
			} else if (satateThongBao === 'tuchoi') {
				alert("Bản khai trong thành phần hồ sơ đã bị từ chối. Cán bộ cảng vụ không thể thực hiện chấp nhận hồ sơ !");
				return false;
			} else {
				return true;
			}
			
		} else if (loaiThuTuc === 'XC' || loaiThuTuc === '5' || loaiThuTuc === '6' || loaiThuTuc === '7') {
			if (satateThongBao === 'tuchoi') {
				alert("Bản khai trong thành phần hồ sơ đã bị từ chối. Cán bộ cảng vụ không thể thực hiện chấp nhận hồ sơ !");
				return false;
			} else {
				return true;
			}
		}
	}

	function validatorTTKS(){
		var valuesignName = $("#signName").val();
		var datasignName =$.trim(valuesignName);
		
		var valuesignDate = $("input[id=signDate]").val();		
		if(valuesignDate ===''){
			alert("Đề nghị nhập ngay ki !");
			return false;
		}
		if (datasignName ===''){
			alert("Đề nghị nhập Tên người ký !");
			return false;
		}
		return true;
	}

	
	function summitForm(url) {
		var urlAction = document.getElementById('userForm').action;
		if (urlAction == '') {
			document.getElementById('userForm').action = url;
		}
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('userForm').submit();
		} else {
			document.getElementById('userForm').action = '';
		}
	}

	function displayInputRejectAndChangeAction(url) {
		var component = document.getElementById('reject_data');
		if (component.style.display == 'none') {
			component.style.display = '';
			document.getElementById('userForm').action = url;
			
		} else if (component.style.display == '') {
			component.style.display = 'none';
			document.getElementById('userForm').action = '';
		}
	}

	function displayInputReject() {
		var component = document.getElementById('reject_data');
		if (component.style.display == 'none') {
			component.style.display = '';
		} else if (component.style.display == '') {
			component.style.display = 'none';
		}
	}

	function displayInputModify() {
		var component = document.getElementById('modify_data');
		if (component.style.display == 'none') {
			component.style.display = '';
		} else if (component.style.display == '') {
			component.style.display = 'none';
		}
	}

	function validatorModify() {
		var value = $("textarea[id=ly_do_suadoi_bosung]").val();
		var data = $.trim(value);
		if (data.length == 0) {
			alert("Đề nghị nhập lý do !");
			return false;
		} else {
			return true;
		}
	}

	function validatorCLDD() {
		var valueCertificateNo = $("input[id=certificateNo]").val();//giay phep so
		var dataCertificateNo = $.trim(valueCertificateNo);
		
		var holdPortHarbourCode = $("select#holdPortHarbourCode").val();
		var holdPortWharfCode = $("select#holdPortWharfCode").val();
		
		if (dataCertificateNo.length == 0) {
			alert("Đề nghị nhập Giấy phép số !");
			return false;
		//} else if (dataCertificateNo.length > 6) {
		//	alert("Giấy phép số chỉ có 6 chữ số !");
		//	return false;
		} else if (holdPortHarbourCode === '' || typeof holdPortHarbourCode === 'undefined') {
			alert("Đề nghị chọn bến cảng (Xác báo không có thông tin bến cảng) !");
			return false;
		} else if (holdPortWharfCode === '' || typeof holdPortWharfCode === 'undefined') {
			alert("Đề nghị chọn cầu cảng (Xác báo không có thông tin cến cảng) !");
			return false;
		} else {
			return true;
		}
	}

	function validatorXacNhanTuChoi() {
		var value = $("textarea[id=LY_DO_TU_CHOI]").val();
		var data = $.trim(value);
		if (data.length == 0) {
			alert("Đề nghị nhập lý do");
			return false;
		} else {
			return true;
		}
	}
	
	function validatorXacNhanNopTrucTiep() {
		var value = $("textarea[id=LY_DO_NOP_TRUC_TIEP]").val();
		var data = $.trim(value);
		if (data.length == 0) {
			alert("Đề nghị nhập lý do làm thủ tục trực tiếp!");
			return false;
		} else {
			return true;
		}
	}
	
	function displayXacNhanNopTrucTiep() {
		var component = document.getElementById('nop_hs_truc_tiep');
		if (component.style.display == 'none') {
			component.style.display = '';
		} else if (component.style.display == '') {
			component.style.display = 'none';
		}
	}
</script>