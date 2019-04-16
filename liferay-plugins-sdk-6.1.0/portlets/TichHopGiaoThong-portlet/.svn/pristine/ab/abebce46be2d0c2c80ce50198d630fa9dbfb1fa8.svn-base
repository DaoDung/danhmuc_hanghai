package vn.gt.portlet.baocaotichhop;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BaoCaoTichHopAction
 */
public class BaoCaoTichHopAction extends MVCPortlet {
	
	public void searchHoSoDichVuHanhChinhCongMotCua(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
		
		String tuNgay = ParamUtil.getString(resourceRequest, "tuNgay");
		String denNgay = ParamUtil.getString(resourceRequest, "denNgay");
		
		httpReq.setRenderParameter("tuNgay", tuNgay);
		httpReq.setRenderParameter("denNgay", denNgay);
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void findHoSoChartByMonth(ActionRequest resourceRequest, ActionResponse httpReq) throws NumberFormatException, Exception {
		
		String selectedMonth = ParamUtil.getString(resourceRequest, "chonthang");
		String tuNgaySearch = ParamUtil.getString(resourceRequest, "tuNgaySearch");
		String denNgaySearch = ParamUtil.getString(resourceRequest, "denNgaySearch");
		String tuHourSearch = ParamUtil.getString(resourceRequest, "tuHourSearch");
		String denHourSearch = ParamUtil.getString(resourceRequest, "denHourSearch");
		
		tuNgaySearch = tuNgaySearch.trim() + " " + tuHourSearch;
		denNgaySearch = denNgaySearch.trim() + " " + denHourSearch;
		
		String tuNgayChart = null;
		String denNgayChart = null;
		
		if ((selectedMonth == null) || (selectedMonth.length() == 0)) {
			selectedMonth = tuNgaySearch.substring(3, 10);
		}
		
		tuNgayChart = ThongKeDvCongBussinessUtils.getStartDateOfMonth(selectedMonth);
		denNgayChart = ThongKeDvCongBussinessUtils.getEndDateOfMonth(selectedMonth);
		
		httpReq.setRenderParameter("tuNgaySearch", tuNgaySearch);
		httpReq.setRenderParameter("denNgaySearch", denNgaySearch);
		
		httpReq.setRenderParameter("tuNgayChart", tuNgayChart);
		httpReq.setRenderParameter("denNgayChart", denNgayChart);
		
		httpReq.setRenderParameter("selectMonth", selectedMonth);
		httpReq.setRenderParameter("isSelectMonthCombo", "1");
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
