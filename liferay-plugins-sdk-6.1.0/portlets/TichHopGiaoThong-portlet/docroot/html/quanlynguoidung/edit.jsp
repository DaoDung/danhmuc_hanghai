<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.gt.utils.document.DocumentUtils"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="vn.gt.dao.common.service.UserSignLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserSign"%>
<%@page import="vn.gt.dao.common.model.impl.UserSignImpl"%>
<%@page import="vn.gt.dao.danhmuc.service.DmRepresentativeLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmRepresentative"%>
<%@page import="vn.gt.dao.danhmuc.model.impl.DmRepresentativeImpl"%>
<%@page import="vn.gt.utils.KeyParams"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.gt.utils.ActionUtils"%>
<%@page import="vn.gt.portlet.Utils"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="vn.gt.dao.danhmuc.model.DmMaritime"%>
<%@page import="vn.gt.dao.danhmuc.service.DmMaritimeLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.UserPort"%>
<%@page import="vn.gt.dao.common.service.UserPortLocalServiceUtil"%>
<%@ include file="init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
Boolean rolequantri = false;
Boolean rolevanthu = false;
Boolean rolelanhdao = false;
User currentuser = UserLocalServiceUtil.fetchUser(themeDisplay.getUserId());
for (Organization og : currentuser.getOrganizations()) {
	if (og.getGroup().getFriendlyURL().contains("dong-bo")) {
		rolequantri = true;    		
	}
	if (og.getGroup().getFriendlyURL().contains("van-thu")) {
		rolevanthu = true;    		
	}
	if (og.getGroup().getFriendlyURL().contains("lanh-dao")) {
		rolelanhdao = true;    		
	}
}

long userSignId = ParamUtil.getLong(request, "userSignId");
String backURL = ParamUtil.getString(request, "backURL");

UserSign userSign = null;

if(userSignId > 0) {
	userSign = UserSignLocalServiceUtil.getUserSign(userSignId);
}
if (Validator.isNull(userSign)) { userSign = new UserSignImpl(); }

List<DmMaritime> listMaritime = new ArrayList<DmMaritime>();

/* if(userPort != null) {
	DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(userPort.getPortCode());
	
	if(maritime != null) {
		listMaritime.add(maritime);
	}
} */

if(listMaritime.isEmpty()) {
	listMaritime.addAll(DmMaritimeLocalServiceUtil.getAll());
}
User userLogin = PortalUtil.getUser(request);

List<User> users2 = new ArrayList<User>();
users2 = UserLocalServiceUtil.getUsers(-1, -1);
UserPort userPort = UserPortLocalServiceUtil.findByUserId(themeDisplay.getUserId());
/* List<UserPort> tempUserPorts =  new ArrayList<UserPort>();

if (userPort != null){
	tempUserPorts = UserPortLocalServiceUtil.findByPortCode(userPort.getPortCode(), -1, -1);

	for (UserPort itemUserPort : tempUserPorts) {
		User temp_user = UserLocalServiceUtil.fetchUserById(itemUserPort.getUserId());
		users2.add(temp_user);
	}
}
if (users2.size() == 0) {
	users2 = UserLocalServiceUtil.getUsers(-1, -1);
} */

boolean roleBGTVT = false;
if (userPort == null) {
	roleBGTVT= true;
}

%>

<portlet:actionURL var="updateUserSignActionURL" name="updateUserSign" />

