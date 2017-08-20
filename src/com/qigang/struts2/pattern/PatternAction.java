package com.qigang.struts2.pattern;

import com.opensymphony.xwork2.ActionSupport;

public class PatternAction extends ActionSupport {
	public String add(){
		System.out.println("PatternAction.add");
		return SUCCESS;
	}
}
