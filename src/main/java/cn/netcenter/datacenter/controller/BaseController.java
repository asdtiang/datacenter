package cn.netcenter.datacenter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;

import cn.netcenter.datacenter.service.ShareService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 类说明 基本的action类不需要实现什么方法,可以访问request,response,shareService
 * @author Administrator
 *
 */
public class BaseController  extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4696111682148958328L;
	public HttpServletRequest request;
	public HttpServletResponse response;
	@Autowired
	public ShareService shareService;
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
	}
	public void reponseSuccess() {
		reponseSuccess("success");
	}
	public void reponseSuccess(String writeStr) {
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("success");
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
