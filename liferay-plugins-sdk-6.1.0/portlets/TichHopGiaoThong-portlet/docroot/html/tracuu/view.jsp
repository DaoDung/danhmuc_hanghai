
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="vn.gt.utils.FormatData"%>
<%@page import="vn.gt.dao.common.service.LogMessageValidationLocalServiceUtil"%>
<%@page import="vn.gt.dao.common.model.LogMessageValidation"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/init.jsp"%>
<%
String documentName= ParamUtil.getString(request, "documentName").trim();
String documentYear = ParamUtil.getString(request, "documentYear").trim();


PortletURL searchUrl = renderResponse.createActionURL();
searchUrl.setParameter(ActionRequest.ACTION_NAME, "searchTraCuu");
%>


<aui:form action="<%=searchUrl.toString()%>"	name="myForm" id="myForm"	method="POST">
	<div class="wd-main-content wd-page-staff bgsearch">
	   <div class="boxsearch">
		   <div class="tbl_left boxlabel">
		       <table class="table_noboder">
		          <tr>
		                    <th class="text-left" width="86px">DocumentName</th>
							<td class="text-leftu">
								<input type="text" name="documentName" id="documentName" class="egov-inputfield" style="width: 98%" 
								value='<%=documentName%>'/>
							</td>
						</tr>
						<tr>
		                    <th class="text-left" width="86px">DocumentYear</th>
							<td class="text-leftu">
								<input type="text" name="documentYear" id="documentYear" class="egov-inputfield" style="width: 98%" 
								value='<%=documentYear%>'/>
							</td>
						</tr>
			    </table>
			</div>
			
		    
		    <div class="wd-select">
             <button class="bt" type="submit">
             	<i class="icon-fl ico_icon-search"></i>Search
		     </button>
		       
		    </div>  
		</div>  
	</div>
</aui:form>
	

<%
PortletURL portletUrl = renderResponse.createRenderURL();
portletUrl.setParameter("documentName", documentName);
portletUrl.setParameter("documentYear", documentYear);
%>
<div class="wd-content-container bgdanhsach">
	<div class="boxnd">
		<table class="wd-table"> 
			<thead>
				<tr>
					<th  width="15px">STT</th>
					<th>RequestCode</th>
					<th>RequestDate</th>
					<th>DocumentName</th>
					<th>DocumentYear</th>
					<th>DocumentType</th>
					<th>TagProperty</th>
					<th>DataValidation</th>
				</tr>
			</thead>
			
          <tbody>
            <%
			if(FormatData.convertToLong(documentName) > 0 && FormatData.convertToInt(documentYear) > 0){
				List<LogMessageValidation> logmessage = LogMessageValidationLocalServiceUtil.findByDocumentNameDocumentYear(FormatData.convertToLong(documentName), FormatData.convertToInt(documentYear));
	            if(logmessage != null && logmessage.size() > 0){
	            LogMessageValidation logMessageValidation = null;
	            for(int i=0; i<logmessage.size();i++){
	            logMessageValidation = (LogMessageValidation)logmessage.get(i);
			%>
               <tr>
                   <td><%=i+1%></td>
                   <td class="text-left"><%=logMessageValidation.getRequestCode() %></td>
                   <td class="text-left"><%=FormatData.parseDateToTringType3(logMessageValidation.getRequestDate()) %></td>
                   <td class="text-left"><%=logMessageValidation.getDocumentName()%></td>
                   <td class="text-left"><%=logMessageValidation.getDocumentYear()%></td>
                   <td class="text-left"><%=logMessageValidation.getDocumentType()%></td>
                   <td class="text-left"><%=logMessageValidation.getTagProperty()%></td>
                   <td class="text-left"><%=logMessageValidation.getDataValidation()%></td>
               </tr>
           <%
				}
			}
		}
         %> 
              
          </tbody>
      </table>
  </div>