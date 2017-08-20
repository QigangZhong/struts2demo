package com.qigang.struts2.pattern;

import com.opensymphony.xwork2.ActionSupport;

public class TeacherAction extends ActionSupport {
	public String method1(){
		System.out.println("TeacherAction.method1");
		return SUCCESS;
	}
	
	public String method2(){
		System.out.println("TeacherAction.method2");
		return SUCCESS;
	}
}
