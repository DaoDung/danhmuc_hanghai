package vn.gt.portlet.thutuc;

import java.io.File;
import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.auth.AuthTokenUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import vn.gt.dao.noticeandmessage.model.TempDocument;
import vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil;
import vn.gt.dao.result.model.TempDebitNote;
import vn.gt.dao.result.service.TempDebitNoteLocalServiceUtil;
import vn.gt.payment.keypay.model.KeyPay;
import vn.gt.payment.util.PaymentMgtUtil;
import vn.gt.payment.util.PaymentUrlGenerator;
import vn.gt.portlet.TransportationMVCAction;
import vn.gt.tichhop.report.FileUploadUtils;

public class PayGateAction extends TransportationMVCAction {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse response) throws PortletException, IOException {
		// TODO Auto-generated method stub
		HttpServletRequest request = PortalUtil.getHttpServletRequest(renderRequest);
		HttpServletRequest requestOrg = PortalUtil.getOriginalServletRequest(request);
		HttpServletResponse responeOrg = PortalUtil.getHttpServletResponse(response);
		System.out.println("PayGateAction.render()");
		
		super.render(renderRequest, response);
	}
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {

			String resourceID = resourceRequest.getParameter("callResourceId");
			String idDebit = resourceRequest.getParameter("idDebit");
			String documentname = resourceRequest.getParameter("documentname");
			String documentyear = resourceRequest.getParameter("documentyear");
			String maritimecode = resourceRequest.getParameter("maritimecode");
			
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

			long groupId = themeDisplay.getScopeGroupId();
			
			if (resourceID.equals("renderURLInit")) {

				JSONObject tempDocumentOBJ = JSONFactoryUtil.createJSONObject();
				
				try {
					TempDebitNote tempDebitNote = TempDebitNoteLocalServiceUtil.getByNumberDebit(idDebit);
					
					tempDocumentOBJ.put("auth", AuthTokenUtil.getToken(PortalUtil.getHttpServletRequest(resourceRequest)));
					
					if (String.valueOf(tempDebitNote.getDocumentName()).equalsIgnoreCase(documentname) || 
							String.valueOf(tempDebitNote.getDocumentYear()).equalsIgnoreCase(documentyear)) {
						
						TempDocument tempDocument = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameDocumentYear(tempDebitNote.getDocumentName(), tempDebitNote.getDocumentYear());
						
						System.out.println("PayGateAction.serveResource(tempDocument)" + tempDocument);
						
						tempDocumentOBJ.put("message", true);
						
						tempDocumentOBJ.put("documentName", tempDebitNote.getDocumentName());
						tempDocumentOBJ.put("documentYear", tempDebitNote.getDocumentYear());
						tempDocumentOBJ.put("userCreated", tempDocument.getUserCreated());
						tempDocumentOBJ.put("reportDate", tempDebitNote.getReportdate());
						tempDocumentOBJ.put("content", tempDebitNote.getComments());
						tempDocumentOBJ.put("debitnotenumber", tempDebitNote.getDebitnotenumber());
						tempDocumentOBJ.put("fee", tempDebitNote.getTotalpayment());
						tempDocumentOBJ.put("maritimecode", maritimecode);
						
						String keyPayURL = PaymentUrlGenerator.generateKeyPayURL(tempDebitNote);
						
						tempDocumentOBJ.put("keyPayURL", keyPayURL);
						
						if (tempDebitNote.getMarkasdeleted() == 1 || tempDebitNote.getMarkasdeleted() == 12) {
							tempDocumentOBJ.put("thanhToanDone", true);
						} else {
							tempDocumentOBJ.put("thanhToanDone", false);
						}
						
						
						
					} else {
						tempDocumentOBJ.put("message", false);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					tempDocumentOBJ.put("message", false);
				}
//				api.put("user", user);
				
				writeJSON(resourceRequest, resourceResponse, tempDocumentOBJ);

			} else {

				super.serveResource(resourceRequest, resourceResponse);

			}
		} catch (Exception e) {

			throw new PortletException((Throwable) e);

		}
	}

	public void baoNopAction(ActionRequest actionRequest, ActionResponse actionResponse) {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		UploadPortletRequest requestUpload = PortalUtil.getUploadPortletRequest(actionRequest);
		String idDebit = ParamUtil.getString(requestUpload, "idDebit", "");
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		try {
			TempDebitNote tempDebitNote = TempDebitNoteLocalServiceUtil.getByNumberDebit(idDebit);
			
			tempDebitNote.setMarkasdeleted(11);
			
			TempDebitNoteLocalServiceUtil.updateTempDebitNote(tempDebitNote);
			
			result.put("message", true);
			
			writeJSON(actionRequest, actionResponse, result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				result.put("message", false);
				writeJSON(actionRequest, actionResponse, result);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	
	public void paymentUpload(ActionRequest actionRequest, ActionResponse actionResponse) {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		UploadPortletRequest requestUpload = PortalUtil.getUploadPortletRequest(actionRequest);
		
		String idDebit = ParamUtil.getString(requestUpload, "idDebit", "");
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(TempDebitNote.class.getName(),
					actionRequest);
			
			TempDebitNote tempDebitNote = TempDebitNoteLocalServiceUtil.getByNumberDebit(idDebit);
			
			int ATTACHEDFILE = 0;
			
			String uploadFileName = requestUpload.getFileName("test");
			File uploadFile = requestUpload.getFile("test");
			
			FileEntry fileEntry = FileUploadUtils.uploadFile(themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), ATTACHEDFILE, uploadFile,
					uploadFile.getAbsolutePath(), null, null, serviceContext);
			
			tempDebitNote.setATTACHEDFILE(fileEntry.getFileEntryId());
			tempDebitNote.setMarkasdeleted(12);
			
			TempDebitNoteLocalServiceUtil.updateTempDebitNote(tempDebitNote);
			
			result.put("message", true);
			
			writeJSON(actionRequest, actionResponse, result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				result.put("message", false);
				writeJSON(actionRequest, actionResponse, result);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
