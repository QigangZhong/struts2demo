package com.qigang.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ͨ���̳�ActionSupport����ʵ��action
 */
public class ActionSupportAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		return "actionSupport";
	}
}
