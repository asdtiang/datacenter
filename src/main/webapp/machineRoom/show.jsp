<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <%@ include file="/share/jsAndCss.jsp"%>
    <title>机房查看</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div class="tableBox">
  <ul>
				<li><h3 class="labelFont">名称：</h3>
					<div class="inputDiv"> <samp>${machineRoom.name}</samp>
					</div></li>
				<li><h3 class="labelFont">区域：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.area}</samp>
					</div></li>
				<li><h3 class="labelFont">房间号：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.roomNum}</samp>
					</div></li>
				<li><h3 class="labelFont">温度：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.temperature}</samp>
					</div></li>
				<li><h3 class="labelFont">权重：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.priority}</samp>
					</div></li>
				<li><h3 class="labelFont">交换机数量：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.switches}</samp>
					</div></li>
				<li><h3 class="labelFont">楼号信息：</h3>
					<div class="inputDiv">
					<samp>${machineRoom.buildingInfo}</samp>
					</div></li>
				<li><h3 class="labelFont">备注：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.remark}</samp>
					</div></li>
			</ul>
     </div>
  </body>
</html>
