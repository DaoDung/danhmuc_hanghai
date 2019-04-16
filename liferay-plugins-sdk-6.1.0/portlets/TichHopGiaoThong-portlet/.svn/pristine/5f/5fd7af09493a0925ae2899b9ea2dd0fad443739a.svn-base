package vn.gt.portlet.baocao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.portlet.PortletException;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import vn.gt.portlet.baocao.kehoachdieudong.KeHoachDieuDongExport;
import vn.gt.portlet.baocao.thongke.bc12.Bc12Export;
import vn.gt.portlet.baocao.thongke.dvcong.CoCheMotCuaQuocGiaExport;
import vn.gt.portlet.baocao.thongke.dvcong.CoCheMotCuaQuocGiaNangCapExport;
import vn.gt.portlet.baocao.thongke.dvcong.DichVuCongExport;
import vn.gt.portlet.baocao.thongke.dvcong.HoanThanhThuTucMotCuaQuocGiaExport;
import vn.gt.portlet.baocao.thongke.dvcongtheophongban.DVCongTheoPhongBanExport;
import vn.gt.portlet.baocao.thongke.tinhhinhnophs.TinhHinhNopHoSoExport;
import vn.gt.portlet.baocao.thongtintau.kiemtrathongtintau.KiemTraThongTinTauExport;
import vn.gt.portlet.baocao.thongtintau.phanhoicuacqcn.PhanHoiCuaCqcnExport;
import vn.gt.portlet.baocao.tinhhinhdukienneodau.TinhHinhDuKienNeoDauExport;

public class BaoCaoBussinessUtils {
	
	private Log log = LogFactoryUtil.getLog(BaoCaoBussinessUtils.class);
	
//	private String pathFileTemp = "/opt/liferay/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/report/baocao/";
//	private String pathFileSub = "/opt/liferay/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/export/";
//	private String pathFileTemp = "/opt/dvc_hanghai/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/report/baocao/";
//	private String pathFileSub = "/opt/dvc_hanghai/jboss-7.0.2/standalone/deployments/TichHopGiaoThong-portlet.war/export/";
	private String realPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();
	private String pathFileTemp = realPath.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF"))
			.replaceFirst(":", "") + "/report/baocao/";
	private String pathFileSub = realPath.substring(realPath.lastIndexOf(":"), realPath.lastIndexOf("/WEB-INF"))
			.replaceFirst(":", "") + "/export/";
	/*
	 * Function Export to Server
	 */
	
	public boolean actionBaoCaoThongKeExport(int reportCode, String maritimeCode, String ngayLap, String dateFrom, String dateTo) throws Exception {
		
		boolean result = true;
		
		if (reportCode == BaoCaoConstant.BAO_CAO_KE_HOACH_DIEU_DONG) {
			log.info("********* Vao KeHoachDieuDongExport ********* ");
			KeHoachDieuDongExport action = new KeHoachDieuDongExport();
			result = action.export2Report(reportCode, maritimeCode, ngayLap, dateFrom, dateTo);
		} else if (reportCode == BaoCaoConstant.THONG_BAO_TINH_HINH_TAU_THUYEN_DU_KIEN_NEO_DAU_TAI_CANG) {
			log.info("********* Vao TinhHinhDuKienNeoDauExport ********* ");
			TinhHinhDuKienNeoDauExport action = new TinhHinhDuKienNeoDauExport();
			result = action.export2Report(reportCode, maritimeCode, ngayLap, dateFrom, dateTo);
		} else if (reportCode == BaoCaoConstant.BAO_CAO_THONG_KE_TINH_HINH_NOP_HO_SO) {
			log.info("********* Vao TinhHinhNopHoSoExport ********* ");
			TinhHinhNopHoSoExport action = new TinhHinhNopHoSoExport();
			result = action.export2Report(ngayLap, maritimeCode, dateFrom, dateTo);
		} else if (reportCode == BaoCaoConstant.BAO_CAO_THONG_KE_HO_SO_THEO_PHONG_BAN) {
			log.info("********* Vao DVCongTheoPhongBanExport ********* ");
			DVCongTheoPhongBanExport action = new DVCongTheoPhongBanExport();
			result = action.export2Report(ngayLap, maritimeCode, dateFrom, dateTo);
		} else if (reportCode == BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG) {
			log.info("********* Vao DichVuCongExport ********* ");
			DichVuCongExport action = new DichVuCongExport();
			result = action.export2Report(ngayLap, maritimeCode, dateFrom, dateTo);
		} 
		else if (reportCode == BaoCaoConstant.BAO_CAO_KET_QUA_THUC_HIEN_CO_CHE_MOT_CUA_QUOC_GIA) {
	      log.debug("********* Vao CoCheMotCuaQuocGiaNangCapExport ********* ");
	      CoCheMotCuaQuocGiaNangCapExport action = new CoCheMotCuaQuocGiaNangCapExport();
	      result = action.export2Report(ngayLap, maritimeCode, dateFrom, dateTo);
	    } else if (reportCode == BaoCaoConstant.BAO_CAO_KET_QUA_HOAN_THANH_THU_TUC) {
	      log.debug("********* Vao HoanThanhThuTucMotCuaQuocGiaExport ********* ");
	      HoanThanhThuTucMotCuaQuocGiaExport action = new HoanThanhThuTucMotCuaQuocGiaExport();
	      result = action.export2Report(ngayLap, null, dateFrom, dateTo);
	    }
		
//		else if (reportCode == BaoCaoConstant.BAO_CAO_KET_QUA_THUC_HIEN_CO_CHE_MOT_CUA_QUOC_GIA) {
//			log.info("********* Vao CoCheMotCuaQuocGiaExport ********* ");
//			CoCheMotCuaQuocGiaExport action = new CoCheMotCuaQuocGiaExport();
//			result = action.export2Report(ngayLap, maritimeCode, dateFrom, dateTo);
//		} 
//		
		else if (reportCode == BaoCaoConstant.BAO_CAO_12) {
			
			log.info("********* Vao BAO_CAO_12 ********* ");
			Bc12Export action = new Bc12Export();
			result = action.export2Report(ngayLap, maritimeCode, dateFrom, dateTo);
			
		} 
		
		
		return result;
	}
	
