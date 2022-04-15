package com.spring.ioc.springIOC.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.ioc.springIOC.bean.HelloWorldBean;


@Configuration
public class ApplicationConfiguration {
	
	
	@Bean(name="MynewBean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("This is my first HelloWorld bean...");
	}

}
