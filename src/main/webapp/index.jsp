<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ include file="/share/jsAndCss.jsp"%>

<title>学校信息中心机房管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
	<div class="header">
		<h1>学校信息中心机房管理系统</h1>
	</div>
	<div class="content">
		<div class="leftMenu">
			<ul class="levelOneUl" style="list-style-type: none;">
				<li>机房管理
					<ul class="levelTwoUl">
						<li><a href="javascript:void(0)"
							onclick="ajaxRequest('machineRoomList','rightContent')">机房列表
						</a></li>
						<li>机柜列表</li>
					</ul></li>
			</ul>
		</div>
		<div class="rightContent" id="rightContent"></div>
	</div>
</body>
</html>
