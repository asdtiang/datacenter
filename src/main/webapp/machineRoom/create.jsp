<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>
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
<script type="text/javascript">
	$("#machineRoomCreateForm").validate(
		{
			submitHandler : function(form) {
				var options = {
					success : function showResponse(responseText,
							statusText, xhr, $form) {
						if (statusText == "success") {
							alert("创建成功");
							ajaxRequest("machineRoomList","rightContent");
						} else {
							alert("创建出错");
						}
					},
				};
				$("#machineRoomCreateForm").ajaxSubmit(options);
			}
		});
</script>

<form action="machineRoomCreate" name="postForm"
	id="machineRoomCreateForm" method="post">
	<div class="tableBox">
		<jsp:include page="form.jsp" />
		<div class="zhc">
			<input class="submit" value="创建" type="submit">
		</div>
	</div>
</form>


