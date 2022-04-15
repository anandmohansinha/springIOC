package com.spring.ioc.springIOC.service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSServiceImpl implements MessageService {

	private String receiver;

	public SMSServiceImpl() {
		System.out.println("1.2. SMSServiceImpl constructor called.");
	}

	@Override
	public void send(String msg) {
		 System.out.println("4.1. SMS Service called and message is: " + msg);
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

}
