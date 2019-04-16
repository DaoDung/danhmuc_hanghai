package vn.gt.tichhop.report.ShipStoresDeclaration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration;
import vn.gt.dao.noticeandmessage.model.TempShipStoresItems;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempShipStoresItemsLocalServiceUtil;
import vn.gt.tichhop.report.ReportConstant;
import vn.gt.tichhop.report.ReportFunction;
import vn.gt.tichhop.report.ReportsBusinessUtils;


public class Export2ShipStoresDeclaration {
	
	private static Log log = LogFactoryUtil.getLog(Export2ShipStoresDeclaration.class);
	
	public long exportShipStoresDeclaration(String requestCode, int documentName, int documentYear, String loaiThuTuc) throws IOException, PortletException, SystemException {
		long exportFunction = 0;
		
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
		
		ArrayList<ShipStoresDeclarationModel> dataBeanList = getDataReport(requestCode, documentName, documentYear);
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);
		
		Map parameters = new HashMap();
		ReportsBusinessUtils reportUtils = new ReportsBusinessUtils();
		
		if (tempDocument.getUpgradeVersion() == 1) {

			
			exportFunction = reportUtils.exportFunctionUpgrade(ReportConstant.SHIP_STORES_DECLARATION_TEMP, ReportConstant.SHIP_STORES_DECLARATION_EXPORT, beanColDataSource, parameters);
		} else {

			exportFunction = reportUtils.exportFunction(ReportConstant.SHIP_STORES_DECLARATION_TEMP, ReportConstant.SHIP_STORES_DECLARATION_EXPORT, beanColDataSource, parameters);
			
		}

		return exportFunction;
		
	}
	
	public static ArrayList<ShipStoresDeclarationModel> getDataReport(String requestCode, int documentName, int documentYear) {
		ArrayList<ShipStoresDeclarationModel> dataBeanList = new ArrayList<ShipStoresDeclarationModel>();
		dataBeanList.add(getModel(requestCode, documentName, documentYear));
		return dataBeanList;
	}
	
	public static ShipStoresDeclarationModel getModel(String requestCode, int documentName, int documentYear) {
		
		ShipStoresDeclarationModel model = new ShipStoresDeclarationModel();
		
		List<TempShipStoresDeclaration> tempShips = null;
		
		try {
			if (requestCode != null && requestCode.trim().length() > 0 ) {
				tempShips = TempShipStoresDeclarationLocalServiceUtil.findByRequestCode(requestCode);
			} else {
				tempShips = TempShipStoresDeclarationLocalServiceUtil.findBydocumentNameAnddocumentYear(documentName, documentYear);
			}
		} catch (Exception e) {
			log.error(e);
		}
		
		List<TempShipStoresItems> storesItems = null;
		try {
			if (requestCode != null && requestCode.trim().length() > 0) {
				storesItems = TempShipStoresItemsLocalServiceUtil.findTempShipStoresItemsByRequestCode(requestCode);
			} else {
				storesItems = new ArrayList<TempShipStoresItems>();
			}
		} catch (Exception e) {
			log.error(e);
		}
		
		String signDate = null;
		String signPlace = null;
		
		if (Validator.isNotNull(tempShips) && tempShips.size() > 0) {
			TempShipStoresDeclaration temp = tempShips.get(0);
			if (Validator.isNotNull(temp.getSignDate())) {
				signDate = ReportFunction.parserDateToString4(temp.getSignDate());
			}
			if (Validator.isNotNull(temp.getSignPlace())) {
				signPlace = temp.getSignPlace();
			}
		}
		model.setSignDate(signDate);
		model.setSignPlace(signPlace);
		
		model.setTempShipStoresDeclarationes(tempShips);
		model.setTempShipStoresItems(storesItems);
		
		TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
		
		model.setDocumentTypeCode(tempDocument.getDocumentTypeCode());
		
		return model;
	}
}
