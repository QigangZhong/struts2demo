package com.qigang.interceptorsample.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qigang.interceptorsample.bean.User;

public class LoginAction extends ActionSupport {
	public String login(){
		String username=ServletActionContext.getRequest().getParameter("username");
		String password=ServletActionContext.getRequest().getParameter("password");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		ServletActionContext.getRequest().getSession().setAttribute("user", user);
		
		//Ìø×ªµ½indexAction
		return "indexAction";
	}
}
