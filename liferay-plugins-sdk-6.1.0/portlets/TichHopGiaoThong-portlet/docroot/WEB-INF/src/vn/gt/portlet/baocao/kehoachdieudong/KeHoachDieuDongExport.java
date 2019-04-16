package vn.gt.portlet.baocao.kehoachdieudong;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletException;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil;
import vn.gt.dao.result.model.ResultDeclaration;
import vn.gt.dao.result.service.ResultDeclarationLocalServiceUtil;
import vn.gt.portlet.baocao.BaoCaoBussinessUtils;
import vn.gt.portlet.baocao.BaoCaoConstant;
import vn.gt.utils.GetNameFunction;

import com.liferay.portal.kernel.exception.SystemException;

public class KeHoachDieuDongExport {
	
	public static KeHoachDieuDongModel getModel(int reportCode, String maritimeCode, String ngayLap, String dateFrom, String dateTo) {
		
		KeHoachDieuDongModel result = new KeHoachDieuDongModel();
		
		List<TempNoTiceShipMessage> allNoticeShipMessagesArival = null;
		List<TempNoTiceShipMessage> allNoticeShipMessagesLeave = null;
		
		TempNoTiceShipMessage tempNoTiceShipMessage = null;
		List<TempDocument> allTmpDoc = null;
		List<ResultDeclaration> allResultDeclaration = null;
		
		String maritimeName = null;
		TempDocument tempDocument = null;
		ResultDeclaration resultDeclaration = null;
		String createDate = null;
		String createTime = null;
		boolean hasData = false;
		
		// Chuan bi du lieu tau den
		
		try {
			if (maritimeCode != null && maritimeCode.trim().length() > 0) {
				
				maritimeName = GetNameFunction.getMaritimeName(maritimeCode);
				result.setMaritimeName(maritimeName);
				
				allTmpDoc = TempDocumentLocalServiceUtil.findTempDocumentArivalByMaritimeCodeAndDateFromAndDateTo(maritimeCode, dateFrom, dateTo,
						"'NC', 'QC'", "16", "10");
				
				if ((allTmpDoc != null) && (allTmpDoc.size() > 0)) {
					for (int i = 0; i < allTmpDoc.size(); i++) {
						tempDocument = allTmpDoc.get(i);
						allResultDeclaration = ResultDeclarationLocalServiceUtil.findResultDeclarationByDocumentNameAndDocumentYearNcQcReport(
								tempDocument.getDocumentName(), tempDocument.getDocumentYear());
						if ((allResultDeclaration != null) && (allResultDeclaration.size() > 0)) {
							for (int j = 0; j < allResultDeclaration.size(); j++) {
								resultDeclaration = allResultDeclaration.get(j);
								tempNoTiceShipMessage = TempNoTiceShipMessageLocalServiceUtil
										.findTempNoTiceShipMessageXbByRequestCode(resultDeclaration.getRequestCode());
								if (tempNoTiceShipMessage != null) {
									if (allNoticeShipMessagesArival == null) {
										allNoticeShipMessagesArival = new ArrayList<TempNoTiceShipMessage>();
									}
									allNoticeShipMessagesArival.add(tempNoTiceShipMessage);
								}
							}
						}
						
					}
					
				}
				
				// Chuan bi du lieu tau di
				
				allTmpDoc = TempDocumentLocalServiceUtil.findTempDocumentLeaveByMaritimeCodeAndDateFromAndDateTo(maritimeCode, dateFrom, dateTo,
						"'XC'", "16", "10");
				if ((allTmpDoc != null) && (allTmpDoc.size() > 0)) {
					for (int i = 0; i < allTmpDoc.size(); i++) {
						tempDocument = allTmpDoc.get(i);
						allResultDeclaration = ResultDeclarationLocalServiceUtil.findResultDeclarationByDocumentNameAndDocumentYearXcReport(
								tempDocument.getDocumentName(), tempDocument.getDocumentYear());
						if ((allResultDeclaration != null) && (allResultDeclaration.size() > 0)) {
							for (int j = 0; j < allResultDeclaration.size(); j++) {
								resultDeclaration = allResultDeclaration.get(j);
								tempNoTiceShipMessage = TempNoTiceShipMessageLocalServiceUtil
										.findTempNoTiceShipMessageTbByRequestCode(resultDeclaration.getRequestCode());
								if (tempNoTiceShipMessage != null) {
									if (allNoticeShipMessagesLeave == null) {
										allNoticeShipMessagesLeave = new ArrayList<TempNoTiceShipMessage>();
									}
									allNoticeShipMessagesLeave.add(tempNoTiceShipMessage);
								}
							}
						}
						
					}
					
				}
				if ((allNoticeShipMessagesArival != null && allNoticeShipMessagesArival.size() >= 0)
						|| (allNoticeShipMessagesLeave != null && allNoticeShipMessagesLeave.size() >= 0)) {
					hasData = true;
				}
			}
			
			createDate = ngayLap.substring(0, 10);
//			createTime = ngayLap.substring(11, 13) + "h" + ngayLap.substring(14);
			createTime = "00h00";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		result.setAllNoticeShipMessagesArival(allNoticeShipMessagesArival);
		result.setAllNoticeShipMessagesLeave(allNoticeShipMessagesLeave);
		result.setCreateDate(createDate);
		result.setCreateTime(createTime);
		result.setReportCode(reportCode);
		result.setHasData(hasData);
		
		return result;
	}
	
	public boolean export2Report(int reportCode, String maritimeCode, String ngayLap, String dateFrom, String dateTo) throws IOException,
			PortletException, SystemException {
		boolean result = false;
		
		ArrayList<KeHoachDieuDongModel> dataBeanList = getDataReport(reportCode, maritimeCode, ngayLap, dateFrom, dateTo);
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);
		if ((dataBeanList != null) && (dataBeanList.size() > 0)) {
			KeHoachDieuDongModel keHoachDieuDongModel = dataBeanList.get(0);
			result = keHoachDieuDongModel.getHasData();
		}
		
		Map parameters = new HashMap();
		BaoCaoBussinessUtils reportUtils = new BaoCaoBussinessUtils();
		reportUtils.exportFunctionModuleBaoCao(BaoCaoConstant.KE_HOACH_DIEU_DONG_XML, BaoCaoConstant.KE_HOACH_DIEU_DONG_EXPORT, beanColDataSource, parameters);
		return result;
	}
	
