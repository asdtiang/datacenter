package cn.netcenter.datacenter.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import cn.netcenter.datacenter.entity.MachineRoom;
import cn.netcenter.datacenter.repository.MachineRoomRepository;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class MachineRoomController extends BaseController implements BaseControllerInterface {
	private static Log log = LogFactory.getLog(MachineRoomController.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = -6328586889565093394L;
	private int id;
	private MachineRoom machineRoom;
	@Autowired
	private MachineRoomRepository machineRoomRepository;
	private Page<MachineRoom> page;
	private PageRequest pageable;
	
	public String save() {
		if(request.getMethod().equalsIgnoreCase("get")){
			machineRoom = new MachineRoom();
			return "to_view";
		}
		shareService.save(machineRoom);
		log.info(machineRoom.getId());
		reponseSuccess();
		return null;
	}

	public String update() {
		if(request.getMethod().equalsIgnoreCase("get")){
			machineRoom = shareService.find(MachineRoom.class, id);
			return "to_view";
		}
		else{
			shareService.update(machineRoom);
			reponseSuccess();
			return null;
		}
	}

	public String delete() {
		machineRoom = shareService.find(MachineRoom.class, id);
		if(machineRoom!=null){
			shareService.delete(machineRoom);
			reponseSuccess("删除成功");
		}
		return null;
	}

	public String show() {
		machineRoom = shareService.find(MachineRoom.class, id);
		return ActionSupport.SUCCESS;
	}

	public String list() {
		if(pageable ==null){
			pageable = new PageRequest(0, 10);
		}
		page= machineRoomRepository.findAll(pageable);
		return ActionSupport.SUCCESS;
	}
	
	public MachineRoom getMachineRoom() {
		return machineRoom;
	}
	public void setMachineRoom(MachineRoom machineRoom) {
		this.machineRoom = machineRoom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Page<MachineRoom> getPage() {
		return page;
	}

	public void setPage(Page<MachineRoom> page) {
		this.page = page;
	}

	public PageRequest getPageable() {
		return pageable;
	}

	public void setPageable(PageRequest pageable) {
		this.pageable = pageable;
	}

	
	
	
}
