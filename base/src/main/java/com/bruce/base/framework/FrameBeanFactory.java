package com.bruce.base.framework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class FrameBeanFactory implements BeanFactoryAware{
	
	private static BeanFactory beanFactory;

	public static Object getBean(String beanName) {
		return beanFactory.getBean(beanName);
	}

	public static <T> T getBean(String beanName, Class<T> clazs) {
		return clazs.cast(getBean(beanName));
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		FrameBeanFactory.beanFactory = beanFactory;
	}

}
