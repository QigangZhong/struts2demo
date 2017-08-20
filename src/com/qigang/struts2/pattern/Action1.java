package com.qigang.struts2.pattern;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {

	public String method(){
		System.out.println("Action1.method");
		return SUCCESS;
	}
}
