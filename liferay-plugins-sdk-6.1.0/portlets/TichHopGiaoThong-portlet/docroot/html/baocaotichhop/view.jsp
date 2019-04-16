<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>

<%@ include file="/html/init.jsp"%>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.1.js"></script>
<%@page pageEncoding="UTF-8"%>

<head>
	<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script>
	<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath()%>/html/baocaotichhop/design/css/common.css" />
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>

<%
		PortletURL portletUrl = renderResponse.createRenderURL();
		String tuNgay = null;
		String denNgay = null;

		String isSelectMonthCombo = Validator.isNotNull(renderRequest.getParameter("isSelectMonthCombo")) ? renderRequest.getParameter("isSelectMonthCombo") : "0";
		
		if(isSelectMonthCombo.trim().equalsIgnoreCase("1")){
			tuNgay = Validator.isNotNull(renderRequest.getParameter("tuNgaySearch")) ? renderRequest.getParameter("tuNgaySearch") : "";
			denNgay = Validator.isNotNull(renderRequest.getParameter("denNgaySearch")) ? renderRequest.getParameter("denNgaySearch") : "";
		}else if(isSelectMonthCombo.trim().equalsIgnoreCase("0")){
			tuNgay = Validator.isNotNull(renderRequest.getParameter("tuNgay")) ? renderRequest.getParameter("tuNgay") : "";
			denNgay = Validator.isNotNull(renderRequest.getParameter("denNgay")) ? renderRequest.getParameter("denNgay") : "";
			if((tuNgay.length() == 0) && (denNgay.length() == 0)){
				String currentDate = ThongKeDvCongBussinessUtils.getCurrentDate();
				int dateInCurrentMonth = Integer.valueOf(currentDate.substring(0,2));
				if(dateInCurrentMonth < 5){
					denNgay = currentDate;
					tuNgay = ThongKeDvCongBussinessUtils.getStartDateOfPreviousMonth();
				} else{
					denNgay = currentDate;
					tuNgay = ThongKeDvCongBussinessUtils.getStartDateOfCurrentMonth();
				}
				
			}
		}
		
//		String isTimKiem = Validator.isNotNull(renderRequest.getParameter("isTimKiem")) ? renderRequest.getParameter("isTimKiem").trim() : "true";
%>

			<div class="thongke">
			   <%@ include file="/html/baocaotichhop/tim_kiem_ho_so_dvcong.jsp"%>
			   <%@ include file="/html/baocaotichhop/ket_qua_tim_kiem_ho_so_dvcong.jsp"%>
			   <%@ include file="/html/baocaotichhop/bieu_do_ho_so_dvcong.jsp"%>
			</div>

</div>
