package com.qigang.struts2.valuestack;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.RequestMap;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackAction extends ActionSupport {
	/**
	 * 测试获取ValueStack的三种方式
	 * @return
	 */
	public String valueStackMethod(){
		//有三种方式获取ValueStack
		ValueStack vs1 = ActionContext.getContext().getValueStack();
		ValueStack vs2 = ServletActionContext.getValueStack(ServletActionContext.getRequest());
		ValueStack vs3 = (ValueStack)ServletActionContext.getRequest().getAttribute("struts.valueStack");
		
		return SUCCESS;
	}
	
	/**
	 * 通过ValueStack向域对象中存储值
	 * @return
	 */
	public String putDataToDomain(){
		ServletActionContext.getRequest().setAttribute("requestKey", "requestValue");
		ServletActionContext.getServletContext().setAttribute("applicationKey", "applicationValue");
		ServletActionContext.getRequest().getSession().setAttribute("sessionKey", "sessionValue");
		ValueStack vs = ActionContext.getContext().getValueStack();
		
		return "putDataToDomain";
	}
	
	/**
	 * 直接向map栈中存储数据
	 * @return
	 */
	public String putDataToMapStack(){
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.getContext().put("testKey1", "testValue1");
		ActionContext.getContext().put("testKey2", "testValue2");
		return null;
	}
	
	/**
	 * 操作对象栈
	 * @return
	 */
	public String putDataToObjectStack(){
		ValueStack vs =ActionContext.getContext().getValueStack();
		
		//向栈底添加一个元素
		vs.getRoot().add("testValue");
		
		//向栈顶添加一个对象
		vs.getRoot().add(0,"top of the object stack");
		
		//获取栈顶元素
		vs.peek();
		vs.getRoot().get(0);
		
		//弹出栈顶元素
		vs.pop();
		vs.getRoot().remove(0);
		
		
		return null;
	}
}
