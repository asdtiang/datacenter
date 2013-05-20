<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <%@ include file="/share/jsAndCss.jsp"%>
    <title>机柜查看</title>
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
					<div class="inputDiv"> <samp>${machineCabinet.name}</samp>
					</div></li>
				<li><h3 class="labelFont">机房：</h3>
					<div class="inputDiv">
						<samp>${machineCabinet.machineRoom.name}</samp>
					</div></li>
				<li><h3 class="labelFont">位置：</h3>
					<div class="inputDiv">
						<samp>${machineCabinet.location}</samp>
					</div></li>
				<li><h3 class="labelFont">高度：</h3>
					<div class="inputDiv">
						<samp>${machineCabinet.high}</samp>
					</div></li>
				<li><h3 class="labelFont">权重：</h3>
					<div class="inputDiv">
						<samp>${machineCabinet.priority}</samp>
					</div></li>
				<li><h3 class="labelFont">可用空间：</h3>
					<div class="inputDiv">
						<samp>${machineCabinet.spaceAvailable}</samp>
					</div></li>
				<li><h3 class="labelFont">机器数量：</h3>
					<div class="inputDiv">
					<samp>${machineRoom.machineNum}</samp>
					</div></li>
				<li><h3 class="labelFont">配置线加数：</h3>
					<div class="inputDiv">
						<samp>${machineRoom.lineNum}</samp>
					</div></li>
			</ul>
     </div>
  </body>
</html>
