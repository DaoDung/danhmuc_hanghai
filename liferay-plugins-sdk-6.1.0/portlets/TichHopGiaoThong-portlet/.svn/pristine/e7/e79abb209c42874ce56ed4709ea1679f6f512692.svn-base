<%@page import="vn.gt.dao.noticeandmessage.service.TempDocumentLocalServiceUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="vn.gt.menu.MenuConstraint"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.utils.CheckBusinessUtil"%>
<%@page import="vn.gt.tichhop.message.TrangThaiBanKhaiXuatCanh"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueShiftingOrderLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueShiftingOrder"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDeclarationOfHealthLocalServiceUtil"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssueAcceptanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssueAcceptance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.IssuePortClearanceLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.IssuePortClearance"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempAnimalQuarantineLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempAnimalQuarantine"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPlantQuarantineLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPlantQuarantine"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDeclarationOfHealth"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewEffectsDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewEffectsDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempShipStoresDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempShipStoresDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempDangerousGoodsNanifestLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempDangerousGoodsNanifest"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempPassengerListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempPassengerList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCrewListLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCrewList"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempGeneralDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempNoTiceShipMessageLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempNoTiceShipMessage"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempCargoDeclaration"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempCargoDeclarationLocalServiceUtil"%>
<%@page import="vn.gt.dao.noticeandmessage.model.TempShipSecurityMessage"%>
<%@page import="java.util.List"%>
<%@page import="vn.gt.dao.noticeandmessage.service.TempShipSecurityMessageLocalServiceUtil"%>
<%@page import="vn.gt.tichhop.message.MessageType"%>
<%@page import="vn.gt.utils.PageType"%>
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
	
%>

