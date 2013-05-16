package cn.netcenter.datacenter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Required;

@Entity
public class Machine {
	private int id;
	private MachineRoom machineRoom;
	private MachineCabinet machineCabinet;
	private String name;
	private String ip;
	private Person person;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Required
	@ManyToOne  
    @JoinColumn(name="room_id",referencedColumnName="id")
	public MachineRoom getMachineRoom() {
		return machineRoom;
	}
	public void setMachineRoom(MachineRoom machineRoom) {
		this.machineRoom = machineRoom;
	}
	@Required
	@ManyToOne  
    @JoinColumn(name="cabinet_id",referencedColumnName="id")
	public MachineCabinet getMachineCabinet() {
		return machineCabinet;
	}
	public void setMachineCabinet(MachineCabinet machineCabinet) {
		this.machineCabinet = machineCabinet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@ManyToOne  
    @JoinColumn(name="person_id",referencedColumnName="id")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