	public void export2Report_bk(int reportCode, String maritimeCode, String ngayLap, String dateFrom, String dateTo) throws IOException,
			PortletException, SystemException {
		boolean result = false;
		
		ArrayList<KeHoachDieuDongModel> dataBeanList = getDataReport(reportCode, maritimeCode, ngayLap, dateFrom, dateTo);
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataBeanList);
		if ((dataBeanList != null) && (dataBeanList.size() > 0)) {
			KeHoachDieuDongModel keHoachDieuDongModel = dataBeanList.get(0);
			result = keHoachDieuDongModel.getHasData();
		}
		
		Map parameters = new HashMap();
		BaoCaoBussinessUtils reportUtils = new BaoCaoBussinessUtils();
		reportUtils.exportFunction(BaoCaoConstant.KE_HOACH_DIEU_DONG_XML, BaoCaoConstant.KE_HOACH_DIEU_DONG_EXPORT, beanColDataSource, parameters);
	}
	
	public static ArrayList<KeHoachDieuDongModel> getDataReport(int mauBaoCao, String maritimeCode, String ngayLap, String dateFrom, String dateTo) {
		ArrayList<KeHoachDieuDongModel> dataBeanList = new ArrayList<KeHoachDieuDongModel>();
		
		dataBeanList.add(getModel(mauBaoCao, maritimeCode, ngayLap, dateFrom, dateTo));
		return dataBeanList;
	}
	
}
