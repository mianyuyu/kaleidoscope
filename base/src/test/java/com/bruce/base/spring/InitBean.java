package com.bruce.base.spring;

public class InitBean {

	private static StringBean stringBean;
	
	public StringBean getStringBean() {
		return stringBean;
	}

	public void setStringBean(StringBean stringBean) {
		this.stringBean = stringBean;
	}

	public static String showBeanName() {
		return stringBean.getStr();
	}
}
