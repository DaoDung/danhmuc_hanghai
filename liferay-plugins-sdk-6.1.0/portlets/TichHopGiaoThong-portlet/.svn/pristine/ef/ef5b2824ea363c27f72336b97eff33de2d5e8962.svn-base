<%@page import="vn.gt.portlet.baocao.BaoCaoConstant"%>
<%@page import="vn.gt.portlet.baocao.BaoCaoBussinessUtils"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.tichhop.report.ReportsBusinessUtils"%>
<%@page import="vn.gt.tichhop.report.ReportConstant"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.service.OrganizationLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page pageEncoding="UTF-8"%>

<%
	String tenFileExport = "";
	
	if ((reportCode != null) && (reportCode.trim() != "")) {
		if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_KE_HOACH_DIEU_DONG) {
			tenFileExport = BaoCaoConstant.KE_HOACH_DIEU_DONG_EXPORT;
			
		} else if (Integer.parseInt(reportCode) == BaoCaoConstant.THONG_BAO_TINH_HINH_TAU_THUYEN_DU_KIEN_NEO_DAU_TAI_CANG) {
			tenFileExport = BaoCaoConstant.THONG_BAO_TINH_HINH_DU_KIEN_NEO_DAU_EXPORT;
			
		} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_THONG_KE_TINH_HINH_NOP_HO_SO) {
			tenFileExport = BaoCaoConstant.BAO_CAO_THONG_KE_TINH_HINH_NOP_HS_EXPORT;
			
		} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_THONG_KE_HO_SO_THEO_PHONG_BAN) {
			tenFileExport = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_THEO_PHONG_BAN_EXPORT;
			
		} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG) {
			tenFileExport = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_EXPORT;
			
		} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_KET_QUA_THUC_HIEN_CO_CHE_MOT_CUA_QUOC_GIA) {
			tenFileExport = BaoCaoConstant.BAO_CAO_KET_QUA_THUC_HIEN_CO_CHE_MOT_CUA_QUOC_GIA_EXPORT;
		} else {
			hasData = null;
		}
	}
	
	String UrlFile = request.getContextPath() + "/export/" + tenFileExport;
	String UrlFileDownLoad = UrlFile.replace(".pdfs", ".pdf");
	
	if ((hasData != null) && (hasData.equalsIgnoreCase("Y"))) {
%>
<div>
	<OBJECT data="<%=UrlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
	       type="text/html" TITLE="Báo cáo thống kê"
	       WIDTH="100%" HEIGHT="850px"
	       style="background: white; min-height: 100%;">
	      <a href="<%=UrlFileDownLoad%>">Tải xuống file</a> 
	</object>
</div>

<%} else if ((hasData != null) && (hasData.equalsIgnoreCase("N"))) {%>
<div>
	<p>Không có dữ liệu tồn tại<p>
</div>
<%}%>
