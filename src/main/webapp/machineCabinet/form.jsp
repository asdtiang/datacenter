<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>
<ul>
	<li><h3 class="labelFont">机房：</h3>
		<div class="inputDiv">
			<select name="machineCabinet.machineRoom.id">
				<s:iterator value="roomList" var="machineRoom">
				<c:if test="${machineRoom.id==machineCabinet.machineRoom.id}">
					<option value="${machineRoom.id}" selected>${machineRoom.name}</option>
				</c:if>
				<c:if test="${machineRoom.id!=machineCabinet.machineRoom.id}">
				<option value="${machineRoom.id}">${machineRoom.name}</option>
				</c:if>
									</s:iterator>
			</select>
		</div>
	</li>
	<li><h3 class="labelFont">机柜名：</h3>
		<div class="inputDiv">
			<input class="required input" style="width:220px;"
				name="machineCabinet.name" value="${machineCabinet.name}"
				type="text">
		</div>
	</li>
	<li><h3 class="labelFont">位置：</h3>
		<div class="inputDiv">
			<input class="input" style="width:220px;"
				name="machineCabinet.location" value="${machineCabinet.location}"
				type="text">
		</div>
	</li>
	<li><h3 class="labelFont">高度：</h3>
		<div class="inputDiv">
			<input class="digits input" style="width:220px;"
				name="machineCabinet.high" value='<s:if test="machineCabinet.high!=0">${machineCabinet.high}</s:if><s:else>0</s:else>'
				type="text">
		</div>
	</li>
	<li><h3 class="labelFont">可用空间：</h3>
		<div class="inputDiv">
			<input class="required digits input" style="width:220px;"
				name="machineCabinet.spaceAvailable" value='${machineCabinet.spaceAvailable}'
				type="text">
		</div>
	</li>
	<li><h3 class="labelFont">机器数量：</h3>
		<div class="inputDiv">
			<input class="digits input" style="width:220px;"
				name="machineCabinet.machineNum" value="${machineCabinet.machineNum}"
				type="text">
		</div>
	</li>
	
	<li><h3 class="labelFont">配置线加数：</h3>
		<div class="inputDiv">
			<input class="digits input" style="width:220px;"
				name="machineCabinet.lineNum" value="${machineCabinet.lineNum}"
				type="text">
		</div>
	</li>
	
	<li><h3 class="labelFont">权重：</h3>
		<div class="inputDiv">
			<input class="digits input" style="width:220px;"
				name="machineCabinet.priority" value="<s:if test="machineCabinet.priority!=0">${machineCabinet.priority}</s:if><s:else>0</s:else>"
				type="text">
		</div>
	</li>
</ul>