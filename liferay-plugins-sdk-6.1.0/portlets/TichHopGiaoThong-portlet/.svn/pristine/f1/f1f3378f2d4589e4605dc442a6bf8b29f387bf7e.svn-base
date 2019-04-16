
<%@ include file="/html/init.jsp"%>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<%@page pageEncoding="UTF-8"%>
<%
	String reportCode = Validator.isNotNull(renderRequest.getParameter(BaoCaoConstant.MAU_BAO_CAO)) ? renderRequest.getParameter(BaoCaoConstant.MAU_BAO_CAO) : "";
	String tuNgay = Validator.isNotNull(renderRequest.getParameter("tuNgay")) ? renderRequest.getParameter("tuNgay") : "";
	String denNgay = Validator.isNotNull(renderRequest.getParameter("denNgay")) ? renderRequest.getParameter("denNgay") : "";
	String ngayLap = Validator.isNotNull(renderRequest.getParameter("ngayLap")) ? renderRequest.getParameter("ngayLap") : "";
	String maritimeCode = renderRequest.getParameter("maritimeCode");
	String hasData = renderRequest.getParameter("hasData");
%>
<div class="wd-content-container">
	<%@ include file="/html/baocao/menu-left-bao-cao.jsp"%>
	<%@ include file="/html/baocao/tim_kiem_bao_cao.jsp"%>
</div>
<div class="AccordionPanel">
	<div class="AccordionPanelTab">
		<h4>
			Nội dung báo cáo thống kê<img src="<%=request.getContextPath()%>/img/front/next_tle.png">
		</h4>
		<div class="righttle"></div>
	</div>
	<!-- Cai nay chi tiet cho tung ho so o day -->
	<%@ include file="/html/baocao/ket_qua_tim_kiem_bao_cao.jsp"%>
</div>