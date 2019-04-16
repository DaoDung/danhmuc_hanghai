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
	String documentName = ParamUtil.getString(request, PageType.DOCUMENT_NAME);
	String documentYear = ParamUtil.getString(request, PageType.DOCUMENT_YEAR);
	
	BaoCaoBussinessUtils action = new BaoCaoBussinessUtils();

	if(((documentName != null) && (documentName.trim() != "")) && ((documentYear != null) && (documentYear.trim() != ""))){
		action.actionExportKiemTraThongTinTau(Long.parseLong(documentName), Integer.parseInt(documentYear));
	}
	
	String tenFileExport1 = BaoCaoConstant.BAO_CAO_KIEM_TRA_THONG_TIN_TAU_EXPORT;

	String UrlFile1 = request.getContextPath()+"/export/"+tenFileExport1;
	String UrlFileDownLoad1=UrlFile1.replace(".pdfs", ".pdf");
	 
	if(((documentName != null) && (documentName.trim() != "")) && ((documentYear != null) && (documentYear.trim() != ""))){
%>
<div>
	<OBJECT data="<%=UrlFile1%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0" type="text/html" TITLE="Báo cáo thống kê" 
	WIDTH="100%" HEIGHT="850px"  style="background: white;min-height: 100%;"  >
	    <a href="<%=UrlFileDownLoad1%>">Tải xuống file</a> 
	</object>
</div>
<%}
%>