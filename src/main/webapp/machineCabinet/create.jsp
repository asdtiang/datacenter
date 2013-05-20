<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ include file="/share/jsAndCss.jsp"%>
	<style>
label { width: 10em; float: left; }
label.error { float: right; color: red; padding-left: .5em; vertical-align: top; }
</style>
 <script>
  $(document).ready(function(){
    $("#postForm").validate();
  });
  </script>
<title>机柜创建</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>

	<form action="machineCabinetCreate" name="postForm" id="postForm" method="post">
		<div class="tableBox">
			<jsp:include page="form.jsp"/>
			<div class="zhc">
				<input class="submit"  value="创建" type="submit">
			</div>
		</div>
	</form>
</body>
</html>
