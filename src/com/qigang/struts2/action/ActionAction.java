package com.qigang.struts2.action;

import com.opensymphony.xwork2.Action;
/**
 * 通过实现Action接口来访问结果页面
 */
public class ActionAction implements Action {
	@Override
	public String execute() throws Exception {
		return "action";
	}

}
