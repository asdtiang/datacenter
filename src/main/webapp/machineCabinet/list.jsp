<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
机柜列表
	<table class="">
		<tr>
			<td>机柜名</td>
			<td>机房</td>
			<td>位置</td>
			<td>高度</td>
			<td>可用空间</td>
			<td>设备数</td>
			<td>配线架数</td>
			<td>权重</td>
			<td>察看</td>
			<td>修改</td>
			<td>删除</td>
		</tr>
		<s:iterator value="page.content" var="machineCabinet">
			<tr>
			
				<td>${machineCabinet.name }</td>
				<td>${machineCabinet.machineRoom.name }</td>
				<td>${machineCabinet.location }</td>
				<td>${machineCabinet.high }</td>
				<td>${machineCabinet.spaceAvailable }</td>
				<td>${machineCabinet.machineNum }</td>
				<td>${machineCabinet.lineNum }</td>
				<td>${machineCabinet.priority }</td>
				<td><a href="machineCabinetShow?id=${machineCabinet.id }">察看</a></td>
				<td><a href="machineCabinetUpdate?id=${machineCabinet.id}">修改</a>
				</td>
				<td><a href="machineCabinetDelete?id=${machineCabinet.id}">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>

