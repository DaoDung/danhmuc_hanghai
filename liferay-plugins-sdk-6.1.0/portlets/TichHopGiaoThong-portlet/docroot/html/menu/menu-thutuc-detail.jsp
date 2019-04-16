<%@page import="vn.gt.portlet.thutuc.ThuTucAction"%>
<%@page import="vn.gt.portlet.thutuc.VanThuAction"%>
<%@page import="vn.gt.portlet.thutuc.LanhDaoAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.impl.TempDocumentImpl"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDocument"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPlantQuarantine"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueAcceptance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePermissionForTransitLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePermissionForTransit"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiXuatCanh"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPassengerList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCargoDeclaration"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8"%>
<%
	String loaiThuTuc = "";
	if (portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE) != null) {
		loaiThuTuc = (String)portletSession.getAttribute(MessageType.LOAT_THU_TUC, PortletSession.APPLICATION_SCOPE);
	}
	
	String pageType = renderRequest.getParameter(PageType.PAGE_TYPE);
	if (pageType == null || pageType.toString().trim().length() == 0) {
		if (renderRequest.getAttribute(PageType.PAGE_TYPE) != null) {
			pageType = renderRequest.getAttribute(PageType.PAGE_TYPE).toString();
		}
	}
	if (pageType == null) {
		pageType = "";
	}
	String documentName = renderRequest.getParameter(PageType.DOCUMENT_NAME);
	String messageType = renderRequest.getParameter(PageType.MESSAGE_TYPE);
	int documentYear = FormatData.convertToInt(renderRequest.getParameter(PageType.DOCUMENT_YEAR));
	
	TempDocument temp = null;
	List<TempDocument> liTempDocuments1234567 = TempDocumentLocalServiceUtil.findTemDocumentByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	if (liTempDocuments1234567 != null && liTempDocuments1234567.size() > 0) {
		temp = liTempDocuments1234567.get(0);
	}
	
	String loaiThuTucBandau = loaiThuTuc;	
	if(loaiThuTuc == MessageType.LOAT_THU_TUC_CHO_DONG_DAU) {		
		LogFactoryUtil.getLog(ThuTucAction.class).info("===loaiThuTucBandau===MessageType.LOAT_THU_TUC_CHO_DONG_DAU======" + MessageType.LOAT_THU_TUC_CHO_DONG_DAU);
		LogFactoryUtil.getLog(ThuTucAction.class).info("===lCode===MessageType.LOAT_THU_TUC_CHO_DONG_DAU======" + temp.getDocumentTypeCode());
		// reset lCode, loaiThuTuc
		loaiThuTuc = temp.getDocumentTypeCode();

	}
	if(loaiThuTuc == MessageType.LOAT_THU_TUC_CHO_KY_SO) {		
		LogFactoryUtil.getLog(ThuTucAction.class).info("===loaiThuTucBandau===MessageType.LOAT_THU_TUC_CHO_KY_SO======" + MessageType.LOAT_THU_TUC_CHO_KY_SO);
		LogFactoryUtil.getLog(ThuTucAction.class).info("===lCode===MessageType.LOAT_THU_TUC_CHO_KY_SO======" + temp.getDocumentTypeCode());
		// reset lCode, loaiThuTuc
		loaiThuTuc = temp.getDocumentTypeCode();

	}
