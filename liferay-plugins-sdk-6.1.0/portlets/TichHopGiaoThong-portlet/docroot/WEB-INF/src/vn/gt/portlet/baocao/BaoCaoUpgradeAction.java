package vn.gt.portlet.baocao;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.service.UserPortLocalServiceUtil;
import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.danhmucgt.model.DmGtReportTemplate;
import vn.gt.dao.danhmucgt.service.DmGtReportTemplateLocalServiceUtil;
import vn.gt.portlet.GiaoThongAction;

/**
 * Portlet implementation class BaoCaoAction
 */
public class BaoCaoUpgradeAction extends GiaoThongAction {
	
	private Log log = LogFactoryUtil.getLog(BaoCaoUpgradeAction.class);
	

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		try {

			String resourceID = resourceRequest.getResourceID();

			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

			HttpServletRequest request = PortalUtil.getHttpServletRequest(resourceRequest);
			HttpServletRequest requestOrg = PortalUtil.getOriginalServletRequest(request);
			
			String reportCode = ParamUtil.getString(requestOrg, "mauBaoCao");
			String tuNgay = ParamUtil.getString(requestOrg, "tuNgay");
			String denNgay = ParamUtil.getString(requestOrg, "denNgay");
			String ngayLap = ParamUtil.getString(requestOrg, "ngayLap");
			String maritimeCode = ParamUtil.getString(requestOrg, "maritimeCode");
			
			tuNgay = tuNgay + " 00:00";
			denNgay = denNgay + " 00:00";
			ngayLap = ngayLap + " 00:00";
			
			if (resourceID.equals("getFilterProviders")) {
				
				JSONObject data = JSONFactoryUtil.createJSONObject();
				
				UserPort portDefault = UserPortLocalServiceUtil.findByUserId(themeDisplay.getUserId());
				
				if (Validator.isNull(portDefault)) {
					//not do something
				} else {
					if (Validator.isNull(maritimeCode)) {
						maritimeCode = portDefault.getPortCode();;
					}
				}
				List<DmMaritime> allDmMaritimes = DmMaritimeLocalServiceUtil.getAll();
				
				List<DmGtReportTemplate> allReportTemplate = DmGtReportTemplateLocalServiceUtil.findByreportType(BaoCaoConstant.LOAI_BAO_CAO_TONG_HOP);
				
				JSONObject object;
				JSONArray arrayData = JSONFactoryUtil.createJSONArray();
				for (DmMaritime maritime : allDmMaritimes) {
					object = JSONFactoryUtil.createJSONObject();

					object.put("code", maritime.getMaritimeCode());
					object.put("name", maritime.getCitycode());
					object.put("portCode", maritime.getMaritimeCode());
					
					if (Validator.isNotNull(portDefault) && portDefault.getPortCode().equals(maritime.getMaritimeCode())) {
						data.put("cangVu", object);
					}
					
					arrayData.put(object);
				}
				
				data.put("allDmMaritimes", arrayData);
				data.put("allReportTemplates", JSONFactoryUtil.createJSONArray(JSONFactoryUtil.looseSerialize(allReportTemplate)));
				
				writeJSON(resourceRequest, resourceResponse, data);
				
			} else if (resourceID.equals("getReportPDF")) {
				JSONObject data = JSONFactoryUtil.createJSONObject();
				
				BaoCaoBussinessUtils action = new BaoCaoBussinessUtils();
				boolean hasDataBoolean = false;
				if (Validator.isNumber(reportCode) && Validator.isNumber(maritimeCode)) {
					hasDataBoolean = action.actionBaoCaoThongKeExport(Integer.parseInt(reportCode), maritimeCode, ngayLap, tuNgay, denNgay);
				}
				
				String tenFileExport = StringPool.BLANK;
				
				if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_KE_HOACH_DIEU_DONG) {
					tenFileExport = BaoCaoConstant.KE_HOACH_DIEU_DONG_EXPORT;
					
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.THONG_BAO_TINH_HINH_TAU_THUYEN_DU_KIEN_NEO_DAU_TAI_CANG) {
					tenFileExport = BaoCaoConstant.THONG_BAO_TINH_HINH_DU_KIEN_NEO_DAU_EXPORT;
					
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_THONG_KE_TINH_HINH_NOP_HO_SO) {
					tenFileExport = BaoCaoConstant.BAO_CAO_THONG_KE_TINH_HINH_NOP_HS_EXPORT;
					
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_THONG_KE_HO_SO_THEO_PHONG_BAN) {
					tenFileExport = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_THEO_PHONG_BAN_EXPORT;
					
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG) {
					tenFileExport = BaoCaoConstant.BAO_CAO_THONG_KE_DICH_VU_CONG_EXPORT;
					
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_KET_QUA_THUC_HIEN_CO_CHE_MOT_CUA_QUOC_GIA) {
					tenFileExport = BaoCaoConstant.BAO_CAO_KET_QUA_THUC_HIEN_CO_CHE_MOT_CUA_QUOC_GIA_NANG_CAP_EXPORT;
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_12) {
					tenFileExport = BaoCaoConstant.BAO_CAO_12_EXPORT;
				} else if (Integer.parseInt(reportCode) == BaoCaoConstant.BAO_CAO_KET_QUA_HOAN_THANH_THU_TUC) {
					tenFileExport = BaoCaoConstant.BAO_CAO_KET_QUA_HOAN_THANH_THU_TUC_EXPORT;
				}

				System.out.println("BaoCaoUpgradeAction.serveResource(reportCode)" + reportCode);
				System.out.println("BaoCaoUpgradeAction.serveResource()" + tenFileExport);
				
				String UrlFile = request.getContextPath() + "/export/" + tenFileExport;
				String UrlFileDownLoad = UrlFile.replace(".pdfs", ".pdf");
				
				if (hasDataBoolean) {
					data.put("url", UrlFile);
					data.put("download", UrlFileDownLoad);
				} else {
					data.put("url", StringPool.BLANK);
					data.put("download", StringPool.BLANK);
				}
				writeJSON(resourceRequest, resourceResponse, data);
				
			} else {

				super.serveResource(resourceRequest, resourceResponse);

			}
		} catch (Exception e) {

			throw new PortletException((Throwable) e);

		}
	}

}
