package com.spring.ioc.springIOC.devbean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevSampleBean {

    public DevSampleBean() {
        System.out.println("1.12. DevSampleBean constructor called.");
    }
}