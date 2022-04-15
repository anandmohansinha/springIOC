package com.spring.ioc.springIOC.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.ioc.springIOC.service.MessageService;

@Component
@Lazy
public class SampleLazyComponent {

	public SampleLazyComponent() {
        System.out.println("1.3. SampleLazyComponent constructor called.");
    }

	 private MessageService messageService;

	    public MessageService getMessageService() {
	        return messageService;
	    }

	    // 1. use @Autowired to wire between beans(SampleComponent and MessageService)
	    // 2. use @Qualifier when we have more than one implementation from a bean interface
	    @Autowired
	    @Qualifier("TelegramService")
	    public void setMessageService(MessageService messageService) {
	        this.messageService = messageService;
	    }
}
