<%@page import="vn.gt.utils.URLUtils"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="java.io.File"%>
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
	String documentName = ParamUtil.getString(request, "documentName");
	String documentYear = ParamUtil.getString(request, "documentYear");
	String ministryCode = ParamUtil.getString(request, "ministryCode");
	
	String pathFileSub = "/opt/liferay/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/export/";

	boolean ketQuaResult = false;
	long nanoTime = 0;

	String tenFileExport = "defaultExport.pdfs";
	//BaoCaoConstant.BAO_CAO_PHAN_HOI_TU_CQCN_EXPORT
	//String UrlFile = request.getContextPath() + "/export/";
	
	//String urlFileCheck = PortalUtil.getPortalURL(request) + UrlFile1;
	
	BaoCaoBussinessUtils action = new BaoCaoBussinessUtils();
	//if (((documentName != null) && (documentName.trim() != "")) &&
	//	((documentYear != null) && (documentYear.trim() != "")) &&
	//	((ministryCode != null) && (ministryCode.trim() != ""))) {
		//try {
		//	File file = new File(pathFileSub + tenFileExport1);
		//	if (file.delete()) {
		//		System.out.println(file.getName() + " is deleted!");
		//	} else {
		//		System.out.println("Delete operation is failed.");
		//	}
		//} catch (Exception e) {
		//	e.printStackTrace();
		//	System.out.println("File not found");
		//}
		
	//}

	//String UrlFileDownLoad1 = UrlFile1.replace(".pdfs", ".pdf");
	
	if (((documentName != null) && (documentName.trim() != "")) && ((documentYear != null) && (documentYear.trim() != "")) && ((ministryCode != null) && (ministryCode.trim() != ""))) {
		
		nanoTime = action.actionExportThongTinTau(Long.parseLong(documentName),Integer.parseInt(documentYear), ministryCode);
		tenFileExport = nanoTime + "_" + BaoCaoConstant.BAO_CAO_PHAN_HOI_TU_CQCN_EXPORT;
	}
	
	String UrlFile = request.getContextPath() + "/export/" + tenFileExport;
	String UrlFileDowLoad = UrlFile.replace(".pdfs", ".pdf");
%>
<!-- <div id="viewKetQua">Đang tải...</div> -->

<div>
	<OBJECT data="<%=UrlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
			type="text/html"
			TITLE="SamplePdf"
			WIDTH="100%"
			HEIGHT="1000px"
			style="background: white;
			min-height: 100%;">
		<a href="<%=UrlFileDowLoad%>">Tải xuống file</a> 
	</object>
</div>



<script type="text/javascript">
	//var urlFileKetQua = '<=UrlFile1%>';
	//var urlFileKetQuaFull = '<=urlFileCheck%>';
	
	//var isCheck = '1';

	//var refreshId = setInterval( function() {
		
	//	console.log("==Check=====");
		
	//	var isKetQua = '<=ketQuaResult%>';
		
	//	console.log("isKetQua=====" + isKetQua);
		
	//	if (isKetQua == 'true' && isCheck == '1') {
	//		var isFile = '<=URLUtils.exists(urlFileCheck)%>';
	//		console.log("====isFile==" + isFile);
	//		if (isFile == 'true') {
	//			console.log("====load file==");
	//			var newElement = "<iframe src='https://docs.google.com/viewer?url=" + urlFileKetQuaFull + "&embedded=true' width='100%' height='700px'  />";
	//			document.getElementById("viewKetQua").innerHTML = newElement;
	//			isCheck = '2';
	//		}
	//		clearInterval(refreshId);
	//	}
	//}, 10000);
	
</script>
