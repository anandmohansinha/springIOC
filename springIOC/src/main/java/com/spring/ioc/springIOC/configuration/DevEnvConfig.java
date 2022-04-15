package com.spring.ioc.springIOC.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@ImportResource(locations = {"classpath:/application-context-dev.xml"})
@Profile("dev")
public class DevEnvConfig {

	
}
