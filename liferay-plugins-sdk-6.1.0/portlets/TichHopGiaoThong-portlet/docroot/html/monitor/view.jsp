<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.dao.gt.asw.service.AswmsgMessageQueueLocalServiceUtil"%>
<%@page import="vn.dao.gt.asw.model.AswmsgMessageQueue"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
List<AswmsgMessageQueue> lstMonitorMessageQueues = AswmsgMessageQueueLocalServiceUtil.getListMessageQueuePending(MessageType.REQUEST_DIRECTION_OUT_CVHH);

	
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<table class="wd-table table">
			<caption style = "font-size: 13px;color:black;"><b>Quản lý Monitor Message</b></caption>
			<thead>
				<tr>
					<th style="width: 8%;">STT</th>
					<th style="width: 13.6667%;">Mã số hồ sơ</th>
					<th>Mã cơ quan gửi</th>
					<th style="width: 13.6667%;">Người nhận</th>
					<th>Ngày gửi đầu</th>
					<th>Ngày gửi gần nhất</th>
					<th style="">Type</th>
					<th style="width: 10%;">Function</th>
					<th style="width: 8%;">Độ ưu tiên</th>
					<th style="width: 8%;">Số lần gửi</th>
					<th style="width: 7%;">Thao tác</th>
				</tr>
			</thead>
			<tbody>
				<%
				int index = 1;
				for (AswmsgMessageQueue item : lstMonitorMessageQueues) {
					
					PortletURL urlPortlet =  renderResponse.createActionURL();
					urlPortlet.setParameter(ActionRequest.ACTION_NAME, "refeshMonitor");
					urlPortlet.setParameter("id", String.valueOf(item.getId()));
					urlPortlet.setParameter("redirectURL", currentURL);
				%>
				<tr>
					<td class="text-center"><%=index++ %></td>
					<td class="text-center"><%=item.getPreReference()%></td>
					<td class="text-center"><%=item.getSenderMinistryCode()%></td>
					<td class="text-center"><%=item.getReceiverName()%></td>
					<td class="text-center"><%=FormatData.parseDateToTring(item.getSendDate())%></td>
					<td class="text-center"><%=FormatData.parseDateToTring(item.getCreatedTime())%></td>
					<td class="text-center"><%=item.getType()%></td>
					<td class="text-center"><%=item.getFunction()%></td>
					<td class="text-center"><%=item.getPriority()%></td>
					<td class="text-center"><%=item.getSoLanGui()%></td>
					<td class="text-center">
						<a href="<%=urlPortlet.toString() %>" class="aicon" title="Gửi lại"><i class="icon20 iconm5 fa fa-pencil"></i></a>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</div>