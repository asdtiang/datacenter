<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link type="text/css" rel="stylesheet" href="<%=path %>/css/css.css">

<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/jquery.form.js"></script>
<script type="text/javascript"
	src="<%=path %>/js/jquery.validate.min.js"></script>
	<script type="text/javascript"
	src="<%=path %>/js/ajaxRequest.js"></script>
	<script type="text/javascript"
	src="<%=path %>/js/message_cn.js"></script>
	