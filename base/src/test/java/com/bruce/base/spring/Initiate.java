package com.bruce.base.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bruce.base.framework.FrameBeanFactory;
import com.bruce.base.framework.FrameLogger;

public class Initiate {

	public static void main(String[] args) {
		FrameLogger logger = FrameLogger.getLogger(String.class);
		logger.debug("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		new ClassPathXmlApplicationContext(
				new String[] {"classpath:application.xml"});
		
		StringBean stringBean =
				FrameBeanFactory.getBean("stringBean", StringBean.class);
		
		/*
		System.out.println("111" + stringBean.getStr());
		System.out.println("Bean name is :"
				+ InitBean.showBeanName());
		System.out.println("222" + stringBean.getStr());
		*/
	}
}
