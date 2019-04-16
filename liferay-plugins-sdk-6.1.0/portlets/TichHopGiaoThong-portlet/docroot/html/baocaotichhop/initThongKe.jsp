<%@page import="java.util.Map"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/jquery.jqplot.min.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/css/main.css"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/jquery.jqplot.min.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.dateAxisRenderer.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.canvasTextRenderer.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.canvasAxisTickRenderer.min.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.barRenderer.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.categoryAxisRenderer.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.pointLabels.min.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.pieRenderer.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jstichhop/libs/jqplot/plugins/jqplot.donutRenderer.min.js"></script>