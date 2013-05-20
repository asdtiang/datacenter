package cn.netcenter.datacenter.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import cn.netcenter.datacenter.entity.MachineCabinet;
import cn.netcenter.datacenter.entity.MachineRoom;
import cn.netcenter.datacenter.repository.MachineCabinetRepository;
import cn.netcenter.datacenter.repository.MachineRoomRepository;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class MachineCabinetController extends BaseController implements BaseControllerInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = -790197735888858308L;
	private static Log log = LogFactory.getLog(MachineCabinetController.class);

	@Autowired
	private MachineCabinetRepository machineCabinetRepository;
	@Autowired
	private MachineRoomRepository machineRoomRepository;
	private MachineCabinet machineCabinet;
	private int id;
	private Iterable<MachineRoom> roomList;
	private Page<MachineCabinet> page;
	private PageRequest pageable;
	public String save() {
		if(request.getMethod().equalsIgnoreCase("get")){
			roomList = machineRoomRepository.findAll();
			machineCabinet = shareService.find(MachineCabinet.class, id);
			return "to_view";
		}
		shareService.save(machineCabinet);
		log.info(machineCabinet.getId());
		return ActionSupport.SUCCESS;
	}

	public String update() {
		if(request.getMethod().equalsIgnoreCase("get")){
			roomList = machineRoomRepository.findAll();
			machineCabinet = shareService.find(MachineCabinet.class, id);
			return "to_view";
		}
		else{
			shareService.update(machineCabinet);
			return ActionSupport.SUCCESS;
		}
	}

	public String delete() {
		machineCabinet = shareService.find(MachineCabinet.class, id);
		if(machineCabinet!=null){
			shareService.delete(machineCabinet);
		}
		return ActionSupport.SUCCESS;
	}

	public String show() {
		machineCabinet = shareService.find(MachineCabinet.class, id);
		return ActionSupport.SUCCESS;
	}

	public String list() {
		if(pageable ==null){
			pageable = new PageRequest(0, 10);
		}
		page= machineCabinetRepository.findAll(pageable);
		return ActionSupport.SUCCESS;
	}
	

	public MachineCabinet getMachineCabinet() {
		return machineCabinet;
	}

	public void setMachineCabinet(MachineCabinet machineCabinet) {
		this.machineCabinet = machineCabinet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Page<MachineCabinet> getPage() {
		return page;
	}

	public void setPage(Page<MachineCabinet> page) {
		this.page = page;
	}

	public PageRequest getPageable() {
		return pageable;
	}

	public void setPageable(PageRequest pageable) {
		this.pageable = pageable;
	}

	public Iterable<MachineRoom> getRoomList() {
		return roomList;
	}

	public void setRoomList(Iterable<MachineRoom> roomList) {
		this.roomList = roomList;
	}

}
