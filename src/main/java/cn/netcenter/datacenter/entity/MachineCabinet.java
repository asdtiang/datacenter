package cn.netcenter.datacenter.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class MachineCabinet {
	private int id;
	/**
	 * 机柜名
	 */
	private String name;
	private MachineRoom machineRoom;
	/**
	 * 位置
	 */
	private String location;
    private int high;
    /**
     * 可用空间
     */
    private int spaceAvailable;
    /**
     * 机器数量,设备数
     */
	private int machineNum;
	/**
	 * 机器列表
	 */
	private Set<Machine> machines;
	/**
	 * 配置线加数
	 */
	private int lineNum;
	private int priority;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.REFRESH,optional = false)
	@JoinColumn(name="room_id")
	public MachineRoom getMachineRoom() {
		return machineRoom;
	}

	public void setMachineRoom(MachineRoom machineRoom) {
		this.machineRoom = machineRoom;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMachineNum() {
		return machineNum;
	}

	public void setMachineNum(int machineNum) {
		this.machineNum = machineNum;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getSpaceAvailable() {
		return spaceAvailable;
	}

	public void setSpaceAvailable(int spaceAvailable) {
		this.spaceAvailable = spaceAvailable;
	}
	/**
	 * 一个机柜包含多个机器，机柜和机器是一对多的关系
	 * @return
	 */
	@OneToMany(cascade = CascadeType.REFRESH,mappedBy="machineCabinet", targetEntity=Machine.class)
	public Set<Machine> getMachines() {
		return machines;
	}

	public void setMachines(Set<Machine> machines) {
		this.machines = machines;
	}

	

	public int getLineNum() {
		return lineNum;
	}

	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