<div class="container-user-sign clearfix container-fluid">
	<input type="hidden" class="form-control" 
					id='<portlet:namespace />userSignId' name='<portlet:namespace />userSignId' value="<%= userSignId%>">
	<input type="hidden" class="form-control" 
					id='<portlet:namespace />rolevanthu' name='<portlet:namespace />rolevanthu' value="<%= rolevanthu == false ? "---" : "" %>">
	<input type="hidden" class="form-control" 
					id='<portlet:namespace />rolelanhdao' name='<portlet:namespace />rolelanhdao' value="<%= rolelanhdao == false ? "---" : "" %>">								
	<c:choose>
		<c:when test="<%= userSignId > 0 %>">
			<h3 class="col-xs-12 page-header"><i class="fa fa-edit"></i> Cập nhật</h3>
		</c:when>
		<c:otherwise>
			<h3 class="col-xs-12 page-header"><i class="fa fa-plus"></i> Thêm mới</h3>
		</c:otherwise>
	</c:choose>
	
	<aui:form cssClass="form-horizontal" action="<%= updateUserSignActionURL %>" name="fm" enctype='multipart/form-data'>
		<aui:input type="hidden" name="userSignId" value="<%= userSignId %>" />
		<aui:input type="hidden" name="backURL" value="<%= themeDisplay.getURLCurrent() %>" />
		<aui:input type="hidden" name="redirectURL" value="<%= backURL %>" />
		
		<div class="form-group">
			<label class="control-label col-xs-2" for="<portlet:namespace />accountId">Tài khoản: <font color="red">*</font></label>
			<div class="col-xs-4">
			
			<%
			if (roleBGTVT == true){
			%>
				<select class="form-control" id='<portlet:namespace />accountId' name='<portlet:namespace />accountId'>
				<%
					} else {						
						String userTitle = userLogin.getEmailAddress();
						if (userTitle.isEmpty() || userTitle== null){
							userTitle = "Thiếu thông tin ký số";
						}else{
							DmMaritime maritimeDefault = DmMaritimeLocalServiceUtil.getByMaritimeCode(userPort.getPortCode());
							userTitle = userTitle + " - " + maritimeDefault.getMaritimeNameVN();
						}
				%>
				<label ><%=  userTitle%></label>
				<select class="form-control" id='<portlet:namespace />accountId' name='<portlet:namespace />accountId' style="display: none;">
				<%
					}
				%>
					<option value="">-- Chọn tài khoản ---</option>
				<%
					for (User itemUsr : users2) {
						String seld = "";
						
						if (userSignId > 0 && userSign.getUserId() == itemUsr.getUserId() )  {
							seld = "selected=\"selected\"";
						}
						
						
					%>
						<option value="<%=itemUsr.getUserId()%>" <%= roleBGTVT == true ? seld : itemUsr.getUserId()== userLogin.getUserId()? "selected" : "" %> >
							<%=itemUsr.getEmailAddress()%>
							
							<c:if test="<%= userPort != null %>">
							<%
							DmMaritime maritime = DmMaritimeLocalServiceUtil.getByMaritimeCode(userPort.getPortCode());
							%>
							- <%= maritime.getMaritimeNameVN() %>
							</c:if>
						</option>
					<%
					}
					%>
				</select>
				
			</div>
		</div>
		
		<div class="form-group hidden">
			<label class="control-label col-xs-2" for="<portlet:namespace />maritimeCode">Cảng vụ hàng hải: <font color="red">*</font></label>
			<div class="col-xs-4">
				<select class="form-control" id='<portlet:namespace />maritimeCode' name='<portlet:namespace />maritimeCode'>
					<option value="">-- Chọn ---</option>
					<% for(DmMaritime item : listMaritime) {
						
						String seld = "";
						
						if(userSign != null && userSign.getPortCode().equalsIgnoreCase(item.getMaritimeCode())) {
							seld = "selected=\"selected\"";
						}
					
					%>
						<option value="<%= item.getMaritimeCode() %>" <%= seld %>><%= item.getMaritimeNameVN() %></option>
					<% } %>
				</select>
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-xs-2" for="<portlet:namespace />title">Tên cán bộ: <font color="red">*</font></label>
			<div class="col-xs-4">
				<input type="text" class="form-control" 
					id='<portlet:namespace />title' name='<portlet:namespace />title' value="<%= userSign != null ? HtmlUtil.escape(userSign.getTitle()) : "" %>">
			</div>
		</div>
		<!-- dai dien cang vu -->
		<%
			if (roleBGTVT == true || rolelanhdao == true){
			%>
		<div class="form-group">
		
		<%	} else { %>
		<div class="form-group hidden">
		<%
		}
		%>
			<label class="control-label col-xs-2" for="<portlet:namespace />representative">Vị trí: <font color="red">*</font></label>
			
			<div class="col-xs-4">
				<%
					String sRepresentative = Validator.isNotNull(userSign.getRepresentative()) ? userSign.getRepresentative() : KeyParams.GIAM_DOC;
					List<DmRepresentative> dmRepresentatives = new ArrayList<DmRepresentative>();
					if (userPort != null) {
						//thuoc mot cang vu, nhung ko co dai dien default, hoac co dai dien size > 0
						if (Validator.isNotNull(userPort.getPortCode())) {
							dmRepresentatives = DmRepresentativeLocalServiceUtil.findByMaritimeCode(userPort.getPortCode());
						}
						if (dmRepresentatives == null) { dmRepresentatives = new ArrayList<DmRepresentative>(); }
					} else {
						//ko thuoc cang vu nao
						dmRepresentatives = DmRepresentativeLocalServiceUtil.getDmRepresentatives(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
					}
				%>
				<select class="form-control" id='<portlet:namespace />representative' name='<portlet:namespace />representative'>
					<option value="<%=KeyParams.GIAM_DOC%>" <%=KeyParams.GIAM_DOC.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="GIÁM ĐỐC"%></option>
					<%for (DmRepresentative item : dmRepresentatives) {
					if (item.getRepLevel() == 1 || item.getRepLevel() == 2 ) {
					%>
						<option value="<%=item.getRepName()%>" <%=item.getRepNameVN().equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%=item.getRepName()%></option>
					<%} }%>
					<option value="<%=KeyParams.VAN_THU%>" <%=KeyParams.VAN_THU.equalsIgnoreCase(sRepresentative) ? "selected" : "" %>><%="VĂN THƯ"%></option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-xs-2" for='<portlet:namespace />fileChungThuSo'>File chứng thư số: <font color="red">*</font></label>
			<div class="col-xs-4">
				<c:if test="<%= userSign != null && userSign.getFileChungThuSoId() > 0 %>">
					<div class="file-preview clearfix">
						<a class="col-xs-12" href="<%= DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(userSign.getFileChungThuSoId()) %>" target="_blank">
							Tải file chứng thư số</a>
					</div>
				</c:if>
				<input type="file" class="form-control input-file" accept="*.cer,*.crt,*.der"
					id='<portlet:namespace />fileChungThuSo' name='<portlet:namespace />fileChungThuSo'>
			</div>
		</div>
		
		<%
			if (roleBGTVT == true || rolelanhdao == true){
			%>
		<div class="form-group">
		
		<%	} else { %>
		<div class="form-group hidden">
		<%
		}
		%>
			<label class="control-label col-xs-2" for='<portlet:namespace />fileChuKySo'>Ảnh chữ ký: <font color="red">*</font></label>
			<div class="col-xs-4">
				<c:if test="<%= userSign != null && userSign.getFileChuKyId() > 0 %>">
					<div class="file-preview clearfix">
						<a class="col-xs-12" href="<%= DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(userSign.getFileChuKyId()) %>" target="_blank">
							Xem ảnh chữ ký số</a>
					</div>
				</c:if>
				<input type="file" class="form-control input-file" accept="image/*"
					id='<portlet:namespace />fileChuKySo' name='<portlet:namespace />fileChuKySo'>
			</div>
		</div>
		
		<%
			if (roleBGTVT == true || rolevanthu == true){
			%>
		<div class="form-group">
		
		<%	} else { %>
		<div class="form-group hidden">
		<%
		}
		%>
			<label class="control-label col-xs-2" for='<portlet:namespace />fileConDau'>Ảnh con dấu:</label>
			<div class="col-xs-4">
				<c:if test="<%= userSign != null && userSign.getFileConDauId() > 0 %>">
					<div class="file-preview clearfix">
						<a class="col-xs-12" href="<%= DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(userSign.getFileConDauId()) %>" target="_blank">
							Xem ảnh con dấu</a>
						
						<label class="checkbox col-xs-12">
							<input type="checkbox" name="<portlet:namespace />deleteFileConDau" value="1"> Xóa ảnh con dấu
						</label>
					</div>
				</c:if>
				<input type="file" class="form-control input-file" accept="image/*"
					id='<portlet:namespace />fileConDau' name='<portlet:namespace />fileConDau'>
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-xs-offset-2 col-xs-4 help-block">Ghi chú: Những trường có dấu <font color="red">*</font> là bắt buộc</label>
		</div>
			
		<div class="form-group">
			<div class="col-xs-offset-2 col-xs-4">
				<button type="button" class="btn btn-primary" onclick="submitForm('<portlet:namespace />fm')">Lưu</button>
				<button type="button" class="btn btn-default" onclick='location.href="<%= backURL %>"'>Quay lại</button>
			</div>
		</div>
	</aui:form>
</div>

<script type="text/javascript">
	function validateUpdateUserSign() {
		var taiKhoan = $('#<portlet:namespace />accountId');
		var title = $('#<portlet:namespace />title');
		
		var fileChungThuSo = $('#<portlet:namespace />fileChungThuSo');
		var fileChuKySo = $('#<portlet:namespace />fileChuKySo');
		var fileConDau = $('#<portlet:namespace />fileConDau');
		
		var userSignId = $('#<portlet:namespace />userSignId');
		var rolevanthu = $('#<portlet:namespace />rolevanthu');
		var rolelanhdao = $('#<portlet:namespace />rolelanhdao');
		var result = true;
		
		if(taiKhoan.length > 0 && taiKhoan.val() == ''){
			result = false;
			alert('Vui lòng chọn tài khoản !');
		} else if(title.length > 0 && title.val() == ''){
			result = false;
			alert('Vui lòng nhập tên cán bộ !');
		} else if(fileChungThuSo.length > 0 && fileChungThuSo.val() == '' && userSignId.val() == 0){
			result = false;
			alert('Vui lòng tải file chứng thư số !');
		} else if(fileChuKySo.length > 0 && fileChuKySo.val() == '' && userSignId.val() == 0 && rolelanhdao.val() == ''){
			result = false;
			alert('Vui lòng tải ảnh chữ ký số !');
		} else if(fileConDau.length > 0 && fileConDau.val() == '' && userSignId.val() == 0 && rolevanthu.val() == ''){
			result = false;
			alert('Vui lòng tải ảnh con dấu !');
		}
		
		return result;
	}

	function submitForm(idForm) {
		var validate = validateUpdateUserSign();
		
		if(validate) {
			document.getElementById(idForm).submit();
		}
	}
</script>
