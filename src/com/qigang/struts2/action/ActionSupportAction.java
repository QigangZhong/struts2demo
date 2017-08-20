package com.qigang.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 通过继承ActionSupport类来实现action
 */
public class ActionSupportAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		return "actionSupport";
	}
}
