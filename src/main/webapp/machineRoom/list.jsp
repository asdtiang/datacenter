<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/share/tag-lib.jsp"%>
<h3>机房列表</h3>
<a href="javascript:void(0)" onclick="ajaxRequest('machineRoomCreate','rightContent')"> 添加机房</a>
<table class="tableShow">
	<tr>
		<td>机房</td>
		<td>房间号</td>
		<td>面积</td>
		<td>温度</td>
		<td>机柜数</td>
		<td>可用空间</td>
		<td>交换机数</td>
		<td>备注</td>
		<td>楼号信息</td>
		<td>权重</td>
		<td>机房图</td>
		<td>机房背景图</td>
		<td>查看机柜</td>
		<td>查看设备</td>
		<td>修改</td>
		<td>删除</td>
	</tr>
	<s:iterator value="page.content" var="machineRoom">
		<tr>
			<td>${machineRoom.name }</td>
			<td>${machineRoom.roomNum }</td>
			<td>${machineRoom.area }平方米</td>
			<td>${machineRoom.temperature }</td>
			<td>${machineRoom.cabinetNum }</td>
			<td>可用空间</td>
			<td>${machineRoom.switches }</td>
			<td>${machineRoom.remark }</td>
			<td>${machineRoom.buildingInfo }</td>
			<td>${machineRoom.priority }</td>
			<td>机房图</td>
			<td>机房背景图</td>
			<td>查看机柜</td>
			<td>查看设备</td>
			<td><a href="javascript:void(0)"
				onclick="ajaxRequest('machineRoomUpdate?id=${machineRoom.id}','rightContent')">修改</a>
			</td>
			<td><a href="javascript:void(0)"
				onclick="ajaxDelete('machineRoomDelete',${machineRoom.id},'machineRoomList','rightContent')">删除</a>
			</td>
		</tr>
	</s:iterator>
</table>
