package cn.netcenter.datacenter.controller;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.netcenter.datacenter.entity.User;
import cn.netcenter.datacenter.model.UserService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class UserController extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private User user;
	private UserService userService;

	public String add() {
		
		userService.save(user);
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

	public UserService getUserService() {
		return userService;
	}

	@Inject
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
