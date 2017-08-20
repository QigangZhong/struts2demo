package com.qigang.interceptorsample.action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	public String index(){
		//拦截器执行完成之后如果请求还是过来了，说明拦截器放行了，执行index结果，访问index.jsp页面
		return "index";
	}
}
