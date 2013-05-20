package cn.netcenter.datacenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.netcenter.datacenter.entity.User;
import cn.netcenter.datacenter.service.ShareService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class UserController extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private User user;
	@Autowired
	private ShareService shareService;

	public String save() {
		shareService.save(user);
		return SUCCESS;
	}
	
	public String update() {
		shareService.update(user);
		return SUCCESS;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
