function ajaxRequest(url, target) {
	var htmlobj = $.ajax({
		url : url,
		async : false,
	});
	$("#" + target).html(htmlobj.responseText);
}
function ajaxDelete(url,id,loadUrl,loadTarget) {
	var htmlobj = $.ajax({
		url : url,
		async : false,
		data:"id="+id
	});
	alert(htmlobj.responseText);
	ajaxRequest(loadUrl, loadTarget);
}