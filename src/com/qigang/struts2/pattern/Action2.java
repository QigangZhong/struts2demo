package com.qigang.struts2.pattern;

import com.opensymphony.xwork2.ActionSupport;

public class Action2 extends ActionSupport {
	public String method(){
		System.out.println("Action2.method");
		return SUCCESS;
	}
}