%>
<ul class="danhsachhoso thanhphan">
	<portlet:renderURL var="xemThanhPhanHoSoThuTuc">
		<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
		<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
		<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
		<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(PageType.THANH_PHAN_HO_SO)%>" />
		<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
		<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.thanhphanhoso" />
		<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
	</portlet:renderURL>
	<!-------------------------------------- LOAT_THU_TUC_NHAP_CANH -------------------------------------->
           <h2 class="tlemenu1"><a href="<%=xemThanhPhanHoSoThuTuc.toString() %>"><liferay-ui:message  key="vn.dtt.thutuc.thanhphanhoso" /></a></h2>
           <%
           String imagePathThuTuc = "";
           if (loaiThuTuc.trim().length() == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) {
	           TempShipSecurityMessage results = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	           String thuTucRequestCode = "";
               if (results != null) {
            	   thuTucRequestCode = results.getRequestCode();
               }
	           %>
               <portlet:renderURL var="xemBanKhaiAnNinhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_AN_NINH_TAU_BIEN)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaianninh" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               <%
	           if (results == null) {
	        	   %>
                   <li><a class="black" href="<%=xemBanKhaiAnNinhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaianninh" /></a></li>
                   <%
	           } else {
	        	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_AN_NINH_TAU_BIEN);
                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
	        		   %>
                        <li><a  href="<%=xemBanKhaiAnNinhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaianninh" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>	        		   
	        		   <%
	        	   } else {
	        		   %>
	        		   <li><a href="<%=xemBanKhaiAnNinhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaianninh" /></a></li>
	        		   <%
	        	   }
	           }
               
	           TempCargoDeclaration resultsHangHoa = TempCargoDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	           String thuTucRequestCode1 = "";
               if (resultsHangHoa != null) {
                   thuTucRequestCode1 = resultsHangHoa.getRequestCode();
               }
	               %>
	               <portlet:renderURL var="xemBanKhaiHangHoaTT">
	                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
	                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANG_HOA)%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode1%>" />
	                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaihanghoa" />
	               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
	                <%
	               if (resultsHangHoa == null) {
	                   %>
	                   <li><a class="black" href="<%=xemBanKhaiHangHoaTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /></a></li>
	                   <%
	               } else {
	            	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANG_HOA);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
	                       %>
	                        <li><a  href="<%=xemBanKhaiHangHoaTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
	                       <%
	                   } else {
	                       %>
	                       <li><a  href="<%=xemBanKhaiHangHoaTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /></a></li>
	                       <%
	                   }
	               }

	                //List<TempNoTiceShipMessage> resultsThongBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG);
	                //List<TempNoTiceShipMessage> resultsThongBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
	                TempNoTiceShipMessage resultsThongBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode2 = "";
                if (resultsThongBaoTauDenCang != null) {
                	thuTucRequestCode2 = resultsThongBaoTauDenCang.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemThongBaoTauDenCangTT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode2%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.thongbao" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsThongBaoTauDenCang == null) {
                    %>
                    <li><a class="black" href="<%=xemThongBaoTauDenCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                    <%
                } else {
                	 imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_DEN_CANG);
                     if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemThongBaoTauDenCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemThongBaoTauDenCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                        <%
                    }
                }
                //List<TempNoTiceShipMessage> resultsXacBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG);
                //List<TempNoTiceShipMessage> resultsXacBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
                TempNoTiceShipMessage resultsXacBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.getXacBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode3 = "";
                if (resultsXacBaoTauDenCang != null) {
                    thuTucRequestCode3 = resultsXacBaoTauDenCang.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemXacBaoTauDenCangTT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.XAC_BAO_TAU_DEN_CANG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode3%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.xacbao" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsXacBaoTauDenCang == null) {
                    %>
                    <li><a class="black" href="<%=xemXacBaoTauDenCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.xacbao" /></a></li>
                    <%
                } else {
                    imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.XAC_BAO_TAU_DEN_CANG);
	                if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemXacBaoTauDenCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.xacbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemXacBaoTauDenCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.xacbao" /></a></li>
                        <%
                    }
                }
              
               //List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhThuTuc = IssueShiftingOrderLocalServiceUtil.findIssueShiftingOrderByDocumentYearAndDocumentYear(FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);
               List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhThuTuc = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
               String thuTucRequestCode4 = "";
               if (lIssueShiftingOrdersNhapCanhThuTuc.size() > 0) {
                   thuTucRequestCode4 = lIssueShiftingOrdersNhapCanhThuTuc.get(0).getRequestCode();
                   imagePathThuTuc = CheckBusinessUtil.checkDisplayIconShiftOrder(lIssueShiftingOrdersNhapCanhThuTuc.get(0).getRequestState());
               }
               %>
               <portlet:renderURL var="xemLenhDieuDongTT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.LENH_DIEU_DONG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode4%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.lenhdieudong" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
               if (lIssueShiftingOrdersNhapCanhThuTuc.size() > 0  && imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
            	    %>
            	    <li><a class="dieudong" href="<%=xemLenhDieuDongTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.lenhdieudong" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
            	    <%	
               } else {
            	   %>
                   <li><a class="dieudong" href="<%=xemLenhDieuDongTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.lenhdieudong" /></a></li>
                   <%
               }
                TempGeneralDeclaration resultsBanKhaiChung = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode5 = "";
                if (resultsBanKhaiChung != null) {
                	thuTucRequestCode5 = resultsBanKhaiChung.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChungTT">
                      <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode5%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaichung" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                  <%
                if (resultsBanKhaiChung == null) {
                       %>
                       <li><a class="black" href="<%=xemBanKhaiChungTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                       <%
                   } else {
                	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                           %>
                            <li><a href="<%=xemBanKhaiChungTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                           <%
                       } else {
                           %>
                           <li><a href="<%=xemBanKhaiChungTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                           <%
                       }
                   }
                  
                TempCrewList resultsDsThuyenvien = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode6 = "";
                if (resultsDsThuyenvien != null) {
                	thuTucRequestCode6 = resultsDsThuyenvien.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVienTT">
                      <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode6%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachthuyenvien" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                  <%
                if (resultsDsThuyenvien == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVienTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVienTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVienTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
                  
                TempPassengerList resultsDsHanhKhach = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode7 = "";
                if (resultsDsHanhKhach != null) {
                	thuTucRequestCode7 = resultsDsHanhKhach.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHanhKhachTT">
                      <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode7%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachhanhkhach" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                  <%
                if (resultsDsHanhKhach == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHanhKhachTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHanhKhachTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHanhKhachTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
                  
                TempDangerousGoodsNanifest resultsHangHoaNguyHiem = TempDangerousGoodsNanifestLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode8 = "";
                if (resultsHangHoaNguyHiem != null) {
                    thuTucRequestCode8 = resultsHangHoaNguyHiem.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemHangHoaNguyHiemTT">
                      <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode8%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.hanghoanguyhiem" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                  <%
                if (resultsHangHoaNguyHiem == null) {
                    %>
                    <li><a class="black" href="<%=xemHangHoaNguyHiemTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanghoanguyhiem" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemHangHoaNguyHiemTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanghoanguyhiem" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemHangHoaNguyHiemTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanghoanguyhiem" /></a></li>
                        <%
                    }
                }
                TempShipStoresDeclaration resultsBanKhaiDuTru = TempShipStoresDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode9 = "";
                if (resultsBanKhaiDuTru != null) {
                    thuTucRequestCode9 = resultsBanKhaiDuTru.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiDuTruTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DU_TRU_CUA_TAU)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode9%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaidutru" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                <%
                if (resultsBanKhaiDuTru == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiDuTruTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaidutru" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DU_TRU_CUA_TAU);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiDuTruTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaidutru" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiDuTruTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaidutru" /></a></li>
                        <%
                    }
                }
                TempCrewEffectsDeclaration resultsHanhLyThuyenVien = TempCrewEffectsDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode10 = "";
                if (resultsHanhLyThuyenVien != null) {
                	thuTucRequestCode10 = resultsHanhLyThuyenVien.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemHanhLyThuyenVienTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode10%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.hanhlythuyenvien" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                <%
                if (resultsHanhLyThuyenVien == null) {
                    %>
                    <li><a class="black" href="<%=xemHanhLyThuyenVienTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanhlythuyenvien" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemHanhLyThuyenVienTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanhlythuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemHanhLyThuyenVienTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanhlythuyenvien" /></a></li>
                        <%
                    }
                }
                
                TempDeclarationOfHealth resultsYTeHangHai = TempDeclarationOfHealthLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode11 = "";
                if (resultsYTeHangHai != null) {
                	thuTucRequestCode11 = resultsYTeHangHai.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiYTeHangHaiTT">
                      <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode11%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.khaibaoytehanghai" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                  <%
                if (resultsYTeHangHai == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiYTeHangHaiTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.khaibaoytehanghai" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiYTeHangHaiTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.khaibaoytehanghai" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiYTeHangHaiTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.khaibaoytehanghai" /></a></li>
                        <%
                    }
                }
                  
                TempPlantQuarantine resultsKiemDichThucVat = TempPlantQuarantineLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode12 = "";
                if (resultsKiemDichThucVat != null) {
                    thuTucRequestCode12 = resultsKiemDichThucVat.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemKiemDichThucVatTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode12%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.kiemdichthucvat" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                <%
                if (resultsKiemDichThucVat == null) {
                    %>
                    <li><a class="black" href="<%=xemKiemDichThucVatTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.kiemdichthucvat" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemKiemDichThucVatTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.kiemdichthucvat" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemKiemDichThucVatTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.kiemdichthucvat" /></a></li>
                        <%
                    }
                }
                
               TempAnimalQuarantine resultsKiemDichDongVat = TempAnimalQuarantineLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
               String thuTucRequestCode13 = "";
               if (resultsKiemDichDongVat != null) {
            	   thuTucRequestCode13 = resultsKiemDichDongVat.getRequestCode();
               }
                %>
                <portlet:renderURL var="xemKiemDichDongVatTT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode13%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.kiemdichdongvat" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsKiemDichDongVat == null) {
                    %>
                    <li><a class="black" href="<%=xemKiemDichDongVatTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.kiemdichdongvat" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemKiemDichDongVatTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.kiemdichdongvat" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemKiemDichDongVatTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.kiemdichdongvat" /></a></li>
                        <%
                    }
                }
               %>
               <portlet:renderURL var="xemGiayToPhaiXuatTrinhNhapCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaytophaixuattrinh" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               <li><a href="<%=xemGiayToPhaiXuatTrinhNhapCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaytophaixuattrinh" /></a></li>

               <portlet:renderURL var="xemKetQuaPheDuyetNhapCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.ketquapheduyet" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               
<%
                if (loaiThuTucBandau.equals(MessageType.LOAT_THU_TUC_CHO_DONG_DAU) || loaiThuTucBandau.equals(MessageType.LOAT_THU_TUC_CHO_KY_SO)) {
                	// Khong hien thi Ket qua phe duyet khi ky so, dong dau lenh dieu dong
                    %>
                    
                    <%
                    } else {
                        %>
                        <li><a class="xuattrinh" href="<%=xemKetQuaPheDuyetNhapCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.ketquapheduyet" /></a></li>
                        <%
                    }
               %>

	<!-------------------------- #LOAT_THU_TUC_XUAT_CANH ----------------------------->
	<%
	} else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0) {
		
		//List<TempNoTiceShipMessage> resultsThongBaoTauDenCang1 = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAnddocumentYear(FormatData.convertToLong(documentName), documentYear);
		//List<TempNoTiceShipMessage> resultsThongBaoTauDenCang1 = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
		TempNoTiceShipMessage resultsThongBaoTauDenCang1 = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode21 = "";
                if (resultsThongBaoTauDenCang1 != null) {
                	thuTucRequestCode21 = resultsThongBaoTauDenCang1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemThongBaoTauRoiCangTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_ROI_CANG)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode21%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.thongbao" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                <%
                if (resultsThongBaoTauDenCang1 == null) {
                    %>
                    <li><a class="black" href="<%=xemThongBaoTauRoiCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_ROI_CANG);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemThongBaoTauRoiCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemThongBaoTauRoiCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                        <%
                    }
                }
                
                
                TempGeneralDeclaration resultsBanKhaiChung1 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode22 = "";
                if (resultsBanKhaiChung1 != null) {
                    thuTucRequestCode22 = resultsBanKhaiChung1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChung1TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode22%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaichung" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsBanKhaiChung1 == null) {
                       %>
                       <li><a class="black" href="<%=xemBanKhaiChung1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                       <%
                   } else {
                	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
                       if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                           %>
                            <li><a href="<%=xemBanKhaiChung1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                           <%
                       } else {
                           %>
                           <li><a href="<%=xemBanKhaiChung1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                           <%
                       }
                   }
                 
                 
                TempCrewList resultsDsThuyenvien1 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode23 = "";
                if (resultsDsThuyenvien1 != null) {
                	thuTucRequestCode23 = resultsDsThuyenvien1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVien1TT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode23%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachthuyenvien" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                <%
                if (resultsDsThuyenvien1 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVien1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVien1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVien1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
                
                TempPassengerList resultsDsHanhKhach1 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode24 = "";
                if (resultsDsHanhKhach1 != null) {
                	thuTucRequestCode24 = resultsDsHanhKhach1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHanhKhach1TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode24%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachhanhkhach" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsDsHanhKhach1 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHanhKhach1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHanhKhach1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHanhKhach1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
                 
	               TempCargoDeclaration resultsHangHoa1 = TempCargoDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	               String thuTucRequestCode25 = "";
	                if (resultsHangHoa1 != null) {
	                	thuTucRequestCode25 = resultsHangHoa1.getRequestCode();
	                }
	               %>
	               <portlet:renderURL var="xemBanKhaiHangHoa1TT">
	                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
	                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANG_HOA)%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode25%>" />
	                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaihanghoa" />
	               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
	                <%
	               if (resultsHangHoa1 == null) {
	                   %>
	                   <li><a class="black" href="<%=xemBanKhaiHangHoa1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /></a></li>
	                   <%
	               } else {
	            	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANG_HOA);
	                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
	                       %>
	                        <li><a  href="<%=xemBanKhaiHangHoa1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
	                       <%
	                   } else {
	                       %>
	                       <li><a  href="<%=xemBanKhaiHangHoa1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /></a></li>
	                       <%
	                   }
	               }
	                
                TempShipStoresDeclaration resultsBanKhaiDuTru1 = TempShipStoresDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode26 = "";
                if (resultsBanKhaiDuTru1 != null) {
                	thuTucRequestCode26 = resultsBanKhaiDuTru1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiDuTru1TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DU_TRU_CUA_TAU)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode26%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaidutru" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsBanKhaiDuTru1 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiDuTru1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaidutru" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DU_TRU_CUA_TAU);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiDuTru1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaidutru" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiDuTru1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaidutru" /></a></li>
                        <%
                    }
                }
               //Ban khai hanh ly hanh khach ko co giao dien thiet ke 
                //TempCrewEffectsDeclaration resultsHanhLyHanhKhach1 = TempCrewEffectsDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
               TempCrewEffectsDeclaration resultsHanhLyHanhKhach1 = null;
                String thuTucRequestCode27 = "";
                if (resultsHanhLyHanhKhach1 != null) {
                	thuTucRequestCode27 = resultsHanhLyHanhKhach1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiHanhLyHanhKhach1TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANH_LY_HANH_KHACH_ROI_TAU)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode27%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.hanhlyhanhkhachroitau" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                <%
                if (resultsHanhLyHanhKhach1 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiHanhLyHanhKhach1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanhlyhanhkhachroitau" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANH_LY_HANH_KHACH_ROI_TAU);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiHanhLyHanhKhach1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanhlyhanhkhachroitau" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiHanhLyHanhKhach1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.hanhlyhanhkhachroitau" /></a></li>
                        <%
                    }
                }
                %>
               <portlet:renderURL var="xemGiayToPhaiXuatTrinhXuatCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaytophaixuattrinh" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               <li><a href="<%=xemGiayToPhaiXuatTrinhXuatCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaytophaixuattrinh" /></a></li>
               
               <portlet:renderURL var="xemKetQuaPheDuyetXuatCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.ketquapheduyetxuatcanh" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               <li><a class="xuattrinh" href="<%=xemKetQuaPheDuyetXuatCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.ketquapheduyetxuatcanh" /></a></li>
               
               
               <%
               List<IssuePortClearance> lstPortClearances = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
               String thuTucRequestCode28 = "";
               if (lstPortClearances.size() > 0) {
            	   thuTucRequestCode28 = lstPortClearances.get(0).getRequestCode();
            	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIconPortClearance(lstPortClearances.get(0).getRequestState());
               }
               
               LogFactoryUtil.getLog(ThuTucAction.class).info("==menu-thutuc-detail.jsp==MENU LEFE THU TUC==REQUEST CODE==" + thuTucRequestCode28);
               %>
               <portlet:renderURL var="xemGiayPhepRoiCang1TT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode28%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicang" />
               		<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
               </portlet:renderURL>
               <%
               if (lstPortClearances != null && lstPortClearances.size() > 0  && imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                   %>
                   <li><a class="dieudong" href="<%=xemGiayPhepRoiCang1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                    <%
               } else {
                   %>
                   <li><a class="black" href="<%=xemGiayPhepRoiCang1TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicang" /></a></li>
                    <%
               }
	//--------------------------- loat thu tuc qua canh -----------------------------
	} else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0) {
		
		TempShipSecurityMessage results2 = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String thuTucRequestCode31 = "";
		if (results2 != null) {
			thuTucRequestCode31 = results2.getRequestCode();
		}
		%>
	<!--------------------------- LOAT_THU_TUC_QUA_CANH --------------------------->
               <portlet:renderURL var="xemBanKhaiAnNinh2TT">
                   <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                   <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                   <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                   <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_AN_NINH_TAU_BIEN)%>" />
                   <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                   <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode31%>" />
                   <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaianninh" />
              <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
              <%
	           if (results2 == null) {
	        	   %>
                   <li><a class="black" href="<%=xemBanKhaiAnNinh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaianninh" /></a></li>
                   <%
	           } else {
	        	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_AN_NINH_TAU_BIEN);
                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
	        		   %>
                        <li><a  href="<%=xemBanKhaiAnNinh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaianninh" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>	        		   
	        		   <%
	        	   } else {
	        		   %>
	        		   <li><a href="<%=xemBanKhaiAnNinh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaianninh" /></a></li>
	        		   <%
	        	   }
	           }
              
	               TempCargoDeclaration resultsHangHoa2 = TempCargoDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	               String thuTucRequestCode32 = "";
	               if (resultsHangHoa2 != null) {
	            	   thuTucRequestCode32 = resultsHangHoa2.getRequestCode();
	               }
	               %>
	                <portlet:renderURL var="xemBanKhaiHangHoa2TT">
	                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
	                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANG_HOA)%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode32%>" />
	                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaihanghoa" />
	               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
	                <%
	               if (resultsHangHoa2 == null) {
	                   %>
	                   <li><a class="black" href="<%=xemBanKhaiHangHoa2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /></a></li>
	                   <%
	               } else {
	            	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANG_HOA);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
	                       %>
	                        <li><a  href="<%=xemBanKhaiHangHoa2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
	                       <%
	                   } else {
	                       %>
	                       <li><a  href="<%=xemBanKhaiHangHoa2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaihanghoa" /></a></li>
	                       <%
	                   }
	               }
	            
                //List<TempNoTiceShipMessage> resultsThongBaoTauDenCang2 = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG);
                //List<TempNoTiceShipMessage> resultsThongBaoTauDenCang2 = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
                TempNoTiceShipMessage resultsThongBaoTauDenCang2 = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode33 = "";
                if (resultsThongBaoTauDenCang2 != null) {
                    thuTucRequestCode33 = resultsThongBaoTauDenCang2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemThongBaoTauQuaCanh2TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_QUA_CANH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode33%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.thongbao" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsThongBaoTauDenCang2 == null) {
                    %>
                    <li><a class="black" href="<%=xemThongBaoTauQuaCanh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_QUA_CANH);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemThongBaoTauQuaCanh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemThongBaoTauQuaCanh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                        <%
                    }
                }
                 
                 
                //List<TempNoTiceShipMessage> resultsXacBaoTauDenCang2 = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG);
                //List<TempNoTiceShipMessage> resultsXacBaoTauDenCang2 = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
                TempNoTiceShipMessage resultsXacBaoTauDenCang2 = TempNoTiceShipMessageLocalServiceUtil.getXacBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode34 = "";
                if (resultsXacBaoTauDenCang2 != null) {
                    thuTucRequestCode34 = resultsXacBaoTauDenCang2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemXacBaoTauQuaCanh2TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.XAC_BAO_TAU_QUA_CANH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode34%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.xacbao" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsXacBaoTauDenCang2 == null) {
                    %>
                    <li><a class="black" href="<%=xemXacBaoTauQuaCanh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.xacbao" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.XAC_BAO_TAU_QUA_CANH);
                    if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemXacBaoTauQuaCanh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.xacbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemXacBaoTauQuaCanh2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.xacbao" /></a></li>
                        <%
                    }
                }
                 
                 
                //List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhThuTuc2 = IssueShiftingOrderLocalServiceUtil.findIssueShiftingOrderByDocumentYearAndDocumentYear(FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);
                List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhThuTuc2 = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
                String thuTucRequestCode35 = "";
                if (lIssueShiftingOrdersNhapCanhThuTuc2.size() > 0) {
                	thuTucRequestCode35 = lIssueShiftingOrdersNhapCanhThuTuc2.get(0).getRequestCode();
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconShiftOrder(lIssueShiftingOrdersNhapCanhThuTuc2.get(0).getRequestState());
                }
                %>
                <portlet:renderURL var="xemLenhDieuDong2TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.LENH_DIEU_DONG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode35%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.lenhdieudong" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (lIssueShiftingOrdersNhapCanhThuTuc2.size() > 0 && imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                     %>
                     <li><a class="dieudong" href="<%=xemLenhDieuDong2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.lenhdieudong" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                     <%  
                } else {
                    %>
                    <li><a class="dieudong" href="<%=xemLenhDieuDong2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.lenhdieudong" /></a></li>
                    <%
                }
                 
                 
                TempGeneralDeclaration resultsBanKhaiChung2 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode36 = "";
                if (resultsBanKhaiChung2 != null) {
                    thuTucRequestCode36 = resultsBanKhaiChung2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChung2TT">
                      <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode36%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaichung" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                  <% 
                if (resultsBanKhaiChung2 == null) {
                       %>
                       <li><a class="black" href="<%=xemBanKhaiChung2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                       <%
                   } else {
                	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                           %>
                            <li><a href="<%=xemBanKhaiChung2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                           <%
                       } else {
                           %>
                           <li><a href="<%=xemBanKhaiChung2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                           <%
                       }
                   }
                  
                  
                TempCrewList resultsDsThuyenvien2 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode37 = "";
                if (resultsDsThuyenvien2 != null) {
                	thuTucRequestCode37 = resultsDsThuyenvien2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVien2TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode37%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachthuyenvien" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsDsThuyenvien2 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVien2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVien2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVien2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
                 
                TempPassengerList resultsDsHanhKhach2 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String thuTucRequestCode38 = "";
                if (resultsDsHanhKhach2 != null) {
                	thuTucRequestCode38 = resultsDsHanhKhach2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHachKhach2TT">
                     <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode38%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachhanhkhach" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
                 <%
                if (resultsDsHanhKhach2 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHachKhach2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
	                   if (imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHachKhach2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHachKhach2TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
               %>
               <portlet:renderURL var="xemGiayToPhaiXuatTrinhQuaCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachhanhkhach" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               
               <li><a href="<%=xemGiayToPhaiXuatTrinhQuaCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaytophaixuattrinh" /></a></li>
               
               
               <portlet:renderURL var="xemKetQuaPheDuyetQuaCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaytophaixuattrinh" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               
               
               <%
                if (loaiThuTucBandau.equals(MessageType.LOAT_THU_TUC_CHO_DONG_DAU) || loaiThuTucBandau.equals(MessageType.LOAT_THU_TUC_CHO_KY_SO)) {
                	// Khong hien thi Ket qua phe duyet khi ky so, dong dau lenh dieu dong
                	List<IssueShiftingOrder> listShiftingOrd = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
                	if (listShiftingOrd.size() > 0) {
					if ((temp.getRequestState() == 14 && listShiftingOrd.get(0).getStampStatus() == 0 && listShiftingOrd.get(0).getIsApproval() == 0)
					|| (temp.getRequestState() == 14 && listShiftingOrd.get(0).getStampStatus() == 1 )) {
						// Khong hien thi Ket qua phe duyet khi chua cap lenh dieu dong
					} else { 
					    %>   
					    <li><a class="xuattrinh" href="<%=xemKetQuaPheDuyetQuaCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.ketquapheduyet" /></a></li>
					<%
					} }else { // Khong hien thi Ket qua phe duyet khi chua cap lenh dieu dong
					    %>                   
                    <%
                    } }else {
                        %>
                        <li><a class="xuattrinh" href="<%=xemKetQuaPheDuyetQuaCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.ketquapheduyet" /></a></li>
                        <%
                    }
               %>
               
               <%
               List<IssuePermissionForTransit> lstPerForTransitQuaCanh = IssuePermissionForTransitLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
               String thuTucRequestCode39 = "";
               if (lstPerForTransitQuaCanh.size() > 0) {
            	   thuTucRequestCode39 = lstPerForTransitQuaCanh.get(0).getRequestCode();
            	   imagePathThuTuc = CheckBusinessUtil.checkDisplayIconPerForTransit(lstPerForTransitQuaCanh.get(0).getRequestState());
               }
               LogFactoryUtil.getLog(ThuTucAction.class).info("==menu-thutuc-detail.jsp==1150==MENU LEFE THU TUC==REQUEST CODE==" + thuTucRequestCode39);
               %>
               <portlet:renderURL var="xemGiayPhepRoiCangQuaCanhTT">
                    <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_QUA_CANH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thuTucRequestCode39%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giayphepquacanh" />
               <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
               <%
               if (lstPerForTransitQuaCanh != null && lstPerForTransitQuaCanh.size() > 0 && imagePathThuTuc != null && imagePathThuTuc.trim().length() > 0) {
                   %>
                   <li><a class="dieudong phandoan" href="<%=xemGiayPhepRoiCangQuaCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giayphepquacanh" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                    <%
               } else {
                   %>
                   <li><a href="<%=xemGiayPhepRoiCangQuaCanhTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giayphepquacanh" /></a></li>
                    <%
               }
               
               
         //TODO ----------- loat thu tuc vao cang
       }else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
           TempShipSecurityMessage results3 = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
           String thutucRequestCode31 = "";
           if (results3 != null) {
               thutucRequestCode31 = results3.getRequestCode();
           }

            TempNoTiceShipMessage resultsThongBaoTauVaoCang = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode334 = "";
			String magiaypheproicangcuoi = "";            
            
            if (resultsThongBaoTauVaoCang != null) {
                thutucRequestCode334 = resultsThongBaoTauVaoCang.getRequestCode();
                if (resultsThongBaoTauVaoCang.getRemarks().trim().length() > 0) {
                	magiaypheproicangcuoi = resultsThongBaoTauVaoCang.getRemarks().trim();
                }
            }
            %>
            <portlet:renderURL var="xemThongBaoTauVaoCangTT">
                 <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                 <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                 <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                 <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)%>" />
                 <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                 <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode334%>" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                 <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.thongbao" />
            </portlet:renderURL>
             <%
            if (resultsThongBaoTauVaoCang == null) {
                %>
                <li><a class="black" href="<%=xemThongBaoTauVaoCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_DEN_CANG);
                if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemThongBaoTauVaoCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemThongBaoTauVaoCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.thongbao" /></a></li>
                    <%
                }
            }
                
            TempDocument tempDocument = TempDocumentLocalServiceUtil.getByDocumentNameAndDocumentYear(Long.valueOf(documentName), documentYear);
            String tenTau = "";
            String hoHieu = "";
            String rcRequestCode = "";
            
            IssuePortClearance issuePortClearance = null;
            
            long rcDocumentName= 0;
            int rcDocumentYear= 0;
            
            if(tempDocument!=null) {
            	//System.out.println("=====tempDocument!======== khac null");
            	
            	
            	tenTau = tempDocument.getShipName();
            	hoHieu = tempDocument.getCallSign();
            	if (magiaypheproicangcuoi.length() > 0){
            		issuePortClearance = IssuePortClearanceLocalServiceUtil.findLatestCertificateOfIssuePortClearance(tenTau, hoHieu, magiaypheproicangcuoi);	
            	}
            	
           		if(issuePortClearance != null) {
           			rcRequestCode = issuePortClearance.getRequestCode();
           			rcDocumentName = issuePortClearance.getDocumentName();
           			rcDocumentYear = issuePortClearance.getDocumentYear();
           		}
            }
                %>
                
			<portlet:renderURL var="xemgiaypheproicangcuoi"> 
				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
				<portlet:param name="<%=PageType.DOCUMENT_NAME_VIEW_RCC %>" value="<%=String.valueOf(rcDocumentName)%>" />
				
				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
				<portlet:param name="<%=PageType.DOCUMENT_YEAR_VIEW_RCC %>" value="<%=String.valueOf(rcDocumentYear)%>" />
				
				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)%>" />
				<portlet:param name="<%=PageType.MESSAGE_TYPE_VIEW_RCC %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)%>" />
				
				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE_VIEW_RCC) %>" value="<%=rcRequestCode%>" /> 
				
				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			
				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />

				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicangcuoi" /> 
			</portlet:renderURL>
			
			<%
			if (issuePortClearance == null) {
				%>
				<portlet:renderURL var="xemgiaypheproicangcuoiBlank"> 
					<portlet:param name="jspPage" value="/html/kehoach/view.jsp" /> 
					<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicangcuoi" /> 
				</portlet:renderURL> 
				<li><a class="black" onclick="thongbao()" href="<%=xemThanhPhanHoSoThuTuc.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicangcuoi" /></a></li>
                <%
			} else {
				%>
				<li><a href="<%=xemgiaypheproicangcuoi.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicangcuoi" /></a></li>
				<%
                } 
            
            List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhThuTuc3 = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
            String thutucRequestCode35 = "";
            if (lIssueShiftingOrdersNhapCanhThuTuc3.size() > 0) {
                thutucRequestCode35 = lIssueShiftingOrdersNhapCanhThuTuc3.get(0).getRequestCode();
                imagePathThuTuc = CheckBusinessUtil.checkDisplayIconShiftOrder(lIssueShiftingOrdersNhapCanhThuTuc3.get(0).getRequestState());
            }
            %>
            <portlet:renderURL var="xemLenhDieuDongTT3">
                 <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                 <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                 <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                 <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.LENH_DIEU_DONG)%>" />
                 <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                 <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode35%>" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                 <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.lenhdieudong" />
            </portlet:renderURL>
             <%
            if (lIssueShiftingOrdersNhapCanhThuTuc3.size() > 0 && imagePathThuTuc.trim().length() > 0) {
                 %>
                 <li><a class="dieudong" href="<%=xemLenhDieuDongTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.lenhdieudong" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
                 <%
            } else {
                %>
                <li><a class="dieudong" href="<%=xemLenhDieuDongTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.lenhdieudong" /></a></li>
                <%
            }
          
           	TempGeneralDeclaration resultsBanKhaiChung3 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode36 = "";
            if (resultsBanKhaiChung3 != null) {
                thutucRequestCode36 = resultsBanKhaiChung3.getRequestCode();
            }
            %>
            <portlet:renderURL var="xemBanKhaiChungTT3">
                  <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                  <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                  <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                  <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                  <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                  <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode36%>" />
                  <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                  <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaichung" />
             </portlet:renderURL>
              <%
            if (resultsBanKhaiChung3 == null) {
                %>
                <li><a class="black" href="<%=xemBanKhaiChungTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
                   if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemBanKhaiChungTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemBanKhaiChungTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                    <%
                }
            }
           
            TempCrewList resultsDsThuyenvien3 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode41 = "";
            if (resultsDsThuyenvien3 != null) {
                thutucRequestCode41 = resultsDsThuyenvien3.getRequestCode();
            }
            %>
            <portlet:renderURL var="xemDanhSachThuyenVienTT3">
                 <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                 <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                 <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                 <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                 <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                 <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode41%>" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                 <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachthuyenvien" />
            </portlet:renderURL>
             <%
            if (resultsDsThuyenvien3 == null) {
                %>
                <li><a class="black" href="<%=xemDanhSachThuyenVienTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
                   if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemDanhSachThuyenVienTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemDanhSachThuyenVienTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                    <%
                }
            }
           
            TempPassengerList resultsDsHanhKhach3 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode51 = "";
            if (resultsDsHanhKhach3 != null) {
                thutucRequestCode51 = resultsDsHanhKhach3.getRequestCode();
            }
            %>
            <portlet:renderURL var="xemDanhSachHanhKhachTT3">
                 <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                 <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                 <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                 <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                 <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                 <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode51%>" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                 <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachhanhkhach" />
            </portlet:renderURL>
             <%
            if (resultsDsHanhKhach3 == null) {
                %>
                <li><a class="black" href="<%=xemDanhSachHanhKhachTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
                   if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemDanhSachHanhKhachTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemDanhSachHanhKhachTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                    <%
                }
            }
             %>
             <portlet:renderURL var="xemGiayToPhaiXuatTrinhVaoCangTT3">
                <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.cacgiaytoxuattrinh" />
           	</portlet:renderURL>			
           	<li><a href="<%=xemGiayToPhaiXuatTrinhVaoCangTT3.toString() %>"><liferay-ui:message  key="vn.dtt.thutuc.cacgiaytoxuattrinh" /></a></li>
          
             <portlet:renderURL var="xemKetQuaPheDuyetVaoCangTT3">
	             <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
	             <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	             <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	             <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)%>" />
	             <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	             <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.ketquapheduyet" />
	        	<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
	        </portlet:renderURL>
	        <%
                if (loaiThuTucBandau.equals(MessageType.LOAT_THU_TUC_CHO_DONG_DAU) || loaiThuTucBandau.equals(MessageType.LOAT_THU_TUC_CHO_KY_SO)) {
                	// Khong hien thi Ket qua phe duyet khi ky so, dong dau lenh dieu dong
                    %>
                    
                    <%
                    } else {
                        %>
                        <li><a class="xuattrinh" href="<%=xemKetQuaPheDuyetVaoCangTT3.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.ketquapheduyet" /></a></li>
                        <%
                    }
               %>
	        
	        
             <%
       //----------- loat thu tuc roi cang
       }else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0 ||
    		   loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 ||
    		   loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0) {
/*            TempShipSecurityMessage results4 = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
           String thutucRequestCode31 = "";
           if (results4 != null) {
               thutucRequestCode31 = results4.getRequestCode();
           } */

           	TempGeneralDeclaration resultsBanKhaiChung4 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode36 = "";
            if (resultsBanKhaiChung4 != null) {
                thutucRequestCode36 = resultsBanKhaiChung4.getRequestCode();
            }
            %>
            <portlet:renderURL var="xemBanKhaiChungTT4">
                  <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                  <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                  <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                  <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                  <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                  <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode36%>" />
                  <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                  <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.bankhaichung" />
             </portlet:renderURL>
              <%
            if (resultsBanKhaiChung4 == null) {
                %>
                <li><a class="black" href="<%=xemBanKhaiChungTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
                   if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemBanKhaiChungTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemBanKhaiChungTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.bankhaichung" /></a></li>
                    <%
                }
            }
           
              
            TempCrewList resultsDsThuyenvien4 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode41 = "";
            if (resultsDsThuyenvien4 != null) {
                thutucRequestCode41 = resultsDsThuyenvien4.getRequestCode();
            }
            %>
            <portlet:renderURL var="xemDanhSachThuyenVienTT4">
                 <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                 <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                 <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                 <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                 <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                 <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode41%>" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                 <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachthuyenvien" />
            </portlet:renderURL>
             <%
            if (resultsDsThuyenvien4 == null) {
                %>
                <li><a class="black" href="<%=xemDanhSachThuyenVienTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
                   if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemDanhSachThuyenVienTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemDanhSachThuyenVienTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachthuyenvien" /></a></li>
                    <%
                }
            }
           
             
            TempPassengerList resultsDsHanhKhach4 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
            String thutucRequestCode51 = "";
            if (resultsDsHanhKhach4 != null) {
                thutucRequestCode51 = resultsDsHanhKhach4.getRequestCode();
            }
            %>
            <portlet:renderURL var="xemDanhSachHanhKhachTT4">
                 <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                 <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                 <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                 <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                 <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                 <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode51%>" />
                 <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                 <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.danhsachhanhkhach" />
            </portlet:renderURL>
             <%
            if (resultsDsHanhKhach4 == null) {
                %>
                <li><a class="black" href="<%=xemDanhSachHanhKhachTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                <%
            } else {
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
                   if (imagePathThuTuc.trim().length() > 0) {
                    %>
                     <li><a href="<%=xemDanhSachHanhKhachTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>                     
                    <%
                } else {
                    %>
                    <li><a href="<%=xemDanhSachHanhKhachTT4.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.danhsachhanhkhach" /></a></li>
                    <%
                }
            }
          // SONVH Giay phep vao cang PTTND - chua lam 
 			List<IssueAcceptance> liIssueAcceptance80 = new ArrayList <IssueAcceptance>();
 			String thutucRequestCode80 = "";
             if (liIssueAcceptance80 != null && liIssueAcceptance80.size() > 0) {
            	 thutucRequestCode80 = liIssueAcceptance80.get(0).getRequestCode();
             	imagePathThuTuc = CheckBusinessUtil.checkDisplayIcon(liIssueAcceptance80.get(0).getRequestState());
             }
 			%>
 			
 			<portlet:renderURL var="xemThongBaoDulieuPTTND4ThuTuc">
 				<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
 				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
 				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
 				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_CHO_PHEP_TAU_QUA_CANH)%>" />
 				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
 				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode80%>" />
 				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
 				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.dulieupttnd" />
 			</portlet:renderURL>
 			
 			<%
 			
 			if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0 ) {
 				if (liIssueAcceptance80 != null && liIssueAcceptance80.size() > 0 && imagePathThuTuc.trim().length() > 0) {
 				%>
 				<li><a class="dieudong" href="<%=xemThongBaoDulieuPTTND4ThuTuc.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.dulieupttnd" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
 				<%
 			} else {
 				%>
 				<li><a class="black" href="<%=xemThongBaoDulieuPTTND4ThuTuc.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.dulieupttnd" /></a></li>
 			<%   					
 		         }
 			}
             
             %>
             <%
           
           TempDocument tempDocument = TempDocumentLocalServiceUtil.getByDocumentNameAndDocumentYear(Long.valueOf(documentName), documentYear);
           String tenTau = "";
           String hoHieu = "";
           String rcRequestCode = "";
           
           IssuePortClearance issuePortClearance = null;
           
           long rcDocumentName= 0;
           int rcDocumentYear= 0;
           
           if(tempDocument!=null) {
           	//System.out.println("=====tempDocument!======== khac null");
           	
           	
           	tenTau = tempDocument.getShipName();
           	hoHieu = tempDocument.getCallSign();
           	
           	issuePortClearance = IssuePortClearanceLocalServiceUtil.findLastestIssuePortClearanceByPortNameAndCallSign(tenTau, hoHieu);
          		if(issuePortClearance != null) {
          			rcRequestCode = issuePortClearance.getRequestCode();
          			rcDocumentName = issuePortClearance.getDocumentName();
          			rcDocumentYear = issuePortClearance.getDocumentYear();
          		}
           }
               %>
               
			<portlet:renderURL var="xemgiaypheproicangcuoiPTTND"> 
				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
				<portlet:param name="<%=PageType.DOCUMENT_NAME_VIEW_RCC %>" value="<%=String.valueOf(rcDocumentName)%>" />
				
				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
				<portlet:param name="<%=PageType.DOCUMENT_YEAR_VIEW_RCC %>" value="<%=String.valueOf(rcDocumentYear)%>" />
				
				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)%>" />
				<portlet:param name="<%=PageType.MESSAGE_TYPE_VIEW_RCC %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)%>" />
				
				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE_VIEW_RCC) %>" value="<%=rcRequestCode%>" /> 
				
				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			
				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />

				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicangcuoi" /> 
			</portlet:renderURL>
			
			<%
			if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 ) {
			if (issuePortClearance == null) {
				%>
				<portlet:renderURL var="xemgiaypheproicangcuoiPTTNDBlank"> 
					<portlet:param name="jspPage" value="/html/kehoach/view.jsp" /> 
					<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicangcuoi" /> 
				</portlet:renderURL> 
				<li><a class="black" onclick="thongbao()" href="<%=xemThanhPhanHoSoThuTuc.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicangcuoi" /></a></li>
               <%
			} else {
				%>
				<li><a href="<%=xemgiaypheproicangcuoiPTTND.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicangcuoi" /></a></li>
				<%
               } 
			}
           %>
             <portlet:renderURL var="xemGiayToPhaiXuatTrinhRoiCangTT4">
                <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
                <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.cacgiaytoxuattrinh" />
           </portlet:renderURL>

           <li><a href="<%=xemGiayToPhaiXuatTrinhRoiCangTT4.toString() %>"><liferay-ui:message  key="vn.dtt.thutuc.cacgiaytoxuattrinh" /></a></li>
           
           
          
            <portlet:renderURL var="xemKetQuaPheDuyetRoiCangTT">
	             <portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
	             <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	             <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	             <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_XAC_NHAN_HOAN_THANH_THU_TUC)%>" />
	             <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	             <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.ketquapheduyet" />
	        <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" /></portlet:renderURL>
	        <li><a class="xuattrinh" href="<%=xemKetQuaPheDuyetRoiCangTT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.ketquapheduyet" /></a></li>
             
            <%
                            
           List<IssuePortClearance> lstPortClearances = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
           String thutucRequestCode24 = "";
           if (lstPortClearances != null && lstPortClearances.size() > 0) {
               thutucRequestCode24 = lstPortClearances.get(0).getRequestCode();
               imagePathThuTuc = CheckBusinessUtil.checkDisplayIconPortClearance(lstPortClearances.get(0).getRequestState());
           }
           %>
			<portlet:renderURL var="xemGiayPhepRoiCang4TT">
				<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)%>" />
				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode24%>" />
				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicang" />
			</portlet:renderURL>
			<%
			
			if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) {
			if (lstPortClearances != null && lstPortClearances.size() > 0 && imagePathThuTuc.trim().length() > 0) {
				%>
				<li><a class="dieudong" href="<%=xemGiayPhepRoiCang4TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
				<%
			} else {
				%>
				<li><a class="black" href="<%=xemGiayPhepRoiCang4TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicang" /></a></li>
				<%
       			}
			}
			
			List<IssuePortClearance> liIssuePortClearances61 = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
            String thutucRequestCode61 = "";
            if (liIssuePortClearances61 != null && liIssuePortClearances61.size() > 0) {
            	thutucRequestCode61 = liIssuePortClearances61.get(0).getRequestCode();
         	  	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconPortClearance(liIssuePortClearances61.get(0).getRequestState());
            }
      	        %>
      	        
		   	<portlet:renderURL var="xemGiayPhepPTTNDRoiCang4TT">
				<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)%>" />
				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode61%>" />
				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giaypheproicang" />
			</portlet:renderURL>
			<%
			if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0) {
			if (liIssuePortClearances61 != null && liIssuePortClearances61.size() > 0 && imagePathThuTuc.trim().length() > 0) {
				%>
				<li><a class="dieudong" href="<%=xemGiayPhepPTTNDRoiCang4TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
				<%
			} else {
				%>
				<li><a class="black" href="<%=xemGiayPhepPTTNDRoiCang4TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giaypheproicang" /></a></li>
				<%       
		        }
			}
			
			List<IssueAcceptance> liIssueAcceptance81 = IssueAcceptanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
			String thutucRequestCode81 = "";
            if (liIssueAcceptance81 != null && liIssueAcceptance81.size() > 0) {
            	thutucRequestCode81 = liIssueAcceptance81.get(0).getRequestCode();
            	imagePathThuTuc = CheckBusinessUtil.checkDisplayIconIssueAcceptance(liIssueAcceptance81.get(0).getRequestState());
            }
			%>
			
			<portlet:renderURL var="xemGiayPhepPTTNDVaocang4TT">
				<portlet:param name="jspPage" value="/html/thutuc/view.jsp" />
				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.PTTND_GIAY_PHEP_VAO_CANG)%>" />
				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=thutucRequestCode81%>" />
				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.thutuc.giayphepvaocang" />
			</portlet:renderURL>
			
			<%
			
			if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 ) {
				if (liIssueAcceptance81 != null && liIssueAcceptance81.size() > 0 && imagePathThuTuc.trim().length() > 0) {
				%>
				<li><a class="dieudong" href="<%=xemGiayPhepPTTNDVaocang4TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giayphepvaocang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePathThuTuc%>"></a></li>
				<%
			} else {
				%>
				<li><a class="black" href="<%=xemGiayPhepPTTNDVaocang4TT.toString()%>"><liferay-ui:message  key="vn.dtt.thutuc.giayphepvaocang" /></a></li>
			<%   					
		         }
			}
				
           }
           %>
      </ul>
      
      
      <script type="text/javascript">
      function thongbao() {
    	  alert("Không có thông tin tàu rời cảng!");
      }
      
      </script>