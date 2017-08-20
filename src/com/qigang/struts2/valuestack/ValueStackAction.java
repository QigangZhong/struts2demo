package com.qigang.struts2.valuestack;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.RequestMap;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackAction extends ActionSupport {
	/**
	 * ���Ի�ȡValueStack�����ַ�ʽ
	 * @return
	 */
	public String valueStackMethod(){
		//�����ַ�ʽ��ȡValueStack
		ValueStack vs1 = ActionContext.getContext().getValueStack();
		ValueStack vs2 = ServletActionContext.getValueStack(ServletActionContext.getRequest());
		ValueStack vs3 = (ValueStack)ServletActionContext.getRequest().getAttribute("struts.valueStack");
		
		return SUCCESS;
	}
	
	/**
	 * ͨ��ValueStack��������д洢ֵ
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
	 * ֱ����mapջ�д洢����
	 * @return
	 */
	public String putDataToMapStack(){
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.getContext().put("testKey1", "testValue1");
		ActionContext.getContext().put("testKey2", "testValue2");
		return null;
	}
	
	/**
	 * ��������ջ
	 * @return
	 */
	public String putDataToObjectStack(){
		ValueStack vs =ActionContext.getContext().getValueStack();
		
		//��ջ�����һ��Ԫ��
		vs.getRoot().add("testValue");
		
		//��ջ�����һ������
		vs.getRoot().add(0,"top of the object stack");
		
		//��ȡջ��Ԫ��
		vs.peek();
		vs.getRoot().get(0);
		
		//����ջ��Ԫ��
		vs.pop();
		vs.getRoot().remove(0);
		
		
		return null;
	}
}
