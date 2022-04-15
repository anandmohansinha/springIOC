package com.spring.ioc.springIOC.service;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailServiceImpl implements MessageService{

	private String from;
    private String[] to;
    private String subject;
    private String body;
    
    public EmailServiceImpl() {
        System.out.println("1.5. EmailServiceImpl constructor called.");
    }

    
	@Override
	public void send(String msg) {
		 System.out.println("4.2. Email Service called and message is: " + msg);
		
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String[] getTo() {
		return to;
	}


	public void setTo(String[] to) {
		this.to = to;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}
	
	

}