	public boolean actionExportThongKeTinhHinhNopHoSo(String reportDate, String maritimeCode, String dateFrom, String dateTo) throws Exception {
		
		TinhHinhNopHoSoExport action = new TinhHinhNopHoSoExport();
		action.export2Report(reportDate, maritimeCode, dateFrom, dateTo);
		
		return true;
	}
	
	public boolean actionExportThongKeDVCongTheoPhongBan(String reportDate, String maritimeCode, String dateFrom, String dateTo) throws Exception {
		
		DVCongTheoPhongBanExport action = new DVCongTheoPhongBanExport();
		action.export2Report(reportDate, maritimeCode, dateFrom, dateTo);
		
		return true;
	}
	
	public boolean actionExportKetQuaThucHienCoCheMotCuaQuocGia(String reportDate, String maritimeCode, String dateFrom, String dateTo) throws Exception {
		
		CoCheMotCuaQuocGiaExport action = new CoCheMotCuaQuocGiaExport();
		action.export2Report(reportDate, maritimeCode, dateFrom, dateTo);
		
		return true;
	}
	
	public boolean actionExportThongKeDichVuCong(String reportDate, String maritimeCode, String dateFrom, String dateTo) throws Exception {
		
		DichVuCongExport action = new DichVuCongExport();
		action.export2Report(reportDate, maritimeCode, dateFrom, dateTo);
		
		return true;
	}
	
	public long actionExportThongTinTau(long documentName, int documentYear, String ministryCode) throws Exception {
		PhanHoiCuaCqcnExport action = new PhanHoiCuaCqcnExport();
		return action.export2Report(documentName, documentYear, ministryCode);
	}
	
	public boolean actionExportKiemTraThongTinTau(long documentName, int documentYear) throws Exception {
		
		KiemTraThongTinTauExport action = new KiemTraThongTinTauExport();
		action.export2Report(documentName, documentYear);
		
		return true;
	}
	
	/*
	 * Function Export to Server
	 */
	public long exportFunction(String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) throws IOException, PortletException {
		long nanoTime = System.nanoTime();
		try {
			InputStream inputStream = new FileInputStream(pathFileTemp + tenFile_Template);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			parameters.put("SUBREPORT_DIR", pathFileTemp);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + nanoTime + "_" +tenFile_Export);
			return nanoTime;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public void exportFunctionModuleBaoCao(String tenFile_Template, String tenFile_Export, JRDataSource dataSource, Map<String, Object> parameters) throws IOException, PortletException {
		long nanoTime = System.nanoTime();
		try {
			InputStream inputStream = new FileInputStream(pathFileTemp + tenFile_Template);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			
			parameters.put("SUBREPORT_DIR", pathFileTemp);
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			
			// Ham nay ko ap dung ghep nanotime vao file export
			//JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + nanoTime + "_" + tenFile_Export);
			JasperExportManager.exportReportToPdfFile(jasperPrint, pathFileSub + tenFile_Export);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
