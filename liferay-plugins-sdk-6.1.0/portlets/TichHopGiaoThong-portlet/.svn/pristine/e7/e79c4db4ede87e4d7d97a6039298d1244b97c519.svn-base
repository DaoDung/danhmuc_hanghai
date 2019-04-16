<%@page import="com.liferay.portal.kernel.servlet.URLEncoder"%>
<%@page import="vn.gt.portlet.baocaotichhop.thongke.dvcong.FlowChartDataByDate"%>
<%@page import="vn.gt.portlet.baocaotichhop.thongke.dvcong.DichVuCongFlowChart"%>
<%@page import="vn.gt.portlet.baocaotichhop.thongke.dvcong.HoSoDichVuCongDetail"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.gt.portlet.baocaotichhop.ThongKeDvCongBussinessUtils"%>
<%@page import="vn.gt.portlet.baocaotichhop.thongke.dvcong.DichVuCongModel"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page pageEncoding="UTF-8"%>

<%@include file="/html/baocaotichhop/initThongKe.jsp"%>

<%

	String selectMonth = null;
	String tuNgayChart = null;
	String denNgayChart = null;


	if(isSelectMonthCombo.trim().equalsIgnoreCase("1")){
		selectMonth=ParamUtil.getString(request, "selectMonth");
		tuNgayChart = Validator.isNotNull(renderRequest.getParameter("tuNgayChart")) ? renderRequest.getParameter("tuNgayChart") : tuNgay;
		denNgayChart = Validator.isNotNull(renderRequest.getParameter("denNgayChart")) ? renderRequest.getParameter("denNgayChart") : ThongKeDvCongBussinessUtils.getEndDateOfAppointMonth(tuNgay);
	} else if (isSelectMonthCombo.trim().equalsIgnoreCase("0")){
		selectMonth = tuNgay.substring(3, 10);
		tuNgayChart = ThongKeDvCongBussinessUtils.getStartDateOfAppointMonth(tuNgay);
		denNgayChart = ThongKeDvCongBussinessUtils.getEndDateOfAppointMonth(tuNgay);
				
	}
		
	List<String> allMonth = ThongKeDvCongBussinessUtils.getAllMonthOfCurrentYear();
	List<DichVuCongFlowChart> allDichVuCongFlowChart = null;
	List<FlowChartDataByDate> allNhapCanhChart = null;
	List<FlowChartDataByDate> allXuatCanhChart = null;
	List<FlowChartDataByDate> allQuaCanhChart = null;
	FlowChartDataByDate flowChartDataByDate = null;
	
	DichVuCongFlowChart dichVuCongFlowChart = null;
	
	allDichVuCongFlowChart = ThongKeDvCongBussinessUtils.getDataForFlowChart(tuNgayChart, denNgayChart);
		
	if (allDichVuCongFlowChart == null) { 
		allDichVuCongFlowChart = new ArrayList<DichVuCongFlowChart>(); 
	}
	
	int ngayCuoiThang = Integer.parseInt(denNgayChart.substring(0,2));
	
//	if(isTimKiem.equalsIgnoreCase("true")){
//		ngayCuoiThang = Long.valueOf(abc.substring(0, 2));
//	}else{
//		ngayCuoiThang = 31;
//	}
%>

<style>
	.jqplot-table-legend-swatch { width: 5%;}
	.rowCau01 { height: 100px; vertical-align: middle; width: 100%; border-radius: 4px 4px 4px 4px; }
	.jqplot-point-label { font-size: 1.1em; z-index: 2; }
	.jqplot-axis { font-size: 1.1em; }
	td.jqplot-table-legend-label { font-size: 1.3em; }
