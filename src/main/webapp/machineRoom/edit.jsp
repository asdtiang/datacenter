<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>
<html>
<head>
<style>
label {
	width: 10em;
	float: left;
}

label.error {
	float: right;
	color: red;
	padding-left: .5em;
	vertical-align: top;
}
</style>
<script>
	$("#machineRoomUpdateForm").validate(
			{
				submitHandler : function(form) {
					var options = {
						success : function showResponse(responseText,
								statusText, xhr, $form) {
							if (statusText == "success") {
								alert("更新成功");
							} else {
								alert("更新出错");
							}
						},
					};
					$("#machineRoomUpdateForm").ajaxSubmit(options);
				}
			});
</script>
</head>
<body>
	<form id="machineRoomUpdateForm" action="machineRoomUpdate"
		method="post">
		<input type="hidden" name="machineRoom.id" value="${machineRoom.id}">
		<div class="tableBox">
			<jsp:include page="form.jsp" />
			<div class="zhc">
				<input type="submit" value="更新" />
			</div>
		</div>
	</form>
</body>
</html>
