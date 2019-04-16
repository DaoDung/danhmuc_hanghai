package vn.gt.portlet.baocao.thongke.bc12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.PortletException;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import vn.gt.dao.danhmuc.model.DmHistoryMaritime;
import vn.gt.dao.danhmuc.service.DmHistoryMaritimeLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.portlet.baocao.BaoCaoBussinessUtils;
import vn.gt.portlet.baocao.BaoCaoConstant;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class Bc12Export {
	
	private static Log log = LogFactoryUtil.getLog(Bc12Export.class);
	
	public static Bc12Model getModel(String reportDate, String maritimeCode, String dateFrom, String dateTo) {
		
		Bc12Model result = new Bc12Model();
		
		return result;
	}
	
	public boolean export2Report(String reportDate, String maritimeCode, String dateFrom, String dateTo) throws IOException, PortletException,
			SystemException {
		
		ArrayList<Bc12Model> dataBeanList = getDataReport(reportDate, maritimeCode, dateFrom, dateTo);
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);
		
		Map parameters = new HashMap();
		
		BaoCaoBussinessUtils reportUtils = new BaoCaoBussinessUtils();
		reportUtils.exportFunctionModuleBaoCao(BaoCaoConstant.BAO_CAO_12_XML, BaoCaoConstant.BAO_CAO_12_EXPORT,
				beanColDataSource, parameters);
		
		return true;
	}
	
	public static ArrayList<Bc12Model> getDataReport(String reportDate, String maritimeCode, String dateFrom, String dateTo) {
		ArrayList<Bc12Model> dataBeanList = new ArrayList<Bc12Model>();
		
		dataBeanList.add(getModel(reportDate, maritimeCode, dateFrom, dateTo));
		return dataBeanList;
	}
	
}
