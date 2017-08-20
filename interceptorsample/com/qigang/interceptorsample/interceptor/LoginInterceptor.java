package com.qigang.interceptorsample.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.qigang.interceptorsample.bean.User;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//1. 获取session中的user
		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
		
		//2. 判断user是否为null
		if(user==null){
			//没有登录则返回登录页面,在访问indexAction_index的时候，如果没有登录，则返回login，执行login结果，跳转到login.jsp
			return "login";
		}else{
			//session中获取到用户信息，说明已经登录,直接放行
			invocation.invoke();
		}
		
		return null;
	}

}
