package com.spring.ioc.springIOC.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorldBean implements ApplicationContextAware{

	static ApplicationContext context;
    public HelloWorldBean() {
    	System.out.println("HelloWorldBean-------------");
	}

    private String beanName;
	private String message;

	
	public static ApplicationContext getContainerInstance() {
		return context;
	}
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		
	}

	
}