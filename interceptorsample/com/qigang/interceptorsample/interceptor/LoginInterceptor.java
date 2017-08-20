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
		//1. ��ȡsession�е�user
		User user = (User)ServletActionContext.getRequest().getSession().getAttribute("user");
		
		//2. �ж�user�Ƿ�Ϊnull
		if(user==null){
			//û�е�¼�򷵻ص�¼ҳ��,�ڷ���indexAction_index��ʱ�����û�е�¼���򷵻�login��ִ��login�������ת��login.jsp
			return "login";
		}else{
			//session�л�ȡ���û���Ϣ��˵���Ѿ���¼,ֱ�ӷ���
			invocation.invoke();
		}
		
		return null;
	}

}