<ul class="danhsachhoso thanhphan">
	<portlet:renderURL var="xemThanhPhanHoSoKeHoach">
		<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
		<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
		<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
		<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(PageType.THANH_PHAN_HO_SO)%>" />
		<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
		<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
		<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.thanhphanhoso" />
	</portlet:renderURL>

	<h2 class="tlemenu1"><a href="<%=xemThanhPhanHoSoKeHoach.toString() %>"><liferay-ui:message  key="vn.dtt.kehoach.thanhphanhoso" /></a></h2>
	<%
	String keHoachRequestCode = "";
	String imagePath = "";
	if (loaiThuTuc.trim().length() == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_NHAP_CANH) == 0) {
		TempShipSecurityMessage results = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		if (results != null) { keHoachRequestCode = results.getRequestCode(); }
		%>
		<portlet:renderURL var="xemBanKhaiAnNinh">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_AN_NINH_TAU_BIEN)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaianninh" />
		</portlet:renderURL>
		<%
		if (results == null) {
			%>
			<li><a class="black" href="<%=xemBanKhaiAnNinh.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaianninh" /></a></li>
		<%} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_AN_NINH_TAU_BIEN);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a  href="<%=xemBanKhaiAnNinh.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaianninh" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>	        		   
				<%
			} else {
				%>
				<li><a href="<%=xemBanKhaiAnNinh.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaianninh" /></a></li>
				<%
			}
		}
	
	
		TempCargoDeclaration resultsHangHoa = TempCargoDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode1 = "";
		if (resultsHangHoa != null) { keHoachRequestCode1 = resultsHangHoa.getRequestCode(); }
		%>
		<portlet:renderURL var="xemBanKhaiHangHoa">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANG_HOA)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode1%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaihanghoa" />
		</portlet:renderURL>
		<%
		if (resultsHangHoa == null) {
			%>
			<li><a class="black" href="<%=xemBanKhaiHangHoa.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANG_HOA);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a  href="<%=xemBanKhaiHangHoa.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
				<%
			} else {
				%>
				<li><a  href="<%=xemBanKhaiHangHoa.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /></a></li>
				<%
			}
		}
		
		//List<TempNoTiceShipMessage> resultsThongBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
		TempNoTiceShipMessage resultsThongBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode2 = "";
		if (resultsThongBaoTauDenCang != null) {
			keHoachRequestCode2 = resultsThongBaoTauDenCang.getRequestCode();
		}
		%>
		<portlet:renderURL var="xemThongBaoTauDenCang">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode2%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.thongbao" />
		</portlet:renderURL>
		<%
		if (resultsThongBaoTauDenCang == null) {
			%>
			<li><a class="black" href="<%=xemThongBaoTauDenCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_DEN_CANG);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemThongBaoTauDenCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
			<%} else {%>
				<li><a href="<%=xemThongBaoTauDenCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
				<%
			}
		}
		
		//List<TempNoTiceShipMessage> resultsXacBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
		TempNoTiceShipMessage resultsXacBaoTauDenCang = TempNoTiceShipMessageLocalServiceUtil.getXacBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode3 = "";
		if (resultsXacBaoTauDenCang != null) {
			keHoachRequestCode3 = resultsXacBaoTauDenCang.getRequestCode();
		}
		%>

		<portlet:renderURL var="xemXacBaoTauDenCang">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.XAC_BAO_TAU_DEN_CANG)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode3%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.xacbao" />
		</portlet:renderURL>
		<%
		if (resultsXacBaoTauDenCang == null) {
			%>
			<li><a class="black" href="<%=xemXacBaoTauDenCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.xacbao" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.XAC_BAO_TAU_DEN_CANG);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemXacBaoTauDenCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.xacbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
			<%} else {%>
				<li><a href="<%=xemXacBaoTauDenCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.xacbao" /></a></li>
				<%
			}
		}
		
		List<IssueShiftingOrder> lstShiftOrderNhapCanhKeHoach = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
		String keHoachRequestCode4 = "";
		if (lstShiftOrderNhapCanhKeHoach.size() > 0) {
			keHoachRequestCode4 = lstShiftOrderNhapCanhKeHoach.get(0).getRequestCode();
			imagePath = CheckBusinessUtil.checkDisplayIconShiftOrder(lstShiftOrderNhapCanhKeHoach.get(0).getRequestState());
		}
		%>
		<portlet:renderURL var="xemLenhDieuDong">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.LENH_DIEU_DONG)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode4%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.lenhdieudong" />
		</portlet:renderURL>
			<%
			if (lstShiftOrderNhapCanhKeHoach.size() > 0 && imagePath.trim().length() > 0) {
				%>
				<li><a class="dieudong" href="<%=xemLenhDieuDong.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.lenhdieudong" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
				<%
			} else {
				%>
				<li><a class="dieudong" href="<%=xemLenhDieuDong.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.lenhdieudong" /></a></li>
				<%
			}
			
			TempGeneralDeclaration resultsBanKhaiChung = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
			String keHoachRequestCode5 = "";
			if (resultsBanKhaiChung != null) { keHoachRequestCode5 = resultsBanKhaiChung.getRequestCode(); } 
			%>
		<portlet:renderURL var="xemBanKhaiChung">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode5%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaichung" />
		</portlet:renderURL>
		<%
		if (resultsBanKhaiChung == null) {
			%>
			<li><a class="black" href="<%=xemBanKhaiChung.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemBanKhaiChung.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
				<%
			} else {
				%>
				<li><a href="<%=xemBanKhaiChung.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
				<%
			}
		}
		
		TempCrewList resultsDsThuyenvien = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode6 = "";
		if (resultsDsThuyenvien != null) { keHoachRequestCode6 = resultsDsThuyenvien.getRequestCode(); }
		%>
		<portlet:renderURL var="xemDanhSachThuyenVien">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode6%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachthuyenvien" />
		</portlet:renderURL>
		<%
		if (resultsDsThuyenvien == null) {
			%>
			<li><a class="black" href="<%=xemDanhSachThuyenVien.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemDanhSachThuyenVien.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
				<%
			} else {
				%>
				<li><a href="<%=xemDanhSachThuyenVien.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
				<%
			}
		}
		
		TempPassengerList resultsDsHanhKhach = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode7 = "";
		if (resultsDsHanhKhach != null) { keHoachRequestCode7 = resultsDsHanhKhach.getRequestCode(); }
		%>
		<portlet:renderURL var="xemDanhSachHanhKhach">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode7%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachhanhkhach" />
		</portlet:renderURL>
		<%
		if (resultsDsHanhKhach == null) {
			%>
			<li><a class="black" href="<%=xemDanhSachHanhKhach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemDanhSachHanhKhach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
				<%
			} else {
				%>
				<li><a href="<%=xemDanhSachHanhKhach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
				<%
			}
		}
		
		TempDangerousGoodsNanifest resultsHangHoaNguyHiem = TempDangerousGoodsNanifestLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode8 = "";
		if (resultsHangHoaNguyHiem != null) { keHoachRequestCode8 = resultsHangHoaNguyHiem.getRequestCode(); }
		%>
		<portlet:renderURL var="xemHangHoaNguyHiem">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode8%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.hanghoanguyhiem" />
		</portlet:renderURL>
		<%
		if (resultsHangHoaNguyHiem == null) {
			%>
			<li><a class="black" href="<%=xemHangHoaNguyHiem.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanghoanguyhiem" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANG_HOA_NGUY_HIEM);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemHangHoaNguyHiem.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanghoanguyhiem" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
				<%
			} else {
				%>
				<li><a href="<%=xemHangHoaNguyHiem.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanghoanguyhiem" /></a></li>
				<%
			}
		}
		
		TempShipStoresDeclaration resultsBanKhaiDuTru = TempShipStoresDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode11 = "";
		if (resultsBanKhaiDuTru != null) { keHoachRequestCode11 = resultsBanKhaiDuTru.getRequestCode(); }
		%>
		<portlet:renderURL var="xemBanKhaiDuTru">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DU_TRU_CUA_TAU)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode11%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaidutru" />
		</portlet:renderURL>
		<%
		if (resultsBanKhaiDuTru == null) {
			%>
			<li><a class="black" href="<%=xemBanKhaiDuTru.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaidutru" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DU_TRU_CUA_TAU);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemBanKhaiDuTru.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaidutru" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
				<%
			} else {
				%>
				<li><a href="<%=xemBanKhaiDuTru.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaidutru" /></a></li>
				<%
			}
		}
		
		TempCrewEffectsDeclaration resultsHanhLyThuyenVien = TempCrewEffectsDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode12 = "";
		if (resultsHanhLyThuyenVien != null) {
			keHoachRequestCode12 = resultsHanhLyThuyenVien.getRequestCode();
		}
		%>
		<portlet:renderURL var="xemHanhLyThuyenVien">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode12%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.hanhlythuyenvien" />
		</portlet:renderURL>
		<%
		if (resultsHanhLyThuyenVien == null) {
			%>
			<li><a class="black" href="<%=xemHanhLyThuyenVien.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanhlythuyenvien" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANH_LY_THUYEN_VIEN);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemHanhLyThuyenVien.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanhlythuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
				<%
			} else {
				%>
				<li><a href="<%=xemHanhLyThuyenVien.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanhlythuyenvien" /></a></li>
			<%
			}
		}
		
		TempDeclarationOfHealth resultsYTeHangHai = TempDeclarationOfHealthLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
		String keHoachRequestCode22 = "";
		if (resultsYTeHangHai != null ) {
		    keHoachRequestCode22 = resultsYTeHangHai.getRequestCode();
		}
		%>
                <portlet:renderURL var="xemGiayYTeHangHai">
                      <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode22%>" />
                      <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.khaibaoytehanghai" />
                 </portlet:renderURL>
                  <%
                if (resultsYTeHangHai == null) {
                    %>
                    <li><a class="black" href="<%=xemGiayYTeHangHai.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.khaibaoytehanghai" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_BAO_Y_TE_HANG_HAI);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemGiayYTeHangHai.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.khaibaoytehanghai" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemGiayYTeHangHai.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.khaibaoytehanghai" /></a></li>
                        <%
                    }
                }
               
               TempPlantQuarantine resultsKiemDichThucVat = TempPlantQuarantineLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode33 = "";
                if (resultsKiemDichThucVat != null) {
                    keHoachRequestCode33 = resultsKiemDichThucVat.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemKiemDichThucVat">
                    <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode33%>" />
                    <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.kiemdichthucvat" />
               </portlet:renderURL>
                <%
                if (resultsKiemDichThucVat == null) {
                    %>
                    <li><a class="black" href="<%=xemKiemDichThucVat.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.kiemdichthucvat" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_KIEM_DICH_THUC_VAT);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemKiemDichThucVat.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.kiemdichthucvat" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemKiemDichThucVat.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.kiemdichthucvat" /></a></li>
                        <%
                    }
                }
               
                TempAnimalQuarantine resultsKiemDichDongVat = TempAnimalQuarantineLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode44 = "";
                if (resultsKiemDichDongVat != null) {
                    keHoachRequestCode44 = resultsKiemDichDongVat.getRequestCode();
                }
                %>
		<portlet:renderURL var="xemKiemDichDongVat">
			<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
			<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
			<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
			<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT)%>" />
			<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
			<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode44%>" />
			<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.kiemdichdongvat" />
		</portlet:renderURL>
		<%
		if (resultsKiemDichDongVat == null) {
			%>
			<li><a class="black" href="<%=xemKiemDichDongVat.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.kiemdichdongvat" /></a></li>
			<%
		} else {
			imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_KIEM_DICH_DONG_VAT);
			if (imagePath.trim().length() > 0) {
				%>
				<li><a href="<%=xemKiemDichDongVat.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.kiemdichdongvat" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
				<%
			} else {
				%>
				<li><a href="<%=xemKiemDichDongVat.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.kiemdichdongvat" /></a></li>
				<%
			}
		}
	//----------------loat thu tuc xuat canh
	} else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_XUAT_CANH) == 0) {
		//List<TempNoTiceShipMessage> resultsThongBaoTauRoiCang = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
		TempNoTiceShipMessage resultsThongBaoTauRoiCang = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                //List<TempNoTiceShipMessage> resultsThongBaoTauRoiCang = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAnddocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode55 = "";
                if (resultsThongBaoTauRoiCang != null) {
                    keHoachRequestCode55 = resultsThongBaoTauRoiCang.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemThongBaoTauRoiCang">
                    <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_ROI_CANG)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode55%>" />
                    <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.thongbao" />
               </portlet:renderURL>
                <%
                if (resultsThongBaoTauRoiCang == null) {
                    %>
                    <li><a class="black" href="<%=xemThongBaoTauRoiCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_ROI_CANG);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemThongBaoTauRoiCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemThongBaoTauRoiCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
                        <%
                    }
                }
              
                TempGeneralDeclaration resultsBanKhaiChung1 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode66 = "";
                if (resultsBanKhaiChung1 != null) {
                    keHoachRequestCode66 = resultsBanKhaiChung1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChung1">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode66%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaichung" />
                </portlet:renderURL>
                 <%
                if (resultsBanKhaiChung1 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiChung1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiChung1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiChung1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                        <%
                    }
                }
               
                TempCrewList resultsDsThuyenvien1 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode77 = "";
                if (resultsDsThuyenvien1 != null) {
                    keHoachRequestCode77 = resultsDsThuyenvien1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVien1">
                    <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode77%>" />
                    <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachthuyenvien" />
               </portlet:renderURL>
                <%
                if (resultsDsThuyenvien1 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVien1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVien1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVien1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
              
                TempPassengerList resultsDsHanhKhach1 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode13 = "";
                if (resultsDsHanhKhach1 != null) {
                    keHoachRequestCode13 = resultsDsHanhKhach1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHanhKhach1">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode13%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachhanhkhach" />
                </portlet:renderURL>
                 <%
                if (resultsDsHanhKhach1 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHanhKhach1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHanhKhach1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHanhKhach1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
              
	               TempCargoDeclaration resultsHangHoa1 = TempCargoDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	               String keHoachRequestCode14 = "";
	                if (resultsHangHoa1 != null) {
	                    keHoachRequestCode14 = resultsHangHoa1.getRequestCode();
	                }
	                %>
	                <portlet:renderURL var="xemBanKhaiHangHoa1">
	                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
	                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANG_HOA)%>" />
	                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode14%>" />
	                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
	                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaihanghoa" />
	                </portlet:renderURL>
	                 <%
	               if (resultsHangHoa1 == null) {
	                   %>
	                   <li><a class="black" href="<%=xemBanKhaiHangHoa1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /></a></li>
	                   <%
	               } else {
	            	   imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANG_HOA);
	                    if (imagePath.trim().length() > 0) {
	                       %>
	                        <li><a  href="<%=xemBanKhaiHangHoa1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
	                       <%
	                   } else {
	                       %>
	                       <li><a  href="<%=xemBanKhaiHangHoa1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /></a></li>
	                       <%
	                   }
	               }
               
                TempShipStoresDeclaration resultsBanKhaiDuTru1 = TempShipStoresDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode15 = "";
                if (resultsBanKhaiDuTru1 != null) {
                    keHoachRequestCode15 = resultsBanKhaiDuTru1.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiDuTru1">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DU_TRU_CUA_TAU)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode15%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaidutru" />
                </portlet:renderURL>
                 <%
                if (resultsBanKhaiDuTru1 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiDuTru1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaidutru" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DU_TRU_CUA_TAU);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiDuTru1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaidutru" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiDuTru1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaidutru" /></a></li>
                        <%
                    }
                }
               //Ban khai hanh ly hanh khach ko co giao dien thiet ke
                //TempCrewEffectsDeclaration resultsHanhLyHanhKhach = TempCrewEffectsDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                TempCrewEffectsDeclaration resultsHanhLyHanhKhach = null;
                String keHoachRequestCode23 = "";
                if (resultsHanhLyHanhKhach != null) {
                    keHoachRequestCode23 = resultsHanhLyHanhKhach.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiHanhLyHanhKhach1">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANH_LY_HANH_KHACH_ROI_TAU)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode23%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.hanhlyhanhkhachroitau" />
                </portlet:renderURL>
                 <%
                if (resultsHanhLyHanhKhach == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiHanhLyHanhKhach1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanhlyhanhkhachroitau" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIconXuatCanh(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANH_LY_HANH_KHACH_ROI_TAU);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiHanhLyHanhKhach1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanhlyhanhkhachroitau" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiHanhLyHanhKhach1.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.hanhlyhanhkhachroitau" /></a></li>
                        <%
                    }
                }
                %>
               <portlet:renderURL var="xemGiayToPhaiXuatTrinhXuatCanhKH">
                    <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.cacgiaytoxuattrinh" />
               </portlet:renderURL>

               <%-- <li><a href="<%=xemGiayToPhaiXuatTrinhXuatCanhKH.toString() %>"><liferay-ui:message  key="vn.dtt.kehoach.cacgiaytoxuattrinh" /></a></li> --%>
               
                <%
               List<IssuePortClearance> liIssuePortClearances = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
               
               //List<IssuePortClearance> liIssuePortClearances = IssuePortClearanceLocalServiceUtil.findIssuePortClearanceByDocumentYearAndDocumentYearAndRequestState(FormatData.convertToLong(documentName), documentYear, TrangThaiBanKhaiXuatCanh.KHAI_MOI);
               String keHoachRequestCode24 = "";
               if (liIssuePortClearances.size() > 0) {
                   keHoachRequestCode24 = liIssuePortClearances.get(0).getRequestCode();
                   imagePath = CheckBusinessUtil.checkDisplayIconPortClearance(liIssuePortClearances.get(0).getRequestState());
               }
               %>
				<portlet:renderURL var="xemGiayPhepRoiCang1KeHoach">
					<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
					<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
					<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
					<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)%>" />
					<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
					<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode24%>" />
					<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
					<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicang" />
				</portlet:renderURL>
				<%
				if (liIssuePortClearances != null && liIssuePortClearances.size() > 0 && imagePath.trim().length() > 0) {
					%>
					<li><a class="dieudong" href="<%=xemGiayPhepRoiCang1KeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
					<%
				} else {
					%>
				<li><a href="<%=xemGiayPhepRoiCang1KeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicang" /></a></li>
				<%
				}
		
			//-----------loat thu tuc qua canh
			} else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_QUA_CANH) == 0) {
	           TempShipSecurityMessage results2 = TempShipSecurityMessageLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	           String keHoachRequestCode31 = "";
               if (results2 != null) {
                   keHoachRequestCode31 = results2.getRequestCode();
               }
               %>
               <portlet:renderURL var="xemBanKhaiAnNinh2">
                   <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                   <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                   <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                   <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_AN_NINH_TAU_BIEN)%>" />
                   <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                   <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode31%>" />
                   <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                   <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaianninh" />
              </portlet:renderURL>
              <%
	           if (results2 == null) {
	        	   %>
                   <li><a class="black" href="<%=xemBanKhaiAnNinh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaianninh" /></a></li>
                   <%
	           } else {
	        	   
	        	   imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_AN_NINH_TAU_BIEN);
                   if (imagePath.trim().length() > 0) {
	        		   %>
                        <li><a  href="<%=xemBanKhaiAnNinh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaianninh" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>	        		   
	        		   <%
	        	   } else {
	        		   %>
	        		   <li><a href="<%=xemBanKhaiAnNinh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaianninh" /></a></li>
	        		   <%
	        	   }
	           }
	           
	              	TempCargoDeclaration resultsHangHoa2 = TempCargoDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
	               String keHoachRequestCode32 = "";
	               if (resultsHangHoa2 != null) {
	                   keHoachRequestCode32 = resultsHangHoa2.getRequestCode();
	               } 
	               %>
	                <portlet:renderURL var="xemBanKhaiHangHoa2">
	                    <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
	                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
	                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
	                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_HANG_HOA)%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
	                    <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode32%>" />
	                    <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
	                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaihanghoa" />
	               </portlet:renderURL>
	                <%
	               if (resultsHangHoa2 == null) {
	                   %>
	                   <li><a class="black" href="<%=xemBanKhaiHangHoa2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /></a></li>
	                   <%
	               } else {
	            	   imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_HANG_HOA);
	                   if (imagePath.trim().length() > 0) {
	                       %>
	                        <li><a  href="<%=xemBanKhaiHangHoa2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
	                       <%
	                   } else {
	                       %>
	                       <li><a  href="<%=xemBanKhaiHangHoa2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaihanghoa" /></a></li>
	                       <%
	                   }
	               }

	            //List<TempNoTiceShipMessage> resultsThongBaoTauQuaCanh = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG);
	            //List<TempNoTiceShipMessage> resultsThongBaoTauQuaCanh = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_THONG_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
	            TempNoTiceShipMessage resultsThongBaoTauQuaCanh = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode334 = "";
                if (resultsThongBaoTauQuaCanh != null) {
                    keHoachRequestCode334 = resultsThongBaoTauQuaCanh.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemThongBaoTauQuaCanh2">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_QUA_CANH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode334%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.thongbao" />
                </portlet:renderURL>
                 <%
                if (resultsThongBaoTauQuaCanh == null) {
                    %>
                    <li><a class="black" href="<%=xemThongBaoTauQuaCanh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_QUA_CANH);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemThongBaoTauQuaCanh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemThongBaoTauQuaCanh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
                        <%
                    }
                }
               
                //List<TempNoTiceShipMessage> resultsXacBaoTauQuaCanh = TempNoTiceShipMessageLocalServiceUtil.findBydocumentNameAndDocumentYearAndNoticeShipType(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG);
                //List<TempNoTiceShipMessage> resultsXacBaoTauQuaCanh = TempNoTiceShipMessageLocalServiceUtil.findByDocumentNameAndDocumentYearAndNoticeShipTypeOrderByColumn(FormatData.convertToLong(documentName), documentYear, PageType.TYPE_XAC_BAO_TAU_DEN_CANG, KeyParams.CONFIRM_TIME, KeyParams.ORDER_BY_ASC);
                TempNoTiceShipMessage resultsXacBaoTauQuaCanh = TempNoTiceShipMessageLocalServiceUtil.getXacBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode34 = "";
                if (resultsXacBaoTauQuaCanh != null) {
                    keHoachRequestCode34 = resultsXacBaoTauQuaCanh.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemXacBaoTauQuaCanh2">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.XAC_BAO_TAU_QUA_CANH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode34%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.xacbao" />
                </portlet:renderURL>
                 <%
                if (resultsXacBaoTauQuaCanh == null) {
                    %>
                    <li><a class="black" href="<%=xemXacBaoTauQuaCanh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.xacbao" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.XAC_BAO_TAU_QUA_CANH);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemXacBaoTauQuaCanh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.xacbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemXacBaoTauQuaCanh2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.xacbao" /></a></li>
                        <%
                    }
                }
               
                List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhKeHoach2 = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
                String keHoachRequestCode35 = "";
                if (lIssueShiftingOrdersNhapCanhKeHoach2.size() > 0) {
                    keHoachRequestCode35 = lIssueShiftingOrdersNhapCanhKeHoach2.get(0).getRequestCode();
                    imagePath = CheckBusinessUtil.checkDisplayIconShiftOrder(lIssueShiftingOrdersNhapCanhKeHoach2.get(0).getRequestState());
                }
                %>
                <portlet:renderURL var="xemLenhDieuDong2">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.LENH_DIEU_DONG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode35%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.lenhdieudong" />
                </portlet:renderURL>
                 <%
                if (lIssueShiftingOrdersNhapCanhKeHoach2.size() > 0 && imagePath.trim().length() > 0) {
                     %>
                     <li><a class="dieudong" href="<%=xemLenhDieuDong2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.lenhdieudong" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
                     <%
                } else {
                    %>
                    <li><a class="dieudong" href="<%=xemLenhDieuDong2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.lenhdieudong" /></a></li>
                    <%
                }
              
               	TempGeneralDeclaration resultsBanKhaiChung2 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode36 = "";
                if (resultsBanKhaiChung2 != null) {
                    keHoachRequestCode36 = resultsBanKhaiChung2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChung2">
                      <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode36%>" />
                      <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaichung" />
                 </portlet:renderURL>
                  <%
                if (resultsBanKhaiChung2 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiChung2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiChung2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiChung2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                        <%
                    }
                }
               
                TempCrewList resultsDsThuyenvien2 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode41 = "";
                if (resultsDsThuyenvien2 != null) {
                    keHoachRequestCode41 = resultsDsThuyenvien2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVien2">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode41%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachthuyenvien" />
                </portlet:renderURL>
                 <%
                if (resultsDsThuyenvien2 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVien2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVien2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVien2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
               
                TempPassengerList resultsDsHanhKhach2 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode51 = "";
                if (resultsDsHanhKhach2 != null) {
                    keHoachRequestCode51 = resultsDsHanhKhach2.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHanhKhach2">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode51%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachhanhkhach" />
                </portlet:renderURL>
                 <%
                if (resultsDsHanhKhach2 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHanhKhach2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHanhKhach2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHanhKhach2.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
           //----------- loat thu tuc vao cang
           }else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG) == 0) {
	           
              %>
               
				<%
	            TempNoTiceShipMessage resultsThongBaoTauVaoCang = TempNoTiceShipMessageLocalServiceUtil.getThongBaoLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode334 = "";
                String magiaypheproicangcuoi = "";
                
                if (resultsThongBaoTauVaoCang != null) {
                    keHoachRequestCode334 = resultsThongBaoTauVaoCang.getRequestCode();
                    if (resultsThongBaoTauVaoCang.getRemarks().trim().length() > 0) {
                    	magiaypheproicangcuoi = resultsThongBaoTauVaoCang.getRemarks().trim();
                    }
                }
                %>
                <portlet:renderURL var="xemThongBaoTauVaoCang">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_TAU_DEN_CANG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode334%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.thongbao" />
                </portlet:renderURL>
                 <%
                if (resultsThongBaoTauVaoCang == null) {
                    %>
                    <li><a class="black" href="<%=xemThongBaoTauVaoCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.THONG_BAO_TAU_DEN_CANG);
                    if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemThongBaoTauVaoCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemThongBaoTauVaoCang.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.thongbao" /></a></li>
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
                	
                	tenTau = tempDocument.getShipName();
                	hoHieu = tempDocument.getCallSign();
                	if (magiaypheproicangcuoi.length() > 0){
                		issuePortClearance = IssuePortClearanceLocalServiceUtil.findLatestCertificateOfIssuePortClearance(tenTau, hoHieu, magiaypheproicangcuoi);
                	}
                	
               		if(issuePortClearance != null) {
               			rcRequestCode = issuePortClearance.getRequestCode();
               			rcDocumentName = issuePortClearance.getDocumentName();
               			rcDocumentYear = issuePortClearance.getDocumentYear();
               		} else {
               			System.out.println("======issuePortClearance====== is null ");
               		}
                } else {
                	System.out.println("=====tempDocument!========  nullllllllllll");
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

                                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicangcuoi" /> 
                                 </portlet:renderURL>                                       							
                  <%
                if (issuePortClearance == null) {
                	
                    %>
                    		<portlet:renderURL var="xemgiaypheproicangcuoiBlank"> 
                    		<portlet:param name="jspPage" value="/html/kehoach/view.jsp" /> 
                    		<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicangcuoi" /> 
                    		</portlet:renderURL> 
                           <li><a class="black" onclick="thongbao()" href="<%=xemThanhPhanHoSoKeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicangcuoi" /></a></li>
                    <%
                } else {
                	//System.out.print("NULLLLLLLLLLLLL");
                        %>
								<li><a href="<%=xemgiaypheproicangcuoi.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicangcuoi" /></a></li>
                        <%
                    
                } %>
                
                
               
            <%    List<IssueShiftingOrder> lIssueShiftingOrdersNhapCanhKeHoach3 = IssueShiftingOrderLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
                String keHoachRequestCode35 = "";
                if (lIssueShiftingOrdersNhapCanhKeHoach3.size() > 0) {
                    keHoachRequestCode35 = lIssueShiftingOrdersNhapCanhKeHoach3.get(0).getRequestCode();
                    imagePath = CheckBusinessUtil.checkDisplayIconShiftOrder(lIssueShiftingOrdersNhapCanhKeHoach3.get(0).getRequestState());
                }
                %>
                <portlet:renderURL var="xemLenhDieuDong3">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.LENH_DIEU_DONG)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode35%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.lenhdieudong" />
                </portlet:renderURL>
                 <%
                if (lIssueShiftingOrdersNhapCanhKeHoach3.size() > 0 && imagePath.trim().length() > 0) {
                     %>
                     <li><a class="dieudong" href="<%=xemLenhDieuDong3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.lenhdieudong" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
                     <%
                } else {
                    %>
                    <li><a class="dieudong" href="<%=xemLenhDieuDong3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.lenhdieudong" /></a></li>
                    <%
                }
              
               	TempGeneralDeclaration resultsBanKhaiChung3 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode36 = "";
                if (resultsBanKhaiChung3 != null) {
                    keHoachRequestCode36 = resultsBanKhaiChung3.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChung3">
                      <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode36%>" />
                      <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaichung" />
                 </portlet:renderURL>
                  <%
                if (resultsBanKhaiChung3 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiChung3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiChung3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiChung3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                        <%
                    }
                }
               
                TempCrewList resultsDsThuyenvien3 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode41 = "";
                if (resultsDsThuyenvien3 != null) {
                    keHoachRequestCode41 = resultsDsThuyenvien3.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVien3">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode41%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachthuyenvien" />
                </portlet:renderURL>
                 <%
                if (resultsDsThuyenvien3 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVien3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVien3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVien3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
               
                TempPassengerList resultsDsHanhKhach3 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode51 = "";
                if (resultsDsHanhKhach3 != null) {
                    keHoachRequestCode51 = resultsDsHanhKhach3.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHanhKhach3">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode51%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachhanhkhach" />
                </portlet:renderURL>
                 <%
                if (resultsDsHanhKhach3 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHanhKhach3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHanhKhach3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHanhKhach3.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
                 
           //----------- loat thu tuc roi cang
           }else if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0||
        		   loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 ||
        		   loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0) {
                %>
              
              
              <%
               	TempGeneralDeclaration resultsBanKhaiChung4 = TempGeneralDeclarationLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode36 = "";
                if (resultsBanKhaiChung4 != null) {
                    keHoachRequestCode36 = resultsBanKhaiChung4.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemBanKhaiChung4">
                      <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                      <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                      <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                      <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_CHUNG)%>" />
                      <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                      <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode36%>" />
                      <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                      <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.bankhaichung" />
                 </portlet:renderURL>
                  <%
                if (resultsBanKhaiChung4 == null) {
                    %>
                    <li><a class="black" href="<%=xemBanKhaiChung4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_CHUNG);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemBanKhaiChung4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemBanKhaiChung4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.bankhaichung" /></a></li>
                        <%
                    }
                }
               
                TempCrewList resultsDsThuyenvien4 = TempCrewListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode41 = "";
                if (resultsDsThuyenvien4 != null) {
                    keHoachRequestCode41 = resultsDsThuyenvien4.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachThuyenVien4">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode41%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachthuyenvien" />
                </portlet:renderURL>
                 <%
                if (resultsDsThuyenvien4 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachThuyenVien4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_THUYEN_VIEN);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachThuyenVien4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachThuyenVien4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachthuyenvien" /></a></li>
                        <%
                    }
                }
               
                TempPassengerList resultsDsHanhKhach4 = TempPassengerListLocalServiceUtil.getLastByDocumentNameAndDocumentYear(FormatData.convertToLong(documentName), documentYear);
                String keHoachRequestCode51 = "";
                if (resultsDsHanhKhach4 != null) {
                    keHoachRequestCode51 = resultsDsHanhKhach4.getRequestCode();
                }
                %>
                <portlet:renderURL var="xemDanhSachHanhKhach4">
                     <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                     <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                     <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                     <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH)%>" />
                     <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                     <portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode51%>" />
                     <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                     <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.danhsachhanhkhach" />
                </portlet:renderURL>
                 <%
                if (resultsDsHanhKhach4 == null) {
                    %>
                    <li><a class="black" href="<%=xemDanhSachHanhKhach4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                    <%
                } else {
                	imagePath = CheckBusinessUtil.checkDisplayIcon(FormatData.convertToLong(documentName), documentYear, MessageType.BAN_KHAI_DANH_SACH_HANH_KHACH);
	                   if (imagePath.trim().length() > 0) {
                        %>
                         <li><a href="<%=xemDanhSachHanhKhach4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>                     
                        <%
                    } else {
                        %>
                        <li><a href="<%=xemDanhSachHanhKhach4.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.danhsachhanhkhach" /></a></li>
                        <%
                    }
                }
              // SONVH Du lieu phuong tien PTTND - chua lam
 				List<IssueAcceptance> liIssueAcceptance80 = new ArrayList <IssueAcceptance>();
 			String kehoachRequestCode80 = "";
             if (liIssueAcceptance80 != null && liIssueAcceptance80.size() > 0) {
            	 kehoachRequestCode80 = liIssueAcceptance80.get(0).getRequestCode();
            	 imagePath = CheckBusinessUtil.checkDisplayIcon(liIssueAcceptance80.get(0).getRequestState());
             }
 			%>
 			
 			<portlet:renderURL var="xemThongBaoDulieuPTTND4kehoach">
 				<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
 				<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
 				<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
 				<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.THONG_BAO_CHO_PHEP_TAU_QUA_CANH)%>" />
 				<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
 				<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=kehoachRequestCode80%>" />
 				<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
 				<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.dulieupttnd" />
 			</portlet:renderURL>
 			
 			<%
 			
 			if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0 || loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0 ) {
 				if (liIssueAcceptance80 != null && liIssueAcceptance80.size() > 0 && imagePath.trim().length() > 0) {
 				%>
 				<li><a class="dieudong" href="<%=xemThongBaoDulieuPTTND4kehoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.dulieupttnd" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li>
 				<%
 			} else {
 				%>
 				<li><a class="black" onclick="thongbaodulieupttnd()" href="<%=xemThongBaoDulieuPTTND4kehoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.dulieupttnd" /></a></li>
 			<%   					
 		         }
 			}
 				
                 %>
                 <portlet:renderURL var="xemGiayToPhaiXuatTrinhXuatCanhKH4">
                    <portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
                    <portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
                    <portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
                    <portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.FUNCTION_CAC_GIAY_TO_PHAI_XUAT_TRINH)%>" />
                    <portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
                    <portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
                    <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.cacgiaytoxuattrinh" />
               </portlet:renderURL>

               <%-- <li><a href="<%=xemGiayToPhaiXuatTrinhXuatCanhKH4.toString() %>"><liferay-ui:message  key="vn.dtt.kehoach.cacgiaytoxuattrinh" /></a></li> --%>
               
               <%
               
               List<IssuePortClearance> liIssuePortClearances4 = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
               String keHoachRequestCode24 = "";
               if (liIssuePortClearances4.size() > 0) {
                   keHoachRequestCode24 = liIssuePortClearances4.get(0).getRequestCode();
                   imagePath = CheckBusinessUtil.checkDisplayIconPortClearance(liIssuePortClearances4.get(0).getRequestState());
               }
               %>
				<portlet:renderURL var="xemGiayPhepRoiCang4KeHoach">
					<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
					<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
					<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
					<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_BO_GTVT_CAP_KHI_XUAT_CANH)%>" />
					<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
					<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode24%>" />
					<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
					<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicang" />
				</portlet:renderURL>
				
				<%
				if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG) == 0) {
				if (liIssuePortClearances4 != null && liIssuePortClearances4.size() > 0 && imagePath.trim().length() > 0) {
					%>
					<%-- <li><a class="dieudong" href="<%=xemGiayPhepRoiCang4KeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li> --%>
					<%
				} else {
					%>
					<%-- <li><a class="black" href="<%=xemGiayPhepRoiCang4KeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicang" /></a></li> --%>
					<%       
           				}
				}
				
				
				List<IssuePortClearance> liIssuePortClearances61 = IssuePortClearanceLocalServiceUtil.findByDocumentYearAndDocumentYearOrderByColumn(FormatData.convertToLong(documentName), documentYear, KeyParams.VERSION_NO, KeyParams.ORDER_BY_DESC);
	               String keHoachRequestCode61 = "";
	               if (liIssuePortClearances61 != null && liIssuePortClearances61.size() > 0) {
	            	   keHoachRequestCode61 = liIssuePortClearances61.get(0).getRequestCode();
	                   imagePath = CheckBusinessUtil.checkDisplayIconPortClearance(liIssuePortClearances61.get(0).getRequestState());
	               }
				%>
				<portlet:renderURL var="xemGiayPhepPTTNDRoiCang4KeHoach">
					<portlet:param name="jspPage" value="/html/kehoach/view.jsp" />
					<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
					<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
					<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)%>" />
					<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
					<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE) %>" value="<%=keHoachRequestCode61%>" />
					<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
					<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicang" />
				</portlet:renderURL>
				<%
				if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_ROI_CANG_PTTND) == 0) {
				if (liIssuePortClearances61 != null && liIssuePortClearances61.size() > 0 && imagePath.trim().length() > 0) {
					%>
					<%-- <li><a class="dieudong" href="<%=xemGiayPhepPTTNDRoiCang4KeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicang" /><img src="<%=request.getContextPath()%>/img/front/<%=imagePath%>"></a></li> --%>
					<%
				} else {
					%>
					<%-- <li><a class="black" href="<%=xemGiayPhepPTTNDRoiCang4KeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicang" /></a></li> --%>
					<%       
           				}
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
			    	tenTau = tempDocument.getShipName();
			    	hoHieu = tempDocument.getCallSign();
			    	
			    	issuePortClearance = IssuePortClearanceLocalServiceUtil.findLastestIssuePortClearanceByPortNameAndCallSign(tenTau, hoHieu);
			   		if(issuePortClearance != null) {
			   			rcRequestCode = issuePortClearance.getRequestCode();
			   			rcDocumentName = issuePortClearance.getDocumentName();
			   			rcDocumentYear = issuePortClearance.getDocumentYear();
			   		} else {
			   			System.out.println("======issuePortClearance====== is null ");
			   		}
			    } else {
			    	System.out.println("=====tempDocument!========  nullllllllllll");
			    }
			    %>
			    
			        <portlet:renderURL var="xemgiaypheproicangcuoipttnd"> 
				 	<portlet:param name="<%=PageType.DOCUMENT_NAME %>" value="<%=documentName%>" />
				 	<portlet:param name="<%=PageType.DOCUMENT_NAME_VIEW_RCC %>" value="<%=String.valueOf(rcDocumentName)%>" />
			     				 	    
					<portlet:param name="<%=PageType.DOCUMENT_YEAR %>" value="<%=String.valueOf(documentYear)%>" />
					<portlet:param name="<%=PageType.DOCUMENT_YEAR_VIEW_RCC %>" value="<%=String.valueOf(rcDocumentYear)%>" />
					
					<portlet:param name="<%=PageType.MESSAGE_TYPE %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)%>" />
					<portlet:param name="<%=PageType.MESSAGE_TYPE_VIEW_RCC %>" value="<%=String.valueOf(MessageType.GIAY_PHEP_ROI_CANG_CHO_TAU_DEN)%>" />
					
					<portlet:param name="<%=String.valueOf(PageType.REQUEST_CODE_VIEW_RCC) %>" value="<%=rcRequestCode%>" /> 
					
					<portlet:param name="<%=String.valueOf(PageType.PAGE_TYPE) %>" value="<%=pageType%>" />
					
					<portlet:param name="<%=MenuConstraint.SESSION_MENU_SELECTED%>" value="<%=ParamUtil.getString(request, MenuConstraint.SESSION_MENU_SELECTED)%>" />
			
			        <portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicangcuoi" /> 
			        </portlet:renderURL>                                       							
			    <%
			      if (loaiThuTuc.compareTo(MessageType.LOAT_THU_TUC_VAO_CANG_PTTND) == 0) {
			    		if (issuePortClearance == null) {
			        	%>
			        		<portlet:renderURL var="xemgiaypheproicangcuoipttndBlank"> 
			        		<portlet:param name="jspPage" value="/html/kehoach/view.jsp" /> 
			        		<portlet:param name="<%=PageType.TIEU_DE_BAN_KHAI %>" value="vn.dtt.kehoach.giaypheproicangcuoi" /> 
			        		</portlet:renderURL> 
			               	<li><a class="black" onclick="thongbao()" href="<%=xemThanhPhanHoSoKeHoach.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicangcuoi" /></a></li>
			        	<%
			    		} else {
			            %>
							<li><a href="<%=xemgiaypheproicangcuoipttnd.toString()%>"><liferay-ui:message  key="vn.dtt.kehoach.giaypheproicangcuoi" /></a></li>
			            <%
			    		}                    
			    } 	
           %>
           
      </ul>
      <script type="text/javascript">
      function thongbao() {
    	  alert("Không có thông tin tàu rời cảng!");
      }
      function thongbaodulieupttnd() {
    	  alert("Không có thông tin điện tử phương tiện thủy nội địa!");
      }
      
      </script>