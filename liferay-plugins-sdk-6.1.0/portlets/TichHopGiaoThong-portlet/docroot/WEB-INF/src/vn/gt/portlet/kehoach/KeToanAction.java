package vn.gt.portlet.kehoach;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import vn.gt.dao.common.model.UserPort;
import vn.gt.dao.common.service.UserPortLocalServiceUtil;
import vn.gt.dao.danhmuc.model.DmMaritime;
import vn.gt.dao.danhmuc.model.DmPort;
import vn.gt.dao.danhmuc.model.DmPortWharf;
import vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPortLocalServiceUtil;
import vn.gt.dao.danhmuc.service.DmPortWharfLocalServiceUtil;
import vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit;
import vn.gt.dao.noticeandmessage.model.IssuePortClearance;
import vn.gt.dao.noticeandmessage.model.IssueShiftingOrder;
import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.portlet.TransportationMVCAction;
import vn.gt.portlet.kehoach.tt1.TT1JSONProvider;
import vn.gt.portlet.kehoach.tt10.TT10JSONProvider;
import vn.gt.portlet.kehoach.tt11.TT11JSONProvider;
import vn.gt.portlet.kehoach.tt14.TT14JSONProvider;
import vn.gt.portlet.kehoach.tt15.TT15JSONProvider;
import vn.gt.portlet.kehoach.tt16.TT16JSONProvider;
import vn.gt.portlet.kehoach.tt17.TT17JSONProvider;
import vn.gt.portlet.kehoach.tt2.TT2JSONProvider;
import vn.gt.portlet.kehoach.tt3.TT3JSONProvider;
import vn.gt.portlet.kehoach.tt4.TT4JSONProvider;
import vn.gt.portlet.kehoach.tt5.TT5JSONProvider;
import vn.gt.portlet.kehoach.tt6.TT6JSONProvider;
import vn.gt.portlet.kehoach.tt7.TT7JSONProvider;
import vn.gt.portlet.kehoach.tt8.TT8JSONProvider;
import vn.gt.portlet.kehoach.tt9.TT9JSONProvider;
import vn.gt.portlet.kehoach.utils.ChuyenDichTrangThaiUtils;
import vn.gt.portlet.kehoach.utils.JSONProviderUtils;
import vn.gt.portlet.kehoach.utils.PhieuThanhToanUtils;
import vn.gt.tichhop.message.MessageType;
import vn.gt.tichhop.message.TrangThaiBanKhai;
import vn.gt.tichhop.message.TrangThaiBanKhaiQuaCanh;
import vn.gt.utils.CheckBusinessUtil;
import vn.gt.utils.FormatData;
import vn.gt.utils.KeyParams;

/**
 * Portlet implementation class KeHoachAction
 */
public class KeToanAction extends TransportationMVCAction {

	private Log _log = LogFactoryUtil.getLog(KeToanAction.class);

	// new frontend binhth
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {

			String resourceID = resourceRequest.getResourceID();

			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

			HttpServletRequest request = PortalUtil.getHttpServletRequest(resourceRequest);
			HttpServletRequest requestOrg = PortalUtil.getOriginalServletRequest(request);

			String documentType = ParamUtil.getString(requestOrg, "documentType", "");
			int messageType = ParamUtil.getInteger(requestOrg, "messageType", 0);
			int documentYear = ParamUtil.getInteger(requestOrg, "documentYear", 0);
			
			String shipName = ParamUtil.getString(requestOrg, "shipName", "");
			String daily = ParamUtil.getString(requestOrg, "daily");
			
			if (shipName.equalsIgnoreCase("undefined")) {
				shipName = StringPool.BLANK;
			}
			if (daily.equalsIgnoreCase("undefined")) {
				daily = StringPool.BLANK;
			}
			if (Validator.isNotNull(shipName)) {
				shipName = URLDecoder.decode(shipName, "UTF-8");
			}
			if (Validator.isNotNull(daily)) {
				daily = URLDecoder.decode(daily, "UTF-8");
			}
			
			if (resourceID.equals("getPaymentData")) {

				writeJSON(resourceRequest, resourceResponse, getPaymentData(themeDisplay, requestOrg));

			}  else if (resourceID.equals("getListPortWharf")) {
				
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);
				String harbourCode = ParamUtil.getString(requestOrg, "harbourCode");
						
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
				
				List<DmPortWharf> lstPortWharf  = DmPortWharfLocalServiceUtil.
						findByPortRegionCodeAndPortHarbourCodeOrNullOrderPortCode(tempDocument.getPortRegionCode(), harbourCode, KeyParams.ORDER_BY_ASC);

				JSONArray portsArrays = JSONFactoryUtil.createJSONArray();
				JSONObject port = null;
				for (DmPortWharf dmPort : lstPortWharf) {
					port = JSONFactoryUtil.createJSONObject();
					
					port.put("portWharfCode", dmPort.getPortWharfCode());
					port.put("portWharfName", dmPort.getPortWharfNameVN());
					
					portsArrays.put(port);
				}
				
				writeJSON(resourceRequest, resourceResponse, portsArrays);
				
			} else if (resourceID.equals("getDetailThanhPhan")) {
				
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);
				
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
				
				JSONObject detailObject = JSONFactoryUtil.createJSONObject(JSONFactoryUtil.looseSerialize(tempDocument));
				
