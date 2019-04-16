<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
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

	maritimeCode = ParamUtil.getString(request, "maritimeCode");
	tuNgay = ParamUtil.getString(request, "tuNgay");
	denNgay = ParamUtil.getString(request, "denNgay");
	String reportDate = ParamUtil.getString(request, "reportDate");
	
	
	
	
	BaoCaoBussinessUtils action = new BaoCaoBussinessUtils();
	if(((maritimeCode != null) && (maritimeCode.trim() != "")) && ((tuNgay != null) && (tuNgay.trim() != "")) && 
			((denNgay != null) && (denNgay.trim() != "")) && ((reportDate != null) && (reportDate.trim() != ""))){
		action.actionExportThongKeDVCongTheoPhongBan(reportDate, maritimeCode, tuNgay, denNgay);
	}
	
	//action.actionExportThongKeDVCongTheoPhongBan("04/11/2014 11:10", "12", "01/10/2013 11:10", "01/12/2014 11:10");
	//String tenFileExport1 = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_THEO_PHONG_BAN_EXPORT;
	//action.actionExportThongKeDichVuCong("04/11/2014 11:10", "12", "01/10/2013 11:10", "01/12/2014 11:10");
	//String tenFileExport1 = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_EXPORT;
	
	String tenFileExport1 = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_THEO_PHONG_BAN_EXPORT;

	String UrlFile1 = request.getContextPath()+"/export/"+tenFileExport1;
	String UrlFileDownLoad1=UrlFile1.replace(".pdfs", ".pdf");
	
%>
<div>
	<OBJECT data="<%=UrlFile1%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0" type="text/html" TITLE="Báo cáo thống kê" 
	WIDTH="100%" HEIGHT="850px"  style="background: white;min-height: 100%;"  >
	    <a href="<%=UrlFileDownLoad1%>">Tải xuống file</a> 
	</object>
</div>
