package cn.netcenter.datacenter.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 机房表
 * @author Administrator
 *
 */
@Entity
public class MachineRoom {
	private int id;
	private String name;
	/**
	 *面积
	 */
	private int area;
	/**
	 * 房间号
	 */
	private int roomNum;
	/**
	 * 温度
	 */
	private int temperature;
	/**
	 * 权重
	 */
	private int priority;
	/**
	 * 交换机数量
	 */
	private int switches;
	/**
	 * 楼号信息
	 */
	private String buildingInfo;
	/**
	 * 机柜，cabinets.size()即机柜数
	 */
	private Set<MachineCabinet> cabinets;
	private String remark;
	/**
	 * 总的容量数，可用空间为 总容量-cabinets.size()/总容量
	 */
	private int sumSize;
	
	/**
	 * 机柜数量
	 */
	private int  cabinetNum;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	/**
	 * 一个机房包含多个机柜，机房和机柜是一对多的关系
	 * @return
	 */
	@OneToMany(cascade = CascadeType.REMOVE,mappedBy="machineRoom", targetEntity=MachineCabinet.class)
	public Set<MachineCabinet> getCabinets() {
		return cabinets;
	}


	public void setCabinets(Set<MachineCabinet> cabinets) {
		this.cabinets = cabinets;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCabinetNum() {
		return cabinetNum;
	}
	public void setCabinetNum(int cabinetNum) {
		this.cabinetNum = cabinetNum;
	}
	
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getSwitches() {
		return switches;
	}
	public void setSwitches(int switches) {
		this.switches = switches;
	}
	public String getBuildingInfo() {
		return buildingInfo;
	}
	public void setBuildingInfo(String buildingInfo) {
		this.buildingInfo = buildingInfo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getSumSize() {
		return sumSize;
	}
	public void setSumSize(int sumSize) {
		this.sumSize = sumSize;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