				DmMaritime dmMaritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDocument.getMaritimeCode());
				String maritimeName = Validator.isNotNull(dmMaritime) ? dmMaritime.getMaritimeNameVN() : StringPool.BLANK;
				
				detailObject.put("maritimeName", maritimeName);
				
				writeJSON(resourceRequest, resourceResponse, detailObject);
				
			} else if (resourceID.equals("getDetailByDocumentName")) {
				
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);
				
				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(documentName, documentYear);
				
				JSONObject detailObject = JSONFactoryUtil.createJSONObject(JSONFactoryUtil.looseSerialize(tempDocument));
				
				DmMaritime dmMaritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(tempDocument.getMaritimeCode());
				String maritimeName = Validator.isNotNull(dmMaritime) ? dmMaritime.getMaritimeNameVN() : StringPool.BLANK;
				
				maritimeName = Validator.isNotNull(dmMaritime) ? dmMaritime.getCitycode() : StringPool.BLANK;
				String maritimeReferent = Validator.isNotNull(dmMaritime) ? dmMaritime.getMaritimeReference()
						: StringPool.BLANK;

				detailObject.put("maritimeName", maritimeName);
				detailObject.put("signLocation", Validator.isNotNull(dmMaritime)? dmMaritime.getCitycode() : StringPool.BLANK);
				
				if (documentType.equals("NC") || documentType.equals("4")
						|| documentType.equals("8")
						|| documentType.equals("10")
						|| documentType.equals("12")
						|| documentType.equals(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					
					DmPort cangden = DmPortLocalServiceUtil.getByPortCode(tempDocument.getPortCode());
					
					detailObject.put("portName", Validator.isNotNull(cangden) ? cangden.getPortName() : StringPool.BLANK);
					
				} else {
					DmPort cangden = DmPortLocalServiceUtil.getByPortCode(tempDocument.getLastPortCode());
					
					detailObject.put("portName", Validator.isNotNull(cangden) ? cangden.getPortName() : StringPool.BLANK);
				}
				
				detailObject.put("maritimeReferent", maritimeReferent);
				detailObject.put("canBoPheDuyet", themeDisplay.getUser().getEmailAddress());
				
				String ghichu = "";  
				
				String type = ParamUtil.getString(requestOrg, "type", "ke_hoach");
				
				if (type.equals("ke_hoach")) {
					if (tempDocument.getRequestState() == TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG 
	            			|| tempDocument.getRequestState() == TrangThaiBanKhai.DA_CAP_LENH_DIEU_DONG) {
	            		
	            		List<IssueShiftingOrder> issueShiftingOrders = new ArrayList<IssueShiftingOrder>(
	            				IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(tempDocument.getDocumentName(),
	            						tempDocument.getDocumentYear(), KeyParams.ID, KeyParams.ORDER_BY_DESC));
	            		
						 if (Validator.isNotNull(issueShiftingOrders) &&  (issueShiftingOrders.size() > 0)) {
							 
							 IssueShiftingOrder issueShiftingOrder = issueShiftingOrders.get(0);
							 
							 if (issueShiftingOrder.getRequestCode().length()> 0 
									 && issueShiftingOrder.getStampStatus() == 11 
									 && issueShiftingOrder.getIsApproval() == 0) {
								 if (tempDocument.getRequestState() == TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG) {
									 ghichu = "\u0110\u00E3 chuy\u1EC3n l\u00E3nh \u0111\u1EA1o, ch\u1EDD k\u00FD.";	
								 } else if (tempDocument.getRequestState() == TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG) {
									 ghichu = "L\u1EC7nh \u0111i\u1EC1u \u0111\u1ED9ng c\u1EA5p l\u1EA1i \u0111\u00E3 chuy\u1EC3n l\u00E3nh \u0111\u1EA1o, ch\u1EDD k\u00FD.";
								 }
							 } else if (issueShiftingOrder.getRequestCode().length()> 0 
									 && issueShiftingOrder.getStampStatus() == 1) {
								 if (tempDocument.getRequestState() == TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG) {
									 ghichu = "\u0110\u00E3 chuy\u1EC3n v\u0103n th\u01B0, ch\u1EDD \u0111\u00F3ng d\u1EA5u.";
								 } else if (tempDocument.getRequestState() == TrangThaiBanKhai.CHO_CAP_LENH_DIEU_DONG) {
									 ghichu = "L\u1EC7nh \u0111i\u1EC1u \u0111\u1ED9ng c\u1EA5p l\u1EA1i \u0111\u00E3 chuy\u1EC3n v\u0103n th\u01B0, ch\u1EDD \u0111\u00F3ng d\u1EA5u.";	
								 }
							 } else if (issueShiftingOrder.getRequestCode().length()> 0 
									 	&& issueShiftingOrder.getStampStatus() == 0 
									 	&& issueShiftingOrder.getIsCancel() == 0 
									 	&& issueShiftingOrder.getCancelNote().length() > 0) {
								 ghichu = "L\u00FD do tr\u1EA3 l\u1EA1i: " + issueShiftingOrder.getCancelNote();	
							 } else {
								 ghichu = ""; 
							 }
							 
						 } else {
							 ghichu = ""; 
						 }	
	            	} else {
	            		ghichu = ""; 
	            	}
				} else {
					if (tempDocument.getDocumentStatusCode() == TrangThaiBanKhaiQuaCanh.DE_NGHI_CAP_GIAY_PHEP 
	            			|| tempDocument.getDocumentStatusCode() == TrangThaiBanKhai.PHE_DUYET_HOAN_THANH_THU_TUC) {
	            		
	            		if (tempDocument.getDocumentTypeCode().equals(MessageType.LOAT_THU_TUC_QUA_CANH)) {
	            			
	            			List<IssuePermissionForTransit> issuePermissionForTransits = IssuePermissionForTransitLocalServiceUtil
	            					.findByDocumentYearAndDocumentYearOrderByColumn(tempDocument.getDocumentName(),
	            							tempDocument.getDocumentYear(), KeyParams.ID,
	            							KeyParams.ORDER_BY_DESC);
	            			 if (Validator.isNotNull(issuePermissionForTransits) &&  (issuePermissionForTransits.size() > 0)) {
	            				 
	            				 IssuePermissionForTransit issuePermissionForTransit = issuePermissionForTransits.get(0);
	            				 
	            				 if (issuePermissionForTransit.getRequestCode().length()> 0 
	    								 && issuePermissionForTransit.getStampStatus() == 11 
	    								 && issuePermissionForTransit.getIsApproval() == 0) {
									 ghichu = "\u0110\u00E3 chuy\u1EC3n l\u00E3nh \u0111\u1EA1o, ch\u1EDD k\u00FD.";	
	    						 } else if (issuePermissionForTransit.getRequestCode().length()> 0 
	    								 && issuePermissionForTransit.getStampStatus() == 1) {
									 ghichu = "\u0110\u00E3 chuy\u1EC3n v\u0103n th\u01B0, ch\u1EDD \u0111\u00F3ng d\u1EA5u.";
	    						 } else if (issuePermissionForTransit.getRequestCode().length()> 0 
	    								 	&& issuePermissionForTransit.getStampStatus() == 0 
	    								 	&& issuePermissionForTransit.getIsCancel() == 0 
	    								 	&& issuePermissionForTransit.getCancelNote().length() > 0) {
	    							 ghichu = "L\u00FD do tr\u1EA3 l\u1EA1i: " + issuePermissionForTransit.getCancelNote();	
	    						 } else {
	    							 ghichu = ""; 
	    						 }
	            				 
	            			 } else {
	    						 ghichu = ""; 
	    					 }
	            		} else {
	            			
	            			List<IssuePortClearance> issuePortClearances = IssuePortClearanceLocalServiceUtil
	            					.findByDocumentYearAndDocumentYearOrderByColumn(tempDocument.getDocumentName(),
	            							tempDocument.getDocumentYear(), KeyParams.ID,
	            							KeyParams.ORDER_BY_DESC);
	            			
	            			 if (Validator.isNotNull(issuePortClearances) &&  (issuePortClearances.size() > 0)) {
	            				 
	            				 IssuePortClearance issuePortClearance = issuePortClearances.get(0);
	            				 
	            				 if (issuePortClearance.getRequestCode().length()> 0 
	    								 && issuePortClearance.getStampStatus() == 11 
	    								 && issuePortClearance.getIsApproval() == 0) {
									 ghichu = "\u0110\u00E3 chuy\u1EC3n l\u00E3nh \u0111\u1EA1o, ch\u1EDD k\u00FD.";	
	    						 } else if (issuePortClearance.getRequestCode().length()> 0 
	    								 && issuePortClearance.getStampStatus() == 1) {
									 ghichu = "\u0110\u00E3 chuy\u1EC3n v\u0103n th\u01B0, ch\u1EDD \u0111\u00F3ng d\u1EA5u.";
	    						 } else if (issuePortClearance.getRequestCode().length()> 0 
	    								 	&& issuePortClearance.getStampStatus() == 0 
	    								 	&& issuePortClearance.getIsCancel() == 0 
	    								 	&& issuePortClearance.getCancelNote().length() > 0) {
	    							 ghichu = "L\u00FD do tr\u1EA3 l\u1EA1i: " + issuePortClearance.getCancelNote();	
	    						 } else {
	    							 ghichu = ""; 
	    						 }
	            				 
	            			 } else {
	    						 ghichu = ""; 
	    					 }
	            			
	            		}
	            		
	            	} else {
	            		ghichu = ""; 
	            	}
				}
				
				
				detailObject.put("ghichu", ghichu);
				writeJSON(resourceRequest, resourceResponse, detailObject);
				
			} else if (resourceID.equals("getRoleFilterStatus")) {
				
				if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse,
							TT1JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse,
							TT2JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					writeJSON(resourceRequest, resourceResponse,
							TT16JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					writeJSON(resourceRequest, resourceResponse,
							TT17JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					writeJSON(resourceRequest, resourceResponse,
							TT3JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse,
							TT4JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse,
							TT5JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse,
							TT6JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse,
							TT7JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					writeJSON(resourceRequest, resourceResponse,
							TT8JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					writeJSON(resourceRequest, resourceResponse,
							TT9JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					writeJSON(resourceRequest, resourceResponse,
							TT10JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					writeJSON(resourceRequest, resourceResponse,
							TT11JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse,
							TT14JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse,
							TT15JSONProvider.getRoleFilterStatus(themeDisplay.getLocale(), themeDisplay.getUser()));
				}
				
			} else if (resourceID.equals("counterHoSoAll")) {
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.counterHoSoAll(themeDisplay, requestOrg));
			} else if (resourceID.equals("getDetailHoSo")) {
				
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				
				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getDetailHoSo(themeDisplay, documentName, documentYear));

			} else if (resourceID.equals("getHoSoKeHoachTable")) {

				String requestState = ParamUtil.getString(requestOrg, "requestState", "");

				if (Validator.isNull(requestState) || requestState.equals("0") || Long.valueOf(requestState) <= 0) {
					requestState = CheckBusinessUtil.getTrangThaiHoSoDefaultForm(MessageType.ROLE_KE_HOACH);
				}

				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				String maritimeCode = ParamUtil.getString(requestOrg, "maritimeCode", "");
				
				String positionCode = ParamUtil.getString(requestOrg, "positionCode", "");
				String portRegionCode = ParamUtil.getString(requestOrg, "portRegionCode", "");
				String maBanKhai = ParamUtil.getString(requestOrg, "maBanKhai", "");
				String stateCode = ParamUtil.getString(requestOrg, "stateCode", "");
				String shipDateFromStart = ParamUtil.getString(requestOrg, "shipDateFromStart", "");
				String shipDateFromEnd = ParamUtil.getString(requestOrg, "shipDateFromEnd", "");
				String shipDateToStart = ParamUtil.getString(requestOrg, "shipDateToStart", "");
				String shipDateToEnd = ParamUtil.getString(requestOrg, "shipDateToEnd", "");
				String callSign = ParamUtil.getString(requestOrg, "callSign", "");
				String imo = ParamUtil.getString(requestOrg, "imo", "");
				String ngayLamThuTucFrom = ParamUtil.getString(requestOrg, "ngayLamThuTucFrom", "");
				String ngayLamThuTucTo = ParamUtil.getString(requestOrg, "ngayLamThuTucTo", "");
				int start = ParamUtil.getInteger(requestOrg, "start", 0);
				int end = ParamUtil.getInteger(requestOrg, "end", 15);

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				if (Validator.isNull(requestState) || requestState.equals("0")) {
					requestState = "11,14,15,16,12,13,27,114";
				}
				
				boolean advSearch = ParamUtil.getBoolean(requestOrg, "adv", false);

				String maritimeCodeOwner = ParamUtil.getString(requestOrg, "maritimeCodeOwner");
				String positionCodeAdv = ParamUtil.getString(requestOrg, "positionCode");
				String imoAdv = ParamUtil.getString(requestOrg, "imo");
				String stateCodeAdv = ParamUtil.getString(requestOrg, "stateCode");
				String maritimeCodeAdv = ParamUtil.getString(requestOrg, "maritimeCode");
				String maritimeCodeNext = ParamUtil.getString(requestOrg, "maritimeCodeNext");
				String timeShip = ParamUtil.getString(requestOrg, "timeShip");
				String timeSend = ParamUtil.getString(requestOrg, "timeSend");

				if (advSearch) {
					
					String[] timeShipS = timeShip.replaceAll("%2F", "/").split(",");

					if (timeShipS.length > 0) {
						try {
							shipDateFromStart = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeShipS[0])));
						} catch (Exception e) {
							// TODO: handle exception
						}
						try {
							shipDateFromEnd = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeShipS[1])));
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					String[] timeSendS = timeSend.replaceAll("%2F", "/").split(",");
					
					if (timeSendS.length > 0) {
						try {
							shipDateToStart = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeSendS[0])));
						} catch (Exception e) {
							// TODO: handle exception
						}
						try {
							shipDateToEnd = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeSendS[1])));
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					writeJSON(resourceRequest, resourceResponse,
							JSONProviderUtils.getHoSoKeHoachTable(themeDisplay, requestState, documentTypeCode, maritimeCodeOwner,
									maritimeCodeNext, shipName, positionCodeAdv, maritimeCodeAdv, maBanKhai, stateCodeAdv, shipDateFromStart,
									shipDateFromEnd, StringPool.BLANK, StringPool.BLANK, callSign, imoAdv, shipDateToStart,
									shipDateToEnd, daily, start, end));
					
				} else {
					writeJSON(resourceRequest, resourceResponse,
							JSONProviderUtils.getHoSoKeHoachTable(themeDisplay, requestState, documentTypeCode, maritimeCode,
									maritimeCodeNext, shipName, positionCode, portRegionCode, maBanKhai, stateCode, StringPool.BLANK,
									StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, callSign, imo, StringPool.BLANK,
									StringPool.BLANK, daily, start, end));
				}

			} else if (resourceID.equals("counterHoSoKeHoachTable")) {

				String requestState = ParamUtil.getString(requestOrg, "requestState", "");

				if (Validator.isNull(requestState) || requestState.equals("0") || Long.valueOf(requestState) <= 0) {
					requestState = CheckBusinessUtil.getTrangThaiHoSoDefaultForm(MessageType.ROLE_KE_HOACH);
				}

				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				String maritimeCode = ParamUtil.getString(requestOrg, "maritimeCode", "");
				String positionCode = ParamUtil.getString(requestOrg, "positionCode", "");
				String portRegionCode = ParamUtil.getString(requestOrg, "portRegionCode", "");
				String documentName = ParamUtil.getString(requestOrg, "documentName", "");
				String stateCode = ParamUtil.getString(requestOrg, "stateCode", "");
				String shipDateFromStart = ParamUtil.getString(requestOrg, "shipDateFromStart", "");
				String shipDateFromEnd = ParamUtil.getString(requestOrg, "shipDateFromEnd", "");
				String shipDateToStart = ParamUtil.getString(requestOrg, "shipDateToStart", "");
				String shipDateToEnd = ParamUtil.getString(requestOrg, "shipDateToEnd", "");
				String callSign = ParamUtil.getString(requestOrg, "callSign", "");
				String imo = ParamUtil.getString(requestOrg, "imo", "");
				String ngayLamThuTucFrom = ParamUtil.getString(requestOrg, "ngayLamThuTucFrom", "");
				String ngayLamThuTucTo = ParamUtil.getString(requestOrg, "ngayLamThuTucTo", "");
				int start = ParamUtil.getInteger(requestOrg, "start", 0);
				int end = ParamUtil.getInteger(requestOrg, "end", 15);

				int rootIndex = ParamUtil.getInteger(requestOrg, "rootIndex", 0);
				int childIndex = ParamUtil.getInteger(requestOrg, "childIndex", 0);

				if (Validator.isNull(requestState) || requestState.equals("0")) {
					requestState = "11,14,15,16,12,13,27,114";
				}
				
				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.counterHoSoKeHoachTable(themeDisplay, requestState, documentTypeCode, maritimeCode,
								shipName, positionCode, portRegionCode, documentName, stateCode, shipDateFromStart,
								shipDateFromEnd, shipDateToStart, shipDateToEnd, callSign, imo, ngayLamThuTucFrom,
								ngayLamThuTucTo, start, end, rootIndex, childIndex));

			} else if (resourceID.equals("getHoSoThuTucTable")) {

				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				
				String maritimeCode = ParamUtil.getString(requestOrg, "maritimeCode", "");
				String portCode = ParamUtil.getString(requestOrg, "portCode", "");
				String lastPortCode = ParamUtil.getString(requestOrg, "lastPortCode", "");
				String stateCode = ParamUtil.getString(requestOrg, "stateCode", "");
				String callSign = ParamUtil.getString(requestOrg, "callSign", "");
				String imo = ParamUtil.getString(requestOrg, "imo", "");
				String shipPosition = ParamUtil.getString(requestOrg, "shipPosition", "");
				String shipDateFromStart = ParamUtil.getString(requestOrg, "shipDateFromStart", "");
				String shipDateFromEnd = ParamUtil.getString(requestOrg, "shipDateFromEnd", "");
				String shipDateToStart = ParamUtil.getString(requestOrg, "shipDateToStart", "");
				String shipDateToEnd = ParamUtil.getString(requestOrg, "shipDateToEnd", "");
				String documentStatusCode = ParamUtil.getString(requestOrg, "documentStatusCode", "");
				String arrivalShipAgency = ParamUtil.getString(requestOrg, "arrivalShipAgency", "");
				String nameArrivalShipAgency = ParamUtil.getString(requestOrg, "nameArrivalShipAgency", "");
				String departureShipAgency = ParamUtil.getString(requestOrg, "departureShipAgency", "");
				String nameDepartureShipAgency = ParamUtil.getString(requestOrg, "nameDepartureShipAgency", "");
				String portRegionCode = ParamUtil.getString(requestOrg, "portRegionCode", "");
				String ngayLamThuTucFrom = ParamUtil.getString(requestOrg, "ngayLamThuTucFrom", "");
				String ngayLamThuTucTo = ParamUtil.getString(requestOrg, "ngayLamThuTucTo", "");
				String maBanKhai = ParamUtil.getString(requestOrg, "maBanKhai", "");
				int start = ParamUtil.getInteger(requestOrg, "start", 0);
				int end = ParamUtil.getInteger(requestOrg, "end", 15);

				if (Validator.isNull(documentStatusCode) || documentStatusCode.equals("0")) {
					documentStatusCode = "12,13,18,19,10,20,120,25";
				}
				
				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				boolean advSearch = ParamUtil.getBoolean(requestOrg, "adv", false);
				
				boolean isDTND = ParamUtil.getBoolean(requestOrg, "isDTND", false);

				boolean isDTNDCam = ParamUtil.getBoolean(requestOrg, "isDTNDCam", false);

				String maritimeCodeOwner = ParamUtil.getString(requestOrg, "maritimeCodeOwner");
				String positionCodeAdv = ParamUtil.getString(requestOrg, "positionCode");
				String imoAdv = ParamUtil.getString(requestOrg, "imo");
				String stateCodeAdv = ParamUtil.getString(requestOrg, "stateCode");
				String maritimeCodeAdv = ParamUtil.getString(requestOrg, "maritimeCode");
				String maritimeCodeNext = ParamUtil.getString(requestOrg, "maritimeCodeNext");
				String timeShip = ParamUtil.getString(requestOrg, "timeShip");
				String timeSend = ParamUtil.getString(requestOrg, "timeSend");
				
				if (advSearch) {
					
					String[] timeShipS = timeShip.replaceAll("%2F", "/").split(",");

					if (timeShipS.length > 0) {
						try {
							shipDateFromStart = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeShipS[0])));
						} catch (Exception e) {
							// TODO: handle exception
						}
						try {
							shipDateFromEnd = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeShipS[1])));
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					String[] timeSendS = timeSend.replaceAll("%2F", "/").split(",");
					
					if (timeSendS.length > 0) {
						try {
							shipDateToStart = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeSendS[0])));
						} catch (Exception e) {
							// TODO: handle exception
						}
						try {
							shipDateToEnd = FormatData.parseDateToTringType3(new Date(Long.valueOf(timeSendS[1])));
						} catch (Exception e) {
							// TODO: handle exception
						}
					}

					writeJSON(resourceRequest, resourceResponse,
							JSONProviderUtils.getHoSoThuTucTable(themeDisplay, documentTypeCode, maritimeCodeOwner,
									portCode, lastPortCode, shipName, stateCodeAdv, callSign, imoAdv, positionCodeAdv,
									shipDateFromStart, shipDateFromEnd, StringPool.BLANK, StringPool.BLANK, documentStatusCode,
									arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency,
									maritimeCodeAdv, shipDateToStart,
									shipDateToEnd, maBanKhai, daily, maritimeCodeNext, start, end, isDTND, isDTNDCam));
					
				} else {
					writeJSON(resourceRequest, resourceResponse,
							JSONProviderUtils.getHoSoThuTucTable(themeDisplay, documentTypeCode, maritimeCode,
									portCode, lastPortCode, shipName, stateCode, callSign, imo, shipPosition,
									StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, documentStatusCode,
									arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency,
									portRegionCode, StringPool.BLANK,
									StringPool.BLANK, maBanKhai, daily, maritimeCodeNext, start, end, isDTND, isDTNDCam));
				}
				

			} else if (resourceID.equals("counterHoSoThuTucTable")) {

				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				String maritimeCode = ParamUtil.getString(requestOrg, "maritimeCode", "");
				String portCode = ParamUtil.getString(requestOrg, "portCode", "");
				String lastPortCode = ParamUtil.getString(requestOrg, "lastPortCode", "");
				String stateCode = ParamUtil.getString(requestOrg, "stateCode", "");
				String callSign = ParamUtil.getString(requestOrg, "callSign", "");
				String imo = ParamUtil.getString(requestOrg, "imo", "");
				String shipPosition = ParamUtil.getString(requestOrg, "shipPosition", "");
				String shipDateFromStart = ParamUtil.getString(requestOrg, "shipDateFromStart", "");
				String shipDateFromEnd = ParamUtil.getString(requestOrg, "shipDateFromEnd", "");
				String shipDateToStart = ParamUtil.getString(requestOrg, "shipDateToStart", "");
				String shipDateToEnd = ParamUtil.getString(requestOrg, "shipDateToEnd", "");
				String documentStatusCode = ParamUtil.getString(requestOrg, "documentStatusCode", "");
				String arrivalShipAgency = ParamUtil.getString(requestOrg, "arrivalShipAgency", "");
				String nameArrivalShipAgency = ParamUtil.getString(requestOrg, "nameArrivalShipAgency", "");
				String departureShipAgency = ParamUtil.getString(requestOrg, "departureShipAgency", "");
				String nameDepartureShipAgency = ParamUtil.getString(requestOrg, "nameDepartureShipAgency", "");
				String portRegionCode = ParamUtil.getString(requestOrg, "portRegionCode", "");
				String ngayLamThuTucFrom = ParamUtil.getString(requestOrg, "ngayLamThuTucFrom", "");
				String ngayLamThuTucTo = ParamUtil.getString(requestOrg, "ngayLamThuTucTo", "");
				String maBanKhai = ParamUtil.getString(requestOrg, "maBanKhai", "");
				int start = ParamUtil.getInteger(requestOrg, "start", 0);
				int end = ParamUtil.getInteger(requestOrg, "end", 15);
				boolean isDTND = ParamUtil.getBoolean(requestOrg, "isDTND", false);

				boolean isDTNDCam = ParamUtil.getBoolean(requestOrg, "isDTNDCam", false);
				
				int rootIndex = ParamUtil.getInteger(requestOrg, "rootIndex", 0);
				int childIndex = ParamUtil.getInteger(requestOrg, "childIndex", 0);

				if (Validator.isNull(documentStatusCode) || documentStatusCode.equals("0")) {
					documentStatusCode = "12,13,18,19,10,20,120,25";
				}

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.counterHoSoThuTucTable(themeDisplay, documentTypeCode, maritimeCode,
								portCode, lastPortCode, shipName, stateCode, callSign, imo, shipPosition,
								shipDateFromStart, shipDateFromEnd, shipDateToStart, shipDateToEnd, documentStatusCode,
								arrivalShipAgency, nameArrivalShipAgency, departureShipAgency, nameDepartureShipAgency,
								portRegionCode, ngayLamThuTucFrom, ngayLamThuTucTo, maBanKhai, start, end, rootIndex,
								childIndex, isDTND, isDTNDCam));

			} else if (resourceID.equals("getPhanHoiTuCoQuanChuyenNganhTable")) {

				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				
				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils
						.getPhanHoiTuCoQuanChuyenNganhTable(themeDisplay.getLocale(), documentName, documentYear));

			} else if (resourceID.equals("exportPDFDetail")) {
				
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				String ministryCode = ParamUtil.getString(requestOrg, "ministryCode");

				ministryCode = ministryCode.replaceAll("%26", "&").replaceAll("%2526", "&").replaceAll("&&", "&");
				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.exportPDFDetail(themeDisplay.getLocale(),
						documentName, documentYear, ministryCode, request));

			} else if (resourceID.equals("exportPDFDetailThanhPhan")) {

				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);
				String requestCode = ParamUtil.getString(requestOrg, "requestCode", StringPool.BLANK);

				if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT1JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT2JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					writeJSON(resourceRequest, resourceResponse, TT16JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					writeJSON(resourceRequest, resourceResponse, TT17JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT3JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT4JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT5JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT6JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT7JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT8JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT9JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					writeJSON(resourceRequest, resourceResponse, TT10JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					writeJSON(resourceRequest, resourceResponse, TT11JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT14JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT15JSONProvider.exportPDFDetailThanhPhan(
							themeDisplay.getLocale(), documentName, documentYear, messageType, requestCode, request));
				}
				
			} else if (resourceID.equals("getThanhPhanHoSo")) {

				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);

				if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT1JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT2JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					writeJSON(resourceRequest, resourceResponse, TT16JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					writeJSON(resourceRequest, resourceResponse, TT17JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT3JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT4JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT5JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT6JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT7JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT8JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT9JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					writeJSON(resourceRequest, resourceResponse, TT10JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					writeJSON(resourceRequest, resourceResponse, TT11JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT14JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT15JSONProvider.getThanhPhanHoSo(themeDisplay,
							documentType, documentName, documentYear, requestOrg));
				}
				
			} else if (resourceID.equals("getFileThanhPhanVersionList")) {

				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				
				if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT1JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT2JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					writeJSON(resourceRequest, resourceResponse, TT16JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					writeJSON(resourceRequest, resourceResponse, TT17JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT3JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT4JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT5JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT6JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT7JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT8JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT9JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					writeJSON(resourceRequest, resourceResponse, TT10JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					writeJSON(resourceRequest, resourceResponse, TT11JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT14JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT15JSONProvider.getFileThanhPhanVersionList(
							themeDisplay, messageType, documentName, documentYear, request));
				}
				
			} else if (resourceID.equals("getThongTinKhaiBaoTable")) {

				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);

				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getThongTinKhaiBaoTable(
						themeDisplay.getLocale(), documentType, documentName, documentYear, request, themeDisplay));

			} else if (resourceID.equals("getDocTypes")) {

				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getDocTypes(themeDisplay));

			} else if (resourceID.equals("getFilterADVDataAPI")) {

				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getFilterADVDataAPI(themeDisplay));

			} else if (resourceID.equals("checkThanhPhanActionButton")) {
				
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				int roleType = ParamUtil.getInteger(requestOrg, "roleType");

				String requestCode = ParamUtil.getString(requestOrg, "REQUEST_CODE");
				
				if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT1JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT2JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6)) {
					writeJSON(resourceRequest, resourceResponse, TT16JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7)) {
					writeJSON(resourceRequest, resourceResponse, TT17JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_QUA_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT3JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.NHAP_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT4JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.XUAT_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT5JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VAO_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT6JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.ROI_CANH_DAU_KHI)) {
					writeJSON(resourceRequest, resourceResponse, TT7JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_VAO_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT8JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.TAU_THUYEN_ROI_CANG)) {
					writeJSON(resourceRequest, resourceResponse, TT9JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_VAO)) {
					writeJSON(resourceRequest, resourceResponse, TT10JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.CHUYEN_CANG_ROI)) {
					writeJSON(resourceRequest, resourceResponse, TT11JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_NHAP_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT14JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				} else if (documentType.equalsIgnoreCase(ChuyenDichTrangThaiUtils.VIET_CAM_XUAT_CANH)) {
					writeJSON(resourceRequest, resourceResponse, TT15JSONProvider.checkThanhPhanActionButton(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				}
				
			} else if (resourceID.equals("getHistoryTable")) {

				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				String maritimeCode = ParamUtil.getString(requestOrg, "maritimeCode", "");
				String portCode = ParamUtil.getString(requestOrg, "portCode", "");
				String lastPortCode = ParamUtil.getString(requestOrg, "lastPortCode", "");
				String stateCode = ParamUtil.getString(requestOrg, "stateCode", "");
				String callSign = ParamUtil.getString(requestOrg, "callSign", "");
				String imo = ParamUtil.getString(requestOrg, "imo", "");
				String shipPosition = ParamUtil.getString(requestOrg, "shipPosition", "");
				String shipDateFromStart = ParamUtil.getString(requestOrg, "shipDateFromStart", "");
				String shipDateFromEnd = ParamUtil.getString(requestOrg, "shipDateFromEnd", "");
				String shipDateToStart = ParamUtil.getString(requestOrg, "shipDateToStart", "");
				String shipDateToEnd = ParamUtil.getString(requestOrg, "shipDateToEnd", "");
				String documentStatusCode = ParamUtil.getString(requestOrg, "documentStatusCode", "");
				String arrivalShipAgency = ParamUtil.getString(requestOrg, "arrivalShipAgency", "");
				String nameArrivalShipAgency = ParamUtil.getString(requestOrg, "nameArrivalShipAgency", "");
				String departureShipAgency = ParamUtil.getString(requestOrg, "departureShipAgency", "");
				String nameDepartureShipAgency = ParamUtil.getString(requestOrg, "nameDepartureShipAgency", "");
				String portRegionCode = ParamUtil.getString(requestOrg, "portRegionCode", "");
				String ngayLamThuTucFrom = ParamUtil.getString(requestOrg, "ngayLamThuTucFrom", "");
				String ngayLamThuTucTo = ParamUtil.getString(requestOrg, "ngayLamThuTucTo", "");
				String maBanKhai = ParamUtil.getString(requestOrg, "maBanKhai", "");

				int start = ParamUtil.getInteger(requestOrg, "start", 0);
				int end = ParamUtil.getInteger(requestOrg, "end", 15);
				boolean isDTND = ParamUtil.getBoolean(requestOrg, "isDTND", false);
				boolean isDTNDCam = ParamUtil.getBoolean(requestOrg, "isDTNDCam", false);
				
				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getHistoryTable(themeDisplay,
								documentTypeCode, maritimeCode, portCode,
								lastPortCode, shipName, stateCode, callSign,
								imo, shipPosition, shipDateFromStart,
								shipDateFromEnd, shipDateToStart,
								shipDateToEnd, documentStatusCode,
								arrivalShipAgency, nameArrivalShipAgency,
								departureShipAgency, nameDepartureShipAgency,
								portRegionCode, ngayLamThuTucFrom,
								ngayLamThuTucTo, maBanKhai, StringPool.BLANK, StringPool.BLANK, start, end, isDTND, isDTNDCam));

			} else if (resourceID.equals("getGiayToXuatTrinhPhuongTien")) {
				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);
				
				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getGiayToXuatTrinhPhuongTien(themeDisplay, documentTypeCode,
								documentName, documentYear));
			} else if (resourceID.equals("getGiayToXuatTrinh_39")) {
				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getGiayToXuatTrinh_39(themeDisplay, documentTypeCode,
								documentName, documentYear));
			} else if (resourceID.equals("getGiayToXuatTrinh_40")) {
				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getGiayToXuatTrinh_40(themeDisplay, documentTypeCode,
								documentName, documentYear));
			} else if (resourceID.equals("getGiayToXuatTrinh_48")) {
				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getGiayToXuatTrinh_48(themeDisplay, documentTypeCode,
								documentName, documentYear));
			} else if (resourceID.equals("getGiayToXuatTrinh_49")) {
				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getGiayToXuatTrinh_49(themeDisplay, documentTypeCode,
								documentName, documentYear));
			} else if (resourceID.equals("getGiayToXuatTrinh_50")) {
				String documentTypeCode = ParamUtil.getString(requestOrg, "documentTypeCode", "");
				int documentName = ParamUtil.getInteger(requestOrg, "documentName", 0);

				if (documentTypeCode.equals("0")) {
					documentTypeCode = StringPool.BLANK;
				}
				
				writeJSON(resourceRequest, resourceResponse,
						JSONProviderUtils.getGiayToXuatTrinh_50(themeDisplay, documentTypeCode,
								documentName, documentYear));
			} else if (resourceID.equals("getMessageType23EXT")) {
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				int roleType = ParamUtil.getInteger(requestOrg, "roleType");

				String requestCode = ParamUtil.getString(requestOrg, "REQUEST_CODE");
				
					writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getMessageType23EXT(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				
			} else if (resourceID.equals("getLenhDieuDongEXT")) {
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);

				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getLenhDieuDongEXT(themeDisplay ,documentName,
						documentYear, request));

			} else if (resourceID.equals("getMessageType60EXT")) {
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				int roleType = ParamUtil.getInteger(requestOrg, "roleType");

				String requestCode = ParamUtil.getString(requestOrg, "REQUEST_CODE");
				
					writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getMessageType60EXT(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				
			} else if (resourceID.equals("getMessageType60EXTTable")) {
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				int roleType = ParamUtil.getInteger(requestOrg, "roleType");

				String requestCode = ParamUtil.getString(requestOrg, "REQUEST_CODE");
				
					writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getMessageType60EXTTable(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				
			} else if (resourceID.equals("getMessageType60EXTTableQC")) {
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				int roleType = ParamUtil.getInteger(requestOrg, "roleType");

				String requestCode = ParamUtil.getString(requestOrg, "REQUEST_CODE");
				
					writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getMessageType60EXTTableQC(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				
			} else if (resourceID.equals("getMessageType90EXT")) {
				long documentName = ParamUtil.getLong(requestOrg, "documentName", 0);
				int roleType = ParamUtil.getInteger(requestOrg, "roleType");

				String requestCode = ParamUtil.getString(requestOrg, "REQUEST_CODE");
				
					writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getMessageType90EXT(themeDisplay ,documentName,
							documentYear, messageType, roleType, requestCode, request));
				
			} else if (resourceID.equals("getNotifications")) {
				
					writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getNotifications(themeDisplay));
				
			} else if (resourceID.equals("getFilterADVDataAPI")) {

				writeJSON(resourceRequest, resourceResponse, JSONProviderUtils.getFilterADVDataAPI(themeDisplay));

			} else {

				super.serveResource(resourceRequest, resourceResponse);

			}
		} catch (Exception e) {

			throw new PortletException((Throwable) e);

		}
	}

	private JSONObject getPaymentData(ThemeDisplay themeDisplay, HttpServletRequest requestOrg) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		String markasdeleted = ParamUtil.getString(requestOrg, "markasdeleted");
		String mariTimeCode = ParamUtil.getString(requestOrg, "mariTimeCode", StringPool.BLANK);
		int start = ParamUtil.getInteger(requestOrg, "start", 0);
		int end = ParamUtil.getInteger(requestOrg, "end", 15);
		String keywordsSearch = ParamUtil.getString(requestOrg, "keywordsSearch");

		UserPort portDefault = UserPortLocalServiceUtil.findByUserId(themeDisplay.getUserId());
		int maritimeCode = 0;

		if (Validator.isNotNull(portDefault) && Validator.isNull(mariTimeCode)) {
			maritimeCode = Integer.valueOf(portDefault.getPortCode());
		} else {
			maritimeCode = Integer.valueOf(mariTimeCode);
		}

		List<TempDebitNote> list = new ArrayList<TempDebitNote>();
		long total = 0;

		try {

			User user = themeDisplay.getUser();

			boolean flagDT = false;

			for (Role role : user.getRoles()) {

				if (role.getName().equals("DTND_ROLE")) {
					flagDT = true;
					break;
				}

			}

			String[] documentTypeCode = null;

			if (flagDT) {
				documentTypeCode = new String[] { ChuyenDichTrangThaiUtils.TAU_THUYEN_NHAP_CANH_6,
						ChuyenDichTrangThaiUtils.TAU_THUYEN_XUAT_CANH_7 };
			} else {
				documentTypeCode = new String[] { "NC", "XC", "QC", "4", "5", "8", "9", "10", "11", "12", "13" };
			}

			long totalDatal = 0;

			JSONArray dataArrayDatal = JSONFactoryUtil.createJSONArray();

			String positionCode = ParamUtil.getString(requestOrg, "positionCode");
			String imo = ParamUtil.getString(requestOrg, "imo");
			String stateCode = ParamUtil.getString(requestOrg, "stateCode");
			String portRegionCode = ParamUtil.getString(requestOrg, "portRegionCode");
			String maritimeCodeNext = ParamUtil.getString(requestOrg, "maritimeCodeNext");
			String shipName = ParamUtil.getString(requestOrg, "shipName");
			String callSign = ParamUtil.getString(requestOrg, "callSign");

			list = TempDocumentLocalServiceUtil.findTempDebitNote(String.valueOf(maritimeCode), positionCode,
					portRegionCode, keywordsSearch, stateCode, imo, markasdeleted, maritimeCodeNext, start, end,
					shipName, callSign);
			total = TempDocumentLocalServiceUtil.countTempDebitNote(String.valueOf(maritimeCode), positionCode,
					portRegionCode, keywordsSearch, stateCode, imo, markasdeleted, maritimeCodeNext, start, end,
					shipName, callSign);

			JSONArray dataArray = JSONFactoryUtil.createJSONArray(JSONFactoryUtil.looseSerialize(list));

			for (int i = 0; i < dataArray.length(); i++) {
				JSONObject currentObject = dataArray.getJSONObject(i);

				TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(
						currentObject.getLong("documentName"), currentObject.getInt("documentYear"));

				currentObject.put("tenTau", tempDocument.getShipName());
				currentObject.put("hoHieu", tempDocument.getCallSign());
				currentObject.put("imo", tempDocument.getImo());
				currentObject.put("quocTich", tempDocument.getStateCode());
				currentObject.put("daiLy", tempDocument.getNameOfShipownersAgents());

				dataArrayDatal.put(currentObject);

			}

			result.put("data", dataArrayDatal);
			result.put("total", total);
		} catch (Exception e) {
			result.put("data", JSONFactoryUtil.createJSONArray());
			result.put("total", 0);
		}
		return result;
	}

	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		try {

			String actionName = ParamUtil.getString(actionRequest, ActionRequest.ACTION_NAME);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			UploadPortletRequest requestUpload = PortalUtil.getUploadPortletRequest(actionRequest);

			String documentType = ParamUtil.getString(requestUpload, ChuyenDichTrangThaiUtils.DOCUMENT_TYPE, "");

			if (actionName.equals("actionKeToan")) {

				writeJSON(actionRequest, actionResponse, actionKeToan(themeDisplay, requestUpload, actionRequest));

			} else if (actionName.equals("actionKeToanUpdatePayment")) {

				writeJSON(actionRequest, actionResponse,
						actionKeToanUpdatePayment(themeDisplay, requestUpload, actionRequest));

			} else {

				super.processAction(actionRequest, actionResponse);

			}
		} catch (Exception e) {

		}
	}

	private Object actionKeToanUpdatePayment(ThemeDisplay themeDisplay, UploadPortletRequest requestUpload,
			ActionRequest actionRequest) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long documentName = ParamUtil.getLong(requestUpload, "DOCUMENT_NAME", 0);
		int documentYear = ParamUtil.getInteger(requestUpload, "DOCUMENT_YEAR", 0);
		long id = ParamUtil.getLong(requestUpload, "id", 0);
		double totalpayment = ParamUtil.getDouble(requestUpload, "totalpayment", 0);

		PhieuThanhToanUtils.doTempDebitNoteTotalPayment(id, totalpayment, documentName, documentYear,
				themeDisplay.getUser(), requestUpload, actionRequest);

		return result;
	}

	private JSONObject actionKeToan(ThemeDisplay themeDisplay, UploadPortletRequest requestUpload,
			ActionRequest actionRequest) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		long documentName = ParamUtil.getLong(requestUpload, "DOCUMENT_NAME", 0);
		int documentYear = ParamUtil.getInteger(requestUpload, "DOCUMENT_YEAR", 0);
		int markasdeleted = ParamUtil.getInteger(requestUpload, "paymenttype", 0);

		PhieuThanhToanUtils.xacNhanThanhToan(documentName, documentYear, markasdeleted, themeDisplay.getUser(),
				requestUpload, actionRequest);

		return result;
	}
}
