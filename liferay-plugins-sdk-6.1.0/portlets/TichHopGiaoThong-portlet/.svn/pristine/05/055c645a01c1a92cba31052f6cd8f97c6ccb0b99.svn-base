
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

<%
	portletUrl.setParameter("tuNgay", tuNgay);
	portletUrl.setParameter("denNgay", denNgay);

	String transactionKeyword = URLDecoder.decode(ParamUtil.getString(request, "transactionKeyword"), StringPool.UTF8);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, portletUrl, null, null);
	
	List<DichVuCongModel> results = null;
	
	results = ThongKeDvCongBussinessUtils.thongKeHosoDichvuCong(tuNgay, denNgay);

	if (results == null) { 
		results = new ArrayList<DichVuCongModel>(); 
	}
%>
<table class="thongke_table" border="0" cellpadding="0" style="border-collapse: collapse" width="100%">
    <thead>
        <tr>
        	<td class="thongke_tabletext_center"><liferay-ui:message key="vn.dtt.baocao.timkiem.cangvu"/></td>
			<td class="thongke_tabletext_center"><liferay-ui:message key="vn.dtt.baocao.timkiem.linhvuchanghai"/></td>
			<td class="thongke_tabletext_center"><liferay-ui:message key="vn.dtt.baocao.timkiem.soluong"/></td>
        </tr>
    </thead>
    <tbody>
    <%
    	long tongSoHS = 0;
        DichVuCongModel dichVuCongModel = null;
    	HoSoDichVuCongDetail hoSoDichVuCongDetail = null;
        for(int i=0; i< results.size(); i ++){
            dichVuCongModel = results.get(i);
            hoSoDichVuCongDetail = dichVuCongModel.getHoSoDichVuCongDetail();
            tongSoHS = tongSoHS + Long.parseLong(hoSoDichVuCongDetail.getTongSoHoSo());
     %>
         	<tr>
         	  <td class="tencang" rowspan="3"><%=dichVuCongModel.getMaritimeNameVN()%></td>
			  <td><%=hoSoDichVuCongDetail.getNhapCanhName()%></td>
			  <td align="right"><%=hoSoDichVuCongDetail.getSoHSNhapCanh()%></td>
			</tr>
			<tr>
			  <td><%=hoSoDichVuCongDetail.getXuatCanhName() %></td>
			  <td align="right"><%=hoSoDichVuCongDetail.getSoHSXuatCanh()%></td>
			</tr>
			<tr>
			  <td><%=hoSoDichVuCongDetail.getQuaCanhName() %></td>
			  <td align="right"><%=hoSoDichVuCongDetail.getSoHSQuaCanh()%></td>
			</tr>
			<tr>
			  <td><b><liferay-ui:message key="vn.dtt.baocao.thongke.tongtheodonvi"/></b></td>
			  <td></td>
			  <td align="right"><%=hoSoDichVuCongDetail.getTongSoHoSo()%></td>
			</tr>
        <%
            }
         %> 
         	<tr>
			  <td><b><liferay-ui:message key="vn.dtt.baocao.thongke.tonghoso"/></b></td>
			  <td></td>
			  <td align="right"><%=tongSoHS%></td>
			</tr>
    </tbody>
</table>  