</style>
<script type="text/javascript">
	$(document).ready(function() {
		<%
		if(allDichVuCongFlowChart.size() > 0){
			for(int i=0; i< allDichVuCongFlowChart.size(); i++){
				dichVuCongFlowChart = allDichVuCongFlowChart.get(i);
				allNhapCanhChart = dichVuCongFlowChart.getListHoSoNhapCanh();
				allXuatCanhChart = dichVuCongFlowChart.getListHoSoXuatCanh();
				allQuaCanhChart = dichVuCongFlowChart.getListHoSoQuaCanh();
		%>
		
				var column = [];
				<%
					if (Validator.isNotNull(allNhapCanhChart) && allNhapCanhChart.size() >= 1) {
						for(int j=1; j <= ngayCuoiThang; j++){
				%>	
							column[<%=j%>] = <%=0%>;
				<%
						}
						for(int j=0; j < allNhapCanhChart.size(); j++){
							flowChartDataByDate = allNhapCanhChart.get(j);
				%>	
							column[<%=Long.valueOf(flowChartDataByDate.getChartDate())%>] = <%=flowChartDataByDate.getDocumentNumber()%>;
				<%
						}
				%>
				$.jqplot('chart_'+ <%=i%> + '_01',[[
					     <%
					     	for(int j=1; j <= ngayCuoiThang; j++){
					     		if(j < ngayCuoiThang){
					     %>
					     			[<%=j%>,column[<%=j%>]], 
					     <%			
					     		}else{
					     %>
					     			[<%=j%>,column[<%=j%>]]
					     <%			
					     		}
					     	}
					     %>
					         			           ]], {
				    title: 'Bi\u1EC3u \u0111\u1ED3 s\u1ED1 l\u01B0\u1EE3ng h\u1ED3 s\u01A1 t\u00E0u nh\u1EADp c\u1EA3nh trong th\u00E1ng',
				    series:[{renderer:$.jqplot.BarRenderer}],
				    axesDefaults: {
				        tickRenderer: $.jqplot.CanvasAxisTickRenderer,
				        tickOptions: {
				          angle: 0
				        }
				    },
				    axes: {
				      xaxis: {
				        renderer: $.jqplot.CategoryAxisRenderer,
				        tickOptions: {
				          labelPosition: 'middle'
				        }
				      },
				      yaxis: {
				        autoscale:true,
				        tickRenderer: $.jqplot.CanvasAxisTickRenderer,
				        tickOptions: {
				          labelPosition: 'start'
				        }
				      }
				    }
				  });
				<%	} else { %>
						$( "#parent_chart_" + <%=i%> + "_01_label" ).hide();
						$( "#parent_chart_" + <%=i%> + "_01" ).hide();
				<%	} %>
				
				<%
				if (Validator.isNotNull(allXuatCanhChart) && allXuatCanhChart.size() >= 1) {
					for(int j=1; j <= ngayCuoiThang; j++){
				%>	
							column[<%=j%>] = <%=0%>;
				<%
					}
					for(int j=0; j < allXuatCanhChart.size(); j++){
						flowChartDataByDate = allXuatCanhChart.get(j);
				%>	
						column[<%=Long.valueOf(flowChartDataByDate.getChartDate())%>] = <%=flowChartDataByDate.getDocumentNumber()%>;
				<%
					}
				%>
				$.jqplot('chart_'+ <%=i%> + '_02', [[
				        <%
					     	for(int j=1; j <= ngayCuoiThang; j++){
					     		if(j < ngayCuoiThang){
					     %>
					     			[<%=j%>,column[<%=j%>]], 
					     <%			
					     		}else{
					     %>
					     			[<%=j%>,column[<%=j%>]]
					     <%			
					     		}
					     	}
					     %>
				    								]], {
				    title: 'Bi\u1EC3u \u0111\u1ED3 s\u1ED1 l\u01B0\u1EE3ng h\u1ED3 s\u01A1 t\u00E0u xu\u1EA5t c\u1EA3nh trong th\u00E1ng',
				    series:[{renderer:$.jqplot.BarRenderer}],
				    axesDefaults: {
				        tickRenderer: $.jqplot.CanvasAxisTickRenderer,
				        tickOptions: {
				          angle: 0
				        }
				    },
				    axes: {
				      xaxis: {
				        renderer: $.jqplot.CategoryAxisRenderer,
				        tickOptions: {
				          labelPosition: 'middle'
				        }
				      },
				      yaxis: {
				        autoscale:true,
				        tickRenderer: $.jqplot.CanvasAxisTickRenderer,
				        tickOptions: {
				          labelPosition: 'start'
				        }
				      }
				    }
				  });
				<%	} else { %>
						$( "#parent_chart_" + <%=i%> + "_02_label" ).hide();
						$( "#parent_chart_" + <%=i%> + "_02" ).hide();
				<%	} %>

				<%
				if (Validator.isNotNull(allQuaCanhChart) && allQuaCanhChart.size() >= 1) {
					for(int j=1; j <= ngayCuoiThang; j++){
				%>	
							column[<%=j%>] = <%=0%>;
				<%
					}
					for(int j=0; j < allQuaCanhChart.size(); j++){
						flowChartDataByDate = allQuaCanhChart.get(j);
				%>	
						column[<%=Long.valueOf(flowChartDataByDate.getChartDate())%>] = <%=flowChartDataByDate.getDocumentNumber()%>;
				<%
					}
				%>
				$.jqplot('chart_'+ <%=i%> + '_03', [[
				        <%
				        	for(int j=1; j <= ngayCuoiThang; j++){
				        		if(j < ngayCuoiThang){
				        %>
				        			[<%=j%>,column[<%=j%>]], 
				        <%			
				        		}else{
				        %>
				        			[<%=j%>,column[<%=j%>]]
				        <%			
				        		}
				        	}
				        %>
				        				    			]], {
				    title: 'Bi\u1EC3u \u0111\u1ED3 s\u1ED1 l\u01B0\u1EE3ng h\u1ED3 s\u01A1 t\u00E0u qu\u00E1 c\u1EA3nh trong th\u00E1ng',
				    series:[{renderer:$.jqplot.BarRenderer}],
				    axesDefaults: {
				        tickRenderer: $.jqplot.CanvasAxisTickRenderer,
				        tickOptions: {
				          angle: 0
				        }
				    },
				    axes: {
				      xaxis: {
				        renderer: $.jqplot.CategoryAxisRenderer,
				        tickOptions: {
				          labelPosition: 'middle'
				        }
				      },
				      yaxis: {
				        autoscale:true,
				        tickRenderer: $.jqplot.CanvasAxisTickRenderer,
				        tickOptions: {
				          labelPosition: 'start'
				        }
				      }
				    }
				  });
				<%	} else { %>
						$( "#parent_chart_" + <%=i%> + "_03_label" ).hide();
						$( "#parent_chart_" + <%=i%> + "_03" ).hide();
				<%	} %>

				
	<%
			}
		}
	%>

	});
