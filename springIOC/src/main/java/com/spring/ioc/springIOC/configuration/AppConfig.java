package com.spring.ioc.springIOC.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * How to load the beans
 * @author anand
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.spring.ioc.springIOC.service", "com.spring.ioc.springIOC.bean"})
public class AppConfig {
	
}