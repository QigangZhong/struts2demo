package com.qigang.struts2.action;

/**
 * 单纯的JavaBean可以直接实现action
 */
public class UserAction {
	public String add(){
		System.out.println("add");
		return "index";
	}
}