</script>
 <portlet:actionURL var="findHoSoChartByMonth" name="findHoSoChartByMonth"/>
	<h1 class="tlemenu"><liferay-ui:message key="vn.dtt.baocao.thongke.bieudotheothoigian"/></h1>
	<form action="<%=findHoSoChartByMonth %>" method="post" name="myForm" id="myForm">

		<input type="hidden" name="tuNgaySearch" id="tuNgaySearch" value=<%=tuNgay%>>
		<input type="hidden" name="tuHourSearch" id="tuHourSearch" value=<%=tuNgay.substring(11, tuNgay.length())%>>
		<input type="hidden" name="denNgaySearch" id="denNgaySearch" value=<%=denNgay%>>
		<input type="hidden" name="denHourSearch" id="denHourSearch" value=<%=denNgay.substring(11, denNgay.length())%>>
												
		<table class="tblenone" border="0" cellpadding="0" style="border-collapse: collapse" width="100%">
			<tr>
				<td><liferay-ui:message key="vn.dtt.baocao.thongke.hienthitheothang"/></td>
				<td class="text-leftu">
					<select name="chonthang" id="chonthang" onchange="changedata('<%=findHoSoChartByMonth %>');">
						<%if (Validator.isNull(selectMonth)) {%>
								<option selected value="" style="width: 100%">---- Lựa chọn ------</option>
						<%} else {%>
								<option value="" style="width: 100%">---- Lựa chọn ------</option>
						<%}%>
						<% for (String item : allMonth) { %>
							<option
								<%=item.trim().equals(selectMonth) ? "selected" : "" %> <%=item.trim().equals(selectMonth) ? "selected" : "" %>
								value="<%=item.trim()%>"><%=item%>
							</option>
						<% } %>
					</select>
					</td>
				
			</tr>
		</table>
	</form>
 <%
 if(allDichVuCongFlowChart.size()>0){
	 String idParentName = null;
	 String idDivName = null;
	 for(int i=0; i< allDichVuCongFlowChart.size(); i++){
		 dichVuCongFlowChart = allDichVuCongFlowChart.get(i);
		 allNhapCanhChart = dichVuCongFlowChart.getListHoSoNhapCanh();
		 allXuatCanhChart = dichVuCongFlowChart.getListHoSoXuatCanh();
		 allQuaCanhChart = dichVuCongFlowChart.getListHoSoQuaCanh();
		 
%>
	<p class="tble_bgtle"></p>
        <table class="tblenone" border="0" cellpadding="0" style="border-collapse: collapse" width="100%">
 			<tbody>
 <%		
 		if((allNhapCanhChart != null) && (allNhapCanhChart.size()>0)){
 			idDivName = "chart_" + i + "_01";
 			idParentName = "parent_chart_" + i + "_01";
 %>
				<tr>
					<td align="center" width="100%">
						<div id="<%=idParentName %>" style="float: center; text-align: center; width: 85%;">
							<div id="<%=idDivName %>" style="width: 98%; position: relative;" class="jqplot-target"></div>
						</div>
					</td>
				</tr>
<%		
		}
 		if((allXuatCanhChart != null) && (allXuatCanhChart.size()>0)){
 			idDivName = "chart_" + i + "_02";
 			idParentName = "parent_chart_" + i + "_02";
 %>
				<tr>
					<td align="center" width="100%">
						<div id="<%=idParentName %>" style="float: center; text-align: center; width: 85%;">
							<div id="<%=idDivName %>" style="width: 98%; position: relative;" class="jqplot-target"></div>
						</div>
					</td>
				</tr>	
				
<%		
		}
 		if((allQuaCanhChart != null) && (allQuaCanhChart.size()>0)){
 			idDivName = "chart_" + i + "_03";
 			idParentName = "parent_chart_" + i + "_03";
 %>
				<tr>
					<td align="center" width="100%">
						<div id="<%=idParentName %>" style="float: center; text-align: center; width: 85%;">
							<div id="<%=idDivName %>" style="width: 98%; position: relative;" class="jqplot-target"></div>
						</div>
					</td>
				</tr>	
<%	
 		}
%>				
			</tbody>
		</table>
 
<%
	 }
 }
 %>
 

<script>
var url = '<%=findHoSoChartByMonth.toString()%>';
function changedata(url){
	document.getElementById("myForm").action=url;
	document.getElementById("myForm").submit();
	
}
</script>