package com.qigang.struts2.resulttype;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ResultTypeAction extends ActionSupport {
	public String testDispatcher(){
		//与Servlet通信,使用request,response
		ServletActionContext.getRequest().setAttribute("testKey1", "testValue1");
		return "dispatcher";
	}
	
	public String testRedirect(){
		ServletActionContext.getRequest().setAttribute("testKey2", "testValue2");
		return "redirect";
	}
	
	public String testRedirectAction(){
		ServletActionContext.getRequest().setAttribute("testKey3", "testValue3");
		return "redirectAction";
	}
}
