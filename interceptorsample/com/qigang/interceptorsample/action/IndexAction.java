package com.qigang.interceptorsample.action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	public String index(){
		//������ִ�����֮����������ǹ����ˣ�˵�������������ˣ�ִ��index���������index.jspҳ��
		return "index";
	}
}
