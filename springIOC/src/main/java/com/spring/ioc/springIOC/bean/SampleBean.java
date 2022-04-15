package com.spring.ioc.springIOC.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SampleBean {

	public SampleBean() {
		System.out.println("1.9. SampleBean constructor called.");
	}

	@PostConstruct
	public void init() {
		System.out.println("9.1. @PostConstruct method called after bean constructor");
	}

	 @PreDestroy
	 public void destroy() {
	        System.out.println("9.2. @PreDestroy method called before bean destroy");
	 }

}
