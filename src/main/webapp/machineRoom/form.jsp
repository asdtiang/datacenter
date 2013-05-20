<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<ul>
				<li><h3 class="labelFont">名称：</h3>
					<div class="inputDiv">
						<input  class="required input" style="width:220px;" name="machineRoom.name"
						 value="${machineRoom.name}"	type="text">
					</div></li>
				<li><h3 class="labelFont">面积：</h3>
					<div class="inputDiv">
						<input class="digits input" style="width:220px;" name="machineRoom.area" 
						value="${machineRoom.area}"
							type="text">
					</div></li>
				<li><h3 class="labelFont">房间号：</h3>
					<div class="inputDiv">
						<input  class="required digits input"  style="width:220px;"
							name="machineRoom.roomNum" value="${machineRoom.roomNum}" type="text">
					</div></li>
				<li><h3 class="labelFont">温度：</h3>
					<div class="inputDiv">
						<input class="required digits input"  style="width:220px;" value="${machineRoom.temperature}"
							name="machineRoom.temperature" type="text">
					</div></li>
				<li><h3 class="labelFont">权重：</h3>
					<div class="inputDiv">
						<input class="required digits input"  style="width:220px;"
							name="machineRoom.priority" value="${machineRoom.priority}" type="text">
					</div></li>
				<li><h3 class="labelFont">交换机数量：</h3>
					<div class="inputDiv">
						<input class="required digits input"  style="width:220px;"
							name="machineRoom.switches" value="${machineRoom.switches}" type="text">
					</div></li>
				<li><h3 class="labelFont">楼号信息：</h3>
					<div class="inputDiv">
						<input class="input" style="width:220px;" value="${machineRoom.buildingInfo}" 
							name="machineRoom.buildingInfo" type="text">
					</div></li>
				<li><h3 class="labelFont">备注：</h3>
					<div class="inputDiv">
						<input class="input" style="width:220px;" value="${machineRoom.remark}" 
							name="machineRoom.remark" type="text">
					</div></li>
			</ul>