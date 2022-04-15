package com.spring.ioc.springIOC.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.ioc.springIOC.service.MessageService;

@Component
public class SampleComponent {

	private MessageService messageService;
	
	public SampleComponent() {
		System.out.println("1.1. SampleComponent constructor called.");
	}

	public MessageService getMessageService() {
		return messageService;
	}

	@Autowired
	@Qualifier("SMSService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	
}
