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
}
